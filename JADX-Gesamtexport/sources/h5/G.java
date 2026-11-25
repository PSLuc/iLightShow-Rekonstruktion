package h5;

import B.AbstractC0013g0;
import S1.V;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class G implements InterfaceC0734l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M f9319h;
    public final C0732j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9320j;

    public G(M m6) {
        E4.k.f("source", m6);
        this.f9319h = m6;
        this.i = new C0732j();
    }

    @Override // h5.InterfaceC0734l
    public final long F() {
        C0732j c0732j;
        N(1L);
        long j4 = 0;
        while (true) {
            long j6 = j4 + 1;
            boolean zE = e(j6);
            c0732j = this.i;
            if (!zE) {
                break;
            }
            byte bO = c0732j.o(j4);
            if ((bO < 48 || bO > 57) && !(j4 == 0 && bO == 45)) {
                if (j4 != 0) {
                    break;
                }
                V.t(16);
                V.t(16);
                String string = Integer.toString(bO, 16);
                E4.k.e("toString(this, checkRadix(radix))", string);
                throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
            }
            j4 = j6;
        }
        return c0732j.F();
    }

    @Override // h5.InterfaceC0734l
    public final String H(long j4) throws EOFException {
        if (j4 < 0) {
            throw new IllegalArgumentException(AbstractC0013g0.h("limit < 0: ", j4).toString());
        }
        long j6 = j4 == Long.MAX_VALUE ? Long.MAX_VALUE : j4 + 1;
        long jB = b((byte) 10, 0L, j6);
        C0732j c0732j = this.i;
        if (jB != -1) {
            return i5.a.b(c0732j, jB);
        }
        if (j6 < Long.MAX_VALUE && e(j6) && c0732j.o(j6 - 1) == 13 && e(j6 + 1) && c0732j.o(j6) == 10) {
            return i5.a.b(c0732j, j6);
        }
        C0732j c0732j2 = new C0732j();
        c0732j.k(0L, c0732j2, Math.min(32, c0732j.i));
        throw new EOFException("\\n not found: limit=" + Math.min(c0732j.i, j4) + " content=" + c0732j2.j(c0732j2.i).e() + (char) 8230);
    }

    @Override // h5.InterfaceC0734l
    public final short I() {
        N(2L);
        return this.i.I();
    }

    @Override // h5.InterfaceC0734l
    public final int K(B b6) throws EOFException {
        C0732j c0732j;
        E4.k.f("options", b6);
        if (this.f9320j) {
            throw new IllegalStateException("closed");
        }
        do {
            c0732j = this.i;
            int iC = i5.a.c(c0732j, b6, true);
            if (iC != -2) {
                if (iC == -1) {
                    break;
                }
                c0732j.l(b6.f9309h[iC].d());
                return iC;
            }
        } while (this.f9319h.read(c0732j, 8192L) != -1);
        return -1;
    }

    @Override // h5.InterfaceC0734l
    public final void N(long j4) {
        if (!e(j4)) {
            throw new EOFException();
        }
    }

    @Override // h5.InterfaceC0734l
    public final long R() {
        C0732j c0732j;
        N(1L);
        int i = 0;
        while (true) {
            int i3 = i + 1;
            boolean zE = e(i3);
            c0732j = this.i;
            if (!zE) {
                break;
            }
            byte bO = c0732j.o(i);
            if ((bO < 48 || bO > 57) && ((bO < 97 || bO > 102) && (bO < 65 || bO > 70))) {
                if (i != 0) {
                    break;
                }
                V.t(16);
                V.t(16);
                String string = Integer.toString(bO, 16);
                E4.k.e("toString(this, checkRadix(radix))", string);
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
            }
            i = i3;
        }
        return c0732j.R();
    }

    @Override // h5.InterfaceC0734l
    public final String S(Charset charset) {
        E4.k.f("charset", charset);
        M m6 = this.f9319h;
        C0732j c0732j = this.i;
        c0732j.r(m6);
        return c0732j.S(charset);
    }

    @Override // h5.InterfaceC0734l
    public final InputStream U() {
        return new C0731i(this, 1);
    }

    @Override // h5.InterfaceC0734l
    public final byte W() {
        N(1L);
        return this.i.W();
    }

    @Override // h5.InterfaceC0734l
    public final C0732j a() {
        return this.i;
    }

    public final long b(byte b6, long j4, long j6) {
        if (this.f9320j) {
            throw new IllegalStateException("closed");
        }
        if (0 > j6) {
            throw new IllegalArgumentException(AbstractC0013g0.h("fromIndex=0 toIndex=", j6).toString());
        }
        long jMax = 0;
        while (jMax < j6) {
            C0732j c0732j = this.i;
            byte b7 = b6;
            long j7 = j6;
            long jS = c0732j.s(b7, jMax, j7);
            if (jS != -1) {
                return jS;
            }
            long j8 = c0732j.i;
            if (j8 >= j7 || this.f9319h.read(c0732j, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j8);
            b6 = b7;
            j6 = j7;
        }
        return -1L;
    }

    public final int c() {
        N(4L);
        int iP = this.i.p();
        return ((iP & 255) << 24) | (((-16777216) & iP) >>> 24) | ((16711680 & iP) >>> 8) | ((65280 & iP) << 8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f9320j) {
            return;
        }
        this.f9320j = true;
        this.f9319h.close();
        this.i.b();
    }

    @Override // h5.InterfaceC0734l
    public final boolean e(long j4) {
        C0732j c0732j;
        if (j4 < 0) {
            throw new IllegalArgumentException(AbstractC0013g0.h("byteCount < 0: ", j4).toString());
        }
        if (this.f9320j) {
            throw new IllegalStateException("closed");
        }
        do {
            c0732j = this.i;
            if (c0732j.i >= j4) {
                return true;
            }
        } while (this.f9319h.read(c0732j, 8192L) != -1);
        return false;
    }

    @Override // h5.InterfaceC0734l
    public final boolean f(long j4, C0735m c0735m) {
        E4.k.f("bytes", c0735m);
        int iD = c0735m.d();
        if (this.f9320j) {
            throw new IllegalStateException("closed");
        }
        if (iD >= 0 && c0735m.d() >= iD) {
            for (int i = 0; i < iD; i++) {
                long j6 = i;
                if (e(1 + j6) && this.i.o(j6) == c0735m.i(i)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // h5.InterfaceC0734l
    public final void g(byte[] bArr) throws EOFException {
        C0732j c0732j = this.i;
        E4.k.f("sink", bArr);
        try {
            N(bArr.length);
            c0732j.g(bArr);
        } catch (EOFException e6) {
            int i = 0;
            while (true) {
                long j4 = c0732j.i;
                if (j4 <= 0) {
                    throw e6;
                }
                int iC = c0732j.C(bArr, i, (int) j4);
                if (iC == -1) {
                    throw new AssertionError();
                }
                i += iC;
            }
        }
    }

    @Override // h5.InterfaceC0734l
    public final C0735m i() {
        M m6 = this.f9319h;
        C0732j c0732j = this.i;
        c0732j.r(m6);
        return c0732j.j(c0732j.i);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f9320j;
    }

    @Override // h5.InterfaceC0734l
    public final C0735m j(long j4) {
        N(j4);
        return this.i.j(j4);
    }

    public final long k() throws EOFException {
        N(8L);
        long jU = this.i.u();
        return ((jU & 255) << 56) | (((-72057594037927936L) & jU) >>> 56) | ((71776119061217280L & jU) >>> 40) | ((280375465082880L & jU) >>> 24) | ((1095216660480L & jU) >>> 8) | ((4278190080L & jU) << 8) | ((16711680 & jU) << 24) | ((65280 & jU) << 40);
    }

    @Override // h5.InterfaceC0734l
    public final void l(long j4) {
        if (this.f9320j) {
            throw new IllegalStateException("closed");
        }
        while (j4 > 0) {
            C0732j c0732j = this.i;
            if (c0732j.i == 0 && this.f9319h.read(c0732j, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j4, c0732j.i);
            c0732j.l(jMin);
            j4 -= jMin;
        }
    }

    public final short o() {
        N(2L);
        return this.i.J();
    }

    @Override // h5.InterfaceC0734l
    public final int p() {
        N(4L);
        return this.i.p();
    }

    @Override // h5.InterfaceC0734l
    public final G peek() {
        return AbstractC0724b.c(new D(this));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        E4.k.f("sink", byteBuffer);
        C0732j c0732j = this.i;
        if (c0732j.i == 0 && this.f9319h.read(c0732j, 8192L) == -1) {
            return -1;
        }
        return c0732j.read(byteBuffer);
    }

    public final String s(long j4) {
        N(j4);
        C0732j c0732j = this.i;
        c0732j.getClass();
        return c0732j.L(j4, M4.a.f3520a);
    }

    @Override // h5.M
    public final P timeout() {
        return this.f9319h.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f9319h + ')';
    }

    @Override // h5.InterfaceC0734l
    public final long u() {
        N(8L);
        return this.i.u();
    }

    @Override // h5.InterfaceC0734l
    public final String w() {
        return H(Long.MAX_VALUE);
    }

    @Override // h5.InterfaceC0734l
    public final byte[] x() {
        M m6 = this.f9319h;
        C0732j c0732j = this.i;
        c0732j.r(m6);
        return c0732j.G(c0732j.i);
    }

    @Override // h5.InterfaceC0734l
    public final void y(C0732j c0732j, long j4) throws EOFException {
        C0732j c0732j2 = this.i;
        E4.k.f("sink", c0732j);
        try {
            N(j4);
            c0732j2.y(c0732j, j4);
        } catch (EOFException e6) {
            c0732j.r(c0732j2);
            throw e6;
        }
    }

    @Override // h5.InterfaceC0734l
    public final boolean z() {
        if (this.f9320j) {
            throw new IllegalStateException("closed");
        }
        C0732j c0732j = this.i;
        return c0732j.z() && this.f9319h.read(c0732j, 8192L) == -1;
    }

    @Override // h5.M
    public final long read(C0732j c0732j, long j4) {
        E4.k.f("sink", c0732j);
        if (j4 >= 0) {
            if (!this.f9320j) {
                C0732j c0732j2 = this.i;
                if (c0732j2.i == 0 && this.f9319h.read(c0732j2, 8192L) == -1) {
                    return -1L;
                }
                return c0732j2.read(c0732j, Math.min(j4, c0732j2.i));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(AbstractC0013g0.h("byteCount < 0: ", j4).toString());
    }
}
