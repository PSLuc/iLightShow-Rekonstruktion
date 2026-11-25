package okhttp3.internal.connection;

import B.AbstractC0013g0;
import D4.a;
import E4.g;
import E4.k;
import E4.l;
import M4.m;
import h5.AbstractC0724b;
import h5.InterfaceC0733k;
import h5.InterfaceC0734l;
import h5.P;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.CipherSuite;
import okhttp3.Connection;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import p089q4.n;

/* JADX INFO: loaded from: classes.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection {
    public static final Companion Companion = new Companion(null);
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private int allocationLimit;
    private final List<Reference<RealCall>> calls;
    private final RealConnectionPool connectionPool;
    private Handshake handshake;
    private Http2Connection http2Connection;
    private long idleAtNs;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;
    private Protocol protocol;
    private Socket rawSocket;
    private int refusedStreamCount;
    private final Route route;
    private int routeFailureCount;
    private InterfaceC0733k sink;
    private Socket socket;
    private InterfaceC0734l source;
    private int successCount;

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final RealConnection newTestConnection(RealConnectionPool realConnectionPool, Route route, Socket socket, long j4) {
            k.f("connectionPool", realConnectionPool);
            k.f("route", route);
            k.f("socket", socket);
            RealConnection realConnection = new RealConnection(realConnectionPool, route);
            realConnection.socket = socket;
            realConnection.setIdleAtNs$okhttp(j4);
            return realConnection;
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.connection.RealConnection$connectTls$1, reason: invalid class name */
    public static final class AnonymousClass1 extends l implements a {
        final /* synthetic */ Address $address;
        final /* synthetic */ CertificatePinner $certificatePinner;
        final /* synthetic */ Handshake $unverifiedHandshake;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CertificatePinner certificatePinner, Handshake handshake, Address address) {
            super(0);
            this.$certificatePinner = certificatePinner;
            this.$unverifiedHandshake = handshake;
            this.$address = address;
        }

        @Override // D4.a
        public final List<Certificate> invoke() {
            CertificateChainCleaner certificateChainCleaner$okhttp = this.$certificatePinner.getCertificateChainCleaner$okhttp();
            k.c(certificateChainCleaner$okhttp);
            return certificateChainCleaner$okhttp.clean(this.$unverifiedHandshake.peerCertificates(), this.$address.url().host());
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.connection.RealConnection$connectTls$2, reason: invalid class name */
    public static final class AnonymousClass2 extends l implements a {
        public AnonymousClass2() {
            super(0);
        }

        @Override // D4.a
        public final List<X509Certificate> invoke() {
            Handshake handshake = RealConnection.this.handshake;
            k.c(handshake);
            List<Certificate> listPeerCertificates = handshake.peerCertificates();
            ArrayList arrayList = new ArrayList(n.P(listPeerCertificates, 10));
            Iterator<T> it = listPeerCertificates.iterator();
            while (it.hasNext()) {
                arrayList.add((X509Certificate) ((Certificate) it.next()));
            }
            return arrayList;
        }
    }

    public RealConnection(RealConnectionPool realConnectionPool, Route route) {
        k.f("connectionPool", realConnectionPool);
        k.f("route", route);
        this.connectionPool = realConnectionPool;
        this.route = route;
        this.allocationLimit = 1;
        this.calls = new ArrayList();
        this.idleAtNs = Long.MAX_VALUE;
    }

    private final boolean certificateSupportHost(HttpUrl httpUrl, Handshake handshake) {
        List<Certificate> listPeerCertificates = handshake.peerCertificates();
        return !listPeerCertificates.isEmpty() && OkHostnameVerifier.INSTANCE.verify(httpUrl.host(), (X509Certificate) listPeerCertificates.get(0));
    }

    private final void connectSocket(int i, int i3, Call call, EventListener eventListener) throws IOException {
        Socket socketCreateSocket;
        Proxy proxy = this.route.proxy();
        Address address = this.route.address();
        Proxy.Type type = proxy.type();
        int i6 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i6 == 1 || i6 == 2) {
            socketCreateSocket = address.socketFactory().createSocket();
            k.c(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.rawSocket = socketCreateSocket;
        eventListener.connectStart(call, this.route.socketAddress(), proxy);
        socketCreateSocket.setSoTimeout(i3);
        try {
            Platform.Companion.get().connectSocket(socketCreateSocket, this.route.socketAddress(), i);
            try {
                this.source = AbstractC0724b.c(AbstractC0724b.j(socketCreateSocket));
                this.sink = AbstractC0724b.b(AbstractC0724b.h(socketCreateSocket));
            } catch (NullPointerException e6) {
                if (k.a(e6.getMessage(), NPE_THROW_WITH_NULL)) {
                    throw new IOException(e6);
                }
            }
        } catch (ConnectException e7) {
            ConnectException connectException = new ConnectException(k.l("Failed to connect to ", this.route.socketAddress()));
            connectException.initCause(e7);
            throw connectException;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void connectTls(ConnectionSpecSelector connectionSpecSelector) throws Throwable {
        Address address = this.route.address();
        SSLSocketFactory sslSocketFactory = address.sslSocketFactory();
        SSLSocket sSLSocket = null;
        try {
            k.c(sslSocketFactory);
            Socket socketCreateSocket = sslSocketFactory.createSocket(this.rawSocket, address.url().host(), address.url().port(), true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                ConnectionSpec connectionSpecConfigureSecureSocket = connectionSpecSelector.configureSecureSocket(sSLSocket2);
                if (connectionSpecConfigureSecureSocket.supportsTlsExtensions()) {
                    Platform.Companion.get().configureTlsExtensions(sSLSocket2, address.url().host(), address.protocols());
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                Handshake.Companion companion = Handshake.Companion;
                k.e("sslSocketSession", session);
                Handshake handshake = companion.get(session);
                HostnameVerifier hostnameVerifier = address.hostnameVerifier();
                k.c(hostnameVerifier);
                if (hostnameVerifier.verify(address.url().host(), session)) {
                    CertificatePinner certificatePinner = address.certificatePinner();
                    k.c(certificatePinner);
                    this.handshake = new Handshake(handshake.tlsVersion(), handshake.cipherSuite(), handshake.localCertificates(), new AnonymousClass1(certificatePinner, handshake, address));
                    certificatePinner.check$okhttp(address.url().host(), new AnonymousClass2());
                    String selectedProtocol = connectionSpecConfigureSecureSocket.supportsTlsExtensions() ? Platform.Companion.get().getSelectedProtocol(sSLSocket2) : null;
                    this.socket = sSLSocket2;
                    this.source = AbstractC0724b.c(AbstractC0724b.j(sSLSocket2));
                    this.sink = AbstractC0724b.b(AbstractC0724b.h(sSLSocket2));
                    this.protocol = selectedProtocol != null ? Protocol.Companion.get(selectedProtocol) : Protocol.HTTP_1_1;
                    Platform.Companion.get().afterHandshake(sSLSocket2);
                    return;
                }
                List<Certificate> listPeerCertificates = handshake.peerCertificates();
                if (listPeerCertificates.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + address.url().host() + " not verified (no certificates)");
                }
                X509Certificate x509Certificate = (X509Certificate) listPeerCertificates.get(0);
                throw new SSLPeerUnverifiedException(m.O("\n              |Hostname " + address.url().host() + " not verified:\n              |    certificate: " + CertificatePinner.Companion.pin(x509Certificate) + "\n              |    DN: " + ((Object) x509Certificate.getSubjectDN().getName()) + "\n              |    subjectAltNames: " + OkHostnameVerifier.INSTANCE.allSubjectAltNames(x509Certificate) + "\n              "));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    Platform.Companion.get().afterHandshake(sSLSocket);
                }
                if (sSLSocket != null) {
                    Util.closeQuietly((Socket) sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void connectTunnel(int i, int i3, int i6, Call call, EventListener eventListener) throws IOException {
        Request requestCreateTunnelRequest = createTunnelRequest();
        HttpUrl httpUrlUrl = requestCreateTunnelRequest.url();
        int i7 = 0;
        while (i7 < MAX_TUNNEL_ATTEMPTS) {
            i7++;
            connectSocket(i, i3, call, eventListener);
            requestCreateTunnelRequest = createTunnel(i3, i6, requestCreateTunnelRequest, httpUrlUrl);
            if (requestCreateTunnelRequest == null) {
                return;
            }
            Socket socket = this.rawSocket;
            if (socket != null) {
                Util.closeQuietly(socket);
            }
            this.rawSocket = null;
            this.sink = null;
            this.source = null;
            eventListener.connectEnd(call, this.route.socketAddress(), this.route.proxy(), null);
        }
    }

    private final Request createTunnel(int i, int i3, Request request, HttpUrl httpUrl) throws IOException {
        String str = "CONNECT " + Util.toHostHeader(httpUrl, true) + " HTTP/1.1";
        while (true) {
            InterfaceC0734l interfaceC0734l = this.source;
            k.c(interfaceC0734l);
            InterfaceC0733k interfaceC0733k = this.sink;
            k.c(interfaceC0733k);
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, interfaceC0734l, interfaceC0733k);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            interfaceC0734l.timeout().timeout(i, timeUnit);
            interfaceC0733k.timeout().timeout(i3, timeUnit);
            http1ExchangeCodec.writeRequest(request.headers(), str);
            http1ExchangeCodec.finishRequest();
            Response.Builder responseHeaders = http1ExchangeCodec.readResponseHeaders(false);
            k.c(responseHeaders);
            Response responseBuild = responseHeaders.request(request).build();
            http1ExchangeCodec.skipConnectBody(responseBuild);
            int iCode = responseBuild.code();
            if (iCode == 200) {
                if (interfaceC0734l.a().z() && interfaceC0733k.a().z()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iCode != 407) {
                throw new IOException(k.l("Unexpected response code for CONNECT: ", Integer.valueOf(responseBuild.code())));
            }
            Request requestAuthenticate = this.route.address().proxyAuthenticator().authenticate(this.route, responseBuild);
            if (requestAuthenticate == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if ("close".equalsIgnoreCase(Response.header$default(responseBuild, "Connection", null, 2, null))) {
                return requestAuthenticate;
            }
            request = requestAuthenticate;
        }
    }

    private final Request createTunnelRequest() {
        Request requestBuild = new Request.Builder().url(this.route.address().url()).method("CONNECT", null).header("Host", Util.toHostHeader(this.route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", Util.userAgent).build();
        Request requestAuthenticate = this.route.address().proxyAuthenticator().authenticate(this.route, new Response.Builder().request(requestBuild).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        return requestAuthenticate == null ? requestBuild : requestAuthenticate;
    }

    private final void establishProtocol(ConnectionSpecSelector connectionSpecSelector, int i, Call call, EventListener eventListener) throws Throwable {
        if (this.route.address().sslSocketFactory() != null) {
            eventListener.secureConnectStart(call);
            connectTls(connectionSpecSelector);
            eventListener.secureConnectEnd(call, this.handshake);
            if (this.protocol == Protocol.HTTP_2) {
                startHttp2(i);
                return;
            }
            return;
        }
        List<Protocol> listProtocols = this.route.address().protocols();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        if (!listProtocols.contains(protocol)) {
            this.socket = this.rawSocket;
            this.protocol = Protocol.HTTP_1_1;
        } else {
            this.socket = this.rawSocket;
            this.protocol = protocol;
            startHttp2(i);
        }
    }

    private final boolean routeMatchesAny(List<Route> list) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        for (Route route : list) {
            Proxy.Type type = route.proxy().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.route.proxy().type() == type2 && k.a(this.route.socketAddress(), route.socketAddress())) {
                return true;
            }
        }
        return false;
    }

    private final void startHttp2(int i) throws SocketException {
        Socket socket = this.socket;
        k.c(socket);
        InterfaceC0734l interfaceC0734l = this.source;
        k.c(interfaceC0734l);
        InterfaceC0733k interfaceC0733k = this.sink;
        k.c(interfaceC0733k);
        socket.setSoTimeout(0);
        Http2Connection http2ConnectionBuild = new Http2Connection.Builder(true, TaskRunner.INSTANCE).socket(socket, this.route.address().url().host(), interfaceC0734l, interfaceC0733k).listener(this).pingIntervalMillis(i).build();
        this.http2Connection = http2ConnectionBuild;
        this.allocationLimit = Http2Connection.Companion.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
        Http2Connection.start$default(http2ConnectionBuild, false, null, 3, null);
    }

    private final boolean supportsUrl(HttpUrl httpUrl) {
        Handshake handshake;
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        HttpUrl httpUrlUrl = this.route.address().url();
        if (httpUrl.port() != httpUrlUrl.port()) {
            return false;
        }
        if (k.a(httpUrl.host(), httpUrlUrl.host())) {
            return true;
        }
        if (!this.noCoalescedConnections && (handshake = this.handshake) != null) {
            k.c(handshake);
            if (certificateSupportHost(httpUrl, handshake)) {
                return true;
            }
        }
        return false;
    }

    public final void cancel() {
        Socket socket = this.rawSocket;
        if (socket == null) {
            return;
        }
        Util.closeQuietly(socket);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:58:0x011c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0122  */
    /* JADX WARN: Code duplicated, block: B:61:0x0127  */
    /* JADX WARN: Code duplicated, block: B:63:0x012d A[LOOP:0: B:71:0x0084->B:63:0x012d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0133 A[SYNTHETIC] */
    public final void connect(int i, int i3, int i6, int i7, boolean z5, Call call, EventListener eventListener) throws Throwable {
        IOException iOException;
        Socket socket;
        Socket socket2;
        Call call2 = call;
        EventListener eventListener2 = eventListener;
        k.f("call", call2);
        k.f("eventListener", eventListener2);
        if (this.protocol != null) {
            throw new IllegalStateException("already connected");
        }
        List<ConnectionSpec> listConnectionSpecs = this.route.address().connectionSpecs();
        ConnectionSpecSelector connectionSpecSelector = new ConnectionSpecSelector(listConnectionSpecs);
        if (this.route.address().sslSocketFactory() == null) {
            if (!listConnectionSpecs.contains(ConnectionSpec.CLEARTEXT)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strHost = this.route.address().url().host();
            if (!Platform.Companion.get().isCleartextTrafficPermitted(strHost)) {
                throw new RouteException(new UnknownServiceException(AbstractC0013g0.i("CLEARTEXT communication to ", strHost, " not permitted by network security policy")));
            }
        } else if (this.route.address().protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        while (true) {
            try {
                if (this.route.requiresTunnel()) {
                    EventListener eventListener3 = eventListener2;
                    Call call3 = call2;
                    try {
                        connectTunnel(i, i3, i6, call3, eventListener3);
                        call2 = call3;
                        eventListener2 = eventListener3;
                        try {
                            if (this.rawSocket != null) {
                                break;
                            } else {
                                break;
                            }
                        } catch (IOException e6) {
                            e = e6;
                            iOException = e;
                            socket = this.socket;
                            if (socket != null) {
                                Util.closeQuietly(socket);
                            }
                            socket2 = this.rawSocket;
                            if (socket2 != null) {
                                Util.closeQuietly(socket2);
                            }
                            this.socket = null;
                            this.rawSocket = null;
                            this.source = null;
                            this.sink = null;
                            this.handshake = null;
                            this.protocol = null;
                            this.http2Connection = null;
                            this.allocationLimit = 1;
                            eventListener2.connectFailed(call2, this.route.socketAddress(), this.route.proxy(), null, iOException);
                            if (routeException == null) {
                                routeException = new RouteException(iOException);
                            } else {
                                routeException.addConnectException(iOException);
                            }
                            if (z5) {
                                throw routeException;
                            }
                            if (connectionSpecSelector.connectionFailed(iOException)) {
                                throw routeException;
                            }
                            call2 = call;
                            eventListener2 = eventListener;
                        }
                    } catch (IOException e7) {
                        e = e7;
                        call2 = call3;
                        eventListener2 = eventListener3;
                    }
                } else {
                    connectSocket(i, i3, call2, eventListener2);
                }
                try {
                    establishProtocol(connectionSpecSelector, i7, call2, eventListener2);
                    eventListener2.connectEnd(call2, this.route.socketAddress(), this.route.proxy(), this.protocol);
                    break;
                } catch (IOException e8) {
                    e = e8;
                    iOException = e;
                    socket = this.socket;
                    if (socket != null) {
                        Util.closeQuietly(socket);
                    }
                    socket2 = this.rawSocket;
                    if (socket2 != null) {
                        Util.closeQuietly(socket2);
                    }
                    this.socket = null;
                    this.rawSocket = null;
                    this.source = null;
                    this.sink = null;
                    this.handshake = null;
                    this.protocol = null;
                    this.http2Connection = null;
                    this.allocationLimit = 1;
                    eventListener2.connectFailed(call2, this.route.socketAddress(), this.route.proxy(), null, iOException);
                    if (routeException == null) {
                        routeException = new RouteException(iOException);
                    } else {
                        routeException.addConnectException(iOException);
                    }
                    if (z5) {
                        throw routeException;
                    }
                    if (connectionSpecSelector.connectionFailed(iOException)) {
                        throw routeException;
                    }
                    call2 = call;
                    eventListener2 = eventListener;
                }
            } catch (IOException e9) {
                e = e9;
            }
            call2 = call;
            eventListener2 = eventListener;
        }
        if (this.route.requiresTunnel() && this.rawSocket == null) {
            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.idleAtNs = System.nanoTime();
    }

    public final void connectFailed$okhttp(OkHttpClient okHttpClient, Route route, IOException iOException) {
        k.f("client", okHttpClient);
        k.f("failedRoute", route);
        k.f("failure", iOException);
        if (route.proxy().type() != Proxy.Type.DIRECT) {
            Address address = route.address();
            address.proxySelector().connectFailed(address.url().uri(), route.proxy().address(), iOException);
        }
        okHttpClient.getRouteDatabase().failed(route);
    }

    public final List<Reference<RealCall>> getCalls() {
        return this.calls;
    }

    public final RealConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    public final long getIdleAtNs$okhttp() {
        return this.idleAtNs;
    }

    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    public final int getRouteFailureCount$okhttp() {
        return this.routeFailureCount;
    }

    @Override // okhttp3.Connection
    public Handshake handshake() {
        return this.handshake;
    }

    public final synchronized void incrementSuccessCount$okhttp() {
        this.successCount++;
    }

    public final boolean isEligible$okhttp(Address address, List<Route> list) {
        k.f("address", address);
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !this.route.address().equalsNonHost$okhttp(address)) {
            return false;
        }
        if (k.a(address.url().host(), route().address().url().host())) {
            return true;
        }
        if (this.http2Connection == null || list == null || !routeMatchesAny(list) || address.hostnameVerifier() != OkHostnameVerifier.INSTANCE || !supportsUrl(address.url())) {
            return false;
        }
        try {
            CertificatePinner certificatePinner = address.certificatePinner();
            k.c(certificatePinner);
            String strHost = address.url().host();
            Handshake handshake = handshake();
            k.c(handshake);
            certificatePinner.check(strHost, handshake.peerCertificates());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean isHealthy(boolean z5) {
        long idleAtNs$okhttp;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.rawSocket;
        k.c(socket);
        Socket socket2 = this.socket;
        k.c(socket2);
        InterfaceC0734l interfaceC0734l = this.source;
        k.c(interfaceC0734l);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return http2Connection.isHealthy(jNanoTime);
        }
        synchronized (this) {
            idleAtNs$okhttp = jNanoTime - getIdleAtNs$okhttp();
        }
        if (idleAtNs$okhttp < IDLE_CONNECTION_HEALTHY_NS || !z5) {
            return true;
        }
        return Util.isHealthy(socket2, interfaceC0734l);
    }

    public final boolean isMultiplexed$okhttp() {
        return this.http2Connection != null;
    }

    public final ExchangeCodec newCodec$okhttp(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain) throws SocketException {
        k.f("client", okHttpClient);
        k.f("chain", realInterceptorChain);
        Socket socket = this.socket;
        k.c(socket);
        InterfaceC0734l interfaceC0734l = this.source;
        k.c(interfaceC0734l);
        InterfaceC0733k interfaceC0733k = this.sink;
        k.c(interfaceC0733k);
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(okHttpClient, this, realInterceptorChain, http2Connection);
        }
        socket.setSoTimeout(realInterceptorChain.readTimeoutMillis());
        P pTimeout = interfaceC0734l.timeout();
        long readTimeoutMillis$okhttp = realInterceptorChain.getReadTimeoutMillis$okhttp();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        pTimeout.timeout(readTimeoutMillis$okhttp, timeUnit);
        interfaceC0733k.timeout().timeout(realInterceptorChain.getWriteTimeoutMillis$okhttp(), timeUnit);
        return new Http1ExchangeCodec(okHttpClient, this, interfaceC0734l, interfaceC0733k);
    }

    public final RealWebSocket.Streams newWebSocketStreams$okhttp(final Exchange exchange) throws SocketException {
        k.f("exchange", exchange);
        Socket socket = this.socket;
        k.c(socket);
        final InterfaceC0734l interfaceC0734l = this.source;
        k.c(interfaceC0734l);
        final InterfaceC0733k interfaceC0733k = this.sink;
        k.c(interfaceC0733k);
        socket.setSoTimeout(0);
        noNewExchanges$okhttp();
        return new RealWebSocket.Streams(interfaceC0733k, exchange) { // from class: okhttp3.internal.connection.RealConnection$newWebSocketStreams$1
            final /* synthetic */ Exchange $exchange;
            final /* synthetic */ InterfaceC0733k $sink;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(true, this.$source, interfaceC0733k);
                this.$sink = interfaceC0733k;
                this.$exchange = exchange;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.$exchange.bodyComplete(-1L, true, true, null);
            }
        };
    }

    public final synchronized void noCoalescedConnections$okhttp() {
        this.noCoalescedConnections = true;
    }

    public final synchronized void noNewExchanges$okhttp() {
        this.noNewExchanges = true;
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public synchronized void onSettings(Http2Connection http2Connection, Settings settings) {
        k.f("connection", http2Connection);
        k.f("settings", settings);
        this.allocationLimit = settings.getMaxConcurrentStreams();
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onStream(Http2Stream http2Stream) {
        k.f("stream", http2Stream);
        http2Stream.close(ErrorCode.REFUSED_STREAM, null);
    }

    @Override // okhttp3.Connection
    public Protocol protocol() {
        Protocol protocol = this.protocol;
        k.c(protocol);
        return protocol;
    }

    @Override // okhttp3.Connection
    public Route route() {
        return this.route;
    }

    public final void setIdleAtNs$okhttp(long j4) {
        this.idleAtNs = j4;
    }

    public final void setNoNewExchanges(boolean z5) {
        this.noNewExchanges = z5;
    }

    public final void setRouteFailureCount$okhttp(int i) {
        this.routeFailureCount = i;
    }

    @Override // okhttp3.Connection
    public Socket socket() {
        Socket socket = this.socket;
        k.c(socket);
        return socket;
    }

    public String toString() {
        CipherSuite cipherSuite;
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.route.address().url().host());
        sb.append(':');
        sb.append(this.route.address().url().port());
        sb.append(", proxy=");
        sb.append(this.route.proxy());
        sb.append(" hostAddress=");
        sb.append(this.route.socketAddress());
        sb.append(" cipherSuite=");
        Handshake handshake = this.handshake;
        Object obj = "none";
        if (handshake != null && (cipherSuite = handshake.cipherSuite()) != null) {
            obj = cipherSuite;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }

    public final synchronized void trackFailure$okhttp(RealCall realCall, IOException iOException) {
        try {
            k.f("call", realCall);
            if (iOException instanceof StreamResetException) {
                if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                    int i = this.refusedStreamCount + 1;
                    this.refusedStreamCount = i;
                    if (i > 1) {
                        this.noNewExchanges = true;
                        this.routeFailureCount++;
                    }
                } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !realCall.isCanceled()) {
                    this.noNewExchanges = true;
                    this.routeFailureCount++;
                }
            } else if (!isMultiplexed$okhttp() || (iOException instanceof ConnectionShutdownException)) {
                this.noNewExchanges = true;
                if (this.successCount == 0) {
                    if (iOException != null) {
                        connectFailed$okhttp(realCall.getClient(), this.route, iOException);
                    }
                    this.routeFailureCount++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
