package B;

import L.K1;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.InterfaceC0203a0;
import p112v.C0997p;
import p112v.InterfaceC1003s0;
import p130y0.AbstractC1124c0;

/* JADX INFO: loaded from: classes.dex */
public final class V0 extends E4.l implements D4.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f247h;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f248j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f249k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public V0(C0045x c0045x, boolean z5, D4.a aVar) {
        super(3);
        this.f247h = 3;
        this.f249k = c0045x;
        this.i = z5;
        this.f248j = (E4.l) aVar;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [D4.a, E4.l] */
    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        long j4;
        p117w.m mVar;
        p117w.m mVar2;
        switch (this.f247h) {
            case 0:
                C0230o c0230o = (C0230o) obj2;
                ((Number) obj3).intValue();
                c0230o.V(805428266);
                boolean z5 = c0230o.k(AbstractC1124c0.f14372l) == S0.k.i;
                W0 w6 = (W0) this.f249k;
                boolean z6 = ((p112v.W) w6.f256e.getValue()) == p112v.W.f12920h || !z5;
                boolean zF = c0230o.f(w6);
                Object objK = c0230o.K();
                N.U u6 = C0222k.f3714a;
                if (zF || objK == u6) {
                    objK = new A2.e(4, w6);
                    c0230o.f0(objK);
                }
                InterfaceC0203a0 interfaceC0203a0N = C0208d.N((D4.c) objK, c0230o);
                Object objK2 = c0230o.K();
                if (objK2 == u6) {
                    C0997p c0997p = new C0997p(new r(3, interfaceC0203a0N));
                    c0230o.f0(c0997p);
                    objK2 = c0997p;
                }
                InterfaceC1003s0 interfaceC1003s0 = (InterfaceC1003s0) objK2;
                boolean zF2 = c0230o.f(interfaceC1003s0) | c0230o.f(w6);
                Object objK3 = c0230o.K();
                if (zF2 || objK3 == u6) {
                    objK3 = new U0(interfaceC1003s0, w6);
                    c0230o.f0(objK3);
                }
                Z.o oVarB = androidx.compose.foundation.gestures.a.b(Z.l.f5957a, (U0) objK3, (p112v.W) w6.f256e.getValue(), null, this.i && w6.f253b.h() != 0.0f, z6, (p117w.m) this.f248j);
                c0230o.p(false);
                return oVarB;
            case 1:
                C0230o c0230o2 = (C0230o) obj2;
                ((Number) obj3).intValue();
                c0230o2.W(-502832279);
                K1 k3 = (K1) this.f249k;
                c0230o2.W(1167161306);
                InterfaceC0203a0 interfaceC0203a0Q = p027e3.a.Q((p117w.m) this.f248j, c0230o2, 0);
                if (this.i) {
                    j4 = ((Boolean) interfaceC0203a0Q.getValue()).booleanValue() ? k3.f2391x : k3.f2392y;
                } else {
                    j4 = k3.f2393z;
                }
                InterfaceC0203a0 interfaceC0203a0N2 = C0208d.N(new p035g0.r(j4), c0230o2);
                c0230o2.p(false);
                long j6 = ((p035g0.r) interfaceC0203a0N2.getValue()).f9087a;
                c0230o2.p(false);
                return new p035g0.r(j6);
            case 2:
                C0230o c0230o3 = (C0230o) obj2;
                ((Number) obj3).intValue();
                c0230o3.V(-756081143);
                p101t.X x6 = (p101t.X) c0230o3.k(androidx.compose.foundation.d.f6589a);
                if (x6 instanceof p101t.D) {
                    c0230o3.V(617140216);
                    c0230o3.p(false);
                    mVar = null;
                } else {
                    c0230o3.V(617248189);
                    Object objK4 = c0230o3.K();
                    if (objK4 == C0222k.f3714a) {
                        objK4 = new p117w.m();
                        c0230o3.f0(objK4);
                    }
                    mVar = (p117w.m) objK4;
                    c0230o3.p(false);
                }
                Z.o oVarD = androidx.compose.foundation.a.d(Z.l.f5957a, mVar, x6, this.i, (String) this.f249k, null, (D4.a) this.f248j);
                c0230o3.p(false);
                return oVarD;
            case 3:
                p107u.a aVar = (p107u.a) obj;
                C0230o c0230o4 = (C0230o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c0230o4.f(aVar) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c0230o4.B()) {
                    c0230o4.P();
                } else {
                    String str = (String) ((C0045x) this.f249k).d(c0230o4, 0);
                    if (M4.l.i0(str)) {
                        throw new IllegalStateException("Label must not be blank");
                    }
                    p107u.o.b(str, this.i, aVar, (E4.l) this.f248j, c0230o4, (iIntValue << 6) & 896);
                }
                return p084p4.x.f10867a;
            default:
                C0230o c0230o5 = (C0230o) obj2;
                ((Number) obj3).intValue();
                c0230o5.V(-2124609672);
                p101t.X x7 = (p101t.X) c0230o5.k(androidx.compose.foundation.d.f6589a);
                if (x7 instanceof p101t.D) {
                    c0230o5.V(-1412264498);
                    c0230o5.p(false);
                    mVar2 = null;
                } else {
                    c0230o5.V(-1412156525);
                    Object objK5 = c0230o5.K();
                    if (objK5 == C0222k.f3714a) {
                        objK5 = new p117w.m();
                        c0230o5.f0(objK5);
                    }
                    mVar2 = (p117w.m) objK5;
                    c0230o5.p(false);
                }
                Z.o oVarA = androidx.compose.foundation.selection.b.a(this.i, mVar2, x7, true, (E0.e) this.f249k, (D4.a) this.f248j);
                c0230o5.p(false);
                return oVarA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V0(Object obj, boolean z5, p117w.m mVar, int i) {
        super(3);
        this.f247h = i;
        this.f249k = obj;
        this.i = z5;
        this.f248j = mVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V0(boolean z5, Object obj, D4.a aVar, int i) {
        super(3);
        this.f247h = i;
        this.i = z5;
        this.f249k = obj;
        this.f248j = aVar;
    }
}
