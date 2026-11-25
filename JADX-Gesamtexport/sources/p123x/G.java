package p123x;

import E4.k;
import N.C0208d;
import N.C0217h0;
import N.U;
import Z.m;
import p089q4.v;
import p113v0.E;
import p113v0.H;
import p113v0.N;
import p113v0.r;
import p118w0.c;
import p118w0.f;

/* JADX INFO: loaded from: classes.dex */
public final class G implements r, c, m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f13685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0217h0 f13686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0217h0 f13687c;

    public G(K k3) {
        this.f13685a = k3;
        U u6 = U.f3673m;
        this.f13686b = C0208d.K(k3, u6);
        this.f13687c = C0208d.K(k3, u6);
    }

    @Override // p113v0.r
    public final p113v0.G e(H h6, E e6, long j4) {
        C0217h0 c0217h0 = this.f13686b;
        int iA = ((a0) c0217h0.getValue()).a(h6, h6.getLayoutDirection());
        int iC = ((a0) c0217h0.getValue()).c(h6);
        int iB = ((a0) c0217h0.getValue()).b(h6, h6.getLayoutDirection()) + iA;
        int iD = ((a0) c0217h0.getValue()).d(h6) + iC;
        N nC = e6.c(p081p0.c.w0(-iB, -iD, j4));
        return h6.u(p081p0.c.U(nC.f13137h + iB, j4), p081p0.c.T(nC.i + iD, j4), v.f11238h, new C.c(nC, iA, iC, 3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof G) {
            return k.a(((G) obj).f13685a, this.f13685a);
        }
        return false;
    }

    @Override // p118w0.c
    public final void g(f fVar) {
        a0 a0Var = (a0) fVar.g(d0.f13765a);
        K k3 = this.f13685a;
        this.f13686b.setValue(new B(k3, a0Var));
        this.f13687c.setValue(new X(a0Var, k3));
    }

    public final int hashCode() {
        return this.f13685a.hashCode();
    }
}
