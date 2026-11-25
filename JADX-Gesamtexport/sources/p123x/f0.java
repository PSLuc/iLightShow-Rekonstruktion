package p123x;

import E4.l;
import S0.a;
import Z.n;
import p081p0.c;
import p089q4.v;
import p113v0.E;
import p113v0.G;
import p113v0.H;
import p113v0.N;
import p124x0.InterfaceC1114w;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends n implements InterfaceC1114w {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13772u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public l f13773v;

    @Override // p124x0.InterfaceC1114w
    public final G e(H h6, E e6, long j4) {
        N nC = e6.c(c.t(this.f13772u != 1 ? 0 : a.j(j4), a.h(j4), this.f13772u == 2 ? a.i(j4) : 0, a.g(j4)));
        int iO = c.O(nC.f13137h, a.j(j4), a.h(j4));
        int iO2 = c.O(nC.i, a.i(j4), a.g(j4));
        return h6.u(iO, iO2, v.f11238h, new e0(this, iO, nC, iO2, h6));
    }
}
