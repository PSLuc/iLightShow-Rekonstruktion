package h5;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9377h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9378j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ReentrantLock f9379k = new ReentrantLock();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RandomAccessFile f9380l;

    public x(boolean z5, RandomAccessFile randomAccessFile) {
        this.f9377h = z5;
        this.f9380l = randomAccessFile;
    }

    public static C0737o b(x xVar) {
        if (!xVar.f9377h) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = xVar.f9379k;
        reentrantLock.lock();
        try {
            if (xVar.i) {
                throw new IllegalStateException("closed");
            }
            xVar.f9378j++;
            reentrantLock.unlock();
            return new C0737o(xVar);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long c() {
        long length;
        ReentrantLock reentrantLock = this.f9379k;
        reentrantLock.lock();
        try {
            if (this.i) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                length = this.f9380l.length();
            }
            return length;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f9379k;
        reentrantLock.lock();
        try {
            if (this.i) {
                reentrantLock.unlock();
                return;
            }
            this.i = true;
            if (this.f9378j != 0) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.f9380l.close();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void flush() {
        if (!this.f9377h) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f9379k;
        reentrantLock.lock();
        try {
            if (this.i) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.f9380l.getFD().sync();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final C0738p k(long j4) {
        ReentrantLock reentrantLock = this.f9379k;
        reentrantLock.lock();
        try {
            if (this.i) {
                throw new IllegalStateException("closed");
            }
            this.f9378j++;
            reentrantLock.unlock();
            return new C0738p(this, j4);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
