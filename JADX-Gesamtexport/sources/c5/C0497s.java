package c5;

import java.util.Arrays;

/* JADX INFO: renamed from: c5.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0497s extends AbstractC0482d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f7486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7487b;

    @Override // c5.AbstractC0482d0
    public final Object a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f7486a, this.f7487b);
        E4.k.e("copyOf(...)", dArrCopyOf);
        return dArrCopyOf;
    }

    @Override // c5.AbstractC0482d0
    public final void b(int i) {
        double[] dArr = this.f7486a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            double[] dArrCopyOf = Arrays.copyOf(dArr, i);
            E4.k.e("copyOf(...)", dArrCopyOf);
            this.f7486a = dArrCopyOf;
        }
    }

    @Override // c5.AbstractC0482d0
    public final int d() {
        return this.f7487b;
    }
}
