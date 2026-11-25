package N3;

import P4.InterfaceC0335w;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ F1.I f4151l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(F1.I i, p111u4.d dVar) {
        super(2, dVar);
        this.f4151l = i;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new a1(this.f4151l, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        a1 a1Var = (a1) b((InterfaceC0335w) obj, (p111u4.d) obj2);
        p084p4.x xVar = p084p4.x.f10867a;
        a1Var.o(xVar);
        return xVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        F1.I i;
        v4.a aVar = v4.a.f13292h;
        S1.V.O(obj);
        if (com.nanjoran.ilightshow.Services.E0.f8249o.a() == com.nanjoran.ilightshow.Services.F0.MEMBERSHIP_V3 && !com.nanjoran.ilightshow.Services.E0.d() && (i = this.f4151l) != null) {
            i.l();
        }
        return p084p4.x.f10867a;
    }
}
