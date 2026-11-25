package com.google.protobuf;

import B.AbstractC0013g0;

/* JADX INFO: renamed from: com.google.protobuf.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0638f extends C0639g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f8209l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f8210m;

    public C0638f(byte[] bArr, int i, int i3) {
        super(bArr);
        AbstractC0640h.d(i, i + i3, bArr.length);
        this.f8209l = i;
        this.f8210m = i3;
    }

    @Override // com.google.protobuf.C0639g, com.google.protobuf.AbstractC0640h
    public final byte c(int i) {
        int i3 = this.f8210m;
        if (((i3 - (i + 1)) | i) >= 0) {
            return this.f8212k[this.f8209l + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(p012c.k.r(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0013g0.g("Index > length: ", i, i3, ", "));
    }

    @Override // com.google.protobuf.C0639g, com.google.protobuf.AbstractC0640h
    public final void i(int i, byte[] bArr) {
        System.arraycopy(this.f8212k, this.f8209l, bArr, 0, i);
    }

    @Override // com.google.protobuf.C0639g
    public final int j() {
        return this.f8209l;
    }

    @Override // com.google.protobuf.C0639g
    public final byte k(int i) {
        return this.f8212k[this.f8209l + i];
    }

    @Override // com.google.protobuf.C0639g, com.google.protobuf.AbstractC0640h
    public final int size() {
        return this.f8210m;
    }
}
