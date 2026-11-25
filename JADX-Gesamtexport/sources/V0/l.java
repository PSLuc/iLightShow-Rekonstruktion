package V0;

import B.C0005c0;
import B.F0;
import B.g1;
import N.C0208d;
import N.C0222k;
import N.C0226m;
import N.C0230o;
import N.C0235q0;
import N.C0247x;
import N.InterfaceC0203a0;
import N.InterfaceC0225l0;
import N.U;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.util.UUID;
import p113v0.F;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;
import p130y0.AbstractC1124c0;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0247x f5436a = new C0247x(e.f5417j);

    /* JADX WARN: Code duplicated, block: B:102:0x023e  */
    /* JADX WARN: Code duplicated, block: B:104:0x024c  */
    /* JADX WARN: Code duplicated, block: B:108:0x025d  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:50:0x010d  */
    /* JADX WARN: Code duplicated, block: B:51:0x010f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0118  */
    /* JADX WARN: Code duplicated, block: B:55:0x011a  */
    /* JADX WARN: Code duplicated, block: B:58:0x012d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0132  */
    /* JADX WARN: Code duplicated, block: B:62:0x013b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0163  */
    /* JADX WARN: Code duplicated, block: B:67:0x0165  */
    /* JADX WARN: Code duplicated, block: B:70:0x016c  */
    /* JADX WARN: Code duplicated, block: B:71:0x016e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0181 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x0183  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:94:0x0202 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x0204  */
    /* JADX WARN: Code duplicated, block: B:98:0x0227  */
    /* JADX WARN: Code duplicated, block: B:99:0x022b  */
    public static final void a(A a6, D4.a aVar, B b6, V.a aVar2, C0230o c0230o, int i, int i3) {
        int i6;
        D4.a aVar3;
        int i7;
        D4.a aVar4;
        View view;
        S0.b bVar;
        String str;
        S0.k kVar;
        C0226m c0226mM;
        InterfaceC0203a0 interfaceC0203a0N;
        UUID uuid;
        Object objK;
        U u6;
        C0230o c0230o2;
        boolean z5;
        String str2;
        D4.a aVar5;
        y yVar;
        int i8;
        boolean z6;
        int i9;
        boolean z7;
        boolean zF;
        Object objK2;
        U u7;
        Object f6;
        p111u4.d dVar;
        D4.a aVar6;
        y yVar2;
        C0230o c0230o3;
        String str3;
        S0.k kVar2;
        boolean z8;
        boolean z9;
        boolean zF2;
        Object objK3;
        boolean z10;
        boolean z11;
        Object objK4;
        boolean zH;
        Object objK5;
        boolean zH2;
        Object objK6;
        boolean zH3;
        Object objK7;
        int i10;
        C1106n c1106n;
        C1100h c1100h;
        C0235q0 c0235q0T;
        int i11;
        int i12;
        A a7 = a6;
        c0230o.X(-830247068);
        if ((i & 6) == 0) {
            i6 = (c0230o.f(a7) ? 4 : 2) | i;
        } else {
            i6 = i;
        }
        int i13 = i3 & 2;
        if (i13 == 0) {
            if ((i & 48) == 0) {
                aVar3 = aVar;
                i6 |= c0230o.h(aVar3) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (c0230o.f(b6)) {
                    i12 = HueLog.LogComponent.STREAMDTLS;
                } else {
                    i12 = 128;
                }
                i6 |= i12;
            }
            if ((i & 3072) == 0) {
                if (c0230o.h(aVar2)) {
                    i11 = 2048;
                } else {
                    i11 = 1024;
                }
                i6 |= i11;
            }
            i7 = i6;
            if ((i7 & 1171) == 1170 || !c0230o.B()) {
                if (i13 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar3;
                }
                view = (View) c0230o.k(AndroidCompositionLocals_androidKt.f6734f);
                bVar = (S0.b) c0230o.k(AbstractC1124c0.f14367f);
                str = (String) c0230o.k(f5436a);
                kVar = (S0.k) c0230o.k(AbstractC1124c0.f14372l);
                c0226mM = C0208d.M(c0230o);
                interfaceC0203a0N = C0208d.N(aVar2, c0230o);
                uuid = (UUID) p020d2.n.H(new Object[0], null, e.f5418k, c0230o, 3072, 6);
                objK = c0230o.K();
                u6 = C0222k.f3714a;
                if (objK == u6) {
                    D4.a aVar7 = aVar4;
                    z5 = true;
                    c0230o2 = c0230o;
                    y yVar3 = new y(aVar7, b6, str, view, bVar, a6, uuid);
                    str2 = str;
                    aVar5 = aVar7;
                    a7 = a6;
                    yVar3.h(c0226mM, new V.a(1302892335, new A2.d(yVar3, 9, interfaceC0203a0N), true));
                    c0230o2.f0(yVar3);
                    objK = yVar3;
                } else {
                    c0230o2 = c0230o;
                    z5 = true;
                    str2 = str;
                    aVar5 = aVar4;
                }
                yVar = (y) objK;
                boolean zH4 = c0230o2.h(yVar);
                i8 = i7 & 112;
                if (i8 == 32) {
                    z6 = z5;
                } else {
                    z6 = false;
                }
                boolean z12 = zH4 | z6;
                i9 = i7 & 896;
                if (i9 == 256) {
                    z7 = z5;
                } else {
                    z7 = false;
                }
                zF = z12 | z7 | c0230o2.f(str2) | c0230o2.f(kVar);
                objK2 = c0230o2.K();
                if (zF) {
                    u7 = u6;
                } else {
                    u7 = u6;
                    if (objK2 != u7) {
                        f6 = objK2;
                        kVar2 = kVar;
                        aVar6 = aVar5;
                        str3 = str2;
                        dVar = null;
                        yVar2 = yVar;
                        c0230o3 = c0230o2;
                    }
                    C0208d.c(yVar2, (D4.c) f6, c0230o3);
                    boolean zH5 = c0230o3.h(yVar2);
                    if (i8 == 32) {
                        z8 = z5;
                    } else {
                        z8 = false;
                    }
                    boolean z13 = z8 | zH5;
                    if (i9 == 256) {
                        z9 = z5;
                    } else {
                        z9 = false;
                    }
                    zF2 = z13 | z9 | c0230o3.f(str3) | c0230o3.f(kVar2);
                    objK3 = c0230o3.K();
                    if (zF2 || objK3 == u7) {
                        g gVar = new g(yVar2, aVar6, b6, str3, kVar2);
                        c0230o3.f0(gVar);
                        objK3 = gVar;
                    }
                    C0208d.g((D4.a) objK3, c0230o3);
                    boolean zH6 = c0230o3.h(yVar2);
                    if ((i7 & 14) == 4) {
                        z10 = z5;
                    } else {
                        z10 = false;
                    }
                    z11 = zH6 | z10;
                    objK4 = c0230o3.K();
                    if (z11 || objK4 == u7) {
                        objK4 = new C0005c0(yVar2, 25, a7);
                        c0230o3.f0(objK4);
                    }
                    C0208d.c(a7, (D4.c) objK4, c0230o3);
                    zH = c0230o3.h(yVar2);
                    objK5 = c0230o3.K();
                    if (zH || objK5 == u7) {
                        objK5 = new i(yVar2, dVar);
                        c0230o3.f0(objK5);
                    }
                    C0208d.e((D4.e) objK5, c0230o3, yVar2);
                    Z.l lVar = Z.l.f5957a;
                    zH2 = c0230o3.h(yVar2);
                    objK6 = c0230o3.K();
                    if (zH2 || objK6 == u7) {
                        objK6 = new j(yVar2, 0);
                        c0230o3.f0(objK6);
                    }
                    Z.o oVarD = androidx.compose.ui.layout.a.d(lVar, (D4.c) objK6);
                    zH3 = c0230o3.h(yVar2) | c0230o3.f(kVar2);
                    objK7 = c0230o3.K();
                    if (zH3 || objK7 == u7) {
                        objK7 = new g1(yVar2, 1, kVar2);
                        c0230o3.f0(objK7);
                    }
                    F f7 = (F) objK7;
                    i10 = c0230o3.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M = c0230o3.m();
                    Z.o oVarC = Z.a.c(c0230o3, oVarD);
                    InterfaceC1102j.f14043g.getClass();
                    c1106n = C1101i.f14038b;
                    c0230o3.Z();
                    if (c0230o3.f3743O) {
                        c0230o3.l(c1106n);
                    } else {
                        c0230o3.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o3, f7);
                    C0208d.R(C1101i.f14040d, c0230o3, interfaceC0225l0M);
                    c1100h = C1101i.f14042f;
                    if (c0230o3.f3743O || !E4.k.a(c0230o3.K(), Integer.valueOf(i10))) {
                        p012c.k.y(i10, c0230o3, i10, c1100h);
                    }
                    C0208d.R(C1101i.f14039c, c0230o3, oVarC);
                    c0230o3.p(z5);
                }
                String str4 = str2;
                dVar = null;
                aVar6 = aVar5;
                yVar2 = yVar;
                c0230o3 = c0230o2;
                f6 = new F0(yVar2, aVar6, b6, str4, kVar, 4);
                str3 = str4;
                kVar2 = kVar;
                c0230o3.f0(f6);
                C0208d.c(yVar2, (D4.c) f6, c0230o3);
                boolean zH7 = c0230o3.h(yVar2);
                if (i8 == 32) {
                    z8 = z5;
                } else {
                    z8 = false;
                }
                boolean z14 = z8 | zH7;
                if (i9 == 256) {
                    z9 = z5;
                } else {
                    z9 = false;
                }
                zF2 = z14 | z9 | c0230o3.f(str3) | c0230o3.f(kVar2);
                objK3 = c0230o3.K();
                if (zF2) {
                    g gVar2 = new g(yVar2, aVar6, b6, str3, kVar2);
                    c0230o3.f0(gVar2);
                    objK3 = gVar2;
                } else {
                    g gVar3 = new g(yVar2, aVar6, b6, str3, kVar2);
                    c0230o3.f0(gVar3);
                    objK3 = gVar3;
                }
                C0208d.g((D4.a) objK3, c0230o3);
                boolean zH8 = c0230o3.h(yVar2);
                if ((i7 & 14) == 4) {
                    z10 = z5;
                } else {
                    z10 = false;
                }
                z11 = zH8 | z10;
                objK4 = c0230o3.K();
                if (z11) {
                    objK4 = new C0005c0(yVar2, 25, a7);
                    c0230o3.f0(objK4);
                } else {
                    objK4 = new C0005c0(yVar2, 25, a7);
                    c0230o3.f0(objK4);
                }
                C0208d.c(a7, (D4.c) objK4, c0230o3);
                zH = c0230o3.h(yVar2);
                objK5 = c0230o3.K();
                if (zH) {
                    objK5 = new i(yVar2, dVar);
                    c0230o3.f0(objK5);
                } else {
                    objK5 = new i(yVar2, dVar);
                    c0230o3.f0(objK5);
                }
                C0208d.e((D4.e) objK5, c0230o3, yVar2);
                Z.l lVar2 = Z.l.f5957a;
                zH2 = c0230o3.h(yVar2);
                objK6 = c0230o3.K();
                if (zH2) {
                    objK6 = new j(yVar2, 0);
                    c0230o3.f0(objK6);
                } else {
                    objK6 = new j(yVar2, 0);
                    c0230o3.f0(objK6);
                }
                Z.o oVarD2 = androidx.compose.ui.layout.a.d(lVar2, (D4.c) objK6);
                zH3 = c0230o3.h(yVar2) | c0230o3.f(kVar2);
                objK7 = c0230o3.K();
                if (zH3) {
                    objK7 = new g1(yVar2, 1, kVar2);
                    c0230o3.f0(objK7);
                } else {
                    objK7 = new g1(yVar2, 1, kVar2);
                    c0230o3.f0(objK7);
                }
                F f8 = (F) objK7;
                i10 = c0230o3.f3744P;
                InterfaceC0225l0 interfaceC0225l0M2 = c0230o3.m();
                Z.o oVarC2 = Z.a.c(c0230o3, oVarD2);
                InterfaceC1102j.f14043g.getClass();
                c1106n = C1101i.f14038b;
                c0230o3.Z();
                if (c0230o3.f3743O) {
                    c0230o3.l(c1106n);
                } else {
                    c0230o3.i0();
                }
                C0208d.R(C1101i.f14041e, c0230o3, f8);
                C0208d.R(C1101i.f14040d, c0230o3, interfaceC0225l0M2);
                c1100h = C1101i.f14042f;
                if (c0230o3.f3743O) {
                    p012c.k.y(i10, c0230o3, i10, c1100h);
                } else {
                    p012c.k.y(i10, c0230o3, i10, c1100h);
                }
                C0208d.R(C1101i.f14039c, c0230o3, oVarC2);
                c0230o3.p(z5);
            } else {
                c0230o.P();
                aVar6 = aVar3;
                c0230o3 = c0230o;
            }
            c0235q0T = c0230o3.t();
            if (c0235q0T != null) {
                c0235q0T.f3780d = new k(a7, aVar6, b6, aVar2, i, i3);
            }
        }
        i6 |= 48;
        aVar3 = aVar;
        if ((i & 384) == 0) {
            if (c0230o.f(b6)) {
                i12 = HueLog.LogComponent.STREAMDTLS;
            } else {
                i12 = 128;
            }
            i6 |= i12;
        }
        if ((i & 3072) == 0) {
            if (c0230o.h(aVar2)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i6 |= i11;
        }
        i7 = i6;
        if ((i7 & 1171) == 1170) {
            if (i13 != 0) {
                aVar4 = null;
            } else {
                aVar4 = aVar3;
            }
            view = (View) c0230o.k(AndroidCompositionLocals_androidKt.f6734f);
            bVar = (S0.b) c0230o.k(AbstractC1124c0.f14367f);
            str = (String) c0230o.k(f5436a);
            kVar = (S0.k) c0230o.k(AbstractC1124c0.f14372l);
            c0226mM = C0208d.M(c0230o);
            interfaceC0203a0N = C0208d.N(aVar2, c0230o);
            uuid = (UUID) p020d2.n.H(new Object[0], null, e.f5418k, c0230o, 3072, 6);
            objK = c0230o.K();
            u6 = C0222k.f3714a;
            if (objK == u6) {
                D4.a aVar8 = aVar4;
                z5 = true;
                c0230o2 = c0230o;
                y yVar4 = new y(aVar8, b6, str, view, bVar, a6, uuid);
                str2 = str;
                aVar5 = aVar8;
                a7 = a6;
                yVar4.h(c0226mM, new V.a(1302892335, new A2.d(yVar4, 9, interfaceC0203a0N), true));
                c0230o2.f0(yVar4);
                objK = yVar4;
            } else {
                c0230o2 = c0230o;
                z5 = true;
                str2 = str;
                aVar5 = aVar4;
            }
            yVar = (y) objK;
            boolean zH9 = c0230o2.h(yVar);
            i8 = i7 & 112;
            if (i8 == 32) {
                z6 = z5;
            } else {
                z6 = false;
            }
            boolean z15 = zH9 | z6;
            i9 = i7 & 896;
            if (i9 == 256) {
                z7 = z5;
            } else {
                z7 = false;
            }
            zF = z15 | z7 | c0230o2.f(str2) | c0230o2.f(kVar);
            objK2 = c0230o2.K();
            if (zF) {
                u7 = u6;
                if (objK2 != u7) {
                    f6 = objK2;
                    kVar2 = kVar;
                    aVar6 = aVar5;
                    str3 = str2;
                    dVar = null;
                    yVar2 = yVar;
                    c0230o3 = c0230o2;
                }
                C0208d.c(yVar2, (D4.c) f6, c0230o3);
                boolean zH10 = c0230o3.h(yVar2);
                if (i8 == 32) {
                    z8 = z5;
                } else {
                    z8 = false;
                }
                boolean z16 = z8 | zH10;
                if (i9 == 256) {
                    z9 = z5;
                } else {
                    z9 = false;
                }
                zF2 = z16 | z9 | c0230o3.f(str3) | c0230o3.f(kVar2);
                objK3 = c0230o3.K();
                if (zF2) {
                    g gVar4 = new g(yVar2, aVar6, b6, str3, kVar2);
                    c0230o3.f0(gVar4);
                    objK3 = gVar4;
                } else {
                    g gVar5 = new g(yVar2, aVar6, b6, str3, kVar2);
                    c0230o3.f0(gVar5);
                    objK3 = gVar5;
                }
                C0208d.g((D4.a) objK3, c0230o3);
                boolean zH11 = c0230o3.h(yVar2);
                if ((i7 & 14) == 4) {
                    z10 = z5;
                } else {
                    z10 = false;
                }
                z11 = zH11 | z10;
                objK4 = c0230o3.K();
                if (z11) {
                    objK4 = new C0005c0(yVar2, 25, a7);
                    c0230o3.f0(objK4);
                } else {
                    objK4 = new C0005c0(yVar2, 25, a7);
                    c0230o3.f0(objK4);
                }
                C0208d.c(a7, (D4.c) objK4, c0230o3);
                zH = c0230o3.h(yVar2);
                objK5 = c0230o3.K();
                if (zH) {
                    objK5 = new i(yVar2, dVar);
                    c0230o3.f0(objK5);
                } else {
                    objK5 = new i(yVar2, dVar);
                    c0230o3.f0(objK5);
                }
                C0208d.e((D4.e) objK5, c0230o3, yVar2);
                Z.l lVar3 = Z.l.f5957a;
                zH2 = c0230o3.h(yVar2);
                objK6 = c0230o3.K();
                if (zH2) {
                    objK6 = new j(yVar2, 0);
                    c0230o3.f0(objK6);
                } else {
                    objK6 = new j(yVar2, 0);
                    c0230o3.f0(objK6);
                }
                Z.o oVarD3 = androidx.compose.ui.layout.a.d(lVar3, (D4.c) objK6);
                zH3 = c0230o3.h(yVar2) | c0230o3.f(kVar2);
                objK7 = c0230o3.K();
                if (zH3) {
                    objK7 = new g1(yVar2, 1, kVar2);
                    c0230o3.f0(objK7);
                } else {
                    objK7 = new g1(yVar2, 1, kVar2);
                    c0230o3.f0(objK7);
                }
                F f9 = (F) objK7;
                i10 = c0230o3.f3744P;
                InterfaceC0225l0 interfaceC0225l0M3 = c0230o3.m();
                Z.o oVarC3 = Z.a.c(c0230o3, oVarD3);
                InterfaceC1102j.f14043g.getClass();
                c1106n = C1101i.f14038b;
                c0230o3.Z();
                if (c0230o3.f3743O) {
                    c0230o3.l(c1106n);
                } else {
                    c0230o3.i0();
                }
                C0208d.R(C1101i.f14041e, c0230o3, f9);
                C0208d.R(C1101i.f14040d, c0230o3, interfaceC0225l0M3);
                c1100h = C1101i.f14042f;
                if (c0230o3.f3743O) {
                    p012c.k.y(i10, c0230o3, i10, c1100h);
                } else {
                    p012c.k.y(i10, c0230o3, i10, c1100h);
                }
                C0208d.R(C1101i.f14039c, c0230o3, oVarC3);
                c0230o3.p(z5);
            } else {
                u7 = u6;
            }
            String str5 = str2;
            dVar = null;
            aVar6 = aVar5;
            yVar2 = yVar;
            c0230o3 = c0230o2;
            f6 = new F0(yVar2, aVar6, b6, str5, kVar, 4);
            str3 = str5;
            kVar2 = kVar;
            c0230o3.f0(f6);
            C0208d.c(yVar2, (D4.c) f6, c0230o3);
            boolean zH12 = c0230o3.h(yVar2);
            if (i8 == 32) {
                z8 = z5;
            } else {
                z8 = false;
            }
            boolean z17 = z8 | zH12;
            if (i9 == 256) {
                z9 = z5;
            } else {
                z9 = false;
            }
            zF2 = z17 | z9 | c0230o3.f(str3) | c0230o3.f(kVar2);
            objK3 = c0230o3.K();
            if (zF2) {
                g gVar6 = new g(yVar2, aVar6, b6, str3, kVar2);
                c0230o3.f0(gVar6);
                objK3 = gVar6;
            } else {
                g gVar7 = new g(yVar2, aVar6, b6, str3, kVar2);
                c0230o3.f0(gVar7);
                objK3 = gVar7;
            }
            C0208d.g((D4.a) objK3, c0230o3);
            boolean zH13 = c0230o3.h(yVar2);
            if ((i7 & 14) == 4) {
                z10 = z5;
            } else {
                z10 = false;
            }
            z11 = zH13 | z10;
            objK4 = c0230o3.K();
            if (z11) {
                objK4 = new C0005c0(yVar2, 25, a7);
                c0230o3.f0(objK4);
            } else {
                objK4 = new C0005c0(yVar2, 25, a7);
                c0230o3.f0(objK4);
            }
            C0208d.c(a7, (D4.c) objK4, c0230o3);
            zH = c0230o3.h(yVar2);
            objK5 = c0230o3.K();
            if (zH) {
                objK5 = new i(yVar2, dVar);
                c0230o3.f0(objK5);
            } else {
                objK5 = new i(yVar2, dVar);
                c0230o3.f0(objK5);
            }
            C0208d.e((D4.e) objK5, c0230o3, yVar2);
            Z.l lVar4 = Z.l.f5957a;
            zH2 = c0230o3.h(yVar2);
            objK6 = c0230o3.K();
            if (zH2) {
                objK6 = new j(yVar2, 0);
                c0230o3.f0(objK6);
            } else {
                objK6 = new j(yVar2, 0);
                c0230o3.f0(objK6);
            }
            Z.o oVarD4 = androidx.compose.ui.layout.a.d(lVar4, (D4.c) objK6);
            zH3 = c0230o3.h(yVar2) | c0230o3.f(kVar2);
            objK7 = c0230o3.K();
            if (zH3) {
                objK7 = new g1(yVar2, 1, kVar2);
                c0230o3.f0(objK7);
            } else {
                objK7 = new g1(yVar2, 1, kVar2);
                c0230o3.f0(objK7);
            }
            F f10 = (F) objK7;
            i10 = c0230o3.f3744P;
            InterfaceC0225l0 interfaceC0225l0M4 = c0230o3.m();
            Z.o oVarC4 = Z.a.c(c0230o3, oVarD4);
            InterfaceC1102j.f14043g.getClass();
            c1106n = C1101i.f14038b;
            c0230o3.Z();
            if (c0230o3.f3743O) {
                c0230o3.l(c1106n);
            } else {
                c0230o3.i0();
            }
            C0208d.R(C1101i.f14041e, c0230o3, f10);
            C0208d.R(C1101i.f14040d, c0230o3, interfaceC0225l0M4);
            c1100h = C1101i.f14042f;
            if (c0230o3.f3743O) {
                p012c.k.y(i10, c0230o3, i10, c1100h);
            } else {
                p012c.k.y(i10, c0230o3, i10, c1100h);
            }
            C0208d.R(C1101i.f14039c, c0230o3, oVarC4);
            c0230o3.p(z5);
        } else {
            if (i13 != 0) {
                aVar4 = null;
            } else {
                aVar4 = aVar3;
            }
            view = (View) c0230o.k(AndroidCompositionLocals_androidKt.f6734f);
            bVar = (S0.b) c0230o.k(AbstractC1124c0.f14367f);
            str = (String) c0230o.k(f5436a);
            kVar = (S0.k) c0230o.k(AbstractC1124c0.f14372l);
            c0226mM = C0208d.M(c0230o);
            interfaceC0203a0N = C0208d.N(aVar2, c0230o);
            uuid = (UUID) p020d2.n.H(new Object[0], null, e.f5418k, c0230o, 3072, 6);
            objK = c0230o.K();
            u6 = C0222k.f3714a;
            if (objK == u6) {
                D4.a aVar9 = aVar4;
                z5 = true;
                c0230o2 = c0230o;
                y yVar5 = new y(aVar9, b6, str, view, bVar, a6, uuid);
                str2 = str;
                aVar5 = aVar9;
                a7 = a6;
                yVar5.h(c0226mM, new V.a(1302892335, new A2.d(yVar5, 9, interfaceC0203a0N), true));
                c0230o2.f0(yVar5);
                objK = yVar5;
            } else {
                c0230o2 = c0230o;
                z5 = true;
                str2 = str;
                aVar5 = aVar4;
            }
            yVar = (y) objK;
            boolean zH14 = c0230o2.h(yVar);
            i8 = i7 & 112;
            if (i8 == 32) {
                z6 = z5;
            } else {
                z6 = false;
            }
            boolean z18 = zH14 | z6;
            i9 = i7 & 896;
            if (i9 == 256) {
                z7 = z5;
            } else {
                z7 = false;
            }
            zF = z18 | z7 | c0230o2.f(str2) | c0230o2.f(kVar);
            objK2 = c0230o2.K();
            if (zF) {
                u7 = u6;
                if (objK2 != u7) {
                    f6 = objK2;
                    kVar2 = kVar;
                    aVar6 = aVar5;
                    str3 = str2;
                    dVar = null;
                    yVar2 = yVar;
                    c0230o3 = c0230o2;
                }
                C0208d.c(yVar2, (D4.c) f6, c0230o3);
                boolean zH15 = c0230o3.h(yVar2);
                if (i8 == 32) {
                    z8 = z5;
                } else {
                    z8 = false;
                }
                boolean z19 = z8 | zH15;
                if (i9 == 256) {
                    z9 = z5;
                } else {
                    z9 = false;
                }
                zF2 = z19 | z9 | c0230o3.f(str3) | c0230o3.f(kVar2);
                objK3 = c0230o3.K();
                if (zF2) {
                    g gVar8 = new g(yVar2, aVar6, b6, str3, kVar2);
                    c0230o3.f0(gVar8);
                    objK3 = gVar8;
                } else {
                    g gVar9 = new g(yVar2, aVar6, b6, str3, kVar2);
                    c0230o3.f0(gVar9);
                    objK3 = gVar9;
                }
                C0208d.g((D4.a) objK3, c0230o3);
                boolean zH16 = c0230o3.h(yVar2);
                if ((i7 & 14) == 4) {
                    z10 = z5;
                } else {
                    z10 = false;
                }
                z11 = zH16 | z10;
                objK4 = c0230o3.K();
                if (z11) {
                    objK4 = new C0005c0(yVar2, 25, a7);
                    c0230o3.f0(objK4);
                } else {
                    objK4 = new C0005c0(yVar2, 25, a7);
                    c0230o3.f0(objK4);
                }
                C0208d.c(a7, (D4.c) objK4, c0230o3);
                zH = c0230o3.h(yVar2);
                objK5 = c0230o3.K();
                if (zH) {
                    objK5 = new i(yVar2, dVar);
                    c0230o3.f0(objK5);
                } else {
                    objK5 = new i(yVar2, dVar);
                    c0230o3.f0(objK5);
                }
                C0208d.e((D4.e) objK5, c0230o3, yVar2);
                Z.l lVar5 = Z.l.f5957a;
                zH2 = c0230o3.h(yVar2);
                objK6 = c0230o3.K();
                if (zH2) {
                    objK6 = new j(yVar2, 0);
                    c0230o3.f0(objK6);
                } else {
                    objK6 = new j(yVar2, 0);
                    c0230o3.f0(objK6);
                }
                Z.o oVarD5 = androidx.compose.ui.layout.a.d(lVar5, (D4.c) objK6);
                zH3 = c0230o3.h(yVar2) | c0230o3.f(kVar2);
                objK7 = c0230o3.K();
                if (zH3) {
                    objK7 = new g1(yVar2, 1, kVar2);
                    c0230o3.f0(objK7);
                } else {
                    objK7 = new g1(yVar2, 1, kVar2);
                    c0230o3.f0(objK7);
                }
                F f11 = (F) objK7;
                i10 = c0230o3.f3744P;
                InterfaceC0225l0 interfaceC0225l0M5 = c0230o3.m();
                Z.o oVarC5 = Z.a.c(c0230o3, oVarD5);
                InterfaceC1102j.f14043g.getClass();
                c1106n = C1101i.f14038b;
                c0230o3.Z();
                if (c0230o3.f3743O) {
                    c0230o3.l(c1106n);
                } else {
                    c0230o3.i0();
                }
                C0208d.R(C1101i.f14041e, c0230o3, f11);
                C0208d.R(C1101i.f14040d, c0230o3, interfaceC0225l0M5);
                c1100h = C1101i.f14042f;
                if (c0230o3.f3743O) {
                    p012c.k.y(i10, c0230o3, i10, c1100h);
                } else {
                    p012c.k.y(i10, c0230o3, i10, c1100h);
                }
                C0208d.R(C1101i.f14039c, c0230o3, oVarC5);
                c0230o3.p(z5);
            } else {
                u7 = u6;
            }
            String str6 = str2;
            dVar = null;
            aVar6 = aVar5;
            yVar2 = yVar;
            c0230o3 = c0230o2;
            f6 = new F0(yVar2, aVar6, b6, str6, kVar, 4);
            str3 = str6;
            kVar2 = kVar;
            c0230o3.f0(f6);
            C0208d.c(yVar2, (D4.c) f6, c0230o3);
            boolean zH17 = c0230o3.h(yVar2);
            if (i8 == 32) {
                z8 = z5;
            } else {
                z8 = false;
            }
            boolean z110 = z8 | zH17;
            if (i9 == 256) {
                z9 = z5;
            } else {
                z9 = false;
            }
            zF2 = z110 | z9 | c0230o3.f(str3) | c0230o3.f(kVar2);
            objK3 = c0230o3.K();
            if (zF2) {
                g gVar10 = new g(yVar2, aVar6, b6, str3, kVar2);
                c0230o3.f0(gVar10);
                objK3 = gVar10;
            } else {
                g gVar11 = new g(yVar2, aVar6, b6, str3, kVar2);
                c0230o3.f0(gVar11);
                objK3 = gVar11;
            }
            C0208d.g((D4.a) objK3, c0230o3);
            boolean zH18 = c0230o3.h(yVar2);
            if ((i7 & 14) == 4) {
                z10 = z5;
            } else {
                z10 = false;
            }
            z11 = zH18 | z10;
            objK4 = c0230o3.K();
            if (z11) {
                objK4 = new C0005c0(yVar2, 25, a7);
                c0230o3.f0(objK4);
            } else {
                objK4 = new C0005c0(yVar2, 25, a7);
                c0230o3.f0(objK4);
            }
            C0208d.c(a7, (D4.c) objK4, c0230o3);
            zH = c0230o3.h(yVar2);
            objK5 = c0230o3.K();
            if (zH) {
                objK5 = new i(yVar2, dVar);
                c0230o3.f0(objK5);
            } else {
                objK5 = new i(yVar2, dVar);
                c0230o3.f0(objK5);
            }
            C0208d.e((D4.e) objK5, c0230o3, yVar2);
            Z.l lVar6 = Z.l.f5957a;
            zH2 = c0230o3.h(yVar2);
            objK6 = c0230o3.K();
            if (zH2) {
                objK6 = new j(yVar2, 0);
                c0230o3.f0(objK6);
            } else {
                objK6 = new j(yVar2, 0);
                c0230o3.f0(objK6);
            }
            Z.o oVarD6 = androidx.compose.ui.layout.a.d(lVar6, (D4.c) objK6);
            zH3 = c0230o3.h(yVar2) | c0230o3.f(kVar2);
            objK7 = c0230o3.K();
            if (zH3) {
                objK7 = new g1(yVar2, 1, kVar2);
                c0230o3.f0(objK7);
            } else {
                objK7 = new g1(yVar2, 1, kVar2);
                c0230o3.f0(objK7);
            }
            F f12 = (F) objK7;
            i10 = c0230o3.f3744P;
            InterfaceC0225l0 interfaceC0225l0M6 = c0230o3.m();
            Z.o oVarC6 = Z.a.c(c0230o3, oVarD6);
            InterfaceC1102j.f14043g.getClass();
            c1106n = C1101i.f14038b;
            c0230o3.Z();
            if (c0230o3.f3743O) {
                c0230o3.l(c1106n);
            } else {
                c0230o3.i0();
            }
            C0208d.R(C1101i.f14041e, c0230o3, f12);
            C0208d.R(C1101i.f14040d, c0230o3, interfaceC0225l0M6);
            c1100h = C1101i.f14042f;
            if (c0230o3.f3743O) {
                p012c.k.y(i10, c0230o3, i10, c1100h);
            } else {
                p012c.k.y(i10, c0230o3, i10, c1100h);
            }
            C0208d.R(C1101i.f14039c, c0230o3, oVarC6);
            c0230o3.p(z5);
        }
        c0235q0T = c0230o3.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new k(a7, aVar6, b6, aVar2, i, i3);
        }
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
