package B;

import X.AbstractC0391h;
import java.util.List;
import p015c2.AbstractC0473d;
import p113v0.AbstractC1020c;
import p113v0.InterfaceC1030m;

/* JADX INFO: loaded from: classes.dex */
public final class E implements p113v0.F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0036s0 f68a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E4.l f69b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M0.w f70c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M0.q f71d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S0.b f72e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f73f;

    /* JADX WARN: Multi-variable type inference failed */
    public E(C0036s0 c0036s0, D4.c cVar, M0.w wVar, M0.q qVar, S0.b bVar, int i) {
        this.f68a = c0036s0;
        this.f69b = (E4.l) cVar;
        this.f70c = wVar;
        this.f71d = qVar;
        this.f72e = bVar;
        this.f73f = i;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0256  */
    /* JADX WARN: Code duplicated, block: B:103:0x025c  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:53:0x0102 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x0104  */
    /* JADX WARN: Code duplicated, block: B:59:0x0112 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x0117  */
    /* JADX WARN: Code duplicated, block: B:65:0x011e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0122  */
    /* JADX WARN: Code duplicated, block: B:70:0x0134  */
    /* JADX WARN: Code duplicated, block: B:72:0x0142  */
    /* JADX WARN: Code duplicated, block: B:73:0x0144  */
    /* JADX WARN: Code duplicated, block: B:75:0x014a  */
    /* JADX WARN: Code duplicated, block: B:76:0x014c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0155  */
    /* JADX WARN: Code duplicated, block: B:83:0x0164  */
    /* JADX WARN: Code duplicated, block: B:85:0x0169  */
    /* JADX WARN: Type inference failed for: r5v23, types: [D4.c, E4.l] */
    @Override // p113v0.F
    public final p113v0.G c(p113v0.H h6, List list, long j4) {
        a1 a1Var;
        int iJ;
        int iH;
        int i;
        G0.p pVar;
        int iMin;
        int iMin2;
        int i3;
        boolean z5;
        G0.G g6;
        G0.G g7;
        G0.p pVar2;
        E e6;
        C0036s0 c0036s0;
        C0036s0 c0036s1 = this.f68a;
        AbstractC0391h abstractC0391hD = X.t.d();
        D4.c cVarF = abstractC0391hD != null ? abstractC0391hD.f() : null;
        AbstractC0391h abstractC0391hE = X.t.e(abstractC0391hD);
        try {
            a1 a1VarD = c0036s1.d();
            X.t.g(abstractC0391hD, abstractC0391hE, cVarF);
            G0.G g8 = a1VarD != null ? a1VarD.f281a : null;
            C0 c6 = c0036s1.f416a;
            S0.k layoutDirection = h6.getLayoutDirection();
            int i6 = c6.f59f;
            boolean z6 = c6.f58e;
            int i7 = c6.f56c;
            if (g8 != null) {
                G0.n nVar = g8.f1459b;
                if (nVar.f1513a.b()) {
                    a1Var = a1VarD;
                    c6.a(layoutDirection);
                    iJ = S0.a.j(j4);
                    iH = ((!z6 || i6 == 2) && S0.a.d(j4)) ? S0.a.h(j4) : Integer.MAX_VALUE;
                    if (z6 && i6 == 2) {
                        i = 1;
                    } else {
                        i = i7;
                    }
                    if (iJ != iH) {
                        pVar2 = c6.f62j;
                        if (pVar2 == null) {
                            throw new IllegalStateException("layoutIntrinsics must be called first");
                        }
                        iH = p081p0.c.O(AbstractC0029o0.n(pVar2.c()), iJ, iH);
                    }
                    pVar = c6.f62j;
                    if (pVar == null) {
                        throw new IllegalStateException("layoutIntrinsics must be called first");
                    }
                    int iG = S0.a.g(j4);
                    iMin = Math.min(0, 262142);
                    if (iH == Integer.MAX_VALUE) {
                        iMin2 = Integer.MAX_VALUE;
                    } else {
                        iMin2 = Math.min(iH, 262142);
                    }
                    if (iMin2 == Integer.MAX_VALUE) {
                        i3 = iMin;
                    } else {
                        i3 = iMin2;
                    }
                    int iC = p081p0.c.C(i3);
                    long jT = p081p0.c.t(iMin, iMin2, Math.min(iC, 0), iG != Integer.MAX_VALUE ? Math.min(iC, iG) : Integer.MAX_VALUE);
                    if (i6 == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    G0.n nVar2 = new G0.n(pVar, jT, i, z5);
                    g6 = g8;
                    g7 = new G0.G(new G0.F(c6.f54a, c6.f55b, c6.i, c6.f56c, c6.f58e, c6.f59f, c6.f60g, layoutDirection, c6.f61h, j4), nVar2, p081p0.c.R(j4, AbstractC0473d.b(AbstractC0029o0.n(nVar2.f1516d), AbstractC0029o0.n(nVar2.f1517e))));
                } else {
                    G0.F f6 = g8.f1458a;
                    if (E4.k.a(f6.f1449a, c6.f54a) && f6.f1450b.c(c6.f55b) && E4.k.a(f6.f1451c, c6.i) && f6.f1452d == i7 && f6.f1453e == z6 && f6.f1454f == i6 && E4.k.a(f6.f1455g, c6.f60g) && f6.f1456h == layoutDirection && E4.k.a(f6.i, c6.f61h)) {
                        int iJ2 = S0.a.j(j4);
                        a1Var = a1VarD;
                        long j6 = f6.f1457j;
                        if (iJ2 == S0.a.j(j6) && ((!z6 && i6 != 2) || (S0.a.h(j4) == S0.a.h(j6) && S0.a.g(j4) == S0.a.g(j6)))) {
                            G0.G g9 = g8;
                            g7 = new G0.G(new G0.F(f6.f1449a, c6.f55b, f6.f1451c, f6.f1452d, f6.f1453e, f6.f1454f, f6.f1455g, f6.f1456h, f6.i, j4), nVar, p081p0.c.R(j4, AbstractC0473d.b(AbstractC0029o0.n(nVar.f1516d), AbstractC0029o0.n(nVar.f1517e))));
                            g6 = g9;
                        }
                    } else {
                        a1Var = a1VarD;
                    }
                    c6.a(layoutDirection);
                    iJ = S0.a.j(j4);
                    if (z6) {
                    }
                    if (z6) {
                        i = i7;
                    } else {
                        i = i7;
                    }
                    if (iJ != iH) {
                        pVar2 = c6.f62j;
                        if (pVar2 == null) {
                            throw new IllegalStateException("layoutIntrinsics must be called first");
                        }
                        iH = p081p0.c.O(AbstractC0029o0.n(pVar2.c()), iJ, iH);
                    }
                    pVar = c6.f62j;
                    if (pVar == null) {
                        throw new IllegalStateException("layoutIntrinsics must be called first");
                    }
                    int iG2 = S0.a.g(j4);
                    iMin = Math.min(0, 262142);
                    if (iH == Integer.MAX_VALUE) {
                        iMin2 = Integer.MAX_VALUE;
                    } else {
                        iMin2 = Math.min(iH, 262142);
                    }
                    if (iMin2 == Integer.MAX_VALUE) {
                        i3 = iMin;
                    } else {
                        i3 = iMin2;
                    }
                    int iC2 = p081p0.c.C(i3);
                    long jT2 = p081p0.c.t(iMin, iMin2, Math.min(iC2, 0), iG2 != Integer.MAX_VALUE ? Math.min(iC2, iG2) : Integer.MAX_VALUE);
                    if (i6 == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    G0.n nVar3 = new G0.n(pVar, jT2, i, z5);
                    g6 = g8;
                    g7 = new G0.G(new G0.F(c6.f54a, c6.f55b, c6.i, c6.f56c, c6.f58e, c6.f59f, c6.f60g, layoutDirection, c6.f61h, j4), nVar3, p081p0.c.R(j4, AbstractC0473d.b(AbstractC0029o0.n(nVar3.f1516d), AbstractC0029o0.n(nVar3.f1517e))));
                }
            } else {
                a1Var = a1VarD;
                c6.a(layoutDirection);
                iJ = S0.a.j(j4);
                if (z6) {
                }
                if (z6) {
                    i = i7;
                } else {
                    i = i7;
                }
                if (iJ != iH) {
                    pVar2 = c6.f62j;
                    if (pVar2 == null) {
                        throw new IllegalStateException("layoutIntrinsics must be called first");
                    }
                    iH = p081p0.c.O(AbstractC0029o0.n(pVar2.c()), iJ, iH);
                }
                pVar = c6.f62j;
                if (pVar == null) {
                    throw new IllegalStateException("layoutIntrinsics must be called first");
                }
                int iG3 = S0.a.g(j4);
                iMin = Math.min(0, 262142);
                if (iH == Integer.MAX_VALUE) {
                    iMin2 = Integer.MAX_VALUE;
                } else {
                    iMin2 = Math.min(iH, 262142);
                }
                if (iMin2 == Integer.MAX_VALUE) {
                    i3 = iMin;
                } else {
                    i3 = iMin2;
                }
                int iC3 = p081p0.c.C(i3);
                long jT3 = p081p0.c.t(iMin, iMin2, Math.min(iC3, 0), iG3 != Integer.MAX_VALUE ? Math.min(iC3, iG3) : Integer.MAX_VALUE);
                if (i6 == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                G0.n nVar4 = new G0.n(pVar, jT3, i, z5);
                g6 = g8;
                g7 = new G0.G(new G0.F(c6.f54a, c6.f55b, c6.i, c6.f56c, c6.f58e, c6.f59f, c6.f60g, layoutDirection, c6.f61h, j4), nVar4, p081p0.c.R(j4, AbstractC0473d.b(AbstractC0029o0.n(nVar4.f1516d), AbstractC0029o0.n(nVar4.f1517e))));
            }
            long j7 = g7.f1460c;
            Integer numValueOf = Integer.valueOf((int) (j7 >> 32));
            Integer numValueOf2 = Integer.valueOf((int) (j7 & 4294967295L));
            int iIntValue = numValueOf.intValue();
            int iIntValue2 = numValueOf2.intValue();
            if (E4.k.a(g6, g7)) {
                e6 = this;
                c0036s0 = c0036s1;
            } else {
                c0036s0 = c0036s1;
                c0036s0.i.setValue(new a1(g7, a1Var != null ? a1Var.f283c : null));
                c0036s0.f430p = false;
                e6 = this;
                e6.f69b.invoke(g7);
                AbstractC0029o0.t(c0036s0, e6.f70c, e6.f71d);
            }
            c0036s0.f422g.setValue(new S0.e(e6.f72e.i0(e6.f73f == 1 ? AbstractC0029o0.n(g7.f1459b.b(0)) : 0)));
            return h6.u(iIntValue, iIntValue2, p089q4.z.U(new p084p4.h(AbstractC1020c.f13160a, Integer.valueOf(Math.round(g7.f1461d))), new p084p4.h(AbstractC1020c.f13161b, Integer.valueOf(Math.round(g7.f1462e)))), C0022l.f353j);
        } catch (Throwable th) {
            X.t.g(abstractC0391hD, abstractC0391hE, cVarF);
            throw th;
        }
    }

    @Override // p113v0.F
    public final int e(InterfaceC1030m interfaceC1030m, List list, int i) {
        C0036s0 c0036s0 = this.f68a;
        c0036s0.f416a.a(interfaceC1030m.getLayoutDirection());
        G0.p pVar = c0036s0.f416a.f62j;
        if (pVar != null) {
            return AbstractC0029o0.n(pVar.c());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }
}
