package R3;

import p005a4.C0399g;
import p005a4.C0405m;
import p005a4.J;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements u5.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f4801h = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    @Override // u5.a
    public final void a(u5.b bVar) {
        if (bVar instanceof c) {
            e((c) bVar);
        } else {
            W3.b.a("s is null", bVar);
            e(new p039g4.b(bVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a d(U3.b bVar, int i, int i3) throws Exception {
        W3.b.b(i, "maxConcurrency");
        W3.b.b(i3, "bufferSize");
        if (!(this instanceof X3.f)) {
            return new C0405m(this, bVar, i, i3);
        }
        Object objCall = ((X3.f) this).call();
        return objCall == null ? C0399g.i : new J(objCall, bVar, 0);
    }

    public final void e(c cVar) {
        W3.b.a("s is null", cVar);
        try {
            f(cVar);
        } catch (NullPointerException e6) {
            throw e6;
        } catch (Throwable th) {
            p027e3.a.w0(th);
            G4.a.A(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void f(c cVar);
}
