package okhttp3.internal.ws;

import B.AbstractC0013g0;
import E4.g;
import E4.k;
import J4.d;
import Z2.f;
import com.fasterxml.jackson.databind.deser.std.d0;
import com.spotify.sdk.android.auth.LoginActivity;
import h5.C0735m;
import h5.InterfaceC0733k;
import h5.InterfaceC0734l;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private boolean awaitingPong;
    private Call call;
    private boolean enqueuedClose;
    private WebSocketExtensions extensions;
    private boolean failed;
    private final String key;
    private final WebSocketListener listener;
    private final ArrayDeque<Object> messageAndCloseQueue;
    private long minimumDeflateSize;
    private String name;
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<C0735m> pongQueue;
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private TaskQueue taskQueue;
    private WebSocketWriter writer;
    private Task writerTask;
    public static final Companion Companion = new Companion(null);
    private static final List<Protocol> ONLY_HTTP1 = d0.v(Protocol.HTTP_1_1);

    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        private final C0735m reason;

        public Close(int i, C0735m c0735m, long j4) {
            this.code = i;
            this.reason = c0735m;
            this.cancelAfterCloseMillis = j4;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        public final C0735m getReason() {
            return this.reason;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Message {
        private final C0735m data;
        private final int formatOpcode;

        public Message(int i, C0735m c0735m) {
            k.f("data", c0735m);
            this.formatOpcode = i;
            this.data = c0735m;
        }

        public final C0735m getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    public static abstract class Streams implements Closeable {
        private final boolean client;
        private final InterfaceC0733k sink;
        private final InterfaceC0734l source;

        public Streams(boolean z5, InterfaceC0734l interfaceC0734l, InterfaceC0733k interfaceC0733k) {
            k.f("source", interfaceC0734l);
            k.f("sink", interfaceC0733k);
            this.client = z5;
            this.source = interfaceC0734l;
            this.sink = interfaceC0733k;
        }

        public final boolean getClient() {
            return this.client;
        }

        public final InterfaceC0733k getSink() {
            return this.sink;
        }

        public final InterfaceC0734l getSource() {
            return this.source;
        }
    }

    public final class WriterTask extends Task {
        final /* synthetic */ RealWebSocket this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WriterTask(RealWebSocket realWebSocket) {
            super(k.l(realWebSocket.name, " writer"), false, 2, null);
            k.f("this$0", realWebSocket);
            this.this$0 = realWebSocket;
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            try {
                return this.this$0.writeOneFrame$okhttp() ? 0L : -1L;
            } catch (IOException e6) {
                this.this$0.failWebSocket(e6, null);
                return -1L;
            }
        }
    }

    public RealWebSocket(TaskRunner taskRunner, Request request, WebSocketListener webSocketListener, Random random, long j4, WebSocketExtensions webSocketExtensions, long j6) {
        k.f("taskRunner", taskRunner);
        k.f("originalRequest", request);
        k.f("listener", webSocketListener);
        k.f("random", random);
        this.originalRequest = request;
        this.listener = webSocketListener;
        this.random = random;
        this.pingIntervalMillis = j4;
        this.extensions = webSocketExtensions;
        this.minimumDeflateSize = j6;
        this.taskQueue = taskRunner.newQueue();
        this.pongQueue = new ArrayDeque<>();
        this.messageAndCloseQueue = new ArrayDeque<>();
        this.receivedCloseCode = -1;
        if (!"GET".equals(request.method())) {
            throw new IllegalArgumentException(k.l("Request must be GET: ", request.method()).toString());
        }
        C0735m c0735m = C0735m.f9352k;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.key = f.o(bArr).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValid(WebSocketExtensions webSocketExtensions) {
        if (webSocketExtensions.unknownValues || webSocketExtensions.clientMaxWindowBits != null) {
            return false;
        }
        if (webSocketExtensions.serverMaxWindowBits != null) {
            d dVar = new d(8, 15, 1);
            int iIntValue = webSocketExtensions.serverMaxWindowBits.intValue();
            if (8 > iIntValue || iIntValue > dVar.i) {
                return false;
            }
        }
        return true;
    }

    private final void runWriter() {
        if (!Util.assertionsEnabled || Thread.holdsLock(this)) {
            Task task = this.writerTask;
            if (task != null) {
                TaskQueue.schedule$default(this.taskQueue, task, 0L, 2, null);
                return;
            }
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
    }

    public final void awaitTermination(long j4, TimeUnit timeUnit) throws InterruptedException {
        k.f("timeUnit", timeUnit);
        this.taskQueue.idleLatch().await(j4, timeUnit);
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        Call call = this.call;
        k.c(call);
        call.cancel();
    }

    public final void checkUpgradeSuccess$okhttp(Response response, Exchange exchange) throws ProtocolException {
        k.f(LoginActivity.RESPONSE_KEY, response);
        if (response.code() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
        }
        String strHeader$default = Response.header$default(response, "Connection", null, 2, null);
        if (!"Upgrade".equalsIgnoreCase(strHeader$default)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + ((Object) strHeader$default) + '\'');
        }
        String strHeader$default2 = Response.header$default(response, "Upgrade", null, 2, null);
        if (!"websocket".equalsIgnoreCase(strHeader$default2)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + ((Object) strHeader$default2) + '\'');
        }
        String strHeader$default3 = Response.header$default(response, "Sec-WebSocket-Accept", null, 2, null);
        C0735m c0735m = C0735m.f9352k;
        String strA = f.i(k.l(this.key, WebSocketProtocol.ACCEPT_MAGIC)).c("SHA-1").a();
        if (k.a(strA, strHeader$default3)) {
            if (exchange == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strA + "' but was '" + ((Object) strHeader$default3) + '\'');
    }

    @Override // okhttp3.WebSocket
    public boolean close(int i, String str) {
        return close(i, str, CANCEL_AFTER_CLOSE_MILLIS);
    }

    public final void connect(OkHttpClient okHttpClient) {
        k.f("client", okHttpClient);
        if (this.originalRequest.header("Sec-WebSocket-Extensions") != null) {
            failWebSocket(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        OkHttpClient okHttpClientBuild = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        final Request requestBuild = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").header("Sec-WebSocket-Extensions", "permessage-deflate").build();
        RealCall realCall = new RealCall(okHttpClientBuild, requestBuild, true);
        this.call = realCall;
        realCall.enqueue(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket.connect.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                k.f("call", call);
                k.f("e", iOException);
                RealWebSocket.this.failWebSocket(iOException, null);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws Throwable {
                k.f("call", call);
                k.f(LoginActivity.RESPONSE_KEY, response);
                Exchange exchange = response.exchange();
                try {
                    RealWebSocket.this.checkUpgradeSuccess$okhttp(response, exchange);
                    k.c(exchange);
                    Streams streamsNewWebSocketStreams = exchange.newWebSocketStreams();
                    WebSocketExtensions webSocketExtensions = WebSocketExtensions.Companion.parse(response.headers());
                    RealWebSocket.this.extensions = webSocketExtensions;
                    if (!RealWebSocket.this.isValid(webSocketExtensions)) {
                        RealWebSocket realWebSocket = RealWebSocket.this;
                        synchronized (realWebSocket) {
                            realWebSocket.messageAndCloseQueue.clear();
                            realWebSocket.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    try {
                        RealWebSocket.this.initReaderAndWriter(Util.okHttpName + " WebSocket " + requestBuild.url().redact(), streamsNewWebSocketStreams);
                        RealWebSocket.this.getListener$okhttp().onOpen(RealWebSocket.this, response);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e6) {
                        RealWebSocket.this.failWebSocket(e6, null);
                    }
                } catch (IOException e7) {
                    if (exchange != null) {
                        exchange.webSocketUpgradeFailed();
                    }
                    RealWebSocket.this.failWebSocket(e7, response);
                    Util.closeQuietly(response);
                }
            }
        });
    }

    public final void failWebSocket(Exception exc, Response response) {
        k.f("e", exc);
        synchronized (this) {
            if (this.failed) {
                return;
            }
            this.failed = true;
            Streams streams = this.streams;
            this.streams = null;
            WebSocketReader webSocketReader = this.reader;
            this.reader = null;
            WebSocketWriter webSocketWriter = this.writer;
            this.writer = null;
            this.taskQueue.shutdown();
            try {
                this.listener.onFailure(this, exc, response);
            } finally {
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.closeQuietly(webSocketWriter);
                }
            }
        }
    }

    public final WebSocketListener getListener$okhttp() {
        return this.listener;
    }

    public final void initReaderAndWriter(String str, Streams streams) throws Throwable {
        Throwable th;
        k.f("name", str);
        k.f("streams", streams);
        WebSocketExtensions webSocketExtensions = this.extensions;
        k.c(webSocketExtensions);
        synchronized (this) {
            try {
                this.name = str;
                this.streams = streams;
                this.writer = new WebSocketWriter(streams.getClient(), streams.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(streams.getClient()), this.minimumDeflateSize);
                this.writerTask = new WriterTask(this);
                long j4 = this.pingIntervalMillis;
                if (j4 != 0) {
                    try {
                        final long nanos = TimeUnit.MILLISECONDS.toNanos(j4);
                        TaskQueue taskQueue = this.taskQueue;
                        final String strL = k.l(str, " ping");
                        taskQueue.schedule(new Task(strL, this, nanos) { // from class: okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda-3$$inlined$schedule$1
                            final /* synthetic */ String $name;
                            final /* synthetic */ long $pingIntervalNanos$inlined;
                            final /* synthetic */ RealWebSocket this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(strL, false, 2, null);
                                this.$name = strL;
                                this.this$0 = this;
                                this.$pingIntervalNanos$inlined = nanos;
                            }

                            @Override // okhttp3.internal.concurrent.Task
                            public long runOnce() {
                                this.this$0.writePingFrame$okhttp();
                                return this.$pingIntervalNanos$inlined;
                            }
                        }, nanos);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (!this.messageAndCloseQueue.isEmpty()) {
                    runWriter();
                }
                this.reader = new WebSocketReader(streams.getClient(), streams.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!streams.getClient()));
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            WebSocketReader webSocketReader = this.reader;
            k.c(webSocketReader);
            webSocketReader.processNextFrame();
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int i, String str) {
        Streams streams;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        k.f("reason", str);
        if (i == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized (this) {
            if (this.receivedCloseCode != -1) {
                throw new IllegalStateException("already closed");
            }
            this.receivedCloseCode = i;
            this.receivedCloseReason = str;
            streams = null;
            if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                Streams streams2 = this.streams;
                this.streams = null;
                webSocketReader = this.reader;
                this.reader = null;
                webSocketWriter = this.writer;
                this.writer = null;
                this.taskQueue.shutdown();
                streams = streams2;
            } else {
                webSocketReader = null;
                webSocketWriter = null;
            }
        }
        try {
            this.listener.onClosing(this, i, str);
            if (streams != null) {
                this.listener.onClosed(this, i, str);
            }
        } finally {
            if (streams != null) {
                Util.closeQuietly(streams);
            }
            if (webSocketReader != null) {
                Util.closeQuietly(webSocketReader);
            }
            if (webSocketWriter != null) {
                Util.closeQuietly(webSocketWriter);
            }
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(String str) {
        k.f("text", str);
        this.listener.onMessage(this, str);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(C0735m c0735m) {
        try {
            k.f("payload", c0735m);
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(c0735m);
                runWriter();
                this.receivedPingCount++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(C0735m c0735m) {
        k.f("payload", c0735m);
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public final synchronized boolean pong(C0735m c0735m) {
        try {
            k.f("payload", c0735m);
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(c0735m);
                runWriter();
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean processNextFrame() {
        try {
            WebSocketReader webSocketReader = this.reader;
            k.c(webSocketReader);
            webSocketReader.processNextFrame();
            return this.receivedCloseCode == -1;
        } catch (Exception e6) {
            failWebSocket(e6, null);
            return false;
        }
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.queueSize;
    }

    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // okhttp3.WebSocket
    public Request request() {
        return this.originalRequest;
    }

    @Override // okhttp3.WebSocket
    public boolean send(String str) {
        k.f("text", str);
        C0735m c0735m = C0735m.f9352k;
        return send(f.i(str), 1);
    }

    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public final void tearDown() throws InterruptedException {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    public final boolean writeOneFrame$okhttp() {
        String str;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        int i;
        Streams streams;
        synchronized (this) {
            try {
                if (this.failed) {
                    return false;
                }
                WebSocketWriter webSocketWriter2 = this.writer;
                C0735m c0735mPoll = this.pongQueue.poll();
                final boolean z5 = true;
                Object obj = null;
                if (c0735mPoll == null) {
                    Object objPoll = this.messageAndCloseQueue.poll();
                    if (objPoll instanceof Close) {
                        i = this.receivedCloseCode;
                        str = this.receivedCloseReason;
                        if (i != -1) {
                            streams = this.streams;
                            this.streams = null;
                            webSocketReader = this.reader;
                            this.reader = null;
                            webSocketWriter = this.writer;
                            this.writer = null;
                            this.taskQueue.shutdown();
                        } else {
                            long cancelAfterCloseMillis = ((Close) objPoll).getCancelAfterCloseMillis();
                            TaskQueue taskQueue = this.taskQueue;
                            final String strL = k.l(this.name, " cancel");
                            taskQueue.schedule(new Task(strL, z5, this) { // from class: okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda-8$$inlined$execute$default$1
                                final /* synthetic */ boolean $cancelable;
                                final /* synthetic */ String $name;
                                final /* synthetic */ RealWebSocket this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(strL, z5);
                                    this.$name = strL;
                                    this.$cancelable = z5;
                                    this.this$0 = this;
                                }

                                @Override // okhttp3.internal.concurrent.Task
                                public long runOnce() {
                                    this.this$0.cancel();
                                    return -1L;
                                }
                            }, TimeUnit.MILLISECONDS.toNanos(cancelAfterCloseMillis));
                            streams = null;
                            webSocketReader = null;
                            webSocketWriter = null;
                        }
                    } else {
                        if (objPoll == null) {
                            return false;
                        }
                        str = null;
                        webSocketReader = null;
                        webSocketWriter = null;
                        i = -1;
                        streams = null;
                    }
                    obj = objPoll;
                } else {
                    str = null;
                    webSocketReader = null;
                    webSocketWriter = null;
                    i = -1;
                    streams = null;
                }
                try {
                    if (c0735mPoll != null) {
                        k.c(webSocketWriter2);
                        webSocketWriter2.writePong(c0735mPoll);
                    } else if (obj instanceof Message) {
                        Message message = (Message) obj;
                        k.c(webSocketWriter2);
                        webSocketWriter2.writeMessageFrame(message.getFormatOpcode(), message.getData());
                        synchronized (this) {
                            this.queueSize -= (long) message.getData().d();
                        }
                    } else {
                        if (!(obj instanceof Close)) {
                            throw new AssertionError();
                        }
                        Close close = (Close) obj;
                        k.c(webSocketWriter2);
                        webSocketWriter2.writeClose(close.getCode(), close.getReason());
                        if (streams != null) {
                            WebSocketListener webSocketListener = this.listener;
                            k.c(str);
                            webSocketListener.onClosed(this, i, str);
                        }
                    }
                    if (streams != null) {
                        Util.closeQuietly(streams);
                    }
                    if (webSocketReader != null) {
                        Util.closeQuietly(webSocketReader);
                    }
                    if (webSocketWriter == null) {
                        return true;
                    }
                    Util.closeQuietly(webSocketWriter);
                    return true;
                } catch (Throwable th) {
                    if (streams != null) {
                        Util.closeQuietly(streams);
                    }
                    if (webSocketReader != null) {
                        Util.closeQuietly(webSocketReader);
                    }
                    if (webSocketWriter != null) {
                        Util.closeQuietly(webSocketWriter);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void writePingFrame$okhttp() {
        synchronized (this) {
            try {
                if (this.failed) {
                    return;
                }
                WebSocketWriter webSocketWriter = this.writer;
                if (webSocketWriter == null) {
                    return;
                }
                int i = this.awaitingPong ? this.sentPingCount : -1;
                this.sentPingCount++;
                this.awaitingPong = true;
                if (i != -1) {
                    StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                    sb.append(this.pingIntervalMillis);
                    sb.append("ms (after ");
                    failWebSocket(new SocketTimeoutException(AbstractC0013g0.l(sb, i - 1, " successful ping/pongs)")), null);
                    return;
                }
                try {
                    webSocketWriter.writePing(C0735m.f9352k);
                } catch (IOException e6) {
                    failWebSocket(e6, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean close(int i, String str, long j4) {
        C0735m c0735mI;
        try {
            WebSocketProtocol.INSTANCE.validateCloseCode(i);
            if (str != null) {
                C0735m c0735m = C0735m.f9352k;
                c0735mI = f.i(str);
                if (c0735mI.f9353h.length > 123) {
                    throw new IllegalArgumentException(k.l("reason.size() > 123: ", str).toString());
                }
            } else {
                c0735mI = null;
            }
            if (!this.failed && !this.enqueuedClose) {
                this.enqueuedClose = true;
                this.messageAndCloseQueue.add(new Close(i, c0735mI, j4));
                runWriter();
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(C0735m c0735m) {
        k.f("bytes", c0735m);
        this.listener.onMessage(this, c0735m);
    }

    @Override // okhttp3.WebSocket
    public boolean send(C0735m c0735m) {
        k.f("bytes", c0735m);
        return send(c0735m, 2);
    }

    private final synchronized boolean send(C0735m c0735m, int i) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + ((long) c0735m.d()) > MAX_QUEUE_SIZE) {
                close(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, null);
                return false;
            }
            this.queueSize += (long) c0735m.d();
            this.messageAndCloseQueue.add(new Message(i, c0735m));
            runWriter();
            return true;
        }
        return false;
    }
}
