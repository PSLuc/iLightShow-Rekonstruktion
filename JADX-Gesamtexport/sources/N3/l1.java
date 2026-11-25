package N3;

import L.AbstractC0149j0;
import L.e2;
import L.g2;
import L.h2;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.InterfaceC0203a0;
import N.InterfaceC0225l0;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.R;
import com.nanjoran.ilightshow.Services.AppPreset;
import com.nanjoran.ilightshow.Services.C0680l;
import java.util.ArrayList;
import java.util.ListIterator;
import p123x.AbstractC1070c;
import p123x.AbstractC1078k;
import p123x.AbstractC1088v;
import p123x.C1069b;
import p123x.C1071d;
import p123x.C1090x;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: loaded from: classes.dex */
public final class l1 implements D4.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4213h;
    public final /* synthetic */ InterfaceC0203a0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4214j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ F1.I f4215k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4216l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4217m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4218n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f4219o;

    public l1(InterfaceC0203a0 interfaceC0203a0, InterfaceC0203a0 interfaceC0203a1, InterfaceC0203a0 interfaceC0203a2, F1.I i, InterfaceC0203a0 interfaceC0203a3, InterfaceC0203a0 interfaceC0203a4, InterfaceC0203a0 interfaceC0203a5, Context context) {
        this.f4213h = interfaceC0203a0;
        this.i = interfaceC0203a1;
        this.f4214j = interfaceC0203a2;
        this.f4215k = i;
        this.f4216l = interfaceC0203a3;
        this.f4217m = interfaceC0203a4;
        this.f4218n = interfaceC0203a5;
        this.f4219o = context;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0760  */
    /* JADX WARN: Code duplicated, block: B:38:0x011f  */
    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        Z.f fVar;
        C1100h c1100h;
        C0230o c0230o;
        boolean z5 = false;
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
            Z.o oVarA = S1.h0.A(androidx.compose.foundation.layout.a.f(androidx.compose.foundation.layout.a.g(com.fasterxml.jackson.databind.deser.std.d0.G(), f6).k(androidx.compose.foundation.layout.c.f6634a), o6), S1.h0.v(c0230o2));
            C1071d c1071d = AbstractC1078k.f13779c;
            Z.e eVar = Z.b.f5943s;
            C1090x c1090xA = AbstractC1088v.a(c1071d, eVar, c0230o2, 0);
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
            C1100h c1100h2 = C1101i.f14041e;
            C0208d.R(c1100h2, c0230o2, c1090xA);
            C1100h c1100h3 = C1101i.f14040d;
            C0208d.R(c1100h3, c0230o2, interfaceC0225l0M);
            C1100h c1100h4 = C1101i.f14042f;
            if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i))) {
                p012c.k.y(i, c0230o2, i, c1100h4);
            }
            C1100h c1100h5 = C1101i.f14039c;
            C0208d.R(c1100h5, c0230o2, oVarC);
            c0230o2.V(-1692972077);
            com.nanjoran.ilightshow.Services.r0.f8470a.getClass();
            boolean zA = com.nanjoran.ilightshow.Services.r0.a();
            W2.g gVar = p035g0.H.f9016a;
            if (zA) {
                if (!((Boolean) com.nanjoran.ilightshow.Services.r0.f8472c.a(com.nanjoran.ilightshow.Services.r0.f8471b[0])).booleanValue()) {
                    Z.o oVarB = androidx.compose.foundation.a.b(com.fasterxml.jackson.databind.deser.std.d0.k(lVar, A.e.a(8)), m1.f4224a, gVar);
                    C1090x c1090xA2 = AbstractC1088v.a(c1071d, eVar, c0230o2, 0);
                    int i3 = c0230o2.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M2 = c0230o2.m();
                    Z.o oVarC2 = Z.a.c(c0230o2, oVarB);
                    c0230o2.Z();
                    if (c0230o2.f3743O) {
                        c0230o2.l(c1106n);
                    } else {
                        c0230o2.i0();
                    }
                    C0208d.R(c1100h2, c0230o2, c1090xA2);
                    C0208d.R(c1100h3, c0230o2, interfaceC0225l0M2);
                    if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i3))) {
                        p012c.k.y(i3, c0230o2, i3, c1100h4);
                    }
                    C0208d.R(c1100h5, c0230o2, oVarC2);
                    z5 = false;
                    m1.a(0, c0230o2);
                    c0230o2.p(true);
                }
            }
            c0230o2.p(z5);
            float f7 = 8;
            float f8 = f7;
            e2.b(AbstractC0599v0.K(R.string.settings_my_presets, c0230o2), androidx.compose.foundation.layout.a.k(lVar, 0.0f, f6, 0.0f, f7, 5), 0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), L0.k.f3027l, 0L, null, 0L, 0, false, 0, 0, null, c0230o2, 199728, 0, 131028);
            C0230o c0230o3 = c0230o2;
            Z.o oVarB2 = androidx.compose.foundation.a.b(com.fasterxml.jackson.databind.deser.std.d0.k(lVar, A.e.a(f8)), m1.f4224a, gVar);
            C1090x c1090xA3 = AbstractC1088v.a(c1071d, eVar, c0230o3, 0);
            int i6 = c0230o3.f3744P;
            InterfaceC0225l0 interfaceC0225l0M3 = c0230o3.m();
            Z.o oVarC3 = Z.a.c(c0230o3, oVarB2);
            c0230o3.Z();
            if (c0230o3.f3743O) {
                c0230o3.l(c1106n);
            } else {
                c0230o3.i0();
            }
            C0208d.R(c1100h2, c0230o3, c1090xA3);
            C0208d.R(c1100h3, c0230o3, interfaceC0225l0M3);
            if (c0230o3.f3743O || !E4.k.a(c0230o3.K(), Integer.valueOf(i6))) {
                p012c.k.y(i6, c0230o3, i6, c1100h4);
            }
            C0208d.R(c1100h5, c0230o3, oVarC3);
            c0230o3.V(-40326470);
            C0680l.f8421a.getClass();
            ListIterator listIterator = C0680l.f8426f.listIterator();
            while (true) {
                X.y yVar = (X.y) listIterator;
                boolean zHasNext = yVar.hasNext();
                fVar = Z.b.f5942r;
                if (!zHasNext) {
                    break;
                }
                final AppPreset appPreset = (AppPreset) yVar.next();
                final int i7 = 0;
                Z.o oVarF = androidx.compose.foundation.a.f(androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.c(lVar, 54), f6, 0.0f, 0.0f, 0.0f, 14), false, null, new D4.a() { // from class: N3.k1
                    @Override // D4.a
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                AppPreset appPreset2 = appPreset;
                                E4.k.f("$preset", appPreset2);
                                appPreset2.apply();
                                break;
                            default:
                                AppPreset appPreset3 = appPreset;
                                C0680l.f8421a.getClass();
                                String localId = appPreset3.getLocalId();
                                X.s sVar = C0680l.f8426f;
                                ArrayList arrayList = new ArrayList();
                                ListIterator listIterator2 = sVar.listIterator();
                                while (true) {
                                    X.y yVar2 = (X.y) listIterator2;
                                    if (!yVar2.hasNext()) {
                                        C0680l.f8426f = C0208d.U(arrayList);
                                        C0680l.b();
                                        break;
                                    } else {
                                        Object next = yVar2.next();
                                        AppPreset appPreset4 = (AppPreset) next;
                                        if (localId != null) {
                                            if (!E4.k.a(appPreset4.getLocalId(), localId)) {
                                                arrayList.add(next);
                                            }
                                        } else if (!E4.k.a(appPreset4.getName(), appPreset3.getName())) {
                                            arrayList.add(next);
                                        }
                                    }
                                }
                                break;
                        }
                        return p084p4.x.f10867a;
                    }
                }, 7);
                p123x.U uA = p123x.T.a(AbstractC1078k.f13777a, fVar, c0230o3, 48);
                int i8 = c0230o3.f3744P;
                InterfaceC0225l0 interfaceC0225l0M4 = c0230o3.m();
                Z.o oVarC4 = Z.a.c(c0230o3, oVarF);
                InterfaceC1102j.f14043g.getClass();
                C1106n c1106n2 = C1101i.f14038b;
                c0230o3.Z();
                if (c0230o3.f3743O) {
                    c0230o3.l(c1106n2);
                } else {
                    c0230o3.i0();
                }
                C0208d.R(C1101i.f14041e, c0230o3, uA);
                C0208d.R(C1101i.f14040d, c0230o3, interfaceC0225l0M4);
                C1100h c1100h6 = C1101i.f14042f;
                if (c0230o3.f3743O || !E4.k.a(c0230o3.K(), Integer.valueOf(i8))) {
                    p012c.k.y(i8, c0230o3, i8, c1100h6);
                }
                C0208d.R(C1101i.f14039c, c0230o3, oVarC4);
                float f9 = f8;
                C0230o c0230o4 = c0230o3;
                e2.b(appPreset.getName(), androidx.compose.foundation.layout.a.g(lVar, f9), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o4, 48, 0, 131068);
                AbstractC1070c.b(c0230o4, p123x.V.a(lVar, 1.0f));
                final int i9 = 1;
                L.L.d(new D4.a() { // from class: N3.k1
                    @Override // D4.a
                    public final Object invoke() {
                        switch (i9) {
                            case 0:
                                AppPreset appPreset2 = appPreset;
                                E4.k.f("$preset", appPreset2);
                                appPreset2.apply();
                                break;
                            default:
                                AppPreset appPreset3 = appPreset;
                                C0680l.f8421a.getClass();
                                String localId = appPreset3.getLocalId();
                                X.s sVar = C0680l.f8426f;
                                ArrayList arrayList = new ArrayList();
                                ListIterator listIterator2 = sVar.listIterator();
                                while (true) {
                                    X.y yVar2 = (X.y) listIterator2;
                                    if (!yVar2.hasNext()) {
                                        C0680l.f8426f = C0208d.U(arrayList);
                                        C0680l.b();
                                        break;
                                    } else {
                                        Object next = yVar2.next();
                                        AppPreset appPreset4 = (AppPreset) next;
                                        if (localId != null) {
                                            if (!E4.k.a(appPreset4.getLocalId(), localId)) {
                                                arrayList.add(next);
                                            }
                                        } else if (!E4.k.a(appPreset4.getName(), appPreset3.getName())) {
                                            arrayList.add(next);
                                        }
                                    }
                                }
                                break;
                        }
                        return p084p4.x.f10867a;
                    }
                }, null, false, null, null, U.f4122k, c0230o4, 196608, 30);
                c0230o4.p(true);
                int i10 = p035g0.r.f9086m;
                L.L.c(null, 1, p035g0.r.b(0.2f, p035g0.r.f9078d), c0230o4, 432, 1);
                f8 = f9;
                c0230o3 = c0230o4;
            }
            float f10 = f8;
            c0230o3.p(false);
            Z.o oVarK = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.c(lVar, 54), f6, 0.0f, 0.0f, 0.0f, 14);
            c0230o3.V(-40285416);
            Object objK = c0230o3.K();
            N.U u6 = C0222k.f3714a;
            if (objK == u6) {
                objK = new C0256b0(this.f4213h, this.i, this.f4214j, 2);
                c0230o3.f0(objK);
            }
            c0230o3.p(false);
            Z.o oVarF2 = androidx.compose.foundation.a.f(oVarK, false, null, (D4.a) objK, 7);
            C1069b c1069b = AbstractC1078k.f13777a;
            p123x.U uA2 = p123x.T.a(c1069b, fVar, c0230o3, 48);
            int i11 = c0230o3.f3744P;
            InterfaceC0225l0 interfaceC0225l0M5 = c0230o3.m();
            Z.o oVarC5 = Z.a.c(c0230o3, oVarF2);
            InterfaceC1102j.f14043g.getClass();
            C1106n c1106n3 = C1101i.f14038b;
            c0230o3.Z();
            if (c0230o3.f3743O) {
                c0230o3.l(c1106n3);
            } else {
                c0230o3.i0();
            }
            C1100h c1100h7 = C1101i.f14041e;
            C0208d.R(c1100h7, c0230o3, uA2);
            C1100h c1100h8 = C1101i.f14040d;
            C0208d.R(c1100h8, c0230o3, interfaceC0225l0M5);
            C1100h c1100h9 = C1101i.f14042f;
            if (c0230o3.f3743O || !E4.k.a(c0230o3.K(), Integer.valueOf(i11))) {
                p012c.k.y(i11, c0230o3, i11, c1100h9);
            }
            C1100h c1100h10 = C1101i.f14039c;
            C0208d.R(c1100h10, c0230o3, oVarC5);
            AbstractC0149j0.b(AbstractC0599v0.x(), null, null, 0L, c0230o3, 48, 12);
            C0230o c0230o5 = c0230o3;
            e2.b(AbstractC0599v0.K(R.string.settings_save_current_config, c0230o3), androidx.compose.foundation.layout.a.g(lVar, f10), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 48, 0, 131068);
            AbstractC1070c.b(c0230o5, p123x.V.a(lVar, 1.0f));
            c0230o5.p(true);
            c0230o5.p(true);
            String strK = AbstractC0599v0.K(R.string.settings_presets_description, c0230o5);
            N.W0 w6 = h2.f2777a;
            G0.J j4 = ((g2) c0230o5.k(w6)).f2758n;
            Z.o oVarK2 = androidx.compose.foundation.layout.a.k(lVar, 0.0f, f10, 0.0f, 0.0f, 13);
            int i12 = p035g0.r.f9086m;
            long j6 = p035g0.r.f9078d;
            e2.b(strK, oVarK2, j6, 0L, null, 0L, null, 0L, 0, false, 0, 0, j4, c0230o5, 432, 0, 65528);
            String strK2 = AbstractC0599v0.K(R.string.settings_membership, c0230o5);
            long jQ = com.fasterxml.jackson.databind.deser.std.d0.q(16);
            L0.k kVar = L0.k.f3027l;
            float f11 = 32;
            e2.b(strK2, androidx.compose.foundation.layout.a.k(lVar, 0.0f, f11, 0.0f, f10, 5), 0L, jQ, kVar, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 199728, 0, 131028);
            Z.o oVarK3 = com.fasterxml.jackson.databind.deser.std.d0.k(lVar, A.e.a(f10));
            long j7 = m1.f4224a;
            Z.o oVarB3 = androidx.compose.foundation.a.b(oVarK3, j7, gVar);
            C1071d c1071d2 = AbstractC1078k.f13779c;
            C1090x c1090xA4 = AbstractC1088v.a(c1071d2, eVar, c0230o5, 0);
            int i13 = c0230o5.f3744P;
            InterfaceC0225l0 interfaceC0225l0M6 = c0230o5.m();
            Z.o oVarC6 = Z.a.c(c0230o5, oVarB3);
            c0230o5.Z();
            if (c0230o5.f3743O) {
                c0230o5.l(c1106n3);
            } else {
                c0230o5.i0();
            }
            C0208d.R(c1100h7, c0230o5, c1090xA4);
            C0208d.R(c1100h8, c0230o5, interfaceC0225l0M6);
            if (c0230o5.f3743O || !E4.k.a(c0230o5.K(), Integer.valueOf(i13))) {
                p012c.k.y(i13, c0230o5, i13, c1100h9);
            }
            C0208d.R(c1100h10, c0230o5, oVarC6);
            F1.I i14 = this.f4215k;
            AbstractC0599v0.b(new b1(i14, 3), null, 0L, U.f4123l, c0230o5, 3072, 6);
            c0230o5.p(true);
            e2.b(AbstractC0599v0.K(R.string.settings_lights_section, c0230o5), androidx.compose.foundation.layout.a.k(lVar, 0.0f, f11, 0.0f, f10, 5), 0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), kVar, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 199728, 0, 131028);
            Z.o oVarB4 = androidx.compose.foundation.a.b(com.fasterxml.jackson.databind.deser.std.d0.k(lVar, A.e.a(f10)), j7, gVar);
            C1090x c1090xA5 = AbstractC1088v.a(c1071d2, eVar, c0230o5, 0);
            int i15 = c0230o5.f3744P;
            InterfaceC0225l0 interfaceC0225l0M7 = c0230o5.m();
            Z.o oVarC7 = Z.a.c(c0230o5, oVarB4);
            c0230o5.Z();
            if (c0230o5.f3743O) {
                c0230o5.l(c1106n3);
            } else {
                c0230o5.i0();
            }
            C0208d.R(c1100h7, c0230o5, c1090xA5);
            C0208d.R(c1100h8, c0230o5, interfaceC0225l0M7);
            if (c0230o5.f3743O || !E4.k.a(c0230o5.K(), Integer.valueOf(i15))) {
                c1100h = c1100h9;
                p012c.k.y(i15, c0230o5, i15, c1100h);
            } else {
                c1100h = c1100h9;
            }
            C0208d.R(c1100h10, c0230o5, oVarC7);
            C1100h c1100h11 = c1100h;
            AbstractC0599v0.b(new b1(i14, 4), null, 0L, U.f4124m, c0230o5, 3072, 6);
            float f12 = 1;
            L.L.c(null, f12, p035g0.r.b(0.2f, j6), c0230o5, 432, 1);
            c0230o5.V(-40141794);
            Object objK2 = c0230o5.K();
            InterfaceC0203a0 interfaceC0203a0 = this.f4216l;
            if (objK2 == u6) {
                objK2 = new C0275l(25, interfaceC0203a0);
                c0230o5.f0(objK2);
            }
            c0230o5.p(false);
            AbstractC0599v0.b((D4.a) objK2, null, 0L, V.b.c(2117657402, new C0254a0(11, interfaceC0203a0), c0230o5), c0230o5, 3078, 6);
            L.L.c(null, f12, p035g0.r.b(0.2f, j6), c0230o5, 432, 1);
            c0230o5.V(-40105396);
            Object objK3 = c0230o5.K();
            InterfaceC0203a0 interfaceC0203a1 = this.f4218n;
            InterfaceC0203a0 interfaceC0203a2 = this.f4217m;
            if (objK3 == u6) {
                objK3 = new C0277m(interfaceC0203a2, interfaceC0203a1, 4);
                c0230o5.f0(objK3);
            }
            c0230o5.p(false);
            AbstractC0599v0.b((D4.a) objK3, null, 0L, V.b.c(-1006101223, new j1(interfaceC0203a2, interfaceC0203a1, 3), c0230o5), c0230o5, 3078, 6);
            c0230o5.p(true);
            e2.b(AbstractC0599v0.K(R.string.settings_legacy_mode_description, c0230o5), androidx.compose.foundation.layout.a.k(lVar, 0.0f, f10, 0.0f, 0.0f, 13), j6, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o5.k(w6)).f2758n, c0230o5, 432, 0, 65528);
            e2.b(AbstractC0599v0.K(R.string.settings_more, c0230o5), androidx.compose.foundation.layout.a.k(lVar, 0.0f, f11, 0.0f, f10, 5), 0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), kVar, 0L, null, 0L, 0, false, 0, 0, null, c0230o5, 199728, 0, 131028);
            Z.o oVarB5 = androidx.compose.foundation.a.b(com.fasterxml.jackson.databind.deser.std.d0.k(lVar, A.e.a(f10)), j7, gVar);
            C1090x c1090xA6 = AbstractC1088v.a(c1071d2, eVar, c0230o5, 0);
            int i16 = c0230o5.f3744P;
            InterfaceC0225l0 interfaceC0225l0M8 = c0230o5.m();
            Z.o oVarC8 = Z.a.c(c0230o5, oVarB5);
            c0230o5.Z();
            if (c0230o5.f3743O) {
                c0230o5.l(c1106n3);
            } else {
                c0230o5.i0();
            }
            C0208d.R(c1100h7, c0230o5, c1090xA6);
            C0208d.R(c1100h8, c0230o5, interfaceC0225l0M8);
            if (c0230o5.f3743O || !E4.k.a(c0230o5.K(), Integer.valueOf(i16))) {
                p012c.k.y(i16, c0230o5, i16, c1100h11);
            }
            C0208d.R(c1100h10, c0230o5, oVarC8);
            c0230o5.V(-40045550);
            com.nanjoran.ilightshow.Services.r0.f8470a.getClass();
            if (com.nanjoran.ilightshow.Services.r0.a()) {
                if (((Boolean) com.nanjoran.ilightshow.Services.r0.f8472c.a(com.nanjoran.ilightshow.Services.r0.f8471b[0])).booleanValue()) {
                    m1.a(0, c0230o5);
                    c0230o = c0230o5;
                    L.L.c(null, f12, p035g0.r.b(0.2f, Z2.f.k()), c0230o, 432, 1);
                } else {
                    c0230o = c0230o5;
                }
            } else {
                c0230o = c0230o5;
            }
            c0230o.s();
            Context context = this.f4219o;
            AbstractC0599v0.b(new V(context, 6), null, 0L, U.f4125n, c0230o, 3072, 6);
            L.L.c(null, f12, p035g0.r.b(0.2f, Z2.f.k()), c0230o, 432, 1);
            C0230o c0230o6 = c0230o;
            AbstractC0599v0.b(new V(context, 7), null, 0L, U.f4126o, c0230o6, 3072, 6);
            c0230o6.r();
            C1090x c1090xA7 = AbstractC1088v.a(c1071d2, eVar, c0230o6, 0);
            int iE = C0208d.E(c0230o6);
            InterfaceC0225l0 interfaceC0225l0X = c0230o6.x();
            Z.o oVarC9 = Z.a.c(c0230o6, lVar);
            C1106n c1106nA = C1101i.a();
            c0230o6.Z();
            if (c0230o6.A()) {
                c0230o6.l(c1106nA);
            } else {
                c0230o6.i0();
            }
            C0208d.R(C1101i.c(), c0230o6, c1090xA7);
            C0208d.R(C1101i.e(), c0230o6, interfaceC0225l0X);
            C1100h c1100hB = C1101i.b();
            if (c0230o6.A() || !E4.k.a(c0230o6.K(), Integer.valueOf(iE))) {
                p012c.k.y(iE, c0230o6, iE, c1100hB);
            }
            C0208d.R(C1101i.d(), c0230o6, oVarC9);
            e2.b(AbstractC0599v0.L(R.string.settings_version, new Object[]{"3.1.7", 29859116}, c0230o6), androidx.compose.foundation.layout.a.k(lVar, 0.0f, f10, 0.0f, 0.0f, 13), Z2.f.k(), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o6.k(w6)).f2758n, c0230o6, 432, 0, 65528);
            e2.b(AbstractC0599v0.L(R.string.settings_device_id, new Object[]{Settings.Secure.getString(context.getContentResolver(), "android_id")}, c0230o6), androidx.compose.foundation.a.f(androidx.compose.foundation.layout.a.k(lVar, 0.0f, f10, 0.0f, 0.0f, 13), false, null, new V(context, 5), 7), Z2.f.k(), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o6.k(w6)).f2758n, c0230o6, 384, 0, 65528);
            c0230o6.r();
            e2.b(AbstractC0599v0.K(R.string.settings_about_developer, c0230o6), androidx.compose.foundation.layout.a.k(lVar, 0.0f, f11, 0.0f, f10, 5), 0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), S1.V.z(), 0L, null, 0L, 0, false, 0, 0, null, c0230o6, 199728, 0, 131028);
            Z.o oVarB6 = androidx.compose.foundation.a.b(com.fasterxml.jackson.databind.deser.std.d0.k(lVar, A.e.a(f10)), m1.c(), p035g0.H.f9016a);
            C1090x c1090xA8 = AbstractC1088v.a(c1071d2, eVar, c0230o6, 0);
            int iE2 = C0208d.E(c0230o6);
            InterfaceC0225l0 interfaceC0225l0X2 = c0230o6.x();
            Z.o oVarC10 = Z.a.c(c0230o6, oVarB6);
            C1106n c1106nA2 = C1101i.a();
            c0230o6.Z();
            if (c0230o6.A()) {
                c0230o6.l(c1106nA2);
            } else {
                c0230o6.i0();
            }
            C0208d.R(C1101i.c(), c0230o6, c1090xA8);
            C0208d.R(C1101i.e(), c0230o6, interfaceC0225l0X2);
            C1100h c1100hB2 = C1101i.b();
            if (c0230o6.A() || !E4.k.a(c0230o6.K(), Integer.valueOf(iE2))) {
                p012c.k.y(iE2, c0230o6, iE2, c1100hB2);
            }
            C0208d.R(C1101i.d(), c0230o6, oVarC10);
            Z.o oVarK4 = androidx.compose.foundation.layout.a.k(lVar, f10, 0.0f, 0.0f, 0.0f, 14);
            p123x.U uA3 = p123x.T.a(c1069b, Z.b.f5941q, c0230o6, 0);
            int iE3 = C0208d.E(c0230o6);
            InterfaceC0225l0 interfaceC0225l0X3 = c0230o6.x();
            Z.o oVarC11 = Z.a.c(c0230o6, oVarK4);
            C1106n c1106nA3 = C1101i.a();
            c0230o6.Z();
            if (c0230o6.A()) {
                c0230o6.l(c1106nA3);
            } else {
                c0230o6.i0();
            }
            C0208d.R(C1101i.c(), c0230o6, uA3);
            C0208d.R(C1101i.e(), c0230o6, interfaceC0225l0X3);
            C1100h c1100hB3 = C1101i.b();
            if (c0230o6.A() || !E4.k.a(c0230o6.K(), Integer.valueOf(iE3))) {
                p012c.k.y(iE3, c0230o6, iE3, c1100hB3);
            }
            C0208d.R(C1101i.d(), c0230o6, oVarC11);
            S1.V.d(com.fasterxml.jackson.databind.deser.std.d0.z(R.drawable.nicolas, c0230o6), AbstractC0599v0.K(R.string.settings_developer_photo, c0230o6), com.fasterxml.jackson.databind.deser.std.d0.k(androidx.compose.foundation.layout.c.h(androidx.compose.foundation.layout.a.g(lVar, f10), 50), A.e.a(25)), null, null, 0.0f, null, c0230o6, 8, 120);
            Z.o oVarG = androidx.compose.foundation.layout.a.g(lVar, f10);
            C1090x c1090xA9 = AbstractC1088v.a(c1071d2, eVar, c0230o6, 0);
            int iE4 = C0208d.E(c0230o6);
            InterfaceC0225l0 interfaceC0225l0X4 = c0230o6.x();
            Z.o oVarC12 = Z.a.c(c0230o6, oVarG);
            C1106n c1106nA4 = C1101i.a();
            c0230o6.Z();
            if (c0230o6.A()) {
                c0230o6.l(c1106nA4);
            } else {
                c0230o6.i0();
            }
            C0208d.R(C1101i.c(), c0230o6, c1090xA9);
            C0208d.R(C1101i.e(), c0230o6, interfaceC0225l0X4);
            C1100h c1100hB4 = C1101i.b();
            if (c0230o6.A() || !E4.k.a(c0230o6.K(), Integer.valueOf(iE4))) {
                p012c.k.y(iE4, c0230o6, iE4, c1100hB4);
            }
            C0208d.R(C1101i.d(), c0230o6, oVarC12);
            e2.b(AbstractC0599v0.K(R.string.settings_developer_name, c0230o6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o6, 0, 0, 131070);
            e2.b(AbstractC0599v0.K(R.string.settings_developer_languages, c0230o6), null, Z2.f.k(), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o6.k(w6)).f2758n, c0230o6, 384, 0, 65530);
            c0230o6.r();
            AbstractC1070c.b(c0230o6, p123x.V.a(lVar, 1.0f));
            c0230o6.r();
            L.L.c(null, f12, p035g0.r.b(0.2f, Z2.f.k()), c0230o6, 432, 1);
            String strK3 = AbstractC0599v0.K(R.string.settings_support_email, c0230o6);
            AbstractC0599v0.b(new A0(strK3, 3, context), null, 0L, V.b.c(1133589742, new c1(strK3, 1), c0230o6), c0230o6, 3072, 6);
            c0230o6.r();
            c0230o6.r();
        }
        return p084p4.x.f10867a;
    }
}
