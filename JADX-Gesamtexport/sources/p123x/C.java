package p123x;

import B.Y0;
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
public final class C extends n implements InterfaceC1114w {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13677u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f13678v;

    @Override // p124x0.InterfaceC1114w
    public final G e(H h6, E e6, long j4) {
        int iJ;
        int iH;
        int i;
        int iG;
        if (!a.d(j4) || this.f13677u == 1) {
            iJ = a.j(j4);
            iH = a.h(j4);
        } else {
            iJ = c.O(Math.round(a.h(j4) * this.f13678v), a.j(j4), a.h(j4));
            iH = iJ;
        }
        if (!a.c(j4) || this.f13677u == 2) {
            i = a.i(j4);
            iG = a.g(j4);
        } else {
            i = c.O(Math.round(a.g(j4) * this.f13678v), a.i(j4), a.g(j4));
            iG = i;
        }
        N nC = e6.c(c.t(iJ, iH, i, iG));
        return h6.u(nC.f13137h, nC.i, v.f11238h, new Y0(nC, 9));
    }
}
