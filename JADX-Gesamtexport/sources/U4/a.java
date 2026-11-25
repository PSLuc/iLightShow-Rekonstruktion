package U4;

import O1.C0308a;
import P4.AbstractC0331s;
import P4.AbstractC0336x;
import P4.C0327n;
import P4.C0332t;
import P4.InterfaceC0333u;
import P4.L;
import P4.T;
import P4.k0;
import P4.l0;
import P4.n0;
import S1.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0308a f5343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0308a f5344d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0308a f5341a = new C0308a("NO_DECISION", 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0308a f5342b = new C0308a("CLOSED", 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0308a f5345e = new C0308a("CONDITION_FALSE", 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0308a f5346f = new C0308a("NO_THREAD_ELEMENTS", 1);

    static {
        int i = 1;
        f5343c = new C0308a("UNDEFINED", i);
        f5344d = new C0308a("REUSABLE_CLAIMED", i);
    }

    public static final Object a(r rVar, long j4, D4.e eVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (rVar.f5377j >= j4 && !rVar.c()) {
                return rVar;
            }
            Object obj = c.f5348h.get(rVar);
            C0308a c0308a = f5342b;
            if (obj == c0308a) {
                return c0308a;
            }
            r rVar2 = (r) ((c) obj);
            if (rVar2 == null) {
                rVar2 = (r) eVar.d(Long.valueOf(rVar.f5377j + 1), rVar);
                do {
                    atomicReferenceFieldUpdater = c.f5348h;
                    if (atomicReferenceFieldUpdater.compareAndSet(rVar, null, rVar2)) {
                        if (rVar.c()) {
                            rVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(rVar) == null);
            }
            rVar = rVar2;
        }
    }

    public static final r b(Object obj) {
        if (obj != f5342b) {
            return (r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void c(Throwable th, p111u4.i iVar) {
        Throwable runtimeException;
        Iterator it = e.f5350a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC0333u) it.next()).getClass();
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    p081p0.c.D(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            p081p0.c.D(th, new DiagnosticCoroutineContextException(iVar));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean d(Object obj) {
        return obj == f5342b;
    }

    public static final Object e(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void f(p111u4.i iVar, Object obj) {
        if (obj == f5346f) {
            return;
        }
        if (!(obj instanceof w)) {
            Object objT = iVar.T(null, u.f5380j);
            E4.k.d("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>", objT);
            p012c.k.A(objT);
            throw null;
        }
        w wVar = (w) obj;
        k0[] k0VarArr = wVar.f5386b;
        int length = k0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        k0 k0Var = k0VarArr[length];
        E4.k.c(null);
        Object obj2 = wVar.f5385a[length];
        throw null;
    }

    public static final void g(Object obj, p111u4.d dVar) {
        if (!(dVar instanceof f)) {
            dVar.g(obj);
            return;
        }
        f fVar = (f) dVar;
        Throwable thA = p084p4.k.a(obj);
        Object c0327n = thA == null ? obj : new C0327n(thA, false);
        p122w4.c cVar = fVar.f5353l;
        cVar.e();
        AbstractC0331s abstractC0331s = fVar.f5352k;
        if (abstractC0331s.Y()) {
            fVar.f5354m = c0327n;
            fVar.f4603j = 1;
            abstractC0331s.X(cVar.e(), fVar);
            return;
        }
        L lA = l0.a();
        if (lA.f4617j >= 4294967296L) {
            fVar.f5354m = c0327n;
            fVar.f4603j = 1;
            lA.a0(fVar);
            return;
        }
        lA.c0(true);
        try {
            T t6 = (T) cVar.e().J(C0332t.i);
            if (t6 == null || t6.b()) {
                Object obj2 = fVar.f5355n;
                p111u4.i iVarE = cVar.e();
                Object objL = l(iVarE, obj2);
                n0 n0VarU = objL != f5346f ? AbstractC0336x.u(cVar, iVarE, objL) : null;
                try {
                    cVar.g(obj);
                    if (n0VarU == null || n0VarU.g0()) {
                        f(iVarE, objL);
                    }
                } catch (Throwable th) {
                    if (n0VarU == null || n0VarU.g0()) {
                        f(iVarE, objL);
                    }
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionG = t6.G();
                fVar.c(c0327n, cancellationExceptionG);
                fVar.g(V.v(cancellationExceptionG));
            }
            while (lA.e0()) {
            }
        } catch (Throwable th2) {
            try {
                fVar.k(th2, null);
            } finally {
                lA.Z(true);
            }
        }
    }

    public static final long i(String str, long j4, long j6, long j7) {
        String property;
        int i = t.f5379a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j4;
        }
        Long lY = M4.s.Y(property);
        if (lY == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lY.longValue();
        if (j6 <= jLongValue && jLongValue <= j7) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j6 + ".." + j7 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int j(int i, String str, int i3) {
        return (int) i(str, i, 1, (i3 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object k(p111u4.i iVar) {
        Object objT = iVar.T(0, u.i);
        E4.k.c(objT);
        return objT;
    }

    public static final Object l(p111u4.i iVar, Object obj) {
        if (obj == null) {
            obj = k(iVar);
        }
        if (obj == 0) {
            return f5346f;
        }
        if (obj instanceof Integer) {
            return iVar.T(new w(((Number) obj).intValue(), iVar), u.f5381k);
        }
        p012c.k.A(obj);
        throw null;
    }
}
