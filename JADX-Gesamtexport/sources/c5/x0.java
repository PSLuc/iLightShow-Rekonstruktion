package c5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends AbstractC0482d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f7508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7509b;

    @Override // c5.AbstractC0482d0
    public final Object a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f7508a, this.f7509b);
        E4.k.e("copyOf(...)", jArrCopyOf);
        return new p084p4.t(jArrCopyOf);
    }

    @Override // c5.AbstractC0482d0
    public final void b(int i) {
        long[] jArr = this.f7508a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i);
            E4.k.e("copyOf(...)", jArrCopyOf);
            this.f7508a = jArrCopyOf;
        }
    }

    @Override // c5.AbstractC0482d0
    public final int d() {
        return this.f7509b;
    }
}
