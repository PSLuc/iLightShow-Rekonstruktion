package okhttp3.internal.http2;

import D4.a;
import E4.g;
import E4.k;
import E4.w;
import h5.AbstractC0724b;
import h5.C0732j;
import h5.C0735m;
import h5.InterfaceC0733k;
import h5.InterfaceC0734l;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Platform;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class Http2Connection implements Closeable, AutoCloseable {
    public static final int AWAIT_PING = 3;
    public static final Companion Companion = new Companion(null);
    private static final Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;
    private final String connectionName;
    private final Set<Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;
    private final Listener listener;
    private int nextStreamId;
    private final Settings okHttpSettings;
    private Settings peerSettings;
    private final PushObserver pushObserver;
    private final TaskQueue pushQueue;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final ReaderRunnable readerRunnable;
    private final TaskQueue settingsListenerQueue;
    private final Socket socket;
    private final Map<Integer, Http2Stream> streams;
    private final TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final Http2Writer writer;
    private final TaskQueue writerQueue;

    public static final class Builder {
        private boolean client;
        public String connectionName;
        private Listener listener;
        private int pingIntervalMillis;
        private PushObserver pushObserver;
        public InterfaceC0733k sink;
        public Socket socket;
        public InterfaceC0734l source;
        private final TaskRunner taskRunner;

        public Builder(boolean z5, TaskRunner taskRunner) {
            k.f("taskRunner", taskRunner);
            this.client = z5;
            this.taskRunner = taskRunner;
            this.listener = Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = PushObserver.CANCEL;
        }

        public static /* synthetic */ Builder socket$default(Builder builder, Socket socket, String str, InterfaceC0734l interfaceC0734l, InterfaceC0733k interfaceC0733k, int i, Object obj) {
            if ((i & 2) != 0) {
                str = Util.peerName(socket);
            }
            if ((i & 4) != 0) {
                interfaceC0734l = AbstractC0724b.c(AbstractC0724b.j(socket));
            }
            if ((i & 8) != 0) {
                interfaceC0733k = AbstractC0724b.b(AbstractC0724b.h(socket));
            }
            return builder.socket(socket, str, interfaceC0734l, interfaceC0733k);
        }

        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        public final boolean getClient$okhttp() {
            return this.client;
        }

        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            k.m("connectionName");
            throw null;
        }

        public final Listener getListener$okhttp() {
            return this.listener;
        }

        public final int getPingIntervalMillis$okhttp() {
            return this.pingIntervalMillis;
        }

        public final PushObserver getPushObserver$okhttp() {
            return this.pushObserver;
        }

        public final InterfaceC0733k getSink$okhttp() {
            InterfaceC0733k interfaceC0733k = this.sink;
            if (interfaceC0733k != null) {
                return interfaceC0733k;
            }
            k.m("sink");
            throw null;
        }

        public final Socket getSocket$okhttp() {
            Socket socket = this.socket;
            if (socket != null) {
                return socket;
            }
            k.m("socket");
            throw null;
        }

        public final InterfaceC0734l getSource$okhttp() {
            InterfaceC0734l interfaceC0734l = this.source;
            if (interfaceC0734l != null) {
                return interfaceC0734l;
            }
            k.m("source");
            throw null;
        }

        public final TaskRunner getTaskRunner$okhttp() {
            return this.taskRunner;
        }

        public final Builder listener(Listener listener) {
            k.f("listener", listener);
            setListener$okhttp(listener);
            return this;
        }

        public final Builder pingIntervalMillis(int i) {
            setPingIntervalMillis$okhttp(i);
            return this;
        }

        public final Builder pushObserver(PushObserver pushObserver) {
            k.f("pushObserver", pushObserver);
            setPushObserver$okhttp(pushObserver);
            return this;
        }

        public final void setClient$okhttp(boolean z5) {
            this.client = z5;
        }

        public final void setConnectionName$okhttp(String str) {
            k.f("<set-?>", str);
            this.connectionName = str;
        }

        public final void setListener$okhttp(Listener listener) {
            k.f("<set-?>", listener);
            this.listener = listener;
        }

        public final void setPingIntervalMillis$okhttp(int i) {
            this.pingIntervalMillis = i;
        }

        public final void setPushObserver$okhttp(PushObserver pushObserver) {
            k.f("<set-?>", pushObserver);
            this.pushObserver = pushObserver;
        }

        public final void setSink$okhttp(InterfaceC0733k interfaceC0733k) {
            k.f("<set-?>", interfaceC0733k);
            this.sink = interfaceC0733k;
        }

        public final void setSocket$okhttp(Socket socket) {
            k.f("<set-?>", socket);
            this.socket = socket;
        }

        public final void setSource$okhttp(InterfaceC0734l interfaceC0734l) {
            k.f("<set-?>", interfaceC0734l);
            this.source = interfaceC0734l;
        }

        public final Builder socket(Socket socket) {
            k.f("socket", socket);
            return socket$default(this, socket, null, null, null, 14, null);
        }

        public final Builder socket(Socket socket, String str) {
            k.f("socket", socket);
            k.f("peerName", str);
            return socket$default(this, socket, str, null, null, 12, null);
        }

        public final Builder socket(Socket socket, String str, InterfaceC0734l interfaceC0734l) {
            k.f("socket", socket);
            k.f("peerName", str);
            k.f("source", interfaceC0734l);
            return socket$default(this, socket, str, interfaceC0734l, null, 8, null);
        }

        public final Builder socket(Socket socket, String str, InterfaceC0734l interfaceC0734l, InterfaceC0733k interfaceC0733k) {
            String strL;
            k.f("socket", socket);
            k.f("peerName", str);
            k.f("source", interfaceC0734l);
            k.f("sink", interfaceC0733k);
            setSocket$okhttp(socket);
            if (getClient$okhttp()) {
                strL = Util.okHttpName + ' ' + str;
            } else {
                strL = k.l("MockWebServer ", str);
            }
            setConnectionName$okhttp(strL);
            setSource$okhttp(interfaceC0734l);
            setSink$okhttp(interfaceC0733k);
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.DEFAULT_SETTINGS;
        }

        private Companion() {
        }
    }

    public static abstract class Listener {
        public static final Companion Companion = new Companion(null);
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public void onStream(Http2Stream http2Stream) {
                k.f("stream", http2Stream);
                http2Stream.close(ErrorCode.REFUSED_STREAM, null);
            }
        };

        public static final class Companion {
            public /* synthetic */ Companion(g gVar) {
                this();
            }

            private Companion() {
            }
        }

        public void onSettings(Http2Connection http2Connection, Settings settings) {
            k.f("connection", http2Connection);
            k.f("settings", settings);
        }

        public abstract void onStream(Http2Stream http2Stream);
    }

    public final class ReaderRunnable implements Http2Reader.Handler, a {
        private final Http2Reader reader;
        final /* synthetic */ Http2Connection this$0;

        public ReaderRunnable(Http2Connection http2Connection, Http2Reader http2Reader) {
            k.f("this$0", http2Connection);
            k.f("reader", http2Reader);
            this.this$0 = http2Connection;
            this.reader = http2Reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int i, String str, C0735m c0735m, String str2, int i3, long j4) {
            k.f("origin", str);
            k.f("protocol", c0735m);
            k.f("host", str2);
        }

        public final void applyAndAckSettings(boolean z5, Settings settings) {
            long initialWindowSize;
            int i;
            Http2Stream[] http2StreamArr;
            k.f("settings", settings);
            final w wVar = new w();
            Http2Writer writer = this.this$0.getWriter();
            final Http2Connection http2Connection = this.this$0;
            synchronized (writer) {
                synchronized (http2Connection) {
                    try {
                        Settings peerSettings = http2Connection.getPeerSettings();
                        if (!z5) {
                            Settings settings2 = new Settings();
                            settings2.merge(peerSettings);
                            settings2.merge(settings);
                            settings = settings2;
                        }
                        wVar.f1074h = settings;
                        initialWindowSize = ((long) settings.getInitialWindowSize()) - ((long) peerSettings.getInitialWindowSize());
                        i = 0;
                        if (initialWindowSize == 0 || http2Connection.getStreams$okhttp().isEmpty()) {
                            http2StreamArr = null;
                        } else {
                            Object[] array = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                            if (array == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                            }
                            http2StreamArr = (Http2Stream[]) array;
                        }
                        http2Connection.setPeerSettings((Settings) wVar.f1074h);
                        TaskQueue taskQueue = http2Connection.settingsListenerQueue;
                        final String strL = k.l(http2Connection.getConnectionName$okhttp(), " onSettings");
                        final boolean z6 = true;
                        taskQueue.schedule(new Task(strL, z6, http2Connection, wVar) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda-7$lambda-6$$inlined$execute$default$1
                            final /* synthetic */ boolean $cancelable;
                            final /* synthetic */ String $name;
                            final /* synthetic */ w $newPeerSettings$inlined;
                            final /* synthetic */ Http2Connection this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(strL, z6);
                                this.$name = strL;
                                this.$cancelable = z6;
                                this.this$0 = http2Connection;
                                this.$newPeerSettings$inlined = wVar;
                            }

                            @Override // okhttp3.internal.concurrent.Task
                            public long runOnce() {
                                this.this$0.getListener$okhttp().onSettings(this.this$0, (Settings) this.$newPeerSettings$inlined.f1074h);
                                return -1L;
                            }
                        }, 0L);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    http2Connection.getWriter().applyAndAckSettings((Settings) wVar.f1074h);
                } catch (IOException e6) {
                    http2Connection.failConnection(e6);
                }
            }
            if (http2StreamArr != null) {
                int length = http2StreamArr.length;
                while (i < length) {
                    Http2Stream http2Stream = http2StreamArr[i];
                    i++;
                    synchronized (http2Stream) {
                        http2Stream.addBytesToWriteWindow(initialWindowSize);
                    }
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean z5, int i, InterfaceC0734l interfaceC0734l, int i3) {
            k.f("source", interfaceC0734l);
            if (this.this$0.pushedStream$okhttp(i)) {
                this.this$0.pushDataLater$okhttp(i, interfaceC0734l, i3, z5);
                return;
            }
            Http2Stream stream = this.this$0.getStream(i);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(i, ErrorCode.PROTOCOL_ERROR);
                long j4 = i3;
                this.this$0.updateConnectionFlowControl$okhttp(j4);
                interfaceC0734l.l(j4);
                return;
            }
            stream.receiveData(interfaceC0734l, i3);
            if (z5) {
                stream.receiveHeaders(Util.EMPTY_HEADERS, true);
            }
        }

        public final Http2Reader getReader$okhttp() {
            return this.reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int i, ErrorCode errorCode, C0735m c0735m) {
            int i3;
            Object[] array;
            k.f("errorCode", errorCode);
            k.f("debugData", c0735m);
            c0735m.d();
            Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                i3 = 0;
                array = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                http2Connection.isShutdown = true;
            }
            Http2Stream[] http2StreamArr = (Http2Stream[]) array;
            int length = http2StreamArr.length;
            while (i3 < length) {
                Http2Stream http2Stream = http2StreamArr[i3];
                i3++;
                if (http2Stream.getId() > i && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean z5, int i, int i3, List<Header> list) {
            k.f("headerBlock", list);
            if (this.this$0.pushedStream$okhttp(i)) {
                this.this$0.pushHeadersLater$okhttp(i, list, z5);
                return;
            }
            final Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                Http2Stream stream = http2Connection.getStream(i);
                if (stream != null) {
                    stream.receiveHeaders(Util.toHeaders(list), z5);
                    return;
                }
                if (http2Connection.isShutdown) {
                    return;
                }
                if (i <= http2Connection.getLastGoodStreamId$okhttp()) {
                    return;
                }
                if (i % 2 == http2Connection.getNextStreamId$okhttp() % 2) {
                    return;
                }
                final Http2Stream http2Stream = new Http2Stream(i, http2Connection, false, z5, Util.toHeaders(list));
                http2Connection.setLastGoodStreamId$okhttp(i);
                http2Connection.getStreams$okhttp().put(Integer.valueOf(i), http2Stream);
                TaskQueue taskQueueNewQueue = http2Connection.taskRunner.newQueue();
                final String str = http2Connection.getConnectionName$okhttp() + '[' + i + "] onStream";
                final boolean z6 = true;
                taskQueueNewQueue.schedule(new Task(str, z6, http2Connection, http2Stream) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda-2$$inlined$execute$default$1
                    final /* synthetic */ boolean $cancelable;
                    final /* synthetic */ String $name;
                    final /* synthetic */ Http2Stream $newStream$inlined;
                    final /* synthetic */ Http2Connection this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(str, z6);
                        this.$name = str;
                        this.$cancelable = z6;
                        this.this$0 = http2Connection;
                        this.$newStream$inlined = http2Stream;
                    }

                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        try {
                            this.this$0.getListener$okhttp().onStream(this.$newStream$inlined);
                            return -1L;
                        } catch (IOException e6) {
                            Platform.Companion.get().log(k.l("Http2Connection.Listener failure for ", this.this$0.getConnectionName$okhttp()), 4, e6);
                            try {
                                this.$newStream$inlined.close(ErrorCode.PROTOCOL_ERROR, e6);
                                return -1L;
                            } catch (IOException unused) {
                                return -1L;
                            }
                        }
                    }
                }, 0L);
            }
        }

        @Override // D4.a
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            m147invoke();
            return x.f10867a;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean z5, final int i, final int i3) {
            if (!z5) {
                TaskQueue taskQueue = this.this$0.writerQueue;
                final String strL = k.l(this.this$0.getConnectionName$okhttp(), " ping");
                final Http2Connection http2Connection = this.this$0;
                final boolean z6 = true;
                taskQueue.schedule(new Task(strL, z6, http2Connection, i, i3) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
                    final /* synthetic */ boolean $cancelable;
                    final /* synthetic */ String $name;
                    final /* synthetic */ int $payload1$inlined;
                    final /* synthetic */ int $payload2$inlined;
                    final /* synthetic */ Http2Connection this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(strL, z6);
                        this.$name = strL;
                        this.$cancelable = z6;
                        this.this$0 = http2Connection;
                        this.$payload1$inlined = i;
                        this.$payload2$inlined = i3;
                    }

                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        this.this$0.writePing(true, this.$payload1$inlined, this.$payload2$inlined);
                        return -1L;
                    }
                }, 0L);
                return;
            }
            Http2Connection http2Connection2 = this.this$0;
            synchronized (http2Connection2) {
                try {
                    if (i == 1) {
                        http2Connection2.intervalPongsReceived++;
                    } else if (i == 2) {
                        http2Connection2.degradedPongsReceived++;
                    } else if (i == 3) {
                        http2Connection2.awaitPongsReceived++;
                        http2Connection2.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int i, int i3, int i6, boolean z5) {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int i, int i3, List<Header> list) throws Throwable {
            k.f("requestHeaders", list);
            this.this$0.pushRequestLater$okhttp(i3, list);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int i, ErrorCode errorCode) {
            k.f("errorCode", errorCode);
            if (this.this$0.pushedStream$okhttp(i)) {
                this.this$0.pushResetLater$okhttp(i, errorCode);
                return;
            }
            Http2Stream http2StreamRemoveStream$okhttp = this.this$0.removeStream$okhttp(i);
            if (http2StreamRemoveStream$okhttp == null) {
                return;
            }
            http2StreamRemoveStream$okhttp.receiveRstStream(errorCode);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(final boolean z5, final Settings settings) {
            k.f("settings", settings);
            TaskQueue taskQueue = this.this$0.writerQueue;
            final String strL = k.l(this.this$0.getConnectionName$okhttp(), " applyAndAckSettings");
            final boolean z6 = true;
            taskQueue.schedule(new Task(strL, z6, this, z5, settings) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1
                final /* synthetic */ boolean $cancelable;
                final /* synthetic */ boolean $clearPrevious$inlined;
                final /* synthetic */ String $name;
                final /* synthetic */ Settings $settings$inlined;
                final /* synthetic */ Http2Connection.ReaderRunnable this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(strL, z6);
                    this.$name = strL;
                    this.$cancelable = z6;
                    this.this$0 = this;
                    this.$clearPrevious$inlined = z5;
                    this.$settings$inlined = settings;
                }

                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.this$0.applyAndAckSettings(this.$clearPrevious$inlined, this.$settings$inlined);
                    return -1L;
                }
            }, 0L);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int i, long j4) {
            if (i == 0) {
                Http2Connection http2Connection = this.this$0;
                synchronized (http2Connection) {
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + j4;
                    http2Connection.notifyAll();
                }
                return;
            }
            Http2Stream stream = this.this$0.getStream(i);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(j4);
                }
            }
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public void m147invoke() throws Throwable {
            ErrorCode errorCode = ErrorCode.INTERNAL_ERROR;
            try {
                try {
                    this.reader.readConnectionPreface(this);
                    while (this.reader.nextFrame(false, this)) {
                    }
                    try {
                        this.this$0.close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
                        Util.closeQuietly(this.reader);
                    } catch (IOException e6) {
                        e = e6;
                        ErrorCode errorCode2 = ErrorCode.PROTOCOL_ERROR;
                        this.this$0.close$okhttp(errorCode2, errorCode2, e);
                        Util.closeQuietly(this.reader);
                    }
                } catch (IOException e7) {
                    e = e7;
                } catch (Throwable th) {
                    th = th;
                    this.this$0.close$okhttp(errorCode, errorCode, null);
                    Util.closeQuietly(this.reader);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                this.this$0.close$okhttp(errorCode, errorCode, null);
                Util.closeQuietly(this.reader);
                throw th;
            }
        }
    }

    static {
        Settings settings = new Settings();
        settings.set(7, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        settings.set(5, Http2.INITIAL_MAX_FRAME_SIZE);
        DEFAULT_SETTINGS = settings;
    }

    public Http2Connection(Builder builder) {
        k.f("builder", builder);
        boolean client$okhttp = builder.getClient$okhttp();
        this.client = client$okhttp;
        this.listener = builder.getListener$okhttp();
        this.streams = new LinkedHashMap();
        String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        this.nextStreamId = builder.getClient$okhttp() ? 3 : 2;
        TaskRunner taskRunner$okhttp = builder.getTaskRunner$okhttp();
        this.taskRunner = taskRunner$okhttp;
        TaskQueue taskQueueNewQueue = taskRunner$okhttp.newQueue();
        this.writerQueue = taskQueueNewQueue;
        this.pushQueue = taskRunner$okhttp.newQueue();
        this.settingsListenerQueue = taskRunner$okhttp.newQueue();
        this.pushObserver = builder.getPushObserver$okhttp();
        Settings settings = new Settings();
        if (builder.getClient$okhttp()) {
            settings.set(7, OKHTTP_CLIENT_WINDOW_SIZE);
        }
        this.okHttpSettings = settings;
        Settings settings2 = DEFAULT_SETTINGS;
        this.peerSettings = settings2;
        this.writeBytesMaximum = settings2.getInitialWindowSize();
        this.socket = builder.getSocket$okhttp();
        this.writer = new Http2Writer(builder.getSink$okhttp(), client$okhttp);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(builder.getSource$okhttp(), client$okhttp));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis$okhttp() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis$okhttp());
            final String strL = k.l(connectionName$okhttp, " ping");
            taskQueueNewQueue.schedule(new Task(strL, this, nanos) { // from class: okhttp3.internal.http2.Http2Connection$special$$inlined$schedule$1
                final /* synthetic */ String $name;
                final /* synthetic */ long $pingIntervalNanos$inlined;
                final /* synthetic */ Http2Connection this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(strL, false, 2, null);
                    this.$name = strL;
                    this.this$0 = this;
                    this.$pingIntervalNanos$inlined = nanos;
                }

                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    boolean z5;
                    synchronized (this.this$0) {
                        if (this.this$0.intervalPongsReceived < this.this$0.intervalPingsSent) {
                            z5 = true;
                        } else {
                            this.this$0.intervalPingsSent++;
                            z5 = false;
                        }
                    }
                    if (z5) {
                        this.this$0.failConnection(null);
                        return -1L;
                    }
                    this.this$0.writePing(false, 1, 0);
                    return this.$pingIntervalNanos$inlined;
                }
            }, nanos);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void failConnection(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        close$okhttp(errorCode, errorCode, iOException);
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z5, TaskRunner taskRunner, int i, Object obj) {
        if ((i & 1) != 0) {
            z5 = true;
        }
        if ((i & 2) != 0) {
            taskRunner = TaskRunner.INSTANCE;
        }
        http2Connection.start(z5, taskRunner);
    }

    public final synchronized void awaitPong() {
        while (this.awaitPongsReceived < this.awaitPingsSent) {
            wait();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void close$okhttp(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i;
        Object[] array;
        k.f("connectionCode", errorCode);
        k.f("streamCode", errorCode2);
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        try {
            shutdown(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (getStreams$okhttp().isEmpty()) {
                    array = null;
                } else {
                    array = getStreams$okhttp().values().toArray(new Http2Stream[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    getStreams$okhttp().clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) array;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            getWriter().close();
        } catch (IOException unused3) {
        }
        try {
            getSocket$okhttp().close();
        } catch (IOException unused4) {
        }
        this.writerQueue.shutdown();
        this.pushQueue.shutdown();
        this.settingsListenerQueue.shutdown();
    }

    public final void flush() {
        this.writer.flush();
    }

    public final boolean getClient$okhttp() {
        return this.client;
    }

    public final String getConnectionName$okhttp() {
        return this.connectionName;
    }

    public final int getLastGoodStreamId$okhttp() {
        return this.lastGoodStreamId;
    }

    public final Listener getListener$okhttp() {
        return this.listener;
    }

    public final int getNextStreamId$okhttp() {
        return this.nextStreamId;
    }

    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    public final Socket getSocket$okhttp() {
        return this.socket;
    }

    public final synchronized Http2Stream getStream(int i) {
        return this.streams.get(Integer.valueOf(i));
    }

    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final synchronized boolean isHealthy(long j4) {
        if (this.isShutdown) {
            return false;
        }
        return this.degradedPongsReceived >= this.degradedPingsSent || j4 < this.degradedPongDeadlineNs;
    }

    public final Http2Stream newStream(List<Header> list, boolean z5) {
        k.f("requestHeaders", list);
        return newStream(0, list, z5);
    }

    public final synchronized int openStreamCount() {
        return this.streams.size();
    }

    public final void pushDataLater$okhttp(final int i, InterfaceC0734l interfaceC0734l, final int i3, final boolean z5) {
        k.f("source", interfaceC0734l);
        final C0732j c0732j = new C0732j();
        long j4 = i3;
        interfaceC0734l.N(j4);
        interfaceC0734l.read(c0732j, j4);
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + i + "] onData";
        final boolean z6 = true;
        taskQueue.schedule(new Task(str, z6, this, i, c0732j, i3, z5) { // from class: okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1
            final /* synthetic */ C0732j $buffer$inlined;
            final /* synthetic */ int $byteCount$inlined;
            final /* synthetic */ boolean $cancelable;
            final /* synthetic */ boolean $inFinished$inlined;
            final /* synthetic */ String $name;
            final /* synthetic */ int $streamId$inlined;
            final /* synthetic */ Http2Connection this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(str, z6);
                this.$name = str;
                this.$cancelable = z6;
                this.this$0 = this;
                this.$streamId$inlined = i;
                this.$buffer$inlined = c0732j;
                this.$byteCount$inlined = i3;
                this.$inFinished$inlined = z5;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    boolean zOnData = this.this$0.pushObserver.onData(this.$streamId$inlined, this.$buffer$inlined, this.$byteCount$inlined, this.$inFinished$inlined);
                    if (zOnData) {
                        this.this$0.getWriter().rstStream(this.$streamId$inlined, ErrorCode.CANCEL);
                    }
                    if (!zOnData && !this.$inFinished$inlined) {
                        return -1L;
                    }
                    synchronized (this.this$0) {
                        this.this$0.currentPushRequests.remove(Integer.valueOf(this.$streamId$inlined));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void pushHeadersLater$okhttp(final int i, final List<Header> list, final boolean z5) {
        k.f("requestHeaders", list);
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + i + "] onHeaders";
        final boolean z6 = true;
        taskQueue.schedule(new Task(str, z6, this, i, list, z5) { // from class: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1
            final /* synthetic */ boolean $cancelable;
            final /* synthetic */ boolean $inFinished$inlined;
            final /* synthetic */ String $name;
            final /* synthetic */ List $requestHeaders$inlined;
            final /* synthetic */ int $streamId$inlined;
            final /* synthetic */ Http2Connection this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(str, z6);
                this.$name = str;
                this.$cancelable = z6;
                this.this$0 = this;
                this.$streamId$inlined = i;
                this.$requestHeaders$inlined = list;
                this.$inFinished$inlined = z5;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                boolean zOnHeaders = this.this$0.pushObserver.onHeaders(this.$streamId$inlined, this.$requestHeaders$inlined, this.$inFinished$inlined);
                if (zOnHeaders) {
                    try {
                        this.this$0.getWriter().rstStream(this.$streamId$inlined, ErrorCode.CANCEL);
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
                if (!zOnHeaders && !this.$inFinished$inlined) {
                    return -1L;
                }
                synchronized (this.this$0) {
                    this.this$0.currentPushRequests.remove(Integer.valueOf(this.$streamId$inlined));
                }
                return -1L;
            }
        }, 0L);
    }

    public final void pushRequestLater$okhttp(final int i, final List<Header> list) throws Throwable {
        Throwable th;
        k.f("requestHeaders", list);
        synchronized (this) {
            try {
                if (!this.currentPushRequests.contains(Integer.valueOf(i))) {
                    this.currentPushRequests.add(Integer.valueOf(i));
                    TaskQueue taskQueue = this.pushQueue;
                    final String str = this.connectionName + '[' + i + "] onRequest";
                    final boolean z5 = true;
                    taskQueue.schedule(new Task(str, z5, this, i, list) { // from class: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
                        final /* synthetic */ boolean $cancelable;
                        final /* synthetic */ String $name;
                        final /* synthetic */ List $requestHeaders$inlined;
                        final /* synthetic */ int $streamId$inlined;
                        final /* synthetic */ Http2Connection this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(str, z5);
                            this.$name = str;
                            this.$cancelable = z5;
                            this.this$0 = this;
                            this.$streamId$inlined = i;
                            this.$requestHeaders$inlined = list;
                        }

                        @Override // okhttp3.internal.concurrent.Task
                        public long runOnce() {
                            if (!this.this$0.pushObserver.onRequest(this.$streamId$inlined, this.$requestHeaders$inlined)) {
                                return -1L;
                            }
                            try {
                                this.this$0.getWriter().rstStream(this.$streamId$inlined, ErrorCode.CANCEL);
                                synchronized (this.this$0) {
                                    this.this$0.currentPushRequests.remove(Integer.valueOf(this.$streamId$inlined));
                                }
                                return -1L;
                            } catch (IOException unused) {
                                return -1L;
                            }
                        }
                    }, 0L);
                    return;
                }
                try {
                    writeSynResetLater$okhttp(i, ErrorCode.PROTOCOL_ERROR);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            throw th;
        }
    }

    public final void pushResetLater$okhttp(final int i, final ErrorCode errorCode) {
        k.f("errorCode", errorCode);
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + i + "] onReset";
        final boolean z5 = true;
        taskQueue.schedule(new Task(str, z5, this, i, errorCode) { // from class: okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1
            final /* synthetic */ boolean $cancelable;
            final /* synthetic */ ErrorCode $errorCode$inlined;
            final /* synthetic */ String $name;
            final /* synthetic */ int $streamId$inlined;
            final /* synthetic */ Http2Connection this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(str, z5);
                this.$name = str;
                this.$cancelable = z5;
                this.this$0 = this;
                this.$streamId$inlined = i;
                this.$errorCode$inlined = errorCode;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                this.this$0.pushObserver.onReset(this.$streamId$inlined, this.$errorCode$inlined);
                synchronized (this.this$0) {
                    this.this$0.currentPushRequests.remove(Integer.valueOf(this.$streamId$inlined));
                }
                return -1L;
            }
        }, 0L);
    }

    public final Http2Stream pushStream(int i, List<Header> list, boolean z5) {
        k.f("requestHeaders", list);
        if (this.client) {
            throw new IllegalStateException("Client cannot push requests.");
        }
        return newStream(i, list, z5);
    }

    public final boolean pushedStream$okhttp(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public final synchronized Http2Stream removeStream$okhttp(int i) {
        Http2Stream http2StreamRemove;
        http2StreamRemove = this.streams.remove(Integer.valueOf(i));
        notifyAll();
        return http2StreamRemove;
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j4 = this.degradedPongsReceived;
            long j6 = this.degradedPingsSent;
            if (j4 < j6) {
                return;
            }
            this.degradedPingsSent = j6 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + ((long) DEGRADED_PONG_TIMEOUT_NS);
            TaskQueue taskQueue = this.writerQueue;
            final String strL = k.l(this.connectionName, " ping");
            final boolean z5 = true;
            taskQueue.schedule(new Task(strL, z5, this) { // from class: okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
                final /* synthetic */ boolean $cancelable;
                final /* synthetic */ String $name;
                final /* synthetic */ Http2Connection this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(strL, z5);
                    this.$name = strL;
                    this.$cancelable = z5;
                    this.this$0 = this;
                }

                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.this$0.writePing(false, 2, 0);
                    return -1L;
                }
            }, 0L);
        }
    }

    public final void setLastGoodStreamId$okhttp(int i) {
        this.lastGoodStreamId = i;
    }

    public final void setNextStreamId$okhttp(int i) {
        this.nextStreamId = i;
    }

    public final void setPeerSettings(Settings settings) {
        k.f("<set-?>", settings);
        this.peerSettings = settings;
    }

    public final void setSettings(Settings settings) {
        k.f("settings", settings);
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    throw new ConnectionShutdownException();
                }
                getOkHttpSettings().merge(settings);
            }
            getWriter().settings(settings);
        }
    }

    public final void shutdown(ErrorCode errorCode) {
        k.f("statusCode", errorCode);
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                getWriter().goAway(getLastGoodStreamId$okhttp(), errorCode, Util.EMPTY_BYTE_ARRAY);
            }
        }
    }

    public final void start() {
        start$default(this, false, null, 3, null);
    }

    public final synchronized void updateConnectionFlowControl$okhttp(long j4) {
        long j6 = this.readBytesTotal + j4;
        this.readBytesTotal = j6;
        long j7 = j6 - this.readBytesAcknowledged;
        if (j7 >= this.okHttpSettings.getInitialWindowSize() / 2) {
            writeWindowUpdateLater$okhttp(0, j7);
            this.readBytesAcknowledged += j7;
        }
    }

    public final void writeData(int i, boolean z5, C0732j c0732j, long j4) {
        int iMin;
        long j6;
        if (j4 == 0) {
            this.writer.data(z5, i, c0732j, 0);
            return;
        }
        while (j4 > 0) {
            synchronized (this) {
                while (getWriteBytesTotal() >= getWriteBytesMaximum()) {
                    try {
                        try {
                            if (!getStreams$okhttp().containsKey(Integer.valueOf(i))) {
                                throw new IOException("stream closed");
                            }
                            wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j4, getWriteBytesMaximum() - getWriteBytesTotal()), getWriter().maxDataLength());
                j6 = iMin;
                this.writeBytesTotal = getWriteBytesTotal() + j6;
            }
            j4 -= j6;
            this.writer.data(z5 && j4 == 0, i, c0732j, iMin);
        }
    }

    public final void writeHeaders$okhttp(int i, boolean z5, List<Header> list) {
        k.f("alternating", list);
        this.writer.headers(z5, i, list);
    }

    public final void writePing(boolean z5, int i, int i3) {
        try {
            this.writer.ping(z5, i, i3);
        } catch (IOException e6) {
            failConnection(e6);
        }
    }

    public final void writePingAndAwaitPong() {
        writePing();
        awaitPong();
    }

    public final void writeSynReset$okhttp(int i, ErrorCode errorCode) {
        k.f("statusCode", errorCode);
        this.writer.rstStream(i, errorCode);
    }

    public final void writeSynResetLater$okhttp(final int i, final ErrorCode errorCode) {
        k.f("errorCode", errorCode);
        TaskQueue taskQueue = this.writerQueue;
        final String str = this.connectionName + '[' + i + "] writeSynReset";
        final boolean z5 = true;
        taskQueue.schedule(new Task(str, z5, this, i, errorCode) { // from class: okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
            final /* synthetic */ boolean $cancelable;
            final /* synthetic */ ErrorCode $errorCode$inlined;
            final /* synthetic */ String $name;
            final /* synthetic */ int $streamId$inlined;
            final /* synthetic */ Http2Connection this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(str, z5);
                this.$name = str;
                this.$cancelable = z5;
                this.this$0 = this;
                this.$streamId$inlined = i;
                this.$errorCode$inlined = errorCode;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.this$0.writeSynReset$okhttp(this.$streamId$inlined, this.$errorCode$inlined);
                    return -1L;
                } catch (IOException e6) {
                    this.this$0.failConnection(e6);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void writeWindowUpdateLater$okhttp(final int i, final long j4) {
        TaskQueue taskQueue = this.writerQueue;
        final String str = this.connectionName + '[' + i + "] windowUpdate";
        final boolean z5 = true;
        taskQueue.schedule(new Task(str, z5, this, i, j4) { // from class: okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
            final /* synthetic */ boolean $cancelable;
            final /* synthetic */ String $name;
            final /* synthetic */ int $streamId$inlined;
            final /* synthetic */ long $unacknowledgedBytesRead$inlined;
            final /* synthetic */ Http2Connection this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(str, z5);
                this.$name = str;
                this.$cancelable = z5;
                this.this$0 = this;
                this.$streamId$inlined = i;
                this.$unacknowledgedBytesRead$inlined = j4;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.this$0.getWriter().windowUpdate(this.$streamId$inlined, this.$unacknowledgedBytesRead$inlined);
                    return -1L;
                } catch (IOException e6) {
                    this.this$0.failConnection(e6);
                    return -1L;
                }
            }
        }, 0L);
    }

    private final Http2Stream newStream(int i, List<Header> list, boolean z5) {
        Throwable th;
        Http2Stream http2Stream;
        boolean z6;
        boolean z7 = !z5;
        synchronized (this.writer) {
            try {
                synchronized (this) {
                    try {
                        if (getNextStreamId$okhttp() > 1073741823) {
                            try {
                                shutdown(ErrorCode.REFUSED_STREAM);
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        try {
                            if (this.isShutdown) {
                                throw new ConnectionShutdownException();
                            }
                            int nextStreamId$okhttp = getNextStreamId$okhttp();
                            setNextStreamId$okhttp(getNextStreamId$okhttp() + 2);
                            http2Stream = new Http2Stream(nextStreamId$okhttp, this, z7, false, null);
                            z6 = !z5 || getWriteBytesTotal() >= getWriteBytesMaximum() || http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum();
                            if (http2Stream.isOpen()) {
                                getStreams$okhttp().put(Integer.valueOf(nextStreamId$okhttp), http2Stream);
                            }
                            if (i == 0) {
                                getWriter().headers(z7, nextStreamId$okhttp, list);
                            } else {
                                if (getClient$okhttp()) {
                                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                }
                                getWriter().pushPromise(i, nextStreamId$okhttp, list);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    th = th;
                    throw th;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        if (z6) {
            this.writer.flush();
        }
        return http2Stream;
    }

    public final void start(boolean z5) {
        start$default(this, z5, null, 2, null);
    }

    public final void start(boolean z5, TaskRunner taskRunner) {
        k.f("taskRunner", taskRunner);
        if (z5) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            int initialWindowSize = this.okHttpSettings.getInitialWindowSize();
            if (initialWindowSize != 65535) {
                this.writer.windowUpdate(0, initialWindowSize - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
        }
        taskRunner.newQueue().schedule(new TaskQueue.AnonymousClass1(this.connectionName, true, this.readerRunnable), 0L);
    }

    public final void writePing() {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }
}
