package com.nanjoran.ilightshow.Services;

import P4.AbstractC0336x;
import P4.InterfaceC0335w;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0672h extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8397l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f8398m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0672h(long j4, p111u4.d dVar) {
        super(2, dVar);
        this.f8398m = j4;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new C0672h(this.f8398m, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0672h) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f8397l;
        if (i == 0) {
            S1.V.O(obj);
            this.f8397l = 1;
            if (AbstractC0336x.e(this.f8398m, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S1.V.O(obj);
        }
        C0674i c0674i = C0674i.f8401h;
        C0674i.h();
        return p084p4.x.f10867a;
    }
}
