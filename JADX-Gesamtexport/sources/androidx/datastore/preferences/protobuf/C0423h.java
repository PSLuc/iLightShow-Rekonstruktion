package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0423h extends AbstractC0425j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f6860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6865h;
    public int i = Integer.MAX_VALUE;

    public C0423h(byte[] bArr, int i, int i3, boolean z5) {
        this.f6860c = bArr;
        this.f6861d = i3 + i;
        this.f6863f = i;
        this.f6864g = i;
    }

    public final long A() throws InvalidProtocolBufferException {
        int i = this.f6863f;
        if (this.f6861d - i < 8) {
            throw InvalidProtocolBufferException.e();
        }
        this.f6863f = i + 8;
        byte[] bArr = this.f6860c;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int B() {
        int i;
        int i3 = this.f6863f;
        int i6 = this.f6861d;
        if (i6 != i3) {
            int i7 = i3 + 1;
            byte[] bArr = this.f6860c;
            byte b6 = bArr[i3];
            if (b6 >= 0) {
                this.f6863f = i7;
                return b6;
            }
            if (i6 - i7 >= 9) {
                int i8 = i3 + 2;
                int i9 = (bArr[i7] << 7) ^ b6;
                if (i9 < 0) {
                    i = i9 ^ (-128);
                } else {
                    int i10 = i3 + 3;
                    int i11 = (bArr[i8] << 14) ^ i9;
                    if (i11 >= 0) {
                        i = i11 ^ 16256;
                    } else {
                        int i12 = i3 + 4;
                        int i13 = i11 ^ (bArr[i10] << 21);
                        if (i13 < 0) {
                            i = (-2080896) ^ i13;
                        } else {
                            i10 = i3 + 5;
                            byte b7 = bArr[i12];
                            int i14 = (i13 ^ (b7 << 28)) ^ 266354560;
                            if (b7 < 0) {
                                i12 = i3 + 6;
                                if (bArr[i10] < 0) {
                                    i10 = i3 + 7;
                                    if (bArr[i12] < 0) {
                                        i12 = i3 + 8;
                                        if (bArr[i10] < 0) {
                                            i10 = i3 + 9;
                                            if (bArr[i12] < 0) {
                                                int i15 = i3 + 10;
                                                if (bArr[i10] >= 0) {
                                                    i8 = i15;
                                                    i = i14;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i14;
                            }
                            i = i14;
                        }
                        i8 = i12;
                    }
                    i8 = i10;
                }
                this.f6863f = i8;
                return i;
            }
        }
        return (int) D();
    }

    public final long C() {
        long j4;
        long j6;
        long j7;
        long j8;
        int i = this.f6863f;
        int i3 = this.f6861d;
        if (i3 != i) {
            int i6 = i + 1;
            byte[] bArr = this.f6860c;
            byte b6 = bArr[i];
            if (b6 >= 0) {
                this.f6863f = i6;
                return b6;
            }
            if (i3 - i6 >= 9) {
                int i7 = i + 2;
                int i8 = (bArr[i6] << 7) ^ b6;
                if (i8 < 0) {
                    j4 = i8 ^ (-128);
                } else {
                    int i9 = i + 3;
                    int i10 = (bArr[i7] << 14) ^ i8;
                    if (i10 >= 0) {
                        j4 = i10 ^ 16256;
                        i7 = i9;
                    } else {
                        int i11 = i + 4;
                        int i12 = i10 ^ (bArr[i9] << 21);
                        if (i12 < 0) {
                            j8 = (-2080896) ^ i12;
                        } else {
                            long j9 = i12;
                            i7 = i + 5;
                            long j10 = j9 ^ (((long) bArr[i11]) << 28);
                            if (j10 >= 0) {
                                j7 = 266354560;
                            } else {
                                i11 = i + 6;
                                long j11 = j10 ^ (((long) bArr[i7]) << 35);
                                if (j11 < 0) {
                                    j6 = -34093383808L;
                                } else {
                                    i7 = i + 7;
                                    j10 = j11 ^ (((long) bArr[i11]) << 42);
                                    if (j10 >= 0) {
                                        j7 = 4363953127296L;
                                    } else {
                                        i11 = i + 8;
                                        j11 = j10 ^ (((long) bArr[i7]) << 49);
                                        if (j11 < 0) {
                                            j6 = -558586000294016L;
                                        } else {
                                            i7 = i + 9;
                                            long j12 = (j11 ^ (((long) bArr[i11]) << 56)) ^ 71499008037633920L;
                                            if (j12 < 0) {
                                                int i13 = i + 10;
                                                if (bArr[i7] >= 0) {
                                                    i7 = i13;
                                                }
                                            }
                                            j4 = j12;
                                        }
                                    }
                                }
                                j8 = j6 ^ j11;
                            }
                            j4 = j7 ^ j10;
                        }
                        i7 = i11;
                        j4 = j8;
                    }
                }
                this.f6863f = i7;
                return j4;
            }
        }
        return D();
    }

    public final long D() throws InvalidProtocolBufferException {
        long j4 = 0;
        for (int i = 0; i < 64; i += 7) {
            int i3 = this.f6863f;
            if (i3 == this.f6861d) {
                throw InvalidProtocolBufferException.e();
            }
            this.f6863f = i3 + 1;
            byte b6 = this.f6860c[i3];
            j4 |= ((long) (b6 & 127)) << i;
            if ((b6 & 128) == 0) {
                return j4;
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    public final void E() {
        int i = this.f6861d + this.f6862e;
        this.f6861d = i;
        int i3 = i - this.f6864g;
        int i6 = this.i;
        if (i3 <= i6) {
            this.f6862e = 0;
            return;
        }
        int i7 = i3 - i6;
        this.f6862e = i7;
        this.f6861d = i - i7;
    }

    public final void F(int i) throws InvalidProtocolBufferException {
        if (i >= 0) {
            int i3 = this.f6861d;
            int i6 = this.f6863f;
            if (i <= i3 - i6) {
                this.f6863f = i6 + i;
                return;
            }
        }
        if (i >= 0) {
            throw InvalidProtocolBufferException.e();
        }
        throw InvalidProtocolBufferException.d();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final void a(int i) throws InvalidProtocolBufferException {
        if (this.f6865h != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final int b() {
        return this.f6863f - this.f6864g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final boolean c() {
        return this.f6863f == this.f6861d;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final void d(int i) {
        this.i = i;
        E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final int e(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int iB = b() + i;
        if (iB < 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int i3 = this.i;
        if (iB > i3) {
            throw InvalidProtocolBufferException.e();
        }
        this.i = iB;
        E();
        return i3;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final boolean f() {
        return C() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final C0422g g() throws InvalidProtocolBufferException {
        byte[] bArrCopyOfRange;
        int iB = B();
        byte[] bArr = this.f6860c;
        if (iB > 0) {
            int i = this.f6861d;
            int i3 = this.f6863f;
            if (iB <= i - i3) {
                C0422g c0422gG = C0422g.g(bArr, i3, iB);
                this.f6863f += iB;
                return c0422gG;
            }
        }
        if (iB == 0) {
            return C0422g.f6857j;
        }
        if (iB > 0) {
            int i6 = this.f6861d;
            int i7 = this.f6863f;
            if (iB <= i6 - i7) {
                int i8 = iB + i7;
                this.f6863f = i8;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i7, i8);
            } else {
                if (iB <= 0) {
                    throw InvalidProtocolBufferException.e();
                }
                if (iB == 0) {
                    throw InvalidProtocolBufferException.d();
                }
                bArrCopyOfRange = AbstractC0438x.f6927b;
            }
        } else {
            if (iB <= 0) {
                throw InvalidProtocolBufferException.e();
            }
            if (iB == 0) {
                throw InvalidProtocolBufferException.d();
            }
            bArrCopyOfRange = AbstractC0438x.f6927b;
        }
        C0422g c0422g = C0422g.f6857j;
        return new C0422g(bArrCopyOfRange);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final double h() {
        return Double.longBitsToDouble(A());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final int i() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final int j() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final long k() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final float l() {
        return Float.intBitsToFloat(z());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final int m() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final long n() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final int o() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final long p() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final int q() {
        int iB = B();
        return (-(iB & 1)) ^ (iB >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final long r() {
        long jC = C();
        return (-(jC & 1)) ^ (jC >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final String s() throws InvalidProtocolBufferException {
        int iB = B();
        if (iB > 0) {
            int i = this.f6861d;
            int i3 = this.f6863f;
            if (iB <= i - i3) {
                String str = new String(this.f6860c, i3, iB, AbstractC0438x.f6926a);
                this.f6863f += iB;
                return str;
            }
        }
        if (iB == 0) {
            return "";
        }
        if (iB < 0) {
            throw InvalidProtocolBufferException.d();
        }
        throw InvalidProtocolBufferException.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final String t() throws InvalidProtocolBufferException {
        int iB = B();
        if (iB > 0) {
            int i = this.f6861d;
            int i3 = this.f6863f;
            if (iB <= i - i3) {
                String strO = l0.f6895a.o(this.f6860c, i3, iB);
                this.f6863f += iB;
                return strO;
            }
        }
        if (iB == 0) {
            return "";
        }
        if (iB <= 0) {
            throw InvalidProtocolBufferException.d();
        }
        throw InvalidProtocolBufferException.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final int u() throws InvalidProtocolBufferException {
        if (c()) {
            this.f6865h = 0;
            return 0;
        }
        int iB = B();
        this.f6865h = iB;
        if ((iB >>> 3) != 0) {
            return iB;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final int v() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final long w() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final boolean x(int i) throws InvalidProtocolBufferException {
        int i3 = i & 7;
        int i6 = 0;
        if (i3 != 0) {
            if (i3 == 1) {
                F(8);
                return true;
            }
            if (i3 == 2) {
                F(B());
                return true;
            }
            if (i3 == 3) {
                y();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            F(4);
            return true;
        }
        int i7 = this.f6861d - this.f6863f;
        byte[] bArr = this.f6860c;
        if (i7 >= 10) {
            while (i6 < 10) {
                int i8 = this.f6863f;
                this.f6863f = i8 + 1;
                if (bArr[i8] < 0) {
                    i6++;
                }
            }
            throw InvalidProtocolBufferException.c();
        }
        while (i6 < 10) {
            int i9 = this.f6863f;
            if (i9 == this.f6861d) {
                throw InvalidProtocolBufferException.e();
            }
            this.f6863f = i9 + 1;
            if (bArr[i9] < 0) {
                i6++;
            }
        }
        throw InvalidProtocolBufferException.c();
        return true;
    }

    public final int z() throws InvalidProtocolBufferException {
        int i = this.f6863f;
        if (this.f6861d - i < 4) {
            throw InvalidProtocolBufferException.e();
        }
        this.f6863f = i + 4;
        byte[] bArr = this.f6860c;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }
}
