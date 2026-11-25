package p005a4;

import R3.a;
import R3.c;

/* JADX INFO: loaded from: classes.dex */
public final class D extends a {
    public final int i = 4;

    @Override // R3.a
    public final void f(c cVar) {
        boolean z5 = cVar instanceof X3.a;
        int i = this.i;
        if (z5) {
            cVar.h(new C((X3.a) cVar, i, 0));
        } else {
            cVar.h(new C(cVar, i, 1));
        }
    }
}
