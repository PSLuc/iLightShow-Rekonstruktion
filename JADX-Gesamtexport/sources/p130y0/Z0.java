package p130y0;

import D4.e;
import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class Z0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14336l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b1 f14337m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(b1 b1Var, d dVar) {
        super(2, dVar);
        this.f14337m = b1Var;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new Z0(this.f14337m, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((Z0) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) throws Throwable {
        a aVar = a.f13292h;
        int i = this.f14336l;
        x xVar = x.f10867a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
            return xVar;
        }
        V.O(obj);
        r rVar = this.f14337m.f14355h;
        this.f14336l = 1;
        Object objA = rVar.f14509u.a(this);
        if (objA != aVar) {
            objA = xVar;
        }
        return objA == aVar ? aVar : xVar;
    }
}
