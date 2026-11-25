package c5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class M extends AbstractC0482d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f7404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7405b;

    @Override // c5.AbstractC0482d0
    public final Object a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f7404a, this.f7405b);
        E4.k.e("copyOf(...)", jArrCopyOf);
        return jArrCopyOf;
    }

    @Override // c5.AbstractC0482d0
    public final void b(int i) {
        long[] jArr = this.f7404a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i);
            E4.k.e("copyOf(...)", jArrCopyOf);
            this.f7404a = jArrCopyOf;
        }
    }

    @Override // c5.AbstractC0482d0
    public final int d() {
        return this.f7405b;
    }
}
