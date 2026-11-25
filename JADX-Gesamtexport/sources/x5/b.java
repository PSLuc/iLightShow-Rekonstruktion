package x5;

import B.C0025m0;
import F.C0074p;
import R2.j;
import R3.d;
import p118w0.g;
import v5.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final void b(C0025m0 c0025m0) {
        Y3.a aVar = new Y3.a(new C0074p(new o(4), 14), 0, new C0074p(7));
        try {
            Z3.a aVar2 = new Z3.a(aVar);
            V3.a.d(aVar, aVar2);
            try {
                ((j) c0025m0.i).a(aVar2);
            } catch (Throwable th) {
                p027e3.a.w0(th);
                aVar2.b(th);
            }
        } catch (NullPointerException e6) {
            throw e6;
        } catch (Throwable th2) {
            p027e3.a.w0(th2);
            G4.a.A(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public static final void c(d dVar) {
        dVar.b(new p011b4.a(new C0074p(new o(6), 15), new C0074p(new o(4), 16)));
    }

    public abstract boolean a(g gVar);

    public abstract Object d(g gVar);
}
