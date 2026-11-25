package p124x0;

import E4.k;
import N.C0237s;
import P.d;
import S0.a;
import Z.n;
import c5.C0495p;
import kotlin.NoWhenBranchMatchedException;
import p035g0.J;
import p096s.AbstractC0916i;
import p113v0.M;
import p130y0.C1149p;
import p130y0.r;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f13948a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13951d;
    public a i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0495p f13949b = new C0495p(27);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d0 f13952e = new d0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f13953f = new d(new D[16]);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f13954g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f13955h = new d(new O[16]);

    public P(D d6) {
        this.f13948a = d6;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    public static boolean b(D d6, a aVar) {
        boolean zV0;
        D d7 = d6.f13836j;
        if (d7 == null) {
            return false;
        }
        J j4 = d6.f13829D;
        if (aVar == null) {
            H h6 = j4.f13924s;
            a aVar2 = h6 != null ? h6.f13877t : null;
            if (aVar2 == null || d7 == null) {
                zV0 = false;
            } else {
                k.c(h6);
                zV0 = h6.v0(aVar2.f4883a);
            }
        } else if (d7 != null) {
            H h7 = j4.f13924s;
            k.c(h7);
            zV0 = h7.v0(aVar.f4883a);
        } else {
            zV0 = false;
        }
        D dR = d6.r();
        if (zV0 && dR != null) {
            if (dR.f13836j == null) {
                D.Q(dR, false, 3);
                return zV0;
            }
            if (d6.p() == 1) {
                D.O(dR, false, 3);
                return zV0;
            }
            if (d6.p() == 2) {
                dR.N(false);
            }
        }
        return zV0;
    }

    public static boolean c(D d6, a aVar) {
        boolean zJ = aVar != null ? d6.J(aVar) : D.K(d6);
        D dR = d6.r();
        if (zJ && dR != null) {
            int i = d6.f13829D.f13923r.f13898r;
            if (i == 1) {
                D.Q(dR, false, 3);
                return zJ;
            }
            if (i == 2) {
                dR.P(false);
            }
        }
        return zJ;
    }

    public static boolean f(D d6) {
        I i = d6.f13829D.f13923r;
        return i.f13898r == 1 || i.f13884A.e();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z5) {
        Object[] objArr;
        d0 d0Var = this.f13952e;
        if (z5) {
            d dVar = (d) d0Var.f14007b;
            dVar.i();
            D d6 = this.f13948a;
            dVar.c(d6);
            d6.J = true;
        }
        c0 c0Var = c0.f14003b;
        d dVar2 = (d) d0Var.f14007b;
        dVar2.r(c0Var);
        int i = dVar2.f4583j;
        D[] dArr = (D[]) d0Var.f14008c;
        if (dArr != null) {
            int length = dArr.length;
            objArr = dArr;
            if (length < i) {
                objArr = new D[Math.max(16, i)];
            }
        } else {
            objArr = new D[Math.max(16, i)];
        }
        d0Var.f14008c = null;
        for (int i3 = 0; i3 < i; i3++) {
            objArr[i3] = dVar2.f4582h[i3];
        }
        dVar2.i();
        for (int i6 = i - 1; -1 < i6; i6--) {
            D d7 = objArr[i6];
            k.c(d7);
            if (d7.J) {
                d0.a(d7);
            }
        }
        d0Var.f14008c = objArr;
    }

    public final void d(D d6, boolean z5) {
        C0495p c0495p = this.f13949b;
        if (((q0) ((C0495p) (z5 ? c0495p.i : c0495p.f7476j)).f7476j).isEmpty()) {
            return;
        }
        if (!this.f13950c) {
            p027e3.a.y0("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
            throw null;
        }
        if (z5 ? d6.f13829D.f13913g : d6.f13829D.f13910d) {
            p027e3.a.x0("node not yet measured");
            throw null;
        }
        e(d6, z5);
    }

    public final void e(D d6, boolean z5) {
        H h6;
        E e6;
        d dVarU = d6.u();
        int i = dVarU.f4583j;
        C0495p c0495p = this.f13949b;
        boolean z6 = true;
        if (i > 0) {
            Object[] objArr = dVarU.f4582h;
            int i3 = 0;
            do {
                D d7 = (D) objArr[i3];
                if ((!z5 && f(d7)) || (z5 && (d7.p() == 1 || ((h6 = d7.f13829D.f13924s) != null && (e6 = h6.f13881x) != null && e6.e())))) {
                    boolean zO = AbstractC1098f.o(d7);
                    J j4 = d7.f13829D;
                    if (zO && !z5) {
                        if (j4.f13913g && ((q0) ((C0495p) c0495p.i).f7476j).contains(d7)) {
                            i(d7, true, false);
                        } else {
                            d(d7, true);
                        }
                    }
                    if (z5 ? j4.f13913g : j4.f13910d) {
                        boolean zContains = ((q0) ((C0495p) c0495p.i).f7476j).contains(d7);
                        if (!z5) {
                            zContains = zContains || ((q0) ((C0495p) c0495p.f7476j).f7476j).contains(d7);
                        }
                        if (zContains) {
                            i(d7, z5, false);
                        }
                    }
                    if (!(z5 ? j4.f13913g : j4.f13910d)) {
                        e(d7, z5);
                    }
                }
                i3++;
            } while (i3 < i);
        }
        J j6 = d6.f13829D;
        if (z5 ? j6.f13913g : j6.f13910d) {
            boolean zContains2 = ((q0) ((C0495p) c0495p.i).f7476j).contains(d6);
            if (z5) {
                z6 = zContains2;
            } else if (!zContains2 && !((q0) ((C0495p) c0495p.f7476j).f7476j).contains(d6)) {
                z6 = false;
            }
            if (z6) {
                i(d6, z5, false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [P.d] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [P.d] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v6 */
    public final boolean g(C1149p c1149p) {
        boolean z5;
        n nVar;
        D d6;
        C0495p c0495p = this.f13949b;
        D d7 = this.f13948a;
        if (!d7.D()) {
            p027e3.a.x0("performMeasureAndLayout called with unattached root");
            throw null;
        }
        if (!d7.E()) {
            p027e3.a.x0("performMeasureAndLayout called with unplaced root");
            throw null;
        }
        if (this.f13950c) {
            p027e3.a.x0("performMeasureAndLayout called during measure layout");
            throw null;
        }
        if (this.i != null) {
            this.f13950c = true;
            this.f13951d = true;
            try {
                if (c0495p.t()) {
                    z5 = false;
                    while (true) {
                        boolean zT = c0495p.t();
                        C0495p c0495p2 = (C0495p) c0495p.i;
                        if (!zT) {
                            break;
                        }
                        boolean zIsEmpty = ((q0) c0495p2.f7476j).isEmpty();
                        boolean z6 = !zIsEmpty;
                        if (zIsEmpty) {
                            C0495p c0495p3 = (C0495p) c0495p.f7476j;
                            D d8 = (D) ((q0) c0495p3.f7476j).first();
                            c0495p3.x(d8);
                            d6 = d8;
                        } else {
                            d6 = (D) ((q0) c0495p2.f7476j).first();
                            c0495p2.x(d6);
                        }
                        boolean zI = i(d6, z6, true);
                        if (d6 == d7 && zI) {
                            z5 = true;
                        }
                    }
                    if (c1149p != null) {
                        c1149p.invoke();
                    }
                } else {
                    z5 = false;
                }
                this.f13950c = false;
                this.f13951d = false;
            } catch (Throwable th) {
                this.f13950c = false;
                this.f13951d = false;
                throw th;
            }
        } else {
            z5 = false;
        }
        d dVar = this.f13953f;
        int i = dVar.f4583j;
        if (i > 0) {
            Object[] objArr = dVar.f4582h;
            int i3 = 0;
            do {
                C0237s c0237s = ((D) objArr[i3]).f13828C;
                C1111t c1111t = (C1111t) c0237s.f3793c;
                boolean zH = Z.h(128);
                if (zH) {
                    nVar = c1111t.f14060Q;
                } else {
                    nVar = c1111t.f14060Q.f5961l;
                    if (nVar == null) {
                        break;
                    }
                    i3++;
                }
                J j4 = Y.f13977L;
                n nVarO0 = c1111t.O0(zH);
                while (true) {
                    if (nVarO0 != null && (nVarO0.f5960k & 128) != 0) {
                        if ((nVarO0.f5959j & 128) != 0) {
                            ?? E5 = nVarO0;
                            ?? dVar2 = 0;
                            while (E5 != 0) {
                                if (E5 instanceof InterfaceC1113v) {
                                    ((InterfaceC1113v) E5).Q((C1111t) c0237s.f3793c);
                                } else if ((E5.f5959j & 128) != 0 && (E5 instanceof AbstractC1105m)) {
                                    n nVar2 = ((AbstractC1105m) E5).f14046v;
                                    int i6 = 0;
                                    E5 = E5;
                                    dVar2 = dVar2;
                                    while (nVar2 != null) {
                                        if ((nVar2.f5959j & 128) != 0) {
                                            i6++;
                                            dVar2 = dVar2;
                                            if (i6 == 1) {
                                                E5 = nVar2;
                                            } else {
                                                if (dVar2 == 0) {
                                                    dVar2 = new d(new n[16]);
                                                }
                                                if (E5 != 0) {
                                                    dVar2.c(E5);
                                                    E5 = 0;
                                                }
                                                dVar2.c(nVar2);
                                            }
                                        }
                                        nVar2 = nVar2.f5962m;
                                        E5 = E5;
                                        dVar2 = dVar2;
                                    }
                                    if (i6 != 1) {
                                        E5 = AbstractC1098f.e(dVar2);
                                    }
                                }
                                E5 = AbstractC1098f.e(dVar2);
                            }
                        }
                        if (nVarO0 == nVar) {
                            break;
                        }
                        nVarO0 = nVarO0.f5962m;
                    } else {
                        break;
                        break;
                    }
                }
                i3++;
            } while (i3 < i);
        }
        dVar.i();
        return z5;
    }

    public final void h() {
        C0495p c0495p = this.f13949b;
        if (c0495p.t()) {
            D d6 = this.f13948a;
            if (!d6.D()) {
                p027e3.a.x0("performMeasureAndLayout called with unattached root");
                throw null;
            }
            if (!d6.E()) {
                p027e3.a.x0("performMeasureAndLayout called with unplaced root");
                throw null;
            }
            if (this.f13950c) {
                p027e3.a.x0("performMeasureAndLayout called during measure layout");
                throw null;
            }
            if (this.i != null) {
                this.f13950c = true;
                this.f13951d = false;
                try {
                    if (!((q0) ((C0495p) c0495p.i).f7476j).isEmpty()) {
                        if (d6.f13836j != null) {
                            k(d6, true);
                        } else {
                            j(d6);
                        }
                    }
                    k(d6, false);
                } finally {
                    this.f13950c = false;
                    this.f13951d = false;
                }
            }
        }
    }

    public final boolean i(D d6, boolean z5, boolean z6) {
        a aVar;
        boolean zC;
        D dR;
        M placementScope;
        C1111t c1111t;
        D dR2;
        D dR3;
        H h6;
        E e6;
        H h7;
        E e7;
        int i = 0;
        if (!d6.f13832K) {
            boolean zE = d6.E();
            J j4 = d6.f13829D;
            if (zE || j4.f13923r.f13906z || ((j4.f13910d && f(d6)) || k.a(d6.F(), Boolean.TRUE) || ((j4.f13913g && (d6.p() == 1 || ((h7 = j4.f13924s) != null && (e7 = h7.f13881x) != null && e7.e()))) || j4.f13923r.f13884A.e() || ((h6 = j4.f13924s) != null && (e6 = h6.f13881x) != null && e6.e())))) {
                D d7 = this.f13948a;
                if (d6 == d7) {
                    aVar = this.i;
                    k.c(aVar);
                } else {
                    aVar = null;
                }
                if (z5) {
                    zC = j4.f13913g ? b(d6, aVar) : false;
                    if (z6 && ((zC || j4.f13914h) && k.a(d6.F(), Boolean.TRUE))) {
                        if (d6.f13833L == 3) {
                            d6.g();
                        }
                        H h8 = j4.f13924s;
                        k.c(h8);
                        try {
                            h8.f13870m = true;
                            if (!h8.f13875r) {
                                p027e3.a.y0("replace() called on item that was not placed");
                                throw null;
                            }
                            h8.f13868D = false;
                            boolean z7 = h8.f13880w;
                            h8.u0(h8.f13878u, h8.f13879v);
                            if (z7 && !h8.f13868D && (dR3 = h8.f13869E.f13907a.r()) != null) {
                                dR3.N(false);
                            }
                            h8.f13870m = false;
                        } catch (Throwable th) {
                            h8.f13870m = false;
                            throw th;
                        }
                    }
                } else {
                    zC = j4.f13910d ? c(d6, aVar) : false;
                    if (z6 && j4.f13911e && (d6 == d7 || ((dR2 = d6.r()) != null && dR2.E() && j4.f13923r.f13906z))) {
                        I i3 = j4.f13923r;
                        if (d6 == d7) {
                            if (d6.f13833L == 3) {
                                d6.g();
                            }
                            D dR4 = d6.r();
                            if (dR4 == null || (c1111t = (C1111t) dR4.f13828C.f3793c) == null || (placementScope = c1111t.f13936p) == null) {
                                placementScope = ((r) AbstractC1098f.u(d6)).getPlacementScope();
                            }
                            M.f(placementScope, i3, 0, 0);
                        } else {
                            if (d6.f13833L == 3) {
                                d6.g();
                            }
                            i3.getClass();
                            try {
                                i3.f13893m = true;
                                if (!i3.f13897q) {
                                    p027e3.a.y0("replace called on unplaced item");
                                    throw null;
                                }
                                boolean z8 = i3.f13905y;
                                i3.v0(i3.f13900t, i3.f13902v, i3.f13901u);
                                if (z8 && !i3.G && (dR = i3.f13892M.f13907a.r()) != null) {
                                    dR.P(false);
                                }
                                i3.f13893m = false;
                            } catch (Throwable th2) {
                                i3.f13893m = false;
                                throw th2;
                            }
                        }
                        ((d) this.f13952e.f14007b).c(d6);
                        d6.J = true;
                    }
                }
                d dVar = this.f13955h;
                if (dVar.n()) {
                    int i6 = dVar.f4583j;
                    if (i6 > 0) {
                        Object[] objArr = dVar.f4582h;
                        do {
                            O o6 = (O) objArr[i];
                            if (o6.f13945a.D()) {
                                boolean z9 = o6.f13946b;
                                boolean z10 = o6.f13947c;
                                D d8 = o6.f13945a;
                                if (z9) {
                                    D.O(d8, z10, 2);
                                } else {
                                    D.Q(d8, z10, 2);
                                }
                            }
                            i++;
                        } while (i < i6);
                    }
                    dVar.i();
                }
                return zC;
            }
        }
        return false;
    }

    public final void j(D d6) {
        d dVarU = d6.u();
        int i = dVarU.f4583j;
        if (i > 0) {
            Object[] objArr = dVarU.f4582h;
            int i3 = 0;
            do {
                D d7 = (D) objArr[i3];
                if (f(d7)) {
                    if (AbstractC1098f.o(d7)) {
                        k(d7, true);
                    } else {
                        j(d7);
                    }
                }
                i3++;
            } while (i3 < i);
        }
    }

    public final void k(D d6, boolean z5) {
        a aVar;
        if (d6.f13832K) {
            return;
        }
        if (d6 == this.f13948a) {
            aVar = this.i;
            k.c(aVar);
        } else {
            aVar = null;
        }
        if (z5) {
            b(d6, aVar);
        } else {
            c(d6, aVar);
        }
    }

    public final boolean l(D d6, boolean z5) {
        int iD = AbstractC0916i.d(d6.f13829D.f13909c);
        if (iD != 0 && iD != 1) {
            if (iD == 2 || iD == 3) {
                this.f13955h.c(new O(d6, false, z5));
            } else {
                if (iD != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                J j4 = d6.f13829D;
                if (!j4.f13910d || z5) {
                    j4.f13910d = true;
                    if (d6.f13832K || (!d6.E() && (!j4.f13910d || !f(d6)))) {
                        return false;
                    }
                    D dR = d6.r();
                    if (dR == null || !dR.f13829D.f13910d) {
                        this.f13949b.p(d6, false);
                    }
                    if (!this.f13951d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void m(long j4) {
        a aVar = this.i;
        if (aVar == null ? false : a.b(aVar.f4883a, j4)) {
            return;
        }
        if (this.f13950c) {
            p027e3.a.x0("updateRootConstraints called while measuring");
            throw null;
        }
        this.i = new a(j4);
        D d6 = this.f13948a;
        D d7 = d6.f13836j;
        J j6 = d6.f13829D;
        if (d7 != null) {
            j6.f13913g = true;
        }
        j6.f13910d = true;
        this.f13949b.p(d6, d7 != null);
    }
}
