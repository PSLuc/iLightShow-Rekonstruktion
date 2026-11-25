package N3;

import L.AbstractC0176s1;
import L.e2;
import L.g2;
import L.h2;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.InterfaceC0203a0;
import N.InterfaceC0225l0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.Model.Presets.UMPreset;
import com.nanjoran.ilightshow.R;
import p123x.AbstractC1070c;
import p123x.AbstractC1078k;
import p123x.AbstractC1088v;
import p123x.C1071d;
import p123x.C1090x;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: renamed from: N3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0265g implements D4.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4175h = 1;
    public final /* synthetic */ InterfaceC0203a0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4176j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f4177k;

    public C0265g(G2.a aVar, InterfaceC0203a0 interfaceC0203a0, p018d.g gVar) {
        this.f4176j = aVar;
        this.i = interfaceC0203a0;
        this.f4177k = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:37:0x011d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0121  */
    /* JADX WARN: Code duplicated, block: B:41:0x012e  */
    /* JADX WARN: Code duplicated, block: B:43:0x013c  */
    /* JADX WARN: Code duplicated, block: B:47:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:53:0x01db  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:57:0x01fa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        ?? r6;
        Object obj4;
        p084p4.x xVar;
        C1100h c1100h;
        G2.e eVar;
        int i;
        C0230o c0230o;
        int i3;
        Object objK;
        InterfaceC0203a0 interfaceC0203a0;
        p084p4.x xVar2 = p084p4.x.f10867a;
        Object obj5 = this.f4177k;
        N.U u6 = C0222k.f3714a;
        InterfaceC0203a0 interfaceC0203a1 = this.i;
        Object obj6 = this.f4176j;
        switch (this.f4175h) {
            case 0:
                p123x.O o6 = (p123x.O) obj;
                C0230o c0230o2 = (C0230o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                E4.k.f("innerPadding", o6);
                if ((iIntValue & 14) == 0) {
                    iIntValue |= c0230o2.f(o6) ? 4 : 2;
                }
                if ((iIntValue & 91) == 18 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    Z.l lVar = Z.l.f5957a;
                    float f6 = 16;
                    Z.o oVarG = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.a.f(com.fasterxml.jackson.databind.deser.std.d0.G().k(androidx.compose.foundation.layout.c.f6635b), o6), f6);
                    C1090x c1090xA = AbstractC1088v.a(AbstractC1078k.f13779c, Z.b.f5943s, c0230o2, 0);
                    int i6 = c0230o2.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M = c0230o2.m();
                    Z.o oVarC = Z.a.c(c0230o2, oVarG);
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
                    C1100h c1100h2 = C1101i.f14042f;
                    if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i6))) {
                        p012c.k.y(i6, c0230o2, i6, c1100h2);
                    }
                    C0208d.R(C1101i.f14039c, c0230o2, oVarC);
                    J4.a aVar = (J4.a) interfaceC0203a1.getValue();
                    J4.a aVar2 = new J4.a(0.0f, 255.0f);
                    c0230o2.V(-1495953554);
                    Object objK2 = c0230o2.K();
                    if (objK2 == u6) {
                        r6 = 0;
                        C0259d c0259d = new C0259d(false ? 1 : 0, interfaceC0203a1);
                        c0230o2.f0(c0259d);
                        obj4 = c0259d;
                    } else {
                        r6 = 0;
                        obj4 = objK2;
                    }
                    c0230o2.p(r6);
                    UMPreset uMPreset = (UMPreset) obj5;
                    AbstractC0176s1.a(aVar, (D4.c) obj4, null, false, aVar2, 255, new C0261e(uMPreset, interfaceC0203a1, r6), null, c0230o2, 196656, 140);
                    String strK = AbstractC0599v0.K(R.string.brightness_range_description, c0230o2);
                    N.W0 w6 = h2.f2777a;
                    G0.J j4 = ((g2) c0230o2.k(w6)).f2756l;
                    long j6 = p035g0.r.f9079e;
                    e2.b(strK, null, j6, 0L, null, 0L, null, 0L, 0, false, 0, 0, j4, c0230o2, 384, 0, 65530);
                    AbstractC1070c.b(c0230o2, androidx.compose.foundation.layout.c.c(lVar, 32));
                    e2.b(AbstractC0599v0.K(R.string.brightness_ambient_title, c0230o2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o2.k(w6)).f2754j, c0230o2, 0, 0, 65534);
                    InterfaceC0203a0 interfaceC0203a2 = (InterfaceC0203a0) obj6;
                    AbstractC0176s1.f(((Number) interfaceC0203a2.getValue()).floatValue(), new C0263f(uMPreset, 0, interfaceC0203a2), null, false, new J4.a(0.0f, 255.0f), 0, new C0261e(uMPreset, interfaceC0203a2, 1), null, null, c0230o2, 0, 428);
                    e2.b(AbstractC0599v0.K(R.string.brightness_ambient_description, c0230o2), null, j6, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o2.k(w6)).f2756l, c0230o2, 384, 0, 65530);
                    AbstractC1070c.b(c0230o2, androidx.compose.foundation.layout.c.c(lVar, f6));
                    c0230o2.p(true);
                }
                return xVar2;
            default:
                p123x.O o7 = (p123x.O) obj;
                C0230o c0230o3 = (C0230o) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                E4.k.f("innerPadding", o7);
                if ((iIntValue2 & 14) == 0) {
                    iIntValue2 |= c0230o3.f(o7) ? 4 : 2;
                }
                if ((iIntValue2 & 91) == 18 && c0230o3.B()) {
                    c0230o3.P();
                    return xVar2;
                }
                Z.l lVar2 = Z.l.f5957a;
                Z.o oVarG2 = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.a.f(com.fasterxml.jackson.databind.deser.std.d0.G().k(androidx.compose.foundation.layout.c.f6635b), o7), 16);
                C1071d c1071d = AbstractC1078k.f13779c;
                Z.e eVar2 = Z.b.f5943s;
                C1090x c1090xA2 = AbstractC1088v.a(c1071d, eVar2, c0230o3, 0);
                int i7 = c0230o3.f3744P;
                InterfaceC0225l0 interfaceC0225l0M2 = c0230o3.m();
                Z.o oVarC2 = Z.a.c(c0230o3, oVarG2);
                InterfaceC1102j.f14043g.getClass();
                C1106n c1106n2 = C1101i.f14038b;
                c0230o3.Z();
                if (c0230o3.f3743O) {
                    c0230o3.l(c1106n2);
                } else {
                    c0230o3.i0();
                }
                C1100h c1100h3 = C1101i.f14041e;
                C0208d.R(c1100h3, c0230o3, c1090xA2);
                C1100h c1100h4 = C1101i.f14040d;
                C0208d.R(c1100h4, c0230o3, interfaceC0225l0M2);
                C1100h c1100h5 = C1101i.f14042f;
                if (!c0230o3.f3743O) {
                    xVar = xVar2;
                    if (!E4.k.a(c0230o3.K(), Integer.valueOf(i7))) {
                    }
                    c1100h = C1101i.f14039c;
                    C0208d.R(c1100h, c0230o3, oVarC2);
                    c0230o3.V(616002807);
                    G2.a aVar3 = (G2.a) obj6;
                    eVar = (G2.e) aVar3.f1680c.getValue();
                    E4.k.f("<this>", eVar);
                    if (eVar.equals(G2.d.f1683a) || !((Boolean) interfaceC0203a1.getValue()).booleanValue()) {
                        Z.e eVar3 = Z.b.f5944t;
                        float f7 = 8;
                        Z.o oVarK = androidx.compose.foundation.layout.a.k(lVar2, f7, 0.0f, 0.0f, 0.0f, 14);
                        C1090x c1090xA3 = AbstractC1088v.a(c1071d, eVar3, c0230o3, 48);
                        i = c0230o3.f3744P;
                        InterfaceC0225l0 interfaceC0225l0M3 = c0230o3.m();
                        Z.o oVarC3 = Z.a.c(c0230o3, oVarK);
                        c0230o3.Z();
                        if (c0230o3.f3743O) {
                            c0230o3.l(c1106n2);
                        } else {
                            c0230o3.i0();
                        }
                        C0208d.R(c1100h3, c0230o3, c1090xA3);
                        C0208d.R(c1100h4, c0230o3, interfaceC0225l0M3);
                        if (c0230o3.f3743O || !E4.k.a(c0230o3.K(), Integer.valueOf(i))) {
                            p012c.k.y(i, c0230o3, i, c1100h5);
                        }
                        C0208d.R(c1100h, c0230o3, oVarC3);
                        String strK2 = AbstractC0599v0.K(R.string.microphone_disabled_warning, c0230o3);
                        Z.o oVarG3 = androidx.compose.foundation.layout.a.g(lVar2, f7);
                        long jQ = com.fasterxml.jackson.databind.deser.std.d0.q(14);
                        int i8 = p035g0.r.f9086m;
                        e2.b(strK2, oVarG3, p020d2.n.v(), jQ, null, 0L, new R0.i(3), 0L, 0, false, 0, 0, ((g2) c0230o3.k(h2.f2777a)).f2755k, c0230o3, 3120, 0, 65008);
                        c0230o = c0230o3;
                        c0230o.p(true);
                    } else {
                        c0230o = c0230o3;
                    }
                    c0230o.p(false);
                    float f8 = 8;
                    Z.o oVarB = androidx.compose.foundation.a.b(com.fasterxml.jackson.databind.deser.std.d0.k(lVar2, A.e.a(f8)), m1.f4224a, p035g0.H.f9016a);
                    C1090x c1090xA4 = AbstractC1088v.a(c1071d, eVar2, c0230o, 0);
                    i3 = c0230o.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M4 = c0230o.m();
                    Z.o oVarC4 = Z.a.c(c0230o, oVarB);
                    c0230o.Z();
                    if (c0230o.f3743O) {
                        c0230o.l(c1106n2);
                    } else {
                        c0230o.i0();
                    }
                    C0208d.R(c1100h3, c0230o, c1090xA4);
                    C0208d.R(c1100h4, c0230o, interfaceC0225l0M4);
                    if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i3))) {
                        p012c.k.y(i3, c0230o, i3, c1100h5);
                    }
                    C0208d.R(c1100h, c0230o, oVarC4);
                    c0230o.V(337288598);
                    objK = c0230o.K();
                    if (objK == u6) {
                        interfaceC0203a0 = interfaceC0203a1;
                        objK = new C0275l(18, interfaceC0203a0);
                        c0230o.f0(objK);
                    } else {
                        interfaceC0203a0 = interfaceC0203a1;
                    }
                    c0230o.p(false);
                    AbstractC0599v0.b((D4.a) objK, null, 0L, V.b.c(-799350405, new C0258c0(2, interfaceC0203a0, aVar3, (p018d.g) obj5), c0230o), c0230o, 3078, 6);
                    c0230o.p(true);
                    e2.b(AbstractC0599v0.K(R.string.microphone_auto_calibration_description, c0230o), androidx.compose.foundation.layout.a.k(lVar2, 0.0f, f8, 0.0f, 0.0f, 13), p035g0.r.f9078d, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o.k(h2.f2777a)).f2758n, c0230o, 432, 0, 65528);
                    c0230o.p(true);
                    return xVar;
                }
                xVar = xVar2;
                p012c.k.y(i7, c0230o3, i7, c1100h5);
                c1100h = C1101i.f14039c;
                C0208d.R(c1100h, c0230o3, oVarC2);
                c0230o3.V(616002807);
                G2.a aVar4 = (G2.a) obj6;
                eVar = (G2.e) aVar4.f1680c.getValue();
                E4.k.f("<this>", eVar);
                if (eVar.equals(G2.d.f1683a)) {
                    Z.e eVar4 = Z.b.f5944t;
                    float f9 = 8;
                    Z.o oVarK2 = androidx.compose.foundation.layout.a.k(lVar2, f9, 0.0f, 0.0f, 0.0f, 14);
                    C1090x c1090xA5 = AbstractC1088v.a(c1071d, eVar4, c0230o3, 48);
                    i = c0230o3.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M5 = c0230o3.m();
                    Z.o oVarC5 = Z.a.c(c0230o3, oVarK2);
                    c0230o3.Z();
                    if (c0230o3.f3743O) {
                        c0230o3.l(c1106n2);
                    } else {
                        c0230o3.i0();
                    }
                    C0208d.R(c1100h3, c0230o3, c1090xA5);
                    C0208d.R(c1100h4, c0230o3, interfaceC0225l0M5);
                    if (c0230o3.f3743O) {
                        p012c.k.y(i, c0230o3, i, c1100h5);
                    } else {
                        p012c.k.y(i, c0230o3, i, c1100h5);
                    }
                    C0208d.R(c1100h, c0230o3, oVarC5);
                    String strK3 = AbstractC0599v0.K(R.string.microphone_disabled_warning, c0230o3);
                    Z.o oVarG4 = androidx.compose.foundation.layout.a.g(lVar2, f9);
                    long jQ2 = com.fasterxml.jackson.databind.deser.std.d0.q(14);
                    int i9 = p035g0.r.f9086m;
                    e2.b(strK3, oVarG4, p020d2.n.v(), jQ2, null, 0L, new R0.i(3), 0L, 0, false, 0, 0, ((g2) c0230o3.k(h2.f2777a)).f2755k, c0230o3, 3120, 0, 65008);
                    c0230o = c0230o3;
                    c0230o.p(true);
                } else {
                    Z.e eVar5 = Z.b.f5944t;
                    float f10 = 8;
                    Z.o oVarK3 = androidx.compose.foundation.layout.a.k(lVar2, f10, 0.0f, 0.0f, 0.0f, 14);
                    C1090x c1090xA6 = AbstractC1088v.a(c1071d, eVar5, c0230o3, 48);
                    i = c0230o3.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M6 = c0230o3.m();
                    Z.o oVarC6 = Z.a.c(c0230o3, oVarK3);
                    c0230o3.Z();
                    if (c0230o3.f3743O) {
                        c0230o3.l(c1106n2);
                    } else {
                        c0230o3.i0();
                    }
                    C0208d.R(c1100h3, c0230o3, c1090xA6);
                    C0208d.R(c1100h4, c0230o3, interfaceC0225l0M6);
                    if (c0230o3.f3743O) {
                        p012c.k.y(i, c0230o3, i, c1100h5);
                    } else {
                        p012c.k.y(i, c0230o3, i, c1100h5);
                    }
                    C0208d.R(c1100h, c0230o3, oVarC6);
                    String strK4 = AbstractC0599v0.K(R.string.microphone_disabled_warning, c0230o3);
                    Z.o oVarG5 = androidx.compose.foundation.layout.a.g(lVar2, f10);
                    long jQ3 = com.fasterxml.jackson.databind.deser.std.d0.q(14);
                    int i10 = p035g0.r.f9086m;
                    e2.b(strK4, oVarG5, p020d2.n.v(), jQ3, null, 0L, new R0.i(3), 0L, 0, false, 0, 0, ((g2) c0230o3.k(h2.f2777a)).f2755k, c0230o3, 3120, 0, 65008);
                    c0230o = c0230o3;
                    c0230o.p(true);
                }
                c0230o.p(false);
                float f11 = 8;
                Z.o oVarB2 = androidx.compose.foundation.a.b(com.fasterxml.jackson.databind.deser.std.d0.k(lVar2, A.e.a(f11)), m1.f4224a, p035g0.H.f9016a);
                C1090x c1090xA7 = AbstractC1088v.a(c1071d, eVar2, c0230o, 0);
                i3 = c0230o.f3744P;
                InterfaceC0225l0 interfaceC0225l0M7 = c0230o.m();
                Z.o oVarC7 = Z.a.c(c0230o, oVarB2);
                c0230o.Z();
                if (c0230o.f3743O) {
                    c0230o.l(c1106n2);
                } else {
                    c0230o.i0();
                }
                C0208d.R(c1100h3, c0230o, c1090xA7);
                C0208d.R(c1100h4, c0230o, interfaceC0225l0M7);
                if (c0230o.f3743O) {
                    p012c.k.y(i3, c0230o, i3, c1100h5);
                } else {
                    p012c.k.y(i3, c0230o, i3, c1100h5);
                }
                C0208d.R(c1100h, c0230o, oVarC7);
                c0230o.V(337288598);
                objK = c0230o.K();
                if (objK == u6) {
                    interfaceC0203a0 = interfaceC0203a1;
                    objK = new C0275l(18, interfaceC0203a0);
                    c0230o.f0(objK);
                } else {
                    interfaceC0203a0 = interfaceC0203a1;
                }
                c0230o.p(false);
                AbstractC0599v0.b((D4.a) objK, null, 0L, V.b.c(-799350405, new C0258c0(2, interfaceC0203a0, aVar4, (p018d.g) obj5), c0230o), c0230o, 3078, 6);
                c0230o.p(true);
                e2.b(AbstractC0599v0.K(R.string.microphone_auto_calibration_description, c0230o), androidx.compose.foundation.layout.a.k(lVar2, 0.0f, f11, 0.0f, 0.0f, 13), p035g0.r.f9078d, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o.k(h2.f2777a)).f2758n, c0230o, 432, 0, 65528);
                c0230o.p(true);
                return xVar;
        }
    }

    public C0265g(InterfaceC0203a0 interfaceC0203a0, UMPreset uMPreset, InterfaceC0203a0 interfaceC0203a1) {
        this.i = interfaceC0203a0;
        this.f4177k = uMPreset;
        this.f4176j = interfaceC0203a1;
    }
}
