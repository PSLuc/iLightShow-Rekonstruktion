package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class K extends p020d2.n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7864k = AtomicReferenceFieldUpdater.newUpdater(N.class, Thread.class, "a");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7865l = AtomicReferenceFieldUpdater.newUpdater(N.class, N.class, "b");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7866m = AtomicReferenceFieldUpdater.newUpdater(O.class, N.class, "c");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7867n = AtomicReferenceFieldUpdater.newUpdater(O.class, I.class, "b");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7868o = AtomicReferenceFieldUpdater.newUpdater(O.class, Object.class, "a");

    @Override // p020d2.n
    public final I O(C0549a0 c0549a0) {
        return (I) f7867n.getAndSet(c0549a0, I.f7858d);
    }

    @Override // p020d2.n
    public final N P(C0549a0 c0549a0) {
        return (N) f7866m.getAndSet(c0549a0, N.f7886c);
    }

    @Override // p020d2.n
    public final void Q(N n6, N n7) {
        f7865l.lazySet(n6, n7);
    }

    @Override // p020d2.n
    public final void R(N n6, Thread thread) {
        f7864k.lazySet(n6, thread);
    }

    @Override // p020d2.n
    public final boolean S(C0549a0 c0549a0, I i, I i3) {
        return p027e3.a.E0(f7867n, c0549a0, i, i3);
    }

    @Override // p020d2.n
    public final boolean T(O o6, Object obj, Object obj2) {
        return p027e3.a.E0(f7868o, o6, obj, obj2);
    }

    @Override // p020d2.n
    public final boolean U(O o6, N n6, N n7) {
        return p027e3.a.E0(f7866m, o6, n6, n7);
    }
}
