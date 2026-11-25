package p118w0;

import Z.n;
import java.util.HashSet;
import p027e3.a;
import p058l0.I;
import p124x0.AbstractC1098f;
import p124x0.AbstractC1105m;
import p124x0.C1095c;
import p124x0.D;
import p130y0.r;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f13401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P.d f13402b = new P.d(new C1095c[16]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P.d f13403c = new P.d(new g[16]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P.d f13404d = new P.d(new D[16]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final P.d f13405e = new P.d(new g[16]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13406f;

    public d(r rVar) {
        this.f13401a = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [P.d] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [P.d] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static void b(n nVar, g gVar, HashSet hashSet) {
        n nVar2 = nVar.f5958h;
        if (!nVar2.f5969t) {
            a.y0("visitSubtreeIf called on an unattached node");
            throw null;
        }
        P.d dVar = new P.d(new n[16]);
        n nVar3 = nVar2.f5962m;
        if (nVar3 == null) {
            AbstractC1098f.b(dVar, nVar2);
        } else {
            dVar.c(nVar3);
        }
        while (dVar.n()) {
            n nVar4 = (n) dVar.p(dVar.f4583j - 1);
            if ((nVar4.f5960k & 32) != 0) {
                n nVar5 = nVar4;
                while (true) {
                    if (nVar5 != null) {
                        if ((nVar5.f5959j & 32) != 0) {
                            ?? dVar2 = 0;
                            ?? E5 = nVar5;
                            while (E5 != 0) {
                                if (E5 instanceof e) {
                                    e eVar = (e) E5;
                                    if (eVar instanceof C1095c) {
                                        C1095c c1095c = (C1095c) eVar;
                                        if ((c1095c.f14000u instanceof c) && c1095c.f14002w.contains(gVar)) {
                                            hashSet.add(eVar);
                                        }
                                    }
                                    if (eVar.j().a(gVar)) {
                                        break;
                                    }
                                } else if ((E5.f5959j & 32) != 0 && (E5 instanceof AbstractC1105m)) {
                                    n nVar6 = ((AbstractC1105m) E5).f14046v;
                                    int i = 0;
                                    E5 = E5;
                                    dVar2 = dVar2;
                                    while (nVar6 != null) {
                                        if ((nVar6.f5959j & 32) != 0) {
                                            i++;
                                            dVar2 = dVar2;
                                            if (i == 1) {
                                                E5 = nVar6;
                                            } else {
                                                if (dVar2 == 0) {
                                                    dVar2 = new P.d(new n[16]);
                                                }
                                                if (E5 != 0) {
                                                    dVar2.c(E5);
                                                    E5 = 0;
                                                }
                                                dVar2.c(nVar6);
                                            }
                                        }
                                        nVar6 = nVar6.f5962m;
                                        E5 = E5;
                                        dVar2 = dVar2;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                E5 = AbstractC1098f.e(dVar2);
                            }
                        }
                        nVar5 = nVar5.f5962m;
                    }
                }
            }
            AbstractC1098f.b(dVar, nVar4);
        }
    }

    public final void a() {
        if (this.f13406f) {
            return;
        }
        this.f13406f = true;
        I i = new I(11, this);
        P.d dVar = this.f13401a.f14513w0;
        if (dVar.j(i)) {
            return;
        }
        dVar.c(i);
    }
}
