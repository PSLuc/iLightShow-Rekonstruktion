package com.google.android.gms.internal.play_billing;

import B.AbstractC0013g0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0584n0 extends AbstractC0586o0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f7974j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f7975k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f7976l;

    public C0584n0(byte[] bArr, int i, int i3) {
        AbstractC0586o0.m(i, i + i3, bArr.length);
        this.f7974j = bArr;
        this.f7975k = i;
        this.f7976l = i3;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0586o0
    public final byte c(int i) {
        int i3 = this.f7976l;
        if (((i3 - (i + 1)) | i) >= 0) {
            return this.f7974j[this.f7975k + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(p012c.k.r(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0013g0.g("Index > length: ", i, i3, ", "));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0586o0
    public final byte d(int i) {
        return this.f7974j[this.f7975k + i];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0586o0
    public final int g(int i, int i3) {
        return D0.a(i, this.f7974j, this.f7975k, i3);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0586o0
    public final int i() {
        return this.f7976l;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0586o0
    public final AbstractC0586o0 j(int i, int i3) {
        int iM = AbstractC0586o0.m(i, i3, this.f7976l);
        if (iM == 0) {
            return AbstractC0586o0.i;
        }
        return new C0584n0(this.f7974j, this.f7975k + i, iM);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0586o0
    public final void k(C0590q0 c0590q0) {
        c0590q0.S(this.f7974j, this.f7975k, this.f7976l);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0586o0
    public final boolean l(AbstractC0586o0 abstractC0586o0) {
        boolean z5 = abstractC0586o0 instanceof C0588p0;
        if (!z5 && !(abstractC0586o0 instanceof C0584n0)) {
            return abstractC0586o0.l(this);
        }
        int i = abstractC0586o0.i();
        int i3 = this.f7976l;
        if (i3 > i) {
            throw new IllegalArgumentException("Length too large: " + i3 + i3);
        }
        if (i3 > abstractC0586o0.i()) {
            throw new IllegalArgumentException(AbstractC0013g0.g("Ran off end of other: 0, ", i3, abstractC0586o0.i(), ", "));
        }
        byte[] bArr = this.f7974j;
        int i6 = this.f7975k;
        if (z5) {
            return AbstractC0586o0.o(i6, 0, i3, bArr, ((C0588p0) abstractC0586o0).f7982j);
        }
        if (!(abstractC0586o0 instanceof C0584n0)) {
            return abstractC0586o0.j(0, i3).equals(j(i6, i3 + i6));
        }
        C0584n0 c0584n0 = (C0584n0) abstractC0586o0;
        return AbstractC0586o0.o(i6, c0584n0.f7975k, i3, bArr, c0584n0.f7974j);
    }
}
