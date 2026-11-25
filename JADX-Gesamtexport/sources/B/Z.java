package B;

import P4.AbstractC0336x;
import P4.InterfaceC0335w;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f270l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p091r0.A f271m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ D0 f272n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ F.P f273o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(p091r0.A a6, D0 d1, F.P p6, p111u4.d dVar) {
        super(2, dVar);
        this.f271m = a6;
        this.f272n = d1;
        this.f273o = p6;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        Z z5 = new Z(this.f271m, this.f272n, this.f273o, dVar);
        z5.f270l = obj;
        return z5;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        Z z5 = (Z) b((InterfaceC0335w) obj, (p111u4.d) obj2);
        p084p4.x xVar = p084p4.x.f10867a;
        z5.o(xVar);
        return xVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        S1.V.O(obj);
        InterfaceC0335w interfaceC0335w = (InterfaceC0335w) this.f270l;
        p091r0.A a6 = this.f271m;
        AbstractC0336x.o(interfaceC0335w, null, new X(a6, this.f272n, null), 1);
        AbstractC0336x.o(interfaceC0335w, null, new Y(a6, this.f273o, null), 1);
        return p084p4.x.f10867a;
    }
}
