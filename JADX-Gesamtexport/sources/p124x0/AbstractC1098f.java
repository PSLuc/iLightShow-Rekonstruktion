package p124x0;

import E4.k;
import N.AbstractC0231o0;
import N.C0208d;
import N.C0237s;
import P.d;
import S0.c;
import V.e;
import Z.n;
import android.view.View;
import p027e3.a;
import p113v0.C1029l;
import p130y0.r;

/* JADX INFO: renamed from: x0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1098f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1096d f14021a = new C1096d(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f14022b = new c(1.0f, 1.0f);

    public static final long a(float f6, boolean z5) {
        return ((z5 ? 1L : 0L) & 4294967295L) | (((long) Float.floatToIntBits(f6)) << 32);
    }

    public static final void b(d dVar, n nVar) {
        d dVarU = s(nVar).u();
        int i = dVarU.f4583j;
        if (i > 0) {
            int i3 = i - 1;
            Object[] objArr = dVarU.f4582h;
            do {
                dVar.c((n) ((D) objArr[i3]).f13828C.f3796f);
                i3--;
            } while (i3 >= 0);
        }
    }

    public static final int c(M m6, C1029l c1029l) {
        M mR0 = m6.r0();
        if (mR0 == null) {
            a.y0("Child of " + m6 + " cannot be null when calculating alignment line");
            throw null;
        }
        if (m6.v0().b().containsKey(c1029l)) {
            Integer num = (Integer) m6.v0().b().get(c1029l);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iE0 = mR0.e0(c1029l);
            if (iE0 != Integer.MIN_VALUE) {
                mR0.f13934n = true;
                m6.f13935o = true;
                m6.z0();
                mR0.f13934n = false;
                m6.f13935o = false;
                return c1029l instanceof C1029l ? iE0 + ((int) (mR0.x0() & 4294967295L)) : iE0 + ((int) (mR0.x0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final n d(InterfaceC1104l interfaceC1104l, int i) {
        n nVar = ((n) interfaceC1104l).f5958h.f5962m;
        if (nVar == null || (nVar.f5960k & i) == 0) {
            return null;
        }
        while (nVar != null) {
            int i3 = nVar.f5959j;
            if ((i3 & 2) != 0) {
                return null;
            }
            if ((i3 & i) != 0) {
                return nVar;
            }
            nVar = nVar.f5962m;
        }
        return null;
    }

    public static final n e(d dVar) {
        if (dVar == null || dVar.m()) {
            return null;
        }
        return (n) dVar.p(dVar.f4583j - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC1114w f(n nVar) {
        if ((nVar.f5959j & 2) != 0) {
            if (nVar instanceof InterfaceC1114w) {
                return (InterfaceC1114w) nVar;
            }
            if (nVar instanceof AbstractC1105m) {
                n nVar2 = ((AbstractC1105m) nVar).f14046v;
                while (nVar2 != 0) {
                    if (nVar2 instanceof InterfaceC1114w) {
                        return (InterfaceC1114w) nVar2;
                    }
                    nVar2 = (!(nVar2 instanceof AbstractC1105m) || (nVar2.f5959j & 2) == 0) ? nVar2.f5962m : ((AbstractC1105m) nVar2).f14046v;
                }
            }
        }
        return null;
    }

    public static final int g(long j4, long j6) {
        boolean z5 = ((int) (j4 & 4294967295L)) != 0;
        if (z5 != (((int) (4294967295L & j6)) != 0)) {
            return z5 ? -1 : 1;
        }
        return (int) Math.signum(Float.intBitsToFloat((int) (j4 >> 32)) - Float.intBitsToFloat((int) (j6 >> 32)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object h(InterfaceC1103k interfaceC1103k, AbstractC0231o0 abstractC0231o0) {
        if (!((n) interfaceC1103k).f5958h.f5969t) {
            a.y0("Cannot read CompositionLocal because the Modifier node is not currently attached.");
            throw null;
        }
        e eVar = (e) s(interfaceC1103k).f13826A;
        eVar.getClass();
        return C0208d.L(eVar, abstractC0231o0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [P.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [P.d] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static final p0 i(InterfaceC1104l interfaceC1104l, Object obj) {
        C0237s c0237s;
        n nVar = ((n) interfaceC1104l).f5958h;
        if (!nVar.f5969t) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        n nVar2 = nVar.f5961l;
        D dS = s(interfaceC1104l);
        while (dS != null) {
            if ((((n) dS.f13828C.f3796f).f5960k & 262144) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f5959j & 262144) != 0) {
                        ?? E5 = nVar2;
                        ?? dVar = 0;
                        while (E5 != 0) {
                            if (E5 instanceof p0) {
                                p0 p0Var = (p0) E5;
                                if (obj.equals(p0Var.o())) {
                                    return p0Var;
                                }
                            } else if ((E5.f5959j & 262144) != 0 && (E5 instanceof AbstractC1105m)) {
                                n nVar3 = ((AbstractC1105m) E5).f14046v;
                                int i = 0;
                                E5 = E5;
                                dVar = dVar;
                                while (nVar3 != null) {
                                    if ((nVar3.f5959j & 262144) != 0) {
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
                                    E5 = E5;
                                    dVar = dVar;
                                }
                                if (i == 1) {
                                }
                            }
                            E5 = e(dVar);
                        }
                    }
                    nVar2 = nVar2.f5961l;
                }
            }
            dS = dS.r();
            nVar2 = (dS == null || (c0237s = dS.f13828C) == null) ? null : (n0) c0237s.f3795e;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, x0.l, x0.p0] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [Z.n] */
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
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final p0 j(p0 p0Var) {
        C0237s c0237s;
        n nVar = ((n) p0Var).f5958h;
        if (!nVar.f5969t) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        n nVar2 = nVar.f5961l;
        D dS = s(p0Var);
        while (dS != null) {
            if ((((n) dS.f13828C.f3796f).f5960k & 262144) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f5959j & 262144) != 0) {
                        ?? E5 = nVar2;
                        ?? dVar = 0;
                        while (E5 != 0) {
                            if (E5 instanceof p0) {
                                p0 p0Var2 = (p0) E5;
                                if (k.a(p0Var.o(), p0Var2.o()) && p0Var.getClass() == p0Var2.getClass()) {
                                    return p0Var2;
                                }
                            } else if ((E5.f5959j & 262144) != 0 && (E5 instanceof AbstractC1105m)) {
                                n nVar3 = ((AbstractC1105m) E5).f14046v;
                                int i = 0;
                                E5 = E5;
                                dVar = dVar;
                                while (nVar3 != null) {
                                    if ((nVar3.f5959j & 262144) != 0) {
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
                                    E5 = E5;
                                    dVar = dVar;
                                }
                                if (i == 1) {
                                }
                            }
                            E5 = e(dVar);
                        }
                    }
                    nVar2 = nVar2.f5961l;
                }
            }
            dS = dS.r();
            nVar2 = (dS == null || (c0237s = dS.f13828C) == null) ? null : (n0) c0237s.f3795e;
        }
        return null;
    }

    public static final int k(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(InterfaceC1107o interfaceC1107o) {
        if (((n) interfaceC1107o).f5958h.f5969t) {
            q(interfaceC1107o, 1).S0();
        }
    }

    public static final void m(InterfaceC1114w interfaceC1114w) {
        s(interfaceC1114w).A();
    }

    public static final void n(m0 m0Var) {
        s(m0Var).B();
    }

    public static final boolean o(D d6) {
        if (d6.f13836j == null) {
            return false;
        }
        D dR = d6.r();
        return (dR != null ? dR.f13836j : null) == null || d6.f13829D.f13908b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void p(n nVar, D4.a aVar) {
        b0 b0Var = nVar.f5963n;
        if (b0Var == null) {
            b0Var = new b0((a0) nVar);
            nVar.f5963n = b0Var;
        }
        ((r) t(nVar)).getSnapshotObserver().a(b0Var, C1097e.f14012m, aVar);
    }

    public static final Y q(InterfaceC1104l interfaceC1104l, int i) {
        Y y2 = ((n) interfaceC1104l).f5958h.f5964o;
        k.c(y2);
        if (y2.M0() != interfaceC1104l || !Z.h(i)) {
            return y2;
        }
        Y y6 = y2.f13990t;
        k.c(y6);
        return y6;
    }

    public static final Y r(InterfaceC1104l interfaceC1104l) {
        if (!((n) interfaceC1104l).f5958h.f5969t) {
            a.y0("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
            throw null;
        }
        Y yQ = q(interfaceC1104l, 2);
        if (yQ.M0().f5969t) {
            return yQ;
        }
        a.y0("LayoutCoordinates is not attached.");
        throw null;
    }

    public static final D s(InterfaceC1104l interfaceC1104l) {
        Y y2 = ((n) interfaceC1104l).f5958h.f5964o;
        if (y2 != null) {
            return y2.f13989s;
        }
        a.z0("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw null;
    }

    public static final f0 t(InterfaceC1104l interfaceC1104l) {
        r rVar = s(interfaceC1104l).f13842p;
        if (rVar != null) {
            return rVar;
        }
        a.z0("This node does not have an owner.");
        throw null;
    }

    public static final f0 u(D d6) {
        r rVar = d6.f13842p;
        if (rVar != null) {
            return rVar;
        }
        a.z0("LayoutNode should be attached to an owner");
        throw null;
    }

    public static final View v(InterfaceC1104l interfaceC1104l) {
        if (((n) interfaceC1104l).f5958h.f5969t) {
            return (View) u(s(interfaceC1104l));
        }
        a.y0("Cannot get View because the Modifier node is not currently attached.");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [D4.c] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [P.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [P.d] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void w(p091r0.k kVar, D4.c cVar) {
        C0237s c0237s;
        n nVar = kVar.f5958h;
        if (!nVar.f5969t) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        n nVar2 = nVar.f5961l;
        D dS = s(kVar);
        while (dS != null) {
            if ((((n) dS.f13828C.f3796f).f5960k & 262144) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f5959j & 262144) != 0) {
                        ?? E5 = nVar2;
                        ?? dVar = 0;
                        while (E5 != 0) {
                            boolean zBooleanValue = true;
                            if (E5 instanceof p0) {
                                p0 p0Var = (p0) E5;
                                if ("androidx.compose.ui.input.pointer.PointerHoverIcon".equals(p0Var.o()) && p091r0.k.class == p0Var.getClass()) {
                                    zBooleanValue = ((Boolean) cVar.invoke(p0Var)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((E5.f5959j & 262144) != 0) && (E5 instanceof AbstractC1105m)) {
                                    n nVar3 = ((AbstractC1105m) E5).f14046v;
                                    int i = 0;
                                    E5 = E5;
                                    dVar = dVar;
                                    while (nVar3 != null) {
                                        if ((nVar3.f5959j & 262144) != 0) {
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
                                        E5 = E5;
                                        dVar = dVar;
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            E5 = e(dVar);
                        }
                    }
                    nVar2 = nVar2.f5961l;
                }
            }
            dS = dS.r();
            nVar2 = (dS == null || (c0237s = dS.f13828C) == null) ? null : (n0) c0237s.f3795e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, x0.p0] */
    /* JADX WARN: Type inference failed for: r13v0, types: [D4.c] */
    /* JADX WARN: Type inference failed for: r7v10, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [P.d] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [P.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void x(p0 p0Var, D4.c cVar) {
        n nVar = ((n) p0Var).f5958h;
        if (!nVar.f5969t) {
            a.y0("visitSubtreeIf called on an unattached node");
            throw null;
        }
        d dVar = new d(new n[16]);
        n nVar2 = nVar.f5962m;
        if (nVar2 == null) {
            b(dVar, nVar);
        } else {
            dVar.c(nVar2);
        }
        while (dVar.n()) {
            n nVar3 = (n) dVar.p(dVar.f4583j - 1);
            if ((nVar3.f5960k & 262144) != 0) {
                n nVar4 = nVar3;
                while (true) {
                    if (nVar4 != null) {
                        if ((nVar4.f5959j & 262144) != 0) {
                            ?? dVar2 = 0;
                            ?? E5 = nVar4;
                            while (E5 != 0) {
                                if (E5 instanceof p0) {
                                    p0 p0Var2 = (p0) E5;
                                    o0 o0Var = (k.a(p0Var.o(), p0Var2.o()) && p0Var.getClass() == p0Var2.getClass()) ? (o0) cVar.invoke(p0Var2) : o0.f14050h;
                                    if (o0Var != o0.f14051j) {
                                        if (o0Var == o0.i) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((E5.f5959j & 262144) != 0 && (E5 instanceof AbstractC1105m)) {
                                    n nVar5 = ((AbstractC1105m) E5).f14046v;
                                    int i = 0;
                                    E5 = E5;
                                    dVar2 = dVar2;
                                    while (nVar5 != null) {
                                        if ((nVar5.f5959j & 262144) != 0) {
                                            i++;
                                            dVar2 = dVar2;
                                            if (i == 1) {
                                                E5 = nVar5;
                                            } else {
                                                if (dVar2 == 0) {
                                                    dVar2 = new d(new n[16]);
                                                }
                                                if (E5 != 0) {
                                                    dVar2.c(E5);
                                                    E5 = 0;
                                                }
                                                dVar2.c(nVar5);
                                            }
                                        }
                                        nVar5 = nVar5.f5962m;
                                        E5 = E5;
                                        dVar2 = dVar2;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                E5 = e(dVar2);
                            }
                        }
                        nVar4 = nVar4.f5962m;
                    }
                }
            }
            b(dVar, nVar3);
        }
    }
}
