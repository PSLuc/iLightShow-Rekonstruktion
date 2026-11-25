package c5;

import java.util.Arrays;

/* JADX INFO: renamed from: c5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0481d extends AbstractC0482d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean[] f7443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7444b;

    @Override // c5.AbstractC0482d0
    public final Object a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f7443a, this.f7444b);
        E4.k.e("copyOf(...)", zArrCopyOf);
        return zArrCopyOf;
    }

    @Override // c5.AbstractC0482d0
    public final void b(int i) {
        boolean[] zArr = this.f7443a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, i);
            E4.k.e("copyOf(...)", zArrCopyOf);
            this.f7443a = zArrCopyOf;
        }
    }

    @Override // c5.AbstractC0482d0
    public final int d() {
        return this.f7444b;
    }
}
