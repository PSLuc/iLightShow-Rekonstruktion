package okhttp3.internal.platform;

import E4.g;
import E4.k;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import org.openjsse.net.ssl.OpenJSSE;

/* JADX INFO: loaded from: classes.dex */
public final class OpenJSSEPlatform extends Platform {
    public static final Companion Companion;
    private static final boolean isSupported;
    private final Provider provider;

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final OpenJSSEPlatform buildIfSupported() {
            g gVar = null;
            if (isSupported()) {
                return new OpenJSSEPlatform(gVar);
            }
            return null;
        }

        public final boolean isSupported() {
            return OpenJSSEPlatform.isSupported;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        boolean z5 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, companion.getClass().getClassLoader());
            z5 = true;
        } catch (ClassNotFoundException unused) {
        }
        isSupported = z5;
    }

    public /* synthetic */ OpenJSSEPlatform(g gVar) {
        this();
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
        k.f("sslSocket", sSLSocket);
        k.f("protocols", list);
        super.configureTlsExtensions(sSLSocket, str, list);
    }

    @Override // okhttp3.internal.platform.Platform
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        k.f("sslSocket", sSLSocket);
        return super.getSelectedProtocol(sSLSocket);
    }

    @Override // okhttp3.internal.platform.Platform
    public SSLContext newSSLContext() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.provider);
        k.e("getInstance(\"TLSv1.3\", provider)", sSLContext);
        return sSLContext;
    }

    @Override // okhttp3.internal.platform.Platform
    public X509TrustManager platformTrustManager() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.provider);
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        k.c(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager != null) {
                    return (X509TrustManager) trustManager;
                }
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
        }
        String string = Arrays.toString(trustManagers);
        k.e("toString(this)", string);
        throw new IllegalStateException(k.l("Unexpected default trust managers: ", string).toString());
    }

    @Override // okhttp3.internal.platform.Platform
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        k.f("sslSocketFactory", sSLSocketFactory);
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with OpenJSSE");
    }

    private OpenJSSEPlatform() {
        this.provider = new OpenJSSE();
    }
}
