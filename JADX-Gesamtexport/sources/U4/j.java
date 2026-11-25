package U4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5364a = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_cur");
    private volatile Object _cur = new l(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5364a;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            int iA = lVar.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                l lVarC = lVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar, lVarC) && atomicReferenceFieldUpdater.get(this) == lVar) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5364a;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            if (lVar.b()) {
                return;
            }
            l lVarC = lVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar, lVarC) && atomicReferenceFieldUpdater.get(this) == lVar) {
            }
        }
    }

    public final int c() {
        l lVar = (l) f5364a.get(this);
        lVar.getClass();
        long j4 = l.f5367f.get(lVar);
        return 1073741823 & (((int) ((j4 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j4)));
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5364a;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            Object objD = lVar.d();
            if (objD != l.f5368g) {
                return objD;
            }
            l lVarC = lVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar, lVarC) && atomicReferenceFieldUpdater.get(this) == lVar) {
            }
        }
    }
}
