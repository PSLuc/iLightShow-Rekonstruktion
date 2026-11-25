package c5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends AbstractC0482d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f7494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7495b;

    @Override // c5.AbstractC0482d0
    public final Object a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f7494a, this.f7495b);
        E4.k.e("copyOf(...)", iArrCopyOf);
        return new p084p4.r(iArrCopyOf);
    }

    @Override // c5.AbstractC0482d0
    public final void b(int i) {
        int[] iArr = this.f7494a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            E4.k.e("copyOf(...)", iArrCopyOf);
            this.f7494a = iArrCopyOf;
        }
    }

    @Override // c5.AbstractC0482d0
    public final int d() {
        return this.f7495b;
    }
}
