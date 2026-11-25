package L;

import N.C0208d;
import N.C0230o;
import N.InterfaceC0203a0;
import p096s.AbstractC0909d;
import p096s.AbstractC0914g;
import p101t.C0952u;

/* JADX INFO: loaded from: classes.dex */
public final class O1 extends E4.l implements D4.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f2440h;
    public final /* synthetic */ p117w.m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ K1 f2441j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f2442k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f2443l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O1(boolean z5, p117w.m mVar, K1 k3, float f6, float f7) {
        super(3);
        this.f2440h = z5;
        this.i = mVar;
        this.f2441j = k3;
        this.f2442k = f6;
        this.f2443l = f7;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        long j4;
        N.V0 v0N;
        N.V0 v0N2;
        C0230o c0230o = (C0230o) obj2;
        ((Number) obj3).intValue();
        c0230o.W(-891038934);
        c0230o.W(-1633063017);
        p117w.m mVar = this.i;
        InterfaceC0203a0 interfaceC0203a0Q = p027e3.a.Q(mVar, c0230o, 0);
        K1 k3 = this.f2441j;
        c0230o.W(-1877482635);
        InterfaceC0203a0 interfaceC0203a0Q2 = p027e3.a.Q(mVar, c0230o, 0);
        boolean z5 = this.f2440h;
        if (z5) {
            j4 = ((Boolean) interfaceC0203a0Q2.getValue()).booleanValue() ? k3.f2379l : k3.f2380m;
        } else {
            j4 = k3.f2381n;
        }
        if (z5) {
            c0230o.W(715804770);
            v0N = p090r.M.a(j4, AbstractC0909d.k(150, 6, null), null, c0230o, 48, 12);
            c0230o.p(false);
        } else {
            c0230o.W(715804875);
            v0N = C0208d.N(new p035g0.r(j4), c0230o);
            c0230o.p(false);
        }
        c0230o.p(false);
        boolean zBooleanValue = ((Boolean) interfaceC0203a0Q.getValue()).booleanValue();
        float f6 = this.f2443l;
        float f7 = zBooleanValue ? this.f2442k : f6;
        if (z5) {
            c0230o.W(-1927721478);
            v0N2 = AbstractC0914g.a(f7, AbstractC0909d.k(150, 6, null), c0230o);
            c0230o.p(false);
        } else {
            c0230o.W(-1927721380);
            v0N2 = C0208d.N(new S0.e(f6), c0230o);
            c0230o.p(false);
        }
        InterfaceC0203a0 interfaceC0203a0N = C0208d.N(new C0952u(((S0.e) v0N2.getValue()).f4887h, new p035g0.O(((p035g0.r) v0N.getValue()).f9087a)), c0230o);
        c0230o.p(false);
        Z.l lVar = Z.l.f5957a;
        C0952u c0952u = (C0952u) interfaceC0203a0N.getValue();
        float f8 = W1.f2557a;
        Z.o oVarC = androidx.compose.ui.draw.a.c(lVar, new V1(c0952u.f12432a, c0952u));
        c0230o.p(false);
        return oVarC;
    }
}
