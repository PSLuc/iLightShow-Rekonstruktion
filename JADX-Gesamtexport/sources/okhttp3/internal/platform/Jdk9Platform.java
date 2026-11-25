package okhttp3.internal.platform;

import E4.g;
import E4.k;
import M4.s;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;

/* JADX INFO: loaded from: classes.dex */
public class Jdk9Platform extends Platform {
    public static final Companion Companion = new Companion(null);
    private static final boolean isAvailable;

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final Jdk9Platform buildIfSupported() {
            if (isAvailable()) {
                return new Jdk9Platform();
            }
            return null;
        }

        public final boolean isAvailable() {
            return Jdk9Platform.isAvailable;
        }

        private Companion() {
        }
    }

    static {
        String property = System.getProperty("java.specification.version");
        Integer numX = property == null ? null : s.X(property);
        boolean z5 = false;
        if (numX == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
                z5 = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numX.intValue() >= 9) {
            z5 = true;
        }
        isAvailable = z5;
    }

    @Override // okhttp3.internal.platform.Platform
    @SuppressSignatureCheck
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
        k.f("sslSocket", sSLSocket);
        k.f("protocols", list);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        Object[] array = Platform.Companion.alpnProtocolNames(list).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // okhttp3.internal.platform.Platform
    @SuppressSignatureCheck
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        k.f("sslSocket", sSLSocket);
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        k.f("sslSocketFactory", sSLSocketFactory);
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }
}
