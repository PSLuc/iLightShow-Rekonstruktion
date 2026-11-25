package L;

import B.AbstractC0013g0;
import B.C0028o;
import B.C0033q0;
import B.C0034r0;
import F.C0074p;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.C0235q0;
import N.C0247x;
import N.InterfaceC0203a0;
import N.InterfaceC0225l0;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import okhttp3.internal.http2.Http2;
import p123x.AbstractC1084q;
import p123x.C1086t;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;
import p130y0.AbstractC1124c0;

/* JADX INFO: loaded from: classes.dex */
public abstract class W1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f2557a = 8;

    public static final void a(String str, D4.c cVar, Z.o oVar, boolean z5, G0.J j4, V.a aVar, C0074p c0074p, C0034r0 c0034r0, C0033q0 c0033q0, int i, int i3, p117w.m mVar, p035g0.M m6, K1 k3, C0230o c0230o, int i6) {
        boolean z6;
        p035g0.M m7;
        int i7;
        C0074p c0074p2;
        C0033q0 c0033q1;
        p117w.m mVar2;
        K1 k6;
        boolean z7;
        int i8;
        G0.J j6;
        C0034r0 c0034r1;
        long j7;
        boolean z8;
        long j8;
        p117w.m mVar3;
        C0034r0 c0034r2;
        C0074p c0074p3;
        int i9;
        int i10;
        C0033q0 c0033q2;
        boolean z9;
        p035g0.M m8;
        G0.J j9;
        K1 k7;
        c0230o.X(-676242365);
        int i11 = i6 | (c0230o.f(str) ? 4 : 2);
        if ((i6 & 48) == 0) {
            i11 |= c0230o.h(cVar) ? 32 : 16;
        }
        if (((i11 | 918645760) & 306783379) == 306783378 && c0230o.B()) {
            c0230o.P();
            z9 = z5;
            j9 = j4;
            c0074p3 = c0074p;
            c0034r2 = c0034r0;
            c0033q2 = c0033q0;
            i10 = i;
            i9 = i3;
            mVar3 = mVar;
            m8 = m6;
            k7 = k3;
        } else {
            c0230o.R();
            if ((i6 & 1) == 0 || c0230o.z()) {
                G0.J j10 = (G0.J) c0230o.k(e2.f2713a);
                C0074p c0074p4 = M0.D.f3394a;
                C0034r0 c0034r3 = C0034r0.f406a;
                C0033q0 c0033q3 = C0033q0.f404a;
                c0230o.W(-1263331754);
                Object objK = c0230o.K();
                if (objK == C0222k.f3714a) {
                    objK = new p117w.m();
                    c0230o.f0(objK);
                }
                p117w.m mVar4 = (p117w.m) objK;
                c0230o.p(false);
                P1 p6 = P1.f2454a;
                c0230o.W(-1941327459);
                p035g0.M mA = N0.a(4, c0230o);
                c0230o.p(false);
                c0230o.W(831731228);
                D d6 = (D) c0230o.k(F.f2265a);
                c0230o.W(1341970309);
                K1 k8 = d6.f2210S;
                if (k8 == null) {
                    K1 k9 = new K1(F.d(d6, 18), F.d(d6, 18), p035g0.r.b(0.38f, F.d(d6, 18)), F.d(d6, 18), F.d(d6, 44), F.d(d6, 44), F.d(d6, 44), F.d(d6, 44), F.d(d6, 26), F.d(d6, 2), (F.Y) c0230o.k(F.Z.f1154a), F.d(d6, 26), F.d(d6, 19), p035g0.r.b(0.38f, F.d(d6, 18)), F.d(d6, 2), F.d(d6, 19), F.d(d6, 19), p035g0.r.b(0.38f, F.d(d6, 18)), F.d(d6, 19), F.d(d6, 19), F.d(d6, 19), p035g0.r.b(0.38f, F.d(d6, 18)), F.d(d6, 2), F.d(d6, 26), F.d(d6, 19), p035g0.r.b(0.38f, F.d(d6, 18)), F.d(d6, 2), F.d(d6, 19), F.d(d6, 19), p035g0.r.b(0.38f, F.d(d6, 18)), F.d(d6, 19), F.d(d6, 19), F.d(d6, 19), p035g0.r.b(0.38f, F.d(d6, 18)), F.d(d6, 2), F.d(d6, 19), F.d(d6, 19), p035g0.r.b(0.38f, F.d(d6, 19)), F.d(d6, 19), F.d(d6, 19), F.d(d6, 19), p035g0.r.b(0.38f, F.d(d6, 19)), F.d(d6, 19));
                    d6.f2210S = k9;
                    k8 = k9;
                    z6 = false;
                } else {
                    z6 = false;
                }
                c0230o.p(z6);
                c0230o.p(z6);
                m7 = mA;
                i7 = Integer.MAX_VALUE;
                c0074p2 = c0074p4;
                c0033q1 = c0033q3;
                mVar2 = mVar4;
                k6 = k8;
                z7 = true;
                i8 = 1;
                j6 = j10;
                c0034r1 = c0034r3;
            } else {
                c0230o.P();
                z7 = z5;
                j6 = j4;
                c0074p2 = c0074p;
                c0034r1 = c0034r0;
                c0033q1 = c0033q0;
                i7 = i;
                i8 = i3;
                mVar2 = mVar;
                m7 = m6;
                k6 = k3;
            }
            c0230o.q();
            c0230o.W(-1263331489);
            long jB = j6.b();
            if (jB != p035g0.r.f9085l) {
                j8 = jB;
                z8 = false;
            } else {
                k6.getClass();
                c0230o.W(68412911);
                InterfaceC0203a0 interfaceC0203a0Q = p027e3.a.Q(mVar2, c0230o, 6);
                if (z7) {
                    j7 = ((Boolean) interfaceC0203a0Q.getValue()).booleanValue() ? k6.f2369a : k6.f2370b;
                } else {
                    j7 = k6.f2371c;
                }
                InterfaceC0203a0 interfaceC0203a0N = C0208d.N(new p035g0.r(j7), c0230o);
                z8 = false;
                c0230o.p(false);
                j8 = ((p035g0.r) interfaceC0203a0N.getValue()).f9087a;
            }
            c0230o.p(z8);
            G0.J jD = j6.d(new G0.J(j8, 0L, null, 0L, 0, 0L, 16777214));
            C0247x c0247x = F.Z.f1154a;
            k6.getClass();
            c0230o.W(997785083);
            c0230o.p(false);
            mVar3 = mVar2;
            C0208d.a(c0247x.a(k6.f2378k), V.b.b(c0230o, 1859145987, new C0028o(oVar, k6, str, cVar, z7, jD, c0034r1, c0033q1, i7, i8, c0074p2, mVar3, aVar, m7)), c0230o, 56);
            C0033q0 c0033q4 = c0033q1;
            c0034r2 = c0034r1;
            c0074p3 = c0074p2;
            i9 = i8;
            i10 = i7;
            c0033q2 = c0033q4;
            z9 = z7;
            m8 = m7;
            j9 = j6;
            k7 = k6;
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new V0(str, cVar, oVar, z9, j9, aVar, c0074p3, c0034r2, c0033q2, i10, i9, mVar3, m8, k7, i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v29 */
    public static final void b(D4.e eVar, V.a aVar, V.a aVar2, V.a aVar3, V.a aVar4, V.a aVar5, V.a aVar6, float f6, V.a aVar7, V.a aVar8, p123x.O o6, C0230o c0230o, int i) {
        int i3;
        boolean z5;
        boolean z6;
        V.a aVar9;
        boolean z7;
        V.a aVar10;
        float f7;
        boolean z8;
        float f8;
        ?? r12;
        V.a aVar11;
        D4.e eVar2;
        boolean z9;
        boolean z10;
        V.a aVar12 = aVar8;
        Z.l lVar = Z.l.f5957a;
        c0230o.X(-1830307184);
        if ((i & 6) == 0) {
            i3 = (c0230o.f(lVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c0230o.h(eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c0230o.h(aVar) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c0230o.h(aVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c0230o.h(aVar3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= c0230o.h(aVar4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= c0230o.h(aVar5) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= c0230o.h(aVar6) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= c0230o.g(false) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= c0230o.c(f6) ? 536870912 : 268435456;
        }
        int i6 = 6 | (c0230o.h(aVar12) ? 32 : 16) | (c0230o.f(o6) ? HueLog.LogComponent.STREAMDTLS : 128);
        if ((i3 & 306783379) == 306783378 && (i6 & 147) == 146 && c0230o.B()) {
            c0230o.P();
            eVar2 = eVar;
            aVar11 = aVar2;
            aVar9 = aVar5;
            f8 = f6;
        } else {
            c0230o.W(243139239);
            boolean z11 = ((234881024 & i3) == 67108864) | ((1879048192 & i3) == 536870912) | ((i6 & 896) == 256);
            Object objK = c0230o.K();
            if (z11 || objK == C0222k.f3714a) {
                objK = new Y1(f6, o6);
                c0230o.f0(objK);
            }
            Y1 y2 = (Y1) objK;
            c0230o.p(false);
            S0.k kVar = (S0.k) c0230o.k(AbstractC1124c0.f14372l);
            int i7 = i3;
            c0230o.W(-1323940314);
            int i8 = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
            InterfaceC1102j.f14043g.getClass();
            C1106n c1106n = C1101i.f14038b;
            V.a aVarH = p113v0.U.h(lVar);
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C1100h c1100h = C1101i.f14041e;
            C0208d.R(c1100h, c0230o, y2);
            C1100h c1100h2 = C1101i.f14040d;
            C0208d.R(c1100h2, c0230o, interfaceC0225l0M);
            C1100h c1100h3 = C1101i.f14042f;
            if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i8))) {
                p012c.k.y(i8, c0230o, i8, c1100h3);
            }
            AbstractC0013g0.p(0, aVarH, new N.C0(c0230o), c0230o, 2058660585);
            aVar7.d(c0230o, 6);
            c0230o.W(-95271705);
            Z.g gVar = Z.b.f5936l;
            if (aVar3 != null) {
                Z.o oVarK = androidx.compose.ui.layout.a.c(lVar, "Leading").k(S1.i);
                c0230o.W(733328855);
                C1086t c1086tF = AbstractC1084q.f(gVar, false, c0230o, 6);
                c0230o.W(-1323940314);
                int i9 = c0230o.f3744P;
                InterfaceC0225l0 interfaceC0225l0M2 = c0230o.m();
                V.a aVarH2 = p113v0.U.h(oVarK);
                c0230o.Z();
                if (c0230o.f3743O) {
                    c0230o.l(c1106n);
                } else {
                    c0230o.i0();
                }
                C0208d.R(c1100h, c0230o, c1086tF);
                C0208d.R(c1100h2, c0230o, interfaceC0225l0M2);
                if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i9))) {
                    p012c.k.y(i9, c0230o, i9, c1100h3);
                }
                z5 = false;
                AbstractC0013g0.p(0, aVarH2, new N.C0(c0230o), c0230o, 2058660585);
                aVar3.d(c0230o, Integer.valueOf((i7 >> 12) & 14));
                c0230o.p(false);
                c0230o.p(true);
                c0230o.p(false);
                c0230o.p(false);
            } else {
                z5 = false;
            }
            c0230o.p(z5);
            c0230o.W(-95271370);
            if (aVar4 != null) {
                Z.o oVarK2 = androidx.compose.ui.layout.a.c(lVar, "Trailing").k(S1.i);
                c0230o.W(733328855);
                C1086t c1086tF2 = AbstractC1084q.f(gVar, false, c0230o, 6);
                c0230o.W(-1323940314);
                int i10 = c0230o.f3744P;
                InterfaceC0225l0 interfaceC0225l0M3 = c0230o.m();
                V.a aVarH3 = p113v0.U.h(oVarK2);
                c0230o.Z();
                if (c0230o.f3743O) {
                    c0230o.l(c1106n);
                } else {
                    c0230o.i0();
                }
                C0208d.R(c1100h, c0230o, c1086tF2);
                C0208d.R(c1100h2, c0230o, interfaceC0225l0M3);
                if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i10))) {
                    p012c.k.y(i10, c0230o, i10, c1100h3);
                }
                z6 = false;
                AbstractC0013g0.p(0, aVarH3, new N.C0(c0230o), c0230o, 2058660585);
                aVar4.d(c0230o, Integer.valueOf((i7 >> 15) & 14));
                c0230o.p(false);
                c0230o.p(true);
                c0230o.p(false);
                c0230o.p(false);
            } else {
                z6 = false;
            }
            c0230o.p(z6);
            float fB = kVar == S0.k.f4897h ? o6.b(kVar) : o6.c(kVar);
            float fC = kVar == S0.k.f4897h ? o6.c(kVar) : o6.b(kVar);
            if (aVar3 != null) {
                fB -= S1.f2490c;
                float f9 = 0;
                if (fB < f9) {
                    fB = f9;
                }
            }
            float f10 = fB;
            if (aVar4 != null) {
                fC -= S1.f2490c;
                float f11 = 0;
                if (fC < f11) {
                    fC = f11;
                }
            }
            c0230o.W(-95270430);
            Z.g gVar2 = Z.b.f5933h;
            if (aVar5 != null) {
                Z.o oVarK3 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.l(androidx.compose.foundation.layout.c.d(androidx.compose.ui.layout.a.c(lVar, "Prefix"), S1.f2493f, Float.NaN)), f10, 0.0f, S1.f2492e, 0.0f, 10);
                c0230o.W(733328855);
                C1086t c1086tF3 = AbstractC1084q.f(gVar2, false, c0230o, 0);
                c0230o.W(-1323940314);
                int i11 = c0230o.f3744P;
                InterfaceC0225l0 interfaceC0225l0M4 = c0230o.m();
                V.a aVarH4 = p113v0.U.h(oVarK3);
                c0230o.Z();
                if (c0230o.f3743O) {
                    c0230o.l(c1106n);
                } else {
                    c0230o.i0();
                }
                C0208d.R(c1100h, c0230o, c1086tF3);
                C0208d.R(c1100h2, c0230o, interfaceC0225l0M4);
                if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i11))) {
                    p012c.k.y(i11, c0230o, i11, c1100h3);
                }
                z7 = false;
                AbstractC0013g0.p(0, aVarH4, new N.C0(c0230o), c0230o, 2058660585);
                aVar9 = aVar5;
                aVar9.d(c0230o, Integer.valueOf((i7 >> 18) & 14));
                c0230o.p(false);
                c0230o.p(true);
                c0230o.p(false);
                c0230o.p(false);
            } else {
                aVar9 = aVar5;
                z7 = false;
            }
            c0230o.p(z7);
            c0230o.W(-95270031);
            if (aVar6 != null) {
                float f12 = fC;
                Z.o oVarK4 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.l(androidx.compose.foundation.layout.c.d(androidx.compose.ui.layout.a.c(lVar, "Suffix"), S1.f2493f, Float.NaN)), S1.f2492e, 0.0f, f12, 0.0f, 10);
                f7 = f12;
                c0230o.W(733328855);
                C1086t c1086tF4 = AbstractC1084q.f(gVar2, false, c0230o, 0);
                c0230o.W(-1323940314);
                int i12 = c0230o.f3744P;
                InterfaceC0225l0 interfaceC0225l0M5 = c0230o.m();
                V.a aVarH5 = p113v0.U.h(oVarK4);
                c0230o.Z();
                if (c0230o.f3743O) {
                    c0230o.l(c1106n);
                } else {
                    c0230o.i0();
                }
                C0208d.R(c1100h, c0230o, c1086tF4);
                C0208d.R(c1100h2, c0230o, interfaceC0225l0M5);
                if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i12))) {
                    p012c.k.y(i12, c0230o, i12, c1100h3);
                }
                z8 = false;
                AbstractC0013g0.p(0, aVarH5, new N.C0(c0230o), c0230o, 2058660585);
                aVar10 = aVar6;
                aVar10.d(c0230o, Integer.valueOf((i7 >> 21) & 14));
                c0230o.p(false);
                c0230o.p(true);
                c0230o.p(false);
                c0230o.p(false);
            } else {
                aVar10 = aVar6;
                f7 = fC;
                z8 = false;
            }
            c0230o.p(z8);
            c0230o.W(-95269633);
            if (aVar != null) {
                f8 = f6;
                Z.o oVarK5 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.l(androidx.compose.foundation.layout.c.d(androidx.compose.ui.layout.a.c(lVar, "Label"), S1.V.G(S1.f2493f, S1.f2494g, f8), Float.NaN)), f10, 0.0f, f7, 0.0f, 10);
                c0230o.W(733328855);
                C1086t c1086tF5 = AbstractC1084q.f(gVar2, false, c0230o, 0);
                c0230o.W(-1323940314);
                int i13 = c0230o.f3744P;
                InterfaceC0225l0 interfaceC0225l0M6 = c0230o.m();
                V.a aVarH6 = p113v0.U.h(oVarK5);
                c0230o.Z();
                if (c0230o.f3743O) {
                    c0230o.l(c1106n);
                } else {
                    c0230o.i0();
                }
                C0208d.R(c1100h, c0230o, c1086tF5);
                C0208d.R(c1100h2, c0230o, interfaceC0225l0M6);
                if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i13))) {
                    p012c.k.y(i13, c0230o, i13, c1100h3);
                }
                r12 = 0;
                AbstractC0013g0.p(0, aVarH6, new N.C0(c0230o), c0230o, 2058660585);
                aVar.d(c0230o, Integer.valueOf((i7 >> 6) & 14));
                c0230o.p(false);
                c0230o.p(true);
                c0230o.p(false);
                c0230o.p(false);
            } else {
                f8 = f6;
                r12 = 0;
            }
            c0230o.p(r12);
            Z.o oVarK6 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.l(androidx.compose.foundation.layout.c.d(lVar, S1.f2493f, Float.NaN)), aVar9 == null ? f10 : (float) r12, 0.0f, aVar10 == null ? f7 : (float) r12, 0.0f, 10);
            c0230o.W(-95268909);
            if (aVar2 != null) {
                aVar11 = aVar2;
                aVar11.c(androidx.compose.ui.layout.a.c(lVar, "Hint").k(oVarK6), c0230o, Integer.valueOf((i7 >> 6) & 112));
            } else {
                aVar11 = aVar2;
            }
            c0230o.p(false);
            Z.o oVarK7 = androidx.compose.ui.layout.a.c(lVar, "TextField").k(oVarK6);
            c0230o.W(733328855);
            C1086t c1086tF6 = AbstractC1084q.f(gVar2, true, c0230o, 48);
            c0230o.W(-1323940314);
            int i14 = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M7 = c0230o.m();
            V.a aVarH7 = p113v0.U.h(oVarK7);
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C0208d.R(c1100h, c0230o, c1086tF6);
            C0208d.R(c1100h2, c0230o, interfaceC0225l0M7);
            if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i14))) {
                p012c.k.y(i14, c0230o, i14, c1100h3);
            }
            AbstractC0013g0.p(0, aVarH7, new N.C0(c0230o), c0230o, 2058660585);
            eVar2 = eVar;
            eVar2.d(c0230o, Integer.valueOf((i7 >> 3) & 14));
            c0230o.p(false);
            c0230o.p(true);
            c0230o.p(false);
            c0230o.p(false);
            c0230o.W(243142996);
            if (aVar8 != null) {
                Z.o oVarF = androidx.compose.foundation.layout.a.f(androidx.compose.foundation.layout.c.l(androidx.compose.foundation.layout.c.d(androidx.compose.ui.layout.a.c(lVar, "Supporting"), S1.f2495h, Float.NaN)), P1.c());
                c0230o.W(733328855);
                C1086t c1086tF7 = AbstractC1084q.f(gVar2, false, c0230o, 0);
                c0230o.W(-1323940314);
                int i15 = c0230o.f3744P;
                InterfaceC0225l0 interfaceC0225l0M8 = c0230o.m();
                V.a aVarH8 = p113v0.U.h(oVarF);
                c0230o.Z();
                if (c0230o.f3743O) {
                    c0230o.l(c1106n);
                } else {
                    c0230o.i0();
                }
                C0208d.R(c1100h, c0230o, c1086tF7);
                C0208d.R(c1100h2, c0230o, interfaceC0225l0M8);
                if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i15))) {
                    p012c.k.y(i15, c0230o, i15, c1100h3);
                }
                z10 = false;
                AbstractC0013g0.p(0, aVarH8, new N.C0(c0230o), c0230o, 2058660585);
                aVar12 = aVar8;
                aVar12.d(c0230o, Integer.valueOf((i6 >> 3) & 14));
                c0230o.p(false);
                z9 = true;
                c0230o.p(true);
                c0230o.p(false);
                c0230o.p(false);
            } else {
                aVar12 = aVar8;
                z9 = true;
                z10 = false;
            }
            AbstractC0013g0.q(c0230o, z10, z10, z9, z10);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new U1(eVar2, aVar, aVar11, aVar3, aVar4, aVar9, aVar6, f8, aVar7, aVar12, o6, i);
        }
    }

    public static final int c(int i, int i3, int i6, int i7, int i8, int i9, int i10, int i11, float f6, long j4, float f7, p123x.O o6) {
        boolean z5 = i3 > 0;
        float fG = (o6.f13711d + o6.f13709b) * f7;
        if (z5) {
            fG = S1.V.G(S1.f2489b * 2 * f7, fG, f6);
        }
        int[] iArr = {i10, i8, i9, S1.V.H(f6, i3, 0)};
        for (int i12 = 0; i12 < 4; i12++) {
            i = Math.max(i, iArr[i12]);
        }
        return Math.max(S0.a.i(j4), Math.max(i6, Math.max(i7, G4.a.D(fG + S1.V.H(f6, 0, i3) + i))) + i11);
    }
}
