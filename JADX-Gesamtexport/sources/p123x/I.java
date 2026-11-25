package p123x;

import B.Y0;
import S0.a;
import S1.V;
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
public final class I extends n implements InterfaceC1114w {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13692u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f13693v;

    @Override // p124x0.InterfaceC1114w
    public final int c(M m6, E e6, int i) {
        return e6.Z(i);
    }

    @Override // p124x0.InterfaceC1114w
    public final int d(M m6, E e6, int i) {
        return this.f13692u == 1 ? e6.U(i) : e6.Y(i);
    }

    @Override // p124x0.InterfaceC1114w
    public final G e(H h6, E e6, long j4) {
        int iU = this.f13692u == 1 ? e6.U(a.g(j4)) : e6.Y(a.g(j4));
        if (iU < 0) {
            iU = 0;
        }
        if (iU >= 0) {
            long jW = c.W(iU, iU, 0, Integer.MAX_VALUE);
            if (this.f13693v) {
                jW = c.S(j4, jW);
            }
            N nC = e6.c(jW);
            return h6.u(nC.f13137h, nC.i, v.f11238h, new Y0(nC, 10));
        }
        V.N("width(" + iU + ") must be >= 0");
        throw null;
    }

    @Override // p124x0.InterfaceC1114w
    public final int h(M m6, E e6, int i) {
        return this.f13692u == 1 ? e6.U(i) : e6.Y(i);
    }

    @Override // p124x0.InterfaceC1114w
    public final int i(M m6, E e6, int i) {
        return e6.d(i);
    }
}
