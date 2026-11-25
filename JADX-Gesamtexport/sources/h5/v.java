package h5;

import B.AbstractC0013g0;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class v implements M {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f9370h;
    public final G i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Inflater f9371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w f9372k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CRC32 f9373l;

    public v(M m6) {
        E4.k.f("source", m6);
        G g6 = new G(m6);
        this.i = g6;
        Inflater inflater = new Inflater(true);
        this.f9371j = inflater;
        this.f9372k = new w(g6, inflater);
        this.f9373l = new CRC32();
    }

    public static void b(int i, String str, int i3) throws IOException {
        if (i3 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i3), Integer.valueOf(i)}, 3)));
        }
    }

    public final void c(long j4, C0732j c0732j, long j6) {
        H h6 = c0732j.f9351h;
        E4.k.c(h6);
        while (true) {
            int i = h6.f9323c;
            int i3 = h6.f9322b;
            if (j4 < i - i3) {
                break;
            }
            j4 -= (long) (i - i3);
            h6 = h6.f9326f;
            E4.k.c(h6);
        }
        while (j6 > 0) {
            int i6 = (int) (((long) h6.f9322b) + j4);
            int iMin = (int) Math.min(h6.f9323c - i6, j6);
            this.f9373l.update(h6.f9321a, i6, iMin);
            j6 -= (long) iMin;
            h6 = h6.f9326f;
            E4.k.c(h6);
            j4 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f9372k.close();
    }

    @Override // h5.M
    public final long read(C0732j c0732j, long j4) throws IOException {
        v vVar = this;
        E4.k.f("sink", c0732j);
        if (j4 < 0) {
            throw new IllegalArgumentException(AbstractC0013g0.h("byteCount < 0: ", j4).toString());
        }
        if (j4 == 0) {
            return 0L;
        }
        byte b6 = vVar.f9370h;
        CRC32 crc32 = vVar.f9373l;
        G g6 = vVar.i;
        if (b6 == 0) {
            g6.N(10L);
            C0732j c0732j2 = g6.i;
            byte bO = c0732j2.o(3L);
            boolean z5 = ((bO >> 1) & 1) == 1;
            if (z5) {
                vVar.c(0L, c0732j2, 10L);
            }
            b(8075, "ID1ID2", g6.I());
            g6.l(8L);
            if (((bO >> 2) & 1) == 1) {
                g6.N(2L);
                if (z5) {
                    c(0L, c0732j2, 2L);
                }
                long J = c0732j2.J() & 65535;
                g6.N(J);
                if (z5) {
                    c(0L, c0732j2, J);
                }
                g6.l(J);
            }
            if (((bO >> 3) & 1) == 1) {
                long jB = g6.b((byte) 0, 0L, Long.MAX_VALUE);
                if (jB == -1) {
                    throw new EOFException();
                }
                if (z5) {
                    c(0L, c0732j2, jB + 1);
                }
                g6.l(jB + 1);
            }
            if (((bO >> 4) & 1) == 1) {
                long jB2 = g6.b((byte) 0, 0L, Long.MAX_VALUE);
                if (jB2 == -1) {
                    throw new EOFException();
                }
                if (z5) {
                    vVar = this;
                    vVar.c(0L, c0732j2, jB2 + 1);
                } else {
                    vVar = this;
                }
                g6.l(jB2 + 1);
            } else {
                vVar = this;
            }
            if (z5) {
                b(g6.o(), "FHCRC", (short) crc32.getValue());
                crc32.reset();
            }
            vVar.f9370h = (byte) 1;
        }
        if (vVar.f9370h == 1) {
            long j6 = c0732j.i;
            long j7 = vVar.f9372k.read(c0732j, j4);
            if (j7 != -1) {
                vVar.c(j6, c0732j, j7);
                return j7;
            }
            vVar.f9370h = (byte) 2;
        }
        if (vVar.f9370h == 2) {
            b(g6.c(), "CRC", (int) crc32.getValue());
            b(g6.c(), "ISIZE", (int) vVar.f9371j.getBytesWritten());
            vVar.f9370h = (byte) 3;
            if (!g6.z()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // h5.M
    public final P timeout() {
        return this.i.f9319h.timeout();
    }
}
