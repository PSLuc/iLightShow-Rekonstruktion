package p034f4;

import G4.a;

/* JADX INFO: loaded from: classes.dex */
public final class o extends a implements Runnable {
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Runnable, java.util.concurrent.atomic.AtomicReference] */
    @Override // java.lang.Runnable
    public final void run() {
        this.i = Thread.currentThread();
        try {
            this.f8946h.run();
            this.i = null;
        } catch (Throwable th) {
            this.i = null;
            lazySet(a.f8944j);
            a.A(th);
        }
    }
}
