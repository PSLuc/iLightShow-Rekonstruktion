package p005a4;

import J2.b;
import R3.a;
import R3.c;
import p096s.AbstractC0916i;

/* JADX INFO: renamed from: a4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0398f extends a {
    public final b i;

    public C0398f(b bVar) {
        this.i = bVar;
    }

    @Override // R3.a
    public final void f(c cVar) {
        AbstractC0394b c0397e;
        int iD = AbstractC0916i.d(3);
        if (iD == 0) {
            c0397e = new C0397e(cVar);
        } else if (iD == 1) {
            c0397e = new C0396d(cVar, 1);
        } else if (iD != 3) {
            c0397e = iD != 4 ? new C0395c(cVar, a.f4801h) : new C0395c(cVar);
        } else {
            c0397e = new C0396d(cVar, 0);
        }
        cVar.h(c0397e);
        try {
            this.i.f(c0397e);
        } catch (Throwable th) {
            p027e3.a.w0(th);
            c0397e.d(th);
        }
    }
}
