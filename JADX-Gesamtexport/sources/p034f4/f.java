package p034f4;

import S3.b;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import p017c4.a;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Callable, b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final FutureTask f8959m = new FutureTask(W3.b.f5600b, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f8960h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f8962k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Thread f8963l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference f8961j = new AtomicReference();
    public final AtomicReference i = new AtomicReference();

    public f(a aVar, ScheduledExecutorService scheduledExecutorService) {
        this.f8960h = aVar;
        this.f8962k = scheduledExecutorService;
    }

    @Override // S3.b
    public final void a() {
        AtomicReference atomicReference = this.f8961j;
        FutureTask futureTask = f8959m;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        if (future != null && future != futureTask) {
            future.cancel(this.f8963l != Thread.currentThread());
        }
        Future future2 = (Future) this.i.getAndSet(futureTask);
        if (future2 == null || future2 == futureTask) {
            return;
        }
        future2.cancel(this.f8963l != Thread.currentThread());
    }

    public final void b(Future future) {
        while (true) {
            AtomicReference atomicReference = this.f8961j;
            Future future2 = (Future) atomicReference.get();
            if (future2 == f8959m) {
                future.cancel(this.f8963l != Thread.currentThread());
                return;
            } else {
                while (!atomicReference.compareAndSet(future2, future)) {
                    if (atomicReference.get() != future2) {
                    }
                }
                return;
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.f8963l = Thread.currentThread();
        try {
            this.f8960h.run();
            Future futureSubmit = this.f8962k.submit(this);
            loop0: while (true) {
                AtomicReference atomicReference = this.i;
                Future future = (Future) atomicReference.get();
                if (future == f8959m) {
                    futureSubmit.cancel(this.f8963l != Thread.currentThread());
                    break;
                }
                do {
                    if (atomicReference.compareAndSet(future, futureSubmit)) {
                        break loop0;
                    }
                } while (atomicReference.get() == future);
            }
            this.f8963l = null;
            return null;
        } catch (Throwable th) {
            this.f8963l = null;
            G4.a.A(th);
            return null;
        }
    }
}
