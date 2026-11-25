package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p015c2.AbstractC0473d;

/* JADX INFO: loaded from: classes.dex */
public final class r1 extends p081p0.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7995h;
    public final AtomicReferenceFieldUpdater i;

    public r1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f7992e = atomicReferenceFieldUpdater;
        this.f7993f = atomicReferenceFieldUpdater2;
        this.f7994g = atomicReferenceFieldUpdater3;
        this.f7995h = atomicReferenceFieldUpdater4;
        this.i = atomicReferenceFieldUpdater5;
    }

    @Override // p081p0.c
    public final void I0(D1 d1, D1 d6) {
        this.f7993f.lazySet(d1, d6);
    }

    @Override // p081p0.c
    public final void K0(D1 d1, Thread thread) {
        this.f7992e.lazySet(d1, thread);
    }

    @Override // p081p0.c
    public final boolean M0(E1 e6, U0 u0, U0 u6) {
        return AbstractC0473d.Z(this.f7995h, e6, u0, u6);
    }

    @Override // p081p0.c
    public final boolean N0(E1 e6, Object obj, Object obj2) {
        return AbstractC0473d.Z(this.i, e6, obj, obj2);
    }

    @Override // p081p0.c
    public final boolean O0(E1 e6, D1 d1, D1 d6) {
        return AbstractC0473d.Z(this.f7994g, e6, d1, d6);
    }
}
