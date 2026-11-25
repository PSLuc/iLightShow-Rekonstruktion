package U4;

import P4.A;
import P4.AbstractC0331s;
import P4.AbstractC0338z;
import P4.C0319f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0331s implements A {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5356o = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final W4.l f5357j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f5358k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A f5359l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f5360m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f5361n;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public g(W4.l lVar, int i) {
        this.f5357j = lVar;
        this.f5358k = i;
        A a6 = lVar instanceof A ? (A) lVar : null;
        this.f5359l = a6 == null ? AbstractC0338z.f4683a : a6;
        this.f5360m = new j();
        this.f5361n = new Object();
    }

    @Override // P4.AbstractC0331s
    public final void X(p111u4.i iVar, Runnable runnable) {
        boolean z5;
        Runnable runnableZ;
        this.f5360m.a(runnable);
        if (f5356o.get(this) < this.f5358k) {
            synchronized (this.f5361n) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5356o;
                if (atomicIntegerFieldUpdater.get(this) >= this.f5358k) {
                    z5 = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z5 = true;
                }
            }
            if (!z5 || (runnableZ = Z()) == null) {
                return;
            }
            this.f5357j.X(this, new O1.n(7, (Object) this, (Object) runnableZ, false));
        }
    }

    public final Runnable Z() {
        while (true) {
            Runnable runnable = (Runnable) this.f5360m.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f5361n) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5356o;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f5360m.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // P4.A
    public final void v(long j4, C0319f c0319f) {
        this.f5359l.v(j4, c0319f);
    }
}
