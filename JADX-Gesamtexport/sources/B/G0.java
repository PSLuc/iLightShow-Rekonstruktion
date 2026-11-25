package B;

import N.C0208d;
import N.C0222k;
import N.C0230o;
import p090r.C0867f;
import p090r.C0873l;
import p090r.InterfaceC0878q;
import p130y0.AbstractC1124c0;

/* JADX INFO: loaded from: classes.dex */
public final class G0 extends E4.l implements D4.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f105h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f106j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f107k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f108l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(3);
        this.f105h = i;
        this.i = obj;
        this.f106j = obj2;
        this.f107k = obj3;
        this.f108l = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0152  */
    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        Object objC;
        switch (this.f105h) {
            case 0:
                Z.o oVar = (Z.o) obj;
                C0230o c0230o = (C0230o) obj2;
                ((Number) obj3).intValue();
                c0230o.V(-84507373);
                Object objK = c0230o.K();
                N.U u6 = C0222k.f3714a;
                if (objK == u6) {
                    objK = new D.q();
                    c0230o.f0(objK);
                }
                D.q qVar = (D.q) objK;
                p035g0.O o6 = (p035g0.O) this.i;
                boolean z5 = o6.f9050a != 16;
                if (((p130y0.N0) ((p130y0.M0) c0230o.k(AbstractC1124c0.f14378r))).a()) {
                    C0036s0 c0036s0 = (C0036s0) this.f106j;
                    if (c0036s0.b()) {
                        M0.w wVar = (M0.w) this.f107k;
                        long j4 = wVar.f3454b;
                        if (G0.I.b(j4) && z5) {
                            c0230o.V(808320157);
                            G0.I i = new G0.I(j4);
                            boolean zH = c0230o.h(qVar);
                            Object objK2 = c0230o.K();
                            if (zH || objK2 == u6) {
                                objK2 = new E0(qVar, null);
                                c0230o.f0(objK2);
                            }
                            C0208d.f(wVar.f3453a, i, (D4.e) objK2, c0230o);
                            boolean zH2 = c0230o.h(qVar);
                            M0.q qVar2 = (M0.q) this.f108l;
                            boolean zH3 = c0230o.h(qVar2) | zH2 | c0230o.f(wVar) | c0230o.h(c0036s0) | c0230o.f(o6);
                            Object objK3 = c0230o.K();
                            if (zH3 || objK3 == u6) {
                                F0 f6 = new F0(qVar, qVar2, wVar, c0036s0, o6, 0);
                                c0230o.f0(f6);
                                objK3 = f6;
                            }
                            objC = androidx.compose.ui.draw.a.c(oVar, (D4.c) objK3);
                            c0230o.p(false);
                        } else {
                            c0230o.V(809534830);
                            c0230o.p(false);
                            objC = Z.l.f5957a;
                        }
                    } else {
                        c0230o.V(809534830);
                        c0230o.p(false);
                        objC = Z.l.f5957a;
                    }
                } else {
                    c0230o.V(809534830);
                    c0230o.p(false);
                    objC = Z.l.f5957a;
                }
                c0230o.p(false);
                return objC;
            default:
                InterfaceC0878q interfaceC0878q = (InterfaceC0878q) obj;
                C0230o c0230o2 = (C0230o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? c0230o2.f(interfaceC0878q) : c0230o2.h(interfaceC0878q) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    X.s sVar = (X.s) this.i;
                    boolean zF = c0230o2.f(sVar);
                    Object obj4 = this.f106j;
                    boolean zH4 = zF | c0230o2.h(obj4);
                    C0873l c0873l = (C0873l) this.f107k;
                    boolean zH5 = zH4 | c0230o2.h(c0873l);
                    Object objK4 = c0230o2.K();
                    N.U u7 = C0222k.f3714a;
                    if (zH5 || objK4 == u7) {
                        objK4 = new C0026n(sVar, obj4, c0873l, 9);
                        c0230o2.f0(objK4);
                    }
                    C0208d.c(interfaceC0878q, (D4.c) objK4, c0230o2);
                    p080p.x xVar = c0873l.f11416e;
                    E4.k.d("null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl", interfaceC0878q);
                    xVar.i(obj4, ((p090r.r) interfaceC0878q).f11431a);
                    Object objK5 = c0230o2.K();
                    if (objK5 == u7) {
                        objK5 = new C0867f();
                        c0230o2.f0(objK5);
                    }
                    ((V.a) this.f108l).k((C0867f) objK5, obj4, c0230o2, 0);
                }
                return p084p4.x.f10867a;
        }
    }
}
