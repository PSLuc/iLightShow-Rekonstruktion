package okhttp3.internal.http1;

import E4.g;
import E4.k;
import M4.l;
import M4.s;
import com.spotify.sdk.android.auth.LoginActivity;
import h5.C0732j;
import h5.InterfaceC0733k;
import h5.InterfaceC0734l;
import h5.K;
import h5.M;
import h5.P;
import h5.u;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: loaded from: classes.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {
    public static final Companion Companion = new Companion(null);
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private final OkHttpClient client;
    private final RealConnection connection;
    private final HeadersReader headersReader;
    private final InterfaceC0733k sink;
    private final InterfaceC0734l source;
    private int state;
    private Headers trailers;

    public abstract class AbstractSource implements M {
        private boolean closed;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final u timeout;

        public AbstractSource(Http1ExchangeCodec http1ExchangeCodec) {
            k.f("this$0", http1ExchangeCodec);
            this.this$0 = http1ExchangeCodec;
            this.timeout = new u(http1ExchangeCodec.source.timeout());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public abstract /* synthetic */ void close();

        public final boolean getClosed() {
            return this.closed;
        }

        public final u getTimeout() {
            return this.timeout;
        }

        @Override // h5.M
        public long read(C0732j c0732j, long j4) throws IOException {
            k.f("sink", c0732j);
            try {
                return this.this$0.source.read(c0732j, j4);
            } catch (IOException e6) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
                throw e6;
            }
        }

        public final void responseBodyComplete() {
            if (this.this$0.state == 6) {
                return;
            }
            if (this.this$0.state != 5) {
                throw new IllegalStateException(k.l("state: ", Integer.valueOf(this.this$0.state)));
            }
            this.this$0.detachTimeout(this.timeout);
            this.this$0.state = 6;
        }

        public final void setClosed(boolean z5) {
            this.closed = z5;
        }

        @Override // h5.M
        public P timeout() {
            return this.timeout;
        }
    }

    public final class ChunkedSink implements K {
        private boolean closed;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final u timeout;

        public ChunkedSink(Http1ExchangeCodec http1ExchangeCodec) {
            k.f("this$0", http1ExchangeCodec);
            this.this$0 = http1ExchangeCodec;
            this.timeout = new u(http1ExchangeCodec.sink.timeout());
        }

        @Override // h5.K, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            this.this$0.sink.O("0\r\n\r\n");
            this.this$0.detachTimeout(this.timeout);
            this.this$0.state = 3;
        }

        @Override // h5.K, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            this.this$0.sink.flush();
        }

        @Override // h5.K
        public P timeout() {
            return this.timeout;
        }

        @Override // h5.K
        public void write(C0732j c0732j, long j4) {
            k.f("source", c0732j);
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            if (j4 == 0) {
                return;
            }
            this.this$0.sink.h(j4);
            this.this$0.sink.O("\r\n");
            this.this$0.sink.write(c0732j, j4);
            this.this$0.sink.O("\r\n");
        }
    }

    public final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final HttpUrl url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super(http1ExchangeCodec);
            k.f("this$0", http1ExchangeCodec);
            k.f("url", httpUrl);
            this.this$0 = http1ExchangeCodec;
            this.url = httpUrl;
            this.bytesRemainingInChunk = Http1ExchangeCodec.NO_CHUNK_YET;
            this.hasMoreChunks = true;
        }

        private final void readChunkSize() throws ProtocolException {
            if (this.bytesRemainingInChunk != Http1ExchangeCodec.NO_CHUNK_YET) {
                this.this$0.source.w();
            }
            try {
                this.bytesRemainingInChunk = this.this$0.source.R();
                String string = l.B0(this.this$0.source.w()).toString();
                if (this.bytesRemainingInChunk < 0 || (string.length() > 0 && !s.W(string, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + string + '\"');
                }
                if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    Http1ExchangeCodec http1ExchangeCodec = this.this$0;
                    http1ExchangeCodec.trailers = http1ExchangeCodec.headersReader.readHeaders();
                    OkHttpClient okHttpClient = this.this$0.client;
                    k.c(okHttpClient);
                    CookieJar cookieJar = okHttpClient.cookieJar();
                    HttpUrl httpUrl = this.url;
                    Headers headers = this.this$0.trailers;
                    k.c(headers);
                    HttpHeaders.receiveHeaders(cookieJar, httpUrl, headers);
                    responseBodyComplete();
                }
            } catch (NumberFormatException e6) {
                throw new ProtocolException(e6.getMessage());
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, h5.M
        public long read(C0732j c0732j, long j4) throws IOException {
            k.f("sink", c0732j);
            if (j4 < 0) {
                throw new IllegalArgumentException(k.l("byteCount < 0: ", Long.valueOf(j4)).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            if (!this.hasMoreChunks) {
                return Http1ExchangeCodec.NO_CHUNK_YET;
            }
            long j6 = this.bytesRemainingInChunk;
            if (j6 == 0 || j6 == Http1ExchangeCodec.NO_CHUNK_YET) {
                readChunkSize();
                if (!this.hasMoreChunks) {
                    return Http1ExchangeCodec.NO_CHUNK_YET;
                }
            }
            long j7 = super.read(c0732j, Math.min(j4, this.bytesRemainingInChunk));
            if (j7 != Http1ExchangeCodec.NO_CHUNK_YET) {
                this.bytesRemainingInChunk -= j7;
                return j7;
            }
            this.this$0.getConnection().noNewExchanges$okhttp();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            responseBodyComplete();
            throw protocolException;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private Companion() {
        }
    }

    public final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;
        final /* synthetic */ Http1ExchangeCodec this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FixedLengthSource(Http1ExchangeCodec http1ExchangeCodec, long j4) {
            super(http1ExchangeCodec);
            k.f("this$0", http1ExchangeCodec);
            this.this$0 = http1ExchangeCodec;
            this.bytesRemaining = j4;
            if (j4 == 0) {
                responseBodyComplete();
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, h5.M
        public long read(C0732j c0732j, long j4) throws IOException {
            k.f("sink", c0732j);
            if (j4 < 0) {
                throw new IllegalArgumentException(k.l("byteCount < 0: ", Long.valueOf(j4)).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            long j6 = this.bytesRemaining;
            if (j6 == 0) {
                return Http1ExchangeCodec.NO_CHUNK_YET;
            }
            long j7 = super.read(c0732j, Math.min(j6, j4));
            if (j7 == Http1ExchangeCodec.NO_CHUNK_YET) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                responseBodyComplete();
                throw protocolException;
            }
            long j8 = this.bytesRemaining - j7;
            this.bytesRemaining = j8;
            if (j8 == 0) {
                responseBodyComplete();
            }
            return j7;
        }
    }

    public final class KnownLengthSink implements K {
        private boolean closed;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final u timeout;

        public KnownLengthSink(Http1ExchangeCodec http1ExchangeCodec) {
            k.f("this$0", http1ExchangeCodec);
            this.this$0 = http1ExchangeCodec;
            this.timeout = new u(http1ExchangeCodec.sink.timeout());
        }

        @Override // h5.K, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            this.this$0.detachTimeout(this.timeout);
            this.this$0.state = 3;
        }

        @Override // h5.K, java.io.Flushable
        public void flush() {
            if (this.closed) {
                return;
            }
            this.this$0.sink.flush();
        }

        @Override // h5.K
        public P timeout() {
            return this.timeout;
        }

        @Override // h5.K
        public void write(C0732j c0732j, long j4) {
            k.f("source", c0732j);
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            Util.checkOffsetAndCount(c0732j.i, 0L, j4);
            this.this$0.sink.write(c0732j, j4);
        }
    }

    public final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;
        final /* synthetic */ Http1ExchangeCodec this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownLengthSource(Http1ExchangeCodec http1ExchangeCodec) {
            super(http1ExchangeCodec);
            k.f("this$0", http1ExchangeCodec);
            this.this$0 = http1ExchangeCodec;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, h5.M
        public long read(C0732j c0732j, long j4) throws IOException {
            k.f("sink", c0732j);
            if (j4 < 0) {
                throw new IllegalArgumentException(k.l("byteCount < 0: ", Long.valueOf(j4)).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            if (this.inputExhausted) {
                return Http1ExchangeCodec.NO_CHUNK_YET;
            }
            long j6 = super.read(c0732j, j4);
            if (j6 != Http1ExchangeCodec.NO_CHUNK_YET) {
                return j6;
            }
            this.inputExhausted = true;
            responseBodyComplete();
            return Http1ExchangeCodec.NO_CHUNK_YET;
        }
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, InterfaceC0734l interfaceC0734l, InterfaceC0733k interfaceC0733k) {
        k.f("connection", realConnection);
        k.f("source", interfaceC0734l);
        k.f("sink", interfaceC0733k);
        this.client = okHttpClient;
        this.connection = realConnection;
        this.source = interfaceC0734l;
        this.sink = interfaceC0733k;
        this.headersReader = new HeadersReader(interfaceC0734l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachTimeout(u uVar) {
        P p6 = uVar.f9369a;
        P p7 = P.NONE;
        k.f("delegate", p7);
        uVar.f9369a = p7;
        p6.clearDeadline();
        p6.clearTimeout();
    }

    private final boolean isChunked(Response response) {
        return "chunked".equalsIgnoreCase(Response.header$default(response, "Transfer-Encoding", null, 2, null));
    }

    private final K newChunkedSink() {
        int i = this.state;
        if (i != 1) {
            throw new IllegalStateException(k.l("state: ", Integer.valueOf(i)).toString());
        }
        this.state = 2;
        return new ChunkedSink(this);
    }

    private final M newChunkedSource(HttpUrl httpUrl) {
        int i = this.state;
        if (i != 4) {
            throw new IllegalStateException(k.l("state: ", Integer.valueOf(i)).toString());
        }
        this.state = 5;
        return new ChunkedSource(this, httpUrl);
    }

    private final M newFixedLengthSource(long j4) {
        int i = this.state;
        if (i != 4) {
            throw new IllegalStateException(k.l("state: ", Integer.valueOf(i)).toString());
        }
        this.state = 5;
        return new FixedLengthSource(this, j4);
    }

    private final K newKnownLengthSink() {
        int i = this.state;
        if (i != 1) {
            throw new IllegalStateException(k.l("state: ", Integer.valueOf(i)).toString());
        }
        this.state = 2;
        return new KnownLengthSink(this);
    }

    private final M newUnknownLengthSource() {
        int i = this.state;
        if (i != 4) {
            throw new IllegalStateException(k.l("state: ", Integer.valueOf(i)).toString());
        }
        this.state = 5;
        getConnection().noNewExchanges$okhttp();
        return new UnknownLengthSource(this);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        getConnection().cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public K createRequestBody(Request request, long j4) throws ProtocolException {
        k.f(LoginActivity.REQUEST_KEY, request);
        if (request.body() != null && request.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (isChunked(request)) {
            return newChunkedSink();
        }
        if (j4 != NO_CHUNK_YET) {
            return newKnownLengthSink();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public RealConnection getConnection() {
        return this.connection;
    }

    public final boolean isClosed() {
        return this.state == 6;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public M openResponseBodySource(Response response) {
        k.f(LoginActivity.RESPONSE_KEY, response);
        if (!HttpHeaders.promisesBody(response)) {
            return newFixedLengthSource(0L);
        }
        if (isChunked(response)) {
            return newChunkedSource(response.request().url());
        }
        long jHeadersContentLength = Util.headersContentLength(response);
        return jHeadersContentLength != NO_CHUNK_YET ? newFixedLengthSource(jHeadersContentLength) : newUnknownLengthSource();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean z5) {
        int i = this.state;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(k.l("state: ", Integer.valueOf(i)).toString());
        }
        try {
            StatusLine statusLine = StatusLine.Companion.parse(this.headersReader.readLine());
            Response.Builder builderHeaders = new Response.Builder().protocol(statusLine.protocol).code(statusLine.code).message(statusLine.message).headers(this.headersReader.readHeaders());
            if (z5 && statusLine.code == 100) {
                return null;
            }
            int i3 = statusLine.code;
            if (i3 == 100) {
                this.state = 3;
                return builderHeaders;
            }
            if (102 > i3 || i3 >= 200) {
                this.state = 4;
                return builderHeaders;
            }
            this.state = 3;
            return builderHeaders;
        } catch (EOFException e6) {
            throw new IOException(k.l("unexpected end of stream on ", getConnection().route().address().url().redact()), e6);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
        k.f(LoginActivity.RESPONSE_KEY, response);
        if (HttpHeaders.promisesBody(response)) {
            return isChunked(response) ? NO_CHUNK_YET : Util.headersContentLength(response);
        }
        return 0L;
    }

    public final void skipConnectBody(Response response) {
        k.f(LoginActivity.RESPONSE_KEY, response);
        long jHeadersContentLength = Util.headersContentLength(response);
        if (jHeadersContentLength == NO_CHUNK_YET) {
            return;
        }
        M mNewFixedLengthSource = newFixedLengthSource(jHeadersContentLength);
        Util.skipAll(mNewFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        mNewFixedLengthSource.close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Headers trailers() {
        if (this.state != 6) {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        Headers headers = this.trailers;
        return headers == null ? Util.EMPTY_HEADERS : headers;
    }

    public final void writeRequest(Headers headers, String str) {
        k.f("headers", headers);
        k.f("requestLine", str);
        int i = this.state;
        if (i != 0) {
            throw new IllegalStateException(k.l("state: ", Integer.valueOf(i)).toString());
        }
        this.sink.O(str).O("\r\n");
        int size = headers.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.sink.O(headers.name(i3)).O(": ").O(headers.value(i3)).O("\r\n");
        }
        this.sink.O("\r\n");
        this.state = 1;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) {
        k.f(LoginActivity.REQUEST_KEY, request);
        RequestLine requestLine = RequestLine.INSTANCE;
        Proxy.Type type = getConnection().route().proxy().type();
        k.e("connection.route().proxy.type()", type);
        writeRequest(request.headers(), requestLine.get(request, type));
    }

    private final boolean isChunked(Request request) {
        return "chunked".equalsIgnoreCase(request.header("Transfer-Encoding"));
    }
}
