package P4;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class C extends W4.h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4603j;

    public C(int i) {
        super(0L, W4.k.f5636g);
        this.f4603j = i;
    }

    public abstract void c(Object obj, CancellationException cancellationException);

    public abstract p111u4.d d();

    public Throwable f(Object obj) {
        C0327n c0327n = obj instanceof C0327n ? (C0327n) obj : null;
        if (c0327n != null) {
            return c0327n.f4664a;
        }
        return null;
    }

    public Object j(Object obj) {
        return obj;
    }

    public final void k(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            p081p0.c.D(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        E4.k.c(th);
        AbstractC0336x.k(new C4.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), d().e());
    }

    public abstract Object l();

    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        T t6;
        Object objV = p084p4.x.f10867a;
        W4.i iVar = this.i;
        try {
            p111u4.d dVarD = d();
            E4.k.d("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>", dVarD);
            U4.f fVar = (U4.f) dVarD;
            p122w4.c cVar = fVar.f5353l;
            Object obj = fVar.f5355n;
            p111u4.i iVarE = cVar.e();
            Object objL = U4.a.l(iVarE, obj);
            n0 n0VarU = objL != U4.a.f5346f ? AbstractC0336x.u(cVar, iVarE, objL) : null;
            try {
                p111u4.i iVarE2 = cVar.e();
                Object objL2 = l();
                Throwable thF = f(objL2);
                if (thF == null) {
                    int i = this.f4603j;
                    boolean z5 = true;
                    if (i != 1 && i != 2) {
                        z5 = false;
                    }
                    if (z5) {
                        t6 = (T) iVarE2.J(C0332t.i);
                    } else {
                        t6 = null;
                    }
                } else {
                    t6 = null;
                }
                if (t6 != null && !t6.b()) {
                    CancellationException cancellationExceptionG = t6.G();
                    c(objL2, cancellationExceptionG);
                    cVar.g(S1.V.v(cancellationExceptionG));
                } else if (thF != null) {
                    cVar.g(S1.V.v(thF));
                } else {
                    cVar.g(j(objL2));
                }
                if (n0VarU == null || n0VarU.g0()) {
                    U4.a.f(iVarE, objL);
                }
                try {
                    iVar.getClass();
                } catch (Throwable th) {
                    objV = S1.V.v(th);
                }
                k(null, p084p4.k.a(objV));
            } catch (Throwable th2) {
                if (n0VarU == null || n0VarU.g0()) {
                    U4.a.f(iVarE, objL);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                iVar.getClass();
            } catch (Throwable th4) {
                objV = S1.V.v(th4);
            }
            k(th3, p084p4.k.a(objV));
        }
    }
}
