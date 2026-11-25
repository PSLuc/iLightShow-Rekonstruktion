package W2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f5591c;

    public l(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f5591c = bArr;
    }

    @Override // W2.k
    public final byte[] e() {
        return this.f5591c;
    }
}
