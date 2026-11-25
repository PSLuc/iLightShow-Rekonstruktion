package c5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends AbstractC0482d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f7467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7468b;

    @Override // c5.AbstractC0482d0
    public final Object a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f7467a, this.f7468b);
        E4.k.e("copyOf(...)", sArrCopyOf);
        return sArrCopyOf;
    }

    @Override // c5.AbstractC0482d0
    public final void b(int i) {
        short[] sArr = this.f7467a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i);
            E4.k.e("copyOf(...)", sArrCopyOf);
            this.f7467a = sArrCopyOf;
        }
    }

    @Override // c5.AbstractC0482d0
    public final int d() {
        return this.f7468b;
    }
}
