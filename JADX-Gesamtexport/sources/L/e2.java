package L;

import B.AbstractC0029o0;
import B.C0003b0;
import G0.C0110f;
import N.AbstractC0231o0;
import N.C0208d;
import N.C0230o;
import N.C0235q0;
import N.C0247x;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public abstract class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0247x f2713a = new C0247x(E.f2255p);

    public static final void a(G0.J j4, C0230o c0230o, int i) throws Throwable {
        V.a aVar = N3.M.f4041g;
        c0230o.X(-460300127);
        int i3 = (c0230o.f(j4) ? 4 : 2) | i | (c0230o.h(aVar) ? 32 : 16);
        if ((i3 & 19) == 18 && c0230o.B()) {
            c0230o.P();
        } else {
            AbstractC0231o0 abstractC0231o0 = f2713a;
            C0208d.a(abstractC0231o0.a(((G0.J) c0230o.k(abstractC0231o0)).d(j4)), aVar, c0230o, (i3 & 112) | 8);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0003b0(j4, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x014f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0159  */
    /* JADX WARN: Code duplicated, block: B:113:0x017b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x017d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0180  */
    /* JADX WARN: Code duplicated, block: B:117:0x0184  */
    /* JADX WARN: Code duplicated, block: B:119:0x0189  */
    /* JADX WARN: Code duplicated, block: B:122:0x018e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0194  */
    /* JADX WARN: Code duplicated, block: B:129:0x0198  */
    /* JADX WARN: Code duplicated, block: B:130:0x019a  */
    /* JADX WARN: Code duplicated, block: B:132:0x019e  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:144:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:146:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:150:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:151:0x0200  */
    /* JADX WARN: Code duplicated, block: B:155:0x026e  */
    /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x0105  */
    /* JADX WARN: Code duplicated, block: B:90:0x010b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0114  */
    /* JADX WARN: Code duplicated, block: B:95:0x0119  */
    /* JADX WARN: Code duplicated, block: B:98:0x0125  */
    public static final void b(String str, Z.o oVar, long j4, long j6, L0.k kVar, long j7, R0.i iVar, long j8, int i, boolean z5, int i3, int i6, G0.J j9, C0230o c0230o, int i7, int i8, int i9) {
        int i10;
        int i11;
        long j10;
        int i12;
        int i13;
        long j11;
        int i14;
        int i15;
        int i16;
        L0.k kVar2;
        int i17;
        int i18;
        int i19;
        R0.i iVar2;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Z.o oVar2;
        long j12;
        R0.i iVar3;
        boolean z6;
        int i29;
        int i30;
        G0.J j13;
        long j14;
        int i31;
        long j15;
        long jB;
        boolean z7;
        int i32;
        int i33;
        long j16;
        long j17;
        int i34;
        Z.o oVar3;
        boolean z8;
        L0.k kVar3;
        R0.i iVar4;
        long j18;
        long j19;
        G0.J j20;
        int i35;
        C0235q0 c0235q0T;
        int i36;
        c0230o.X(-2055108902);
        if ((i7 & 6) == 0) {
            i10 = (c0230o.f(str) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        int i37 = i9 & 2;
        if (i37 == 0) {
            if ((i7 & 48) == 0) {
                i10 |= c0230o.f(oVar) ? 32 : 16;
            }
            i11 = i9 & 4;
            if (i11 != 0) {
                if ((i7 & 384) == 0) {
                    j10 = j4;
                    if (c0230o.e(j10)) {
                        i12 = HueLog.LogComponent.STREAMDTLS;
                    } else {
                        i12 = 128;
                    }
                    i10 |= i12;
                }
                i13 = i9 & 8;
                if (i13 != 0) {
                    i10 |= 3072;
                    j11 = j6;
                } else {
                    j11 = j6;
                    if ((i7 & 3072) == 0) {
                        if (c0230o.e(j11)) {
                            i14 = 2048;
                        } else {
                            i14 = 1024;
                        }
                        i10 |= i14;
                    }
                }
                i15 = i10 | 24576;
                i16 = i9 & 32;
                if (i16 != 0) {
                    if ((i7 & 196608) == 0) {
                        kVar2 = kVar;
                        if (c0230o.f(kVar2)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i15 |= i17;
                    }
                    i18 = i15 | 114819072;
                    i19 = i9 & HueLog.LogComponent.APPCORE;
                    if (i19 != 0) {
                        if ((805306368 & i7) == 0) {
                            iVar2 = iVar;
                            if (c0230o.f(iVar2)) {
                                i20 = 536870912;
                            } else {
                                i20 = 268435456;
                            }
                            i18 |= i20;
                        }
                        i21 = i8 | 6;
                        i22 = i9 & 2048;
                        if (i22 != 0) {
                            i21 = i8 | 54;
                        } else if ((i8 & 48) == 0) {
                            if (c0230o.d(i)) {
                                i23 = 32;
                            } else {
                                i23 = 16;
                            }
                            i21 |= i23;
                        }
                        i24 = i21;
                        i25 = i24 | 384;
                        i26 = i9 & 8192;
                        if (i26 != 0) {
                            if ((i8 & 3072) == 0) {
                                if (c0230o.d(i3)) {
                                    i27 = 2048;
                                } else {
                                    i27 = 1024;
                                }
                                i25 |= i27;
                            }
                            i28 = i25 | 221184;
                            if ((i8 & 1572864) != 0) {
                                if ((i9 & 65536) == 0 || !c0230o.f(j9)) {
                                    i36 = 524288;
                                } else {
                                    i36 = 1048576;
                                }
                                i28 |= i36;
                            }
                            if ((i18 & 306783379) != 306783378 && (i28 & 599187) == 599186 && c0230o.B()) {
                                c0230o.P();
                                oVar3 = oVar;
                                i35 = i;
                                z8 = z5;
                                i33 = i3;
                                i34 = i6;
                                j20 = j9;
                                iVar4 = iVar2;
                                j16 = j10;
                                j17 = j8;
                                kVar3 = kVar2;
                                j18 = j11;
                                j19 = j7;
                            } else {
                                c0230o.R();
                                if ((i7 & 1) != 0 || c0230o.z()) {
                                    if (i37 != 0) {
                                        oVar2 = Z.l.f5957a;
                                    } else {
                                        oVar2 = oVar;
                                    }
                                    if (i11 != 0) {
                                        j10 = p035g0.r.f9085l;
                                    }
                                    if (i13 != 0) {
                                        j11 = S0.m.f4901c;
                                    }
                                    if (i16 != 0) {
                                        kVar2 = null;
                                    }
                                    j12 = S0.m.f4901c;
                                    iVar3 = i19 == 0 ? iVar2 : null;
                                    z6 = true;
                                    i31 = 1;
                                    if (i22 != 0) {
                                        i29 = 1;
                                    } else {
                                        i29 = i;
                                    }
                                    if (i26 != 0) {
                                        i30 = Integer.MAX_VALUE;
                                    } else {
                                        i30 = i3;
                                    }
                                    if ((i9 & 65536) != 0) {
                                        i28 &= -3670017;
                                        j13 = (G0.J) c0230o.k(f2713a);
                                    } else {
                                        j13 = j9;
                                    }
                                    j14 = j12;
                                } else {
                                    c0230o.P();
                                    if ((i9 & 65536) != 0) {
                                        i28 &= -3670017;
                                    }
                                    oVar2 = oVar;
                                    j12 = j7;
                                    j14 = j8;
                                    i29 = i;
                                    i30 = i3;
                                    i31 = i6;
                                    j13 = j9;
                                    iVar3 = iVar2;
                                    z6 = z5;
                                }
                                c0230o.q();
                                Z.o oVar4 = oVar2;
                                c0230o.W(79582827);
                                j15 = p035g0.r.f9085l;
                                if (j10 != j15) {
                                    i31 = i31;
                                    jB = j10;
                                    z7 = false;
                                } else {
                                    c0230o.W(79582860);
                                    jB = j13.b();
                                    if (jB == j15) {
                                        jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                                    }
                                    z7 = false;
                                    c0230o.p(false);
                                }
                                c0230o.p(z7);
                                if (iVar3 != null) {
                                    i32 = iVar3.f4745a;
                                } else {
                                    i32 = Integer.MIN_VALUE;
                                }
                                long j21 = j14;
                                G0.J j22 = j13;
                                int i38 = i28 << 9;
                                int i39 = i31;
                                int i40 = i30;
                                boolean z9 = z6;
                                int i41 = i29;
                                AbstractC0029o0.b(str, oVar4, G0.J.e(j22, jB, j11, kVar2, j12, i32, j21, 16609104), i41, z9, i40, i39, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i38 & 57344) | 196608 | (i38 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                                i33 = i30;
                                j16 = j10;
                                j17 = j21;
                                i34 = i39;
                                oVar3 = oVar4;
                                z8 = z6;
                                kVar3 = kVar2;
                                int i42 = i29;
                                iVar4 = iVar3;
                                j18 = j11;
                                j19 = j12;
                                j20 = j22;
                                i35 = i42;
                            }
                            c0235q0T = c0230o.t();
                            if (c0235q0T != null) {
                                c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
                            }
                        }
                        i25 = i24 | 3456;
                        i28 = i25 | 221184;
                        if ((i8 & 1572864) != 0) {
                            if ((i9 & 65536) == 0) {
                                i36 = 524288;
                            } else {
                                i36 = 524288;
                            }
                            i28 |= i36;
                        }
                        if ((i18 & 306783379) != 306783378) {
                            c0230o.R();
                            if ((i7 & 1) != 0) {
                                if (i37 != 0) {
                                    oVar2 = Z.l.f5957a;
                                } else {
                                    oVar2 = oVar;
                                }
                                if (i11 != 0) {
                                    j10 = p035g0.r.f9085l;
                                }
                                if (i13 != 0) {
                                    j11 = S0.m.f4901c;
                                }
                                if (i16 != 0) {
                                    kVar2 = null;
                                }
                                j12 = S0.m.f4901c;
                                if (i19 == 0) {
                                }
                                z6 = true;
                                i31 = 1;
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i;
                                }
                                if (i26 != 0) {
                                    i30 = Integer.MAX_VALUE;
                                } else {
                                    i30 = i3;
                                }
                                if ((i9 & 65536) != 0) {
                                    i28 &= -3670017;
                                    j13 = (G0.J) c0230o.k(f2713a);
                                } else {
                                    j13 = j9;
                                }
                                j14 = j12;
                            } else {
                                if (i37 != 0) {
                                    oVar2 = Z.l.f5957a;
                                } else {
                                    oVar2 = oVar;
                                }
                                if (i11 != 0) {
                                    j10 = p035g0.r.f9085l;
                                }
                                if (i13 != 0) {
                                    j11 = S0.m.f4901c;
                                }
                                if (i16 != 0) {
                                    kVar2 = null;
                                }
                                j12 = S0.m.f4901c;
                                if (i19 == 0) {
                                }
                                z6 = true;
                                i31 = 1;
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i;
                                }
                                if (i26 != 0) {
                                    i30 = Integer.MAX_VALUE;
                                } else {
                                    i30 = i3;
                                }
                                if ((i9 & 65536) != 0) {
                                    i28 &= -3670017;
                                    j13 = (G0.J) c0230o.k(f2713a);
                                } else {
                                    j13 = j9;
                                }
                                j14 = j12;
                            }
                            c0230o.q();
                            Z.o oVar5 = oVar2;
                            c0230o.W(79582827);
                            j15 = p035g0.r.f9085l;
                            if (j10 != j15) {
                                i31 = i31;
                                jB = j10;
                                z7 = false;
                            } else {
                                c0230o.W(79582860);
                                jB = j13.b();
                                if (jB == j15) {
                                    jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                                }
                                z7 = false;
                                c0230o.p(false);
                            }
                            c0230o.p(z7);
                            if (iVar3 != null) {
                                i32 = iVar3.f4745a;
                            } else {
                                i32 = Integer.MIN_VALUE;
                            }
                            long j23 = j14;
                            G0.J j24 = j13;
                            int i310 = i28 << 9;
                            int i311 = i31;
                            int i43 = i30;
                            boolean z10 = z6;
                            int i44 = i29;
                            AbstractC0029o0.b(str, oVar5, G0.J.e(j24, jB, j11, kVar2, j12, i32, j23, 16609104), i44, z10, i43, i311, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i310 & 57344) | 196608 | (i310 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                            i33 = i30;
                            j16 = j10;
                            j17 = j23;
                            i34 = i311;
                            oVar3 = oVar5;
                            z8 = z6;
                            kVar3 = kVar2;
                            int i45 = i29;
                            iVar4 = iVar3;
                            j18 = j11;
                            j19 = j12;
                            j20 = j24;
                            i35 = i45;
                        } else {
                            c0230o.R();
                            if ((i7 & 1) != 0) {
                                if (i37 != 0) {
                                    oVar2 = Z.l.f5957a;
                                } else {
                                    oVar2 = oVar;
                                }
                                if (i11 != 0) {
                                    j10 = p035g0.r.f9085l;
                                }
                                if (i13 != 0) {
                                    j11 = S0.m.f4901c;
                                }
                                if (i16 != 0) {
                                    kVar2 = null;
                                }
                                j12 = S0.m.f4901c;
                                if (i19 == 0) {
                                }
                                z6 = true;
                                i31 = 1;
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i;
                                }
                                if (i26 != 0) {
                                    i30 = Integer.MAX_VALUE;
                                } else {
                                    i30 = i3;
                                }
                                if ((i9 & 65536) != 0) {
                                    i28 &= -3670017;
                                    j13 = (G0.J) c0230o.k(f2713a);
                                } else {
                                    j13 = j9;
                                }
                                j14 = j12;
                            } else {
                                if (i37 != 0) {
                                    oVar2 = Z.l.f5957a;
                                } else {
                                    oVar2 = oVar;
                                }
                                if (i11 != 0) {
                                    j10 = p035g0.r.f9085l;
                                }
                                if (i13 != 0) {
                                    j11 = S0.m.f4901c;
                                }
                                if (i16 != 0) {
                                    kVar2 = null;
                                }
                                j12 = S0.m.f4901c;
                                if (i19 == 0) {
                                }
                                z6 = true;
                                i31 = 1;
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i;
                                }
                                if (i26 != 0) {
                                    i30 = Integer.MAX_VALUE;
                                } else {
                                    i30 = i3;
                                }
                                if ((i9 & 65536) != 0) {
                                    i28 &= -3670017;
                                    j13 = (G0.J) c0230o.k(f2713a);
                                } else {
                                    j13 = j9;
                                }
                                j14 = j12;
                            }
                            c0230o.q();
                            Z.o oVar6 = oVar2;
                            c0230o.W(79582827);
                            j15 = p035g0.r.f9085l;
                            if (j10 != j15) {
                                i31 = i31;
                                jB = j10;
                                z7 = false;
                            } else {
                                c0230o.W(79582860);
                                jB = j13.b();
                                if (jB == j15) {
                                    jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                                }
                                z7 = false;
                                c0230o.p(false);
                            }
                            c0230o.p(z7);
                            if (iVar3 != null) {
                                i32 = iVar3.f4745a;
                            } else {
                                i32 = Integer.MIN_VALUE;
                            }
                            long j25 = j14;
                            G0.J j26 = j13;
                            int i312 = i28 << 9;
                            int i313 = i31;
                            int i46 = i30;
                            boolean z11 = z6;
                            int i47 = i29;
                            AbstractC0029o0.b(str, oVar6, G0.J.e(j26, jB, j11, kVar2, j12, i32, j25, 16609104), i47, z11, i46, i313, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i312 & 57344) | 196608 | (i312 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                            i33 = i30;
                            j16 = j10;
                            j17 = j25;
                            i34 = i313;
                            oVar3 = oVar6;
                            z8 = z6;
                            kVar3 = kVar2;
                            int i48 = i29;
                            iVar4 = iVar3;
                            j18 = j11;
                            j19 = j12;
                            j20 = j26;
                            i35 = i48;
                        }
                        c0235q0T = c0230o.t();
                        if (c0235q0T != null) {
                            c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
                        }
                    }
                    i18 = i15 | 920125440;
                    iVar2 = iVar;
                    i21 = i8 | 6;
                    i22 = i9 & 2048;
                    if (i22 != 0) {
                        i21 = i8 | 54;
                    } else if ((i8 & 48) == 0) {
                        if (c0230o.d(i)) {
                            i23 = 32;
                        } else {
                            i23 = 16;
                        }
                        i21 |= i23;
                    }
                    i24 = i21;
                    i25 = i24 | 384;
                    i26 = i9 & 8192;
                    if (i26 != 0) {
                        if ((i8 & 3072) == 0) {
                            if (c0230o.d(i3)) {
                                i27 = 2048;
                            } else {
                                i27 = 1024;
                            }
                            i25 |= i27;
                        }
                        i28 = i25 | 221184;
                        if ((i8 & 1572864) != 0) {
                            if ((i9 & 65536) == 0) {
                                i36 = 524288;
                            } else {
                                i36 = 524288;
                            }
                            i28 |= i36;
                        }
                        if ((i18 & 306783379) != 306783378) {
                            c0230o.R();
                            if ((i7 & 1) != 0) {
                                if (i37 != 0) {
                                    oVar2 = Z.l.f5957a;
                                } else {
                                    oVar2 = oVar;
                                }
                                if (i11 != 0) {
                                    j10 = p035g0.r.f9085l;
                                }
                                if (i13 != 0) {
                                    j11 = S0.m.f4901c;
                                }
                                if (i16 != 0) {
                                    kVar2 = null;
                                }
                                j12 = S0.m.f4901c;
                                if (i19 == 0) {
                                }
                                z6 = true;
                                i31 = 1;
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i;
                                }
                                if (i26 != 0) {
                                    i30 = Integer.MAX_VALUE;
                                } else {
                                    i30 = i3;
                                }
                                if ((i9 & 65536) != 0) {
                                    i28 &= -3670017;
                                    j13 = (G0.J) c0230o.k(f2713a);
                                } else {
                                    j13 = j9;
                                }
                                j14 = j12;
                            } else {
                                if (i37 != 0) {
                                    oVar2 = Z.l.f5957a;
                                } else {
                                    oVar2 = oVar;
                                }
                                if (i11 != 0) {
                                    j10 = p035g0.r.f9085l;
                                }
                                if (i13 != 0) {
                                    j11 = S0.m.f4901c;
                                }
                                if (i16 != 0) {
                                    kVar2 = null;
                                }
                                j12 = S0.m.f4901c;
                                if (i19 == 0) {
                                }
                                z6 = true;
                                i31 = 1;
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i;
                                }
                                if (i26 != 0) {
                                    i30 = Integer.MAX_VALUE;
                                } else {
                                    i30 = i3;
                                }
                                if ((i9 & 65536) != 0) {
                                    i28 &= -3670017;
                                    j13 = (G0.J) c0230o.k(f2713a);
                                } else {
                                    j13 = j9;
                                }
                                j14 = j12;
                            }
                            c0230o.q();
                            Z.o oVar7 = oVar2;
                            c0230o.W(79582827);
                            j15 = p035g0.r.f9085l;
                            if (j10 != j15) {
                                i31 = i31;
                                jB = j10;
                                z7 = false;
                            } else {
                                c0230o.W(79582860);
                                jB = j13.b();
                                if (jB == j15) {
                                    jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                                }
                                z7 = false;
                                c0230o.p(false);
                            }
                            c0230o.p(z7);
                            if (iVar3 != null) {
                                i32 = iVar3.f4745a;
                            } else {
                                i32 = Integer.MIN_VALUE;
                            }
                            long j27 = j14;
                            G0.J j28 = j13;
                            int i314 = i28 << 9;
                            int i315 = i31;
                            int i49 = i30;
                            boolean z12 = z6;
                            int i410 = i29;
                            AbstractC0029o0.b(str, oVar7, G0.J.e(j28, jB, j11, kVar2, j12, i32, j27, 16609104), i410, z12, i49, i315, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i314 & 57344) | 196608 | (i314 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                            i33 = i30;
                            j16 = j10;
                            j17 = j27;
                            i34 = i315;
                            oVar3 = oVar7;
                            z8 = z6;
                            kVar3 = kVar2;
                            int i411 = i29;
                            iVar4 = iVar3;
                            j18 = j11;
                            j19 = j12;
                            j20 = j28;
                            i35 = i411;
                        } else {
                            c0230o.R();
                            if ((i7 & 1) != 0) {
                                if (i37 != 0) {
                                    oVar2 = Z.l.f5957a;
                                } else {
                                    oVar2 = oVar;
                                }
                                if (i11 != 0) {
                                    j10 = p035g0.r.f9085l;
                                }
                                if (i13 != 0) {
                                    j11 = S0.m.f4901c;
                                }
                                if (i16 != 0) {
                                    kVar2 = null;
                                }
                                j12 = S0.m.f4901c;
                                if (i19 == 0) {
                                }
                                z6 = true;
                                i31 = 1;
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i;
                                }
                                if (i26 != 0) {
                                    i30 = Integer.MAX_VALUE;
                                } else {
                                    i30 = i3;
                                }
                                if ((i9 & 65536) != 0) {
                                    i28 &= -3670017;
                                    j13 = (G0.J) c0230o.k(f2713a);
                                } else {
                                    j13 = j9;
                                }
                                j14 = j12;
                            } else {
                                if (i37 != 0) {
                                    oVar2 = Z.l.f5957a;
                                } else {
                                    oVar2 = oVar;
                                }
                                if (i11 != 0) {
                                    j10 = p035g0.r.f9085l;
                                }
                                if (i13 != 0) {
                                    j11 = S0.m.f4901c;
                                }
                                if (i16 != 0) {
                                    kVar2 = null;
                                }
                                j12 = S0.m.f4901c;
                                if (i19 == 0) {
                                }
                                z6 = true;
                                i31 = 1;
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i;
                                }
                                if (i26 != 0) {
                                    i30 = Integer.MAX_VALUE;
                                } else {
                                    i30 = i3;
                                }
                                if ((i9 & 65536) != 0) {
                                    i28 &= -3670017;
                                    j13 = (G0.J) c0230o.k(f2713a);
                                } else {
                                    j13 = j9;
                                }
                                j14 = j12;
                            }
                            c0230o.q();
                            Z.o oVar8 = oVar2;
                            c0230o.W(79582827);
                            j15 = p035g0.r.f9085l;
                            if (j10 != j15) {
                                i31 = i31;
                                jB = j10;
                                z7 = false;
                            } else {
                                c0230o.W(79582860);
                                jB = j13.b();
                                if (jB == j15) {
                                    jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                                }
                                z7 = false;
                                c0230o.p(false);
                            }
                            c0230o.p(z7);
                            if (iVar3 != null) {
                                i32 = iVar3.f4745a;
                            } else {
                                i32 = Integer.MIN_VALUE;
                            }
                            long j29 = j14;
                            G0.J j210 = j13;
                            int i316 = i28 << 9;
                            int i317 = i31;
                            int i412 = i30;
                            boolean z13 = z6;
                            int i413 = i29;
                            AbstractC0029o0.b(str, oVar8, G0.J.e(j210, jB, j11, kVar2, j12, i32, j29, 16609104), i413, z13, i412, i317, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i316 & 57344) | 196608 | (i316 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                            i33 = i30;
                            j16 = j10;
                            j17 = j29;
                            i34 = i317;
                            oVar3 = oVar8;
                            z8 = z6;
                            kVar3 = kVar2;
                            int i414 = i29;
                            iVar4 = iVar3;
                            j18 = j11;
                            j19 = j12;
                            j20 = j210;
                            i35 = i414;
                        }
                        c0235q0T = c0230o.t();
                        if (c0235q0T != null) {
                            c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
                        }
                    }
                    i25 = i24 | 3456;
                    i28 = i25 | 221184;
                    if ((i8 & 1572864) != 0) {
                        if ((i9 & 65536) == 0) {
                            i36 = 524288;
                        } else {
                            i36 = 524288;
                        }
                        i28 |= i36;
                    }
                    if ((i18 & 306783379) != 306783378) {
                        c0230o.R();
                        if ((i7 & 1) != 0) {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        } else {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        }
                        c0230o.q();
                        Z.o oVar9 = oVar2;
                        c0230o.W(79582827);
                        j15 = p035g0.r.f9085l;
                        if (j10 != j15) {
                            i31 = i31;
                            jB = j10;
                            z7 = false;
                        } else {
                            c0230o.W(79582860);
                            jB = j13.b();
                            if (jB == j15) {
                                jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                            }
                            z7 = false;
                            c0230o.p(false);
                        }
                        c0230o.p(z7);
                        if (iVar3 != null) {
                            i32 = iVar3.f4745a;
                        } else {
                            i32 = Integer.MIN_VALUE;
                        }
                        long j211 = j14;
                        G0.J j212 = j13;
                        int i318 = i28 << 9;
                        int i319 = i31;
                        int i415 = i30;
                        boolean z14 = z6;
                        int i416 = i29;
                        AbstractC0029o0.b(str, oVar9, G0.J.e(j212, jB, j11, kVar2, j12, i32, j211, 16609104), i416, z14, i415, i319, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i318 & 57344) | 196608 | (i318 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                        i33 = i30;
                        j16 = j10;
                        j17 = j211;
                        i34 = i319;
                        oVar3 = oVar9;
                        z8 = z6;
                        kVar3 = kVar2;
                        int i417 = i29;
                        iVar4 = iVar3;
                        j18 = j11;
                        j19 = j12;
                        j20 = j212;
                        i35 = i417;
                    } else {
                        c0230o.R();
                        if ((i7 & 1) != 0) {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        } else {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        }
                        c0230o.q();
                        Z.o oVar10 = oVar2;
                        c0230o.W(79582827);
                        j15 = p035g0.r.f9085l;
                        if (j10 != j15) {
                            i31 = i31;
                            jB = j10;
                            z7 = false;
                        } else {
                            c0230o.W(79582860);
                            jB = j13.b();
                            if (jB == j15) {
                                jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                            }
                            z7 = false;
                            c0230o.p(false);
                        }
                        c0230o.p(z7);
                        if (iVar3 != null) {
                            i32 = iVar3.f4745a;
                        } else {
                            i32 = Integer.MIN_VALUE;
                        }
                        long j213 = j14;
                        G0.J j214 = j13;
                        int i3110 = i28 << 9;
                        int i3111 = i31;
                        int i418 = i30;
                        boolean z15 = z6;
                        int i419 = i29;
                        AbstractC0029o0.b(str, oVar10, G0.J.e(j214, jB, j11, kVar2, j12, i32, j213, 16609104), i419, z15, i418, i3111, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i3110 & 57344) | 196608 | (i3110 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                        i33 = i30;
                        j16 = j10;
                        j17 = j213;
                        i34 = i3111;
                        oVar3 = oVar10;
                        z8 = z6;
                        kVar3 = kVar2;
                        int i4110 = i29;
                        iVar4 = iVar3;
                        j18 = j11;
                        j19 = j12;
                        j20 = j214;
                        i35 = i4110;
                    }
                    c0235q0T = c0230o.t();
                    if (c0235q0T != null) {
                        c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
                    }
                }
                i15 = i10 | 221184;
                kVar2 = kVar;
                i18 = i15 | 114819072;
                i19 = i9 & HueLog.LogComponent.APPCORE;
                if (i19 != 0) {
                    if ((805306368 & i7) == 0) {
                        iVar2 = iVar;
                        if (c0230o.f(iVar2)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i18 |= i20;
                    }
                    i21 = i8 | 6;
                    i22 = i9 & 2048;
                    if (i22 != 0) {
                        i21 = i8 | 54;
                    } else if ((i8 & 48) == 0) {
                        if (c0230o.d(i)) {
                            i23 = 32;
                        } else {
                            i23 = 16;
                        }
                        i21 |= i23;
                    }
                    i24 = i21;
                    i25 = i24 | 384;
                    i26 = i9 & 8192;
                    if (i26 != 0) {
                        if ((i8 & 3072) == 0) {
                            if (c0230o.d(i3)) {
                                i27 = 2048;
                            } else {
                                i27 = 1024;
                            }
                            i25 |= i27;
                        }
                        i28 = i25 | 221184;
                        if ((i8 & 1572864) != 0) {
                            if ((i9 & 65536) == 0) {
                                i36 = 524288;
                            } else {
                                i36 = 524288;
                            }
                            i28 |= i36;
                        }
                        if ((i18 & 306783379) != 306783378) {
                            c0230o.R();
                            if ((i7 & 1) != 0) {
                                if (i37 != 0) {
                                    oVar2 = Z.l.f5957a;
                                } else {
                                    oVar2 = oVar;
                                }
                                if (i11 != 0) {
                                    j10 = p035g0.r.f9085l;
                                }
                                if (i13 != 0) {
                                    j11 = S0.m.f4901c;
                                }
                                if (i16 != 0) {
                                    kVar2 = null;
                                }
                                j12 = S0.m.f4901c;
                                if (i19 == 0) {
                                }
                                z6 = true;
                                i31 = 1;
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i;
                                }
                                if (i26 != 0) {
                                    i30 = Integer.MAX_VALUE;
                                } else {
                                    i30 = i3;
                                }
                                if ((i9 & 65536) != 0) {
                                    i28 &= -3670017;
                                    j13 = (G0.J) c0230o.k(f2713a);
                                } else {
                                    j13 = j9;
                                }
                                j14 = j12;
                            } else {
                                if (i37 != 0) {
                                    oVar2 = Z.l.f5957a;
                                } else {
                                    oVar2 = oVar;
                                }
                                if (i11 != 0) {
                                    j10 = p035g0.r.f9085l;
                                }
                                if (i13 != 0) {
                                    j11 = S0.m.f4901c;
                                }
                                if (i16 != 0) {
                                    kVar2 = null;
                                }
                                j12 = S0.m.f4901c;
                                if (i19 == 0) {
                                }
                                z6 = true;
                                i31 = 1;
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i;
                                }
                                if (i26 != 0) {
                                    i30 = Integer.MAX_VALUE;
                                } else {
                                    i30 = i3;
                                }
                                if ((i9 & 65536) != 0) {
                                    i28 &= -3670017;
                                    j13 = (G0.J) c0230o.k(f2713a);
                                } else {
                                    j13 = j9;
                                }
                                j14 = j12;
                            }
                            c0230o.q();
                            Z.o oVar11 = oVar2;
                            c0230o.W(79582827);
                            j15 = p035g0.r.f9085l;
                            if (j10 != j15) {
                                i31 = i31;
                                jB = j10;
                                z7 = false;
                            } else {
                                c0230o.W(79582860);
                                jB = j13.b();
                                if (jB == j15) {
                                    jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                                }
                                z7 = false;
                                c0230o.p(false);
                            }
                            c0230o.p(z7);
                            if (iVar3 != null) {
                                i32 = iVar3.f4745a;
                            } else {
                                i32 = Integer.MIN_VALUE;
                            }
                            long j215 = j14;
                            G0.J j216 = j13;
                            int i3112 = i28 << 9;
                            int i3113 = i31;
                            int i4111 = i30;
                            boolean z16 = z6;
                            int i4112 = i29;
                            AbstractC0029o0.b(str, oVar11, G0.J.e(j216, jB, j11, kVar2, j12, i32, j215, 16609104), i4112, z16, i4111, i3113, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i3112 & 57344) | 196608 | (i3112 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                            i33 = i30;
                            j16 = j10;
                            j17 = j215;
                            i34 = i3113;
                            oVar3 = oVar11;
                            z8 = z6;
                            kVar3 = kVar2;
                            int i4113 = i29;
                            iVar4 = iVar3;
                            j18 = j11;
                            j19 = j12;
                            j20 = j216;
                            i35 = i4113;
                        } else {
                            c0230o.R();
                            if ((i7 & 1) != 0) {
                                if (i37 != 0) {
                                    oVar2 = Z.l.f5957a;
                                } else {
                                    oVar2 = oVar;
                                }
                                if (i11 != 0) {
                                    j10 = p035g0.r.f9085l;
                                }
                                if (i13 != 0) {
                                    j11 = S0.m.f4901c;
                                }
                                if (i16 != 0) {
                                    kVar2 = null;
                                }
                                j12 = S0.m.f4901c;
                                if (i19 == 0) {
                                }
                                z6 = true;
                                i31 = 1;
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i;
                                }
                                if (i26 != 0) {
                                    i30 = Integer.MAX_VALUE;
                                } else {
                                    i30 = i3;
                                }
                                if ((i9 & 65536) != 0) {
                                    i28 &= -3670017;
                                    j13 = (G0.J) c0230o.k(f2713a);
                                } else {
                                    j13 = j9;
                                }
                                j14 = j12;
                            } else {
                                if (i37 != 0) {
                                    oVar2 = Z.l.f5957a;
                                } else {
                                    oVar2 = oVar;
                                }
                                if (i11 != 0) {
                                    j10 = p035g0.r.f9085l;
                                }
                                if (i13 != 0) {
                                    j11 = S0.m.f4901c;
                                }
                                if (i16 != 0) {
                                    kVar2 = null;
                                }
                                j12 = S0.m.f4901c;
                                if (i19 == 0) {
                                }
                                z6 = true;
                                i31 = 1;
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i;
                                }
                                if (i26 != 0) {
                                    i30 = Integer.MAX_VALUE;
                                } else {
                                    i30 = i3;
                                }
                                if ((i9 & 65536) != 0) {
                                    i28 &= -3670017;
                                    j13 = (G0.J) c0230o.k(f2713a);
                                } else {
                                    j13 = j9;
                                }
                                j14 = j12;
                            }
                            c0230o.q();
                            Z.o oVar12 = oVar2;
                            c0230o.W(79582827);
                            j15 = p035g0.r.f9085l;
                            if (j10 != j15) {
                                i31 = i31;
                                jB = j10;
                                z7 = false;
                            } else {
                                c0230o.W(79582860);
                                jB = j13.b();
                                if (jB == j15) {
                                    jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                                }
                                z7 = false;
                                c0230o.p(false);
                            }
                            c0230o.p(z7);
                            if (iVar3 != null) {
                                i32 = iVar3.f4745a;
                            } else {
                                i32 = Integer.MIN_VALUE;
                            }
                            long j217 = j14;
                            G0.J j218 = j13;
                            int i3114 = i28 << 9;
                            int i3115 = i31;
                            int i4114 = i30;
                            boolean z17 = z6;
                            int i4115 = i29;
                            AbstractC0029o0.b(str, oVar12, G0.J.e(j218, jB, j11, kVar2, j12, i32, j217, 16609104), i4115, z17, i4114, i3115, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i3114 & 57344) | 196608 | (i3114 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                            i33 = i30;
                            j16 = j10;
                            j17 = j217;
                            i34 = i3115;
                            oVar3 = oVar12;
                            z8 = z6;
                            kVar3 = kVar2;
                            int i4116 = i29;
                            iVar4 = iVar3;
                            j18 = j11;
                            j19 = j12;
                            j20 = j218;
                            i35 = i4116;
                        }
                        c0235q0T = c0230o.t();
                        if (c0235q0T != null) {
                            c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
                        }
                    }
                    i25 = i24 | 3456;
                    i28 = i25 | 221184;
                    if ((i8 & 1572864) != 0) {
                        if ((i9 & 65536) == 0) {
                            i36 = 524288;
                        } else {
                            i36 = 524288;
                        }
                        i28 |= i36;
                    }
                    if ((i18 & 306783379) != 306783378) {
                        c0230o.R();
                        if ((i7 & 1) != 0) {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        } else {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        }
                        c0230o.q();
                        Z.o oVar13 = oVar2;
                        c0230o.W(79582827);
                        j15 = p035g0.r.f9085l;
                        if (j10 != j15) {
                            i31 = i31;
                            jB = j10;
                            z7 = false;
                        } else {
                            c0230o.W(79582860);
                            jB = j13.b();
                            if (jB == j15) {
                                jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                            }
                            z7 = false;
                            c0230o.p(false);
                        }
                        c0230o.p(z7);
                        if (iVar3 != null) {
                            i32 = iVar3.f4745a;
                        } else {
                            i32 = Integer.MIN_VALUE;
                        }
                        long j219 = j14;
                        G0.J j2110 = j13;
                        int i3116 = i28 << 9;
                        int i3117 = i31;
                        int i4117 = i30;
                        boolean z18 = z6;
                        int i4118 = i29;
                        AbstractC0029o0.b(str, oVar13, G0.J.e(j2110, jB, j11, kVar2, j12, i32, j219, 16609104), i4118, z18, i4117, i3117, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i3116 & 57344) | 196608 | (i3116 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                        i33 = i30;
                        j16 = j10;
                        j17 = j219;
                        i34 = i3117;
                        oVar3 = oVar13;
                        z8 = z6;
                        kVar3 = kVar2;
                        int i4119 = i29;
                        iVar4 = iVar3;
                        j18 = j11;
                        j19 = j12;
                        j20 = j2110;
                        i35 = i4119;
                    } else {
                        c0230o.R();
                        if ((i7 & 1) != 0) {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        } else {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        }
                        c0230o.q();
                        Z.o oVar14 = oVar2;
                        c0230o.W(79582827);
                        j15 = p035g0.r.f9085l;
                        if (j10 != j15) {
                            i31 = i31;
                            jB = j10;
                            z7 = false;
                        } else {
                            c0230o.W(79582860);
                            jB = j13.b();
                            if (jB == j15) {
                                jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                            }
                            z7 = false;
                            c0230o.p(false);
                        }
                        c0230o.p(z7);
                        if (iVar3 != null) {
                            i32 = iVar3.f4745a;
                        } else {
                            i32 = Integer.MIN_VALUE;
                        }
                        long j2111 = j14;
                        G0.J j2112 = j13;
                        int i3118 = i28 << 9;
                        int i3119 = i31;
                        int i41110 = i30;
                        boolean z19 = z6;
                        int i41111 = i29;
                        AbstractC0029o0.b(str, oVar14, G0.J.e(j2112, jB, j11, kVar2, j12, i32, j2111, 16609104), i41111, z19, i41110, i3119, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i3118 & 57344) | 196608 | (i3118 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                        i33 = i30;
                        j16 = j10;
                        j17 = j2111;
                        i34 = i3119;
                        oVar3 = oVar14;
                        z8 = z6;
                        kVar3 = kVar2;
                        int i41112 = i29;
                        iVar4 = iVar3;
                        j18 = j11;
                        j19 = j12;
                        j20 = j2112;
                        i35 = i41112;
                    }
                    c0235q0T = c0230o.t();
                    if (c0235q0T != null) {
                        c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
                    }
                }
                i18 = i15 | 920125440;
                iVar2 = iVar;
                i21 = i8 | 6;
                i22 = i9 & 2048;
                if (i22 != 0) {
                    i21 = i8 | 54;
                } else if ((i8 & 48) == 0) {
                    if (c0230o.d(i)) {
                        i23 = 32;
                    } else {
                        i23 = 16;
                    }
                    i21 |= i23;
                }
                i24 = i21;
                i25 = i24 | 384;
                i26 = i9 & 8192;
                if (i26 != 0) {
                    if ((i8 & 3072) == 0) {
                        if (c0230o.d(i3)) {
                            i27 = 2048;
                        } else {
                            i27 = 1024;
                        }
                        i25 |= i27;
                    }
                    i28 = i25 | 221184;
                    if ((i8 & 1572864) != 0) {
                        if ((i9 & 65536) == 0) {
                            i36 = 524288;
                        } else {
                            i36 = 524288;
                        }
                        i28 |= i36;
                    }
                    if ((i18 & 306783379) != 306783378) {
                        c0230o.R();
                        if ((i7 & 1) != 0) {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        } else {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        }
                        c0230o.q();
                        Z.o oVar15 = oVar2;
                        c0230o.W(79582827);
                        j15 = p035g0.r.f9085l;
                        if (j10 != j15) {
                            i31 = i31;
                            jB = j10;
                            z7 = false;
                        } else {
                            c0230o.W(79582860);
                            jB = j13.b();
                            if (jB == j15) {
                                jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                            }
                            z7 = false;
                            c0230o.p(false);
                        }
                        c0230o.p(z7);
                        if (iVar3 != null) {
                            i32 = iVar3.f4745a;
                        } else {
                            i32 = Integer.MIN_VALUE;
                        }
                        long j2113 = j14;
                        G0.J j2114 = j13;
                        int i31110 = i28 << 9;
                        int i31111 = i31;
                        int i41113 = i30;
                        boolean z110 = z6;
                        int i41114 = i29;
                        AbstractC0029o0.b(str, oVar15, G0.J.e(j2114, jB, j11, kVar2, j12, i32, j2113, 16609104), i41114, z110, i41113, i31111, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i31110 & 57344) | 196608 | (i31110 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                        i33 = i30;
                        j16 = j10;
                        j17 = j2113;
                        i34 = i31111;
                        oVar3 = oVar15;
                        z8 = z6;
                        kVar3 = kVar2;
                        int i41115 = i29;
                        iVar4 = iVar3;
                        j18 = j11;
                        j19 = j12;
                        j20 = j2114;
                        i35 = i41115;
                    } else {
                        c0230o.R();
                        if ((i7 & 1) != 0) {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        } else {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        }
                        c0230o.q();
                        Z.o oVar16 = oVar2;
                        c0230o.W(79582827);
                        j15 = p035g0.r.f9085l;
                        if (j10 != j15) {
                            i31 = i31;
                            jB = j10;
                            z7 = false;
                        } else {
                            c0230o.W(79582860);
                            jB = j13.b();
                            if (jB == j15) {
                                jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                            }
                            z7 = false;
                            c0230o.p(false);
                        }
                        c0230o.p(z7);
                        if (iVar3 != null) {
                            i32 = iVar3.f4745a;
                        } else {
                            i32 = Integer.MIN_VALUE;
                        }
                        long j2115 = j14;
                        G0.J j2116 = j13;
                        int i31112 = i28 << 9;
                        int i31113 = i31;
                        int i41116 = i30;
                        boolean z111 = z6;
                        int i41117 = i29;
                        AbstractC0029o0.b(str, oVar16, G0.J.e(j2116, jB, j11, kVar2, j12, i32, j2115, 16609104), i41117, z111, i41116, i31113, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i31112 & 57344) | 196608 | (i31112 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                        i33 = i30;
                        j16 = j10;
                        j17 = j2115;
                        i34 = i31113;
                        oVar3 = oVar16;
                        z8 = z6;
                        kVar3 = kVar2;
                        int i41118 = i29;
                        iVar4 = iVar3;
                        j18 = j11;
                        j19 = j12;
                        j20 = j2116;
                        i35 = i41118;
                    }
                    c0235q0T = c0230o.t();
                    if (c0235q0T != null) {
                        c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
                    }
                }
                i25 = i24 | 3456;
                i28 = i25 | 221184;
                if ((i8 & 1572864) != 0) {
                    if ((i9 & 65536) == 0) {
                        i36 = 524288;
                    } else {
                        i36 = 524288;
                    }
                    i28 |= i36;
                }
                if ((i18 & 306783379) != 306783378) {
                    c0230o.R();
                    if ((i7 & 1) != 0) {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    } else {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    }
                    c0230o.q();
                    Z.o oVar17 = oVar2;
                    c0230o.W(79582827);
                    j15 = p035g0.r.f9085l;
                    if (j10 != j15) {
                        i31 = i31;
                        jB = j10;
                        z7 = false;
                    } else {
                        c0230o.W(79582860);
                        jB = j13.b();
                        if (jB == j15) {
                            jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                        }
                        z7 = false;
                        c0230o.p(false);
                    }
                    c0230o.p(z7);
                    if (iVar3 != null) {
                        i32 = iVar3.f4745a;
                    } else {
                        i32 = Integer.MIN_VALUE;
                    }
                    long j2117 = j14;
                    G0.J j2118 = j13;
                    int i31114 = i28 << 9;
                    int i31115 = i31;
                    int i41119 = i30;
                    boolean z112 = z6;
                    int i411110 = i29;
                    AbstractC0029o0.b(str, oVar17, G0.J.e(j2118, jB, j11, kVar2, j12, i32, j2117, 16609104), i411110, z112, i41119, i31115, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i31114 & 57344) | 196608 | (i31114 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                    i33 = i30;
                    j16 = j10;
                    j17 = j2117;
                    i34 = i31115;
                    oVar3 = oVar17;
                    z8 = z6;
                    kVar3 = kVar2;
                    int i411111 = i29;
                    iVar4 = iVar3;
                    j18 = j11;
                    j19 = j12;
                    j20 = j2118;
                    i35 = i411111;
                } else {
                    c0230o.R();
                    if ((i7 & 1) != 0) {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    } else {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    }
                    c0230o.q();
                    Z.o oVar18 = oVar2;
                    c0230o.W(79582827);
                    j15 = p035g0.r.f9085l;
                    if (j10 != j15) {
                        i31 = i31;
                        jB = j10;
                        z7 = false;
                    } else {
                        c0230o.W(79582860);
                        jB = j13.b();
                        if (jB == j15) {
                            jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                        }
                        z7 = false;
                        c0230o.p(false);
                    }
                    c0230o.p(z7);
                    if (iVar3 != null) {
                        i32 = iVar3.f4745a;
                    } else {
                        i32 = Integer.MIN_VALUE;
                    }
                    long j2119 = j14;
                    G0.J j21110 = j13;
                    int i31116 = i28 << 9;
                    int i31117 = i31;
                    int i411112 = i30;
                    boolean z113 = z6;
                    int i411113 = i29;
                    AbstractC0029o0.b(str, oVar18, G0.J.e(j21110, jB, j11, kVar2, j12, i32, j2119, 16609104), i411113, z113, i411112, i31117, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i31116 & 57344) | 196608 | (i31116 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                    i33 = i30;
                    j16 = j10;
                    j17 = j2119;
                    i34 = i31117;
                    oVar3 = oVar18;
                    z8 = z6;
                    kVar3 = kVar2;
                    int i411114 = i29;
                    iVar4 = iVar3;
                    j18 = j11;
                    j19 = j12;
                    j20 = j21110;
                    i35 = i411114;
                }
                c0235q0T = c0230o.t();
                if (c0235q0T != null) {
                    c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
                }
            }
            i10 |= 384;
            j10 = j4;
            i13 = i9 & 8;
            if (i13 != 0) {
                i10 |= 3072;
                j11 = j6;
            } else {
                j11 = j6;
                if ((i7 & 3072) == 0) {
                    if (c0230o.e(j11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i10 |= i14;
                }
            }
            i15 = i10 | 24576;
            i16 = i9 & 32;
            if (i16 != 0) {
                if ((i7 & 196608) == 0) {
                    kVar2 = kVar;
                    if (c0230o.f(kVar2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i15 |= i17;
                }
                i18 = i15 | 114819072;
                i19 = i9 & HueLog.LogComponent.APPCORE;
                if (i19 != 0) {
                    if ((805306368 & i7) == 0) {
                        iVar2 = iVar;
                        if (c0230o.f(iVar2)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i18 |= i20;
                    }
                    i21 = i8 | 6;
                    i22 = i9 & 2048;
                    if (i22 != 0) {
                        i21 = i8 | 54;
                    } else if ((i8 & 48) == 0) {
                        if (c0230o.d(i)) {
                            i23 = 32;
                        } else {
                            i23 = 16;
                        }
                        i21 |= i23;
                    }
                    i24 = i21;
                    i25 = i24 | 384;
                    i26 = i9 & 8192;
                    if (i26 != 0) {
                        if ((i8 & 3072) == 0) {
                            if (c0230o.d(i3)) {
                                i27 = 2048;
                            } else {
                                i27 = 1024;
                            }
                            i25 |= i27;
                        }
                        i28 = i25 | 221184;
                        if ((i8 & 1572864) != 0) {
                            if ((i9 & 65536) == 0) {
                                i36 = 524288;
                            } else {
                                i36 = 524288;
                            }
                            i28 |= i36;
                        }
                        if ((i18 & 306783379) != 306783378) {
                            c0230o.R();
                            if ((i7 & 1) != 0) {
                                if (i37 != 0) {
                                    oVar2 = Z.l.f5957a;
                                } else {
                                    oVar2 = oVar;
                                }
                                if (i11 != 0) {
                                    j10 = p035g0.r.f9085l;
                                }
                                if (i13 != 0) {
                                    j11 = S0.m.f4901c;
                                }
                                if (i16 != 0) {
                                    kVar2 = null;
                                }
                                j12 = S0.m.f4901c;
                                if (i19 == 0) {
                                }
                                z6 = true;
                                i31 = 1;
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i;
                                }
                                if (i26 != 0) {
                                    i30 = Integer.MAX_VALUE;
                                } else {
                                    i30 = i3;
                                }
                                if ((i9 & 65536) != 0) {
                                    i28 &= -3670017;
                                    j13 = (G0.J) c0230o.k(f2713a);
                                } else {
                                    j13 = j9;
                                }
                                j14 = j12;
                            } else {
                                if (i37 != 0) {
                                    oVar2 = Z.l.f5957a;
                                } else {
                                    oVar2 = oVar;
                                }
                                if (i11 != 0) {
                                    j10 = p035g0.r.f9085l;
                                }
                                if (i13 != 0) {
                                    j11 = S0.m.f4901c;
                                }
                                if (i16 != 0) {
                                    kVar2 = null;
                                }
                                j12 = S0.m.f4901c;
                                if (i19 == 0) {
                                }
                                z6 = true;
                                i31 = 1;
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i;
                                }
                                if (i26 != 0) {
                                    i30 = Integer.MAX_VALUE;
                                } else {
                                    i30 = i3;
                                }
                                if ((i9 & 65536) != 0) {
                                    i28 &= -3670017;
                                    j13 = (G0.J) c0230o.k(f2713a);
                                } else {
                                    j13 = j9;
                                }
                                j14 = j12;
                            }
                            c0230o.q();
                            Z.o oVar19 = oVar2;
                            c0230o.W(79582827);
                            j15 = p035g0.r.f9085l;
                            if (j10 != j15) {
                                i31 = i31;
                                jB = j10;
                                z7 = false;
                            } else {
                                c0230o.W(79582860);
                                jB = j13.b();
                                if (jB == j15) {
                                    jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                                }
                                z7 = false;
                                c0230o.p(false);
                            }
                            c0230o.p(z7);
                            if (iVar3 != null) {
                                i32 = iVar3.f4745a;
                            } else {
                                i32 = Integer.MIN_VALUE;
                            }
                            long j21111 = j14;
                            G0.J j21112 = j13;
                            int i31118 = i28 << 9;
                            int i31119 = i31;
                            int i411115 = i30;
                            boolean z114 = z6;
                            int i411116 = i29;
                            AbstractC0029o0.b(str, oVar19, G0.J.e(j21112, jB, j11, kVar2, j12, i32, j21111, 16609104), i411116, z114, i411115, i31119, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i31118 & 57344) | 196608 | (i31118 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                            i33 = i30;
                            j16 = j10;
                            j17 = j21111;
                            i34 = i31119;
                            oVar3 = oVar19;
                            z8 = z6;
                            kVar3 = kVar2;
                            int i411117 = i29;
                            iVar4 = iVar3;
                            j18 = j11;
                            j19 = j12;
                            j20 = j21112;
                            i35 = i411117;
                        } else {
                            c0230o.R();
                            if ((i7 & 1) != 0) {
                                if (i37 != 0) {
                                    oVar2 = Z.l.f5957a;
                                } else {
                                    oVar2 = oVar;
                                }
                                if (i11 != 0) {
                                    j10 = p035g0.r.f9085l;
                                }
                                if (i13 != 0) {
                                    j11 = S0.m.f4901c;
                                }
                                if (i16 != 0) {
                                    kVar2 = null;
                                }
                                j12 = S0.m.f4901c;
                                if (i19 == 0) {
                                }
                                z6 = true;
                                i31 = 1;
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i;
                                }
                                if (i26 != 0) {
                                    i30 = Integer.MAX_VALUE;
                                } else {
                                    i30 = i3;
                                }
                                if ((i9 & 65536) != 0) {
                                    i28 &= -3670017;
                                    j13 = (G0.J) c0230o.k(f2713a);
                                } else {
                                    j13 = j9;
                                }
                                j14 = j12;
                            } else {
                                if (i37 != 0) {
                                    oVar2 = Z.l.f5957a;
                                } else {
                                    oVar2 = oVar;
                                }
                                if (i11 != 0) {
                                    j10 = p035g0.r.f9085l;
                                }
                                if (i13 != 0) {
                                    j11 = S0.m.f4901c;
                                }
                                if (i16 != 0) {
                                    kVar2 = null;
                                }
                                j12 = S0.m.f4901c;
                                if (i19 == 0) {
                                }
                                z6 = true;
                                i31 = 1;
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i;
                                }
                                if (i26 != 0) {
                                    i30 = Integer.MAX_VALUE;
                                } else {
                                    i30 = i3;
                                }
                                if ((i9 & 65536) != 0) {
                                    i28 &= -3670017;
                                    j13 = (G0.J) c0230o.k(f2713a);
                                } else {
                                    j13 = j9;
                                }
                                j14 = j12;
                            }
                            c0230o.q();
                            Z.o oVar110 = oVar2;
                            c0230o.W(79582827);
                            j15 = p035g0.r.f9085l;
                            if (j10 != j15) {
                                i31 = i31;
                                jB = j10;
                                z7 = false;
                            } else {
                                c0230o.W(79582860);
                                jB = j13.b();
                                if (jB == j15) {
                                    jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                                }
                                z7 = false;
                                c0230o.p(false);
                            }
                            c0230o.p(z7);
                            if (iVar3 != null) {
                                i32 = iVar3.f4745a;
                            } else {
                                i32 = Integer.MIN_VALUE;
                            }
                            long j21113 = j14;
                            G0.J j21114 = j13;
                            int i311110 = i28 << 9;
                            int i311111 = i31;
                            int i411118 = i30;
                            boolean z115 = z6;
                            int i411119 = i29;
                            AbstractC0029o0.b(str, oVar110, G0.J.e(j21114, jB, j11, kVar2, j12, i32, j21113, 16609104), i411119, z115, i411118, i311111, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i311110 & 57344) | 196608 | (i311110 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                            i33 = i30;
                            j16 = j10;
                            j17 = j21113;
                            i34 = i311111;
                            oVar3 = oVar110;
                            z8 = z6;
                            kVar3 = kVar2;
                            int i4111110 = i29;
                            iVar4 = iVar3;
                            j18 = j11;
                            j19 = j12;
                            j20 = j21114;
                            i35 = i4111110;
                        }
                        c0235q0T = c0230o.t();
                        if (c0235q0T != null) {
                            c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
                        }
                    }
                    i25 = i24 | 3456;
                    i28 = i25 | 221184;
                    if ((i8 & 1572864) != 0) {
                        if ((i9 & 65536) == 0) {
                            i36 = 524288;
                        } else {
                            i36 = 524288;
                        }
                        i28 |= i36;
                    }
                    if ((i18 & 306783379) != 306783378) {
                        c0230o.R();
                        if ((i7 & 1) != 0) {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        } else {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        }
                        c0230o.q();
                        Z.o oVar111 = oVar2;
                        c0230o.W(79582827);
                        j15 = p035g0.r.f9085l;
                        if (j10 != j15) {
                            i31 = i31;
                            jB = j10;
                            z7 = false;
                        } else {
                            c0230o.W(79582860);
                            jB = j13.b();
                            if (jB == j15) {
                                jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                            }
                            z7 = false;
                            c0230o.p(false);
                        }
                        c0230o.p(z7);
                        if (iVar3 != null) {
                            i32 = iVar3.f4745a;
                        } else {
                            i32 = Integer.MIN_VALUE;
                        }
                        long j21115 = j14;
                        G0.J j21116 = j13;
                        int i311112 = i28 << 9;
                        int i311113 = i31;
                        int i4111111 = i30;
                        boolean z116 = z6;
                        int i4111112 = i29;
                        AbstractC0029o0.b(str, oVar111, G0.J.e(j21116, jB, j11, kVar2, j12, i32, j21115, 16609104), i4111112, z116, i4111111, i311113, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i311112 & 57344) | 196608 | (i311112 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                        i33 = i30;
                        j16 = j10;
                        j17 = j21115;
                        i34 = i311113;
                        oVar3 = oVar111;
                        z8 = z6;
                        kVar3 = kVar2;
                        int i4111113 = i29;
                        iVar4 = iVar3;
                        j18 = j11;
                        j19 = j12;
                        j20 = j21116;
                        i35 = i4111113;
                    } else {
                        c0230o.R();
                        if ((i7 & 1) != 0) {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        } else {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        }
                        c0230o.q();
                        Z.o oVar112 = oVar2;
                        c0230o.W(79582827);
                        j15 = p035g0.r.f9085l;
                        if (j10 != j15) {
                            i31 = i31;
                            jB = j10;
                            z7 = false;
                        } else {
                            c0230o.W(79582860);
                            jB = j13.b();
                            if (jB == j15) {
                                jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                            }
                            z7 = false;
                            c0230o.p(false);
                        }
                        c0230o.p(z7);
                        if (iVar3 != null) {
                            i32 = iVar3.f4745a;
                        } else {
                            i32 = Integer.MIN_VALUE;
                        }
                        long j21117 = j14;
                        G0.J j21118 = j13;
                        int i311114 = i28 << 9;
                        int i311115 = i31;
                        int i4111114 = i30;
                        boolean z117 = z6;
                        int i4111115 = i29;
                        AbstractC0029o0.b(str, oVar112, G0.J.e(j21118, jB, j11, kVar2, j12, i32, j21117, 16609104), i4111115, z117, i4111114, i311115, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i311114 & 57344) | 196608 | (i311114 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                        i33 = i30;
                        j16 = j10;
                        j17 = j21117;
                        i34 = i311115;
                        oVar3 = oVar112;
                        z8 = z6;
                        kVar3 = kVar2;
                        int i4111116 = i29;
                        iVar4 = iVar3;
                        j18 = j11;
                        j19 = j12;
                        j20 = j21118;
                        i35 = i4111116;
                    }
                    c0235q0T = c0230o.t();
                    if (c0235q0T != null) {
                        c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
                    }
                }
                i18 = i15 | 920125440;
                iVar2 = iVar;
                i21 = i8 | 6;
                i22 = i9 & 2048;
                if (i22 != 0) {
                    i21 = i8 | 54;
                } else if ((i8 & 48) == 0) {
                    if (c0230o.d(i)) {
                        i23 = 32;
                    } else {
                        i23 = 16;
                    }
                    i21 |= i23;
                }
                i24 = i21;
                i25 = i24 | 384;
                i26 = i9 & 8192;
                if (i26 != 0) {
                    if ((i8 & 3072) == 0) {
                        if (c0230o.d(i3)) {
                            i27 = 2048;
                        } else {
                            i27 = 1024;
                        }
                        i25 |= i27;
                    }
                    i28 = i25 | 221184;
                    if ((i8 & 1572864) != 0) {
                        if ((i9 & 65536) == 0) {
                            i36 = 524288;
                        } else {
                            i36 = 524288;
                        }
                        i28 |= i36;
                    }
                    if ((i18 & 306783379) != 306783378) {
                        c0230o.R();
                        if ((i7 & 1) != 0) {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        } else {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        }
                        c0230o.q();
                        Z.o oVar113 = oVar2;
                        c0230o.W(79582827);
                        j15 = p035g0.r.f9085l;
                        if (j10 != j15) {
                            i31 = i31;
                            jB = j10;
                            z7 = false;
                        } else {
                            c0230o.W(79582860);
                            jB = j13.b();
                            if (jB == j15) {
                                jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                            }
                            z7 = false;
                            c0230o.p(false);
                        }
                        c0230o.p(z7);
                        if (iVar3 != null) {
                            i32 = iVar3.f4745a;
                        } else {
                            i32 = Integer.MIN_VALUE;
                        }
                        long j21119 = j14;
                        G0.J j211110 = j13;
                        int i311116 = i28 << 9;
                        int i311117 = i31;
                        int i4111117 = i30;
                        boolean z118 = z6;
                        int i4111118 = i29;
                        AbstractC0029o0.b(str, oVar113, G0.J.e(j211110, jB, j11, kVar2, j12, i32, j21119, 16609104), i4111118, z118, i4111117, i311117, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i311116 & 57344) | 196608 | (i311116 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                        i33 = i30;
                        j16 = j10;
                        j17 = j21119;
                        i34 = i311117;
                        oVar3 = oVar113;
                        z8 = z6;
                        kVar3 = kVar2;
                        int i4111119 = i29;
                        iVar4 = iVar3;
                        j18 = j11;
                        j19 = j12;
                        j20 = j211110;
                        i35 = i4111119;
                    } else {
                        c0230o.R();
                        if ((i7 & 1) != 0) {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        } else {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        }
                        c0230o.q();
                        Z.o oVar114 = oVar2;
                        c0230o.W(79582827);
                        j15 = p035g0.r.f9085l;
                        if (j10 != j15) {
                            i31 = i31;
                            jB = j10;
                            z7 = false;
                        } else {
                            c0230o.W(79582860);
                            jB = j13.b();
                            if (jB == j15) {
                                jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                            }
                            z7 = false;
                            c0230o.p(false);
                        }
                        c0230o.p(z7);
                        if (iVar3 != null) {
                            i32 = iVar3.f4745a;
                        } else {
                            i32 = Integer.MIN_VALUE;
                        }
                        long j211111 = j14;
                        G0.J j211112 = j13;
                        int i311118 = i28 << 9;
                        int i311119 = i31;
                        int i41111110 = i30;
                        boolean z119 = z6;
                        int i41111111 = i29;
                        AbstractC0029o0.b(str, oVar114, G0.J.e(j211112, jB, j11, kVar2, j12, i32, j211111, 16609104), i41111111, z119, i41111110, i311119, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i311118 & 57344) | 196608 | (i311118 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                        i33 = i30;
                        j16 = j10;
                        j17 = j211111;
                        i34 = i311119;
                        oVar3 = oVar114;
                        z8 = z6;
                        kVar3 = kVar2;
                        int i41111112 = i29;
                        iVar4 = iVar3;
                        j18 = j11;
                        j19 = j12;
                        j20 = j211112;
                        i35 = i41111112;
                    }
                    c0235q0T = c0230o.t();
                    if (c0235q0T != null) {
                        c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
                    }
                }
                i25 = i24 | 3456;
                i28 = i25 | 221184;
                if ((i8 & 1572864) != 0) {
                    if ((i9 & 65536) == 0) {
                        i36 = 524288;
                    } else {
                        i36 = 524288;
                    }
                    i28 |= i36;
                }
                if ((i18 & 306783379) != 306783378) {
                    c0230o.R();
                    if ((i7 & 1) != 0) {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    } else {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    }
                    c0230o.q();
                    Z.o oVar115 = oVar2;
                    c0230o.W(79582827);
                    j15 = p035g0.r.f9085l;
                    if (j10 != j15) {
                        i31 = i31;
                        jB = j10;
                        z7 = false;
                    } else {
                        c0230o.W(79582860);
                        jB = j13.b();
                        if (jB == j15) {
                            jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                        }
                        z7 = false;
                        c0230o.p(false);
                    }
                    c0230o.p(z7);
                    if (iVar3 != null) {
                        i32 = iVar3.f4745a;
                    } else {
                        i32 = Integer.MIN_VALUE;
                    }
                    long j211113 = j14;
                    G0.J j211114 = j13;
                    int i3111110 = i28 << 9;
                    int i3111111 = i31;
                    int i41111113 = i30;
                    boolean z1110 = z6;
                    int i41111114 = i29;
                    AbstractC0029o0.b(str, oVar115, G0.J.e(j211114, jB, j11, kVar2, j12, i32, j211113, 16609104), i41111114, z1110, i41111113, i3111111, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i3111110 & 57344) | 196608 | (i3111110 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                    i33 = i30;
                    j16 = j10;
                    j17 = j211113;
                    i34 = i3111111;
                    oVar3 = oVar115;
                    z8 = z6;
                    kVar3 = kVar2;
                    int i41111115 = i29;
                    iVar4 = iVar3;
                    j18 = j11;
                    j19 = j12;
                    j20 = j211114;
                    i35 = i41111115;
                } else {
                    c0230o.R();
                    if ((i7 & 1) != 0) {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    } else {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    }
                    c0230o.q();
                    Z.o oVar116 = oVar2;
                    c0230o.W(79582827);
                    j15 = p035g0.r.f9085l;
                    if (j10 != j15) {
                        i31 = i31;
                        jB = j10;
                        z7 = false;
                    } else {
                        c0230o.W(79582860);
                        jB = j13.b();
                        if (jB == j15) {
                            jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                        }
                        z7 = false;
                        c0230o.p(false);
                    }
                    c0230o.p(z7);
                    if (iVar3 != null) {
                        i32 = iVar3.f4745a;
                    } else {
                        i32 = Integer.MIN_VALUE;
                    }
                    long j211115 = j14;
                    G0.J j211116 = j13;
                    int i3111112 = i28 << 9;
                    int i3111113 = i31;
                    int i41111116 = i30;
                    boolean z1111 = z6;
                    int i41111117 = i29;
                    AbstractC0029o0.b(str, oVar116, G0.J.e(j211116, jB, j11, kVar2, j12, i32, j211115, 16609104), i41111117, z1111, i41111116, i3111113, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i3111112 & 57344) | 196608 | (i3111112 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                    i33 = i30;
                    j16 = j10;
                    j17 = j211115;
                    i34 = i3111113;
                    oVar3 = oVar116;
                    z8 = z6;
                    kVar3 = kVar2;
                    int i41111118 = i29;
                    iVar4 = iVar3;
                    j18 = j11;
                    j19 = j12;
                    j20 = j211116;
                    i35 = i41111118;
                }
                c0235q0T = c0230o.t();
                if (c0235q0T != null) {
                    c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
                }
            }
            i15 = i10 | 221184;
            kVar2 = kVar;
            i18 = i15 | 114819072;
            i19 = i9 & HueLog.LogComponent.APPCORE;
            if (i19 != 0) {
                if ((805306368 & i7) == 0) {
                    iVar2 = iVar;
                    if (c0230o.f(iVar2)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i18 |= i20;
                }
                i21 = i8 | 6;
                i22 = i9 & 2048;
                if (i22 != 0) {
                    i21 = i8 | 54;
                } else if ((i8 & 48) == 0) {
                    if (c0230o.d(i)) {
                        i23 = 32;
                    } else {
                        i23 = 16;
                    }
                    i21 |= i23;
                }
                i24 = i21;
                i25 = i24 | 384;
                i26 = i9 & 8192;
                if (i26 != 0) {
                    if ((i8 & 3072) == 0) {
                        if (c0230o.d(i3)) {
                            i27 = 2048;
                        } else {
                            i27 = 1024;
                        }
                        i25 |= i27;
                    }
                    i28 = i25 | 221184;
                    if ((i8 & 1572864) != 0) {
                        if ((i9 & 65536) == 0) {
                            i36 = 524288;
                        } else {
                            i36 = 524288;
                        }
                        i28 |= i36;
                    }
                    if ((i18 & 306783379) != 306783378) {
                        c0230o.R();
                        if ((i7 & 1) != 0) {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        } else {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        }
                        c0230o.q();
                        Z.o oVar117 = oVar2;
                        c0230o.W(79582827);
                        j15 = p035g0.r.f9085l;
                        if (j10 != j15) {
                            i31 = i31;
                            jB = j10;
                            z7 = false;
                        } else {
                            c0230o.W(79582860);
                            jB = j13.b();
                            if (jB == j15) {
                                jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                            }
                            z7 = false;
                            c0230o.p(false);
                        }
                        c0230o.p(z7);
                        if (iVar3 != null) {
                            i32 = iVar3.f4745a;
                        } else {
                            i32 = Integer.MIN_VALUE;
                        }
                        long j211117 = j14;
                        G0.J j211118 = j13;
                        int i3111114 = i28 << 9;
                        int i3111115 = i31;
                        int i41111119 = i30;
                        boolean z1112 = z6;
                        int i411111110 = i29;
                        AbstractC0029o0.b(str, oVar117, G0.J.e(j211118, jB, j11, kVar2, j12, i32, j211117, 16609104), i411111110, z1112, i41111119, i3111115, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i3111114 & 57344) | 196608 | (i3111114 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                        i33 = i30;
                        j16 = j10;
                        j17 = j211117;
                        i34 = i3111115;
                        oVar3 = oVar117;
                        z8 = z6;
                        kVar3 = kVar2;
                        int i411111111 = i29;
                        iVar4 = iVar3;
                        j18 = j11;
                        j19 = j12;
                        j20 = j211118;
                        i35 = i411111111;
                    } else {
                        c0230o.R();
                        if ((i7 & 1) != 0) {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        } else {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        }
                        c0230o.q();
                        Z.o oVar118 = oVar2;
                        c0230o.W(79582827);
                        j15 = p035g0.r.f9085l;
                        if (j10 != j15) {
                            i31 = i31;
                            jB = j10;
                            z7 = false;
                        } else {
                            c0230o.W(79582860);
                            jB = j13.b();
                            if (jB == j15) {
                                jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                            }
                            z7 = false;
                            c0230o.p(false);
                        }
                        c0230o.p(z7);
                        if (iVar3 != null) {
                            i32 = iVar3.f4745a;
                        } else {
                            i32 = Integer.MIN_VALUE;
                        }
                        long j211119 = j14;
                        G0.J j2111110 = j13;
                        int i3111116 = i28 << 9;
                        int i3111117 = i31;
                        int i411111112 = i30;
                        boolean z1113 = z6;
                        int i411111113 = i29;
                        AbstractC0029o0.b(str, oVar118, G0.J.e(j2111110, jB, j11, kVar2, j12, i32, j211119, 16609104), i411111113, z1113, i411111112, i3111117, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i3111116 & 57344) | 196608 | (i3111116 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                        i33 = i30;
                        j16 = j10;
                        j17 = j211119;
                        i34 = i3111117;
                        oVar3 = oVar118;
                        z8 = z6;
                        kVar3 = kVar2;
                        int i411111114 = i29;
                        iVar4 = iVar3;
                        j18 = j11;
                        j19 = j12;
                        j20 = j2111110;
                        i35 = i411111114;
                    }
                    c0235q0T = c0230o.t();
                    if (c0235q0T != null) {
                        c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
                    }
                }
                i25 = i24 | 3456;
                i28 = i25 | 221184;
                if ((i8 & 1572864) != 0) {
                    if ((i9 & 65536) == 0) {
                        i36 = 524288;
                    } else {
                        i36 = 524288;
                    }
                    i28 |= i36;
                }
                if ((i18 & 306783379) != 306783378) {
                    c0230o.R();
                    if ((i7 & 1) != 0) {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    } else {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    }
                    c0230o.q();
                    Z.o oVar119 = oVar2;
                    c0230o.W(79582827);
                    j15 = p035g0.r.f9085l;
                    if (j10 != j15) {
                        i31 = i31;
                        jB = j10;
                        z7 = false;
                    } else {
                        c0230o.W(79582860);
                        jB = j13.b();
                        if (jB == j15) {
                            jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                        }
                        z7 = false;
                        c0230o.p(false);
                    }
                    c0230o.p(z7);
                    if (iVar3 != null) {
                        i32 = iVar3.f4745a;
                    } else {
                        i32 = Integer.MIN_VALUE;
                    }
                    long j2111111 = j14;
                    G0.J j2111112 = j13;
                    int i3111118 = i28 << 9;
                    int i3111119 = i31;
                    int i411111115 = i30;
                    boolean z1114 = z6;
                    int i411111116 = i29;
                    AbstractC0029o0.b(str, oVar119, G0.J.e(j2111112, jB, j11, kVar2, j12, i32, j2111111, 16609104), i411111116, z1114, i411111115, i3111119, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i3111118 & 57344) | 196608 | (i3111118 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                    i33 = i30;
                    j16 = j10;
                    j17 = j2111111;
                    i34 = i3111119;
                    oVar3 = oVar119;
                    z8 = z6;
                    kVar3 = kVar2;
                    int i411111117 = i29;
                    iVar4 = iVar3;
                    j18 = j11;
                    j19 = j12;
                    j20 = j2111112;
                    i35 = i411111117;
                } else {
                    c0230o.R();
                    if ((i7 & 1) != 0) {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    } else {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    }
                    c0230o.q();
                    Z.o oVar1110 = oVar2;
                    c0230o.W(79582827);
                    j15 = p035g0.r.f9085l;
                    if (j10 != j15) {
                        i31 = i31;
                        jB = j10;
                        z7 = false;
                    } else {
                        c0230o.W(79582860);
                        jB = j13.b();
                        if (jB == j15) {
                            jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                        }
                        z7 = false;
                        c0230o.p(false);
                    }
                    c0230o.p(z7);
                    if (iVar3 != null) {
                        i32 = iVar3.f4745a;
                    } else {
                        i32 = Integer.MIN_VALUE;
                    }
                    long j2111113 = j14;
                    G0.J j2111114 = j13;
                    int i31111110 = i28 << 9;
                    int i31111111 = i31;
                    int i411111118 = i30;
                    boolean z1115 = z6;
                    int i411111119 = i29;
                    AbstractC0029o0.b(str, oVar1110, G0.J.e(j2111114, jB, j11, kVar2, j12, i32, j2111113, 16609104), i411111119, z1115, i411111118, i31111111, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i31111110 & 57344) | 196608 | (i31111110 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                    i33 = i30;
                    j16 = j10;
                    j17 = j2111113;
                    i34 = i31111111;
                    oVar3 = oVar1110;
                    z8 = z6;
                    kVar3 = kVar2;
                    int i4111111110 = i29;
                    iVar4 = iVar3;
                    j18 = j11;
                    j19 = j12;
                    j20 = j2111114;
                    i35 = i4111111110;
                }
                c0235q0T = c0230o.t();
                if (c0235q0T != null) {
                    c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
                }
            }
            i18 = i15 | 920125440;
            iVar2 = iVar;
            i21 = i8 | 6;
            i22 = i9 & 2048;
            if (i22 != 0) {
                i21 = i8 | 54;
            } else if ((i8 & 48) == 0) {
                if (c0230o.d(i)) {
                    i23 = 32;
                } else {
                    i23 = 16;
                }
                i21 |= i23;
            }
            i24 = i21;
            i25 = i24 | 384;
            i26 = i9 & 8192;
            if (i26 != 0) {
                if ((i8 & 3072) == 0) {
                    if (c0230o.d(i3)) {
                        i27 = 2048;
                    } else {
                        i27 = 1024;
                    }
                    i25 |= i27;
                }
                i28 = i25 | 221184;
                if ((i8 & 1572864) != 0) {
                    if ((i9 & 65536) == 0) {
                        i36 = 524288;
                    } else {
                        i36 = 524288;
                    }
                    i28 |= i36;
                }
                if ((i18 & 306783379) != 306783378) {
                    c0230o.R();
                    if ((i7 & 1) != 0) {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    } else {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    }
                    c0230o.q();
                    Z.o oVar1111 = oVar2;
                    c0230o.W(79582827);
                    j15 = p035g0.r.f9085l;
                    if (j10 != j15) {
                        i31 = i31;
                        jB = j10;
                        z7 = false;
                    } else {
                        c0230o.W(79582860);
                        jB = j13.b();
                        if (jB == j15) {
                            jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                        }
                        z7 = false;
                        c0230o.p(false);
                    }
                    c0230o.p(z7);
                    if (iVar3 != null) {
                        i32 = iVar3.f4745a;
                    } else {
                        i32 = Integer.MIN_VALUE;
                    }
                    long j2111115 = j14;
                    G0.J j2111116 = j13;
                    int i31111112 = i28 << 9;
                    int i31111113 = i31;
                    int i4111111111 = i30;
                    boolean z1116 = z6;
                    int i4111111112 = i29;
                    AbstractC0029o0.b(str, oVar1111, G0.J.e(j2111116, jB, j11, kVar2, j12, i32, j2111115, 16609104), i4111111112, z1116, i4111111111, i31111113, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i31111112 & 57344) | 196608 | (i31111112 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                    i33 = i30;
                    j16 = j10;
                    j17 = j2111115;
                    i34 = i31111113;
                    oVar3 = oVar1111;
                    z8 = z6;
                    kVar3 = kVar2;
                    int i4111111113 = i29;
                    iVar4 = iVar3;
                    j18 = j11;
                    j19 = j12;
                    j20 = j2111116;
                    i35 = i4111111113;
                } else {
                    c0230o.R();
                    if ((i7 & 1) != 0) {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    } else {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    }
                    c0230o.q();
                    Z.o oVar1112 = oVar2;
                    c0230o.W(79582827);
                    j15 = p035g0.r.f9085l;
                    if (j10 != j15) {
                        i31 = i31;
                        jB = j10;
                        z7 = false;
                    } else {
                        c0230o.W(79582860);
                        jB = j13.b();
                        if (jB == j15) {
                            jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                        }
                        z7 = false;
                        c0230o.p(false);
                    }
                    c0230o.p(z7);
                    if (iVar3 != null) {
                        i32 = iVar3.f4745a;
                    } else {
                        i32 = Integer.MIN_VALUE;
                    }
                    long j2111117 = j14;
                    G0.J j2111118 = j13;
                    int i31111114 = i28 << 9;
                    int i31111115 = i31;
                    int i4111111114 = i30;
                    boolean z1117 = z6;
                    int i4111111115 = i29;
                    AbstractC0029o0.b(str, oVar1112, G0.J.e(j2111118, jB, j11, kVar2, j12, i32, j2111117, 16609104), i4111111115, z1117, i4111111114, i31111115, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i31111114 & 57344) | 196608 | (i31111114 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                    i33 = i30;
                    j16 = j10;
                    j17 = j2111117;
                    i34 = i31111115;
                    oVar3 = oVar1112;
                    z8 = z6;
                    kVar3 = kVar2;
                    int i4111111116 = i29;
                    iVar4 = iVar3;
                    j18 = j11;
                    j19 = j12;
                    j20 = j2111118;
                    i35 = i4111111116;
                }
                c0235q0T = c0230o.t();
                if (c0235q0T != null) {
                    c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
                }
            }
            i25 = i24 | 3456;
            i28 = i25 | 221184;
            if ((i8 & 1572864) != 0) {
                if ((i9 & 65536) == 0) {
                    i36 = 524288;
                } else {
                    i36 = 524288;
                }
                i28 |= i36;
            }
            if ((i18 & 306783379) != 306783378) {
                c0230o.R();
                if ((i7 & 1) != 0) {
                    if (i37 != 0) {
                        oVar2 = Z.l.f5957a;
                    } else {
                        oVar2 = oVar;
                    }
                    if (i11 != 0) {
                        j10 = p035g0.r.f9085l;
                    }
                    if (i13 != 0) {
                        j11 = S0.m.f4901c;
                    }
                    if (i16 != 0) {
                        kVar2 = null;
                    }
                    j12 = S0.m.f4901c;
                    if (i19 == 0) {
                    }
                    z6 = true;
                    i31 = 1;
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i;
                    }
                    if (i26 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i3;
                    }
                    if ((i9 & 65536) != 0) {
                        i28 &= -3670017;
                        j13 = (G0.J) c0230o.k(f2713a);
                    } else {
                        j13 = j9;
                    }
                    j14 = j12;
                } else {
                    if (i37 != 0) {
                        oVar2 = Z.l.f5957a;
                    } else {
                        oVar2 = oVar;
                    }
                    if (i11 != 0) {
                        j10 = p035g0.r.f9085l;
                    }
                    if (i13 != 0) {
                        j11 = S0.m.f4901c;
                    }
                    if (i16 != 0) {
                        kVar2 = null;
                    }
                    j12 = S0.m.f4901c;
                    if (i19 == 0) {
                    }
                    z6 = true;
                    i31 = 1;
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i;
                    }
                    if (i26 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i3;
                    }
                    if ((i9 & 65536) != 0) {
                        i28 &= -3670017;
                        j13 = (G0.J) c0230o.k(f2713a);
                    } else {
                        j13 = j9;
                    }
                    j14 = j12;
                }
                c0230o.q();
                Z.o oVar1113 = oVar2;
                c0230o.W(79582827);
                j15 = p035g0.r.f9085l;
                if (j10 != j15) {
                    i31 = i31;
                    jB = j10;
                    z7 = false;
                } else {
                    c0230o.W(79582860);
                    jB = j13.b();
                    if (jB == j15) {
                        jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                    }
                    z7 = false;
                    c0230o.p(false);
                }
                c0230o.p(z7);
                if (iVar3 != null) {
                    i32 = iVar3.f4745a;
                } else {
                    i32 = Integer.MIN_VALUE;
                }
                long j2111119 = j14;
                G0.J j21111110 = j13;
                int i31111116 = i28 << 9;
                int i31111117 = i31;
                int i4111111117 = i30;
                boolean z1118 = z6;
                int i4111111118 = i29;
                AbstractC0029o0.b(str, oVar1113, G0.J.e(j21111110, jB, j11, kVar2, j12, i32, j2111119, 16609104), i4111111118, z1118, i4111111117, i31111117, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i31111116 & 57344) | 196608 | (i31111116 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                i33 = i30;
                j16 = j10;
                j17 = j2111119;
                i34 = i31111117;
                oVar3 = oVar1113;
                z8 = z6;
                kVar3 = kVar2;
                int i4111111119 = i29;
                iVar4 = iVar3;
                j18 = j11;
                j19 = j12;
                j20 = j21111110;
                i35 = i4111111119;
            } else {
                c0230o.R();
                if ((i7 & 1) != 0) {
                    if (i37 != 0) {
                        oVar2 = Z.l.f5957a;
                    } else {
                        oVar2 = oVar;
                    }
                    if (i11 != 0) {
                        j10 = p035g0.r.f9085l;
                    }
                    if (i13 != 0) {
                        j11 = S0.m.f4901c;
                    }
                    if (i16 != 0) {
                        kVar2 = null;
                    }
                    j12 = S0.m.f4901c;
                    if (i19 == 0) {
                    }
                    z6 = true;
                    i31 = 1;
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i;
                    }
                    if (i26 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i3;
                    }
                    if ((i9 & 65536) != 0) {
                        i28 &= -3670017;
                        j13 = (G0.J) c0230o.k(f2713a);
                    } else {
                        j13 = j9;
                    }
                    j14 = j12;
                } else {
                    if (i37 != 0) {
                        oVar2 = Z.l.f5957a;
                    } else {
                        oVar2 = oVar;
                    }
                    if (i11 != 0) {
                        j10 = p035g0.r.f9085l;
                    }
                    if (i13 != 0) {
                        j11 = S0.m.f4901c;
                    }
                    if (i16 != 0) {
                        kVar2 = null;
                    }
                    j12 = S0.m.f4901c;
                    if (i19 == 0) {
                    }
                    z6 = true;
                    i31 = 1;
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i;
                    }
                    if (i26 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i3;
                    }
                    if ((i9 & 65536) != 0) {
                        i28 &= -3670017;
                        j13 = (G0.J) c0230o.k(f2713a);
                    } else {
                        j13 = j9;
                    }
                    j14 = j12;
                }
                c0230o.q();
                Z.o oVar1114 = oVar2;
                c0230o.W(79582827);
                j15 = p035g0.r.f9085l;
                if (j10 != j15) {
                    i31 = i31;
                    jB = j10;
                    z7 = false;
                } else {
                    c0230o.W(79582860);
                    jB = j13.b();
                    if (jB == j15) {
                        jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                    }
                    z7 = false;
                    c0230o.p(false);
                }
                c0230o.p(z7);
                if (iVar3 != null) {
                    i32 = iVar3.f4745a;
                } else {
                    i32 = Integer.MIN_VALUE;
                }
                long j21111111 = j14;
                G0.J j21111112 = j13;
                int i31111118 = i28 << 9;
                int i31111119 = i31;
                int i41111111110 = i30;
                boolean z1119 = z6;
                int i41111111111 = i29;
                AbstractC0029o0.b(str, oVar1114, G0.J.e(j21111112, jB, j11, kVar2, j12, i32, j21111111, 16609104), i41111111111, z1119, i41111111110, i31111119, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i31111118 & 57344) | 196608 | (i31111118 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                i33 = i30;
                j16 = j10;
                j17 = j21111111;
                i34 = i31111119;
                oVar3 = oVar1114;
                z8 = z6;
                kVar3 = kVar2;
                int i41111111112 = i29;
                iVar4 = iVar3;
                j18 = j11;
                j19 = j12;
                j20 = j21111112;
                i35 = i41111111112;
            }
            c0235q0T = c0230o.t();
            if (c0235q0T != null) {
                c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
            }
        }
        i10 |= 48;
        i11 = i9 & 4;
        if (i11 != 0) {
            if ((i7 & 384) == 0) {
                j10 = j4;
                if (c0230o.e(j10)) {
                    i12 = HueLog.LogComponent.STREAMDTLS;
                } else {
                    i12 = 128;
                }
                i10 |= i12;
            }
            i13 = i9 & 8;
            if (i13 != 0) {
                i10 |= 3072;
                j11 = j6;
            } else {
                j11 = j6;
                if ((i7 & 3072) == 0) {
                    if (c0230o.e(j11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i10 |= i14;
                }
            }
            i15 = i10 | 24576;
            i16 = i9 & 32;
            if (i16 != 0) {
                if ((i7 & 196608) == 0) {
                    kVar2 = kVar;
                    if (c0230o.f(kVar2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i15 |= i17;
                }
                i18 = i15 | 114819072;
                i19 = i9 & HueLog.LogComponent.APPCORE;
                if (i19 != 0) {
                    if ((805306368 & i7) == 0) {
                        iVar2 = iVar;
                        if (c0230o.f(iVar2)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i18 |= i20;
                    }
                    i21 = i8 | 6;
                    i22 = i9 & 2048;
                    if (i22 != 0) {
                        i21 = i8 | 54;
                    } else if ((i8 & 48) == 0) {
                        if (c0230o.d(i)) {
                            i23 = 32;
                        } else {
                            i23 = 16;
                        }
                        i21 |= i23;
                    }
                    i24 = i21;
                    i25 = i24 | 384;
                    i26 = i9 & 8192;
                    if (i26 != 0) {
                        if ((i8 & 3072) == 0) {
                            if (c0230o.d(i3)) {
                                i27 = 2048;
                            } else {
                                i27 = 1024;
                            }
                            i25 |= i27;
                        }
                        i28 = i25 | 221184;
                        if ((i8 & 1572864) != 0) {
                            if ((i9 & 65536) == 0) {
                                i36 = 524288;
                            } else {
                                i36 = 524288;
                            }
                            i28 |= i36;
                        }
                        if ((i18 & 306783379) != 306783378) {
                            c0230o.R();
                            if ((i7 & 1) != 0) {
                                if (i37 != 0) {
                                    oVar2 = Z.l.f5957a;
                                } else {
                                    oVar2 = oVar;
                                }
                                if (i11 != 0) {
                                    j10 = p035g0.r.f9085l;
                                }
                                if (i13 != 0) {
                                    j11 = S0.m.f4901c;
                                }
                                if (i16 != 0) {
                                    kVar2 = null;
                                }
                                j12 = S0.m.f4901c;
                                if (i19 == 0) {
                                }
                                z6 = true;
                                i31 = 1;
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i;
                                }
                                if (i26 != 0) {
                                    i30 = Integer.MAX_VALUE;
                                } else {
                                    i30 = i3;
                                }
                                if ((i9 & 65536) != 0) {
                                    i28 &= -3670017;
                                    j13 = (G0.J) c0230o.k(f2713a);
                                } else {
                                    j13 = j9;
                                }
                                j14 = j12;
                            } else {
                                if (i37 != 0) {
                                    oVar2 = Z.l.f5957a;
                                } else {
                                    oVar2 = oVar;
                                }
                                if (i11 != 0) {
                                    j10 = p035g0.r.f9085l;
                                }
                                if (i13 != 0) {
                                    j11 = S0.m.f4901c;
                                }
                                if (i16 != 0) {
                                    kVar2 = null;
                                }
                                j12 = S0.m.f4901c;
                                if (i19 == 0) {
                                }
                                z6 = true;
                                i31 = 1;
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i;
                                }
                                if (i26 != 0) {
                                    i30 = Integer.MAX_VALUE;
                                } else {
                                    i30 = i3;
                                }
                                if ((i9 & 65536) != 0) {
                                    i28 &= -3670017;
                                    j13 = (G0.J) c0230o.k(f2713a);
                                } else {
                                    j13 = j9;
                                }
                                j14 = j12;
                            }
                            c0230o.q();
                            Z.o oVar1115 = oVar2;
                            c0230o.W(79582827);
                            j15 = p035g0.r.f9085l;
                            if (j10 != j15) {
                                i31 = i31;
                                jB = j10;
                                z7 = false;
                            } else {
                                c0230o.W(79582860);
                                jB = j13.b();
                                if (jB == j15) {
                                    jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                                }
                                z7 = false;
                                c0230o.p(false);
                            }
                            c0230o.p(z7);
                            if (iVar3 != null) {
                                i32 = iVar3.f4745a;
                            } else {
                                i32 = Integer.MIN_VALUE;
                            }
                            long j21111113 = j14;
                            G0.J j21111114 = j13;
                            int i311111110 = i28 << 9;
                            int i311111111 = i31;
                            int i41111111113 = i30;
                            boolean z11110 = z6;
                            int i41111111114 = i29;
                            AbstractC0029o0.b(str, oVar1115, G0.J.e(j21111114, jB, j11, kVar2, j12, i32, j21111113, 16609104), i41111111114, z11110, i41111111113, i311111111, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i311111110 & 57344) | 196608 | (i311111110 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                            i33 = i30;
                            j16 = j10;
                            j17 = j21111113;
                            i34 = i311111111;
                            oVar3 = oVar1115;
                            z8 = z6;
                            kVar3 = kVar2;
                            int i41111111115 = i29;
                            iVar4 = iVar3;
                            j18 = j11;
                            j19 = j12;
                            j20 = j21111114;
                            i35 = i41111111115;
                        } else {
                            c0230o.R();
                            if ((i7 & 1) != 0) {
                                if (i37 != 0) {
                                    oVar2 = Z.l.f5957a;
                                } else {
                                    oVar2 = oVar;
                                }
                                if (i11 != 0) {
                                    j10 = p035g0.r.f9085l;
                                }
                                if (i13 != 0) {
                                    j11 = S0.m.f4901c;
                                }
                                if (i16 != 0) {
                                    kVar2 = null;
                                }
                                j12 = S0.m.f4901c;
                                if (i19 == 0) {
                                }
                                z6 = true;
                                i31 = 1;
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i;
                                }
                                if (i26 != 0) {
                                    i30 = Integer.MAX_VALUE;
                                } else {
                                    i30 = i3;
                                }
                                if ((i9 & 65536) != 0) {
                                    i28 &= -3670017;
                                    j13 = (G0.J) c0230o.k(f2713a);
                                } else {
                                    j13 = j9;
                                }
                                j14 = j12;
                            } else {
                                if (i37 != 0) {
                                    oVar2 = Z.l.f5957a;
                                } else {
                                    oVar2 = oVar;
                                }
                                if (i11 != 0) {
                                    j10 = p035g0.r.f9085l;
                                }
                                if (i13 != 0) {
                                    j11 = S0.m.f4901c;
                                }
                                if (i16 != 0) {
                                    kVar2 = null;
                                }
                                j12 = S0.m.f4901c;
                                if (i19 == 0) {
                                }
                                z6 = true;
                                i31 = 1;
                                if (i22 != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i;
                                }
                                if (i26 != 0) {
                                    i30 = Integer.MAX_VALUE;
                                } else {
                                    i30 = i3;
                                }
                                if ((i9 & 65536) != 0) {
                                    i28 &= -3670017;
                                    j13 = (G0.J) c0230o.k(f2713a);
                                } else {
                                    j13 = j9;
                                }
                                j14 = j12;
                            }
                            c0230o.q();
                            Z.o oVar1116 = oVar2;
                            c0230o.W(79582827);
                            j15 = p035g0.r.f9085l;
                            if (j10 != j15) {
                                i31 = i31;
                                jB = j10;
                                z7 = false;
                            } else {
                                c0230o.W(79582860);
                                jB = j13.b();
                                if (jB == j15) {
                                    jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                                }
                                z7 = false;
                                c0230o.p(false);
                            }
                            c0230o.p(z7);
                            if (iVar3 != null) {
                                i32 = iVar3.f4745a;
                            } else {
                                i32 = Integer.MIN_VALUE;
                            }
                            long j21111115 = j14;
                            G0.J j21111116 = j13;
                            int i311111112 = i28 << 9;
                            int i311111113 = i31;
                            int i41111111116 = i30;
                            boolean z11111 = z6;
                            int i41111111117 = i29;
                            AbstractC0029o0.b(str, oVar1116, G0.J.e(j21111116, jB, j11, kVar2, j12, i32, j21111115, 16609104), i41111111117, z11111, i41111111116, i311111113, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i311111112 & 57344) | 196608 | (i311111112 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                            i33 = i30;
                            j16 = j10;
                            j17 = j21111115;
                            i34 = i311111113;
                            oVar3 = oVar1116;
                            z8 = z6;
                            kVar3 = kVar2;
                            int i41111111118 = i29;
                            iVar4 = iVar3;
                            j18 = j11;
                            j19 = j12;
                            j20 = j21111116;
                            i35 = i41111111118;
                        }
                        c0235q0T = c0230o.t();
                        if (c0235q0T != null) {
                            c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
                        }
                    }
                    i25 = i24 | 3456;
                    i28 = i25 | 221184;
                    if ((i8 & 1572864) != 0) {
                        if ((i9 & 65536) == 0) {
                            i36 = 524288;
                        } else {
                            i36 = 524288;
                        }
                        i28 |= i36;
                    }
                    if ((i18 & 306783379) != 306783378) {
                        c0230o.R();
                        if ((i7 & 1) != 0) {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        } else {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        }
                        c0230o.q();
                        Z.o oVar1117 = oVar2;
                        c0230o.W(79582827);
                        j15 = p035g0.r.f9085l;
                        if (j10 != j15) {
                            i31 = i31;
                            jB = j10;
                            z7 = false;
                        } else {
                            c0230o.W(79582860);
                            jB = j13.b();
                            if (jB == j15) {
                                jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                            }
                            z7 = false;
                            c0230o.p(false);
                        }
                        c0230o.p(z7);
                        if (iVar3 != null) {
                            i32 = iVar3.f4745a;
                        } else {
                            i32 = Integer.MIN_VALUE;
                        }
                        long j21111117 = j14;
                        G0.J j21111118 = j13;
                        int i311111114 = i28 << 9;
                        int i311111115 = i31;
                        int i41111111119 = i30;
                        boolean z11112 = z6;
                        int i411111111110 = i29;
                        AbstractC0029o0.b(str, oVar1117, G0.J.e(j21111118, jB, j11, kVar2, j12, i32, j21111117, 16609104), i411111111110, z11112, i41111111119, i311111115, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i311111114 & 57344) | 196608 | (i311111114 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                        i33 = i30;
                        j16 = j10;
                        j17 = j21111117;
                        i34 = i311111115;
                        oVar3 = oVar1117;
                        z8 = z6;
                        kVar3 = kVar2;
                        int i411111111111 = i29;
                        iVar4 = iVar3;
                        j18 = j11;
                        j19 = j12;
                        j20 = j21111118;
                        i35 = i411111111111;
                    } else {
                        c0230o.R();
                        if ((i7 & 1) != 0) {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        } else {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        }
                        c0230o.q();
                        Z.o oVar1118 = oVar2;
                        c0230o.W(79582827);
                        j15 = p035g0.r.f9085l;
                        if (j10 != j15) {
                            i31 = i31;
                            jB = j10;
                            z7 = false;
                        } else {
                            c0230o.W(79582860);
                            jB = j13.b();
                            if (jB == j15) {
                                jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                            }
                            z7 = false;
                            c0230o.p(false);
                        }
                        c0230o.p(z7);
                        if (iVar3 != null) {
                            i32 = iVar3.f4745a;
                        } else {
                            i32 = Integer.MIN_VALUE;
                        }
                        long j21111119 = j14;
                        G0.J j211111110 = j13;
                        int i311111116 = i28 << 9;
                        int i311111117 = i31;
                        int i411111111112 = i30;
                        boolean z11113 = z6;
                        int i411111111113 = i29;
                        AbstractC0029o0.b(str, oVar1118, G0.J.e(j211111110, jB, j11, kVar2, j12, i32, j21111119, 16609104), i411111111113, z11113, i411111111112, i311111117, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i311111116 & 57344) | 196608 | (i311111116 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                        i33 = i30;
                        j16 = j10;
                        j17 = j21111119;
                        i34 = i311111117;
                        oVar3 = oVar1118;
                        z8 = z6;
                        kVar3 = kVar2;
                        int i411111111114 = i29;
                        iVar4 = iVar3;
                        j18 = j11;
                        j19 = j12;
                        j20 = j211111110;
                        i35 = i411111111114;
                    }
                    c0235q0T = c0230o.t();
                    if (c0235q0T != null) {
                        c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
                    }
                }
                i18 = i15 | 920125440;
                iVar2 = iVar;
                i21 = i8 | 6;
                i22 = i9 & 2048;
                if (i22 != 0) {
                    i21 = i8 | 54;
                } else if ((i8 & 48) == 0) {
                    if (c0230o.d(i)) {
                        i23 = 32;
                    } else {
                        i23 = 16;
                    }
                    i21 |= i23;
                }
                i24 = i21;
                i25 = i24 | 384;
                i26 = i9 & 8192;
                if (i26 != 0) {
                    if ((i8 & 3072) == 0) {
                        if (c0230o.d(i3)) {
                            i27 = 2048;
                        } else {
                            i27 = 1024;
                        }
                        i25 |= i27;
                    }
                    i28 = i25 | 221184;
                    if ((i8 & 1572864) != 0) {
                        if ((i9 & 65536) == 0) {
                            i36 = 524288;
                        } else {
                            i36 = 524288;
                        }
                        i28 |= i36;
                    }
                    if ((i18 & 306783379) != 306783378) {
                        c0230o.R();
                        if ((i7 & 1) != 0) {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        } else {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        }
                        c0230o.q();
                        Z.o oVar1119 = oVar2;
                        c0230o.W(79582827);
                        j15 = p035g0.r.f9085l;
                        if (j10 != j15) {
                            i31 = i31;
                            jB = j10;
                            z7 = false;
                        } else {
                            c0230o.W(79582860);
                            jB = j13.b();
                            if (jB == j15) {
                                jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                            }
                            z7 = false;
                            c0230o.p(false);
                        }
                        c0230o.p(z7);
                        if (iVar3 != null) {
                            i32 = iVar3.f4745a;
                        } else {
                            i32 = Integer.MIN_VALUE;
                        }
                        long j211111111 = j14;
                        G0.J j211111112 = j13;
                        int i311111118 = i28 << 9;
                        int i311111119 = i31;
                        int i411111111115 = i30;
                        boolean z11114 = z6;
                        int i411111111116 = i29;
                        AbstractC0029o0.b(str, oVar1119, G0.J.e(j211111112, jB, j11, kVar2, j12, i32, j211111111, 16609104), i411111111116, z11114, i411111111115, i311111119, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i311111118 & 57344) | 196608 | (i311111118 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                        i33 = i30;
                        j16 = j10;
                        j17 = j211111111;
                        i34 = i311111119;
                        oVar3 = oVar1119;
                        z8 = z6;
                        kVar3 = kVar2;
                        int i411111111117 = i29;
                        iVar4 = iVar3;
                        j18 = j11;
                        j19 = j12;
                        j20 = j211111112;
                        i35 = i411111111117;
                    } else {
                        c0230o.R();
                        if ((i7 & 1) != 0) {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        } else {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        }
                        c0230o.q();
                        Z.o oVar11110 = oVar2;
                        c0230o.W(79582827);
                        j15 = p035g0.r.f9085l;
                        if (j10 != j15) {
                            i31 = i31;
                            jB = j10;
                            z7 = false;
                        } else {
                            c0230o.W(79582860);
                            jB = j13.b();
                            if (jB == j15) {
                                jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                            }
                            z7 = false;
                            c0230o.p(false);
                        }
                        c0230o.p(z7);
                        if (iVar3 != null) {
                            i32 = iVar3.f4745a;
                        } else {
                            i32 = Integer.MIN_VALUE;
                        }
                        long j211111113 = j14;
                        G0.J j211111114 = j13;
                        int i3111111110 = i28 << 9;
                        int i3111111111 = i31;
                        int i411111111118 = i30;
                        boolean z11115 = z6;
                        int i411111111119 = i29;
                        AbstractC0029o0.b(str, oVar11110, G0.J.e(j211111114, jB, j11, kVar2, j12, i32, j211111113, 16609104), i411111111119, z11115, i411111111118, i3111111111, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i3111111110 & 57344) | 196608 | (i3111111110 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                        i33 = i30;
                        j16 = j10;
                        j17 = j211111113;
                        i34 = i3111111111;
                        oVar3 = oVar11110;
                        z8 = z6;
                        kVar3 = kVar2;
                        int i4111111111110 = i29;
                        iVar4 = iVar3;
                        j18 = j11;
                        j19 = j12;
                        j20 = j211111114;
                        i35 = i4111111111110;
                    }
                    c0235q0T = c0230o.t();
                    if (c0235q0T != null) {
                        c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
                    }
                }
                i25 = i24 | 3456;
                i28 = i25 | 221184;
                if ((i8 & 1572864) != 0) {
                    if ((i9 & 65536) == 0) {
                        i36 = 524288;
                    } else {
                        i36 = 524288;
                    }
                    i28 |= i36;
                }
                if ((i18 & 306783379) != 306783378) {
                    c0230o.R();
                    if ((i7 & 1) != 0) {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    } else {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    }
                    c0230o.q();
                    Z.o oVar11111 = oVar2;
                    c0230o.W(79582827);
                    j15 = p035g0.r.f9085l;
                    if (j10 != j15) {
                        i31 = i31;
                        jB = j10;
                        z7 = false;
                    } else {
                        c0230o.W(79582860);
                        jB = j13.b();
                        if (jB == j15) {
                            jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                        }
                        z7 = false;
                        c0230o.p(false);
                    }
                    c0230o.p(z7);
                    if (iVar3 != null) {
                        i32 = iVar3.f4745a;
                    } else {
                        i32 = Integer.MIN_VALUE;
                    }
                    long j211111115 = j14;
                    G0.J j211111116 = j13;
                    int i3111111112 = i28 << 9;
                    int i3111111113 = i31;
                    int i4111111111111 = i30;
                    boolean z11116 = z6;
                    int i4111111111112 = i29;
                    AbstractC0029o0.b(str, oVar11111, G0.J.e(j211111116, jB, j11, kVar2, j12, i32, j211111115, 16609104), i4111111111112, z11116, i4111111111111, i3111111113, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i3111111112 & 57344) | 196608 | (i3111111112 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                    i33 = i30;
                    j16 = j10;
                    j17 = j211111115;
                    i34 = i3111111113;
                    oVar3 = oVar11111;
                    z8 = z6;
                    kVar3 = kVar2;
                    int i4111111111113 = i29;
                    iVar4 = iVar3;
                    j18 = j11;
                    j19 = j12;
                    j20 = j211111116;
                    i35 = i4111111111113;
                } else {
                    c0230o.R();
                    if ((i7 & 1) != 0) {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    } else {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    }
                    c0230o.q();
                    Z.o oVar11112 = oVar2;
                    c0230o.W(79582827);
                    j15 = p035g0.r.f9085l;
                    if (j10 != j15) {
                        i31 = i31;
                        jB = j10;
                        z7 = false;
                    } else {
                        c0230o.W(79582860);
                        jB = j13.b();
                        if (jB == j15) {
                            jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                        }
                        z7 = false;
                        c0230o.p(false);
                    }
                    c0230o.p(z7);
                    if (iVar3 != null) {
                        i32 = iVar3.f4745a;
                    } else {
                        i32 = Integer.MIN_VALUE;
                    }
                    long j211111117 = j14;
                    G0.J j211111118 = j13;
                    int i3111111114 = i28 << 9;
                    int i3111111115 = i31;
                    int i4111111111114 = i30;
                    boolean z11117 = z6;
                    int i4111111111115 = i29;
                    AbstractC0029o0.b(str, oVar11112, G0.J.e(j211111118, jB, j11, kVar2, j12, i32, j211111117, 16609104), i4111111111115, z11117, i4111111111114, i3111111115, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i3111111114 & 57344) | 196608 | (i3111111114 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                    i33 = i30;
                    j16 = j10;
                    j17 = j211111117;
                    i34 = i3111111115;
                    oVar3 = oVar11112;
                    z8 = z6;
                    kVar3 = kVar2;
                    int i4111111111116 = i29;
                    iVar4 = iVar3;
                    j18 = j11;
                    j19 = j12;
                    j20 = j211111118;
                    i35 = i4111111111116;
                }
                c0235q0T = c0230o.t();
                if (c0235q0T != null) {
                    c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
                }
            }
            i15 = i10 | 221184;
            kVar2 = kVar;
            i18 = i15 | 114819072;
            i19 = i9 & HueLog.LogComponent.APPCORE;
            if (i19 != 0) {
                if ((805306368 & i7) == 0) {
                    iVar2 = iVar;
                    if (c0230o.f(iVar2)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i18 |= i20;
                }
                i21 = i8 | 6;
                i22 = i9 & 2048;
                if (i22 != 0) {
                    i21 = i8 | 54;
                } else if ((i8 & 48) == 0) {
                    if (c0230o.d(i)) {
                        i23 = 32;
                    } else {
                        i23 = 16;
                    }
                    i21 |= i23;
                }
                i24 = i21;
                i25 = i24 | 384;
                i26 = i9 & 8192;
                if (i26 != 0) {
                    if ((i8 & 3072) == 0) {
                        if (c0230o.d(i3)) {
                            i27 = 2048;
                        } else {
                            i27 = 1024;
                        }
                        i25 |= i27;
                    }
                    i28 = i25 | 221184;
                    if ((i8 & 1572864) != 0) {
                        if ((i9 & 65536) == 0) {
                            i36 = 524288;
                        } else {
                            i36 = 524288;
                        }
                        i28 |= i36;
                    }
                    if ((i18 & 306783379) != 306783378) {
                        c0230o.R();
                        if ((i7 & 1) != 0) {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        } else {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        }
                        c0230o.q();
                        Z.o oVar11113 = oVar2;
                        c0230o.W(79582827);
                        j15 = p035g0.r.f9085l;
                        if (j10 != j15) {
                            i31 = i31;
                            jB = j10;
                            z7 = false;
                        } else {
                            c0230o.W(79582860);
                            jB = j13.b();
                            if (jB == j15) {
                                jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                            }
                            z7 = false;
                            c0230o.p(false);
                        }
                        c0230o.p(z7);
                        if (iVar3 != null) {
                            i32 = iVar3.f4745a;
                        } else {
                            i32 = Integer.MIN_VALUE;
                        }
                        long j211111119 = j14;
                        G0.J j2111111110 = j13;
                        int i3111111116 = i28 << 9;
                        int i3111111117 = i31;
                        int i4111111111117 = i30;
                        boolean z11118 = z6;
                        int i4111111111118 = i29;
                        AbstractC0029o0.b(str, oVar11113, G0.J.e(j2111111110, jB, j11, kVar2, j12, i32, j211111119, 16609104), i4111111111118, z11118, i4111111111117, i3111111117, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i3111111116 & 57344) | 196608 | (i3111111116 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                        i33 = i30;
                        j16 = j10;
                        j17 = j211111119;
                        i34 = i3111111117;
                        oVar3 = oVar11113;
                        z8 = z6;
                        kVar3 = kVar2;
                        int i4111111111119 = i29;
                        iVar4 = iVar3;
                        j18 = j11;
                        j19 = j12;
                        j20 = j2111111110;
                        i35 = i4111111111119;
                    } else {
                        c0230o.R();
                        if ((i7 & 1) != 0) {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        } else {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        }
                        c0230o.q();
                        Z.o oVar11114 = oVar2;
                        c0230o.W(79582827);
                        j15 = p035g0.r.f9085l;
                        if (j10 != j15) {
                            i31 = i31;
                            jB = j10;
                            z7 = false;
                        } else {
                            c0230o.W(79582860);
                            jB = j13.b();
                            if (jB == j15) {
                                jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                            }
                            z7 = false;
                            c0230o.p(false);
                        }
                        c0230o.p(z7);
                        if (iVar3 != null) {
                            i32 = iVar3.f4745a;
                        } else {
                            i32 = Integer.MIN_VALUE;
                        }
                        long j2111111111 = j14;
                        G0.J j2111111112 = j13;
                        int i3111111118 = i28 << 9;
                        int i3111111119 = i31;
                        int i41111111111110 = i30;
                        boolean z11119 = z6;
                        int i41111111111111 = i29;
                        AbstractC0029o0.b(str, oVar11114, G0.J.e(j2111111112, jB, j11, kVar2, j12, i32, j2111111111, 16609104), i41111111111111, z11119, i41111111111110, i3111111119, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i3111111118 & 57344) | 196608 | (i3111111118 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                        i33 = i30;
                        j16 = j10;
                        j17 = j2111111111;
                        i34 = i3111111119;
                        oVar3 = oVar11114;
                        z8 = z6;
                        kVar3 = kVar2;
                        int i41111111111112 = i29;
                        iVar4 = iVar3;
                        j18 = j11;
                        j19 = j12;
                        j20 = j2111111112;
                        i35 = i41111111111112;
                    }
                    c0235q0T = c0230o.t();
                    if (c0235q0T != null) {
                        c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
                    }
                }
                i25 = i24 | 3456;
                i28 = i25 | 221184;
                if ((i8 & 1572864) != 0) {
                    if ((i9 & 65536) == 0) {
                        i36 = 524288;
                    } else {
                        i36 = 524288;
                    }
                    i28 |= i36;
                }
                if ((i18 & 306783379) != 306783378) {
                    c0230o.R();
                    if ((i7 & 1) != 0) {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    } else {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    }
                    c0230o.q();
                    Z.o oVar11115 = oVar2;
                    c0230o.W(79582827);
                    j15 = p035g0.r.f9085l;
                    if (j10 != j15) {
                        i31 = i31;
                        jB = j10;
                        z7 = false;
                    } else {
                        c0230o.W(79582860);
                        jB = j13.b();
                        if (jB == j15) {
                            jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                        }
                        z7 = false;
                        c0230o.p(false);
                    }
                    c0230o.p(z7);
                    if (iVar3 != null) {
                        i32 = iVar3.f4745a;
                    } else {
                        i32 = Integer.MIN_VALUE;
                    }
                    long j2111111113 = j14;
                    G0.J j2111111114 = j13;
                    int i31111111110 = i28 << 9;
                    int i31111111111 = i31;
                    int i41111111111113 = i30;
                    boolean z111110 = z6;
                    int i41111111111114 = i29;
                    AbstractC0029o0.b(str, oVar11115, G0.J.e(j2111111114, jB, j11, kVar2, j12, i32, j2111111113, 16609104), i41111111111114, z111110, i41111111111113, i31111111111, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i31111111110 & 57344) | 196608 | (i31111111110 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                    i33 = i30;
                    j16 = j10;
                    j17 = j2111111113;
                    i34 = i31111111111;
                    oVar3 = oVar11115;
                    z8 = z6;
                    kVar3 = kVar2;
                    int i41111111111115 = i29;
                    iVar4 = iVar3;
                    j18 = j11;
                    j19 = j12;
                    j20 = j2111111114;
                    i35 = i41111111111115;
                } else {
                    c0230o.R();
                    if ((i7 & 1) != 0) {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    } else {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    }
                    c0230o.q();
                    Z.o oVar11116 = oVar2;
                    c0230o.W(79582827);
                    j15 = p035g0.r.f9085l;
                    if (j10 != j15) {
                        i31 = i31;
                        jB = j10;
                        z7 = false;
                    } else {
                        c0230o.W(79582860);
                        jB = j13.b();
                        if (jB == j15) {
                            jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                        }
                        z7 = false;
                        c0230o.p(false);
                    }
                    c0230o.p(z7);
                    if (iVar3 != null) {
                        i32 = iVar3.f4745a;
                    } else {
                        i32 = Integer.MIN_VALUE;
                    }
                    long j2111111115 = j14;
                    G0.J j2111111116 = j13;
                    int i31111111112 = i28 << 9;
                    int i31111111113 = i31;
                    int i41111111111116 = i30;
                    boolean z111111 = z6;
                    int i41111111111117 = i29;
                    AbstractC0029o0.b(str, oVar11116, G0.J.e(j2111111116, jB, j11, kVar2, j12, i32, j2111111115, 16609104), i41111111111117, z111111, i41111111111116, i31111111113, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i31111111112 & 57344) | 196608 | (i31111111112 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                    i33 = i30;
                    j16 = j10;
                    j17 = j2111111115;
                    i34 = i31111111113;
                    oVar3 = oVar11116;
                    z8 = z6;
                    kVar3 = kVar2;
                    int i41111111111118 = i29;
                    iVar4 = iVar3;
                    j18 = j11;
                    j19 = j12;
                    j20 = j2111111116;
                    i35 = i41111111111118;
                }
                c0235q0T = c0230o.t();
                if (c0235q0T != null) {
                    c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
                }
            }
            i18 = i15 | 920125440;
            iVar2 = iVar;
            i21 = i8 | 6;
            i22 = i9 & 2048;
            if (i22 != 0) {
                i21 = i8 | 54;
            } else if ((i8 & 48) == 0) {
                if (c0230o.d(i)) {
                    i23 = 32;
                } else {
                    i23 = 16;
                }
                i21 |= i23;
            }
            i24 = i21;
            i25 = i24 | 384;
            i26 = i9 & 8192;
            if (i26 != 0) {
                if ((i8 & 3072) == 0) {
                    if (c0230o.d(i3)) {
                        i27 = 2048;
                    } else {
                        i27 = 1024;
                    }
                    i25 |= i27;
                }
                i28 = i25 | 221184;
                if ((i8 & 1572864) != 0) {
                    if ((i9 & 65536) == 0) {
                        i36 = 524288;
                    } else {
                        i36 = 524288;
                    }
                    i28 |= i36;
                }
                if ((i18 & 306783379) != 306783378) {
                    c0230o.R();
                    if ((i7 & 1) != 0) {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    } else {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    }
                    c0230o.q();
                    Z.o oVar11117 = oVar2;
                    c0230o.W(79582827);
                    j15 = p035g0.r.f9085l;
                    if (j10 != j15) {
                        i31 = i31;
                        jB = j10;
                        z7 = false;
                    } else {
                        c0230o.W(79582860);
                        jB = j13.b();
                        if (jB == j15) {
                            jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                        }
                        z7 = false;
                        c0230o.p(false);
                    }
                    c0230o.p(z7);
                    if (iVar3 != null) {
                        i32 = iVar3.f4745a;
                    } else {
                        i32 = Integer.MIN_VALUE;
                    }
                    long j2111111117 = j14;
                    G0.J j2111111118 = j13;
                    int i31111111114 = i28 << 9;
                    int i31111111115 = i31;
                    int i41111111111119 = i30;
                    boolean z111112 = z6;
                    int i411111111111110 = i29;
                    AbstractC0029o0.b(str, oVar11117, G0.J.e(j2111111118, jB, j11, kVar2, j12, i32, j2111111117, 16609104), i411111111111110, z111112, i41111111111119, i31111111115, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i31111111114 & 57344) | 196608 | (i31111111114 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                    i33 = i30;
                    j16 = j10;
                    j17 = j2111111117;
                    i34 = i31111111115;
                    oVar3 = oVar11117;
                    z8 = z6;
                    kVar3 = kVar2;
                    int i411111111111111 = i29;
                    iVar4 = iVar3;
                    j18 = j11;
                    j19 = j12;
                    j20 = j2111111118;
                    i35 = i411111111111111;
                } else {
                    c0230o.R();
                    if ((i7 & 1) != 0) {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    } else {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    }
                    c0230o.q();
                    Z.o oVar11118 = oVar2;
                    c0230o.W(79582827);
                    j15 = p035g0.r.f9085l;
                    if (j10 != j15) {
                        i31 = i31;
                        jB = j10;
                        z7 = false;
                    } else {
                        c0230o.W(79582860);
                        jB = j13.b();
                        if (jB == j15) {
                            jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                        }
                        z7 = false;
                        c0230o.p(false);
                    }
                    c0230o.p(z7);
                    if (iVar3 != null) {
                        i32 = iVar3.f4745a;
                    } else {
                        i32 = Integer.MIN_VALUE;
                    }
                    long j2111111119 = j14;
                    G0.J j21111111110 = j13;
                    int i31111111116 = i28 << 9;
                    int i31111111117 = i31;
                    int i411111111111112 = i30;
                    boolean z111113 = z6;
                    int i411111111111113 = i29;
                    AbstractC0029o0.b(str, oVar11118, G0.J.e(j21111111110, jB, j11, kVar2, j12, i32, j2111111119, 16609104), i411111111111113, z111113, i411111111111112, i31111111117, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i31111111116 & 57344) | 196608 | (i31111111116 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                    i33 = i30;
                    j16 = j10;
                    j17 = j2111111119;
                    i34 = i31111111117;
                    oVar3 = oVar11118;
                    z8 = z6;
                    kVar3 = kVar2;
                    int i411111111111114 = i29;
                    iVar4 = iVar3;
                    j18 = j11;
                    j19 = j12;
                    j20 = j21111111110;
                    i35 = i411111111111114;
                }
                c0235q0T = c0230o.t();
                if (c0235q0T != null) {
                    c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
                }
            }
            i25 = i24 | 3456;
            i28 = i25 | 221184;
            if ((i8 & 1572864) != 0) {
                if ((i9 & 65536) == 0) {
                    i36 = 524288;
                } else {
                    i36 = 524288;
                }
                i28 |= i36;
            }
            if ((i18 & 306783379) != 306783378) {
                c0230o.R();
                if ((i7 & 1) != 0) {
                    if (i37 != 0) {
                        oVar2 = Z.l.f5957a;
                    } else {
                        oVar2 = oVar;
                    }
                    if (i11 != 0) {
                        j10 = p035g0.r.f9085l;
                    }
                    if (i13 != 0) {
                        j11 = S0.m.f4901c;
                    }
                    if (i16 != 0) {
                        kVar2 = null;
                    }
                    j12 = S0.m.f4901c;
                    if (i19 == 0) {
                    }
                    z6 = true;
                    i31 = 1;
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i;
                    }
                    if (i26 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i3;
                    }
                    if ((i9 & 65536) != 0) {
                        i28 &= -3670017;
                        j13 = (G0.J) c0230o.k(f2713a);
                    } else {
                        j13 = j9;
                    }
                    j14 = j12;
                } else {
                    if (i37 != 0) {
                        oVar2 = Z.l.f5957a;
                    } else {
                        oVar2 = oVar;
                    }
                    if (i11 != 0) {
                        j10 = p035g0.r.f9085l;
                    }
                    if (i13 != 0) {
                        j11 = S0.m.f4901c;
                    }
                    if (i16 != 0) {
                        kVar2 = null;
                    }
                    j12 = S0.m.f4901c;
                    if (i19 == 0) {
                    }
                    z6 = true;
                    i31 = 1;
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i;
                    }
                    if (i26 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i3;
                    }
                    if ((i9 & 65536) != 0) {
                        i28 &= -3670017;
                        j13 = (G0.J) c0230o.k(f2713a);
                    } else {
                        j13 = j9;
                    }
                    j14 = j12;
                }
                c0230o.q();
                Z.o oVar11119 = oVar2;
                c0230o.W(79582827);
                j15 = p035g0.r.f9085l;
                if (j10 != j15) {
                    i31 = i31;
                    jB = j10;
                    z7 = false;
                } else {
                    c0230o.W(79582860);
                    jB = j13.b();
                    if (jB == j15) {
                        jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                    }
                    z7 = false;
                    c0230o.p(false);
                }
                c0230o.p(z7);
                if (iVar3 != null) {
                    i32 = iVar3.f4745a;
                } else {
                    i32 = Integer.MIN_VALUE;
                }
                long j21111111111 = j14;
                G0.J j21111111112 = j13;
                int i31111111118 = i28 << 9;
                int i31111111119 = i31;
                int i411111111111115 = i30;
                boolean z111114 = z6;
                int i411111111111116 = i29;
                AbstractC0029o0.b(str, oVar11119, G0.J.e(j21111111112, jB, j11, kVar2, j12, i32, j21111111111, 16609104), i411111111111116, z111114, i411111111111115, i31111111119, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i31111111118 & 57344) | 196608 | (i31111111118 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                i33 = i30;
                j16 = j10;
                j17 = j21111111111;
                i34 = i31111111119;
                oVar3 = oVar11119;
                z8 = z6;
                kVar3 = kVar2;
                int i411111111111117 = i29;
                iVar4 = iVar3;
                j18 = j11;
                j19 = j12;
                j20 = j21111111112;
                i35 = i411111111111117;
            } else {
                c0230o.R();
                if ((i7 & 1) != 0) {
                    if (i37 != 0) {
                        oVar2 = Z.l.f5957a;
                    } else {
                        oVar2 = oVar;
                    }
                    if (i11 != 0) {
                        j10 = p035g0.r.f9085l;
                    }
                    if (i13 != 0) {
                        j11 = S0.m.f4901c;
                    }
                    if (i16 != 0) {
                        kVar2 = null;
                    }
                    j12 = S0.m.f4901c;
                    if (i19 == 0) {
                    }
                    z6 = true;
                    i31 = 1;
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i;
                    }
                    if (i26 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i3;
                    }
                    if ((i9 & 65536) != 0) {
                        i28 &= -3670017;
                        j13 = (G0.J) c0230o.k(f2713a);
                    } else {
                        j13 = j9;
                    }
                    j14 = j12;
                } else {
                    if (i37 != 0) {
                        oVar2 = Z.l.f5957a;
                    } else {
                        oVar2 = oVar;
                    }
                    if (i11 != 0) {
                        j10 = p035g0.r.f9085l;
                    }
                    if (i13 != 0) {
                        j11 = S0.m.f4901c;
                    }
                    if (i16 != 0) {
                        kVar2 = null;
                    }
                    j12 = S0.m.f4901c;
                    if (i19 == 0) {
                    }
                    z6 = true;
                    i31 = 1;
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i;
                    }
                    if (i26 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i3;
                    }
                    if ((i9 & 65536) != 0) {
                        i28 &= -3670017;
                        j13 = (G0.J) c0230o.k(f2713a);
                    } else {
                        j13 = j9;
                    }
                    j14 = j12;
                }
                c0230o.q();
                Z.o oVar111110 = oVar2;
                c0230o.W(79582827);
                j15 = p035g0.r.f9085l;
                if (j10 != j15) {
                    i31 = i31;
                    jB = j10;
                    z7 = false;
                } else {
                    c0230o.W(79582860);
                    jB = j13.b();
                    if (jB == j15) {
                        jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                    }
                    z7 = false;
                    c0230o.p(false);
                }
                c0230o.p(z7);
                if (iVar3 != null) {
                    i32 = iVar3.f4745a;
                } else {
                    i32 = Integer.MIN_VALUE;
                }
                long j21111111113 = j14;
                G0.J j21111111114 = j13;
                int i311111111110 = i28 << 9;
                int i311111111111 = i31;
                int i411111111111118 = i30;
                boolean z111115 = z6;
                int i411111111111119 = i29;
                AbstractC0029o0.b(str, oVar111110, G0.J.e(j21111111114, jB, j11, kVar2, j12, i32, j21111111113, 16609104), i411111111111119, z111115, i411111111111118, i311111111111, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i311111111110 & 57344) | 196608 | (i311111111110 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                i33 = i30;
                j16 = j10;
                j17 = j21111111113;
                i34 = i311111111111;
                oVar3 = oVar111110;
                z8 = z6;
                kVar3 = kVar2;
                int i4111111111111110 = i29;
                iVar4 = iVar3;
                j18 = j11;
                j19 = j12;
                j20 = j21111111114;
                i35 = i4111111111111110;
            }
            c0235q0T = c0230o.t();
            if (c0235q0T != null) {
                c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
            }
        }
        i10 |= 384;
        j10 = j4;
        i13 = i9 & 8;
        if (i13 != 0) {
            i10 |= 3072;
            j11 = j6;
        } else {
            j11 = j6;
            if ((i7 & 3072) == 0) {
                if (c0230o.e(j11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i10 |= i14;
            }
        }
        i15 = i10 | 24576;
        i16 = i9 & 32;
        if (i16 != 0) {
            if ((i7 & 196608) == 0) {
                kVar2 = kVar;
                if (c0230o.f(kVar2)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i15 |= i17;
            }
            i18 = i15 | 114819072;
            i19 = i9 & HueLog.LogComponent.APPCORE;
            if (i19 != 0) {
                if ((805306368 & i7) == 0) {
                    iVar2 = iVar;
                    if (c0230o.f(iVar2)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i18 |= i20;
                }
                i21 = i8 | 6;
                i22 = i9 & 2048;
                if (i22 != 0) {
                    i21 = i8 | 54;
                } else if ((i8 & 48) == 0) {
                    if (c0230o.d(i)) {
                        i23 = 32;
                    } else {
                        i23 = 16;
                    }
                    i21 |= i23;
                }
                i24 = i21;
                i25 = i24 | 384;
                i26 = i9 & 8192;
                if (i26 != 0) {
                    if ((i8 & 3072) == 0) {
                        if (c0230o.d(i3)) {
                            i27 = 2048;
                        } else {
                            i27 = 1024;
                        }
                        i25 |= i27;
                    }
                    i28 = i25 | 221184;
                    if ((i8 & 1572864) != 0) {
                        if ((i9 & 65536) == 0) {
                            i36 = 524288;
                        } else {
                            i36 = 524288;
                        }
                        i28 |= i36;
                    }
                    if ((i18 & 306783379) != 306783378) {
                        c0230o.R();
                        if ((i7 & 1) != 0) {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        } else {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        }
                        c0230o.q();
                        Z.o oVar111111 = oVar2;
                        c0230o.W(79582827);
                        j15 = p035g0.r.f9085l;
                        if (j10 != j15) {
                            i31 = i31;
                            jB = j10;
                            z7 = false;
                        } else {
                            c0230o.W(79582860);
                            jB = j13.b();
                            if (jB == j15) {
                                jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                            }
                            z7 = false;
                            c0230o.p(false);
                        }
                        c0230o.p(z7);
                        if (iVar3 != null) {
                            i32 = iVar3.f4745a;
                        } else {
                            i32 = Integer.MIN_VALUE;
                        }
                        long j21111111115 = j14;
                        G0.J j21111111116 = j13;
                        int i311111111112 = i28 << 9;
                        int i311111111113 = i31;
                        int i4111111111111111 = i30;
                        boolean z111116 = z6;
                        int i4111111111111112 = i29;
                        AbstractC0029o0.b(str, oVar111111, G0.J.e(j21111111116, jB, j11, kVar2, j12, i32, j21111111115, 16609104), i4111111111111112, z111116, i4111111111111111, i311111111113, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i311111111112 & 57344) | 196608 | (i311111111112 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                        i33 = i30;
                        j16 = j10;
                        j17 = j21111111115;
                        i34 = i311111111113;
                        oVar3 = oVar111111;
                        z8 = z6;
                        kVar3 = kVar2;
                        int i4111111111111113 = i29;
                        iVar4 = iVar3;
                        j18 = j11;
                        j19 = j12;
                        j20 = j21111111116;
                        i35 = i4111111111111113;
                    } else {
                        c0230o.R();
                        if ((i7 & 1) != 0) {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        } else {
                            if (i37 != 0) {
                                oVar2 = Z.l.f5957a;
                            } else {
                                oVar2 = oVar;
                            }
                            if (i11 != 0) {
                                j10 = p035g0.r.f9085l;
                            }
                            if (i13 != 0) {
                                j11 = S0.m.f4901c;
                            }
                            if (i16 != 0) {
                                kVar2 = null;
                            }
                            j12 = S0.m.f4901c;
                            if (i19 == 0) {
                            }
                            z6 = true;
                            i31 = 1;
                            if (i22 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i;
                            }
                            if (i26 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i3;
                            }
                            if ((i9 & 65536) != 0) {
                                i28 &= -3670017;
                                j13 = (G0.J) c0230o.k(f2713a);
                            } else {
                                j13 = j9;
                            }
                            j14 = j12;
                        }
                        c0230o.q();
                        Z.o oVar111112 = oVar2;
                        c0230o.W(79582827);
                        j15 = p035g0.r.f9085l;
                        if (j10 != j15) {
                            i31 = i31;
                            jB = j10;
                            z7 = false;
                        } else {
                            c0230o.W(79582860);
                            jB = j13.b();
                            if (jB == j15) {
                                jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                            }
                            z7 = false;
                            c0230o.p(false);
                        }
                        c0230o.p(z7);
                        if (iVar3 != null) {
                            i32 = iVar3.f4745a;
                        } else {
                            i32 = Integer.MIN_VALUE;
                        }
                        long j21111111117 = j14;
                        G0.J j21111111118 = j13;
                        int i311111111114 = i28 << 9;
                        int i311111111115 = i31;
                        int i4111111111111114 = i30;
                        boolean z111117 = z6;
                        int i4111111111111115 = i29;
                        AbstractC0029o0.b(str, oVar111112, G0.J.e(j21111111118, jB, j11, kVar2, j12, i32, j21111111117, 16609104), i4111111111111115, z111117, i4111111111111114, i311111111115, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i311111111114 & 57344) | 196608 | (i311111111114 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                        i33 = i30;
                        j16 = j10;
                        j17 = j21111111117;
                        i34 = i311111111115;
                        oVar3 = oVar111112;
                        z8 = z6;
                        kVar3 = kVar2;
                        int i4111111111111116 = i29;
                        iVar4 = iVar3;
                        j18 = j11;
                        j19 = j12;
                        j20 = j21111111118;
                        i35 = i4111111111111116;
                    }
                    c0235q0T = c0230o.t();
                    if (c0235q0T != null) {
                        c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
                    }
                }
                i25 = i24 | 3456;
                i28 = i25 | 221184;
                if ((i8 & 1572864) != 0) {
                    if ((i9 & 65536) == 0) {
                        i36 = 524288;
                    } else {
                        i36 = 524288;
                    }
                    i28 |= i36;
                }
                if ((i18 & 306783379) != 306783378) {
                    c0230o.R();
                    if ((i7 & 1) != 0) {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    } else {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    }
                    c0230o.q();
                    Z.o oVar111113 = oVar2;
                    c0230o.W(79582827);
                    j15 = p035g0.r.f9085l;
                    if (j10 != j15) {
                        i31 = i31;
                        jB = j10;
                        z7 = false;
                    } else {
                        c0230o.W(79582860);
                        jB = j13.b();
                        if (jB == j15) {
                            jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                        }
                        z7 = false;
                        c0230o.p(false);
                    }
                    c0230o.p(z7);
                    if (iVar3 != null) {
                        i32 = iVar3.f4745a;
                    } else {
                        i32 = Integer.MIN_VALUE;
                    }
                    long j21111111119 = j14;
                    G0.J j211111111110 = j13;
                    int i311111111116 = i28 << 9;
                    int i311111111117 = i31;
                    int i4111111111111117 = i30;
                    boolean z111118 = z6;
                    int i4111111111111118 = i29;
                    AbstractC0029o0.b(str, oVar111113, G0.J.e(j211111111110, jB, j11, kVar2, j12, i32, j21111111119, 16609104), i4111111111111118, z111118, i4111111111111117, i311111111117, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i311111111116 & 57344) | 196608 | (i311111111116 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                    i33 = i30;
                    j16 = j10;
                    j17 = j21111111119;
                    i34 = i311111111117;
                    oVar3 = oVar111113;
                    z8 = z6;
                    kVar3 = kVar2;
                    int i4111111111111119 = i29;
                    iVar4 = iVar3;
                    j18 = j11;
                    j19 = j12;
                    j20 = j211111111110;
                    i35 = i4111111111111119;
                } else {
                    c0230o.R();
                    if ((i7 & 1) != 0) {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    } else {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    }
                    c0230o.q();
                    Z.o oVar111114 = oVar2;
                    c0230o.W(79582827);
                    j15 = p035g0.r.f9085l;
                    if (j10 != j15) {
                        i31 = i31;
                        jB = j10;
                        z7 = false;
                    } else {
                        c0230o.W(79582860);
                        jB = j13.b();
                        if (jB == j15) {
                            jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                        }
                        z7 = false;
                        c0230o.p(false);
                    }
                    c0230o.p(z7);
                    if (iVar3 != null) {
                        i32 = iVar3.f4745a;
                    } else {
                        i32 = Integer.MIN_VALUE;
                    }
                    long j211111111111 = j14;
                    G0.J j211111111112 = j13;
                    int i311111111118 = i28 << 9;
                    int i311111111119 = i31;
                    int i41111111111111110 = i30;
                    boolean z111119 = z6;
                    int i41111111111111111 = i29;
                    AbstractC0029o0.b(str, oVar111114, G0.J.e(j211111111112, jB, j11, kVar2, j12, i32, j211111111111, 16609104), i41111111111111111, z111119, i41111111111111110, i311111111119, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i311111111118 & 57344) | 196608 | (i311111111118 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                    i33 = i30;
                    j16 = j10;
                    j17 = j211111111111;
                    i34 = i311111111119;
                    oVar3 = oVar111114;
                    z8 = z6;
                    kVar3 = kVar2;
                    int i41111111111111112 = i29;
                    iVar4 = iVar3;
                    j18 = j11;
                    j19 = j12;
                    j20 = j211111111112;
                    i35 = i41111111111111112;
                }
                c0235q0T = c0230o.t();
                if (c0235q0T != null) {
                    c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
                }
            }
            i18 = i15 | 920125440;
            iVar2 = iVar;
            i21 = i8 | 6;
            i22 = i9 & 2048;
            if (i22 != 0) {
                i21 = i8 | 54;
            } else if ((i8 & 48) == 0) {
                if (c0230o.d(i)) {
                    i23 = 32;
                } else {
                    i23 = 16;
                }
                i21 |= i23;
            }
            i24 = i21;
            i25 = i24 | 384;
            i26 = i9 & 8192;
            if (i26 != 0) {
                if ((i8 & 3072) == 0) {
                    if (c0230o.d(i3)) {
                        i27 = 2048;
                    } else {
                        i27 = 1024;
                    }
                    i25 |= i27;
                }
                i28 = i25 | 221184;
                if ((i8 & 1572864) != 0) {
                    if ((i9 & 65536) == 0) {
                        i36 = 524288;
                    } else {
                        i36 = 524288;
                    }
                    i28 |= i36;
                }
                if ((i18 & 306783379) != 306783378) {
                    c0230o.R();
                    if ((i7 & 1) != 0) {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    } else {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    }
                    c0230o.q();
                    Z.o oVar111115 = oVar2;
                    c0230o.W(79582827);
                    j15 = p035g0.r.f9085l;
                    if (j10 != j15) {
                        i31 = i31;
                        jB = j10;
                        z7 = false;
                    } else {
                        c0230o.W(79582860);
                        jB = j13.b();
                        if (jB == j15) {
                            jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                        }
                        z7 = false;
                        c0230o.p(false);
                    }
                    c0230o.p(z7);
                    if (iVar3 != null) {
                        i32 = iVar3.f4745a;
                    } else {
                        i32 = Integer.MIN_VALUE;
                    }
                    long j211111111113 = j14;
                    G0.J j211111111114 = j13;
                    int i3111111111110 = i28 << 9;
                    int i3111111111111 = i31;
                    int i41111111111111113 = i30;
                    boolean z1111110 = z6;
                    int i41111111111111114 = i29;
                    AbstractC0029o0.b(str, oVar111115, G0.J.e(j211111111114, jB, j11, kVar2, j12, i32, j211111111113, 16609104), i41111111111111114, z1111110, i41111111111111113, i3111111111111, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i3111111111110 & 57344) | 196608 | (i3111111111110 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                    i33 = i30;
                    j16 = j10;
                    j17 = j211111111113;
                    i34 = i3111111111111;
                    oVar3 = oVar111115;
                    z8 = z6;
                    kVar3 = kVar2;
                    int i41111111111111115 = i29;
                    iVar4 = iVar3;
                    j18 = j11;
                    j19 = j12;
                    j20 = j211111111114;
                    i35 = i41111111111111115;
                } else {
                    c0230o.R();
                    if ((i7 & 1) != 0) {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    } else {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    }
                    c0230o.q();
                    Z.o oVar111116 = oVar2;
                    c0230o.W(79582827);
                    j15 = p035g0.r.f9085l;
                    if (j10 != j15) {
                        i31 = i31;
                        jB = j10;
                        z7 = false;
                    } else {
                        c0230o.W(79582860);
                        jB = j13.b();
                        if (jB == j15) {
                            jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                        }
                        z7 = false;
                        c0230o.p(false);
                    }
                    c0230o.p(z7);
                    if (iVar3 != null) {
                        i32 = iVar3.f4745a;
                    } else {
                        i32 = Integer.MIN_VALUE;
                    }
                    long j211111111115 = j14;
                    G0.J j211111111116 = j13;
                    int i3111111111112 = i28 << 9;
                    int i3111111111113 = i31;
                    int i41111111111111116 = i30;
                    boolean z1111111 = z6;
                    int i41111111111111117 = i29;
                    AbstractC0029o0.b(str, oVar111116, G0.J.e(j211111111116, jB, j11, kVar2, j12, i32, j211111111115, 16609104), i41111111111111117, z1111111, i41111111111111116, i3111111111113, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i3111111111112 & 57344) | 196608 | (i3111111111112 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                    i33 = i30;
                    j16 = j10;
                    j17 = j211111111115;
                    i34 = i3111111111113;
                    oVar3 = oVar111116;
                    z8 = z6;
                    kVar3 = kVar2;
                    int i41111111111111118 = i29;
                    iVar4 = iVar3;
                    j18 = j11;
                    j19 = j12;
                    j20 = j211111111116;
                    i35 = i41111111111111118;
                }
                c0235q0T = c0230o.t();
                if (c0235q0T != null) {
                    c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
                }
            }
            i25 = i24 | 3456;
            i28 = i25 | 221184;
            if ((i8 & 1572864) != 0) {
                if ((i9 & 65536) == 0) {
                    i36 = 524288;
                } else {
                    i36 = 524288;
                }
                i28 |= i36;
            }
            if ((i18 & 306783379) != 306783378) {
                c0230o.R();
                if ((i7 & 1) != 0) {
                    if (i37 != 0) {
                        oVar2 = Z.l.f5957a;
                    } else {
                        oVar2 = oVar;
                    }
                    if (i11 != 0) {
                        j10 = p035g0.r.f9085l;
                    }
                    if (i13 != 0) {
                        j11 = S0.m.f4901c;
                    }
                    if (i16 != 0) {
                        kVar2 = null;
                    }
                    j12 = S0.m.f4901c;
                    if (i19 == 0) {
                    }
                    z6 = true;
                    i31 = 1;
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i;
                    }
                    if (i26 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i3;
                    }
                    if ((i9 & 65536) != 0) {
                        i28 &= -3670017;
                        j13 = (G0.J) c0230o.k(f2713a);
                    } else {
                        j13 = j9;
                    }
                    j14 = j12;
                } else {
                    if (i37 != 0) {
                        oVar2 = Z.l.f5957a;
                    } else {
                        oVar2 = oVar;
                    }
                    if (i11 != 0) {
                        j10 = p035g0.r.f9085l;
                    }
                    if (i13 != 0) {
                        j11 = S0.m.f4901c;
                    }
                    if (i16 != 0) {
                        kVar2 = null;
                    }
                    j12 = S0.m.f4901c;
                    if (i19 == 0) {
                    }
                    z6 = true;
                    i31 = 1;
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i;
                    }
                    if (i26 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i3;
                    }
                    if ((i9 & 65536) != 0) {
                        i28 &= -3670017;
                        j13 = (G0.J) c0230o.k(f2713a);
                    } else {
                        j13 = j9;
                    }
                    j14 = j12;
                }
                c0230o.q();
                Z.o oVar111117 = oVar2;
                c0230o.W(79582827);
                j15 = p035g0.r.f9085l;
                if (j10 != j15) {
                    i31 = i31;
                    jB = j10;
                    z7 = false;
                } else {
                    c0230o.W(79582860);
                    jB = j13.b();
                    if (jB == j15) {
                        jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                    }
                    z7 = false;
                    c0230o.p(false);
                }
                c0230o.p(z7);
                if (iVar3 != null) {
                    i32 = iVar3.f4745a;
                } else {
                    i32 = Integer.MIN_VALUE;
                }
                long j211111111117 = j14;
                G0.J j211111111118 = j13;
                int i3111111111114 = i28 << 9;
                int i3111111111115 = i31;
                int i41111111111111119 = i30;
                boolean z1111112 = z6;
                int i411111111111111110 = i29;
                AbstractC0029o0.b(str, oVar111117, G0.J.e(j211111111118, jB, j11, kVar2, j12, i32, j211111111117, 16609104), i411111111111111110, z1111112, i41111111111111119, i3111111111115, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i3111111111114 & 57344) | 196608 | (i3111111111114 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                i33 = i30;
                j16 = j10;
                j17 = j211111111117;
                i34 = i3111111111115;
                oVar3 = oVar111117;
                z8 = z6;
                kVar3 = kVar2;
                int i411111111111111111 = i29;
                iVar4 = iVar3;
                j18 = j11;
                j19 = j12;
                j20 = j211111111118;
                i35 = i411111111111111111;
            } else {
                c0230o.R();
                if ((i7 & 1) != 0) {
                    if (i37 != 0) {
                        oVar2 = Z.l.f5957a;
                    } else {
                        oVar2 = oVar;
                    }
                    if (i11 != 0) {
                        j10 = p035g0.r.f9085l;
                    }
                    if (i13 != 0) {
                        j11 = S0.m.f4901c;
                    }
                    if (i16 != 0) {
                        kVar2 = null;
                    }
                    j12 = S0.m.f4901c;
                    if (i19 == 0) {
                    }
                    z6 = true;
                    i31 = 1;
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i;
                    }
                    if (i26 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i3;
                    }
                    if ((i9 & 65536) != 0) {
                        i28 &= -3670017;
                        j13 = (G0.J) c0230o.k(f2713a);
                    } else {
                        j13 = j9;
                    }
                    j14 = j12;
                } else {
                    if (i37 != 0) {
                        oVar2 = Z.l.f5957a;
                    } else {
                        oVar2 = oVar;
                    }
                    if (i11 != 0) {
                        j10 = p035g0.r.f9085l;
                    }
                    if (i13 != 0) {
                        j11 = S0.m.f4901c;
                    }
                    if (i16 != 0) {
                        kVar2 = null;
                    }
                    j12 = S0.m.f4901c;
                    if (i19 == 0) {
                    }
                    z6 = true;
                    i31 = 1;
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i;
                    }
                    if (i26 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i3;
                    }
                    if ((i9 & 65536) != 0) {
                        i28 &= -3670017;
                        j13 = (G0.J) c0230o.k(f2713a);
                    } else {
                        j13 = j9;
                    }
                    j14 = j12;
                }
                c0230o.q();
                Z.o oVar111118 = oVar2;
                c0230o.W(79582827);
                j15 = p035g0.r.f9085l;
                if (j10 != j15) {
                    i31 = i31;
                    jB = j10;
                    z7 = false;
                } else {
                    c0230o.W(79582860);
                    jB = j13.b();
                    if (jB == j15) {
                        jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                    }
                    z7 = false;
                    c0230o.p(false);
                }
                c0230o.p(z7);
                if (iVar3 != null) {
                    i32 = iVar3.f4745a;
                } else {
                    i32 = Integer.MIN_VALUE;
                }
                long j211111111119 = j14;
                G0.J j2111111111110 = j13;
                int i3111111111116 = i28 << 9;
                int i3111111111117 = i31;
                int i411111111111111112 = i30;
                boolean z1111113 = z6;
                int i411111111111111113 = i29;
                AbstractC0029o0.b(str, oVar111118, G0.J.e(j2111111111110, jB, j11, kVar2, j12, i32, j211111111119, 16609104), i411111111111111113, z1111113, i411111111111111112, i3111111111117, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i3111111111116 & 57344) | 196608 | (i3111111111116 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                i33 = i30;
                j16 = j10;
                j17 = j211111111119;
                i34 = i3111111111117;
                oVar3 = oVar111118;
                z8 = z6;
                kVar3 = kVar2;
                int i411111111111111114 = i29;
                iVar4 = iVar3;
                j18 = j11;
                j19 = j12;
                j20 = j2111111111110;
                i35 = i411111111111111114;
            }
            c0235q0T = c0230o.t();
            if (c0235q0T != null) {
                c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
            }
        }
        i15 = i10 | 221184;
        kVar2 = kVar;
        i18 = i15 | 114819072;
        i19 = i9 & HueLog.LogComponent.APPCORE;
        if (i19 != 0) {
            if ((805306368 & i7) == 0) {
                iVar2 = iVar;
                if (c0230o.f(iVar2)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i18 |= i20;
            }
            i21 = i8 | 6;
            i22 = i9 & 2048;
            if (i22 != 0) {
                i21 = i8 | 54;
            } else if ((i8 & 48) == 0) {
                if (c0230o.d(i)) {
                    i23 = 32;
                } else {
                    i23 = 16;
                }
                i21 |= i23;
            }
            i24 = i21;
            i25 = i24 | 384;
            i26 = i9 & 8192;
            if (i26 != 0) {
                if ((i8 & 3072) == 0) {
                    if (c0230o.d(i3)) {
                        i27 = 2048;
                    } else {
                        i27 = 1024;
                    }
                    i25 |= i27;
                }
                i28 = i25 | 221184;
                if ((i8 & 1572864) != 0) {
                    if ((i9 & 65536) == 0) {
                        i36 = 524288;
                    } else {
                        i36 = 524288;
                    }
                    i28 |= i36;
                }
                if ((i18 & 306783379) != 306783378) {
                    c0230o.R();
                    if ((i7 & 1) != 0) {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    } else {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    }
                    c0230o.q();
                    Z.o oVar111119 = oVar2;
                    c0230o.W(79582827);
                    j15 = p035g0.r.f9085l;
                    if (j10 != j15) {
                        i31 = i31;
                        jB = j10;
                        z7 = false;
                    } else {
                        c0230o.W(79582860);
                        jB = j13.b();
                        if (jB == j15) {
                            jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                        }
                        z7 = false;
                        c0230o.p(false);
                    }
                    c0230o.p(z7);
                    if (iVar3 != null) {
                        i32 = iVar3.f4745a;
                    } else {
                        i32 = Integer.MIN_VALUE;
                    }
                    long j2111111111111 = j14;
                    G0.J j2111111111112 = j13;
                    int i3111111111118 = i28 << 9;
                    int i3111111111119 = i31;
                    int i411111111111111115 = i30;
                    boolean z1111114 = z6;
                    int i411111111111111116 = i29;
                    AbstractC0029o0.b(str, oVar111119, G0.J.e(j2111111111112, jB, j11, kVar2, j12, i32, j2111111111111, 16609104), i411111111111111116, z1111114, i411111111111111115, i3111111111119, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i3111111111118 & 57344) | 196608 | (i3111111111118 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                    i33 = i30;
                    j16 = j10;
                    j17 = j2111111111111;
                    i34 = i3111111111119;
                    oVar3 = oVar111119;
                    z8 = z6;
                    kVar3 = kVar2;
                    int i411111111111111117 = i29;
                    iVar4 = iVar3;
                    j18 = j11;
                    j19 = j12;
                    j20 = j2111111111112;
                    i35 = i411111111111111117;
                } else {
                    c0230o.R();
                    if ((i7 & 1) != 0) {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    } else {
                        if (i37 != 0) {
                            oVar2 = Z.l.f5957a;
                        } else {
                            oVar2 = oVar;
                        }
                        if (i11 != 0) {
                            j10 = p035g0.r.f9085l;
                        }
                        if (i13 != 0) {
                            j11 = S0.m.f4901c;
                        }
                        if (i16 != 0) {
                            kVar2 = null;
                        }
                        j12 = S0.m.f4901c;
                        if (i19 == 0) {
                        }
                        z6 = true;
                        i31 = 1;
                        if (i22 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i;
                        }
                        if (i26 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i3;
                        }
                        if ((i9 & 65536) != 0) {
                            i28 &= -3670017;
                            j13 = (G0.J) c0230o.k(f2713a);
                        } else {
                            j13 = j9;
                        }
                        j14 = j12;
                    }
                    c0230o.q();
                    Z.o oVar1111110 = oVar2;
                    c0230o.W(79582827);
                    j15 = p035g0.r.f9085l;
                    if (j10 != j15) {
                        i31 = i31;
                        jB = j10;
                        z7 = false;
                    } else {
                        c0230o.W(79582860);
                        jB = j13.b();
                        if (jB == j15) {
                            jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                        }
                        z7 = false;
                        c0230o.p(false);
                    }
                    c0230o.p(z7);
                    if (iVar3 != null) {
                        i32 = iVar3.f4745a;
                    } else {
                        i32 = Integer.MIN_VALUE;
                    }
                    long j2111111111113 = j14;
                    G0.J j2111111111114 = j13;
                    int i31111111111110 = i28 << 9;
                    int i31111111111111 = i31;
                    int i411111111111111118 = i30;
                    boolean z1111115 = z6;
                    int i411111111111111119 = i29;
                    AbstractC0029o0.b(str, oVar1111110, G0.J.e(j2111111111114, jB, j11, kVar2, j12, i32, j2111111111113, 16609104), i411111111111111119, z1111115, i411111111111111118, i31111111111111, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i31111111111110 & 57344) | 196608 | (i31111111111110 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                    i33 = i30;
                    j16 = j10;
                    j17 = j2111111111113;
                    i34 = i31111111111111;
                    oVar3 = oVar1111110;
                    z8 = z6;
                    kVar3 = kVar2;
                    int i4111111111111111110 = i29;
                    iVar4 = iVar3;
                    j18 = j11;
                    j19 = j12;
                    j20 = j2111111111114;
                    i35 = i4111111111111111110;
                }
                c0235q0T = c0230o.t();
                if (c0235q0T != null) {
                    c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
                }
            }
            i25 = i24 | 3456;
            i28 = i25 | 221184;
            if ((i8 & 1572864) != 0) {
                if ((i9 & 65536) == 0) {
                    i36 = 524288;
                } else {
                    i36 = 524288;
                }
                i28 |= i36;
            }
            if ((i18 & 306783379) != 306783378) {
                c0230o.R();
                if ((i7 & 1) != 0) {
                    if (i37 != 0) {
                        oVar2 = Z.l.f5957a;
                    } else {
                        oVar2 = oVar;
                    }
                    if (i11 != 0) {
                        j10 = p035g0.r.f9085l;
                    }
                    if (i13 != 0) {
                        j11 = S0.m.f4901c;
                    }
                    if (i16 != 0) {
                        kVar2 = null;
                    }
                    j12 = S0.m.f4901c;
                    if (i19 == 0) {
                    }
                    z6 = true;
                    i31 = 1;
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i;
                    }
                    if (i26 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i3;
                    }
                    if ((i9 & 65536) != 0) {
                        i28 &= -3670017;
                        j13 = (G0.J) c0230o.k(f2713a);
                    } else {
                        j13 = j9;
                    }
                    j14 = j12;
                } else {
                    if (i37 != 0) {
                        oVar2 = Z.l.f5957a;
                    } else {
                        oVar2 = oVar;
                    }
                    if (i11 != 0) {
                        j10 = p035g0.r.f9085l;
                    }
                    if (i13 != 0) {
                        j11 = S0.m.f4901c;
                    }
                    if (i16 != 0) {
                        kVar2 = null;
                    }
                    j12 = S0.m.f4901c;
                    if (i19 == 0) {
                    }
                    z6 = true;
                    i31 = 1;
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i;
                    }
                    if (i26 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i3;
                    }
                    if ((i9 & 65536) != 0) {
                        i28 &= -3670017;
                        j13 = (G0.J) c0230o.k(f2713a);
                    } else {
                        j13 = j9;
                    }
                    j14 = j12;
                }
                c0230o.q();
                Z.o oVar1111111 = oVar2;
                c0230o.W(79582827);
                j15 = p035g0.r.f9085l;
                if (j10 != j15) {
                    i31 = i31;
                    jB = j10;
                    z7 = false;
                } else {
                    c0230o.W(79582860);
                    jB = j13.b();
                    if (jB == j15) {
                        jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                    }
                    z7 = false;
                    c0230o.p(false);
                }
                c0230o.p(z7);
                if (iVar3 != null) {
                    i32 = iVar3.f4745a;
                } else {
                    i32 = Integer.MIN_VALUE;
                }
                long j2111111111115 = j14;
                G0.J j2111111111116 = j13;
                int i31111111111112 = i28 << 9;
                int i31111111111113 = i31;
                int i4111111111111111111 = i30;
                boolean z1111116 = z6;
                int i4111111111111111112 = i29;
                AbstractC0029o0.b(str, oVar1111111, G0.J.e(j2111111111116, jB, j11, kVar2, j12, i32, j2111111111115, 16609104), i4111111111111111112, z1111116, i4111111111111111111, i31111111111113, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i31111111111112 & 57344) | 196608 | (i31111111111112 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                i33 = i30;
                j16 = j10;
                j17 = j2111111111115;
                i34 = i31111111111113;
                oVar3 = oVar1111111;
                z8 = z6;
                kVar3 = kVar2;
                int i4111111111111111113 = i29;
                iVar4 = iVar3;
                j18 = j11;
                j19 = j12;
                j20 = j2111111111116;
                i35 = i4111111111111111113;
            } else {
                c0230o.R();
                if ((i7 & 1) != 0) {
                    if (i37 != 0) {
                        oVar2 = Z.l.f5957a;
                    } else {
                        oVar2 = oVar;
                    }
                    if (i11 != 0) {
                        j10 = p035g0.r.f9085l;
                    }
                    if (i13 != 0) {
                        j11 = S0.m.f4901c;
                    }
                    if (i16 != 0) {
                        kVar2 = null;
                    }
                    j12 = S0.m.f4901c;
                    if (i19 == 0) {
                    }
                    z6 = true;
                    i31 = 1;
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i;
                    }
                    if (i26 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i3;
                    }
                    if ((i9 & 65536) != 0) {
                        i28 &= -3670017;
                        j13 = (G0.J) c0230o.k(f2713a);
                    } else {
                        j13 = j9;
                    }
                    j14 = j12;
                } else {
                    if (i37 != 0) {
                        oVar2 = Z.l.f5957a;
                    } else {
                        oVar2 = oVar;
                    }
                    if (i11 != 0) {
                        j10 = p035g0.r.f9085l;
                    }
                    if (i13 != 0) {
                        j11 = S0.m.f4901c;
                    }
                    if (i16 != 0) {
                        kVar2 = null;
                    }
                    j12 = S0.m.f4901c;
                    if (i19 == 0) {
                    }
                    z6 = true;
                    i31 = 1;
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i;
                    }
                    if (i26 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i3;
                    }
                    if ((i9 & 65536) != 0) {
                        i28 &= -3670017;
                        j13 = (G0.J) c0230o.k(f2713a);
                    } else {
                        j13 = j9;
                    }
                    j14 = j12;
                }
                c0230o.q();
                Z.o oVar1111112 = oVar2;
                c0230o.W(79582827);
                j15 = p035g0.r.f9085l;
                if (j10 != j15) {
                    i31 = i31;
                    jB = j10;
                    z7 = false;
                } else {
                    c0230o.W(79582860);
                    jB = j13.b();
                    if (jB == j15) {
                        jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                    }
                    z7 = false;
                    c0230o.p(false);
                }
                c0230o.p(z7);
                if (iVar3 != null) {
                    i32 = iVar3.f4745a;
                } else {
                    i32 = Integer.MIN_VALUE;
                }
                long j2111111111117 = j14;
                G0.J j2111111111118 = j13;
                int i31111111111114 = i28 << 9;
                int i31111111111115 = i31;
                int i4111111111111111114 = i30;
                boolean z1111117 = z6;
                int i4111111111111111115 = i29;
                AbstractC0029o0.b(str, oVar1111112, G0.J.e(j2111111111118, jB, j11, kVar2, j12, i32, j2111111111117, 16609104), i4111111111111111115, z1111117, i4111111111111111114, i31111111111115, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i31111111111114 & 57344) | 196608 | (i31111111111114 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                i33 = i30;
                j16 = j10;
                j17 = j2111111111117;
                i34 = i31111111111115;
                oVar3 = oVar1111112;
                z8 = z6;
                kVar3 = kVar2;
                int i4111111111111111116 = i29;
                iVar4 = iVar3;
                j18 = j11;
                j19 = j12;
                j20 = j2111111111118;
                i35 = i4111111111111111116;
            }
            c0235q0T = c0230o.t();
            if (c0235q0T != null) {
                c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
            }
        }
        i18 = i15 | 920125440;
        iVar2 = iVar;
        i21 = i8 | 6;
        i22 = i9 & 2048;
        if (i22 != 0) {
            i21 = i8 | 54;
        } else if ((i8 & 48) == 0) {
            if (c0230o.d(i)) {
                i23 = 32;
            } else {
                i23 = 16;
            }
            i21 |= i23;
        }
        i24 = i21;
        i25 = i24 | 384;
        i26 = i9 & 8192;
        if (i26 != 0) {
            if ((i8 & 3072) == 0) {
                if (c0230o.d(i3)) {
                    i27 = 2048;
                } else {
                    i27 = 1024;
                }
                i25 |= i27;
            }
            i28 = i25 | 221184;
            if ((i8 & 1572864) != 0) {
                if ((i9 & 65536) == 0) {
                    i36 = 524288;
                } else {
                    i36 = 524288;
                }
                i28 |= i36;
            }
            if ((i18 & 306783379) != 306783378) {
                c0230o.R();
                if ((i7 & 1) != 0) {
                    if (i37 != 0) {
                        oVar2 = Z.l.f5957a;
                    } else {
                        oVar2 = oVar;
                    }
                    if (i11 != 0) {
                        j10 = p035g0.r.f9085l;
                    }
                    if (i13 != 0) {
                        j11 = S0.m.f4901c;
                    }
                    if (i16 != 0) {
                        kVar2 = null;
                    }
                    j12 = S0.m.f4901c;
                    if (i19 == 0) {
                    }
                    z6 = true;
                    i31 = 1;
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i;
                    }
                    if (i26 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i3;
                    }
                    if ((i9 & 65536) != 0) {
                        i28 &= -3670017;
                        j13 = (G0.J) c0230o.k(f2713a);
                    } else {
                        j13 = j9;
                    }
                    j14 = j12;
                } else {
                    if (i37 != 0) {
                        oVar2 = Z.l.f5957a;
                    } else {
                        oVar2 = oVar;
                    }
                    if (i11 != 0) {
                        j10 = p035g0.r.f9085l;
                    }
                    if (i13 != 0) {
                        j11 = S0.m.f4901c;
                    }
                    if (i16 != 0) {
                        kVar2 = null;
                    }
                    j12 = S0.m.f4901c;
                    if (i19 == 0) {
                    }
                    z6 = true;
                    i31 = 1;
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i;
                    }
                    if (i26 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i3;
                    }
                    if ((i9 & 65536) != 0) {
                        i28 &= -3670017;
                        j13 = (G0.J) c0230o.k(f2713a);
                    } else {
                        j13 = j9;
                    }
                    j14 = j12;
                }
                c0230o.q();
                Z.o oVar1111113 = oVar2;
                c0230o.W(79582827);
                j15 = p035g0.r.f9085l;
                if (j10 != j15) {
                    i31 = i31;
                    jB = j10;
                    z7 = false;
                } else {
                    c0230o.W(79582860);
                    jB = j13.b();
                    if (jB == j15) {
                        jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                    }
                    z7 = false;
                    c0230o.p(false);
                }
                c0230o.p(z7);
                if (iVar3 != null) {
                    i32 = iVar3.f4745a;
                } else {
                    i32 = Integer.MIN_VALUE;
                }
                long j2111111111119 = j14;
                G0.J j21111111111110 = j13;
                int i31111111111116 = i28 << 9;
                int i31111111111117 = i31;
                int i4111111111111111117 = i30;
                boolean z1111118 = z6;
                int i4111111111111111118 = i29;
                AbstractC0029o0.b(str, oVar1111113, G0.J.e(j21111111111110, jB, j11, kVar2, j12, i32, j2111111111119, 16609104), i4111111111111111118, z1111118, i4111111111111111117, i31111111111117, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i31111111111116 & 57344) | 196608 | (i31111111111116 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                i33 = i30;
                j16 = j10;
                j17 = j2111111111119;
                i34 = i31111111111117;
                oVar3 = oVar1111113;
                z8 = z6;
                kVar3 = kVar2;
                int i4111111111111111119 = i29;
                iVar4 = iVar3;
                j18 = j11;
                j19 = j12;
                j20 = j21111111111110;
                i35 = i4111111111111111119;
            } else {
                c0230o.R();
                if ((i7 & 1) != 0) {
                    if (i37 != 0) {
                        oVar2 = Z.l.f5957a;
                    } else {
                        oVar2 = oVar;
                    }
                    if (i11 != 0) {
                        j10 = p035g0.r.f9085l;
                    }
                    if (i13 != 0) {
                        j11 = S0.m.f4901c;
                    }
                    if (i16 != 0) {
                        kVar2 = null;
                    }
                    j12 = S0.m.f4901c;
                    if (i19 == 0) {
                    }
                    z6 = true;
                    i31 = 1;
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i;
                    }
                    if (i26 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i3;
                    }
                    if ((i9 & 65536) != 0) {
                        i28 &= -3670017;
                        j13 = (G0.J) c0230o.k(f2713a);
                    } else {
                        j13 = j9;
                    }
                    j14 = j12;
                } else {
                    if (i37 != 0) {
                        oVar2 = Z.l.f5957a;
                    } else {
                        oVar2 = oVar;
                    }
                    if (i11 != 0) {
                        j10 = p035g0.r.f9085l;
                    }
                    if (i13 != 0) {
                        j11 = S0.m.f4901c;
                    }
                    if (i16 != 0) {
                        kVar2 = null;
                    }
                    j12 = S0.m.f4901c;
                    if (i19 == 0) {
                    }
                    z6 = true;
                    i31 = 1;
                    if (i22 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i;
                    }
                    if (i26 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i3;
                    }
                    if ((i9 & 65536) != 0) {
                        i28 &= -3670017;
                        j13 = (G0.J) c0230o.k(f2713a);
                    } else {
                        j13 = j9;
                    }
                    j14 = j12;
                }
                c0230o.q();
                Z.o oVar1111114 = oVar2;
                c0230o.W(79582827);
                j15 = p035g0.r.f9085l;
                if (j10 != j15) {
                    i31 = i31;
                    jB = j10;
                    z7 = false;
                } else {
                    c0230o.W(79582860);
                    jB = j13.b();
                    if (jB == j15) {
                        jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                    }
                    z7 = false;
                    c0230o.p(false);
                }
                c0230o.p(z7);
                if (iVar3 != null) {
                    i32 = iVar3.f4745a;
                } else {
                    i32 = Integer.MIN_VALUE;
                }
                long j21111111111111 = j14;
                G0.J j21111111111112 = j13;
                int i31111111111118 = i28 << 9;
                int i31111111111119 = i31;
                int i41111111111111111110 = i30;
                boolean z1111119 = z6;
                int i41111111111111111111 = i29;
                AbstractC0029o0.b(str, oVar1111114, G0.J.e(j21111111111112, jB, j11, kVar2, j12, i32, j21111111111111, 16609104), i41111111111111111111, z1111119, i41111111111111111110, i31111111111119, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i31111111111118 & 57344) | 196608 | (i31111111111118 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
                i33 = i30;
                j16 = j10;
                j17 = j21111111111111;
                i34 = i31111111111119;
                oVar3 = oVar1111114;
                z8 = z6;
                kVar3 = kVar2;
                int i41111111111111111112 = i29;
                iVar4 = iVar3;
                j18 = j11;
                j19 = j12;
                j20 = j21111111111112;
                i35 = i41111111111111111112;
            }
            c0235q0T = c0230o.t();
            if (c0235q0T != null) {
                c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
            }
        }
        i25 = i24 | 3456;
        i28 = i25 | 221184;
        if ((i8 & 1572864) != 0) {
            if ((i9 & 65536) == 0) {
                i36 = 524288;
            } else {
                i36 = 524288;
            }
            i28 |= i36;
        }
        if ((i18 & 306783379) != 306783378) {
            c0230o.R();
            if ((i7 & 1) != 0) {
                if (i37 != 0) {
                    oVar2 = Z.l.f5957a;
                } else {
                    oVar2 = oVar;
                }
                if (i11 != 0) {
                    j10 = p035g0.r.f9085l;
                }
                if (i13 != 0) {
                    j11 = S0.m.f4901c;
                }
                if (i16 != 0) {
                    kVar2 = null;
                }
                j12 = S0.m.f4901c;
                if (i19 == 0) {
                }
                z6 = true;
                i31 = 1;
                if (i22 != 0) {
                    i29 = 1;
                } else {
                    i29 = i;
                }
                if (i26 != 0) {
                    i30 = Integer.MAX_VALUE;
                } else {
                    i30 = i3;
                }
                if ((i9 & 65536) != 0) {
                    i28 &= -3670017;
                    j13 = (G0.J) c0230o.k(f2713a);
                } else {
                    j13 = j9;
                }
                j14 = j12;
            } else {
                if (i37 != 0) {
                    oVar2 = Z.l.f5957a;
                } else {
                    oVar2 = oVar;
                }
                if (i11 != 0) {
                    j10 = p035g0.r.f9085l;
                }
                if (i13 != 0) {
                    j11 = S0.m.f4901c;
                }
                if (i16 != 0) {
                    kVar2 = null;
                }
                j12 = S0.m.f4901c;
                if (i19 == 0) {
                }
                z6 = true;
                i31 = 1;
                if (i22 != 0) {
                    i29 = 1;
                } else {
                    i29 = i;
                }
                if (i26 != 0) {
                    i30 = Integer.MAX_VALUE;
                } else {
                    i30 = i3;
                }
                if ((i9 & 65536) != 0) {
                    i28 &= -3670017;
                    j13 = (G0.J) c0230o.k(f2713a);
                } else {
                    j13 = j9;
                }
                j14 = j12;
            }
            c0230o.q();
            Z.o oVar1111115 = oVar2;
            c0230o.W(79582827);
            j15 = p035g0.r.f9085l;
            if (j10 != j15) {
                i31 = i31;
                jB = j10;
                z7 = false;
            } else {
                c0230o.W(79582860);
                jB = j13.b();
                if (jB == j15) {
                    jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                }
                z7 = false;
                c0230o.p(false);
            }
            c0230o.p(z7);
            if (iVar3 != null) {
                i32 = iVar3.f4745a;
            } else {
                i32 = Integer.MIN_VALUE;
            }
            long j21111111111113 = j14;
            G0.J j21111111111114 = j13;
            int i311111111111110 = i28 << 9;
            int i311111111111111 = i31;
            int i41111111111111111113 = i30;
            boolean z11111110 = z6;
            int i41111111111111111114 = i29;
            AbstractC0029o0.b(str, oVar1111115, G0.J.e(j21111111111114, jB, j11, kVar2, j12, i32, j21111111111113, 16609104), i41111111111111111114, z11111110, i41111111111111111113, i311111111111111, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i311111111111110 & 57344) | 196608 | (i311111111111110 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
            i33 = i30;
            j16 = j10;
            j17 = j21111111111113;
            i34 = i311111111111111;
            oVar3 = oVar1111115;
            z8 = z6;
            kVar3 = kVar2;
            int i41111111111111111115 = i29;
            iVar4 = iVar3;
            j18 = j11;
            j19 = j12;
            j20 = j21111111111114;
            i35 = i41111111111111111115;
        } else {
            c0230o.R();
            if ((i7 & 1) != 0) {
                if (i37 != 0) {
                    oVar2 = Z.l.f5957a;
                } else {
                    oVar2 = oVar;
                }
                if (i11 != 0) {
                    j10 = p035g0.r.f9085l;
                }
                if (i13 != 0) {
                    j11 = S0.m.f4901c;
                }
                if (i16 != 0) {
                    kVar2 = null;
                }
                j12 = S0.m.f4901c;
                if (i19 == 0) {
                }
                z6 = true;
                i31 = 1;
                if (i22 != 0) {
                    i29 = 1;
                } else {
                    i29 = i;
                }
                if (i26 != 0) {
                    i30 = Integer.MAX_VALUE;
                } else {
                    i30 = i3;
                }
                if ((i9 & 65536) != 0) {
                    i28 &= -3670017;
                    j13 = (G0.J) c0230o.k(f2713a);
                } else {
                    j13 = j9;
                }
                j14 = j12;
            } else {
                if (i37 != 0) {
                    oVar2 = Z.l.f5957a;
                } else {
                    oVar2 = oVar;
                }
                if (i11 != 0) {
                    j10 = p035g0.r.f9085l;
                }
                if (i13 != 0) {
                    j11 = S0.m.f4901c;
                }
                if (i16 != 0) {
                    kVar2 = null;
                }
                j12 = S0.m.f4901c;
                if (i19 == 0) {
                }
                z6 = true;
                i31 = 1;
                if (i22 != 0) {
                    i29 = 1;
                } else {
                    i29 = i;
                }
                if (i26 != 0) {
                    i30 = Integer.MAX_VALUE;
                } else {
                    i30 = i3;
                }
                if ((i9 & 65536) != 0) {
                    i28 &= -3670017;
                    j13 = (G0.J) c0230o.k(f2713a);
                } else {
                    j13 = j9;
                }
                j14 = j12;
            }
            c0230o.q();
            Z.o oVar1111116 = oVar2;
            c0230o.W(79582827);
            j15 = p035g0.r.f9085l;
            if (j10 != j15) {
                i31 = i31;
                jB = j10;
                z7 = false;
            } else {
                c0230o.W(79582860);
                jB = j13.b();
                if (jB == j15) {
                    jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                }
                z7 = false;
                c0230o.p(false);
            }
            c0230o.p(z7);
            if (iVar3 != null) {
                i32 = iVar3.f4745a;
            } else {
                i32 = Integer.MIN_VALUE;
            }
            long j21111111111115 = j14;
            G0.J j21111111111116 = j13;
            int i311111111111112 = i28 << 9;
            int i311111111111113 = i31;
            int i41111111111111111116 = i30;
            boolean z11111111 = z6;
            int i41111111111111111117 = i29;
            AbstractC0029o0.b(str, oVar1111116, G0.J.e(j21111111111116, jB, j11, kVar2, j12, i32, j21111111111115, 16609104), i41111111111111111117, z11111111, i41111111111111111116, i311111111111113, c0230o, (i18 & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | (i311111111111112 & 57344) | 196608 | (i311111111111112 & 3670016) | 12582912, HueLog.LogComponent.STREAMDTLS);
            i33 = i30;
            j16 = j10;
            j17 = j21111111111115;
            i34 = i311111111111113;
            oVar3 = oVar1111116;
            z8 = z6;
            kVar3 = kVar2;
            int i41111111111111111118 = i29;
            iVar4 = iVar3;
            j18 = j11;
            j19 = j12;
            j20 = j21111111111116;
            i35 = i41111111111111111118;
        }
        c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new c2(str, oVar3, j16, j18, kVar3, j19, iVar4, j17, i35, z8, i33, i34, j20, i7, i8, i9);
        }
    }

    public static final void c(C0110f c0110f, Z.l lVar, long j4, long j6, long j7, long j8, int i, boolean z5, int i3, int i6, p089q4.v vVar, C0189x c0189x, G0.J j9, C0230o c0230o, int i7) {
        Z.l lVar2;
        long j10;
        p089q4.v vVar2;
        C0189x c0189x2;
        int i8;
        boolean z6;
        int i9;
        int i10;
        long j11;
        long j12;
        long jB;
        boolean z7;
        int i11;
        boolean z8;
        int i12;
        int i13;
        p089q4.v vVar3;
        C0189x c0189x3;
        long j13;
        long j14;
        long j15;
        c0230o.X(2027001676);
        int i14 = i7 | (c0230o.f(c0110f) ? 4 : 2) | 920349744;
        int i15 = (c0230o.f(j9) ? (char) 0 : (char) 0) | 28086;
        if ((306783379 & i14) == 306783378 && (i15 & 4793491) == 4793490 && c0230o.B()) {
            c0230o.P();
            lVar2 = lVar;
            j15 = j6;
            j14 = j7;
            j13 = j8;
            i11 = i;
            z8 = z5;
            i12 = i3;
            i13 = i6;
            vVar3 = vVar;
            c0189x3 = c0189x;
        } else {
            c0230o.R();
            if ((i7 & 1) == 0 || c0230o.z()) {
                lVar2 = Z.l.f5957a;
                j10 = S0.m.f4901c;
                vVar2 = p089q4.v.f11238h;
                c0189x2 = C0189x.f2970m;
                i8 = 1;
                z6 = true;
                i9 = 1;
                i10 = Integer.MAX_VALUE;
                j11 = j10;
                j12 = j11;
            } else {
                c0230o.P();
                lVar2 = lVar;
                j10 = j6;
                j11 = j7;
                j12 = j8;
                i8 = i;
                z6 = z5;
                i10 = i3;
                i9 = i6;
                vVar2 = vVar;
                c0189x2 = c0189x;
            }
            c0230o.q();
            c0230o.W(79588770);
            long j16 = p035g0.r.f9085l;
            if (j4 != j16) {
                jB = j4;
                z7 = false;
            } else {
                c0230o.W(79588803);
                jB = j9.b();
                if (jB == j16) {
                    jB = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                }
                z7 = false;
                c0230o.p(false);
            }
            c0230o.p(z7);
            int i16 = i8;
            boolean z9 = z6;
            int i17 = i10;
            int i18 = i9;
            p089q4.v vVar4 = vVar2;
            C0189x c0189x4 = c0189x2;
            AbstractC0029o0.a(c0110f, lVar2, G0.J.e(j9, jB, j10, null, j11, Integer.MIN_VALUE, j12, 16609104), c0189x4, i16, z9, i17, i18, vVar4, c0230o, (i14 & WebSocketProtocol.PAYLOAD_SHORT) | 115043328);
            i11 = i16;
            z8 = z9;
            i12 = i17;
            i13 = i18;
            vVar3 = vVar4;
            c0189x3 = c0189x4;
            j13 = j12;
            j14 = j11;
            j15 = j10;
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new d2(c0110f, lVar2, j4, j15, j14, j13, i11, z8, i12, i13, vVar3, c0189x3, j9, i7);
        }
    }
}
