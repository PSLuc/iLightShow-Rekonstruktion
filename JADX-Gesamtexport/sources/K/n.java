package K;

import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import S1.V;

/* JADX INFO: loaded from: classes.dex */
public final class n extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f1994l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f1995m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, p111u4.d dVar) {
        super(2, dVar);
        this.f1995m = oVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        n nVar = new n(this.f1995m, dVar);
        nVar.f1994l = obj;
        return nVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((n) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        V.O(obj);
        return AbstractC0336x.o((InterfaceC0335w) this.f1994l, null, new m(this.f1995m, null), 3);
    }
}
