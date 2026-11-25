package c5;

import java.util.Arrays;

/* JADX INFO: renamed from: c5.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0492m extends AbstractC0482d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f7465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7466b;

    @Override // c5.AbstractC0482d0
    public final Object a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f7465a, this.f7466b);
        E4.k.e("copyOf(...)", cArrCopyOf);
        return cArrCopyOf;
    }

    @Override // c5.AbstractC0482d0
    public final void b(int i) {
        char[] cArr = this.f7465a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i);
            E4.k.e("copyOf(...)", cArrCopyOf);
            this.f7465a = cArrCopyOf;
        }
    }

    @Override // c5.AbstractC0482d0
    public final int d() {
        return this.f7466b;
    }
}
