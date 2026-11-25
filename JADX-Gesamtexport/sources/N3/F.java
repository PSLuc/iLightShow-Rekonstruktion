package N3;

import L.AbstractC0190x0;
import L.e2;
import L.g2;
import L.h2;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.InterfaceC0225l0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.Model.Presets.FXOpt;
import com.nanjoran.ilightshow.Model.Presets.UMPreset;
import com.nanjoran.ilightshow.R;
import p123x.AbstractC1078k;
import p123x.C1091y;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: loaded from: classes.dex */
public final class F implements D4.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3949h;
    public final /* synthetic */ String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f3950j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ D4.c f3951k;

    public /* synthetic */ F(String str, String str2, D4.c cVar, int i) {
        this.f3949h = i;
        this.i = str;
        this.f3950j = str2;
        this.f3951k = cVar;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        String strK;
        switch (this.f3949h) {
            case 0:
                C0230o c0230o = (C0230o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                E4.k.f("$this$Card", (C1091y) obj);
                if ((iIntValue & 81) == 16 && c0230o.B()) {
                    c0230o.P();
                } else {
                    Z.l lVar = Z.l.f5957a;
                    Z.o oVarC = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.c.f6634a, 56);
                    final String str = this.i;
                    String str2 = this.f3950j;
                    boolean zA = E4.k.a(str, str2);
                    E0.e eVar = new E0.e(3);
                    c0230o.V(-1421876978);
                    final D4.c cVar = this.f3951k;
                    boolean zF = c0230o.f(cVar) | c0230o.f(str);
                    Object objK = c0230o.K();
                    if (zF || objK == C0222k.f3714a) {
                        final int i = 0;
                        objK = new D4.a() { // from class: N3.E
                            @Override // D4.a
                            public final Object invoke() {
                                switch (i) {
                                    case 0:
                                        D4.c cVar2 = cVar;
                                        E4.k.f("$onOptionSelected", cVar2);
                                        String str3 = str;
                                        E4.k.f("$text", str3);
                                        cVar2.invoke(str3);
                                        UMPreset uMPresetG = com.nanjoran.ilightshow.Services.M.f8305O.g();
                                        if (uMPresetG != null) {
                                            uMPresetG.withFxSize(str3);
                                        }
                                        break;
                                    default:
                                        D4.c cVar3 = cVar;
                                        E4.k.f("$onOptionSelected", cVar3);
                                        String str4 = str;
                                        E4.k.f("$text", str4);
                                        cVar3.invoke(str4);
                                        com.nanjoran.ilightshow.Services.M m6 = com.nanjoran.ilightshow.Services.M.f8305O;
                                        UMPreset uMPresetG2 = m6.g();
                                        if (uMPresetG2 != null) {
                                            uMPresetG2.setIntensityMode(str4);
                                        }
                                        m6.A();
                                        break;
                                }
                                return p084p4.x.f10867a;
                            }
                        };
                        c0230o.f0(objK);
                    }
                    c0230o.p(false);
                    float f6 = 16;
                    Z.o oVarI = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.selection.b.b(oVarC, zA, eVar, (D4.a) objK), f6, 0.0f, 2);
                    p123x.U uA = p123x.T.a(AbstractC1078k.f13777a, Z.b.f5942r, c0230o, 48);
                    int i3 = c0230o.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
                    Z.o oVarC2 = Z.a.c(c0230o, oVarI);
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n = C1101i.f14038b;
                    c0230o.Z();
                    if (c0230o.f3743O) {
                        c0230o.l(c1106n);
                    } else {
                        c0230o.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o, uA);
                    C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M);
                    C1100h c1100h = C1101i.f14042f;
                    if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i3))) {
                        p012c.k.y(i3, c0230o, i3, c1100h);
                    }
                    C0208d.R(C1101i.f14039c, c0230o, oVarC2);
                    AbstractC0190x0.a(E4.k.a(str, str2), null, null, false, null, null, c0230o, 48);
                    E4.k.f("size", str);
                    c0230o.V(-1731759624);
                    FXOpt fXOpt = FXOpt.INSTANCE;
                    if (str.equals(fXOpt.getSize100())) {
                        c0230o.V(408596779);
                        strK = AbstractC0599v0.K(R.string.fx_size_100, c0230o);
                        c0230o.p(false);
                        c0230o.p(false);
                    } else if (str.equals(fXOpt.getSize50())) {
                        c0230o.V(408688012);
                        strK = AbstractC0599v0.K(R.string.fx_size_50, c0230o);
                        c0230o.p(false);
                        c0230o.p(false);
                    } else if (str.equals(fXOpt.getSize25())) {
                        c0230o.V(408778284);
                        strK = AbstractC0599v0.K(R.string.fx_size_25, c0230o);
                        c0230o.p(false);
                        c0230o.p(false);
                    } else if (str.equals(fXOpt.getSize1())) {
                        c0230o.V(408867533);
                        strK = AbstractC0599v0.K(R.string.fx_size_1, c0230o);
                        c0230o.p(false);
                        c0230o.p(false);
                    } else if (str.equals(fXOpt.getSizeAuto())) {
                        c0230o.V(408958890);
                        strK = AbstractC0599v0.K(R.string.fx_size_auto, c0230o);
                        c0230o.p(false);
                        c0230o.p(false);
                    } else {
                        c0230o.V(409030190);
                        c0230o.p(false);
                        c0230o.p(false);
                        strK = "";
                    }
                    e2.b(strK, androidx.compose.foundation.layout.a.k(lVar, f6, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o.k(h2.f2777a)).f2754j, c0230o, 48, 0, 65532);
                    c0230o.p(true);
                }
                break;
            default:
                C0230o c0230o2 = (C0230o) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                E4.k.f("$this$Card", (C1091y) obj);
                if ((iIntValue2 & 81) == 16 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    Z.l lVar2 = Z.l.f5957a;
                    Z.o oVarC3 = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.c.f6634a, 56);
                    final String str3 = this.i;
                    String str4 = this.f3950j;
                    boolean zA2 = E4.k.a(str3, str4);
                    E0.e eVar2 = new E0.e(3);
                    c0230o2.V(-642453064);
                    final D4.c cVar2 = this.f3951k;
                    boolean zF2 = c0230o2.f(cVar2) | c0230o2.f(str3);
                    Object objK2 = c0230o2.K();
                    if (zF2 || objK2 == C0222k.f3714a) {
                        final int i6 = 1;
                        objK2 = new D4.a() { // from class: N3.E
                            @Override // D4.a
                            public final Object invoke() {
                                switch (i6) {
                                    case 0:
                                        D4.c cVar3 = cVar2;
                                        E4.k.f("$onOptionSelected", cVar3);
                                        String str5 = str3;
                                        E4.k.f("$text", str5);
                                        cVar3.invoke(str5);
                                        UMPreset uMPresetG = com.nanjoran.ilightshow.Services.M.f8305O.g();
                                        if (uMPresetG != null) {
                                            uMPresetG.withFxSize(str5);
                                        }
                                        break;
                                    default:
                                        D4.c cVar4 = cVar2;
                                        E4.k.f("$onOptionSelected", cVar4);
                                        String str6 = str3;
                                        E4.k.f("$text", str6);
                                        cVar4.invoke(str6);
                                        com.nanjoran.ilightshow.Services.M m6 = com.nanjoran.ilightshow.Services.M.f8305O;
                                        UMPreset uMPresetG2 = m6.g();
                                        if (uMPresetG2 != null) {
                                            uMPresetG2.setIntensityMode(str6);
                                        }
                                        m6.A();
                                        break;
                                }
                                return p084p4.x.f10867a;
                            }
                        };
                        c0230o2.f0(objK2);
                    }
                    c0230o2.p(false);
                    float f7 = 16;
                    Z.o oVarI2 = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.selection.b.b(oVarC3, zA2, eVar2, (D4.a) objK2), f7, 0.0f, 2);
                    p123x.U uA2 = p123x.T.a(AbstractC1078k.f13777a, Z.b.f5942r, c0230o2, 48);
                    int i7 = c0230o2.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M2 = c0230o2.m();
                    Z.o oVarC4 = Z.a.c(c0230o2, oVarI2);
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n2 = C1101i.f14038b;
                    c0230o2.Z();
                    if (c0230o2.f3743O) {
                        c0230o2.l(c1106n2);
                    } else {
                        c0230o2.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o2, uA2);
                    C0208d.R(C1101i.f14040d, c0230o2, interfaceC0225l0M2);
                    C1100h c1100h2 = C1101i.f14042f;
                    if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i7))) {
                        p012c.k.y(i7, c0230o2, i7, c1100h2);
                    }
                    C0208d.R(C1101i.f14039c, c0230o2, oVarC4);
                    AbstractC0190x0.a(E4.k.a(str3, str4), null, null, false, null, null, c0230o2, 48);
                    e2.b(AbstractC0599v0.A(str3, c0230o2), androidx.compose.foundation.layout.a.k(lVar2, f7, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o2.k(h2.f2777a)).f2754j, c0230o2, 48, 0, 65532);
                    c0230o2.p(true);
                }
                break;
        }
        return p084p4.x.f10867a;
    }
}
