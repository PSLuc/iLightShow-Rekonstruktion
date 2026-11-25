package p024e0;

import B.C0024m;
import E4.k;
import E4.w;
import F.L;
import N.C0237s;
import P.d;
import Z.n;
import androidx.compose.ui.focus.b;
import kotlin.NoWhenBranchMatchedException;
import p027e3.a;
import p080p.x;
import p118w0.e;
import p124x0.AbstractC1098f;
import p124x0.AbstractC1105m;
import p124x0.D;
import p124x0.InterfaceC1103k;
import p124x0.Y;
import p124x0.a0;
import p124x0.n0;

/* JADX INFO: loaded from: classes.dex */
public final class r extends n implements InterfaceC1103k, a0, e {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8673u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f8674v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public q f8675w;

    public static final boolean A0(r rVar) {
        n nVar = rVar.f5958h;
        if (!nVar.f5969t) {
            a.y0("visitSubtreeIf called on an unattached node");
            throw null;
        }
        d dVar = new d(new n[16]);
        n nVar2 = nVar.f5962m;
        if (nVar2 == null) {
            AbstractC1098f.b(dVar, nVar);
        } else {
            dVar.c(nVar2);
        }
        loop0: while (dVar.n()) {
            n nVar3 = (n) dVar.p(dVar.f4583j - 1);
            if ((nVar3.f5960k & 1024) != 0) {
                for (n nVar4 = nVar3; nVar4 != null; nVar4 = nVar4.f5962m) {
                    if ((nVar4.f5959j & 1024) != 0) {
                        d dVar2 = null;
                        n nVarE = nVar4;
                        while (nVarE != null) {
                            if (nVarE instanceof r) {
                                r rVar2 = (r) nVarE;
                                if (rVar2.f8675w != null) {
                                    int iOrdinal = rVar2.z0().ordinal();
                                    if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                                        if (iOrdinal == 3) {
                                            break loop0;
                                        }
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return true;
                                }
                            } else if ((nVarE.f5959j & 1024) != 0 && (nVarE instanceof AbstractC1105m)) {
                                int i = 0;
                                for (n nVar5 = ((AbstractC1105m) nVarE).f14046v; nVar5 != null; nVar5 = nVar5.f5962m) {
                                    if ((nVar5.f5959j & 1024) != 0) {
                                        i++;
                                        if (i == 1) {
                                            nVarE = nVar5;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new d(new n[16]);
                                            }
                                            if (nVarE != null) {
                                                dVar2.c(nVarE);
                                                nVarE = null;
                                            }
                                            dVar2.c(nVar5);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            nVarE = AbstractC1098f.e(dVar2);
                        }
                    }
                }
            }
            AbstractC1098f.b(dVar, nVar3);
        }
        return false;
    }

    public static final boolean B0(r rVar) {
        C0237s c0237s;
        n nVar = rVar.f5958h;
        if (!nVar.f5969t) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        n nVar2 = nVar.f5961l;
        D dS = AbstractC1098f.s(rVar);
        loop0: while (dS != null) {
            if ((((n) dS.f13828C.f3796f).f5960k & 1024) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f5959j & 1024) != 0) {
                        n nVarE = nVar2;
                        d dVar = null;
                        while (nVarE != null) {
                            if (nVarE instanceof r) {
                                r rVar2 = (r) nVarE;
                                if (rVar2.f8675w != null) {
                                    int iOrdinal = rVar2.z0().ordinal();
                                    if (iOrdinal == 0) {
                                        break loop0;
                                    }
                                    if (iOrdinal == 1) {
                                        return true;
                                    }
                                    if (iOrdinal != 2 && iOrdinal != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    break loop0;
                                    break loop0;
                                }
                            } else if ((nVarE.f5959j & 1024) != 0 && (nVarE instanceof AbstractC1105m)) {
                                int i = 0;
                                for (n nVar3 = ((AbstractC1105m) nVarE).f14046v; nVar3 != null; nVar3 = nVar3.f5962m) {
                                    if ((nVar3.f5959j & 1024) != 0) {
                                        i++;
                                        if (i == 1) {
                                            nVarE = nVar3;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new d(new n[16]);
                                            }
                                            if (nVarE != null) {
                                                dVar.c(nVarE);
                                                nVarE = null;
                                            }
                                            dVar.c(nVar3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            nVarE = AbstractC1098f.e(dVar);
                        }
                    }
                    nVar2 = nVar2.f5961l;
                }
            }
            dS = dS.r();
            nVar2 = (dS == null || (c0237s = dS.f13828C) == null) ? null : (n0) c0237s.f3795e;
        }
        return false;
    }

    public final void C0() {
        q qVar = this.f8675w;
        if (qVar == null) {
            if (qVar != null) {
                throw new IllegalStateException("Re-initializing focus target node.");
            }
            L lE = d.E(this);
            try {
                if (lE.f1105b) {
                    L.a(lE);
                }
                lE.f1105b = true;
                D0((B0(this) && A0(this)) ? q.i : q.f8671j);
                L.b(lE);
            } catch (Throwable th) {
                L.b(lE);
                throw th;
            }
        }
        int iOrdinal = z0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 2) {
            w wVar = new w();
            AbstractC1098f.p(this, new C0024m(wVar, 9, this));
            Object obj = wVar.f1074h;
            if (obj == null) {
                k.m("focusProperties");
                throw null;
            }
            if (((i) obj).a()) {
                return;
            }
            ((b) ((p130y0.r) AbstractC1098f.t(this)).getFocusOwner()).a(8, true, true);
        }
    }

    @Override // p124x0.a0
    public final void D() {
        q qVarZ0 = z0();
        C0();
        if (qVarZ0 != z0()) {
            d.A(this);
        }
    }

    public final void D0(q qVar) {
        ((x) d.E(this).f1106c).i(this, qVar);
    }

    @Override // Z.n
    public final boolean o0() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002e  */
    @Override // Z.n
    public final void s0() {
        int iOrdinal = z0().ordinal();
        if (iOrdinal == 0) {
            ((b) ((p130y0.r) AbstractC1098f.t(this)).getFocusOwner()).a(8, true, false);
            d.q(this);
        } else if (iOrdinal == 1) {
            L lE = d.E(this);
            try {
                if (lE.f1105b) {
                    L.a(lE);
                }
                lE.f1105b = true;
                D0(q.f8671j);
                L.b(lE);
            } catch (Throwable th) {
                L.b(lE);
                throw th;
            }
        } else if (iOrdinal == 2) {
            ((b) ((p130y0.r) AbstractC1098f.t(this)).getFocusOwner()).a(8, true, false);
            d.q(this);
        }
        this.f8675w = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [P.d] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [P.d] */
    /* JADX WARN: Type inference failed for: r7v4 */
    public final j y0() {
        C0237s c0237s;
        j jVar = new j();
        jVar.f8655a = true;
        n nVar = n.f8666b;
        jVar.f8656b = nVar;
        jVar.f8657c = nVar;
        jVar.f8658d = nVar;
        jVar.f8659e = nVar;
        jVar.f8660f = nVar;
        jVar.f8661g = nVar;
        jVar.f8662h = nVar;
        jVar.i = nVar;
        jVar.f8663j = h.f8650j;
        jVar.f8664k = h.f8651k;
        n nVar2 = this.f5958h;
        if (!nVar2.f5969t) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        D dS = AbstractC1098f.s(this);
        n nVar3 = nVar2;
        loop0: while (dS != null) {
            if ((((n) dS.f13828C.f3796f).f5960k & 3072) != 0) {
                while (nVar3 != null) {
                    int i = nVar3.f5959j;
                    if ((i & 3072) != 0) {
                        if (nVar3 != nVar2 && (i & 1024) != 0) {
                            break loop0;
                        }
                        if ((i & 2048) != 0) {
                            ?? E5 = nVar3;
                            ?? dVar = 0;
                            while (E5 != 0) {
                                if (E5 instanceof l) {
                                    ((l) E5).P(jVar);
                                } else if ((E5.f5959j & 2048) != 0 && (E5 instanceof AbstractC1105m)) {
                                    n nVar4 = ((AbstractC1105m) E5).f14046v;
                                    int i3 = 0;
                                    E5 = E5;
                                    dVar = dVar;
                                    while (nVar4 != null) {
                                        if ((nVar4.f5959j & 2048) != 0) {
                                            i3++;
                                            dVar = dVar;
                                            if (i3 == 1) {
                                                E5 = nVar4;
                                            } else {
                                                if (dVar == 0) {
                                                    dVar = new d(new n[16]);
                                                }
                                                if (E5 != 0) {
                                                    dVar.c(E5);
                                                    E5 = 0;
                                                }
                                                dVar.c(nVar4);
                                            }
                                        }
                                        nVar4 = nVar4.f5962m;
                                        E5 = E5;
                                        dVar = dVar;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                E5 = AbstractC1098f.e(dVar);
                            }
                        }
                    }
                    nVar3 = nVar3.f5961l;
                }
            }
            dS = dS.r();
            nVar3 = (dS == null || (c0237s = dS.f13828C) == null) ? null : (n0) c0237s.f3795e;
        }
        return jVar;
    }

    public final q z0() {
        q qVar;
        D d6;
        p130y0.r rVar;
        g focusOwner;
        Y y2 = this.f5958h.f5964o;
        L l6 = (y2 == null || (d6 = y2.f13989s) == null || (rVar = d6.f13842p) == null || (focusOwner = rVar.getFocusOwner()) == null) ? null : ((b) focusOwner).f6705h;
        if (l6 != null && (qVar = (q) ((x) l6.f1106c).e(this)) != null) {
            return qVar;
        }
        q qVar2 = this.f8675w;
        return qVar2 == null ? q.f8671j : qVar2;
    }
}
