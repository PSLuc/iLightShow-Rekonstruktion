package U4;

import O1.C0308a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5347a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f5341a;

    @Override // U4.n
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5347a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        C0308a c0308a = a.f5341a;
        if (obj2 == c0308a) {
            C0308a c0308aC = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == c0308a) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c0308a, c0308aC)) {
                    if (atomicReferenceFieldUpdater.get(this) != c0308a) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                    }
                }
                obj2 = c0308aC;
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract C0308a c(Object obj);
}
