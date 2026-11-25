package p019d0;

import B.Y0;
import S0.a;
import S1.h0;
import Z.c;
import Z.n;
import p015c2.AbstractC0473d;
import p030f0.f;
import p035g0.C0709j;
import p035g0.C0715p;
import p053k0.b;
import p089q4.v;
import p113v0.C1025h;
import p113v0.E;
import p113v0.G;
import p113v0.H;
import p113v0.N;
import p113v0.U;
import p124x0.F;
import p124x0.InterfaceC1107o;
import p124x0.InterfaceC1114w;
import p124x0.M;

/* JADX INFO: loaded from: classes.dex */
public final class h extends n implements InterfaceC1114w, InterfaceC1107o {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f8575u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f8576v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c f8577w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C1025h f8578x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f8579y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0709j f8580z;

    public static boolean A0(long j4) {
        if (f.a(j4, 9205357640488583168L)) {
            return false;
        }
        float fD = f.d(j4);
        return (Float.isInfinite(fD) || Float.isNaN(fD)) ? false : true;
    }

    public static boolean z0(long j4) {
        if (f.a(j4, 9205357640488583168L)) {
            return false;
        }
        float fB = f.b(j4);
        return (Float.isInfinite(fB) || Float.isNaN(fB)) ? false : true;
    }

    public final long B0(long j4) {
        boolean z5 = false;
        boolean z6 = a.d(j4) && a.c(j4);
        if (a.f(j4) && a.e(j4)) {
            z5 = true;
        }
        if ((!y0() && z6) || z5) {
            return a.a(j4, a.h(j4), 0, a.g(j4), 0, 10);
        }
        long jD = this.f8575u.d();
        long jF = h0.f(p081p0.c.U(A0(jD) ? Math.round(f.d(jD)) : a.j(j4), j4), p081p0.c.T(z0(jD) ? Math.round(f.b(jD)) : a.i(j4), j4));
        if (y0()) {
            long jF2 = h0.f(!A0(this.f8575u.d()) ? f.d(jF) : f.d(this.f8575u.d()), !z0(this.f8575u.d()) ? f.b(jF) : f.b(this.f8575u.d()));
            jF = (f.d(jF) == 0.0f || f.b(jF) == 0.0f) ? 0L : U.i(jF2, this.f8578x.a(jF2, jF));
        }
        return a.a(j4, p081p0.c.U(Math.round(f.d(jF)), j4), 0, p081p0.c.T(Math.round(f.b(jF)), j4), 0, 10);
    }

    @Override // p124x0.InterfaceC1107o
    public final void b(F f6) {
        long jD = this.f8575u.d();
        boolean zA0 = A0(jD);
        p044i0.b bVar = f6.f13862h;
        long jF = h0.f(zA0 ? f.d(jD) : f.d(bVar.f()), z0(jD) ? f.b(jD) : f.b(bVar.f()));
        long jI = (f.d(bVar.f()) == 0.0f || f.b(bVar.f()) == 0.0f) ? 0L : U.i(jF, this.f8578x.a(jF, bVar.f()));
        long jA = this.f8577w.a(AbstractC0473d.b(Math.round(f.d(jI)), Math.round(f.b(jI))), AbstractC0473d.b(Math.round(f.d(bVar.f())), Math.round(f.b(bVar.f()))), f6.getLayoutDirection());
        float f7 = (int) (jA >> 32);
        float f8 = (int) (jA & 4294967295L);
        ((C0715p) bVar.i.i).B(f7, f8);
        try {
            this.f8575u.c(f6, jI, this.f8579y, this.f8580z);
            ((C0715p) bVar.i.i).B(-f7, -f8);
            f6.b();
        } catch (Throwable th) {
            ((C0715p) bVar.i.i).B(-f7, -f8);
            throw th;
        }
    }

    @Override // p124x0.InterfaceC1114w
    public final int c(M m6, E e6, int i) {
        if (!y0()) {
            return e6.Z(i);
        }
        long jB0 = B0(p081p0.c.u(i, 0, 13));
        return Math.max(a.i(jB0), e6.Z(i));
    }

    @Override // p124x0.InterfaceC1114w
    public final int d(M m6, E e6, int i) {
        if (!y0()) {
            return e6.U(i);
        }
        long jB0 = B0(p081p0.c.u(0, i, 7));
        return Math.max(a.j(jB0), e6.U(i));
    }

    @Override // p124x0.InterfaceC1114w
    public final G e(H h6, E e6, long j4) {
        N nC = e6.c(B0(j4));
        return h6.u(nC.f13137h, nC.i, v.f11238h, new Y0(nC, 4));
    }

    @Override // p124x0.InterfaceC1114w
    public final int h(M m6, E e6, int i) {
        if (!y0()) {
            return e6.Y(i);
        }
        long jB0 = B0(p081p0.c.u(0, i, 7));
        return Math.max(a.j(jB0), e6.Y(i));
    }

    @Override // p124x0.InterfaceC1114w
    public final int i(M m6, E e6, int i) {
        if (!y0()) {
            return e6.d(i);
        }
        long jB0 = B0(p081p0.c.u(i, 0, 13));
        return Math.max(a.i(jB0), e6.d(i));
    }

    @Override // Z.n
    public final boolean o0() {
        return false;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f8575u + ", sizeToIntrinsics=" + this.f8576v + ", alignment=" + this.f8577w + ", alpha=" + this.f8579y + ", colorFilter=" + this.f8580z + ')';
    }

    public final boolean y0() {
        return this.f8576v && this.f8575u.d() != 9205357640488583168L;
    }
}
