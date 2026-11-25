package G1;

import F1.C0096m;
import F1.C0100q;
import F1.K;
import F1.T;
import F1.U;
import N.C0208d;
import N.C0217h0;
import S4.P;
import androidx.lifecycle.EnumC0454n;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@T("composable")
public final class i extends U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0217h0 f1621c = C0208d.K(Boolean.FALSE, N.U.f3673m);

    @Override // F1.U
    public final F1.B a() {
        return new h(this, AbstractC0119c.f1617a);
    }

    @Override // F1.U
    public final void d(List list, K k3) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0096m c0096m = (C0096m) it.next();
            C0100q c0100qB = b();
            E4.k.f("backStackEntry", c0096m);
            P p6 = c0100qB.f1371c;
            Iterable iterable = (Iterable) p6.getValue();
            boolean z5 = iterable instanceof Collection;
            S4.z zVar = c0100qB.f1373e;
            if (!z5 || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((C0096m) it2.next()) == c0096m) {
                            Iterable iterable2 = (Iterable) ((P) zVar.f5139h).getValue();
                            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                                Iterator it3 = iterable2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (((C0096m) it3.next()) == c0096m) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C0096m c0096m2 = (C0096m) p089q4.l.h0((List) ((P) zVar.f5139h).getValue());
            if (c0096m2 != null) {
                p6.i(null, p089q4.A.W((Set) p6.getValue(), c0096m2));
            }
            p6.i(null, p089q4.A.W((Set) p6.getValue(), c0096m));
            c0100qB.f(c0096m);
        }
        this.f1621c.setValue(Boolean.FALSE);
    }

    @Override // F1.U
    public final void e(C0096m c0096m, boolean z5) {
        b().e(c0096m, z5);
        this.f1621c.setValue(Boolean.TRUE);
    }

    public final void g(C0096m c0096m) {
        C0100q c0100qB = b();
        E4.k.f("entry", c0096m);
        P p6 = c0100qB.f1371c;
        p6.i(null, p089q4.A.W((Set) p6.getValue(), c0096m));
        if (!c0100qB.f1376h.f1276g.contains(c0096m)) {
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        c0096m.h(EnumC0454n.f6993k);
    }
}
