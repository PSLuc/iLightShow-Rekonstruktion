package B;

import P4.InterfaceC0335w;

/* JADX INFO: loaded from: classes.dex */
public final class K extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f148l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p129y.c f149m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ M0.w f150n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0036s0 f151o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ a1 f152p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ M0.q f153q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(p129y.c cVar, M0.w wVar, C0036s0 c0036s0, a1 a1Var, M0.q qVar, p111u4.d dVar) {
        super(2, dVar);
        this.f149m = cVar;
        this.f150n = wVar;
        this.f151o = c0036s0;
        this.f152p = a1Var;
        this.f153q = qVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new K(this.f149m, this.f150n, this.f151o, this.f152p, this.f153q, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((K) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        p030f0.d dVar;
        v4.a aVar = v4.a.f13292h;
        int i = this.f148l;
        p084p4.x xVar = p084p4.x.f10867a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S1.V.O(obj);
            return xVar;
        }
        S1.V.O(obj);
        C0 c6 = this.f151o.f416a;
        G0.G g6 = this.f152p.f281a;
        this.f148l = 1;
        int iB = this.f153q.b(G0.I.d(this.f150n.f3454b));
        if (iB < g6.f1458a.f1449a.f1494h.length()) {
            dVar = g6.b(iB);
        } else if (iB != 0) {
            dVar = g6.b(iB - 1);
        } else {
            dVar = new p030f0.d(0.0f, 0.0f, 1.0f, (int) (I0.a(c6.f55b, c6.f60g, c6.f61h, I0.f143a, 1) & 4294967295L));
        }
        Object objA = this.f149m.a(dVar, this);
        if (objA != aVar) {
            objA = xVar;
        }
        return objA == aVar ? aVar : xVar;
    }
}
