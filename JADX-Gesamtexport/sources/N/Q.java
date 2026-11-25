package N;

import P4.AbstractC0336x;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements InterfaceC0250y0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D4.e f3651h;
    public final U4.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public P4.i0 f3652j;

    public Q(p111u4.i iVar, D4.e eVar) {
        this.f3651h = eVar;
        this.i = AbstractC0336x.a(iVar);
    }

    @Override // N.InterfaceC0250y0
    public final void a() {
        P4.i0 i0Var = this.f3652j;
        if (i0Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            i0Var.c(cancellationException);
        }
        this.f3652j = AbstractC0336x.o(this.i, null, this.f3651h, 3);
    }

    @Override // N.InterfaceC0250y0
    public final void b() throws IllegalAccessException, InvocationTargetException {
        P4.i0 i0Var = this.f3652j;
        if (i0Var != null) {
            i0Var.u(new T());
        }
        this.f3652j = null;
    }

    @Override // N.InterfaceC0250y0
    public final void e() throws IllegalAccessException, InvocationTargetException {
        P4.i0 i0Var = this.f3652j;
        if (i0Var != null) {
            i0Var.u(new T());
        }
        this.f3652j = null;
    }
}
