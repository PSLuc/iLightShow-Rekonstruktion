package P4;

import O1.C0308a;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;

/* JADX INFO: renamed from: P4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0319f extends C implements InterfaceC0318e, p122w4.d, p0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4647m = AtomicIntegerFieldUpdater.newUpdater(C0319f.class, "_decisionAndIndex");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4648n = AtomicReferenceFieldUpdater.newUpdater(C0319f.class, Object.class, "_state");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4649o = AtomicReferenceFieldUpdater.newUpdater(C0319f.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p111u4.d f4650k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p111u4.i f4651l;

    public C0319f(int i, p111u4.d dVar) {
        super(i);
        this.f4650k = dVar;
        this.f4651l = dVar.e();
        this._decisionAndIndex = 536870911;
        this._state = C0315b.f4641h;
    }

    public static Object F(g0 g0Var, Object obj, int i, D4.c cVar) {
        if (obj instanceof C0327n) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (cVar != null || (g0Var instanceof F)) {
            return new C0326m(obj, g0Var instanceof F ? (F) g0Var : null, cVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void z(g0 g0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + g0Var + ", already has " + obj).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        p111u4.d dVar = this.f4650k;
        Throwable th = null;
        U4.f fVar = dVar instanceof U4.f ? (U4.f) dVar : null;
        if (fVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = U4.f.f5351o;
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                C0308a c0308a = U4.a.f5344d;
                if (obj != c0308a) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(fVar, c0308a, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(fVar) == c0308a);
            }
            if (th == null) {
                return;
            }
            p();
            i(th);
        }
    }

    public final void C(Object obj, D4.c cVar) throws IllegalAccessException, InvocationTargetException {
        D(obj, this.f4603j, cVar);
    }

    public final void D(Object obj, int i, D4.c cVar) throws IllegalAccessException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4648n;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof g0)) {
                if (obj2 instanceof C0320g) {
                    C0320g c0320g = (C0320g) obj2;
                    c0320g.getClass();
                    if (C0320g.f4653c.compareAndSet(c0320g, 0, 1)) {
                        if (cVar != null) {
                            n(cVar, c0320g.f4664a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objF = F((g0) obj2, obj, i, cVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objF)) {
                    if (!y()) {
                        p();
                    }
                    q(i);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    public final void E(AbstractC0331s abstractC0331s) throws IllegalAccessException, InvocationTargetException {
        p084p4.x xVar = p084p4.x.f10867a;
        p111u4.d dVar = this.f4650k;
        U4.f fVar = dVar instanceof U4.f ? (U4.f) dVar : null;
        D(xVar, (fVar != null ? fVar.f5352k : null) == abstractC0331s ? 4 : this.f4603j, null);
    }

    @Override // p122w4.d
    public final p122w4.d a() {
        p111u4.d dVar = this.f4650k;
        if (dVar instanceof p122w4.d) {
            return (p122w4.d) dVar;
        }
        return null;
    }

    @Override // P4.p0
    public final void b(U4.r rVar, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f4647m;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i));
        x(rVar);
    }

    @Override // P4.C
    public final void c(Object obj, CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4648n;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof g0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0327n) {
                return;
            }
            if (!(obj2 instanceof C0326m)) {
                cancellationException2 = cancellationException;
                C0326m c0326m = new C0326m(obj2, (F) null, (D4.c) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0326m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            C0326m c0326m2 = (C0326m) obj2;
            if (c0326m2.f4661e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0326m c0326mA = C0326m.a(c0326m2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0326mA)) {
                    F f6 = c0326m2.f4658b;
                    if (f6 != null) {
                        m(f6, cancellationException);
                    }
                    D4.c cVar = c0326m2.f4659c;
                    if (cVar != null) {
                        n(cVar, cancellationException);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
            cancellationException2 = cancellationException;
            cancellationException = cancellationException2;
        }
    }

    @Override // P4.C
    public final p111u4.d d() {
        return this.f4650k;
    }

    @Override // p111u4.d
    public final p111u4.i e() {
        return this.f4651l;
    }

    @Override // P4.C
    public final Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    @Override // p111u4.d
    public final void g(Object obj) {
        Throwable thA = p084p4.k.a(obj);
        if (thA != null) {
            obj = new C0327n(thA, false);
        }
        D(obj, this.f4603j, null);
    }

    @Override // P4.InterfaceC0318e
    public final C0308a h(Object obj, D4.c cVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4648n;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z5 = obj2 instanceof g0;
            C0308a c0308a = AbstractC0336x.f4672a;
            if (!z5) {
                boolean z6 = obj2 instanceof C0326m;
                return null;
            }
            Object objF = F((g0) obj2, obj, this.f4603j, cVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objF)) {
                    if (!y()) {
                        p();
                    }
                    return c0308a;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // P4.InterfaceC0318e
    public final boolean i(Throwable th) throws IllegalAccessException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4648n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof g0)) {
                return false;
            }
            C0320g c0320g = new C0320g(this, th, (obj instanceof F) || (obj instanceof U4.r));
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c0320g)) {
                    g0 g0Var = (g0) obj;
                    if (g0Var instanceof F) {
                        m((F) obj, th);
                    } else if (g0Var instanceof U4.r) {
                        o((U4.r) obj, th);
                    }
                    if (!y()) {
                        p();
                    }
                    q(this.f4603j);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // P4.C
    public final Object j(Object obj) {
        return obj instanceof C0326m ? ((C0326m) obj).f4657a : obj;
    }

    @Override // P4.C
    public final Object l() {
        return f4648n.get(this);
    }

    public final void m(F f6, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            f6.a(th);
        } catch (Throwable th2) {
            AbstractC0336x.k(new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2), this.f4651l);
        }
    }

    public final void n(D4.c cVar, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            cVar.invoke(th);
        } catch (Throwable th2) {
            AbstractC0336x.k(new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2), this.f4651l);
        }
    }

    public final void o(U4.r rVar, Throwable th) throws IllegalAccessException, InvocationTargetException {
        p111u4.i iVar = this.f4651l;
        int i = f4647m.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            rVar.g(i, iVar);
        } catch (Throwable th2) {
            AbstractC0336x.k(new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2), iVar);
        }
    }

    public final void p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4649o;
        E e6 = (E) atomicReferenceFieldUpdater.get(this);
        if (e6 == null) {
            return;
        }
        e6.a();
        atomicReferenceFieldUpdater.set(this, f0.f4652h);
    }

    public final void q(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f4647m;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i6 = i3 >> 29;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z5 = i == 4;
                p111u4.d dVar = this.f4650k;
                if (!z5 && (dVar instanceof U4.f)) {
                    boolean z6 = i == 1 || i == 2;
                    int i7 = this.f4603j;
                    if (z6 == (i7 == 1 || i7 == 2)) {
                        AbstractC0331s abstractC0331s = ((U4.f) dVar).f5352k;
                        p111u4.i iVarE = ((U4.f) dVar).f5353l.e();
                        if (abstractC0331s.Y()) {
                            abstractC0331s.X(iVarE, this);
                            return;
                        }
                        L lA = l0.a();
                        if (lA.f4617j >= 4294967296L) {
                            lA.a0(this);
                            return;
                        }
                        lA.c0(true);
                        try {
                            AbstractC0336x.q(this, dVar, true);
                            do {
                            } while (lA.e0());
                        } catch (Throwable th) {
                            try {
                                k(th, null);
                            } finally {
                                lA.Z(true);
                            }
                        }
                        return;
                    }
                }
                AbstractC0336x.q(this, dVar, z5);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    @Override // P4.InterfaceC0318e
    public final void r(Object obj) {
        q(this.f4603j);
    }

    public Throwable s(b0 b0Var) {
        return b0Var.G();
    }

    public final Object t() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean zY = y();
        do {
            atomicIntegerFieldUpdater = f4647m;
            i = atomicIntegerFieldUpdater.get(this);
            int i3 = i >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zY) {
                    B();
                }
                Object obj = f4648n.get(this);
                if (obj instanceof C0327n) {
                    throw ((C0327n) obj).f4664a;
                }
                int i6 = this.f4603j;
                if (i6 == 1 || i6 == 2) {
                    T t6 = (T) this.f4651l.J(C0332t.i);
                    if (t6 != null && !t6.b()) {
                        CancellationException cancellationExceptionG = t6.G();
                        c(obj, cancellationExceptionG);
                        throw cancellationExceptionG;
                    }
                }
                return j(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((E) f4649o.get(this)) == null) {
            v();
        }
        if (zY) {
            B();
        }
        return v4.a.f13292h;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(A());
        sb.append('(');
        sb.append(AbstractC0336x.s(this.f4650k));
        sb.append("){");
        Object obj = f4648n.get(this);
        if (obj instanceof g0) {
            str = "Active";
        } else {
            str = obj instanceof C0320g ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(AbstractC0336x.h(this));
        return sb.toString();
    }

    public final void u() {
        E eV = v();
        if (eV == null || (f4648n.get(this) instanceof g0)) {
            return;
        }
        eV.a();
        f4649o.set(this, f0.f4652h);
    }

    public final E v() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        T t6 = (T) this.f4651l.J(C0332t.i);
        if (t6 == null) {
            return null;
        }
        E eS = t6.s((2 & 1) == 0, (2 & 2) != 0, new C0321h(this));
        do {
            atomicReferenceFieldUpdater = f4649o;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, eS)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return eS;
    }

    public final void w(D4.c cVar) {
        x(cVar instanceof F ? (F) cVar : new F(1, cVar));
    }

    public final void x(g0 g0Var) throws IllegalAccessException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4648n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0315b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, g0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if (obj instanceof F ? true : obj instanceof U4.r) {
                z(g0Var, obj);
                throw null;
            }
            if (obj instanceof C0327n) {
                C0327n c0327n = (C0327n) obj;
                c0327n.getClass();
                if (!C0327n.f4663b.compareAndSet(c0327n, 0, 1)) {
                    z(g0Var, obj);
                    throw null;
                }
                if (obj instanceof C0320g) {
                    if (obj == null) {
                        c0327n = null;
                    }
                    Throwable th = c0327n != null ? c0327n.f4664a : null;
                    if (g0Var instanceof F) {
                        m((F) g0Var, th);
                        return;
                    } else {
                        E4.k.d("null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>", g0Var);
                        o((U4.r) g0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0326m)) {
                if (g0Var instanceof U4.r) {
                    return;
                }
                E4.k.d("null cannot be cast to non-null type kotlinx.coroutines.CancelHandler", g0Var);
                C0326m c0326m = new C0326m(obj, (F) g0Var, (D4.c) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0326m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            C0326m c0326m2 = (C0326m) obj;
            if (c0326m2.f4658b != null) {
                z(g0Var, obj);
                throw null;
            }
            if (g0Var instanceof U4.r) {
                return;
            }
            E4.k.d("null cannot be cast to non-null type kotlinx.coroutines.CancelHandler", g0Var);
            F f6 = (F) g0Var;
            Throwable th2 = c0326m2.f4661e;
            if (th2 != null) {
                m(f6, th2);
                return;
            }
            C0326m c0326mA = C0326m.a(c0326m2, f6, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0326mA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }

    public final boolean y() {
        if (this.f4603j != 2) {
            return false;
        }
        p111u4.d dVar = this.f4650k;
        E4.k.d("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>", dVar);
        return U4.f.f5351o.get((U4.f) dVar) != null;
    }
}
