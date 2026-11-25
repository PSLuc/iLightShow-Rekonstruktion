package N3;

import L.AbstractC0149j0;
import L.AbstractC0190x0;
import L.J1;
import L.e2;
import L.g2;
import L.h2;
import N.C0208d;
import N.C0222k;
import N.C0227m0;
import N.C0230o;
import N.InterfaceC0203a0;
import N.InterfaceC0225l0;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.Model.Presets.FXOpt;
import com.nanjoran.ilightshow.Model.Presets.UMPreset;
import com.nanjoran.ilightshow.R;
import com.nanjoran.ilightshow.Services.PlayerServices.MusicServiceType;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.RecurringDays;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p035g0.C0709j;
import p035g0.C0710k;
import p058l0.C0822e;
import p058l0.C0823f;
import p123x.AbstractC1070c;
import p123x.AbstractC1078k;
import p123x.AbstractC1088v;
import p123x.C1069b;
import p123x.C1071d;
import p123x.C1075h;
import p123x.C1090x;
import p123x.C1091y;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: renamed from: N3.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0282o0 implements D4.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4233h = 1;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4236l;

    public C0282o0(F1.I i, InterfaceC0203a0 interfaceC0203a0, InterfaceC0203a0 interfaceC0203a1, InterfaceC0203a0 interfaceC0203a2) {
        this.i = i;
        this.f4234j = interfaceC0203a0;
        this.f4235k = interfaceC0203a1;
        this.f4236l = interfaceC0203a2;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x042f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0453  */
    /* JADX WARN: Code duplicated, block: B:107:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:108:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:113:0x050a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0525  */
    /* JADX WARN: Code duplicated, block: B:119:0x055e  */
    /* JADX WARN: Code duplicated, block: B:195:0x0b1f A[PHI: r11
  0x0b1f: PHI (r11v11 N.o) = (r11v10 N.o), (r11v16 N.o) binds: [B:166:0x0967, B:180:0x0a55] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:208:0x0575 A[SYNTHETIC] */
    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        InterfaceC0203a0 interfaceC0203a0;
        long j4;
        C0230o c0230o;
        boolean z5;
        boolean z6;
        int i;
        boolean zS;
        final InterfaceC0203a0 interfaceC0203a1;
        int i3;
        X.s sVar;
        ListIterator listIterator;
        X.y yVar;
        D3.j jVar;
        int i6 = 3;
        p084p4.x xVar = p084p4.x.f10867a;
        Object obj4 = this.f4236l;
        Object obj5 = this.i;
        int i7 = 4;
        switch (this.f4233h) {
            case 0:
                C0230o c0230o2 = (C0230o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                E4.k.f("$this$Card", (C1091y) obj);
                if ((iIntValue & 81) == 16 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    Z.l lVar = Z.l.f5957a;
                    Z.o oVarG = androidx.compose.foundation.layout.a.g(lVar, 16);
                    C1090x c1090xA = AbstractC1088v.a(AbstractC1078k.f13779c, Z.b.f5943s, c0230o2, 0);
                    int i8 = c0230o2.f3744P;
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
                    C1100h c1100h = C1101i.f14041e;
                    C0208d.R(c1100h, c0230o2, c1090xA);
                    C1100h c1100h2 = C1101i.f14040d;
                    C0208d.R(c1100h2, c0230o2, interfaceC0225l0M);
                    C1100h c1100h3 = C1101i.f14042f;
                    if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i8))) {
                        p012c.k.y(i8, c0230o2, i8, c1100h3);
                    }
                    C1100h c1100h4 = C1101i.f14039c;
                    C0208d.R(c1100h4, c0230o2, oVarC);
                    Z.f fVar = Z.b.f5942r;
                    C1069b c1069b = AbstractC1078k.f13777a;
                    p123x.U uA = p123x.T.a(c1069b, fVar, c0230o2, 48);
                    int i9 = c0230o2.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M2 = c0230o2.m();
                    Z.o oVarC2 = Z.a.c(c0230o2, lVar);
                    c0230o2.Z();
                    if (c0230o2.f3743O) {
                        c0230o2.l(c1106n);
                    } else {
                        c0230o2.i0();
                    }
                    C0208d.R(c1100h, c0230o2, uA);
                    C0208d.R(c1100h2, c0230o2, interfaceC0225l0M2);
                    if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i9))) {
                        p012c.k.y(i9, c0230o2, i9, c1100h3);
                    }
                    C0208d.R(c1100h4, c0230o2, oVarC2);
                    String strK = AbstractC0599v0.K(R.string.fx_mode_advanced, c0230o2);
                    long jQ = com.fasterxml.jackson.databind.deser.std.d0.q(20);
                    L0.k kVar = L0.k.f3027l;
                    float f6 = 8;
                    Z.o oVarK = androidx.compose.foundation.layout.a.k(lVar, 0.0f, 0.0f, 0.0f, f6, 7);
                    long j6 = p035g0.r.f9080f;
                    e2.b(strK, oVarK, j6, jQ, kVar, 0L, null, 0L, 0, false, 0, 0, null, c0230o2, 200112, 0, 131024);
                    AbstractC1070c.b(c0230o2, p123x.V.a(lVar, 1.0f));
                    int iB = com.nanjoran.ilightshow.Services.M.f8305O.l().b();
                    InterfaceC0203a0 interfaceC0203a2 = this.f4234j;
                    E4.w wVar = (E4.w) obj4;
                    if (iB > 0) {
                        c0230o2.V(-859401309);
                        AbstractC0190x0.a(E4.k.a((String) interfaceC0203a2.getValue(), FXOpt.INSTANCE.getEngineAdvanced()), new C0276l0((F1.I) obj5, wVar, this.f4235k, interfaceC0203a2, 1), null, false, null, null, c0230o2, 0);
                        c0230o = c0230o2;
                        c0230o.p(false);
                        interfaceC0203a0 = interfaceC0203a2;
                        j4 = j6;
                        z5 = true;
                    } else {
                        interfaceC0203a0 = interfaceC0203a2;
                        c0230o2.V(-858661494);
                        Z.o oVarG2 = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.a.b(lVar, p035g0.H.d(4294940672L), A.e.a(f6)), f6);
                        p123x.U uA2 = p123x.T.a(new C1075h(f6), Z.b.f5941q, c0230o2, 6);
                        int i10 = c0230o2.f3744P;
                        InterfaceC0225l0 interfaceC0225l0M3 = c0230o2.m();
                        Z.o oVarC3 = Z.a.c(c0230o2, oVarG2);
                        c0230o2.Z();
                        if (c0230o2.f3743O) {
                            c0230o2.l(c1106n);
                        } else {
                            c0230o2.i0();
                        }
                        C0208d.R(c1100h, c0230o2, uA2);
                        C0208d.R(c1100h2, c0230o2, interfaceC0225l0M3);
                        if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i10))) {
                            p012c.k.y(i10, c0230o2, i10, c1100h3);
                        }
                        C0208d.R(c1100h4, c0230o2, oVarC3);
                        C0823f c0823fB = p027e3.a.f8734d;
                        if (c0823fB == null) {
                            C0822e c0822e = new C0822e("Filled.Lock", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i11 = p058l0.G.f10217a;
                            p035g0.O o6 = new p035g0.O(p035g0.r.f9076b);
                            C0227m0 c0227m0 = new C0227m0(2);
                            c0227m0.i(18.0f, 8.0f);
                            c0227m0.f(-1.0f);
                            c0227m0.g(17.0f, 6.0f);
                            c0227m0.d(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
                            c0227m0.j(7.0f, 3.24f, 7.0f, 6.0f);
                            c0227m0.n(2.0f);
                            c0227m0.g(6.0f, 8.0f);
                            c0227m0.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            c0227m0.n(10.0f);
                            c0227m0.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            c0227m0.f(12.0f);
                            c0227m0.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                            c0227m0.g(20.0f, 10.0f);
                            c0227m0.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            c0227m0.b();
                            c0227m0.i(12.0f, 17.0f);
                            c0227m0.d(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
                            c0227m0.k(0.9f, -2.0f, 2.0f, -2.0f);
                            c0227m0.k(2.0f, 0.9f, 2.0f, 2.0f);
                            c0227m0.k(-0.9f, 2.0f, -2.0f, 2.0f);
                            c0227m0.b();
                            c0227m0.i(15.1f, 8.0f);
                            c0227m0.g(8.9f, 8.0f);
                            c0227m0.g(8.9f, 6.0f);
                            c0227m0.d(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
                            c0227m0.d(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
                            c0227m0.n(2.0f);
                            c0227m0.b();
                            C0822e.a(c0822e, c0227m0.f3729h, o6);
                            c0823fB = c0822e.b();
                            p027e3.a.f8734d = c0823fB;
                        }
                        AbstractC0149j0.b(c0823fB, AbstractC0599v0.K(R.string.fx_mode_unlock_fx_plus, c0230o2), null, j6, c0230o2, 3072, 4);
                        e2.b(AbstractC0599v0.K(R.string.fx_mode_unlock_fx_plus, c0230o2), null, j6, com.fasterxml.jackson.databind.deser.std.d0.q(12), null, 0L, null, 0L, 0, false, 0, 0, null, c0230o2, 3456, 0, 131058);
                        j4 = j6;
                        c0230o = c0230o2;
                        z5 = true;
                        c0230o.p(true);
                        c0230o.p(false);
                    }
                    c0230o.p(z5);
                    String strK2 = AbstractC0599v0.K(R.string.fx_mode_advanced_description, c0230o);
                    N.W0 w6 = h2.f2777a;
                    C0230o c0230o3 = c0230o;
                    e2.b(strK2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o.k(w6)).f2755k, c0230o3, 0, 0, 65534);
                    C0230o c0230o4 = c0230o3;
                    c0230o4.V(-192681422);
                    if (E4.k.a((String) interfaceC0203a0.getValue(), FXOpt.INSTANCE.getEngineAdvanced())) {
                        c0230o4.V(-192680146);
                        Object objK = c0230o4.K();
                        N.U u6 = C0222k.f3714a;
                        N.U u7 = N.U.f3673m;
                        if (objK == u6) {
                            objK = C0208d.K(Boolean.valueOf(((UMPreset) wVar.f1074h).getStrobeDrops()), u7);
                            c0230o4.f0(objK);
                        }
                        InterfaceC0203a0 interfaceC0203a3 = (InterfaceC0203a0) objK;
                        c0230o4.p(false);
                        p123x.U uA3 = p123x.T.a(c1069b, fVar, c0230o4, 48);
                        int i12 = c0230o4.f3744P;
                        InterfaceC0225l0 interfaceC0225l0M4 = c0230o4.m();
                        Z.o oVarC4 = Z.a.c(c0230o4, lVar);
                        c0230o4.Z();
                        if (c0230o4.f3743O) {
                            c0230o4.l(c1106n);
                        } else {
                            c0230o4.i0();
                        }
                        C0208d.R(c1100h, c0230o4, uA3);
                        C0208d.R(c1100h2, c0230o4, interfaceC0225l0M4);
                        if (c0230o4.f3743O || !E4.k.a(c0230o4.K(), Integer.valueOf(i12))) {
                            p012c.k.y(i12, c0230o4, i12, c1100h3);
                        }
                        C0208d.R(c1100h4, c0230o4, oVarC4);
                        long j7 = j4;
                        e2.b(AbstractC0599v0.K(R.string.fx_mode_strobe_at_drops, c0230o4), null, j7, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o4.k(w6)).f2753h, c0230o4, 384, 0, 65530);
                        AbstractC1070c.b(c0230o4, p123x.V.a(lVar, 1.0f));
                        J1.a(((Boolean) interfaceC0203a3.getValue()).booleanValue(), new C0280n0(wVar, interfaceC0203a3, 0), null, false, null, null, c0230o4, 0, RecurringDays.RECURRING_WEEKDAYS);
                        c0230o4 = c0230o4;
                        c0230o4.p(true);
                        if (((Boolean) interfaceC0203a3.getValue()).booleanValue()) {
                            c0230o4.V(-192656077);
                            Object objK2 = c0230o4.K();
                            if (objK2 == u6) {
                                objK2 = C0208d.K(Boolean.valueOf(((UMPreset) wVar.f1074h).getStrobeDropsWhite()), u7);
                                c0230o4.f0(objK2);
                            }
                            InterfaceC0203a0 interfaceC0203a4 = (InterfaceC0203a0) objK2;
                            c0230o4.p(false);
                            p123x.U uA4 = p123x.T.a(c1069b, fVar, c0230o4, 48);
                            int i13 = c0230o4.f3744P;
                            InterfaceC0225l0 interfaceC0225l0M5 = c0230o4.m();
                            Z.o oVarC5 = Z.a.c(c0230o4, lVar);
                            c0230o4.Z();
                            if (c0230o4.f3743O) {
                                c0230o4.l(c1106n);
                            } else {
                                c0230o4.i0();
                            }
                            C0208d.R(c1100h, c0230o4, uA4);
                            C0208d.R(c1100h2, c0230o4, interfaceC0225l0M5);
                            if (c0230o4.f3743O || !E4.k.a(c0230o4.K(), Integer.valueOf(i13))) {
                                p012c.k.y(i13, c0230o4, i13, c1100h3);
                            }
                            C0208d.R(c1100h4, c0230o4, oVarC5);
                            e2.b(AbstractC0599v0.K(R.string.fx_mode_white_strobes, c0230o4), null, j7, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o4.k(w6)).f2753h, c0230o4, 384, 0, 65530);
                            AbstractC1070c.b(c0230o4, p123x.V.a(lVar, 1.0f));
                            z6 = true;
                            J1.a(((Boolean) interfaceC0203a4.getValue()).booleanValue(), new C0280n0(wVar, interfaceC0203a4, 1), null, false, null, null, c0230o4, 0, RecurringDays.RECURRING_WEEKDAYS);
                            c0230o4 = c0230o4;
                            c0230o4.p(true);
                        } else {
                            z6 = true;
                        }
                    } else {
                        z6 = true;
                    }
                    c0230o4.p(false);
                    c0230o4.p(z6);
                }
                return xVar;
            case 1:
                p123x.O o7 = (p123x.O) obj;
                C0230o c0230o5 = (C0230o) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                E4.k.f("innerPadding", o7);
                if ((iIntValue2 & 14) == 0) {
                    iIntValue2 |= c0230o5.f(o7) ? 4 : 2;
                }
                if ((iIntValue2 & 91) == 18 && c0230o5.B()) {
                    c0230o5.P();
                } else {
                    com.nanjoran.ilightshow.Services.M m6 = com.nanjoran.ilightshow.Services.M.f8305O;
                    boolean zIsEmpty = m6.f8334u.isEmpty();
                    Z.e eVar = Z.b.f5943s;
                    Z.l lVar2 = Z.l.f5957a;
                    F1.I i14 = (F1.I) obj5;
                    if (zIsEmpty) {
                        c0230o5.V(-98739746);
                        float f7 = 16;
                        Z.o oVarG3 = androidx.compose.foundation.layout.a.g(com.fasterxml.jackson.databind.deser.std.d0.G().k(androidx.compose.foundation.layout.c.f6635b), f7);
                        FillElement fillElement = androidx.compose.foundation.layout.c.f6634a;
                        Z.o oVarA = S1.h0.A(androidx.compose.foundation.layout.a.f(oVarG3.k(fillElement), o7), S1.h0.v(c0230o5));
                        C1071d c1071d = AbstractC1078k.f13779c;
                        C1090x c1090xA2 = AbstractC1088v.a(c1071d, eVar, c0230o5, 0);
                        int i15 = c0230o5.f3744P;
                        InterfaceC0225l0 interfaceC0225l0M6 = c0230o5.m();
                        Z.o oVarC6 = Z.a.c(c0230o5, oVarA);
                        InterfaceC1102j.f14043g.getClass();
                        C1106n c1106n2 = C1101i.f14038b;
                        c0230o5.Z();
                        if (c0230o5.f3743O) {
                            c0230o5.l(c1106n2);
                        } else {
                            c0230o5.i0();
                        }
                        C1100h c1100h5 = C1101i.f14041e;
                        C0208d.R(c1100h5, c0230o5, c1090xA2);
                        C1100h c1100h6 = C1101i.f14040d;
                        C0208d.R(c1100h6, c0230o5, interfaceC0225l0M6);
                        C1100h c1100h7 = C1101i.f14042f;
                        if (c0230o5.f3743O || !E4.k.a(c0230o5.K(), Integer.valueOf(i15))) {
                            p012c.k.y(i15, c0230o5, i15, c1100h7);
                        }
                        C1100h c1100h8 = C1101i.f14039c;
                        C0208d.R(c1100h8, c0230o5, oVarC6);
                        C1090x c1090xA3 = AbstractC1088v.a(c1071d, Z.b.f5944t, c0230o5, 48);
                        int i16 = c0230o5.f3744P;
                        InterfaceC0225l0 interfaceC0225l0M7 = c0230o5.m();
                        Z.o oVarC7 = Z.a.c(c0230o5, fillElement);
                        c0230o5.Z();
                        if (c0230o5.f3743O) {
                            c0230o5.l(c1106n2);
                        } else {
                            c0230o5.i0();
                        }
                        C0208d.R(c1100h5, c0230o5, c1090xA3);
                        C0208d.R(c1100h6, c0230o5, interfaceC0225l0M7);
                        if (c0230o5.f3743O || !E4.k.a(c0230o5.K(), Integer.valueOf(i16))) {
                            p012c.k.y(i16, c0230o5, i16, c1100h7);
                        }
                        C0208d.R(c1100h8, c0230o5, oVarC7);
                        C0823f c0823fU = p020d2.n.u();
                        Z.o oVarH = androidx.compose.foundation.layout.c.h(lVar2, 60);
                        long j8 = p035g0.r.f9078d;
                        S1.V.e(c0823fU, oVarH, new C0709j(j8, 5, C0710k.f9071a.a(j8, 5)), c0230o5);
                        e2.b(AbstractC0599v0.K(R.string.lights_empty_message, c0230o5), androidx.compose.foundation.layout.a.g(lVar2, f7), 0L, 0L, null, 0L, new R0.i(3), 0L, 0, false, 0, 0, null, c0230o5, 48, 0, 130556);
                        L.L.a(new C0255b(i14, 9), null, false, null, null, null, null, null, K.f4009l, c0230o5, 805306368, 510);
                        c0230o5.p(true);
                        c0230o5.p(true);
                        c0230o5.p(false);
                    } else {
                        C0230o c0230o6 = c0230o5;
                        c0230o6.V(-97630070);
                        float f8 = 16;
                        Z.o oVarA2 = S1.h0.A(androidx.compose.foundation.layout.a.f(androidx.compose.foundation.layout.a.g(com.fasterxml.jackson.databind.deser.std.d0.G().k(androidx.compose.foundation.layout.c.f6635b), f8).k(androidx.compose.foundation.layout.c.f6634a), o7), S1.h0.v(c0230o6));
                        C1090x c1090xA4 = AbstractC1088v.a(AbstractC1078k.f13779c, eVar, c0230o6, 0);
                        int i17 = c0230o6.f3744P;
                        InterfaceC0225l0 interfaceC0225l0M8 = c0230o6.m();
                        Z.o oVarC8 = Z.a.c(c0230o6, oVarA2);
                        InterfaceC1102j.f14043g.getClass();
                        C1106n c1106n3 = C1101i.f14038b;
                        c0230o6.Z();
                        if (c0230o6.f3743O) {
                            c0230o6.l(c1106n3);
                        } else {
                            c0230o6.i0();
                        }
                        C0208d.R(C1101i.f14041e, c0230o6, c1090xA4);
                        C0208d.R(C1101i.f14040d, c0230o6, interfaceC0225l0M8);
                        C1100h c1100h9 = C1101i.f14042f;
                        if (c0230o6.f3743O || !E4.k.a(c0230o6.K(), Integer.valueOf(i17))) {
                            p012c.k.y(i17, c0230o6, i17, c1100h9);
                        }
                        C0208d.R(C1101i.f14039c, c0230o6, oVarC8);
                        c0230o6.V(1210251018);
                        InterfaceC0203a0 interfaceC0203a5 = this.f4234j;
                        boolean zBooleanValue = ((Boolean) interfaceC0203a5.getValue()).booleanValue();
                        W2.g gVar = p035g0.H.f9016a;
                        if (zBooleanValue) {
                            AbstractC0599v0.b(new H3.g(11), androidx.compose.foundation.layout.a.g(androidx.compose.foundation.a.b(com.fasterxml.jackson.databind.deser.std.d0.k(lVar2, A.e.a(8)), m1.f4224a, gVar), f8), 0L, V.b.c(-647027496, new C0254a0(7, interfaceC0203a5), c0230o6), c0230o6, 3078, 4);
                        }
                        c0230o6.p(false);
                        c0230o6.V(1210290664);
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator2 = m6.f8335v.listIterator();
                        while (true) {
                            X.y yVar2 = (X.y) listIterator2;
                            if (!yVar2.hasNext()) {
                                int size = arrayList.size();
                                int i18 = 0;
                                while (i18 < size) {
                                    Object obj6 = arrayList.get(i18);
                                    int i19 = i18 + 1;
                                    final D3.l lVar3 = (D3.l) obj6;
                                    float f9 = f8;
                                    Z.o oVarK2 = androidx.compose.foundation.layout.a.k(lVar2, 0.0f, f9, 0.0f, 0.0f, 13);
                                    ArrayList arrayList2 = arrayList;
                                    p123x.U uA5 = p123x.T.a(AbstractC1078k.f13777a, Z.b.f5941q, c0230o6, 0);
                                    int i20 = c0230o6.f3744P;
                                    InterfaceC0225l0 interfaceC0225l0M9 = c0230o6.m();
                                    Z.o oVarC9 = Z.a.c(c0230o6, oVarK2);
                                    InterfaceC1102j.f14043g.getClass();
                                    int i21 = size;
                                    C1106n c1106n4 = C1101i.f14038b;
                                    c0230o6.Z();
                                    p084p4.x xVar2 = xVar;
                                    if (c0230o6.f3743O) {
                                        c0230o6.l(c1106n4);
                                    } else {
                                        c0230o6.i0();
                                    }
                                    C1100h c1100h10 = C1101i.f14041e;
                                    C0208d.R(c1100h10, c0230o6, uA5);
                                    C1100h c1100h11 = C1101i.f14040d;
                                    C0208d.R(c1100h11, c0230o6, interfaceC0225l0M9);
                                    C1100h c1100h12 = C1101i.f14042f;
                                    Object obj7 = obj4;
                                    if (c0230o6.f3743O) {
                                        i = i19;
                                    } else {
                                        i = i19;
                                        if (!E4.k.a(c0230o6.K(), Integer.valueOf(i20))) {
                                        }
                                        C1100h c1100h13 = C1101i.f14039c;
                                        C0208d.R(c1100h13, c0230o6, oVarC9);
                                        zS = com.nanjoran.ilightshow.Services.M.f8305O.s(lVar3);
                                        interfaceC0203a1 = this.f4235k;
                                        if (zS) {
                                            c0230o6.V(-1144084810);
                                            final int i22 = 0;
                                            L.L.d(new D4.a() { // from class: N3.C0
                                                @Override // D4.a
                                                public final Object invoke() {
                                                    switch (i22) {
                                                        case 0:
                                                            D3.l lVar4 = lVar3;
                                                            E4.k.f("$room", lVar4);
                                                            InterfaceC0203a0 interfaceC0203a6 = interfaceC0203a1;
                                                            E4.k.f("$showPurchaseDialog$delegate", interfaceC0203a6);
                                                            p027e3.a.L(interfaceC0203a6, lVar4);
                                                            break;
                                                        default:
                                                            D3.l lVar5 = lVar3;
                                                            E4.k.f("$room", lVar5);
                                                            InterfaceC0203a0 interfaceC0203a7 = interfaceC0203a1;
                                                            E4.k.f("$showPurchaseDialog$delegate", interfaceC0203a7);
                                                            p027e3.a.L(interfaceC0203a7, lVar5);
                                                            break;
                                                    }
                                                    return p084p4.x.f10867a;
                                                }
                                            }, null, false, null, null, K.f4011n, c0230o6, 196608, 30);
                                            c0230o6.p(false);
                                        } else {
                                            c0230o6.V(-1143727690);
                                            final int i23 = 1;
                                            L.L.d(new D4.a() { // from class: N3.C0
                                                @Override // D4.a
                                                public final Object invoke() {
                                                    switch (i23) {
                                                        case 0:
                                                            D3.l lVar4 = lVar3;
                                                            E4.k.f("$room", lVar4);
                                                            InterfaceC0203a0 interfaceC0203a6 = interfaceC0203a1;
                                                            E4.k.f("$showPurchaseDialog$delegate", interfaceC0203a6);
                                                            p027e3.a.L(interfaceC0203a6, lVar4);
                                                            break;
                                                        default:
                                                            D3.l lVar5 = lVar3;
                                                            E4.k.f("$room", lVar5);
                                                            InterfaceC0203a0 interfaceC0203a7 = interfaceC0203a1;
                                                            E4.k.f("$showPurchaseDialog$delegate", interfaceC0203a7);
                                                            p027e3.a.L(interfaceC0203a7, lVar5);
                                                            break;
                                                    }
                                                    return p084p4.x.f10867a;
                                                }
                                            }, null, false, null, null, K.f4012o, c0230o6, 196608, 30);
                                            c0230o6.p(false);
                                        }
                                        C0230o c0230o7 = c0230o6;
                                        float f10 = 8;
                                        e2.b(lVar3.f812c, androidx.compose.foundation.layout.a.k(lVar2, 0.0f, f9, 0.0f, f10, 5), 0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), L0.k.f3027l, 0L, null, 0L, 0, false, 0, 0, null, c0230o7, 199728, 0, 131028);
                                        c0230o6 = c0230o7;
                                        c0230o6.p(true);
                                        Z.o oVarB = androidx.compose.foundation.a.b(com.fasterxml.jackson.databind.deser.std.d0.k(lVar2, A.e.a(f10)), m1.f4224a, gVar);
                                        C1090x c1090xA5 = AbstractC1088v.a(AbstractC1078k.f13779c, eVar, c0230o6, 0);
                                        i3 = c0230o6.f3744P;
                                        Z.e eVar2 = eVar;
                                        InterfaceC0225l0 interfaceC0225l0M10 = c0230o6.m();
                                        Z.o oVarC10 = Z.a.c(c0230o6, oVarB);
                                        c0230o6.Z();
                                        Z.l lVar4 = lVar2;
                                        if (c0230o6.f3743O) {
                                            c0230o6.l(c1106n4);
                                        } else {
                                            c0230o6.i0();
                                        }
                                        C0208d.R(c1100h10, c0230o6, c1090xA5);
                                        C0208d.R(c1100h11, c0230o6, interfaceC0225l0M10);
                                        if (c0230o6.f3743O || !E4.k.a(c0230o6.K(), Integer.valueOf(i3))) {
                                            p012c.k.y(i3, c0230o6, i3, c1100h12);
                                        }
                                        C0208d.R(c1100h13, c0230o6, oVarC10);
                                        c0230o6.V(1764245302);
                                        sVar = lVar3.f814e;
                                        listIterator = sVar.listIterator();
                                        while (true) {
                                            yVar = (X.y) listIterator;
                                            if (yVar.hasNext()) {
                                                jVar = (D3.j) yVar.next();
                                                AbstractC0599v0.b(new C0256b0(jVar, (InterfaceC0203a0) obj7, interfaceC0203a1), null, 0L, V.b.c(1719230809, new C0293u0(jVar, i14, 1), c0230o6), c0230o6, 3072, 6);
                                                c0230o6.V(1764311925);
                                                if (!E4.k.a(jVar, p089q4.l.f0(sVar))) {
                                                    L.L.c(null, 1, p035g0.r.b(0.7f, p035g0.r.f9078d), c0230o6, 432, 1);
                                                }
                                                c0230o6.p(false);
                                            }
                                        }
                                        c0230o6.p(false);
                                        c0230o6.p(true);
                                        arrayList = arrayList2;
                                        size = i21;
                                        i18 = i;
                                        f8 = f9;
                                        eVar = eVar2;
                                        lVar2 = lVar4;
                                        xVar = xVar2;
                                        obj4 = obj7;
                                    }
                                    p012c.k.y(i20, c0230o6, i20, c1100h12);
                                    C1100h c1100h14 = C1101i.f14039c;
                                    C0208d.R(c1100h14, c0230o6, oVarC9);
                                    zS = com.nanjoran.ilightshow.Services.M.f8305O.s(lVar3);
                                    interfaceC0203a1 = this.f4235k;
                                    if (zS) {
                                        c0230o6.V(-1144084810);
                                        final int i24 = 0;
                                        L.L.d(new D4.a() { // from class: N3.C0
                                            @Override // D4.a
                                            public final Object invoke() {
                                                switch (i24) {
                                                    case 0:
                                                        D3.l lVar5 = lVar3;
                                                        E4.k.f("$room", lVar5);
                                                        InterfaceC0203a0 interfaceC0203a6 = interfaceC0203a1;
                                                        E4.k.f("$showPurchaseDialog$delegate", interfaceC0203a6);
                                                        p027e3.a.L(interfaceC0203a6, lVar5);
                                                        break;
                                                    default:
                                                        D3.l lVar6 = lVar3;
                                                        E4.k.f("$room", lVar6);
                                                        InterfaceC0203a0 interfaceC0203a7 = interfaceC0203a1;
                                                        E4.k.f("$showPurchaseDialog$delegate", interfaceC0203a7);
                                                        p027e3.a.L(interfaceC0203a7, lVar6);
                                                        break;
                                                }
                                                return p084p4.x.f10867a;
                                            }
                                        }, null, false, null, null, K.f4011n, c0230o6, 196608, 30);
                                        c0230o6.p(false);
                                    } else {
                                        c0230o6.V(-1143727690);
                                        final int i25 = 1;
                                        L.L.d(new D4.a() { // from class: N3.C0
                                            @Override // D4.a
                                            public final Object invoke() {
                                                switch (i25) {
                                                    case 0:
                                                        D3.l lVar5 = lVar3;
                                                        E4.k.f("$room", lVar5);
                                                        InterfaceC0203a0 interfaceC0203a6 = interfaceC0203a1;
                                                        E4.k.f("$showPurchaseDialog$delegate", interfaceC0203a6);
                                                        p027e3.a.L(interfaceC0203a6, lVar5);
                                                        break;
                                                    default:
                                                        D3.l lVar6 = lVar3;
                                                        E4.k.f("$room", lVar6);
                                                        InterfaceC0203a0 interfaceC0203a7 = interfaceC0203a1;
                                                        E4.k.f("$showPurchaseDialog$delegate", interfaceC0203a7);
                                                        p027e3.a.L(interfaceC0203a7, lVar6);
                                                        break;
                                                }
                                                return p084p4.x.f10867a;
                                            }
                                        }, null, false, null, null, K.f4012o, c0230o6, 196608, 30);
                                        c0230o6.p(false);
                                    }
                                    C0230o c0230o8 = c0230o6;
                                    float f11 = 8;
                                    e2.b(lVar3.f812c, androidx.compose.foundation.layout.a.k(lVar2, 0.0f, f9, 0.0f, f11, 5), 0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), L0.k.f3027l, 0L, null, 0L, 0, false, 0, 0, null, c0230o8, 199728, 0, 131028);
                                    c0230o6 = c0230o8;
                                    c0230o6.p(true);
                                    Z.o oVarB2 = androidx.compose.foundation.a.b(com.fasterxml.jackson.databind.deser.std.d0.k(lVar2, A.e.a(f11)), m1.f4224a, gVar);
                                    C1090x c1090xA6 = AbstractC1088v.a(AbstractC1078k.f13779c, eVar, c0230o6, 0);
                                    i3 = c0230o6.f3744P;
                                    Z.e eVar3 = eVar;
                                    InterfaceC0225l0 interfaceC0225l0M11 = c0230o6.m();
                                    Z.o oVarC11 = Z.a.c(c0230o6, oVarB2);
                                    c0230o6.Z();
                                    Z.l lVar5 = lVar2;
                                    if (c0230o6.f3743O) {
                                        c0230o6.l(c1106n4);
                                    } else {
                                        c0230o6.i0();
                                    }
                                    C0208d.R(c1100h10, c0230o6, c1090xA6);
                                    C0208d.R(c1100h11, c0230o6, interfaceC0225l0M11);
                                    if (c0230o6.f3743O) {
                                        p012c.k.y(i3, c0230o6, i3, c1100h12);
                                    } else {
                                        p012c.k.y(i3, c0230o6, i3, c1100h12);
                                    }
                                    C0208d.R(c1100h14, c0230o6, oVarC11);
                                    c0230o6.V(1764245302);
                                    sVar = lVar3.f814e;
                                    listIterator = sVar.listIterator();
                                    while (true) {
                                        yVar = (X.y) listIterator;
                                        if (yVar.hasNext()) {
                                            jVar = (D3.j) yVar.next();
                                            AbstractC0599v0.b(new C0256b0(jVar, (InterfaceC0203a0) obj7, interfaceC0203a1), null, 0L, V.b.c(1719230809, new C0293u0(jVar, i14, 1), c0230o6), c0230o6, 3072, 6);
                                            c0230o6.V(1764311925);
                                            if (!E4.k.a(jVar, p089q4.l.f0(sVar))) {
                                                L.L.c(null, 1, p035g0.r.b(0.7f, p035g0.r.f9078d), c0230o6, 432, 1);
                                            }
                                            c0230o6.p(false);
                                        }
                                    }
                                    c0230o6.p(false);
                                    c0230o6.p(true);
                                    arrayList = arrayList2;
                                    size = i21;
                                    i18 = i;
                                    f8 = f9;
                                    eVar = eVar3;
                                    lVar2 = lVar5;
                                    xVar = xVar2;
                                    obj4 = obj7;
                                }
                                p084p4.x xVar3 = xVar;
                                c0230o6.p(false);
                                c0230o6.p(true);
                                c0230o6.p(false);
                                return xVar3;
                            }
                            Object next = yVar2.next();
                            if (!((D3.l) next).f813d) {
                                arrayList.add(next);
                            }
                        }
                    }
                }
                return xVar;
            default:
                p123x.O o8 = (p123x.O) obj;
                C0230o c0230o9 = (C0230o) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                E4.k.f("innerPadding", o8);
                if ((iIntValue3 & 14) == 0) {
                    iIntValue3 |= c0230o9.f(o8) ? 4 : 2;
                }
                if ((iIntValue3 & 91) == 18 && c0230o9.B()) {
                    c0230o9.P();
                } else {
                    Z.o oVarG4 = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.a.f(com.fasterxml.jackson.databind.deser.std.d0.G().k(androidx.compose.foundation.layout.c.f6635b), o8), 16);
                    C1090x c1090xA7 = AbstractC1088v.a(AbstractC1078k.f13779c, Z.b.f5943s, c0230o9, 0);
                    int i26 = c0230o9.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M12 = c0230o9.m();
                    Z.o oVarC12 = Z.a.c(c0230o9, oVarG4);
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n5 = C1101i.f14038b;
                    c0230o9.Z();
                    if (c0230o9.f3743O) {
                        c0230o9.l(c1106n5);
                    } else {
                        c0230o9.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o9, c1090xA7);
                    C0208d.R(C1101i.f14040d, c0230o9, interfaceC0225l0M12);
                    C1100h c1100h15 = C1101i.f14042f;
                    if (c0230o9.f3743O || !E4.k.a(c0230o9.K(), Integer.valueOf(i26))) {
                        p012c.k.y(i26, c0230o9, i26, c1100h15);
                    }
                    C0208d.R(C1101i.f14039c, c0230o9, oVarC12);
                    c0230o9.V(-2138959698);
                    for (MusicServiceType musicServiceType : (List) obj5) {
                        C0230o c0230o10 = c0230o9;
                        AbstractC0599v0.b(new C0276l0(musicServiceType, (Context) obj4, this.f4234j, this.f4235k, 2), null, 0L, V.b.c(-1595390068, new C0266g0(i6, musicServiceType), c0230o9), c0230o10, 3072, 6);
                        L.L.c(null, 0.0f, 0L, c0230o10, 0, 7);
                        c0230o9 = c0230o10;
                    }
                    c0230o9.p(false);
                    c0230o9.V(-2138855520);
                    ArrayList arrayList3 = com.nanjoran.ilightshow.Services.z0.f8505f.f8508b;
                    int size2 = arrayList3.size();
                    int i27 = 0;
                    while (i27 < size2) {
                        Object obj8 = arrayList3.get(i27);
                        i27++;
                        F3.a aVar = (F3.a) obj8;
                        C0230o c0230o11 = c0230o9;
                        AbstractC0599v0.b(new R0(0, aVar), null, 0L, V.b.c(-894746108, new C0266g0(i7, aVar), c0230o9), c0230o11, 3072, 6);
                        L.L.c(null, 0.0f, 0L, c0230o11, 0, 7);
                        c0230o9 = c0230o11;
                    }
                    c0230o9.p(false);
                    c0230o9.p(true);
                }
                return xVar;
        }
    }

    public C0282o0(InterfaceC0203a0 interfaceC0203a0, F1.I i, E4.w wVar, InterfaceC0203a0 interfaceC0203a1) {
        this.f4234j = interfaceC0203a0;
        this.i = i;
        this.f4236l = wVar;
        this.f4235k = interfaceC0203a1;
    }

    public C0282o0(List list, Context context, InterfaceC0203a0 interfaceC0203a0, InterfaceC0203a0 interfaceC0203a1) {
        this.i = list;
        this.f4236l = context;
        this.f4234j = interfaceC0203a0;
        this.f4235k = interfaceC0203a1;
    }
}
