package G1;

import F1.C0096m;
import F1.K;
import F1.T;
import F1.U;
import S4.P;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@T("dialog")
public final class p extends U {
    @Override // F1.U
    public final F1.B a() {
        V.a aVar = e.f1619a;
        return new o(this);
    }

    @Override // F1.U
    public final void d(List list, K k3) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((C0096m) it.next());
        }
    }

    @Override // F1.U
    public final void e(C0096m c0096m, boolean z5) {
        b().e(c0096m, z5);
        int iB0 = p089q4.l.b0((Iterable) ((P) b().f1374f.f5139h).getValue(), c0096m);
        int i = 0;
        for (Object obj : (Iterable) ((P) b().f1374f.f5139h).getValue()) {
            int i3 = i + 1;
            if (i < 0) {
                p089q4.m.O();
                throw null;
            }
            C0096m c0096m2 = (C0096m) obj;
            if (i > iB0) {
                b().b(c0096m2);
            }
            i = i3;
        }
    }
}
