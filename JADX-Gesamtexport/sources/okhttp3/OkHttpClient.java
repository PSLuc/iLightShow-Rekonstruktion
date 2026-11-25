package okhttp3;

import D4.c;
import E4.g;
import E4.k;
import com.spotify.sdk.android.auth.LoginActivity;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p089q4.l;
import p089q4.r;

/* JADX INFO: loaded from: classes.dex */
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {
    private final Authenticator authenticator;
    private final Cache cache;
    private final int callTimeoutMillis;
    private final CertificateChainCleaner certificateChainCleaner;
    private final CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;
    private final ConnectionPool connectionPool;
    private final List<ConnectionSpec> connectionSpecs;
    private final CookieJar cookieJar;
    private final Dispatcher dispatcher;
    private final Dns dns;
    private final EventListener.Factory eventListenerFactory;
    private final boolean followRedirects;
    private final boolean followSslRedirects;
    private final HostnameVerifier hostnameVerifier;
    private final List<Interceptor> interceptors;
    private final long minWebSocketMessageToCompress;
    private final List<Interceptor> networkInterceptors;
    private final int pingIntervalMillis;
    private final List<Protocol> protocols;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    private final RouteDatabase routeDatabase;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactoryOrNull;
    private final int writeTimeoutMillis;
    private final X509TrustManager x509TrustManager;
    public static final Companion Companion = new Companion(null);
    private static final List<Protocol> DEFAULT_PROTOCOLS = Util.immutableListOf(Protocol.HTTP_2, Protocol.HTTP_1_1);
    private static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS = Util.immutableListOf(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT);

    public static final class Builder {
        private Authenticator authenticator;
        private Cache cache;
        private int callTimeout;
        private CertificateChainCleaner certificateChainCleaner;
        private CertificatePinner certificatePinner;
        private int connectTimeout;
        private ConnectionPool connectionPool;
        private List<ConnectionSpec> connectionSpecs;
        private CookieJar cookieJar;
        private Dispatcher dispatcher;
        private Dns dns;
        private EventListener.Factory eventListenerFactory;
        private boolean followRedirects;
        private boolean followSslRedirects;
        private HostnameVerifier hostnameVerifier;
        private final List<Interceptor> interceptors;
        private long minWebSocketMessageToCompress;
        private final List<Interceptor> networkInterceptors;
        private int pingInterval;
        private List<? extends Protocol> protocols;
        private Proxy proxy;
        private Authenticator proxyAuthenticator;
        private ProxySelector proxySelector;
        private int readTimeout;
        private boolean retryOnConnectionFailure;
        private RouteDatabase routeDatabase;
        private SocketFactory socketFactory;
        private SSLSocketFactory sslSocketFactoryOrNull;
        private int writeTimeout;
        private X509TrustManager x509TrustManagerOrNull;

        public Builder() {
            this.dispatcher = new Dispatcher();
            this.connectionPool = new ConnectionPool();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = Util.asFactory(EventListener.NONE);
            this.retryOnConnectionFailure = true;
            Authenticator authenticator = Authenticator.NONE;
            this.authenticator = authenticator;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = CookieJar.NO_COOKIES;
            this.dns = Dns.SYSTEM;
            this.proxyAuthenticator = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            k.e("getDefault()", socketFactory);
            this.socketFactory = socketFactory;
            Companion companion = OkHttpClient.Companion;
            this.connectionSpecs = companion.getDEFAULT_CONNECTION_SPECS$okhttp();
            this.protocols = companion.getDEFAULT_PROTOCOLS$okhttp();
            this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
            this.certificatePinner = CertificatePinner.DEFAULT;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.minWebSocketMessageToCompress = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        }

        /* JADX INFO: renamed from: -addInterceptor, reason: not valid java name */
        public final Builder m121addInterceptor(final c cVar) {
            k.f("block", cVar);
            return addInterceptor(new Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addInterceptor$2
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    k.f("chain", chain);
                    return (Response) cVar.invoke(chain);
                }
            });
        }

        /* JADX INFO: renamed from: -addNetworkInterceptor, reason: not valid java name */
        public final Builder m122addNetworkInterceptor(final c cVar) {
            k.f("block", cVar);
            return addNetworkInterceptor(new Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addNetworkInterceptor$2
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    k.f("chain", chain);
                    return (Response) cVar.invoke(chain);
                }
            });
        }

        public final Builder addInterceptor(Interceptor interceptor) {
            k.f("interceptor", interceptor);
            getInterceptors$okhttp().add(interceptor);
            return this;
        }

        public final Builder addNetworkInterceptor(Interceptor interceptor) {
            k.f("interceptor", interceptor);
            getNetworkInterceptors$okhttp().add(interceptor);
            return this;
        }

        public final Builder authenticator(Authenticator authenticator) {
            k.f("authenticator", authenticator);
            setAuthenticator$okhttp(authenticator);
            return this;
        }

        public final OkHttpClient build() {
            return new OkHttpClient(this);
        }

        public final Builder cache(Cache cache) {
            setCache$okhttp(cache);
            return this;
        }

        public final Builder callTimeout(long j4, TimeUnit timeUnit) {
            k.f("unit", timeUnit);
            setCallTimeout$okhttp(Util.checkDuration("timeout", j4, timeUnit));
            return this;
        }

        public final Builder certificatePinner(CertificatePinner certificatePinner) {
            k.f("certificatePinner", certificatePinner);
            if (!certificatePinner.equals(getCertificatePinner$okhttp())) {
                setRouteDatabase$okhttp(null);
            }
            setCertificatePinner$okhttp(certificatePinner);
            return this;
        }

        public final Builder connectTimeout(long j4, TimeUnit timeUnit) {
            k.f("unit", timeUnit);
            setConnectTimeout$okhttp(Util.checkDuration("timeout", j4, timeUnit));
            return this;
        }

        public final Builder connectionPool(ConnectionPool connectionPool) {
            k.f("connectionPool", connectionPool);
            setConnectionPool$okhttp(connectionPool);
            return this;
        }

        public final Builder connectionSpecs(List<ConnectionSpec> list) {
            k.f("connectionSpecs", list);
            if (!list.equals(getConnectionSpecs$okhttp())) {
                setRouteDatabase$okhttp(null);
            }
            setConnectionSpecs$okhttp(Util.toImmutableList(list));
            return this;
        }

        public final Builder cookieJar(CookieJar cookieJar) {
            k.f("cookieJar", cookieJar);
            setCookieJar$okhttp(cookieJar);
            return this;
        }

        public final Builder dispatcher(Dispatcher dispatcher) {
            k.f("dispatcher", dispatcher);
            setDispatcher$okhttp(dispatcher);
            return this;
        }

        public final Builder dns(Dns dns) {
            k.f("dns", dns);
            if (!dns.equals(getDns$okhttp())) {
                setRouteDatabase$okhttp(null);
            }
            setDns$okhttp(dns);
            return this;
        }

        public final Builder eventListener(EventListener eventListener) {
            k.f("eventListener", eventListener);
            setEventListenerFactory$okhttp(Util.asFactory(eventListener));
            return this;
        }

        public final Builder eventListenerFactory(EventListener.Factory factory) {
            k.f("eventListenerFactory", factory);
            setEventListenerFactory$okhttp(factory);
            return this;
        }

        public final Builder followRedirects(boolean z5) {
            setFollowRedirects$okhttp(z5);
            return this;
        }

        public final Builder followSslRedirects(boolean z5) {
            setFollowSslRedirects$okhttp(z5);
            return this;
        }

        public final Authenticator getAuthenticator$okhttp() {
            return this.authenticator;
        }

        public final Cache getCache$okhttp() {
            return this.cache;
        }

        public final int getCallTimeout$okhttp() {
            return this.callTimeout;
        }

        public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
            return this.certificateChainCleaner;
        }

        public final CertificatePinner getCertificatePinner$okhttp() {
            return this.certificatePinner;
        }

        public final int getConnectTimeout$okhttp() {
            return this.connectTimeout;
        }

        public final ConnectionPool getConnectionPool$okhttp() {
            return this.connectionPool;
        }

        public final List<ConnectionSpec> getConnectionSpecs$okhttp() {
            return this.connectionSpecs;
        }

        public final CookieJar getCookieJar$okhttp() {
            return this.cookieJar;
        }

        public final Dispatcher getDispatcher$okhttp() {
            return this.dispatcher;
        }

        public final Dns getDns$okhttp() {
            return this.dns;
        }

        public final EventListener.Factory getEventListenerFactory$okhttp() {
            return this.eventListenerFactory;
        }

        public final boolean getFollowRedirects$okhttp() {
            return this.followRedirects;
        }

        public final boolean getFollowSslRedirects$okhttp() {
            return this.followSslRedirects;
        }

        public final HostnameVerifier getHostnameVerifier$okhttp() {
            return this.hostnameVerifier;
        }

        public final List<Interceptor> getInterceptors$okhttp() {
            return this.interceptors;
        }

        public final long getMinWebSocketMessageToCompress$okhttp() {
            return this.minWebSocketMessageToCompress;
        }

        public final List<Interceptor> getNetworkInterceptors$okhttp() {
            return this.networkInterceptors;
        }

        public final int getPingInterval$okhttp() {
            return this.pingInterval;
        }

        public final List<Protocol> getProtocols$okhttp() {
            return this.protocols;
        }

        public final Proxy getProxy$okhttp() {
            return this.proxy;
        }

        public final Authenticator getProxyAuthenticator$okhttp() {
            return this.proxyAuthenticator;
        }

        public final ProxySelector getProxySelector$okhttp() {
            return this.proxySelector;
        }

        public final int getReadTimeout$okhttp() {
            return this.readTimeout;
        }

        public final boolean getRetryOnConnectionFailure$okhttp() {
            return this.retryOnConnectionFailure;
        }

        public final RouteDatabase getRouteDatabase$okhttp() {
            return this.routeDatabase;
        }

        public final SocketFactory getSocketFactory$okhttp() {
            return this.socketFactory;
        }

        public final SSLSocketFactory getSslSocketFactoryOrNull$okhttp() {
            return this.sslSocketFactoryOrNull;
        }

        public final int getWriteTimeout$okhttp() {
            return this.writeTimeout;
        }

        public final X509TrustManager getX509TrustManagerOrNull$okhttp() {
            return this.x509TrustManagerOrNull;
        }

        public final Builder hostnameVerifier(HostnameVerifier hostnameVerifier) {
            k.f("hostnameVerifier", hostnameVerifier);
            if (!hostnameVerifier.equals(getHostnameVerifier$okhttp())) {
                setRouteDatabase$okhttp(null);
            }
            setHostnameVerifier$okhttp(hostnameVerifier);
            return this;
        }

        public final List<Interceptor> interceptors() {
            return this.interceptors;
        }

        public final Builder minWebSocketMessageToCompress(long j4) {
            if (j4 < 0) {
                throw new IllegalArgumentException(k.l("minWebSocketMessageToCompress must be positive: ", Long.valueOf(j4)).toString());
            }
            setMinWebSocketMessageToCompress$okhttp(j4);
            return this;
        }

        public final List<Interceptor> networkInterceptors() {
            return this.networkInterceptors;
        }

        public final Builder pingInterval(long j4, TimeUnit timeUnit) {
            k.f("unit", timeUnit);
            setPingInterval$okhttp(Util.checkDuration("interval", j4, timeUnit));
            return this;
        }

        public final Builder protocols(List<? extends Protocol> list) {
            k.f("protocols", list);
            ArrayList arrayListU0 = l.u0(list);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!arrayListU0.contains(protocol) && !arrayListU0.contains(Protocol.HTTP_1_1)) {
                throw new IllegalArgumentException(k.l("protocols must contain h2_prior_knowledge or http/1.1: ", arrayListU0).toString());
            }
            if (arrayListU0.contains(protocol) && arrayListU0.size() > 1) {
                throw new IllegalArgumentException(k.l("protocols containing h2_prior_knowledge cannot use other protocols: ", arrayListU0).toString());
            }
            if (arrayListU0.contains(Protocol.HTTP_1_0)) {
                throw new IllegalArgumentException(k.l("protocols must not contain http/1.0: ", arrayListU0).toString());
            }
            if (arrayListU0.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            arrayListU0.remove(Protocol.SPDY_3);
            if (!arrayListU0.equals(getProtocols$okhttp())) {
                setRouteDatabase$okhttp(null);
            }
            List<? extends Protocol> listUnmodifiableList = Collections.unmodifiableList(arrayListU0);
            k.e("unmodifiableList(protocolsCopy)", listUnmodifiableList);
            setProtocols$okhttp(listUnmodifiableList);
            return this;
        }

        public final Builder proxy(Proxy proxy) {
            if (!k.a(proxy, getProxy$okhttp())) {
                setRouteDatabase$okhttp(null);
            }
            setProxy$okhttp(proxy);
            return this;
        }

        public final Builder proxyAuthenticator(Authenticator authenticator) {
            k.f("proxyAuthenticator", authenticator);
            if (!authenticator.equals(getProxyAuthenticator$okhttp())) {
                setRouteDatabase$okhttp(null);
            }
            setProxyAuthenticator$okhttp(authenticator);
            return this;
        }

        public final Builder proxySelector(ProxySelector proxySelector) {
            k.f("proxySelector", proxySelector);
            if (!proxySelector.equals(getProxySelector$okhttp())) {
                setRouteDatabase$okhttp(null);
            }
            setProxySelector$okhttp(proxySelector);
            return this;
        }

        public final Builder readTimeout(long j4, TimeUnit timeUnit) {
            k.f("unit", timeUnit);
            setReadTimeout$okhttp(Util.checkDuration("timeout", j4, timeUnit));
            return this;
        }

        public final Builder retryOnConnectionFailure(boolean z5) {
            setRetryOnConnectionFailure$okhttp(z5);
            return this;
        }

        public final void setAuthenticator$okhttp(Authenticator authenticator) {
            k.f("<set-?>", authenticator);
            this.authenticator = authenticator;
        }

        public final void setCache$okhttp(Cache cache) {
            this.cache = cache;
        }

        public final void setCallTimeout$okhttp(int i) {
            this.callTimeout = i;
        }

        public final void setCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
            this.certificateChainCleaner = certificateChainCleaner;
        }

        public final void setCertificatePinner$okhttp(CertificatePinner certificatePinner) {
            k.f("<set-?>", certificatePinner);
            this.certificatePinner = certificatePinner;
        }

        public final void setConnectTimeout$okhttp(int i) {
            this.connectTimeout = i;
        }

        public final void setConnectionPool$okhttp(ConnectionPool connectionPool) {
            k.f("<set-?>", connectionPool);
            this.connectionPool = connectionPool;
        }

        public final void setConnectionSpecs$okhttp(List<ConnectionSpec> list) {
            k.f("<set-?>", list);
            this.connectionSpecs = list;
        }

        public final void setCookieJar$okhttp(CookieJar cookieJar) {
            k.f("<set-?>", cookieJar);
            this.cookieJar = cookieJar;
        }

        public final void setDispatcher$okhttp(Dispatcher dispatcher) {
            k.f("<set-?>", dispatcher);
            this.dispatcher = dispatcher;
        }

        public final void setDns$okhttp(Dns dns) {
            k.f("<set-?>", dns);
            this.dns = dns;
        }

        public final void setEventListenerFactory$okhttp(EventListener.Factory factory) {
            k.f("<set-?>", factory);
            this.eventListenerFactory = factory;
        }

        public final void setFollowRedirects$okhttp(boolean z5) {
            this.followRedirects = z5;
        }

        public final void setFollowSslRedirects$okhttp(boolean z5) {
            this.followSslRedirects = z5;
        }

        public final void setHostnameVerifier$okhttp(HostnameVerifier hostnameVerifier) {
            k.f("<set-?>", hostnameVerifier);
            this.hostnameVerifier = hostnameVerifier;
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long j4) {
            this.minWebSocketMessageToCompress = j4;
        }

        public final void setPingInterval$okhttp(int i) {
            this.pingInterval = i;
        }

        public final void setProtocols$okhttp(List<? extends Protocol> list) {
            k.f("<set-?>", list);
            this.protocols = list;
        }

        public final void setProxy$okhttp(Proxy proxy) {
            this.proxy = proxy;
        }

        public final void setProxyAuthenticator$okhttp(Authenticator authenticator) {
            k.f("<set-?>", authenticator);
            this.proxyAuthenticator = authenticator;
        }

        public final void setProxySelector$okhttp(ProxySelector proxySelector) {
            this.proxySelector = proxySelector;
        }

        public final void setReadTimeout$okhttp(int i) {
            this.readTimeout = i;
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean z5) {
            this.retryOnConnectionFailure = z5;
        }

        public final void setRouteDatabase$okhttp(RouteDatabase routeDatabase) {
            this.routeDatabase = routeDatabase;
        }

        public final void setSocketFactory$okhttp(SocketFactory socketFactory) {
            k.f("<set-?>", socketFactory);
            this.socketFactory = socketFactory;
        }

        public final void setSslSocketFactoryOrNull$okhttp(SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactoryOrNull = sSLSocketFactory;
        }

        public final void setWriteTimeout$okhttp(int i) {
            this.writeTimeout = i;
        }

        public final void setX509TrustManagerOrNull$okhttp(X509TrustManager x509TrustManager) {
            this.x509TrustManagerOrNull = x509TrustManager;
        }

        public final Builder socketFactory(SocketFactory socketFactory) {
            k.f("socketFactory", socketFactory);
            if (socketFactory instanceof SSLSocketFactory) {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
            }
            if (!socketFactory.equals(getSocketFactory$okhttp())) {
                setRouteDatabase$okhttp(null);
            }
            setSocketFactory$okhttp(socketFactory);
            return this;
        }

        @p084p4.c
        public final Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory) throws IllegalAccessException {
            k.f("sslSocketFactory", sSLSocketFactory);
            if (!sSLSocketFactory.equals(getSslSocketFactoryOrNull$okhttp())) {
                setRouteDatabase$okhttp(null);
            }
            setSslSocketFactoryOrNull$okhttp(sSLSocketFactory);
            Platform.Companion companion = Platform.Companion;
            X509TrustManager x509TrustManagerTrustManager = companion.get().trustManager(sSLSocketFactory);
            if (x509TrustManagerTrustManager == null) {
                throw new IllegalStateException("Unable to extract the trust manager on " + companion.get() + ", sslSocketFactory is " + sSLSocketFactory.getClass());
            }
            setX509TrustManagerOrNull$okhttp(x509TrustManagerTrustManager);
            Platform platform = companion.get();
            X509TrustManager x509TrustManagerOrNull$okhttp = getX509TrustManagerOrNull$okhttp();
            k.c(x509TrustManagerOrNull$okhttp);
            setCertificateChainCleaner$okhttp(platform.buildCertificateChainCleaner(x509TrustManagerOrNull$okhttp));
            return this;
        }

        public final Builder writeTimeout(long j4, TimeUnit timeUnit) {
            k.f("unit", timeUnit);
            setWriteTimeout$okhttp(Util.checkDuration("timeout", j4, timeUnit));
            return this;
        }

        @IgnoreJRERequirement
        public final Builder callTimeout(Duration duration) {
            k.f("duration", duration);
            callTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder connectTimeout(Duration duration) {
            k.f("duration", duration);
            connectTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder pingInterval(Duration duration) {
            k.f("duration", duration);
            pingInterval(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder readTimeout(Duration duration) {
            k.f("duration", duration);
            readTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder writeTimeout(Duration duration) {
            k.f("duration", duration);
            writeTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            k.f("sslSocketFactory", sSLSocketFactory);
            k.f("trustManager", x509TrustManager);
            if (!sSLSocketFactory.equals(getSslSocketFactoryOrNull$okhttp()) || !x509TrustManager.equals(getX509TrustManagerOrNull$okhttp())) {
                setRouteDatabase$okhttp(null);
            }
            setSslSocketFactoryOrNull$okhttp(sSLSocketFactory);
            setCertificateChainCleaner$okhttp(CertificateChainCleaner.Companion.get(x509TrustManager));
            setX509TrustManagerOrNull$okhttp(x509TrustManager);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(OkHttpClient okHttpClient) {
            this();
            k.f("okHttpClient", okHttpClient);
            this.dispatcher = okHttpClient.dispatcher();
            this.connectionPool = okHttpClient.connectionPool();
            r.R(this.interceptors, okHttpClient.interceptors());
            r.R(this.networkInterceptors, okHttpClient.networkInterceptors());
            this.eventListenerFactory = okHttpClient.eventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure();
            this.authenticator = okHttpClient.authenticator();
            this.followRedirects = okHttpClient.followRedirects();
            this.followSslRedirects = okHttpClient.followSslRedirects();
            this.cookieJar = okHttpClient.cookieJar();
            this.cache = okHttpClient.cache();
            this.dns = okHttpClient.dns();
            this.proxy = okHttpClient.proxy();
            this.proxySelector = okHttpClient.proxySelector();
            this.proxyAuthenticator = okHttpClient.proxyAuthenticator();
            this.socketFactory = okHttpClient.socketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = okHttpClient.x509TrustManager();
            this.connectionSpecs = okHttpClient.connectionSpecs();
            this.protocols = okHttpClient.protocols();
            this.hostnameVerifier = okHttpClient.hostnameVerifier();
            this.certificatePinner = okHttpClient.certificatePinner();
            this.certificateChainCleaner = okHttpClient.certificateChainCleaner();
            this.callTimeout = okHttpClient.callTimeoutMillis();
            this.connectTimeout = okHttpClient.connectTimeoutMillis();
            this.readTimeout = okHttpClient.readTimeoutMillis();
            this.writeTimeout = okHttpClient.writeTimeoutMillis();
            this.pingInterval = okHttpClient.pingIntervalMillis();
            this.minWebSocketMessageToCompress = okHttpClient.minWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient.getRouteDatabase();
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final List<ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp() {
            return OkHttpClient.DEFAULT_CONNECTION_SPECS;
        }

        public final List<Protocol> getDEFAULT_PROTOCOLS$okhttp() {
            return OkHttpClient.DEFAULT_PROTOCOLS;
        }

        private Companion() {
        }
    }

    public OkHttpClient(Builder builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector$okhttp;
        k.f("builder", builder);
        this.dispatcher = builder.getDispatcher$okhttp();
        this.connectionPool = builder.getConnectionPool$okhttp();
        this.interceptors = Util.toImmutableList(builder.getInterceptors$okhttp());
        this.networkInterceptors = Util.toImmutableList(builder.getNetworkInterceptors$okhttp());
        this.eventListenerFactory = builder.getEventListenerFactory$okhttp();
        this.retryOnConnectionFailure = builder.getRetryOnConnectionFailure$okhttp();
        this.authenticator = builder.getAuthenticator$okhttp();
        this.followRedirects = builder.getFollowRedirects$okhttp();
        this.followSslRedirects = builder.getFollowSslRedirects$okhttp();
        this.cookieJar = builder.getCookieJar$okhttp();
        this.cache = builder.getCache$okhttp();
        this.dns = builder.getDns$okhttp();
        this.proxy = builder.getProxy$okhttp();
        if (builder.getProxy$okhttp() != null) {
            proxySelector$okhttp = NullProxySelector.INSTANCE;
        } else {
            proxySelector$okhttp = builder.getProxySelector$okhttp();
            proxySelector$okhttp = proxySelector$okhttp == null ? ProxySelector.getDefault() : proxySelector$okhttp;
            if (proxySelector$okhttp == null) {
                proxySelector$okhttp = NullProxySelector.INSTANCE;
            }
        }
        this.proxySelector = proxySelector$okhttp;
        this.proxyAuthenticator = builder.getProxyAuthenticator$okhttp();
        this.socketFactory = builder.getSocketFactory$okhttp();
        List<ConnectionSpec> connectionSpecs$okhttp = builder.getConnectionSpecs$okhttp();
        this.connectionSpecs = connectionSpecs$okhttp;
        this.protocols = builder.getProtocols$okhttp();
        this.hostnameVerifier = builder.getHostnameVerifier$okhttp();
        this.callTimeoutMillis = builder.getCallTimeout$okhttp();
        this.connectTimeoutMillis = builder.getConnectTimeout$okhttp();
        this.readTimeoutMillis = builder.getReadTimeout$okhttp();
        this.writeTimeoutMillis = builder.getWriteTimeout$okhttp();
        this.pingIntervalMillis = builder.getPingInterval$okhttp();
        this.minWebSocketMessageToCompress = builder.getMinWebSocketMessageToCompress$okhttp();
        RouteDatabase routeDatabase$okhttp = builder.getRouteDatabase$okhttp();
        this.routeDatabase = routeDatabase$okhttp == null ? new RouteDatabase() : routeDatabase$okhttp;
        if (connectionSpecs$okhttp == null || !connectionSpecs$okhttp.isEmpty()) {
            Iterator<T> it = connectionSpecs$okhttp.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).isTls()) {
                    if (builder.getSslSocketFactoryOrNull$okhttp() != null) {
                        this.sslSocketFactoryOrNull = builder.getSslSocketFactoryOrNull$okhttp();
                        CertificateChainCleaner certificateChainCleaner$okhttp = builder.getCertificateChainCleaner$okhttp();
                        k.c(certificateChainCleaner$okhttp);
                        this.certificateChainCleaner = certificateChainCleaner$okhttp;
                        X509TrustManager x509TrustManagerOrNull$okhttp = builder.getX509TrustManagerOrNull$okhttp();
                        k.c(x509TrustManagerOrNull$okhttp);
                        this.x509TrustManager = x509TrustManagerOrNull$okhttp;
                        this.certificatePinner = builder.getCertificatePinner$okhttp().withCertificateChainCleaner$okhttp(certificateChainCleaner$okhttp);
                    } else {
                        Platform.Companion companion = Platform.Companion;
                        X509TrustManager x509TrustManagerPlatformTrustManager = companion.get().platformTrustManager();
                        this.x509TrustManager = x509TrustManagerPlatformTrustManager;
                        Platform platform = companion.get();
                        k.c(x509TrustManagerPlatformTrustManager);
                        this.sslSocketFactoryOrNull = platform.newSslSocketFactory(x509TrustManagerPlatformTrustManager);
                        CertificateChainCleaner.Companion companion2 = CertificateChainCleaner.Companion;
                        k.c(x509TrustManagerPlatformTrustManager);
                        CertificateChainCleaner certificateChainCleaner = companion2.get(x509TrustManagerPlatformTrustManager);
                        this.certificateChainCleaner = certificateChainCleaner;
                        CertificatePinner certificatePinner$okhttp = builder.getCertificatePinner$okhttp();
                        k.c(certificateChainCleaner);
                        this.certificatePinner = certificatePinner$okhttp.withCertificateChainCleaner$okhttp(certificateChainCleaner);
                    }
                }
            }
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = CertificatePinner.DEFAULT;
        } else {
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = CertificatePinner.DEFAULT;
        }
        verifyClientState();
    }

    private final void verifyClientState() {
        if (this.interceptors.contains(null)) {
            throw new IllegalStateException(k.l("Null interceptor: ", interceptors()).toString());
        }
        if (this.networkInterceptors.contains(null)) {
            throw new IllegalStateException(k.l("Null network interceptor: ", networkInterceptors()).toString());
        }
        List<ConnectionSpec> list = this.connectionSpecs;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).isTls()) {
                    if (this.sslSocketFactoryOrNull == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.certificateChainCleaner == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.sslSocketFactoryOrNull != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.certificateChainCleaner != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.x509TrustManager != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!k.a(this.certificatePinner, CertificatePinner.DEFAULT)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_authenticator, reason: not valid java name */
    public final Authenticator m95deprecated_authenticator() {
        return this.authenticator;
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_cache, reason: not valid java name */
    public final Cache m96deprecated_cache() {
        return this.cache;
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_callTimeoutMillis, reason: not valid java name */
    public final int m97deprecated_callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_certificatePinner, reason: not valid java name */
    public final CertificatePinner m98deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_connectTimeoutMillis, reason: not valid java name */
    public final int m99deprecated_connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_connectionPool, reason: not valid java name */
    public final ConnectionPool m100deprecated_connectionPool() {
        return this.connectionPool;
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<ConnectionSpec> m101deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_cookieJar, reason: not valid java name */
    public final CookieJar m102deprecated_cookieJar() {
        return this.cookieJar;
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_dispatcher, reason: not valid java name */
    public final Dispatcher m103deprecated_dispatcher() {
        return this.dispatcher;
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_dns, reason: not valid java name */
    public final Dns m104deprecated_dns() {
        return this.dns;
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_eventListenerFactory, reason: not valid java name */
    public final EventListener.Factory m105deprecated_eventListenerFactory() {
        return this.eventListenerFactory;
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_followRedirects, reason: not valid java name */
    public final boolean m106deprecated_followRedirects() {
        return this.followRedirects;
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_followSslRedirects, reason: not valid java name */
    public final boolean m107deprecated_followSslRedirects() {
        return this.followSslRedirects;
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_hostnameVerifier, reason: not valid java name */
    public final HostnameVerifier m108deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_interceptors, reason: not valid java name */
    public final List<Interceptor> m109deprecated_interceptors() {
        return this.interceptors;
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_networkInterceptors, reason: not valid java name */
    public final List<Interceptor> m110deprecated_networkInterceptors() {
        return this.networkInterceptors;
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_pingIntervalMillis, reason: not valid java name */
    public final int m111deprecated_pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<Protocol> m112deprecated_protocols() {
        return this.protocols;
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m113deprecated_proxy() {
        return this.proxy;
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_proxyAuthenticator, reason: not valid java name */
    public final Authenticator m114deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_proxySelector, reason: not valid java name */
    public final ProxySelector m115deprecated_proxySelector() {
        return this.proxySelector;
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_readTimeoutMillis, reason: not valid java name */
    public final int m116deprecated_readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_retryOnConnectionFailure, reason: not valid java name */
    public final boolean m117deprecated_retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_socketFactory, reason: not valid java name */
    public final SocketFactory m118deprecated_socketFactory() {
        return this.socketFactory;
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final SSLSocketFactory m119deprecated_sslSocketFactory() {
        return sslSocketFactory();
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_writeTimeoutMillis, reason: not valid java name */
    public final int m120deprecated_writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public final Authenticator authenticator() {
        return this.authenticator;
    }

    public final Cache cache() {
        return this.cache;
    }

    public final int callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    public final CertificateChainCleaner certificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public Object clone() {
        return super.clone();
    }

    public final int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    public final ConnectionPool connectionPool() {
        return this.connectionPool;
    }

    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public final CookieJar cookieJar() {
        return this.cookieJar;
    }

    public final Dispatcher dispatcher() {
        return this.dispatcher;
    }

    public final Dns dns() {
        return this.dns;
    }

    public final EventListener.Factory eventListenerFactory() {
        return this.eventListenerFactory;
    }

    public final boolean followRedirects() {
        return this.followRedirects;
    }

    public final boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    public final RouteDatabase getRouteDatabase() {
        return this.routeDatabase;
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final List<Interceptor> interceptors() {
        return this.interceptors;
    }

    public final long minWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    public final List<Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    @Override // okhttp3.Call.Factory
    public Call newCall(Request request) {
        k.f(LoginActivity.REQUEST_KEY, request);
        return new RealCall(this, request, false);
    }

    @Override // okhttp3.WebSocket.Factory
    public WebSocket newWebSocket(Request request, WebSocketListener webSocketListener) {
        k.f(LoginActivity.REQUEST_KEY, request);
        k.f("listener", webSocketListener);
        RealWebSocket realWebSocket = new RealWebSocket(TaskRunner.INSTANCE, request, webSocketListener, new Random(), this.pingIntervalMillis, null, this.minWebSocketMessageToCompress);
        realWebSocket.connect(this);
        return realWebSocket;
    }

    public final int pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    public final List<Protocol> protocols() {
        return this.protocols;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public final boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory sslSocketFactory() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public final X509TrustManager x509TrustManager() {
        return this.x509TrustManager;
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
