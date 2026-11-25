package p124x0;

import B.C0003b0;
import D4.c;
import N.C0237s;
import O1.u;
import P.d;
import S0.h;
import S0.k;
import S1.h0;
import X.AbstractC0391h;
import X.t;
import Z.n;
import android.view.View;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedHashMap;
import p015c2.AbstractC0473d;
import p027e3.a;
import p030f0.b;
import p030f0.f;
import p035g0.A;
import p035g0.H;
import p035g0.InterfaceC0714o;
import p035g0.J;
import p035g0.P;
import p035g0.x;
import p058l0.I;
import p089q4.m;
import p113v0.D;
import p113v0.E;
import p113v0.G;
import p113v0.InterfaceC1033p;
import p113v0.U;
import p130y0.C1134h0;
import p130y0.C1142l0;
import p130y0.C1167y0;
import p130y0.I0;
import p130y0.J0;
import p130y0.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y extends M implements E, InterfaceC1033p, g0 {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final J f13977L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final C1112u f13978M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final float[] f13979N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final C1096d f13980O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final C1096d f13981P;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public G f13983B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public LinkedHashMap f13984C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f13986E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public b f13987F;
    public C1112u G;
    public boolean J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public e0 f13988K;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final D f13989s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Y f13990t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Y f13991u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f13992v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f13993w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c f13994x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public S0.b f13995y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public k f13996z;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f13982A = 0.8f;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f13985D = 0;
    public final C0003b0 H = new C0003b0(23, this);
    public final I I = new I(15, this);

    static {
        J j4 = new J();
        j4.i = 1.0f;
        j4.f9018j = 1.0f;
        j4.f9019k = 1.0f;
        long j6 = x.f9092a;
        j4.f9021m = j6;
        j4.f9022n = j6;
        j4.f9024p = 8.0f;
        j4.f9025q = P.f9051b;
        j4.f9026r = H.f9016a;
        j4.f9028t = 9205357640488583168L;
        j4.f9029u = new S0.c(1.0f, 1.0f);
        j4.f9030v = k.f4897h;
        f13977L = j4;
        f13978M = new C1112u();
        f13979N = A.a();
        f13980O = new C1096d(1);
        f13981P = new C1096d(2);
    }

    public Y(D d6) {
        this.f13989s = d6;
        this.f13995y = d6.f13850x;
        this.f13996z = d6.f13851y;
    }

    public static Y d1(InterfaceC1033p interfaceC1033p) {
        Y y2;
        D d6 = interfaceC1033p instanceof D ? (D) interfaceC1033p : null;
        if (d6 != null && (y2 = d6.f13131h.f13939s) != null) {
            return y2;
        }
        E4.k.d("null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator", interfaceC1033p);
        return (Y) interfaceC1033p;
    }

    public final void A0(Y y2, b bVar, boolean z5) {
        if (y2 == this) {
            return;
        }
        Y y6 = this.f13991u;
        if (y6 != null) {
            y6.A0(y2, bVar, z5);
        }
        long j4 = this.f13985D;
        float f6 = (int) (j4 >> 32);
        bVar.f8833a -= f6;
        bVar.f8835c -= f6;
        float f7 = (int) (j4 & 4294967295L);
        bVar.f8834b -= f7;
        bVar.f8836d -= f7;
        e0 e0Var = this.f13988K;
        if (e0Var != null) {
            e0Var.g(bVar, true);
            if (this.f13993w && z5) {
                long j6 = this.f13138j;
                bVar.a(0.0f, 0.0f, (int) (j6 >> 32), (int) (j6 & 4294967295L));
            }
        }
    }

    public final long B0(Y y2, long j4) {
        if (y2 == this) {
            return j4;
        }
        Y y6 = this.f13991u;
        return (y6 == null || E4.k.a(y2, y6)) ? J0(j4) : J0(y6.B0(y2, j4));
    }

    public final long C0(long j4) {
        return h0.f(Math.max(0.0f, (f.d(j4) - f0()) / 2.0f), Math.max(0.0f, (f.b(j4) - ((int) (this.f13138j & 4294967295L))) / 2.0f));
    }

    public final float D0(long j4, long j6) {
        if (f0() >= f.d(j6) && ((int) (this.f13138j & 4294967295L)) >= f.b(j6)) {
            return Float.POSITIVE_INFINITY;
        }
        long jC0 = C0(j6);
        float fD = f.d(jC0);
        float fB = f.b(jC0);
        float fD2 = p030f0.c.d(j4);
        float fMax = Math.max(0.0f, fD2 < 0.0f ? -fD2 : fD2 - f0());
        float fE = p030f0.c.e(j4);
        long jY = p081p0.c.y(fMax, Math.max(0.0f, fE < 0.0f ? -fE : fE - ((int) (this.f13138j & 4294967295L))));
        if ((fD <= 0.0f && fB <= 0.0f) || p030f0.c.d(jY) > fD || p030f0.c.e(jY) > fB) {
            return Float.POSITIVE_INFINITY;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jY >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jY & 4294967295L));
        return (fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat);
    }

    public final void E0(InterfaceC0714o interfaceC0714o, p048j0.b bVar) {
        e0 e0Var = this.f13988K;
        if (e0Var != null) {
            e0Var.d(interfaceC0714o, bVar);
            return;
        }
        long j4 = this.f13985D;
        float f6 = (int) (j4 >> 32);
        float f7 = (int) (j4 & 4294967295L);
        interfaceC0714o.g(f6, f7);
        G0(interfaceC0714o, bVar);
        interfaceC0714o.g(-f6, -f7);
    }

    public final void F0(InterfaceC0714o interfaceC0714o, u uVar) {
        long j4 = this.f13138j;
        interfaceC0714o.getClass();
        interfaceC0714o.d(0.5f, 0.5f, ((int) (j4 >> 32)) - 0.5f, ((int) (j4 & 4294967295L)) - 0.5f, uVar);
    }

    public final void G0(InterfaceC0714o interfaceC0714o, p048j0.b bVar) {
        Y y2;
        InterfaceC0714o interfaceC0714o2;
        p048j0.b bVar2;
        n nVarN0 = N0(4);
        if (nVarN0 == null) {
            Y0(interfaceC0714o, bVar);
            return;
        }
        D d6 = this.f13989s;
        d6.getClass();
        F sharedDrawScope = ((r) AbstractC1098f.u(d6)).getSharedDrawScope();
        long jU = AbstractC0473d.U(this.f13138j);
        sharedDrawScope.getClass();
        d dVar = null;
        while (nVarN0 != null) {
            if (nVarN0 instanceof InterfaceC1107o) {
                y2 = this;
                interfaceC0714o2 = interfaceC0714o;
                bVar2 = bVar;
                sharedDrawScope.c(interfaceC0714o2, jU, y2, (InterfaceC1107o) nVarN0, bVar2);
            } else {
                y2 = this;
                interfaceC0714o2 = interfaceC0714o;
                bVar2 = bVar;
                if ((nVarN0.f5959j & 4) != 0 && (nVarN0 instanceof AbstractC1105m)) {
                    int i = 0;
                    for (n nVar = ((AbstractC1105m) nVarN0).f14046v; nVar != null; nVar = nVar.f5962m) {
                        if ((nVar.f5959j & 4) != 0) {
                            i++;
                            if (i == 1) {
                                nVarN0 = nVar;
                            } else {
                                if (dVar == null) {
                                    dVar = new d(new n[16]);
                                }
                                if (nVarN0 != null) {
                                    dVar.c(nVarN0);
                                    nVarN0 = null;
                                }
                                dVar.c(nVar);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                interfaceC0714o = interfaceC0714o2;
                this = y2;
                bVar = bVar2;
            }
            nVarN0 = AbstractC1098f.e(dVar);
            interfaceC0714o = interfaceC0714o2;
            this = y2;
            bVar = bVar2;
        }
    }

    public abstract void H0();

    public final Y I0(Y y2) {
        D dR = y2.f13989s;
        D d6 = this.f13989s;
        if (dR == d6) {
            n nVarM0 = y2.M0();
            n nVar = M0().f5958h;
            if (!nVar.f5969t) {
                a.y0("visitLocalAncestors called on an unattached node");
                throw null;
            }
            for (n nVar2 = nVar.f5961l; nVar2 != null; nVar2 = nVar2.f5961l) {
                if ((nVar2.f5959j & 2) != 0 && nVar2 == nVarM0) {
                    return y2;
                }
            }
            return this;
        }
        while (dR.f13843q > d6.f13843q) {
            dR = dR.r();
            E4.k.c(dR);
        }
        D dR2 = d6;
        while (dR2.f13843q > dR.f13843q) {
            dR2 = dR2.r();
            E4.k.c(dR2);
        }
        while (dR != dR2) {
            dR = dR.r();
            dR2 = dR2.r();
            if (dR == null || dR2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (dR2 != d6) {
            if (dR != y2.f13989s) {
                return (C1111t) dR.f13828C.f3793c;
            }
            return y2;
        }
        return this;
    }

    @Override // p113v0.InterfaceC1033p
    public final long J(long j4) {
        if (M0().f5969t) {
            return U0(U.f(this), ((r) AbstractC1098f.u(this.f13989s)).B(j4));
        }
        a.y0("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    public final long J0(long j4) {
        long j6 = this.f13985D;
        long jY = p081p0.c.y(p030f0.c.d(j4) - ((int) (j6 >> 32)), p030f0.c.e(j4) - ((int) (j6 & 4294967295L)));
        e0 e0Var = this.f13988K;
        return e0Var != null ? e0Var.a(jY, true) : jY;
    }

    @Override // p113v0.InterfaceC1033p
    public final boolean K() {
        return M0().f5969t;
    }

    public abstract N K0();

    public final long L0() {
        return this.f13995y.S(this.f13989s.f13852z.g());
    }

    @Override // p113v0.InterfaceC1033p
    public final void M(float[] fArr) {
        f0 f0VarU = AbstractC1098f.u(this.f13989s);
        g1(d1(U.f(this)), fArr);
        r rVar = (r) f0VarU;
        rVar.y();
        A.g(fArr, rVar.f14472S);
        float fD = p030f0.c.d(rVar.f14476W);
        float fE = p030f0.c.e(rVar.f14476W);
        float[] fArr2 = rVar.f14471R;
        A.d(fArr2);
        A.h(fArr2, fD, fE);
        float fO = p130y0.H.o(fArr2, 0, fArr, 0);
        float fO2 = p130y0.H.o(fArr2, 0, fArr, 1);
        float fO3 = p130y0.H.o(fArr2, 0, fArr, 2);
        float fO4 = p130y0.H.o(fArr2, 0, fArr, 3);
        float fO5 = p130y0.H.o(fArr2, 1, fArr, 0);
        float fO6 = p130y0.H.o(fArr2, 1, fArr, 1);
        float fO7 = p130y0.H.o(fArr2, 1, fArr, 2);
        float fO8 = p130y0.H.o(fArr2, 1, fArr, 3);
        float fO9 = p130y0.H.o(fArr2, 2, fArr, 0);
        float fO10 = p130y0.H.o(fArr2, 2, fArr, 1);
        float fO11 = p130y0.H.o(fArr2, 2, fArr, 2);
        float fO12 = p130y0.H.o(fArr2, 2, fArr, 3);
        float fO13 = p130y0.H.o(fArr2, 3, fArr, 0);
        float fO14 = p130y0.H.o(fArr2, 3, fArr, 1);
        float fO15 = p130y0.H.o(fArr2, 3, fArr, 2);
        float fO16 = p130y0.H.o(fArr2, 3, fArr, 3);
        fArr[0] = fO;
        fArr[1] = fO2;
        fArr[2] = fO3;
        fArr[3] = fO4;
        fArr[4] = fO5;
        fArr[5] = fO6;
        fArr[6] = fO7;
        fArr[7] = fO8;
        fArr[8] = fO9;
        fArr[9] = fO10;
        fArr[10] = fO11;
        fArr[11] = fO12;
        fArr[12] = fO13;
        fArr[13] = fO14;
        fArr[14] = fO15;
        fArr[15] = fO16;
    }

    public abstract n M0();

    public final n N0(int i) {
        boolean zH = Z.h(i);
        n nVarM0 = M0();
        if (!zH && (nVarM0 = nVarM0.f5961l) == null) {
            return null;
        }
        for (n nVarO0 = O0(zH); nVarO0 != null && (nVarO0.f5960k & i) != 0; nVarO0 = nVarO0.f5962m) {
            if ((nVarO0.f5959j & i) != 0) {
                return nVarO0;
            }
            if (nVarO0 == nVarM0) {
                return null;
            }
        }
        return null;
    }

    public final n O0(boolean z5) {
        n nVarM0;
        C0237s c0237s = this.f13989s.f13828C;
        if (((Y) c0237s.f3794d) == this) {
            return (n) c0237s.f3796f;
        }
        if (!z5) {
            Y y2 = this.f13991u;
            if (y2 != null) {
                return y2.M0();
            }
            return null;
        }
        Y y6 = this.f13991u;
        if (y6 == null || (nVarM0 = y6.M0()) == null) {
            return null;
        }
        return nVarM0.f5962m;
    }

    @Override // p113v0.InterfaceC1033p
    public final long P() {
        return this.f13138j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [P.d] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [P.d] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final void P0(n nVar, C1096d c1096d, long j4, r rVar, boolean z5, boolean z6) {
        if (nVar == null) {
            R0(c1096d, j4, rVar, z5, z6);
            return;
        }
        rVar.g(nVar, -1.0f, z6, new W(this, nVar, c1096d, j4, rVar, z5, z6));
        Y y2 = nVar.f5964o;
        if (y2 != null) {
            n nVarO0 = y2.O0(Z.h(16));
            if (nVarO0 != null && nVarO0.f5969t) {
                n nVar2 = nVarO0.f5958h;
                if (!nVar2.f5969t) {
                    a.y0("visitLocalDescendants called on an unattached node");
                    throw null;
                }
                if ((nVar2.f5960k & 16) != 0) {
                    while (nVar2 != null) {
                        if ((nVar2.f5959j & 16) != 0) {
                            ?? E5 = nVar2;
                            ?? dVar = 0;
                            while (E5 != 0) {
                                if (E5 instanceof k0) {
                                    if (((k0) E5).O()) {
                                        return;
                                    }
                                } else if ((E5.f5959j & 16) != 0 && (E5 instanceof AbstractC1105m)) {
                                    n nVar3 = ((AbstractC1105m) E5).f14046v;
                                    int i = 0;
                                    dVar = dVar;
                                    E5 = E5;
                                    while (nVar3 != null) {
                                        if ((nVar3.f5959j & 16) != 0) {
                                            i++;
                                            dVar = dVar;
                                            if (i == 1) {
                                                E5 = nVar3;
                                            } else {
                                                if (dVar == 0) {
                                                    dVar = new d(new n[16]);
                                                }
                                                if (E5 != 0) {
                                                    dVar.c(E5);
                                                    E5 = 0;
                                                }
                                                dVar.c(nVar3);
                                            }
                                        }
                                        nVar3 = nVar3.f5962m;
                                        dVar = dVar;
                                        E5 = E5;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                E5 = AbstractC1098f.e(dVar);
                            }
                        }
                        nVar2 = nVar2.f5962m;
                    }
                }
            }
            rVar.f14058l = false;
        }
    }

    @Override // p113v0.InterfaceC1033p
    public final long Q(long j4) {
        if (!M0().f5969t) {
            a.y0("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        V0();
        while (this != null) {
            j4 = this.e1(j4);
            this = this.f13991u;
        }
        return j4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e3, code lost:
    
        if (p124x0.AbstractC1098f.g(r18.c(), p124x0.AbstractC1098f.a(r9, r20)) > 0) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q0(p124x0.C1096d r15, long r16, p124x0.r r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p124x0.Y.Q0(x0.d, long, x0.r, boolean, boolean):void");
    }

    public void R0(C1096d c1096d, long j4, r rVar, boolean z5, boolean z6) {
        Y y2 = this.f13990t;
        if (y2 != null) {
            y2.Q0(c1096d, y2.J0(j4), rVar, z5, z6);
        }
    }

    public final void S0() {
        e0 e0Var = this.f13988K;
        if (e0Var != null) {
            e0Var.invalidate();
            return;
        }
        Y y2 = this.f13991u;
        if (y2 != null) {
            y2.S0();
        }
    }

    public final boolean T0() {
        if (this.f13988K != null && this.f13982A <= 0.0f) {
            return true;
        }
        Y y2 = this.f13991u;
        if (y2 != null) {
            return y2.T0();
        }
        return false;
    }

    public final long U0(InterfaceC1033p interfaceC1033p, long j4) {
        if (interfaceC1033p instanceof D) {
            ((D) interfaceC1033p).f13131h.f13939s.V0();
            return ((D) interfaceC1033p).b(this, j4 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        Y yD1 = d1(interfaceC1033p);
        yD1.V0();
        Y yI0 = I0(yD1);
        while (yD1 != yI0) {
            j4 = yD1.e1(j4);
            yD1 = yD1.f13991u;
            E4.k.c(yD1);
        }
        return B0(yI0, j4);
    }

    public final void V0() {
        J j4 = this.f13989s.f13829D;
        int i = j4.f13907a.f13829D.f13909c;
        if (i == 3 || i == 4) {
            if (j4.f13923r.f13887D) {
                j4.e(true);
            } else {
                j4.d(true);
            }
        }
        if (i == 4) {
            H h6 = j4.f13924s;
            if (h6 == null || !h6.f13865A) {
                j4.f(true);
            } else {
                j4.g(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r7v7, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [P.d] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [P.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void W0() {
        n nVarM0;
        n nVarO0 = O0(Z.h(128));
        if (nVarO0 == null || (nVarO0.f5958h.f5960k & 128) == 0) {
            return;
        }
        AbstractC0391h abstractC0391hD = t.d();
        c cVarF = abstractC0391hD != null ? abstractC0391hD.f() : null;
        AbstractC0391h abstractC0391hE = t.e(abstractC0391hD);
        try {
            boolean zH = Z.h(128);
            if (!zH) {
                nVarM0 = M0().f5961l;
                if (nVarM0 == null) {
                }
            }
            nVarM0 = M0();
            for (n nVarO1 = O0(zH); nVarO1 != null && (nVarO1.f5960k & 128) != 0; nVarO1 = nVarO1.f5962m) {
                if ((nVarO1.f5959j & 128) != 0) {
                    ?? dVar = 0;
                    ?? E5 = nVarO1;
                    while (E5 != 0) {
                        if (E5 instanceof InterfaceC1113v) {
                            ((InterfaceC1113v) E5).r(this.f13138j);
                        } else if ((E5.f5959j & 128) != 0 && (E5 instanceof AbstractC1105m)) {
                            n nVar = ((AbstractC1105m) E5).f14046v;
                            int i = 0;
                            E5 = E5;
                            dVar = dVar;
                            while (nVar != null) {
                                if ((nVar.f5959j & 128) != 0) {
                                    i++;
                                    dVar = dVar;
                                    if (i == 1) {
                                        E5 = nVar;
                                    } else {
                                        if (dVar == 0) {
                                            dVar = new d(new n[16]);
                                        }
                                        if (E5 != 0) {
                                            dVar.c(E5);
                                            E5 = 0;
                                        }
                                        dVar.c(nVar);
                                    }
                                }
                                nVar = nVar.f5962m;
                                E5 = E5;
                                dVar = dVar;
                            }
                            if (i == 1) {
                            }
                        }
                        E5 = AbstractC1098f.e(dVar);
                    }
                }
                if (nVarO1 != nVarM0) {
                }
            }
        } finally {
            t.g(abstractC0391hD, abstractC0391hE, cVarF);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [P.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [P.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void X0() {
        boolean zH = Z.h(128);
        n nVarM0 = M0();
        if (!zH && (nVarM0 = nVarM0.f5961l) == null) {
            return;
        }
        for (n nVarO0 = O0(zH); nVarO0 != null && (nVarO0.f5960k & 128) != 0; nVarO0 = nVarO0.f5962m) {
            if ((nVarO0.f5959j & 128) != 0) {
                ?? E5 = nVarO0;
                ?? dVar = 0;
                while (E5 != 0) {
                    if (E5 instanceof InterfaceC1113v) {
                        ((InterfaceC1113v) E5).Q(this);
                    } else if ((E5.f5959j & 128) != 0 && (E5 instanceof AbstractC1105m)) {
                        n nVar = ((AbstractC1105m) E5).f14046v;
                        int i = 0;
                        E5 = E5;
                        dVar = dVar;
                        while (nVar != null) {
                            if ((nVar.f5959j & 128) != 0) {
                                i++;
                                dVar = dVar;
                                if (i == 1) {
                                    E5 = nVar;
                                } else {
                                    if (dVar == 0) {
                                        dVar = new d(new n[16]);
                                    }
                                    if (E5 != 0) {
                                        dVar.c(E5);
                                        E5 = 0;
                                    }
                                    dVar.c(nVar);
                                }
                            }
                            nVar = nVar.f5962m;
                            E5 = E5;
                            dVar = dVar;
                        }
                        if (i == 1) {
                        }
                    }
                    E5 = AbstractC1098f.e(dVar);
                }
            }
            if (nVarO0 == nVarM0) {
                return;
            }
        }
    }

    public abstract void Y0(InterfaceC0714o interfaceC0714o, p048j0.b bVar);

    public final void Z0(long j4, float f6, c cVar) {
        h1(cVar, false);
        if (!h.a(this.f13985D, j4)) {
            this.f13985D = j4;
            D d6 = this.f13989s;
            d6.f13829D.f13923r.s0();
            e0 e0Var = this.f13988K;
            if (e0Var != null) {
                e0Var.h(j4);
            } else {
                Y y2 = this.f13991u;
                if (y2 != null) {
                    y2.S0();
                }
            }
            M.y0(this);
            r rVar = d6.f13842p;
            if (rVar != null) {
                rVar.u(d6);
            }
        }
        this.f13986E = f6;
        if (this.f13935o) {
            return;
        }
        q0(new j0(v0(), this));
    }

    @Override // S0.b
    public final float a() {
        return this.f13989s.f13850x.a();
    }

    public final void a1(b bVar, boolean z5, boolean z6) {
        e0 e0Var = this.f13988K;
        if (e0Var != null) {
            if (this.f13993w) {
                if (z6) {
                    long jL0 = L0();
                    float fD = f.d(jL0) / 2.0f;
                    float fB = f.b(jL0) / 2.0f;
                    long j4 = this.f13138j;
                    bVar.a(-fD, -fB, ((int) (j4 >> 32)) + fD, ((int) (j4 & 4294967295L)) + fB);
                } else if (z5) {
                    long j6 = this.f13138j;
                    bVar.a(0.0f, 0.0f, (int) (j6 >> 32), (int) (j6 & 4294967295L));
                }
                if (bVar.b()) {
                    return;
                }
            }
            e0Var.g(bVar, false);
        }
        long j7 = this.f13985D;
        float f6 = (int) (j7 >> 32);
        bVar.f8833a += f6;
        bVar.f8835c += f6;
        float f7 = (int) (j7 & 4294967295L);
        bVar.f8834b += f7;
        bVar.f8836d += f7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [P.d] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [P.d] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public final void b1(G g6) {
        Y y2;
        G g7 = this.f13983B;
        if (g6 != g7) {
            this.f13983B = g6;
            D d6 = this.f13989s;
            if (g7 == null || g6.f() != g7.f() || g6.d() != g7.d()) {
                int iF = g6.f();
                int iD = g6.d();
                e0 e0Var = this.f13988K;
                if (e0Var != null) {
                    e0Var.b(AbstractC0473d.b(iF, iD));
                } else if (d6.E() && (y2 = this.f13991u) != null) {
                    y2.S0();
                }
                n0(AbstractC0473d.b(iF, iD));
                if (this.f13994x != null) {
                    i1(false);
                }
                boolean zH = Z.h(4);
                n nVarM0 = M0();
                if (zH || (nVarM0 = nVarM0.f5961l) != null) {
                    for (n nVarO0 = O0(zH); nVarO0 != null && (nVarO0.f5960k & 4) != 0; nVarO0 = nVarO0.f5962m) {
                        if ((nVarO0.f5959j & 4) != 0) {
                            ?? E5 = nVarO0;
                            ?? dVar = 0;
                            while (E5 != 0) {
                                if (E5 instanceof InterfaceC1107o) {
                                    ((InterfaceC1107o) E5).e0();
                                } else if ((E5.f5959j & 4) != 0 && (E5 instanceof AbstractC1105m)) {
                                    n nVar = ((AbstractC1105m) E5).f14046v;
                                    int i = 0;
                                    E5 = E5;
                                    dVar = dVar;
                                    while (nVar != null) {
                                        if ((nVar.f5959j & 4) != 0) {
                                            i++;
                                            dVar = dVar;
                                            if (i == 1) {
                                                E5 = nVar;
                                            } else {
                                                if (dVar == 0) {
                                                    dVar = new d(new n[16]);
                                                }
                                                if (E5 != 0) {
                                                    dVar.c(E5);
                                                    E5 = 0;
                                                }
                                                dVar.c(nVar);
                                            }
                                        }
                                        nVar = nVar.f5962m;
                                        E5 = E5;
                                        dVar = dVar;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                E5 = AbstractC1098f.e(dVar);
                            }
                        }
                        if (nVarO0 == nVarM0) {
                            break;
                        }
                    }
                }
                r rVar = d6.f13842p;
                if (rVar != null) {
                    rVar.u(d6);
                }
            }
            LinkedHashMap linkedHashMap = this.f13984C;
            if (((linkedHashMap == null || linkedHashMap.isEmpty()) && g6.b().isEmpty()) || E4.k.a(g6.b(), this.f13984C)) {
                return;
            }
            d6.f13829D.f13923r.f13884A.f();
            LinkedHashMap linkedHashMap2 = this.f13984C;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.f13984C = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(g6.b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [P.d] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [P.d] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final void c1(n nVar, C1096d c1096d, long j4, r rVar, boolean z5, boolean z6, float f6) {
        boolean z7;
        if (nVar == null) {
            R0(c1096d, j4, rVar, z5, z6);
            return;
        }
        switch (c1096d.f14005h) {
            case 1:
                ?? E5 = nVar;
                ?? dVar = 0;
                while (true) {
                    int i = 0;
                    if (E5 == 0) {
                        z7 = false;
                    } else {
                        if (E5 instanceof k0) {
                            if (((k0) E5).h0()) {
                                z7 = true;
                            }
                            break;
                        } else if ((E5.f5959j & 16) != 0 && (E5 instanceof AbstractC1105m)) {
                            n nVar2 = ((AbstractC1105m) E5).f14046v;
                            E5 = E5;
                            dVar = dVar;
                            while (nVar2 != null) {
                                if ((nVar2.f5959j & 16) != 0) {
                                    i++;
                                    dVar = dVar;
                                    if (i == 1) {
                                        E5 = nVar2;
                                    } else {
                                        if (dVar == 0) {
                                            dVar = new d(new n[16]);
                                        }
                                        if (E5 != 0) {
                                            dVar.c(E5);
                                            E5 = 0;
                                        }
                                        dVar.c(nVar2);
                                    }
                                }
                                nVar2 = nVar2.f5962m;
                                E5 = E5;
                                dVar = dVar;
                            }
                            if (i == 1) {
                            }
                        }
                        E5 = AbstractC1098f.e(dVar);
                    }
                    break;
                }
                break;
            default:
                z7 = false;
                break;
        }
        if (!z7) {
            c1(AbstractC1098f.d(nVar, c1096d.a()), c1096d, j4, rVar, z5, z6, f6);
            return;
        }
        X x6 = new X(this, nVar, c1096d, j4, rVar, z5, z6, f6, 1);
        if (rVar.f14056j == m.L(rVar)) {
            rVar.g(nVar, f6, z6, x6);
            if (rVar.f14056j + 1 == m.L(rVar)) {
                rVar.i();
                return;
            }
            return;
        }
        long jC = rVar.c();
        int i3 = rVar.f14056j;
        rVar.f14056j = m.L(rVar);
        rVar.g(nVar, f6, z6, x6);
        if (rVar.f14056j + 1 < m.L(rVar) && AbstractC1098f.g(jC, rVar.c()) > 0) {
            int i6 = rVar.f14056j + 1;
            int i7 = i3 + 1;
            Object[] objArr = rVar.f14055h;
            p089q4.k.e0(objArr, objArr, i7, i6, rVar.f14057k);
            long[] jArr = rVar.i;
            System.arraycopy(jArr, i6, jArr, i7, rVar.f14057k - i6);
            rVar.f14056j = ((rVar.f14057k + i3) - rVar.f14056j) - 1;
        }
        rVar.i();
        rVar.f14056j = i3;
    }

    @Override // p113v0.InterfaceC1033p
    public final long e(long j4) {
        if (!M0().f5969t) {
            a.y0("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        InterfaceC1033p interfaceC1033pF = U.f(this);
        r rVar = (r) AbstractC1098f.u(this.f13989s);
        rVar.y();
        return U0(interfaceC1033pF, p030f0.c.g(A.b(j4, rVar.f14473T), interfaceC1033pF.Q(0L)));
    }

    public final long e1(long j4) {
        e0 e0Var = this.f13988K;
        if (e0Var != null) {
            j4 = e0Var.a(j4, false);
        }
        long j6 = this.f13985D;
        return p081p0.c.y(p030f0.c.d(j4) + ((int) (j6 >> 32)), p030f0.c.e(j4) + ((int) (j6 & 4294967295L)));
    }

    public final void f1(Y y2, float[] fArr) {
        if (E4.k.a(y2, this)) {
            return;
        }
        Y y6 = this.f13991u;
        E4.k.c(y6);
        y6.f1(y2, fArr);
        if (!h.a(this.f13985D, 0L)) {
            float[] fArr2 = f13979N;
            A.d(fArr2);
            long j4 = this.f13985D;
            A.h(fArr2, -((int) (j4 >> 32)), -((int) (j4 & 4294967295L)));
            A.g(fArr, fArr2);
        }
        e0 e0Var = this.f13988K;
        if (e0Var != null) {
            e0Var.f(fArr);
        }
    }

    @Override // p113v0.InterfaceC1033p
    public final void g(InterfaceC1033p interfaceC1033p, float[] fArr) {
        Y yD1 = d1(interfaceC1033p);
        yD1.V0();
        Y yI0 = I0(yD1);
        A.d(fArr);
        yD1.g1(yI0, fArr);
        f1(yI0, fArr);
    }

    public final void g1(Y y2, float[] fArr) {
        while (!this.equals(y2)) {
            e0 e0Var = this.f13988K;
            if (e0Var != null) {
                e0Var.c(fArr);
            }
            long j4 = this.f13985D;
            if (!h.a(j4, 0L)) {
                float[] fArr2 = f13979N;
                A.d(fArr2);
                A.h(fArr2, (int) (j4 >> 32), (int) (j4 & 4294967295L));
                A.g(fArr, fArr2);
            }
            this = this.f13991u;
            E4.k.c(this);
        }
    }

    @Override // p113v0.InterfaceC1030m
    public final k getLayoutDirection() {
        return this.f13989s.f13851y;
    }

    @Override // p113v0.InterfaceC1033p
    public final long h(long j4) {
        long jQ = Q(j4);
        r rVar = (r) AbstractC1098f.u(this.f13989s);
        rVar.y();
        return A.b(jQ, rVar.f14472S);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c2  */
    public final void h1(c cVar, boolean z5) {
        r rVar;
        Reference referencePoll;
        d dVar;
        Object obj;
        C1134h0 j4;
        D d6 = this.f13989s;
        boolean z6 = (!z5 && this.f13994x == cVar && E4.k.a(this.f13995y, d6.f13850x) && this.f13996z == d6.f13851y) ? false : true;
        this.f13995y = d6.f13850x;
        this.f13996z = d6.f13851y;
        boolean zD = d6.D();
        I i = this.I;
        if (!zD || cVar == null) {
            this.f13994x = null;
            e0 e0Var = this.f13988K;
            if (e0Var != null) {
                e0Var.destroy();
                d6.G = true;
                i.invoke();
                if (M0().f5969t && (rVar = d6.f13842p) != null) {
                    rVar.u(d6);
                }
            }
            this.f13988K = null;
            this.J = false;
            return;
        }
        this.f13994x = cVar;
        if (this.f13988K != null) {
            if (z6) {
                i1(true);
                return;
            }
            return;
        }
        r rVar2 = (r) AbstractC1098f.u(d6);
        C0003b0 c0003b0 = this.H;
        do {
            d0 d0Var = rVar2.f14511v0;
            referencePoll = ((ReferenceQueue) d0Var.f14008c).poll();
            dVar = (d) d0Var.f14007b;
            if (referencePoll != null) {
                dVar.o(referencePoll);
            }
        } while (referencePoll != null);
        do {
            if (!dVar.n()) {
                obj = null;
                break;
            }
            obj = ((Reference) dVar.p(dVar.f4583j - 1)).get();
        } while (obj == null);
        e0 i3 = (e0) obj;
        if (i3 != null) {
            i3.e(c0003b0, i);
        } else if (rVar2.isHardwareAccelerated()) {
            i3 = new C1142l0(rVar2.getGraphicsContext().k(), rVar2.getGraphicsContext(), rVar2, c0003b0, i);
        } else if (rVar2.isHardwareAccelerated() && rVar2.f14477a0) {
            try {
                i3 = new C1167y0(rVar2, c0003b0, i);
            } catch (Throwable unused) {
                rVar2.f14477a0 = false;
                if (rVar2.f14464K == null) {
                    if (!I0.f14249z) {
                        p130y0.H.A(new View(rVar2.getContext()));
                    }
                    if (I0.f14245A) {
                        j4 = new C1134h0(rVar2.getContext());
                    } else {
                        j4 = new J0(rVar2.getContext());
                    }
                    rVar2.f14464K = j4;
                    rVar2.addView(j4, -1);
                }
                C1134h0 c1134h0 = rVar2.f14464K;
                E4.k.c(c1134h0);
                i3 = new I0(rVar2, c1134h0, c0003b0, i);
            }
        } else {
            if (rVar2.f14464K == null) {
                if (!I0.f14249z) {
                    p130y0.H.A(new View(rVar2.getContext()));
                }
                if (I0.f14245A) {
                    j4 = new C1134h0(rVar2.getContext());
                } else {
                    j4 = new J0(rVar2.getContext());
                }
                rVar2.f14464K = j4;
                rVar2.addView(j4, -1);
            }
            C1134h0 c1134h1 = rVar2.f14464K;
            E4.k.c(c1134h1);
            i3 = new I0(rVar2, c1134h1, c0003b0, i);
        }
        i3.b(this.f13138j);
        i3.h(this.f13985D);
        this.f13988K = i3;
        i1(true);
        d6.G = true;
        i.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [P.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [P.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // p113v0.N, p113v0.E
    public final Object i() {
        D d6 = this.f13989s;
        if (!d6.f13828C.f(64)) {
            return null;
        }
        M0();
        Object objD0 = null;
        for (n nVar = (n0) d6.f13828C.f3795e; nVar != null; nVar = nVar.f5961l) {
            if ((nVar.f5959j & 64) != 0) {
                ?? E5 = nVar;
                ?? dVar = 0;
                while (E5 != 0) {
                    if (E5 instanceof i0) {
                        objD0 = ((i0) E5).d0(d6.f13850x, objD0);
                    } else if ((E5.f5959j & 64) != 0 && (E5 instanceof AbstractC1105m)) {
                        n nVar2 = ((AbstractC1105m) E5).f14046v;
                        int i = 0;
                        E5 = E5;
                        dVar = dVar;
                        while (nVar2 != null) {
                            if ((nVar2.f5959j & 64) != 0) {
                                i++;
                                dVar = dVar;
                                if (i == 1) {
                                    E5 = nVar2;
                                } else {
                                    if (dVar == 0) {
                                        dVar = new d(new n[16]);
                                    }
                                    if (E5 != 0) {
                                        dVar.c(E5);
                                        E5 = 0;
                                    }
                                    dVar.c(nVar2);
                                }
                            }
                            nVar2 = nVar2.f5962m;
                            E5 = E5;
                            dVar = dVar;
                        }
                        if (i == 1) {
                        }
                    }
                    E5 = AbstractC1098f.e(dVar);
                }
            }
        }
        return objD0;
    }

    public final void i1(boolean z5) {
        r rVar;
        e0 e0Var = this.f13988K;
        if (e0Var == null) {
            if (this.f13994x == null) {
                return;
            }
            a.y0("null layer with a non-null layerBlock");
            throw null;
        }
        c cVar = this.f13994x;
        if (cVar == null) {
            a.z0("updateLayerParameters requires a non-null layerBlock");
            throw null;
        }
        J j4 = f13977L;
        j4.e(1.0f);
        j4.g(1.0f);
        j4.b(1.0f);
        j4.h(0.0f);
        long j6 = x.f9092a;
        j4.c(j6);
        j4.j(j6);
        if (j4.f9023o != 0.0f) {
            j4.f9017h |= 1024;
            j4.f9023o = 0.0f;
        }
        if (j4.f9024p != 8.0f) {
            j4.f9017h |= 2048;
            j4.f9024p = 8.0f;
        }
        j4.k(P.f9051b);
        j4.i(H.f9016a);
        j4.d(false);
        j4.f9028t = 9205357640488583168L;
        j4.f9031w = null;
        j4.f9017h = 0;
        D d6 = this.f13989s;
        j4.f9029u = d6.f13850x;
        j4.f9030v = d6.f13851y;
        j4.f9028t = AbstractC0473d.U(this.f13138j);
        ((r) AbstractC1098f.u(d6)).getSnapshotObserver().a(this, C1097e.f14011l, new I(16, cVar));
        C1112u c1112u = this.G;
        if (c1112u == null) {
            c1112u = new C1112u();
            this.G = c1112u;
        }
        c1112u.f14062a = j4.i;
        c1112u.f14063b = j4.f9018j;
        c1112u.f14064c = j4.f9023o;
        c1112u.f14065d = j4.f9024p;
        c1112u.f14066e = j4.f9025q;
        e0Var.j(j4);
        this.f13993w = j4.f9027s;
        this.f13982A = j4.f9019k;
        if (!z5 || (rVar = d6.f13842p) == null) {
            return;
        }
        rVar.u(d6);
    }

    @Override // p113v0.InterfaceC1033p
    public final InterfaceC1033p j() {
        if (M0().f5969t) {
            V0();
            return ((Y) this.f13989s.f13828C.f3794d).f13991u;
        }
        a.y0("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    @Override // p113v0.InterfaceC1033p
    public final long k(InterfaceC1033p interfaceC1033p, long j4) {
        return U0(interfaceC1033p, j4);
    }

    @Override // S0.b
    public final float n() {
        return this.f13989s.f13850x.n();
    }

    @Override // p113v0.InterfaceC1033p
    public final p030f0.d o(InterfaceC1033p interfaceC1033p, boolean z5) {
        if (!M0().f5969t) {
            a.y0("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        if (!interfaceC1033p.K()) {
            a.y0("LayoutCoordinates " + interfaceC1033p + " is not attached!");
            throw null;
        }
        Y yD1 = d1(interfaceC1033p);
        yD1.V0();
        Y yI0 = I0(yD1);
        b bVar = this.f13987F;
        if (bVar == null) {
            bVar = new b();
            bVar.f8833a = 0.0f;
            bVar.f8834b = 0.0f;
            bVar.f8835c = 0.0f;
            bVar.f8836d = 0.0f;
            this.f13987F = bVar;
        }
        bVar.f8833a = 0.0f;
        bVar.f8834b = 0.0f;
        bVar.f8835c = (int) (interfaceC1033p.P() >> 32);
        bVar.f8836d = (int) (interfaceC1033p.P() & 4294967295L);
        while (yD1 != yI0) {
            yD1.a1(bVar, z5, false);
            if (bVar.b()) {
                return p030f0.d.f8838e;
            }
            yD1 = yD1.f13991u;
            E4.k.c(yD1);
        }
        A0(yI0, bVar, z5);
        return new p030f0.d(bVar.f8833a, bVar.f8834b, bVar.f8835c, bVar.f8836d);
    }

    @Override // p124x0.M
    public final M r0() {
        return this.f13990t;
    }

    @Override // p124x0.M
    public final InterfaceC1033p s0() {
        return this;
    }

    @Override // p124x0.M
    public final boolean t0() {
        return this.f13983B != null;
    }

    @Override // p124x0.M
    public final D u0() {
        return this.f13989s;
    }

    @Override // p124x0.M
    public final G v0() {
        G g6 = this.f13983B;
        if (g6 != null) {
            return g6;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // p124x0.M
    public final M w0() {
        return this.f13991u;
    }

    @Override // p124x0.M
    public final long x0() {
        return this.f13985D;
    }

    @Override // p124x0.g0
    public final boolean z() {
        return (this.f13988K == null || this.f13992v || !this.f13989s.D()) ? false : true;
    }

    @Override // p124x0.M
    public final void z0() {
        h0(this.f13985D, this.f13986E, this.f13994x);
    }
}
