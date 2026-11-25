package com.nanjoran.ilightshow.Services;

import P4.AbstractC0336x;
import P4.InterfaceC0335w;

/* JADX INFO: loaded from: classes.dex */
public final class N extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8344l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f8345m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ LightShowService f8346n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(LightShowService lightShowService, p111u4.d dVar) {
        super(2, dVar);
        this.f8346n = lightShowService;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        N n6 = new N(this.f8346n, dVar);
        n6.f8345m = obj;
        return n6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((N) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        InterfaceC0335w interfaceC0335w;
        v4.a aVar = v4.a.f13292h;
        int i = this.f8344l;
        if (i == 0) {
            S1.V.O(obj);
            interfaceC0335w = (InterfaceC0335w) this.f8345m;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0335w = (InterfaceC0335w) this.f8345m;
            S1.V.O(obj);
        }
        while (AbstractC0336x.m(interfaceC0335w)) {
            int i3 = LightShowService.f8300l;
            this.f8346n.d();
            this.f8345m = interfaceC0335w;
            this.f8344l = 1;
            if (AbstractC0336x.e(5000L, this) == aVar) {
                return aVar;
            }
        }
        return p084p4.x.f10867a;
    }
}
