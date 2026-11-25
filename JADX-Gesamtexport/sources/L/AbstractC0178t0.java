package L;

import F.C0074p;
import N.C0222k;
import N.C0230o;
import N.C0235q0;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import p096s.AbstractC0909d;
import p096s.AbstractC0931y;
import p096s.C0927u;
import p130y0.AbstractC1124c0;

/* JADX INFO: renamed from: L.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0178t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f2915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f2916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0927u f2917c;

    static {
        float f6 = 10;
        f2915a = f6;
        androidx.compose.foundation.layout.a.i(E0.i.a(androidx.compose.ui.layout.a.b(H.f2299j), true, C0189x.f2968k), 0.0f, f6, 1);
        f2916b = M.a.f3121b - (M.a.f3120a * 2);
        new C0927u(0.2f, 0.0f, 0.8f, 1.0f);
        new C0927u(0.4f, 0.0f, 1.0f, 1.0f);
        new C0927u(0.0f, 0.0f, 0.65f, 1.0f);
        new C0927u(0.1f, 0.0f, 0.45f, 1.0f);
        f2917c = new C0927u(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0266  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:56:0x00af  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:69:0x0117  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e7 A[PHI: r6
  0x01e7: PHI (r6v12 long) = (r6v10 long), (r6v13 long) binds: [B:77:0x01e5, B:73:0x01de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x020e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0210  */
    /* JADX WARN: Code duplicated, block: B:87:0x021a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0220  */
    /* JADX WARN: Code duplicated, block: B:95:0x0231  */
    /* JADX WARN: Code duplicated, block: B:99:0x0239  */
    public static final void a(Z.o oVar, long j4, float f6, long j6, int i, C0230o c0230o, int i3, int i6) {
        Z.o oVar2;
        int i7;
        float f7;
        long j7;
        int i8;
        int i9;
        Z.o oVar3;
        float f8;
        int i10;
        long j8;
        Z.o oVar4;
        long j9;
        p044i0.h hVar;
        Object objK;
        Object obj;
        float f9;
        int i11;
        long j10;
        p096s.E e6;
        p096s.E eD;
        p096s.E eD2;
        p096s.E eD3;
        long j11;
        boolean z5;
        boolean z6;
        boolean z7;
        Object objK2;
        long j12;
        long j13;
        Z.o oVar5;
        long j14;
        int i12;
        C0235q0 c0235q0T;
        c0230o.X(-115871647);
        int i13 = i6 & 1;
        if (i13 != 0) {
            i7 = i3 | 6;
            oVar2 = oVar;
        } else if ((i3 & 6) == 0) {
            oVar2 = oVar;
            i7 = (c0230o.f(oVar2) ? 4 : 2) | i3;
        } else {
            oVar2 = oVar;
            i7 = i3;
        }
        long jE = j4;
        int i14 = i7 | (((i6 & 2) == 0 && c0230o.e(jE)) ? 32 : 16);
        int i15 = i6 & 4;
        if (i15 == 0) {
            if ((i3 & 384) == 0) {
                f7 = f6;
                i14 |= c0230o.c(f7) ? HueLog.LogComponent.STREAMDTLS : 128;
            }
            j7 = j6;
            if ((i6 & 8) == 0 || !c0230o.e(j7)) {
                i8 = 1024;
            } else {
                i8 = 2048;
            }
            i9 = i14 | i8 | 24576;
            if ((i9 & 9363) == 9362 || !c0230o.B()) {
                c0230o.R();
                if ((i3 & 1) != 0 || c0230o.z()) {
                    if (i13 != 0) {
                        oVar3 = Z.l.f5957a;
                    } else {
                        oVar3 = oVar2;
                    }
                    if ((i6 & 2) != 0) {
                        float f10 = AbstractC0167p0.f2875a;
                        c0230o.W(1803349725);
                        float f11 = M.a.f3120a;
                        jE = F.e(26, c0230o);
                        c0230o.p(false);
                        i9 &= -113;
                    }
                    if (i15 != 0) {
                        f8 = AbstractC0167p0.f2875a;
                    } else {
                        f8 = f7;
                    }
                    if ((i6 & 8) != 0) {
                        float f12 = AbstractC0167p0.f2875a;
                        c0230o.W(-404222247);
                        j7 = p035g0.r.f9084k;
                        c0230o.p(false);
                        i9 &= -7169;
                    }
                    i10 = AbstractC0167p0.f2876b;
                    j8 = j7;
                    oVar4 = oVar3;
                    j9 = jE;
                } else {
                    c0230o.P();
                    if ((i6 & 2) != 0) {
                        i9 &= -113;
                    }
                    if ((i6 & 8) != 0) {
                        i9 &= -7169;
                    }
                    f8 = f7;
                    j8 = j7;
                    oVar4 = oVar2;
                    j9 = jE;
                    i10 = i;
                }
                c0230o.q();
                int i16 = i10;
                hVar = new p044i0.h(((S0.b) c0230o.k(AbstractC1124c0.f14367f)).y(f8), 0.0f, i16, 0, 26);
                objK = c0230o.K();
                obj = C0222k.f3714a;
                if (objK == obj) {
                    objK = new p096s.H();
                    c0230o.f0(objK);
                }
                p096s.H h6 = (p096s.H) objK;
                h6.a(0, c0230o);
                f9 = f8;
                i11 = i9;
                p096s.w0 w0Var = p096s.x0.f12139b;
                C0074p c0074p = AbstractC0931y.f12148c;
                j10 = j8;
                e6 = AbstractC0909d.e(h6, 0, 5, w0Var, AbstractC0909d.i(AbstractC0909d.k(6660, 2, c0074p)), c0230o, 33208, 16);
                eD = AbstractC0909d.d(h6, 286.0f, AbstractC0909d.i(AbstractC0909d.k(1332, 2, c0074p)), c0230o);
                K3.e eVar = new K3.e();
                eVar.f2138b = 1332;
                p096s.I iC = eVar.c(Float.valueOf(0.0f), 0);
                C0927u c0927u = f2917c;
                iC.f11853b = c0927u;
                eVar.c(Float.valueOf(290.0f), 666);
                eD2 = AbstractC0909d.d(h6, 290.0f, AbstractC0909d.i(new p096s.J(eVar)), c0230o);
                K3.e eVar2 = new K3.e();
                eVar2.f2138b = 1332;
                eVar2.c(Float.valueOf(0.0f), 666).f11853b = c0927u;
                eVar2.c(Float.valueOf(290.0f), eVar2.f2138b);
                eD3 = AbstractC0909d.d(h6, 290.0f, AbstractC0909d.i(new p096s.J(eVar2)), c0230o);
                Z.o oVarH = androidx.compose.foundation.layout.c.h(E0.i.a(oVar4, true, p101t.r.f12406l), f2916b);
                c0230o.W(821870113);
                if (((i11 & 7168) ^ 3072) > 2048) {
                    j11 = j10;
                    if (c0230o.e(j11)) {
                        z5 = true;
                    }
                    boolean zH = z5 | c0230o.h(hVar) | c0230o.f(e6) | c0230o.f(eD2) | c0230o.f(eD3) | c0230o.f(eD);
                    if ((i11 & 896) == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = z6 | zH | ((((i11 & 112) ^ 48) <= 32 && c0230o.e(j9)) || (i11 & 48) == 32);
                    objK2 = c0230o.K();
                    if (!z7 || objK2 == obj) {
                        j12 = j9;
                        objK2 = new C0170q0(j11, hVar, e6, eD2, eD3, eD, f9, j12);
                        c0230o.f0(objK2);
                    } else {
                        j12 = j9;
                    }
                    c0230o.p(false);
                    G4.a.a(oVarH, (D4.c) objK2, c0230o, 0);
                    j13 = j11;
                    oVar5 = oVar4;
                    f7 = f9;
                    j14 = j12;
                    i12 = i16;
                } else {
                    j11 = j10;
                }
                if ((i11 & 3072) == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean zH2 = z5 | c0230o.h(hVar) | c0230o.f(e6) | c0230o.f(eD2) | c0230o.f(eD3) | c0230o.f(eD);
                if ((i11 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = z6 | zH2 | ((((i11 & 112) ^ 48) <= 32 && c0230o.e(j9)) || (i11 & 48) == 32);
                objK2 = c0230o.K();
                if (z7) {
                    j12 = j9;
                    objK2 = new C0170q0(j11, hVar, e6, eD2, eD3, eD, f9, j12);
                    c0230o.f0(objK2);
                } else {
                    j12 = j9;
                    objK2 = new C0170q0(j11, hVar, e6, eD2, eD3, eD, f9, j12);
                    c0230o.f0(objK2);
                }
                c0230o.p(false);
                G4.a.a(oVarH, (D4.c) objK2, c0230o, 0);
                j13 = j11;
                oVar5 = oVar4;
                f7 = f9;
                j14 = j12;
                i12 = i16;
            } else {
                c0230o.P();
                oVar5 = oVar2;
                j14 = jE;
                j13 = j7;
                i12 = i;
            }
            c0235q0T = c0230o.t();
            if (c0235q0T != null) {
                c0235q0T.f3780d = new C0172r0(oVar5, j14, f7, j13, i12, i3, i6);
            }
        }
        i14 |= 384;
        f7 = f6;
        j7 = j6;
        if ((i6 & 8) == 0) {
            i8 = 1024;
        } else {
            i8 = 1024;
        }
        i9 = i14 | i8 | 24576;
        if ((i9 & 9363) == 9362) {
            c0230o.R();
            if ((i3 & 1) != 0) {
                if (i13 != 0) {
                    oVar3 = Z.l.f5957a;
                } else {
                    oVar3 = oVar2;
                }
                if ((i6 & 2) != 0) {
                    float f13 = AbstractC0167p0.f2875a;
                    c0230o.W(1803349725);
                    float f14 = M.a.f3120a;
                    jE = F.e(26, c0230o);
                    c0230o.p(false);
                    i9 &= -113;
                }
                if (i15 != 0) {
                    f8 = AbstractC0167p0.f2875a;
                } else {
                    f8 = f7;
                }
                if ((i6 & 8) != 0) {
                    float f15 = AbstractC0167p0.f2875a;
                    c0230o.W(-404222247);
                    j7 = p035g0.r.f9084k;
                    c0230o.p(false);
                    i9 &= -7169;
                }
                i10 = AbstractC0167p0.f2876b;
                j8 = j7;
                oVar4 = oVar3;
                j9 = jE;
            } else {
                if (i13 != 0) {
                    oVar3 = Z.l.f5957a;
                } else {
                    oVar3 = oVar2;
                }
                if ((i6 & 2) != 0) {
                    float f16 = AbstractC0167p0.f2875a;
                    c0230o.W(1803349725);
                    float f17 = M.a.f3120a;
                    jE = F.e(26, c0230o);
                    c0230o.p(false);
                    i9 &= -113;
                }
                if (i15 != 0) {
                    f8 = AbstractC0167p0.f2875a;
                } else {
                    f8 = f7;
                }
                if ((i6 & 8) != 0) {
                    float f18 = AbstractC0167p0.f2875a;
                    c0230o.W(-404222247);
                    j7 = p035g0.r.f9084k;
                    c0230o.p(false);
                    i9 &= -7169;
                }
                i10 = AbstractC0167p0.f2876b;
                j8 = j7;
                oVar4 = oVar3;
                j9 = jE;
            }
            c0230o.q();
            int i17 = i10;
            hVar = new p044i0.h(((S0.b) c0230o.k(AbstractC1124c0.f14367f)).y(f8), 0.0f, i17, 0, 26);
            objK = c0230o.K();
            obj = C0222k.f3714a;
            if (objK == obj) {
                objK = new p096s.H();
                c0230o.f0(objK);
            }
            p096s.H h7 = (p096s.H) objK;
            h7.a(0, c0230o);
            f9 = f8;
            i11 = i9;
            p096s.w0 w0Var2 = p096s.x0.f12139b;
            C0074p c0074p2 = AbstractC0931y.f12148c;
            j10 = j8;
            e6 = AbstractC0909d.e(h7, 0, 5, w0Var2, AbstractC0909d.i(AbstractC0909d.k(6660, 2, c0074p2)), c0230o, 33208, 16);
            eD = AbstractC0909d.d(h7, 286.0f, AbstractC0909d.i(AbstractC0909d.k(1332, 2, c0074p2)), c0230o);
            K3.e eVar3 = new K3.e();
            eVar3.f2138b = 1332;
            p096s.I iC2 = eVar3.c(Float.valueOf(0.0f), 0);
            C0927u c0927u2 = f2917c;
            iC2.f11853b = c0927u2;
            eVar3.c(Float.valueOf(290.0f), 666);
            eD2 = AbstractC0909d.d(h7, 290.0f, AbstractC0909d.i(new p096s.J(eVar3)), c0230o);
            K3.e eVar4 = new K3.e();
            eVar4.f2138b = 1332;
            eVar4.c(Float.valueOf(0.0f), 666).f11853b = c0927u2;
            eVar4.c(Float.valueOf(290.0f), eVar4.f2138b);
            eD3 = AbstractC0909d.d(h7, 290.0f, AbstractC0909d.i(new p096s.J(eVar4)), c0230o);
            Z.o oVarH2 = androidx.compose.foundation.layout.c.h(E0.i.a(oVar4, true, p101t.r.f12406l), f2916b);
            c0230o.W(821870113);
            if (((i11 & 7168) ^ 3072) > 2048) {
                j11 = j10;
                if (c0230o.e(j11)) {
                    z5 = true;
                }
                boolean zH3 = z5 | c0230o.h(hVar) | c0230o.f(e6) | c0230o.f(eD2) | c0230o.f(eD3) | c0230o.f(eD);
                if ((i11 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = z6 | zH3 | ((((i11 & 112) ^ 48) <= 32 && c0230o.e(j9)) || (i11 & 48) == 32);
                objK2 = c0230o.K();
                if (z7) {
                    j12 = j9;
                    objK2 = new C0170q0(j11, hVar, e6, eD2, eD3, eD, f9, j12);
                    c0230o.f0(objK2);
                } else {
                    j12 = j9;
                    objK2 = new C0170q0(j11, hVar, e6, eD2, eD3, eD, f9, j12);
                    c0230o.f0(objK2);
                }
                c0230o.p(false);
                G4.a.a(oVarH2, (D4.c) objK2, c0230o, 0);
                j13 = j11;
                oVar5 = oVar4;
                f7 = f9;
                j14 = j12;
                i12 = i17;
            } else {
                j11 = j10;
            }
            if ((i11 & 3072) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean zH4 = z5 | c0230o.h(hVar) | c0230o.f(e6) | c0230o.f(eD2) | c0230o.f(eD3) | c0230o.f(eD);
            if ((i11 & 896) == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = z6 | zH4 | ((((i11 & 112) ^ 48) <= 32 && c0230o.e(j9)) || (i11 & 48) == 32);
            objK2 = c0230o.K();
            if (z7) {
                j12 = j9;
                objK2 = new C0170q0(j11, hVar, e6, eD2, eD3, eD, f9, j12);
                c0230o.f0(objK2);
            } else {
                j12 = j9;
                objK2 = new C0170q0(j11, hVar, e6, eD2, eD3, eD, f9, j12);
                c0230o.f0(objK2);
            }
            c0230o.p(false);
            G4.a.a(oVarH2, (D4.c) objK2, c0230o, 0);
            j13 = j11;
            oVar5 = oVar4;
            f7 = f9;
            j14 = j12;
            i12 = i17;
        } else {
            c0230o.R();
            if ((i3 & 1) != 0) {
                if (i13 != 0) {
                    oVar3 = Z.l.f5957a;
                } else {
                    oVar3 = oVar2;
                }
                if ((i6 & 2) != 0) {
                    float f19 = AbstractC0167p0.f2875a;
                    c0230o.W(1803349725);
                    float f110 = M.a.f3120a;
                    jE = F.e(26, c0230o);
                    c0230o.p(false);
                    i9 &= -113;
                }
                if (i15 != 0) {
                    f8 = AbstractC0167p0.f2875a;
                } else {
                    f8 = f7;
                }
                if ((i6 & 8) != 0) {
                    float f111 = AbstractC0167p0.f2875a;
                    c0230o.W(-404222247);
                    j7 = p035g0.r.f9084k;
                    c0230o.p(false);
                    i9 &= -7169;
                }
                i10 = AbstractC0167p0.f2876b;
                j8 = j7;
                oVar4 = oVar3;
                j9 = jE;
            } else {
                if (i13 != 0) {
                    oVar3 = Z.l.f5957a;
                } else {
                    oVar3 = oVar2;
                }
                if ((i6 & 2) != 0) {
                    float f112 = AbstractC0167p0.f2875a;
                    c0230o.W(1803349725);
                    float f113 = M.a.f3120a;
                    jE = F.e(26, c0230o);
                    c0230o.p(false);
                    i9 &= -113;
                }
                if (i15 != 0) {
                    f8 = AbstractC0167p0.f2875a;
                } else {
                    f8 = f7;
                }
                if ((i6 & 8) != 0) {
                    float f114 = AbstractC0167p0.f2875a;
                    c0230o.W(-404222247);
                    j7 = p035g0.r.f9084k;
                    c0230o.p(false);
                    i9 &= -7169;
                }
                i10 = AbstractC0167p0.f2876b;
                j8 = j7;
                oVar4 = oVar3;
                j9 = jE;
            }
            c0230o.q();
            int i18 = i10;
            hVar = new p044i0.h(((S0.b) c0230o.k(AbstractC1124c0.f14367f)).y(f8), 0.0f, i18, 0, 26);
            objK = c0230o.K();
            obj = C0222k.f3714a;
            if (objK == obj) {
                objK = new p096s.H();
                c0230o.f0(objK);
            }
            p096s.H h8 = (p096s.H) objK;
            h8.a(0, c0230o);
            f9 = f8;
            i11 = i9;
            p096s.w0 w0Var3 = p096s.x0.f12139b;
            C0074p c0074p3 = AbstractC0931y.f12148c;
            j10 = j8;
            e6 = AbstractC0909d.e(h8, 0, 5, w0Var3, AbstractC0909d.i(AbstractC0909d.k(6660, 2, c0074p3)), c0230o, 33208, 16);
            eD = AbstractC0909d.d(h8, 286.0f, AbstractC0909d.i(AbstractC0909d.k(1332, 2, c0074p3)), c0230o);
            K3.e eVar5 = new K3.e();
            eVar5.f2138b = 1332;
            p096s.I iC3 = eVar5.c(Float.valueOf(0.0f), 0);
            C0927u c0927u3 = f2917c;
            iC3.f11853b = c0927u3;
            eVar5.c(Float.valueOf(290.0f), 666);
            eD2 = AbstractC0909d.d(h8, 290.0f, AbstractC0909d.i(new p096s.J(eVar5)), c0230o);
            K3.e eVar6 = new K3.e();
            eVar6.f2138b = 1332;
            eVar6.c(Float.valueOf(0.0f), 666).f11853b = c0927u3;
            eVar6.c(Float.valueOf(290.0f), eVar6.f2138b);
            eD3 = AbstractC0909d.d(h8, 290.0f, AbstractC0909d.i(new p096s.J(eVar6)), c0230o);
            Z.o oVarH3 = androidx.compose.foundation.layout.c.h(E0.i.a(oVar4, true, p101t.r.f12406l), f2916b);
            c0230o.W(821870113);
            if (((i11 & 7168) ^ 3072) > 2048) {
                j11 = j10;
                if (c0230o.e(j11)) {
                    z5 = true;
                }
                boolean zH5 = z5 | c0230o.h(hVar) | c0230o.f(e6) | c0230o.f(eD2) | c0230o.f(eD3) | c0230o.f(eD);
                if ((i11 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = z6 | zH5 | ((((i11 & 112) ^ 48) <= 32 && c0230o.e(j9)) || (i11 & 48) == 32);
                objK2 = c0230o.K();
                if (z7) {
                    j12 = j9;
                    objK2 = new C0170q0(j11, hVar, e6, eD2, eD3, eD, f9, j12);
                    c0230o.f0(objK2);
                } else {
                    j12 = j9;
                    objK2 = new C0170q0(j11, hVar, e6, eD2, eD3, eD, f9, j12);
                    c0230o.f0(objK2);
                }
                c0230o.p(false);
                G4.a.a(oVarH3, (D4.c) objK2, c0230o, 0);
                j13 = j11;
                oVar5 = oVar4;
                f7 = f9;
                j14 = j12;
                i12 = i18;
            } else {
                j11 = j10;
            }
            if ((i11 & 3072) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean zH6 = z5 | c0230o.h(hVar) | c0230o.f(e6) | c0230o.f(eD2) | c0230o.f(eD3) | c0230o.f(eD);
            if ((i11 & 896) == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = z6 | zH6 | ((((i11 & 112) ^ 48) <= 32 && c0230o.e(j9)) || (i11 & 48) == 32);
            objK2 = c0230o.K();
            if (z7) {
                j12 = j9;
                objK2 = new C0170q0(j11, hVar, e6, eD2, eD3, eD, f9, j12);
                c0230o.f0(objK2);
            } else {
                j12 = j9;
                objK2 = new C0170q0(j11, hVar, e6, eD2, eD3, eD, f9, j12);
                c0230o.f0(objK2);
            }
            c0230o.p(false);
            G4.a.a(oVarH3, (D4.c) objK2, c0230o, 0);
            j13 = j11;
            oVar5 = oVar4;
            f7 = f9;
            j14 = j12;
            i12 = i18;
        }
        c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0172r0(oVar5, j14, f7, j13, i12, i3, i6);
        }
    }

    public static final void b(p044i0.d dVar, float f6, float f7, long j4, p044i0.h hVar) {
        float f8 = 2;
        float f9 = hVar.f9390a / f8;
        float fD = p030f0.f.d(dVar.f()) - (f8 * f9);
        dVar.a0(j4, f6, f7, p081p0.c.y(f9, f9), S1.h0.f(fD, fD), hVar);
    }
}
