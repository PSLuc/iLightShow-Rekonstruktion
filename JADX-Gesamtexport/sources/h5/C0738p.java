package h5;

import B.AbstractC0013g0;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: h5.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0738p implements M {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x f9359h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9360j;

    public C0738p(x xVar, long j4) {
        E4.k.f("fileHandle", xVar);
        this.f9359h = xVar;
        this.i = j4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f9360j) {
            return;
        }
        this.f9360j = true;
        x xVar = this.f9359h;
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

    @Override // h5.M
    public final long read(C0732j c0732j, long j4) {
        long j6;
        long j7;
        int i;
        E4.k.f("sink", c0732j);
        if (this.f9360j) {
            throw new IllegalStateException("closed");
        }
        x xVar = this.f9359h;
        long j8 = this.i;
        xVar.getClass();
        if (j4 < 0) {
            throw new IllegalArgumentException(AbstractC0013g0.h("byteCount < 0: ", j4).toString());
        }
        long j9 = j4 + j8;
        long j10 = j8;
        while (true) {
            if (j10 < j9) {
                H hT = c0732j.T(1);
                byte[] bArr = hT.f9321a;
                int i3 = hT.f9323c;
                j6 = -1;
                int iMin = (int) Math.min(j9 - j10, 8192 - i3);
                synchronized (xVar) {
                    E4.k.f("array", bArr);
                    xVar.f9380l.seek(j10);
                    i = 0;
                    while (true) {
                        if (i < iMin) {
                            int i6 = xVar.f9380l.read(bArr, i3, iMin - i);
                            if (i6 != -1) {
                                i += i6;
                            } else if (i == 0) {
                                i = -1;
                                break;
                            }
                        }
                        break;
                    }
                }
                if (i == -1) {
                    if (hT.f9322b == hT.f9323c) {
                        c0732j.f9351h = hT.a();
                        I.a(hT);
                    }
                    if (j8 == j10) {
                        j7 = -1;
                        break;
                    }
                } else {
                    hT.f9323c += i;
                    long j11 = i;
                    j10 += j11;
                    c0732j.i += j11;
                }
            } else {
                j6 = -1;
            }
            j7 = j10 - j8;
            break;
        }
        if (j7 != j6) {
            this.i += j7;
        }
        return j7;
    }

    @Override // h5.M
    public final P timeout() {
        return P.NONE;
    }
}
