package p124x0;

import B.C0024m;
import D3.k;
import E0.h;
import E0.i;
import E4.w;
import N.C0217h0;
import N.C0237s;
import N.C0241u;
import N.InterfaceC0220j;
import N.InterfaceC0243v;
import P.d;
import S0.a;
import S0.b;
import Z.l;
import Z.m;
import Z.n;
import Z.o;
import c5.C0495p;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.util.List;
import p035g0.InterfaceC0714o;
import p035g0.J;
import p058l0.I;
import p090r.v;
import p096s.AbstractC0916i;
import p113v0.B;
import p113v0.F;
import p130y0.G0;
import p130y0.H;
import p130y0.r;

/* JADX INFO: loaded from: classes.dex */
public final class D implements InterfaceC0220j, g0, InterfaceC1102j {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final A f13823N = new A("Undefined intrinsics block and it is required");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final C1117z f13824O = new C1117z();

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final k f13825P = new k(4);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public InterfaceC0243v f13826A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f13827B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0237s f13828C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final J f13829D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public B f13830E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Y f13831F;
    public boolean G;
    public o H;
    public o I;
    public boolean J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f13832K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f13833L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f13834M;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f13835h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public D f13836j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13837k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0495p f13838l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f13839m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13840n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public D f13841o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r f13842p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f13843q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13844r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h f13845s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f13846t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f13847u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public F f13848v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C0495p f13849w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f13850x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public S0.k f13851y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public G0 f13852z;

    public D(int i) {
        this((i & 1) == 0, i.f941a.addAndGet(1));
    }

    public static boolean K(D d6) {
        I i = d6.f13829D.f13923r;
        return d6.J(i.f13896p ? new a(i.f13139k) : null);
    }

    public static void O(D d6, boolean z5, int i) {
        D dR;
        if ((i & 1) != 0) {
            z5 = false;
        }
        boolean z6 = (i & 4) != 0;
        if (d6.f13836j == null) {
            p027e3.a.y0("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
            throw null;
        }
        r rVar = d6.f13842p;
        if (rVar == null || d6.f13844r || d6.f13835h) {
            return;
        }
        rVar.v(d6, true, z5);
        if (z6) {
            H h6 = d6.f13829D.f13924s;
            E4.k.c(h6);
            J j4 = h6.f13869E;
            D dR2 = j4.f13907a.r();
            int i3 = j4.f13907a.f13833L;
            if (dR2 == null || i3 == 3) {
                return;
            }
            while (dR2.f13833L == i3 && (dR = dR2.r()) != null) {
                dR2 = dR;
            }
            int iD = AbstractC0916i.d(i3);
            if (iD == 0) {
                if (dR2.f13836j != null) {
                    O(dR2, z5, 6);
                    return;
                } else {
                    Q(dR2, z5, 6);
                    return;
                }
            }
            if (iD != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (dR2.f13836j != null) {
                dR2.N(z5);
            } else {
                dR2.P(z5);
            }
        }
    }

    public static void Q(D d6, boolean z5, int i) {
        r rVar;
        D dR;
        if ((i & 1) != 0) {
            z5 = false;
        }
        boolean z6 = (i & 4) != 0;
        if (d6.f13844r || d6.f13835h || (rVar = d6.f13842p) == null) {
            return;
        }
        rVar.v(d6, false, z5);
        if (z6) {
            J j4 = d6.f13829D.f13923r.f13892M;
            D dR2 = j4.f13907a.r();
            int i3 = j4.f13907a.f13833L;
            if (dR2 == null || i3 == 3) {
                return;
            }
            while (dR2.f13833L == i3 && (dR = dR2.r()) != null) {
                dR2 = dR;
            }
            int iD = AbstractC0916i.d(i3);
            if (iD == 0) {
                Q(dR2, z5, 6);
            } else {
                if (iD != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                dR2.P(z5);
            }
        }
    }

    public static void R(D d6) {
        int i = C.f13822a[AbstractC0916i.d(d6.f13829D.f13909c)];
        J j4 = d6.f13829D;
        if (i != 1) {
            throw new IllegalStateException("Unexpected state ".concat(p012c.k.F(j4.f13909c)));
        }
        if (j4.f13913g) {
            O(d6, true, 6);
            return;
        }
        if (j4.f13914h) {
            d6.N(true);
        }
        if (j4.f13910d) {
            Q(d6, true, 6);
        } else if (j4.f13911e) {
            d6.P(true);
        }
    }

    public final void A() {
        if (this.f13836j != null) {
            O(this, false, 7);
        } else {
            Q(this, false, 7);
        }
    }

    public final void B() {
        this.f13845s = null;
        ((r) AbstractC1098f.u(this)).x();
    }

    public final void C() {
        D d6;
        if (this.f13837k > 0) {
            this.f13840n = true;
        }
        if (!this.f13835h || (d6 = this.f13841o) == null) {
            return;
        }
        d6.C();
    }

    public final boolean D() {
        return this.f13842p != null;
    }

    public final boolean E() {
        return this.f13829D.f13923r.f13905y;
    }

    public final Boolean F() {
        H h6 = this.f13829D.f13924s;
        if (h6 != null) {
            return Boolean.valueOf(h6.f13880w);
        }
        return null;
    }

    public final void G(int i, int i3, int i6) {
        if (i == i3) {
            return;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = i > i3 ? i + i7 : i;
            int i9 = i > i3 ? i3 + i7 : (i3 + i6) - 2;
            C0495p c0495p = this.f13838l;
            Object objP = ((d) c0495p.i).p(i8);
            I i10 = (I) c0495p.f7476j;
            i10.invoke();
            ((d) c0495p.i).a(i9, (D) objP);
            i10.invoke();
        }
        I();
        C();
        A();
    }

    public final void H(D d6) {
        if (d6.f13829D.f13919n > 0) {
            J j4 = this.f13829D;
            j4.b(j4.f13919n - 1);
        }
        if (this.f13842p != null) {
            d6.i();
        }
        d6.f13841o = null;
        ((Y) d6.f13828C.f3794d).f13991u = null;
        if (d6.f13835h) {
            this.f13837k--;
            d dVar = (d) d6.f13838l.i;
            int i = dVar.f4583j;
            if (i > 0) {
                Object[] objArr = dVar.f4582h;
                int i3 = 0;
                do {
                    ((Y) ((D) objArr[i3]).f13828C.f3794d).f13991u = null;
                    i3++;
                } while (i3 < i);
            }
        }
        C();
        I();
    }

    public final void I() {
        if (!this.f13835h) {
            this.f13847u = true;
            return;
        }
        D dR = r();
        if (dR != null) {
            dR.I();
        }
    }

    public final boolean J(a aVar) {
        if (aVar == null) {
            return false;
        }
        if (this.f13833L == 3) {
            f();
        }
        return this.f13829D.f13923r.w0(aVar.f4883a);
    }

    public final void L() {
        C0495p c0495p = this.f13838l;
        int i = ((d) c0495p.i).f4583j;
        while (true) {
            i--;
            d dVar = (d) c0495p.i;
            if (-1 >= i) {
                dVar.i();
                ((I) c0495p.f7476j).invoke();
                return;
            }
            H((D) dVar.f4582h[i]);
        }
    }

    public final void M(int i, int i3) {
        if (i3 < 0) {
            p027e3.a.x0("count (" + i3 + ") must be greater than 0");
            throw null;
        }
        int i6 = (i3 + i) - 1;
        if (i > i6) {
            return;
        }
        while (true) {
            C0495p c0495p = this.f13838l;
            H((D) ((d) c0495p.i).f4582h[i6]);
            Object objP = ((d) c0495p.i).p(i6);
            ((I) c0495p.f7476j).invoke();
            if (i6 == i) {
                return;
            } else {
                i6--;
            }
        }
    }

    public final void N(boolean z5) {
        r rVar;
        if (this.f13835h || (rVar = this.f13842p) == null) {
            return;
        }
        rVar.w(this, true, z5);
    }

    public final void P(boolean z5) {
        r rVar;
        if (this.f13835h || (rVar = this.f13842p) == null) {
            return;
        }
        rVar.w(this, false, z5);
    }

    public final void S() {
        d dVarU = u();
        int i = dVarU.f4583j;
        if (i > 0) {
            Object[] objArr = dVarU.f4582h;
            int i3 = 0;
            do {
                D d6 = (D) objArr[i3];
                int i6 = d6.f13834M;
                d6.f13833L = i6;
                if (i6 != 3) {
                    d6.S();
                }
                i3++;
            } while (i3 < i);
        }
    }

    public final void T(b bVar) {
        if (E4.k.a(this.f13850x, bVar)) {
            return;
        }
        this.f13850x = bVar;
        A();
        D dR = r();
        if (dR != null) {
            dR.x();
        }
        y();
        for (n nVar = (n) this.f13828C.f3796f; nVar != null; nVar = nVar.f5962m) {
            if ((nVar.f5959j & 16) != 0) {
                ((k0) nVar).k();
            } else if (nVar instanceof p019d0.b) {
                ((p019d0.b) nVar).y0();
            }
        }
    }

    public final void U(D d6) {
        if (E4.k.a(d6, this.f13836j)) {
            return;
        }
        this.f13836j = d6;
        if (d6 != null) {
            J j4 = this.f13829D;
            if (j4.f13924s == null) {
                j4.f13924s = new H(j4);
            }
            C0237s c0237s = this.f13828C;
            Y y2 = ((C1111t) c0237s.f3793c).f13990t;
            for (Y y6 = (Y) c0237s.f3794d; !E4.k.a(y6, y2) && y6 != null; y6 = y6.f13990t) {
                y6.H0();
            }
        }
        A();
    }

    public final void V(F f6) {
        if (E4.k.a(this.f13848v, f6)) {
            return;
        }
        this.f13848v = f6;
        C0495p c0495p = this.f13849w;
        if (c0495p != null) {
            ((C0217h0) c0495p.f7476j).setValue(f6);
        }
        A();
    }

    public final void W(o oVar) {
        if (!(!this.f13835h || this.H == l.f5957a)) {
            p027e3.a.x0("Modifiers are not supported on virtual LayoutNodes");
            throw null;
        }
        if (this.f13832K) {
            p027e3.a.x0("modifier is updated when deactivated");
            throw null;
        }
        if (D()) {
            d(oVar);
        } else {
            this.I = oVar;
        }
    }

    public final void X() {
        if (this.f13837k <= 0 || !this.f13840n) {
            return;
        }
        int i = 0;
        this.f13840n = false;
        d dVar = this.f13839m;
        if (dVar == null) {
            dVar = new d(new D[16]);
            this.f13839m = dVar;
        }
        dVar.i();
        d dVar2 = (d) this.f13838l.i;
        int i3 = dVar2.f4583j;
        if (i3 > 0) {
            Object[] objArr = dVar2.f4582h;
            do {
                D d6 = (D) objArr[i];
                if (d6.f13835h) {
                    dVar.d(dVar.f4583j, d6.u());
                } else {
                    dVar.c(d6);
                }
                i++;
            } while (i < i3);
        }
        J j4 = this.f13829D;
        j4.f13923r.f13886C = true;
        H h6 = j4.f13924s;
        if (h6 != null) {
            h6.f13883z = true;
        }
    }

    @Override // N.InterfaceC0220j
    public final void a() {
        if (!D()) {
            p027e3.a.x0("onReuse is only expected on attached node");
            throw null;
        }
        B b6 = this.f13830E;
        if (b6 != null) {
            b6.f(false);
        }
        boolean z5 = this.f13832K;
        C0237s c0237s = this.f13828C;
        if (z5) {
            this.f13832K = false;
            B();
        } else {
            for (n nVar = (n0) c0237s.f3795e; nVar != null; nVar = nVar.f5961l) {
                if (nVar.f5969t) {
                    nVar.t0();
                }
            }
            n nVar2 = (n0) c0237s.f3795e;
            for (n nVar3 = nVar2; nVar3 != null; nVar3 = nVar3.f5961l) {
                if (nVar3.f5969t) {
                    nVar3.v0();
                }
            }
            while (nVar2 != null) {
                if (nVar2.f5969t) {
                    nVar2.q0();
                }
                nVar2 = nVar2.f5961l;
            }
        }
        this.i = i.f941a.addAndGet(1);
        for (n nVar4 = (n) c0237s.f3796f; nVar4 != null; nVar4 = nVar4.f5962m) {
            nVar4.p0();
        }
        c0237s.i();
        R(this);
    }

    @Override // N.InterfaceC0220j
    public final void b() {
        B b6 = this.f13830E;
        if (b6 != null) {
            b6.b();
        }
        C0237s c0237s = this.f13828C;
        Y y2 = ((C1111t) c0237s.f3793c).f13990t;
        for (Y y6 = (Y) c0237s.f3794d; !E4.k.a(y6, y2) && y6 != null; y6 = y6.f13990t) {
            y6.f13992v = true;
            y6.I.invoke();
            if (y6.f13988K != null) {
                y6.h1(null, false);
                y6.f13989s.P(false);
            }
        }
    }

    @Override // N.InterfaceC0220j
    public final void c() {
        B b6 = this.f13830E;
        if (b6 != null) {
            b6.f(true);
        }
        this.f13832K = true;
        C0237s c0237s = this.f13828C;
        for (n nVar = (n0) c0237s.f3795e; nVar != null; nVar = nVar.f5961l) {
            if (nVar.f5969t) {
                nVar.t0();
            }
        }
        n nVar2 = (n0) c0237s.f3795e;
        for (n nVar3 = nVar2; nVar3 != null; nVar3 = nVar3.f5961l) {
            if (nVar3.f5969t) {
                nVar3.v0();
            }
        }
        while (nVar2 != null) {
            if (nVar2.f5969t) {
                nVar2.q0();
            }
            nVar2 = nVar2.f5961l;
        }
        if (D()) {
            B();
        }
    }

    public final void d(o oVar) {
        boolean z5;
        d dVar;
        C0237s c0237s;
        this.H = oVar;
        C0237s c0237s2 = this.f13828C;
        n nVar = (n) c0237s2.f3796f;
        n nVarB = V.f13962a;
        if (nVar == nVarB) {
            p027e3.a.y0("padChain called on already padded chain");
            throw null;
        }
        nVar.f5961l = nVarB;
        nVarB.f5962m = nVar;
        d dVar2 = (d) c0237s2.f3797g;
        int i = dVar2 != null ? dVar2.f4583j : 0;
        d dVar3 = (d) c0237s2.f3798h;
        if (dVar3 == null) {
            dVar3 = new d(new m[16]);
        }
        int i3 = dVar3.f4583j;
        if (i3 < 16) {
            i3 = 16;
        }
        d dVar4 = new d(new o[i3]);
        dVar4.c(oVar);
        v vVar = null;
        while (true) {
            z5 = true;
            if (!dVar4.n()) {
                break;
            }
            o oVar2 = (o) dVar4.p(dVar4.f4583j - 1);
            if (oVar2 instanceof Z.i) {
                Z.i iVar = (Z.i) oVar2;
                dVar4.c(iVar.f5954b);
                dVar4.c(iVar.f5953a);
            } else if (oVar2 instanceof m) {
                dVar3.c(oVar2);
            } else {
                if (vVar == null) {
                    vVar = new v(12, dVar3);
                }
                oVar2.f(vVar);
                vVar = vVar;
            }
        }
        int i6 = dVar3.f4583j;
        n nVar2 = (n0) c0237s2.f3795e;
        D d6 = (D) c0237s2.f3792b;
        if (i6 == i) {
            n nVar3 = nVarB.f5962m;
            int i7 = 0;
            while (nVar3 != null && i7 < i) {
                if (dVar2 == null) {
                    p027e3.a.z0("expected prior modifier list to be non-empty");
                    throw null;
                }
                m mVar = (m) dVar2.f4582h[i7];
                m mVar2 = (m) dVar3.f4582h[i7];
                char c6 = E4.k.a(mVar, mVar2) ? (char) 2 : mVar.getClass() == mVar2.getClass() ? (char) 1 : (char) 0;
                if (c6 == 0) {
                    nVar3 = nVar3.f5961l;
                    break;
                }
                if (c6 == 1) {
                    C0237s.l(mVar, mVar2, nVar3);
                }
                nVar3 = nVar3.f5962m;
                i7++;
            }
            if (i7 >= i) {
                c0237s2 = c0237s2;
                dVar = dVar3;
                c0237s = c0237s2;
                z5 = false;
            } else {
                if (dVar2 == null) {
                    p027e3.a.z0("expected prior modifier list to be non-empty");
                    throw null;
                }
                if (nVar3 == null) {
                    p027e3.a.z0("structuralUpdate requires a non-null tail");
                    throw null;
                }
                n nVar4 = nVar3;
                c0237s = c0237s2;
                dVar = dVar3;
                c0237s.j(i7, dVar2, dVar, nVar4, !(d6.I != null));
            }
        } else {
            dVar = dVar3;
            o oVar3 = d6.I;
            if (oVar3 != null && i == 0) {
                for (int i8 = 0; i8 < dVar.f4583j; i8++) {
                    nVarB = C0237s.b((m) dVar.f4582h[i8], nVarB);
                }
                n nVar5 = nVar2.f5961l;
                int i9 = 0;
                while (nVar5 != null && nVar5 != V.f13962a) {
                    int i10 = i9 | nVar5.f5959j;
                    nVar5.f5960k = i10;
                    nVar5 = nVar5.f5961l;
                    i9 = i10;
                }
                c0237s = c0237s2;
            } else if (i6 != 0) {
                if (dVar2 == null) {
                    dVar2 = new d(new m[16]);
                }
                c0237s = c0237s2;
                c0237s.j(0, dVar2, dVar, nVarB, !(oVar3 != null));
            } else {
                if (dVar2 == null) {
                    p027e3.a.z0("expected prior modifier list to be non-empty");
                    throw null;
                }
                n nVar6 = nVarB.f5962m;
                for (int i11 = 0; nVar6 != null && i11 < dVar2.f4583j; i11++) {
                    nVar6 = C0237s.c(nVar6).f5962m;
                }
                D dR = d6.r();
                C1111t c1111t = dR != null ? (C1111t) dR.f13828C.f3793c : null;
                C1111t c1111t2 = (C1111t) c0237s2.f3793c;
                c1111t2.f13991u = c1111t;
                c0237s2.f3794d = c1111t2;
                c0237s = c0237s2;
                z5 = false;
            }
        }
        c0237s.f3797g = dVar;
        if (dVar2 != null) {
            dVar2.i();
        } else {
            dVar2 = null;
        }
        c0237s.f3798h = dVar2;
        U u6 = V.f13962a;
        n nVar7 = u6.f5962m;
        if (nVar7 != null) {
            nVar2 = nVar7;
        }
        nVar2.f5961l = null;
        u6.f5962m = null;
        u6.f5960k = -1;
        u6.f5964o = null;
        if (nVar2 == u6) {
            p027e3.a.y0("trimChain did not update the head");
            throw null;
        }
        c0237s.f3796f = nVar2;
        if (z5) {
            c0237s.k();
        }
        this.f13829D.h();
        if (this.f13836j == null && c0237s.f(HueLog.LogComponent.APPCORE)) {
            U(this);
        }
    }

    public final void e(r rVar) {
        D d6;
        if (!(this.f13842p == null)) {
            p027e3.a.y0("Cannot attach " + this + " as it already is attached.  Tree: " + h(0));
            throw null;
        }
        D d7 = this.f13841o;
        if (d7 != null && !E4.k.a(d7.f13842p, rVar)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(rVar);
            sb.append(") than the parent's owner(");
            D dR = r();
            sb.append(dR != null ? dR.f13842p : null);
            sb.append("). This tree: ");
            sb.append(h(0));
            sb.append(" Parent tree: ");
            D d8 = this.f13841o;
            sb.append(d8 != null ? d8.h(0) : null);
            p027e3.a.y0(sb.toString());
            throw null;
        }
        D dR2 = r();
        J j4 = this.f13829D;
        if (dR2 == null) {
            j4.f13923r.f13905y = true;
            H h6 = j4.f13924s;
            if (h6 != null) {
                h6.f13880w = true;
            }
        }
        C0237s c0237s = this.f13828C;
        ((Y) c0237s.f3794d).f13991u = dR2 != null ? (C1111t) dR2.f13828C.f3793c : null;
        this.f13842p = rVar;
        this.f13843q = (dR2 != null ? dR2.f13843q : -1) + 1;
        o oVar = this.I;
        if (oVar != null) {
            d(oVar);
        }
        this.I = null;
        if (c0237s.f(8)) {
            B();
        }
        rVar.getClass();
        D d9 = this.f13841o;
        if (d9 == null || (d6 = d9.f13836j) == null) {
            d6 = this.f13836j;
        }
        U(d6);
        if (this.f13836j == null && c0237s.f(HueLog.LogComponent.APPCORE)) {
            U(this);
        }
        if (!this.f13832K) {
            for (n nVar = (n) c0237s.f3796f; nVar != null; nVar = nVar.f5962m) {
                nVar.p0();
            }
        }
        d dVar = (d) this.f13838l.i;
        int i = dVar.f4583j;
        if (i > 0) {
            Object[] objArr = dVar.f4582h;
            int i3 = 0;
            do {
                ((D) objArr[i3]).e(rVar);
                i3++;
            } while (i3 < i);
        }
        if (!this.f13832K) {
            c0237s.i();
        }
        A();
        if (dR2 != null) {
            dR2.A();
        }
        Y y2 = ((C1111t) c0237s.f3793c).f13990t;
        for (Y y6 = (Y) c0237s.f3794d; !E4.k.a(y6, y2) && y6 != null; y6 = y6.f13990t) {
            y6.h1(y6.f13994x, true);
            e0 e0Var = y6.f13988K;
            if (e0Var != null) {
                e0Var.invalidate();
            }
        }
        j4.h();
        if (this.f13832K) {
            return;
        }
        n nVar2 = (n) c0237s.f3796f;
        if ((nVar2.f5960k & 7168) != 0) {
            while (nVar2 != null) {
                int i6 = nVar2.f5959j;
                if (((i6 & 4096) != 0) | ((i6 & 1024) != 0) | ((i6 & 2048) != 0)) {
                    Z.a(nVar2);
                }
                nVar2 = nVar2.f5962m;
            }
        }
    }

    public final void f() {
        this.f13834M = this.f13833L;
        this.f13833L = 3;
        d dVarU = u();
        int i = dVarU.f4583j;
        if (i > 0) {
            Object[] objArr = dVarU.f4582h;
            int i3 = 0;
            do {
                D d6 = (D) objArr[i3];
                if (d6.f13833L != 3) {
                    d6.f();
                }
                i3++;
            } while (i3 < i);
        }
    }

    public final void g() {
        this.f13834M = this.f13833L;
        this.f13833L = 3;
        d dVarU = u();
        int i = dVarU.f4583j;
        if (i > 0) {
            Object[] objArr = dVarU.f4582h;
            int i3 = 0;
            do {
                D d6 = (D) objArr[i3];
                if (d6.f13833L == 2) {
                    d6.g();
                }
                i3++;
            } while (i3 < i);
        }
    }

    public final String h(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i; i3++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        d dVarU = u();
        int i6 = dVarU.f4583j;
        if (i6 > 0) {
            Object[] objArr = dVarU.f4582h;
            int i7 = 0;
            do {
                sb.append(((D) objArr[i7]).h(i + 1));
                i7++;
            } while (i7 < i6);
        }
        String string = sb.toString();
        if (i != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        E4.k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public final void i() {
        E e6;
        r rVar = this.f13842p;
        if (rVar == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            D dR = r();
            sb.append(dR != null ? dR.h(0) : null);
            p027e3.a.z0(sb.toString());
            throw null;
        }
        D dR2 = r();
        J j4 = this.f13829D;
        if (dR2 != null) {
            dR2.x();
            dR2.A();
            j4.f13923r.f13898r = 3;
            H h6 = j4.f13924s;
            if (h6 != null) {
                h6.f13873p = 3;
            }
        }
        E e7 = j4.f13923r.f13884A;
        e7.f13854b = true;
        e7.f13855c = false;
        e7.f13857e = false;
        e7.f13856d = false;
        e7.f13858f = false;
        e7.f13859g = false;
        e7.f13860h = null;
        H h7 = j4.f13924s;
        if (h7 != null && (e6 = h7.f13881x) != null) {
            e6.f13854b = true;
            e6.f13855c = false;
            e6.f13857e = false;
            e6.f13856d = false;
            e6.f13858f = false;
            e6.f13859g = false;
            e6.f13860h = null;
        }
        C0237s c0237s = this.f13828C;
        if (c0237s.f(8)) {
            B();
        }
        n nVar = (n0) c0237s.f3795e;
        for (n nVar2 = nVar; nVar2 != null; nVar2 = nVar2.f5961l) {
            if (nVar2.f5969t) {
                nVar2.v0();
            }
        }
        this.f13844r = true;
        d dVar = (d) this.f13838l.i;
        int i = dVar.f4583j;
        if (i > 0) {
            Object[] objArr = dVar.f4582h;
            int i3 = 0;
            do {
                ((D) objArr[i3]).i();
                i3++;
            } while (i3 < i);
        }
        this.f13844r = false;
        while (nVar != null) {
            if (nVar.f5969t) {
                nVar.q0();
            }
            nVar = nVar.f5961l;
        }
        P p6 = rVar.f14467N;
        C0495p c0495p = p6.f13949b;
        ((C0495p) c0495p.i).x(this);
        ((C0495p) c0495p.f7476j).x(this);
        ((d) p6.f13952e.f14007b).o(this);
        rVar.f14463F = true;
        this.f13842p = null;
        U(null);
        this.f13843q = 0;
        I i6 = j4.f13923r;
        i6.f13895o = Integer.MAX_VALUE;
        i6.f13894n = Integer.MAX_VALUE;
        i6.f13905y = false;
        H h8 = j4.f13924s;
        if (h8 != null) {
            h8.f13872o = Integer.MAX_VALUE;
            h8.f13871n = Integer.MAX_VALUE;
            h8.f13880w = false;
        }
    }

    public final void j(InterfaceC0714o interfaceC0714o, p048j0.b bVar) {
        ((Y) this.f13828C.f3794d).E0(interfaceC0714o, bVar);
    }

    public final List k() {
        H h6 = this.f13829D.f13924s;
        E4.k.c(h6);
        J j4 = h6.f13869E;
        j4.f13907a.m();
        boolean z5 = h6.f13883z;
        d dVar = h6.f13882y;
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
                    H h7 = d7.f13829D.f13924s;
                    E4.k.c(h7);
                    dVar.c(h7);
                } else {
                    H h8 = d7.f13829D.f13924s;
                    E4.k.c(h8);
                    Object[] objArr2 = dVar.f4582h;
                    Object obj = objArr2[i3];
                    objArr2[i3] = h8;
                }
                i3++;
            } while (i3 < i);
        }
        dVar.q(((P.a) d6.m()).f4578h.f4583j, dVar.f4583j);
        h6.f13883z = false;
        return dVar.h();
    }

    public final List l() {
        return this.f13829D.f13923r.p0();
    }

    public final List m() {
        return u().h();
    }

    public final h n() {
        if (!D() || this.f13832K) {
            return null;
        }
        if (!this.f13828C.f(8) || this.f13845s != null) {
            return this.f13845s;
        }
        w wVar = new w();
        wVar.f1074h = new h();
        h0 snapshotObserver = ((r) AbstractC1098f.u(this)).getSnapshotObserver();
        snapshotObserver.a(this, snapshotObserver.f14032d, new C0024m(this, 13, wVar));
        h hVar = (h) wVar.f1074h;
        this.f13845s = hVar;
        return hVar;
    }

    public final List o() {
        return ((d) this.f13838l.i).h();
    }

    public final int p() {
        int i;
        H h6 = this.f13829D.f13924s;
        if (h6 == null || (i = h6.f13873p) == 0) {
            return 3;
        }
        return i;
    }

    public final C0495p q() {
        C0495p c0495p = this.f13849w;
        if (c0495p != null) {
            return c0495p;
        }
        C0495p c0495p2 = new C0495p(this, this.f13848v);
        this.f13849w = c0495p2;
        return c0495p2;
    }

    public final D r() {
        D d6 = this.f13841o;
        while (d6 != null && d6.f13835h) {
            d6 = d6.f13841o;
        }
        return d6;
    }

    public final int s() {
        return this.f13829D.f13923r.f13895o;
    }

    public final d t() {
        boolean z5 = this.f13847u;
        d dVar = this.f13846t;
        if (z5) {
            dVar.i();
            dVar.d(dVar.f4583j, u());
            dVar.r(f13825P);
            this.f13847u = false;
        }
        return dVar;
    }

    public final String toString() {
        return H.y(this) + " children: " + ((P.a) m()).f4578h.f4583j + " measurePolicy: " + this.f13848v;
    }

    public final d u() {
        X();
        if (this.f13837k == 0) {
            return (d) this.f13838l.i;
        }
        d dVar = this.f13839m;
        E4.k.c(dVar);
        return dVar;
    }

    public final void v(long j4, r rVar, boolean z5, boolean z6) {
        C0237s c0237s = this.f13828C;
        Y y2 = (Y) c0237s.f3794d;
        J j6 = Y.f13977L;
        ((Y) c0237s.f3794d).Q0(Y.f13980O, y2.J0(j4), rVar, z5, z6);
    }

    public final void w(int i, D d6) {
        if (!(d6.f13841o == null)) {
            StringBuilder sb = new StringBuilder("Cannot insert ");
            sb.append(d6);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(h(0));
            sb.append(" Other tree: ");
            D d7 = d6.f13841o;
            sb.append(d7 != null ? d7.h(0) : null);
            p027e3.a.y0(sb.toString());
            throw null;
        }
        if (d6.f13842p != null) {
            p027e3.a.y0("Cannot insert " + d6 + " because it already has an owner. This tree: " + h(0) + " Other tree: " + d6.h(0));
            throw null;
        }
        d6.f13841o = this;
        C0495p c0495p = this.f13838l;
        ((d) c0495p.i).a(i, d6);
        ((I) c0495p.f7476j).invoke();
        I();
        if (d6.f13835h) {
            this.f13837k++;
        }
        C();
        r rVar = this.f13842p;
        if (rVar != null) {
            d6.e(rVar);
        }
        if (d6.f13829D.f13919n > 0) {
            J j4 = this.f13829D;
            j4.b(j4.f13919n + 1);
        }
    }

    public final void x() {
        if (this.G) {
            C0237s c0237s = this.f13828C;
            Y y2 = (C1111t) c0237s.f3793c;
            Y y6 = ((Y) c0237s.f3794d).f13991u;
            this.f13831F = null;
            while (!E4.k.a(y2, y6)) {
                if ((y2 != null ? y2.f13988K : null) != null) {
                    this.f13831F = y2;
                    break;
                }
                y2 = y2 != null ? y2.f13991u : null;
            }
        }
        Y y7 = this.f13831F;
        if (y7 != null && y7.f13988K == null) {
            p027e3.a.z0("layer was not set");
            throw null;
        }
        if (y7 != null) {
            y7.S0();
            return;
        }
        D dR = r();
        if (dR != null) {
            dR.x();
        }
    }

    public final void y() {
        C0237s c0237s = this.f13828C;
        Y y2 = (Y) c0237s.f3794d;
        C1111t c1111t = (C1111t) c0237s.f3793c;
        while (y2 != c1111t) {
            E4.k.d("null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator", y2);
            C1116y c1116y = (C1116y) y2;
            e0 e0Var = c1116y.f13988K;
            if (e0Var != null) {
                e0Var.invalidate();
            }
            y2 = c1116y.f13990t;
        }
        e0 e0Var2 = ((C1111t) c0237s.f3793c).f13988K;
        if (e0Var2 != null) {
            e0Var2.invalidate();
        }
    }

    @Override // p124x0.g0
    public final boolean z() {
        return D();
    }

    public D(boolean z5, int i) {
        this.f13835h = z5;
        this.i = i;
        this.f13838l = new C0495p(new d(new D[16]), 29, new I(12, this));
        this.f13846t = new d(new D[16]);
        this.f13847u = true;
        this.f13848v = f13823N;
        this.f13850x = AbstractC1098f.f14022b;
        this.f13851y = S0.k.f4897h;
        this.f13852z = f13824O;
        InterfaceC0243v.f3829a.getClass();
        this.f13826A = C0241u.f3822b;
        this.f13833L = 3;
        this.f13834M = 3;
        this.f13828C = new C0237s(this);
        this.f13829D = new J(this);
        this.G = true;
        this.H = l.f5957a;
    }
}
