package p123x;

import B.C0026n;
import Z.n;
import p081p0.c;
import p089q4.v;
import p113v0.E;
import p113v0.G;
import p113v0.H;
import p124x0.InterfaceC1114w;

/* JADX INFO: loaded from: classes.dex */
public final class N extends n implements InterfaceC1114w {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f13703u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f13704v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f13705w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f13706x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f13707y;

    @Override // p124x0.InterfaceC1114w
    public final G e(H h6, E e6, long j4) {
        int iH = h6.H(this.f13705w) + h6.H(this.f13703u);
        int iH2 = h6.H(this.f13706x) + h6.H(this.f13704v);
        p113v0.N nC = e6.c(c.w0(-iH, -iH2, j4));
        return h6.u(c.U(nC.f13137h + iH, j4), c.T(nC.i + iH2, j4), v.f11238h, new C0026n(this, nC, h6, 16));
    }
}
