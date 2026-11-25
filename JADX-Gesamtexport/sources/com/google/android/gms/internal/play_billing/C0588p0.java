package com.google.android.gms.internal.play_billing;

import B.AbstractC0013g0;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0588p0 extends AbstractC0586o0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f7982j;

    public C0588p0(byte[] bArr) {
        bArr.getClass();
        this.f7982j = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0586o0
    public final byte c(int i) {
        return this.f7982j[i];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0586o0
    public final byte d(int i) {
        return this.f7982j[i];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0586o0
    public final int g(int i, int i3) {
        return D0.a(i, this.f7982j, 0, i3);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0586o0
    public final int i() {
        return this.f7982j.length;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0586o0
    public final AbstractC0586o0 j(int i, int i3) {
        byte[] bArr = this.f7982j;
        int iM = AbstractC0586o0.m(0, i3, bArr.length);
        return iM == 0 ? AbstractC0586o0.i : new C0584n0(bArr, 0, iM);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0586o0
    public final void k(C0590q0 c0590q0) {
        byte[] bArr = this.f7982j;
        c0590q0.S(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0586o0
    public final boolean l(AbstractC0586o0 abstractC0586o0) {
        boolean z5 = abstractC0586o0 instanceof C0588p0;
        byte[] bArr = this.f7982j;
        if (z5) {
            return Arrays.equals(bArr, ((C0588p0) abstractC0586o0).f7982j);
        }
        if (!(abstractC0586o0 instanceof C0584n0)) {
            return abstractC0586o0.l(this);
        }
        C0584n0 c0584n0 = (C0584n0) abstractC0586o0;
        int i = c0584n0.f7976l;
        int length = bArr.length;
        if (length > i) {
            throw new IllegalArgumentException("Length too large: " + length + length);
        }
        if (length > i) {
            throw new IllegalArgumentException(AbstractC0013g0.g("Ran off end of other: 0, ", length, c0584n0.f7976l, ", "));
        }
        C0584n0 c0584n1 = (C0584n0) abstractC0586o0;
        return AbstractC0586o0.o(0, c0584n1.f7975k, length, bArr, c0584n1.f7974j);
    }
}
