package L;

import N.C0208d;
import N.C0217h0;
import N.C0222k;
import N.C0230o;
import N.C0235q0;
import androidx.compose.foundation.layout.FillElement;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.internal.http2.Http2;
import p096s.AbstractC0909d;
import p096s.InterfaceC0932z;
import p123x.AbstractC1070c;

/* JADX INFO: loaded from: classes.dex */
public final class U0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U0 f2512a = new U0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U0 f2513b = new U0();

    public static final void e(p044i0.d dVar, float[] fArr, float f6, float f7, long j4, long j6, long j7, long j8) {
        boolean z5 = dVar.getLayoutDirection() == S0.k.i;
        long jY = p081p0.c.y(0.0f, p030f0.c.e(dVar.N()));
        long jY2 = p081p0.c.y(p030f0.f.d(dVar.f()), p030f0.c.e(dVar.N()));
        long j9 = jY;
        long j10 = z5 ? jY2 : j9;
        if (!z5) {
            j9 = jY2;
        }
        float fY = dVar.y(AbstractC0176s1.f2912d);
        float fY2 = dVar.y(AbstractC0176s1.f2913e);
        dVar.L(j4, j10, j9, fY2, (480 & 16) != 0 ? 0 : 1);
        long j11 = j10;
        long j12 = j9;
        dVar.L(j6, p081p0.c.y(((p030f0.c.d(j12) - p030f0.c.d(j11)) * f6) + p030f0.c.d(j11), p030f0.c.e(dVar.N())), p081p0.c.y(((p030f0.c.d(j12) - p030f0.c.d(j11)) * f7) + p030f0.c.d(j11), p030f0.c.e(dVar.N())), fY2, (480 & 16) != 0 ? 0 : 1);
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            float f8 = fArr[i];
            p044i0.d.c0(dVar, (f8 > f7 || f8 < f6) ? j7 : j8, fY / 2.0f, p081p0.c.y(p030f0.c.d(p081p0.c.u0(j11, j12, f8)), p030f0.c.e(dVar.N())), null, 120);
        }
    }

    public static O0 f(C0230o c0230o) {
        c0230o.W(1376295968);
        D d6 = (D) c0230o.k(F.f2265a);
        O0 o6 = d6.f2208Q;
        if (o6 == null) {
            long jD = F.d(d6, M.q.f3285g);
            long jD2 = F.d(d6, 26);
            long jB = p035g0.r.b(0.38f, F.d(d6, M.q.f3287j));
            long jD3 = F.d(d6, M.q.i);
            long jB2 = p035g0.r.b(0.38f, F.d(d6, M.q.f3289l));
            long jL = p035g0.H.l(p035g0.r.b(0.38f, F.d(d6, 18)), d6.f2225p);
            long jB3 = p035g0.r.b(0.38f, F.d(d6, 18));
            int i = M.q.f3288k;
            O0 o7 = new O0(jD, jD2, jB, jD3, jB2, jL, jB3, p035g0.r.b(0.38f, F.d(d6, i)), p035g0.r.b(0.12f, F.d(d6, M.q.f3284f)), p035g0.r.b(0.38f, F.d(d6, i)));
            d6.f2208Q = o7;
            o6 = o7;
        }
        c0230o.p(false);
        return o6;
    }

    public void a(p117w.m mVar, Z.o oVar, O0 o6, boolean z5, long j4, C0230o c0230o, int i) {
        int i3;
        Z.o oVar2;
        long j6;
        Z.o oVar3;
        long j7;
        c0230o.X(-290277409);
        if ((i & 6) == 0) {
            i3 = i | (c0230o.f(mVar) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i3 | 48 | (c0230o.f(o6) ? HueLog.LogComponent.STREAMDTLS : 128) | (c0230o.g(z5) ? 2048 : 1024) | 24576;
        if ((74899 & i6) == 74898 && c0230o.B()) {
            c0230o.P();
            oVar3 = oVar;
            j7 = j4;
        } else {
            c0230o.R();
            if ((i & 1) == 0 || c0230o.z()) {
                oVar2 = Z.l.f5957a;
                j6 = AbstractC0176s1.f2909a;
            } else {
                c0230o.P();
                oVar2 = oVar;
                j6 = j4;
            }
            c0230o.q();
            c0230o.W(-1142853013);
            Object objK = c0230o.K();
            N.U u6 = C0222k.f3714a;
            if (objK == u6) {
                objK = new X.s();
                c0230o.f0(objK);
            }
            X.s sVar = (X.s) objK;
            c0230o.p(false);
            c0230o.W(-1142852924);
            boolean z6 = (i6 & 14) == 4;
            Object objK2 = c0230o.K();
            if (z6 || objK2 == u6) {
                objK2 = new Q0(mVar, sVar, null);
                c0230o.f0(objK2);
            }
            c0230o.p(false);
            C0208d.e((D4.e) objK2, c0230o, mVar);
            float f6 = !sVar.isEmpty() ? AbstractC0176s1.f2911c : AbstractC0176s1.f2910b;
            p035g0.M mA = N0.a(M.q.f3286h, c0230o);
            FillElement fillElement = androidx.compose.foundation.layout.c.f6634a;
            Z.o oVarH = androidx.compose.foundation.a.h(androidx.compose.foundation.d.a(androidx.compose.foundation.layout.c.i(oVar2, S0.g.b(j6), S0.g.a(j6)), mVar, K.s.a(M.q.f3282d / 2, c0230o, 54, 4)), mVar);
            if (!z5) {
                f6 = 0;
            }
            AbstractC1070c.b(c0230o, androidx.compose.foundation.a.b(p020d2.n.N(oVarH, f6, mA, 24), z5 ? o6.f2431a : o6.f2436f, mA));
            oVar3 = oVar2;
            j7 = j6;
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new R0(this, mVar, oVar3, o6, z5, j7, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public void b(A0 a6, Z.o oVar, O0 o6, boolean z5, C0230o c0230o, int i) {
        int i3;
        Z.o oVar2;
        ?? r6;
        Z.o oVar3;
        c0230o.X(-1617869097);
        if ((i & 6) == 0) {
            i3 = (c0230o.f(a6) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i3 | 48;
        if ((i & 384) == 0) {
            i6 |= c0230o.f(o6) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i & 3072) == 0) {
            i6 |= c0230o.g(z5) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i6 |= c0230o.f(this) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i6 & 9363) == 9362 && c0230o.B()) {
            c0230o.P();
            oVar3 = oVar;
        } else {
            c0230o.R();
            if ((i & 1) == 0 || c0230o.z()) {
                oVar2 = Z.l.f5957a;
            } else {
                c0230o.P();
                oVar2 = oVar;
            }
            c0230o.q();
            long jB = o6.b(z5, false);
            long jB2 = o6.b(z5, true);
            long jA = o6.a(z5, false);
            long jA2 = o6.a(z5, true);
            Z.o oVarC = androidx.compose.foundation.layout.c.c(oVar2.k(androidx.compose.foundation.layout.c.f6634a), AbstractC0176s1.f2913e);
            c0230o.W(-1134215342);
            boolean zE = c0230o.e(jB) | ((i6 & 14) == 4) | c0230o.e(jB2) | c0230o.e(jA) | c0230o.e(jA2);
            Object objK = c0230o.K();
            if (zE || objK == C0222k.f3714a) {
                r6 = 0;
                S0 s1 = new S0(a6, jB, jB2, jA, jA2, 1);
                c0230o.f0(s1);
                objK = s1;
            } else {
                r6 = 0;
            }
            c0230o.p(r6);
            G4.a.a(oVarC, (D4.c) objK, c0230o, r6);
            oVar3 = oVar2;
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new T0(this, a6, oVar3, o6, z5, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public void c(C0188w1 c0188w1, Z.o oVar, O0 o6, boolean z5, C0230o c0230o, int i) {
        int i3;
        Z.o oVar2;
        ?? r6;
        Z.o oVar3;
        c0230o.X(593554206);
        if ((i & 6) == 0) {
            i3 = (c0230o.f(c0188w1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i3 | 48;
        if ((i & 384) == 0) {
            i6 |= c0230o.f(o6) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i & 3072) == 0) {
            i6 |= c0230o.g(z5) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i6 |= c0230o.f(this) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i6 & 9363) == 9362 && c0230o.B()) {
            c0230o.P();
            oVar3 = oVar;
        } else {
            c0230o.R();
            if ((i & 1) == 0 || c0230o.z()) {
                oVar2 = Z.l.f5957a;
            } else {
                c0230o.P();
                oVar2 = oVar;
            }
            c0230o.q();
            long jB = o6.b(z5, false);
            long jB2 = o6.b(z5, true);
            long jA = o6.a(z5, false);
            long jA2 = o6.a(z5, true);
            Z.o oVarC = androidx.compose.foundation.layout.c.c(oVar2.k(androidx.compose.foundation.layout.c.f6634a), AbstractC0176s1.f2913e);
            c0230o.W(-1134216901);
            boolean zE = c0230o.e(jB) | ((i6 & 14) == 4) | c0230o.e(jB2) | c0230o.e(jA) | c0230o.e(jA2);
            Object objK = c0230o.K();
            if (zE || objK == C0222k.f3714a) {
                r6 = 0;
                S0 s1 = new S0(c0188w1, jB, jB2, jA, jA2, 0);
                c0230o.f0(s1);
                objK = s1;
            } else {
                r6 = 0;
            }
            c0230o.p(r6);
            G4.a.a(oVarC, (D4.c) objK, c0230o, r6);
            oVar3 = oVar2;
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new T0(this, c0188w1, oVar3, o6, z5, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0211  */
    /* JADX WARN: Code duplicated, block: B:103:0x0215  */
    /* JADX WARN: Code duplicated, block: B:105:0x021b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0269  */
    /* JADX WARN: Code duplicated, block: B:111:0x026d  */
    /* JADX WARN: Code duplicated, block: B:117:0x028e  */
    /* JADX WARN: Code duplicated, block: B:120:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:122:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:127:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:133:0x0357  */
    /* JADX WARN: Code duplicated, block: B:59:0x015a  */
    /* JADX WARN: Code duplicated, block: B:61:0x015d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0164  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x016d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0186  */
    /* JADX WARN: Code duplicated, block: B:74:0x0189  */
    /* JADX WARN: Code duplicated, block: B:78:0x0190  */
    /* JADX WARN: Code duplicated, block: B:80:0x0196 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0199  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:97:0x020b  */
    /* JADX WARN: Code duplicated, block: B:99:0x020e  */
    public void d(EnumC0152k0 enumC0152k0, long j4, long j6, B.V0 v6, boolean z5, V.a aVar, C0230o c0230o, int i) {
        float f6;
        Float f7;
        float f8;
        int iOrdinal;
        float f9;
        int iOrdinal2;
        float f10;
        int iOrdinal3;
        float f11;
        int iOrdinal4;
        EnumC0152k0 enumC0152k1;
        int[] iArr;
        long j7;
        p040h0.c cVarF;
        boolean zF;
        Object objK;
        p090r.u uVar;
        boolean z6;
        EnumC0152k0 enumC0152k2;
        long j8;
        EnumC0152k0 enumC0152k3;
        long j9;
        p040h0.c cVarF2;
        boolean zF2;
        boolean z7;
        Object w0Var;
        c0230o.X(-995111872);
        int i3 = i | (c0230o.f(enumC0152k0) ? 4 : 2) | (c0230o.e(j4) ? 32 : 16) | (c0230o.e(j6) ? HueLog.LogComponent.STREAMDTLS : 128) | (c0230o.h(v6) ? 2048 : 1024) | (c0230o.g(z5) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if ((74899 & i3) == 74898 && c0230o.B()) {
            c0230o.P();
        } else {
            int i6 = (i3 & 14) | 48;
            Object obj = p096s.u0.f12124a;
            Object objK2 = c0230o.K();
            N.U u6 = C0222k.f3714a;
            if (objK2 == u6) {
                objK2 = new p096s.o0(new p096s.K(enumC0152k0), null, "TextFieldInputState");
                c0230o.f0(objK2);
            }
            p096s.o0 o0Var = (p096s.o0) objK2;
            o0Var.a(enumC0152k0, c0230o, 48 | (i6 & 14));
            Object objK3 = c0230o.K();
            if (objK3 == u6) {
                objK3 = new p096s.t0(o0Var, 1);
                c0230o.f0(objK3);
            }
            C0208d.c(o0Var, (D4.c) objK3, c0230o);
            c0230o.W(-1338768149);
            p096s.w0 w0Var2 = p096s.x0.f12138a;
            c0230o.W(-142660079);
            C1.b bVar = o0Var.f12056a;
            EnumC0152k0 enumC0152k4 = (EnumC0152k0) bVar.j();
            c0230o.W(240378898);
            int iOrdinal5 = enumC0152k4.ordinal();
            float f12 = 0.0f;
            if (iOrdinal5 == 0) {
                f6 = 1.0f;
            } else if (iOrdinal5 != 1) {
                if (iOrdinal5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            c0230o.p(false);
            Float fValueOf = Float.valueOf(f6);
            C0217h0 c0217h0 = o0Var.f12059d;
            EnumC0152k0 enumC0152k5 = (EnumC0152k0) c0217h0.getValue();
            c0230o.W(240378898);
            int iOrdinal6 = enumC0152k5.ordinal();
            if (iOrdinal6 != 0) {
                f7 = fValueOf;
                if (iOrdinal6 == 1) {
                    f8 = 0.0f;
                } else if (iOrdinal6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c0230o.p(false);
                Float fValueOf2 = Float.valueOf(f8);
                o0Var.f();
                c0230o.W(-4765522);
                p096s.v0 v0VarK = AbstractC0909d.k(150, 6, null);
                c0230o.p(false);
                p096s.m0 m0VarB = p096s.u0.b(o0Var, f7, fValueOf2, v0VarK, w0Var2, c0230o, 196608);
                c0230o.p(false);
                c0230o.p(false);
                H h6 = H.f2300k;
                c0230o.W(-1338768149);
                c0230o.W(-142660079);
                EnumC0152k0 enumC0152k6 = (EnumC0152k0) bVar.j();
                c0230o.W(2067512179);
                iOrdinal = enumC0152k6.ordinal();
                if (iOrdinal == 0) {
                    f9 = 1.0f;
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z5) {
                        f9 = 1.0f;
                    }
                    f9 = 0.0f;
                }
                c0230o.p(false);
                Float fValueOf3 = Float.valueOf(f9);
                EnumC0152k0 enumC0152k7 = (EnumC0152k0) c0217h0.getValue();
                c0230o.W(2067512179);
                iOrdinal2 = enumC0152k7.ordinal();
                if (iOrdinal2 == 0) {
                    f10 = 1.0f;
                } else {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z5) {
                        f10 = 1.0f;
                    }
                    f10 = 0.0f;
                }
                c0230o.p(false);
                p096s.m0 m0VarB2 = p096s.u0.b(o0Var, fValueOf3, Float.valueOf(f10), (InterfaceC0932z) h6.c(o0Var.f(), c0230o, 0), w0Var2, c0230o, 196608);
                c0230o.p(false);
                c0230o.p(false);
                c0230o.W(-1338768149);
                c0230o.W(-142660079);
                EnumC0152k0 enumC0152k8 = (EnumC0152k0) bVar.j();
                c0230o.W(5829913);
                iOrdinal3 = enumC0152k8.ordinal();
                if (iOrdinal3 == 0) {
                    f11 = 1.0f;
                } else {
                    if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z5) {
                        f11 = 0.0f;
                    }
                    f11 = 1.0f;
                }
                c0230o.p(false);
                Float fValueOf4 = Float.valueOf(f11);
                EnumC0152k0 enumC0152k9 = (EnumC0152k0) c0217h0.getValue();
                c0230o.W(5829913);
                iOrdinal4 = enumC0152k9.ordinal();
                if (iOrdinal4 == 0) {
                    f12 = 1.0f;
                } else {
                    if (iOrdinal4 != 1) {
                        if (iOrdinal4 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (!z5) {
                    }
                    f12 = 1.0f;
                }
                c0230o.p(false);
                Float fValueOf5 = Float.valueOf(f12);
                o0Var.f();
                c0230o.W(1189967029);
                p096s.v0 v0VarK2 = AbstractC0909d.k(150, 6, null);
                c0230o.p(false);
                p096s.m0 m0VarB3 = p096s.u0.b(o0Var, fValueOf4, fValueOf5, v0VarK2, w0Var2, c0230o, 196608);
                c0230o.p(false);
                c0230o.p(false);
                c0230o.W(-1939694975);
                enumC0152k1 = (EnumC0152k0) c0217h0.getValue();
                c0230o.W(-1468066062);
                iArr = a2.f2619a;
                if (iArr[enumC0152k1.ordinal()] == 1) {
                    j7 = j4;
                } else {
                    j7 = j6;
                }
                c0230o.p(false);
                cVarF = p035g0.r.f(j7);
                c0230o.W(1157296644);
                zF = c0230o.f(cVarF);
                objK = c0230o.K();
                uVar = p090r.u.i;
                if (!zF || objK == u6) {
                    z6 = false;
                    p096s.w0 w0Var3 = new p096s.w0(uVar, new p090r.v(0 == true ? 1 : 0, cVarF));
                    c0230o.f0(w0Var3);
                    objK = w0Var3;
                } else {
                    z6 = false;
                }
                c0230o.p(z6);
                p096s.w0 w0Var4 = (p096s.w0) objK;
                c0230o.W(-142660079);
                enumC0152k2 = (EnumC0152k0) bVar.j();
                c0230o.W(-1468066062);
                if (iArr[enumC0152k2.ordinal()] == 1) {
                    j8 = j4;
                } else {
                    j8 = j6;
                }
                c0230o.p(false);
                p035g0.r rVar = new p035g0.r(j8);
                enumC0152k3 = (EnumC0152k0) c0217h0.getValue();
                c0230o.W(-1468066062);
                if (iArr[enumC0152k3.ordinal()] == 1) {
                    j9 = j4;
                } else {
                    j9 = j6;
                }
                c0230o.p(false);
                p035g0.r rVar2 = new p035g0.r(j9);
                o0Var.f();
                c0230o.W(2041936647);
                p096s.v0 v0VarK3 = AbstractC0909d.k(150, 6, null);
                c0230o.p(false);
                p096s.m0 m0VarB4 = p096s.u0.b(o0Var, rVar, rVar2, v0VarK3, w0Var4, c0230o, 229376);
                c0230o.p(false);
                c0230o.p(false);
                int i7 = (i3 & 7168) | 384;
                c0230o.W(-1939694975);
                cVarF2 = p035g0.r.f(((p035g0.r) v6.c(c0217h0.getValue(), c0230o, Integer.valueOf((i7 >> 6) & 112))).f9087a);
                c0230o.W(1157296644);
                zF2 = c0230o.f(cVarF2);
                Object objK4 = c0230o.K();
                if (!zF2 || objK4 == u6) {
                    z7 = false;
                    w0Var = new p096s.w0(uVar, new p090r.v(0 == true ? 1 : 0, cVarF2));
                    c0230o.f0(w0Var);
                } else {
                    w0Var = objK4;
                    z7 = false;
                }
                c0230o.p(z7);
                c0230o.W(-142660079);
                int i8 = ((((i7 << 3) & 57344) | 3136) >> 9) & 112;
                Object objC = v6.c(bVar.j(), c0230o, Integer.valueOf(i8));
                Object objC2 = v6.c(c0217h0.getValue(), c0230o, Integer.valueOf(i8));
                o0Var.f();
                c0230o.W(766065458);
                p096s.v0 v0VarK4 = AbstractC0909d.k(150, 6, null);
                c0230o.p(false);
                p096s.m0 m0VarB5 = p096s.u0.b(o0Var, objC, objC2, v0VarK4, (p096s.w0) w0Var, c0230o, 229376);
                c0230o.p(false);
                c0230o.p(false);
                aVar.f(Float.valueOf(((Number) m0VarB.f12041q.getValue()).floatValue()), new p035g0.r(((p035g0.r) m0VarB4.f12041q.getValue()).f9087a), new p035g0.r(((p035g0.r) m0VarB5.f12041q.getValue()).f9087a), Float.valueOf(((Number) m0VarB2.f12041q.getValue()).floatValue()), Float.valueOf(((Number) m0VarB3.f12041q.getValue()).floatValue()), c0230o, 196608);
            } else {
                f7 = fValueOf;
            }
            f8 = 1.0f;
            c0230o.p(false);
            Float fValueOf6 = Float.valueOf(f8);
            o0Var.f();
            c0230o.W(-4765522);
            p096s.v0 v0VarK5 = AbstractC0909d.k(150, 6, null);
            c0230o.p(false);
            p096s.m0 m0VarB6 = p096s.u0.b(o0Var, f7, fValueOf6, v0VarK5, w0Var2, c0230o, 196608);
            c0230o.p(false);
            c0230o.p(false);
            H h7 = H.f2300k;
            c0230o.W(-1338768149);
            c0230o.W(-142660079);
            EnumC0152k0 enumC0152k10 = (EnumC0152k0) bVar.j();
            c0230o.W(2067512179);
            iOrdinal = enumC0152k10.ordinal();
            if (iOrdinal == 0) {
                f9 = 1.0f;
            } else {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z5) {
                    f9 = 1.0f;
                }
                f9 = 0.0f;
            }
            c0230o.p(false);
            Float fValueOf7 = Float.valueOf(f9);
            EnumC0152k0 enumC0152k11 = (EnumC0152k0) c0217h0.getValue();
            c0230o.W(2067512179);
            iOrdinal2 = enumC0152k11.ordinal();
            if (iOrdinal2 == 0) {
                f10 = 1.0f;
            } else {
                if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z5) {
                    f10 = 1.0f;
                }
                f10 = 0.0f;
            }
            c0230o.p(false);
            p096s.m0 m0VarB7 = p096s.u0.b(o0Var, fValueOf7, Float.valueOf(f10), (InterfaceC0932z) h7.c(o0Var.f(), c0230o, 0), w0Var2, c0230o, 196608);
            c0230o.p(false);
            c0230o.p(false);
            c0230o.W(-1338768149);
            c0230o.W(-142660079);
            EnumC0152k0 enumC0152k12 = (EnumC0152k0) bVar.j();
            c0230o.W(5829913);
            iOrdinal3 = enumC0152k12.ordinal();
            if (iOrdinal3 == 0) {
                f11 = 1.0f;
            } else {
                if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z5) {
                    f11 = 0.0f;
                }
                f11 = 1.0f;
            }
            c0230o.p(false);
            Float fValueOf8 = Float.valueOf(f11);
            EnumC0152k0 enumC0152k13 = (EnumC0152k0) c0217h0.getValue();
            c0230o.W(5829913);
            iOrdinal4 = enumC0152k13.ordinal();
            if (iOrdinal4 == 0) {
                f12 = 1.0f;
            } else {
                if (iOrdinal4 != 1) {
                    if (iOrdinal4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!z5) {
                }
                f12 = 1.0f;
            }
            c0230o.p(false);
            Float fValueOf9 = Float.valueOf(f12);
            o0Var.f();
            c0230o.W(1189967029);
            p096s.v0 v0VarK6 = AbstractC0909d.k(150, 6, null);
            c0230o.p(false);
            p096s.m0 m0VarB8 = p096s.u0.b(o0Var, fValueOf8, fValueOf9, v0VarK6, w0Var2, c0230o, 196608);
            c0230o.p(false);
            c0230o.p(false);
            c0230o.W(-1939694975);
            enumC0152k1 = (EnumC0152k0) c0217h0.getValue();
            c0230o.W(-1468066062);
            iArr = a2.f2619a;
            if (iArr[enumC0152k1.ordinal()] == 1) {
                j7 = j4;
            } else {
                j7 = j6;
            }
            c0230o.p(false);
            cVarF = p035g0.r.f(j7);
            c0230o.W(1157296644);
            zF = c0230o.f(cVarF);
            objK = c0230o.K();
            uVar = p090r.u.i;
            if (zF) {
                z6 = false;
                p096s.w0 w0Var5 = new p096s.w0(uVar, new p090r.v(0 == true ? 1 : 0, cVarF));
                c0230o.f0(w0Var5);
                objK = w0Var5;
            } else {
                z6 = false;
                p096s.w0 w0Var6 = new p096s.w0(uVar, new p090r.v(0 == true ? 1 : 0, cVarF));
                c0230o.f0(w0Var6);
                objK = w0Var6;
            }
            c0230o.p(z6);
            p096s.w0 w0Var7 = (p096s.w0) objK;
            c0230o.W(-142660079);
            enumC0152k2 = (EnumC0152k0) bVar.j();
            c0230o.W(-1468066062);
            if (iArr[enumC0152k2.ordinal()] == 1) {
                j8 = j4;
            } else {
                j8 = j6;
            }
            c0230o.p(false);
            p035g0.r rVar3 = new p035g0.r(j8);
            enumC0152k3 = (EnumC0152k0) c0217h0.getValue();
            c0230o.W(-1468066062);
            if (iArr[enumC0152k3.ordinal()] == 1) {
                j9 = j4;
            } else {
                j9 = j6;
            }
            c0230o.p(false);
            p035g0.r rVar4 = new p035g0.r(j9);
            o0Var.f();
            c0230o.W(2041936647);
            p096s.v0 v0VarK7 = AbstractC0909d.k(150, 6, null);
            c0230o.p(false);
            p096s.m0 m0VarB9 = p096s.u0.b(o0Var, rVar3, rVar4, v0VarK7, w0Var7, c0230o, 229376);
            c0230o.p(false);
            c0230o.p(false);
            int i9 = (i3 & 7168) | 384;
            c0230o.W(-1939694975);
            cVarF2 = p035g0.r.f(((p035g0.r) v6.c(c0217h0.getValue(), c0230o, Integer.valueOf((i9 >> 6) & 112))).f9087a);
            c0230o.W(1157296644);
            zF2 = c0230o.f(cVarF2);
            Object objK5 = c0230o.K();
            if (zF2) {
                z7 = false;
                w0Var = new p096s.w0(uVar, new p090r.v(0 == true ? 1 : 0, cVarF2));
                c0230o.f0(w0Var);
            } else {
                z7 = false;
                w0Var = new p096s.w0(uVar, new p090r.v(0 == true ? 1 : 0, cVarF2));
                c0230o.f0(w0Var);
            }
            c0230o.p(z7);
            c0230o.W(-142660079);
            int i10 = ((((i9 << 3) & 57344) | 3136) >> 9) & 112;
            Object objC3 = v6.c(bVar.j(), c0230o, Integer.valueOf(i10));
            Object objC4 = v6.c(c0217h0.getValue(), c0230o, Integer.valueOf(i10));
            o0Var.f();
            c0230o.W(766065458);
            p096s.v0 v0VarK8 = AbstractC0909d.k(150, 6, null);
            c0230o.p(false);
            p096s.m0 m0VarB10 = p096s.u0.b(o0Var, objC3, objC4, v0VarK8, (p096s.w0) w0Var, c0230o, 229376);
            c0230o.p(false);
            c0230o.p(false);
            aVar.f(Float.valueOf(((Number) m0VarB6.f12041q.getValue()).floatValue()), new p035g0.r(((p035g0.r) m0VarB9.f12041q.getValue()).f9087a), new p035g0.r(((p035g0.r) m0VarB10.f12041q.getValue()).f9087a), Float.valueOf(((Number) m0VarB7.f12041q.getValue()).floatValue()), Float.valueOf(((Number) m0VarB8.f12041q.getValue()).floatValue()), c0230o, 196608);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new Z1(this, enumC0152k0, j4, j6, v6, z5, aVar, i);
        }
    }
}
