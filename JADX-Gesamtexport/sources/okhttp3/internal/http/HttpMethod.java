package okhttp3.internal.http;

import E4.k;

/* JADX INFO: loaded from: classes.dex */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(String str) {
        k.f("method", str);
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final boolean requiresRequestBody(String str) {
        k.f("method", str);
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }

    public final boolean invalidatesCache(String str) {
        k.f("method", str);
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    public final boolean redirectsToGet(String str) {
        k.f("method", str);
        return !str.equals("PROPFIND");
    }

    public final boolean redirectsWithBody(String str) {
        k.f("method", str);
        return str.equals("PROPFIND");
    }
}
