package c5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class A0 extends AbstractC0482d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f7377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7378b;

    @Override // c5.AbstractC0482d0
    public final Object a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f7377a, this.f7378b);
        E4.k.e("copyOf(...)", sArrCopyOf);
        return new p084p4.w(sArrCopyOf);
    }

    @Override // c5.AbstractC0482d0
    public final void b(int i) {
        short[] sArr = this.f7377a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i);
            E4.k.e("copyOf(...)", sArrCopyOf);
            this.f7377a = sArrCopyOf;
        }
    }

    @Override // c5.AbstractC0482d0
    public final int d() {
        return this.f7378b;
    }
}
