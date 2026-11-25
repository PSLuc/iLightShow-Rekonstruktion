package com.nanjoran.ilightshow.Services;

import P4.InterfaceC0335w;
import java.io.Serializable;
import p130y0.C1136i0;

/* JADX INFO: loaded from: classes.dex */
public final class N0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InterfaceC0335w f8347l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8348m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p126x2.w f8349n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1136i0 f8350o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(p126x2.w wVar, C1136i0 c1136i0, p111u4.d dVar) {
        super(2, dVar);
        this.f8349n = wVar;
        this.f8350o = c1136i0;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        E4.k.f("completion", dVar);
        N0 n6 = new N0(this.f8349n, this.f8350o, dVar);
        n6.f8347l = (InterfaceC0335w) obj;
        return n6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((N0) b(obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f8348m;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S1.V.O(obj);
            return obj;
        }
        S1.V.O(obj);
        this.f8348m = 1;
        Serializable serializableB = p137z2.a.b(this.f8349n, this.f8350o, this);
        return serializableB == aVar ? aVar : serializableB;
    }
}
