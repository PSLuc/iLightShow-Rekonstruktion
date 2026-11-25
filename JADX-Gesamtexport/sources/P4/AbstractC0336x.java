package P4;

import O1.C0308a;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p015c2.AbstractC0473d;

/* JADX INFO: renamed from: P4.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0336x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0308a f4673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0308a f4674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0308a f4675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0308a f4676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0308a f4677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0308a f4678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0308a f4679h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0308a f4672a = new C0308a("RESUME_TOKEN", 1);
    public static final G i = new G(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final G f4680j = new G(true);

    static {
        int i3 = 1;
        f4673b = new C0308a("REMOVED_TASK", i3);
        f4674c = new C0308a("CLOSED_EMPTY", i3);
        int i6 = 1;
        f4675d = new C0308a("COMPLETING_ALREADY", i6);
        f4676e = new C0308a("COMPLETING_WAITING_CHILDREN", i6);
        f4677f = new C0308a("COMPLETING_RETRY", i6);
        f4678g = new C0308a("TOO_LATE_TO_CANCEL", i6);
        f4679h = new C0308a("SEALED", i6);
    }

    public static final U4.d a(p111u4.i iVar) {
        if (iVar.J(C0332t.i) == null) {
            iVar = iVar.o(new V(null));
        }
        return new U4.d(iVar);
    }

    public static j0 b() {
        return new j0(null);
    }

    public static final void c(InterfaceC0335w interfaceC0335w, CancellationException cancellationException) {
        T t6 = (T) interfaceC0335w.d().J(C0332t.i);
        if (t6 != null) {
            t6.c(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC0335w).toString());
        }
    }

    public static final Object d(D4.e eVar, p111u4.d dVar) throws Throwable {
        U4.q qVar = new U4.q(dVar, dVar.e());
        Object objJ = AbstractC0599v0.J(qVar, qVar, eVar);
        v4.a aVar = v4.a.f13292h;
        return objJ;
    }

    public static final Object e(long j4, p111u4.d dVar) {
        p084p4.x xVar = p084p4.x.f10867a;
        if (j4 > 0) {
            C0319f c0319f = new C0319f(1, AbstractC0473d.F(dVar));
            c0319f.u();
            if (j4 < Long.MAX_VALUE) {
                p111u4.g gVarJ = c0319f.f4651l.J(p111u4.e.f12750h);
                A a6 = gVarJ instanceof A ? (A) gVarJ : null;
                if (a6 == null) {
                    a6 = AbstractC0338z.f4683a;
                }
                a6.v(j4, c0319f);
            }
            Object objT = c0319f.t();
            if (objT == v4.a.f13292h) {
                return objT;
            }
        }
        return xVar;
    }

    public static final void f(p111u4.i iVar) {
        T t6 = (T) iVar.J(C0332t.i);
        if (t6 != null && !t6.b()) {
            throw t6.G();
        }
    }

    public static final p111u4.i g(p111u4.i iVar, p111u4.i iVar2, boolean z5) {
        Boolean bool = Boolean.FALSE;
        C0329p c0329p = C0329p.f4667j;
        boolean zBooleanValue = ((Boolean) iVar.T(bool, c0329p)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) iVar2.T(bool, c0329p)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return iVar.o(iVar2);
        }
        p111u4.j jVar = p111u4.j.f12751h;
        p111u4.i iVar3 = (p111u4.i) iVar.T(jVar, new C0329p(2, 2));
        Object objT = iVar2;
        if (zBooleanValue2) {
            objT = iVar2.T(jVar, C0329p.i);
        }
        return iVar3.o((p111u4.i) objT);
    }

    public static final String h(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final T i(p111u4.i iVar) {
        T t6 = (T) iVar.J(C0332t.i);
        if (t6 != null) {
            return t6;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + iVar).toString());
    }

    public static final C0319f j(p111u4.d dVar) {
        C0319f c0319f;
        C0319f c0319f2;
        if (!(dVar instanceof U4.f)) {
            return new C0319f(1, dVar);
        }
        U4.f fVar = (U4.f) dVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = U4.f.f5351o;
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            C0308a c0308a = U4.a.f5344d;
            c0319f = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, c0308a);
                c0319f2 = null;
                break;
            }
            if (obj instanceof C0319f) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(fVar, obj, c0308a)) {
                        c0319f2 = (C0319f) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(fVar) == obj);
            } else if (obj != c0308a && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0319f2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0319f.f4648n;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0319f2);
            if (!(obj2 instanceof C0326m) || ((C0326m) obj2).f4660d == null) {
                C0319f.f4647m.set(c0319f2, 536870911);
                atomicReferenceFieldUpdater2.set(c0319f2, C0315b.f4641h);
                c0319f = c0319f2;
            } else {
                c0319f2.p();
            }
            if (c0319f != null) {
                return c0319f;
            }
        }
        return new C0319f(2, dVar);
    }

    public static final void k(Throwable th, p111u4.i iVar) throws IllegalAccessException, InvocationTargetException {
        try {
            if (((InterfaceC0333u) iVar.J(C0332t.f4671h)) != null) {
                return;
            }
            U4.a.c(th, iVar);
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                p081p0.c.D(runtimeException, th);
                th = runtimeException;
            }
            U4.a.c(th, iVar);
        }
    }

    public static final boolean m(InterfaceC0335w interfaceC0335w) {
        T t6 = (T) interfaceC0335w.d().J(C0332t.i);
        if (t6 != null) {
            return t6.b();
        }
        return true;
    }

    public static final boolean n(p111u4.i iVar) {
        T t6 = (T) iVar.J(C0332t.i);
        if (t6 != null) {
            return t6.b();
        }
        return true;
    }

    public static i0 o(InterfaceC0335w interfaceC0335w, p111u4.a aVar, D4.e eVar, int i3) {
        p111u4.i iVar = aVar;
        if ((i3 & 1) != 0) {
            iVar = p111u4.j.f12751h;
        }
        int i6 = (i3 & 2) != 0 ? 1 : 4;
        p111u4.i iVarG = g(interfaceC0335w.d(), iVar, true);
        W4.d dVar = D.f4604a;
        if (iVarG != dVar && iVarG.J(p111u4.e.f12750h) == null) {
            iVarG = iVarG.o(dVar);
        }
        if (i6 == 0) {
            throw null;
        }
        i0 c0Var = i6 == 2 ? new c0(iVarG, eVar) : new i0(iVarG, true);
        c0Var.f0(i6, c0Var, eVar);
        return c0Var;
    }

    public static final Object p(Object obj) {
        return obj instanceof C0327n ? S1.V.v(((C0327n) obj).f4664a) : obj;
    }

    public static final void q(C0319f c0319f, p111u4.d dVar, boolean z5) {
        Object obj = C0319f.f4648n.get(c0319f);
        Throwable thF = c0319f.f(obj);
        Object objV = thF != null ? S1.V.v(thF) : c0319f.j(obj);
        if (!z5) {
            dVar.g(objV);
            return;
        }
        E4.k.d("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>", dVar);
        U4.f fVar = (U4.f) dVar;
        p122w4.c cVar = fVar.f5353l;
        p111u4.i iVarE = cVar.e();
        Object objL = U4.a.l(iVarE, fVar.f5355n);
        n0 n0VarU = objL != U4.a.f5346f ? u(cVar, iVarE, objL) : null;
        try {
            cVar.g(objV);
        } finally {
            if (n0VarU == null || n0VarU.g0()) {
                U4.a.f(iVarE, objL);
            }
        }
    }

    public static final Object r(p111u4.i iVar, D4.e eVar) throws Throwable {
        L lA;
        p111u4.i iVarG;
        Thread threadCurrentThread = Thread.currentThread();
        p111u4.h hVar = p111u4.e.f12750h;
        p111u4.f fVar = (p111u4.f) iVar.J(hVar);
        p111u4.j jVar = p111u4.j.f12751h;
        if (fVar == null) {
            lA = l0.a();
            iVarG = g(jVar, iVar.o(lA), true);
            W4.d dVar = D.f4604a;
            if (iVarG != dVar && iVarG.J(hVar) == null) {
                iVarG = iVarG.o(dVar);
            }
        } else {
            if (fVar instanceof L) {
            }
            lA = (L) l0.f4656a.get();
            iVarG = g(jVar, iVar, true);
            W4.d dVar2 = D.f4604a;
            if (iVarG != dVar2 && iVarG.J(hVar) == null) {
                iVarG = iVarG.o(dVar2);
            }
        }
        C0316c c0316c = new C0316c(iVarG, threadCurrentThread, lA);
        c0316c.f0(1, c0316c, eVar);
        L l6 = c0316c.f4644l;
        if (l6 != null) {
            int i3 = L.f4616m;
            l6.c0(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jD0 = l6 != null ? l6.d0() : Long.MAX_VALUE;
                if (!(c0316c.I() instanceof O)) {
                    if (l6 != null) {
                        int i6 = L.f4616m;
                        l6.Z(false);
                    }
                    Object objT = t(c0316c.I());
                    C0327n c0327n = objT instanceof C0327n ? (C0327n) objT : null;
                    if (c0327n == null) {
                        return objT;
                    }
                    throw c0327n.f4664a;
                }
                LockSupport.parkNanos(c0316c, jD0);
            } catch (Throwable th) {
                if (l6 != null) {
                    int i7 = L.f4616m;
                    l6.Z(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0316c.t(interruptedException);
        throw interruptedException;
    }

    public static final String s(p111u4.d dVar) {
        Object objV;
        if (dVar instanceof U4.f) {
            return dVar.toString();
        }
        try {
            objV = dVar + '@' + h(dVar);
        } catch (Throwable th) {
            objV = S1.V.v(th);
        }
        if (p084p4.k.a(objV) != null) {
            objV = dVar.getClass().getName() + '@' + h(dVar);
        }
        return (String) objV;
    }

    public static final Object t(Object obj) {
        O o6;
        P p6 = obj instanceof P ? (P) obj : null;
        return (p6 == null || (o6 = p6.f4621a) == null) ? obj : o6;
    }

    public static final n0 u(p111u4.d dVar, p111u4.i iVar, Object obj) {
        n0 n0Var = null;
        if ((dVar instanceof p122w4.d) && iVar.J(o0.f4666h) != null) {
            p122w4.d dVarA = (p122w4.d) dVar;
            while (!(dVarA instanceof B) && (dVarA = dVarA.a()) != null) {
                if (dVarA instanceof n0) {
                    n0Var = (n0) dVarA;
                    break;
                }
            }
            if (n0Var != null) {
                n0Var.h0(iVar, obj);
            }
        }
        return n0Var;
    }

    public static final Object v(p111u4.i iVar, D4.e eVar, p111u4.d dVar) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        Object objT;
        p111u4.i iVarE = dVar.e();
        p111u4.i iVarO = !((Boolean) iVar.T(Boolean.FALSE, C0329p.f4667j)).booleanValue() ? iVarE.o(iVar) : g(iVarE, iVar, false);
        f(iVarO);
        if (iVarO == iVarE) {
            U4.q qVar = new U4.q(dVar, iVarO);
            objT = AbstractC0599v0.J(qVar, qVar, eVar);
        } else {
            p111u4.e eVar2 = p111u4.e.f12750h;
            if (E4.k.a(iVarO.J(eVar2), iVarE.J(eVar2))) {
                n0 n0Var = new n0(dVar, iVarO);
                p111u4.i iVar2 = n0Var.f4636j;
                Object objL = U4.a.l(iVar2, null);
                try {
                    Object objJ = AbstractC0599v0.J(n0Var, n0Var, eVar);
                    U4.a.f(iVar2, objL);
                    objT = objJ;
                } catch (Throwable th) {
                    U4.a.f(iVar2, objL);
                    throw th;
                }
            } else {
                B b6 = new B(dVar, iVarO);
                com.fasterxml.jackson.databind.deser.std.d0.D(eVar, b6, b6);
                do {
                    atomicIntegerFieldUpdater = B.f4602l;
                    int i3 = atomicIntegerFieldUpdater.get(b6);
                    if (i3 != 0) {
                        if (i3 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        objT = t(b6.I());
                        if (objT instanceof C0327n) {
                            throw ((C0327n) objT).f4664a;
                        }
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(b6, 0, 1));
                objT = v4.a.f13292h;
            }
        }
        v4.a aVar = v4.a.f13292h;
        return objT;
    }
}
