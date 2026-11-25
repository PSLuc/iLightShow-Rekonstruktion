package c5;

import java.util.Arrays;

/* JADX INFO: renamed from: c5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0486g extends AbstractC0482d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f7450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7451b;

    @Override // c5.AbstractC0482d0
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f7450a, this.f7451b);
        E4.k.e("copyOf(...)", bArrCopyOf);
        return bArrCopyOf;
    }

    @Override // c5.AbstractC0482d0
    public final void b(int i) {
        byte[] bArr = this.f7450a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
            E4.k.e("copyOf(...)", bArrCopyOf);
            this.f7450a = bArrCopyOf;
        }
    }

    @Override // c5.AbstractC0482d0
    public final int d() {
        return this.f7451b;
    }
}
