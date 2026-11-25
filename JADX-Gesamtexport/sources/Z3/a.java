package Z3;

import F.C0074p;
import S3.b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AtomicReference implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Y3.a f6081h;

    public a(Y3.a aVar) {
        this.f6081h = aVar;
    }

    @Override // S3.b
    public final void a() {
        V3.a.b(this);
    }

    public final void b(Throwable th) {
        b bVar;
        Object obj = get();
        V3.a aVar = V3.a.f5508h;
        if (obj == aVar || (bVar = (b) getAndSet(aVar)) == aVar) {
            G4.a.A(th);
            return;
        }
        try {
            Y3.a aVar2 = this.f6081h;
            aVar2.getClass();
            try {
                ((C0074p) aVar2.i).getClass();
            } catch (Throwable th2) {
                p027e3.a.w0(th2);
                G4.a.A(th2);
            }
            aVar2.lazySet(aVar);
            if (bVar != null) {
                bVar.a();
            }
        } catch (Throwable th3) {
            if (bVar != null) {
                bVar.a();
            }
            throw th3;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return a.class.getSimpleName() + "{" + super.toString() + "}";
    }
}
