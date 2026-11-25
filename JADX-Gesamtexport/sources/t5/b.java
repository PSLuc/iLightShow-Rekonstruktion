package t5;

import java.security.MessageDigest;
import java.security.spec.KeySpec;
import java.util.Arrays;
import javax.crypto.SecretKey;
import javax.security.auth.Destroyable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements KeySpec, SecretKey, Destroyable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f12596h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12597j;

    public b(int i, int i3, String str, byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Key missing");
        }
        if (str == null) {
            throw new NullPointerException("Algorithm missing");
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("Empty key");
        }
        if (bArr.length - i < i3) {
            throw new IllegalArgumentException("Invalid offset/length combination");
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException("len is negative");
        }
        this.f12596h = Arrays.copyOfRange(bArr, i, i3 + i);
        this.i = str;
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        Arrays.fill(this.f12596h, (byte) 0);
        this.f12597j = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SecretKey) {
            SecretKey secretKey = (SecretKey) obj;
            if (this.i.equalsIgnoreCase(secretKey.getAlgorithm())) {
                if (this.f12597j) {
                    throw new IllegalStateException("secret destroyed!");
                }
                byte[] encoded = secretKey.getEncoded();
                boolean zIsEqual = MessageDigest.isEqual(this.f12596h, encoded);
                Arrays.fill(encoded, (byte) 0);
                return zIsEqual;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.i;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (this.f12597j) {
            throw new IllegalStateException("secret destroyed!");
        }
        return (byte[]) this.f12596h.clone();
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "RAW";
    }

    public final int hashCode() {
        return 0;
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.f12597j;
    }
}
