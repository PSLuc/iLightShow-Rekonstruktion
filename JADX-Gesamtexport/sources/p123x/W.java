package p123x;

import B.Y0;
import S0.a;
import S0.e;
import Z.n;
import p081p0.c;
import p089q4.v;
import p113v0.E;
import p113v0.G;
import p113v0.H;
import p113v0.InterfaceC1030m;
import p113v0.N;
import p124x0.InterfaceC1114w;
import p124x0.M;

/* JADX INFO: loaded from: classes.dex */
public final class W extends n implements InterfaceC1114w {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f13720u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f13721v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f13722w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f13723x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f13724y;

    @Override // p124x0.InterfaceC1114w
    public final int c(M m6, E e6, int i) {
        long jY0 = y0(m6);
        return a.e(jY0) ? a.g(jY0) : c.T(e6.Z(i), jY0);
    }

    @Override // p124x0.InterfaceC1114w
    public final int d(M m6, E e6, int i) {
        long jY0 = y0(m6);
        return a.f(jY0) ? a.h(jY0) : c.U(e6.U(i), jY0);
    }

    @Override // p124x0.InterfaceC1114w
    public final G e(H h6, E e6, long j4) {
        int iJ;
        int iH;
        int i;
        int iG;
        long jT;
        long jY0 = y0(h6);
        if (this.f13724y) {
            jT = c.S(j4, jY0);
        } else {
            if (e.a(this.f13720u, Float.NaN)) {
                iJ = a.j(j4);
                int iH2 = a.h(jY0);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = a.j(jY0);
            }
            if (e.a(this.f13722w, Float.NaN)) {
                iH = a.h(j4);
                int iJ2 = a.j(jY0);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = a.h(jY0);
            }
            if (e.a(this.f13721v, Float.NaN)) {
                i = a.i(j4);
                int iG2 = a.g(jY0);
                if (i > iG2) {
                    i = iG2;
                }
            } else {
                i = a.i(jY0);
            }
            if (e.a(this.f13723x, Float.NaN)) {
                iG = a.g(j4);
                int i3 = a.i(jY0);
                if (iG < i3) {
                    iG = i3;
                }
            } else {
                iG = a.g(jY0);
            }
            jT = c.t(iJ, iH, i, iG);
        }
        N nC = e6.c(jT);
        return h6.u(nC.f13137h, nC.i, v.f11238h, new Y0(nC, 11));
    }

    @Override // p124x0.InterfaceC1114w
    public final int h(M m6, E e6, int i) {
        long jY0 = y0(m6);
        return a.f(jY0) ? a.h(jY0) : c.U(e6.Y(i), jY0);
    }

    @Override // p124x0.InterfaceC1114w
    public final int i(M m6, E e6, int i) {
        long jY0 = y0(m6);
        return a.e(jY0) ? a.g(jY0) : c.T(e6.d(i), jY0);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    public final long y0(InterfaceC1030m interfaceC1030m) {
        int iH;
        int iH2;
        int iH3;
        int i = 0;
        if (e.a(this.f13722w, Float.NaN)) {
            iH = Integer.MAX_VALUE;
        } else {
            iH = interfaceC1030m.H(this.f13722w);
            if (iH < 0) {
                iH = 0;
            }
        }
        if (e.a(this.f13723x, Float.NaN)) {
            iH2 = Integer.MAX_VALUE;
        } else {
            iH2 = interfaceC1030m.H(this.f13723x);
            if (iH2 < 0) {
                iH2 = 0;
            }
        }
        if (e.a(this.f13720u, Float.NaN)) {
            iH3 = 0;
        } else {
            iH3 = interfaceC1030m.H(this.f13720u);
            if (iH3 > iH) {
                iH3 = iH;
            }
            if (iH3 < 0) {
                iH3 = 0;
            }
            if (iH3 == Integer.MAX_VALUE) {
                iH3 = 0;
            }
        }
        if (!e.a(this.f13721v, Float.NaN)) {
            int iH4 = interfaceC1030m.H(this.f13721v);
            if (iH4 > iH2) {
                iH4 = iH2;
            }
            if (iH4 < 0) {
                iH4 = 0;
            }
            if (iH4 != Integer.MAX_VALUE) {
                i = iH4;
            }
        }
        return c.t(iH3, iH, i, iH2);
    }
}
