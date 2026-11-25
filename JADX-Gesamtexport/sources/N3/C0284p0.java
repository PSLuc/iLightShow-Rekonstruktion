package N3;

import B.AbstractC0013g0;
import L.AbstractC0174s;
import L.AbstractC0190x0;
import L.J1;
import L.e2;
import L.g2;
import L.h2;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.InterfaceC0203a0;
import N.InterfaceC0225l0;
import androidx.compose.ui.ZIndexElement;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.Model.Presets.FXOpt;
import com.nanjoran.ilightshow.Model.Presets.UMPreset;
import com.nanjoran.ilightshow.R;
import com.nanjoran.ilightshow.Services.C0688o0;
import com.nanjoran.ilightshow.Services.Palette;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.RecurringDays;
import java.util.List;
import p123x.AbstractC1070c;
import p123x.AbstractC1078k;
import p123x.AbstractC1084q;
import p123x.AbstractC1088v;
import p123x.C1069b;
import p123x.C1075h;
import p123x.C1087u;
import p123x.C1090x;
import p123x.C1091y;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: renamed from: N3.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0284p0 implements D4.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4239h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4240j;

    public C0284p0(F1.I i, InterfaceC0203a0 interfaceC0203a0) {
        this.f4239h = 1;
        this.f4240j = i;
        this.i = interfaceC0203a0;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x037d  */
    /* JADX WARN: Code duplicated, block: B:103:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:105:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:107:0x0421  */
    /* JADX WARN: Code duplicated, block: B:108:0x0425  */
    /* JADX WARN: Code duplicated, block: B:113:0x0440  */
    /* JADX WARN: Code duplicated, block: B:115:0x047c  */
    /* JADX WARN: Code duplicated, block: B:116:0x047f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0547  */
    /* JADX WARN: Code duplicated, block: B:134:0x0589  */
    /* JADX WARN: Code duplicated, block: B:135:0x058d  */
    /* JADX WARN: Code duplicated, block: B:140:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:142:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:81:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:84:0x0319  */
    /* JADX WARN: Code duplicated, block: B:85:0x031d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0338  */
    /* JADX WARN: Code duplicated, block: B:93:0x0356  */
    /* JADX WARN: Code duplicated, block: B:94:0x035b  */
    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z5;
        N.U u6;
        N.U u7;
        C1087u c1087u;
        C1100h c1100h;
        com.nanjoran.ilightshow.Services.M m6;
        N.V0 v6;
        float fFloatValue;
        Z.g gVar;
        int i;
        UMPreset uMPresetG;
        String engineMode;
        FXOpt fXOpt;
        float fFloatValue2;
        UMPreset uMPresetG2;
        boolean z6;
        C0688o0 c0688o0L;
        boolean zA;
        Z.g gVar2;
        int iB;
        int i3;
        int i6;
        C0230o c0230o;
        N.U u8 = C0222k.f3714a;
        Z.l lVar = Z.l.f5957a;
        androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f6633a;
        p084p4.x xVar = p084p4.x.f10867a;
        Object obj4 = this.f4240j;
        Object obj5 = this.i;
        int i7 = 0;
        switch (this.f4239h) {
            case 0:
                C0230o c0230o2 = (C0230o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                E4.k.f("$this$Card", (C1091y) obj);
                if ((iIntValue & 81) == 16 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    Z.l lVar2 = Z.l.f5957a;
                    Z.o oVarG = androidx.compose.foundation.layout.a.g(lVar2, 16);
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
                    C1100h c1100h2 = C1101i.f14041e;
                    C0208d.R(c1100h2, c0230o2, c1090xA);
                    C1100h c1100h3 = C1101i.f14040d;
                    C0208d.R(c1100h3, c0230o2, interfaceC0225l0M);
                    C1100h c1100h4 = C1101i.f14042f;
                    if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i8))) {
                        p012c.k.y(i8, c0230o2, i8, c1100h4);
                    }
                    C1100h c1100h5 = C1101i.f14039c;
                    C0208d.R(c1100h5, c0230o2, oVarC);
                    Z.f fVar = Z.b.f5942r;
                    C1069b c1069b = AbstractC1078k.f13777a;
                    p123x.U uA = p123x.T.a(c1069b, fVar, c0230o2, 48);
                    int i9 = c0230o2.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M2 = c0230o2.m();
                    Z.o oVarC2 = Z.a.c(c0230o2, lVar2);
                    c0230o2.Z();
                    if (c0230o2.f3743O) {
                        c0230o2.l(c1106n);
                    } else {
                        c0230o2.i0();
                    }
                    C0208d.R(c1100h2, c0230o2, uA);
                    C0208d.R(c1100h3, c0230o2, interfaceC0225l0M2);
                    if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i9))) {
                        p012c.k.y(i9, c0230o2, i9, c1100h4);
                    }
                    C0208d.R(c1100h5, c0230o2, oVarC2);
                    String strK = AbstractC0599v0.K(R.string.fx_mode_standard, c0230o2);
                    long jQ = com.fasterxml.jackson.databind.deser.std.d0.q(20);
                    L0.k kVar = L0.k.f3027l;
                    Z.o oVarK = androidx.compose.foundation.layout.a.k(lVar2, 0.0f, 0.0f, 0.0f, 8, 7);
                    long j4 = p035g0.r.f9080f;
                    e2.b(strK, oVarK, j4, jQ, kVar, 0L, null, 0L, 0, false, 0, 0, null, c0230o2, 200112, 0, 131024);
                    AbstractC1070c.b(c0230o2, p123x.V.a(lVar2, 1.0f));
                    final InterfaceC0203a0 interfaceC0203a0 = (InterfaceC0203a0) obj5;
                    String str = (String) interfaceC0203a0.getValue();
                    FXOpt fXOpt2 = FXOpt.INSTANCE;
                    boolean zA2 = E4.k.a(str, fXOpt2.getEngineStandard());
                    final E4.w wVar = (E4.w) obj4;
                    final int i10 = 1;
                    AbstractC0190x0.a(zA2, new D4.a() { // from class: N3.m0
                        @Override // D4.a
                        public final Object invoke() {
                            switch (i10) {
                                case 0:
                                    E4.w wVar2 = wVar;
                                    E4.k.f("$currentPreset", wVar2);
                                    InterfaceC0203a0 interfaceC0203a1 = interfaceC0203a0;
                                    E4.k.f("$engineMode$delegate", interfaceC0203a1);
                                    UMPreset uMPreset = (UMPreset) wVar2.f1074h;
                                    FXOpt fXOpt3 = FXOpt.INSTANCE;
                                    uMPreset.withEngineMode(fXOpt3.getEngineStandard());
                                    interfaceC0203a1.setValue(fXOpt3.getEngineStandard());
                                    break;
                                default:
                                    E4.w wVar3 = wVar;
                                    E4.k.f("$currentPreset", wVar3);
                                    InterfaceC0203a0 interfaceC0203a2 = interfaceC0203a0;
                                    E4.k.f("$engineMode$delegate", interfaceC0203a2);
                                    UMPreset uMPreset2 = (UMPreset) wVar3.f1074h;
                                    FXOpt fXOpt4 = FXOpt.INSTANCE;
                                    uMPreset2.withEngineMode(fXOpt4.getEngineStandard());
                                    interfaceC0203a2.setValue(fXOpt4.getEngineStandard());
                                    break;
                            }
                            return p084p4.x.f10867a;
                        }
                    }, null, false, null, null, c0230o2, 0);
                    c0230o2.p(true);
                    String strK2 = AbstractC0599v0.K(R.string.fx_mode_standard_description, c0230o2);
                    N.W0 w6 = h2.f2777a;
                    e2.b(strK2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o2.k(w6)).f2755k, c0230o2, 0, 0, 65534);
                    c0230o2.V(-192584935);
                    if (E4.k.a((String) interfaceC0203a0.getValue(), fXOpt2.getEngineStandard())) {
                        c0230o2.V(-192584979);
                        Object objK = c0230o2.K();
                        N.U u9 = N.U.f3673m;
                        if (objK == u8) {
                            objK = C0208d.K(Boolean.valueOf(((UMPreset) wVar.f1074h).getColorFades()), u9);
                            c0230o2.f0(objK);
                        }
                        InterfaceC0203a0 interfaceC0203a1 = (InterfaceC0203a0) objK;
                        c0230o2.p(false);
                        p123x.U uA2 = p123x.T.a(c1069b, fVar, c0230o2, 48);
                        int i11 = c0230o2.f3744P;
                        InterfaceC0225l0 interfaceC0225l0M3 = c0230o2.m();
                        Z.o oVarC3 = Z.a.c(c0230o2, lVar2);
                        c0230o2.Z();
                        if (c0230o2.f3743O) {
                            c0230o2.l(c1106n);
                        } else {
                            c0230o2.i0();
                        }
                        C0208d.R(c1100h2, c0230o2, uA2);
                        C0208d.R(c1100h3, c0230o2, interfaceC0225l0M3);
                        if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i11))) {
                            p012c.k.y(i11, c0230o2, i11, c1100h4);
                        }
                        C0208d.R(c1100h5, c0230o2, oVarC3);
                        e2.b(AbstractC0599v0.K(R.string.fx_mode_color_fades, c0230o2), null, j4, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o2.k(w6)).f2753h, c0230o2, 384, 0, 65530);
                        AbstractC1070c.b(c0230o2, p123x.V.a(lVar2, 1.0f));
                        J1.a(((Boolean) interfaceC0203a1.getValue()).booleanValue(), new C0280n0(wVar, interfaceC0203a1, 2), null, false, null, null, c0230o2, 0, RecurringDays.RECURRING_WEEKDAYS);
                        Object objD = AbstractC0013g0.d(-192562897, c0230o2, true);
                        if (objD == u8) {
                            u6 = u9;
                            objD = C0208d.K(Boolean.valueOf(((UMPreset) wVar.f1074h).getEnablePulses()), u6);
                            c0230o2.f0(objD);
                        } else {
                            u6 = u9;
                        }
                        InterfaceC0203a0 interfaceC0203a2 = (InterfaceC0203a0) objD;
                        c0230o2.p(false);
                        p123x.U uA3 = p123x.T.a(c1069b, fVar, c0230o2, 48);
                        int i12 = c0230o2.f3744P;
                        InterfaceC0225l0 interfaceC0225l0M4 = c0230o2.m();
                        Z.o oVarC4 = Z.a.c(c0230o2, lVar2);
                        c0230o2.Z();
                        N.U u10 = u6;
                        if (c0230o2.f3743O) {
                            c0230o2.l(c1106n);
                        } else {
                            c0230o2.i0();
                        }
                        C0208d.R(c1100h2, c0230o2, uA3);
                        C0208d.R(c1100h3, c0230o2, interfaceC0225l0M4);
                        if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i12))) {
                            p012c.k.y(i12, c0230o2, i12, c1100h4);
                        }
                        C0208d.R(c1100h5, c0230o2, oVarC4);
                        e2.b(AbstractC0599v0.K(R.string.fx_mode_pulses, c0230o2), null, j4, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o2.k(w6)).f2753h, c0230o2, 384, 0, 65530);
                        AbstractC1070c.b(c0230o2, p123x.V.a(lVar2, 1.0f));
                        J1.a(((Boolean) interfaceC0203a2.getValue()).booleanValue(), new C0280n0(wVar, interfaceC0203a2, 3), null, false, null, null, c0230o2, 0, RecurringDays.RECURRING_WEEKDAYS);
                        Object objD2 = AbstractC0013g0.d(-192540556, c0230o2, true);
                        if (objD2 == u8) {
                            u7 = u10;
                            objD2 = C0208d.K(Boolean.valueOf(((UMPreset) wVar.f1074h).getStandardHighFlash()), u7);
                            c0230o2.f0(objD2);
                        } else {
                            u7 = u10;
                        }
                        InterfaceC0203a0 interfaceC0203a3 = (InterfaceC0203a0) objD2;
                        c0230o2.p(false);
                        p123x.U uA4 = p123x.T.a(c1069b, fVar, c0230o2, 48);
                        int i13 = c0230o2.f3744P;
                        InterfaceC0225l0 interfaceC0225l0M5 = c0230o2.m();
                        Z.o oVarC5 = Z.a.c(c0230o2, lVar2);
                        c0230o2.Z();
                        N.U u11 = u7;
                        if (c0230o2.f3743O) {
                            c0230o2.l(c1106n);
                        } else {
                            c0230o2.i0();
                        }
                        C0208d.R(c1100h2, c0230o2, uA4);
                        C0208d.R(c1100h3, c0230o2, interfaceC0225l0M5);
                        if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i13))) {
                            p012c.k.y(i13, c0230o2, i13, c1100h4);
                        }
                        C0208d.R(c1100h5, c0230o2, oVarC5);
                        e2.b(AbstractC0599v0.K(R.string.fx_mode_extra_flashes, c0230o2), null, j4, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o2.k(w6)).f2753h, c0230o2, 384, 0, 65530);
                        AbstractC1070c.b(c0230o2, p123x.V.a(lVar2, 1.0f));
                        J1.a(((Boolean) interfaceC0203a3.getValue()).booleanValue(), new C0280n0(wVar, interfaceC0203a3, 4), null, false, null, null, c0230o2, 0, RecurringDays.RECURRING_WEEKDAYS);
                        Object objD3 = AbstractC0013g0.d(-192517455, c0230o2, true);
                        if (objD3 == u8) {
                            objD3 = C0208d.K(Boolean.valueOf(((UMPreset) wVar.f1074h).getStandardStrobe()), u11);
                            c0230o2.f0(objD3);
                        }
                        InterfaceC0203a0 interfaceC0203a4 = (InterfaceC0203a0) objD3;
                        c0230o2.p(false);
                        p123x.U uA5 = p123x.T.a(c1069b, fVar, c0230o2, 48);
                        int i14 = c0230o2.f3744P;
                        InterfaceC0225l0 interfaceC0225l0M6 = c0230o2.m();
                        Z.o oVarC6 = Z.a.c(c0230o2, lVar2);
                        c0230o2.Z();
                        if (c0230o2.f3743O) {
                            c0230o2.l(c1106n);
                        } else {
                            c0230o2.i0();
                        }
                        C0208d.R(c1100h2, c0230o2, uA5);
                        C0208d.R(c1100h3, c0230o2, interfaceC0225l0M6);
                        if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i14))) {
                            p012c.k.y(i14, c0230o2, i14, c1100h4);
                        }
                        C0208d.R(c1100h5, c0230o2, oVarC6);
                        e2.b(AbstractC0599v0.K(R.string.fx_mode_extra_strobes, c0230o2), null, j4, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o2.k(w6)).f2753h, c0230o2, 384, 0, 65530);
                        AbstractC1070c.b(c0230o2, p123x.V.a(lVar2, 1.0f));
                        J1.a(((Boolean) interfaceC0203a4.getValue()).booleanValue(), new C0280n0(wVar, interfaceC0203a4, 5), null, false, null, null, c0230o2, 0, RecurringDays.RECURRING_WEEKDAYS);
                        z5 = true;
                        c0230o2.p(true);
                    } else {
                        z5 = true;
                    }
                    c0230o2.p(false);
                    c0230o2.p(z5);
                }
                break;
            case 1:
                p123x.O o6 = (p123x.O) obj;
                C0230o c0230o3 = (C0230o) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                E4.k.f("innerPadding", o6);
                if ((iIntValue2 & 14) == 0) {
                    iIntValue2 |= c0230o3.f(o6) ? 4 : 2;
                }
                if ((iIntValue2 & 91) == 18 && c0230o3.B()) {
                    c0230o3.P();
                } else {
                    final E4.w wVar2 = new E4.w();
                    UMPreset uMPresetG3 = com.nanjoran.ilightshow.Services.M.f8305O.g();
                    if (uMPresetG3 != null) {
                        wVar2.f1074h = uMPresetG3;
                        c0230o3.V(419060528);
                        Object objK2 = c0230o3.K();
                        if (objK2 == u8) {
                            objK2 = C0208d.K(((UMPreset) wVar2.f1074h).getEngineMode(), N.U.f3673m);
                            c0230o3.f0(objK2);
                        }
                        final InterfaceC0203a0 interfaceC0203a5 = (InterfaceC0203a0) objK2;
                        c0230o3.p(false);
                        Z.l lVar3 = Z.l.f5957a;
                        float f6 = 16;
                        Z.o oVarA = S1.h0.A(androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.a.f(com.fasterxml.jackson.databind.deser.std.d0.G().k(androidx.compose.foundation.layout.c.f6635b), o6), f6), S1.h0.v(c0230o3));
                        C1090x c1090xA2 = AbstractC1088v.a(AbstractC1078k.f13779c, Z.b.f5943s, c0230o3, 0);
                        int i15 = c0230o3.f3744P;
                        InterfaceC0225l0 interfaceC0225l0M7 = c0230o3.m();
                        Z.o oVarC7 = Z.a.c(c0230o3, oVarA);
                        InterfaceC1102j.f14043g.getClass();
                        C1106n c1106n2 = C1101i.f14038b;
                        c0230o3.Z();
                        if (c0230o3.f3743O) {
                            c0230o3.l(c1106n2);
                        } else {
                            c0230o3.i0();
                        }
                        C0208d.R(C1101i.f14041e, c0230o3, c1090xA2);
                        C0208d.R(C1101i.f14040d, c0230o3, interfaceC0225l0M7);
                        C1100h c1100h6 = C1101i.f14042f;
                        if (c0230o3.f3743O || !E4.k.a(c0230o3.K(), Integer.valueOf(i15))) {
                            p012c.k.y(i15, c0230o3, i15, c1100h6);
                        }
                        C0208d.R(C1101i.f14039c, c0230o3, oVarC7);
                        String str2 = (String) interfaceC0203a5.getValue();
                        FXOpt fXOpt3 = FXOpt.INSTANCE;
                        InterfaceC0203a0 interfaceC0203a6 = (InterfaceC0203a0) obj5;
                        F1.I i16 = (F1.I) obj4;
                        L.L.b(androidx.compose.foundation.selection.b.b(lVar3, E4.k.a(str2, fXOpt3.getEngineAdvanced()), new E0.e(3), new C0276l0(i16, wVar2, interfaceC0203a6, interfaceC0203a5, 0)), null, null, null, V.b.c(1628958745, new C0282o0(interfaceC0203a5, i16, wVar2, interfaceC0203a6), c0230o3), c0230o3, 196608, 30);
                        AbstractC1070c.b(c0230o3, androidx.compose.foundation.layout.a.g(lVar3, f6));
                        final int i17 = 0;
                        L.L.b(androidx.compose.foundation.selection.b.b(lVar3, E4.k.a((String) interfaceC0203a5.getValue(), fXOpt3.getEngineStandard()), new E0.e(3), new D4.a() { // from class: N3.m0
                            @Override // D4.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        E4.w wVar3 = wVar2;
                                        E4.k.f("$currentPreset", wVar3);
                                        InterfaceC0203a0 interfaceC0203a7 = interfaceC0203a5;
                                        E4.k.f("$engineMode$delegate", interfaceC0203a7);
                                        UMPreset uMPreset = (UMPreset) wVar3.f1074h;
                                        FXOpt fXOpt4 = FXOpt.INSTANCE;
                                        uMPreset.withEngineMode(fXOpt4.getEngineStandard());
                                        interfaceC0203a7.setValue(fXOpt4.getEngineStandard());
                                        break;
                                    default:
                                        E4.w wVar4 = wVar2;
                                        E4.k.f("$currentPreset", wVar4);
                                        InterfaceC0203a0 interfaceC0203a8 = interfaceC0203a5;
                                        E4.k.f("$engineMode$delegate", interfaceC0203a8);
                                        UMPreset uMPreset2 = (UMPreset) wVar4.f1074h;
                                        FXOpt fXOpt5 = FXOpt.INSTANCE;
                                        uMPreset2.withEngineMode(fXOpt5.getEngineStandard());
                                        interfaceC0203a8.setValue(fXOpt5.getEngineStandard());
                                        break;
                                }
                                return p084p4.x.f10867a;
                            }
                        }), null, null, null, V.b.c(-1955217022, new C0284p0(interfaceC0203a5, i17, wVar2), c0230o3), c0230o3, 196608, 30);
                        e2.b(AbstractC0599v0.K(R.string.paywall_comparison_title, c0230o3), androidx.compose.foundation.layout.a.k(lVar3, 0.0f, 32, 0.0f, 8, 5), 0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), L0.k.f3027l, 0L, null, 0L, 0, false, 0, 0, null, c0230o3, 199728, 0, 131028);
                        G4.a.b(0, c0230o3);
                        c0230o3.p(true);
                    }
                }
                break;
            case 2:
                C1087u c1087u2 = (C1087u) obj;
                C0230o c0230o4 = (C0230o) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                E4.k.f("$this$BoxWithConstraints", c1087u2);
                if ((iIntValue3 & 14) == 0) {
                    iIntValue3 |= c0230o4.f(c1087u2) ? 4 : 2;
                }
                if ((iIntValue3 & 91) == 18 && c0230o4.B()) {
                    c0230o4.P();
                } else {
                    C1069b c1069b2 = AbstractC1078k.f13777a;
                    float f7 = 8;
                    C1075h c1075h = new C1075h(f7);
                    float f8 = 70;
                    Z.o oVarK2 = androidx.compose.foundation.layout.c.k(androidx.compose.foundation.layout.c.c(lVar, f8), c1087u2.a());
                    p123x.U uA6 = p123x.T.a(c1075h, Z.b.f5941q, c0230o4, 6);
                    int i18 = c0230o4.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M8 = c0230o4.m();
                    Z.o oVarC8 = Z.a.c(c0230o4, oVarK2);
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n3 = C1101i.f14038b;
                    c0230o4.Z();
                    if (c0230o4.f3743O) {
                        c0230o4.l(c1106n3);
                    } else {
                        c0230o4.i0();
                    }
                    C1100h c1100h7 = C1101i.f14041e;
                    C0208d.R(c1100h7, c0230o4, uA6);
                    C1100h c1100h8 = C1101i.f14040d;
                    C0208d.R(c1100h8, c0230o4, interfaceC0225l0M8);
                    C1100h c1100h9 = C1101i.f14042f;
                    if (!c0230o4.f3743O) {
                        c1087u = c1087u2;
                        if (!E4.k.a(c0230o4.K(), Integer.valueOf(i18))) {
                        }
                        c1100h = C1101i.f14039c;
                        C0208d.R(c1100h, c0230o4, oVarC8);
                        N.W0 w7 = L.N0.f2415a;
                        A.d dVar = ((L.M0) c0230o4.k(w7)).f2409d;
                        float f9 = 16;
                        float fA = c1087u.a() - f9;
                        float f10 = 3;
                        Z.o oVarC9 = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.c.k(lVar, fA / f10), f8);
                        float f11 = 2;
                        int i19 = p035g0.r.f9086m;
                        long jV = p020d2.n.v();
                        m6 = com.nanjoran.ilightshow.Services.M.f8305O;
                        v6 = (N.V0) obj5;
                        if (m6.k().isEmpty()) {
                            fFloatValue = ((Number) v6.getValue()).floatValue();
                        } else {
                            fFloatValue = 0.0f;
                        }
                        long jB = p035g0.r.b(fFloatValue, jV);
                        float f12 = 20;
                        Z.o oVarF = p081p0.c.F(oVarC9, f11, jB, A.e.a(f12));
                        p123x.O o7 = AbstractC0174s.f2903a;
                        long j6 = m1.f4224a;
                        F1.I i20 = (F1.I) obj4;
                        L.L.a(new C0255b(i20, 18), oVarF, false, dVar, AbstractC0174s.a(j6, c0230o4), null, null, null, M.f4056w, c0230o4, 805306368, 484);
                        gVar = Z.b.i;
                        Z.o oVarK3 = androidx.compose.foundation.layout.c.k(lVar, (((c1087u.a() - f9) * f11) / f10) + f7);
                        p113v0.F fE = AbstractC1084q.e(gVar, false);
                        i = c0230o4.f3744P;
                        InterfaceC0225l0 interfaceC0225l0M9 = c0230o4.m();
                        Z.o oVarC10 = Z.a.c(c0230o4, oVarK3);
                        c0230o4.Z();
                        if (c0230o4.f3743O) {
                            c0230o4.l(c1106n3);
                        } else {
                            c0230o4.i0();
                        }
                        C0208d.R(c1100h7, c0230o4, fE);
                        C0208d.R(c1100h8, c0230o4, interfaceC0225l0M9);
                        if (c0230o4.f3743O || !E4.k.a(c0230o4.K(), Integer.valueOf(i))) {
                            p012c.k.y(i, c0230o4, i, c1100h9);
                        }
                        C0208d.R(c1100h, c0230o4, oVarC10);
                        A.d dVar2 = ((L.M0) c0230o4.k(w7)).f2409d;
                        Z.o oVarC11 = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.c.f6634a, f8);
                        long jV2 = p020d2.n.v();
                        uMPresetG = m6.g();
                        if (uMPresetG != null) {
                            engineMode = uMPresetG.getEngineMode();
                        } else {
                            engineMode = null;
                        }
                        fXOpt = FXOpt.INSTANCE;
                        if (E4.k.a(engineMode, fXOpt.getEngineAdvanced()) || m6.l().b() > 0) {
                            fFloatValue2 = 0.0f;
                        } else {
                            fFloatValue2 = ((Number) v6.getValue()).floatValue();
                        }
                        L.L.a(new C0255b(i20, 19), p081p0.c.F(oVarC11, f11, p035g0.r.b(fFloatValue2, jV2), A.e.a(f12)), false, dVar2, AbstractC0174s.a(j6, c0230o4), null, null, null, M.f4057x, c0230o4, 805306368, 484);
                        uMPresetG2 = m6.g();
                        c0230o4.V(-1673882224);
                        if (uMPresetG2 != null) {
                            c0688o0L = m6.l();
                            zA = E4.k.a(uMPresetG2.getEngineMode(), fXOpt.getEngineAdvanced());
                            gVar2 = Z.b.f5933h;
                            if (zA) {
                                iB = c0688o0L.b();
                                if (1 > iB && iB < 3600) {
                                    c0230o4.V(-349553997);
                                    String strA = P3.b.a(c0688o0L.b());
                                    Z.o oVarK4 = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.a.e(bVar.a(lVar, gVar), 0, -16), p035g0.H.d(4294940672L), A.e.a(f7)), f7, 0.0f, 2).k(new ZIndexElement());
                                    p113v0.F fE2 = AbstractC1084q.e(gVar2, false);
                                    int i21 = c0230o4.f3744P;
                                    InterfaceC0225l0 interfaceC0225l0M10 = c0230o4.m();
                                    Z.o oVarC12 = Z.a.c(c0230o4, oVarK4);
                                    c0230o4.Z();
                                    if (c0230o4.f3743O) {
                                        c0230o4.l(c1106n3);
                                    } else {
                                        c0230o4.i0();
                                    }
                                    C0208d.R(c1100h7, c0230o4, fE2);
                                    C0208d.R(c1100h8, c0230o4, interfaceC0225l0M10);
                                    if (c0230o4.f3743O || !E4.k.a(c0230o4.K(), Integer.valueOf(i21))) {
                                        p012c.k.y(i21, c0230o4, i21, c1100h9);
                                    }
                                    C0208d.R(c1100h, c0230o4, oVarC12);
                                    e2.b(AbstractC0599v0.L(R.string.main_fx_quota_left, new Object[]{strA}, c0230o4), null, p035g0.r.f9080f, com.fasterxml.jackson.databind.deser.std.d0.q(11), L0.k.f3027l, 0L, null, 0L, 0, false, 0, 0, null, c0230o4, 200064, 0, 131026);
                                    c0230o4.p(true);
                                    c0230o4.p(false);
                                } else if (c0688o0L.b() <= 0) {
                                    c0230o4.V(-348427395);
                                    Z.o oVarK5 = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.a.e(bVar.a(lVar, gVar), 0, -16), p035g0.H.d(4294940672L), A.e.a(f7)), f7, 0.0f, 2).k(new ZIndexElement());
                                    p113v0.F fE3 = AbstractC1084q.e(gVar2, false);
                                    i3 = c0230o4.f3744P;
                                    InterfaceC0225l0 interfaceC0225l0M11 = c0230o4.m();
                                    Z.o oVarC13 = Z.a.c(c0230o4, oVarK5);
                                    c0230o4.Z();
                                    if (c0230o4.f3743O) {
                                        c0230o4.l(c1106n3);
                                    } else {
                                        c0230o4.i0();
                                    }
                                    C0208d.R(c1100h7, c0230o4, fE3);
                                    C0208d.R(c1100h8, c0230o4, interfaceC0225l0M11);
                                    if (c0230o4.f3743O || !E4.k.a(c0230o4.K(), Integer.valueOf(i3))) {
                                        p012c.k.y(i3, c0230o4, i3, c1100h9);
                                    }
                                    C0208d.R(c1100h, c0230o4, oVarC13);
                                    e2.b(AbstractC0599v0.K(R.string.main_upgrade_required, c0230o4), null, p035g0.r.f9080f, com.fasterxml.jackson.databind.deser.std.d0.q(11), L0.k.f3027l, 0L, null, 0L, 0, false, 0, 0, null, c0230o4, 200064, 0, 131026);
                                    c0230o4.p(true);
                                    z6 = false;
                                    c0230o4.p(false);
                                } else {
                                    z6 = false;
                                    c0230o4.V(-347466302);
                                    c0230o4.p(false);
                                }
                            } else {
                                c0230o4.V(-350589893);
                                Z.o oVarK6 = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.a.e(bVar.a(lVar, gVar), 0, -16), p035g0.H.d(4294940672L), A.e.a(f7)), f7, 0.0f, 2).k(new ZIndexElement());
                                p113v0.F fE4 = AbstractC1084q.e(gVar2, false);
                                i6 = c0230o4.f3744P;
                                InterfaceC0225l0 interfaceC0225l0M12 = c0230o4.m();
                                Z.o oVarC14 = Z.a.c(c0230o4, oVarK6);
                                c0230o4.Z();
                                if (c0230o4.f3743O) {
                                    c0230o4.l(c1106n3);
                                } else {
                                    c0230o4.i0();
                                }
                                C0208d.R(c1100h7, c0230o4, fE4);
                                C0208d.R(c1100h8, c0230o4, interfaceC0225l0M12);
                                if (c0230o4.f3743O || !E4.k.a(c0230o4.K(), Integer.valueOf(i6))) {
                                    p012c.k.y(i6, c0230o4, i6, c1100h9);
                                }
                                C0208d.R(c1100h, c0230o4, oVarC14);
                                e2.b(AbstractC0599v0.K(R.string.main_new_mode_available, c0230o4), null, p035g0.r.f9080f, com.fasterxml.jackson.databind.deser.std.d0.q(11), L0.k.f3027l, 0L, null, 0L, 0, false, 0, 0, null, c0230o4, 200064, 0, 131026);
                                c0230o4.p(true);
                                c0230o4.p(false);
                            }
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        c0230o4.p(z6);
                        c0230o4.p(true);
                        c0230o4.p(true);
                    } else {
                        c1087u = c1087u2;
                    }
                    p012c.k.y(i18, c0230o4, i18, c1100h9);
                    c1100h = C1101i.f14039c;
                    C0208d.R(c1100h, c0230o4, oVarC8);
                    N.W0 w8 = L.N0.f2415a;
                    A.d dVar3 = ((L.M0) c0230o4.k(w8)).f2409d;
                    float f13 = 16;
                    float fA2 = c1087u.a() - f13;
                    float f14 = 3;
                    Z.o oVarC15 = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.c.k(lVar, fA2 / f14), f8);
                    float f15 = 2;
                    int i110 = p035g0.r.f9086m;
                    long jV3 = p020d2.n.v();
                    m6 = com.nanjoran.ilightshow.Services.M.f8305O;
                    v6 = (N.V0) obj5;
                    if (m6.k().isEmpty()) {
                        fFloatValue = ((Number) v6.getValue()).floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                    long jB2 = p035g0.r.b(fFloatValue, jV3);
                    float f16 = 20;
                    Z.o oVarF2 = p081p0.c.F(oVarC15, f15, jB2, A.e.a(f16));
                    p123x.O o8 = AbstractC0174s.f2903a;
                    long j7 = m1.f4224a;
                    F1.I i22 = (F1.I) obj4;
                    L.L.a(new C0255b(i22, 18), oVarF2, false, dVar3, AbstractC0174s.a(j7, c0230o4), null, null, null, M.f4056w, c0230o4, 805306368, 484);
                    gVar = Z.b.i;
                    Z.o oVarK7 = androidx.compose.foundation.layout.c.k(lVar, (((c1087u.a() - f13) * f15) / f14) + f7);
                    p113v0.F fE5 = AbstractC1084q.e(gVar, false);
                    i = c0230o4.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M13 = c0230o4.m();
                    Z.o oVarC16 = Z.a.c(c0230o4, oVarK7);
                    c0230o4.Z();
                    if (c0230o4.f3743O) {
                        c0230o4.l(c1106n3);
                    } else {
                        c0230o4.i0();
                    }
                    C0208d.R(c1100h7, c0230o4, fE5);
                    C0208d.R(c1100h8, c0230o4, interfaceC0225l0M13);
                    if (c0230o4.f3743O) {
                        p012c.k.y(i, c0230o4, i, c1100h9);
                    } else {
                        p012c.k.y(i, c0230o4, i, c1100h9);
                    }
                    C0208d.R(c1100h, c0230o4, oVarC16);
                    A.d dVar4 = ((L.M0) c0230o4.k(w8)).f2409d;
                    Z.o oVarC17 = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.c.f6634a, f8);
                    long jV4 = p020d2.n.v();
                    uMPresetG = m6.g();
                    if (uMPresetG != null) {
                        engineMode = uMPresetG.getEngineMode();
                    } else {
                        engineMode = null;
                    }
                    fXOpt = FXOpt.INSTANCE;
                    if (E4.k.a(engineMode, fXOpt.getEngineAdvanced())) {
                        fFloatValue2 = 0.0f;
                    } else {
                        fFloatValue2 = 0.0f;
                    }
                    L.L.a(new C0255b(i22, 19), p081p0.c.F(oVarC17, f15, p035g0.r.b(fFloatValue2, jV4), A.e.a(f16)), false, dVar4, AbstractC0174s.a(j7, c0230o4), null, null, null, M.f4057x, c0230o4, 805306368, 484);
                    uMPresetG2 = m6.g();
                    c0230o4.V(-1673882224);
                    if (uMPresetG2 != null) {
                        c0688o0L = m6.l();
                        zA = E4.k.a(uMPresetG2.getEngineMode(), fXOpt.getEngineAdvanced());
                        gVar2 = Z.b.f5933h;
                        if (zA) {
                            c0230o4.V(-350589893);
                            Z.o oVarK8 = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.a.e(bVar.a(lVar, gVar), 0, -16), p035g0.H.d(4294940672L), A.e.a(f7)), f7, 0.0f, 2).k(new ZIndexElement());
                            p113v0.F fE6 = AbstractC1084q.e(gVar2, false);
                            i6 = c0230o4.f3744P;
                            InterfaceC0225l0 interfaceC0225l0M14 = c0230o4.m();
                            Z.o oVarC18 = Z.a.c(c0230o4, oVarK8);
                            c0230o4.Z();
                            if (c0230o4.f3743O) {
                                c0230o4.l(c1106n3);
                            } else {
                                c0230o4.i0();
                            }
                            C0208d.R(c1100h7, c0230o4, fE6);
                            C0208d.R(c1100h8, c0230o4, interfaceC0225l0M14);
                            if (c0230o4.f3743O) {
                                p012c.k.y(i6, c0230o4, i6, c1100h9);
                            } else {
                                p012c.k.y(i6, c0230o4, i6, c1100h9);
                            }
                            C0208d.R(c1100h, c0230o4, oVarC18);
                            e2.b(AbstractC0599v0.K(R.string.main_new_mode_available, c0230o4), null, p035g0.r.f9080f, com.fasterxml.jackson.databind.deser.std.d0.q(11), L0.k.f3027l, 0L, null, 0L, 0, false, 0, 0, null, c0230o4, 200064, 0, 131026);
                            c0230o4.p(true);
                            c0230o4.p(false);
                        } else {
                            iB = c0688o0L.b();
                            if (1 > iB) {
                            }
                            if (c0688o0L.b() <= 0) {
                                c0230o4.V(-348427395);
                                Z.o oVarK9 = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.a.e(bVar.a(lVar, gVar), 0, -16), p035g0.H.d(4294940672L), A.e.a(f7)), f7, 0.0f, 2).k(new ZIndexElement());
                                p113v0.F fE7 = AbstractC1084q.e(gVar2, false);
                                i3 = c0230o4.f3744P;
                                InterfaceC0225l0 interfaceC0225l0M15 = c0230o4.m();
                                Z.o oVarC19 = Z.a.c(c0230o4, oVarK9);
                                c0230o4.Z();
                                if (c0230o4.f3743O) {
                                    c0230o4.l(c1106n3);
                                } else {
                                    c0230o4.i0();
                                }
                                C0208d.R(c1100h7, c0230o4, fE7);
                                C0208d.R(c1100h8, c0230o4, interfaceC0225l0M15);
                                if (c0230o4.f3743O) {
                                    p012c.k.y(i3, c0230o4, i3, c1100h9);
                                } else {
                                    p012c.k.y(i3, c0230o4, i3, c1100h9);
                                }
                                C0208d.R(c1100h, c0230o4, oVarC19);
                                e2.b(AbstractC0599v0.K(R.string.main_upgrade_required, c0230o4), null, p035g0.r.f9080f, com.fasterxml.jackson.databind.deser.std.d0.q(11), L0.k.f3027l, 0L, null, 0L, 0, false, 0, 0, null, c0230o4, 200064, 0, 131026);
                                c0230o4.p(true);
                                z6 = false;
                                c0230o4.p(false);
                            } else {
                                z6 = false;
                                c0230o4.V(-347466302);
                                c0230o4.p(false);
                            }
                        }
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    c0230o4.p(z6);
                    c0230o4.p(true);
                    c0230o4.p(true);
                }
                break;
            case 3:
                C0230o c0230o5 = (C0230o) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                E4.k.f("$this$TopAppBar", (p123x.V) obj);
                if ((iIntValue4 & 81) == 16 && c0230o5.B()) {
                    c0230o5.P();
                } else {
                    L.L.d(new X0((Palette) obj5, (F1.I) obj4, i7), null, false, null, null, Q.f4091h, c0230o5, 196608, 30);
                }
                break;
            default:
                C1087u c1087u3 = (C1087u) obj;
                C0230o c0230o6 = (C0230o) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                E4.k.f("$this$BoxWithConstraints", c1087u3);
                if ((iIntValue5 & 14) == 0) {
                    iIntValue5 |= c0230o6.f(c1087u3) ? 4 : 2;
                }
                if ((iIntValue5 & 91) == 18 && c0230o6.B()) {
                    c0230o6.P();
                } else {
                    float fA3 = c1087u3.a() / 360.0f;
                    long j8 = c1087u3.f13810b;
                    float fN = p081p0.c.N(Math.min(fA3, (S0.a.c(j8) ? c1087u3.f13809a.i0(S0.a.g(j8)) : Float.POSITIVE_INFINITY) / 170.0f), 0.55f, 1.8f);
                    float f17 = 0.85f * fN;
                    List list = (List) obj5;
                    D3.f fVar2 = (D3.f) p089q4.l.a0(0, list);
                    c0230o6.V(-1391859802);
                    Z.g gVar3 = Z.b.f5936l;
                    if (fVar2 != null) {
                        p006b.a.f(fVar2, f17, androidx.compose.foundation.layout.a.e(bVar.a(lVar, gVar3), (-82) * fN, 20 * fN), c0230o6, 0);
                    }
                    c0230o6.p(false);
                    D3.f fVar3 = (D3.f) p089q4.l.a0(1, list);
                    c0230o6.V(-1391849501);
                    if (fVar3 != null) {
                        p006b.a.f(fVar3, f17, androidx.compose.foundation.layout.a.e(bVar.a(lVar, gVar3), 82 * fN, 20 * fN), c0230o6, 0);
                    }
                    c0230o6.p(false);
                    List list2 = (List) obj4;
                    D3.e eVar = (D3.e) p089q4.l.a0(0, list2);
                    c0230o6.V(-1391839360);
                    if (eVar == null) {
                        c0230o = c0230o6;
                    } else {
                        p006b.a.e(eVar, fN, false, androidx.compose.foundation.layout.a.e(bVar.a(lVar, gVar3), (-105) * fN, 20 * fN), c0230o6, 384);
                        c0230o = c0230o6;
                    }
                    c0230o.p(false);
                    D3.e eVar2 = (D3.e) p089q4.l.a0(1, list2);
                    c0230o.V(-1391828353);
                    if (eVar2 != null) {
                        p006b.a.e(eVar2, fN, false, androidx.compose.foundation.layout.a.e(bVar.a(lVar, gVar3), (-15) * fN, 20 * fN), c0230o, 384);
                    }
                    c0230o.p(false);
                    D3.e eVar3 = (D3.e) p089q4.l.a0(2, list2);
                    c0230o.V(-1391817381);
                    if (eVar3 != null) {
                        p006b.a.e(eVar3, fN, true, androidx.compose.foundation.layout.a.e(bVar.a(lVar, gVar3), 15 * fN, 20 * fN), c0230o, 384);
                    }
                    c0230o.p(false);
                    D3.e eVar4 = (D3.e) p089q4.l.a0(3, list2);
                    if (eVar4 != null) {
                        p006b.a.e(eVar4, fN, true, androidx.compose.foundation.layout.a.e(bVar.a(lVar, gVar3), 105 * fN, 20 * fN), c0230o, 384);
                    }
                }
                break;
        }
        return xVar;
    }

    public /* synthetic */ C0284p0(Object obj, int i, Object obj2) {
        this.f4239h = i;
        this.i = obj;
        this.f4240j = obj2;
    }
}
