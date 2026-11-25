package B;

/* JADX INFO: loaded from: classes.dex */
public final class S extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ M0.C f225h;
    public final /* synthetic */ M0.w i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ M0.m f227k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0036s0 f228l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M0.q f229m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ F.P f230n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p024e0.n f231o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(M0.C c6, M0.w wVar, boolean z5, M0.m mVar, C0036s0 c0036s0, M0.q qVar, F.P p6, p024e0.n nVar) {
        super(1);
        this.f225h = c6;
        this.i = wVar;
        this.f226j = z5;
        this.f227k = mVar;
        this.f228l = c0036s0;
        this.f229m = qVar;
        this.f230n = p6;
        this.f231o = nVar;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        E0.h hVar = (E0.h) obj;
        M0.C c6 = this.f225h;
        K4.e[] eVarArr = E0.q.f997a;
        E0.r rVar = E0.o.f993x;
        K4.e[] eVarArr2 = E0.q.f997a;
        K4.e eVar = eVarArr2[16];
        rVar.a(hVar, c6.f3392a);
        M0.w wVar = this.i;
        E0.r rVar2 = E0.o.f994y;
        K4.e eVar2 = eVarArr2[17];
        long j4 = wVar.f3454b;
        rVar2.a(hVar, new G0.I(j4));
        boolean z5 = this.f226j;
        if (!z5) {
            E0.q.c(hVar);
        }
        p084p4.x xVar = p084p4.x.f10867a;
        E0.r rVar3 = E0.o.f969E;
        K4.e eVar3 = eVarArr2[23];
        rVar3.a(hVar, Boolean.valueOf(z5));
        C0036s0 c0036s0 = this.f228l;
        E0.q.d(hVar, new J(c0036s0, 2));
        if (z5) {
            hVar.i(E0.g.f921h, new E0.a(null, new J(c0036s0, hVar)));
            hVar.i(E0.g.f924l, new E0.a(null, new P(z5, c0036s0, hVar, wVar)));
        }
        M0.q qVar = this.f229m;
        F.P p6 = this.f230n;
        hVar.i(E0.g.f920g, new E0.a(null, new Q(qVar, this.f226j, wVar, p6, c0036s0)));
        M0.m mVar = this.f227k;
        int i = mVar.f3434d;
        C0024m c0024m = new C0024m(c0036s0, 2, mVar);
        hVar.i(E0.o.f995z, new M0.l(i));
        hVar.i(E0.g.f925m, new E0.a(null, c0024m));
        hVar.i(E0.g.f915b, new E0.a(null, new C0024m(c0036s0, 3, this.f231o)));
        hVar.i(E0.g.f916c, new E0.a(null, new O(p6, 1)));
        if (!G0.I.b(j4)) {
            hVar.i(E0.g.f926n, new E0.a(null, new O(p6, 2)));
            if (z5) {
                hVar.i(E0.g.f927o, new E0.a(null, new O(p6, 3)));
            }
        }
        if (z5) {
            hVar.i(E0.g.f928p, new E0.a(null, new O(p6, 0)));
        }
        return xVar;
    }
}
