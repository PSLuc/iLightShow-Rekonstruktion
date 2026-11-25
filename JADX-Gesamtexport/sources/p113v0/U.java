package p113v0;

import B.Z0;
import B.d1;
import D4.e;
import E4.k;
import N.C0208d;
import N.C0222k;
import N.C0226m;
import N.C0230o;
import N.C0235q0;
import N.InterfaceC0225l0;
import S1.h0;
import Z.a;
import Z.l;
import Z.o;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import p030f0.d;
import p030f0.f;
import p058l0.I;
import p081p0.c;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.D;
import p124x0.InterfaceC1102j;
import p124x0.N;
import p124x0.Y;

/* JADX INFO: loaded from: classes.dex */
public abstract class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1025h f13151a = new C1025h(2);

    public static final long a(float f6, float f7) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
        int i = S.f13147b;
        return jFloatToRawIntBits;
    }

    public static final void b(o oVar, e eVar, C0230o c0230o, int i, int i3) {
        int i6;
        c0230o.X(-1298353104);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i6 = i | 6;
        } else if ((i & 6) == 0) {
            i6 = (c0230o.f(oVar) ? 4 : 2) | i;
        } else {
            i6 = i;
        }
        if ((i & 48) == 0) {
            i6 |= c0230o.h(eVar) ? 32 : 16;
        }
        if ((i6 & 19) == 18 && c0230o.B()) {
            c0230o.P();
        } else {
            if (i7 != 0) {
                oVar = l.f5957a;
            }
            Object objK = c0230o.K();
            if (objK == C0222k.f3714a) {
                objK = new X();
                c0230o.f0(objK);
            }
            c((X) objK, oVar, eVar, c0230o, (i6 << 3) & 1008);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new T(oVar, eVar, i, i3);
        }
    }

    public static final void c(X x6, o oVar, e eVar, C0230o c0230o, int i) {
        int i3;
        c0230o.X(-511989831);
        if ((i & 6) == 0) {
            i3 = (c0230o.h(x6) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c0230o.f(oVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c0230o.h(eVar) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i3 & 147) == 146 && c0230o.B()) {
            c0230o.P();
        } else {
            int i6 = c0230o.f3744P;
            C0226m c0226mM = C0208d.M(c0230o);
            o oVarC = a.c(c0230o, oVar);
            InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
            C1106n c1106n = C1106n.f14047j;
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C0208d.R(x6.f13154b, c0230o, x6);
            C0208d.R(x6.f13155c, c0230o, c0226mM);
            C0208d.R(x6.f13156d, c0230o, eVar);
            InterfaceC1102j.f14043g.getClass();
            C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M);
            C0208d.R(C1101i.f14039c, c0230o, oVarC);
            C1100h c1100h = C1101i.f14042f;
            if (c0230o.f3743O || !k.a(c0230o.K(), Integer.valueOf(i6))) {
                p012c.k.y(i6, c0230o, i6, c1100h);
            }
            c0230o.p(true);
            if (c0230o.B()) {
                c0230o.V(-26502501);
                c0230o.p(false);
            } else {
                c0230o.V(-26580342);
                boolean zH = c0230o.h(x6);
                Object objK = c0230o.K();
                if (zH || objK == C0222k.f3714a) {
                    objK = new I(9, x6);
                    c0230o.f0(objK);
                }
                C0208d.g((D4.a) objK, c0230o);
                c0230o.p(false);
            }
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new d1(x6, oVar, eVar, i, 7);
        }
    }

    public static final d d(InterfaceC1033p interfaceC1033p) {
        InterfaceC1033p interfaceC1033pJ = interfaceC1033p.j();
        return interfaceC1033pJ != null ? interfaceC1033pJ.o(interfaceC1033p, true) : new d(0.0f, 0.0f, (int) (interfaceC1033p.P() >> 32), (int) (interfaceC1033p.P() & 4294967295L));
    }

    public static final d e(InterfaceC1033p interfaceC1033p) {
        InterfaceC1033p interfaceC1033pF = f(interfaceC1033p);
        float fP = (int) (interfaceC1033pF.P() >> 32);
        float fP2 = (int) (interfaceC1033pF.P() & 4294967295L);
        d dVarO = f(interfaceC1033p).o(interfaceC1033p, true);
        float f6 = dVarO.f8839a;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f6 > fP) {
            f6 = fP;
        }
        float f7 = dVarO.f8840b;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > fP2) {
            f7 = fP2;
        }
        float f8 = dVarO.f8841c;
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        if (f8 <= fP) {
            fP = f8;
        }
        float f9 = dVarO.f8842d;
        float f10 = f9 >= 0.0f ? f9 : 0.0f;
        if (f10 <= fP2) {
            fP2 = f10;
        }
        if (f6 == fP || f7 == fP2) {
            return d.f8838e;
        }
        long jH = interfaceC1033pF.h(c.y(f6, f7));
        long jH2 = interfaceC1033pF.h(c.y(fP, f7));
        long jH3 = interfaceC1033pF.h(c.y(fP, fP2));
        long jH4 = interfaceC1033pF.h(c.y(f6, fP2));
        float fD = p030f0.c.d(jH);
        float fD2 = p030f0.c.d(jH2);
        float fD3 = p030f0.c.d(jH4);
        float fD4 = p030f0.c.d(jH3);
        float fMin = Math.min(fD, Math.min(fD2, Math.min(fD3, fD4)));
        float fMax = Math.max(fD, Math.max(fD2, Math.max(fD3, fD4)));
        float fE = p030f0.c.e(jH);
        float fE2 = p030f0.c.e(jH2);
        float fE3 = p030f0.c.e(jH4);
        float fE4 = p030f0.c.e(jH3);
        return new d(fMin, Math.min(fE, Math.min(fE2, Math.min(fE3, fE4))), fMax, Math.max(fE, Math.max(fE2, Math.max(fE3, fE4))));
    }

    public static final InterfaceC1033p f(InterfaceC1033p interfaceC1033p) {
        InterfaceC1033p interfaceC1033p2;
        InterfaceC1033p interfaceC1033pJ = interfaceC1033p.j();
        while (true) {
            InterfaceC1033p interfaceC1033p3 = interfaceC1033pJ;
            interfaceC1033p2 = interfaceC1033p;
            interfaceC1033p = interfaceC1033p3;
            if (interfaceC1033p == null) {
                break;
            }
            interfaceC1033pJ = interfaceC1033p.j();
        }
        Y y2 = interfaceC1033p2 instanceof Y ? (Y) interfaceC1033p2 : null;
        if (y2 == null) {
            return interfaceC1033p2;
        }
        Y y6 = y2.f13991u;
        while (true) {
            Y y7 = y6;
            Y y8 = y2;
            y2 = y7;
            if (y2 == null) {
                return y8;
            }
            y6 = y2.f13991u;
        }
    }

    public static final N g(N n6) {
        D d6 = n6.f13939s.f13989s;
        while (true) {
            D dR = d6.r();
            D d7 = null;
            if ((dR != null ? dR.f13836j : null) == null) {
                N nK0 = ((Y) d6.f13828C.f3794d).K0();
                k.c(nK0);
                return nK0;
            }
            D dR2 = d6.r();
            if (dR2 != null) {
                d7 = dR2.f13836j;
            }
            k.c(d7);
            D dR3 = d6.r();
            k.c(dR3);
            d6 = dR3.f13836j;
            k.c(d6);
        }
    }

    public static final V.a h(o oVar) {
        return new V.a(-1586257396, new Z0(5, oVar), true);
    }

    public static final long i(long j4, long j6) {
        float fD = f.d(j4);
        long j7 = S.f13146a;
        if (j6 == j7) {
            p027e3.a.y0("ScaleFactor is unspecified");
            throw null;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) * fD;
        float fB = f.b(j4);
        if (j6 != j7) {
            return h0.f(fIntBitsToFloat, Float.intBitsToFloat((int) (j6 & 4294967295L)) * fB);
        }
        p027e3.a.y0("ScaleFactor is unspecified");
        throw null;
    }
}
