package N3;

import L.AbstractC0149j0;
import L.AbstractC0176s1;
import L.e2;
import N.C0208d;
import N.C0222k;
import N.C0227m0;
import N.C0230o;
import N.InterfaceC0203a0;
import N.InterfaceC0225l0;
import androidx.compose.foundation.layout.FillElement;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.Model.Presets.UMPreset;
import com.nanjoran.ilightshow.R;
import com.nanjoran.ilightshow.Views.HomeScreenRoute;
import p058l0.C0822e;
import p058l0.C0823f;
import p123x.AbstractC1070c;
import p123x.AbstractC1078k;
import p123x.AbstractC1088v;
import p123x.C1069b;
import p123x.C1090x;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: loaded from: classes.dex */
public final class O0 implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4070h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4071j;

    public /* synthetic */ O0(Object obj, int i, Object obj2) {
        this.f4070h = i;
        this.i = obj;
        this.f4071j = obj2;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        boolean z5;
        char c6;
        p084p4.x xVar = p084p4.x.f10867a;
        Object obj3 = this.f4071j;
        N.U u6 = C0222k.f3714a;
        Object obj4 = this.i;
        switch (this.f4070h) {
            case 0:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    HomeScreenRoute homeScreenRoute = HomeScreenRoute.INSTANCE;
                    defpackage.d dVar = new defpackage.d(11);
                    defpackage.d dVar2 = new defpackage.d(12);
                    defpackage.d dVar3 = new defpackage.d(13);
                    defpackage.d dVar4 = new defpackage.d(14);
                    c0230o.V(-1063896099);
                    p123x.O o6 = (p123x.O) obj3;
                    boolean zF = c0230o.f(o6);
                    Object objK = c0230o.K();
                    if (zF || objK == u6) {
                        z5 = false;
                        objK = new M0(0 == true ? 1 : 0, o6);
                        c0230o.f0(objK);
                    } else {
                        z5 = false;
                    }
                    c0230o.p(z5);
                    S1.V.h((F1.I) obj4, homeScreenRoute, null, null, null, dVar, dVar2, dVar3, dVar4, (D4.c) objK, c0230o, 920125496);
                }
                break;
            default:
                C0230o c0230o2 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    Z.l lVar = Z.l.f5957a;
                    float f6 = 16;
                    Z.o oVarG = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.a.b(lVar, p035g0.r.f9077c, p035g0.H.f9016a), f6);
                    C1090x c1090xA = AbstractC1088v.a(AbstractC1078k.f13779c, Z.b.f5943s, c0230o2, 0);
                    int i = c0230o2.f3744P;
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
                    if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i))) {
                        p012c.k.y(i, c0230o2, i, c1100h3);
                    }
                    C1100h c1100h4 = C1101i.f14039c;
                    C0208d.R(c1100h4, c0230o2, oVarC);
                    Z.f fVar = Z.b.f5942r;
                    C1069b c1069b = AbstractC1078k.f13777a;
                    p123x.U uA = p123x.T.a(c1069b, fVar, c0230o2, 48);
                    int i3 = c0230o2.f3744P;
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
                    if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i3))) {
                        p012c.k.y(i3, c0230o2, i3, c1100h3);
                    }
                    C0208d.R(c1100h4, c0230o2, oVarC2);
                    String strK = AbstractC0599v0.K(R.string.palettes_auto_mode, c0230o2);
                    long j4 = p035g0.r.f9080f;
                    e2.b(strK, null, j4, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o2, 384, 0, 131066);
                    AbstractC1070c.b(c0230o2, p123x.V.a(lVar, 1.0f));
                    C0823f c0823fB = com.fasterxml.jackson.databind.deser.std.d0.f7586j;
                    if (c0823fB != null) {
                        c6 = 0;
                    } else {
                        C0822e c0822e = new C0822e("Outlined.HdrAuto", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i6 = p058l0.G.f10217a;
                        p035g0.O o7 = new p035g0.O(p035g0.r.f9076b);
                        C0227m0 c0227m0 = new C0227m0(2);
                        c0227m0.i(12.0f, 2.0f);
                        c0227m0.c(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                        c0227m0.k(4.48f, 10.0f, 10.0f, 10.0f);
                        c0227m0.k(10.0f, -4.48f, 10.0f, -10.0f);
                        c0227m0.j(17.52f, 2.0f, 12.0f, 2.0f);
                        c0227m0.b();
                        c0227m0.i(12.0f, 20.0f);
                        c0227m0.d(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
                        c0227m0.d(0.0f, -4.41f, 3.59f, -8.0f, 8.0f, -8.0f);
                        c0227m0.k(8.0f, 3.59f, 8.0f, 8.0f);
                        c0227m0.c(20.0f, 16.41f, 16.41f, 20.0f, 12.0f, 20.0f);
                        c0227m0.b();
                        c0227m0.i(11.01f, 6.0f);
                        c0227m0.g(6.88f, 17.0f);
                        c0227m0.f(1.9f);
                        c0227m0.h(1.0f, -2.81f);
                        c0227m0.f(4.44f);
                        c0227m0.g(15.21f, 17.0f);
                        c0227m0.f(1.9f);
                        c6 = 0;
                        c0227m0.g(12.98f, 6.0f);
                        c0227m0.e(11.01f);
                        c0227m0.b();
                        c0227m0.i(10.35f, 12.59f);
                        c0227m0.h(1.6f, -4.55f);
                        c0227m0.f(0.09f);
                        c0227m0.h(1.6f, 4.55f);
                        c0227m0.e(10.35f);
                        c0227m0.b();
                        C0822e.a(c0822e, c0227m0.f3729h, o7);
                        c0823fB = c0822e.b();
                        com.fasterxml.jackson.databind.deser.std.d0.f7586j = c0823fB;
                    }
                    AbstractC0149j0.b(c0823fB, AbstractC0599v0.K(R.string.palettes_auto_mode, c0230o2), null, j4, c0230o2, 3072, 4);
                    c0230o2.p(true);
                    AbstractC1070c.b(c0230o2, androidx.compose.foundation.layout.c.c(lVar, 4));
                    FillElement fillElement = androidx.compose.foundation.layout.c.f6634a;
                    p123x.U uA2 = p123x.T.a(c1069b, fVar, c0230o2, 48);
                    int i7 = c0230o2.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M3 = c0230o2.m();
                    Z.o oVarC3 = Z.a.c(c0230o2, fillElement);
                    c0230o2.Z();
                    if (c0230o2.f3743O) {
                        c0230o2.l(c1106n);
                    } else {
                        c0230o2.i0();
                    }
                    C0208d.R(c1100h, c0230o2, uA2);
                    C0208d.R(c1100h2, c0230o2, interfaceC0225l0M3);
                    if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i7))) {
                        p012c.k.y(i7, c0230o2, i7, c1100h3);
                    }
                    C0208d.R(c1100h4, c0230o2, oVarC3);
                    C0823f c0823fB2 = S1.h0.f4946f;
                    if (c0823fB2 == null) {
                        C0822e c0822e2 = new C0822e("Filled.Opacity", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i8 = p058l0.G.f10217a;
                        p035g0.O o8 = new p035g0.O(p035g0.r.f9076b);
                        C0227m0 c0227m1 = new C0227m0(2);
                        c0227m1.i(17.66f, 8.0f);
                        c0227m1.g(12.0f, 2.35f);
                        c0227m1.g(6.34f, 8.0f);
                        c0227m1.c(4.78f, 9.56f, 4.0f, 11.64f, 4.0f, 13.64f);
                        c0227m1.k(0.78f, 4.11f, 2.34f, 5.67f);
                        c0227m1.k(3.61f, 2.35f, 5.66f, 2.35f);
                        c0227m1.k(4.1f, -0.79f, 5.66f, -2.35f);
                        c0227m1.j(20.0f, 15.64f, 20.0f, 13.64f);
                        c0227m1.j(19.22f, 9.56f, 17.66f, 8.0f);
                        c0227m1.b();
                        c0227m1.i(6.0f, 14.0f);
                        c0227m1.d(0.01f, -2.0f, 0.62f, -3.27f, 1.76f, -4.4f);
                        c0227m1.g(12.0f, 5.27f);
                        c0227m1.h(4.24f, 4.38f);
                        c0227m1.c(17.38f, 10.77f, 17.99f, 12.0f, 18.0f, 14.0f);
                        c0227m1.e(6.0f);
                        c0227m1.b();
                        C0822e.a(c0822e2, c0227m1.f3729h, o8);
                        c0823fB2 = c0822e2.b();
                        S1.h0.f4946f = c0823fB2;
                    }
                    AbstractC0149j0.b(c0823fB2, AbstractC0599v0.K(R.string.settings_title, c0230o2), androidx.compose.foundation.layout.c.h(lVar, f6), j4, c0230o2, 3456, 0);
                    J4.a aVar = new J4.a(0.0f, 255.0f);
                    InterfaceC0203a0 interfaceC0203a0 = (InterfaceC0203a0) obj4;
                    float fFloatValue = ((Number) interfaceC0203a0.getValue()).floatValue();
                    Z.o oVarI = androidx.compose.foundation.layout.a.i(p123x.V.a(lVar, 1.0f), 8, 0.0f, 2);
                    c0230o2.V(-364487470);
                    Object objK2 = c0230o2.K();
                    if (objK2 == u6) {
                        objK2 = new C0259d(6, interfaceC0203a0);
                        c0230o2.f0(objK2);
                    }
                    c0230o2.p(false);
                    AbstractC0176s1.f(fFloatValue, (D4.c) objK2, oVarI, false, aVar, 0, new C0261e((UMPreset) obj3, interfaceC0203a0, 2), null, null, c0230o2, 48, 424);
                    C0823f c0823fB3 = S1.h0.f4947g;
                    if (c0823fB3 == null) {
                        C0822e c0822e3 = new C0822e("Filled.WaterDrop", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i9 = p058l0.G.f10217a;
                        p035g0.O o9 = new p035g0.O(p035g0.r.f9076b);
                        C0227m0 c0227m2 = new C0227m0(2);
                        c0227m2.i(12.0f, 2.0f);
                        c0227m2.d(-5.33f, 4.55f, -8.0f, 8.48f, -8.0f, 11.8f);
                        c0227m2.d(0.0f, 4.98f, 3.8f, 8.2f, 8.0f, 8.2f);
                        c0227m2.k(8.0f, -3.22f, 8.0f, -8.2f);
                        c0227m2.c(20.0f, 10.48f, 17.33f, 6.55f, 12.0f, 2.0f);
                        c0227m2.b();
                        c0227m2.i(7.83f, 14.0f);
                        c0227m2.d(0.37f, 0.0f, 0.67f, 0.26f, 0.74f, 0.62f);
                        c0227m2.d(0.41f, 2.22f, 2.28f, 2.98f, 3.64f, 2.87f);
                        c0227m2.d(0.43f, -0.02f, 0.79f, 0.32f, 0.79f, 0.75f);
                        c0227m2.d(0.0f, 0.4f, -0.32f, 0.73f, -0.72f, 0.75f);
                        c0227m2.d(-2.13f, 0.13f, -4.62f, -1.09f, -5.19f, -4.12f);
                        c0227m2.c(7.01f, 14.42f, 7.37f, 14.0f, 7.83f, 14.0f);
                        c0227m2.b();
                        C0822e.a(c0822e3, c0227m2.f3729h, o9);
                        c0823fB3 = c0822e3.b();
                        S1.h0.f4947g = c0823fB3;
                    }
                    AbstractC0149j0.b(c0823fB3, AbstractC0599v0.K(R.string.settings_title, c0230o2), androidx.compose.foundation.layout.c.h(lVar, f6), j4, c0230o2, 3456, 0);
                    c0230o2.p(true);
                    c0230o2.p(true);
                }
                break;
        }
        return xVar;
    }
}
