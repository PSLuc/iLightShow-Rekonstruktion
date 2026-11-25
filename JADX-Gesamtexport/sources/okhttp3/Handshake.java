package okhttp3;

import D4.a;
import E4.g;
import E4.k;
import E4.l;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.internal.Util;
import p084p4.c;
import p084p4.f;
import p089q4.n;
import p089q4.u;

/* JADX INFO: loaded from: classes.dex */
public final class Handshake {
    public static final Companion Companion = new Companion(null);
    private final CipherSuite cipherSuite;
    private final List<Certificate> localCertificates;
    private final f peerCertificates$delegate;
    private final TlsVersion tlsVersion;

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private final List<Certificate> toImmutableList(Certificate[] certificateArr) {
            return certificateArr != null ? Util.immutableListOf(Arrays.copyOf(certificateArr, certificateArr.length)) : u.f11237h;
        }

        @c
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final Handshake m58deprecated_get(SSLSession sSLSession) {
            k.f("sslSession", sSLSession);
            return get(sSLSession);
        }

        public final Handshake get(SSLSession sSLSession) throws IOException {
            List<Certificate> immutableList;
            k.f("<this>", sSLSession);
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException(k.l("cipherSuite == ", cipherSuite));
            }
            CipherSuite cipherSuiteForJavaName = CipherSuite.Companion.forJavaName(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if ("NONE".equals(protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion tlsVersionForJavaName = TlsVersion.Companion.forJavaName(protocol);
            try {
                immutableList = toImmutableList(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                immutableList = u.f11237h;
            }
            return new Handshake(tlsVersionForJavaName, cipherSuiteForJavaName, toImmutableList(sSLSession.getLocalCertificates()), new Handshake$Companion$handshake$1(immutableList));
        }

        private Companion() {
        }

        public final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, List<? extends Certificate> list2) {
            k.f("tlsVersion", tlsVersion);
            k.f("cipherSuite", cipherSuite);
            k.f("peerCertificates", list);
            k.f("localCertificates", list2);
            return new Handshake(tlsVersion, cipherSuite, Util.toImmutableList(list2), new Handshake$Companion$get$1(Util.toImmutableList(list)));
        }
    }

    /* JADX INFO: renamed from: okhttp3.Handshake$peerCertificates$2, reason: invalid class name */
    public static final class AnonymousClass2 extends l implements a {
        final /* synthetic */ a $peerCertificatesFn;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(a aVar) {
            super(0);
            this.$peerCertificatesFn = aVar;
        }

        @Override // D4.a
        public final List<Certificate> invoke() {
            try {
                return (List) this.$peerCertificatesFn.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return u.f11237h;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, a aVar) {
        k.f("tlsVersion", tlsVersion);
        k.f("cipherSuite", cipherSuite);
        k.f("localCertificates", list);
        k.f("peerCertificatesFn", aVar);
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.localCertificates = list;
        this.peerCertificates$delegate = G4.a.z(new AnonymousClass2(aVar));
    }

    public static final Handshake get(SSLSession sSLSession) {
        return Companion.get(sSLSession);
    }

    private final String getName(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        k.e("type", type);
        return type;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_cipherSuite, reason: not valid java name */
    public final CipherSuite m52deprecated_cipherSuite() {
        return this.cipherSuite;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_localCertificates, reason: not valid java name */
    public final List<Certificate> m53deprecated_localCertificates() {
        return this.localCertificates;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_localPrincipal, reason: not valid java name */
    public final Principal m54deprecated_localPrincipal() {
        return localPrincipal();
    }

    @c
    /* JADX INFO: renamed from: -deprecated_peerCertificates, reason: not valid java name */
    public final List<Certificate> m55deprecated_peerCertificates() {
        return peerCertificates();
    }

    @c
    /* JADX INFO: renamed from: -deprecated_peerPrincipal, reason: not valid java name */
    public final Principal m56deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    @c
    /* JADX INFO: renamed from: -deprecated_tlsVersion, reason: not valid java name */
    public final TlsVersion m57deprecated_tlsVersion() {
        return this.tlsVersion;
    }

    public final CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Handshake)) {
            return false;
        }
        Handshake handshake = (Handshake) obj;
        return handshake.tlsVersion == this.tlsVersion && k.a(handshake.cipherSuite, this.cipherSuite) && k.a(handshake.peerCertificates(), peerCertificates()) && k.a(handshake.localCertificates, this.localCertificates);
    }

    public int hashCode() {
        return this.localCertificates.hashCode() + ((peerCertificates().hashCode() + ((this.cipherSuite.hashCode() + ((this.tlsVersion.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final List<Certificate> localCertificates() {
        return this.localCertificates;
    }

    public final Principal localPrincipal() {
        Object objZ = p089q4.l.Z(this.localCertificates);
        X509Certificate x509Certificate = objZ instanceof X509Certificate ? (X509Certificate) objZ : null;
        if (x509Certificate == null) {
            return null;
        }
        return x509Certificate.getSubjectX500Principal();
    }

    public final List<Certificate> peerCertificates() {
        return (List) this.peerCertificates$delegate.getValue();
    }

    public final Principal peerPrincipal() {
        Object objZ = p089q4.l.Z(peerCertificates());
        X509Certificate x509Certificate = objZ instanceof X509Certificate ? (X509Certificate) objZ : null;
        if (x509Certificate == null) {
            return null;
        }
        return x509Certificate.getSubjectX500Principal();
    }

    public final TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    public String toString() {
        List<Certificate> listPeerCertificates = peerCertificates();
        ArrayList arrayList = new ArrayList(n.P(listPeerCertificates, 10));
        Iterator<T> it = listPeerCertificates.iterator();
        while (it.hasNext()) {
            arrayList.add(getName((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.tlsVersion);
        sb.append(" cipherSuite=");
        sb.append(this.cipherSuite);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(n.P(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(getName((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }

    public static final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, List<? extends Certificate> list2) {
        return Companion.get(tlsVersion, cipherSuite, list, list2);
    }
}
