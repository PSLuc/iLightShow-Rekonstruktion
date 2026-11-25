package N3;

import L.A1;
import L.AbstractC0149j0;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.InterfaceC0203a0;
import N.InterfaceC0225l0;
import androidx.compose.foundation.layout.FillElement;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.Model.Presets.UMPreset;
import com.nanjoran.ilightshow.R;
import com.nanjoran.ilightshow.Services.AbstractC0665d0;
import com.nanjoran.ilightshow.Services.Palette;
import java.util.ListIterator;
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

/* JADX INFO: loaded from: classes.dex */
public final class B0 implements D4.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3926h;
    public final /* synthetic */ F1.I i;

    public /* synthetic */ B0(F1.I i, int i3) {
        this.f3926h = i3;
        this.i = i;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        androidx.compose.foundation.layout.b bVar;
        char c6;
        char c7;
        Z.g gVar;
        char c8;
        switch (this.f3926h) {
            case 0:
                C0230o c0230o = (C0230o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                E4.k.f("$this$TopAppBar", (p123x.V) obj);
                if ((iIntValue & 81) == 16 && c0230o.B()) {
                    c0230o.P();
                } else {
                    L.L.d(new C0255b(this.i, 8), null, false, null, null, K.f4008k, c0230o, 196608, 30);
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
                    UMPreset uMPresetG = com.nanjoran.ilightshow.Services.M.f8305O.g();
                    if (uMPresetG != null) {
                        c0230o2.V(598317246);
                        Object objK = c0230o2.K();
                        if (objK == C0222k.f3714a) {
                            objK = C0208d.K(Float.valueOf(uMPresetG.getSaturationMax()), N.U.f3673m);
                            c0230o2.f0(objK);
                        }
                        InterfaceC0203a0 interfaceC0203a0 = (InterfaceC0203a0) objK;
                        c0230o2.p(false);
                        Z.l lVar = Z.l.f5957a;
                        Z.o oVarA = S1.h0.A(androidx.compose.foundation.layout.a.f(com.fasterxml.jackson.databind.deser.std.d0.G().k(androidx.compose.foundation.layout.c.f6635b), o6), S1.h0.v(c0230o2));
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
                        C1100h c1100h = C1101i.f14041e;
                        C0208d.R(c1100h, c0230o2, c1090xA);
                        C1100h c1100h2 = C1101i.f14040d;
                        C0208d.R(c1100h2, c0230o2, interfaceC0225l0M);
                        C1100h c1100h3 = C1101i.f14042f;
                        if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i))) {
                            p012c.k.y(i, c0230o2, i, c1100h3);
                        }
                        C1100h c1100h4 = C1101i.f14039c;
                        C0208d.R(c1100h4, c0230o2, oVarC);
                        Z.g gVar2 = Z.b.f5933h;
                        p113v0.F fE = AbstractC1084q.e(gVar2, false);
                        int i3 = c0230o2.f3744P;
                        InterfaceC0225l0 interfaceC0225l0M2 = c0230o2.m();
                        Z.o oVarC2 = Z.a.c(c0230o2, lVar);
                        c0230o2.Z();
                        if (c0230o2.f3743O) {
                            c0230o2.l(c1106n);
                        } else {
                            c0230o2.i0();
                        }
                        C0208d.R(c1100h, c0230o2, fE);
                        C0208d.R(c1100h2, c0230o2, interfaceC0225l0M2);
                        if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i3))) {
                            p012c.k.y(i3, c0230o2, i3, c1100h3);
                        }
                        C0208d.R(c1100h4, c0230o2, oVarC2);
                        androidx.compose.foundation.layout.b bVar2 = androidx.compose.foundation.layout.b.f6633a;
                        F1.I i6 = this.i;
                        C0255b c0255b = new C0255b(i6, 25);
                        FillElement fillElement = androidx.compose.foundation.layout.c.f6634a;
                        float f6 = 16;
                        float f7 = 10;
                        A1.b(c0255b, com.fasterxml.jackson.databind.deser.std.d0.k(androidx.compose.foundation.layout.a.g(fillElement, f6), A.e.a(f7)), false, null, 0L, 0L, 0.0f, 0.0f, null, V.b.c(-873703784, new O0(interfaceC0203a0, 1, uMPresetG), c0230o2), c0230o2, 0, 1020);
                        c0230o2.V(206834348);
                        String paletteId = uMPresetG.getPaletteId();
                        Z.g gVar3 = Z.b.f5934j;
                        if (paletteId == null && !uMPresetG.getUseArtworkColors()) {
                            AbstractC0149j0.b(G4.a.t(), AbstractC0599v0.K(R.string.action_selected, c0230o2), bVar2.a(androidx.compose.foundation.layout.a.g(lVar, 6), gVar3), ((L.D) c0230o2.k(L.F.f2265a)).f2211a, c0230o2, 0, 0);
                        }
                        c0230o2.p(false);
                        c0230o2.p(true);
                        p113v0.F fE2 = AbstractC1084q.e(gVar2, false);
                        int i7 = c0230o2.f3744P;
                        InterfaceC0225l0 interfaceC0225l0M3 = c0230o2.m();
                        Z.o oVarC3 = Z.a.c(c0230o2, lVar);
                        c0230o2.Z();
                        if (c0230o2.f3743O) {
                            c0230o2.l(c1106n);
                        } else {
                            c0230o2.i0();
                        }
                        C0208d.R(c1100h, c0230o2, fE2);
                        C0208d.R(c1100h2, c0230o2, interfaceC0225l0M3);
                        if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i7))) {
                            p012c.k.y(i7, c0230o2, i7, c1100h3);
                        }
                        C0208d.R(c1100h4, c0230o2, oVarC3);
                        float f8 = 8;
                        float f9 = f8;
                        F1.I i8 = i6;
                        Z.g gVar4 = gVar3;
                        Z.g gVar5 = gVar2;
                        float f10 = f6;
                        A1.b(new C0255b(i6, 26), com.fasterxml.jackson.databind.deser.std.d0.k(androidx.compose.foundation.layout.a.h(fillElement, f6, f8), A.e.a(f7)), false, null, 0L, 0L, 0.0f, 0.0f, null, Q.f4087d, c0230o2, 0, 1020);
                        c0230o2.V(206881330);
                        char c9 = 24;
                        if (uMPresetG.getUseArtworkColors()) {
                            C0823f c0823fT = G4.a.t();
                            String strK = AbstractC0599v0.K(R.string.action_selected, c0230o2);
                            long j4 = ((L.D) c0230o2.k(L.F.f2265a)).f2211a;
                            c6 = 6;
                            c7 = 2;
                            bVar = bVar2;
                            Z.o oVarA2 = androidx.compose.ui.draw.a.a(androidx.compose.foundation.layout.c.h(bVar.a(androidx.compose.foundation.layout.a.i(lVar, 6, 0.0f, 2), gVar4), 24), new defpackage.d(17));
                            gVar4 = gVar4;
                            AbstractC0149j0.b(c0823fT, strK, oVarA2, j4, c0230o2, 0, 0);
                        } else {
                            bVar = bVar2;
                            c6 = 6;
                            c7 = 2;
                        }
                        c0230o2.p(false);
                        boolean z5 = true;
                        c0230o2.p(true);
                        c0230o2.V(1089728350);
                        ListIterator listIterator = AbstractC0665d0.c().listIterator();
                        while (true) {
                            X.y yVar = (X.y) listIterator;
                            if (yVar.hasNext()) {
                                Palette palette = (Palette) yVar.next();
                                Z.g gVar6 = gVar5;
                                p113v0.F fE3 = AbstractC1084q.e(gVar6, false);
                                int i9 = c0230o2.f3744P;
                                InterfaceC0225l0 interfaceC0225l0M4 = c0230o2.m();
                                Z.o oVarC4 = Z.a.c(c0230o2, lVar);
                                InterfaceC1102j.f14043g.getClass();
                                C1106n c1106n2 = C1101i.f14038b;
                                c0230o2.Z();
                                if (c0230o2.f3743O) {
                                    c0230o2.l(c1106n2);
                                } else {
                                    c0230o2.i0();
                                }
                                C0208d.R(C1101i.f14041e, c0230o2, fE3);
                                C0208d.R(C1101i.f14040d, c0230o2, interfaceC0225l0M4);
                                C1100h c1100h5 = C1101i.f14042f;
                                if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i9))) {
                                    p012c.k.y(i9, c0230o2, i9, c1100h5);
                                }
                                C0208d.R(C1101i.f14039c, c0230o2, oVarC4);
                                F1.I i10 = i8;
                                float f11 = f10;
                                float f12 = f9;
                                gVar5 = gVar6;
                                i8 = i10;
                                f9 = f12;
                                androidx.compose.foundation.layout.b bVar3 = bVar;
                                Z.g gVar7 = gVar4;
                                A1.b(new X0(palette, i10, 1), com.fasterxml.jackson.databind.deser.std.d0.k(androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.c.f6634a, f11, f12), A.e.a(f7)), false, null, 0L, 0L, 0.0f, 0.0f, null, V.b.c(1443429174, new Y0(palette, i10), c0230o2), c0230o2, 0, 1020);
                                c0230o2.V(206958473);
                                if (E4.k.a(uMPresetG.getPaletteId(), palette.getId())) {
                                    c6 = 6;
                                    c7 = 2;
                                    bVar = bVar3;
                                    gVar = gVar7;
                                    c8 = 24;
                                    AbstractC0149j0.b(G4.a.t(), AbstractC0599v0.K(R.string.action_selected, c0230o2), androidx.compose.ui.draw.a.a(androidx.compose.foundation.layout.c.h(bVar.a(androidx.compose.foundation.layout.a.i(lVar, 6, 0.0f, 2), gVar), 24), new defpackage.d(18)), ((L.D) c0230o2.k(L.F.f2265a)).f2211a, c0230o2, 0, 0);
                                } else {
                                    bVar = bVar3;
                                    gVar = gVar7;
                                    c6 = 6;
                                    c7 = 2;
                                    c8 = 24;
                                }
                                c0230o2.p(false);
                                c0230o2.p(true);
                                z5 = true;
                                gVar4 = gVar;
                                f10 = f11;
                                c9 = c8;
                            } else {
                                c0230o2.p(false);
                                AbstractC1070c.b(c0230o2, androidx.compose.foundation.layout.c.c(lVar, 80));
                                c0230o2.p(z5);
                            }
                        }
                    }
                }
                break;
        }
        return p084p4.x.f10867a;
    }
}
