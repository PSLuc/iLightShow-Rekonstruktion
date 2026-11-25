package p123x;

import B.C0026n;
import Z.n;
import p081p0.c;
import p089q4.v;
import p113v0.E;
import p113v0.G;
import p113v0.H;
import p113v0.N;
import p124x0.InterfaceC1114w;

/* JADX INFO: loaded from: classes.dex */
public final class P extends n implements InterfaceC1114w {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public O f13712u;

    @Override // p124x0.InterfaceC1114w
    public final G e(H h6, E e6, long j4) {
        float f6 = 0;
        if (Float.compare(this.f13712u.b(h6.getLayoutDirection()), f6) < 0 || Float.compare(this.f13712u.d(), f6) < 0 || Float.compare(this.f13712u.c(h6.getLayoutDirection()), f6) < 0 || Float.compare(this.f13712u.a(), f6) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        int iH = h6.H(this.f13712u.c(h6.getLayoutDirection())) + h6.H(this.f13712u.b(h6.getLayoutDirection()));
        int iH2 = h6.H(this.f13712u.a()) + h6.H(this.f13712u.d());
        N nC = e6.c(c.w0(-iH, -iH2, j4));
        return h6.u(c.U(nC.f13137h + iH, j4), c.T(nC.i + iH2, j4), v.f11238h, new C0026n(nC, h6, this, 17));
    }
}
