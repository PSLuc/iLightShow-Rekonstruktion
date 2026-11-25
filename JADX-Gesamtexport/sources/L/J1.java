package L;

import B.AbstractC0013g0;
import B.C0006d;
import N.AbstractC0231o0;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.C0235q0;
import N.C0245w;
import N.InterfaceC0203a0;
import N.InterfaceC0225l0;
import androidx.compose.material3.MinimumInteractiveModifier;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import okhttp3.internal.http2.Http2;
import p096s.AbstractC0909d;
import p096s.C0907c;
import p096s.C0919l;
import p096s.InterfaceC0930x;
import p123x.AbstractC1084q;
import p123x.C1086t;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;
import p130y0.AbstractC1124c0;

/* JADX INFO: loaded from: classes.dex */
public abstract class J1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f2344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f2345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f2346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f2347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f2348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p096s.v0 f2349f;

    static {
        float f6 = M.r.f3291b;
        f2344a = f6;
        f2345b = M.r.f3296g;
        float f7 = M.r.f3295f;
        f2346c = f7;
        float f8 = M.r.f3293d;
        f2347d = f8;
        f2348e = (f7 - f6) - ((f8 - f6) / 2);
        f2349f = new p096s.v0(100, (InterfaceC0930x) null, 6);
    }

    public static final void a(boolean z5, D4.c cVar, Z.o oVar, boolean z6, B1 b6, p117w.m mVar, C0230o c0230o, int i, int i3) {
        boolean z7;
        int i6;
        B1 b7;
        p117w.m mVar2;
        Z.o oVar2;
        int i7;
        boolean z8;
        B1 b8;
        Z.o oVar3;
        B1 b9;
        p117w.m mVar3;
        Z.o oVar4;
        boolean z9;
        C0230o c0230o2 = c0230o;
        c0230o2.X(1580463220);
        int i8 = i | (c0230o2.g(z5) ? 4 : 2);
        if ((i & 48) == 0) {
            i8 |= c0230o2.h(cVar) ? 32 : 16;
        }
        int i9 = i8 | 3456;
        int i10 = i3 & 16;
        if (i10 != 0) {
            i6 = i8 | 28032;
            z7 = z6;
        } else {
            z7 = z6;
            i6 = i9 | (c0230o2.g(z7) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        }
        int i11 = i6 | 1638400;
        if ((599187 & i11) == 599186 && c0230o2.B()) {
            c0230o2.P();
            oVar4 = oVar;
            b9 = b6;
            mVar3 = mVar;
            z9 = z7;
        } else {
            c0230o2.R();
            int i12 = i & 1;
            N.U u6 = C0222k.f3714a;
            Z.l lVar = Z.l.f5957a;
            if (i12 == 0 || c0230o2.z()) {
                if (i10 != 0) {
                    z7 = true;
                }
                c0230o2.W(435552781);
                D d6 = (D) c0230o2.k(F.f2265a);
                B1 b10 = d6.f2209R;
                if (b10 == null) {
                    float f6 = M.r.f3290a;
                    long jD = F.d(d6, 10);
                    long jD2 = F.d(d6, 26);
                    long j4 = p035g0.r.f9084k;
                    long jD3 = F.d(d6, 11);
                    long jD4 = F.d(d6, 24);
                    long jD5 = F.d(d6, 44);
                    long jD6 = F.d(d6, 24);
                    long jD7 = F.d(d6, 44);
                    long jB = p035g0.r.b(1.0f, F.d(d6, 35));
                    long j6 = d6.f2225p;
                    b7 = new B1(jD, jD2, j4, jD3, jD4, jD5, jD6, jD7, p035g0.H.l(jB, j6), p035g0.H.l(p035g0.r.b(0.12f, F.d(d6, 18)), j6), j4, p035g0.H.l(p035g0.r.b(0.38f, F.d(d6, 18)), j6), p035g0.H.l(p035g0.r.b(0.38f, F.d(d6, 18)), j6), p035g0.H.l(p035g0.r.b(0.12f, F.d(d6, 44)), j6), p035g0.H.l(p035g0.r.b(0.12f, F.d(d6, 18)), j6), p035g0.H.l(p035g0.r.b(0.38f, F.d(d6, 44)), j6));
                    d6.f2209R = b7;
                } else {
                    b7 = b10;
                }
                c0230o2 = c0230o;
                c0230o2.p(false);
                int i13 = i11 & (-458753);
                c0230o2.W(-1221651002);
                Object objK = c0230o2.K();
                if (objK == u6) {
                    objK = new p117w.m();
                    c0230o2.f0(objK);
                }
                c0230o2.p(false);
                mVar2 = (p117w.m) objK;
                oVar2 = lVar;
                i7 = i13;
                z8 = z7;
                b8 = b7;
            } else {
                c0230o2.P();
                int i14 = i11 & (-458753);
                oVar2 = oVar;
                mVar2 = mVar;
                i7 = i14;
                z8 = z7;
                b8 = b6;
            }
            c0230o2.q();
            float f7 = f2347d;
            float f8 = f2345b;
            float f9 = (f7 - f8) / 2;
            N.W0 w6 = AbstractC1124c0.f14367f;
            float fY = ((S0.b) c0230o2.k(w6)).y(f9);
            S0.b bVar = (S0.b) c0230o2.k(w6);
            float f10 = f2348e;
            float fY2 = bVar.y(f10);
            B1 b11 = b8;
            c0230o2.W(-1221650579);
            boolean zC = c0230o2.c(fY) | c0230o2.c(fY2);
            Object objK2 = c0230o2.K();
            if (zC || objK2 == u6) {
                objK2 = new G1(fY2, fY);
                c0230o2.f0(objK2);
            }
            c0230o2.p(false);
            float fFloatValue = ((Number) ((D4.c) objK2).invoke(Boolean.valueOf(z5))).floatValue();
            c0230o2.W(-1221650404);
            Object objK3 = c0230o2.K();
            if (objK3 == u6) {
                objK3 = AbstractC0909d.a(fFloatValue);
                c0230o2.f0(objK3);
            }
            C0907c c0907c = (C0907c) objK3;
            int i15 = i7;
            c0230o2.p(false);
            c0230o2.W(773894976);
            c0230o2.W(-492369756);
            Object objK4 = c0230o2.K();
            if (objK4 == u6) {
                C0245w c0245w = new C0245w(C0208d.y(c0230o2));
                c0230o2.f0(c0245w);
                objK4 = c0245w;
            }
            c0230o2.p(false);
            U4.d dVar = ((C0245w) objK4).f3838h;
            c0230o2.p(false);
            c0230o2.W(-1221650310);
            boolean zH = c0230o2.h(c0907c) | c0230o2.c(fY);
            Object objK5 = c0230o2.K();
            if (zH || objK5 == u6) {
                objK5 = new C1(c0907c, fY);
                c0230o2.f0(objK5);
            }
            c0230o2.p(false);
            C0208d.g((D4.a) objK5, c0230o2);
            Boolean boolValueOf = Boolean.valueOf(z5);
            c0230o2.W(-1221650133);
            boolean zH2 = c0230o2.h(c0907c) | c0230o2.c(fFloatValue) | c0230o2.h(dVar);
            Object objK6 = c0230o2.K();
            if (zH2 || objK6 == u6) {
                objK6 = new C0006d(c0907c, fFloatValue, dVar, 1);
                c0230o2.f0(objK6);
            }
            c0230o2.p(false);
            C0208d.c(boolValueOf, (D4.c) objK6, c0230o2);
            Z.o oVarC = cVar != null ? androidx.compose.foundation.selection.b.c(z5, mVar2, z8, new E0.e(2), cVar) : lVar;
            if (cVar != null) {
                N.W0 w7 = AbstractC0155l0.f2822a;
                oVar3 = MinimumInteractiveModifier.f6679a;
            } else {
                oVar3 = lVar;
            }
            Z.o oVarF = androidx.compose.foundation.layout.c.f(androidx.compose.foundation.layout.c.m(oVar2.k(oVar3).k(oVarC)), f2346c, f7);
            c0230o2.W(733328855);
            C1086t c1086tF = AbstractC1084q.f(Z.b.f5933h, false, c0230o2, 0);
            c0230o2.W(-1323940314);
            int i16 = c0230o2.f3744P;
            InterfaceC0225l0 interfaceC0225l0M = c0230o2.m();
            InterfaceC1102j.f14043g.getClass();
            C1106n c1106n = C1101i.f14038b;
            V.a aVarH = p113v0.U.h(oVarF);
            c0230o2.Z();
            if (c0230o2.f3743O) {
                c0230o2.l(c1106n);
            } else {
                c0230o2.i0();
            }
            C0208d.R(C1101i.f14041e, c0230o2, c1086tF);
            C0208d.R(C1101i.f14040d, c0230o2, interfaceC0225l0M);
            C1100h c1100h = C1101i.f14042f;
            if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i16))) {
                p012c.k.y(i16, c0230o2, i16, c1100h);
            }
            AbstractC0013g0.p(0, aVarH, new N.C0(c0230o2), c0230o2, 2058660585);
            C0919l c0919l = c0907c.f11953c;
            float f11 = M.r.f3290a;
            b(z5, z8, b11, c0919l, mVar2, N0.a(5, c0230o2), f8, f9, f10, c0230o2, ((i15 << 3) & 112) | 6 | ((i15 >> 6) & 896) | 1769472);
            AbstractC0013g0.q(c0230o2, false, true, false, false);
            b9 = b11;
            mVar3 = mVar2;
            oVar4 = oVar2;
            z9 = z8;
        }
        C0235q0 c0235q0T = c0230o2.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new F1(z5, cVar, oVar4, z9, b9, mVar3, i, i3);
        }
    }

    public static final void b(boolean z5, boolean z6, B1 b6, C0919l c0919l, p117w.m mVar, p035g0.M m6, float f6, float f7, float f8, C0230o c0230o, int i) {
        int i3;
        long j4;
        float f9;
        float fFloatValue;
        float f10;
        Z.g gVar;
        long j6;
        long j7;
        float f11;
        androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f6633a;
        c0230o.X(-1968109941);
        if ((i & 6) == 0) {
            i3 = (c0230o.f(bVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c0230o.g(z5) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c0230o.g(z6) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c0230o.f(b6) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c0230o.f(c0919l) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= c0230o.h(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= c0230o.f(mVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= c0230o.f(m6) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= c0230o.c(f6) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= c0230o.c(f7) ? 536870912 : 268435456;
        }
        if ((306783379 & i3) == 306783378 && c0230o.B()) {
            c0230o.P();
        } else {
            if (z6) {
                j4 = z5 ? b6.f2173b : b6.f2177f;
            } else {
                j4 = z5 ? b6.f2180j : b6.f2184n;
            }
            InterfaceC0203a0 interfaceC0203a0Q = p081p0.c.Q(mVar, c0230o, (i3 >> 18) & 14);
            AbstractC0231o0 abstractC0231o0 = AbstractC1124c0.f14367f;
            float fJ0 = ((S0.b) c0230o.k(abstractC0231o0)).j0(((Number) c0919l.i.getValue()).floatValue());
            if (((Boolean) interfaceC0203a0Q.getValue()).booleanValue()) {
                f9 = M.r.f3290a;
            } else {
                f9 = (((fJ0 - f7) / (f8 - f7)) * (f2344a - f6)) + f6;
            }
            c0230o.W(-993794132);
            if (((Boolean) interfaceC0203a0Q.getValue()).booleanValue()) {
                S0.b bVar2 = (S0.b) c0230o.k(abstractC0231o0);
                if (z5) {
                    f11 = f2348e - M.r.f3294e;
                } else {
                    f11 = M.r.f3294e;
                }
                fFloatValue = bVar2.y(f11);
            } else {
                fFloatValue = ((Number) c0919l.i.getValue()).floatValue();
            }
            c0230o.p(false);
            float f12 = M.r.f3290a;
            p035g0.M mA = N0.a(5, c0230o);
            Z.l lVar = Z.l.f5957a;
            Z.g gVar2 = Z.b.f5936l;
            Z.o oVarC = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.c.k(bVar.a(lVar, gVar2), f2346c), f2347d);
            float f13 = M.r.f3294e;
            if (!z6) {
                f10 = f9;
                gVar = gVar2;
                j6 = z5 ? b6.f2181k : b6.f2185o;
            } else if (z5) {
                f10 = f9;
                gVar = gVar2;
                j6 = b6.f2174c;
            } else {
                f10 = f9;
                gVar = gVar2;
                j6 = b6.f2178g;
            }
            Z.o oVarB = androidx.compose.foundation.a.b(p081p0.c.F(oVarC, f13, j6, mA), j4, mA);
            c0230o.W(733328855);
            C1086t c1086tF = AbstractC1084q.f(Z.b.f5933h, false, c0230o, 0);
            c0230o.W(-1323940314);
            int i6 = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
            InterfaceC1102j.f14043g.getClass();
            C1106n c1106n = C1101i.f14038b;
            V.a aVarH = p113v0.U.h(oVarB);
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C1100h c1100h = C1101i.f14041e;
            C0208d.R(c1100h, c0230o, c1086tF);
            C1100h c1100h2 = C1101i.f14040d;
            C0208d.R(c1100h2, c0230o, interfaceC0225l0M);
            C1100h c1100h3 = C1101i.f14042f;
            if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i6))) {
                p012c.k.y(i6, c0230o, i6, c1100h3);
            }
            AbstractC0013g0.p(0, aVarH, new N.C0(c0230o), c0230o, 2058660585);
            if (z6) {
                j7 = z5 ? b6.f2172a : b6.f2176e;
            } else {
                j7 = z5 ? b6.i : b6.f2183m;
            }
            Z.o oVarA = bVar.a(lVar, Z.b.f5935k);
            c0230o.W(1420969929);
            boolean zC = c0230o.c(fFloatValue);
            Object objK = c0230o.K();
            if (zC || objK == C0222k.f3714a) {
                objK = new H1(fFloatValue);
                c0230o.f0(objK);
            }
            c0230o.p(false);
            Z.o oVarB2 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.e(androidx.compose.foundation.d.a(androidx.compose.foundation.layout.a.d(oVarA, (D4.c) objK), mVar, K.s.a(M.r.f3292c / 2, c0230o, 54, 4)), f10), j7, m6);
            c0230o.W(733328855);
            C1086t c1086tF2 = AbstractC1084q.f(gVar, false, c0230o, 6);
            c0230o.W(-1323940314);
            int i7 = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M2 = c0230o.m();
            V.a aVarH2 = p113v0.U.h(oVarB2);
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C0208d.R(c1100h, c0230o, c1086tF2);
            C0208d.R(c1100h2, c0230o, interfaceC0225l0M2);
            if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i7))) {
                p012c.k.y(i7, c0230o, i7, c1100h3);
            }
            AbstractC0013g0.p(0, aVarH2, new N.C0(c0230o), c0230o, 2058660585);
            c0230o.W(1420970455);
            c0230o.p(false);
            c0230o.p(false);
            c0230o.p(true);
            AbstractC0013g0.q(c0230o, false, false, false, true);
            c0230o.p(false);
            c0230o.p(false);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new I1(z5, z6, b6, c0919l, mVar, m6, f6, f7, f8, i);
        }
    }
}
