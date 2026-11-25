package okhttp3.internal.cache;

import E4.g;
import E4.k;
import M4.s;
import com.spotify.sdk.android.auth.LoginActivity;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;

/* JADX INFO: loaded from: classes.dex */
public final class CacheStrategy {
    public static final Companion Companion = new Companion(null);
    private final Response cacheResponse;
    private final Request networkRequest;

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:24:0x003b  */
        public final boolean isCacheable(Response response, Request request) {
            k.f(LoginActivity.RESPONSE_KEY, response);
            k.f(LoginActivity.REQUEST_KEY, request);
            int iCode = response.code();
            if (iCode != 200 && iCode != 410 && iCode != 414 && iCode != 501 && iCode != 203 && iCode != 204) {
                if (iCode == 307) {
                    if (Response.header$default(response, "Expires", null, 2, null) == null && response.cacheControl().maxAgeSeconds() == -1 && !response.cacheControl().isPublic() && !response.cacheControl().isPrivate()) {
                        return false;
                    }
                } else if (iCode != 308 && iCode != 404 && iCode != 405) {
                    switch (iCode) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            if (Response.header$default(response, "Expires", null, 2, null) == null) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (response.cacheControl().noStore() || request.cacheControl().noStore()) ? false : true;
        }

        private Companion() {
        }
    }

    public static final class Factory {
        private int ageSeconds;
        private final Response cacheResponse;
        private String etag;
        private Date expires;
        private Date lastModified;
        private String lastModifiedString;
        private final long nowMillis;
        private long receivedResponseMillis;
        private final Request request;
        private long sentRequestMillis;
        private Date servedDate;
        private String servedDateString;

        public Factory(long j4, Request request, Response response) {
            k.f(LoginActivity.REQUEST_KEY, request);
            this.nowMillis = j4;
            this.request = request;
            this.cacheResponse = response;
            this.ageSeconds = -1;
            if (response != null) {
                this.sentRequestMillis = response.sentRequestAtMillis();
                this.receivedResponseMillis = response.receivedResponseAtMillis();
                Headers headers = response.headers();
                int size = headers.size();
                int i = 0;
                while (i < size) {
                    int i3 = i + 1;
                    String strName = headers.name(i);
                    String strValue = headers.value(i);
                    if (s.Q(strName, "Date", true)) {
                        this.servedDate = DatesKt.toHttpDateOrNull(strValue);
                        this.servedDateString = strValue;
                    } else if (s.Q(strName, "Expires", true)) {
                        this.expires = DatesKt.toHttpDateOrNull(strValue);
                    } else if (s.Q(strName, "Last-Modified", true)) {
                        this.lastModified = DatesKt.toHttpDateOrNull(strValue);
                        this.lastModifiedString = strValue;
                    } else if (s.Q(strName, "ETag", true)) {
                        this.etag = strValue;
                    } else if (s.Q(strName, "Age", true)) {
                        this.ageSeconds = Util.toNonNegativeInt(strValue, -1);
                    }
                    i = i3;
                }
            }
        }

        private final long cacheResponseAge() {
            Date date = this.servedDate;
            long jMax = date != null ? Math.max(0L, this.receivedResponseMillis - date.getTime()) : 0L;
            int i = this.ageSeconds;
            if (i != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
            }
            long j4 = this.receivedResponseMillis;
            return jMax + (j4 - this.sentRequestMillis) + (this.nowMillis - j4);
        }

        private final CacheStrategy computeCandidate() {
            String str;
            if (this.cacheResponse == null) {
                return new CacheStrategy(this.request, null);
            }
            if ((!this.request.isHttps() || this.cacheResponse.handshake() != null) && CacheStrategy.Companion.isCacheable(this.cacheResponse, this.request)) {
                CacheControl cacheControl = this.request.cacheControl();
                if (cacheControl.noCache() || hasConditions(this.request)) {
                    return new CacheStrategy(this.request, null);
                }
                CacheControl cacheControl2 = this.cacheResponse.cacheControl();
                long jCacheResponseAge = cacheResponseAge();
                long jComputeFreshnessLifetime = computeFreshnessLifetime();
                if (cacheControl.maxAgeSeconds() != -1) {
                    jComputeFreshnessLifetime = Math.min(jComputeFreshnessLifetime, TimeUnit.SECONDS.toMillis(cacheControl.maxAgeSeconds()));
                }
                long millis = 0;
                long millis2 = cacheControl.minFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis(cacheControl.minFreshSeconds()) : 0L;
                if (!cacheControl2.mustRevalidate() && cacheControl.maxStaleSeconds() != -1) {
                    millis = TimeUnit.SECONDS.toMillis(cacheControl.maxStaleSeconds());
                }
                if (!cacheControl2.noCache()) {
                    long j4 = millis2 + jCacheResponseAge;
                    if (j4 < millis + jComputeFreshnessLifetime) {
                        Response.Builder builderNewBuilder = this.cacheResponse.newBuilder();
                        if (j4 >= jComputeFreshnessLifetime) {
                            builderNewBuilder.addHeader("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (jCacheResponseAge > 86400000 && isFreshnessLifetimeHeuristic()) {
                            builderNewBuilder.addHeader("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new CacheStrategy(null, builderNewBuilder.build());
                    }
                }
                String str2 = this.etag;
                if (str2 != null) {
                    str = "If-None-Match";
                } else {
                    if (this.lastModified != null) {
                        str2 = this.lastModifiedString;
                    } else {
                        if (this.servedDate == null) {
                            return new CacheStrategy(this.request, null);
                        }
                        str2 = this.servedDateString;
                    }
                    str = "If-Modified-Since";
                }
                Headers.Builder builderNewBuilder2 = this.request.headers().newBuilder();
                k.c(str2);
                builderNewBuilder2.addLenient$okhttp(str, str2);
                return new CacheStrategy(this.request.newBuilder().headers(builderNewBuilder2.build()).build(), this.cacheResponse);
            }
            return new CacheStrategy(this.request, null);
        }

        private final long computeFreshnessLifetime() {
            Long lValueOf;
            Response response = this.cacheResponse;
            k.c(response);
            CacheControl cacheControl = response.cacheControl();
            if (cacheControl.maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(cacheControl.maxAgeSeconds());
            }
            Date date = this.expires;
            if (date != null) {
                Date date2 = this.servedDate;
                lValueOf = date2 != null ? Long.valueOf(date2.getTime()) : null;
                long time = date.getTime() - (lValueOf == null ? this.receivedResponseMillis : lValueOf.longValue());
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.lastModified != null && this.cacheResponse.request().url().query() == null) {
                Date date3 = this.servedDate;
                lValueOf = date3 != null ? Long.valueOf(date3.getTime()) : null;
                long jLongValue = lValueOf == null ? this.sentRequestMillis : lValueOf.longValue();
                Date date4 = this.lastModified;
                k.c(date4);
                long time2 = jLongValue - date4.getTime();
                if (time2 > 0) {
                    return time2 / ((long) 10);
                }
            }
            return 0L;
        }

        private final boolean hasConditions(Request request) {
            return (request.header("If-Modified-Since") == null && request.header("If-None-Match") == null) ? false : true;
        }

        private final boolean isFreshnessLifetimeHeuristic() {
            Response response = this.cacheResponse;
            k.c(response);
            return response.cacheControl().maxAgeSeconds() == -1 && this.expires == null;
        }

        public final CacheStrategy compute() {
            CacheStrategy cacheStrategyComputeCandidate = computeCandidate();
            return (cacheStrategyComputeCandidate.getNetworkRequest() == null || !this.request.cacheControl().onlyIfCached()) ? cacheStrategyComputeCandidate : new CacheStrategy(null, null);
        }

        public final Request getRequest$okhttp() {
            return this.request;
        }
    }

    public CacheStrategy(Request request, Response response) {
        this.networkRequest = request;
        this.cacheResponse = response;
    }

    public final Response getCacheResponse() {
        return this.cacheResponse;
    }

    public final Request getNetworkRequest() {
        return this.networkRequest;
    }
}
