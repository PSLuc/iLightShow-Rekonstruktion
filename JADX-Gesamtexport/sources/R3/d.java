package R3;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public final void b(e eVar) {
        W3.b.a("observer is null", eVar);
        try {
            c(eVar);
        } catch (NullPointerException e6) {
            throw e6;
        } catch (Throwable th) {
            p027e3.a.w0(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void c(e eVar);
}
