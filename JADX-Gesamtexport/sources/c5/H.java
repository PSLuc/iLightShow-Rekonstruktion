package c5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class H extends AbstractC0482d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f7397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7398b;

    @Override // c5.AbstractC0482d0
    public final Object a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f7397a, this.f7398b);
        E4.k.e("copyOf(...)", iArrCopyOf);
        return iArrCopyOf;
    }

    @Override // c5.AbstractC0482d0
    public final void b(int i) {
        int[] iArr = this.f7397a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            E4.k.e("copyOf(...)", iArrCopyOf);
            this.f7397a = iArrCopyOf;
        }
    }

    @Override // c5.AbstractC0482d0
    public final int d() {
        return this.f7398b;
    }
}
