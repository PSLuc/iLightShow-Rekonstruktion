package S4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends T4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5059a = AtomicReferenceFieldUpdater.newUpdater(Q.class, Object.class, "_state");
    private volatile Object _state;

    @Override // T4.c
    public final boolean a(T4.a aVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5059a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, F.f5034b);
        return true;
    }

    @Override // T4.c
    public final p111u4.d[] b(T4.a aVar) {
        f5059a.set(this, null);
        return T4.b.f5257a;
    }
}
