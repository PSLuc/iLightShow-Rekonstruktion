package L;

import B.C0005c0;
import N.C0208d;
import N.C0217h0;
import N.C0222k;
import N.C0230o;
import N.C0235q0;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import okhttp3.internal.http2.Http2;
import p112v.C1016z;
import p123x.C1068a;

/* JADX INFO: loaded from: classes.dex */
public abstract class J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0217h0 f2341a = C0208d.K(Boolean.TRUE, N.U.f3673m);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final N.W0 f2342b = new N.W0(E.f2252m);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f2343c = 16;

    public static final void a(int i, V.a aVar, V.a aVar2, V.a aVar3, V.a aVar4, p123x.a0 a0Var, V.a aVar5, C0230o c0230o, int i3) {
        int i6;
        V.a aVar6;
        p123x.a0 a0Var2;
        V.a aVar7;
        c0230o.X(1307205667);
        if ((i3 & 6) == 0) {
            i6 = (c0230o.d(i) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= c0230o.h(aVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            aVar6 = aVar2;
            i6 |= c0230o.h(aVar6) ? HueLog.LogComponent.STREAMDTLS : 128;
        } else {
            aVar6 = aVar2;
        }
        if ((i3 & 3072) == 0) {
            i6 |= c0230o.h(aVar3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i6 |= c0230o.h(aVar4) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            a0Var2 = a0Var;
            i6 |= c0230o.f(a0Var2) ? 131072 : 65536;
        } else {
            a0Var2 = a0Var;
        }
        if ((1572864 & i3) == 0) {
            aVar7 = aVar5;
            i6 |= c0230o.h(aVar7) ? 1048576 : 524288;
        } else {
            aVar7 = aVar5;
        }
        if ((i6 & 599187) == 599186 && c0230o.B()) {
            c0230o.P();
        } else {
            c0230o.W(1646578117);
            boolean z5 = ((i6 & 896) == 256) | ((i6 & 112) == 32) | ((i6 & 7168) == 2048) | ((458752 & i6) == 131072) | ((57344 & i6) == 16384) | ((i6 & 14) == 4) | ((3670016 & i6) == 1048576);
            Object objK = c0230o.K();
            if (z5 || objK == C0222k.f3714a) {
                E0 e6 = new E0(aVar, aVar3, aVar4, i, a0Var2, aVar7, aVar6, 0);
                c0230o.f0(e6);
                objK = e6;
            }
            c0230o.p(false);
            p113v0.U.b(null, (D4.e) objK, c0230o, 0, 1);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new F0(i, aVar, aVar2, aVar3, aVar4, a0Var, aVar5, i3, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    /* JADX WARN: Code duplicated, block: B:38:0x0096  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:56:0x0167  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void b(Z.o oVar, V.a aVar, V.a aVar2, V.a aVar3, V.a aVar4, int i, long j4, long j6, C1068a c1068a, V.a aVar5, C0230o c0230o, int i3, int i6) {
        V.a aVar6;
        int i7;
        int i8;
        V.a aVar7;
        int i9;
        V.a aVar8;
        V.a aVar9;
        V.a aVar10;
        V.a aVar11;
        long j7;
        long jB;
        C1068a c1068aJ;
        Z.o oVar2;
        boolean zF;
        Object objK;
        C0164o0 c0164o0;
        boolean zF2;
        Object objK2;
        long j8;
        long j9;
        Z.o oVar3;
        C1068a c1068a2;
        V.a aVar12;
        V.a aVar13;
        V.a aVar14;
        V.a aVar15;
        int i10;
        C0235q0 c0235q0T;
        int i11 = 2;
        c0230o.X(-1219521777);
        int i12 = i3 | 6;
        int i13 = i6 & 2;
        if (i13 == 0) {
            if ((i3 & 48) == 0) {
                aVar6 = aVar;
                i12 |= c0230o.h(aVar6) ? 32 : 16;
            }
            i7 = i12 | 3456;
            i8 = i6 & 16;
            if (i8 != 0) {
                if ((i3 & 24576) == 0) {
                    aVar7 = aVar4;
                    if (c0230o.h(aVar7)) {
                        i9 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i9 = 8192;
                    }
                    i7 |= i9;
                }
                if (((i7 | 38469632) & 306783379) == 306783378 || !c0230o.B()) {
                    c0230o.R();
                    if ((i3 & 1) != 0 || c0230o.z()) {
                        Z.l lVar = Z.l.f5957a;
                        if (i13 != 0) {
                            aVar8 = J.f2337a;
                        } else {
                            aVar8 = aVar6;
                        }
                        aVar9 = J.f2338b;
                        aVar10 = J.f2339c;
                        if (i8 != 0) {
                            aVar11 = J.f2340d;
                        } else {
                            aVar11 = aVar7;
                        }
                        j7 = ((D) c0230o.k(F.f2265a)).f2223n;
                        jB = F.b(j7, c0230o);
                        c0230o.W(757124140);
                        c1068aJ = L.j(c0230o);
                        c0230o.p(false);
                        oVar2 = lVar;
                    } else {
                        c0230o.P();
                        oVar2 = oVar;
                        aVar10 = aVar3;
                        i11 = i;
                        j7 = j4;
                        jB = j6;
                        aVar11 = aVar7;
                        aVar8 = aVar6;
                        aVar9 = aVar2;
                        c1068aJ = c1068a;
                    }
                    c0230o.q();
                    c0230o.W(-889185358);
                    zF = c0230o.f(c1068aJ);
                    objK = c0230o.K();
                    Object obj = C0222k.f3714a;
                    if (zF || objK == obj) {
                        objK = new C0164o0(c1068aJ);
                        c0230o.f0(objK);
                    }
                    c0164o0 = (C0164o0) objK;
                    c0230o.p(false);
                    c0230o.W(-889185200);
                    zF2 = c0230o.f(c0164o0) | c0230o.f(c1068aJ);
                    V.a aVar16 = aVar11;
                    objK2 = c0230o.K();
                    if (zF2 || objK2 == obj) {
                        objK2 = new C0005c0(c0164o0, 15, c1068aJ);
                        c0230o.f0(objK2);
                    }
                    c0230o.p(false);
                    p118w0.g gVar = p123x.d0.f13765a;
                    int i14 = i11;
                    V.a aVar17 = aVar8;
                    V.a aVar18 = aVar9;
                    V.a aVar19 = aVar10;
                    long j10 = j7;
                    long j11 = jB;
                    A1.a(Z.a.a(oVar2, new C1016z((D4.c) objK2, 1)), null, j10, j11, 0.0f, 0.0f, V.b.b(c0230o, -1979205334, new G0(i14, aVar17, aVar5, aVar19, aVar16, c0164o0, aVar18)), c0230o, 12582912, 114);
                    j8 = j10;
                    j9 = j11;
                    oVar3 = oVar2;
                    c1068a2 = c1068aJ;
                    aVar12 = aVar17;
                    aVar13 = aVar18;
                    aVar14 = aVar19;
                    aVar15 = aVar16;
                    i10 = i14;
                } else {
                    c0230o.P();
                    oVar3 = oVar;
                    aVar14 = aVar3;
                    i10 = i;
                    j8 = j4;
                    j9 = j6;
                    c1068a2 = c1068a;
                    aVar12 = aVar6;
                    aVar15 = aVar7;
                    aVar13 = aVar2;
                }
                c0235q0T = c0230o.t();
                if (c0235q0T != null) {
                    c0235q0T.f3780d = new H0(oVar3, aVar12, aVar13, aVar14, aVar15, i10, j8, j9, c1068a2, aVar5, i3, i6);
                }
            }
            i7 = i12 | 28032;
            aVar7 = aVar4;
            if (((i7 | 38469632) & 306783379) == 306783378) {
                c0230o.R();
                if ((i3 & 1) != 0) {
                    Z.l lVar2 = Z.l.f5957a;
                    if (i13 != 0) {
                        aVar8 = J.f2337a;
                    } else {
                        aVar8 = aVar6;
                    }
                    aVar9 = J.f2338b;
                    aVar10 = J.f2339c;
                    if (i8 != 0) {
                        aVar11 = J.f2340d;
                    } else {
                        aVar11 = aVar7;
                    }
                    j7 = ((D) c0230o.k(F.f2265a)).f2223n;
                    jB = F.b(j7, c0230o);
                    c0230o.W(757124140);
                    c1068aJ = L.j(c0230o);
                    c0230o.p(false);
                    oVar2 = lVar2;
                } else {
                    Z.l lVar3 = Z.l.f5957a;
                    if (i13 != 0) {
                        aVar8 = J.f2337a;
                    } else {
                        aVar8 = aVar6;
                    }
                    aVar9 = J.f2338b;
                    aVar10 = J.f2339c;
                    if (i8 != 0) {
                        aVar11 = J.f2340d;
                    } else {
                        aVar11 = aVar7;
                    }
                    j7 = ((D) c0230o.k(F.f2265a)).f2223n;
                    jB = F.b(j7, c0230o);
                    c0230o.W(757124140);
                    c1068aJ = L.j(c0230o);
                    c0230o.p(false);
                    oVar2 = lVar3;
                }
                c0230o.q();
                c0230o.W(-889185358);
                zF = c0230o.f(c1068aJ);
                objK = c0230o.K();
                Object obj2 = C0222k.f3714a;
                if (zF) {
                    objK = new C0164o0(c1068aJ);
                    c0230o.f0(objK);
                } else {
                    objK = new C0164o0(c1068aJ);
                    c0230o.f0(objK);
                }
                c0164o0 = (C0164o0) objK;
                c0230o.p(false);
                c0230o.W(-889185200);
                zF2 = c0230o.f(c0164o0) | c0230o.f(c1068aJ);
                V.a aVar110 = aVar11;
                objK2 = c0230o.K();
                if (zF2) {
                    objK2 = new C0005c0(c0164o0, 15, c1068aJ);
                    c0230o.f0(objK2);
                } else {
                    objK2 = new C0005c0(c0164o0, 15, c1068aJ);
                    c0230o.f0(objK2);
                }
                c0230o.p(false);
                p118w0.g gVar2 = p123x.d0.f13765a;
                int i15 = i11;
                V.a aVar111 = aVar8;
                V.a aVar112 = aVar9;
                V.a aVar113 = aVar10;
                long j12 = j7;
                long j13 = jB;
                A1.a(Z.a.a(oVar2, new C1016z((D4.c) objK2, 1)), null, j12, j13, 0.0f, 0.0f, V.b.b(c0230o, -1979205334, new G0(i15, aVar111, aVar5, aVar113, aVar110, c0164o0, aVar112)), c0230o, 12582912, 114);
                j8 = j12;
                j9 = j13;
                oVar3 = oVar2;
                c1068a2 = c1068aJ;
                aVar12 = aVar111;
                aVar13 = aVar112;
                aVar14 = aVar113;
                aVar15 = aVar110;
                i10 = i15;
            } else {
                c0230o.R();
                if ((i3 & 1) != 0) {
                    Z.l lVar4 = Z.l.f5957a;
                    if (i13 != 0) {
                        aVar8 = J.f2337a;
                    } else {
                        aVar8 = aVar6;
                    }
                    aVar9 = J.f2338b;
                    aVar10 = J.f2339c;
                    if (i8 != 0) {
                        aVar11 = J.f2340d;
                    } else {
                        aVar11 = aVar7;
                    }
                    j7 = ((D) c0230o.k(F.f2265a)).f2223n;
                    jB = F.b(j7, c0230o);
                    c0230o.W(757124140);
                    c1068aJ = L.j(c0230o);
                    c0230o.p(false);
                    oVar2 = lVar4;
                } else {
                    Z.l lVar5 = Z.l.f5957a;
                    if (i13 != 0) {
                        aVar8 = J.f2337a;
                    } else {
                        aVar8 = aVar6;
                    }
                    aVar9 = J.f2338b;
                    aVar10 = J.f2339c;
                    if (i8 != 0) {
                        aVar11 = J.f2340d;
                    } else {
                        aVar11 = aVar7;
                    }
                    j7 = ((D) c0230o.k(F.f2265a)).f2223n;
                    jB = F.b(j7, c0230o);
                    c0230o.W(757124140);
                    c1068aJ = L.j(c0230o);
                    c0230o.p(false);
                    oVar2 = lVar5;
                }
                c0230o.q();
                c0230o.W(-889185358);
                zF = c0230o.f(c1068aJ);
                objK = c0230o.K();
                Object obj3 = C0222k.f3714a;
                if (zF) {
                    objK = new C0164o0(c1068aJ);
                    c0230o.f0(objK);
                } else {
                    objK = new C0164o0(c1068aJ);
                    c0230o.f0(objK);
                }
                c0164o0 = (C0164o0) objK;
                c0230o.p(false);
                c0230o.W(-889185200);
                zF2 = c0230o.f(c0164o0) | c0230o.f(c1068aJ);
                V.a aVar114 = aVar11;
                objK2 = c0230o.K();
                if (zF2) {
                    objK2 = new C0005c0(c0164o0, 15, c1068aJ);
                    c0230o.f0(objK2);
                } else {
                    objK2 = new C0005c0(c0164o0, 15, c1068aJ);
                    c0230o.f0(objK2);
                }
                c0230o.p(false);
                p118w0.g gVar3 = p123x.d0.f13765a;
                int i16 = i11;
                V.a aVar115 = aVar8;
                V.a aVar116 = aVar9;
                V.a aVar117 = aVar10;
                long j14 = j7;
                long j15 = jB;
                A1.a(Z.a.a(oVar2, new C1016z((D4.c) objK2, 1)), null, j14, j15, 0.0f, 0.0f, V.b.b(c0230o, -1979205334, new G0(i16, aVar115, aVar5, aVar117, aVar114, c0164o0, aVar116)), c0230o, 12582912, 114);
                j8 = j14;
                j9 = j15;
                oVar3 = oVar2;
                c1068a2 = c1068aJ;
                aVar12 = aVar115;
                aVar13 = aVar116;
                aVar14 = aVar117;
                aVar15 = aVar114;
                i10 = i16;
            }
            c0235q0T = c0230o.t();
            if (c0235q0T != null) {
                c0235q0T.f3780d = new H0(oVar3, aVar12, aVar13, aVar14, aVar15, i10, j8, j9, c1068a2, aVar5, i3, i6);
            }
        }
        i12 = i3 | 54;
        aVar6 = aVar;
        i7 = i12 | 3456;
        i8 = i6 & 16;
        if (i8 != 0) {
            if ((i3 & 24576) == 0) {
                aVar7 = aVar4;
                if (c0230o.h(aVar7)) {
                    i9 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i9 = 8192;
                }
                i7 |= i9;
            }
            if (((i7 | 38469632) & 306783379) == 306783378) {
                c0230o.R();
                if ((i3 & 1) != 0) {
                    Z.l lVar6 = Z.l.f5957a;
                    if (i13 != 0) {
                        aVar8 = J.f2337a;
                    } else {
                        aVar8 = aVar6;
                    }
                    aVar9 = J.f2338b;
                    aVar10 = J.f2339c;
                    if (i8 != 0) {
                        aVar11 = J.f2340d;
                    } else {
                        aVar11 = aVar7;
                    }
                    j7 = ((D) c0230o.k(F.f2265a)).f2223n;
                    jB = F.b(j7, c0230o);
                    c0230o.W(757124140);
                    c1068aJ = L.j(c0230o);
                    c0230o.p(false);
                    oVar2 = lVar6;
                } else {
                    Z.l lVar7 = Z.l.f5957a;
                    if (i13 != 0) {
                        aVar8 = J.f2337a;
                    } else {
                        aVar8 = aVar6;
                    }
                    aVar9 = J.f2338b;
                    aVar10 = J.f2339c;
                    if (i8 != 0) {
                        aVar11 = J.f2340d;
                    } else {
                        aVar11 = aVar7;
                    }
                    j7 = ((D) c0230o.k(F.f2265a)).f2223n;
                    jB = F.b(j7, c0230o);
                    c0230o.W(757124140);
                    c1068aJ = L.j(c0230o);
                    c0230o.p(false);
                    oVar2 = lVar7;
                }
                c0230o.q();
                c0230o.W(-889185358);
                zF = c0230o.f(c1068aJ);
                objK = c0230o.K();
                Object obj4 = C0222k.f3714a;
                if (zF) {
                    objK = new C0164o0(c1068aJ);
                    c0230o.f0(objK);
                } else {
                    objK = new C0164o0(c1068aJ);
                    c0230o.f0(objK);
                }
                c0164o0 = (C0164o0) objK;
                c0230o.p(false);
                c0230o.W(-889185200);
                zF2 = c0230o.f(c0164o0) | c0230o.f(c1068aJ);
                V.a aVar118 = aVar11;
                objK2 = c0230o.K();
                if (zF2) {
                    objK2 = new C0005c0(c0164o0, 15, c1068aJ);
                    c0230o.f0(objK2);
                } else {
                    objK2 = new C0005c0(c0164o0, 15, c1068aJ);
                    c0230o.f0(objK2);
                }
                c0230o.p(false);
                p118w0.g gVar4 = p123x.d0.f13765a;
                int i17 = i11;
                V.a aVar119 = aVar8;
                V.a aVar1110 = aVar9;
                V.a aVar1111 = aVar10;
                long j16 = j7;
                long j17 = jB;
                A1.a(Z.a.a(oVar2, new C1016z((D4.c) objK2, 1)), null, j16, j17, 0.0f, 0.0f, V.b.b(c0230o, -1979205334, new G0(i17, aVar119, aVar5, aVar1111, aVar118, c0164o0, aVar1110)), c0230o, 12582912, 114);
                j8 = j16;
                j9 = j17;
                oVar3 = oVar2;
                c1068a2 = c1068aJ;
                aVar12 = aVar119;
                aVar13 = aVar1110;
                aVar14 = aVar1111;
                aVar15 = aVar118;
                i10 = i17;
            } else {
                c0230o.R();
                if ((i3 & 1) != 0) {
                    Z.l lVar8 = Z.l.f5957a;
                    if (i13 != 0) {
                        aVar8 = J.f2337a;
                    } else {
                        aVar8 = aVar6;
                    }
                    aVar9 = J.f2338b;
                    aVar10 = J.f2339c;
                    if (i8 != 0) {
                        aVar11 = J.f2340d;
                    } else {
                        aVar11 = aVar7;
                    }
                    j7 = ((D) c0230o.k(F.f2265a)).f2223n;
                    jB = F.b(j7, c0230o);
                    c0230o.W(757124140);
                    c1068aJ = L.j(c0230o);
                    c0230o.p(false);
                    oVar2 = lVar8;
                } else {
                    Z.l lVar9 = Z.l.f5957a;
                    if (i13 != 0) {
                        aVar8 = J.f2337a;
                    } else {
                        aVar8 = aVar6;
                    }
                    aVar9 = J.f2338b;
                    aVar10 = J.f2339c;
                    if (i8 != 0) {
                        aVar11 = J.f2340d;
                    } else {
                        aVar11 = aVar7;
                    }
                    j7 = ((D) c0230o.k(F.f2265a)).f2223n;
                    jB = F.b(j7, c0230o);
                    c0230o.W(757124140);
                    c1068aJ = L.j(c0230o);
                    c0230o.p(false);
                    oVar2 = lVar9;
                }
                c0230o.q();
                c0230o.W(-889185358);
                zF = c0230o.f(c1068aJ);
                objK = c0230o.K();
                Object obj5 = C0222k.f3714a;
                if (zF) {
                    objK = new C0164o0(c1068aJ);
                    c0230o.f0(objK);
                } else {
                    objK = new C0164o0(c1068aJ);
                    c0230o.f0(objK);
                }
                c0164o0 = (C0164o0) objK;
                c0230o.p(false);
                c0230o.W(-889185200);
                zF2 = c0230o.f(c0164o0) | c0230o.f(c1068aJ);
                V.a aVar1112 = aVar11;
                objK2 = c0230o.K();
                if (zF2) {
                    objK2 = new C0005c0(c0164o0, 15, c1068aJ);
                    c0230o.f0(objK2);
                } else {
                    objK2 = new C0005c0(c0164o0, 15, c1068aJ);
                    c0230o.f0(objK2);
                }
                c0230o.p(false);
                p118w0.g gVar5 = p123x.d0.f13765a;
                int i18 = i11;
                V.a aVar1113 = aVar8;
                V.a aVar1114 = aVar9;
                V.a aVar1115 = aVar10;
                long j18 = j7;
                long j19 = jB;
                A1.a(Z.a.a(oVar2, new C1016z((D4.c) objK2, 1)), null, j18, j19, 0.0f, 0.0f, V.b.b(c0230o, -1979205334, new G0(i18, aVar1113, aVar5, aVar1115, aVar1112, c0164o0, aVar1114)), c0230o, 12582912, 114);
                j8 = j18;
                j9 = j19;
                oVar3 = oVar2;
                c1068a2 = c1068aJ;
                aVar12 = aVar1113;
                aVar13 = aVar1114;
                aVar14 = aVar1115;
                aVar15 = aVar1112;
                i10 = i18;
            }
            c0235q0T = c0230o.t();
            if (c0235q0T != null) {
                c0235q0T.f3780d = new H0(oVar3, aVar12, aVar13, aVar14, aVar15, i10, j8, j9, c1068a2, aVar5, i3, i6);
            }
        }
        i7 = i12 | 28032;
        aVar7 = aVar4;
        if (((i7 | 38469632) & 306783379) == 306783378) {
            c0230o.R();
            if ((i3 & 1) != 0) {
                Z.l lVar10 = Z.l.f5957a;
                if (i13 != 0) {
                    aVar8 = J.f2337a;
                } else {
                    aVar8 = aVar6;
                }
                aVar9 = J.f2338b;
                aVar10 = J.f2339c;
                if (i8 != 0) {
                    aVar11 = J.f2340d;
                } else {
                    aVar11 = aVar7;
                }
                j7 = ((D) c0230o.k(F.f2265a)).f2223n;
                jB = F.b(j7, c0230o);
                c0230o.W(757124140);
                c1068aJ = L.j(c0230o);
                c0230o.p(false);
                oVar2 = lVar10;
            } else {
                Z.l lVar11 = Z.l.f5957a;
                if (i13 != 0) {
                    aVar8 = J.f2337a;
                } else {
                    aVar8 = aVar6;
                }
                aVar9 = J.f2338b;
                aVar10 = J.f2339c;
                if (i8 != 0) {
                    aVar11 = J.f2340d;
                } else {
                    aVar11 = aVar7;
                }
                j7 = ((D) c0230o.k(F.f2265a)).f2223n;
                jB = F.b(j7, c0230o);
                c0230o.W(757124140);
                c1068aJ = L.j(c0230o);
                c0230o.p(false);
                oVar2 = lVar11;
            }
            c0230o.q();
            c0230o.W(-889185358);
            zF = c0230o.f(c1068aJ);
            objK = c0230o.K();
            Object obj6 = C0222k.f3714a;
            if (zF) {
                objK = new C0164o0(c1068aJ);
                c0230o.f0(objK);
            } else {
                objK = new C0164o0(c1068aJ);
                c0230o.f0(objK);
            }
            c0164o0 = (C0164o0) objK;
            c0230o.p(false);
            c0230o.W(-889185200);
            zF2 = c0230o.f(c0164o0) | c0230o.f(c1068aJ);
            V.a aVar1116 = aVar11;
            objK2 = c0230o.K();
            if (zF2) {
                objK2 = new C0005c0(c0164o0, 15, c1068aJ);
                c0230o.f0(objK2);
            } else {
                objK2 = new C0005c0(c0164o0, 15, c1068aJ);
                c0230o.f0(objK2);
            }
            c0230o.p(false);
            p118w0.g gVar6 = p123x.d0.f13765a;
            int i19 = i11;
            V.a aVar1117 = aVar8;
            V.a aVar1118 = aVar9;
            V.a aVar1119 = aVar10;
            long j110 = j7;
            long j111 = jB;
            A1.a(Z.a.a(oVar2, new C1016z((D4.c) objK2, 1)), null, j110, j111, 0.0f, 0.0f, V.b.b(c0230o, -1979205334, new G0(i19, aVar1117, aVar5, aVar1119, aVar1116, c0164o0, aVar1118)), c0230o, 12582912, 114);
            j8 = j110;
            j9 = j111;
            oVar3 = oVar2;
            c1068a2 = c1068aJ;
            aVar12 = aVar1117;
            aVar13 = aVar1118;
            aVar14 = aVar1119;
            aVar15 = aVar1116;
            i10 = i19;
        } else {
            c0230o.R();
            if ((i3 & 1) != 0) {
                Z.l lVar12 = Z.l.f5957a;
                if (i13 != 0) {
                    aVar8 = J.f2337a;
                } else {
                    aVar8 = aVar6;
                }
                aVar9 = J.f2338b;
                aVar10 = J.f2339c;
                if (i8 != 0) {
                    aVar11 = J.f2340d;
                } else {
                    aVar11 = aVar7;
                }
                j7 = ((D) c0230o.k(F.f2265a)).f2223n;
                jB = F.b(j7, c0230o);
                c0230o.W(757124140);
                c1068aJ = L.j(c0230o);
                c0230o.p(false);
                oVar2 = lVar12;
            } else {
                Z.l lVar13 = Z.l.f5957a;
                if (i13 != 0) {
                    aVar8 = J.f2337a;
                } else {
                    aVar8 = aVar6;
                }
                aVar9 = J.f2338b;
                aVar10 = J.f2339c;
                if (i8 != 0) {
                    aVar11 = J.f2340d;
                } else {
                    aVar11 = aVar7;
                }
                j7 = ((D) c0230o.k(F.f2265a)).f2223n;
                jB = F.b(j7, c0230o);
                c0230o.W(757124140);
                c1068aJ = L.j(c0230o);
                c0230o.p(false);
                oVar2 = lVar13;
            }
            c0230o.q();
            c0230o.W(-889185358);
            zF = c0230o.f(c1068aJ);
            objK = c0230o.K();
            Object obj7 = C0222k.f3714a;
            if (zF) {
                objK = new C0164o0(c1068aJ);
                c0230o.f0(objK);
            } else {
                objK = new C0164o0(c1068aJ);
                c0230o.f0(objK);
            }
            c0164o0 = (C0164o0) objK;
            c0230o.p(false);
            c0230o.W(-889185200);
            zF2 = c0230o.f(c0164o0) | c0230o.f(c1068aJ);
            V.a aVar11110 = aVar11;
            objK2 = c0230o.K();
            if (zF2) {
                objK2 = new C0005c0(c0164o0, 15, c1068aJ);
                c0230o.f0(objK2);
            } else {
                objK2 = new C0005c0(c0164o0, 15, c1068aJ);
                c0230o.f0(objK2);
            }
            c0230o.p(false);
            p118w0.g gVar7 = p123x.d0.f13765a;
            int i110 = i11;
            V.a aVar11111 = aVar8;
            V.a aVar11112 = aVar9;
            V.a aVar11113 = aVar10;
            long j112 = j7;
            long j113 = jB;
            A1.a(Z.a.a(oVar2, new C1016z((D4.c) objK2, 1)), null, j112, j113, 0.0f, 0.0f, V.b.b(c0230o, -1979205334, new G0(i110, aVar11111, aVar5, aVar11113, aVar11110, c0164o0, aVar11112)), c0230o, 12582912, 114);
            j8 = j112;
            j9 = j113;
            oVar3 = oVar2;
            c1068a2 = c1068aJ;
            aVar12 = aVar11111;
            aVar13 = aVar11112;
            aVar14 = aVar11113;
            aVar15 = aVar11110;
            i10 = i110;
        }
        c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new H0(oVar3, aVar12, aVar13, aVar14, aVar15, i10, j8, j9, c1068a2, aVar5, i3, i6);
        }
    }

    public static final void c(int i, V.a aVar, V.a aVar2, V.a aVar3, V.a aVar4, p123x.a0 a0Var, V.a aVar5, C0230o c0230o, int i3) {
        int i6;
        V.a aVar6;
        p123x.a0 a0Var2;
        V.a aVar7;
        c0230o.X(-2037614249);
        if ((i3 & 6) == 0) {
            i6 = (c0230o.d(i) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= c0230o.h(aVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            aVar6 = aVar2;
            i6 |= c0230o.h(aVar6) ? HueLog.LogComponent.STREAMDTLS : 128;
        } else {
            aVar6 = aVar2;
        }
        if ((i3 & 3072) == 0) {
            i6 |= c0230o.h(aVar3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i6 |= c0230o.h(aVar4) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            a0Var2 = a0Var;
            i6 |= c0230o.f(a0Var2) ? 131072 : 65536;
        } else {
            a0Var2 = a0Var;
        }
        if ((1572864 & i3) == 0) {
            aVar7 = aVar5;
            i6 |= c0230o.h(aVar7) ? 1048576 : 524288;
        } else {
            aVar7 = aVar5;
        }
        if ((i6 & 599187) == 599186 && c0230o.B()) {
            c0230o.P();
        } else {
            c0230o.W(-273325894);
            boolean z5 = ((i6 & 896) == 256) | ((i6 & 112) == 32) | ((i6 & 7168) == 2048) | ((458752 & i6) == 131072) | ((57344 & i6) == 16384) | ((i6 & 14) == 4) | ((3670016 & i6) == 1048576);
            Object objK = c0230o.K();
            if (z5 || objK == C0222k.f3714a) {
                E0 e6 = new E0(aVar, aVar3, aVar4, i, a0Var2, aVar7, aVar6, 1);
                c0230o.f0(e6);
                objK = e6;
            }
            c0230o.p(false);
            p113v0.U.b(null, (D4.e) objK, c0230o, 0, 1);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new F0(i, aVar, aVar2, aVar3, aVar4, a0Var, aVar5, i3, 2);
        }
    }

    public static final void d(int i, V.a aVar, V.a aVar2, V.a aVar3, V.a aVar4, p123x.a0 a0Var, V.a aVar5, C0230o c0230o, int i3) {
        int i6;
        c0230o.X(-975511942);
        if ((i3 & 6) == 0) {
            i6 = (c0230o.d(i) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= c0230o.h(aVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= c0230o.h(aVar2) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= c0230o.h(aVar3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i6 |= c0230o.h(aVar4) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i3) == 0) {
            i6 |= c0230o.f(a0Var) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i6 |= c0230o.h(aVar5) ? 1048576 : 524288;
        }
        if ((599187 & i6) == 599186 && c0230o.B()) {
            c0230o.P();
        } else if (((Boolean) f2341a.getValue()).booleanValue()) {
            c0230o.W(-915303637);
            c(i, aVar, aVar2, aVar3, aVar4, a0Var, aVar5, c0230o, i6 & 4194302);
            c0230o.p(false);
        } else {
            c0230o.W(-915303332);
            a(i, aVar, aVar2, aVar3, aVar4, a0Var, aVar5, c0230o, i6 & 4194302);
            c0230o.p(false);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new F0(i, aVar, aVar2, aVar3, aVar4, a0Var, aVar5, i3, 1);
        }
    }
}
