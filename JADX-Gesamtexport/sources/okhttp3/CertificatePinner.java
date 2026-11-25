package okhttp3;

import B.AbstractC0013g0;
import D4.a;
import E4.g;
import E4.k;
import E4.z;
import M4.s;
import Z2.f;
import h5.C0735m;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import org.slf4j.Marker;
import p084p4.c;
import p089q4.l;
import p089q4.n;
import p089q4.u;

/* JADX INFO: loaded from: classes.dex */
public final class CertificatePinner {
    public static final Companion Companion = new Companion(null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String str, String... strArr) {
            k.f("pattern", str);
            k.f("pins", strArr);
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str2 = strArr[i];
                i++;
                getPins().add(new Pin(str, str2));
            }
            return this;
        }

        public final CertificatePinner build() {
            return new CertificatePinner(l.x0(this.pins), null, 2, 0 == true ? 1 : 0);
        }

        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final String pin(Certificate certificate) {
            k.f("certificate", certificate);
            if (certificate instanceof X509Certificate) {
                return k.l("sha256/", sha256Hash((X509Certificate) certificate).a());
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }

        public final C0735m sha1Hash(X509Certificate x509Certificate) {
            k.f("<this>", x509Certificate);
            C0735m c0735m = C0735m.f9352k;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            k.e("publicKey.encoded", encoded);
            return f.o(encoded).c("SHA-1");
        }

        public final C0735m sha256Hash(X509Certificate x509Certificate) {
            k.f("<this>", x509Certificate);
            C0735m c0735m = C0735m.f9352k;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            k.e("publicKey.encoded", encoded);
            return f.o(encoded).c("SHA-256");
        }

        private Companion() {
        }
    }

    public static final class Pin {
        private final C0735m hash;
        private final String hashAlgorithm;
        private final String pattern;

        public Pin(String str, String str2) {
            k.f("pattern", str);
            k.f("pin", str2);
            if ((!s.W(str, "*.", false) || M4.l.g0(str, Marker.ANY_MARKER, 1, 4) != -1) && ((!s.W(str, "**.", false) || M4.l.g0(str, Marker.ANY_MARKER, 2, 4) != -1) && M4.l.g0(str, Marker.ANY_MARKER, 0, 6) != -1)) {
                throw new IllegalArgumentException(k.l("Unexpected pattern: ", str).toString());
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(str);
            if (canonicalHost == null) {
                throw new IllegalArgumentException(k.l("Invalid pattern: ", str));
            }
            this.pattern = canonicalHost;
            if (s.W(str2, "sha1/", false)) {
                this.hashAlgorithm = "sha1";
                C0735m c0735m = C0735m.f9352k;
                String strSubstring = str2.substring(5);
                k.e("this as java.lang.String).substring(startIndex)", strSubstring);
                C0735m c0735mG = f.g(strSubstring);
                if (c0735mG == null) {
                    throw new IllegalArgumentException(k.l("Invalid pin hash: ", str2));
                }
                this.hash = c0735mG;
                return;
            }
            if (!s.W(str2, "sha256/", false)) {
                throw new IllegalArgumentException(k.l("pins must start with 'sha256/' or 'sha1/': ", str2));
            }
            this.hashAlgorithm = "sha256";
            C0735m c0735m2 = C0735m.f9352k;
            String strSubstring2 = str2.substring(7);
            k.e("this as java.lang.String).substring(startIndex)", strSubstring2);
            C0735m c0735mG2 = f.g(strSubstring2);
            if (c0735mG2 == null) {
                throw new IllegalArgumentException(k.l("Invalid pin hash: ", str2));
            }
            this.hash = c0735mG2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return k.a(this.pattern, pin.pattern) && k.a(this.hashAlgorithm, pin.hashAlgorithm) && k.a(this.hash, pin.hash);
        }

        public final C0735m getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return this.hash.hashCode() + AbstractC0013g0.c(this.pattern.hashCode() * 31, this.hashAlgorithm, 31);
        }

        public final boolean matchesCertificate(X509Certificate x509Certificate) {
            k.f("certificate", x509Certificate);
            String str = this.hashAlgorithm;
            if (k.a(str, "sha256")) {
                return k.a(this.hash, CertificatePinner.Companion.sha256Hash(x509Certificate));
            }
            if (k.a(str, "sha1")) {
                return k.a(this.hash, CertificatePinner.Companion.sha1Hash(x509Certificate));
            }
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x006b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x006c A[RETURN] */
        public final boolean matchesHostname(String str) {
            k.f("hostname", str);
            if (s.W(this.pattern, "**.", false)) {
                int length = this.pattern.length() - 3;
                int length2 = str.length() - length;
                if (s.S(str.length() - length, 3, length, str, this.pattern, false) && (length2 == 0 || str.charAt(length2 - 1) == '.')) {
                    return true;
                }
                return false;
            }
            if (!s.W(this.pattern, "*.", false)) {
                return str.equals(this.pattern);
            }
            int length3 = this.pattern.length() - 1;
            int length4 = str.length() - length3;
            if (s.S(str.length() - length3, 1, length3, str, this.pattern, false) && M4.l.l0(str, '.', length4 - 1, 4) == -1) {
                return true;
            }
            return false;
        }

        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.a();
        }
    }

    /* JADX INFO: renamed from: okhttp3.CertificatePinner$check$1, reason: invalid class name */
    public static final class AnonymousClass1 extends E4.l implements a {
        final /* synthetic */ String $hostname;
        final /* synthetic */ List<Certificate> $peerCertificates;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(List<? extends Certificate> list, String str) {
            super(0);
            this.$peerCertificates = list;
            this.$hostname = str;
        }

        @Override // D4.a
        public final List<X509Certificate> invoke() {
            CertificateChainCleaner certificateChainCleaner$okhttp = CertificatePinner.this.getCertificateChainCleaner$okhttp();
            List<Certificate> listClean = certificateChainCleaner$okhttp == null ? null : certificateChainCleaner$okhttp.clean(this.$peerCertificates, this.$hostname);
            if (listClean == null) {
                listClean = this.$peerCertificates;
            }
            ArrayList arrayList = new ArrayList(n.P(listClean, 10));
            Iterator<T> it = listClean.iterator();
            while (it.hasNext()) {
                arrayList.add((X509Certificate) ((Certificate) it.next()));
            }
            return arrayList;
        }
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
        k.f("pins", set);
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public static final String pin(Certificate certificate) {
        return Companion.pin(certificate);
    }

    public static final C0735m sha1Hash(X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    public static final C0735m sha256Hash(X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(String str, List<? extends Certificate> list) {
        k.f("hostname", str);
        k.f("peerCertificates", list);
        check$okhttp(str, new AnonymousClass1(list, str));
    }

    public final void check$okhttp(String str, a aVar) throws SSLPeerUnverifiedException {
        k.f("hostname", str);
        k.f("cleanedPeerCertificatesFn", aVar);
        List<Pin> listFindMatchingPins = findMatchingPins(str);
        if (listFindMatchingPins.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) aVar.invoke();
        for (X509Certificate x509Certificate : list) {
            C0735m c0735mSha256Hash = null;
            C0735m c0735mSha1Hash = null;
            for (Pin pin : listFindMatchingPins) {
                String hashAlgorithm = pin.getHashAlgorithm();
                if (k.a(hashAlgorithm, "sha256")) {
                    if (c0735mSha256Hash == null) {
                        c0735mSha256Hash = Companion.sha256Hash(x509Certificate);
                    }
                    if (k.a(pin.getHash(), c0735mSha256Hash)) {
                        return;
                    }
                } else {
                    if (!k.a(hashAlgorithm, "sha1")) {
                        throw new AssertionError(k.l("unsupported hashAlgorithm: ", pin.getHashAlgorithm()));
                    }
                    if (c0735mSha1Hash == null) {
                        c0735mSha1Hash = Companion.sha1Hash(x509Certificate);
                    }
                    if (k.a(pin.getHash(), c0735mSha1Hash)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(Companion.pin(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        for (Pin pin2 : listFindMatchingPins) {
            sb.append("\n    ");
            sb.append(pin2);
        }
        String string = sb.toString();
        k.e("StringBuilder().apply(builderAction).toString()", string);
        throw new SSLPeerUnverifiedException(string);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) obj;
        return k.a(certificatePinner.pins, this.pins) && k.a(certificatePinner.certificateChainCleaner, this.certificateChainCleaner);
    }

    public final List<Pin> findMatchingPins(String str) {
        k.f("hostname", str);
        Set<Pin> set = this.pins;
        List arrayList = u.f11237h;
        for (Object obj : set) {
            if (((Pin) obj).matchesHostname(str)) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                z.b(arrayList).add(obj);
            }
        }
        return arrayList;
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int iHashCode = (this.pins.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        return iHashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
        k.f("certificateChainCleaner", certificateChainCleaner);
        return k.a(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
    }

    @c
    public final void check(String str, Certificate... certificateArr) {
        k.f("hostname", str);
        k.f("peerCertificates", certificateArr);
        check(str, p089q4.k.t0(certificateArr));
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i, g gVar) {
        this(set, (i & 2) != 0 ? null : certificateChainCleaner);
    }
}
