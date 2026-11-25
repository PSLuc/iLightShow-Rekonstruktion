package l5;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.PublicKey;
import java.util.Arrays;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PublicKey f10395b;

    public d(PublicKey publicKey, b bVar) {
        super(bVar);
        if (publicKey == null) {
            throw new NullPointerException("Public key must not be null");
        }
        this.f10395b = publicKey;
        byte[] encoded = publicKey.getEncoded();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(encoded);
            this.f10394a = "ni:///sha-256;".concat(m5.c.b(messageDigest.digest()));
        } catch (IOException | NoSuchAlgorithmException unused) {
        }
    }

    @Override // l5.a
    public final Principal a(b bVar) {
        return new d(this.f10395b, bVar);
    }

    @Override // java.security.Principal
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        PublicKey publicKey = ((d) obj).f10395b;
        PublicKey publicKey2 = this.f10395b;
        if (publicKey2 == null) {
            if (publicKey != null) {
                return false;
            }
        } else if (!Arrays.equals(publicKey2.getEncoded(), publicKey.getEncoded())) {
            return false;
        }
        return true;
    }

    @Override // java.security.Principal
    public final String getName() {
        return this.f10394a;
    }

    @Override // java.security.Principal
    public final int hashCode() {
        PublicKey publicKey = this.f10395b;
        return 31 + (publicKey == null ? 0 : Arrays.hashCode(publicKey.getEncoded()));
    }

    @Override // java.security.Principal
    public final String toString() {
        return k.u(new StringBuilder("RawPublicKey Identity ["), this.f10394a, "]");
    }
}
