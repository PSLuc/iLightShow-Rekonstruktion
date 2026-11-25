package p034f4;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public final class p extends a implements Callable {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Runnable, java.util.concurrent.atomic.AtomicReference] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureTask futureTask = a.f8944j;
        this.i = Thread.currentThread();
        try {
            this.f8946h.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.i = null;
        }
    }
}
