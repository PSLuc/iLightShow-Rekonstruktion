package L;

import B.C0003b0;
import N.C0217h0;
import N.C0222k;
import N.C0230o;
import X.C0384a;
import p090r.C0868g;
import p090r.C0873l;
import p123x.AbstractC1078k;
import p130y0.AbstractC1124c0;

/* JADX INFO: renamed from: L.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0154l extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2816h = 1;
    public final /* synthetic */ V.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2817j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2818k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p084p4.e f2819l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2820m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f2821n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0154l(p096s.o0 o0Var, Object obj, D4.c cVar, C0873l c0873l, X.s sVar, V.a aVar) {
        super(2);
        this.f2817j = o0Var;
        this.f2818k = obj;
        this.f2819l = cVar;
        this.f2820m = c0873l;
        this.f2821n = sVar;
        this.i = aVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        p084p4.x xVar = p084p4.x.f10867a;
        Object obj3 = this.f2821n;
        Object obj4 = this.f2820m;
        p084p4.e eVar = this.f2819l;
        Object obj5 = this.f2817j;
        switch (this.f2816h) {
            case 0:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    float fY = ((S0.b) c0230o.k(AbstractC1124c0.f14367f)).y(M.s.f3297a) + 0.0f;
                    Z.l lVar = Z.l.f5957a;
                    p118w0.g gVar = p123x.d0.f13765a;
                    Z.o oVarL = com.fasterxml.jackson.databind.deser.std.d0.l(Z.a.a(lVar, new B.Z0(6, (p123x.K) obj5)));
                    f2 f2Var = (f2) this.f2818k;
                    AbstractC0169q.c(oVarL, fY, f2Var.f2732c, f2Var.f2733d, f2Var.f2734e, (D4.e) eVar, (G0.J) obj4, AbstractC1078k.f13781e, AbstractC1078k.f13777a, this.i, (V.a) obj3, c0230o, 113246208, 3126);
                }
                break;
            default:
                C0230o c0230o2 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    Object objK = c0230o2.K();
                    N.U u6 = C0222k.f3714a;
                    D4.c cVar = (D4.c) eVar;
                    C0873l c0873l = (C0873l) obj4;
                    if (objK == u6) {
                        objK = (p090r.w) cVar.invoke(c0873l);
                        c0230o2.f0(objK);
                    }
                    p090r.w wVar = (p090r.w) objK;
                    p096s.o0 o0Var = (p096s.o0) obj5;
                    Object objC = o0Var.f().c();
                    Object obj6 = this.f2818k;
                    boolean zG = c0230o2.g(E4.k.a(objC, obj6));
                    Object objK2 = c0230o2.K();
                    if (zG || objK2 == u6) {
                        objK2 = E4.k.a(o0Var.f().c(), obj6) ? p090r.H.f11376b : ((p090r.w) cVar.invoke(c0873l)).f11445b;
                        c0230o2.f0(objK2);
                    }
                    p090r.H h6 = (p090r.H) objK2;
                    Object objK3 = c0230o2.K();
                    C0217h0 c0217h0 = o0Var.f12059d;
                    if (objK3 == u6) {
                        objK3 = new C0868g(E4.k.a(obj6, c0217h0.getValue()));
                        c0230o2.f0(objK3);
                    }
                    C0868g c0868g = (C0868g) objK3;
                    p090r.G g6 = wVar.f11444a;
                    boolean zH = c0230o2.h(wVar);
                    Object objK4 = c0230o2.K();
                    if (zH || objK4 == u6) {
                        objK4 = new B.Z0(4, wVar);
                        c0230o2.f0(objK4);
                    }
                    Z.o oVarB = androidx.compose.ui.layout.a.b((D4.f) objK4);
                    c0868g.f11403a.setValue(Boolean.valueOf(E4.k.a(obj6, c0217h0.getValue())));
                    Z.o oVarK = oVarB.k(c0868g);
                    boolean zH2 = c0230o2.h(obj6);
                    Object objK5 = c0230o2.K();
                    if (zH2 || objK5 == u6) {
                        objK5 = new C0384a(1, obj6);
                        c0230o2.f0(objK5);
                    }
                    D4.c cVar2 = (D4.c) objK5;
                    boolean zF = c0230o2.f(h6);
                    Object objK6 = c0230o2.K();
                    if (zF || objK6 == u6) {
                        objK6 = new C0003b0(18, h6);
                        c0230o2.f0(objK6);
                    }
                    androidx.compose.animation.a.a((p096s.o0) obj5, cVar2, oVarK, g6, h6, (D4.e) objK6, V.b.c(-616195562, new B.G0((X.s) obj3, obj6, c0873l, this.i, 1), c0230o2), c0230o2, 12582912);
                }
                break;
        }
        return xVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0154l(p123x.K k3, f2 f2Var, D4.e eVar, G0.J j4, V.a aVar, V.a aVar2) {
        super(2);
        this.f2817j = k3;
        this.f2818k = f2Var;
        this.f2819l = eVar;
        this.f2820m = j4;
        this.i = aVar;
        this.f2821n = aVar2;
    }
}
