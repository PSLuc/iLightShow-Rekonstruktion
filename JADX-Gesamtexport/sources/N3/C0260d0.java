package N3;

import P4.InterfaceC0335w;

/* JADX INFO: renamed from: N3.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0260d0 extends p122w4.i implements D4.e {
    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new C0260d0(2, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        C0260d0 c0260d0 = (C0260d0) b((InterfaceC0335w) obj, (p111u4.d) obj2);
        p084p4.x xVar = p084p4.x.f10867a;
        c0260d0.o(xVar);
        return xVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        S1.V.O(obj);
        J3.e eVar = com.nanjoran.ilightshow.Services.M.f8305O.f8317c;
        if (eVar != null) {
            eVar.d(false);
        }
        return p084p4.x.f10867a;
    }
}
