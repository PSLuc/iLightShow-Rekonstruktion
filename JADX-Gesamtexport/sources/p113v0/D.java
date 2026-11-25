package p113v0;

import E4.k;
import S0.h;
import S1.h0;
import p015c2.AbstractC0473d;
import p027e3.a;
import p030f0.c;
import p030f0.d;
import p124x0.N;
import p124x0.Y;

/* JADX INFO: loaded from: classes.dex */
public final class D implements InterfaceC1033p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final N f13131h;

    public D(N n6) {
        this.f13131h = n6;
    }

    @Override // p113v0.InterfaceC1033p
    public final long J(long j4) {
        return c.h(this.f13131h.f13939s.J(j4), a());
    }

    @Override // p113v0.InterfaceC1033p
    public final boolean K() {
        return this.f13131h.f13939s.M0().f5969t;
    }

    @Override // p113v0.InterfaceC1033p
    public final void M(float[] fArr) {
        this.f13131h.f13939s.M(fArr);
    }

    @Override // p113v0.InterfaceC1033p
    public final long P() {
        N n6 = this.f13131h;
        return AbstractC0473d.b(n6.f13137h, n6.i);
    }

    @Override // p113v0.InterfaceC1033p
    public final long Q(long j4) {
        return this.f13131h.f13939s.Q(c.h(j4, a()));
    }

    public final long a() {
        N n6 = this.f13131h;
        N nG = U.g(n6);
        return c.g(b(nG.f13942v, 0L), n6.f13939s.U0(nG.f13939s, 0L));
    }

    public final long b(InterfaceC1033p interfaceC1033p, long j4) {
        boolean z5 = interfaceC1033p instanceof D;
        N n6 = this.f13131h;
        if (!z5) {
            N nG = U.g(n6);
            long jB = b(nG.f13942v, j4);
            Y y2 = nG.f13939s;
            y2.getClass();
            return c.h(jB, y2.U0(interfaceC1033p, 0L));
        }
        N n7 = ((D) interfaceC1033p).f13131h;
        n7.f13939s.V0();
        N nK0 = n6.f13939s.I0(n7.f13939s).K0();
        if (nK0 != null) {
            long jB2 = h.b(h.c(n7.D0(nK0, false), h0.w(j4)), n6.D0(nK0, false));
            return p081p0.c.y((int) (jB2 >> 32), (int) (jB2 & 4294967295L));
        }
        N nG2 = U.g(n7);
        long jC = h.c(h.c(n7.D0(nG2, false), nG2.f13940t), h0.w(j4));
        N nG3 = U.g(n6);
        long jB3 = h.b(jC, h.c(n6.D0(nG3, false), nG3.f13940t));
        long jY = p081p0.c.y((int) (jB3 >> 32), (int) (jB3 & 4294967295L));
        Y y6 = nG3.f13939s.f13991u;
        k.c(y6);
        Y y7 = nG2.f13939s.f13991u;
        k.c(y7);
        return y6.U0(y7, jY);
    }

    @Override // p113v0.InterfaceC1033p
    public final long e(long j4) {
        return c.h(this.f13131h.f13939s.e(j4), a());
    }

    @Override // p113v0.InterfaceC1033p
    public final void g(InterfaceC1033p interfaceC1033p, float[] fArr) {
        this.f13131h.f13939s.g(interfaceC1033p, fArr);
    }

    @Override // p113v0.InterfaceC1033p
    public final long h(long j4) {
        return this.f13131h.f13939s.h(c.h(j4, a()));
    }

    @Override // p113v0.InterfaceC1033p
    public final InterfaceC1033p j() {
        N nK0;
        if (!K()) {
            a.y0("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        Y y2 = ((Y) this.f13131h.f13939s.f13989s.f13828C.f3794d).f13991u;
        if (y2 == null || (nK0 = y2.K0()) == null) {
            return null;
        }
        return nK0.f13942v;
    }

    @Override // p113v0.InterfaceC1033p
    public final long k(InterfaceC1033p interfaceC1033p, long j4) {
        return b(interfaceC1033p, j4);
    }

    @Override // p113v0.InterfaceC1033p
    public final d o(InterfaceC1033p interfaceC1033p, boolean z5) {
        return this.f13131h.f13939s.o(interfaceC1033p, z5);
    }
}
