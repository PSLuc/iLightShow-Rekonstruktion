package okhttp3.internal.tls;

import E4.k;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes.dex */
public final class BasicTrustRootIndex implements TrustRootIndex {
    private final Map<X500Principal, Set<X509Certificate>> subjectToCaCerts;

    public BasicTrustRootIndex(X509Certificate... x509CertificateArr) {
        k.f("caCerts", x509CertificateArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = x509CertificateArr.length;
        int i = 0;
        while (i < length) {
            X509Certificate x509Certificate = x509CertificateArr[i];
            i++;
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            k.e("caCert.subjectX500Principal", subjectX500Principal);
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.subjectToCaCerts = linkedHashMap;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof BasicTrustRootIndex) && k.a(((BasicTrustRootIndex) obj).subjectToCaCerts, this.subjectToCaCerts);
        }
        return true;
    }

    @Override // okhttp3.internal.tls.TrustRootIndex
    public X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) {
        k.f("cert", x509Certificate);
        Set<X509Certificate> set = this.subjectToCaCerts.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        for (Object obj2 : set) {
            try {
                x509Certificate.verify(((X509Certificate) obj2).getPublicKey());
                obj = obj2;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public int hashCode() {
        return this.subjectToCaCerts.hashCode();
    }
}
