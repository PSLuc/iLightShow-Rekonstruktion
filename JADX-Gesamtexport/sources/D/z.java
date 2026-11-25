package D;

import B.C0036s0;
import F.P;
import N.C0208d;
import N.C0217h0;
import N.U;
import p124x0.InterfaceC1103k;
import p124x0.InterfaceC1104l;
import p124x0.InterfaceC1108p;
import p124x0.Y;

/* JADX INFO: loaded from: classes.dex */
public final class z extends Z.n implements InterfaceC1103k, InterfaceC1108p, InterfaceC1104l {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0057g f711u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0036s0 f712v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public P f713w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0217h0 f714x = C0208d.K(null, U.f3673m);

    public z(C0057g c0057g, C0036s0 c0036s0, P p6) {
        this.f711u = c0057g;
        this.f712v = c0036s0;
        this.f713w = p6;
    }

    @Override // p124x0.InterfaceC1108p
    public final void A(Y y2) {
        this.f714x.setValue(y2);
    }

    @Override // Z.n
    public final void r0() {
        C0057g c0057g = this.f711u;
        if (c0057g.f687a != null) {
            throw new IllegalStateException("Expected textInputModifierNode to be null");
        }
        c0057g.f687a = this;
    }

    @Override // Z.n
    public final void s0() {
        this.f711u.k(this);
    }
}
