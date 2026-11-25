package m5;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes.dex */
public final class q extends AbstractExecutorService implements AutoCloseable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Logger f10482p = LoggerFactory.getLogger((Class<?>) q.class);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f10483h;
    public final AtomicReference i = new AtomicReference();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference f10484j = new AtomicReference();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedBlockingQueue f10485k = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ReentrantLock f10486l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Condition f10487m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Runnable f10488n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f10489o;

    public q(ExecutorService executorService) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f10486l = reentrantLock;
        this.f10487m = reentrantLock.newCondition();
        if (executorService == null) {
            this.f10489o = true;
        }
        this.f10483h = executorService;
    }

    public static void b(q qVar) {
        AtomicReference atomicReference = qVar.i;
        Thread thread = (Thread) atomicReference.get();
        Thread threadCurrentThread = Thread.currentThread();
        while (!atomicReference.compareAndSet(null, threadCurrentThread)) {
            if (atomicReference.get() != null) {
                if (thread == null) {
                    throw new ConcurrentModificationException(qVar + " was already owned!");
                }
                throw new ConcurrentModificationException(qVar + " already owned by " + thread.getName() + "!");
            }
        }
    }

    public static void c(q qVar) {
        AtomicReference atomicReference = qVar.i;
        Thread threadCurrentThread = Thread.currentThread();
        while (!atomicReference.compareAndSet(threadCurrentThread, null)) {
            if (atomicReference.get() != threadCurrentThread) {
                Thread thread = (Thread) atomicReference.get();
                if (thread == null) {
                    throw new ConcurrentModificationException(qVar + " is not owned, clear failed!");
                }
                throw new ConcurrentModificationException(qVar + " owned by " + thread.getName() + ", clear failed!");
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j4, TimeUnit timeUnit) {
        ReentrantLock reentrantLock = this.f10486l;
        reentrantLock.lock();
        try {
            long nanos = timeUnit.toNanos(j4);
            do {
                if (this.f10489o && this.f10488n == null) {
                    break;
                }
                nanos = this.f10487m.awaitNanos(nanos);
            } while (nanos > 0);
            return this.f10489o && this.f10488n == null;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z5 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z5) {
                    shutdownNow();
                    z5 = true;
                }
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ReentrantLock reentrantLock = this.f10486l;
        reentrantLock.lock();
        try {
            if (this.f10489o) {
                throw new RejectedExecutionException("SerialExecutor already shutdown!");
            }
            this.f10485k.offer(runnable);
            if (this.f10488n == null) {
                o();
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        ReentrantLock reentrantLock = this.f10486l;
        reentrantLock.lock();
        try {
            return this.f10489o;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        ReentrantLock reentrantLock = this.f10486l;
        reentrantLock.lock();
        try {
            return this.f10489o && this.f10488n == null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void k() {
        Thread threadCurrentThread = Thread.currentThread();
        AtomicReference atomicReference = this.i;
        if (atomicReference.get() != threadCurrentThread) {
            Thread thread = (Thread) atomicReference.get();
            if (thread == null) {
                throw new ConcurrentModificationException(this + " is not owned!");
            }
            throw new ConcurrentModificationException(this + " owned by " + thread.getName() + "!");
        }
    }

    public final void o() {
        ReentrantLock reentrantLock = this.f10486l;
        reentrantLock.lock();
        try {
            Runnable runnable = (Runnable) this.f10485k.poll();
            this.f10488n = runnable;
            if (runnable != null) {
                this.f10483h.execute(new O1.n(15, (Object) this, (Object) runnable, false));
            } else if (this.f10489o) {
                this.f10487m.signalAll();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void s(ArrayList arrayList) {
        ReentrantLock reentrantLock = this.f10486l;
        reentrantLock.lock();
        try {
            shutdown();
            this.f10485k.drainTo(arrayList);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        ReentrantLock reentrantLock = this.f10486l;
        reentrantLock.lock();
        try {
            this.f10489o = true;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        ReentrantLock reentrantLock = this.f10486l;
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList(this.f10485k.size());
            s(arrayList);
            return arrayList;
        } finally {
            reentrantLock.unlock();
        }
    }
}
