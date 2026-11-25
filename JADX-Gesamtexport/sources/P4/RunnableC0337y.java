package P4;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: P4.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0337y extends K implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final RunnableC0337y f4681q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f4682r;

    static {
        Long l6;
        RunnableC0337y runnableC0337y = new RunnableC0337y();
        f4681q = runnableC0337y;
        runnableC0337y.c0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l6 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l6 = 1000L;
        }
        f4682r = timeUnit.toNanos(l6.longValue());
    }

    @Override // P4.L
    public final Thread b0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // P4.L
    public final void f0(long j4, I i) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // P4.K
    public final void g0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.g0(runnable);
    }

    public final synchronized void k0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            K.f4613n.set(this, null);
            K.f4614o.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        l0.f4656a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    k0();
                    if (i0()) {
                        return;
                    }
                    b0();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j4 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jD0 = d0();
                    if (jD0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j4 == Long.MAX_VALUE) {
                            j4 = f4682r + jNanoTime;
                        }
                        long j6 = j4 - jNanoTime;
                        if (j6 <= 0) {
                            _thread = null;
                            k0();
                            if (i0()) {
                                return;
                            }
                            b0();
                            return;
                        }
                        if (jD0 > j6) {
                            jD0 = j6;
                        }
                    } else {
                        j4 = Long.MAX_VALUE;
                    }
                    if (jD0 > 0) {
                        int i3 = debugStatus;
                        if (i3 == 2 || i3 == 3) {
                            _thread = null;
                            k0();
                            if (i0()) {
                                return;
                            }
                            b0();
                            return;
                        }
                        LockSupport.parkNanos(this, jD0);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            k0();
            if (!i0()) {
                b0();
            }
            throw th;
        }
    }

    @Override // P4.K, P4.L
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
