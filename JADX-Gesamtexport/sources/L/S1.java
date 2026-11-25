package L;

import B.C0000a;
import F.C0074p;
import G0.C0110f;
import N.C0222k;
import N.C0230o;
import N.C0235q0;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import p113v0.C1034q;

/* JADX INFO: loaded from: classes.dex */
public abstract class S1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f2489b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f2494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f2495h;
    public static final Z.o i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f2488a = p081p0.c.t(0, 0, 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f2490c = 12;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f2491d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f2492e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f2493f = 24;

    static {
        float f6 = 16;
        f2489b = f6;
        f2494g = f6;
        f2495h = f6;
        float f7 = 48;
        i = androidx.compose.foundation.layout.c.a(Z.l.f5957a, f7, f7);
    }

    public static final void a(String str, D4.e eVar, C0074p c0074p, V.a aVar, boolean z5, p117w.m mVar, p123x.O o6, K1 k3, V.a aVar2, C0230o c0230o, int i3, int i6) {
        int i7;
        Object obj;
        int i8;
        p123x.O o7;
        EnumC0152k0 enumC0152k0;
        boolean z6;
        boolean z7;
        b2 b2Var = b2.f2636h;
        c0230o.X(-947035500);
        if ((i3 & 6) == 0) {
            i7 = (c0230o.f(b2Var) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= c0230o.f(str) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i7 |= c0230o.h(eVar) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i3 & 3072) == 0) {
            obj = c0074p;
            i7 |= c0230o.f(obj) ? 2048 : 1024;
        } else {
            obj = c0074p;
        }
        if ((i3 & 24576) == 0) {
            i7 |= c0230o.h(aVar) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i7 |= c0230o.h(null) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i7 |= c0230o.h(null) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i7 |= c0230o.h(null) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i7 |= c0230o.h(null) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i7 |= c0230o.h(null) ? 536870912 : 268435456;
        }
        if ((i6 & 6) == 0) {
            i8 = i6 | (c0230o.h(null) ? 4 : 2);
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= c0230o.g(false) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i8 |= c0230o.g(z5) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i6 & 3072) == 0) {
            i8 |= c0230o.g(false) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i8 |= c0230o.f(mVar) ? 16384 : 8192;
        }
        if ((i6 & 196608) == 0) {
            o7 = o6;
            i8 |= c0230o.f(o7) ? 131072 : 65536;
        } else {
            o7 = o6;
        }
        if ((i6 & 1572864) == 0) {
            i8 |= c0230o.f(k3) ? 1048576 : 524288;
        }
        if ((i6 & 12582912) == 0) {
            i8 |= c0230o.h(aVar2) ? 8388608 : 4194304;
        }
        if ((i7 & 306783379) == 306783378 && (i8 & 4793491) == 4793490 && c0230o.B()) {
            c0230o.P();
        } else {
            c0230o.W(-646389284);
            boolean z8 = ((i7 & 7168) == 2048) | ((i7 & 112) == 32);
            Object objK = c0230o.K();
            if (z8 || objK == C0222k.f3714a) {
                C0110f c0110f = new C0110f(str, null, 6);
                obj.getClass();
                objK = new M0.C(c0110f, M0.p.f3438a);
                c0230o.f0(objK);
            }
            c0230o.p(false);
            String str2 = ((M0.C) objK).f3392a.f1494h;
            if (((Boolean) p027e3.a.Q(mVar, c0230o, (i8 >> 12) & 14).getValue()).booleanValue()) {
                enumC0152k0 = EnumC0152k0.f2809h;
            } else {
                enumC0152k0 = str2.length() == 0 ? EnumC0152k0.i : EnumC0152k0.f2810j;
            }
            B.V0 v6 = new B.V0(k3, z5, mVar, 1);
            N.W0 w6 = h2.f2777a;
            g2 g2Var = (g2) c0230o.k(w6);
            G0.J j4 = g2Var.f2754j;
            long jB = j4.b();
            long j6 = p035g0.r.f9085l;
            boolean zC = p035g0.r.c(jB, j6);
            G0.J j7 = g2Var.f2756l;
            boolean z9 = (zC && !p035g0.r.c(j7.b(), j6)) || (!p035g0.r.c(j4.b(), j6) && p035g0.r.c(j7.b(), j6));
            U0 u0 = U0.f2513b;
            c0230o.W(-646388325);
            long jB2 = ((g2) c0230o.k(w6)).f2756l.b();
            c0230o.W(-646388264);
            if (z9 && jB2 == j6) {
                z6 = false;
                jB2 = ((p035g0.r) v6.c(enumC0152k0, c0230o, 0)).f9087a;
            } else {
                z6 = false;
            }
            boolean z10 = z6;
            c0230o.p(z10);
            c0230o.p(z10);
            c0230o.W(-646388132);
            long jB3 = ((g2) c0230o.k(w6)).f2754j.b();
            c0230o.W(-646388071);
            if (z9 == 0 || jB3 != j6) {
                z7 = false;
            } else {
                z7 = false;
                jB3 = ((p035g0.r) v6.c(enumC0152k0, c0230o, 0)).f9087a;
            }
            long j8 = jB3;
            c0230o.p(z7);
            c0230o.p(z7);
            u0.d(enumC0152k0, jB2, j8, v6, aVar != null ? true : z7, V.b.b(c0230o, 1290853831, new R1(aVar, k3, z5, mVar, str2, eVar, o7, z9, j4, j7, aVar2)), c0230o, 1769472);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0192y(str, eVar, c0074p, aVar, z5, mVar, o6, k3, aVar2, i3, i6);
        }
    }

    public static final void b(long j4, G0.J j6, D4.e eVar, C0230o c0230o, int i3, int i6) {
        int i7;
        long j7;
        C0230o c0230o2;
        D4.e eVar2;
        G0.J j8;
        c0230o.X(-1520066345);
        int i8 = (c0230o.e(j4) ? 4 : 2) | i3;
        int i9 = i6 & 2;
        if (i9 != 0) {
            i7 = i8 | 48;
        } else {
            i7 = i8 | (c0230o.f(j6) ? 32 : 16);
        }
        int i10 = i7 | (c0230o.h(eVar) ? HueLog.LogComponent.STREAMDTLS : 128);
        if ((i10 & 147) == 146 && c0230o.B()) {
            c0230o.P();
            j7 = j4;
            c0230o2 = c0230o;
            eVar2 = eVar;
            j8 = j6;
        } else {
            if (i9 != 0) {
                j6 = null;
            }
            G0.J j9 = j6;
            V.a aVarB = V.b.b(c0230o, 1449369305, new C0000a(1, j4, eVar));
            if (j9 != null) {
                c0230o.W(1830467586);
                j7 = j4;
                c0230o2 = c0230o;
                L.f(j7, j9, eVar, c0230o2, i10 & 1022);
                eVar2 = eVar;
                c0230o2.p(false);
            } else {
                j7 = j4;
                c0230o2 = c0230o;
                eVar2 = eVar;
                c0230o2.W(1830467667);
                aVarB.d(c0230o2, 6);
                c0230o2.p(false);
            }
            j8 = j9;
        }
        C0235q0 c0235q0T = c0230o2.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0181u0(j7, j8, eVar2, i3, i6);
        }
    }

    public static final Object c(p113v0.E e6) {
        Object objI = e6.i();
        C1034q c1034q = objI instanceof C1034q ? (C1034q) objI : null;
        if (c1034q != null) {
            return c1034q.f13178u;
        }
        return null;
    }
}
