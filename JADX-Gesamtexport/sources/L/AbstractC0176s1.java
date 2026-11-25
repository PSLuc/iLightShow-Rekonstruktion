package L;

import B.AbstractC0013g0;
import B.C0003b0;
import B.C0038t0;
import B.C0039u;
import N.C0208d;
import N.C0209d0;
import N.C0222k;
import N.C0230o;
import N.C0235q0;
import N.InterfaceC0203a0;
import N.InterfaceC0225l0;
import N3.C0261e;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.nanjoran.ilightshow.R;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.io.Serializable;
import java.util.NoSuchElementException;
import okhttp3.internal.http2.Http2;
import p123x.AbstractC1084q;
import p123x.C1086t;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;
import p130y0.AbstractC1124c0;

/* JADX INFO: renamed from: L.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0176s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f2909a = G4.a.c(M.q.f3280b, M.q.f3279a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f2910b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f2911c = 6;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f2912d = M.q.f3283e;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f2913e = M.q.f3281c;

    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0096  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:51:0x00af  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:64:0x0151  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public static final void a(J4.a aVar, D4.c cVar, Z.l lVar, boolean z5, J4.a aVar2, int i, C0261e c0261e, O0 o6, C0230o c0230o, int i3, int i6) {
        int i7;
        int i8;
        C0261e c0261e2;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z6;
        int i13;
        O0 o0F;
        Z.l lVar2;
        Object objK;
        N.U u6;
        Object objK2;
        Z.l lVar3;
        C0261e c0261e3;
        int i14;
        O0 o7;
        boolean z7;
        C0235q0 c0235q0T;
        c0230o.X(-743091416);
        int i15 = i3 | (c0230o.f(aVar) ? 4 : 2);
        if ((i3 & 48) == 0) {
            i15 |= c0230o.h(cVar) ? 32 : 16;
        }
        int i16 = i15 | 3456 | (c0230o.f(aVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        int i17 = i6 & 32;
        if (i17 == 0) {
            if ((i3 & 196608) == 0) {
                i7 = i;
                i16 |= c0230o.d(i7) ? 131072 : 65536;
            }
            i8 = i6 & 64;
            if (i8 != 0) {
                i10 = i16 | 1572864;
                c0261e2 = c0261e;
            } else {
                c0261e2 = c0261e;
                if (c0230o.h(c0261e2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i10 = i16 | i9;
            }
            i11 = i10 | 4194304;
            if ((4793491 & i11) == 4793490 || !c0230o.B()) {
                c0230o.R();
                if ((i3 & 1) != 0 || c0230o.z()) {
                    Z.l lVar4 = Z.l.f5957a;
                    if (i17 != 0) {
                        i7 = 0;
                    }
                    if (i8 != 0) {
                        c0261e2 = null;
                    }
                    i12 = i7;
                    z6 = true;
                    i13 = i11 & (-29360129);
                    o0F = U0.f(c0230o);
                    lVar2 = lVar4;
                } else {
                    c0230o.P();
                    lVar2 = lVar;
                    z6 = z5;
                    i12 = i7;
                    i13 = i11 & (-29360129);
                    o0F = o6;
                }
                C0261e c0261e4 = c0261e2;
                c0230o.q();
                c0230o.W(-223513570);
                objK = c0230o.K();
                u6 = C0222k.f3714a;
                if (objK == u6) {
                    objK = new p117w.m();
                    c0230o.f0(objK);
                }
                p117w.m mVar = (p117w.m) objK;
                c0230o.p(false);
                c0230o.W(-223513473);
                objK2 = c0230o.K();
                if (objK2 == u6) {
                    objK2 = new p117w.m();
                    c0230o.f0(objK2);
                }
                p117w.m mVar2 = (p117w.m) objK2;
                c0230o.p(false);
                b(aVar, cVar, lVar2, z6, aVar2, c0261e4, null, mVar, mVar2, V.b.b(c0230o, -811582901, new X0(mVar, o0F, z6, 0)), V.b.b(c0230o, -1832060001, new X0(mVar2, o0F, z6, 1)), V.b.b(c0230o, 377064480, new Y0(0, o0F, z6)), i12, c0230o, (i13 & 14) | 918552576 | (i13 & 112) | 3456 | (57344 & i13) | ((i13 >> 3) & 458752), ((i13 >> 9) & 896) | 54);
                lVar3 = lVar2;
                c0261e3 = c0261e4;
                i14 = i12;
                o7 = o0F;
                z7 = z6;
            } else {
                c0230o.P();
                z7 = z5;
                o7 = o6;
                c0261e3 = c0261e2;
                i14 = i7;
                lVar3 = lVar;
            }
            c0235q0T = c0230o.t();
            if (c0235q0T != null) {
                c0235q0T.f3780d = new Z0(aVar, cVar, lVar3, z7, aVar2, i14, c0261e3, o7, i3, i6);
            }
        }
        i16 |= 196608;
        i7 = i;
        i8 = i6 & 64;
        if (i8 != 0) {
            i10 = i16 | 1572864;
            c0261e2 = c0261e;
        } else {
            c0261e2 = c0261e;
            if (c0230o.h(c0261e2)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i10 = i16 | i9;
        }
        i11 = i10 | 4194304;
        if ((4793491 & i11) == 4793490) {
            c0230o.R();
            if ((i3 & 1) != 0) {
                Z.l lVar5 = Z.l.f5957a;
                if (i17 != 0) {
                    i7 = 0;
                }
                if (i8 != 0) {
                    c0261e2 = null;
                }
                i12 = i7;
                z6 = true;
                i13 = i11 & (-29360129);
                o0F = U0.f(c0230o);
                lVar2 = lVar5;
            } else {
                Z.l lVar6 = Z.l.f5957a;
                if (i17 != 0) {
                    i7 = 0;
                }
                if (i8 != 0) {
                    c0261e2 = null;
                }
                i12 = i7;
                z6 = true;
                i13 = i11 & (-29360129);
                o0F = U0.f(c0230o);
                lVar2 = lVar6;
            }
            C0261e c0261e5 = c0261e2;
            c0230o.q();
            c0230o.W(-223513570);
            objK = c0230o.K();
            u6 = C0222k.f3714a;
            if (objK == u6) {
                objK = new p117w.m();
                c0230o.f0(objK);
            }
            p117w.m mVar3 = (p117w.m) objK;
            c0230o.p(false);
            c0230o.W(-223513473);
            objK2 = c0230o.K();
            if (objK2 == u6) {
                objK2 = new p117w.m();
                c0230o.f0(objK2);
            }
            p117w.m mVar4 = (p117w.m) objK2;
            c0230o.p(false);
            b(aVar, cVar, lVar2, z6, aVar2, c0261e5, null, mVar3, mVar4, V.b.b(c0230o, -811582901, new X0(mVar3, o0F, z6, 0)), V.b.b(c0230o, -1832060001, new X0(mVar4, o0F, z6, 1)), V.b.b(c0230o, 377064480, new Y0(0, o0F, z6)), i12, c0230o, (i13 & 14) | 918552576 | (i13 & 112) | 3456 | (57344 & i13) | ((i13 >> 3) & 458752), ((i13 >> 9) & 896) | 54);
            lVar3 = lVar2;
            c0261e3 = c0261e5;
            i14 = i12;
            o7 = o0F;
            z7 = z6;
        } else {
            c0230o.R();
            if ((i3 & 1) != 0) {
                Z.l lVar7 = Z.l.f5957a;
                if (i17 != 0) {
                    i7 = 0;
                }
                if (i8 != 0) {
                    c0261e2 = null;
                }
                i12 = i7;
                z6 = true;
                i13 = i11 & (-29360129);
                o0F = U0.f(c0230o);
                lVar2 = lVar7;
            } else {
                Z.l lVar8 = Z.l.f5957a;
                if (i17 != 0) {
                    i7 = 0;
                }
                if (i8 != 0) {
                    c0261e2 = null;
                }
                i12 = i7;
                z6 = true;
                i13 = i11 & (-29360129);
                o0F = U0.f(c0230o);
                lVar2 = lVar8;
            }
            C0261e c0261e6 = c0261e2;
            c0230o.q();
            c0230o.W(-223513570);
            objK = c0230o.K();
            u6 = C0222k.f3714a;
            if (objK == u6) {
                objK = new p117w.m();
                c0230o.f0(objK);
            }
            p117w.m mVar5 = (p117w.m) objK;
            c0230o.p(false);
            c0230o.W(-223513473);
            objK2 = c0230o.K();
            if (objK2 == u6) {
                objK2 = new p117w.m();
                c0230o.f0(objK2);
            }
            p117w.m mVar6 = (p117w.m) objK2;
            c0230o.p(false);
            b(aVar, cVar, lVar2, z6, aVar2, c0261e6, null, mVar5, mVar6, V.b.b(c0230o, -811582901, new X0(mVar5, o0F, z6, 0)), V.b.b(c0230o, -1832060001, new X0(mVar6, o0F, z6, 1)), V.b.b(c0230o, 377064480, new Y0(0, o0F, z6)), i12, c0230o, (i13 & 14) | 918552576 | (i13 & 112) | 3456 | (57344 & i13) | ((i13 >> 3) & 458752), ((i13 >> 9) & 896) | 54);
            lVar3 = lVar2;
            c0261e3 = c0261e6;
            i14 = i12;
            o7 = o0F;
            z7 = z6;
        }
        c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new Z0(aVar, cVar, lVar3, z7, aVar2, i14, c0261e3, o7, i3, i6);
        }
    }

    public static final void b(J4.a aVar, D4.c cVar, Z.l lVar, boolean z5, J4.a aVar2, C0261e c0261e, O0 o6, p117w.m mVar, p117w.m mVar2, V.a aVar3, V.a aVar4, V.a aVar5, int i, C0230o c0230o, int i3, int i6) {
        int i7;
        int i8;
        int i9;
        O0 o0F;
        int i10;
        Object a6;
        int i11;
        O0 o7;
        c0230o.X(-1048796133);
        if ((i3 & 6) == 0) {
            i7 = (c0230o.f(aVar) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= c0230o.h(cVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i7 |= c0230o.f(lVar) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i3 & 3072) == 0) {
            i7 |= c0230o.g(z5) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i7 |= c0230o.f(aVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i3) == 0) {
            i7 |= c0230o.h(c0261e) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i7 |= 524288;
        }
        if ((12582912 & i3) == 0) {
            i7 |= c0230o.f(mVar) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i7 |= c0230o.f(mVar2) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i7 |= c0230o.h(aVar3) ? 536870912 : 268435456;
        }
        if ((i6 & 6) == 0) {
            i8 = i6 | (c0230o.h(aVar4) ? 4 : 2);
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= c0230o.h(aVar5) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i9 = i;
            i8 |= c0230o.d(i9) ? HueLog.LogComponent.STREAMDTLS : 128;
        } else {
            i9 = i;
        }
        int i12 = i8;
        int i13 = i7;
        if ((i13 & 306783379) == 306783378 && (i12 & 147) == 146 && c0230o.B()) {
            c0230o.P();
            o7 = o6;
        } else {
            c0230o.R();
            int i14 = i3 & 1;
            N.U u6 = C0222k.f3714a;
            if (i14 == 0 || c0230o.z()) {
                o0F = U0.f(c0230o);
                i10 = i13 & (-3670017);
            } else {
                c0230o.P();
                i10 = i13 & (-3670017);
                o0F = o6;
            }
            c0230o.q();
            InterfaceC0203a0 interfaceC0203a0N = C0208d.N(c0261e, c0230o);
            c0230o.W(-223507747);
            boolean z6 = ((i12 & 896) == 256) | ((((i10 & 57344) ^ 24576) > 16384 && c0230o.f(aVar2)) || (i10 & 24576) == 16384);
            Object objK = c0230o.K();
            if (z6 || objK == u6) {
                i11 = i10;
                a6 = new A0(aVar.f1939a, aVar.f1940b, i9, new C0039u(3, interfaceC0203a0N), aVar2);
                c0230o.f0(a6);
            } else {
                i11 = i10;
                a6 = objK;
            }
            A0 a7 = (A0) a6;
            c0230o.p(false);
            c0230o.W(-223507467);
            boolean z7 = (i11 & 112) == 32;
            Object objK2 = c0230o.K();
            if (z7 || objK2 == u6) {
                objK2 = new A2.b(cVar, 1);
                c0230o.f0(objK2);
            }
            c0230o.p(false);
            a7.f2149f = (D4.c) objK2;
            a7.h(aVar.f1939a);
            a7.g(aVar.f1940b);
            int i15 = (i11 >> 3) & 1008;
            int i16 = i11 >> 9;
            int i17 = (i16 & 3670016) | i15 | (i16 & 57344) | (458752 & i16);
            int i18 = i12 << 21;
            c(a7, lVar, z5, null, mVar, mVar2, aVar3, aVar4, aVar5, c0230o, i17 | (29360128 & i18) | (i18 & 234881024));
            o7 = o0F;
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new V0(aVar, cVar, lVar, z5, aVar2, c0261e, o7, mVar, mVar2, aVar3, aVar4, aVar5, i, i3, i6);
        }
    }

    public static final void c(A0 a6, Z.l lVar, boolean z5, O0 o6, p117w.m mVar, p117w.m mVar2, V.a aVar, V.a aVar2, V.a aVar3, C0230o c0230o, int i) {
        int i3;
        Z.l lVar2;
        boolean z6;
        V.a aVar4;
        V.a aVar5;
        O0 o0F;
        int i6;
        O0 o7;
        c0230o.X(511405654);
        if ((i & 6) == 0) {
            i3 = (c0230o.f(a6) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            lVar2 = lVar;
            i3 |= c0230o.f(lVar2) ? 32 : 16;
        } else {
            lVar2 = lVar;
        }
        if ((i & 384) == 0) {
            z6 = z5;
            i3 |= c0230o.g(z6) ? HueLog.LogComponent.STREAMDTLS : 128;
        } else {
            z6 = z5;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c0230o.f(mVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= c0230o.f(mVar2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= c0230o.h(aVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            aVar4 = aVar2;
            i3 |= c0230o.h(aVar4) ? 8388608 : 4194304;
        } else {
            aVar4 = aVar2;
        }
        if ((100663296 & i) == 0) {
            aVar5 = aVar3;
            i3 |= c0230o.h(aVar5) ? 67108864 : 33554432;
        } else {
            aVar5 = aVar3;
        }
        if ((38347923 & i3) == 38347922 && c0230o.B()) {
            c0230o.P();
            o7 = o6;
        } else {
            c0230o.R();
            if ((i & 1) == 0 || c0230o.z()) {
                o0F = U0.f(c0230o);
                i6 = i3 & (-7169);
            } else {
                c0230o.P();
                i6 = i3 & (-7169);
                o0F = o6;
            }
            c0230o.q();
            if (a6.f2144a < 0) {
                throw new IllegalArgumentException("steps should be >= 0");
            }
            int i7 = i6 >> 3;
            d(lVar2, a6, z6, mVar, mVar2, aVar, aVar4, aVar5, c0230o, (i6 & 896) | (i7 & 14) | ((i6 << 3) & 112) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (3670016 & i7) | (i7 & 29360128));
            o7 = o0F;
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new W0(a6, lVar, z5, o7, mVar, mVar2, aVar, aVar2, aVar3, i);
        }
    }

    public static final void d(Z.l lVar, A0 a6, boolean z5, p117w.m mVar, p117w.m mVar2, V.a aVar, V.a aVar2, V.a aVar3, C0230o c0230o, int i) {
        int i3;
        Z.o suspendPointerInputElement;
        A0 a7;
        V.a aVar4;
        V.a aVar5 = aVar3;
        c0230o.X(-1411725677);
        if ((i & 6) == 0) {
            i3 = (c0230o.f(lVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c0230o.f(a6) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c0230o.g(z5) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c0230o.f(mVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c0230o.f(mVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= c0230o.h(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= c0230o.h(aVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= c0230o.h(aVar5) ? 8388608 : 4194304;
        }
        if ((4793491 & i3) == 4793490 && c0230o.B()) {
            c0230o.P();
            a7 = a6;
            aVar4 = aVar2;
        } else {
            a6.f2155m.setValue(Boolean.valueOf(c0230o.k(AbstractC1124c0.f14372l) == S0.k.i));
            Z.l lVar2 = Z.l.f5957a;
            if (z5) {
                C0162n1 c0162n1 = new C0162n1(a6, mVar, mVar2, null);
                p091r0.i iVar = p091r0.u.f11534a;
                suspendPointerInputElement = new SuspendPointerInputElement(null, null, new Object[]{mVar, mVar2, a6}, c0162n1, 3);
            } else {
                suspendPointerInputElement = lVar2;
            }
            J4.a aVar6 = a6.f2146c;
            C0209d0 c0209d0 = a6.f2148e;
            J4.a aVar7 = new J4.a(aVar6.f1939a, c0209d0.h());
            Z.o oVarA = E0.i.a(lVar2, false, new C0150j1(z5, aVar7, a6, 1));
            C0209d0 c0209d1 = a6.f2147d;
            int i6 = i3;
            Z.o oVarA2 = E0.i.a(oVarA, true, new p101t.n0(c0209d1.h(), aVar7, a6.d()));
            J4.a aVar8 = new J4.a(c0209d1.h(), aVar6.f1940b);
            Z.o oVarA3 = E0.i.a(E0.i.a(lVar2, false, new C0150j1(z5, aVar8, a6, 0)), true, new p101t.n0(c0209d0.h(), aVar8, a6.c()));
            String strI = L.i(R.string.range_start, c0230o);
            String strI2 = L.i(R.string.range_end, c0230o);
            N.W0 w6 = AbstractC0155l0.f2822a;
            MinimumInteractiveModifier minimumInteractiveModifier = MinimumInteractiveModifier.f6679a;
            lVar.getClass();
            Z.o oVarK = androidx.compose.foundation.layout.c.g(minimumInteractiveModifier, M.q.f3280b, M.q.f3279a, 0.0f, 0.0f, 12).k(suspendPointerInputElement);
            c0230o.W(1300547382);
            boolean z6 = (i6 & 112) == 32;
            Object objK = c0230o.K();
            Object obj = C0222k.f3714a;
            if (z6 || objK == obj) {
                objK = new C0038t0(1, a6);
                c0230o.f0(objK);
            }
            p113v0.F f6 = (p113v0.F) objK;
            c0230o.p(false);
            c0230o.W(-1323940314);
            int i7 = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
            InterfaceC1102j.f14043g.getClass();
            C1106n c1106n = C1101i.f14038b;
            V.a aVarH = p113v0.U.h(oVarK);
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C1100h c1100h = C1101i.f14041e;
            C0208d.R(c1100h, c0230o, f6);
            C1100h c1100h2 = C1101i.f14040d;
            C0208d.R(c1100h2, c0230o, interfaceC0225l0M);
            C1100h c1100h3 = C1101i.f14042f;
            if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i7))) {
                p012c.k.y(i7, c0230o, i7, c1100h3);
            }
            AbstractC0013g0.p(0, aVarH, new N.C0(c0230o), c0230o, 2058660585);
            Z.o oVarC = androidx.compose.ui.layout.a.c(lVar2, EnumC0193y0.i);
            c0230o.W(-2040261114);
            boolean zF = c0230o.f(strI);
            Object objK2 = c0230o.K();
            if (zF || objK2 == obj) {
                objK2 = new E0.j(strI, 4);
                c0230o.f0(objK2);
            }
            c0230o.p(false);
            Z.o oVarK2 = androidx.compose.foundation.c.a(E0.i.a(oVarC, true, (D4.c) objK2), z5, mVar).k(oVarA2);
            c0230o.W(733328855);
            Z.g gVar = Z.b.f5933h;
            C1086t c1086tF = AbstractC1084q.f(gVar, false, c0230o, 0);
            c0230o.W(-1323940314);
            int i8 = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M2 = c0230o.m();
            V.a aVarH2 = p113v0.U.h(oVarK2);
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C0208d.R(c1100h, c0230o, c1086tF);
            C0208d.R(c1100h2, c0230o, interfaceC0225l0M2);
            if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i8))) {
                p012c.k.y(i8, c0230o, i8, c1100h3);
            }
            AbstractC0013g0.p(0, aVarH2, new N.C0(c0230o), c0230o, 2058660585);
            int i9 = (i6 >> 3) & 14;
            a7 = a6;
            aVar.c(a7, c0230o, Integer.valueOf(((i6 >> 12) & 112) | i9));
            c0230o.p(false);
            c0230o.p(true);
            c0230o.p(false);
            c0230o.p(false);
            Z.o oVarC2 = androidx.compose.ui.layout.a.c(lVar2, EnumC0193y0.f2986h);
            c0230o.W(-2040260744);
            boolean zF2 = c0230o.f(strI2);
            Object objK3 = c0230o.K();
            if (zF2 || objK3 == obj) {
                objK3 = new E0.j(strI2, 5);
                c0230o.f0(objK3);
            }
            c0230o.p(false);
            Z.o oVarK3 = androidx.compose.foundation.c.a(E0.i.a(oVarC2, true, (D4.c) objK3), z5, mVar2).k(oVarA3);
            c0230o.W(733328855);
            C1086t c1086tF2 = AbstractC1084q.f(gVar, false, c0230o, 0);
            c0230o.W(-1323940314);
            int i10 = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M3 = c0230o.m();
            V.a aVarH3 = p113v0.U.h(oVarK3);
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
            AbstractC0013g0.p(0, aVarH3, new N.C0(c0230o), c0230o, 2058660585);
            aVar4 = aVar2;
            aVar4.c(a7, c0230o, Integer.valueOf(i9 | ((i6 >> 15) & 112)));
            c0230o.p(false);
            c0230o.p(true);
            c0230o.p(false);
            c0230o.p(false);
            Z.o oVarC3 = androidx.compose.ui.layout.a.c(lVar2, EnumC0193y0.f2987j);
            c0230o.W(733328855);
            C1086t c1086tF3 = AbstractC1084q.f(gVar, false, c0230o, 0);
            c0230o.W(-1323940314);
            int i11 = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M4 = c0230o.m();
            V.a aVarH4 = p113v0.U.h(oVarC3);
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
            AbstractC0013g0.p(0, aVarH4, new N.C0(c0230o), c0230o, 2058660585);
            aVar5 = aVar3;
            aVar5.c(a7, c0230o, Integer.valueOf(i9 | ((i6 >> 18) & 112)));
            c0230o.p(false);
            AbstractC0013g0.q(c0230o, true, false, false, false);
            c0230o.p(true);
            c0230o.p(false);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0126b1(lVar, a7, z5, mVar, mVar2, aVar, aVar4, aVar5, i);
        }
    }

    public static final void e(float f6, D4.c cVar, Z.o oVar, boolean z5, D4.a aVar, O0 o6, p117w.m mVar, int i, V.a aVar2, V.a aVar3, J4.a aVar4, C0230o c0230o, int i3, int i6) {
        int i7;
        O0 o7;
        p117w.m mVar2;
        int i8;
        c0230o.X(1191170377);
        if ((i3 & 6) == 0) {
            i7 = (c0230o.c(f6) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= c0230o.h(cVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i7 |= c0230o.f(oVar) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i3 & 3072) == 0) {
            i7 |= c0230o.g(z5) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i7 |= c0230o.h(aVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i3) == 0) {
            o7 = o6;
            i7 |= c0230o.f(o7) ? 131072 : 65536;
        } else {
            o7 = o6;
        }
        if ((1572864 & i3) == 0) {
            mVar2 = mVar;
            i7 |= c0230o.f(mVar2) ? 1048576 : 524288;
        } else {
            mVar2 = mVar;
        }
        if ((12582912 & i3) == 0) {
            i7 |= c0230o.d(i) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i7 |= c0230o.h(aVar2) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i7 |= c0230o.h(aVar3) ? 536870912 : 268435456;
        }
        if ((i6 & 6) == 0) {
            i8 = i6 | (c0230o.f(aVar4) ? 4 : 2);
        } else {
            i8 = i6;
        }
        if ((i7 & 306783379) == 306783378 && (i8 & 3) == 2 && c0230o.B()) {
            c0230o.P();
        } else {
            c0230o.R();
            if ((i3 & 1) != 0 && !c0230o.z()) {
                c0230o.P();
            }
            c0230o.q();
            InterfaceC0203a0 interfaceC0203a0N = C0208d.N(aVar, c0230o);
            c0230o.W(-1537038451);
            boolean z6 = true;
            boolean z7 = (29360128 & i7) == 8388608;
            if ((((i8 & 14) ^ 6) <= 4 || !c0230o.f(aVar4)) && (i8 & 6) != 4) {
                z6 = false;
            }
            boolean z8 = z7 | z6;
            Object objK = c0230o.K();
            if (z8 || objK == C0222k.f3714a) {
                objK = new C0188w1(f6, i, new C0039u(4, interfaceC0203a0N), aVar4);
                c0230o.f0(objK);
            }
            C0188w1 c0188w1 = (C0188w1) objK;
            c0230o.p(false);
            c0188w1.f2957e = cVar;
            c0188w1.c(f6);
            int i9 = ((i7 >> 3) & 1008) | ((i7 >> 6) & 57344);
            int i10 = i7 >> 9;
            g(c0188w1, oVar, z5, null, mVar2, aVar2, aVar3, c0230o, i9 | (458752 & i10) | (i10 & 3670016));
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0132d1(f6, cVar, oVar, z5, aVar, o7, mVar, i, aVar2, aVar3, aVar4, i3, i6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x009e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00be  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:73:0x0142  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void f(float f6, D4.c cVar, Z.o oVar, boolean z5, J4.a aVar, int i, D4.a aVar2, O0 o6, p117w.m mVar, C0230o c0230o, int i3, int i6) {
        Z.o oVar2;
        int i7;
        int i8;
        int i9;
        D4.a aVar3;
        int i10;
        Z.o oVar3;
        int i11;
        Object objK;
        p117w.m mVar2;
        int i12;
        O0 o7;
        boolean z6;
        O0 o8;
        p117w.m mVar3;
        int i13;
        boolean z7;
        Z.o oVar4;
        C0235q0 c0235q0T;
        c0230o.X(-202044027);
        int i14 = i3 | (c0230o.c(f6) ? 4 : 2);
        if ((i3 & 48) == 0) {
            i14 |= c0230o.h(cVar) ? 32 : 16;
        }
        int i15 = i6 & 4;
        if (i15 != 0) {
            i7 = i14 | 384;
            oVar2 = oVar;
        } else {
            oVar2 = oVar;
            i7 = i14 | (c0230o.f(oVar2) ? HueLog.LogComponent.STREAMDTLS : 128);
        }
        int i16 = i7 | 3072 | (c0230o.f(aVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        int i17 = i6 & 32;
        if (i17 != 0) {
            i9 = i16 | 196608;
            i8 = i;
        } else {
            i8 = i;
            i9 = i16 | (c0230o.d(i8) ? 131072 : 65536);
        }
        int i18 = i6 & 64;
        if (i18 == 0) {
            if ((i3 & 1572864) == 0) {
                aVar3 = aVar2;
                i9 |= c0230o.h(aVar3) ? 1048576 : 524288;
            }
            i10 = i9 | 104857600;
            if ((38347923 & i10) == 38347922 || !c0230o.B()) {
                c0230o.R();
                if ((i3 & 1) != 0 || c0230o.z()) {
                    if (i15 != 0) {
                        oVar3 = Z.l.f5957a;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i17 != 0) {
                        i8 = 0;
                    }
                    if (i18 != 0) {
                        aVar3 = null;
                    }
                    O0 o0F = U0.f(c0230o);
                    i11 = i10 & (-29360129);
                    c0230o.W(-1537043190);
                    objK = c0230o.K();
                    if (objK == C0222k.f3714a) {
                        objK = new p117w.m();
                        c0230o.f0(objK);
                    }
                    mVar2 = (p117w.m) objK;
                    c0230o.p(false);
                    i12 = i8;
                    o7 = o0F;
                    z6 = true;
                    oVar2 = oVar3;
                } else {
                    c0230o.P();
                    i11 = i10 & (-29360129);
                    z6 = z5;
                    mVar2 = mVar;
                    i12 = i8;
                    o7 = o6;
                }
                D4.a aVar4 = aVar3;
                c0230o.q();
                e(f6, cVar, oVar2, z6, aVar4, o7, mVar2, i12, V.b.b(c0230o, 308249025, new X0(mVar2, o7, z6, 2)), V.b.b(c0230o, -1843234110, new Y0(1, o7, z6)), aVar, c0230o, 1572864 | (i11 & 14) | 905969664 | (i11 & 112) | (i11 & 896) | 3072 | ((i11 >> 6) & 57344) | ((i11 << 6) & 29360128), (i11 >> 12) & 14);
                aVar3 = aVar4;
                o8 = o7;
                mVar3 = mVar2;
                i13 = i12;
                z7 = z6;
            } else {
                c0230o.P();
                z7 = z5;
                o8 = o6;
                mVar3 = mVar;
                i13 = i8;
            }
            oVar4 = oVar2;
            c0235q0T = c0230o.t();
            if (c0235q0T != null) {
                c0235q0T.f3780d = new C0129c1(f6, cVar, oVar4, z7, aVar, i13, aVar3, o8, mVar3, i3, i6);
            }
        }
        i9 |= 1572864;
        aVar3 = aVar2;
        i10 = i9 | 104857600;
        if ((38347923 & i10) == 38347922) {
            c0230o.R();
            if ((i3 & 1) != 0) {
                if (i15 != 0) {
                    oVar3 = Z.l.f5957a;
                } else {
                    oVar3 = oVar2;
                }
                if (i17 != 0) {
                    i8 = 0;
                }
                if (i18 != 0) {
                    aVar3 = null;
                }
                O0 o0F2 = U0.f(c0230o);
                i11 = i10 & (-29360129);
                c0230o.W(-1537043190);
                objK = c0230o.K();
                if (objK == C0222k.f3714a) {
                    objK = new p117w.m();
                    c0230o.f0(objK);
                }
                mVar2 = (p117w.m) objK;
                c0230o.p(false);
                i12 = i8;
                o7 = o0F2;
                z6 = true;
                oVar2 = oVar3;
            } else {
                if (i15 != 0) {
                    oVar3 = Z.l.f5957a;
                } else {
                    oVar3 = oVar2;
                }
                if (i17 != 0) {
                    i8 = 0;
                }
                if (i18 != 0) {
                    aVar3 = null;
                }
                O0 o0F3 = U0.f(c0230o);
                i11 = i10 & (-29360129);
                c0230o.W(-1537043190);
                objK = c0230o.K();
                if (objK == C0222k.f3714a) {
                    objK = new p117w.m();
                    c0230o.f0(objK);
                }
                mVar2 = (p117w.m) objK;
                c0230o.p(false);
                i12 = i8;
                o7 = o0F3;
                z6 = true;
                oVar2 = oVar3;
            }
            D4.a aVar5 = aVar3;
            c0230o.q();
            e(f6, cVar, oVar2, z6, aVar5, o7, mVar2, i12, V.b.b(c0230o, 308249025, new X0(mVar2, o7, z6, 2)), V.b.b(c0230o, -1843234110, new Y0(1, o7, z6)), aVar, c0230o, 1572864 | (i11 & 14) | 905969664 | (i11 & 112) | (i11 & 896) | 3072 | ((i11 >> 6) & 57344) | ((i11 << 6) & 29360128), (i11 >> 12) & 14);
            aVar3 = aVar5;
            o8 = o7;
            mVar3 = mVar2;
            i13 = i12;
            z7 = z6;
        } else {
            c0230o.R();
            if ((i3 & 1) != 0) {
                if (i15 != 0) {
                    oVar3 = Z.l.f5957a;
                } else {
                    oVar3 = oVar2;
                }
                if (i17 != 0) {
                    i8 = 0;
                }
                if (i18 != 0) {
                    aVar3 = null;
                }
                O0 o0F4 = U0.f(c0230o);
                i11 = i10 & (-29360129);
                c0230o.W(-1537043190);
                objK = c0230o.K();
                if (objK == C0222k.f3714a) {
                    objK = new p117w.m();
                    c0230o.f0(objK);
                }
                mVar2 = (p117w.m) objK;
                c0230o.p(false);
                i12 = i8;
                o7 = o0F4;
                z6 = true;
                oVar2 = oVar3;
            } else {
                if (i15 != 0) {
                    oVar3 = Z.l.f5957a;
                } else {
                    oVar3 = oVar2;
                }
                if (i17 != 0) {
                    i8 = 0;
                }
                if (i18 != 0) {
                    aVar3 = null;
                }
                O0 o0F5 = U0.f(c0230o);
                i11 = i10 & (-29360129);
                c0230o.W(-1537043190);
                objK = c0230o.K();
                if (objK == C0222k.f3714a) {
                    objK = new p117w.m();
                    c0230o.f0(objK);
                }
                mVar2 = (p117w.m) objK;
                c0230o.p(false);
                i12 = i8;
                o7 = o0F5;
                z6 = true;
                oVar2 = oVar3;
            }
            D4.a aVar6 = aVar3;
            c0230o.q();
            e(f6, cVar, oVar2, z6, aVar6, o7, mVar2, i12, V.b.b(c0230o, 308249025, new X0(mVar2, o7, z6, 2)), V.b.b(c0230o, -1843234110, new Y0(1, o7, z6)), aVar, c0230o, 1572864 | (i11 & 14) | 905969664 | (i11 & 112) | (i11 & 896) | 3072 | ((i11 >> 6) & 57344) | ((i11 << 6) & 29360128), (i11 >> 12) & 14);
            aVar3 = aVar6;
            o8 = o7;
            mVar3 = mVar2;
            i13 = i12;
            z7 = z6;
        }
        oVar4 = oVar2;
        c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0129c1(f6, cVar, oVar4, z7, aVar, i13, aVar3, o8, mVar3, i3, i6);
        }
    }

    public static final void g(C0188w1 c0188w1, Z.o oVar, boolean z5, O0 o6, p117w.m mVar, V.a aVar, V.a aVar2, C0230o c0230o, int i) {
        int i3;
        int i6;
        O0 o0F;
        O0 o7;
        c0230o.X(-1303883986);
        if ((i & 6) == 0) {
            i3 = (c0230o.f(c0188w1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c0230o.f(oVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c0230o.g(z5) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c0230o.f(mVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= c0230o.h(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= c0230o.h(aVar2) ? 1048576 : 524288;
        }
        if ((599187 & i3) == 599186 && c0230o.B()) {
            c0230o.P();
            o7 = o6;
        } else {
            c0230o.R();
            if ((i & 1) == 0 || c0230o.z()) {
                i6 = i3 & (-7169);
                o0F = U0.f(c0230o);
            } else {
                c0230o.P();
                i6 = i3 & (-7169);
                o0F = o6;
            }
            c0230o.q();
            if (c0188w1.f2953a < 0) {
                throw new IllegalArgumentException("steps should be >= 0");
            }
            int i7 = i6 >> 3;
            h(oVar, c0188w1, z5, mVar, aVar, aVar2, c0230o, (i6 & 896) | (i7 & 14) | ((i6 << 3) & 112) | (i7 & 7168) | (57344 & i7) | (i7 & 458752));
            o7 = o0F;
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new B.F(c0188w1, oVar, z5, o7, mVar, aVar, aVar2, i);
        }
    }

    public static final void h(Z.o oVar, C0188w1 c0188w1, boolean z5, p117w.m mVar, V.a aVar, V.a aVar2, C0230o c0230o, int i) {
        int i3;
        Z.l lVar;
        p111u4.d dVar;
        C0188w1 c0188w2;
        Z.o suspendPointerInputElement;
        C0188w1 c0188w3 = c0188w1;
        int i6 = 0;
        c0230o.X(1390990089);
        if ((i & 6) == 0) {
            i3 = (c0230o.f(oVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c0230o.f(c0188w3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c0230o.g(z5) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c0230o.f(mVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c0230o.h(aVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= c0230o.h(aVar2) ? 131072 : 65536;
        }
        int i7 = i3;
        if ((i7 & 74899) == 74898 && c0230o.B()) {
            c0230o.P();
        } else {
            c0188w3.f2960h = c0230o.k(AbstractC1124c0.f14372l) == S0.k.i;
            Z.l lVar2 = Z.l.f5957a;
            if (z5) {
                C0173r1 c0173r1 = new C0173r1(c0188w3, null);
                p091r0.i iVar = p091r0.u.f11534a;
                lVar = lVar2;
                dVar = null;
                c0188w2 = c0188w1;
                suspendPointerInputElement = new SuspendPointerInputElement(c0188w2, mVar, null, c0173r1, 4);
            } else {
                lVar = lVar2;
                dVar = null;
                c0188w2 = c0188w3;
                suspendPointerInputElement = lVar;
            }
            p112v.W w6 = p112v.W.i;
            boolean z6 = c0188w2.f2960h;
            boolean zBooleanValue = ((Boolean) c0188w2.f2961j.getValue()).booleanValue();
            c0230o.W(1114013383);
            int i8 = i7 & 112;
            boolean z7 = i8 == 32;
            Object objK = c0230o.K();
            N.U u6 = C0222k.f3714a;
            if (z7 || objK == u6) {
                objK = new C0141g1(c0188w2, dVar, i6);
                c0230o.f0(objK);
            }
            c0230o.p(false);
            Z.o oVar2 = suspendPointerInputElement;
            c0188w3 = c0188w2;
            Z.o oVarA = p112v.O.a(c0188w3, w6, z5, mVar, zBooleanValue, (D4.f) objK, z6, 32);
            N.W0 w7 = AbstractC0155l0.f2822a;
            Z.o oVarA2 = E0.i.a(androidx.compose.foundation.layout.c.g(oVar.k(MinimumInteractiveModifier.f6679a), M.q.f3280b, M.q.f3279a, 0.0f, 0.0f, 12), false, new C0168p1(i6, c0188w3, z5));
            float fH = c0188w3.f2956d.h();
            J4.a aVar3 = c0188w3.f2955c;
            Z.o oVarK = androidx.compose.foundation.c.a(E0.i.a(oVarA2, true, new p101t.n0(fH, new J4.a(aVar3.f1939a, aVar3.f1940b), c0188w3.f2953a)), z5, mVar).k(oVar2).k(oVarA);
            c0230o.W(1114014176);
            boolean z8 = i8 == 32;
            Object objK2 = c0230o.K();
            if (z8 || objK2 == u6) {
                objK2 = new C0038t0(2, c0188w3);
                c0230o.f0(objK2);
            }
            p113v0.F f6 = (p113v0.F) objK2;
            c0230o.p(false);
            c0230o.W(-1323940314);
            int i9 = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
            InterfaceC1102j.f14043g.getClass();
            C1106n c1106n = C1101i.f14038b;
            V.a aVarH = p113v0.U.h(oVarK);
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C1100h c1100h = C1101i.f14041e;
            C0208d.R(c1100h, c0230o, f6);
            C1100h c1100h2 = C1101i.f14040d;
            C0208d.R(c1100h2, c0230o, interfaceC0225l0M);
            C1100h c1100h3 = C1101i.f14042f;
            if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i9))) {
                p012c.k.y(i9, c0230o, i9, c1100h3);
            }
            AbstractC0013g0.p(0, aVarH, new N.C0(c0230o), c0230o, 2058660585);
            Z.l lVar3 = lVar;
            Z.o oVarC = androidx.compose.ui.layout.a.c(lVar3, P0.f2452h);
            c0230o.W(733328855);
            Z.g gVar = Z.b.f5933h;
            C1086t c1086tF = AbstractC1084q.f(gVar, false, c0230o, 0);
            c0230o.W(-1323940314);
            int i10 = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M2 = c0230o.m();
            V.a aVarH2 = p113v0.U.h(oVarC);
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C0208d.R(c1100h, c0230o, c1086tF);
            C0208d.R(c1100h2, c0230o, interfaceC0225l0M2);
            if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i10))) {
                p012c.k.y(i10, c0230o, i10, c1100h3);
            }
            AbstractC0013g0.p(0, aVarH2, new N.C0(c0230o), c0230o, 2058660585);
            int i11 = (i7 >> 3) & 14;
            aVar.c(c0188w3, c0230o, Integer.valueOf(((i7 >> 9) & 112) | i11));
            c0230o.p(false);
            c0230o.p(true);
            c0230o.p(false);
            c0230o.p(false);
            Z.o oVarC2 = androidx.compose.ui.layout.a.c(lVar3, P0.i);
            c0230o.W(733328855);
            C1086t c1086tF2 = AbstractC1084q.f(gVar, false, c0230o, 0);
            c0230o.W(-1323940314);
            int i12 = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M3 = c0230o.m();
            V.a aVarH3 = p113v0.U.h(oVarC2);
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
            aVar2.c(c0188w3, c0230o, Integer.valueOf(i11 | ((i7 >> 12) & 112)));
            c0230o.p(false);
            AbstractC0013g0.q(c0230o, true, false, false, false);
            c0230o.p(true);
            c0230o.p(false);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0138f1(oVar, c0188w3, z5, mVar, aVar, aVar2, i);
        }
    }

    public static final long i(float f6, float f7) {
        if ((Float.isNaN(f6) && Float.isNaN(f7)) || f6 <= f7) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
            int i = C0179t1.f2919c;
            return jFloatToRawIntBits;
        }
        throw new IllegalArgumentException(("start(" + f6 + ") must be <= endInclusive(" + f7 + ')').toString());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Serializable j(p091r0.y yVar, long j4, int i, p122w4.a aVar) {
        C0144h1 c0144h1;
        E4.t tVar;
        if (aVar instanceof C0144h1) {
            c0144h1 = (C0144h1) aVar;
            int i3 = c0144h1.f2776m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0144h1.f2776m = i3 - Integer.MIN_VALUE;
            } else {
                c0144h1 = new C0144h1(aVar);
            }
        } else {
            c0144h1 = new C0144h1(aVar);
        }
        C0144h1 c0144h2 = c0144h1;
        Object obj = c0144h2.f2775l;
        v4.a aVar2 = v4.a.f13292h;
        int i6 = c0144h2.f2776m;
        if (i6 == 0) {
            S1.V.O(obj);
            E4.t tVar2 = new E4.t();
            C0003b0 c0003b0 = new C0003b0(7, tVar2);
            c0144h2.f2774k = tVar2;
            c0144h2.f2776m = 1;
            Object objA = Q.a(yVar, j4, i, c0003b0, c0144h2);
            if (objA == aVar2) {
                return aVar2;
            }
            obj = objA;
            tVar = tVar2;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar = c0144h2.f2774k;
            S1.V.O(obj);
        }
        p091r0.q qVar = (p091r0.q) obj;
        if (qVar != null) {
            return new p084p4.h(qVar, new Float(tVar.f1071h));
        }
        return null;
    }

    public static final float k(float f6, float[] fArr, float f7, float f8) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f9 = fArr[0];
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f9);
            } else {
                float fAbs = Math.abs(S1.V.G(f7, f8, f9) - f6);
                J4.d dVar = new J4.d(1, length, 1);
                int i = dVar.f1942j;
                int i3 = dVar.i;
                boolean z5 = i <= 0 ? 1 >= i3 : 1 <= i3;
                int i6 = z5 ? 1 : i3;
                while (z5) {
                    if (i6 != i3) {
                        i6 += i;
                    } else {
                        if (!z5) {
                            throw new NoSuchElementException();
                        }
                        z5 = false;
                        i6 = i6;
                    }
                    float f10 = fArr[i6];
                    float fAbs2 = Math.abs(S1.V.G(f7, f8, f10) - f6);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        f9 = f10;
                        fAbs = fAbs2;
                    }
                }
                fValueOf = Float.valueOf(f9);
            }
        }
        return fValueOf != null ? S1.V.G(f7, f8, fValueOf.floatValue()) : f6;
    }

    public static final float l(float f6, float f7, float f8) {
        float f9 = f7 - f6;
        return p081p0.c.N(f9 == 0.0f ? 0.0f : (f8 - f6) / f9, 0.0f, 1.0f);
    }

    public static final float m(float f6, float f7, float f8, float f9, float f10) {
        return S1.V.G(f9, f10, l(f6, f7, f8));
    }
}
