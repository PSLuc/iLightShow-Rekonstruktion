package B;

import N.C0222k;
import N.C0230o;

/* JADX INFO: loaded from: classes.dex */
public final class M0 extends E4.l implements D4.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0036s0 f179h;
    public final /* synthetic */ F.P i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ M0.w f180j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f181k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f182l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M0.q f183m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j1 f184n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ J f185o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f186p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(C0036s0 c0036s0, F.P p6, M0.w wVar, boolean z5, boolean z6, M0.q qVar, j1 j1Var, J j4, int i) {
        super(3);
        this.f179h = c0036s0;
        this.i = p6;
        this.f180j = wVar;
        this.f181k = z5;
        this.f182l = z6;
        this.f183m = qVar;
        this.f184n = j1Var;
        this.f185o = j4;
        this.f186p = i;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        C0230o c0230o = (C0230o) obj2;
        ((Number) obj3).intValue();
        c0230o.V(851809892);
        Object objK = c0230o.K();
        N.U u6 = C0222k.f3714a;
        if (objK == u6) {
            objK = new F.X();
            c0230o.f0(objK);
        }
        F.X x6 = (F.X) objK;
        Object objK2 = c0230o.K();
        if (objK2 == u6) {
            objK2 = new C0007d0();
            c0230o.f0(objK2);
        }
        C0036s0 c0036s0 = this.f179h;
        F.P p6 = this.i;
        M0.w wVar = this.f180j;
        M0.q qVar = this.f183m;
        j1 j1Var = this.f184n;
        K0 k3 = new K0(c0036s0, p6, wVar, this.f181k, this.f182l, x6, qVar, j1Var, (C0007d0) objK2, this.f185o, this.f186p);
        boolean zH = c0230o.h(k3);
        Object objK3 = c0230o.K();
        if (zH || objK3 == u6) {
            L0 l6 = new L0(1, k3, K0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0);
            c0230o.f0(l6);
            objK3 = l6;
        }
        Z.o oVarA = androidx.compose.ui.input.key.a.a((D4.c) ((E4.i) objK3));
        c0230o.p(false);
        return oVarA;
    }
}
