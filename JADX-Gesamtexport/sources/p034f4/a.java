package p034f4;

import S3.b;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends AtomicReference implements b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final FutureTask f8944j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final FutureTask f8945k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f8946h;
    public Thread i;

    static {
        W3.a aVar = W3.b.f5600b;
        f8944j = new FutureTask(aVar, null);
        f8945k = new FutureTask(aVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Runnable runnable) {
        this.f8946h = (AtomicReference) runnable;
    }

    @Override // S3.b
    public final void a() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == f8944j || future == (futureTask = f8945k) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.i != Thread.currentThread());
    }

    public final void b(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == f8944j) {
                return;
            }
            if (future2 == f8945k) {
                future.cancel(this.i != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
