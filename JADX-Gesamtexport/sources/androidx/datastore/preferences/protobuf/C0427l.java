package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0427l extends p006b.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Logger f6888r = Logger.getLogger(C0427l.class.getName());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f6889s = i0.f6878e;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public D f6890m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final byte[] f6891n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f6892o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6893p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final OutputStream f6894q;

    public C0427l(OutputStream outputStream, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.f6891n = new byte[iMax];
        this.f6892o = iMax;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f6894q = outputStream;
    }

    public static int S(int i, C0422g c0422g) {
        int iU = U(i);
        int size = c0422g.size();
        return V(size) + size + iU;
    }

    public static int T(String str) {
        int length;
        try {
            length = l0.a(str);
        } catch (k0 unused) {
            length = str.getBytes(AbstractC0438x.f6926a).length;
        }
        return V(length) + length;
    }

    public static int U(int i) {
        return V(i << 3);
    }

    public static int V(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int W(long j4) {
        return (640 - (Long.numberOfLeadingZeros(j4) * 9)) >>> 6;
    }

    @Override // p006b.a
    public final void F(byte[] bArr, int i, int i3) throws IOException {
        a0(bArr, i, i3);
    }

    public final void N(int i) {
        int i3 = this.f6893p;
        int i6 = i3 + 1;
        this.f6893p = i6;
        byte[] bArr = this.f6891n;
        bArr[i3] = (byte) (i & 255);
        int i7 = i3 + 2;
        this.f6893p = i7;
        bArr[i6] = (byte) ((i >> 8) & 255);
        int i8 = i3 + 3;
        this.f6893p = i8;
        bArr[i7] = (byte) ((i >> 16) & 255);
        this.f6893p = i3 + 4;
        bArr[i8] = (byte) ((i >> 24) & 255);
    }

    public final void O(long j4) {
        int i = this.f6893p;
        int i3 = i + 1;
        this.f6893p = i3;
        byte[] bArr = this.f6891n;
        bArr[i] = (byte) (j4 & 255);
        int i6 = i + 2;
        this.f6893p = i6;
        bArr[i3] = (byte) ((j4 >> 8) & 255);
        int i7 = i + 3;
        this.f6893p = i7;
        bArr[i6] = (byte) ((j4 >> 16) & 255);
        int i8 = i + 4;
        this.f6893p = i8;
        bArr[i7] = (byte) (255 & (j4 >> 24));
        int i9 = i + 5;
        this.f6893p = i9;
        bArr[i8] = (byte) (((int) (j4 >> 32)) & 255);
        int i10 = i + 6;
        this.f6893p = i10;
        bArr[i9] = (byte) (((int) (j4 >> 40)) & 255);
        int i11 = i + 7;
        this.f6893p = i11;
        bArr[i10] = (byte) (((int) (j4 >> 48)) & 255);
        this.f6893p = i + 8;
        bArr[i11] = (byte) (((int) (j4 >> 56)) & 255);
    }

    public final void P(int i, int i3) {
        Q((i << 3) | i3);
    }

    public final void Q(int i) {
        boolean z5 = f6889s;
        byte[] bArr = this.f6891n;
        if (z5) {
            while ((i & (-128)) != 0) {
                int i3 = this.f6893p;
                this.f6893p = i3 + 1;
                i0.j(bArr, i3, (byte) ((i | 128) & 255));
                i >>>= 7;
            }
            int i6 = this.f6893p;
            this.f6893p = i6 + 1;
            i0.j(bArr, i6, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i7 = this.f6893p;
            this.f6893p = i7 + 1;
            bArr[i7] = (byte) ((i | 128) & 255);
            i >>>= 7;
        }
        int i8 = this.f6893p;
        this.f6893p = i8 + 1;
        bArr[i8] = (byte) i;
    }

    public final void R(long j4) {
        boolean z5 = f6889s;
        byte[] bArr = this.f6891n;
        if (z5) {
            while ((j4 & (-128)) != 0) {
                int i = this.f6893p;
                this.f6893p = i + 1;
                i0.j(bArr, i, (byte) ((((int) j4) | 128) & 255));
                j4 >>>= 7;
            }
            int i3 = this.f6893p;
            this.f6893p = i3 + 1;
            i0.j(bArr, i3, (byte) j4);
            return;
        }
        while ((j4 & (-128)) != 0) {
            int i6 = this.f6893p;
            this.f6893p = i6 + 1;
            bArr[i6] = (byte) ((((int) j4) | 128) & 255);
            j4 >>>= 7;
        }
        int i7 = this.f6893p;
        this.f6893p = i7 + 1;
        bArr[i7] = (byte) j4;
    }

    public final void X() throws IOException {
        this.f6894q.write(this.f6891n, 0, this.f6893p);
        this.f6893p = 0;
    }

    public final void Y(int i) throws IOException {
        if (this.f6892o - this.f6893p < i) {
            X();
        }
    }

    public final void Z(byte b6) throws IOException {
        if (this.f6893p == this.f6892o) {
            X();
        }
        int i = this.f6893p;
        this.f6893p = i + 1;
        this.f6891n[i] = b6;
    }

    public final void a0(byte[] bArr, int i, int i3) throws IOException {
        int i6 = this.f6893p;
        int i7 = this.f6892o;
        int i8 = i7 - i6;
        byte[] bArr2 = this.f6891n;
        if (i8 >= i3) {
            System.arraycopy(bArr, i, bArr2, i6, i3);
            this.f6893p += i3;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i6, i8);
        int i9 = i + i8;
        int i10 = i3 - i8;
        this.f6893p = i7;
        X();
        if (i10 > i7) {
            this.f6894q.write(bArr, i9, i10);
        } else {
            System.arraycopy(bArr, i9, bArr2, 0, i10);
            this.f6893p = i10;
        }
    }

    public final void b0(int i, boolean z5) throws IOException {
        Y(11);
        P(i, 0);
        byte b6 = z5 ? (byte) 1 : (byte) 0;
        int i3 = this.f6893p;
        this.f6893p = i3 + 1;
        this.f6891n[i3] = b6;
    }

    public final void c0(int i, C0422g c0422g) {
        n0(i, 2);
        d0(c0422g);
    }

    public final void d0(C0422g c0422g) throws IOException {
        p0(c0422g.size());
        F(c0422g.i, c0422g.j(), c0422g.size());
    }

    public final void e0(int i, int i3) {
        Y(14);
        P(i, 5);
        N(i3);
    }

    public final void f0(int i) throws IOException {
        Y(4);
        N(i);
    }

    public final void g0(int i, long j4) {
        Y(18);
        P(i, 1);
        O(j4);
    }

    public final void h0(long j4) throws IOException {
        Y(8);
        O(j4);
    }

    public final void i0(int i, int i3) throws IOException {
        Y(20);
        P(i, 0);
        if (i3 >= 0) {
            Q(i3);
        } else {
            R(i3);
        }
    }

    public final void j0(int i) throws IOException {
        if (i >= 0) {
            p0(i);
        } else {
            r0(i);
        }
    }

    public final void k0(int i, AbstractC0416a abstractC0416a, V v6) throws IOException {
        n0(i, 2);
        p0(abstractC0416a.a(v6));
        v6.e(abstractC0416a, this.f6890m);
    }

    public final void l0(int i, String str) throws IOException {
        n0(i, 2);
        m0(str);
    }

    public final void m0(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iV = V(length);
            int i = iV + length;
            int i3 = this.f6892o;
            if (i > i3) {
                byte[] bArr = new byte[length];
                int iT = l0.f6895a.t(0, length, str, bArr);
                p0(iT);
                a0(bArr, 0, iT);
                return;
            }
            if (i > i3 - this.f6893p) {
                X();
            }
            int iV2 = V(str.length());
            int i6 = this.f6893p;
            byte[] bArr2 = this.f6891n;
            try {
                if (iV2 == iV) {
                    int i7 = i6 + iV2;
                    this.f6893p = i7;
                    int iT2 = l0.f6895a.t(i7, i3 - i7, str, bArr2);
                    this.f6893p = i6;
                    Q((iT2 - i6) - iV2);
                    this.f6893p = iT2;
                } else {
                    int iA = l0.a(str);
                    Q(iA);
                    this.f6893p = l0.f6895a.t(this.f6893p, iA, str, bArr2);
                }
            } catch (k0 e6) {
                this.f6893p = i6;
                throw e6;
            } catch (ArrayIndexOutOfBoundsException e7) {
                throw new CodedOutputStream$OutOfSpaceException(e7);
            }
        } catch (k0 e8) {
            f6888r.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e8);
            byte[] bytes = str.getBytes(AbstractC0438x.f6926a);
            try {
                p0(bytes.length);
                F(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e9) {
                throw new CodedOutputStream$OutOfSpaceException(e9);
            }
        }
    }

    public final void n0(int i, int i3) {
        p0((i << 3) | i3);
    }

    public final void o0(int i, int i3) throws IOException {
        Y(20);
        P(i, 0);
        Q(i3);
    }

    public final void p0(int i) throws IOException {
        Y(5);
        Q(i);
    }

    public final void q0(int i, long j4) {
        Y(20);
        P(i, 0);
        R(j4);
    }

    public final void r0(long j4) throws IOException {
        Y(10);
        R(j4);
    }
}
