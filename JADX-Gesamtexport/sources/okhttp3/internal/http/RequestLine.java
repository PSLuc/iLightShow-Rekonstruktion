package okhttp3.internal.http;

import E4.k;
import com.spotify.sdk.android.auth.LoginActivity;
import java.net.Proxy;
import okhttp3.HttpUrl;
import okhttp3.Request;

/* JADX INFO: loaded from: classes.dex */
public final class RequestLine {
    public static final RequestLine INSTANCE = new RequestLine();

    private RequestLine() {
    }

    private final boolean includeAuthorityInRequestLine(Request request, Proxy.Type type) {
        return !request.isHttps() && type == Proxy.Type.HTTP;
    }

    public final String get(Request request, Proxy.Type type) {
        k.f(LoginActivity.REQUEST_KEY, request);
        k.f("proxyType", type);
        StringBuilder sb = new StringBuilder();
        sb.append(request.method());
        sb.append(' ');
        RequestLine requestLine = INSTANCE;
        if (requestLine.includeAuthorityInRequestLine(request, type)) {
            sb.append(request.url());
        } else {
            sb.append(requestLine.requestPath(request.url()));
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        k.e("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }

    public final String requestPath(HttpUrl httpUrl) {
        k.f("url", httpUrl);
        String strEncodedPath = httpUrl.encodedPath();
        String strEncodedQuery = httpUrl.encodedQuery();
        if (strEncodedQuery == null) {
            return strEncodedPath;
        }
        return strEncodedPath + '?' + ((Object) strEncodedQuery);
    }
}
