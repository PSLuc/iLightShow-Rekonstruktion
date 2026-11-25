package p024e0;

import B.C0026n;
import D4.c;
import E4.k;
import F.L;
import N.C0237s;
import Z.n;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.focus.b;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import p096s.AbstractC0916i;
import p113v0.AbstractC1022e;
import p113v0.U;
import p118w0.g;
import p124x0.AbstractC1098f;
import p124x0.AbstractC1105m;
import p124x0.D;
import p124x0.Y;
import p124x0.n0;
import p130y0.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f8641a = new int[2];

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
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [P.d] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [P.d] */
    /* JADX WARN: Type inference failed for: r5v5 */
    public static final void A(r rVar) {
        C0237s c0237s;
        n nVar = rVar.f5958h;
        if (!nVar.f5969t) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        D dS = AbstractC1098f.s(rVar);
        n nVar2 = nVar;
        while (dS != null) {
            if ((((n) dS.f13828C.f3796f).f5960k & 5120) != 0) {
                while (nVar2 != null) {
                    int i = nVar2.f5959j;
                    if ((i & 5120) != 0) {
                        if (nVar2 != nVar && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? E5 = nVar2;
                            ?? dVar = 0;
                            while (E5 != 0) {
                                if (E5 instanceof c) {
                                    c cVar = (c) E5;
                                    cVar.J(o(cVar));
                                } else if ((E5.f5959j & 4096) != 0 && (E5 instanceof AbstractC1105m)) {
                                    n nVar3 = ((AbstractC1105m) E5).f14046v;
                                    int i3 = 0;
                                    E5 = E5;
                                    dVar = dVar;
                                    while (nVar3 != null) {
                                        if ((nVar3.f5959j & 4096) != 0) {
                                            i3++;
                                            dVar = dVar;
                                            if (i3 == 1) {
                                                E5 = nVar3;
                                            } else {
                                                if (dVar == 0) {
                                                    dVar = new P.d(new n[16]);
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
                                    if (i3 == 1) {
                                    }
                                }
                                E5 = AbstractC1098f.e(dVar);
                            }
                        }
                    }
                    nVar2 = nVar2.f5961l;
                }
            }
            dS = dS.r();
            nVar2 = (dS == null || (c0237s = dS.f13828C) == null) ? null : (n0) c0237s.f3795e;
        }
    }

    public static final Boolean B(r rVar) {
        Boolean boolValueOf;
        L lE = E(rVar);
        s sVar = new s(rVar, 1);
        try {
            if (lE.f1105b) {
                L.a(lE);
            }
            lE.f1105b = true;
            ((P.d) lE.f1107d).c(sVar);
            int iD = AbstractC0916i.d(w(rVar));
            if (iD == 0) {
                boolValueOf = Boolean.valueOf(x(rVar));
            } else if (iD == 1) {
                boolValueOf = null;
            } else if (iD == 2) {
                boolValueOf = Boolean.TRUE;
            } else {
                if (iD != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                boolValueOf = null;
            }
            L.b(lE);
            return boolValueOf;
        } catch (Throwable th) {
            L.b(lE);
            throw th;
        }
    }

    public static final boolean C(r rVar, r rVar2) {
        n nVarE;
        n nVarE2;
        C0237s c0237s;
        C0237s c0237s2;
        n nVar = rVar2.f5958h;
        if (!nVar.f5969t) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        n nVar2 = nVar.f5961l;
        D dS = AbstractC1098f.s(rVar2);
        loop0: while (true) {
            if (dS == null) {
                nVarE = null;
                break;
            }
            if ((((n) dS.f13828C.f3796f).f5960k & 1024) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f5959j & 1024) != 0) {
                        nVarE = nVar2;
                        P.d dVar = null;
                        while (nVarE != null) {
                            if (nVarE instanceof r) {
                                break loop0;
                            }
                            if ((nVarE.f5959j & 1024) != 0 && (nVarE instanceof AbstractC1105m)) {
                                int i = 0;
                                for (n nVar3 = ((AbstractC1105m) nVarE).f14046v; nVar3 != null; nVar3 = nVar3.f5962m) {
                                    if ((nVar3.f5959j & 1024) != 0) {
                                        i++;
                                        if (i == 1) {
                                            nVarE = nVar3;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new P.d(new n[16]);
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
            nVar2 = (dS == null || (c0237s2 = dS.f13828C) == null) ? null : (n0) c0237s2.f3795e;
        }
        if (!k.a(nVarE, rVar)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int iOrdinal = rVar.z0().ordinal();
        q qVar = q.i;
        if (iOrdinal == 0) {
            p(rVar2);
            rVar.D0(qVar);
            return true;
        }
        if (iOrdinal == 1) {
            if (n(rVar) == null) {
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            r rVarN = n(rVar);
            if (rVarN != null ? e(rVarN, false) : true) {
                p(rVar2);
                return true;
            }
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            n nVar4 = rVar.f5958h;
            if (!nVar4.f5969t) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            n nVar5 = nVar4.f5961l;
            D dS2 = AbstractC1098f.s(rVar);
            loop4: while (true) {
                if (dS2 == null) {
                    nVarE2 = null;
                    break;
                }
                if ((((n) dS2.f13828C.f3796f).f5960k & 1024) != 0) {
                    while (nVar5 != null) {
                        if ((nVar5.f5959j & 1024) != 0) {
                            nVarE2 = nVar5;
                            P.d dVar2 = null;
                            while (nVarE2 != null) {
                                if (nVarE2 instanceof r) {
                                    break loop4;
                                }
                                if ((nVarE2.f5959j & 1024) != 0 && (nVarE2 instanceof AbstractC1105m)) {
                                    int i3 = 0;
                                    for (n nVar6 = ((AbstractC1105m) nVarE2).f14046v; nVar6 != null; nVar6 = nVar6.f5962m) {
                                        if ((nVar6.f5959j & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                nVarE2 = nVar6;
                                            } else {
                                                if (dVar2 == null) {
                                                    dVar2 = new P.d(new n[16]);
                                                }
                                                if (nVarE2 != null) {
                                                    dVar2.c(nVarE2);
                                                    nVarE2 = null;
                                                }
                                                dVar2.c(nVar6);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                nVarE2 = AbstractC1098f.e(dVar2);
                            }
                        }
                        nVar5 = nVar5.f5961l;
                    }
                }
                dS2 = dS2.r();
                nVar5 = (dS2 == null || (c0237s = dS2.f13828C) == null) ? null : (n0) c0237s.f3795e;
            }
            r rVar3 = (r) nVarE2;
            if (rVar3 == null && ((Boolean) ((b) ((r) AbstractC1098f.t(rVar)).getFocusOwner()).f6698a.d(null, null)).booleanValue()) {
                p(rVar2);
                rVar.D0(qVar);
                return true;
            }
            if (rVar3 != null && C(rVar3, rVar)) {
                boolean zC = C(rVar, rVar2);
                if (rVar.z0() != qVar) {
                    throw new IllegalStateException("Deactivated node is focused");
                }
                if (zC) {
                    A(rVar3);
                }
                return zC;
            }
        }
        return false;
    }

    public static final boolean D(View view, Integer num, Rect rect) {
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if ((!viewGroup.isFocusable() || view.hasFocus()) && !(view instanceof r)) {
            if (rect != null) {
                View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
                return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
            return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
        }
        return view.requestFocus(num.intValue(), rect);
    }

    public static final L E(r rVar) {
        return ((b) ((r) AbstractC1098f.t(rVar)).getFocusOwner()).f6705h;
    }

    public static final void F(r rVar) {
        n nVar;
        C0237s c0237s;
        n nVar2 = rVar.f5958h;
        if (!nVar2.f5969t) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        n nVar3 = nVar2.f5961l;
        D dS = AbstractC1098f.s(rVar);
        loop0: while (true) {
            nVar = null;
            if (dS == null) {
                break;
            }
            if ((((n) dS.f13828C.f3796f).f5960k & 1024) != 0) {
                while (nVar3 != null) {
                    if ((nVar3.f5959j & 1024) != 0) {
                        n nVarE = nVar3;
                        P.d dVar = null;
                        while (nVarE != null) {
                            if (nVarE instanceof r) {
                                nVar = nVarE;
                                break loop0;
                            }
                            if ((nVarE.f5959j & 1024) != 0 && (nVarE instanceof AbstractC1105m)) {
                                int i = 0;
                                for (n nVar4 = ((AbstractC1105m) nVarE).f14046v; nVar4 != null; nVar4 = nVar4.f5962m) {
                                    if ((nVar4.f5959j & 1024) != 0) {
                                        i++;
                                        if (i == 1) {
                                            nVarE = nVar4;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new P.d(new n[16]);
                                            }
                                            if (nVarE != null) {
                                                dVar.c(nVarE);
                                                nVarE = null;
                                            }
                                            dVar.c(nVar4);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            nVarE = AbstractC1098f.e(dVar);
                        }
                    }
                    nVar3 = nVar3.f5961l;
                }
            }
            dS = dS.r();
            nVar3 = (dS == null || (c0237s = dS.f13828C) == null) ? null : (n0) c0237s.f3795e;
        }
        r rVar2 = (r) nVar;
        if (rVar2 == null) {
            if (rVar.g(AbstractC1022e.f13164a) != null) {
                throw new ClassCastException();
            }
            return;
        }
        g gVar = AbstractC1022e.f13164a;
        if (rVar2.g(gVar) != null) {
            throw new ClassCastException();
        }
        if (rVar.g(gVar) != null) {
            throw new ClassCastException();
        }
    }

    public static final boolean G(int i, C0026n c0026n, r rVar, p030f0.d dVar) {
        r rVarH;
        P.d dVar2 = new P.d(new r[16]);
        n nVar = rVar.f5958h;
        if (!nVar.f5969t) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        P.d dVar3 = new P.d(new n[16]);
        n nVar2 = nVar.f5962m;
        if (nVar2 == null) {
            AbstractC1098f.b(dVar3, nVar);
        } else {
            dVar3.c(nVar2);
        }
        while (dVar3.n()) {
            n nVarE = (n) dVar3.p(dVar3.f4583j - 1);
            if ((nVarE.f5960k & 1024) == 0) {
                AbstractC1098f.b(dVar3, nVarE);
            } else {
                while (nVarE != null) {
                    if ((nVarE.f5959j & 1024) != 0) {
                        P.d dVar4 = null;
                        while (nVarE != null) {
                            if (nVarE instanceof r) {
                                r rVar2 = (r) nVarE;
                                if (rVar2.f5969t) {
                                    dVar2.c(rVar2);
                                }
                            } else if ((nVarE.f5959j & 1024) != 0 && (nVarE instanceof AbstractC1105m)) {
                                int i3 = 0;
                                for (n nVar3 = ((AbstractC1105m) nVarE).f14046v; nVar3 != null; nVar3 = nVar3.f5962m) {
                                    if ((nVar3.f5959j & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            nVarE = nVar3;
                                        } else {
                                            if (dVar4 == null) {
                                                dVar4 = new P.d(new n[16]);
                                            }
                                            if (nVarE != null) {
                                                dVar4.c(nVarE);
                                                nVarE = null;
                                            }
                                            dVar4.c(nVar3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            nVarE = AbstractC1098f.e(dVar4);
                        }
                        break;
                    }
                    nVarE = nVarE.f5962m;
                }
            }
        }
        while (dVar2.n() && (rVarH = h(dVar2, dVar, i)) != null) {
            if (rVarH.y0().f8655a) {
                return ((Boolean) c0026n.invoke(rVarH)).booleanValue();
            }
            if (l(i, c0026n, rVarH, dVar)) {
                return true;
            }
            dVar2.o(rVarH);
        }
        return false;
    }

    public static final Integer H(int i) {
        if (i == 5) {
            return 33;
        }
        if (i == 6) {
            return 130;
        }
        if (i == 3) {
            return 17;
        }
        if (i == 4) {
            return 66;
        }
        if (i == 1) {
            return 2;
        }
        return i == 2 ? 1 : null;
    }

    public static final b I(int i) {
        if (i == 1) {
            return new b(2);
        }
        if (i == 2) {
            return new b(1);
        }
        if (i == 17) {
            return new b(3);
        }
        if (i == 33) {
            return new b(5);
        }
        if (i == 66) {
            return new b(4);
        }
        if (i != 130) {
            return null;
        }
        return new b(6);
    }

    public static final Boolean J(int i, C0026n c0026n, r rVar, p030f0.d dVar) {
        int iOrdinal = rVar.z0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                r rVarN = n(rVar);
                if (rVarN == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = rVarN.z0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolJ = J(i, c0026n, rVarN, dVar);
                        if (!k.a(boolJ, Boolean.FALSE)) {
                            return boolJ;
                        }
                        if (dVar == null) {
                            if (rVarN.z0() != q.i) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            r rVarG = g(rVarN);
                            if (rVarG == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            dVar = j(rVarG);
                        }
                        return Boolean.valueOf(l(i, c0026n, rVar, dVar));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (dVar == null) {
                    dVar = j(rVarN);
                }
                return Boolean.valueOf(l(i, c0026n, rVar, dVar));
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (rVar.y0().f8655a) {
                    return (Boolean) c0026n.invoke(rVar);
                }
                return dVar == null ? Boolean.valueOf(i(rVar, i, c0026n)) : Boolean.valueOf(G(i, c0026n, rVar, dVar));
            }
        }
        return Boolean.valueOf(i(rVar, i, c0026n));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x007c A[RETURN] */
    public static final boolean a(r rVar, C0026n c0026n) {
        int iOrdinal = rVar.z0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                r rVarN = n(rVar);
                if (rVarN == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = rVarN.z0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (a(rVarN, c0026n) || m(rVar, rVarN, 2, c0026n) || (rVarN.y0().f8655a && ((Boolean) c0026n.invoke(rVarN)).booleanValue())) {
                            return true;
                        }
                        return false;
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                return m(rVar, rVarN, 2, c0026n);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!y(rVar, c0026n)) {
                    if (!(rVar.y0().f8655a ? ((Boolean) c0026n.invoke(rVar)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return y(rVar, c0026n);
    }

    public static final boolean b(p030f0.d dVar, p030f0.d dVar2, p030f0.d dVar3, int i) {
        float f6;
        float f7;
        if (c(i, dVar3, dVar) || !c(i, dVar2, dVar)) {
            return false;
        }
        float f8 = dVar3.f8840b;
        float f9 = dVar3.f8842d;
        float f10 = dVar3.f8839a;
        float f11 = dVar3.f8841c;
        float f12 = dVar.f8842d;
        float f13 = dVar.f8840b;
        float f14 = dVar.f8841c;
        float f15 = dVar.f8839a;
        if (i == 3) {
            if (f15 < f11) {
                return true;
            }
        } else if (i == 4) {
            if (f14 > f10) {
                return true;
            }
        } else if (i == 5) {
            if (f13 < f9) {
                return true;
            }
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (f12 > f8) {
                return true;
            }
        }
        if (i == 3 || i == 4) {
            return true;
        }
        if (i == 3) {
            f6 = f15 - dVar2.f8841c;
        } else if (i == 4) {
            f6 = dVar2.f8839a - f14;
        } else if (i == 5) {
            f6 = f13 - dVar2.f8842d;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f6 = dVar2.f8840b - f12;
        }
        float fMax = Math.max(0.0f, f6);
        if (i == 3) {
            f7 = f15 - f10;
        } else if (i == 4) {
            f7 = f11 - f14;
        } else if (i == 5) {
            f7 = f13 - f8;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f7 = f9 - f12;
        }
        return fMax < Math.max(1.0f, f7);
    }

    public static final boolean c(int i, p030f0.d dVar, p030f0.d dVar2) {
        if (i == 3 || i == 4) {
            return dVar.f8842d > dVar2.f8840b && dVar.f8840b < dVar2.f8842d;
        }
        if (i == 5 || i == 6) {
            return dVar.f8841c > dVar2.f8839a && dVar.f8839a < dVar2.f8841c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final p030f0.d d(View view) {
        int[] iArr = f8641a;
        view.getLocationInWindow(iArr);
        float f6 = iArr[0];
        return new p030f0.d(f6, iArr[1], view.getWidth() + f6, iArr[1] + view.getHeight());
    }

    public static final boolean e(r rVar, boolean z5) {
        int iOrdinal = rVar.z0().ordinal();
        q qVar = q.f8671j;
        if (iOrdinal == 0) {
            rVar.D0(qVar);
            A(rVar);
            return true;
        }
        if (iOrdinal == 1) {
            r rVarN = n(rVar);
            if (!(rVarN != null ? e(rVarN, z5) : true)) {
                return false;
            }
            rVar.D0(qVar);
            A(rVar);
            return true;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (z5) {
            rVar.D0(qVar);
            A(rVar);
        }
        return z5;
    }

    public static final void f(r rVar, P.d dVar) {
        n nVar = rVar.f5958h;
        if (!nVar.f5969t) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        P.d dVar2 = new P.d(new n[16]);
        n nVar2 = nVar.f5962m;
        if (nVar2 == null) {
            AbstractC1098f.b(dVar2, nVar);
        } else {
            dVar2.c(nVar2);
        }
        while (dVar2.n()) {
            n nVarE = (n) dVar2.p(dVar2.f4583j - 1);
            if ((nVarE.f5960k & 1024) == 0) {
                AbstractC1098f.b(dVar2, nVarE);
            } else {
                while (nVarE != null) {
                    if ((nVarE.f5959j & 1024) != 0) {
                        P.d dVar3 = null;
                        while (nVarE != null) {
                            if (nVarE instanceof r) {
                                r rVar2 = (r) nVarE;
                                if (rVar2.f5969t && !AbstractC1098f.s(rVar2).f13832K) {
                                    if (rVar2.y0().f8655a) {
                                        dVar.c(rVar2);
                                    } else {
                                        f(rVar2, dVar);
                                    }
                                }
                            } else if ((nVarE.f5959j & 1024) != 0 && (nVarE instanceof AbstractC1105m)) {
                                int i = 0;
                                for (n nVar3 = ((AbstractC1105m) nVarE).f14046v; nVar3 != null; nVar3 = nVar3.f5962m) {
                                    if ((nVar3.f5959j & 1024) != 0) {
                                        i++;
                                        if (i == 1) {
                                            nVarE = nVar3;
                                        } else {
                                            if (dVar3 == null) {
                                                dVar3 = new P.d(new n[16]);
                                            }
                                            if (nVarE != null) {
                                                dVar3.c(nVarE);
                                                nVarE = null;
                                            }
                                            dVar3.c(nVar3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            nVarE = AbstractC1098f.e(dVar3);
                        }
                        break;
                    }
                    nVarE = nVarE.f5962m;
                }
            }
        }
    }

    public static final r g(r rVar) {
        int iOrdinal = rVar.z0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                n nVar = rVar.f5958h;
                if (!nVar.f5969t) {
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
                P.d dVar = new P.d(new n[16]);
                n nVar2 = nVar.f5962m;
                if (nVar2 == null) {
                    AbstractC1098f.b(dVar, nVar);
                } else {
                    dVar.c(nVar2);
                }
                while (dVar.n()) {
                    n nVarE = (n) dVar.p(dVar.f4583j - 1);
                    if ((nVarE.f5960k & 1024) == 0) {
                        AbstractC1098f.b(dVar, nVarE);
                    } else {
                        while (nVarE != null) {
                            if ((nVarE.f5959j & 1024) != 0) {
                                P.d dVar2 = null;
                                while (nVarE != null) {
                                    if (nVarE instanceof r) {
                                        r rVarG = g((r) nVarE);
                                        if (rVarG != null) {
                                            return rVarG;
                                        }
                                    } else if ((nVarE.f5959j & 1024) != 0 && (nVarE instanceof AbstractC1105m)) {
                                        int i = 0;
                                        for (n nVar3 = ((AbstractC1105m) nVarE).f14046v; nVar3 != null; nVar3 = nVar3.f5962m) {
                                            if ((nVar3.f5959j & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    nVarE = nVar3;
                                                } else {
                                                    if (dVar2 == null) {
                                                        dVar2 = new P.d(new n[16]);
                                                    }
                                                    if (nVarE != null) {
                                                        dVar2.c(nVarE);
                                                        nVarE = null;
                                                    }
                                                    dVar2.c(nVar3);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    nVarE = AbstractC1098f.e(dVar2);
                                }
                                break;
                            }
                            nVarE = nVarE.f5962m;
                        }
                    }
                }
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return null;
        }
        return rVar;
    }

    public static final r h(P.d dVar, p030f0.d dVar2, int i) {
        p030f0.d dVarG;
        if (i == 3) {
            dVarG = dVar2.g(dVar2.c() + 1, 0.0f);
        } else if (i == 4) {
            dVarG = dVar2.g(-(dVar2.c() + 1), 0.0f);
        } else if (i == 5) {
            dVarG = dVar2.g(0.0f, dVar2.b() + 1);
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            dVarG = dVar2.g(0.0f, -(dVar2.b() + 1));
        }
        int i3 = dVar.f4583j;
        r rVar = null;
        if (i3 > 0) {
            Object[] objArr = dVar.f4582h;
            int i6 = 0;
            do {
                r rVar2 = (r) objArr[i6];
                if (t(rVar2)) {
                    p030f0.d dVarJ = j(rVar2);
                    if (r(i, dVarJ, dVar2) && (!r(i, dVarG, dVar2) || b(dVar2, dVarJ, dVarG, i) || (!b(dVar2, dVarG, dVarJ, i) && s(i, dVar2, dVarJ) < s(i, dVar2, dVarG)))) {
                        rVar = rVar2;
                        dVarG = dVarJ;
                    }
                }
                i6++;
            } while (i6 < i3);
        }
        return rVar;
    }

    public static final boolean i(r rVar, int i, c cVar) {
        p030f0.d dVar;
        P.d dVar2 = new P.d(new r[16]);
        f(rVar, dVar2);
        if (dVar2.f4583j <= 1) {
            r rVar2 = (r) (dVar2.m() ? null : dVar2.f4582h[0]);
            if (rVar2 != null) {
                return ((Boolean) cVar.invoke(rVar2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                p030f0.d dVarJ = j(rVar);
                float f6 = dVarJ.f8840b;
                float f7 = dVarJ.f8839a;
                dVar = new p030f0.d(f7, f6, f7, f6);
            } else {
                if (i != 3 && i != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                p030f0.d dVarJ2 = j(rVar);
                float f8 = dVarJ2.f8842d;
                float f9 = dVarJ2.f8841c;
                dVar = new p030f0.d(f9, f8, f9, f8);
            }
            r rVarH = h(dVar2, dVar, i);
            if (rVarH != null) {
                return ((Boolean) cVar.invoke(rVarH)).booleanValue();
            }
        }
        return false;
    }

    public static final p030f0.d j(r rVar) {
        Y y2 = rVar.f5964o;
        return y2 != null ? U.f(y2).o(y2, false) : p030f0.d.f8838e;
    }

    public static final boolean k(r rVar, C0026n c0026n) {
        int iOrdinal = rVar.z0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                r rVarN = n(rVar);
                if (rVarN != null) {
                    return k(rVarN, c0026n) || m(rVar, rVarN, 1, c0026n);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return rVar.y0().f8655a ? ((Boolean) c0026n.invoke(rVar)).booleanValue() : z(rVar, c0026n);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return z(rVar, c0026n);
    }

    public static final boolean l(int i, C0026n c0026n, r rVar, p030f0.d dVar) {
        if (G(i, c0026n, rVar, dVar)) {
            return true;
        }
        F(rVar);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:162:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x012c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0134  */
    /* JADX WARN: Code duplicated, block: B:89:0x0140 A[ADDED_TO_REGION, LOOP:6: B:89:0x0140->B:117:0x018d, LOOP_START, PHI: r1
  0x0140: PHI (r1v17 Z.n) = (r1v9 Z.n), (r1v18 Z.n) binds: [B:88:0x013e, B:117:0x018d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0142  */
    /* JADX WARN: Code duplicated, block: B:92:0x0148  */
    /* JADX WARN: Code duplicated, block: B:94:0x014c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0152  */
    public static final boolean m(r rVar, r rVar2, int i, C0026n c0026n) {
        n nVar;
        n nVar2;
        D dS;
        n nVar3;
        C0237s c0237s;
        n nVarE;
        P.d dVar;
        if (rVar.z0() != q.i) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        Object[] objArrCopyOf = new r[16];
        n nVar4 = rVar.f5958h;
        if (!nVar4.f5969t) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        P.d dVar2 = new P.d(new n[16]);
        n nVar5 = nVar4.f5962m;
        boolean zBooleanValue = false;
        if (nVar5 == null) {
            AbstractC1098f.b(dVar2, nVar4);
        } else {
            dVar2.c(nVar5);
        }
        int i3 = 0;
        while (dVar2.n()) {
            n nVarE2 = (n) dVar2.p(dVar2.f4583j - 1);
            if ((nVarE2.f5960k & 1024) == 0) {
                AbstractC1098f.b(dVar2, nVarE2);
            } else {
                while (nVarE2 != null) {
                    if ((nVarE2.f5959j & 1024) != 0) {
                        P.d dVar3 = null;
                        while (nVarE2 != null) {
                            if (nVarE2 instanceof r) {
                                r rVar3 = (r) nVarE2;
                                int i6 = i3 + 1;
                                if (objArrCopyOf.length < i6) {
                                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, Math.max(i6, objArrCopyOf.length * 2));
                                    k.e("copyOf(this, newSize)", objArrCopyOf);
                                }
                                objArrCopyOf[i3] = rVar3;
                                i3 = i6;
                            } else if ((nVarE2.f5959j & 1024) != 0 && (nVarE2 instanceof AbstractC1105m)) {
                                int i7 = 0;
                                for (n nVar6 = ((AbstractC1105m) nVarE2).f14046v; nVar6 != null; nVar6 = nVar6.f5962m) {
                                    if ((nVar6.f5959j & 1024) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            nVarE2 = nVar6;
                                        } else {
                                            if (dVar3 == null) {
                                                dVar3 = new P.d(new n[16]);
                                            }
                                            if (nVarE2 != null) {
                                                dVar3.c(nVarE2);
                                                nVarE2 = null;
                                            }
                                            dVar3.c(nVar6);
                                        }
                                    }
                                }
                                if (i7 == 1) {
                                }
                            }
                            nVarE2 = AbstractC1098f.e(dVar3);
                        }
                        break;
                    }
                    nVarE2 = nVarE2.f5962m;
                }
            }
        }
        t tVar = t.f8677a;
        k.f("<this>", objArrCopyOf);
        Arrays.sort(objArrCopyOf, 0, i3, tVar);
        if (i == 1) {
            int i8 = new J4.d(0, i3 - 1, 1).i;
            if (i8 >= 0) {
                boolean z5 = false;
                int i9 = 0;
                while (true) {
                    if (z5) {
                        r rVar4 = (r) objArrCopyOf[i9];
                        if (t(rVar4) && k(rVar4, c0026n)) {
                            zBooleanValue = true;
                        }
                    }
                    if (k.a(objArrCopyOf[i9], rVar2)) {
                        z5 = true;
                    }
                    if (i9 != i8) {
                        i9++;
                    }
                }
            }
            if (i != 1 && rVar.y0().f8655a) {
                nVar = rVar.f5958h;
                if (nVar.f5969t) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                nVar2 = nVar.f5961l;
                dS = AbstractC1098f.s(rVar);
                loop5: while (true) {
                    if (dS != null) {
                        nVar3 = null;
                        break;
                    }
                    if ((((n) dS.f13828C.f3796f).f5960k & 1024) != 0) {
                        while (nVar2 != null) {
                            if ((nVar2.f5959j & 1024) != 0) {
                                nVarE = nVar2;
                                dVar = null;
                                while (nVarE != null) {
                                    if (nVarE instanceof r) {
                                        nVar3 = nVarE;
                                        break loop5;
                                    }
                                    if ((nVarE.f5959j & 1024) == 0 && (nVarE instanceof AbstractC1105m)) {
                                        int i10 = 0;
                                        for (n nVar7 = ((AbstractC1105m) nVarE).f14046v; nVar7 != null; nVar7 = nVar7.f5962m) {
                                            if ((nVar7.f5959j & 1024) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    nVarE = nVar7;
                                                } else {
                                                    if (dVar == null) {
                                                        dVar = new P.d(new n[16]);
                                                    }
                                                    if (nVarE != null) {
                                                        dVar.c(nVarE);
                                                        nVarE = null;
                                                    }
                                                    dVar.c(nVar7);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    nVarE = AbstractC1098f.e(dVar);
                                }
                            }
                            nVar2 = nVar2.f5961l;
                        }
                    }
                    dS = dS.r();
                    nVar2 = (dS != null || (c0237s = dS.f13828C) == null) ? null : (n0) c0237s.f3795e;
                }
                if (nVar3 != null) {
                    zBooleanValue = ((Boolean) c0026n.invoke(rVar)).booleanValue();
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            int i11 = new J4.d(0, i3 - 1, 1).i;
            if (i11 >= 0) {
                boolean z6 = false;
                while (true) {
                    if (z6) {
                        r rVar5 = (r) objArrCopyOf[i11];
                        if (t(rVar5) && a(rVar5, c0026n)) {
                            zBooleanValue = true;
                        }
                    }
                    if (k.a(objArrCopyOf[i11], rVar2)) {
                        z6 = true;
                    }
                    if (i11 != 0) {
                        i11--;
                    }
                }
            }
            if (i != 1) {
                nVar = rVar.f5958h;
                if (nVar.f5969t) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                nVar2 = nVar.f5961l;
                dS = AbstractC1098f.s(rVar);
                loop5: while (true) {
                    if (dS != null) {
                        nVar3 = null;
                        break;
                    }
                    if ((((n) dS.f13828C.f3796f).f5960k & 1024) != 0) {
                        while (nVar2 != null) {
                            if ((nVar2.f5959j & 1024) != 0) {
                                nVarE = nVar2;
                                dVar = null;
                                while (nVarE != null) {
                                    if (nVarE instanceof r) {
                                        nVar3 = nVarE;
                                        break loop5;
                                    }
                                    if ((nVarE.f5959j & 1024) == 0) {
                                    }
                                    nVarE = AbstractC1098f.e(dVar);
                                }
                            }
                            nVar2 = nVar2.f5961l;
                        }
                    }
                    dS = dS.r();
                    if (dS != null) {
                    }
                }
                if (nVar3 != null) {
                    zBooleanValue = ((Boolean) c0026n.invoke(rVar)).booleanValue();
                }
            }
        }
        if (zBooleanValue) {
            return true;
        }
        F(rVar);
        return false;
    }

    public static final r n(r rVar) {
        int iOrdinal;
        n nVar = rVar.f5958h;
        boolean z5 = nVar.f5969t;
        if (z5) {
            if (!z5) {
                throw new IllegalStateException("visitChildren called on an unattached node");
            }
            P.d dVar = new P.d(new n[16]);
            n nVar2 = nVar.f5962m;
            if (nVar2 == null) {
                AbstractC1098f.b(dVar, nVar);
            } else {
                dVar.c(nVar2);
            }
            while (dVar.n()) {
                n nVarE = (n) dVar.p(dVar.f4583j - 1);
                if ((nVarE.f5960k & 1024) == 0) {
                    AbstractC1098f.b(dVar, nVarE);
                } else {
                    while (nVarE != null) {
                        if ((nVarE.f5959j & 1024) != 0) {
                            P.d dVar2 = null;
                            while (nVarE != null) {
                                if (nVarE instanceof r) {
                                    r rVar2 = (r) nVarE;
                                    if (rVar2.f5958h.f5969t && ((iOrdinal = rVar2.z0().ordinal()) == 0 || iOrdinal == 1 || iOrdinal == 2)) {
                                        return rVar2;
                                    }
                                } else if ((nVarE.f5959j & 1024) != 0 && (nVarE instanceof AbstractC1105m)) {
                                    int i = 0;
                                    for (n nVar3 = ((AbstractC1105m) nVarE).f14046v; nVar3 != null; nVar3 = nVar3.f5962m) {
                                        if ((nVar3.f5959j & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                nVarE = nVar3;
                                            } else {
                                                if (dVar2 == null) {
                                                    dVar2 = new P.d(new n[16]);
                                                }
                                                if (nVarE != null) {
                                                    dVar2.c(nVarE);
                                                    nVarE = null;
                                                }
                                                dVar2.c(nVar3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                nVarE = AbstractC1098f.e(dVar2);
                            }
                            break;
                        }
                        nVarE = nVarE.f5962m;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final q o(c cVar) {
        n nVar = (n) cVar;
        n nVarE = nVar.f5958h;
        P.d dVar = null;
        while (true) {
            int i = 0;
            if (nVarE == null) {
                n nVar2 = nVar.f5958h;
                if (!nVar2.f5969t) {
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
                P.d dVar2 = new P.d(new n[16]);
                n nVar3 = nVar2.f5962m;
                if (nVar3 == null) {
                    AbstractC1098f.b(dVar2, nVar2);
                } else {
                    dVar2.c(nVar3);
                }
                while (dVar2.n()) {
                    n nVarE2 = (n) dVar2.p(dVar2.f4583j - 1);
                    if ((nVarE2.f5960k & 1024) == 0) {
                        AbstractC1098f.b(dVar2, nVarE2);
                    } else {
                        while (nVarE2 != null) {
                            if ((nVarE2.f5959j & 1024) != 0) {
                                P.d dVar3 = null;
                                while (nVarE2 != null) {
                                    if (nVarE2 instanceof r) {
                                        q qVarZ0 = ((r) nVarE2).z0();
                                        int iOrdinal = qVarZ0.ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            return qVarZ0;
                                        }
                                    } else if ((nVarE2.f5959j & 1024) != 0 && (nVarE2 instanceof AbstractC1105m)) {
                                        int i3 = 0;
                                        for (n nVar4 = ((AbstractC1105m) nVarE2).f14046v; nVar4 != null; nVar4 = nVar4.f5962m) {
                                            if ((nVar4.f5959j & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    nVarE2 = nVar4;
                                                } else {
                                                    if (dVar3 == null) {
                                                        dVar3 = new P.d(new n[16]);
                                                    }
                                                    if (nVarE2 != null) {
                                                        dVar3.c(nVarE2);
                                                        nVarE2 = null;
                                                    }
                                                    dVar3.c(nVar4);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    nVarE2 = AbstractC1098f.e(dVar3);
                                }
                                break;
                            }
                            nVarE2 = nVarE2.f5962m;
                        }
                    }
                }
                return q.f8671j;
            }
            if (nVarE instanceof r) {
                q qVarZ1 = ((r) nVarE).z0();
                int iOrdinal2 = qVarZ1.ordinal();
                if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
                    return qVarZ1;
                }
            } else if ((nVarE.f5959j & 1024) != 0 && (nVarE instanceof AbstractC1105m)) {
                for (n nVar5 = ((AbstractC1105m) nVarE).f14046v; nVar5 != null; nVar5 = nVar5.f5962m) {
                    if ((nVar5.f5959j & 1024) != 0) {
                        i++;
                        if (i == 1) {
                            nVarE = nVar5;
                        } else {
                            if (dVar == null) {
                                dVar = new P.d(new n[16]);
                            }
                            if (nVarE != null) {
                                dVar.c(nVarE);
                                nVarE = null;
                            }
                            dVar.c(nVar5);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            nVarE = AbstractC1098f.e(dVar);
        }
    }

    public static final void p(r rVar) {
        AbstractC1098f.p(rVar, new s(rVar, 0));
        int iOrdinal = rVar.z0().ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            rVar.D0(q.f8670h);
        }
    }

    public static final void q(r rVar) {
        e eVar = ((b) ((r) AbstractC1098f.t(rVar)).getFocusOwner()).f6704g;
        eVar.b(eVar.f8644c, rVar);
    }

    public static final boolean r(int i, p030f0.d dVar, p030f0.d dVar2) {
        float f6 = dVar.f8839a;
        float f7 = dVar.f8841c;
        if (i == 3) {
            float f8 = dVar2.f8841c;
            float f9 = dVar2.f8839a;
            return (f8 > f7 || f9 >= f7) && f9 > f6;
        }
        if (i == 4) {
            float f10 = dVar2.f8839a;
            float f11 = dVar2.f8841c;
            return (f10 < f6 || f11 <= f6) && f11 < f7;
        }
        float f12 = dVar.f8840b;
        float f13 = dVar.f8842d;
        if (i == 5) {
            float f14 = dVar2.f8842d;
            float f15 = dVar2.f8840b;
            return (f14 > f13 || f15 >= f13) && f15 > f12;
        }
        if (i != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f16 = dVar2.f8840b;
        float f17 = dVar2.f8842d;
        return (f16 < f12 || f17 <= f12) && f17 < f13;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    public static final long s(int i, p030f0.d dVar, p030f0.d dVar2) {
        float f6;
        float f7;
        float f8;
        float fB;
        float fB2;
        float f9 = dVar2.f8840b;
        float f10 = dVar2.f8839a;
        if (i != 3) {
            if (i == 4) {
                f6 = f10 - dVar.f8841c;
            } else if (i == 5) {
                f7 = dVar.f8840b;
                f8 = dVar2.f8842d;
            } else {
                if (i != 6) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                f6 = f9 - dVar.f8842d;
            }
            long jAbs = (long) Math.abs(Math.max(0.0f, f6));
            if (i != 3 || i == 4) {
                float f11 = 2;
                fB = (dVar.b() / f11) + dVar.f8840b;
                fB2 = (dVar2.b() / f11) + f9;
            } else {
                if (i != 5 && i != 6) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                float f12 = 2;
                fB = (dVar.c() / f12) + dVar.f8839a;
                fB2 = (dVar2.c() / f12) + f10;
            }
            long jAbs2 = (long) Math.abs(fB - fB2);
            return (jAbs2 * jAbs2) + (((long) 13) * jAbs * jAbs);
        }
        f7 = dVar.f8839a;
        f8 = dVar2.f8841c;
        f6 = f7 - f8;
        long jAbs3 = (long) Math.abs(Math.max(0.0f, f6));
        if (i != 3) {
            float f13 = 2;
            fB = (dVar.b() / f13) + dVar.f8840b;
            fB2 = (dVar2.b() / f13) + f9;
        } else {
            if (i != 5) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f14 = 2;
            fB = (dVar.c() / f14) + dVar.f8839a;
            fB2 = (dVar2.c() / f14) + f10;
        }
        long jAbs4 = (long) Math.abs(fB - fB2);
        return (jAbs4 * jAbs4) + (((long) 13) * jAbs3 * jAbs3);
    }

    public static final boolean t(r rVar) {
        D d6;
        Y y2;
        D d7;
        Y y6 = rVar.f5964o;
        return (y6 == null || (d6 = y6.f13989s) == null || !d6.E() || (y2 = rVar.f5964o) == null || (d7 = y2.f13989s) == null || !d7.D()) ? false : true;
    }

    public static final int u(r rVar) {
        int iOrdinal = rVar.z0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                r rVarN = n(rVar);
                if (rVarN == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                int iU = u(rVarN);
                if (iU == 1) {
                    iU = 0;
                }
                if (iU != 0) {
                    return iU;
                }
                if (!rVar.f8673u) {
                    rVar.f8673u = true;
                    try {
                        rVar.y0().f8664k.getClass();
                        n nVar = n.f8666b;
                        return 1;
                    } finally {
                        rVar.f8673u = false;
                    }
                }
            } else {
                if (iOrdinal == 2) {
                    return 2;
                }
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return 1;
    }

    public static final void v(r rVar) {
        if (rVar.f8674v) {
            return;
        }
        rVar.f8674v = true;
        try {
            rVar.y0().f8663j.getClass();
            n nVar = n.f8666b;
        } finally {
            rVar.f8674v = false;
        }
    }

    public static final int w(r rVar) {
        n nVar;
        C0237s c0237s;
        int iOrdinal = rVar.z0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                r rVarN = n(rVar);
                if (rVarN != null) {
                    return u(rVarN);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                n nVar2 = rVar.f5958h;
                if (!nVar2.f5969t) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                n nVar3 = nVar2.f5961l;
                D dS = AbstractC1098f.s(rVar);
                loop0: while (true) {
                    nVar = null;
                    if (dS == null) {
                        break;
                    }
                    if ((((n) dS.f13828C.f3796f).f5960k & 1024) != 0) {
                        while (nVar3 != null) {
                            if ((nVar3.f5959j & 1024) != 0) {
                                n nVarE = nVar3;
                                P.d dVar = null;
                                while (nVarE != null) {
                                    if (nVarE instanceof r) {
                                        nVar = nVarE;
                                        break loop0;
                                    }
                                    if ((nVarE.f5959j & 1024) != 0 && (nVarE instanceof AbstractC1105m)) {
                                        int i = 0;
                                        for (n nVar4 = ((AbstractC1105m) nVarE).f14046v; nVar4 != null; nVar4 = nVar4.f5962m) {
                                            if ((nVar4.f5959j & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    nVarE = nVar4;
                                                } else {
                                                    if (dVar == null) {
                                                        dVar = new P.d(new n[16]);
                                                    }
                                                    if (nVarE != null) {
                                                        dVar.c(nVarE);
                                                        nVarE = null;
                                                    }
                                                    dVar.c(nVar4);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    nVarE = AbstractC1098f.e(dVar);
                                }
                            }
                            nVar3 = nVar3.f5961l;
                        }
                    }
                    dS = dS.r();
                    nVar3 = (dS == null || (c0237s = dS.f13828C) == null) ? null : (n0) c0237s.f3795e;
                }
                r rVar2 = (r) nVar;
                if (rVar2 != null) {
                    int iOrdinal2 = rVar2.z0().ordinal();
                    if (iOrdinal2 == 0) {
                        v(rVar2);
                        return 1;
                    }
                    if (iOrdinal2 == 1) {
                        return w(rVar2);
                    }
                    if (iOrdinal2 == 2) {
                        return 2;
                    }
                    if (iOrdinal2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int iW = w(rVar2);
                    int i3 = iW != 1 ? iW : 0;
                    if (i3 != 0) {
                        return i3;
                    }
                    v(rVar2);
                    return 1;
                }
            }
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00c8  */
    public static final boolean x(r rVar) {
        n nVarE;
        C0237s c0237s;
        int iOrdinal = rVar.z0().ordinal();
        boolean zC = true;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                r rVarN = n(rVar);
                if (rVarN != null ? e(rVarN, false) : true) {
                    p(rVar);
                } else {
                    zC = false;
                }
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                n nVar = rVar.f5958h;
                if (!nVar.f5969t) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                n nVar2 = nVar.f5961l;
                D dS = AbstractC1098f.s(rVar);
                loop0: while (true) {
                    if (dS == null) {
                        nVarE = null;
                        break;
                    }
                    if ((((n) dS.f13828C.f3796f).f5960k & 1024) != 0) {
                        while (nVar2 != null) {
                            if ((nVar2.f5959j & 1024) != 0) {
                                nVarE = nVar2;
                                P.d dVar = null;
                                while (nVarE != null) {
                                    if (nVarE instanceof r) {
                                        break loop0;
                                    }
                                    if ((nVarE.f5959j & 1024) != 0 && (nVarE instanceof AbstractC1105m)) {
                                        int i = 0;
                                        for (n nVar3 = ((AbstractC1105m) nVarE).f14046v; nVar3 != null; nVar3 = nVar3.f5962m) {
                                            if ((nVar3.f5959j & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    nVarE = nVar3;
                                                } else {
                                                    if (dVar == null) {
                                                        dVar = new P.d(new n[16]);
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
                r rVar2 = (r) nVarE;
                if (rVar2 != null) {
                    q qVarZ0 = rVar2.z0();
                    zC = C(rVar2, rVar);
                    if (zC && qVarZ0 != rVar2.z0()) {
                        A(rVar2);
                    }
                } else if (((Boolean) ((b) ((r) AbstractC1098f.t(rVar)).getFocusOwner()).f6698a.d(null, null)).booleanValue()) {
                    p(rVar);
                } else {
                    zC = false;
                }
            }
        }
        if (zC) {
            A(rVar);
        }
        return zC;
    }

    public static final boolean y(r rVar, C0026n c0026n) {
        Object[] objArrCopyOf = new r[16];
        n nVar = rVar.f5958h;
        if (!nVar.f5969t) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        P.d dVar = new P.d(new n[16]);
        n nVar2 = nVar.f5962m;
        if (nVar2 == null) {
            AbstractC1098f.b(dVar, nVar);
        } else {
            dVar.c(nVar2);
        }
        int i = 0;
        while (dVar.n()) {
            n nVarE = (n) dVar.p(dVar.f4583j - 1);
            if ((nVarE.f5960k & 1024) == 0) {
                AbstractC1098f.b(dVar, nVarE);
            } else {
                while (nVarE != null) {
                    if ((nVarE.f5959j & 1024) != 0) {
                        P.d dVar2 = null;
                        while (nVarE != null) {
                            if (nVarE instanceof r) {
                                r rVar2 = (r) nVarE;
                                int i3 = i + 1;
                                if (objArrCopyOf.length < i3) {
                                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, Math.max(i3, objArrCopyOf.length * 2));
                                    k.e("copyOf(this, newSize)", objArrCopyOf);
                                }
                                objArrCopyOf[i] = rVar2;
                                i = i3;
                            } else if ((nVarE.f5959j & 1024) != 0 && (nVarE instanceof AbstractC1105m)) {
                                int i6 = 0;
                                for (n nVar3 = ((AbstractC1105m) nVarE).f14046v; nVar3 != null; nVar3 = nVar3.f5962m) {
                                    if ((nVar3.f5959j & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            nVarE = nVar3;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new P.d(new n[16]);
                                            }
                                            if (nVarE != null) {
                                                dVar2.c(nVarE);
                                                nVarE = null;
                                            }
                                            dVar2.c(nVar3);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            nVarE = AbstractC1098f.e(dVar2);
                        }
                        break;
                    }
                    nVarE = nVarE.f5962m;
                }
            }
        }
        t tVar = t.f8677a;
        k.f("<this>", objArrCopyOf);
        Arrays.sort(objArrCopyOf, 0, i, tVar);
        if (i > 0) {
            int i7 = i - 1;
            do {
                r rVar3 = (r) objArrCopyOf[i7];
                if (t(rVar3) && a(rVar3, c0026n)) {
                    return true;
                }
                i7--;
            } while (i7 >= 0);
        }
        return false;
    }

    public static final boolean z(r rVar, C0026n c0026n) {
        Object[] objArrCopyOf = new r[16];
        n nVar = rVar.f5958h;
        if (!nVar.f5969t) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        P.d dVar = new P.d(new n[16]);
        n nVar2 = nVar.f5962m;
        if (nVar2 == null) {
            AbstractC1098f.b(dVar, nVar);
        } else {
            dVar.c(nVar2);
        }
        int i = 0;
        while (dVar.n()) {
            n nVarE = (n) dVar.p(dVar.f4583j - 1);
            if ((nVarE.f5960k & 1024) == 0) {
                AbstractC1098f.b(dVar, nVarE);
            } else {
                while (nVarE != null) {
                    if ((nVarE.f5959j & 1024) != 0) {
                        P.d dVar2 = null;
                        while (nVarE != null) {
                            if (nVarE instanceof r) {
                                r rVar2 = (r) nVarE;
                                int i3 = i + 1;
                                if (objArrCopyOf.length < i3) {
                                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, Math.max(i3, objArrCopyOf.length * 2));
                                    k.e("copyOf(this, newSize)", objArrCopyOf);
                                }
                                objArrCopyOf[i] = rVar2;
                                i = i3;
                            } else if ((nVarE.f5959j & 1024) != 0 && (nVarE instanceof AbstractC1105m)) {
                                int i6 = 0;
                                for (n nVar3 = ((AbstractC1105m) nVarE).f14046v; nVar3 != null; nVar3 = nVar3.f5962m) {
                                    if ((nVar3.f5959j & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            nVarE = nVar3;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new P.d(new n[16]);
                                            }
                                            if (nVarE != null) {
                                                dVar2.c(nVarE);
                                                nVarE = null;
                                            }
                                            dVar2.c(nVar3);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            nVarE = AbstractC1098f.e(dVar2);
                        }
                        break;
                    }
                    nVarE = nVarE.f5962m;
                }
            }
        }
        t tVar = t.f8677a;
        k.f("<this>", objArrCopyOf);
        Arrays.sort(objArrCopyOf, 0, i, tVar);
        if (i > 0) {
            int i7 = 0;
            do {
                r rVar3 = (r) objArrCopyOf[i7];
                if (t(rVar3) && k(rVar3, c0026n)) {
                    return true;
                }
                i7++;
            } while (i7 < i);
        }
        return false;
    }
}
