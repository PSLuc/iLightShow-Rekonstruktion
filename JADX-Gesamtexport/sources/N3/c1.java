package N3;

import L.AbstractC0149j0;
import L.e2;
import N.C0208d;
import N.C0227m0;
import N.C0230o;
import N.InterfaceC0225l0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.R;
import p058l0.C0822e;
import p058l0.C0823f;
import p123x.AbstractC1070c;
import p123x.AbstractC1078k;
import p123x.AbstractC1088v;
import p123x.C1090x;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: loaded from: classes.dex */
public final class c1 implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4161h;
    public final /* synthetic */ String i;

    public /* synthetic */ c1(String str, int i) {
        this.f4161h = i;
        this.i = str;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        p084p4.x xVar = p084p4.x.f10867a;
        switch (this.f4161h) {
            case 0:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    Z.e eVar = Z.b.f5944t;
                    Z.o oVarK = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.a.a(W2.g.m(p089q4.m.M(new p035g0.r(p035g0.H.d(4284162288L)), new p035g0.r(p035g0.H.d(4288684272L))))), 8).k(androidx.compose.foundation.layout.c.f6634a);
                    C1090x c1090xA = AbstractC1088v.a(AbstractC1078k.f13779c, eVar, c0230o, 48);
                    int i = c0230o.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
                    Z.o oVarC = Z.a.c(c0230o, oVarK);
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n = C1101i.f14038b;
                    c0230o.Z();
                    if (c0230o.f3743O) {
                        c0230o.l(c1106n);
                    } else {
                        c0230o.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o, c1090xA);
                    C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M);
                    C1100h c1100h = C1101i.f14042f;
                    if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i))) {
                        p012c.k.y(i, c0230o, i, c1100h);
                    }
                    C0208d.R(C1101i.f14039c, c0230o, oVarC);
                    e2.b(AbstractC0599v0.K(R.string.paywall_upgrade_v3, c0230o), null, 0L, 0L, L0.k.f3027l, 0L, null, 0L, 0, false, 0, 0, new G0.J(0L, com.fasterxml.jackson.databind.deser.std.d0.q(16), null, 0L, 0, 0L, 16777213), c0230o, 196608, 1572864, 65502);
                    c0230o.V(-511151109);
                    String str = this.i;
                    if (str != null) {
                        e2.b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, new G0.J(0L, com.fasterxml.jackson.databind.deser.std.d0.q(14), null, 0L, 0, 0L, 16777213), c0230o, 0, 1572864, 65534);
                    }
                    c0230o.p(false);
                    c0230o.p(true);
                }
                break;
            default:
                C0230o c0230o2 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    Z.f fVar = Z.b.f5942r;
                    Z.l lVar = Z.l.f5957a;
                    Z.o oVarK2 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.c(lVar, 54), 16, 0.0f, 0.0f, 0.0f, 14);
                    p123x.U uA = p123x.T.a(AbstractC1078k.f13777a, fVar, c0230o2, 48);
                    int i3 = c0230o2.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M2 = c0230o2.m();
                    Z.o oVarC2 = Z.a.c(c0230o2, oVarK2);
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n2 = C1101i.f14038b;
                    c0230o2.Z();
                    if (c0230o2.f3743O) {
                        c0230o2.l(c1106n2);
                    } else {
                        c0230o2.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o2, uA);
                    C0208d.R(C1101i.f14040d, c0230o2, interfaceC0225l0M2);
                    C1100h c1100h2 = C1101i.f14042f;
                    if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i3))) {
                        p012c.k.y(i3, c0230o2, i3, c1100h2);
                    }
                    C0208d.R(C1101i.f14039c, c0230o2, oVarC2);
                    C0823f c0823fB = com.fasterxml.jackson.databind.deser.std.d0.f7585h;
                    if (c0823fB == null) {
                        C0822e c0822e = new C0822e("Filled.Email", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i6 = p058l0.G.f10217a;
                        p035g0.O o6 = new p035g0.O(p035g0.r.f9076b);
                        C0227m0 c0227m0 = new C0227m0(2);
                        c0227m0.i(20.0f, 4.0f);
                        c0227m0.g(4.0f, 4.0f);
                        c0227m0.d(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                        c0227m0.g(2.0f, 18.0f);
                        c0227m0.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        c0227m0.f(16.0f);
                        c0227m0.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        c0227m0.g(22.0f, 6.0f);
                        c0227m0.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        c0227m0.b();
                        c0227m0.i(20.0f, 8.0f);
                        c0227m0.h(-8.0f, 5.0f);
                        c0227m0.h(-8.0f, -5.0f);
                        c0227m0.g(4.0f, 6.0f);
                        c0227m0.h(8.0f, 5.0f);
                        c0227m0.h(8.0f, -5.0f);
                        c0227m0.n(2.0f);
                        c0227m0.b();
                        C0822e.a(c0822e, c0227m0.f3729h, o6);
                        c0823fB = c0822e.b();
                        com.fasterxml.jackson.databind.deser.std.d0.f7585h = c0823fB;
                    }
                    AbstractC0149j0.b(c0823fB, null, null, 0L, c0230o2, 48, 12);
                    float f6 = 8;
                    e2.b(this.i, androidx.compose.foundation.layout.a.g(lVar, f6), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o2, 48, 0, 131068);
                    AbstractC1070c.b(c0230o2, p123x.V.a(lVar, 1.0f));
                    AbstractC0149j0.b(S1.V.A(), null, androidx.compose.foundation.layout.a.g(lVar, f6), 0L, c0230o2, 432, 8);
                    c0230o2.p(true);
                }
                break;
        }
        return xVar;
    }
}
