package L;

import B.AbstractC0013g0;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.C0235q0;
import N.InterfaceC0225l0;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import okhttp3.internal.http2.Http2;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: renamed from: L.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0136f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f2714a = 280;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f2715b = 560;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p123x.O f2716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p123x.O f2717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p123x.O f2718e;

    static {
        float f6 = 24;
        f2716c = new p123x.O(f6, f6, f6, f6);
        float f7 = 16;
        androidx.compose.foundation.layout.a.b(f7);
        f2717d = androidx.compose.foundation.layout.a.b(f7);
        f2718e = androidx.compose.foundation.layout.a.b(f6);
    }

    public static final void a(V.a aVar, Z.l lVar, D4.e eVar, V.a aVar2, p035g0.M m6, long j4, float f6, long j6, long j7, long j8, long j9, C0230o c0230o, int i) {
        Z.l lVar2;
        c0230o.X(1522575799);
        int i3 = i | 48 | (c0230o.h(null) ? HueLog.LogComponent.STREAMDTLS : 128) | (c0230o.h(eVar) ? 2048 : 1024) | (c0230o.h(aVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (c0230o.f(m6) ? 131072 : 65536) | (c0230o.e(j4) ? 1048576 : 524288) | (c0230o.c(f6) ? 8388608 : 4194304) | (c0230o.e(j6) ? 67108864 : 33554432) | (c0230o.e(j7) ? 536870912 : 268435456);
        int i6 = (c0230o.e(j8) ? (char) 4 : (char) 2) | (c0230o.e(j9) ? ' ' : (char) 16);
        if ((i3 & 306783379) == 306783378 && (i6 & 19) == 18 && c0230o.B()) {
            c0230o.P();
            lVar2 = lVar;
        } else {
            Z.l lVar3 = Z.l.f5957a;
            int i7 = i3 >> 12;
            A1.a(lVar3, m6, j4, 0L, f6, 0.0f, V.b.b(c0230o, -2126308228, new C0127c(eVar, aVar2, j7, j8, j9, j6, aVar)), c0230o, (i7 & 896) | (i7 & 112) | 12582918 | ((i3 >> 9) & 57344), 104);
            lVar2 = lVar3;
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0130d(aVar, lVar2, eVar, aVar2, m6, j4, f6, j6, j7, j8, j9, i);
        }
    }

    public static final void b(V.a aVar, C0230o c0230o, int i) {
        float f6 = AbstractC0151k.f2807a;
        float f7 = AbstractC0151k.f2807a;
        c0230o.X(586821353);
        if ((i & 147) == 146 && c0230o.B()) {
            c0230o.P();
        } else {
            c0230o.W(-1133133582);
            Object objK = c0230o.K();
            if (objK == C0222k.f3714a) {
                objK = new C0133e();
                c0230o.f0(objK);
            }
            p113v0.F f8 = (p113v0.F) objK;
            c0230o.p(false);
            c0230o.W(-1323940314);
            Z.l lVar = Z.l.f5957a;
            int i3 = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
            InterfaceC1102j.f14043g.getClass();
            C1106n c1106n = C1101i.f14038b;
            V.a aVarH = p113v0.U.h(lVar);
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C0208d.R(C1101i.f14041e, c0230o, f8);
            C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M);
            C1100h c1100h = C1101i.f14042f;
            if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i3))) {
                p012c.k.y(i3, c0230o, i3, c1100h);
            }
            AbstractC0013g0.p(0, aVarH, new N.C0(c0230o), c0230o, 2058660585);
            aVar.d(c0230o, 6);
            c0230o.p(false);
            c0230o.p(true);
            c0230o.p(false);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0124b(aVar, i);
        }
    }
}
