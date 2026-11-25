package N3;

import P4.InterfaceC0335w;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ defpackage.t f3948l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(defpackage.t tVar, p111u4.d dVar) {
        super(2, dVar);
        this.f3948l = tVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new E0(this.f3948l, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        E0 e6 = (E0) b((InterfaceC0335w) obj, (p111u4.d) obj2);
        p084p4.x xVar = p084p4.x.f10867a;
        e6.o(xVar);
        return xVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        S1.V.O(obj);
        K4.e[] eVarArr = P0.f4082a;
        K4.e eVar = eVarArr[1];
        defpackage.t tVar = this.f3948l;
        if (!((Boolean) tVar.a(eVar)).booleanValue()) {
            tVar.b(eVarArr[1], Boolean.TRUE);
            defpackage.f.c("first_launch", null, null, 30);
        }
        return p084p4.x.f10867a;
    }
}
