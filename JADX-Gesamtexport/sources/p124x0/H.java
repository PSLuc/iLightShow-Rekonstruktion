package p124x0;

import B.c1;
import D4.c;
import E4.k;
import O0.e;
import P.d;
import S0.a;
import S0.h;
import java.lang.reflect.InvocationTargetException;
import p015c2.AbstractC0473d;
import p090r.v;
import p096s.AbstractC0916i;
import p113v0.C1029l;
import p113v0.E;
import p113v0.N;
import p130y0.r;

/* JADX INFO: loaded from: classes.dex */
public final class H extends N implements E, InterfaceC1093a, S {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f13865A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Object f13867C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f13868D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ J f13869E;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13870m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f13874q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13875r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13876s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a f13877t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c f13879v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f13880w;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13871n = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13872o = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f13873p = 3;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f13878u = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final E f13881x = new E(this, 1);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d f13882y = new d(new H[16]);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f13883z = true;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f13866B = true;

    public H(J j4) {
        this.f13869E = j4;
        this.f13867C = j4.f13923r.f13904x;
    }

    @Override // p124x0.InterfaceC1093a
    public final void A() {
        d dVarU;
        int i;
        this.f13865A = true;
        E e6 = this.f13881x;
        e6.h();
        J j4 = this.f13869E;
        boolean z5 = j4.f13914h;
        D d6 = j4.f13907a;
        if (z5 && (i = (dVarU = d6.u()).f4583j) > 0) {
            Object[] objArr = dVarU.f4582h;
            int i3 = 0;
            do {
                D d7 = (D) objArr[i3];
                if (d7.f13829D.f13913g && d7.p() == 1) {
                    J j6 = d7.f13829D;
                    H h6 = j6.f13924s;
                    k.c(h6);
                    H h7 = j6.f13924s;
                    a aVar = h7 != null ? h7.f13877t : null;
                    k.c(aVar);
                    if (h6.v0(aVar.f4883a)) {
                        D.O(d6, false, 7);
                    }
                }
                i3++;
            } while (i3 < i);
        }
        C1110s c1110s = l().f14061R;
        k.c(c1110s);
        if (j4.i || (!this.f13874q && !c1110s.f13935o && j4.f13914h)) {
            j4.f13914h = false;
            int i6 = j4.f13909c;
            j4.f13909c = 4;
            f0 f0VarU = AbstractC1098f.u(d6);
            j4.g(false);
            h0 snapshotObserver = ((r) f0VarU).getSnapshotObserver();
            c1 c1Var = new c1(this, c1110s, j4, 3);
            snapshotObserver.getClass();
            if (d6.f13836j != null) {
                snapshotObserver.a(d6, snapshotObserver.f14036h, c1Var);
            } else {
                snapshotObserver.a(d6, snapshotObserver.f14033e, c1Var);
            }
            j4.f13909c = i6;
            if (j4.f13920o && c1110s.f13935o) {
                requestLayout();
            }
            j4.i = false;
        }
        if (e6.f13856d) {
            e6.f13857e = true;
        }
        if (e6.f13854b && e6.e()) {
            e6.g();
        }
        this.f13865A = false;
    }

    @Override // p124x0.InterfaceC1093a
    public final boolean D() {
        return this.f13880w;
    }

    @Override // p124x0.S
    public final void O(boolean z5) {
        N nK0;
        J j4 = this.f13869E;
        N nK1 = j4.a().K0();
        if (Boolean.valueOf(z5).equals(nK1 != null ? Boolean.valueOf(nK1.f13933m) : null) || (nK0 = j4.a().K0()) == null) {
            return;
        }
        nK0.f13933m = z5;
    }

    @Override // p113v0.E
    public final int U(int i) {
        s0();
        N nK0 = this.f13869E.a().K0();
        k.c(nK0);
        return nK0.U(i);
    }

    @Override // p124x0.InterfaceC1093a
    public final void X() {
        D.O(this.f13869E.f13907a, false, 7);
    }

    @Override // p113v0.E
    public final int Y(int i) {
        s0();
        N nK0 = this.f13869E.a().K0();
        k.c(nK0);
        return nK0.Y(i);
    }

    @Override // p113v0.E
    public final int Z(int i) {
        s0();
        N nK0 = this.f13869E.a().K0();
        k.c(nK0);
        return nK0.Z(i);
    }

    @Override // p124x0.InterfaceC1093a
    public final E b() {
        return this.f13881x;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    @Override // p113v0.E
    public final N c(long j4) {
        J j6 = this.f13869E;
        D dR = j6.f13907a.r();
        int i = dR != null ? dR.f13829D.f13909c : 0;
        int i3 = 2;
        D d6 = j6.f13907a;
        if (i == 2) {
            j6.f13908b = false;
        } else {
            D dR2 = d6.r();
            if ((dR2 != null ? dR2.f13829D.f13909c : 0) == 4) {
                j6.f13908b = false;
            }
        }
        D dR3 = d6.r();
        if (dR3 == null) {
            this.f13873p = 3;
        } else {
            if (this.f13873p != 3 && !d6.f13827B) {
                p027e3.a.y0("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw null;
            }
            J j7 = dR3.f13829D;
            int iD = AbstractC0916i.d(j7.f13909c);
            if (iD == 0 || iD == 1) {
                i3 = 1;
            } else if (iD != 2 && iD != 3) {
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(p012c.k.F(j7.f13909c)));
            }
            this.f13873p = i3;
        }
        if (d6.f13833L == 3) {
            d6.f();
        }
        v0(j4);
        return this;
    }

    @Override // p113v0.E
    public final int d(int i) {
        s0();
        N nK0 = this.f13869E.a().K0();
        k.c(nK0);
        return nK0.d(i);
    }

    @Override // p124x0.InterfaceC1093a
    public final void d0(v vVar) throws IllegalAccessException, InvocationTargetException {
        d dVarU = this.f13869E.f13907a.u();
        int i = dVarU.f4583j;
        if (i > 0) {
            Object[] objArr = dVarU.f4582h;
            int i3 = 0;
            do {
                H h6 = ((D) objArr[i3]).f13829D.f13924s;
                k.c(h6);
                vVar.invoke(h6);
                i3++;
            } while (i3 < i);
        }
    }

    @Override // p113v0.N
    public final int e0(C1029l c1029l) {
        J j4 = this.f13869E;
        D dR = j4.f13907a.r();
        int i = dR != null ? dR.f13829D.f13909c : 0;
        E e6 = this.f13881x;
        if (i == 2) {
            e6.f13855c = true;
        } else {
            D dR2 = j4.f13907a.r();
            if ((dR2 != null ? dR2.f13829D.f13909c : 0) == 4) {
                e6.f13856d = true;
            }
        }
        this.f13874q = true;
        N nK0 = j4.a().K0();
        k.c(nK0);
        int iE0 = nK0.e0(c1029l);
        this.f13874q = false;
        return iE0;
    }

    @Override // p113v0.N
    public final void h0(long j4, float f6, c cVar) {
        u0(j4, cVar);
    }

    @Override // p113v0.N, p113v0.E
    public final Object i() {
        return this.f13867C;
    }

    @Override // p124x0.InterfaceC1093a
    public final C1111t l() {
        return (C1111t) this.f13869E.f13907a.f13828C.f3793c;
    }

    public final void p0() {
        boolean z5 = this.f13880w;
        this.f13880w = true;
        J j4 = this.f13869E;
        if (!z5 && j4.f13913g) {
            D.O(j4.f13907a, true, 6);
        }
        d dVarU = j4.f13907a.u();
        int i = dVarU.f4583j;
        if (i > 0) {
            Object[] objArr = dVarU.f4582h;
            int i3 = 0;
            do {
                D d6 = (D) objArr[i3];
                if (d6.s() != Integer.MAX_VALUE) {
                    H h6 = d6.f13829D.f13924s;
                    k.c(h6);
                    h6.p0();
                    D.R(d6);
                }
                i3++;
            } while (i3 < i);
        }
    }

    public final void q0() {
        if (this.f13880w) {
            int i = 0;
            this.f13880w = false;
            d dVarU = this.f13869E.f13907a.u();
            int i3 = dVarU.f4583j;
            if (i3 > 0) {
                Object[] objArr = dVarU.f4582h;
                do {
                    H h6 = ((D) objArr[i]).f13829D.f13924s;
                    k.c(h6);
                    h6.q0();
                    i++;
                } while (i < i3);
            }
        }
    }

    @Override // p124x0.InterfaceC1093a
    public final InterfaceC1093a r() {
        J j4;
        D dR = this.f13869E.f13907a.r();
        if (dR == null || (j4 = dR.f13829D) == null) {
            return null;
        }
        return j4.f13924s;
    }

    public final void r0() {
        d dVarU;
        int i;
        J j4 = this.f13869E;
        if (j4.f13922q <= 0 || (i = (dVarU = j4.f13907a.u()).f4583j) <= 0) {
            return;
        }
        Object[] objArr = dVarU.f4582h;
        int i3 = 0;
        do {
            D d6 = (D) objArr[i3];
            J j6 = d6.f13829D;
            if ((j6.f13920o || j6.f13921p) && !j6.f13914h) {
                d6.N(false);
            }
            H h6 = j6.f13924s;
            if (h6 != null) {
                h6.r0();
            }
            i3++;
        } while (i3 < i);
    }

    @Override // p124x0.InterfaceC1093a
    public final void requestLayout() {
        this.f13869E.f13907a.N(false);
    }

    public final void s0() {
        int i;
        J j4 = this.f13869E;
        D.O(j4.f13907a, false, 7);
        D d6 = j4.f13907a;
        D dR = d6.r();
        if (dR == null || d6.f13833L != 3) {
            return;
        }
        int iD = AbstractC0916i.d(dR.f13829D.f13909c);
        if (iD != 0) {
            i = 2;
            if (iD != 2) {
                i = dR.f13833L;
            }
        } else {
            i = 1;
        }
        d6.f13833L = i;
    }

    public final void t0() {
        J j4;
        int i;
        this.f13868D = true;
        D dR = this.f13869E.f13907a.r();
        if (!this.f13880w) {
            p0();
            if (this.f13870m && dR != null) {
                dR.N(false);
            }
        }
        if (dR == null) {
            this.f13872o = 0;
        } else if (!this.f13870m && ((i = (j4 = dR.f13829D).f13909c) == 3 || i == 4)) {
            if (this.f13872o != Integer.MAX_VALUE) {
                p027e3.a.y0("Place was called on a node which was placed already");
                throw null;
            }
            int i3 = j4.f13915j;
            this.f13872o = i3;
            j4.f13915j = i3 + 1;
        }
        A();
    }

    public final void u0(long j4, c cVar) {
        J j6 = this.f13869E;
        if (j6.f13907a.f13832K) {
            p027e3.a.x0("place is called on a deactivated node");
            throw null;
        }
        j6.f13909c = 4;
        this.f13875r = true;
        this.f13868D = false;
        if (!h.a(j4, this.f13878u)) {
            if (j6.f13921p || j6.f13920o) {
                j6.f13914h = true;
            }
            r0();
        }
        D d6 = j6.f13907a;
        f0 f0VarU = AbstractC1098f.u(d6);
        if (j6.f13914h || !this.f13880w) {
            j6.f(false);
            this.f13881x.f13859g = false;
            h0 snapshotObserver = ((r) f0VarU).getSnapshotObserver();
            G g6 = new G(j6, f0VarU, j4);
            snapshotObserver.getClass();
            if (d6.f13836j != null) {
                snapshotObserver.a(d6, snapshotObserver.f14035g, g6);
            } else {
                snapshotObserver.a(d6, snapshotObserver.f14034f, g6);
            }
        } else {
            N nK0 = j6.a().K0();
            k.c(nK0);
            nK0.C0(h.c(j4, nK0.f13140l));
            t0();
        }
        this.f13878u = j4;
        this.f13879v = cVar;
        j6.f13909c = 5;
    }

    public final boolean v0(long j4) {
        J j6 = this.f13869E;
        D d6 = j6.f13907a;
        if (d6.f13832K) {
            p027e3.a.x0("measure is called on a deactivated node");
            throw null;
        }
        D dR = d6.r();
        D d7 = j6.f13907a;
        d7.f13827B = d7.f13827B || (dR != null && dR.f13827B);
        if (!d7.f13829D.f13913g) {
            a aVar = this.f13877t;
            if (aVar == null ? false : a.b(aVar.f4883a, j4)) {
                r rVar = d7.f13842p;
                if (rVar != null) {
                    rVar.f14467N.d(d7, true);
                }
                d7.S();
                return false;
            }
        }
        this.f13877t = new a(j4);
        o0(j4);
        this.f13881x.f13858f = false;
        d dVarU = d7.u();
        int i = dVarU.f4583j;
        if (i > 0) {
            Object[] objArr = dVarU.f4582h;
            int i3 = 0;
            do {
                H h6 = ((D) objArr[i3]).f13829D.f13924s;
                k.c(h6);
                h6.f13881x.f13855c = false;
                i3++;
            } while (i3 < i);
        }
        long jB = this.f13876s ? this.f13138j : AbstractC0473d.b(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f13876s = true;
        N nK0 = j6.a().K0();
        if (!(nK0 != null)) {
            p027e3.a.y0("Lookahead result from lookaheadRemeasure cannot be null");
            throw null;
        }
        j6.f13909c = 2;
        j6.f13913g = false;
        h0 snapshotObserver = ((r) AbstractC1098f.u(d7)).getSnapshotObserver();
        e eVar = new e(1, j4, j6);
        snapshotObserver.getClass();
        if (d7.f13836j != null) {
            snapshotObserver.a(d7, snapshotObserver.f14030b, eVar);
        } else {
            snapshotObserver.a(d7, snapshotObserver.f14031c, eVar);
        }
        j6.f13914h = true;
        j6.i = true;
        if (AbstractC1098f.o(d7)) {
            j6.f13911e = true;
            j6.f13912f = true;
        } else {
            j6.f13910d = true;
        }
        j6.f13909c = 5;
        n0(AbstractC0473d.b(nK0.f13137h, nK0.i));
        return (((int) (jB >> 32)) == nK0.f13137h && ((int) (4294967295L & jB)) == nK0.i) ? false : true;
    }
}
