package T4;

import P4.InterfaceC0335w;
import S1.V;
import S4.F;
import S4.InterfaceC0369f;

/* JADX INFO: loaded from: classes.dex */
public final class d extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5259l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f5260m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0369f f5261n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f f5262o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC0369f interfaceC0369f, f fVar, p111u4.d dVar) {
        super(2, dVar);
        this.f5261n = interfaceC0369f;
        this.f5262o = fVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        d dVar2 = new d(this.f5261n, this.f5262o, dVar);
        dVar2.f5260m = obj;
        return dVar2;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((d) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) throws Throwable {
        v4.a aVar = v4.a.f13292h;
        int i = this.f5259l;
        p084p4.x xVar = p084p4.x.f10867a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
            return xVar;
        }
        V.O(obj);
        R4.n nVarG = this.f5262o.g((InterfaceC0335w) this.f5260m);
        this.f5259l = 1;
        Object objG = F.g(this.f5261n, nVarG, true, this);
        if (objG != aVar) {
            objG = xVar;
        }
        return objG == aVar ? aVar : xVar;
    }
}
