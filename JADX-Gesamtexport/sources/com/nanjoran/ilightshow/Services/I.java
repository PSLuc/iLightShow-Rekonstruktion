package com.nanjoran.ilightshow.Services;

import P4.InterfaceC0335w;

/* JADX INFO: loaded from: classes.dex */
public final class I extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8269l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M f8270m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(M m6, p111u4.d dVar) {
        super(2, dVar);
        this.f8270m = m6;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new I(this.f8270m, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((I) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f8269l;
        if (i == 0) {
            S1.V.O(obj);
            C0688o0 c0688o0L = this.f8270m.l();
            this.f8269l = 1;
            if (c0688o0L.c(this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S1.V.O(obj);
        }
        return p084p4.x.f10867a;
    }
}
