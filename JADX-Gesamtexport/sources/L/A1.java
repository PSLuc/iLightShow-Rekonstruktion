package L;

import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.C0233p0;
import N.C0247x;
import androidx.compose.foundation.BorderModifierNodeElement;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import p101t.C0952u;

/* JADX INFO: loaded from: classes.dex */
public abstract class A1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0247x f2159a = new C0247x(E.f2254o);

    public static final void a(Z.o oVar, p035g0.M m6, long j4, long j6, float f6, float f7, V.a aVar, C0230o c0230o, int i, int i3) {
        c0230o.W(-513881741);
        if ((i3 & 2) != 0) {
            m6 = p035g0.H.f9016a;
        }
        p035g0.M m7 = m6;
        long jB = (i3 & 8) != 0 ? F.b(j4, c0230o) : j6;
        float f8 = (i3 & 16) != 0 ? 0 : f6;
        float f9 = (i3 & 32) != 0 ? 0 : f7;
        C0247x c0247x = f2159a;
        float f10 = ((S0.e) c0230o.k(c0247x)).f4887h + f8;
        C0208d.b(new C0233p0[]{K.f2350a.a(new p035g0.r(jB)), c0247x.a(new S0.e(f10))}, V.b.b(c0230o, -70914509, new C0194y1(oVar, m7, j4, f10, null, f9, aVar)), c0230o, 48);
        c0230o.p(false);
    }

    public static final void b(D4.a aVar, Z.o oVar, boolean z5, p035g0.M m6, long j4, long j6, float f6, float f7, p117w.m mVar, V.a aVar2, C0230o c0230o, int i, int i3) {
        p117w.m mVar2;
        c0230o.W(-789752804);
        boolean z6 = (i3 & 4) != 0 ? true : z5;
        p035g0.M m7 = (i3 & 8) != 0 ? p035g0.H.f9016a : m6;
        long j7 = (i3 & 16) != 0 ? ((D) c0230o.k(F.f2265a)).f2225p : j4;
        long jB = (i3 & 32) != 0 ? F.b(j7, c0230o) : j6;
        float f8 = (i3 & 64) != 0 ? 0 : f6;
        float f9 = (i3 & 128) != 0 ? 0 : f7;
        if ((i3 & HueLog.LogComponent.APPCORE) != 0) {
            c0230o.W(-746940902);
            Object objK = c0230o.K();
            if (objK == C0222k.f3714a) {
                objK = new p117w.m();
                c0230o.f0(objK);
            }
            c0230o.p(false);
            mVar2 = (p117w.m) objK;
        } else {
            mVar2 = mVar;
        }
        C0247x c0247x = f2159a;
        float f10 = ((S0.e) c0230o.k(c0247x)).f4887h + f8;
        C0208d.b(new C0233p0[]{K.f2350a.a(new p035g0.r(jB)), c0247x.a(new S0.e(f10))}, V.b.b(c0230o, 1279702876, new C0197z1(oVar, m7, j7, f10, null, mVar2, z6, aVar, f9, aVar2)), c0230o, 48);
        c0230o.p(false);
    }

    public static final Z.o c(Z.o oVar, p035g0.M m6, long j4, C0952u c0952u, float f6) {
        Z.o borderModifierNodeElement;
        Z.o oVarB = androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, 0.0f, f6, 0.0f, m6, false, 124895);
        if (c0952u != null) {
            borderModifierNodeElement = new BorderModifierNodeElement(c0952u.f12432a, c0952u.f12433b, m6);
        } else {
            borderModifierNodeElement = Z.l.f5957a;
        }
        return com.fasterxml.jackson.databind.deser.std.d0.k(androidx.compose.foundation.a.b(oVarB.k(borderModifierNodeElement), j4, m6), m6);
    }

    public static final long d(long j4, float f6, C0230o c0230o) {
        c0230o.W(-2079918090);
        D d6 = (D) c0230o.k(F.f2265a);
        boolean zBooleanValue = ((Boolean) c0230o.k(F.f2266b)).booleanValue();
        if (p035g0.r.c(j4, d6.f2225p) && zBooleanValue) {
            j4 = F.g(d6, f6);
        }
        c0230o.p(false);
        return j4;
    }
}
