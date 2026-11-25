package R3;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class h implements S3.b, Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f4802h;
    public final k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Thread f4803j;

    /* JADX WARN: Multi-variable type inference failed */
    public h(Runnable runnable, k kVar) {
        this.f4802h = (AtomicReference) runnable;
        this.i = kVar;
    }

    @Override // S3.b
    public final void a() {
        if (this.f4803j == Thread.currentThread()) {
            k kVar = this.i;
            if (kVar instanceof p034f4.l) {
                p034f4.l lVar = (p034f4.l) kVar;
                if (lVar.i) {
                    return;
                }
                lVar.i = true;
                lVar.f8981h.shutdown();
                return;
            }
        }
        this.i.a();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Runnable, java.util.concurrent.atomic.AtomicReference] */
    @Override // java.lang.Runnable
    public final void run() {
        this.f4803j = Thread.currentThread();
        try {
            this.f4802h.run();
        } finally {
            a();
            this.f4803j = null;
        }
    }
}
