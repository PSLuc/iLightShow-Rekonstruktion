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
import p113v0.N;
import p124x0.InterfaceC1114w;
import p124x0.M;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends n implements InterfaceC1114w {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f13727u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f13728v;

    @Override // p124x0.InterfaceC1114w
    public final int c(M m6, E e6, int i) {
        int iZ = e6.Z(i);
        int iH = !e.a(this.f13728v, Float.NaN) ? m6.H(this.f13728v) : 0;
        return iZ < iH ? iH : iZ;
    }

    @Override // p124x0.InterfaceC1114w
    public final int d(M m6, E e6, int i) {
        int iU = e6.U(i);
        int iH = !e.a(this.f13727u, Float.NaN) ? m6.H(this.f13727u) : 0;
        return iU < iH ? iH : iU;
    }

    @Override // p124x0.InterfaceC1114w
    public final G e(H h6, E e6, long j4) {
        int iJ;
        int i = 0;
        if (e.a(this.f13727u, Float.NaN) || a.j(j4) != 0) {
            iJ = a.j(j4);
        } else {
            iJ = h6.H(this.f13727u);
            int iH = a.h(j4);
            if (iJ > iH) {
                iJ = iH;
            }
            if (iJ < 0) {
                iJ = 0;
            }
        }
        int iH2 = a.h(j4);
        if (e.a(this.f13728v, Float.NaN) || a.i(j4) != 0) {
            i = a.i(j4);
        } else {
            int iH3 = h6.H(this.f13728v);
            int iG = a.g(j4);
            if (iH3 > iG) {
                iH3 = iG;
            }
            if (iH3 >= 0) {
                i = iH3;
            }
        }
        N nC = e6.c(c.t(iJ, iH2, i, a.g(j4)));
        return h6.u(nC.f13137h, nC.i, v.f11238h, new Y0(nC, 12));
    }

    @Override // p124x0.InterfaceC1114w
    public final int h(M m6, E e6, int i) {
        int iY = e6.Y(i);
        int iH = !e.a(this.f13727u, Float.NaN) ? m6.H(this.f13727u) : 0;
        return iY < iH ? iH : iY;
    }

    @Override // p124x0.InterfaceC1114w
    public final int i(M m6, E e6, int i) {
        int iD = e6.d(i);
        int iH = !e.a(this.f13728v, Float.NaN) ? m6.H(this.f13728v) : 0;
        return iD < iH ? iH : iD;
    }
}
