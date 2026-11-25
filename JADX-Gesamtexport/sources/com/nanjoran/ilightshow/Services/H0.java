package com.nanjoran.ilightshow.Services;

import P4.InterfaceC0335w;
import com.github.kittinunf.fuel.core.FuelError;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class H0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InterfaceC0335w f8265l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8266m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p126x2.w f8267n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p085q.b f8268o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(p126x2.w wVar, p085q.b bVar, p111u4.d dVar) {
        super(2, dVar);
        this.f8267n = wVar;
        this.f8268o = bVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        E4.k.f("completion", dVar);
        H0 h1 = new H0(this.f8267n, this.f8268o, dVar);
        h1.f8265l = (InterfaceC0335w) obj;
        return h1;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((H0) b(obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) throws FuelError {
        v4.a aVar = v4.a.f13292h;
        int i = this.f8266m;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S1.V.O(obj);
            return obj;
        }
        S1.V.O(obj);
        this.f8266m = 1;
        Serializable serializableA = p137z2.a.a(this.f8267n, this.f8268o, this);
        return serializableA == aVar ? aVar : serializableA;
    }
}
