package h5;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: h5.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0737o implements K {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x f9357h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9358j;

    public C0737o(x xVar) {
        E4.k.f("fileHandle", xVar);
        this.f9357h = xVar;
        this.i = 0L;
    }

    @Override // h5.K, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f9358j) {
            return;
        }
        this.f9358j = true;
        x xVar = this.f9357h;
        ReentrantLock reentrantLock = xVar.f9379k;
        reentrantLock.lock();
        try {
            int i = xVar.f9378j - 1;
            xVar.f9378j = i;
            if (i == 0 && xVar.i) {
                reentrantLock.unlock();
                synchronized (xVar) {
                    xVar.f9380l.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // h5.K, java.io.Flushable
    public final void flush() {
        if (this.f9358j) {
            throw new IllegalStateException("closed");
        }
        x xVar = this.f9357h;
        synchronized (xVar) {
            xVar.f9380l.getFD().sync();
        }
    }

    @Override // h5.K
    public final P timeout() {
        return P.NONE;
    }

    @Override // h5.K
    public final void write(C0732j c0732j, long j4) {
        E4.k.f("source", c0732j);
        if (this.f9358j) {
            throw new IllegalStateException("closed");
        }
        x xVar = this.f9357h;
        long j6 = this.i;
        xVar.getClass();
        AbstractC0724b.e(c0732j.i, 0L, j4);
        long j7 = j6 + j4;
        while (j6 < j7) {
            H h6 = c0732j.f9351h;
            E4.k.c(h6);
            int iMin = (int) Math.min(j7 - j6, h6.f9323c - h6.f9322b);
            byte[] bArr = h6.f9321a;
            int i = h6.f9322b;
            synchronized (xVar) {
                E4.k.f("array", bArr);
                xVar.f9380l.seek(j6);
                xVar.f9380l.write(bArr, i, iMin);
            }
            int i3 = h6.f9322b + iMin;
            h6.f9322b = i3;
            long j8 = iMin;
            j6 += j8;
            c0732j.i -= j8;
            if (i3 == h6.f9323c) {
                c0732j.f9351h = h6.a();
                I.a(h6);
            }
        }
        this.i += j4;
    }
}
