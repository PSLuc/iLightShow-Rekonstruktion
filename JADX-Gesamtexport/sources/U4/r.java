package U4;

import P4.g0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends c implements g0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5376k = AtomicIntegerFieldUpdater.newUpdater(r.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f5377j;

    public r(long j4, r rVar, int i) {
        super(rVar);
        this.f5377j = j4;
        this.cleanedAndPointers = i << 16;
    }

    @Override // U4.c
    public final boolean c() {
        return f5376k.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f5376k.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i, p111u4.i iVar);

    public final void h() {
        if (f5376k.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f5376k;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
