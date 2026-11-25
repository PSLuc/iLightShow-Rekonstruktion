package B;

import P4.AbstractC0336x;
import P4.InterfaceC0335w;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f74l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ D.q f75m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(D.q qVar, p111u4.d dVar) {
        super(2, dVar);
        this.f75m = qVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new E0(this.f75m, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((E0) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) throws Throwable {
        v4.a aVar = v4.a.f13292h;
        int i = this.f74l;
        p084p4.x xVar = p084p4.x.f10867a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S1.V.O(obj);
            return xVar;
        }
        S1.V.O(obj);
        this.f74l = 1;
        D.q qVar = this.f75m;
        qVar.getClass();
        Object objD = AbstractC0336x.d(new D.p(qVar, null), this);
        if (objD != aVar) {
            objD = xVar;
        }
        return objD == aVar ? aVar : xVar;
    }
}
