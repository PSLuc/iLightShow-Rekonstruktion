package h5;

import B.AbstractC0013g0;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class w implements M {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final G f9374h;
    public final Inflater i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9375j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9376k;

    public w(G g6, Inflater inflater) {
        this.f9374h = g6;
        this.i = inflater;
    }

    public final long b(C0732j c0732j, long j4) throws IOException {
        Inflater inflater = this.i;
        E4.k.f("sink", c0732j);
        if (j4 < 0) {
            throw new IllegalArgumentException(AbstractC0013g0.h("byteCount < 0: ", j4).toString());
        }
        if (this.f9376k) {
            throw new IllegalStateException("closed");
        }
        if (j4 != 0) {
            try {
                H hT = c0732j.T(1);
                int iMin = (int) Math.min(j4, 8192 - hT.f9323c);
                boolean zNeedsInput = inflater.needsInput();
                G g6 = this.f9374h;
                if (zNeedsInput && !g6.z()) {
                    H h6 = g6.i.f9351h;
                    E4.k.c(h6);
                    int i = h6.f9323c;
                    int i3 = h6.f9322b;
                    int i6 = i - i3;
                    this.f9375j = i6;
                    inflater.setInput(h6.f9321a, i3, i6);
                }
                int iInflate = inflater.inflate(hT.f9321a, hT.f9323c, iMin);
                int i7 = this.f9375j;
                if (i7 != 0) {
                    int remaining = i7 - inflater.getRemaining();
                    this.f9375j -= remaining;
                    g6.l(remaining);
                }
                if (iInflate > 0) {
                    hT.f9323c += iInflate;
                    long j6 = iInflate;
                    c0732j.i += j6;
                    return j6;
                }
                if (hT.f9322b == hT.f9323c) {
                    c0732j.f9351h = hT.a();
                    I.a(hT);
                }
            } catch (DataFormatException e6) {
                throw new IOException(e6);
            }
        }
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f9376k) {
            return;
        }
        this.i.end();
        this.f9376k = true;
        this.f9374h.close();
    }

    @Override // h5.M
    public final long read(C0732j c0732j, long j4) throws IOException {
        E4.k.f("sink", c0732j);
        do {
            long jB = b(c0732j, j4);
            if (jB > 0) {
                return jB;
            }
            Inflater inflater = this.i;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f9374h.z());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // h5.M
    public final P timeout() {
        return this.f9374h.f9319h.timeout();
    }
}
