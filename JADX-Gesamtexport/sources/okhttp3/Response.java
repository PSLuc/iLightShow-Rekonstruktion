package okhttp3;

import E4.k;
import com.spotify.sdk.android.auth.LoginActivity;
import h5.C0732j;
import h5.G;
import java.io.Closeable;
import java.io.EOFException;
import java.util.List;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;
import p084p4.c;
import p089q4.u;

/* JADX INFO: loaded from: classes.dex */
public final class Response implements Closeable, AutoCloseable {
    private final ResponseBody body;
    private final Response cacheResponse;
    private final int code;
    private final Exchange exchange;
    private final Handshake handshake;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String message;
    private final Response networkResponse;
    private final Response priorResponse;
    private final Protocol protocol;
    private final long receivedResponseAtMillis;
    private final Request request;
    private final long sentRequestAtMillis;

    public Response(Request request, Protocol protocol, String str, int i, Handshake handshake, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j4, long j6, Exchange exchange) {
        k.f(LoginActivity.REQUEST_KEY, request);
        k.f("protocol", protocol);
        k.f("message", str);
        k.f("headers", headers);
        this.request = request;
        this.protocol = protocol;
        this.message = str;
        this.code = i;
        this.handshake = handshake;
        this.headers = headers;
        this.body = responseBody;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = j4;
        this.receivedResponseAtMillis = j6;
        this.exchange = exchange;
    }

    public static /* synthetic */ String header$default(Response response, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return response.header(str, str2);
    }

    @c
    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name */
    public final ResponseBody m128deprecated_body() {
        return this.body;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m129deprecated_cacheControl() {
        return cacheControl();
    }

    @c
    /* JADX INFO: renamed from: -deprecated_cacheResponse, reason: not valid java name */
    public final Response m130deprecated_cacheResponse() {
        return this.cacheResponse;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_code, reason: not valid java name */
    public final int m131deprecated_code() {
        return this.code;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_handshake, reason: not valid java name */
    public final Handshake m132deprecated_handshake() {
        return this.handshake;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name */
    public final Headers m133deprecated_headers() {
        return this.headers;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_message, reason: not valid java name */
    public final String m134deprecated_message() {
        return this.message;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_networkResponse, reason: not valid java name */
    public final Response m135deprecated_networkResponse() {
        return this.networkResponse;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_priorResponse, reason: not valid java name */
    public final Response m136deprecated_priorResponse() {
        return this.priorResponse;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_protocol, reason: not valid java name */
    public final Protocol m137deprecated_protocol() {
        return this.protocol;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_receivedResponseAtMillis, reason: not valid java name */
    public final long m138deprecated_receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_request, reason: not valid java name */
    public final Request m139deprecated_request() {
        return this.request;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_sentRequestAtMillis, reason: not valid java name */
    public final long m140deprecated_sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public final ResponseBody body() {
        return this.body;
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControl2 = CacheControl.Companion.parse(this.headers);
        this.lazyCacheControl = cacheControl2;
        return cacheControl2;
    }

    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    public final List<Challenge> challenges() {
        String str;
        Headers headers = this.headers;
        int i = this.code;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i != 407) {
                return u.f11237h;
            }
            str = "Proxy-Authenticate";
        }
        return HttpHeaders.parseChallenges(headers, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ResponseBody responseBody = this.body;
        if (responseBody == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        responseBody.close();
    }

    public final int code() {
        return this.code;
    }

    public final Exchange exchange() {
        return this.exchange;
    }

    public final Handshake handshake() {
        return this.handshake;
    }

    public final String header(String str) {
        k.f("name", str);
        return header$default(this, str, null, 2, null);
    }

    public final Headers headers() {
        return this.headers;
    }

    public final boolean isRedirect() {
        int i = this.code;
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public final boolean isSuccessful() {
        int i = this.code;
        return 200 <= i && i < 300;
    }

    public final String message() {
        return this.message;
    }

    public final Response networkResponse() {
        return this.networkResponse;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final ResponseBody peekBody(long j4) throws EOFException {
        ResponseBody responseBody = this.body;
        k.c(responseBody);
        G gPeek = responseBody.source().peek();
        C0732j c0732j = new C0732j();
        gPeek.e(j4);
        long jMin = Math.min(j4, gPeek.i.i);
        while (jMin > 0) {
            long j6 = gPeek.read(c0732j, jMin);
            if (j6 == -1) {
                throw new EOFException();
            }
            jMin -= j6;
        }
        return ResponseBody.Companion.create(c0732j, this.body.contentType(), c0732j.i);
    }

    public final Response priorResponse() {
        return this.priorResponse;
    }

    public final Protocol protocol() {
        return this.protocol;
    }

    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    public final Request request() {
        return this.request;
    }

    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + '}';
    }

    public final Headers trailers() {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.trailers();
        }
        throw new IllegalStateException("trailers not available");
    }

    public final String header(String str, String str2) {
        k.f("name", str);
        String str3 = this.headers.get(str);
        return str3 == null ? str2 : str3;
    }

    public final List<String> headers(String str) {
        k.f("name", str);
        return this.headers.values(str);
    }

    public static class Builder {
        private ResponseBody body;
        private Response cacheResponse;
        private int code;
        private Exchange exchange;
        private Handshake handshake;
        private Headers.Builder headers;
        private String message;
        private Response networkResponse;
        private Response priorResponse;
        private Protocol protocol;
        private long receivedResponseAtMillis;
        private Request request;
        private long sentRequestAtMillis;

        public Builder() {
            this.code = -1;
            this.headers = new Headers.Builder();
        }

        private final void checkPriorResponse(Response response) {
            if (response != null && response.body() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private final void checkSupportResponse(String str, Response response) {
            if (response == null) {
                return;
            }
            if (response.body() != null) {
                throw new IllegalArgumentException(k.l(str, ".body != null").toString());
            }
            if (response.networkResponse() != null) {
                throw new IllegalArgumentException(k.l(str, ".networkResponse != null").toString());
            }
            if (response.cacheResponse() != null) {
                throw new IllegalArgumentException(k.l(str, ".cacheResponse != null").toString());
            }
            if (response.priorResponse() != null) {
                throw new IllegalArgumentException(k.l(str, ".priorResponse != null").toString());
            }
        }

        public Builder addHeader(String str, String str2) {
            k.f("name", str);
            k.f("value", str2);
            getHeaders$okhttp().add(str, str2);
            return this;
        }

        public Builder body(ResponseBody responseBody) {
            setBody$okhttp(responseBody);
            return this;
        }

        public Response build() {
            int i = this.code;
            if (i < 0) {
                throw new IllegalStateException(k.l("code < 0: ", Integer.valueOf(getCode$okhttp())).toString());
            }
            Request request = this.request;
            if (request == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.protocol;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.message;
            if (str != null) {
                return new Response(request, protocol, str, i, this.handshake, this.headers.build(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
            }
            throw new IllegalStateException("message == null");
        }

        public Builder cacheResponse(Response response) {
            checkSupportResponse("cacheResponse", response);
            setCacheResponse$okhttp(response);
            return this;
        }

        public Builder code(int i) {
            setCode$okhttp(i);
            return this;
        }

        public final ResponseBody getBody$okhttp() {
            return this.body;
        }

        public final Response getCacheResponse$okhttp() {
            return this.cacheResponse;
        }

        public final int getCode$okhttp() {
            return this.code;
        }

        public final Exchange getExchange$okhttp() {
            return this.exchange;
        }

        public final Handshake getHandshake$okhttp() {
            return this.handshake;
        }

        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        public final String getMessage$okhttp() {
            return this.message;
        }

        public final Response getNetworkResponse$okhttp() {
            return this.networkResponse;
        }

        public final Response getPriorResponse$okhttp() {
            return this.priorResponse;
        }

        public final Protocol getProtocol$okhttp() {
            return this.protocol;
        }

        public final long getReceivedResponseAtMillis$okhttp() {
            return this.receivedResponseAtMillis;
        }

        public final Request getRequest$okhttp() {
            return this.request;
        }

        public final long getSentRequestAtMillis$okhttp() {
            return this.sentRequestAtMillis;
        }

        public Builder handshake(Handshake handshake) {
            setHandshake$okhttp(handshake);
            return this;
        }

        public Builder header(String str, String str2) {
            k.f("name", str);
            k.f("value", str2);
            getHeaders$okhttp().set(str, str2);
            return this;
        }

        public Builder headers(Headers headers) {
            k.f("headers", headers);
            setHeaders$okhttp(headers.newBuilder());
            return this;
        }

        public final void initExchange$okhttp(Exchange exchange) {
            k.f("deferredTrailers", exchange);
            this.exchange = exchange;
        }

        public Builder message(String str) {
            k.f("message", str);
            setMessage$okhttp(str);
            return this;
        }

        public Builder networkResponse(Response response) {
            checkSupportResponse("networkResponse", response);
            setNetworkResponse$okhttp(response);
            return this;
        }

        public Builder priorResponse(Response response) {
            checkPriorResponse(response);
            setPriorResponse$okhttp(response);
            return this;
        }

        public Builder protocol(Protocol protocol) {
            k.f("protocol", protocol);
            setProtocol$okhttp(protocol);
            return this;
        }

        public Builder receivedResponseAtMillis(long j4) {
            setReceivedResponseAtMillis$okhttp(j4);
            return this;
        }

        public Builder removeHeader(String str) {
            k.f("name", str);
            getHeaders$okhttp().removeAll(str);
            return this;
        }

        public Builder request(Request request) {
            k.f(LoginActivity.REQUEST_KEY, request);
            setRequest$okhttp(request);
            return this;
        }

        public Builder sentRequestAtMillis(long j4) {
            setSentRequestAtMillis$okhttp(j4);
            return this;
        }

        public final void setBody$okhttp(ResponseBody responseBody) {
            this.body = responseBody;
        }

        public final void setCacheResponse$okhttp(Response response) {
            this.cacheResponse = response;
        }

        public final void setCode$okhttp(int i) {
            this.code = i;
        }

        public final void setExchange$okhttp(Exchange exchange) {
            this.exchange = exchange;
        }

        public final void setHandshake$okhttp(Handshake handshake) {
            this.handshake = handshake;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            k.f("<set-?>", builder);
            this.headers = builder;
        }

        public final void setMessage$okhttp(String str) {
            this.message = str;
        }

        public final void setNetworkResponse$okhttp(Response response) {
            this.networkResponse = response;
        }

        public final void setPriorResponse$okhttp(Response response) {
            this.priorResponse = response;
        }

        public final void setProtocol$okhttp(Protocol protocol) {
            this.protocol = protocol;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j4) {
            this.receivedResponseAtMillis = j4;
        }

        public final void setRequest$okhttp(Request request) {
            this.request = request;
        }

        public final void setSentRequestAtMillis$okhttp(long j4) {
            this.sentRequestAtMillis = j4;
        }

        public Builder(Response response) {
            k.f(LoginActivity.RESPONSE_KEY, response);
            this.code = -1;
            this.request = response.request();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.handshake = response.handshake();
            this.headers = response.headers().newBuilder();
            this.body = response.body();
            this.networkResponse = response.networkResponse();
            this.cacheResponse = response.cacheResponse();
            this.priorResponse = response.priorResponse();
            this.sentRequestAtMillis = response.sentRequestAtMillis();
            this.receivedResponseAtMillis = response.receivedResponseAtMillis();
            this.exchange = response.exchange();
        }
    }
}
