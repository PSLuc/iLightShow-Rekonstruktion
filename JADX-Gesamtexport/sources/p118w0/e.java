package p118w0;

import N.C0237s;
import P.d;
import Z.n;
import p027e3.a;
import p124x0.AbstractC1098f;
import p124x0.AbstractC1105m;
import p124x0.D;
import p124x0.InterfaceC1104l;
import p124x0.n0;
import x5.b;

/* JADX INFO: loaded from: classes.dex */
public interface e extends f, InterfaceC1104l {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [Z.n] */
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
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r8v0, types: [w0.e, x0.l] */
    /* JADX WARN: Type inference failed for: r8v5, types: [D4.a, E4.l] */
    @Override // p118w0.f
    default Object g(g gVar) {
        C0237s c0237s;
        n nVar = ((n) this).f5958h;
        boolean z5 = nVar.f5969t;
        if (!z5) {
            a.x0("ModifierLocal accessed from an unattached node");
            throw null;
        }
        if (!z5) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        n nVar2 = nVar.f5961l;
        D dS = AbstractC1098f.s(this);
        while (dS != null) {
            if ((((n) dS.f13828C.f3796f).f5960k & 32) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f5959j & 32) != 0) {
                        ?? E5 = nVar2;
                        ?? dVar = 0;
                        while (E5 != 0) {
                            if (E5 instanceof e) {
                                e eVar = (e) E5;
                                if (eVar.j().a(gVar)) {
                                    return eVar.j().d(gVar);
                                }
                            } else if ((E5.f5959j & 32) != 0 && (E5 instanceof AbstractC1105m)) {
                                n nVar3 = ((AbstractC1105m) E5).f14046v;
                                int i = 0;
                                E5 = E5;
                                dVar = dVar;
                                while (nVar3 != null) {
                                    if ((nVar3.f5959j & 32) != 0) {
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
                            E5 = AbstractC1098f.e(dVar);
                        }
                    }
                    nVar2 = nVar2.f5961l;
                }
            }
            dS = dS.r();
            nVar2 = (dS == null || (c0237s = dS.f13828C) == null) ? null : (n0) c0237s.f3795e;
        }
        return gVar.f13407a.invoke();
    }

    default b j() {
        return b.f13400a;
    }
}
