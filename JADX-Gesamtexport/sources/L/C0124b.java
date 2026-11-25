package L;

import B.AbstractC0013g0;
import N.C0208d;
import N.C0230o;
import N.InterfaceC0225l0;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import p123x.AbstractC1078k;
import p123x.AbstractC1084q;
import p123x.AbstractC1088v;
import p123x.C1069b;
import p123x.C1086t;
import p123x.C1090x;
import p123x.C1091y;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: renamed from: L.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0124b extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2620h;
    public final /* synthetic */ V.a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0124b(V.a aVar, int i) {
        super(2);
        this.f2620h = 1;
        float f6 = AbstractC0151k.f2807a;
        float f7 = AbstractC0151k.f2807a;
        this.i = aVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        Z.l lVar = Z.l.f5957a;
        p084p4.x xVar = p084p4.x.f10867a;
        V.a aVar = this.i;
        switch (this.f2620h) {
            case 0:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    if (1.0f <= 0.0d) {
                        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
                    }
                    Z.o oVarK = androidx.compose.foundation.layout.a.f(new LayoutWeightElement(1.0f, false), AbstractC0136f.f2718e).k(new HorizontalAlignElement(Z.b.f5943s));
                    c0230o.W(733328855);
                    C1086t c1086tF = AbstractC1084q.f(Z.b.f5933h, false, c0230o, 0);
                    c0230o.W(-1323940314);
                    int i = c0230o.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n = C1101i.f14038b;
                    V.a aVarH = p113v0.U.h(oVarK);
                    c0230o.Z();
                    if (c0230o.f3743O) {
                        c0230o.l(c1106n);
                    } else {
                        c0230o.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o, c1086tF);
                    C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M);
                    C1100h c1100h = C1101i.f14042f;
                    if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i))) {
                        p012c.k.y(i, c0230o, i, c1100h);
                    }
                    AbstractC0013g0.p(0, aVarH, new N.C0(c0230o), c0230o, 2058660585);
                    aVar.d(c0230o, 0);
                    c0230o.p(false);
                    c0230o.p(true);
                    c0230o.p(false);
                    c0230o.p(false);
                }
                return xVar;
            case 1:
                ((Number) obj2).intValue();
                int iV = C0208d.V(439);
                float f6 = AbstractC0151k.f2807a;
                float f7 = AbstractC0151k.f2807a;
                AbstractC0136f.b(aVar, (C0230o) obj, iV);
                return xVar;
            case 2:
                C0230o c0230o2 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    C1069b c1069b = AbstractC1078k.f13778b;
                    Z.f fVar = Z.b.f5942r;
                    c0230o2.W(693286680);
                    p123x.U uA = p123x.T.a(c1069b, fVar, c0230o2, 54);
                    c0230o2.W(-1323940314);
                    int i3 = c0230o2.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M2 = c0230o2.m();
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n2 = C1101i.f14038b;
                    V.a aVarH2 = p113v0.U.h(lVar);
                    c0230o2.Z();
                    if (c0230o2.f3743O) {
                        c0230o2.l(c1106n2);
                    } else {
                        c0230o2.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o2, uA);
                    C0208d.R(C1101i.f14040d, c0230o2, interfaceC0225l0M2);
                    C1100h c1100h2 = C1101i.f14042f;
                    if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i3))) {
                        p012c.k.y(i3, c0230o2, i3, c1100h2);
                    }
                    AbstractC0013g0.p(0, aVarH2, new N.C0(c0230o2), c0230o2, 2058660585);
                    aVar.c(p123x.V.f13719a, c0230o2, 6);
                    AbstractC0013g0.q(c0230o2, false, true, false, false);
                }
                return xVar;
            case 3:
                C0230o c0230o3 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o3.B()) {
                    c0230o3.P();
                } else {
                    c0230o3.W(-483455358);
                    C1090x c1090xA = AbstractC1088v.a(AbstractC1078k.f13779c, Z.b.f5943s, c0230o3, 0);
                    c0230o3.W(-1323940314);
                    int i6 = c0230o3.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M3 = c0230o3.m();
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n3 = C1101i.f14038b;
                    V.a aVarH3 = p113v0.U.h(lVar);
                    c0230o3.Z();
                    if (c0230o3.f3743O) {
                        c0230o3.l(c1106n3);
                    } else {
                        c0230o3.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o3, c1090xA);
                    C0208d.R(C1101i.f14040d, c0230o3, interfaceC0225l0M3);
                    C1100h c1100h3 = C1101i.f14042f;
                    if (c0230o3.f3743O || !E4.k.a(c0230o3.K(), Integer.valueOf(i6))) {
                        p012c.k.y(i6, c0230o3, i6, c1100h3);
                    }
                    AbstractC0013g0.p(0, aVarH3, new N.C0(c0230o3), c0230o3, 2058660585);
                    aVar.c(C1091y.f13818a, c0230o3, 6);
                    AbstractC0013g0.q(c0230o3, false, true, false, false);
                }
                return xVar;
            default:
                C0230o c0230o4 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o4.B()) {
                    c0230o4.P();
                } else {
                    Z.o oVarC = androidx.compose.ui.layout.a.c(lVar, "Container");
                    c0230o4.W(733328855);
                    C1086t c1086tF2 = AbstractC1084q.f(Z.b.f5933h, true, c0230o4, 48);
                    c0230o4.W(-1323940314);
                    int i7 = c0230o4.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M4 = c0230o4.m();
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n4 = C1101i.f14038b;
                    V.a aVarH4 = p113v0.U.h(oVarC);
                    c0230o4.Z();
                    if (c0230o4.f3743O) {
                        c0230o4.l(c1106n4);
                    } else {
                        c0230o4.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o4, c1086tF2);
                    C0208d.R(C1101i.f14040d, c0230o4, interfaceC0225l0M4);
                    C1100h c1100h4 = C1101i.f14042f;
                    if (c0230o4.f3743O || !E4.k.a(c0230o4.K(), Integer.valueOf(i7))) {
                        p012c.k.y(i7, c0230o4, i7, c1100h4);
                    }
                    AbstractC0013g0.p(0, aVarH4, new N.C0(c0230o4), c0230o4, 2058660585);
                    aVar.d(c0230o4, 0);
                    c0230o4.p(false);
                    c0230o4.p(true);
                    c0230o4.p(false);
                    c0230o4.p(false);
                }
                return xVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0124b(V.a aVar, int i, byte b6) {
        super(2);
        this.f2620h = i;
        this.i = aVar;
    }
}
