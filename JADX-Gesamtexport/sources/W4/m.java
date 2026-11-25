package W4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5639b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5640c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5641d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5642e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f5643a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final h a(h hVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5640c;
        if (atomicIntegerFieldUpdater.get(this) - f5641d.get(this) == 127) {
            return hVar;
        }
        if (hVar.i.f5628a == 1) {
            f5642e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f5643a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, hVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final h b() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5641d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f5640c.get(this) == 0) {
                return null;
            }
            int i3 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (hVar = (h) this.f5643a.getAndSet(i3, null)) != null) {
                if (hVar.i.f5628a == 1) {
                    f5642e.decrementAndGet(this);
                }
                return hVar;
            }
        }
    }

    public final h c(int i, boolean z5) {
        int i3 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f5643a;
        h hVar = (h) atomicReferenceArray.get(i3);
        if (hVar != null) {
            if ((hVar.i.f5628a == 1) == z5) {
                while (!atomicReferenceArray.compareAndSet(i3, hVar, null)) {
                    if (atomicReferenceArray.get(i3) != hVar) {
                    }
                }
                if (z5) {
                    f5642e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }
}
