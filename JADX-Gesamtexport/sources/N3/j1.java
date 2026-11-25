package N3;

import L.J1;
import L.W1;
import L.e2;
import L.g2;
import L.h2;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.InterfaceC0203a0;
import N.InterfaceC0225l0;
import androidx.compose.foundation.layout.FillElement;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.R;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.RecurringDays;
import p123x.AbstractC1070c;
import p123x.AbstractC1078k;
import p123x.AbstractC1088v;
import p123x.C1090x;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: loaded from: classes.dex */
public final class j1 implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4203h;
    public final /* synthetic */ InterfaceC0203a0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4204j;

    public /* synthetic */ j1(InterfaceC0203a0 interfaceC0203a0, InterfaceC0203a0 interfaceC0203a1, int i) {
        this.f4203h = i;
        this.i = interfaceC0203a0;
        this.f4204j = interfaceC0203a1;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        p084p4.x xVar = p084p4.x.f10867a;
        InterfaceC0203a0 interfaceC0203a0 = this.f4204j;
        N.U u6 = C0222k.f3714a;
        InterfaceC0203a0 interfaceC0203a1 = this.i;
        switch (this.f4203h) {
            case 0:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    c0230o.V(-1983679415);
                    Object objK = c0230o.K();
                    if (objK == u6) {
                        objK = new C0277m(interfaceC0203a1, interfaceC0203a0, 2);
                        c0230o.f0(objK);
                    }
                    c0230o.p(false);
                    L.L.g((D4.a) objK, null, false, null, null, null, null, U.f4114b, c0230o, 805306374);
                }
                break;
            case 1:
                C0230o c0230o2 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    Z.l lVar = Z.l.f5957a;
                    C1090x c1090xA = AbstractC1088v.a(AbstractC1078k.f13779c, Z.b.f5943s, c0230o2, 0);
                    int i = c0230o2.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M = c0230o2.m();
                    Z.o oVarC = Z.a.c(c0230o2, lVar);
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n = C1101i.f14038b;
                    c0230o2.Z();
                    if (c0230o2.f3743O) {
                        c0230o2.l(c1106n);
                    } else {
                        c0230o2.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o2, c1090xA);
                    C0208d.R(C1101i.f14040d, c0230o2, interfaceC0225l0M);
                    C1100h c1100h = C1101i.f14042f;
                    if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i))) {
                        p012c.k.y(i, c0230o2, i, c1100h);
                    }
                    C0208d.R(C1101i.f14039c, c0230o2, oVarC);
                    String str = (String) interfaceC0203a1.getValue();
                    FillElement fillElement = androidx.compose.foundation.layout.c.f6634a;
                    c0230o2.V(-1693082283);
                    Object objK2 = c0230o2.K();
                    if (objK2 == u6) {
                        objK2 = new C0259d(7, interfaceC0203a1);
                        c0230o2.f0(objK2);
                    }
                    c0230o2.p(false);
                    W1.a(str, (D4.c) objK2, fillElement, false, null, U.f4116d, null, null, null, 0, 0, null, null, null, c0230o2, 1573296);
                    c0230o2.V(-1693075189);
                    if (!M4.l.i0((String) interfaceC0203a0.getValue())) {
                        e2.b((String) interfaceC0203a0.getValue(), androidx.compose.foundation.layout.a.k(lVar, 0.0f, 8, 0.0f, 0.0f, 13), p035g0.r.f9081g, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o2.k(h2.f2777a)).f2758n, c0230o2, 432, 0, 65528);
                    }
                    c0230o2.p(false);
                    c0230o2.p(true);
                }
                break;
            case 2:
                C0230o c0230o3 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o3.B()) {
                    c0230o3.P();
                } else {
                    c0230o3.V(-1983659332);
                    Object objK3 = c0230o3.K();
                    if (objK3 == u6) {
                        objK3 = new C0277m(interfaceC0203a1, interfaceC0203a0, 3);
                        c0230o3.f0(objK3);
                    }
                    c0230o3.p(false);
                    L.L.a((D4.a) objK3, null, false, null, null, null, null, null, U.f4117e, c0230o3, 805306374, 510);
                }
                break;
            default:
                C0230o c0230o4 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o4.B()) {
                    c0230o4.P();
                } else {
                    Z.f fVar = Z.b.f5942r;
                    Z.l lVar2 = Z.l.f5957a;
                    float f6 = 16;
                    Z.o oVarK = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.c(lVar2, 54), f6, 0.0f, f6, 0.0f, 10);
                    p123x.U uA = p123x.T.a(AbstractC1078k.f13777a, fVar, c0230o4, 48);
                    int i3 = c0230o4.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M2 = c0230o4.m();
                    Z.o oVarC2 = Z.a.c(c0230o4, oVarK);
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n2 = C1101i.f14038b;
                    c0230o4.Z();
                    if (c0230o4.f3743O) {
                        c0230o4.l(c1106n2);
                    } else {
                        c0230o4.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o4, uA);
                    C0208d.R(C1101i.f14040d, c0230o4, interfaceC0225l0M2);
                    C1100h c1100h2 = C1101i.f14042f;
                    if (c0230o4.f3743O || !E4.k.a(c0230o4.K(), Integer.valueOf(i3))) {
                        p012c.k.y(i3, c0230o4, i3, c1100h2);
                    }
                    C0208d.R(C1101i.f14039c, c0230o4, oVarC2);
                    e2.b(AbstractC0599v0.K(R.string.settings_hue_legacy_mode, c0230o4), lVar2, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o4, 48, 0, 131068);
                    AbstractC1070c.b(c0230o4, p123x.V.a(lVar2, 1.0f));
                    int i6 = m1.f4225b;
                    boolean zBooleanValue = ((Boolean) interfaceC0203a1.getValue()).booleanValue();
                    c0230o4.V(-1755303946);
                    Object objK4 = c0230o4.K();
                    if (objK4 == u6) {
                        objK4 = new C0263f(interfaceC0203a0, interfaceC0203a1);
                        c0230o4.f0(objK4);
                    }
                    c0230o4.p(false);
                    J1.a(zBooleanValue, (D4.c) objK4, null, false, null, null, c0230o4, 48, RecurringDays.RECURRING_WEEKDAYS);
                    c0230o4.p(true);
                }
                break;
        }
        return xVar;
    }
}
