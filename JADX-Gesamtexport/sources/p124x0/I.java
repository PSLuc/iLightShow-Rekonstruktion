package p124x0;

import B.C0024m;
import D4.c;
import E4.k;
import N.C0237s;
import P.d;
import S0.h;
import S0.j;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import p015c2.AbstractC0473d;
import p027e3.a;
import p090r.v;
import p096s.AbstractC0916i;
import p113v0.C1029l;
import p113v0.E;
import p113v0.M;
import p113v0.N;
import p130y0.r;

/* JADX INFO: loaded from: classes.dex */
public final class I extends N implements E, InterfaceC1093a, S {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f13887D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f13889F;
    public boolean G;
    public c H;
    public float J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final C0024m f13890K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f13891L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final /* synthetic */ J f13892M;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13893m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f13896p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f13897q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13899s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f13901u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f13902v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f13904x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f13905y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f13906z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13894n = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13895o = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13898r = 3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f13900t = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f13903w = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final E f13884A = new E(this, 0);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final d f13885B = new d(new I[16]);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f13886C = true;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final p058l0.I f13888E = new p058l0.I(13, this);
    public long I = 0;

    public I(J j4) {
        this.f13892M = j4;
        this.f13890K = new C0024m(j4, 14, this);
    }

    @Override // p124x0.InterfaceC1093a
    public final void A() {
        d dVarU;
        int i;
        this.f13887D = true;
        E e6 = this.f13884A;
        e6.h();
        J j4 = this.f13892M;
        boolean z5 = j4.f13911e;
        D d6 = j4.f13907a;
        if (z5 && (i = (dVarU = d6.u()).f4583j) > 0) {
            Object[] objArr = dVarU.f4582h;
            int i3 = 0;
            do {
                D d7 = (D) objArr[i3];
                J j6 = d7.f13829D;
                if (j6.f13910d && j6.f13923r.f13898r == 1 && D.K(d7)) {
                    D.Q(d6, false, 7);
                }
                i3++;
            } while (i3 < i);
        }
        if (j4.f13912f || (!this.f13899s && !l().f13935o && j4.f13911e)) {
            j4.f13911e = false;
            int i6 = j4.f13909c;
            j4.f13909c = 3;
            j4.e(false);
            h0 snapshotObserver = ((r) AbstractC1098f.u(d6)).getSnapshotObserver();
            snapshotObserver.a(d6, snapshotObserver.f14033e, this.f13888E);
            j4.f13909c = i6;
            if (l().f13935o && j4.f13917l) {
                requestLayout();
            }
            j4.f13912f = false;
        }
        if (e6.f13856d) {
            e6.f13857e = true;
        }
        if (e6.f13854b && e6.e()) {
            e6.g();
        }
        this.f13887D = false;
    }

    @Override // p124x0.InterfaceC1093a
    public final boolean D() {
        return this.f13905y;
    }

    @Override // p124x0.S
    public final void O(boolean z5) {
        J j4 = this.f13892M;
        boolean z6 = j4.a().f13933m;
        if (z5 != z6) {
            j4.a().f13933m = z6;
            this.f13891L = true;
        }
    }

    @Override // p113v0.E
    public final int U(int i) {
        t0();
        return this.f13892M.a().U(i);
    }

    @Override // p124x0.InterfaceC1093a
    public final void X() {
        D.Q(this.f13892M.f13907a, false, 7);
    }

    @Override // p113v0.E
    public final int Y(int i) {
        t0();
        return this.f13892M.a().Y(i);
    }

    @Override // p113v0.E
    public final int Z(int i) {
        t0();
        return this.f13892M.a().Z(i);
    }

    @Override // p124x0.InterfaceC1093a
    public final E b() {
        return this.f13884A;
    }

    @Override // p113v0.E
    public final N c(long j4) {
        int i;
        J j6 = this.f13892M;
        D d6 = j6.f13907a;
        if (d6.f13833L == 3) {
            d6.f();
        }
        D d7 = j6.f13907a;
        if (AbstractC1098f.o(d7)) {
            H h6 = j6.f13924s;
            k.c(h6);
            h6.f13873p = 3;
            h6.c(j4);
        }
        D dR = d7.r();
        if (dR == null) {
            this.f13898r = 3;
        } else {
            if (this.f13898r != 3 && !d7.f13827B) {
                a.y0("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw null;
            }
            J j7 = dR.f13829D;
            int iD = AbstractC0916i.d(j7.f13909c);
            if (iD != 0) {
                i = 2;
                if (iD != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(p012c.k.F(j7.f13909c)));
                }
            } else {
                i = 1;
            }
            this.f13898r = i;
        }
        w0(j4);
        return this;
    }

    @Override // p113v0.E
    public final int d(int i) {
        t0();
        return this.f13892M.a().d(i);
    }

    @Override // p124x0.InterfaceC1093a
    public final void d0(v vVar) throws IllegalAccessException, InvocationTargetException {
        d dVarU = this.f13892M.f13907a.u();
        int i = dVarU.f4583j;
        if (i > 0) {
            Object[] objArr = dVarU.f4582h;
            int i3 = 0;
            do {
                vVar.invoke(((D) objArr[i3]).f13829D.f13923r);
                i3++;
            } while (i3 < i);
        }
    }

    @Override // p113v0.N
    public final int e0(C1029l c1029l) {
        J j4 = this.f13892M;
        D dR = j4.f13907a.r();
        int i = dR != null ? dR.f13829D.f13909c : 0;
        E e6 = this.f13884A;
        if (i == 1) {
            e6.f13855c = true;
        } else {
            D dR2 = j4.f13907a.r();
            if ((dR2 != null ? dR2.f13829D.f13909c : 0) == 3) {
                e6.f13856d = true;
            }
        }
        this.f13899s = true;
        int iE0 = j4.a().e0(c1029l);
        this.f13899s = false;
        return iE0;
    }

    @Override // p113v0.N
    public final void h0(long j4, float f6, c cVar) {
        M placementScope;
        this.f13906z = true;
        boolean zA = h.a(j4, this.f13900t);
        J j6 = this.f13892M;
        if (!zA || this.f13891L) {
            if (j6.f13918m || j6.f13917l || this.f13891L) {
                j6.f13911e = true;
                this.f13891L = false;
            }
            s0();
        }
        if (AbstractC1098f.o(j6.f13907a)) {
            Y y2 = j6.a().f13991u;
            D d6 = j6.f13907a;
            if (y2 == null || (placementScope = y2.f13936p) == null) {
                placementScope = ((r) AbstractC1098f.u(d6)).getPlacementScope();
            }
            H h6 = j6.f13924s;
            k.c(h6);
            D dR = d6.r();
            if (dR != null) {
                dR.f13829D.f13915j = 0;
            }
            h6.f13872o = Integer.MAX_VALUE;
            M.d(placementScope, h6, (int) (j4 >> 32), (int) (4294967295L & j4));
        }
        H h7 = j6.f13924s;
        if (h7 == null || h7.f13875r) {
            v0(j4, f6, cVar);
        } else {
            a.y0("Error: Placement happened before lookahead.");
            throw null;
        }
    }

    @Override // p113v0.N, p113v0.E
    public final Object i() {
        return this.f13904x;
    }

    @Override // p124x0.InterfaceC1093a
    public final C1111t l() {
        return (C1111t) this.f13892M.f13907a.f13828C.f3793c;
    }

    public final List p0() {
        J j4 = this.f13892M;
        j4.f13907a.X();
        boolean z5 = this.f13886C;
        d dVar = this.f13885B;
        if (!z5) {
            return dVar.h();
        }
        D d6 = j4.f13907a;
        d dVarU = d6.u();
        int i = dVarU.f4583j;
        if (i > 0) {
            Object[] objArr = dVarU.f4582h;
            int i3 = 0;
            do {
                D d7 = (D) objArr[i3];
                if (dVar.f4583j <= i3) {
                    dVar.c(d7.f13829D.f13923r);
                } else {
                    I i6 = d7.f13829D.f13923r;
                    Object[] objArr2 = dVar.f4582h;
                    Object obj = objArr2[i3];
                    objArr2[i3] = i6;
                }
                i3++;
            } while (i3 < i);
        }
        dVar.q(((P.a) d6.m()).f4578h.f4583j, dVar.f4583j);
        this.f13886C = false;
        return dVar.h();
    }

    public final void q0() {
        boolean z5 = this.f13905y;
        this.f13905y = true;
        D d6 = this.f13892M.f13907a;
        if (!z5) {
            J j4 = d6.f13829D;
            if (j4.f13910d) {
                D.Q(d6, true, 6);
            } else if (j4.f13913g) {
                D.O(d6, true, 6);
            }
        }
        C0237s c0237s = d6.f13828C;
        Y y2 = ((C1111t) c0237s.f3793c).f13990t;
        for (Y y6 = (Y) c0237s.f3794d; !k.a(y6, y2) && y6 != null; y6 = y6.f13990t) {
            if (y6.J) {
                y6.S0();
            }
        }
        d dVarU = d6.u();
        int i = dVarU.f4583j;
        if (i > 0) {
            Object[] objArr = dVarU.f4582h;
            int i3 = 0;
            do {
                D d7 = (D) objArr[i3];
                if (d7.s() != Integer.MAX_VALUE) {
                    d7.f13829D.f13923r.q0();
                    D.R(d7);
                }
                i3++;
            } while (i3 < i);
        }
    }

    @Override // p124x0.InterfaceC1093a
    public final InterfaceC1093a r() {
        J j4;
        D dR = this.f13892M.f13907a.r();
        if (dR == null || (j4 = dR.f13829D) == null) {
            return null;
        }
        return j4.f13923r;
    }

    public final void r0() {
        if (this.f13905y) {
            int i = 0;
            this.f13905y = false;
            J j4 = this.f13892M;
            C0237s c0237s = j4.f13907a.f13828C;
            Y y2 = ((C1111t) c0237s.f3793c).f13990t;
            for (Y y6 = (Y) c0237s.f3794d; !k.a(y6, y2) && y6 != null; y6 = y6.f13990t) {
                if (y6.f13988K != null) {
                    y6.h1(null, false);
                    y6.f13989s.P(false);
                }
            }
            d dVarU = j4.f13907a.u();
            int i3 = dVarU.f4583j;
            if (i3 > 0) {
                Object[] objArr = dVarU.f4582h;
                do {
                    ((D) objArr[i]).f13829D.f13923r.r0();
                    i++;
                } while (i < i3);
            }
        }
    }

    @Override // p124x0.InterfaceC1093a
    public final void requestLayout() {
        this.f13892M.f13907a.P(false);
    }

    public final void s0() {
        d dVarU;
        int i;
        J j4 = this.f13892M;
        if (j4.f13919n <= 0 || (i = (dVarU = j4.f13907a.u()).f4583j) <= 0) {
            return;
        }
        Object[] objArr = dVarU.f4582h;
        int i3 = 0;
        do {
            D d6 = (D) objArr[i3];
            J j6 = d6.f13829D;
            if ((j6.f13917l || j6.f13918m) && !j6.f13911e) {
                d6.P(false);
            }
            j6.f13923r.s0();
            i3++;
        } while (i3 < i);
    }

    public final void t0() {
        int i;
        J j4 = this.f13892M;
        D.Q(j4.f13907a, false, 7);
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

    public final void u0() {
        this.G = true;
        J j4 = this.f13892M;
        D dR = j4.f13907a.r();
        float f6 = l().f13986E;
        C0237s c0237s = j4.f13907a.f13828C;
        Y y2 = (Y) c0237s.f3794d;
        while (y2 != ((C1111t) c0237s.f3793c)) {
            k.d("null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator", y2);
            C1116y c1116y = (C1116y) y2;
            f6 += c1116y.f13986E;
            y2 = c1116y.f13990t;
        }
        if (f6 != this.f13889F) {
            this.f13889F = f6;
            if (dR != null) {
                dR.I();
            }
            if (dR != null) {
                dR.x();
            }
        }
        if (!this.f13905y) {
            if (dR != null) {
                dR.x();
            }
            q0();
            if (this.f13893m && dR != null) {
                dR.P(false);
            }
        }
        if (dR == null) {
            this.f13895o = 0;
        } else if (!this.f13893m) {
            J j6 = dR.f13829D;
            if (j6.f13909c == 3) {
                if (this.f13895o != Integer.MAX_VALUE) {
                    a.y0("Place was called on a node which was placed already");
                    throw null;
                }
                int i = j6.f13916k;
                this.f13895o = i;
                j6.f13916k = i + 1;
            }
        }
        A();
    }

    public final void v0(long j4, float f6, c cVar) {
        J j6 = this.f13892M;
        D d6 = j6.f13907a;
        if (d6.f13832K) {
            a.x0("place is called on a deactivated node");
            throw null;
        }
        j6.f13909c = 3;
        this.f13900t = j4;
        this.f13902v = f6;
        this.f13901u = cVar;
        this.f13897q = true;
        this.G = false;
        f0 f0VarU = AbstractC1098f.u(d6);
        if (j6.f13911e || !this.f13905y) {
            this.f13884A.f13859g = false;
            j6.d(false);
            this.H = cVar;
            this.I = j4;
            this.J = f6;
            h0 snapshotObserver = ((r) f0VarU).getSnapshotObserver();
            snapshotObserver.a(j6.f13907a, snapshotObserver.f14034f, this.f13890K);
        } else {
            Y yA = j6.a();
            yA.Z0(h.c(j4, yA.f13140l), f6, cVar);
            u0();
        }
        j6.f13909c = 5;
    }

    public final boolean w0(long j4) {
        J j6 = this.f13892M;
        D d6 = j6.f13907a;
        if (d6.f13832K) {
            a.x0("measure is called on a deactivated node");
            throw null;
        }
        f0 f0VarU = AbstractC1098f.u(d6);
        D d7 = j6.f13907a;
        D dR = d7.r();
        boolean z5 = true;
        d7.f13827B = d7.f13827B || (dR != null && dR.f13827B);
        if (!d7.f13829D.f13910d && S0.a.b(this.f13139k, j4)) {
            ((r) f0VarU).f14467N.d(d7, false);
            d7.S();
            return false;
        }
        this.f13884A.f13858f = false;
        d dVarU = d7.u();
        int i = dVarU.f4583j;
        if (i > 0) {
            Object[] objArr = dVarU.f4582h;
            int i3 = 0;
            do {
                ((D) objArr[i3]).f13829D.f13923r.f13884A.f13855c = false;
                i3++;
            } while (i3 < i);
        }
        this.f13896p = true;
        long j7 = j6.a().f13138j;
        o0(j4);
        if (j6.f13909c != 5) {
            a.y0("layout state is not idle before measure starts");
            throw null;
        }
        j6.f13909c = 1;
        j6.f13910d = false;
        j6.f13925t = j4;
        h0 snapshotObserver = ((r) AbstractC1098f.u(d7)).getSnapshotObserver();
        snapshotObserver.a(d7, snapshotObserver.f14031c, j6.f13926u);
        if (j6.f13909c == 1) {
            j6.f13911e = true;
            j6.f13912f = true;
            j6.f13909c = 5;
        }
        if (j.a(j6.a().f13138j, j7) && j6.a().f13137h == this.f13137h && j6.a().i == this.i) {
            z5 = false;
        }
        n0(AbstractC0473d.b(j6.a().f13137h, j6.a().i));
        return z5;
    }
}
