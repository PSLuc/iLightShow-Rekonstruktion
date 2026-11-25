package p044i0;

import B.C0031p0;
import E4.k;
import O1.u;
import S0.b;
import S1.h0;
import android.graphics.Paint;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import p030f0.c;
import p030f0.f;
import p035g0.AbstractC0712m;
import p035g0.C0704e;
import p035g0.C0709j;
import p035g0.G;
import p035g0.H;
import p035g0.InterfaceC0714o;
import p035g0.O;
import p124x0.F;

/* JADX INFO: loaded from: classes.dex */
public interface d extends b {
    static void I(d dVar, C0704e c0704e, long j4, long j6, float f6, C0709j c0709j, int i, int i3) {
        dVar.E(c0704e, 0L, j4, 0L, (i3 & 16) != 0 ? j4 : j6, (i3 & 32) != 0 ? 1.0f : f6, c0709j, (i3 & HueLog.LogComponent.STREAMDTLS) != 0 ? 3 : 14, (i3 & HueLog.LogComponent.APPCORE) != 0 ? 1 : i);
    }

    static void W(F f6, O o6, long j4, long j6, long j7, e eVar, int i) {
        if ((i & 2) != 0) {
            j4 = 0;
        }
        long j8 = j4;
        f6.g(o6, j8, (i & 4) != 0 ? m0(f6.f13862h.f(), j8) : j6, j7, 1.0f, (i & 32) != 0 ? g.f9389a : eVar);
    }

    static /* synthetic */ void c0(d dVar, long j4, float f6, long j6, e eVar, int i) {
        if ((i & 4) != 0) {
            j6 = dVar.N();
        }
        long j7 = j6;
        if ((i & 16) != 0) {
            eVar = g.f9389a;
        }
        dVar.T(j4, f6, j7, eVar);
    }

    static /* synthetic */ void k0(d dVar, long j4, long j6, int i) {
        if ((i & 4) != 0) {
            j6 = m0(dVar.f(), 0L);
        }
        dVar.p(j4, 0L, j6, g.f9389a, (i & 64) != 0 ? 3 : 0);
    }

    static long m0(long j4, long j6) {
        return h0.f(f.d(j4) - c.d(j6), f.b(j4) - c.e(j6));
    }

    static void q(F f6, AbstractC0712m abstractC0712m, long j4, long j6, float f7, e eVar, int i) {
        if ((i & 2) != 0) {
            j4 = 0;
        }
        long j7 = j4;
        if ((i & 4) != 0) {
            j6 = m0(f6.f13862h.f(), j7);
        }
        f6.e(abstractC0712m, j7, j6, (i & 8) != 0 ? 1.0f : f7, (i & 16) != 0 ? g.f9389a : eVar);
    }

    static /* synthetic */ void t(d dVar, p035g0.F f6, AbstractC0712m abstractC0712m, float f7, h hVar, int i) {
        if ((i & 4) != 0) {
            f7 = 1.0f;
        }
        float f8 = f7;
        e eVar = hVar;
        if ((i & 8) != 0) {
            eVar = g.f9389a;
        }
        dVar.G(f6, abstractC0712m, f8, eVar, (i & 32) != 0 ? 3 : 0);
    }

    static void x(F f6, O o6, long j4, long j6, float f7, float f8, int i) {
        if ((i & 64) != 0) {
            f8 = 1.0f;
        }
        b bVar = f6.f13862h;
        InterfaceC0714o interfaceC0714o = bVar.f9385h.f9383c;
        u uVarG = bVar.f9387k;
        if (uVarG == null) {
            uVarG = H.g();
            uVarG.u(1);
            bVar.f9387k = uVarG;
        }
        o6.a(f8, bVar.f(), uVarG);
        if (!k.a((C0709j) uVarG.f4536d, null)) {
            uVarG.o(null);
        }
        if (uVarG.f4533a != 3) {
            uVarG.m(3);
        }
        Paint paint = (Paint) uVarG.f4534b;
        if (paint.getStrokeWidth() != f7) {
            uVarG.t(f7);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            ((Paint) uVarG.f4534b).setStrokeMiter(4.0f);
        }
        if (uVarG.h() != 0) {
            uVarG.r(0);
        }
        if (uVarG.i() != 0) {
            uVarG.s(0);
        }
        if (!paint.isFilterBitmap()) {
            uVarG.p(1);
        }
        interfaceC0714o.m(j4, j6, uVarG);
    }

    C0031p0 B();

    void E(C0704e c0704e, long j4, long j6, long j7, long j8, float f6, C0709j c0709j, int i, int i3);

    void G(p035g0.F f6, AbstractC0712m abstractC0712m, float f7, e eVar, int i);

    void L(long j4, long j6, long j7, float f6, int i);

    default long N() {
        return h0.n(B().l());
    }

    void R(G g6, float f6, long j4, e eVar);

    void T(long j4, float f6, long j6, e eVar);

    void a0(long j4, float f6, float f7, long j6, long j7, e eVar);

    default long f() {
        return B().l();
    }

    S0.k getLayoutDirection();

    void p(long j4, long j6, long j7, e eVar, int i);
}
