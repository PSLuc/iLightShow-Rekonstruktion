package N3;

import G0.C0106b;
import G0.C0107c;
import G0.C0110f;
import G0.C0115k;
import L.AbstractC0178t0;
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
import java.util.ListIterator;
import p035g0.C0709j;
import p035g0.C0710k;
import p058l0.C0823f;
import p123x.AbstractC1070c;
import p123x.AbstractC1078k;
import p123x.AbstractC1084q;
import p123x.AbstractC1088v;
import p123x.C1090x;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: renamed from: N3.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0262e0 implements D4.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4169h;
    public final /* synthetic */ InterfaceC0203a0 i;

    public /* synthetic */ C0262e0(int i, InterfaceC0203a0 interfaceC0203a0) {
        this.f4169h = i;
        this.i = interfaceC0203a0;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        X.s sVar;
        switch (this.f4169h) {
            case 0:
                C0230o c0230o = (C0230o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                E4.k.f("$this$TopAppBar", (p123x.V) obj);
                if ((iIntValue & 81) == 16 && c0230o.B()) {
                    c0230o.P();
                } else {
                    c0230o.V(-1099953750);
                    Object objK = c0230o.K();
                    if (objK == C0222k.f3714a) {
                        objK = new C0275l(9, this.i);
                        c0230o.f0(objK);
                    }
                    c0230o.p(false);
                    L.L.d((D4.a) objK, null, false, null, null, C.f3933g, c0230o, 196614, 30);
                }
                break;
            default:
                p123x.O o6 = (p123x.O) obj;
                C0230o c0230o2 = (C0230o) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                E4.k.f("innerPadding", o6);
                if ((iIntValue2 & 14) == 0) {
                    iIntValue2 |= c0230o2.f(o6) ? 4 : 2;
                }
                if ((iIntValue2 & 91) == 18 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    com.nanjoran.ilightshow.Services.M m6 = com.nanjoran.ilightshow.Services.M.f8305O;
                    J3.e eVar = m6.f8317c;
                    Z.l lVar = Z.l.f5957a;
                    if (eVar == null || (sVar = eVar.f1932b) == null || !sVar.isEmpty()) {
                        c0230o2.V(-1980770966);
                        float f6 = 16;
                        Z.o oVarA = S1.h0.A(androidx.compose.foundation.layout.a.f(androidx.compose.foundation.layout.a.g(com.fasterxml.jackson.databind.deser.std.d0.G().k(androidx.compose.foundation.layout.c.f6635b), f6).k(androidx.compose.foundation.layout.c.f6634a), o6), S1.h0.v(c0230o2));
                        C1090x c1090xA = AbstractC1088v.a(AbstractC1078k.f13779c, Z.b.f5943s, c0230o2, 0);
                        int i = c0230o2.f3744P;
                        InterfaceC0225l0 interfaceC0225l0M = c0230o2.m();
                        Z.o oVarC = Z.a.c(c0230o2, oVarA);
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
                        String strK = AbstractC0599v0.K(R.string.devices_supported_message, c0230o2);
                        N.W0 w6 = h2.f2777a;
                        e2.b(strK, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o2.k(w6)).f2756l, c0230o2, 0, 0, 65534);
                        String strK2 = AbstractC0599v0.K(R.string.devices_nanoleaf_essentials_requirement, c0230o2);
                        G0.J j4 = ((g2) c0230o2.k(w6)).f2756l;
                        long j6 = p035g0.r.f9078d;
                        e2.b(strK2, null, j6, 0L, null, 0L, null, 0L, 0, false, 0, 0, j4, c0230o2, 384, 0, 65530);
                        String strK3 = AbstractC0599v0.K(R.string.devices_supported_essentials_link, c0230o2);
                        String strK4 = AbstractC0599v0.K(R.string.devices_supported_essentials_link_part, c0230o2);
                        c0230o2.V(-1099888759);
                        C0107c c0107c = new C0107c();
                        int iG0 = M4.l.g0(strK3, strK4, 0, 6);
                        int length = strK4.length() + iG0;
                        c0107c.f1487h.append(strK3);
                        c0107c.a(new G0.C(((L.D) c0230o2.k(L.F.f2265a)).f2211a, 0L, (L0.k) null, (L0.i) null, (L0.j) null, (L0.p) null, (String) null, 0L, (R0.a) null, (R0.o) null, (N0.b) null, 0L, R0.j.f4747c, (p035g0.L) null, 61438), iG0, length);
                        c0107c.f1489k.add(new C0106b(iG0, length, new C0115k("https://nanoleaf.atlassian.net/wiki/spaces/nlapid/pages/2296381472/Nanoleaf+Matter+WiFi+Essentials+Open+API+Documentation#Introduction", null, 6)));
                        C0110f c0110fC = c0107c.c();
                        c0230o2.p(false);
                        e2.c(c0110fC, null, j6, 0L, 0L, 0L, 0, false, 0, 0, null, null, ((g2) c0230o2.k(w6)).f2756l, c0230o2, 384);
                        C0230o c0230o3 = c0230o2;
                        J3.e eVar2 = m6.f8317c;
                        X.s sVar2 = eVar2 != null ? eVar2.f1932b : null;
                        c0230o3.V(-1099858121);
                        if (sVar2 != null) {
                            ListIterator listIterator = sVar2.listIterator();
                            while (true) {
                                X.y yVar = (X.y) listIterator;
                                if (yVar.hasNext()) {
                                    K3.a aVar = (K3.a) yVar.next();
                                    C0230o c0230o4 = c0230o3;
                                    AbstractC0599v0.b(new Y(aVar, this.i, 1), null, 0L, V.b.c(1119029979, new C0266g0(0, aVar), c0230o3), c0230o4, 3072, 6);
                                    L.L.c(null, 0.0f, 0L, c0230o4, 0, 7);
                                    c0230o3 = c0230o4;
                                }
                            }
                        }
                        c0230o3.p(false);
                        Z.o oVarG = androidx.compose.foundation.layout.a.g(lVar, f6);
                        p123x.U uA = p123x.T.a(AbstractC1078k.f13782f, Z.b.f5942r, c0230o3, 54);
                        int i3 = c0230o3.f3744P;
                        InterfaceC0225l0 interfaceC0225l0M2 = c0230o3.m();
                        Z.o oVarC2 = Z.a.c(c0230o3, oVarG);
                        InterfaceC1102j.f14043g.getClass();
                        C1106n c1106n2 = C1101i.f14038b;
                        c0230o3.Z();
                        if (c0230o3.f3743O) {
                            c0230o3.l(c1106n2);
                        } else {
                            c0230o3.i0();
                        }
                        C0208d.R(C1101i.f14041e, c0230o3, uA);
                        C0208d.R(C1101i.f14040d, c0230o3, interfaceC0225l0M2);
                        C1100h c1100h2 = C1101i.f14042f;
                        if (c0230o3.f3743O || !E4.k.a(c0230o3.K(), Integer.valueOf(i3))) {
                            p012c.k.y(i3, c0230o3, i3, c1100h2);
                        }
                        C0208d.R(C1101i.f14039c, c0230o3, oVarC2);
                        AbstractC1070c.b(c0230o3, p123x.V.a(lVar, 1.0f));
                        AbstractC0178t0.a(androidx.compose.foundation.layout.c.h(lVar, 30), 0L, 0.0f, 0L, 0, c0230o3, 6, 30);
                        AbstractC1070c.b(c0230o3, p123x.V.a(lVar, 1.0f));
                        c0230o3.p(true);
                        c0230o3.p(true);
                        c0230o3.p(false);
                    } else {
                        c0230o2.V(-1981607563);
                        FillElement fillElement = androidx.compose.foundation.layout.c.f6635b;
                        p113v0.F fE = AbstractC1084q.e(Z.b.f5936l, false);
                        int i6 = c0230o2.f3744P;
                        InterfaceC0225l0 interfaceC0225l0M3 = c0230o2.m();
                        Z.o oVarC3 = Z.a.c(c0230o2, fillElement);
                        InterfaceC1102j.f14043g.getClass();
                        C1106n c1106n3 = C1101i.f14038b;
                        c0230o2.Z();
                        if (c0230o2.f3743O) {
                            c0230o2.l(c1106n3);
                        } else {
                            c0230o2.i0();
                        }
                        C1100h c1100h3 = C1101i.f14041e;
                        C0208d.R(c1100h3, c0230o2, fE);
                        C1100h c1100h4 = C1101i.f14040d;
                        C0208d.R(c1100h4, c0230o2, interfaceC0225l0M3);
                        C1100h c1100h5 = C1101i.f14042f;
                        if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i6))) {
                            p012c.k.y(i6, c0230o2, i6, c1100h5);
                        }
                        C1100h c1100h6 = C1101i.f14039c;
                        C0208d.R(c1100h6, c0230o2, oVarC3);
                        C1090x c1090xA2 = AbstractC1088v.a(AbstractC1078k.f13779c, Z.b.f5944t, c0230o2, 48);
                        int i7 = c0230o2.f3744P;
                        InterfaceC0225l0 interfaceC0225l0M4 = c0230o2.m();
                        Z.o oVarC4 = Z.a.c(c0230o2, lVar);
                        c0230o2.Z();
                        if (c0230o2.f3743O) {
                            c0230o2.l(c1106n3);
                        } else {
                            c0230o2.i0();
                        }
                        C0208d.R(c1100h3, c0230o2, c1090xA2);
                        C0208d.R(c1100h4, c0230o2, interfaceC0225l0M4);
                        if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i7))) {
                            p012c.k.y(i7, c0230o2, i7, c1100h5);
                        }
                        C0208d.R(c1100h6, c0230o2, oVarC4);
                        C0823f c0823fU = p020d2.n.u();
                        Z.o oVarH = androidx.compose.foundation.layout.c.h(lVar, 60);
                        long j7 = p035g0.r.f9078d;
                        S1.V.e(c0823fU, oVarH, new C0709j(j7, 5, C0710k.f9071a.a(j7, 5)), c0230o2);
                        e2.b(AbstractC0599v0.K(R.string.devices_empty_message, c0230o2), androidx.compose.foundation.layout.a.g(lVar, 16), 0L, 0L, null, 0L, new R0.i(3), 0L, 0, false, 0, 0, null, c0230o2, 48, 0, 130556);
                        e2.b(AbstractC0599v0.K(R.string.devices_nanoleaf_essentials_requirement, c0230o2), null, j7, 0L, null, 0L, new R0.i(3), 0L, 0, false, 0, 0, ((g2) c0230o2.k(h2.f2777a)).f2756l, c0230o2, 384, 0, 65018);
                        AbstractC0178t0.a(androidx.compose.foundation.layout.c.h(lVar, 30), 0L, 0.0f, 0L, 0, c0230o2, 6, 30);
                        c0230o2.p(true);
                        c0230o2.p(true);
                        c0230o2.p(false);
                    }
                }
                break;
        }
        return p084p4.x.f10867a;
    }
}
