package androidx.datastore.preferences.protobuf;

import B.AbstractC0013g0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0424i extends AbstractC0425j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InputStream f6867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f6868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6872h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6873j = Integer.MAX_VALUE;

    public C0424i(InputStream inputStream) {
        Charset charset = AbstractC0438x.f6926a;
        this.f6867c = inputStream;
        this.f6868d = new byte[4096];
        this.f6869e = 0;
        this.f6871g = 0;
        this.i = 0;
    }

    public final byte[] A(int i) throws IOException {
        if (i == 0) {
            return AbstractC0438x.f6927b;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i3 = this.i;
        int i6 = this.f6871g;
        int i7 = i3 + i6 + i;
        if (i7 - Integer.MAX_VALUE > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i8 = this.f6873j;
        if (i7 > i8) {
            J((i8 - i3) - i6);
            throw InvalidProtocolBufferException.e();
        }
        int i9 = this.f6869e - i6;
        int i10 = i - i9;
        InputStream inputStream = this.f6867c;
        if (i10 >= 4096) {
            try {
                if (i10 > inputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e6) {
                e6.f6797h = true;
                throw e6;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f6868d, this.f6871g, bArr, 0, i9);
        this.i += this.f6869e;
        this.f6871g = 0;
        this.f6869e = 0;
        while (i9 < i) {
            try {
                int i11 = inputStream.read(bArr, i9, i - i9);
                if (i11 == -1) {
                    throw InvalidProtocolBufferException.e();
                }
                this.i += i11;
                i9 += i11;
            } catch (InvalidProtocolBufferException e7) {
                e7.f6797h = true;
                throw e7;
            }
        }
        return bArr;
    }

    public final ArrayList B(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i3 = 0;
            while (i3 < iMin) {
                int i6 = this.f6867c.read(bArr, i3, iMin - i3);
                if (i6 == -1) {
                    throw InvalidProtocolBufferException.e();
                }
                this.i += i6;
                i3 += i6;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int C() throws InvalidProtocolBufferException {
        int i = this.f6871g;
        if (this.f6869e - i < 4) {
            I(4);
            i = this.f6871g;
        }
        this.f6871g = i + 4;
        byte[] bArr = this.f6868d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long D() throws InvalidProtocolBufferException {
        int i = this.f6871g;
        if (this.f6869e - i < 8) {
            I(8);
            i = this.f6871g;
        }
        this.f6871g = i + 8;
        byte[] bArr = this.f6868d;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int E() {
        int i;
        int i3 = this.f6871g;
        int i6 = this.f6869e;
        if (i6 != i3) {
            int i7 = i3 + 1;
            byte[] bArr = this.f6868d;
            byte b6 = bArr[i3];
            if (b6 >= 0) {
                this.f6871g = i7;
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
                this.f6871g = i8;
                return i;
            }
        }
        return (int) G();
    }

    public final long F() {
        long j4;
        long j6;
        long j7;
        long j8;
        int i = this.f6871g;
        int i3 = this.f6869e;
        if (i3 != i) {
            int i6 = i + 1;
            byte[] bArr = this.f6868d;
            byte b6 = bArr[i];
            if (b6 >= 0) {
                this.f6871g = i6;
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
                this.f6871g = i7;
                return j4;
            }
        }
        return G();
    }

    public final long G() throws InvalidProtocolBufferException {
        long j4 = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f6871g == this.f6869e) {
                I(1);
            }
            int i3 = this.f6871g;
            this.f6871g = i3 + 1;
            byte b6 = this.f6868d[i3];
            j4 |= ((long) (b6 & 127)) << i;
            if ((b6 & 128) == 0) {
                return j4;
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    public final void H() {
        int i = this.f6869e + this.f6870f;
        this.f6869e = i;
        int i3 = this.i + i;
        int i6 = this.f6873j;
        if (i3 <= i6) {
            this.f6870f = 0;
            return;
        }
        int i7 = i3 - i6;
        this.f6870f = i7;
        this.f6869e = i - i7;
    }

    public final void I(int i) throws InvalidProtocolBufferException {
        if (K(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.i) - this.f6871g) {
            throw InvalidProtocolBufferException.e();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void J(int i) throws InvalidProtocolBufferException {
        int i3 = this.f6869e;
        int i6 = this.f6871g;
        if (i <= i3 - i6 && i >= 0) {
            this.f6871g = i6 + i;
            return;
        }
        InputStream inputStream = this.f6867c;
        if (i < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i7 = this.i;
        int i8 = i7 + i6;
        int i9 = i8 + i;
        int i10 = this.f6873j;
        if (i9 > i10) {
            J((i10 - i7) - i6);
            throw InvalidProtocolBufferException.e();
        }
        this.i = i8;
        int i11 = i3 - i6;
        this.f6869e = 0;
        this.f6871g = 0;
        while (i11 < i) {
            long j4 = i - i11;
            try {
                try {
                    long jSkip = inputStream.skip(j4);
                    if (jSkip < 0 || jSkip > j4) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i11 += (int) jSkip;
                    }
                } catch (InvalidProtocolBufferException e6) {
                    e6.f6797h = true;
                    throw e6;
                }
            } catch (Throwable th) {
                this.i += i11;
                H();
                throw th;
            }
        }
        this.i += i11;
        H();
        if (i11 >= i) {
            return;
        }
        int i12 = this.f6869e;
        int i13 = i12 - this.f6871g;
        this.f6871g = i12;
        I(1);
        while (true) {
            int i14 = i - i13;
            int i15 = this.f6869e;
            if (i14 <= i15) {
                this.f6871g = i14;
                return;
            } else {
                i13 += i15;
                this.f6871g = i15;
                I(1);
            }
        }
    }

    public final boolean K(int i) throws IOException {
        int i3 = this.f6871g;
        int i6 = i3 + i;
        int i7 = this.f6869e;
        if (i6 <= i7) {
            throw new IllegalStateException(AbstractC0013g0.f(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i8 = this.i;
        if (i <= (Integer.MAX_VALUE - i8) - i3 && i8 + i3 + i <= this.f6873j) {
            byte[] bArr = this.f6868d;
            if (i3 > 0) {
                if (i7 > i3) {
                    System.arraycopy(bArr, i3, bArr, 0, i7 - i3);
                }
                this.i += i3;
                this.f6869e -= i3;
                this.f6871g = 0;
            }
            int i9 = this.f6869e;
            int iMin = Math.min(bArr.length - i9, (Integer.MAX_VALUE - this.i) - i9);
            InputStream inputStream = this.f6867c;
            try {
                int i10 = inputStream.read(bArr, i9, iMin);
                if (i10 == 0 || i10 < -1 || i10 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i10 + "\nThe InputStream implementation is buggy.");
                }
                if (i10 > 0) {
                    this.f6869e += i10;
                    H();
                    if (this.f6869e >= i) {
                        return true;
                    }
                    return K(i);
                }
            } catch (InvalidProtocolBufferException e6) {
                e6.f6797h = true;
                throw e6;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final void a(int i) throws InvalidProtocolBufferException {
        if (this.f6872h != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final int b() {
        return this.i + this.f6871g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final boolean c() {
        return this.f6871g == this.f6869e && !K(1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final void d(int i) {
        this.f6873j = i;
        H();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final int e(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i3 = this.i + this.f6871g + i;
        if (i3 < 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int i6 = this.f6873j;
        if (i3 > i6) {
            throw InvalidProtocolBufferException.e();
        }
        this.f6873j = i3;
        H();
        return i6;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final boolean f() {
        return F() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final C0422g g() throws IOException {
        int iE = E();
        int i = this.f6869e;
        int i3 = this.f6871g;
        int i6 = i - i3;
        byte[] bArr = this.f6868d;
        if (iE <= i6 && iE > 0) {
            C0422g c0422gG = C0422g.g(bArr, i3, iE);
            this.f6871g += iE;
            return c0422gG;
        }
        if (iE == 0) {
            return C0422g.f6857j;
        }
        if (iE < 0) {
            throw InvalidProtocolBufferException.d();
        }
        byte[] bArrA = A(iE);
        if (bArrA != null) {
            return C0422g.g(bArrA, 0, bArrA.length);
        }
        int i7 = this.f6871g;
        int i8 = this.f6869e;
        int length = i8 - i7;
        this.i += i8;
        this.f6871g = 0;
        this.f6869e = 0;
        ArrayList arrayListB = B(iE - length);
        byte[] bArr2 = new byte[iE];
        System.arraycopy(bArr, i7, bArr2, 0, length);
        int size = arrayListB.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayListB.get(i9);
            i9++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C0422g c0422g = C0422g.f6857j;
        return new C0422g(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final double h() {
        return Double.longBitsToDouble(D());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final int i() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final int j() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final long k() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final float l() {
        return Float.intBitsToFloat(C());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final int m() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final long n() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final int o() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final long p() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final int q() {
        int iE = E();
        return (-(iE & 1)) ^ (iE >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final long r() {
        long jF = F();
        return (-(jF & 1)) ^ (jF >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final String s() throws InvalidProtocolBufferException {
        int iE = E();
        byte[] bArr = this.f6868d;
        if (iE > 0) {
            int i = this.f6869e;
            int i3 = this.f6871g;
            if (iE <= i - i3) {
                String str = new String(bArr, i3, iE, AbstractC0438x.f6926a);
                this.f6871g += iE;
                return str;
            }
        }
        if (iE == 0) {
            return "";
        }
        if (iE < 0) {
            throw InvalidProtocolBufferException.d();
        }
        if (iE > this.f6869e) {
            return new String(z(iE), AbstractC0438x.f6926a);
        }
        I(iE);
        String str2 = new String(bArr, this.f6871g, iE, AbstractC0438x.f6926a);
        this.f6871g += iE;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final String t() throws IOException {
        int iE = E();
        int i = this.f6871g;
        int i3 = this.f6869e;
        int i6 = i3 - i;
        byte[] bArrZ = this.f6868d;
        if (iE <= i6 && iE > 0) {
            this.f6871g = i + iE;
        } else {
            if (iE == 0) {
                return "";
            }
            if (iE < 0) {
                throw InvalidProtocolBufferException.d();
            }
            i = 0;
            if (iE <= i3) {
                I(iE);
                this.f6871g = iE;
            } else {
                bArrZ = z(iE);
            }
        }
        return l0.f6895a.o(bArrZ, i, iE);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final int u() throws InvalidProtocolBufferException {
        if (c()) {
            this.f6872h = 0;
            return 0;
        }
        int iE = E();
        this.f6872h = iE;
        if ((iE >>> 3) != 0) {
            return iE;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final int v() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final long w() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425j
    public final boolean x(int i) throws InvalidProtocolBufferException {
        int i3 = i & 7;
        int i6 = 0;
        if (i3 != 0) {
            if (i3 == 1) {
                J(8);
                return true;
            }
            if (i3 == 2) {
                J(E());
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
            J(4);
            return true;
        }
        int i7 = this.f6869e - this.f6871g;
        byte[] bArr = this.f6868d;
        if (i7 >= 10) {
            while (i6 < 10) {
                int i8 = this.f6871g;
                this.f6871g = i8 + 1;
                if (bArr[i8] < 0) {
                    i6++;
                }
            }
            throw InvalidProtocolBufferException.c();
        }
        while (i6 < 10) {
            if (this.f6871g == this.f6869e) {
                I(1);
            }
            int i9 = this.f6871g;
            this.f6871g = i9 + 1;
            if (bArr[i9] < 0) {
                i6++;
            }
        }
        throw InvalidProtocolBufferException.c();
        return true;
    }

    public final byte[] z(int i) throws IOException {
        byte[] bArrA = A(i);
        if (bArrA != null) {
            return bArrA;
        }
        int i3 = this.f6871g;
        int i6 = this.f6869e;
        int length = i6 - i3;
        this.i += i6;
        this.f6871g = 0;
        this.f6869e = 0;
        ArrayList arrayListB = B(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f6868d, i3, bArr, 0, length);
        int size = arrayListB.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayListB.get(i7);
            i7++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }
}
