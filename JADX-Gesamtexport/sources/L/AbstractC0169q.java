package L;

import B.AbstractC0013g0;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.C0235q0;
import N.C0247x;
import N.InterfaceC0225l0;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import okhttp3.internal.http2.Http2;
import p096s.AbstractC0909d;
import p096s.AbstractC0931y;
import p096s.C0927u;
import p123x.AbstractC1070c;
import p123x.AbstractC1084q;
import p123x.C1086t;
import p123x.InterfaceC1073f;
import p123x.InterfaceC1074g;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;
import p130y0.AbstractC1124c0;

/* JADX INFO: renamed from: L.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0169q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f2879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f2880b;

    static {
        new C0927u(0.8f, 0.0f, 0.8f, 0.15f);
        float f6 = 4;
        f2879a = f6;
        f2880b = 16 - f6;
    }

    public static final void a(Z.o oVar, D4.e eVar, G0.J j4, V.a aVar, V.a aVar2, p123x.K k3, f2 f2Var, C0230o c0230o, int i) {
        int i3;
        D4.e eVar2;
        G0.J j6;
        c0230o.X(1841601619);
        if ((i & 6) == 0) {
            i3 = (c0230o.f(oVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            eVar2 = eVar;
            i3 |= c0230o.h(eVar2) ? 32 : 16;
        } else {
            eVar2 = eVar;
        }
        if ((i & 384) == 0) {
            j6 = j4;
            i3 |= c0230o.f(j6) ? HueLog.LogComponent.STREAMDTLS : 128;
        } else {
            j6 = j4;
        }
        if ((i & 3072) == 0) {
            i3 |= c0230o.g(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c0230o.h(aVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= c0230o.h(aVar2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= c0230o.f(k3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= c0230o.f(f2Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= c0230o.f(null) ? 67108864 : 33554432;
        }
        if ((38347923 & i3) == 38347922 && c0230o.B()) {
            c0230o.P();
        } else {
            float f6 = -((S0.b) c0230o.k(AbstractC1124c0.f14367f)).y(M.s.f3297a);
            c0230o.W(-1008351447);
            boolean zC = ((i3 & 234881024) == 67108864) | c0230o.c(f6);
            Object objK = c0230o.K();
            N.U u6 = C0222k.f3714a;
            if (zC || objK == u6) {
                objK = new E(0, 9);
                c0230o.f0(objK);
            }
            c0230o.p(false);
            C0208d.g((D4.a) objK, c0230o);
            f2Var.getClass();
            N.V0 v0A = p090r.M.a(p035g0.H.m(f2Var.f2730a, f2Var.f2731b, AbstractC0931y.f12147b.a(0.0f)), AbstractC0909d.j(5, null), null, c0230o, 48, 12);
            V.a aVarB = V.b.b(c0230o, 1520880938, new C0124b(aVar2, 2, (byte) 0));
            c0230o.W(-1008350212);
            Z.l lVar = Z.l.f5957a;
            c0230o.p(false);
            A1.a(oVar.k(lVar), null, ((p035g0.r) v0A.getValue()).f9087a, 0L, 0.0f, 0.0f, V.b.b(c0230o, 376925230, new C0154l(k3, f2Var, eVar2, j6, aVar, aVarB)), c0230o, 12582912, 122);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0157m(oVar, eVar, j4, aVar, aVar2, k3, f2Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x00af  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x0109  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    public static final void b(D4.e eVar, Z.l lVar, V.a aVar, V.a aVar2, p123x.K k3, f2 f2Var, C0230o c0230o, int i, int i3) {
        V.a aVar3;
        int i6;
        V.a aVar4;
        boolean z5;
        D d6;
        f2 f2Var2;
        int i7;
        V.a aVar5;
        p123x.K k6;
        f2 f2Var3;
        long jD;
        Z.l lVar2;
        C0235q0 c0235q0T;
        c0230o.X(1906353009);
        int i8 = i | 48;
        int i9 = i3 & 8;
        if (i9 == 0) {
            if ((i & 3072) == 0) {
                aVar3 = aVar2;
                i8 |= c0230o.h(aVar3) ? 2048 : 1024;
            }
            i6 = i8 | 1646592;
            if ((599187 & i6) == 599186 || !c0230o.B()) {
                c0230o.R();
                if ((i & 1) != 0 || c0230o.z()) {
                    lVar = Z.l.f5957a;
                    if (i9 != 0) {
                        aVar4 = I.f2314a;
                    } else {
                        aVar4 = aVar3;
                    }
                    c0230o.W(2143182847);
                    p123x.K k7 = new p123x.K(L.j(c0230o), AbstractC1070c.f13762g | 16);
                    z5 = false;
                    c0230o.p(false);
                    c0230o.W(-1388520854);
                    d6 = (D) c0230o.k(F.f2265a);
                    f2Var2 = d6.f2205N;
                    if (f2Var2 == null) {
                        float f6 = M.s.f3297a;
                        long jD2 = F.d(d6, 35);
                        if (p035g0.r.c(F.d(d6, 35), d6.f2225p)) {
                            jD = F.g(d6, M.s.f3301e);
                        } else {
                            jD = F.d(d6, 35);
                        }
                        f2 f2Var4 = new f2(jD2, jD, F.d(d6, M.s.f3300d), F.d(d6, M.s.f3298b), F.d(d6, M.s.f3302f));
                        d6.f2205N = f2Var4;
                        f2Var2 = f2Var4;
                        z5 = false;
                    }
                    c0230o.p(z5);
                    i7 = i6 & (-516097);
                    aVar5 = aVar4;
                    k6 = k7;
                    f2Var3 = f2Var2;
                } else {
                    c0230o.P();
                    i7 = i6 & (-516097);
                    k6 = k3;
                    f2Var3 = f2Var;
                    aVar5 = aVar3;
                }
                int i10 = i7;
                Z.l lVar3 = lVar;
                c0230o.q();
                a(lVar3, eVar, h2.a((g2) c0230o.k(h2.f2777a), M.s.f3299c), aVar, aVar5, k6, f2Var3, c0230o, ((i10 << 6) & 458752) | 100690998);
                lVar2 = lVar3;
            } else {
                c0230o.P();
                k6 = k3;
                f2Var3 = f2Var;
                aVar5 = aVar3;
                lVar2 = lVar;
            }
            c0235q0T = c0230o.t();
            if (c0235q0T != null) {
                c0235q0T.f3780d = new F0(eVar, lVar2, aVar, aVar5, k6, f2Var3, i, i3);
            }
        }
        i8 = i | 3120;
        aVar3 = aVar2;
        i6 = i8 | 1646592;
        if ((599187 & i6) == 599186) {
            c0230o.R();
            if ((i & 1) != 0) {
                lVar = Z.l.f5957a;
                if (i9 != 0) {
                    aVar4 = I.f2314a;
                } else {
                    aVar4 = aVar3;
                }
                c0230o.W(2143182847);
                p123x.K k8 = new p123x.K(L.j(c0230o), AbstractC1070c.f13762g | 16);
                z5 = false;
                c0230o.p(false);
                c0230o.W(-1388520854);
                d6 = (D) c0230o.k(F.f2265a);
                f2Var2 = d6.f2205N;
                if (f2Var2 == null) {
                    float f7 = M.s.f3297a;
                    long jD3 = F.d(d6, 35);
                    if (p035g0.r.c(F.d(d6, 35), d6.f2225p)) {
                        jD = F.g(d6, M.s.f3301e);
                    } else {
                        jD = F.d(d6, 35);
                    }
                    f2 f2Var5 = new f2(jD3, jD, F.d(d6, M.s.f3300d), F.d(d6, M.s.f3298b), F.d(d6, M.s.f3302f));
                    d6.f2205N = f2Var5;
                    f2Var2 = f2Var5;
                    z5 = false;
                }
                c0230o.p(z5);
                i7 = i6 & (-516097);
                aVar5 = aVar4;
                k6 = k8;
                f2Var3 = f2Var2;
            } else {
                lVar = Z.l.f5957a;
                if (i9 != 0) {
                    aVar4 = I.f2314a;
                } else {
                    aVar4 = aVar3;
                }
                c0230o.W(2143182847);
                p123x.K k9 = new p123x.K(L.j(c0230o), AbstractC1070c.f13762g | 16);
                z5 = false;
                c0230o.p(false);
                c0230o.W(-1388520854);
                d6 = (D) c0230o.k(F.f2265a);
                f2Var2 = d6.f2205N;
                if (f2Var2 == null) {
                    float f8 = M.s.f3297a;
                    long jD4 = F.d(d6, 35);
                    if (p035g0.r.c(F.d(d6, 35), d6.f2225p)) {
                        jD = F.g(d6, M.s.f3301e);
                    } else {
                        jD = F.d(d6, 35);
                    }
                    f2 f2Var6 = new f2(jD4, jD, F.d(d6, M.s.f3300d), F.d(d6, M.s.f3298b), F.d(d6, M.s.f3302f));
                    d6.f2205N = f2Var6;
                    f2Var2 = f2Var6;
                    z5 = false;
                }
                c0230o.p(z5);
                i7 = i6 & (-516097);
                aVar5 = aVar4;
                k6 = k9;
                f2Var3 = f2Var2;
            }
            int i11 = i7;
            Z.l lVar4 = lVar;
            c0230o.q();
            a(lVar4, eVar, h2.a((g2) c0230o.k(h2.f2777a), M.s.f3299c), aVar, aVar5, k6, f2Var3, c0230o, ((i11 << 6) & 458752) | 100690998);
            lVar2 = lVar4;
        } else {
            c0230o.R();
            if ((i & 1) != 0) {
                lVar = Z.l.f5957a;
                if (i9 != 0) {
                    aVar4 = I.f2314a;
                } else {
                    aVar4 = aVar3;
                }
                c0230o.W(2143182847);
                p123x.K k10 = new p123x.K(L.j(c0230o), AbstractC1070c.f13762g | 16);
                z5 = false;
                c0230o.p(false);
                c0230o.W(-1388520854);
                d6 = (D) c0230o.k(F.f2265a);
                f2Var2 = d6.f2205N;
                if (f2Var2 == null) {
                    float f9 = M.s.f3297a;
                    long jD5 = F.d(d6, 35);
                    if (p035g0.r.c(F.d(d6, 35), d6.f2225p)) {
                        jD = F.g(d6, M.s.f3301e);
                    } else {
                        jD = F.d(d6, 35);
                    }
                    f2 f2Var7 = new f2(jD5, jD, F.d(d6, M.s.f3300d), F.d(d6, M.s.f3298b), F.d(d6, M.s.f3302f));
                    d6.f2205N = f2Var7;
                    f2Var2 = f2Var7;
                    z5 = false;
                }
                c0230o.p(z5);
                i7 = i6 & (-516097);
                aVar5 = aVar4;
                k6 = k10;
                f2Var3 = f2Var2;
            } else {
                lVar = Z.l.f5957a;
                if (i9 != 0) {
                    aVar4 = I.f2314a;
                } else {
                    aVar4 = aVar3;
                }
                c0230o.W(2143182847);
                p123x.K k11 = new p123x.K(L.j(c0230o), AbstractC1070c.f13762g | 16);
                z5 = false;
                c0230o.p(false);
                c0230o.W(-1388520854);
                d6 = (D) c0230o.k(F.f2265a);
                f2Var2 = d6.f2205N;
                if (f2Var2 == null) {
                    float f10 = M.s.f3297a;
                    long jD6 = F.d(d6, 35);
                    if (p035g0.r.c(F.d(d6, 35), d6.f2225p)) {
                        jD = F.g(d6, M.s.f3301e);
                    } else {
                        jD = F.d(d6, 35);
                    }
                    f2 f2Var8 = new f2(jD6, jD, F.d(d6, M.s.f3300d), F.d(d6, M.s.f3298b), F.d(d6, M.s.f3302f));
                    d6.f2205N = f2Var8;
                    f2Var2 = f2Var8;
                    z5 = false;
                }
                c0230o.p(z5);
                i7 = i6 & (-516097);
                aVar5 = aVar4;
                k6 = k11;
                f2Var3 = f2Var2;
            }
            int i12 = i7;
            Z.l lVar5 = lVar;
            c0230o.q();
            a(lVar5, eVar, h2.a((g2) c0230o.k(h2.f2777a), M.s.f3299c), aVar, aVar5, k6, f2Var3, c0230o, ((i12 << 6) & 458752) | 100690998);
            lVar2 = lVar5;
        }
        c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new F0(eVar, lVar2, aVar, aVar5, k6, f2Var3, i, i3);
        }
    }

    public static final void c(Z.o oVar, float f6, long j4, long j6, long j7, D4.e eVar, G0.J j8, InterfaceC1074g interfaceC1074g, InterfaceC1073f interfaceC1073f, V.a aVar, V.a aVar2, C0230o c0230o, int i, int i3) {
        int i6;
        int i7;
        long j9;
        V.a aVar3 = aVar2;
        c0230o.X(-6794037);
        if ((i & 6) == 0) {
            i6 = (c0230o.f(oVar) ? 4 : 2) | i;
        } else {
            i6 = i;
        }
        if ((i & 48) == 0) {
            i6 |= c0230o.c(f6) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= c0230o.e(j4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i6 |= c0230o.e(j6) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i6 |= c0230o.e(j7) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i6 |= c0230o.h(eVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i6 |= c0230o.f(j8) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i6 |= c0230o.c(1.0f) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i6 |= c0230o.f(interfaceC1074g) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i6 |= c0230o.f(interfaceC1073f) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i7 = i3 | (c0230o.d(0) ? 4 : 2);
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= c0230o.g(false) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i7 |= c0230o.h(aVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i7 |= c0230o.h(aVar3) ? 2048 : 1024;
        }
        int i8 = i7;
        if ((i6 & 306783379) == 306783378 && (i8 & 1171) == 1170 && c0230o.B()) {
            c0230o.P();
            j9 = j7;
        } else {
            c0230o.W(1019460550);
            boolean z5 = ((1879048192 & i6) == 536870912) | ((i6 & 112) == 32) | ((234881024 & i6) == 67108864) | ((i8 & 14) == 4);
            Object objK = c0230o.K();
            if (z5 || objK == C0222k.f3714a) {
                objK = new C0163o(f6, interfaceC1073f, interfaceC1074g);
                c0230o.f0(objK);
            }
            p113v0.F f7 = (p113v0.F) objK;
            c0230o.p(false);
            c0230o.W(-1323940314);
            int i9 = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
            InterfaceC1102j.f14043g.getClass();
            C1106n c1106n = C1101i.f14038b;
            V.a aVarH = p113v0.U.h(oVar);
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C1100h c1100h = C1101i.f14041e;
            C0208d.R(c1100h, c0230o, f7);
            C1100h c1100h2 = C1101i.f14040d;
            C0208d.R(c1100h2, c0230o, interfaceC0225l0M);
            C1100h c1100h3 = C1101i.f14042f;
            if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i9))) {
                p012c.k.y(i9, c0230o, i9, c1100h3);
            }
            AbstractC0013g0.p(0, aVarH, new N.C0(c0230o), c0230o, 2058660585);
            Z.l lVar = Z.l.f5957a;
            Z.o oVarC = androidx.compose.ui.layout.a.c(lVar, "navigationIcon");
            float f8 = f2879a;
            Z.o oVarK = androidx.compose.foundation.layout.a.k(oVarC, f8, 0.0f, 0.0f, 0.0f, 14);
            c0230o.W(733328855);
            Z.g gVar = Z.b.f5933h;
            int i10 = i6;
            C1086t c1086tF = AbstractC1084q.f(gVar, false, c0230o, 0);
            c0230o.W(-1323940314);
            int i11 = c0230o.f3744P;
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
            if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i11))) {
                p012c.k.y(i11, c0230o, i11, c1100h3);
            }
            AbstractC0013g0.p(0, aVarH2, new N.C0(c0230o), c0230o, 2058660585);
            C0247x c0247x = K.f2350a;
            C0208d.a(c0247x.a(new p035g0.r(j4)), aVar, c0230o, ((i8 >> 3) & 112) | 8);
            AbstractC0013g0.q(c0230o, false, true, false, false);
            Z.o oVarB = androidx.compose.ui.graphics.a.b(androidx.compose.foundation.layout.a.i(androidx.compose.ui.layout.a.c(lVar, "title"), f8, 0.0f, 2).k(lVar), 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, null, false, 131067);
            c0230o.W(733328855);
            C1086t c1086tF2 = AbstractC1084q.f(gVar, false, c0230o, 0);
            c0230o.W(-1323940314);
            int i12 = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M3 = c0230o.m();
            V.a aVarH3 = p113v0.U.h(oVarB);
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C0208d.R(c1100h, c0230o, c1086tF2);
            C0208d.R(c1100h2, c0230o, interfaceC0225l0M3);
            if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i12))) {
                p012c.k.y(i12, c0230o, i12, c1100h3);
            }
            AbstractC0013g0.p(0, aVarH3, new N.C0(c0230o), c0230o, 2058660585);
            int i13 = i10 >> 9;
            L.f(j6, j8, eVar, c0230o, (i13 & 14) | ((i10 >> 15) & 112) | (i13 & 896));
            AbstractC0013g0.q(c0230o, false, true, false, false);
            Z.o oVarK2 = androidx.compose.foundation.layout.a.k(androidx.compose.ui.layout.a.c(lVar, "actionIcons"), 0.0f, 0.0f, f8, 0.0f, 11);
            c0230o.W(733328855);
            C1086t c1086tF3 = AbstractC1084q.f(gVar, false, c0230o, 0);
            c0230o.W(-1323940314);
            int i14 = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M4 = c0230o.m();
            V.a aVarH4 = p113v0.U.h(oVarK2);
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C0208d.R(c1100h, c0230o, c1086tF3);
            C0208d.R(c1100h2, c0230o, interfaceC0225l0M4);
            if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i14))) {
                p012c.k.y(i14, c0230o, i14, c1100h3);
            }
            aVarH4.c(new N.C0(c0230o), c0230o, 0);
            c0230o.W(2058660585);
            j9 = j7;
            aVar3 = aVar2;
            C0208d.a(c0247x.a(new p035g0.r(j9)), aVar3, c0230o, 8 | ((i8 >> 6) & 112));
            AbstractC0013g0.q(c0230o, false, true, false, false);
            c0230o.p(false);
            c0230o.p(true);
            c0230o.p(false);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0166p(oVar, f6, j4, j6, j9, eVar, j8, interfaceC1074g, interfaceC1073f, aVar, aVar3, i, i3);
        }
    }
}
