package okhttp3;

import B.AbstractC0013g0;
import E4.k;
import M4.s;
import com.spotify.sdk.android.auth.LoginActivity;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
import p084p4.c;
import p084p4.h;
import p089q4.m;
import p089q4.z;

/* JADX INFO: loaded from: classes.dex */
public final class Request {
    private final RequestBody body;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String method;
    private final Map<Class<?>, Object> tags;
    private final HttpUrl url;

    public static class Builder {
        private RequestBody body;
        private Headers.Builder headers;
        private String method;
        private Map<Class<?>, Object> tags;
        private HttpUrl url;

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = "GET";
            this.headers = new Headers.Builder();
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i & 1) != 0) {
                requestBody = Util.EMPTY_REQUEST;
            }
            return builder.delete(requestBody);
        }

        public Builder addHeader(String str, String str2) {
            k.f("name", str);
            k.f("value", str2);
            getHeaders$okhttp().add(str, str2);
            return this;
        }

        public Request build() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.build(), this.body, Util.toImmutableMap(this.tags));
            }
            throw new IllegalStateException("url == null");
        }

        public Builder cacheControl(CacheControl cacheControl) {
            k.f("cacheControl", cacheControl);
            String string = cacheControl.toString();
            return string.length() == 0 ? removeHeader("Cache-Control") : header("Cache-Control", string);
        }

        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }

        public Builder get() {
            return method("GET", null);
        }

        public final RequestBody getBody$okhttp() {
            return this.body;
        }

        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        public final String getMethod$okhttp() {
            return this.method;
        }

        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        public final HttpUrl getUrl$okhttp() {
            return this.url;
        }

        public Builder head() {
            return method("HEAD", null);
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

        public Builder method(String str, RequestBody requestBody) {
            k.f("method", str);
            if (str.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (requestBody == null) {
                if (HttpMethod.requiresRequestBody(str)) {
                    throw new IllegalArgumentException(AbstractC0013g0.i("method ", str, " must have a request body.").toString());
                }
            } else if (!HttpMethod.permitsRequestBody(str)) {
                throw new IllegalArgumentException(AbstractC0013g0.i("method ", str, " must not have a request body.").toString());
            }
            setMethod$okhttp(str);
            setBody$okhttp(requestBody);
            return this;
        }

        public Builder patch(RequestBody requestBody) {
            k.f("body", requestBody);
            return method("PATCH", requestBody);
        }

        public Builder post(RequestBody requestBody) {
            k.f("body", requestBody);
            return method("POST", requestBody);
        }

        public Builder put(RequestBody requestBody) {
            k.f("body", requestBody);
            return method("PUT", requestBody);
        }

        public Builder removeHeader(String str) {
            k.f("name", str);
            getHeaders$okhttp().removeAll(str);
            return this;
        }

        public final void setBody$okhttp(RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            k.f("<set-?>", builder);
            this.headers = builder;
        }

        public final void setMethod$okhttp(String str) {
            k.f("<set-?>", str);
            this.method = str;
        }

        public final void setTags$okhttp(Map<Class<?>, Object> map) {
            k.f("<set-?>", map);
            this.tags = map;
        }

        public final void setUrl$okhttp(HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        public Builder tag(Object obj) {
            return tag(Object.class, obj);
        }

        public Builder url(HttpUrl httpUrl) {
            k.f("url", httpUrl);
            setUrl$okhttp(httpUrl);
            return this;
        }

        public Builder delete(RequestBody requestBody) {
            return method("DELETE", requestBody);
        }

        public <T> Builder tag(Class<? super T> cls, T t6) {
            k.f("type", cls);
            if (t6 == null) {
                getTags$okhttp().remove(cls);
                return this;
            }
            if (getTags$okhttp().isEmpty()) {
                setTags$okhttp(new LinkedHashMap());
            }
            Map<Class<?>, Object> tags$okhttp = getTags$okhttp();
            T tCast = cls.cast(t6);
            k.c(tCast);
            tags$okhttp.put(cls, tCast);
            return this;
        }

        public Builder url(String str) {
            k.f("url", str);
            if (s.W(str, "ws:", true)) {
                String strSubstring = str.substring(3);
                k.e("this as java.lang.String).substring(startIndex)", strSubstring);
                str = k.l("http:", strSubstring);
            } else if (s.W(str, "wss:", true)) {
                String strSubstring2 = str.substring(4);
                k.e("this as java.lang.String).substring(startIndex)", strSubstring2);
                str = k.l("https:", strSubstring2);
            }
            return url(HttpUrl.Companion.get(str));
        }

        public Builder(Request request) {
            LinkedHashMap linkedHashMapY;
            k.f(LoginActivity.REQUEST_KEY, request);
            this.tags = new LinkedHashMap();
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            if (request.getTags$okhttp().isEmpty()) {
                linkedHashMapY = new LinkedHashMap();
            } else {
                linkedHashMapY = z.Y(request.getTags$okhttp());
            }
            this.tags = linkedHashMapY;
            this.headers = request.headers().newBuilder();
        }

        public Builder url(URL url) {
            k.f("url", url);
            HttpUrl.Companion companion = HttpUrl.Companion;
            String string = url.toString();
            k.e("url.toString()", string);
            return url(companion.get(string));
        }
    }

    public Request(HttpUrl httpUrl, String str, Headers headers, RequestBody requestBody, Map<Class<?>, ? extends Object> map) {
        k.f("url", httpUrl);
        k.f("method", str);
        k.f("headers", headers);
        k.f("tags", map);
        this.url = httpUrl;
        this.method = str;
        this.headers = headers;
        this.body = requestBody;
        this.tags = map;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name */
    public final RequestBody m123deprecated_body() {
        return this.body;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m124deprecated_cacheControl() {
        return cacheControl();
    }

    @c
    /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name */
    public final Headers m125deprecated_headers() {
        return this.headers;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_method, reason: not valid java name */
    public final String m126deprecated_method() {
        return this.method;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name */
    public final HttpUrl m127deprecated_url() {
        return this.url;
    }

    public final RequestBody body() {
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

    public final Map<Class<?>, Object> getTags$okhttp() {
        return this.tags;
    }

    public final String header(String str) {
        k.f("name", str);
        return this.headers.get(str);
    }

    public final Headers headers() {
        return this.headers;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    public final String method() {
        return this.method;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final Object tag() {
        return tag(Object.class);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(method());
        sb.append(", url=");
        sb.append(url());
        if (headers().size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (h hVar : headers()) {
                int i3 = i + 1;
                if (i < 0) {
                    m.O();
                    throw null;
                }
                h hVar2 = hVar;
                String str = (String) hVar2.f10849h;
                String str2 = (String) hVar2.i;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i3;
            }
            sb.append(']');
        }
        if (!getTags$okhttp().isEmpty()) {
            sb.append(", tags=");
            sb.append(getTags$okhttp());
        }
        sb.append('}');
        String string = sb.toString();
        k.e("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }

    public final HttpUrl url() {
        return this.url;
    }

    public final List<String> headers(String str) {
        k.f("name", str);
        return this.headers.values(str);
    }

    public final <T> T tag(Class<? extends T> cls) {
        k.f("type", cls);
        return cls.cast(this.tags.get(cls));
    }
}
