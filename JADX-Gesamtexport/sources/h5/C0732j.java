package h5;

import B.AbstractC0013g0;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: renamed from: h5.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0732j implements InterfaceC0734l, InterfaceC0733k, Cloneable, ByteChannel, AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public H f9351h;
    public long i;

    @Override // h5.InterfaceC0733k
    public final /* bridge */ /* synthetic */ InterfaceC0733k A(int i) {
        Z(i);
        return this;
    }

    @Override // h5.InterfaceC0733k
    public final /* bridge */ /* synthetic */ InterfaceC0733k B(byte[] bArr) {
        X(bArr);
        return this;
    }

    public final int C(byte[] bArr, int i, int i3) {
        E4.k.f("sink", bArr);
        AbstractC0724b.e(bArr.length, i, i3);
        H h6 = this.f9351h;
        if (h6 == null) {
            return -1;
        }
        int iMin = Math.min(i3, h6.f9323c - h6.f9322b);
        int i6 = h6.f9322b;
        p089q4.k.b0(i, i6, i6 + iMin, h6.f9321a, bArr);
        int i7 = h6.f9322b + iMin;
        h6.f9322b = i7;
        this.i -= (long) iMin;
        if (i7 == h6.f9323c) {
            this.f9351h = h6.a();
            I.a(h6);
        }
        return iMin;
    }

    public final C0730h D(C0730h c0730h) {
        E4.k.f("unsafeCursor", c0730h);
        byte[] bArr = i5.a.f9593a;
        if (c0730h == AbstractC0724b.f9339a) {
            c0730h = new C0730h();
        }
        if (c0730h.f9344h != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        c0730h.f9344h = this;
        c0730h.i = true;
        return c0730h;
    }

    @Override // h5.InterfaceC0733k
    public final InterfaceC0733k E() {
        return this;
    }

    @Override // h5.InterfaceC0734l
    public final long F() throws EOFException {
        byte b6;
        int i;
        byte b7;
        byte b8 = 48;
        long j4 = 0;
        if (this.i == 0) {
            throw new EOFException();
        }
        long j6 = -7;
        long j7 = 0;
        int i3 = 0;
        boolean z5 = false;
        boolean z6 = false;
        loop0: while (true) {
            H h6 = this.f9351h;
            E4.k.c(h6);
            int i6 = h6.f9322b;
            int i7 = h6.f9323c;
            while (true) {
                if (i6 >= i7) {
                    b6 = b8;
                    j4 = j4;
                    i = 1;
                    break;
                }
                i = 1;
                b7 = h6.f9321a[i6];
                b6 = b8;
                if (b7 < b8 || b7 > 57) {
                    j4 = j4;
                    if (b7 != 45 || i3 != 0) {
                        z6 = true;
                        break;
                    }
                    j6--;
                    z5 = true;
                } else {
                    int i8 = 48 - b7;
                    if (j7 < -922337203685477580L || (j7 == -922337203685477580L && i8 < j6)) {
                        break loop0;
                    }
                    j7 = (j7 * 10) + ((long) i8);
                }
                i6++;
                i3++;
                b8 = b6;
                j4 = j4;
            }
            if (i6 == i7) {
                this.f9351h = h6.a();
                I.a(h6);
            } else {
                h6.f9322b = i6;
            }
            if (z6 || this.f9351h == null) {
                long j8 = this.i - ((long) i3);
                this.i = j8;
                if (i3 >= (z5 ? 2 : i)) {
                    return z5 ? j7 : -j7;
                }
                if (j8 == j4) {
                    throw new EOFException();
                }
                String str = z5 ? "Expected a digit" : "Expected a digit or '-'";
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" but was 0x");
                byte bO = o(j4);
                char[] cArr = i5.b.f9594a;
                char c6 = cArr[(bO >> 4) & 15];
                char c7 = cArr[bO & 15];
                char[] cArr2 = new char[2];
                cArr2[0] = c6;
                cArr2[i] = c7;
                sb.append(new String(cArr2));
                throw new NumberFormatException(sb.toString());
            }
            b8 = b6;
            j4 = j4;
        }
        C0732j c0732j = new C0732j();
        c0732j.a0(j7);
        c0732j.Z(b7);
        if (!z5) {
            c0732j.W();
        }
        throw new NumberFormatException("Number too large: ".concat(c0732j.M()));
    }

    public final byte[] G(long j4) throws EOFException {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0013g0.h("byteCount: ", j4).toString());
        }
        if (this.i < j4) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j4];
        g(bArr);
        return bArr;
    }

    @Override // h5.InterfaceC0734l
    public final String H(long j4) throws EOFException {
        if (j4 < 0) {
            throw new IllegalArgumentException(AbstractC0013g0.h("limit < 0: ", j4).toString());
        }
        long j6 = j4 != Long.MAX_VALUE ? j4 + 1 : Long.MAX_VALUE;
        long jS = s((byte) 10, 0L, j6);
        if (jS != -1) {
            return i5.a.b(this, jS);
        }
        if (j6 < this.i && o(j6 - 1) == 13 && o(j6) == 10) {
            return i5.a.b(this, j6);
        }
        C0732j c0732j = new C0732j();
        k(0L, c0732j, Math.min(32, this.i));
        throw new EOFException("\\n not found: limit=" + Math.min(this.i, j4) + " content=" + c0732j.j(c0732j.i).e() + (char) 8230);
    }

    @Override // h5.InterfaceC0734l
    public final short I() throws EOFException {
        if (this.i < 2) {
            throw new EOFException();
        }
        H h6 = this.f9351h;
        E4.k.c(h6);
        int i = h6.f9322b;
        int i3 = h6.f9323c;
        if (i3 - i < 2) {
            return (short) ((W() & 255) | ((W() & 255) << 8));
        }
        int i6 = i + 1;
        byte[] bArr = h6.f9321a;
        int i7 = (bArr[i] & 255) << 8;
        int i8 = i + 2;
        int i9 = (bArr[i6] & 255) | i7;
        this.i -= 2;
        if (i8 == i3) {
            this.f9351h = h6.a();
            I.a(h6);
        } else {
            h6.f9322b = i8;
        }
        return (short) i9;
    }

    public final short J() throws EOFException {
        short sI = I();
        return (short) (((sI & 255) << 8) | ((65280 & sI) >>> 8));
    }

    @Override // h5.InterfaceC0734l
    public final int K(B b6) throws EOFException {
        E4.k.f("options", b6);
        int iC = i5.a.c(this, b6, false);
        if (iC == -1) {
            return -1;
        }
        l(b6.f9309h[iC].d());
        return iC;
    }

    public final String L(long j4, Charset charset) throws EOFException {
        E4.k.f("charset", charset);
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0013g0.h("byteCount: ", j4).toString());
        }
        if (this.i < j4) {
            throw new EOFException();
        }
        if (j4 == 0) {
            return "";
        }
        H h6 = this.f9351h;
        E4.k.c(h6);
        int i = h6.f9322b;
        if (((long) i) + j4 > h6.f9323c) {
            return new String(G(j4), charset);
        }
        int i3 = (int) j4;
        String str = new String(h6.f9321a, i, i3, charset);
        int i6 = h6.f9322b + i3;
        h6.f9322b = i6;
        this.i -= j4;
        if (i6 == h6.f9323c) {
            this.f9351h = h6.a();
            I.a(h6);
        }
        return str;
    }

    public final String M() {
        return L(this.i, M4.a.f3520a);
    }

    @Override // h5.InterfaceC0734l
    public final void N(long j4) throws EOFException {
        if (this.i < j4) {
            throw new EOFException();
        }
    }

    @Override // h5.InterfaceC0733k
    public final /* bridge */ /* synthetic */ InterfaceC0733k O(String str) {
        h0(str);
        return this;
    }

    @Override // h5.InterfaceC0733k
    public final /* bridge */ /* synthetic */ InterfaceC0733k P(long j4) {
        a0(j4);
        return this;
    }

    public final C0735m Q(int i) {
        if (i == 0) {
            return C0735m.f9352k;
        }
        AbstractC0724b.e(this.i, 0L, i);
        H h6 = this.f9351h;
        int i3 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i) {
            E4.k.c(h6);
            int i8 = h6.f9323c;
            int i9 = h6.f9322b;
            if (i8 == i9) {
                throw new AssertionError("s.limit == s.pos");
            }
            i6 += i8 - i9;
            i7++;
            h6 = h6.f9326f;
        }
        byte[][] bArr = new byte[i7][];
        int[] iArr = new int[i7 * 2];
        H h7 = this.f9351h;
        int i10 = 0;
        while (i3 < i) {
            E4.k.c(h7);
            bArr[i10] = h7.f9321a;
            i3 += h7.f9323c - h7.f9322b;
            iArr[i10] = Math.min(i3, i);
            iArr[i10 + i7] = h7.f9322b;
            h7.f9324d = true;
            i10++;
            h7 = h7.f9326f;
        }
        return new J(bArr, iArr);
    }

    @Override // h5.InterfaceC0734l
    public final long R() throws EOFException {
        int i;
        if (this.i == 0) {
            throw new EOFException();
        }
        int i3 = 0;
        boolean z5 = false;
        long j4 = 0;
        do {
            H h6 = this.f9351h;
            E4.k.c(h6);
            int i6 = h6.f9322b;
            int i7 = h6.f9323c;
            while (i6 < i7) {
                byte b6 = h6.f9321a[i6];
                if (b6 >= 48 && b6 <= 57) {
                    i = b6 - 48;
                } else if (b6 >= 97 && b6 <= 102) {
                    i = b6 - 87;
                } else {
                    if (b6 < 65 || b6 > 70) {
                        if (i3 != 0) {
                            z5 = true;
                            break;
                        }
                        char[] cArr = i5.b.f9594a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b6 >> 4) & 15], cArr[b6 & 15]})));
                    }
                    i = b6 - 55;
                }
                if ((j4 & (-1152921504606846976L)) != 0) {
                    C0732j c0732j = new C0732j();
                    c0732j.b0(j4);
                    c0732j.Z(b6);
                    throw new NumberFormatException("Number too large: ".concat(c0732j.M()));
                }
                j4 = (j4 << 4) | ((long) i);
                i6++;
                i3++;
            }
            if (i6 == i7) {
                this.f9351h = h6.a();
                I.a(h6);
            } else {
                h6.f9322b = i6;
            }
            if (z5) {
                break;
            }
        } while (this.f9351h != null);
        this.i -= (long) i3;
        return j4;
    }

    @Override // h5.InterfaceC0734l
    public final String S(Charset charset) {
        E4.k.f("charset", charset);
        return L(this.i, charset);
    }

    public final H T(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        H h6 = this.f9351h;
        if (h6 == null) {
            H hB = I.b();
            this.f9351h = hB;
            hB.f9327g = hB;
            hB.f9326f = hB;
            return hB;
        }
        H h7 = h6.f9327g;
        E4.k.c(h7);
        if (h7.f9323c + i <= 8192 && h7.f9325e) {
            return h7;
        }
        H hB2 = I.b();
        h7.b(hB2);
        return hB2;
    }

    @Override // h5.InterfaceC0734l
    public final InputStream U() {
        return new C0731i(this, 0);
    }

    public final void V(C0735m c0735m) {
        E4.k.f("byteString", c0735m);
        c0735m.r(c0735m.d(), this);
    }

    @Override // h5.InterfaceC0734l
    public final byte W() throws EOFException {
        if (this.i == 0) {
            throw new EOFException();
        }
        H h6 = this.f9351h;
        E4.k.c(h6);
        int i = h6.f9322b;
        int i3 = h6.f9323c;
        int i6 = i + 1;
        byte b6 = h6.f9321a[i];
        this.i--;
        if (i6 != i3) {
            h6.f9322b = i6;
            return b6;
        }
        this.f9351h = h6.a();
        I.a(h6);
        return b6;
    }

    public final void X(byte[] bArr) {
        E4.k.f("source", bArr);
        Y(bArr, 0, bArr.length);
    }

    public final void Y(byte[] bArr, int i, int i3) {
        E4.k.f("source", bArr);
        long j4 = i3;
        AbstractC0724b.e(bArr.length, i, j4);
        int i6 = i3 + i;
        while (i < i6) {
            H hT = T(1);
            int iMin = Math.min(i6 - i, 8192 - hT.f9323c);
            int i7 = i + iMin;
            p089q4.k.b0(hT.f9323c, i, i7, bArr, hT.f9321a);
            hT.f9323c += iMin;
            i = i7;
        }
        this.i += j4;
    }

    public final void Z(int i) {
        H hT = T(1);
        int i3 = hT.f9323c;
        hT.f9323c = i3 + 1;
        hT.f9321a[i3] = (byte) i;
        this.i++;
    }

    @Override // h5.InterfaceC0734l
    public final C0732j a() {
        return this;
    }

    public final void a0(long j4) {
        boolean z5;
        byte[] bArr;
        if (j4 == 0) {
            Z(48);
            return;
        }
        int i = 1;
        if (j4 < 0) {
            j4 = -j4;
            if (j4 < 0) {
                h0("-9223372036854775808");
                return;
            }
            z5 = true;
        } else {
            z5 = false;
        }
        if (j4 < 100000000) {
            if (j4 < 10000) {
                if (j4 >= 100) {
                    i = j4 < 1000 ? 3 : 4;
                } else if (j4 >= 10) {
                    i = 2;
                }
            } else if (j4 < 1000000) {
                i = j4 < 100000 ? 5 : 6;
            } else {
                i = j4 < 10000000 ? 7 : 8;
            }
        } else if (j4 < 1000000000000L) {
            if (j4 < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                i = j4 < 1000000000 ? 9 : 10;
            } else {
                i = j4 < 100000000000L ? 11 : 12;
            }
        } else if (j4 < 1000000000000000L) {
            if (j4 < 10000000000000L) {
                i = 13;
            } else {
                i = j4 < 100000000000000L ? 14 : 15;
            }
        } else if (j4 < 100000000000000000L) {
            i = j4 < 10000000000000000L ? 16 : 17;
        } else {
            i = j4 < 1000000000000000000L ? 18 : 19;
        }
        if (z5) {
            i++;
        }
        H hT = T(i);
        int i3 = hT.f9323c + i;
        while (true) {
            bArr = hT.f9321a;
            if (j4 == 0) {
                break;
            }
            long j6 = 10;
            i3--;
            bArr[i3] = i5.a.f9593a[(int) (j4 % j6)];
            j4 /= j6;
        }
        if (z5) {
            bArr[i3 - 1] = 45;
        }
        hT.f9323c += i;
        this.i += (long) i;
    }

    public final void b() throws EOFException {
        l(this.i);
    }

    public final void b0(long j4) {
        if (j4 == 0) {
            Z(48);
            return;
        }
        long j6 = (j4 >>> 1) | j4;
        long j7 = j6 | (j6 >>> 2);
        long j8 = j7 | (j7 >>> 4);
        long j9 = j8 | (j8 >>> 8);
        long j10 = j9 | (j9 >>> 16);
        long j11 = j10 | (j10 >>> 32);
        long j12 = j11 - ((j11 >>> 1) & 6148914691236517205L);
        long j13 = ((j12 >>> 2) & 3689348814741910323L) + (j12 & 3689348814741910323L);
        long j14 = ((j13 >>> 4) + j13) & 1085102592571150095L;
        long j15 = j14 + (j14 >>> 8);
        long j16 = j15 + (j15 >>> 16);
        int i = (int) ((((j16 & 63) + ((j16 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        H hT = T(i);
        int i3 = hT.f9323c;
        for (int i6 = (i3 + i) - 1; i6 >= i3; i6--) {
            hT.f9321a[i6] = i5.a.f9593a[(int) (15 & j4)];
            j4 >>>= 4;
        }
        hT.f9323c += i;
        this.i += (long) i;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C0732j clone() {
        C0732j c0732j = new C0732j();
        if (this.i == 0) {
            return c0732j;
        }
        H h6 = this.f9351h;
        E4.k.c(h6);
        H hC = h6.c();
        c0732j.f9351h = hC;
        hC.f9327g = hC;
        hC.f9326f = hC;
        for (H h7 = h6.f9326f; h7 != h6; h7 = h7.f9326f) {
            H h8 = hC.f9327g;
            E4.k.c(h8);
            E4.k.c(h7);
            h8.b(h7.c());
        }
        c0732j.i = this.i;
        return c0732j;
    }

    public final void c0(int i) {
        H hT = T(4);
        int i3 = hT.f9323c;
        byte[] bArr = hT.f9321a;
        bArr[i3] = (byte) ((i >>> 24) & 255);
        bArr[i3 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i3 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i3 + 3] = (byte) (i & 255);
        hT.f9323c = i3 + 4;
        this.i += 4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, h5.K
    public final void close() {
    }

    @Override // h5.InterfaceC0733k
    public final /* bridge */ /* synthetic */ InterfaceC0733k d(byte[] bArr, int i, int i3) {
        Y(bArr, i, i3);
        return this;
    }

    public final void d0(long j4) {
        H hT = T(8);
        int i = hT.f9323c;
        byte[] bArr = hT.f9321a;
        bArr[i] = (byte) ((j4 >>> 56) & 255);
        bArr[i + 1] = (byte) ((j4 >>> 48) & 255);
        bArr[i + 2] = (byte) ((j4 >>> 40) & 255);
        bArr[i + 3] = (byte) ((j4 >>> 32) & 255);
        bArr[i + 4] = (byte) ((j4 >>> 24) & 255);
        bArr[i + 5] = (byte) ((j4 >>> 16) & 255);
        bArr[i + 6] = (byte) ((j4 >>> 8) & 255);
        bArr[i + 7] = (byte) (j4 & 255);
        hT.f9323c = i + 8;
        this.i += 8;
    }

    @Override // h5.InterfaceC0734l
    public final boolean e(long j4) {
        return this.i >= j4;
    }

    public final void e0(int i) {
        H hT = T(2);
        int i3 = hT.f9323c;
        byte[] bArr = hT.f9321a;
        bArr[i3] = (byte) ((i >>> 8) & 255);
        bArr[i3 + 1] = (byte) (i & 255);
        hT.f9323c = i3 + 2;
        this.i += 2;
    }

    public final boolean equals(Object obj) {
        boolean z5 = true;
        if (this == obj) {
            return true;
        }
        boolean z6 = false;
        if (!(obj instanceof C0732j)) {
            return false;
        }
        long j4 = this.i;
        C0732j c0732j = (C0732j) obj;
        if (j4 != c0732j.i) {
            return false;
        }
        if (j4 == 0) {
            return true;
        }
        H h6 = this.f9351h;
        E4.k.c(h6);
        H h7 = c0732j.f9351h;
        E4.k.c(h7);
        int i = h6.f9322b;
        int i3 = h7.f9322b;
        long j6 = 0;
        while (j6 < this.i) {
            long jMin = Math.min(h6.f9323c - i, h7.f9323c - i3);
            long j7 = 0;
            while (j7 < jMin) {
                int i6 = i + 1;
                boolean z7 = z5;
                byte b6 = h6.f9321a[i];
                int i7 = i3 + 1;
                boolean z8 = z6;
                if (b6 != h7.f9321a[i3]) {
                    return z8;
                }
                j7++;
                i3 = i7;
                i = i6;
                z5 = z7;
                z6 = z8;
            }
            boolean z9 = z5;
            boolean z10 = z6;
            if (i == h6.f9323c) {
                H h8 = h6.f9326f;
                E4.k.c(h8);
                i = h8.f9322b;
                h6 = h8;
            }
            if (i3 == h7.f9323c) {
                h7 = h7.f9326f;
                E4.k.c(h7);
                i3 = h7.f9322b;
            }
            j6 += jMin;
            z5 = z9;
            z6 = z10;
        }
        return z5;
    }

    @Override // h5.InterfaceC0734l
    public final boolean f(long j4, C0735m c0735m) {
        E4.k.f("bytes", c0735m);
        int iD = c0735m.d();
        if (j4 >= 0 && iD >= 0 && this.i - j4 >= iD && c0735m.d() >= iD) {
            for (int i = 0; i < iD; i++) {
                if (o(((long) i) + j4) == c0735m.i(i)) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f0(String str, int i, int i3, Charset charset) {
        if (i < 0) {
            throw new IllegalArgumentException(p012c.k.r(i, "beginIndex < 0: ").toString());
        }
        if (i3 < i) {
            throw new IllegalArgumentException(AbstractC0013g0.g("endIndex < beginIndex: ", i3, i, " < ").toString());
        }
        if (i3 > str.length()) {
            StringBuilder sbV = p012c.k.v(i3, "endIndex > string.length: ", " > ");
            sbV.append(str.length());
            throw new IllegalArgumentException(sbV.toString().toString());
        }
        if (charset.equals(M4.a.f3520a)) {
            g0(i, str, i3);
            return;
        }
        String strSubstring = str.substring(i, i3);
        E4.k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        byte[] bytes = strSubstring.getBytes(charset);
        E4.k.e("this as java.lang.String).getBytes(charset)", bytes);
        Y(bytes, 0, bytes.length);
    }

    @Override // h5.InterfaceC0733k, h5.K, java.io.Flushable
    public final void flush() {
    }

    @Override // h5.InterfaceC0734l
    public final void g(byte[] bArr) throws EOFException {
        E4.k.f("sink", bArr);
        int i = 0;
        while (i < bArr.length) {
            int iC = C(bArr, i, bArr.length - i);
            if (iC == -1) {
                throw new EOFException();
            }
            i += iC;
        }
    }

    public final void g0(int i, String str, int i3) {
        char cCharAt;
        E4.k.f("string", str);
        if (i < 0) {
            throw new IllegalArgumentException(p012c.k.r(i, "beginIndex < 0: ").toString());
        }
        if (i3 < i) {
            throw new IllegalArgumentException(AbstractC0013g0.g("endIndex < beginIndex: ", i3, i, " < ").toString());
        }
        if (i3 > str.length()) {
            StringBuilder sbV = p012c.k.v(i3, "endIndex > string.length: ", " > ");
            sbV.append(str.length());
            throw new IllegalArgumentException(sbV.toString().toString());
        }
        while (i < i3) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                H hT = T(1);
                int i6 = hT.f9323c - i;
                int iMin = Math.min(i3, 8192 - i6);
                int i7 = i + 1;
                byte[] bArr = hT.f9321a;
                bArr[i + i6] = (byte) cCharAt2;
                while (true) {
                    i = i7;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i7 = i + 1;
                    bArr[i + i6] = (byte) cCharAt;
                }
                int i8 = hT.f9323c;
                int i9 = (i6 + i) - i8;
                hT.f9323c = i8 + i9;
                this.i += (long) i9;
            } else {
                if (cCharAt2 < 2048) {
                    H hT2 = T(2);
                    int i10 = hT2.f9323c;
                    byte[] bArr2 = hT2.f9321a;
                    bArr2[i10] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i10 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    hT2.f9323c = i10 + 2;
                    this.i += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    H hT3 = T(3);
                    int i11 = hT3.f9323c;
                    byte[] bArr3 = hT3.f9321a;
                    bArr3[i11] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i11 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i11 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    hT3.f9323c = i11 + 3;
                    this.i += 3;
                } else {
                    int i12 = i + 1;
                    char cCharAt3 = i12 < i3 ? str.charAt(i12) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        Z(63);
                        i = i12;
                    } else {
                        int i13 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        H hT4 = T(4);
                        int i14 = hT4.f9323c;
                        byte[] bArr4 = hT4.f9321a;
                        bArr4[i14] = (byte) ((i13 >> 18) | 240);
                        bArr4[i14 + 1] = (byte) (((i13 >> 12) & 63) | 128);
                        bArr4[i14 + 2] = (byte) (((i13 >> 6) & 63) | 128);
                        bArr4[i14 + 3] = (byte) ((i13 & 63) | 128);
                        hT4.f9323c = i14 + 4;
                        this.i += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // h5.InterfaceC0733k
    public final /* bridge */ /* synthetic */ InterfaceC0733k h(long j4) {
        b0(j4);
        return this;
    }

    public final void h0(String str) {
        E4.k.f("string", str);
        g0(0, str, str.length());
    }

    public final int hashCode() {
        H h6 = this.f9351h;
        if (h6 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i3 = h6.f9323c;
            for (int i6 = h6.f9322b; i6 < i3; i6++) {
                i = (i * 31) + h6.f9321a[i6];
            }
            h6 = h6.f9326f;
            E4.k.c(h6);
        } while (h6 != this.f9351h);
        return i;
    }

    @Override // h5.InterfaceC0734l
    public final C0735m i() {
        return j(this.i);
    }

    public final void i0(int i) {
        String str;
        int i3 = 0;
        if (i < 128) {
            Z(i);
            return;
        }
        if (i < 2048) {
            H hT = T(2);
            int i6 = hT.f9323c;
            byte[] bArr = hT.f9321a;
            bArr[i6] = (byte) ((i >> 6) | 192);
            bArr[1 + i6] = (byte) ((i & 63) | 128);
            hT.f9323c = i6 + 2;
            this.i += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            Z(63);
            return;
        }
        if (i < 65536) {
            H hT2 = T(3);
            int i7 = hT2.f9323c;
            byte[] bArr2 = hT2.f9321a;
            bArr2[i7] = (byte) ((i >> 12) | 224);
            bArr2[1 + i7] = (byte) (((i >> 6) & 63) | 128);
            bArr2[2 + i7] = (byte) ((i & 63) | 128);
            hT2.f9323c = i7 + 3;
            this.i += 3;
            return;
        }
        if (i <= 1114111) {
            H hT3 = T(4);
            int i8 = hT3.f9323c;
            byte[] bArr3 = hT3.f9321a;
            bArr3[i8] = (byte) ((i >> 18) | 240);
            bArr3[1 + i8] = (byte) (((i >> 12) & 63) | 128);
            bArr3[2 + i8] = (byte) (((i >> 6) & 63) | 128);
            bArr3[3 + i8] = (byte) ((i & 63) | 128);
            hT3.f9323c = i8 + 4;
            this.i += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = i5.b.f9594a;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i3 < 8 && cArr2[i3] == '0') {
                i3++;
            }
            p006b.a.q(i3, 8, 8);
            str = new String(cArr2, i3, 8 - i3);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // h5.InterfaceC0734l
    public final C0735m j(long j4) throws EOFException {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0013g0.h("byteCount: ", j4).toString());
        }
        if (this.i < j4) {
            throw new EOFException();
        }
        if (j4 < 4096) {
            return new C0735m(G(j4));
        }
        C0735m c0735mQ = Q((int) j4);
        l(j4);
        return c0735mQ;
    }

    public final void k(long j4, C0732j c0732j, long j6) {
        E4.k.f("out", c0732j);
        long j7 = j4;
        AbstractC0724b.e(this.i, j7, j6);
        if (j6 == 0) {
            return;
        }
        c0732j.i += j6;
        H h6 = this.f9351h;
        while (true) {
            E4.k.c(h6);
            long j8 = h6.f9323c - h6.f9322b;
            if (j7 < j8) {
                break;
            }
            j7 -= j8;
            h6 = h6.f9326f;
        }
        long j9 = j6;
        while (j9 > 0) {
            E4.k.c(h6);
            H hC = h6.c();
            int i = hC.f9322b + ((int) j7);
            hC.f9322b = i;
            hC.f9323c = Math.min(i + ((int) j9), hC.f9323c);
            H h7 = c0732j.f9351h;
            if (h7 == null) {
                hC.f9327g = hC;
                hC.f9326f = hC;
                c0732j.f9351h = hC;
            } else {
                H h8 = h7.f9327g;
                E4.k.c(h8);
                h8.b(hC);
            }
            j9 -= (long) (hC.f9323c - hC.f9322b);
            h6 = h6.f9326f;
            j7 = 0;
        }
    }

    @Override // h5.InterfaceC0734l
    public final void l(long j4) throws EOFException {
        while (j4 > 0) {
            H h6 = this.f9351h;
            if (h6 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j4, h6.f9323c - h6.f9322b);
            long j6 = iMin;
            this.i -= j6;
            j4 -= j6;
            int i = h6.f9322b + iMin;
            h6.f9322b = i;
            if (i == h6.f9323c) {
                this.f9351h = h6.a();
                I.a(h6);
            }
        }
    }

    @Override // h5.InterfaceC0733k
    public final InterfaceC0733k m() {
        return this;
    }

    @Override // h5.InterfaceC0733k
    public final /* bridge */ /* synthetic */ InterfaceC0733k n(int i) {
        e0(i);
        return this;
    }

    public final byte o(long j4) {
        AbstractC0724b.e(this.i, j4, 1L);
        H h6 = this.f9351h;
        if (h6 == null) {
            E4.k.c(null);
            throw null;
        }
        long j6 = this.i;
        if (j6 - j4 < j4) {
            while (j6 > j4) {
                h6 = h6.f9327g;
                E4.k.c(h6);
                j6 -= (long) (h6.f9323c - h6.f9322b);
            }
            return h6.f9321a[(int) ((((long) h6.f9322b) + j4) - j6)];
        }
        long j7 = 0;
        while (true) {
            int i = h6.f9323c;
            int i3 = h6.f9322b;
            long j8 = ((long) (i - i3)) + j7;
            if (j8 > j4) {
                return h6.f9321a[(int) ((((long) i3) + j4) - j7)];
            }
            h6 = h6.f9326f;
            E4.k.c(h6);
            j7 = j8;
        }
    }

    @Override // h5.InterfaceC0734l
    public final int p() throws EOFException {
        if (this.i < 4) {
            throw new EOFException();
        }
        H h6 = this.f9351h;
        E4.k.c(h6);
        int i = h6.f9322b;
        int i3 = h6.f9323c;
        if (i3 - i < 4) {
            return (W() & 255) | ((W() & 255) << 24) | ((W() & 255) << 16) | ((W() & 255) << 8);
        }
        byte[] bArr = h6.f9321a;
        int i6 = i + 3;
        int i7 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i8 = i + 4;
        int i9 = i7 | (bArr[i6] & 255);
        this.i -= 4;
        if (i8 != i3) {
            h6.f9322b = i8;
            return i9;
        }
        this.f9351h = h6.a();
        I.a(h6);
        return i9;
    }

    @Override // h5.InterfaceC0734l
    public final G peek() {
        return AbstractC0724b.c(new D(this));
    }

    @Override // h5.InterfaceC0733k
    public final /* bridge */ /* synthetic */ InterfaceC0733k q(int i) {
        c0(i);
        return this;
    }

    @Override // h5.InterfaceC0733k
    public final long r(M m6) {
        E4.k.f("source", m6);
        long j4 = 0;
        while (true) {
            long j6 = m6.read(this, 8192L);
            if (j6 == -1) {
                return j4;
            }
            j4 += j6;
        }
    }

    @Override // h5.M
    public final long read(C0732j c0732j, long j4) {
        E4.k.f("sink", c0732j);
        if (j4 < 0) {
            throw new IllegalArgumentException(AbstractC0013g0.h("byteCount < 0: ", j4).toString());
        }
        long j6 = this.i;
        if (j6 == 0) {
            return -1L;
        }
        if (j4 > j6) {
            j4 = j6;
        }
        c0732j.write(this, j4);
        return j4;
    }

    public final long s(byte b6, long j4, long j6) {
        H h6;
        long j7 = 0;
        if (0 > j4 || j4 > j6) {
            throw new IllegalArgumentException(("size=" + this.i + " fromIndex=" + j4 + " toIndex=" + j6).toString());
        }
        long j8 = this.i;
        if (j6 > j8) {
            j6 = j8;
        }
        if (j4 == j6 || (h6 = this.f9351h) == null) {
            return -1L;
        }
        if (j8 - j4 < j4) {
            while (j8 > j4) {
                h6 = h6.f9327g;
                E4.k.c(h6);
                j8 -= (long) (h6.f9323c - h6.f9322b);
            }
            while (j8 < j6) {
                int iMin = (int) Math.min(h6.f9323c, (((long) h6.f9322b) + j6) - j8);
                for (int i = (int) ((((long) h6.f9322b) + j4) - j8); i < iMin; i++) {
                    if (h6.f9321a[i] == b6) {
                        return ((long) (i - h6.f9322b)) + j8;
                    }
                }
                j8 += (long) (h6.f9323c - h6.f9322b);
                h6 = h6.f9326f;
                E4.k.c(h6);
                j4 = j8;
            }
            return -1L;
        }
        while (true) {
            long j9 = ((long) (h6.f9323c - h6.f9322b)) + j7;
            if (j9 > j4) {
                break;
            }
            h6 = h6.f9326f;
            E4.k.c(h6);
            j7 = j9;
        }
        while (j7 < j6) {
            int iMin2 = (int) Math.min(h6.f9323c, (((long) h6.f9322b) + j6) - j7);
            for (int i3 = (int) ((((long) h6.f9322b) + j4) - j7); i3 < iMin2; i3++) {
                if (h6.f9321a[i3] == b6) {
                    return ((long) (i3 - h6.f9322b)) + j7;
                }
            }
            j7 += (long) (h6.f9323c - h6.f9322b);
            h6 = h6.f9326f;
            E4.k.c(h6);
            j4 = j7;
        }
        return -1L;
    }

    @Override // h5.InterfaceC0733k
    public final /* bridge */ /* synthetic */ InterfaceC0733k t(C0735m c0735m) {
        V(c0735m);
        return this;
    }

    @Override // h5.M
    public final P timeout() {
        return P.NONE;
    }

    public final String toString() {
        long j4 = this.i;
        if (j4 <= 2147483647L) {
            return Q((int) j4).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.i).toString());
    }

    @Override // h5.InterfaceC0734l
    public final long u() throws EOFException {
        if (this.i < 8) {
            throw new EOFException();
        }
        H h6 = this.f9351h;
        E4.k.c(h6);
        int i = h6.f9322b;
        int i3 = h6.f9323c;
        if (i3 - i < 8) {
            return ((((long) p()) & 4294967295L) << 32) | (4294967295L & ((long) p()));
        }
        byte[] bArr = h6.f9321a;
        int i6 = i + 7;
        long j4 = ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i7 = i + 8;
        long j6 = j4 | (((long) bArr[i6]) & 255);
        this.i -= 8;
        if (i7 != i3) {
            h6.f9322b = i7;
            return j6;
        }
        this.f9351h = h6.a();
        I.a(h6);
        return j6;
    }

    public final long v(C0735m c0735m) {
        int i;
        int i3;
        E4.k.f("targetBytes", c0735m);
        H h6 = this.f9351h;
        if (h6 == null) {
            return -1L;
        }
        long j4 = this.i;
        long j6 = 0;
        if (j4 < 0) {
            while (j4 > 0) {
                h6 = h6.f9327g;
                E4.k.c(h6);
                j4 -= (long) (h6.f9323c - h6.f9322b);
            }
            if (c0735m.d() == 2) {
                byte bI = c0735m.i(0);
                byte bI2 = c0735m.i(1);
                while (j4 < this.i) {
                    i = (int) ((((long) h6.f9322b) + j6) - j4);
                    int i6 = h6.f9323c;
                    while (true) {
                        if (i >= i6) {
                            j6 = ((long) (h6.f9323c - h6.f9322b)) + j4;
                            h6 = h6.f9326f;
                            E4.k.c(h6);
                            j4 = j6;
                        } else {
                            byte b6 = h6.f9321a[i];
                            if (b6 == bI || b6 == bI2) {
                                i3 = h6.f9322b;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                return -1L;
            }
            byte[] bArrH = c0735m.h();
            while (j4 < this.i) {
                i = (int) ((((long) h6.f9322b) + j6) - j4);
                int i7 = h6.f9323c;
                while (true) {
                    if (i < i7) {
                        byte b7 = h6.f9321a[i];
                        int length = bArrH.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length) {
                                i++;
                            } else if (b7 == bArrH[i8]) {
                                i3 = h6.f9322b;
                            } else {
                                i8++;
                            }
                        }
                    } else {
                        j6 = ((long) (h6.f9323c - h6.f9322b)) + j4;
                        h6 = h6.f9326f;
                        E4.k.c(h6);
                        j4 = j6;
                    }
                }
            }
            return -1L;
        }
        j4 = 0;
        while (true) {
            long j7 = ((long) (h6.f9323c - h6.f9322b)) + j4;
            if (j7 > 0) {
                break;
            }
            h6 = h6.f9326f;
            E4.k.c(h6);
            j4 = j7;
        }
        if (c0735m.d() == 2) {
            byte bI3 = c0735m.i(0);
            byte bI4 = c0735m.i(1);
            while (j4 < this.i) {
                i = (int) ((((long) h6.f9322b) + j6) - j4);
                int i9 = h6.f9323c;
                while (true) {
                    if (i >= i9) {
                        j6 = ((long) (h6.f9323c - h6.f9322b)) + j4;
                        h6 = h6.f9326f;
                        E4.k.c(h6);
                        j4 = j6;
                    } else {
                        byte b8 = h6.f9321a[i];
                        if (b8 == bI3 || b8 == bI4) {
                            i3 = h6.f9322b;
                        } else {
                            i++;
                        }
                    }
                }
            }
            return -1L;
        }
        byte[] bArrH2 = c0735m.h();
        while (j4 < this.i) {
            i = (int) ((((long) h6.f9322b) + j6) - j4);
            int i10 = h6.f9323c;
            while (true) {
                if (i < i10) {
                    byte b9 = h6.f9321a[i];
                    int length2 = bArrH2.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length2) {
                            i++;
                        } else if (b9 == bArrH2[i11]) {
                            i3 = h6.f9322b;
                        } else {
                            i11++;
                        }
                    }
                } else {
                    j6 = ((long) (h6.f9323c - h6.f9322b)) + j4;
                    h6 = h6.f9326f;
                    E4.k.c(h6);
                    j4 = j6;
                }
            }
        }
        return -1L;
        return ((long) (i - i3)) + j4;
    }

    @Override // h5.InterfaceC0734l
    public final String w() {
        return H(Long.MAX_VALUE);
    }

    @Override // h5.K
    public final void write(C0732j c0732j, long j4) {
        H hB;
        E4.k.f("source", c0732j);
        if (c0732j == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC0724b.e(c0732j.i, 0L, j4);
        while (j4 > 0) {
            H h6 = c0732j.f9351h;
            E4.k.c(h6);
            int i = h6.f9323c;
            H h7 = c0732j.f9351h;
            E4.k.c(h7);
            long j6 = i - h7.f9322b;
            int i3 = 0;
            if (j4 < j6) {
                H h8 = this.f9351h;
                H h9 = h8 != null ? h8.f9327g : null;
                if (h9 != null && h9.f9325e) {
                    if ((((long) h9.f9323c) + j4) - ((long) (h9.f9324d ? 0 : h9.f9322b)) <= 8192) {
                        H h10 = c0732j.f9351h;
                        E4.k.c(h10);
                        h10.d(h9, (int) j4);
                        c0732j.i -= j4;
                        this.i += j4;
                        return;
                    }
                }
                H h11 = c0732j.f9351h;
                E4.k.c(h11);
                int i6 = (int) j4;
                if (i6 <= 0 || i6 > h11.f9323c - h11.f9322b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i6 >= 1024) {
                    hB = h11.c();
                } else {
                    hB = I.b();
                    int i7 = h11.f9322b;
                    p089q4.k.b0(0, i7, i7 + i6, h11.f9321a, hB.f9321a);
                }
                hB.f9323c = hB.f9322b + i6;
                h11.f9322b += i6;
                H h12 = h11.f9327g;
                E4.k.c(h12);
                h12.b(hB);
                c0732j.f9351h = hB;
            }
            H h13 = c0732j.f9351h;
            E4.k.c(h13);
            long j7 = h13.f9323c - h13.f9322b;
            c0732j.f9351h = h13.a();
            H h14 = this.f9351h;
            if (h14 == null) {
                this.f9351h = h13;
                h13.f9327g = h13;
                h13.f9326f = h13;
            } else {
                H h15 = h14.f9327g;
                E4.k.c(h15);
                h15.b(h13);
                H h16 = h13.f9327g;
                if (h16 == h13) {
                    throw new IllegalStateException("cannot compact");
                }
                E4.k.c(h16);
                if (h16.f9325e) {
                    int i8 = h13.f9323c - h13.f9322b;
                    H h17 = h13.f9327g;
                    E4.k.c(h17);
                    int i9 = 8192 - h17.f9323c;
                    H h18 = h13.f9327g;
                    E4.k.c(h18);
                    if (!h18.f9324d) {
                        H h19 = h13.f9327g;
                        E4.k.c(h19);
                        i3 = h19.f9322b;
                    }
                    if (i8 <= i9 + i3) {
                        H h20 = h13.f9327g;
                        E4.k.c(h20);
                        h13.d(h20, i8);
                        h13.a();
                        I.a(h13);
                    }
                }
            }
            c0732j.i -= j7;
            this.i += j7;
            j4 -= j7;
        }
    }

    @Override // h5.InterfaceC0734l
    public final byte[] x() {
        return G(this.i);
    }

    @Override // h5.InterfaceC0734l
    public final void y(C0732j c0732j, long j4) throws EOFException {
        E4.k.f("sink", c0732j);
        long j6 = this.i;
        if (j6 >= j4) {
            c0732j.write(this, j4);
        } else {
            c0732j.write(this, j6);
            throw new EOFException();
        }
    }

    @Override // h5.InterfaceC0734l
    public final boolean z() {
        return this.i == 0;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        E4.k.f("sink", byteBuffer);
        H h6 = this.f9351h;
        if (h6 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), h6.f9323c - h6.f9322b);
        byteBuffer.put(h6.f9321a, h6.f9322b, iMin);
        int i = h6.f9322b + iMin;
        h6.f9322b = i;
        this.i -= (long) iMin;
        if (i == h6.f9323c) {
            this.f9351h = h6.a();
            I.a(h6);
        }
        return iMin;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        E4.k.f("source", byteBuffer);
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            H hT = T(1);
            int iMin = Math.min(i, 8192 - hT.f9323c);
            byteBuffer.get(hT.f9321a, hT.f9323c, iMin);
            i -= iMin;
            hT.f9323c += iMin;
        }
        this.i += (long) iRemaining;
        return iRemaining;
    }
}
