package R4;

import P4.AbstractC0314a;
import P4.AbstractC0336x;
import P4.C0327n;
import P4.Z;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobCancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC0314a implements m, f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f4851k;

    public l(p111u4.i iVar, b bVar) {
        super(iVar, true);
        this.f4851k = bVar;
    }

    @Override // P4.b0, P4.T
    public final void c(CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        Object objI = I();
        if (objI instanceof C0327n) {
            return;
        }
        if ((objI instanceof Z) && ((Z) objI).d()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(w(), null, this);
        }
        u(cancellationException);
    }

    @Override // P4.AbstractC0314a
    public final void d0(Throwable th, boolean z5) throws IllegalAccessException, InvocationTargetException {
        if (this.f4851k.g(th, false) || z5) {
            return;
        }
        AbstractC0336x.k(th, this.f4636j);
    }

    @Override // P4.AbstractC0314a
    public final void e0(Object obj) {
        this.f4851k.g(null, false);
    }

    @Override // R4.n
    public final Object f() {
        return this.f4851k.f();
    }

    @Override // R4.n
    public final a iterator() {
        b bVar = this.f4851k;
        bVar.getClass();
        return new a(bVar);
    }

    @Override // R4.o
    public final Object j(Object obj) {
        return this.f4851k.j(obj);
    }

    @Override // R4.n
    public final Object l(p122w4.i iVar) {
        return this.f4851k.l(iVar);
    }

    @Override // R4.o
    public final Object m(Object obj, p111u4.d dVar) {
        return this.f4851k.m(obj, dVar);
    }

    @Override // P4.b0
    public final void u(CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        this.f4851k.g(cancellationException, true);
        t(cancellationException);
    }
}
