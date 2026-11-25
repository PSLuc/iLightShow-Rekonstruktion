package p124x0;

import E0.h;
import N.C0237s;
import O1.u;
import P.d;
import Z.n;
import c5.C0495p;
import p035g0.H;
import p035g0.InterfaceC0714o;
import p035g0.r;
import p048j0.b;
import p081p0.c;
import p113v0.C1029l;
import p113v0.F;
import p113v0.N;

/* JADX INFO: renamed from: x0.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1111t extends Y {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final u f14059S;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final n0 f14060Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public C1110s f14061R;

    static {
        u uVarG = H.g();
        int i = r.f9086m;
        uVarG.n(r.f9081g);
        uVarG.t(1.0f);
        uVarG.u(1);
        f14059S = uVarG;
    }

    public C1111t(D d6) {
        super(d6);
        n0 n0Var = new n0();
        n0Var.f5960k = 0;
        this.f14060Q = n0Var;
        n0Var.f5964o = this;
        this.f14061R = d6.f13836j != null ? new C1110s(this) : null;
    }

    @Override // p124x0.Y
    public final void H0() {
        if (this.f14061R == null) {
            this.f14061R = new C1110s(this);
        }
    }

    @Override // p124x0.Y
    public final N K0() {
        return this.f14061R;
    }

    @Override // p124x0.Y
    public final n M0() {
        return this.f14060Q;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00b4 A[PHI: r3
  0x00b4: PHI (r3v3 x0.r) = (r3v2 x0.r), (r3v4 x0.r), (r3v4 x0.r), (r3v4 x0.r) binds: [B:37:0x006a, B:43:0x00a0, B:45:0x00a9, B:48:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b9 A[LOOP:0: B:36:0x0062->B:52:0x00b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x00bb A[SYNTHETIC] */
    @Override // p124x0.Y
    public final void R0(C1096d c1096d, long j4, r rVar, boolean z5, boolean z6) {
        boolean z7;
        boolean z8;
        e0 e0Var;
        long j6 = j4;
        r rVar2 = rVar;
        boolean z9 = false;
        D d6 = this.f13989s;
        switch (c1096d.f14005h) {
            case 1:
                z7 = true;
                break;
            default:
                h hVarN = d6.n();
                z7 = !(hVarN != null && hVarN.f940j);
                break;
        }
        if (z7) {
            if (c.p0(j6) && ((e0Var = this.f13988K) == null || !this.f13993w || e0Var.k(j6))) {
                z8 = z6;
            } else {
                if (z5) {
                    float fD0 = D0(j6, L0());
                    if (!Float.isInfinite(fD0) && !Float.isNaN(fD0)) {
                        z8 = false;
                    }
                }
                z8 = z6;
            }
            z9 = true;
        } else {
            z8 = z6;
        }
        if (z9) {
            int i = rVar2.f14056j;
            d dVarT = d6.t();
            int i3 = dVarT.f4583j;
            if (i3 > 0) {
                Object[] objArr = dVarT.f4582h;
                int i6 = i3 - 1;
                while (true) {
                    D d7 = (D) objArr[i6];
                    if (d7.E()) {
                        switch (c1096d.f14005h) {
                            case 1:
                                d7.v(j6, rVar2, z5, z8);
                                break;
                            default:
                                C0237s c0237s = d7.f13828C;
                                ((Y) c0237s.f3794d).Q0(Y.f13981P, ((Y) c0237s.f3794d).J0(j6), rVar2, true, z8);
                                rVar2 = rVar;
                                break;
                        }
                        long jC = rVar2.c();
                        if (Float.intBitsToFloat((int) (jC >> 32)) >= 0.0f || ((int) (jC & 4294967295L)) == 0) {
                            i6--;
                            if (i6 >= 0) {
                                j6 = j4;
                            }
                        } else if (rVar2.f14058l) {
                            rVar2.f14056j = rVar2.f14057k - 1;
                            i6--;
                            if (i6 >= 0) {
                                j6 = j4;
                            }
                        }
                    } else {
                        i6--;
                        if (i6 >= 0) {
                            j6 = j4;
                        }
                    }
                }
            }
            rVar2.f14056j = i;
        }
    }

    @Override // p113v0.E
    public final int U(int i) {
        C0495p c0495pQ = this.f13989s.q();
        F fS = c0495pQ.s();
        D d6 = (D) c0495pQ.i;
        return fS.a((Y) d6.f13828C.f3794d, d6.l(), i);
    }

    @Override // p113v0.E
    public final int Y(int i) {
        C0495p c0495pQ = this.f13989s.q();
        F fS = c0495pQ.s();
        D d6 = (D) c0495pQ.i;
        return fS.e((Y) d6.f13828C.f3794d, d6.l(), i);
    }

    @Override // p124x0.Y
    public final void Y0(InterfaceC0714o interfaceC0714o, b bVar) {
        D d6 = this.f13989s;
        f0 f0VarU = AbstractC1098f.u(d6);
        d dVarT = d6.t();
        int i = dVarT.f4583j;
        if (i > 0) {
            Object[] objArr = dVarT.f4582h;
            int i3 = 0;
            do {
                D d7 = (D) objArr[i3];
                if (d7.E()) {
                    d7.j(interfaceC0714o, bVar);
                }
                i3++;
            } while (i3 < i);
        }
        if (((p130y0.r) f0VarU).getShowLayoutBounds()) {
            F0(interfaceC0714o, f14059S);
        }
    }

    @Override // p113v0.E
    public final int Z(int i) {
        C0495p c0495pQ = this.f13989s.q();
        F fS = c0495pQ.s();
        D d6 = (D) c0495pQ.i;
        return fS.i((Y) d6.f13828C.f3794d, d6.l(), i);
    }

    @Override // p113v0.E
    public final N c(long j4) {
        o0(j4);
        D d6 = this.f13989s;
        d dVarU = d6.u();
        int i = dVarU.f4583j;
        if (i > 0) {
            Object[] objArr = dVarU.f4582h;
            int i3 = 0;
            do {
                ((D) objArr[i3]).f13829D.f13923r.f13898r = 3;
                i3++;
            } while (i3 < i);
        }
        b1(d6.f13848v.c(this, d6.l(), j4));
        W0();
        return this;
    }

    @Override // p113v0.E
    public final int d(int i) {
        C0495p c0495pQ = this.f13989s.q();
        F fS = c0495pQ.s();
        D d6 = (D) c0495pQ.i;
        return fS.g((Y) d6.f13828C.f3794d, d6.l(), i);
    }

    @Override // p113v0.N
    public final void h0(long j4, float f6, D4.c cVar) {
        Z0(j4, f6, cVar);
        if (this.f13934n) {
            return;
        }
        X0();
        this.f13989s.f13829D.f13923r.u0();
    }

    @Override // p124x0.M
    public final int p0(C1029l c1029l) {
        C1110s c1110s = this.f14061R;
        if (c1110s != null) {
            return c1110s.p0(c1029l);
        }
        I i = this.f13989s.f13829D.f13923r;
        boolean z5 = i.f13899s;
        E e6 = i.f13884A;
        if (!z5) {
            J j4 = i.f13892M;
            if (j4.f13909c == 1) {
                e6.f13858f = true;
                if (e6.f13854b) {
                    j4.f13911e = true;
                    j4.f13912f = true;
                }
            } else {
                e6.f13859g = true;
            }
        }
        i.l().f13935o = true;
        i.A();
        i.l().f13935o = false;
        Integer num = (Integer) e6.i.get(c1029l);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
