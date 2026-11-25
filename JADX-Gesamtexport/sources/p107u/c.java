package p107u;

import D4.e;
import S1.V;
import p084p4.x;
import p090r.v;
import p091r0.A;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12615l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f12616m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l f12617n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, d dVar) {
        super(2, dVar);
        this.f12617n = lVar;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        c cVar = new c(this.f12617n, dVar);
        cVar.f12616m = obj;
        return cVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((c) b((A) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f12615l;
        x xVar = x.f10867a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
            return xVar;
        }
        V.O(obj);
        A a6 = (A) this.f12616m;
        v vVar = new v(7, this.f12617n);
        this.f12615l = 1;
        Object objN = p006b.a.n(a6, new d(vVar, null), this);
        if (objN != aVar) {
            objN = xVar;
        }
        return objN == aVar ? aVar : xVar;
    }
}
