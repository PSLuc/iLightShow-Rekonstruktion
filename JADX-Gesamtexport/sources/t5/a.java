package t5;

import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.security.auth.Destroyable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements AlgorithmParameterSpec, Destroyable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f12595h;
    public boolean i;

    public a(byte[] bArr, int i, int i3) {
        if (bArr.length == 0) {
            throw new IllegalArgumentException("IV is empty");
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException("len is negative");
        }
        if (bArr.length - i < i3) {
            throw new IllegalArgumentException("Invalid offset/length combination");
        }
        this.f12595h = Arrays.copyOfRange(bArr, i, i3 + i);
    }

    public final byte[] a(int i, byte[] bArr) {
        if (this.i) {
            throw new IllegalStateException("secret destroyed!");
        }
        if (bArr == null) {
            throw new NullPointerException("explicit nonce missing");
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("IV key");
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("len is negative");
        }
        if (bArr.length < i) {
            throw new IllegalArgumentException("Invalid offset/length combination");
        }
        byte[] bArr2 = this.f12595h;
        byte[] bArrCopyOf = Arrays.copyOf(bArr2, bArr2.length + i);
        System.arraycopy(bArr, 0, bArrCopyOf, bArr2.length, i);
        return bArrCopyOf;
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        Arrays.fill(this.f12595h, (byte) 0);
        this.i = true;
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.i;
    }
}
