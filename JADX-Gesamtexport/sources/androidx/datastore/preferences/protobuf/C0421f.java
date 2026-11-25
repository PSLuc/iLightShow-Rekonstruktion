package androidx.datastore.preferences.protobuf;

import B.AbstractC0013g0;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0421f extends C0422g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f6854l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6855m;

    public C0421f(byte[] bArr, int i, int i3) {
        super(bArr);
        C0422g.d(i, i + i3, bArr.length);
        this.f6854l = i;
        this.f6855m = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.C0422g
    public final byte c(int i) {
        int i3 = this.f6855m;
        if (((i3 - (i + 1)) | i) >= 0) {
            return this.i[this.f6854l + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(p012c.k.r(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0013g0.g("Index > length: ", i, i3, ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.C0422g
    public final void i(int i, byte[] bArr) {
        System.arraycopy(this.i, this.f6854l, bArr, 0, i);
    }

    @Override // androidx.datastore.preferences.protobuf.C0422g
    public final int j() {
        return this.f6854l;
    }

    @Override // androidx.datastore.preferences.protobuf.C0422g
    public final byte k(int i) {
        return this.i[this.f6854l + i];
    }

    @Override // androidx.datastore.preferences.protobuf.C0422g
    public final int size() {
        return this.f6855m;
    }
}
