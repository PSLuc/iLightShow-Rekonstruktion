package c5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends AbstractC0482d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f7484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7485b;

    @Override // c5.AbstractC0482d0
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f7484a, this.f7485b);
        E4.k.e("copyOf(...)", bArrCopyOf);
        return new p084p4.p(bArrCopyOf);
    }

    @Override // c5.AbstractC0482d0
    public final void b(int i) {
        byte[] bArr = this.f7484a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
            E4.k.e("copyOf(...)", bArrCopyOf);
            this.f7484a = bArrCopyOf;
        }
    }

    @Override // c5.AbstractC0482d0
    public final int d() {
        return this.f7485b;
    }
}
