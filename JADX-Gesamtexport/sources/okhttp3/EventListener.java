package okhttp3;

import E4.g;
import E4.k;
import com.spotify.sdk.android.auth.LoginActivity;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class EventListener {
    public static final Companion Companion = new Companion(null);
    public static final EventListener NONE = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
    };

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private Companion() {
        }
    }

    public interface Factory {
        EventListener create(Call call);
    }

    public void cacheConditionalHit(Call call, Response response) {
        k.f("call", call);
        k.f("cachedResponse", response);
    }

    public void cacheHit(Call call, Response response) {
        k.f("call", call);
        k.f(LoginActivity.RESPONSE_KEY, response);
    }

    public void cacheMiss(Call call) {
        k.f("call", call);
    }

    public void callEnd(Call call) {
        k.f("call", call);
    }

    public void callFailed(Call call, IOException iOException) {
        k.f("call", call);
        k.f("ioe", iOException);
    }

    public void callStart(Call call) {
        k.f("call", call);
    }

    public void canceled(Call call) {
        k.f("call", call);
    }

    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        k.f("call", call);
        k.f("inetSocketAddress", inetSocketAddress);
        k.f("proxy", proxy);
    }

    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        k.f("call", call);
        k.f("inetSocketAddress", inetSocketAddress);
        k.f("proxy", proxy);
        k.f("ioe", iOException);
    }

    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        k.f("call", call);
        k.f("inetSocketAddress", inetSocketAddress);
        k.f("proxy", proxy);
    }

    public void connectionAcquired(Call call, Connection connection) {
        k.f("call", call);
        k.f("connection", connection);
    }

    public void connectionReleased(Call call, Connection connection) {
        k.f("call", call);
        k.f("connection", connection);
    }

    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        k.f("call", call);
        k.f("domainName", str);
        k.f("inetAddressList", list);
    }

    public void dnsStart(Call call, String str) {
        k.f("call", call);
        k.f("domainName", str);
    }

    public void proxySelectEnd(Call call, HttpUrl httpUrl, List<Proxy> list) {
        k.f("call", call);
        k.f("url", httpUrl);
        k.f("proxies", list);
    }

    public void proxySelectStart(Call call, HttpUrl httpUrl) {
        k.f("call", call);
        k.f("url", httpUrl);
    }

    public void requestBodyEnd(Call call, long j4) {
        k.f("call", call);
    }

    public void requestBodyStart(Call call) {
        k.f("call", call);
    }

    public void requestFailed(Call call, IOException iOException) {
        k.f("call", call);
        k.f("ioe", iOException);
    }

    public void requestHeadersEnd(Call call, Request request) {
        k.f("call", call);
        k.f(LoginActivity.REQUEST_KEY, request);
    }

    public void requestHeadersStart(Call call) {
        k.f("call", call);
    }

    public void responseBodyEnd(Call call, long j4) {
        k.f("call", call);
    }

    public void responseBodyStart(Call call) {
        k.f("call", call);
    }

    public void responseFailed(Call call, IOException iOException) {
        k.f("call", call);
        k.f("ioe", iOException);
    }

    public void responseHeadersEnd(Call call, Response response) {
        k.f("call", call);
        k.f(LoginActivity.RESPONSE_KEY, response);
    }

    public void responseHeadersStart(Call call) {
        k.f("call", call);
    }

    public void satisfactionFailure(Call call, Response response) {
        k.f("call", call);
        k.f(LoginActivity.RESPONSE_KEY, response);
    }

    public void secureConnectEnd(Call call, Handshake handshake) {
        k.f("call", call);
    }

    public void secureConnectStart(Call call) {
        k.f("call", call);
    }
}
