package okhttp3;

import E4.g;
import E4.k;
import F4.a;
import M4.l;
import S1.h0;
import Z2.f;
import com.spotify.sdk.android.auth.LoginActivity;
import h5.AbstractC0724b;
import h5.C0731i;
import h5.C0732j;
import h5.C0735m;
import h5.F;
import h5.G;
import h5.InterfaceC0733k;
import h5.InterfaceC0734l;
import h5.K;
import h5.M;
import h5.s;
import h5.t;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import org.slf4j.Marker;
import p084p4.c;
import p089q4.u;
import p089q4.w;

/* JADX INFO: loaded from: classes.dex */
public final class Cache implements Closeable, Flushable, AutoCloseable {
    public static final Companion Companion = new Companion(null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    public static final class CacheResponseBody extends ResponseBody {
        private final InterfaceC0734l bodySource;
        private final String contentLength;
        private final String contentType;
        private final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            k.f("snapshot", snapshot);
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = AbstractC0724b.c(new t(this) { // from class: okhttp3.Cache.CacheResponseBody.1
                final /* synthetic */ CacheResponseBody this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(this.$source);
                    this.this$0 = this;
                }

                @Override // h5.t, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    this.this$0.getSnapshot().close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            String str = this.contentLength;
            if (str == null) {
                return -1L;
            }
            return Util.toLongOrDefault(str, -1L);
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            String str = this.contentType;
            if (str == null) {
                return null;
            }
            return MediaType.Companion.parse(str);
        }

        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override // okhttp3.ResponseBody
        public InterfaceC0734l source() {
            return this.bodySource;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private final Set<String> varyFields(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            int i = 0;
            while (i < size) {
                int i3 = i + 1;
                if ("Vary".equalsIgnoreCase(headers.name(i))) {
                    String strValue = headers.value(i);
                    if (treeSet == null) {
                        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                        k.e("CASE_INSENSITIVE_ORDER", comparator);
                        treeSet = new TreeSet(comparator);
                    }
                    Iterator it = l.u0(strValue, new char[]{','}).iterator();
                    while (it.hasNext()) {
                        treeSet.add(l.B0((String) it.next()).toString());
                    }
                }
                i = i3;
            }
            return treeSet == null ? w.f11239h : treeSet;
        }

        public final boolean hasVaryAll(Response response) {
            k.f("<this>", response);
            return varyFields(response.headers()).contains(Marker.ANY_MARKER);
        }

        public final String key(HttpUrl httpUrl) {
            k.f("url", httpUrl);
            C0735m c0735m = C0735m.f9352k;
            return f.i(httpUrl.toString()).c("MD5").e();
        }

        public final int readInt$okhttp(InterfaceC0734l interfaceC0734l) throws IOException {
            k.f("source", interfaceC0734l);
            try {
                long jF = interfaceC0734l.F();
                String strW = interfaceC0734l.w();
                if (jF >= 0 && jF <= 2147483647L && strW.length() <= 0) {
                    return (int) jF;
                }
                throw new IOException("expected an int but was \"" + jF + strW + '\"');
            } catch (NumberFormatException e6) {
                throw new IOException(e6.getMessage());
            }
        }

        public final Headers varyHeaders(Response response) {
            k.f("<this>", response);
            Response responseNetworkResponse = response.networkResponse();
            k.c(responseNetworkResponse);
            return varyHeaders(responseNetworkResponse.request().headers(), response.headers());
        }

        public final boolean varyMatches(Response response, Headers headers, Request request) {
            k.f("cachedResponse", response);
            k.f("cachedRequest", headers);
            k.f("newRequest", request);
            Set<String> setVaryFields = varyFields(response.headers());
            if ((setVaryFields instanceof Collection) && setVaryFields.isEmpty()) {
                return true;
            }
            for (String str : setVaryFields) {
                if (!k.a(headers.values(str), request.headers(str))) {
                    return false;
                }
            }
            return true;
        }

        private Companion() {
        }

        private final Headers varyHeaders(Headers headers, Headers headers2) {
            Set<String> setVaryFields = varyFields(headers2);
            if (setVaryFields.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            int i = 0;
            while (i < size) {
                int i3 = i + 1;
                String strName = headers.name(i);
                if (setVaryFields.contains(strName)) {
                    builder.add(strName, headers.value(i));
                }
                i = i3;
            }
            return builder.build();
        }
    }

    public final class RealCacheRequest implements CacheRequest {
        private final K body;
        private final K cacheOut;
        private boolean done;
        private final DiskLruCache.Editor editor;
        final /* synthetic */ Cache this$0;

        public RealCacheRequest(final Cache cache, DiskLruCache.Editor editor) {
            k.f("this$0", cache);
            k.f("editor", editor);
            this.this$0 = cache;
            this.editor = editor;
            K kNewSink = editor.newSink(1);
            this.cacheOut = kNewSink;
            this.body = new s(kNewSink) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // h5.s, h5.K, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
                public void close() {
                    Cache cache2 = cache;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache2) {
                        if (realCacheRequest.getDone()) {
                            return;
                        }
                        realCacheRequest.setDone(true);
                        cache2.setWriteSuccessCount$okhttp(cache2.getWriteSuccessCount$okhttp() + 1);
                        super.close();
                        this.editor.commit();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
            Cache cache = this.this$0;
            synchronized (cache) {
                if (getDone()) {
                    return;
                }
                setDone(true);
                cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount$okhttp() + 1);
                Util.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public K body() {
            return this.body;
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z5) {
            this.done = z5;
        }
    }

    /* JADX INFO: renamed from: okhttp3.Cache$urls$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<String>, a {
        private boolean canRemove;
        private final Iterator<DiskLruCache.Snapshot> delegate;
        private String nextUrl;

        public AnonymousClass1() {
            this.delegate = Cache.this.getCache$okhttp().snapshots();
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IllegalAccessException, InvocationTargetException {
            if (this.nextUrl != null) {
                return true;
            }
            this.canRemove = false;
            while (this.delegate.hasNext()) {
                try {
                    DiskLruCache.Snapshot next = this.delegate.next();
                    try {
                        continue;
                        this.nextUrl = AbstractC0724b.c(next.getSource(0)).H(Long.MAX_VALUE);
                        h0.i(next, null);
                        return true;
                    } catch (Throwable th) {
                        try {
                            continue;
                            throw th;
                        } catch (Throwable th2) {
                            h0.i(next, th);
                            throw th2;
                        }
                    }
                } catch (IOException unused) {
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.canRemove) {
                throw new IllegalStateException("remove() before next()");
            }
            this.delegate.remove();
        }

        @Override // java.util.Iterator
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.nextUrl;
            k.c(str);
            this.nextUrl = null;
            this.canRemove = true;
            return str;
        }
    }

    public Cache(File file, long j4, FileSystem fileSystem) {
        k.f("directory", file);
        k.f("fileSystem", fileSystem);
        this.cache = new DiskLruCache(fileSystem, file, VERSION, 2, j4, TaskRunner.INSTANCE);
    }

    private final void abortQuietly(DiskLruCache.Editor editor) {
        if (editor == null) {
            return;
        }
        try {
            editor.abort();
        } catch (IOException unused) {
        }
    }

    public static final String key(HttpUrl httpUrl) {
        return Companion.key(httpUrl);
    }

    @c
    /* JADX INFO: renamed from: -deprecated_directory, reason: not valid java name */
    public final File m22deprecated_directory() {
        return this.cache.getDirectory();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.cache.close();
    }

    public final void delete() {
        this.cache.delete();
    }

    public final File directory() {
        return this.cache.getDirectory();
    }

    public final void evictAll() {
        this.cache.evictAll();
    }

    @Override // java.io.Flushable
    public void flush() {
        this.cache.flush();
    }

    public final Response get$okhttp(Request request) {
        k.f(LoginActivity.REQUEST_KEY, request);
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(Companion.key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (entry.matches(request, response)) {
                    return response;
                }
                ResponseBody responseBodyBody = response.body();
                if (responseBodyBody != null) {
                    Util.closeQuietly(responseBodyBody);
                }
                return null;
            } catch (IOException unused) {
                Util.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public final DiskLruCache getCache$okhttp() {
        return this.cache;
    }

    public final int getWriteAbortCount$okhttp() {
        return this.writeAbortCount;
    }

    public final int getWriteSuccessCount$okhttp() {
        return this.writeSuccessCount;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final void initialize() {
        this.cache.initialize();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    public final synchronized int networkCount() {
        return this.networkCount;
    }

    public final CacheRequest put$okhttp(Response response) throws Throwable {
        DiskLruCache.Editor editorEdit$default;
        k.f(LoginActivity.RESPONSE_KEY, response);
        String strMethod = response.request().method();
        if (HttpMethod.INSTANCE.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!k.a(strMethod, "GET")) {
            return null;
        }
        Companion companion = Companion;
        if (companion.hasVaryAll(response)) {
            return null;
        }
        Entry entry = new Entry(response);
        try {
            editorEdit$default = DiskLruCache.edit$default(this.cache, companion.key(response.request().url()), 0L, 2, null);
            if (editorEdit$default == null) {
                return null;
            }
            try {
                entry.writeTo(editorEdit$default);
                return new RealCacheRequest(this, editorEdit$default);
            } catch (IOException unused2) {
                abortQuietly(editorEdit$default);
                return null;
            }
        } catch (IOException unused3) {
            editorEdit$default = null;
        }
    }

    public final void remove$okhttp(Request request) {
        k.f(LoginActivity.REQUEST_KEY, request);
        this.cache.remove(Companion.key(request.url()));
    }

    public final synchronized int requestCount() {
        return this.requestCount;
    }

    public final void setWriteAbortCount$okhttp(int i) {
        this.writeAbortCount = i;
    }

    public final void setWriteSuccessCount$okhttp(int i) {
        this.writeSuccessCount = i;
    }

    public final long size() {
        return this.cache.size();
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.hitCount++;
    }

    public final synchronized void trackResponse$okhttp(CacheStrategy cacheStrategy) {
        try {
            k.f("cacheStrategy", cacheStrategy);
            this.requestCount++;
            if (cacheStrategy.getNetworkRequest() != null) {
                this.networkCount++;
            } else if (cacheStrategy.getCacheResponse() != null) {
                this.hitCount++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void update$okhttp(Response response, Response response2) throws Throwable {
        DiskLruCache.Editor editorEdit;
        k.f("cached", response);
        k.f("network", response2);
        Entry entry = new Entry(response2);
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody == null) {
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        }
        try {
            editorEdit = ((CacheResponseBody) responseBodyBody).getSnapshot().edit();
            if (editorEdit == null) {
                return;
            }
            try {
                entry.writeTo(editorEdit);
                editorEdit.commit();
            } catch (IOException unused) {
                abortQuietly(editorEdit);
            }
        } catch (IOException unused2) {
            editorEdit = null;
        }
    }

    public final Iterator<String> urls() {
        return new AnonymousClass1();
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cache(File file, long j4) {
        this(file, j4, FileSystem.SYSTEM);
        k.f("directory", file);
    }

    public static final class Entry {
        public static final Companion Companion = new Companion(null);
        private static final String RECEIVED_MILLIS;
        private static final String SENT_MILLIS;
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final HttpUrl url;
        private final Headers varyHeaders;

        public static final class Companion {
            public /* synthetic */ Companion(g gVar) {
                this();
            }

            private Companion() {
            }
        }

        static {
            Platform.Companion companion = Platform.Companion;
            SENT_MILLIS = k.l(companion.get().getPrefix(), "-Sent-Millis");
            RECEIVED_MILLIS = k.l(companion.get().getPrefix(), "-Received-Millis");
        }

        public Entry(M m6) throws IllegalAccessException, IOException, InvocationTargetException {
            k.f("rawSource", m6);
            try {
                G gC = AbstractC0724b.c(m6);
                String strH = gC.H(Long.MAX_VALUE);
                HttpUrl httpUrl = HttpUrl.Companion.parse(strH);
                if (httpUrl == null) {
                    IOException iOException = new IOException(k.l("Cache corruption for ", strH));
                    Platform.Companion.get().log("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.url = httpUrl;
                this.requestMethod = gC.H(Long.MAX_VALUE);
                Headers.Builder builder = new Headers.Builder();
                int int$okhttp = Cache.Companion.readInt$okhttp(gC);
                int i = 0;
                int i3 = 0;
                while (i3 < int$okhttp) {
                    i3++;
                    builder.addLenient$okhttp(gC.H(Long.MAX_VALUE));
                }
                this.varyHeaders = builder.build();
                StatusLine statusLine = StatusLine.Companion.parse(gC.H(Long.MAX_VALUE));
                this.protocol = statusLine.protocol;
                this.code = statusLine.code;
                this.message = statusLine.message;
                Headers.Builder builder2 = new Headers.Builder();
                int int$okhttp2 = Cache.Companion.readInt$okhttp(gC);
                while (i < int$okhttp2) {
                    i++;
                    builder2.addLenient$okhttp(gC.H(Long.MAX_VALUE));
                }
                String str = SENT_MILLIS;
                String str2 = builder2.get(str);
                String str3 = RECEIVED_MILLIS;
                String str4 = builder2.get(str3);
                builder2.removeAll(str);
                builder2.removeAll(str3);
                long j4 = 0;
                this.sentRequestMillis = str2 == null ? 0L : Long.parseLong(str2);
                if (str4 != null) {
                    j4 = Long.parseLong(str4);
                }
                this.receivedResponseMillis = j4;
                this.responseHeaders = builder2.build();
                if (isHttps()) {
                    String strH2 = gC.H(Long.MAX_VALUE);
                    if (strH2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strH2 + '\"');
                    }
                    this.handshake = Handshake.Companion.get(!gC.z() ? TlsVersion.Companion.forJavaName(gC.H(Long.MAX_VALUE)) : TlsVersion.SSL_3_0, CipherSuite.Companion.forJavaName(gC.H(Long.MAX_VALUE)), readCertificateList(gC), readCertificateList(gC));
                } else {
                    this.handshake = null;
                }
                m6.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    h0.i(m6, th);
                    throw th2;
                }
            }
        }

        private final boolean isHttps() {
            return k.a(this.url.scheme(), "https");
        }

        private final List<Certificate> readCertificateList(InterfaceC0734l interfaceC0734l) throws IOException {
            int int$okhttp = Cache.Companion.readInt$okhttp(interfaceC0734l);
            if (int$okhttp == -1) {
                return u.f11237h;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(int$okhttp);
                int i = 0;
                while (i < int$okhttp) {
                    i++;
                    String strW = interfaceC0734l.w();
                    C0732j c0732j = new C0732j();
                    C0735m c0735m = C0735m.f9352k;
                    C0735m c0735mG = f.g(strW);
                    k.c(c0735mG);
                    c0732j.V(c0735mG);
                    arrayList.add(certificateFactory.generateCertificate(new C0731i(c0732j, 0)));
                }
                return arrayList;
            } catch (CertificateException e6) {
                throw new IOException(e6.getMessage());
            }
        }

        private final void writeCertList(InterfaceC0733k interfaceC0733k, List<? extends Certificate> list) throws IOException {
            try {
                interfaceC0733k.P(list.size()).A(10);
                Iterator<? extends Certificate> it = list.iterator();
                while (it.hasNext()) {
                    byte[] encoded = it.next().getEncoded();
                    C0735m c0735m = C0735m.f9352k;
                    k.e("bytes", encoded);
                    interfaceC0733k.O(f.o(encoded).a()).A(10);
                }
            } catch (CertificateEncodingException e6) {
                throw new IOException(e6.getMessage());
            }
        }

        public final boolean matches(Request request, Response response) {
            k.f(LoginActivity.REQUEST_KEY, request);
            k.f(LoginActivity.RESPONSE_KEY, response);
            return k.a(this.url, request.url()) && k.a(this.requestMethod, request.method()) && Cache.Companion.varyMatches(response, this.varyHeaders, request);
        }

        public final Response response(DiskLruCache.Snapshot snapshot) {
            k.f("snapshot", snapshot);
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        public final void writeTo(DiskLruCache.Editor editor) throws Throwable {
            k.f("editor", editor);
            F fB = AbstractC0724b.b(editor.newSink(0));
            try {
                fB.O(this.url.toString());
                fB.A(10);
                fB.O(this.requestMethod);
                fB.A(10);
                fB.P(this.varyHeaders.size());
                fB.A(10);
                int size = this.varyHeaders.size();
                int i = 0;
                while (i < size) {
                    int i3 = i + 1;
                    fB.O(this.varyHeaders.name(i));
                    fB.O(": ");
                    fB.O(this.varyHeaders.value(i));
                    fB.A(10);
                    i = i3;
                }
                fB.O(new StatusLine(this.protocol, this.code, this.message).toString());
                fB.A(10);
                fB.P(this.responseHeaders.size() + 2);
                fB.A(10);
                int size2 = this.responseHeaders.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    fB.O(this.responseHeaders.name(i6));
                    fB.O(": ");
                    fB.O(this.responseHeaders.value(i6));
                    fB.A(10);
                }
                fB.O(SENT_MILLIS);
                fB.O(": ");
                fB.P(this.sentRequestMillis);
                fB.A(10);
                fB.O(RECEIVED_MILLIS);
                fB.O(": ");
                fB.P(this.receivedResponseMillis);
                fB.A(10);
                if (isHttps()) {
                    fB.A(10);
                    Handshake handshake = this.handshake;
                    k.c(handshake);
                    fB.O(handshake.cipherSuite().javaName());
                    fB.A(10);
                    writeCertList(fB, this.handshake.peerCertificates());
                    writeCertList(fB, this.handshake.localCertificates());
                    fB.O(this.handshake.tlsVersion().javaName());
                    fB.A(10);
                }
                fB.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    h0.i(fB, th);
                    throw th2;
                }
            }
        }

        public Entry(Response response) {
            k.f(LoginActivity.RESPONSE_KEY, response);
            this.url = response.request().url();
            this.varyHeaders = Cache.Companion.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }
    }
}
