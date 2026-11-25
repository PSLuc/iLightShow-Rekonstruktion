package L;

import B.AbstractC0013g0;
import B.C0002b;
import B.C0003b0;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.C0233p0;
import N.C0235q0;
import N.C0247x;
import N.InterfaceC0203a0;
import N.InterfaceC0225l0;
import android.content.Context;
import android.view.View;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.util.WeakHashMap;
import okhttp3.internal.http2.Http2;
import p090r.C0870i;
import p096s.C0907c;
import p096s.C0919l;
import p123x.AbstractC1084q;
import p123x.C1068a;
import p123x.C1086t;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G0.x f2394a = new G0.x(null, new G0.v());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final K.g f2395b = new K.g(0.16f, 0.12f, 0.08f, 0.12f);

    /* JADX WARN: Code duplicated, block: B:103:0x012e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0142  */
    /* JADX WARN: Code duplicated, block: B:109:0x0154  */
    /* JADX WARN: Code duplicated, block: B:123:0x0177 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x0179  */
    /* JADX WARN: Code duplicated, block: B:125:0x017c  */
    /* JADX WARN: Code duplicated, block: B:127:0x017f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0185  */
    /* JADX WARN: Code duplicated, block: B:133:0x019c  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:138:0x01da  */
    /* JADX WARN: Code duplicated, block: B:139:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:141:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:147:0x0200  */
    /* JADX WARN: Code duplicated, block: B:148:0x0203  */
    /* JADX WARN: Code duplicated, block: B:151:0x0208  */
    /* JADX WARN: Code duplicated, block: B:153:0x020d  */
    /* JADX WARN: Code duplicated, block: B:156:0x0218  */
    /* JADX WARN: Code duplicated, block: B:157:0x0226  */
    /* JADX WARN: Code duplicated, block: B:159:0x0254  */
    /* JADX WARN: Code duplicated, block: B:162:0x0274  */
    /* JADX WARN: Code duplicated, block: B:164:0x027a  */
    /* JADX WARN: Code duplicated, block: B:170:0x0288 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:171:0x028a  */
    /* JADX WARN: Code duplicated, block: B:174:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:175:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:177:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:178:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:180:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:181:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:183:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:184:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:187:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:188:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:191:0x030a  */
    /* JADX WARN: Code duplicated, block: B:193:0x0310  */
    /* JADX WARN: Code duplicated, block: B:199:0x0321  */
    /* JADX WARN: Code duplicated, block: B:201:0x0327  */
    /* JADX WARN: Code duplicated, block: B:207:0x033b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:208:0x033d  */
    /* JADX WARN: Code duplicated, block: B:212:0x036c  */
    /* JADX WARN: Code duplicated, block: B:214:0x0379  */
    /* JADX WARN: Code duplicated, block: B:216:0x037d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:217:0x037f  */
    /* JADX WARN: Code duplicated, block: B:218:0x0382  */
    /* JADX WARN: Code duplicated, block: B:220:0x0387  */
    /* JADX WARN: Code duplicated, block: B:224:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00de  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x0108  */
    /* JADX WARN: Code duplicated, block: B:92:0x010b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0115  */
    /* JADX WARN: Code duplicated, block: B:98:0x011b  */
    /* JADX WARN: Code duplicated, block: B:99:0x011e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v28, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v30 */
    public static final void a(D4.a aVar, Z.o oVar, boolean z5, p035g0.M m6, r rVar, C0186w c0186w, p123x.O o6, p117w.m mVar, D4.f fVar, C0230o c0230o, int i, int i3) {
        int i6;
        Z.o oVar2;
        int i7;
        boolean z6;
        int i8;
        p035g0.M mA;
        r rVarB;
        C0186w c0186w2;
        int i9;
        int i10;
        p123x.O o7;
        int i11;
        int i12;
        p117w.m mVar2;
        int i13;
        int i14;
        Object obj;
        Z.o oVar3;
        p123x.O o8;
        Object objK;
        int i15;
        boolean z7;
        long j4;
        long j6;
        Object objK2;
        X.s sVar;
        boolean z8;
        Object objK3;
        p117w.l lVar;
        float f6;
        Object objK4;
        C0907c c0907c;
        boolean zH;
        Object objK5;
        ?? r13;
        C0919l c0919l;
        float f7;
        float f8;
        Z.o oVar4;
        C0186w c0186w3;
        boolean z9;
        p117w.m mVar3;
        r rVar2;
        p123x.O o9;
        p035g0.M m7;
        C0235q0 c0235q0T;
        int i16;
        int i17;
        c0230o.X(650121315);
        if ((i & 6) == 0) {
            i6 = (c0230o.h(aVar) ? 4 : 2) | i;
        } else {
            i6 = i;
        }
        int i18 = 2 & i3;
        if (i18 == 0) {
            if ((i & 48) == 0) {
                oVar2 = oVar;
                i6 |= c0230o.f(oVar2) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 != 0) {
                if ((i & 384) == 0) {
                    z6 = z5;
                    if (c0230o.g(z6)) {
                        i8 = 256;
                    } else {
                        i8 = 128;
                    }
                    i6 |= i8;
                }
                if ((i & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        mA = m6;
                        int i19 = c0230o.f(mA) ? 2048 : 1024;
                        i6 |= i19;
                    } else {
                        mA = m6;
                    }
                    i6 |= i19;
                } else {
                    mA = m6;
                }
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        rVarB = rVar;
                        int i20 = c0230o.f(rVarB) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
                        i6 |= i20;
                    } else {
                        rVarB = rVar;
                    }
                    i6 |= i20;
                } else {
                    rVarB = rVar;
                }
                if ((i & 196608) == 0) {
                    c0186w2 = c0186w;
                    if ((i3 & 32) == 0 || !c0230o.f(c0186w2)) {
                        i17 = 65536;
                    } else {
                        i17 = 131072;
                    }
                    i6 |= i17;
                } else {
                    c0186w2 = c0186w;
                }
                if ((i3 & 64) != 0) {
                    i6 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (c0230o.f(null)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i6 |= i9;
                }
                i10 = 128 & i3;
                if (i10 != 0) {
                    i6 |= 12582912;
                    o7 = o6;
                } else {
                    o7 = o6;
                    if ((i & 12582912) == 0) {
                        if (c0230o.f(o7)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i6 |= i11;
                    }
                }
                i12 = i3 & HueLog.LogComponent.STREAMDTLS;
                if (i12 != 0) {
                    i6 |= 100663296;
                    mVar2 = mVar;
                } else {
                    mVar2 = mVar;
                    if ((i & 100663296) == 0) {
                        if (c0230o.f(mVar2)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i6 |= i13;
                    }
                }
                if ((i & 805306368) == 0) {
                    if (c0230o.h(fVar)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i6 |= i16;
                }
                if ((i6 & 306783379) == 306783378 || !c0230o.B()) {
                    c0230o.R();
                    i14 = i & 1;
                    obj = C0222k.f3714a;
                    if (i14 != 0 || c0230o.z()) {
                        if (i18 != 0) {
                            oVar3 = Z.l.f5957a;
                        } else {
                            oVar3 = oVar2;
                        }
                        if (i7 != 0) {
                            z6 = true;
                        }
                        if ((i3 & 8) != 0) {
                            p123x.O o10 = AbstractC0174s.f2903a;
                            c0230o.W(-1234923021);
                            mA = N0.a(M.j.f3207b, c0230o);
                            c0230o.p(false);
                            i6 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            p123x.O o11 = AbstractC0174s.f2903a;
                            c0230o.W(1449248637);
                            rVarB = AbstractC0174s.b((D) c0230o.k(F.f2265a));
                            c0230o.p(false);
                            i6 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            p123x.O o12 = AbstractC0174s.f2903a;
                            c0230o.W(1827791191);
                            C0186w c0186w4 = new C0186w(M.j.f3206a, M.j.i, M.j.f3211f, M.j.f3212g, M.j.f3209d);
                            c0230o.p(false);
                            i6 &= -458753;
                            c0186w2 = c0186w4;
                        }
                        if (i10 != 0) {
                            o8 = AbstractC0174s.f2903a;
                        } else {
                            o8 = o7;
                        }
                        if (i12 != 0) {
                            c0230o.W(823568939);
                            objK = c0230o.K();
                            if (objK == obj) {
                                objK = new p117w.m();
                                c0230o.f0(objK);
                            }
                            mVar2 = (p117w.m) objK;
                            c0230o.p(false);
                        }
                    } else {
                        c0230o.P();
                        if ((i3 & 8) != 0) {
                            i6 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i6 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            i6 &= -458753;
                        }
                        o8 = o7;
                        oVar3 = oVar2;
                    }
                    p035g0.M m8 = mA;
                    i15 = i6;
                    z7 = z6;
                    c0230o.q();
                    if (z7) {
                        j4 = rVarB.f2890a;
                    } else {
                        j4 = rVarB.f2892c;
                    }
                    if (z7) {
                        j6 = rVarB.f2891b;
                    } else {
                        j6 = rVarB.f2893d;
                    }
                    r rVar3 = rVarB;
                    c0230o.W(823569174);
                    if (c0186w2 == null) {
                        j6 = j6;
                        i15 = i15;
                        mVar2 = mVar2;
                        c0919l = null;
                        r13 = 0;
                    } else {
                        int i21 = ((i15 >> 6) & 14) | ((i15 >> 21) & 112) | ((i15 >> 9) & 896);
                        c0230o.W(-2045116089);
                        c0230o.W(-1312510462);
                        c0230o.W(-719928578);
                        objK2 = c0230o.K();
                        if (objK2 == obj) {
                            objK2 = new X.s();
                            c0230o.f0(objK2);
                        }
                        sVar = (X.s) objK2;
                        c0230o.p(false);
                        c0230o.W(-719928489);
                        z8 = (((i21 & 112) ^ 48) <= 32 && c0230o.f(mVar2)) || (i21 & 48) == 32;
                        objK3 = c0230o.K();
                        if (z8 || objK3 == obj) {
                            objK3 = new C0180u(mVar2, sVar, null);
                            c0230o.f0(objK3);
                        }
                        c0230o.p(false);
                        C0208d.e((D4.e) objK3, c0230o, mVar2);
                        lVar = (p117w.l) p089q4.l.h0(sVar);
                        if (!z7) {
                            f6 = c0186w2.f2946e;
                        } else if (lVar instanceof p117w.o) {
                            f6 = c0186w2.f2943b;
                        } else if (lVar instanceof p117w.i) {
                            f6 = c0186w2.f2945d;
                        } else if (lVar instanceof p117w.e) {
                            f6 = c0186w2.f2944c;
                        } else {
                            f6 = c0186w2.f2942a;
                        }
                        c0230o.W(-719926909);
                        objK4 = c0230o.K();
                        if (objK4 == obj) {
                            objK4 = new C0907c(new S0.e(f6), p096s.x0.f12140c, null, 12);
                            c0230o.f0(objK4);
                        }
                        c0907c = (C0907c) objK4;
                        c0230o.p(false);
                        S0.e eVar = new S0.e(f6);
                        c0230o.W(-719926825);
                        zH = c0230o.h(c0907c) | c0230o.c(f6) | ((((i21 & 14) ^ 6) <= 4 && c0230o.g(z7)) || (i21 & 6) == 4) | ((((i21 & 896) ^ 384) <= 256 && c0230o.f(c0186w2)) || (i21 & 384) == 256) | c0230o.h(lVar);
                        objK5 = c0230o.K();
                        if (zH || objK5 == obj) {
                            objK5 = new C0183v(c0907c, f6, z7, c0186w2, lVar, null);
                            c0230o.f0(objK5);
                        }
                        r13 = 0;
                        c0230o.p(false);
                        C0208d.e((D4.e) objK5, c0230o, eVar);
                        c0919l = c0907c.f11953c;
                        c0230o.p(false);
                        c0230o.p(false);
                    }
                    c0230o.p(r13);
                    if (c0919l != null) {
                        f7 = ((S0.e) c0919l.i.getValue()).f4887h;
                    } else {
                        f7 = (float) r13;
                    }
                    float f9 = f7;
                    if (c0186w2 == null) {
                        f8 = (float) r13;
                    } else if (z7) {
                        f8 = c0186w2.f2942a;
                    } else {
                        f8 = c0186w2.f2946e;
                    }
                    float f10 = f8;
                    long j7 = j6;
                    int i22 = i15;
                    A1.b(aVar, E0.i.a(oVar3, r13, C0189x.i), z7, m8, j4, j7, f10, f9, mVar2, V.b.b(c0230o, 956488494, new C0002b(j7, o8, fVar)), c0230o, ((i22 << 3) & 1879048192) | (i22 & 8078) | ((i22 << 6) & 234881024), 0);
                    oVar4 = oVar3;
                    c0186w3 = c0186w2;
                    z9 = z7;
                    mVar3 = mVar2;
                    rVar2 = rVar3;
                    o9 = o8;
                    m7 = m8;
                } else {
                    c0230o.P();
                    r rVar4 = rVarB;
                    mVar3 = mVar2;
                    rVar2 = rVar4;
                    m7 = mA;
                    c0186w3 = c0186w2;
                    o9 = o7;
                    oVar4 = oVar2;
                    z9 = z6;
                }
                c0235q0T = c0230o.t();
                if (c0235q0T != null) {
                    c0235q0T.f3780d = new C0192y(aVar, oVar4, z9, m7, rVar2, c0186w3, o9, mVar3, fVar, i, i3);
                }
            }
            i6 |= 384;
            z6 = z5;
            if ((i & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    mA = m6;
                    if (c0230o.f(mA)) {
                    }
                    i6 |= i19;
                } else {
                    mA = m6;
                }
                i6 |= i19;
            } else {
                mA = m6;
            }
            if ((i & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    rVarB = rVar;
                    if (c0230o.f(rVarB)) {
                    }
                    i6 |= i20;
                } else {
                    rVarB = rVar;
                }
                i6 |= i20;
            } else {
                rVarB = rVar;
            }
            if ((i & 196608) == 0) {
                c0186w2 = c0186w;
                if ((i3 & 32) == 0) {
                    i17 = 65536;
                } else {
                    i17 = 65536;
                }
                i6 |= i17;
            } else {
                c0186w2 = c0186w;
            }
            if ((i3 & 64) != 0) {
                i6 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (c0230o.f(null)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i6 |= i9;
            }
            i10 = 128 & i3;
            if (i10 != 0) {
                i6 |= 12582912;
                o7 = o6;
            } else {
                o7 = o6;
                if ((i & 12582912) == 0) {
                    if (c0230o.f(o7)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i6 |= i11;
                }
            }
            i12 = i3 & HueLog.LogComponent.STREAMDTLS;
            if (i12 != 0) {
                i6 |= 100663296;
                mVar2 = mVar;
            } else {
                mVar2 = mVar;
                if ((i & 100663296) == 0) {
                    if (c0230o.f(mVar2)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i6 |= i13;
                }
            }
            if ((i & 805306368) == 0) {
                if (c0230o.h(fVar)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i6 |= i16;
            }
            if ((i6 & 306783379) == 306783378) {
                c0230o.R();
                i14 = i & 1;
                obj = C0222k.f3714a;
                if (i14 != 0) {
                    if (i18 != 0) {
                        oVar3 = Z.l.f5957a;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i7 != 0) {
                        z6 = true;
                    }
                    if ((i3 & 8) != 0) {
                        p123x.O o13 = AbstractC0174s.f2903a;
                        c0230o.W(-1234923021);
                        mA = N0.a(M.j.f3207b, c0230o);
                        c0230o.p(false);
                        i6 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        p123x.O o14 = AbstractC0174s.f2903a;
                        c0230o.W(1449248637);
                        rVarB = AbstractC0174s.b((D) c0230o.k(F.f2265a));
                        c0230o.p(false);
                        i6 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        p123x.O o15 = AbstractC0174s.f2903a;
                        c0230o.W(1827791191);
                        C0186w c0186w5 = new C0186w(M.j.f3206a, M.j.i, M.j.f3211f, M.j.f3212g, M.j.f3209d);
                        c0230o.p(false);
                        i6 &= -458753;
                        c0186w2 = c0186w5;
                    }
                    if (i10 != 0) {
                        o8 = AbstractC0174s.f2903a;
                    } else {
                        o8 = o7;
                    }
                    if (i12 != 0) {
                        c0230o.W(823568939);
                        objK = c0230o.K();
                        if (objK == obj) {
                            objK = new p117w.m();
                            c0230o.f0(objK);
                        }
                        mVar2 = (p117w.m) objK;
                        c0230o.p(false);
                    }
                } else {
                    if (i18 != 0) {
                        oVar3 = Z.l.f5957a;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i7 != 0) {
                        z6 = true;
                    }
                    if ((i3 & 8) != 0) {
                        p123x.O o16 = AbstractC0174s.f2903a;
                        c0230o.W(-1234923021);
                        mA = N0.a(M.j.f3207b, c0230o);
                        c0230o.p(false);
                        i6 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        p123x.O o17 = AbstractC0174s.f2903a;
                        c0230o.W(1449248637);
                        rVarB = AbstractC0174s.b((D) c0230o.k(F.f2265a));
                        c0230o.p(false);
                        i6 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        p123x.O o18 = AbstractC0174s.f2903a;
                        c0230o.W(1827791191);
                        C0186w c0186w6 = new C0186w(M.j.f3206a, M.j.i, M.j.f3211f, M.j.f3212g, M.j.f3209d);
                        c0230o.p(false);
                        i6 &= -458753;
                        c0186w2 = c0186w6;
                    }
                    if (i10 != 0) {
                        o8 = AbstractC0174s.f2903a;
                    } else {
                        o8 = o7;
                    }
                    if (i12 != 0) {
                        c0230o.W(823568939);
                        objK = c0230o.K();
                        if (objK == obj) {
                            objK = new p117w.m();
                            c0230o.f0(objK);
                        }
                        mVar2 = (p117w.m) objK;
                        c0230o.p(false);
                    }
                }
                p035g0.M m9 = mA;
                i15 = i6;
                z7 = z6;
                c0230o.q();
                if (z7) {
                    j4 = rVarB.f2890a;
                } else {
                    j4 = rVarB.f2892c;
                }
                if (z7) {
                    j6 = rVarB.f2891b;
                } else {
                    j6 = rVarB.f2893d;
                }
                r rVar5 = rVarB;
                c0230o.W(823569174);
                if (c0186w2 == null) {
                    j6 = j6;
                    i15 = i15;
                    mVar2 = mVar2;
                    c0919l = null;
                    r13 = 0;
                } else {
                    int i23 = ((i15 >> 6) & 14) | ((i15 >> 21) & 112) | ((i15 >> 9) & 896);
                    c0230o.W(-2045116089);
                    c0230o.W(-1312510462);
                    c0230o.W(-719928578);
                    objK2 = c0230o.K();
                    if (objK2 == obj) {
                        objK2 = new X.s();
                        c0230o.f0(objK2);
                    }
                    sVar = (X.s) objK2;
                    c0230o.p(false);
                    c0230o.W(-719928489);
                    if (((i23 & 112) ^ 48) <= 32) {
                    }
                    objK3 = c0230o.K();
                    if (z8) {
                        objK3 = new C0180u(mVar2, sVar, null);
                        c0230o.f0(objK3);
                    } else {
                        objK3 = new C0180u(mVar2, sVar, null);
                        c0230o.f0(objK3);
                    }
                    c0230o.p(false);
                    C0208d.e((D4.e) objK3, c0230o, mVar2);
                    lVar = (p117w.l) p089q4.l.h0(sVar);
                    if (!z7) {
                        f6 = c0186w2.f2946e;
                    } else if (lVar instanceof p117w.o) {
                        f6 = c0186w2.f2943b;
                    } else if (lVar instanceof p117w.i) {
                        f6 = c0186w2.f2945d;
                    } else if (lVar instanceof p117w.e) {
                        f6 = c0186w2.f2944c;
                    } else {
                        f6 = c0186w2.f2942a;
                    }
                    c0230o.W(-719926909);
                    objK4 = c0230o.K();
                    if (objK4 == obj) {
                        objK4 = new C0907c(new S0.e(f6), p096s.x0.f12140c, null, 12);
                        c0230o.f0(objK4);
                    }
                    c0907c = (C0907c) objK4;
                    c0230o.p(false);
                    S0.e eVar2 = new S0.e(f6);
                    c0230o.W(-719926825);
                    zH = c0230o.h(c0907c) | c0230o.c(f6) | ((((i23 & 14) ^ 6) <= 4 && c0230o.g(z7)) || (i23 & 6) == 4) | ((((i23 & 896) ^ 384) <= 256 && c0230o.f(c0186w2)) || (i23 & 384) == 256) | c0230o.h(lVar);
                    objK5 = c0230o.K();
                    if (zH) {
                        objK5 = new C0183v(c0907c, f6, z7, c0186w2, lVar, null);
                        c0230o.f0(objK5);
                    } else {
                        objK5 = new C0183v(c0907c, f6, z7, c0186w2, lVar, null);
                        c0230o.f0(objK5);
                    }
                    r13 = 0;
                    c0230o.p(false);
                    C0208d.e((D4.e) objK5, c0230o, eVar2);
                    c0919l = c0907c.f11953c;
                    c0230o.p(false);
                    c0230o.p(false);
                }
                c0230o.p(r13);
                if (c0919l != null) {
                    f7 = ((S0.e) c0919l.i.getValue()).f4887h;
                } else {
                    f7 = (float) r13;
                }
                float f11 = f7;
                if (c0186w2 == null) {
                    f8 = (float) r13;
                } else if (z7) {
                    f8 = c0186w2.f2942a;
                } else {
                    f8 = c0186w2.f2946e;
                }
                float f12 = f8;
                long j8 = j6;
                int i24 = i15;
                A1.b(aVar, E0.i.a(oVar3, r13, C0189x.i), z7, m9, j4, j8, f12, f11, mVar2, V.b.b(c0230o, 956488494, new C0002b(j8, o8, fVar)), c0230o, ((i24 << 3) & 1879048192) | (i24 & 8078) | ((i24 << 6) & 234881024), 0);
                oVar4 = oVar3;
                c0186w3 = c0186w2;
                z9 = z7;
                mVar3 = mVar2;
                rVar2 = rVar5;
                o9 = o8;
                m7 = m9;
            } else {
                c0230o.R();
                i14 = i & 1;
                obj = C0222k.f3714a;
                if (i14 != 0) {
                    if (i18 != 0) {
                        oVar3 = Z.l.f5957a;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i7 != 0) {
                        z6 = true;
                    }
                    if ((i3 & 8) != 0) {
                        p123x.O o19 = AbstractC0174s.f2903a;
                        c0230o.W(-1234923021);
                        mA = N0.a(M.j.f3207b, c0230o);
                        c0230o.p(false);
                        i6 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        p123x.O o110 = AbstractC0174s.f2903a;
                        c0230o.W(1449248637);
                        rVarB = AbstractC0174s.b((D) c0230o.k(F.f2265a));
                        c0230o.p(false);
                        i6 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        p123x.O o111 = AbstractC0174s.f2903a;
                        c0230o.W(1827791191);
                        C0186w c0186w7 = new C0186w(M.j.f3206a, M.j.i, M.j.f3211f, M.j.f3212g, M.j.f3209d);
                        c0230o.p(false);
                        i6 &= -458753;
                        c0186w2 = c0186w7;
                    }
                    if (i10 != 0) {
                        o8 = AbstractC0174s.f2903a;
                    } else {
                        o8 = o7;
                    }
                    if (i12 != 0) {
                        c0230o.W(823568939);
                        objK = c0230o.K();
                        if (objK == obj) {
                            objK = new p117w.m();
                            c0230o.f0(objK);
                        }
                        mVar2 = (p117w.m) objK;
                        c0230o.p(false);
                    }
                } else {
                    if (i18 != 0) {
                        oVar3 = Z.l.f5957a;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i7 != 0) {
                        z6 = true;
                    }
                    if ((i3 & 8) != 0) {
                        p123x.O o112 = AbstractC0174s.f2903a;
                        c0230o.W(-1234923021);
                        mA = N0.a(M.j.f3207b, c0230o);
                        c0230o.p(false);
                        i6 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        p123x.O o113 = AbstractC0174s.f2903a;
                        c0230o.W(1449248637);
                        rVarB = AbstractC0174s.b((D) c0230o.k(F.f2265a));
                        c0230o.p(false);
                        i6 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        p123x.O o114 = AbstractC0174s.f2903a;
                        c0230o.W(1827791191);
                        C0186w c0186w8 = new C0186w(M.j.f3206a, M.j.i, M.j.f3211f, M.j.f3212g, M.j.f3209d);
                        c0230o.p(false);
                        i6 &= -458753;
                        c0186w2 = c0186w8;
                    }
                    if (i10 != 0) {
                        o8 = AbstractC0174s.f2903a;
                    } else {
                        o8 = o7;
                    }
                    if (i12 != 0) {
                        c0230o.W(823568939);
                        objK = c0230o.K();
                        if (objK == obj) {
                            objK = new p117w.m();
                            c0230o.f0(objK);
                        }
                        mVar2 = (p117w.m) objK;
                        c0230o.p(false);
                    }
                }
                p035g0.M m10 = mA;
                i15 = i6;
                z7 = z6;
                c0230o.q();
                if (z7) {
                    j4 = rVarB.f2890a;
                } else {
                    j4 = rVarB.f2892c;
                }
                if (z7) {
                    j6 = rVarB.f2891b;
                } else {
                    j6 = rVarB.f2893d;
                }
                r rVar6 = rVarB;
                c0230o.W(823569174);
                if (c0186w2 == null) {
                    j6 = j6;
                    i15 = i15;
                    mVar2 = mVar2;
                    c0919l = null;
                    r13 = 0;
                } else {
                    int i25 = ((i15 >> 6) & 14) | ((i15 >> 21) & 112) | ((i15 >> 9) & 896);
                    c0230o.W(-2045116089);
                    c0230o.W(-1312510462);
                    c0230o.W(-719928578);
                    objK2 = c0230o.K();
                    if (objK2 == obj) {
                        objK2 = new X.s();
                        c0230o.f0(objK2);
                    }
                    sVar = (X.s) objK2;
                    c0230o.p(false);
                    c0230o.W(-719928489);
                    if (((i25 & 112) ^ 48) <= 32) {
                    }
                    objK3 = c0230o.K();
                    if (z8) {
                        objK3 = new C0180u(mVar2, sVar, null);
                        c0230o.f0(objK3);
                    } else {
                        objK3 = new C0180u(mVar2, sVar, null);
                        c0230o.f0(objK3);
                    }
                    c0230o.p(false);
                    C0208d.e((D4.e) objK3, c0230o, mVar2);
                    lVar = (p117w.l) p089q4.l.h0(sVar);
                    if (!z7) {
                        f6 = c0186w2.f2946e;
                    } else if (lVar instanceof p117w.o) {
                        f6 = c0186w2.f2943b;
                    } else if (lVar instanceof p117w.i) {
                        f6 = c0186w2.f2945d;
                    } else if (lVar instanceof p117w.e) {
                        f6 = c0186w2.f2944c;
                    } else {
                        f6 = c0186w2.f2942a;
                    }
                    c0230o.W(-719926909);
                    objK4 = c0230o.K();
                    if (objK4 == obj) {
                        objK4 = new C0907c(new S0.e(f6), p096s.x0.f12140c, null, 12);
                        c0230o.f0(objK4);
                    }
                    c0907c = (C0907c) objK4;
                    c0230o.p(false);
                    S0.e eVar3 = new S0.e(f6);
                    c0230o.W(-719926825);
                    zH = c0230o.h(c0907c) | c0230o.c(f6) | ((((i25 & 14) ^ 6) <= 4 && c0230o.g(z7)) || (i25 & 6) == 4) | ((((i25 & 896) ^ 384) <= 256 && c0230o.f(c0186w2)) || (i25 & 384) == 256) | c0230o.h(lVar);
                    objK5 = c0230o.K();
                    if (zH) {
                        objK5 = new C0183v(c0907c, f6, z7, c0186w2, lVar, null);
                        c0230o.f0(objK5);
                    } else {
                        objK5 = new C0183v(c0907c, f6, z7, c0186w2, lVar, null);
                        c0230o.f0(objK5);
                    }
                    r13 = 0;
                    c0230o.p(false);
                    C0208d.e((D4.e) objK5, c0230o, eVar3);
                    c0919l = c0907c.f11953c;
                    c0230o.p(false);
                    c0230o.p(false);
                }
                c0230o.p(r13);
                if (c0919l != null) {
                    f7 = ((S0.e) c0919l.i.getValue()).f4887h;
                } else {
                    f7 = (float) r13;
                }
                float f13 = f7;
                if (c0186w2 == null) {
                    f8 = (float) r13;
                } else if (z7) {
                    f8 = c0186w2.f2942a;
                } else {
                    f8 = c0186w2.f2946e;
                }
                float f14 = f8;
                long j9 = j6;
                int i26 = i15;
                A1.b(aVar, E0.i.a(oVar3, r13, C0189x.i), z7, m10, j4, j9, f14, f13, mVar2, V.b.b(c0230o, 956488494, new C0002b(j9, o8, fVar)), c0230o, ((i26 << 3) & 1879048192) | (i26 & 8078) | ((i26 << 6) & 234881024), 0);
                oVar4 = oVar3;
                c0186w3 = c0186w2;
                z9 = z7;
                mVar3 = mVar2;
                rVar2 = rVar6;
                o9 = o8;
                m7 = m10;
            }
            c0235q0T = c0230o.t();
            if (c0235q0T != null) {
                c0235q0T.f3780d = new C0192y(aVar, oVar4, z9, m7, rVar2, c0186w3, o9, mVar3, fVar, i, i3);
            }
        }
        i6 |= 48;
        oVar2 = oVar;
        i7 = i3 & 4;
        if (i7 != 0) {
            if ((i & 384) == 0) {
                z6 = z5;
                if (c0230o.g(z6)) {
                    i8 = 256;
                } else {
                    i8 = 128;
                }
                i6 |= i8;
            }
            if ((i & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    mA = m6;
                    if (c0230o.f(mA)) {
                    }
                    i6 |= i19;
                } else {
                    mA = m6;
                }
                i6 |= i19;
            } else {
                mA = m6;
            }
            if ((i & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    rVarB = rVar;
                    if (c0230o.f(rVarB)) {
                    }
                    i6 |= i20;
                } else {
                    rVarB = rVar;
                }
                i6 |= i20;
            } else {
                rVarB = rVar;
            }
            if ((i & 196608) == 0) {
                c0186w2 = c0186w;
                if ((i3 & 32) == 0) {
                    i17 = 65536;
                } else {
                    i17 = 65536;
                }
                i6 |= i17;
            } else {
                c0186w2 = c0186w;
            }
            if ((i3 & 64) != 0) {
                i6 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (c0230o.f(null)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i6 |= i9;
            }
            i10 = 128 & i3;
            if (i10 != 0) {
                i6 |= 12582912;
                o7 = o6;
            } else {
                o7 = o6;
                if ((i & 12582912) == 0) {
                    if (c0230o.f(o7)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i6 |= i11;
                }
            }
            i12 = i3 & HueLog.LogComponent.STREAMDTLS;
            if (i12 != 0) {
                i6 |= 100663296;
                mVar2 = mVar;
            } else {
                mVar2 = mVar;
                if ((i & 100663296) == 0) {
                    if (c0230o.f(mVar2)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i6 |= i13;
                }
            }
            if ((i & 805306368) == 0) {
                if (c0230o.h(fVar)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i6 |= i16;
            }
            if ((i6 & 306783379) == 306783378) {
                c0230o.R();
                i14 = i & 1;
                obj = C0222k.f3714a;
                if (i14 != 0) {
                    if (i18 != 0) {
                        oVar3 = Z.l.f5957a;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i7 != 0) {
                        z6 = true;
                    }
                    if ((i3 & 8) != 0) {
                        p123x.O o115 = AbstractC0174s.f2903a;
                        c0230o.W(-1234923021);
                        mA = N0.a(M.j.f3207b, c0230o);
                        c0230o.p(false);
                        i6 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        p123x.O o116 = AbstractC0174s.f2903a;
                        c0230o.W(1449248637);
                        rVarB = AbstractC0174s.b((D) c0230o.k(F.f2265a));
                        c0230o.p(false);
                        i6 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        p123x.O o117 = AbstractC0174s.f2903a;
                        c0230o.W(1827791191);
                        C0186w c0186w9 = new C0186w(M.j.f3206a, M.j.i, M.j.f3211f, M.j.f3212g, M.j.f3209d);
                        c0230o.p(false);
                        i6 &= -458753;
                        c0186w2 = c0186w9;
                    }
                    if (i10 != 0) {
                        o8 = AbstractC0174s.f2903a;
                    } else {
                        o8 = o7;
                    }
                    if (i12 != 0) {
                        c0230o.W(823568939);
                        objK = c0230o.K();
                        if (objK == obj) {
                            objK = new p117w.m();
                            c0230o.f0(objK);
                        }
                        mVar2 = (p117w.m) objK;
                        c0230o.p(false);
                    }
                } else {
                    if (i18 != 0) {
                        oVar3 = Z.l.f5957a;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i7 != 0) {
                        z6 = true;
                    }
                    if ((i3 & 8) != 0) {
                        p123x.O o118 = AbstractC0174s.f2903a;
                        c0230o.W(-1234923021);
                        mA = N0.a(M.j.f3207b, c0230o);
                        c0230o.p(false);
                        i6 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        p123x.O o119 = AbstractC0174s.f2903a;
                        c0230o.W(1449248637);
                        rVarB = AbstractC0174s.b((D) c0230o.k(F.f2265a));
                        c0230o.p(false);
                        i6 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        p123x.O o1110 = AbstractC0174s.f2903a;
                        c0230o.W(1827791191);
                        C0186w c0186w10 = new C0186w(M.j.f3206a, M.j.i, M.j.f3211f, M.j.f3212g, M.j.f3209d);
                        c0230o.p(false);
                        i6 &= -458753;
                        c0186w2 = c0186w10;
                    }
                    if (i10 != 0) {
                        o8 = AbstractC0174s.f2903a;
                    } else {
                        o8 = o7;
                    }
                    if (i12 != 0) {
                        c0230o.W(823568939);
                        objK = c0230o.K();
                        if (objK == obj) {
                            objK = new p117w.m();
                            c0230o.f0(objK);
                        }
                        mVar2 = (p117w.m) objK;
                        c0230o.p(false);
                    }
                }
                p035g0.M m11 = mA;
                i15 = i6;
                z7 = z6;
                c0230o.q();
                if (z7) {
                    j4 = rVarB.f2890a;
                } else {
                    j4 = rVarB.f2892c;
                }
                if (z7) {
                    j6 = rVarB.f2891b;
                } else {
                    j6 = rVarB.f2893d;
                }
                r rVar7 = rVarB;
                c0230o.W(823569174);
                if (c0186w2 == null) {
                    j6 = j6;
                    i15 = i15;
                    mVar2 = mVar2;
                    c0919l = null;
                    r13 = 0;
                } else {
                    int i27 = ((i15 >> 6) & 14) | ((i15 >> 21) & 112) | ((i15 >> 9) & 896);
                    c0230o.W(-2045116089);
                    c0230o.W(-1312510462);
                    c0230o.W(-719928578);
                    objK2 = c0230o.K();
                    if (objK2 == obj) {
                        objK2 = new X.s();
                        c0230o.f0(objK2);
                    }
                    sVar = (X.s) objK2;
                    c0230o.p(false);
                    c0230o.W(-719928489);
                    if (((i27 & 112) ^ 48) <= 32) {
                    }
                    objK3 = c0230o.K();
                    if (z8) {
                        objK3 = new C0180u(mVar2, sVar, null);
                        c0230o.f0(objK3);
                    } else {
                        objK3 = new C0180u(mVar2, sVar, null);
                        c0230o.f0(objK3);
                    }
                    c0230o.p(false);
                    C0208d.e((D4.e) objK3, c0230o, mVar2);
                    lVar = (p117w.l) p089q4.l.h0(sVar);
                    if (!z7) {
                        f6 = c0186w2.f2946e;
                    } else if (lVar instanceof p117w.o) {
                        f6 = c0186w2.f2943b;
                    } else if (lVar instanceof p117w.i) {
                        f6 = c0186w2.f2945d;
                    } else if (lVar instanceof p117w.e) {
                        f6 = c0186w2.f2944c;
                    } else {
                        f6 = c0186w2.f2942a;
                    }
                    c0230o.W(-719926909);
                    objK4 = c0230o.K();
                    if (objK4 == obj) {
                        objK4 = new C0907c(new S0.e(f6), p096s.x0.f12140c, null, 12);
                        c0230o.f0(objK4);
                    }
                    c0907c = (C0907c) objK4;
                    c0230o.p(false);
                    S0.e eVar4 = new S0.e(f6);
                    c0230o.W(-719926825);
                    zH = c0230o.h(c0907c) | c0230o.c(f6) | ((((i27 & 14) ^ 6) <= 4 && c0230o.g(z7)) || (i27 & 6) == 4) | ((((i27 & 896) ^ 384) <= 256 && c0230o.f(c0186w2)) || (i27 & 384) == 256) | c0230o.h(lVar);
                    objK5 = c0230o.K();
                    if (zH) {
                        objK5 = new C0183v(c0907c, f6, z7, c0186w2, lVar, null);
                        c0230o.f0(objK5);
                    } else {
                        objK5 = new C0183v(c0907c, f6, z7, c0186w2, lVar, null);
                        c0230o.f0(objK5);
                    }
                    r13 = 0;
                    c0230o.p(false);
                    C0208d.e((D4.e) objK5, c0230o, eVar4);
                    c0919l = c0907c.f11953c;
                    c0230o.p(false);
                    c0230o.p(false);
                }
                c0230o.p(r13);
                if (c0919l != null) {
                    f7 = ((S0.e) c0919l.i.getValue()).f4887h;
                } else {
                    f7 = (float) r13;
                }
                float f15 = f7;
                if (c0186w2 == null) {
                    f8 = (float) r13;
                } else if (z7) {
                    f8 = c0186w2.f2942a;
                } else {
                    f8 = c0186w2.f2946e;
                }
                float f16 = f8;
                long j10 = j6;
                int i28 = i15;
                A1.b(aVar, E0.i.a(oVar3, r13, C0189x.i), z7, m11, j4, j10, f16, f15, mVar2, V.b.b(c0230o, 956488494, new C0002b(j10, o8, fVar)), c0230o, ((i28 << 3) & 1879048192) | (i28 & 8078) | ((i28 << 6) & 234881024), 0);
                oVar4 = oVar3;
                c0186w3 = c0186w2;
                z9 = z7;
                mVar3 = mVar2;
                rVar2 = rVar7;
                o9 = o8;
                m7 = m11;
            } else {
                c0230o.R();
                i14 = i & 1;
                obj = C0222k.f3714a;
                if (i14 != 0) {
                    if (i18 != 0) {
                        oVar3 = Z.l.f5957a;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i7 != 0) {
                        z6 = true;
                    }
                    if ((i3 & 8) != 0) {
                        p123x.O o1111 = AbstractC0174s.f2903a;
                        c0230o.W(-1234923021);
                        mA = N0.a(M.j.f3207b, c0230o);
                        c0230o.p(false);
                        i6 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        p123x.O o1112 = AbstractC0174s.f2903a;
                        c0230o.W(1449248637);
                        rVarB = AbstractC0174s.b((D) c0230o.k(F.f2265a));
                        c0230o.p(false);
                        i6 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        p123x.O o1113 = AbstractC0174s.f2903a;
                        c0230o.W(1827791191);
                        C0186w c0186w11 = new C0186w(M.j.f3206a, M.j.i, M.j.f3211f, M.j.f3212g, M.j.f3209d);
                        c0230o.p(false);
                        i6 &= -458753;
                        c0186w2 = c0186w11;
                    }
                    if (i10 != 0) {
                        o8 = AbstractC0174s.f2903a;
                    } else {
                        o8 = o7;
                    }
                    if (i12 != 0) {
                        c0230o.W(823568939);
                        objK = c0230o.K();
                        if (objK == obj) {
                            objK = new p117w.m();
                            c0230o.f0(objK);
                        }
                        mVar2 = (p117w.m) objK;
                        c0230o.p(false);
                    }
                } else {
                    if (i18 != 0) {
                        oVar3 = Z.l.f5957a;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i7 != 0) {
                        z6 = true;
                    }
                    if ((i3 & 8) != 0) {
                        p123x.O o1114 = AbstractC0174s.f2903a;
                        c0230o.W(-1234923021);
                        mA = N0.a(M.j.f3207b, c0230o);
                        c0230o.p(false);
                        i6 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        p123x.O o1115 = AbstractC0174s.f2903a;
                        c0230o.W(1449248637);
                        rVarB = AbstractC0174s.b((D) c0230o.k(F.f2265a));
                        c0230o.p(false);
                        i6 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        p123x.O o1116 = AbstractC0174s.f2903a;
                        c0230o.W(1827791191);
                        C0186w c0186w12 = new C0186w(M.j.f3206a, M.j.i, M.j.f3211f, M.j.f3212g, M.j.f3209d);
                        c0230o.p(false);
                        i6 &= -458753;
                        c0186w2 = c0186w12;
                    }
                    if (i10 != 0) {
                        o8 = AbstractC0174s.f2903a;
                    } else {
                        o8 = o7;
                    }
                    if (i12 != 0) {
                        c0230o.W(823568939);
                        objK = c0230o.K();
                        if (objK == obj) {
                            objK = new p117w.m();
                            c0230o.f0(objK);
                        }
                        mVar2 = (p117w.m) objK;
                        c0230o.p(false);
                    }
                }
                p035g0.M m12 = mA;
                i15 = i6;
                z7 = z6;
                c0230o.q();
                if (z7) {
                    j4 = rVarB.f2890a;
                } else {
                    j4 = rVarB.f2892c;
                }
                if (z7) {
                    j6 = rVarB.f2891b;
                } else {
                    j6 = rVarB.f2893d;
                }
                r rVar8 = rVarB;
                c0230o.W(823569174);
                if (c0186w2 == null) {
                    j6 = j6;
                    i15 = i15;
                    mVar2 = mVar2;
                    c0919l = null;
                    r13 = 0;
                } else {
                    int i29 = ((i15 >> 6) & 14) | ((i15 >> 21) & 112) | ((i15 >> 9) & 896);
                    c0230o.W(-2045116089);
                    c0230o.W(-1312510462);
                    c0230o.W(-719928578);
                    objK2 = c0230o.K();
                    if (objK2 == obj) {
                        objK2 = new X.s();
                        c0230o.f0(objK2);
                    }
                    sVar = (X.s) objK2;
                    c0230o.p(false);
                    c0230o.W(-719928489);
                    if (((i29 & 112) ^ 48) <= 32) {
                    }
                    objK3 = c0230o.K();
                    if (z8) {
                        objK3 = new C0180u(mVar2, sVar, null);
                        c0230o.f0(objK3);
                    } else {
                        objK3 = new C0180u(mVar2, sVar, null);
                        c0230o.f0(objK3);
                    }
                    c0230o.p(false);
                    C0208d.e((D4.e) objK3, c0230o, mVar2);
                    lVar = (p117w.l) p089q4.l.h0(sVar);
                    if (!z7) {
                        f6 = c0186w2.f2946e;
                    } else if (lVar instanceof p117w.o) {
                        f6 = c0186w2.f2943b;
                    } else if (lVar instanceof p117w.i) {
                        f6 = c0186w2.f2945d;
                    } else if (lVar instanceof p117w.e) {
                        f6 = c0186w2.f2944c;
                    } else {
                        f6 = c0186w2.f2942a;
                    }
                    c0230o.W(-719926909);
                    objK4 = c0230o.K();
                    if (objK4 == obj) {
                        objK4 = new C0907c(new S0.e(f6), p096s.x0.f12140c, null, 12);
                        c0230o.f0(objK4);
                    }
                    c0907c = (C0907c) objK4;
                    c0230o.p(false);
                    S0.e eVar5 = new S0.e(f6);
                    c0230o.W(-719926825);
                    zH = c0230o.h(c0907c) | c0230o.c(f6) | ((((i29 & 14) ^ 6) <= 4 && c0230o.g(z7)) || (i29 & 6) == 4) | ((((i29 & 896) ^ 384) <= 256 && c0230o.f(c0186w2)) || (i29 & 384) == 256) | c0230o.h(lVar);
                    objK5 = c0230o.K();
                    if (zH) {
                        objK5 = new C0183v(c0907c, f6, z7, c0186w2, lVar, null);
                        c0230o.f0(objK5);
                    } else {
                        objK5 = new C0183v(c0907c, f6, z7, c0186w2, lVar, null);
                        c0230o.f0(objK5);
                    }
                    r13 = 0;
                    c0230o.p(false);
                    C0208d.e((D4.e) objK5, c0230o, eVar5);
                    c0919l = c0907c.f11953c;
                    c0230o.p(false);
                    c0230o.p(false);
                }
                c0230o.p(r13);
                if (c0919l != null) {
                    f7 = ((S0.e) c0919l.i.getValue()).f4887h;
                } else {
                    f7 = (float) r13;
                }
                float f17 = f7;
                if (c0186w2 == null) {
                    f8 = (float) r13;
                } else if (z7) {
                    f8 = c0186w2.f2942a;
                } else {
                    f8 = c0186w2.f2946e;
                }
                float f18 = f8;
                long j11 = j6;
                int i210 = i15;
                A1.b(aVar, E0.i.a(oVar3, r13, C0189x.i), z7, m12, j4, j11, f18, f17, mVar2, V.b.b(c0230o, 956488494, new C0002b(j11, o8, fVar)), c0230o, ((i210 << 3) & 1879048192) | (i210 & 8078) | ((i210 << 6) & 234881024), 0);
                oVar4 = oVar3;
                c0186w3 = c0186w2;
                z9 = z7;
                mVar3 = mVar2;
                rVar2 = rVar8;
                o9 = o8;
                m7 = m12;
            }
            c0235q0T = c0230o.t();
            if (c0235q0T != null) {
                c0235q0T.f3780d = new C0192y(aVar, oVar4, z9, m7, rVar2, c0186w3, o9, mVar3, fVar, i, i3);
            }
        }
        i6 |= 384;
        z6 = z5;
        if ((i & 3072) == 0) {
            if ((i3 & 8) == 0) {
                mA = m6;
                if (c0230o.f(mA)) {
                }
                i6 |= i19;
            } else {
                mA = m6;
            }
            i6 |= i19;
        } else {
            mA = m6;
        }
        if ((i & 24576) == 0) {
            if ((i3 & 16) == 0) {
                rVarB = rVar;
                if (c0230o.f(rVarB)) {
                }
                i6 |= i20;
            } else {
                rVarB = rVar;
            }
            i6 |= i20;
        } else {
            rVarB = rVar;
        }
        if ((i & 196608) == 0) {
            c0186w2 = c0186w;
            if ((i3 & 32) == 0) {
                i17 = 65536;
            } else {
                i17 = 65536;
            }
            i6 |= i17;
        } else {
            c0186w2 = c0186w;
        }
        if ((i3 & 64) != 0) {
            i6 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (c0230o.f(null)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i6 |= i9;
        }
        i10 = 128 & i3;
        if (i10 != 0) {
            i6 |= 12582912;
            o7 = o6;
        } else {
            o7 = o6;
            if ((i & 12582912) == 0) {
                if (c0230o.f(o7)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i6 |= i11;
            }
        }
        i12 = i3 & HueLog.LogComponent.STREAMDTLS;
        if (i12 != 0) {
            i6 |= 100663296;
            mVar2 = mVar;
        } else {
            mVar2 = mVar;
            if ((i & 100663296) == 0) {
                if (c0230o.f(mVar2)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i6 |= i13;
            }
        }
        if ((i & 805306368) == 0) {
            if (c0230o.h(fVar)) {
                i16 = 536870912;
            } else {
                i16 = 268435456;
            }
            i6 |= i16;
        }
        if ((i6 & 306783379) == 306783378) {
            c0230o.R();
            i14 = i & 1;
            obj = C0222k.f3714a;
            if (i14 != 0) {
                if (i18 != 0) {
                    oVar3 = Z.l.f5957a;
                } else {
                    oVar3 = oVar2;
                }
                if (i7 != 0) {
                    z6 = true;
                }
                if ((i3 & 8) != 0) {
                    p123x.O o1117 = AbstractC0174s.f2903a;
                    c0230o.W(-1234923021);
                    mA = N0.a(M.j.f3207b, c0230o);
                    c0230o.p(false);
                    i6 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    p123x.O o1118 = AbstractC0174s.f2903a;
                    c0230o.W(1449248637);
                    rVarB = AbstractC0174s.b((D) c0230o.k(F.f2265a));
                    c0230o.p(false);
                    i6 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    p123x.O o1119 = AbstractC0174s.f2903a;
                    c0230o.W(1827791191);
                    C0186w c0186w13 = new C0186w(M.j.f3206a, M.j.i, M.j.f3211f, M.j.f3212g, M.j.f3209d);
                    c0230o.p(false);
                    i6 &= -458753;
                    c0186w2 = c0186w13;
                }
                if (i10 != 0) {
                    o8 = AbstractC0174s.f2903a;
                } else {
                    o8 = o7;
                }
                if (i12 != 0) {
                    c0230o.W(823568939);
                    objK = c0230o.K();
                    if (objK == obj) {
                        objK = new p117w.m();
                        c0230o.f0(objK);
                    }
                    mVar2 = (p117w.m) objK;
                    c0230o.p(false);
                }
            } else {
                if (i18 != 0) {
                    oVar3 = Z.l.f5957a;
                } else {
                    oVar3 = oVar2;
                }
                if (i7 != 0) {
                    z6 = true;
                }
                if ((i3 & 8) != 0) {
                    p123x.O o11110 = AbstractC0174s.f2903a;
                    c0230o.W(-1234923021);
                    mA = N0.a(M.j.f3207b, c0230o);
                    c0230o.p(false);
                    i6 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    p123x.O o11111 = AbstractC0174s.f2903a;
                    c0230o.W(1449248637);
                    rVarB = AbstractC0174s.b((D) c0230o.k(F.f2265a));
                    c0230o.p(false);
                    i6 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    p123x.O o11112 = AbstractC0174s.f2903a;
                    c0230o.W(1827791191);
                    C0186w c0186w14 = new C0186w(M.j.f3206a, M.j.i, M.j.f3211f, M.j.f3212g, M.j.f3209d);
                    c0230o.p(false);
                    i6 &= -458753;
                    c0186w2 = c0186w14;
                }
                if (i10 != 0) {
                    o8 = AbstractC0174s.f2903a;
                } else {
                    o8 = o7;
                }
                if (i12 != 0) {
                    c0230o.W(823568939);
                    objK = c0230o.K();
                    if (objK == obj) {
                        objK = new p117w.m();
                        c0230o.f0(objK);
                    }
                    mVar2 = (p117w.m) objK;
                    c0230o.p(false);
                }
            }
            p035g0.M m13 = mA;
            i15 = i6;
            z7 = z6;
            c0230o.q();
            if (z7) {
                j4 = rVarB.f2890a;
            } else {
                j4 = rVarB.f2892c;
            }
            if (z7) {
                j6 = rVarB.f2891b;
            } else {
                j6 = rVarB.f2893d;
            }
            r rVar9 = rVarB;
            c0230o.W(823569174);
            if (c0186w2 == null) {
                j6 = j6;
                i15 = i15;
                mVar2 = mVar2;
                c0919l = null;
                r13 = 0;
            } else {
                int i211 = ((i15 >> 6) & 14) | ((i15 >> 21) & 112) | ((i15 >> 9) & 896);
                c0230o.W(-2045116089);
                c0230o.W(-1312510462);
                c0230o.W(-719928578);
                objK2 = c0230o.K();
                if (objK2 == obj) {
                    objK2 = new X.s();
                    c0230o.f0(objK2);
                }
                sVar = (X.s) objK2;
                c0230o.p(false);
                c0230o.W(-719928489);
                if (((i211 & 112) ^ 48) <= 32) {
                }
                objK3 = c0230o.K();
                if (z8) {
                    objK3 = new C0180u(mVar2, sVar, null);
                    c0230o.f0(objK3);
                } else {
                    objK3 = new C0180u(mVar2, sVar, null);
                    c0230o.f0(objK3);
                }
                c0230o.p(false);
                C0208d.e((D4.e) objK3, c0230o, mVar2);
                lVar = (p117w.l) p089q4.l.h0(sVar);
                if (!z7) {
                    f6 = c0186w2.f2946e;
                } else if (lVar instanceof p117w.o) {
                    f6 = c0186w2.f2943b;
                } else if (lVar instanceof p117w.i) {
                    f6 = c0186w2.f2945d;
                } else if (lVar instanceof p117w.e) {
                    f6 = c0186w2.f2944c;
                } else {
                    f6 = c0186w2.f2942a;
                }
                c0230o.W(-719926909);
                objK4 = c0230o.K();
                if (objK4 == obj) {
                    objK4 = new C0907c(new S0.e(f6), p096s.x0.f12140c, null, 12);
                    c0230o.f0(objK4);
                }
                c0907c = (C0907c) objK4;
                c0230o.p(false);
                S0.e eVar6 = new S0.e(f6);
                c0230o.W(-719926825);
                zH = c0230o.h(c0907c) | c0230o.c(f6) | ((((i211 & 14) ^ 6) <= 4 && c0230o.g(z7)) || (i211 & 6) == 4) | ((((i211 & 896) ^ 384) <= 256 && c0230o.f(c0186w2)) || (i211 & 384) == 256) | c0230o.h(lVar);
                objK5 = c0230o.K();
                if (zH) {
                    objK5 = new C0183v(c0907c, f6, z7, c0186w2, lVar, null);
                    c0230o.f0(objK5);
                } else {
                    objK5 = new C0183v(c0907c, f6, z7, c0186w2, lVar, null);
                    c0230o.f0(objK5);
                }
                r13 = 0;
                c0230o.p(false);
                C0208d.e((D4.e) objK5, c0230o, eVar6);
                c0919l = c0907c.f11953c;
                c0230o.p(false);
                c0230o.p(false);
            }
            c0230o.p(r13);
            if (c0919l != null) {
                f7 = ((S0.e) c0919l.i.getValue()).f4887h;
            } else {
                f7 = (float) r13;
            }
            float f19 = f7;
            if (c0186w2 == null) {
                f8 = (float) r13;
            } else if (z7) {
                f8 = c0186w2.f2942a;
            } else {
                f8 = c0186w2.f2946e;
            }
            float f110 = f8;
            long j12 = j6;
            int i212 = i15;
            A1.b(aVar, E0.i.a(oVar3, r13, C0189x.i), z7, m13, j4, j12, f110, f19, mVar2, V.b.b(c0230o, 956488494, new C0002b(j12, o8, fVar)), c0230o, ((i212 << 3) & 1879048192) | (i212 & 8078) | ((i212 << 6) & 234881024), 0);
            oVar4 = oVar3;
            c0186w3 = c0186w2;
            z9 = z7;
            mVar3 = mVar2;
            rVar2 = rVar9;
            o9 = o8;
            m7 = m13;
        } else {
            c0230o.R();
            i14 = i & 1;
            obj = C0222k.f3714a;
            if (i14 != 0) {
                if (i18 != 0) {
                    oVar3 = Z.l.f5957a;
                } else {
                    oVar3 = oVar2;
                }
                if (i7 != 0) {
                    z6 = true;
                }
                if ((i3 & 8) != 0) {
                    p123x.O o11113 = AbstractC0174s.f2903a;
                    c0230o.W(-1234923021);
                    mA = N0.a(M.j.f3207b, c0230o);
                    c0230o.p(false);
                    i6 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    p123x.O o11114 = AbstractC0174s.f2903a;
                    c0230o.W(1449248637);
                    rVarB = AbstractC0174s.b((D) c0230o.k(F.f2265a));
                    c0230o.p(false);
                    i6 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    p123x.O o11115 = AbstractC0174s.f2903a;
                    c0230o.W(1827791191);
                    C0186w c0186w15 = new C0186w(M.j.f3206a, M.j.i, M.j.f3211f, M.j.f3212g, M.j.f3209d);
                    c0230o.p(false);
                    i6 &= -458753;
                    c0186w2 = c0186w15;
                }
                if (i10 != 0) {
                    o8 = AbstractC0174s.f2903a;
                } else {
                    o8 = o7;
                }
                if (i12 != 0) {
                    c0230o.W(823568939);
                    objK = c0230o.K();
                    if (objK == obj) {
                        objK = new p117w.m();
                        c0230o.f0(objK);
                    }
                    mVar2 = (p117w.m) objK;
                    c0230o.p(false);
                }
            } else {
                if (i18 != 0) {
                    oVar3 = Z.l.f5957a;
                } else {
                    oVar3 = oVar2;
                }
                if (i7 != 0) {
                    z6 = true;
                }
                if ((i3 & 8) != 0) {
                    p123x.O o11116 = AbstractC0174s.f2903a;
                    c0230o.W(-1234923021);
                    mA = N0.a(M.j.f3207b, c0230o);
                    c0230o.p(false);
                    i6 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    p123x.O o11117 = AbstractC0174s.f2903a;
                    c0230o.W(1449248637);
                    rVarB = AbstractC0174s.b((D) c0230o.k(F.f2265a));
                    c0230o.p(false);
                    i6 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    p123x.O o11118 = AbstractC0174s.f2903a;
                    c0230o.W(1827791191);
                    C0186w c0186w16 = new C0186w(M.j.f3206a, M.j.i, M.j.f3211f, M.j.f3212g, M.j.f3209d);
                    c0230o.p(false);
                    i6 &= -458753;
                    c0186w2 = c0186w16;
                }
                if (i10 != 0) {
                    o8 = AbstractC0174s.f2903a;
                } else {
                    o8 = o7;
                }
                if (i12 != 0) {
                    c0230o.W(823568939);
                    objK = c0230o.K();
                    if (objK == obj) {
                        objK = new p117w.m();
                        c0230o.f0(objK);
                    }
                    mVar2 = (p117w.m) objK;
                    c0230o.p(false);
                }
            }
            p035g0.M m14 = mA;
            i15 = i6;
            z7 = z6;
            c0230o.q();
            if (z7) {
                j4 = rVarB.f2890a;
            } else {
                j4 = rVarB.f2892c;
            }
            if (z7) {
                j6 = rVarB.f2891b;
            } else {
                j6 = rVarB.f2893d;
            }
            r rVar10 = rVarB;
            c0230o.W(823569174);
            if (c0186w2 == null) {
                j6 = j6;
                i15 = i15;
                mVar2 = mVar2;
                c0919l = null;
                r13 = 0;
            } else {
                int i213 = ((i15 >> 6) & 14) | ((i15 >> 21) & 112) | ((i15 >> 9) & 896);
                c0230o.W(-2045116089);
                c0230o.W(-1312510462);
                c0230o.W(-719928578);
                objK2 = c0230o.K();
                if (objK2 == obj) {
                    objK2 = new X.s();
                    c0230o.f0(objK2);
                }
                sVar = (X.s) objK2;
                c0230o.p(false);
                c0230o.W(-719928489);
                if (((i213 & 112) ^ 48) <= 32) {
                }
                objK3 = c0230o.K();
                if (z8) {
                    objK3 = new C0180u(mVar2, sVar, null);
                    c0230o.f0(objK3);
                } else {
                    objK3 = new C0180u(mVar2, sVar, null);
                    c0230o.f0(objK3);
                }
                c0230o.p(false);
                C0208d.e((D4.e) objK3, c0230o, mVar2);
                lVar = (p117w.l) p089q4.l.h0(sVar);
                if (!z7) {
                    f6 = c0186w2.f2946e;
                } else if (lVar instanceof p117w.o) {
                    f6 = c0186w2.f2943b;
                } else if (lVar instanceof p117w.i) {
                    f6 = c0186w2.f2945d;
                } else if (lVar instanceof p117w.e) {
                    f6 = c0186w2.f2944c;
                } else {
                    f6 = c0186w2.f2942a;
                }
                c0230o.W(-719926909);
                objK4 = c0230o.K();
                if (objK4 == obj) {
                    objK4 = new C0907c(new S0.e(f6), p096s.x0.f12140c, null, 12);
                    c0230o.f0(objK4);
                }
                c0907c = (C0907c) objK4;
                c0230o.p(false);
                S0.e eVar7 = new S0.e(f6);
                c0230o.W(-719926825);
                zH = c0230o.h(c0907c) | c0230o.c(f6) | ((((i213 & 14) ^ 6) <= 4 && c0230o.g(z7)) || (i213 & 6) == 4) | ((((i213 & 896) ^ 384) <= 256 && c0230o.f(c0186w2)) || (i213 & 384) == 256) | c0230o.h(lVar);
                objK5 = c0230o.K();
                if (zH) {
                    objK5 = new C0183v(c0907c, f6, z7, c0186w2, lVar, null);
                    c0230o.f0(objK5);
                } else {
                    objK5 = new C0183v(c0907c, f6, z7, c0186w2, lVar, null);
                    c0230o.f0(objK5);
                }
                r13 = 0;
                c0230o.p(false);
                C0208d.e((D4.e) objK5, c0230o, eVar7);
                c0919l = c0907c.f11953c;
                c0230o.p(false);
                c0230o.p(false);
            }
            c0230o.p(r13);
            if (c0919l != null) {
                f7 = ((S0.e) c0919l.i.getValue()).f4887h;
            } else {
                f7 = (float) r13;
            }
            float f111 = f7;
            if (c0186w2 == null) {
                f8 = (float) r13;
            } else if (z7) {
                f8 = c0186w2.f2942a;
            } else {
                f8 = c0186w2.f2946e;
            }
            float f112 = f8;
            long j13 = j6;
            int i214 = i15;
            A1.b(aVar, E0.i.a(oVar3, r13, C0189x.i), z7, m14, j4, j13, f112, f111, mVar2, V.b.b(c0230o, 956488494, new C0002b(j13, o8, fVar)), c0230o, ((i214 << 3) & 1879048192) | (i214 & 8078) | ((i214 << 6) & 234881024), 0);
            oVar4 = oVar3;
            c0186w3 = c0186w2;
            z9 = z7;
            mVar3 = mVar2;
            rVar2 = rVar10;
            o9 = o8;
            m7 = m14;
        }
        c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0192y(aVar, oVar4, z9, m7, rVar2, c0186w3, o9, mVar3, fVar, i, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:35:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0082  */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:49:0x0138  */
    /* JADX WARN: Code duplicated, block: B:53:0x018a  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public static final void b(Z.o oVar, p035g0.M m6, A a6, B b6, V.a aVar, C0230o c0230o, int i, int i3) {
        Z.o oVar2;
        int i6;
        p035g0.M m7;
        int i7;
        Z.o oVar3;
        p035g0.M mA;
        D d6;
        A a7;
        A a8;
        Z.o oVar4;
        A a9;
        B b7;
        int i8;
        p035g0.M m8;
        N.U u6;
        Object objK;
        Z.o oVar5;
        p035g0.M m9;
        A a10;
        B b8;
        C0235q0 c0235q0T;
        boolean z5 = false;
        c0230o.X(1179621553);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i6 = i | 6;
            oVar2 = oVar;
        } else if ((i & 6) == 0) {
            oVar2 = oVar;
            i6 = i | (c0230o.f(oVar2) ? 4 : 2);
        } else {
            oVar2 = oVar;
            i6 = i;
        }
        if ((i3 & 2) == 0) {
            m7 = m6;
            int i10 = c0230o.f(m7) ? 32 : 16;
            i7 = i6 | i10 | 25728;
            if ((74899 & i7) == 74898 || !c0230o.B()) {
                c0230o.R();
                if ((i & 1) != 0 || c0230o.z()) {
                    if (i9 != 0) {
                        oVar3 = Z.l.f5957a;
                    } else {
                        oVar3 = oVar2;
                    }
                    if ((i3 & 2) != 0) {
                        c0230o.W(1266660211);
                        mA = N0.a(M.k.f3215b, c0230o);
                        c0230o.p(false);
                        i7 &= -113;
                    } else {
                        mA = m7;
                    }
                    c0230o.W(-1876034303);
                    d6 = (D) c0230o.k(F.f2265a);
                    a7 = d6.f2204M;
                    if (a7 == null) {
                        float f6 = M.k.f3214a;
                        a8 = new A(F.d(d6, 44), F.a(d6, F.d(d6, 44)), p035g0.H.l(p035g0.r.b(0.38f, F.d(d6, M.k.f3216c)), F.g(d6, M.k.f3217d)), p035g0.r.b(0.38f, F.a(d6, F.d(d6, 44))));
                        d6.f2204M = a8;
                        z5 = false;
                    } else {
                        a8 = a7;
                    }
                    c0230o.p(z5);
                    c0230o.W(-574898487);
                    B b9 = new B(M.k.f3214a, M.k.f3221h, M.k.f3219f, M.k.f3220g, M.k.f3218e, M.k.f3217d);
                    c0230o.p(false);
                    oVar4 = oVar3;
                    a9 = a8;
                    b7 = b9;
                    i8 = i7 & (-8065);
                    m8 = mA;
                } else {
                    c0230o.P();
                    if ((i3 & 2) != 0) {
                        i7 &= -113;
                    }
                    a9 = a6;
                    b7 = b6;
                    i8 = i7 & (-8065);
                    oVar4 = oVar2;
                    m8 = m7;
                }
                c0230o.q();
                int i11 = i8;
                long j4 = a9.f2140a;
                float f7 = b7.f2160a;
                c0230o.W(-1763481333);
                c0230o.W(-1409178619);
                u6 = C0222k.f3714a;
                c0230o.W(-1409178567);
                objK = c0230o.K();
                if (objK == u6) {
                    objK = C0208d.K(new S0.e(b7.f2160a), N.U.f3673m);
                    c0230o.f0(objK);
                }
                c0230o.p(false);
                c0230o.p(false);
                c0230o.p(false);
                A1.a(oVar4, m8, j4, a9.f2141b, f7, ((S0.e) ((InterfaceC0203a0) objK).getValue()).f4887h, V.b.b(c0230o, 664103990, new C0124b(aVar, 3, (byte) 0)), c0230o, (i11 & 112) | (i11 & 14) | 12582912 | 1572864, 0);
                oVar5 = oVar4;
                m9 = m8;
                a10 = a9;
                b8 = b7;
            } else {
                c0230o.P();
                a10 = a6;
                b8 = b6;
                oVar5 = oVar2;
                m9 = m7;
            }
            c0235q0T = c0230o.t();
            if (c0235q0T != null) {
                c0235q0T.f3780d = new C(oVar5, m9, a10, b8, aVar, i, i3);
            }
        }
        m7 = m6;
        i7 = i6 | i10 | 25728;
        if ((74899 & i7) == 74898) {
            c0230o.R();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    oVar3 = Z.l.f5957a;
                } else {
                    oVar3 = oVar2;
                }
                if ((i3 & 2) != 0) {
                    c0230o.W(1266660211);
                    mA = N0.a(M.k.f3215b, c0230o);
                    c0230o.p(false);
                    i7 &= -113;
                } else {
                    mA = m7;
                }
                c0230o.W(-1876034303);
                d6 = (D) c0230o.k(F.f2265a);
                a7 = d6.f2204M;
                if (a7 == null) {
                    float f8 = M.k.f3214a;
                    a8 = new A(F.d(d6, 44), F.a(d6, F.d(d6, 44)), p035g0.H.l(p035g0.r.b(0.38f, F.d(d6, M.k.f3216c)), F.g(d6, M.k.f3217d)), p035g0.r.b(0.38f, F.a(d6, F.d(d6, 44))));
                    d6.f2204M = a8;
                    z5 = false;
                } else {
                    a8 = a7;
                }
                c0230o.p(z5);
                c0230o.W(-574898487);
                B b10 = new B(M.k.f3214a, M.k.f3221h, M.k.f3219f, M.k.f3220g, M.k.f3218e, M.k.f3217d);
                c0230o.p(false);
                oVar4 = oVar3;
                a9 = a8;
                b7 = b10;
                i8 = i7 & (-8065);
                m8 = mA;
            } else {
                if (i9 != 0) {
                    oVar3 = Z.l.f5957a;
                } else {
                    oVar3 = oVar2;
                }
                if ((i3 & 2) != 0) {
                    c0230o.W(1266660211);
                    mA = N0.a(M.k.f3215b, c0230o);
                    c0230o.p(false);
                    i7 &= -113;
                } else {
                    mA = m7;
                }
                c0230o.W(-1876034303);
                d6 = (D) c0230o.k(F.f2265a);
                a7 = d6.f2204M;
                if (a7 == null) {
                    float f9 = M.k.f3214a;
                    a8 = new A(F.d(d6, 44), F.a(d6, F.d(d6, 44)), p035g0.H.l(p035g0.r.b(0.38f, F.d(d6, M.k.f3216c)), F.g(d6, M.k.f3217d)), p035g0.r.b(0.38f, F.a(d6, F.d(d6, 44))));
                    d6.f2204M = a8;
                    z5 = false;
                } else {
                    a8 = a7;
                }
                c0230o.p(z5);
                c0230o.W(-574898487);
                B b11 = new B(M.k.f3214a, M.k.f3221h, M.k.f3219f, M.k.f3220g, M.k.f3218e, M.k.f3217d);
                c0230o.p(false);
                oVar4 = oVar3;
                a9 = a8;
                b7 = b11;
                i8 = i7 & (-8065);
                m8 = mA;
            }
            c0230o.q();
            int i12 = i8;
            long j6 = a9.f2140a;
            float f10 = b7.f2160a;
            c0230o.W(-1763481333);
            c0230o.W(-1409178619);
            u6 = C0222k.f3714a;
            c0230o.W(-1409178567);
            objK = c0230o.K();
            if (objK == u6) {
                objK = C0208d.K(new S0.e(b7.f2160a), N.U.f3673m);
                c0230o.f0(objK);
            }
            c0230o.p(false);
            c0230o.p(false);
            c0230o.p(false);
            A1.a(oVar4, m8, j6, a9.f2141b, f10, ((S0.e) ((InterfaceC0203a0) objK).getValue()).f4887h, V.b.b(c0230o, 664103990, new C0124b(aVar, 3, (byte) 0)), c0230o, (i12 & 112) | (i12 & 14) | 12582912 | 1572864, 0);
            oVar5 = oVar4;
            m9 = m8;
            a10 = a9;
            b8 = b7;
        } else {
            c0230o.R();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    oVar3 = Z.l.f5957a;
                } else {
                    oVar3 = oVar2;
                }
                if ((i3 & 2) != 0) {
                    c0230o.W(1266660211);
                    mA = N0.a(M.k.f3215b, c0230o);
                    c0230o.p(false);
                    i7 &= -113;
                } else {
                    mA = m7;
                }
                c0230o.W(-1876034303);
                d6 = (D) c0230o.k(F.f2265a);
                a7 = d6.f2204M;
                if (a7 == null) {
                    float f11 = M.k.f3214a;
                    a8 = new A(F.d(d6, 44), F.a(d6, F.d(d6, 44)), p035g0.H.l(p035g0.r.b(0.38f, F.d(d6, M.k.f3216c)), F.g(d6, M.k.f3217d)), p035g0.r.b(0.38f, F.a(d6, F.d(d6, 44))));
                    d6.f2204M = a8;
                    z5 = false;
                } else {
                    a8 = a7;
                }
                c0230o.p(z5);
                c0230o.W(-574898487);
                B b12 = new B(M.k.f3214a, M.k.f3221h, M.k.f3219f, M.k.f3220g, M.k.f3218e, M.k.f3217d);
                c0230o.p(false);
                oVar4 = oVar3;
                a9 = a8;
                b7 = b12;
                i8 = i7 & (-8065);
                m8 = mA;
            } else {
                if (i9 != 0) {
                    oVar3 = Z.l.f5957a;
                } else {
                    oVar3 = oVar2;
                }
                if ((i3 & 2) != 0) {
                    c0230o.W(1266660211);
                    mA = N0.a(M.k.f3215b, c0230o);
                    c0230o.p(false);
                    i7 &= -113;
                } else {
                    mA = m7;
                }
                c0230o.W(-1876034303);
                d6 = (D) c0230o.k(F.f2265a);
                a7 = d6.f2204M;
                if (a7 == null) {
                    float f12 = M.k.f3214a;
                    a8 = new A(F.d(d6, 44), F.a(d6, F.d(d6, 44)), p035g0.H.l(p035g0.r.b(0.38f, F.d(d6, M.k.f3216c)), F.g(d6, M.k.f3217d)), p035g0.r.b(0.38f, F.a(d6, F.d(d6, 44))));
                    d6.f2204M = a8;
                    z5 = false;
                } else {
                    a8 = a7;
                }
                c0230o.p(z5);
                c0230o.W(-574898487);
                B b13 = new B(M.k.f3214a, M.k.f3221h, M.k.f3219f, M.k.f3220g, M.k.f3218e, M.k.f3217d);
                c0230o.p(false);
                oVar4 = oVar3;
                a9 = a8;
                b7 = b13;
                i8 = i7 & (-8065);
                m8 = mA;
            }
            c0230o.q();
            int i13 = i8;
            long j7 = a9.f2140a;
            float f13 = b7.f2160a;
            c0230o.W(-1763481333);
            c0230o.W(-1409178619);
            u6 = C0222k.f3714a;
            c0230o.W(-1409178567);
            objK = c0230o.K();
            if (objK == u6) {
                objK = C0208d.K(new S0.e(b7.f2160a), N.U.f3673m);
                c0230o.f0(objK);
            }
            c0230o.p(false);
            c0230o.p(false);
            c0230o.p(false);
            A1.a(oVar4, m8, j7, a9.f2141b, f13, ((S0.e) ((InterfaceC0203a0) objK).getValue()).f4887h, V.b.b(c0230o, 664103990, new C0124b(aVar, 3, (byte) 0)), c0230o, (i13 & 112) | (i13 & 14) | 12582912 | 1572864, 0);
            oVar5 = oVar4;
            m9 = m8;
            a10 = a9;
            b8 = b7;
        }
        c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C(oVar5, m9, a10, b8, aVar, i, i3);
        }
    }

    public static final void c(Z.o oVar, float f6, long j4, C0230o c0230o, int i, int i3) {
        int i6;
        long j6;
        float f7;
        float f8;
        long j7;
        Z.o oVar2;
        c0230o.X(75144485);
        boolean z5 = true;
        int i7 = i3 & 1;
        if (i7 != 0) {
            i6 = i | 6;
        } else if ((i & 6) == 0) {
            i6 = (c0230o.f(oVar) ? 4 : 2) | i;
        } else {
            i6 = i;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i6 |= 48;
        } else if ((i & 48) == 0) {
            i6 |= c0230o.c(f6) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j6 = j4;
            i6 |= ((i3 & 4) == 0 && c0230o.e(j6)) ? 256 : 128;
        } else {
            j6 = j4;
        }
        if ((i6 & 147) == 146 && c0230o.B()) {
            c0230o.P();
            f8 = f6;
            oVar2 = oVar;
            j7 = j6;
        } else {
            c0230o.R();
            if ((i & 1) == 0 || c0230o.z()) {
                if (i7 != 0) {
                    oVar = Z.l.f5957a;
                }
                f7 = i8 != 0 ? M.f2405a : f6;
                if ((i3 & 4) != 0) {
                    float f9 = M.f2405a;
                    c0230o.W(77461041);
                    float f10 = M.e.f3191a;
                    long jE = F.e(25, c0230o);
                    c0230o.p(false);
                    i6 &= -897;
                    j6 = jE;
                }
            } else {
                c0230o.P();
                if ((i3 & 4) != 0) {
                    i6 &= -897;
                }
                f7 = f6;
            }
            c0230o.q();
            Z.o oVarC = androidx.compose.foundation.layout.c.c(oVar.k(androidx.compose.foundation.layout.c.f6634a), f7);
            c0230o.W(941664184);
            boolean z6 = (i6 & 112) == 32;
            if ((((i6 & 896) ^ 384) <= 256 || !c0230o.e(j6)) && (i6 & 384) != 256) {
                z5 = false;
            }
            boolean z7 = z5 | z6;
            Object objK = c0230o.K();
            if (z7 || objK == C0222k.f3714a) {
                objK = new N(f7, j6);
                c0230o.f0(objK);
            }
            c0230o.p(false);
            G4.a.a(oVarC, (D4.c) objK, c0230o, 0);
            f8 = f7;
            j7 = j6;
            oVar2 = oVar;
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new O(oVar2, f8, j7, i, i3);
        }
    }

    public static final void d(D4.a aVar, Z.o oVar, boolean z5, C0137f0 c0137f0, p117w.m mVar, D4.e eVar, C0230o c0230o, int i, int i3) {
        int i6;
        Z.o oVar2;
        int i7;
        C0137f0 c0137f1;
        boolean z6;
        p117w.m mVar2;
        C0137f0 c0137f2;
        D4.e eVar2;
        p117w.m mVar3;
        C0137f0 c0137f3;
        c0230o.X(-1142896114);
        if ((i & 6) == 0) {
            i6 = i | (c0230o.h(aVar) ? 4 : 2);
        } else {
            i6 = i;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i7 = i6 | 48;
            oVar2 = oVar;
        } else {
            oVar2 = oVar;
            i7 = i6 | (c0230o.f(oVar2) ? 32 : 16);
        }
        if (((i7 | 25984) & 74899) == 74898 && c0230o.B()) {
            c0230o.P();
            z6 = z5;
            c0137f3 = c0137f0;
            mVar3 = mVar;
            eVar2 = eVar;
        } else {
            c0230o.R();
            if ((i & 1) == 0 || c0230o.z()) {
                if (i8 != 0) {
                    oVar2 = Z.l.f5957a;
                }
                c0230o.W(-1519621781);
                D d6 = (D) c0230o.k(F.f2265a);
                c0230o.W(1437915677);
                C0137f0 c0137f4 = d6.f2206O;
                if (c0137f4 == null) {
                    long j4 = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                    long j6 = p035g0.r.f9084k;
                    C0137f0 c0137f5 = new C0137f0(j6, j4, j6, p035g0.r.b(0.38f, j4));
                    d6.f2206O = c0137f5;
                    c0137f4 = c0137f5;
                }
                c0230o.p(false);
                long j7 = ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
                long j8 = c0137f4.f2720b;
                if (p035g0.r.c(j8, j7)) {
                    c0230o.p(false);
                    c0137f1 = c0137f4;
                } else {
                    long jB = p035g0.r.b(0.38f, j7);
                    long j9 = p035g0.r.f9085l;
                    c0137f1 = new C0137f0(c0137f4.f2719a, j7 != j9 ? j7 : j8, c0137f4.f2721c, jB != j9 ? jB : c0137f4.f2722d);
                    c0230o.p(false);
                }
                c0230o.W(793644531);
                Object objK = c0230o.K();
                if (objK == C0222k.f3714a) {
                    objK = new p117w.m();
                    c0230o.f0(objK);
                }
                c0230o.p(false);
                z6 = true;
                mVar2 = (p117w.m) objK;
                c0137f2 = c0137f1;
            } else {
                c0230o.P();
                z6 = z5;
                c0137f2 = c0137f0;
                mVar2 = mVar;
            }
            Z.o oVar3 = oVar2;
            c0230o.q();
            N.W0 w6 = AbstractC0155l0.f2822a;
            Z.o oVarK = oVar3.k(MinimumInteractiveModifier.f6679a);
            float f6 = M.l.f3223b;
            Z.o oVarE = androidx.compose.foundation.a.e(androidx.compose.foundation.a.b(com.fasterxml.jackson.databind.deser.std.d0.k(androidx.compose.foundation.layout.c.h(oVarK, f6), N0.a(5, c0230o)), z6 ? c0137f2.f2719a : c0137f2.f2721c, p035g0.H.f9016a), mVar2, K.s.a(f6 / 2, c0230o, 54, 4), z6, new E0.e(0), aVar, 8);
            Z.g gVar = Z.b.f5936l;
            c0230o.W(733328855);
            C1086t c1086tF = AbstractC1084q.f(gVar, false, c0230o, 6);
            c0230o.W(-1323940314);
            int i9 = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
            InterfaceC1102j.f14043g.getClass();
            C1106n c1106n = C1101i.f14038b;
            V.a aVarH = p113v0.U.h(oVarE);
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C0208d.R(C1101i.f14041e, c0230o, c1086tF);
            C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M);
            C1100h c1100h = C1101i.f14042f;
            if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i9))) {
                p012c.k.y(i9, c0230o, i9, c1100h);
            }
            AbstractC0013g0.p(0, aVarH, new N.C0(c0230o), c0230o, 2058660585);
            eVar2 = eVar;
            C0208d.a(K.f2350a.a(new p035g0.r(z6 ? c0137f2.f2720b : c0137f2.f2722d)), eVar2, c0230o, 56);
            AbstractC0013g0.q(c0230o, false, true, false, false);
            oVar2 = oVar3;
            mVar3 = mVar2;
            c0137f3 = c0137f2;
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0140g0(aVar, oVar2, z6, c0137f3, mVar3, eVar2, i, i3);
        }
    }

    public static final void e(D d6, M0 m6, g2 g2Var, C0230o c0230o, int i) {
        int i3;
        M0 m7;
        V.a aVar = N3.M.f4041g;
        c0230o.X(-2127166334);
        if ((i & 6) == 0) {
            i3 = (c0230o.f(d6) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= 16;
        }
        if ((i & 384) == 0) {
            i3 |= c0230o.f(g2Var) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c0230o.h(aVar) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && c0230o.B()) {
            c0230o.P();
            m7 = m6;
        } else {
            c0230o.R();
            if ((i & 1) == 0 || c0230o.z()) {
                m7 = (M0) c0230o.k(N0.f2415a);
            } else {
                c0230o.P();
                m7 = m6;
            }
            c0230o.q();
            K.e eVarA = K.s.a(0.0f, c0230o, 0, 7);
            c0230o.W(1866455512);
            long j4 = d6.f2211a;
            c0230o.W(-314518050);
            boolean zE = c0230o.e(j4);
            Object objK = c0230o.K();
            if (zE || objK == C0222k.f3714a) {
                objK = new F.Y(j4, p035g0.r.b(0.4f, j4));
                c0230o.f0(objK);
            }
            c0230o.p(false);
            c0230o.p(false);
            C0208d.b(new C0233p0[]{F.f2265a.a(d6), androidx.compose.foundation.d.f6589a.a(eVarA), K.v.f2020a.a(C0158m0.f2840a), N0.f2415a.a(m7), F.Z.f1154a.a((F.Y) objK), h2.f2777a.a(g2Var)}, V.b.b(c0230o, -1066563262, new C0003b0(g2Var)), c0230o, 48);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new B.d1(d6, m7, g2Var, i);
        }
    }

    public static final void f(long j4, G0.J j6, D4.e eVar, C0230o c0230o, int i) {
        int i3;
        c0230o.X(1479790536);
        if ((i & 6) == 0) {
            i3 = (c0230o.e(j4) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c0230o.f(j6) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c0230o.h(eVar) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i3 & 147) == 146 && c0230o.B()) {
            c0230o.P();
        } else {
            C0247x c0247x = e2.f2713a;
            C0208d.b(new C0233p0[]{K.f2350a.a(new p035g0.r(j4)), c0247x.a(((G0.J) c0230o.k(c0247x)).d(j6))}, eVar, c0230o, (i3 >> 3) & 112);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0181u0(j4, j6, eVar, i);
        }
    }

    public static final void g(D4.a aVar, Z.l lVar, boolean z5, p035g0.M m6, r rVar, p123x.O o6, p117w.m mVar, V.a aVar2, C0230o c0230o, int i) {
        Z.l lVar2;
        r rVar2;
        p035g0.M m7;
        p123x.O o7;
        p117w.m mVar2;
        r rVar3;
        boolean z6;
        Z.l lVar3;
        boolean z7;
        p035g0.M m8;
        r rVar4;
        p123x.O o8;
        p117w.m mVar3;
        c0230o.X(-2106428362);
        if (((i | 115025328) & 306783379) == 306783378 && c0230o.B()) {
            c0230o.P();
            lVar3 = lVar;
            z7 = z5;
            m8 = m6;
            rVar4 = rVar;
            o8 = o6;
            mVar3 = mVar;
        } else {
            c0230o.R();
            if ((i & 1) == 0 || c0230o.z()) {
                lVar2 = Z.l.f5957a;
                p123x.O o9 = AbstractC0174s.f2903a;
                c0230o.W(-349121587);
                p035g0.M mA = N0.a(5, c0230o);
                c0230o.p(false);
                c0230o.W(1880341584);
                D d6 = (D) c0230o.k(F.f2265a);
                r rVar5 = d6.f2203L;
                if (rVar5 == null) {
                    long j4 = p035g0.r.f9084k;
                    rVar2 = new r(j4, F.d(d6, 26), j4, p035g0.r.b(0.38f, F.d(d6, 18)));
                    d6.f2203L = rVar2;
                } else {
                    rVar2 = rVar5;
                }
                c0230o.p(false);
                p123x.O o10 = AbstractC0174s.f2904b;
                c0230o.W(593745314);
                Object objK = c0230o.K();
                if (objK == C0222k.f3714a) {
                    objK = new p117w.m();
                    c0230o.f0(objK);
                }
                c0230o.p(false);
                m7 = mA;
                o7 = o10;
                mVar2 = (p117w.m) objK;
                rVar3 = rVar2;
                z6 = true;
            } else {
                c0230o.P();
                lVar2 = lVar;
                z6 = z5;
                m7 = m6;
                rVar3 = rVar;
                o7 = o6;
                mVar2 = mVar;
            }
            c0230o.q();
            a(aVar, lVar2, z6, m7, rVar3, null, o7, mVar2, aVar2, c0230o, 920322486, 0);
            lVar3 = lVar2;
            z7 = z6;
            m8 = m7;
            rVar4 = rVar3;
            o8 = o7;
            mVar3 = mVar2;
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0195z(aVar, lVar3, z7, m8, rVar4, o8, mVar3, aVar2, i);
        }
    }

    public static M0 h(C0230o c0230o) {
        return (M0) c0230o.k(N0.f2415a);
    }

    public static final String i(int i, C0230o c0230o) {
        c0230o.k(AndroidCompositionLocals_androidKt.f6729a);
        return ((Context) c0230o.k(AndroidCompositionLocals_androidKt.f6730b)).getResources().getString(i);
    }

    public static final C1068a j(C0230o c0230o) {
        p123x.b0 b0Var;
        c0230o.W(1816710665);
        WeakHashMap weakHashMap = p123x.b0.f13736u;
        View view = (View) c0230o.k(AndroidCompositionLocals_androidKt.f6734f);
        WeakHashMap weakHashMap2 = p123x.b0.f13736u;
        synchronized (weakHashMap2) {
            try {
                Object b0Var2 = weakHashMap2.get(view);
                if (b0Var2 == null) {
                    b0Var2 = new p123x.b0(view);
                    weakHashMap2.put(view, b0Var2);
                }
                b0Var = (p123x.b0) b0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean zH = c0230o.h(b0Var) | c0230o.h(view);
        Object objK = c0230o.K();
        if (zH || objK == C0222k.f3714a) {
            objK = new C0870i(b0Var, 15, view);
            c0230o.f0(objK);
        }
        C0208d.c(b0Var, (D4.c) objK, c0230o);
        C1068a c1068a = b0Var.f13743g;
        c0230o.p(false);
        return c1068a;
    }
}
