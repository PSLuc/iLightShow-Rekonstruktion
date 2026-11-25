package N3;

import L.AbstractC0149j0;
import L.J1;
import L.W1;
import L.e2;
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
import p123x.C1069b;
import p123x.C1075h;
import p123x.C1090x;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: renamed from: N3.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0254a0 implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4150h;
    public final /* synthetic */ InterfaceC0203a0 i;

    public /* synthetic */ C0254a0(int i, InterfaceC0203a0 interfaceC0203a0) {
        this.f4150h = i;
        this.i = interfaceC0203a0;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        int i = 6;
        int i3 = 3;
        int i6 = 14;
        int i7 = 8;
        int i8 = 16;
        p084p4.x xVar = p084p4.x.f10867a;
        N.U u6 = C0222k.f3714a;
        InterfaceC0203a0 interfaceC0203a0 = this.i;
        int i9 = 11;
        switch (this.f4150h) {
            case 0:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    c0230o.V(1444475509);
                    Object objK = c0230o.K();
                    if (objK == u6) {
                        objK = new C0275l(i, interfaceC0203a0);
                        c0230o.f0(objK);
                    }
                    c0230o.p(false);
                    L.L.g((D4.a) objK, null, false, null, null, null, null, C.f3935j, c0230o, 805306374);
                }
                break;
            case 1:
                C0230o c0230o2 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    c0230o2.V(1737145844);
                    Object objK2 = c0230o2.K();
                    if (objK2 == u6) {
                        objK2 = new C0275l(i7, interfaceC0203a0);
                        c0230o2.f0(objK2);
                    }
                    c0230o2.p(false);
                    L.L.g((D4.a) objK2, null, false, null, null, null, null, C.f3928b, c0230o2, 805306374);
                }
                break;
            case 2:
                C0230o c0230o3 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o3.B()) {
                    c0230o3.P();
                } else {
                    C1069b c1069b = AbstractC1078k.f13777a;
                    C1075h c1075h = new C1075h(16);
                    Z.l lVar = Z.l.f5957a;
                    C1090x c1090xA = AbstractC1088v.a(c1075h, Z.b.f5943s, c0230o3, 6);
                    int i10 = c0230o3.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M = c0230o3.m();
                    Z.o oVarC = Z.a.c(c0230o3, lVar);
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n = C1101i.f14038b;
                    c0230o3.Z();
                    if (c0230o3.f3743O) {
                        c0230o3.l(c1106n);
                    } else {
                        c0230o3.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o3, c1090xA);
                    C0208d.R(C1101i.f14040d, c0230o3, interfaceC0225l0M);
                    C1100h c1100h = C1101i.f14042f;
                    if (c0230o3.f3743O || !E4.k.a(c0230o3.K(), Integer.valueOf(i10))) {
                        p012c.k.y(i10, c0230o3, i10, c1100h);
                    }
                    C0208d.R(C1101i.f14039c, c0230o3, oVarC);
                    e2.b(AbstractC0599v0.K(R.string.devices_add_hue_bridge_message, c0230o3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o3, 0, 0, 131070);
                    String str = (String) interfaceC0203a0.getValue();
                    FillElement fillElement = androidx.compose.foundation.layout.c.f6634a;
                    c0230o3.V(-1100017237);
                    Object objK3 = c0230o3.K();
                    if (objK3 == u6) {
                        objK3 = new C0259d(i3, interfaceC0203a0);
                        c0230o3.f0(objK3);
                    }
                    c0230o3.p(false);
                    W1.a(str, (D4.c) objK3, fillElement, false, null, C.f3930d, null, null, null, 0, 0, null, null, null, c0230o3, 1573296);
                    c0230o3.p(true);
                }
                break;
            case 3:
                C0230o c0230o4 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o4.B()) {
                    c0230o4.P();
                } else {
                    c0230o4.V(419027282);
                    Object objK4 = c0230o4.K();
                    if (objK4 == u6) {
                        objK4 = new C0275l(i9, interfaceC0203a0);
                        c0230o4.f0(objK4);
                    }
                    c0230o4.p(false);
                    L.L.g((D4.a) objK4, null, false, null, null, null, null, D.f3940a, c0230o4, 805306374);
                }
                break;
            case 4:
                C0230o c0230o5 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o5.B()) {
                    c0230o5.P();
                } else {
                    c0230o5.V(1243595742);
                    Object objK5 = c0230o5.K();
                    if (objK5 == u6) {
                        objK5 = new C0275l(i6, interfaceC0203a0);
                        c0230o5.f0(objK5);
                    }
                    c0230o5.p(false);
                    L.L.a((D4.a) objK5, null, false, null, null, null, null, null, K.f3999a, c0230o5, 805306374, 510);
                }
                break;
            case 5:
                C0230o c0230o6 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o6.B()) {
                    c0230o6.P();
                } else {
                    c0230o6.V(1243607569);
                    Object objK6 = c0230o6.K();
                    if (objK6 == u6) {
                        objK6 = new C0275l(15, interfaceC0203a0);
                        c0230o6.f0(objK6);
                    }
                    c0230o6.p(false);
                    L.L.a((D4.a) objK6, null, false, null, null, null, null, null, K.f4000b, c0230o6, 805306374, 510);
                }
                break;
            case 6:
                C0230o c0230o7 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o7.B()) {
                    c0230o7.P();
                } else {
                    c0230o7.V(1243632295);
                    Object objK7 = c0230o7.K();
                    if (objK7 == u6) {
                        objK7 = new C0275l(i8, interfaceC0203a0);
                        c0230o7.f0(objK7);
                    }
                    c0230o7.p(false);
                    L.L.a((D4.a) objK7, null, false, null, null, null, null, null, K.f4004f, c0230o7, 805306374, 510);
                }
                break;
            case 7:
                C0230o c0230o8 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o8.B()) {
                    c0230o8.P();
                } else {
                    Z.e eVar = Z.b.f5944t;
                    Z.l lVar2 = Z.l.f5957a;
                    float f6 = 8;
                    Z.o oVarK = androidx.compose.foundation.layout.a.k(lVar2, f6, 0.0f, 0.0f, 0.0f, 14);
                    C1090x c1090xA2 = AbstractC1088v.a(AbstractC1078k.f13779c, eVar, c0230o8, 48);
                    int i11 = c0230o8.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M2 = c0230o8.m();
                    Z.o oVarC2 = Z.a.c(c0230o8, oVarK);
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n2 = C1101i.f14038b;
                    c0230o8.Z();
                    if (c0230o8.f3743O) {
                        c0230o8.l(c1106n2);
                    } else {
                        c0230o8.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o8, c1090xA2);
                    C0208d.R(C1101i.f14040d, c0230o8, interfaceC0225l0M2);
                    C1100h c1100h2 = C1101i.f14042f;
                    if (c0230o8.f3743O || !E4.k.a(c0230o8.K(), Integer.valueOf(i11))) {
                        p012c.k.y(i11, c0230o8, i11, c1100h2);
                    }
                    C0208d.R(C1101i.f14039c, c0230o8, oVarC2);
                    AbstractC0149j0.b(S1.V.D(), null, null, p035g0.r.f9083j, c0230o8, 3120, 4);
                    e2.b(AbstractC0599v0.K(R.string.lights_legacy_enabled_warning, c0230o8), androidx.compose.foundation.layout.a.g(lVar2, f6), 0L, com.fasterxml.jackson.databind.deser.std.d0.q(14), null, 0L, new R0.i(3), 0L, 0, false, 0, 0, null, c0230o8, 3120, 0, 130548);
                    c0230o8.V(1764190567);
                    Object objK8 = c0230o8.K();
                    if (objK8 == u6) {
                        objK8 = new C0275l(17, interfaceC0203a0);
                        c0230o8.f0(objK8);
                    }
                    c0230o8.p(false);
                    L.L.a((D4.a) objK8, null, false, null, null, null, null, null, K.f4010m, c0230o8, 805306374, 510);
                    c0230o8.p(true);
                }
                break;
            case 8:
                C0230o c0230o9 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o9.B()) {
                    c0230o9.P();
                } else {
                    c0230o9.V(-1128312303);
                    Object objK9 = c0230o9.K();
                    if (objK9 == u6) {
                        objK9 = new C0275l(21, interfaceC0203a0);
                        c0230o9.f0(objK9);
                    }
                    c0230o9.p(false);
                    L.L.g((D4.a) objK9, null, false, null, null, null, null, P.i, c0230o9, 805306374);
                }
                break;
            case 9:
                C0230o c0230o10 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o10.B()) {
                    c0230o10.P();
                } else {
                    c0230o10.V(-1128342355);
                    Object objK10 = c0230o10.K();
                    if (objK10 == u6) {
                        objK10 = new C0275l(22, interfaceC0203a0);
                        c0230o10.f0(objK10);
                    }
                    c0230o10.p(false);
                    L.L.g((D4.a) objK10, null, false, null, null, null, null, P.f4076e, c0230o10, 805306374);
                }
                break;
            case 10:
                C0230o c0230o11 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o11.B()) {
                    c0230o11.P();
                } else {
                    c0230o11.V(-1983646784);
                    Object objK11 = c0230o11.K();
                    if (objK11 == u6) {
                        objK11 = new C0275l(24, interfaceC0203a0);
                        c0230o11.f0(objK11);
                    }
                    c0230o11.p(false);
                    L.L.g((D4.a) objK11, null, false, null, null, null, null, U.f4118f, c0230o11, 805306374);
                }
                break;
            default:
                C0230o c0230o12 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o12.B()) {
                    c0230o12.P();
                } else {
                    Z.f fVar = Z.b.f5942r;
                    Z.l lVar3 = Z.l.f5957a;
                    float f7 = 16;
                    Z.o oVarK2 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.c(lVar3, 54), f7, 0.0f, f7, 0.0f, 10);
                    p123x.U uA = p123x.T.a(AbstractC1078k.f13777a, fVar, c0230o12, 48);
                    int i12 = c0230o12.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M3 = c0230o12.m();
                    Z.o oVarC3 = Z.a.c(c0230o12, oVarK2);
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n3 = C1101i.f14038b;
                    c0230o12.Z();
                    if (c0230o12.f3743O) {
                        c0230o12.l(c1106n3);
                    } else {
                        c0230o12.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o12, uA);
                    C0208d.R(C1101i.f14040d, c0230o12, interfaceC0225l0M3);
                    C1100h c1100h3 = C1101i.f14042f;
                    if (c0230o12.f3743O || !E4.k.a(c0230o12.K(), Integer.valueOf(i12))) {
                        p012c.k.y(i12, c0230o12, i12, c1100h3);
                    }
                    C0208d.R(C1101i.f14039c, c0230o12, oVarC3);
                    e2.b(AbstractC0599v0.K(R.string.settings_background_mode, c0230o12), lVar3, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o12, 48, 0, 131068);
                    AbstractC1070c.b(c0230o12, p123x.V.a(lVar3, 1.0f));
                    int i13 = m1.f4225b;
                    boolean zBooleanValue = ((Boolean) interfaceC0203a0.getValue()).booleanValue();
                    c0230o12.V(-1755344775);
                    Object objK12 = c0230o12.K();
                    if (objK12 == u6) {
                        objK12 = new C0259d(i7, interfaceC0203a0);
                        c0230o12.f0(objK12);
                    }
                    c0230o12.p(false);
                    J1.a(zBooleanValue, (D4.c) objK12, null, false, null, null, c0230o12, 48, RecurringDays.RECURRING_WEEKDAYS);
                    c0230o12.p(true);
                }
                break;
        }
        return xVar;
    }
}
