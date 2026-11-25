package com.nanjoran.ilightshow.Services;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0681l0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f8427l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0688o0 f8428m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f8429n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0681l0(C0688o0 c0688o0, int i, p111u4.d dVar) {
        super(2, dVar);
        this.f8428m = c0688o0;
        this.f8429n = i;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        C0681l0 c0681l0 = new C0681l0(this.f8428m, this.f8429n, dVar);
        c0681l0.f8427l = obj;
        return c0681l0;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        C0681l0 c0681l0 = (C0681l0) b((p114v1.b) obj, (p111u4.d) obj2);
        p084p4.x xVar = p084p4.x.f10867a;
        c0681l0.o(xVar);
        return xVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        S1.V.O(obj);
        p114v1.b bVar = (p114v1.b) this.f8427l;
        p114v1.e eVar = this.f8428m.f8452c;
        Integer num = new Integer(this.f8429n);
        bVar.getClass();
        E4.k.f("key", eVar);
        bVar.d(eVar, num);
        return p084p4.x.f10867a;
    }
}
