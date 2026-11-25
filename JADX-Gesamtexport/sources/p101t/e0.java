package p101t;

import E0.h;
import F.V;
import F.W;
import N.C0208d;
import N.C0217h0;
import N.D;
import N.U;
import P4.AbstractC0336x;
import R4.b;
import R4.i;
import S0.g;
import S0.j;
import Z.n;
import android.view.View;
import android.widget.Magnifier;
import p015c2.AbstractC0473d;
import p030f0.c;
import p035g0.C0715p;
import p084p4.x;
import p124x0.AbstractC1098f;
import p124x0.F;
import p124x0.InterfaceC1107o;
import p124x0.InterfaceC1108p;
import p124x0.Y;
import p124x0.a0;
import p124x0.m0;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends n implements InterfaceC1108p, InterfaceC1107o, m0, a0 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public D f12314B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public j f12316D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public b f12317E;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public V f12318u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public W f12319v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public j0 f12320w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View f12321x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public S0.b f12322y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0715p f12323z;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0217h0 f12313A = C0208d.K(null, U.f3670j);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f12315C = 9205357640488583168L;

    public e0(V v6, W w6, j0 j0Var) {
        this.f12318u = v6;
        this.f12319v = w6;
        this.f12320w = j0Var;
    }

    @Override // p124x0.InterfaceC1108p
    public final void A(Y y2) {
        this.f12313A.setValue(y2);
    }

    public final void A0() {
        S0.b bVar = this.f12322y;
        if (bVar == null) {
            bVar = AbstractC1098f.s(this).f13850x;
            this.f12322y = bVar;
        }
        long j4 = ((c) this.f12318u.invoke(bVar)).f8837a;
        if (!p081p0.c.s0(j4) || !p081p0.c.s0(y0())) {
            this.f12315C = 9205357640488583168L;
            C0715p c0715p = this.f12323z;
            if (c0715p != null) {
                ((Magnifier) c0715p.i).dismiss();
                return;
            }
            return;
        }
        this.f12315C = c.h(y0(), j4);
        if (this.f12323z == null) {
            z0();
        }
        C0715p c0715p2 = this.f12323z;
        if (c0715p2 != null) {
            long j6 = this.f12315C;
            c0715p2.getClass();
            boolean zIsNaN = Float.isNaN(Float.NaN);
            Magnifier magnifier = (Magnifier) c0715p2.i;
            if (!zIsNaN) {
                magnifier.setZoom(Float.NaN);
            }
            if (p081p0.c.s0(9205357640488583168L)) {
                magnifier.show(c.d(j6), c.e(j6), c.d(9205357640488583168L), c.e(9205357640488583168L));
            } else {
                magnifier.show(c.d(j6), c.e(j6));
            }
        }
        B0();
    }

    public final void B0() {
        S0.b bVar;
        C0715p c0715p = this.f12323z;
        if (c0715p == null || (bVar = this.f12322y) == null) {
            return;
        }
        Magnifier magnifier = (Magnifier) c0715p.i;
        long jB = AbstractC0473d.b(magnifier.getWidth(), magnifier.getHeight());
        j jVar = this.f12316D;
        if (jVar != null && jB == jVar.f4896a) {
            return;
        }
        this.f12319v.invoke(new g(bVar.w(AbstractC0473d.U(AbstractC0473d.b(magnifier.getWidth(), magnifier.getHeight())))));
        this.f12316D = new j(AbstractC0473d.b(magnifier.getWidth(), magnifier.getHeight()));
    }

    @Override // p124x0.a0
    public final void D() {
        AbstractC1098f.p(this, new c0(this, 2));
    }

    @Override // p124x0.InterfaceC1107o
    public final void b(F f6) {
        f6.b();
        b bVar = this.f12317E;
        if (bVar != null) {
            bVar.j(x.f10867a);
        }
    }

    @Override // p124x0.m0
    public final void g0(h hVar) {
        hVar.i(f0.f12327a, new c0(this, 1));
    }

    @Override // Z.n
    public final void r0() {
        D();
        this.f12317E = i.a(0, 0, 7);
        AbstractC0336x.o(n0(), null, new d0(this, null), 3);
    }

    @Override // Z.n
    public final void s0() {
        C0715p c0715p = this.f12323z;
        if (c0715p != null) {
            ((Magnifier) c0715p.i).dismiss();
        }
        this.f12323z = null;
    }

    public final long y0() {
        if (this.f12314B == null) {
            this.f12314B = C0208d.C(new c0(this, 0));
        }
        D d6 = this.f12314B;
        if (d6 != null) {
            return ((c) d6.getValue()).f8837a;
        }
        return 9205357640488583168L;
    }

    public final void z0() {
        C0715p c0715p = this.f12323z;
        if (c0715p != null) {
            ((Magnifier) c0715p.i).dismiss();
        }
        View viewV = this.f12321x;
        if (viewV == null) {
            viewV = AbstractC1098f.v(this);
        }
        this.f12321x = viewV;
        S0.b bVar = this.f12322y;
        if (bVar == null) {
            bVar = AbstractC1098f.s(this).f13850x;
        }
        this.f12322y = bVar;
        this.f12320w.getClass();
        this.f12323z = new C0715p(27, new Magnifier(viewV));
        B0();
    }
}
