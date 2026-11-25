package okhttp3.internal;

import E4.k;
import com.spotify.sdk.android.auth.LoginActivity;
import javax.net.ssl.SSLSocket;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.Cookie;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
public final class Internal {
    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str) {
        k.f("builder", builder);
        k.f("line", str);
        return builder.addLenient$okhttp(str);
    }

    public static final void applyConnectionSpec(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z5) {
        k.f("connectionSpec", connectionSpec);
        k.f("sslSocket", sSLSocket);
        connectionSpec.apply$okhttp(sSLSocket, z5);
    }

    public static final Response cacheGet(Cache cache, Request request) {
        k.f("cache", cache);
        k.f(LoginActivity.REQUEST_KEY, request);
        return cache.get$okhttp(request);
    }

    public static final String cookieToString(Cookie cookie, boolean z5) {
        k.f("cookie", cookie);
        return cookie.toString$okhttp(z5);
    }

    public static final Cookie parseCookie(long j4, HttpUrl httpUrl, String str) {
        k.f("url", httpUrl);
        k.f("setCookie", str);
        return Cookie.Companion.parse$okhttp(j4, httpUrl, str);
    }

    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str, String str2) {
        k.f("builder", builder);
        k.f("name", str);
        k.f("value", str2);
        return builder.addLenient$okhttp(str, str2);
    }
}
