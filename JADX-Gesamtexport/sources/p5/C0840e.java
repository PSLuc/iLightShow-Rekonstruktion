package p5;

import c5.C0495p;
import java.net.InetSocketAddress;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: renamed from: p5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0840e extends O {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Logger f11040s = LoggerFactory.getLogger((Class<?>) C0840e.class);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0495p f11041t = new C0495p(new Z2.f(28, false));

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final q5.o f11042u = new q5.o(new q5.n(0));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CertPath f11043n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f11044o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final byte[] f11045p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final PublicKey f11046q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f11047r;

    public C0840e(PublicKey publicKey, InetSocketAddress inetSocketAddress) {
        super(inetSocketAddress);
        this.f11043n = null;
        this.f11044o = null;
        byte[] encoded = publicKey == null ? m5.d.f10439d : publicKey.getEncoded();
        this.f11045p = encoded;
        this.f11047r = encoded.length + 3;
        this.f11046q = publicKey;
    }

    @Override // p5.O
    public final byte[] p() {
        int i = 0;
        m5.j jVar = new m5.j(false);
        byte[] bArr = this.f11045p;
        if (bArr == null) {
            jVar.b(this.f11047r - 3, 24);
            ArrayList arrayList = this.f11044o;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                byte[] bArr2 = (byte[]) obj;
                jVar.b(bArr2.length, 24);
                jVar.c(bArr2);
            }
        } else {
            jVar.b(bArr.length, 24);
            jVar.c(bArr);
        }
        return jVar.a();
    }

    @Override // p5.O
    public final int t() {
        return this.f11047r;
    }

    @Override // p5.O
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        CertPath certPath = this.f11043n;
        byte[] bArr = this.f11045p;
        if (bArr == null && certPath != null) {
            sb.append("\t\tCertificate chain length: ");
            sb.append(this.f11047r - 3);
            sb.append(m5.s.f10493b);
            int i = 0;
            for (Certificate certificate : certPath.getCertificates()) {
                sb.append("\t\t\tCertificate Length: ");
                sb.append(((byte[]) this.f11044o.get(i)).length);
                String str = m5.s.f10493b;
                sb.append(str);
                sb.append("\t\t\tCertificate: ");
                sb.append(certificate);
                sb.append(str);
                i++;
            }
        } else if (bArr != null && certPath == null) {
            sb.append("\t\tRaw Public Key: ");
            sb.append(this.f11046q.toString());
            sb.append(m5.s.f10493b);
        }
        return sb.toString();
    }

    @Override // p5.O
    public final P u() {
        return P.CERTIFICATE;
    }

    public C0840e(CertPath certPath, InetSocketAddress inetSocketAddress) {
        super(inetSocketAddress);
        if (certPath != null) {
            PublicKey publicKey = null;
            this.f11045p = null;
            this.f11043n = certPath;
            List<? extends Certificate> certificates = certPath.getCertificates();
            ArrayList arrayList = new ArrayList(certificates.size());
            int i = 3;
            if (!certificates.isEmpty()) {
                try {
                    PublicKey publicKey2 = null;
                    int length = 3;
                    for (Certificate certificate : certificates) {
                        publicKey2 = publicKey2 == null ? certificate.getPublicKey() : publicKey2;
                        byte[] encoded = certificate.getEncoded();
                        arrayList.add(encoded);
                        length += encoded.length + 3;
                    }
                    publicKey = publicKey2;
                    i = length;
                } catch (CertificateEncodingException e6) {
                    f11040s.warn("Could not encode certificate chain", (Throwable) e6);
                    arrayList = null;
                }
            }
            this.f11046q = publicKey;
            this.f11044o = arrayList;
            this.f11047r = i;
            return;
        }
        throw new NullPointerException("Certificate chain must not be null");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.security.cert.CertificateFactory] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List] */
    public C0840e(List list, List list2, InetSocketAddress inetSocketAddress) {
        ?? arrayList;
        int i;
        Logger logger = m5.e.f10443a;
        if (list != null) {
            int size = list.size();
            if (size > 0) {
                if (list2 == null || list2.isEmpty()) {
                    i = size;
                } else {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            i = 0;
                            break;
                        } else {
                            if (list2.contains(((X509Certificate) list.get(i3)).getIssuerX500Principal())) {
                                i = i3 + 1;
                                break;
                            }
                            i3++;
                        }
                    }
                }
                if (size <= 1 || i != size) {
                    size = i;
                } else {
                    size--;
                    X509Certificate x509Certificate = (X509Certificate) list.get(size);
                    if (!x509Certificate.getIssuerX500Principal().equals(x509Certificate.getSubjectX500Principal())) {
                        size = i;
                    }
                }
            }
            if (list != null) {
                if (size <= list.size()) {
                    try {
                        if (list.isEmpty()) {
                            arrayList = list;
                        } else {
                            int size2 = list.size() - 1;
                            X500Principal issuerX500Principal = null;
                            for (int i6 = 0; i6 <= size2; i6++) {
                                X509Certificate x509Certificate2 = (X509Certificate) list.get(i6);
                                Logger logger2 = m5.e.f10443a;
                                logger2.debug("Current Subject DN: {}", x509Certificate2.getSubjectX500Principal().getName());
                                if (issuerX500Principal != null && !issuerX500Principal.equals(x509Certificate2.getSubjectX500Principal())) {
                                    logger2.debug("Actual Issuer DN: {}", x509Certificate2.getSubjectX500Principal().getName());
                                    throw new IllegalArgumentException("Given certificates do not form a chain");
                                }
                                issuerX500Principal = x509Certificate2.getIssuerX500Principal();
                                logger2.debug("Expected Issuer DN: {}", issuerX500Principal.getName());
                                if (issuerX500Principal.equals(x509Certificate2.getSubjectX500Principal()) && i6 != size2) {
                                    throw new IllegalArgumentException("Given certificates do not form a chain, root is not the last!");
                                }
                            }
                            if (size < list.size()) {
                                arrayList = new ArrayList();
                                for (int i7 = 0; i7 < size; i7++) {
                                    arrayList.add(list.get(i7));
                                }
                            } else {
                                arrayList = list;
                            }
                        }
                        this(CertificateFactory.getInstance("X.509").generateCertPath(arrayList), inetSocketAddress);
                        Logger logger3 = f11040s;
                        if (logger3.isDebugEnabled()) {
                            int size3 = this.f11043n.getCertificates().size();
                            if (size3 < list.size()) {
                                logger3.debug("created CERTIFICATE message with truncated certificate chain [length: {}, full-length: {}]", Integer.valueOf(size3), Integer.valueOf(list.size()));
                                return;
                            } else {
                                logger3.debug("created CERTIFICATE message with certificate chain [length: {}]", Integer.valueOf(size3));
                                return;
                            }
                        }
                        return;
                    } catch (CertificateException e6) {
                        throw new IllegalArgumentException("could not create X.509 certificate factory", e6);
                    }
                }
                throw new IllegalArgumentException("size must not be larger then certificate chain!");
            }
            throw new NullPointerException("Certificate chain must not be null!");
        }
        throw new NullPointerException("Certificate chain must not be null!");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0840e(byte[] bArr, InetSocketAddress inetSocketAddress) {
        super(inetSocketAddress);
        Logger logger = f11040s;
        PublicKey publicKeyGeneratePublic = null;
        this.f11043n = null;
        this.f11044o = null;
        this.f11045p = Arrays.copyOf(bArr, bArr.length);
        this.f11047r = bArr.length + 3;
        if (bArr.length > 0) {
            try {
                String strB = m5.b.b(bArr);
                if (strB != null) {
                    q5.s sVar = (q5.s) f11041t.q(strB);
                    if (sVar != null && sVar.a() != null) {
                        publicKeyGeneratePublic = ((KeyFactory) sVar.a()).generatePublic(new X509EncodedKeySpec(bArr));
                    }
                } else {
                    logger.info("Could not reconstruct the peer's public key [{}]", m5.s.a(bArr));
                }
            } catch (IllegalArgumentException e6) {
                logger.warn("Could not reconstruct the peer's public key", (Throwable) e6);
            } catch (GeneralSecurityException e7) {
                logger.warn("Could not reconstruct the peer's public key", (Throwable) e7);
            }
        }
        this.f11046q = publicKeyGeneratePublic;
    }
}
