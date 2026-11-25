package h5;

import java.util.zip.Deflater;

/* JADX INFO: renamed from: h5.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0736n implements K {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final F f9355h;
    public final Deflater i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9356j;

    public C0736n(C0732j c0732j, Deflater deflater) {
        this.f9355h = AbstractC0724b.b(c0732j);
        this.i = deflater;
    }

    public final void b(boolean z5) {
        H hT;
        int iDeflate;
        F f6 = this.f9355h;
        C0732j c0732j = f6.i;
        while (true) {
            hT = c0732j.T(1);
            Deflater deflater = this.i;
            byte[] bArr = hT.f9321a;
            if (z5) {
                int i = hT.f9323c;
                iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
            } else {
                int i3 = hT.f9323c;
                iDeflate = deflater.deflate(bArr, i3, 8192 - i3);
            }
            if (iDeflate > 0) {
                hT.f9323c += iDeflate;
                c0732j.i += (long) iDeflate;
                f6.E();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (hT.f9322b == hT.f9323c) {
            c0732j.f9351h = hT.a();
            I.a(hT);
        }
    }

    @Override // h5.K, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws Throwable {
        Deflater deflater = this.i;
        if (this.f9356j) {
            return;
        }
        deflater.finish();
        b(false);
        th = null;
        try {
            deflater.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.f9355h.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f9356j = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // h5.K, java.io.Flushable
    public final void flush() {
        b(true);
        this.f9355h.flush();
    }

    @Override // h5.K
    public final P timeout() {
        return this.f9355h.f9317h.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f9355h + ')';
    }

    @Override // h5.K
    public final void write(C0732j c0732j, long j4) {
        E4.k.f("source", c0732j);
        AbstractC0724b.e(c0732j.i, 0L, j4);
        while (j4 > 0) {
            H h6 = c0732j.f9351h;
            E4.k.c(h6);
            int iMin = (int) Math.min(j4, h6.f9323c - h6.f9322b);
            this.i.setInput(h6.f9321a, h6.f9322b, iMin);
            b(false);
            long j6 = iMin;
            c0732j.i -= j6;
            int i = h6.f9322b + iMin;
            h6.f9322b = i;
            if (i == h6.f9323c) {
                c0732j.f9351h = h6.a();
                I.a(h6);
            }
            j4 -= j6;
        }
    }
}
