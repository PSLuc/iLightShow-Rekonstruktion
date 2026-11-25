package l5;

import java.security.Principal;
import java.security.cert.CertPath;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CertPath f10396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X509Certificate f10397b;

    public e(CertPath certPath, b bVar) {
        super(bVar);
        if (!"X.509".equals(certPath.getType())) {
            throw new IllegalArgumentException("Cert path must contain X.509 certificates only");
        }
        if (certPath.getCertificates().isEmpty()) {
            throw new IllegalArgumentException("Cert path must not be empty");
        }
        this.f10396a = certPath;
        this.f10397b = (X509Certificate) certPath.getCertificates().get(0);
    }

    @Override // l5.a
    public final Principal a(b bVar) {
        return new e(this.f10396a, bVar);
    }

    @Override // java.security.Principal
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            return this.f10397b.equals(((e) obj).f10397b);
        }
        return false;
    }

    @Override // java.security.Principal
    public final String getName() {
        return this.f10397b.getSubjectX500Principal().getName();
    }

    @Override // java.security.Principal
    public final int hashCode() {
        return this.f10397b.hashCode();
    }

    @Override // java.security.Principal
    public final String toString() {
        return "x509 [" + getName() + "]";
    }
}
