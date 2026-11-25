package h5;

import B.AbstractC0013g0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public final class J extends C0735m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient byte[][] f9331l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient int[] f9332m;

    public J(byte[][] bArr, int[] iArr) {
        super(C0735m.f9352k.f9353h);
        this.f9331l = bArr;
        this.f9332m = iArr;
    }

    @Override // h5.C0735m
    public final String a() {
        return t().a();
    }

    @Override // h5.C0735m
    public final C0735m c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f9331l;
        int length = bArr.length;
        int i = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f9332m;
            int i6 = iArr[length + i];
            int i7 = iArr[i];
            messageDigest.update(bArr[i], i6, i7 - i3);
            i++;
            i3 = i7;
        }
        byte[] bArrDigest = messageDigest.digest();
        E4.k.e("digestBytes", bArrDigest);
        return new C0735m(bArrDigest);
    }

    @Override // h5.C0735m
    public final int d() {
        return this.f9332m[this.f9331l.length - 1];
    }

    @Override // h5.C0735m
    public final String e() {
        return t().e();
    }

    @Override // h5.C0735m
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0735m) {
            C0735m c0735m = (C0735m) obj;
            if (c0735m.d() == d() && l(0, c0735m, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // h5.C0735m
    public final int f(int i, byte[] bArr) {
        E4.k.f("other", bArr);
        return t().f(i, bArr);
    }

    @Override // h5.C0735m
    public final byte[] h() {
        return s();
    }

    @Override // h5.C0735m
    public final int hashCode() {
        int i = this.i;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f9331l;
        int length = bArr.length;
        int i3 = 0;
        int i6 = 1;
        int i7 = 0;
        while (i3 < length) {
            int[] iArr = this.f9332m;
            int i8 = iArr[length + i3];
            int i9 = iArr[i3];
            byte[] bArr2 = bArr[i3];
            int i10 = (i9 - i7) + i8;
            while (i8 < i10) {
                i6 = (i6 * 31) + bArr2[i8];
                i8++;
            }
            i3++;
            i7 = i9;
        }
        this.i = i6;
        return i6;
    }

    @Override // h5.C0735m
    public final byte i(int i) {
        byte[][] bArr = this.f9331l;
        int length = bArr.length - 1;
        int[] iArr = this.f9332m;
        AbstractC0724b.e(iArr[length], i, 1L);
        int iF = i5.b.f(this, i);
        return bArr[iF][(i - (iF == 0 ? 0 : iArr[iF - 1])) + iArr[bArr.length + iF]];
    }

    @Override // h5.C0735m
    public final int j(byte[] bArr) {
        E4.k.f("other", bArr);
        return t().j(bArr);
    }

    @Override // h5.C0735m
    public final boolean l(int i, C0735m c0735m, int i3) {
        E4.k.f("other", c0735m);
        if (i >= 0 && i <= d() - i3) {
            int i6 = i3 + i;
            int iF = i5.b.f(this, i);
            int i7 = 0;
            while (i < i6) {
                int[] iArr = this.f9332m;
                int i8 = iF == 0 ? 0 : iArr[iF - 1];
                int i9 = iArr[iF] - i8;
                byte[][] bArr = this.f9331l;
                int i10 = iArr[bArr.length + iF];
                int iMin = Math.min(i6, i9 + i8) - i;
                if (c0735m.m(i7, bArr[iF], (i - i8) + i10, iMin)) {
                    i7 += iMin;
                    i += iMin;
                    iF++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // h5.C0735m
    public final boolean m(int i, byte[] bArr, int i3, int i6) {
        E4.k.f("other", bArr);
        if (i < 0 || i > d() - i6 || i3 < 0 || i3 > bArr.length - i6) {
            return false;
        }
        int i7 = i6 + i;
        int iF = i5.b.f(this, i);
        while (i < i7) {
            int[] iArr = this.f9332m;
            int i8 = iF == 0 ? 0 : iArr[iF - 1];
            int i9 = iArr[iF] - i8;
            byte[][] bArr2 = this.f9331l;
            int i10 = iArr[bArr2.length + iF];
            int iMin = Math.min(i7, i9 + i8) - i;
            if (!AbstractC0724b.a((i - i8) + i10, i3, iMin, bArr2[iF], bArr)) {
                return false;
            }
            i3 += iMin;
            i += iMin;
            iF++;
        }
        return true;
    }

    @Override // h5.C0735m
    public final C0735m n(int i, int i3) {
        if (i3 == -1234567890) {
            i3 = d();
        }
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0013g0.f(i, "beginIndex=", " < 0").toString());
        }
        if (i3 > d()) {
            StringBuilder sbV = p012c.k.v(i3, "endIndex=", " > length(");
            sbV.append(d());
            sbV.append(')');
            throw new IllegalArgumentException(sbV.toString().toString());
        }
        int i6 = i3 - i;
        if (i6 < 0) {
            throw new IllegalArgumentException(AbstractC0013g0.g("endIndex=", i3, i, " < beginIndex=").toString());
        }
        if (i == 0 && i3 == d()) {
            return this;
        }
        if (i == i3) {
            return C0735m.f9352k;
        }
        int iF = i5.b.f(this, i);
        int iF2 = i5.b.f(this, i3 - 1);
        byte[][] bArr = this.f9331l;
        byte[][] bArr2 = (byte[][]) p089q4.k.i0(iF, iF2 + 1, bArr);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f9332m;
        if (iF <= iF2) {
            int i7 = iF;
            int i8 = 0;
            while (true) {
                iArr[i8] = Math.min(iArr2[i7] - i, i6);
                int i9 = i8 + 1;
                iArr[i8 + bArr2.length] = iArr2[bArr.length + i7];
                if (i7 == iF2) {
                    break;
                }
                i7++;
                i8 = i9;
            }
        }
        int i10 = iF != 0 ? iArr2[iF - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i10) + iArr[length];
        return new J(bArr2, iArr);
    }

    @Override // h5.C0735m
    public final C0735m p() {
        return t().p();
    }

    @Override // h5.C0735m
    public final void r(int i, C0732j c0732j) {
        E4.k.f("buffer", c0732j);
        int iF = i5.b.f(this, 0);
        int i3 = 0;
        while (i3 < i) {
            int[] iArr = this.f9332m;
            int i6 = iF == 0 ? 0 : iArr[iF - 1];
            int i7 = iArr[iF] - i6;
            byte[][] bArr = this.f9331l;
            int i8 = iArr[bArr.length + iF];
            int iMin = Math.min(i, i7 + i6) - i3;
            int i9 = (i3 - i6) + i8;
            H h6 = new H(bArr[iF], i9, i9 + iMin, true, false);
            H h7 = c0732j.f9351h;
            if (h7 == null) {
                h6.f9327g = h6;
                h6.f9326f = h6;
                c0732j.f9351h = h6;
            } else {
                H h8 = h7.f9327g;
                E4.k.c(h8);
                h8.b(h6);
            }
            i3 += iMin;
            iF++;
        }
        c0732j.i += (long) i;
    }

    public final byte[] s() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.f9331l;
        int length = bArr2.length;
        int i = 0;
        int i3 = 0;
        int i6 = 0;
        while (i < length) {
            int[] iArr = this.f9332m;
            int i7 = iArr[length + i];
            int i8 = iArr[i];
            int i9 = i8 - i3;
            p089q4.k.b0(i6, i7, i7 + i9, bArr2[i], bArr);
            i6 += i9;
            i++;
            i3 = i8;
        }
        return bArr;
    }

    public final C0735m t() {
        return new C0735m(s());
    }

    @Override // h5.C0735m
    public final String toString() {
        return t().toString();
    }
}
