package c5;

import java.util.Arrays;

/* JADX INFO: renamed from: c5.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0504z extends AbstractC0482d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f7513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7514b;

    @Override // c5.AbstractC0482d0
    public final Object a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f7513a, this.f7514b);
        E4.k.e("copyOf(...)", fArrCopyOf);
        return fArrCopyOf;
    }

    @Override // c5.AbstractC0482d0
    public final void b(int i) {
        float[] fArr = this.f7513a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i);
            E4.k.e("copyOf(...)", fArrCopyOf);
            this.f7513a = fArrCopyOf;
        }
    }

    @Override // c5.AbstractC0482d0
    public final int d() {
        return this.f7514b;
    }
}
