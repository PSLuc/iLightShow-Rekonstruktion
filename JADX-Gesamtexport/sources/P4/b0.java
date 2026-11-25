package P4;

import O1.C0308a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p015c2.AbstractC0473d;

/* JADX INFO: loaded from: classes.dex */
public class b0 implements T, h0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4642h = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_state");
    public static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public b0(boolean z5) {
        this._state = z5 ? AbstractC0336x.f4680j : AbstractC0336x.i;
    }

    public static C0323j U(U4.i iVar) {
        while (iVar.o()) {
            U4.i iVarH = iVar.h();
            if (iVarH == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = U4.i.i;
                Object obj = atomicReferenceFieldUpdater.get(iVar);
                while (true) {
                    iVar = (U4.i) obj;
                    if (!iVar.o()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(iVar);
                }
            } else {
                iVar = iVarH;
            }
        }
        while (true) {
            iVar = iVar.n();
            if (!iVar.o()) {
                if (iVar instanceof C0323j) {
                    return (C0323j) iVar;
                }
                if (iVar instanceof d0) {
                    return null;
                }
            }
        }
    }

    public static String b0(Object obj) {
        if (!(obj instanceof Z)) {
            if (obj instanceof O) {
                return ((O) obj).b() ? "Active" : "New";
            }
            return obj instanceof C0327n ? "Cancelled" : "Completed";
        }
        Z z5 = (Z) obj;
        if (z5.d()) {
            return "Cancelling";
        }
        return z5.e() ? "Completing" : "Active";
    }

    public final Object A(Z z5, Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thB;
        C0327n c0327n = obj instanceof C0327n ? (C0327n) obj : null;
        Throwable th = c0327n != null ? c0327n.f4664a : null;
        synchronized (z5) {
            z5.d();
            ArrayList arrayListF = z5.f(th);
            thB = B(z5, arrayListF);
            if (thB != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                int size = arrayListF.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayListF.get(i3);
                    i3++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != thB && th2 != thB && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        p081p0.c.D(thB, th2);
                    }
                }
            }
        }
        if (thB != null && thB != th) {
            obj = new C0327n(thB, false);
        }
        if (thB != null && (v(thB) || K(thB))) {
            E4.k.d("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally", obj);
            C0327n.f4663b.compareAndSet((C0327n) obj, 0, 1);
        }
        X(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4642h;
        Object p6 = obj instanceof O ? new P((O) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, z5, p6) && atomicReferenceFieldUpdater.get(this) == z5) {
        }
        y(z5, obj);
        return obj;
    }

    public final Throwable B(Z z5, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (z5.d()) {
                return new JobCancellationException(w(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i3 = 0;
        int i6 = 0;
        do {
            if (i6 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i6);
            i6++;
        } while (((Throwable) obj) instanceof CancellationException);
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            int size2 = arrayList.size();
            while (i3 < size2) {
                Object obj3 = arrayList.get(i3);
                i3++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    @Override // p111u4.i
    public final p111u4.i D(p111u4.h hVar) {
        return S1.h0.t(this, hVar);
    }

    public boolean E() {
        return true;
    }

    public boolean F() {
        return this instanceof C0325l;
    }

    @Override // P4.T
    public final CancellationException G() {
        CancellationException jobCancellationException;
        Object objI = I();
        if (!(objI instanceof Z)) {
            if (objI instanceof O) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objI instanceof C0327n)) {
                return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0327n) objI).f4664a;
            jobCancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return jobCancellationException == null ? new JobCancellationException(w(), th, this) : jobCancellationException;
        }
        Throwable thC = ((Z) objI).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        jobCancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (jobCancellationException == null) {
            if (strConcat == null) {
                strConcat = w();
            }
            jobCancellationException = new JobCancellationException(strConcat, thC, this);
        }
        return jobCancellationException;
    }

    public final d0 H(O o6) {
        d0 d0VarG = o6.g();
        if (d0VarG != null) {
            return d0VarG;
        }
        if (o6 instanceof G) {
            return new d0();
        }
        if (o6 instanceof W) {
            Z((W) o6);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + o6).toString());
    }

    public final Object I() {
        while (true) {
            Object obj = f4642h.get(this);
            if (!(obj instanceof U4.n)) {
                return obj;
            }
            ((U4.n) obj).a(this);
        }
    }

    @Override // p111u4.i
    public final p111u4.g J(p111u4.h hVar) {
        return S1.h0.m(this, hVar);
    }

    public boolean K(Throwable th) {
        return false;
    }

    @Override // P4.T
    public final Object M(p122w4.c cVar) {
        Object objI;
        p084p4.x xVar;
        do {
            objI = I();
            boolean z5 = objI instanceof O;
            xVar = p084p4.x.f10867a;
            if (!z5) {
                AbstractC0336x.f(cVar.e());
                return xVar;
            }
        } while (a0(objI) < 0);
        C0319f c0319f = new C0319f(1, AbstractC0473d.F(cVar));
        c0319f.u();
        c0319f.w(new F(0, s(false, true, new S(2, c0319f))));
        Object objT = c0319f.t();
        v4.a aVar = v4.a.f13292h;
        if (objT != aVar) {
            objT = xVar;
        }
        return objT == aVar ? objT : xVar;
    }

    public void N(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public final void O(T t6) {
        f0 f0Var = f0.f4652h;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        if (t6 == null) {
            atomicReferenceFieldUpdater.set(this, f0Var);
            return;
        }
        t6.k();
        InterfaceC0322i interfaceC0322iV = t6.V(this);
        atomicReferenceFieldUpdater.set(this, interfaceC0322iV);
        if (I() instanceof O) {
            return;
        }
        interfaceC0322iV.a();
        atomicReferenceFieldUpdater.set(this, f0Var);
    }

    public boolean P() {
        return this instanceof C0316c;
    }

    @Override // P4.T
    public final E Q(D4.c cVar) {
        return s(false, true, cVar);
    }

    public final boolean R(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objC0;
        do {
            objC0 = c0(I(), obj);
            if (objC0 == AbstractC0336x.f4675d) {
                return false;
            }
            if (objC0 == AbstractC0336x.f4676e) {
                return true;
            }
        } while (objC0 == AbstractC0336x.f4677f);
        p(objC0);
        return true;
    }

    public final Object S(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objC0;
        do {
            objC0 = c0(I(), obj);
            if (objC0 == AbstractC0336x.f4675d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0327n c0327n = obj instanceof C0327n ? (C0327n) obj : null;
                throw new IllegalStateException(str, c0327n != null ? c0327n.f4664a : null);
            }
        } while (objC0 == AbstractC0336x.f4677f);
        return objC0;
    }

    @Override // p111u4.i
    public final Object T(Object obj, D4.e eVar) {
        return eVar.d(obj, this);
    }

    @Override // P4.T
    public final InterfaceC0322i V(b0 b0Var) {
        return (InterfaceC0322i) s((2 & 1) == 0, (2 & 2) != 0, new C0323j(b0Var));
    }

    public final void W(d0 d0Var, Throwable th) throws IllegalAccessException, InvocationTargetException {
        Object objM = d0Var.m();
        E4.k.d("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", objM);
        CompletionHandlerException completionHandlerException = null;
        for (U4.i iVarN = (U4.i) objM; !iVarN.equals(d0Var); iVarN = iVarN.n()) {
            if (iVarN instanceof U) {
                W w6 = (W) iVarN;
                try {
                    w6.q(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        p081p0.c.D(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + w6 + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            N(completionHandlerException);
        }
        v(th);
    }

    public void X(Object obj) {
    }

    public void Y() {
    }

    public final void Z(W w6) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        d0 d0Var = new d0();
        w6.getClass();
        U4.i.i.lazySet(d0Var, w6);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = U4.i.f5362h;
        atomicReferenceFieldUpdater2.lazySet(d0Var, w6);
        loop0: while (w6.m() == w6) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(w6, w6, d0Var)) {
                    d0Var.i(w6);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(w6) == w6);
        }
        U4.i iVarN = w6.n();
        do {
            atomicReferenceFieldUpdater = f4642h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, w6, iVarN)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == w6);
    }

    public final int a0(Object obj) {
        boolean z5 = obj instanceof G;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4642h;
        if (z5) {
            if (((G) obj).f4608h) {
                return 0;
            }
            G g6 = AbstractC0336x.f4680j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, g6)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            Y();
            return 1;
        }
        if (!(obj instanceof N)) {
            return 0;
        }
        d0 d0Var = ((N) obj).f4620h;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, d0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        Y();
        return 1;
    }

    @Override // P4.T
    public boolean b() {
        Object objI = I();
        return (objI instanceof O) && ((O) objI).b();
    }

    @Override // P4.T
    public void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(w(), null, this);
        }
        u(cancellationException);
    }

    public final Object c0(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof O)) {
            return AbstractC0336x.f4675d;
        }
        if (((obj instanceof G) || (obj instanceof W)) && !(obj instanceof C0323j) && !(obj2 instanceof C0327n)) {
            O o6 = (O) obj;
            Object p6 = obj2 instanceof O ? new P((O) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f4642h;
                if (atomicReferenceFieldUpdater.compareAndSet(this, o6, p6)) {
                    X(obj2);
                    y(o6, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == o6);
            return AbstractC0336x.f4677f;
        }
        O o7 = (O) obj;
        d0 d0VarH = H(o7);
        if (d0VarH == null) {
            return AbstractC0336x.f4677f;
        }
        C0323j c0323jU = null;
        Z z5 = o7 instanceof Z ? (Z) o7 : null;
        if (z5 == null) {
            z5 = new Z(d0VarH, null);
        }
        synchronized (z5) {
            if (z5.e()) {
                return AbstractC0336x.f4675d;
            }
            Z.i.set(z5, 1);
            if (z5 != o7) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4642h;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, o7, z5)) {
                    if (atomicReferenceFieldUpdater2.get(this) != o7) {
                        return AbstractC0336x.f4677f;
                    }
                }
            }
            boolean zD = z5.d();
            C0327n c0327n = obj2 instanceof C0327n ? (C0327n) obj2 : null;
            if (c0327n != null) {
                z5.a(c0327n.f4664a);
            }
            Throwable thC = z5.c();
            if (zD) {
                thC = null;
            }
            if (thC != null) {
                W(d0VarH, thC);
            }
            C0323j c0323j = o7 instanceof C0323j ? (C0323j) o7 : null;
            if (c0323j == null) {
                d0 d0VarG = o7.g();
                if (d0VarG != null) {
                    c0323jU = U(d0VarG);
                }
            } else {
                c0323jU = c0323j;
            }
            if (c0323jU != null) {
                while (c0323jU.f4655l.s((2 & 1) == 0, (2 & 2) != 0, new Y(this, z5, c0323jU, obj2)) == f0.f4652h) {
                    c0323jU = U(c0323jU);
                    if (c0323jU == null) {
                    }
                }
                return AbstractC0336x.f4676e;
            }
            return A(z5, obj2);
        }
    }

    @Override // p111u4.g
    public final p111u4.h getKey() {
        return C0332t.i;
    }

    @Override // P4.T
    public final T getParent() {
        InterfaceC0322i interfaceC0322i = (InterfaceC0322i) i.get(this);
        if (interfaceC0322i != null) {
            return interfaceC0322i.getParent();
        }
        return null;
    }

    @Override // P4.T
    public final boolean k() {
        int iA0;
        do {
            iA0 = a0(I());
            if (iA0 == 0) {
                return false;
            }
        } while (iA0 != 1);
        return true;
    }

    public final boolean n(O o6, d0 d0Var, W w6) {
        char c6;
        a0 a0Var = new a0(w6, this, o6);
        do {
            U4.i iVarH = d0Var.h();
            if (iVarH == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = U4.i.i;
                Object obj = atomicReferenceFieldUpdater.get(d0Var);
                while (true) {
                    iVarH = (U4.i) obj;
                    if (!iVarH.o()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(iVarH);
                }
            }
            U4.i.i.lazySet(w6, iVarH);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = U4.i.f5362h;
            atomicReferenceFieldUpdater2.lazySet(w6, d0Var);
            a0Var.f4638c = d0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(iVarH, d0Var, a0Var)) {
                    if (a0Var.a(iVarH) != null) {
                        c6 = 2;
                        break;
                    }
                    c6 = 1;
                    break;
                }
                if (atomicReferenceFieldUpdater2.get(iVarH) != d0Var) {
                    c6 = 0;
                    break;
                }
            }
            if (c6 == 1) {
                return true;
            }
        } while (c6 != 2);
        return false;
    }

    @Override // p111u4.i
    public final p111u4.i o(p111u4.i iVar) {
        return S1.h0.u(this, iVar);
    }

    public void p(Object obj) {
    }

    public void q(Object obj) {
        p(obj);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:97:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00c8 A[EDGE_INSN: B:98:0x00c8->B:77:0x00c8 BREAK  A[LOOP:0: B:18:0x0028->B:107:0x0028], SYNTHETIC] */
    @Override // P4.T
    public final E s(boolean z5, boolean z6, D4.c cVar) {
        W s6;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable thC;
        if (z5) {
            s6 = cVar instanceof U ? (U) cVar : null;
            if (s6 == null) {
                s6 = new Q(cVar);
            }
        } else {
            s6 = cVar instanceof W ? (W) cVar : null;
            if (s6 == null) {
                s6 = new S(0, cVar);
            }
        }
        s6.f4627k = this;
        loop0: while (true) {
            Object objI = I();
            if (objI instanceof G) {
                G g6 = (G) objI;
                if (g6.f4608h) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4642h;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, objI, s6)) {
                        if (atomicReferenceFieldUpdater2.get(this) != objI) {
                        }
                    }
                    break loop0;
                }
                d0 d0Var = new d0();
                O n6 = g6.f4608h ? d0Var : new N(d0Var);
                do {
                    atomicReferenceFieldUpdater = f4642h;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, g6, n6)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == g6);
            } else {
                if (!(objI instanceof O)) {
                    if (z6) {
                        C0327n c0327n = objI instanceof C0327n ? (C0327n) objI : null;
                        cVar.invoke(c0327n != null ? c0327n.f4664a : null);
                    }
                    return f0.f4652h;
                }
                d0 d0VarG = ((O) objI).g();
                if (d0VarG == null) {
                    E4.k.d("null cannot be cast to non-null type kotlinx.coroutines.JobNode", objI);
                    Z((W) objI);
                } else {
                    E e6 = f0.f4652h;
                    if (z5 && (objI instanceof Z)) {
                        synchronized (objI) {
                            try {
                                thC = ((Z) objI).c();
                                if (thC == null || ((cVar instanceof C0323j) && !((Z) objI).e())) {
                                    if (n((O) objI, d0VarG, s6)) {
                                        if (thC == null) {
                                            return s6;
                                        }
                                        e6 = s6;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (thC != null) {
                            if (z6) {
                                cVar.invoke(thC);
                            }
                            return e6;
                        }
                        if (n((O) objI, d0VarG, s6)) {
                            break;
                            break;
                        }
                    } else {
                        thC = null;
                        if (thC != null) {
                            if (z6) {
                                cVar.invoke(thC);
                            }
                            return e6;
                        }
                        if (n((O) objI, d0VarG, s6)) {
                            break;
                        }
                    }
                }
            }
        }
        return s6;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a A[PHI: r0
  0x003a: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v10 java.lang.Object) binds: [B:3:0x0008, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:24:0x0049, B:29:0x005e, B:32:0x0064, B:34:0x006d, B:37:0x0074), top: B:81:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0064 A[Catch: all -> 0x0072, TRY_ENTER, TryCatch #0 {all -> 0x0072, blocks: (B:24:0x0049, B:29:0x005e, B:32:0x0064, B:34:0x006d, B:37:0x0074), top: B:81:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006d A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:24:0x0049, B:29:0x005e, B:32:0x0064, B:34:0x006d, B:37:0x0074), top: B:81:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x0093  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x0105 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x0106  */
    /* JADX WARN: Code duplicated, block: B:81:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[LOOP:2: B:56:0x00b2->B:98:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x003e, please report this as an issue */
    public final boolean t(Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thZ;
        Object objI;
        Z z5;
        boolean z6;
        Throwable thC;
        C0308a c0308a;
        O o6;
        d0 d0VarH;
        Z z7;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object objC0;
        Object objC1 = AbstractC0336x.f4675d;
        if (F()) {
            do {
                Object objI2 = I();
                if (!(objI2 instanceof O) || ((objI2 instanceof Z) && ((Z) objI2).e())) {
                    objC1 = AbstractC0336x.f4675d;
                    break;
                }
                objC1 = c0(objI2, new C0327n(z(obj), false));
            } while (objC1 == AbstractC0336x.f4677f);
            if (objC1 != AbstractC0336x.f4676e) {
                if (objC1 == AbstractC0336x.f4675d) {
                    thZ = null;
                    loop1: while (true) {
                        objI = I();
                        if (objI instanceof Z) {
                            synchronized (objI) {
                                try {
                                    z5 = (Z) objI;
                                    z5.getClass();
                                    if (Z.f4634k.get(z5) == AbstractC0336x.f4679h) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z6) {
                                        c0308a = AbstractC0336x.f4678g;
                                    } else {
                                        boolean zD = ((Z) objI).d();
                                        if (thZ == null) {
                                            thZ = z(obj);
                                        }
                                        ((Z) objI).a(thZ);
                                        thC = zD ? null : ((Z) objI).c();
                                        if (thC != null) {
                                            W(((Z) objI).f4635h, thC);
                                        }
                                        c0308a = AbstractC0336x.f4675d;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } else if (objI instanceof O) {
                            if (thZ == null) {
                                thZ = z(obj);
                            }
                            o6 = (O) objI;
                            if (o6.b()) {
                                d0VarH = H(o6);
                                if (d0VarH == null) {
                                    continue;
                                } else {
                                    z7 = new Z(d0VarH, thZ);
                                    while (true) {
                                        atomicReferenceFieldUpdater = f4642h;
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, o6, z7)) {
                                            W(d0VarH, thZ);
                                            c0308a = AbstractC0336x.f4675d;
                                        } else if (atomicReferenceFieldUpdater.get(this) != o6) {
                                        }
                                    }
                                }
                            } else {
                                objC0 = c0(objI, new C0327n(thZ, false));
                                if (objC0 != AbstractC0336x.f4675d) {
                                    throw new IllegalStateException(("Cannot happen in " + objI).toString());
                                }
                                if (objC0 != AbstractC0336x.f4677f) {
                                    objC1 = objC0;
                                    break;
                                }
                            }
                        } else {
                            c0308a = AbstractC0336x.f4678g;
                        }
                        objC1 = c0308a;
                        break;
                    }
                }
                if (objC1 != AbstractC0336x.f4675d && objC1 != AbstractC0336x.f4676e) {
                    if (objC1 == AbstractC0336x.f4678g) {
                        return false;
                    }
                    p(objC1);
                    return true;
                }
            }
        } else {
            if (objC1 == AbstractC0336x.f4675d) {
                thZ = null;
                loop1: while (true) {
                    objI = I();
                    if (objI instanceof Z) {
                        synchronized (objI) {
                            z5 = (Z) objI;
                            z5.getClass();
                            if (Z.f4634k.get(z5) == AbstractC0336x.f4679h) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                c0308a = AbstractC0336x.f4678g;
                            } else {
                                boolean zD2 = ((Z) objI).d();
                                if (thZ == null) {
                                    thZ = z(obj);
                                }
                                ((Z) objI).a(thZ);
                                if (zD2) {
                                }
                                if (thC != null) {
                                    W(((Z) objI).f4635h, thC);
                                }
                                c0308a = AbstractC0336x.f4675d;
                            }
                        }
                    } else if (objI instanceof O) {
                        if (thZ == null) {
                            thZ = z(obj);
                        }
                        o6 = (O) objI;
                        if (o6.b()) {
                            d0VarH = H(o6);
                            if (d0VarH == null) {
                                continue;
                            } else {
                                z7 = new Z(d0VarH, thZ);
                                while (true) {
                                    atomicReferenceFieldUpdater = f4642h;
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, o6, z7)) {
                                        W(d0VarH, thZ);
                                        c0308a = AbstractC0336x.f4675d;
                                    } else if (atomicReferenceFieldUpdater.get(this) != o6) {
                                    }
                                }
                            }
                        } else {
                            objC0 = c0(objI, new C0327n(thZ, false));
                            if (objC0 != AbstractC0336x.f4675d) {
                                throw new IllegalStateException(("Cannot happen in " + objI).toString());
                            }
                            if (objC0 != AbstractC0336x.f4677f) {
                                objC1 = objC0;
                                break;
                            }
                        }
                    } else {
                        c0308a = AbstractC0336x.f4678g;
                    }
                    objC1 = c0308a;
                    break;
                }
            }
            if (objC1 != AbstractC0336x.f4675d) {
                if (objC1 == AbstractC0336x.f4678g) {
                    return false;
                }
                p(objC1);
                return true;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + b0(I()) + '}');
        sb.append('@');
        sb.append(AbstractC0336x.h(this));
        return sb.toString();
    }

    public void u(CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        t(cancellationException);
    }

    public final boolean v(Throwable th) {
        if (P()) {
            return true;
        }
        boolean z5 = th instanceof CancellationException;
        InterfaceC0322i interfaceC0322i = (InterfaceC0322i) i.get(this);
        if (interfaceC0322i == null || interfaceC0322i == f0.f4652h) {
            return z5;
        }
        return interfaceC0322i.e(th) || z5;
    }

    public String w() {
        return "Job was cancelled";
    }

    public boolean x(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return t(th) && E();
    }

    public final void y(O o6, Object obj) throws IllegalAccessException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        InterfaceC0322i interfaceC0322i = (InterfaceC0322i) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0322i != null) {
            interfaceC0322i.a();
            atomicReferenceFieldUpdater.set(this, f0.f4652h);
        }
        CompletionHandlerException completionHandlerException = null;
        C0327n c0327n = obj instanceof C0327n ? (C0327n) obj : null;
        Throwable th = c0327n != null ? c0327n.f4664a : null;
        if (o6 instanceof W) {
            try {
                ((W) o6).q(th);
                return;
            } catch (Throwable th2) {
                N(new CompletionHandlerException("Exception in completion handler " + o6 + " for " + this, th2));
                return;
            }
        }
        d0 d0VarG = o6.g();
        if (d0VarG != null) {
            Object objM = d0VarG.m();
            E4.k.d("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", objM);
            for (U4.i iVarN = (U4.i) objM; !iVarN.equals(d0VarG); iVarN = iVarN.n()) {
                if (iVarN instanceof W) {
                    W w6 = (W) iVarN;
                    try {
                        w6.q(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            p081p0.c.D(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + w6 + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                N(completionHandlerException);
            }
        }
    }

    public final Throwable z(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        b0 b0Var = (b0) ((h0) obj);
        Object objI = b0Var.I();
        if (objI instanceof Z) {
            thC = ((Z) objI).c();
        } else if (objI instanceof C0327n) {
            thC = ((C0327n) objI).f4664a;
        } else {
            if (objI instanceof O) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objI).toString());
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(b0(objI)), thC, b0Var) : cancellationException;
    }
}
