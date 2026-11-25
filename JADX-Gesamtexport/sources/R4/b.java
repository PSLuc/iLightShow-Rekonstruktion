package R4;

import B.AbstractC0013g0;
import E4.z;
import O1.C0308a;
import P4.AbstractC0336x;
import P4.C0319f;
import P4.InterfaceC0318e;
import P4.p0;
import S1.V;
import U4.r;
import U4.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import p015c2.AbstractC0473d;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public class b implements f {
    public static final AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4815j = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4816k = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4817l = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4818m = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4819n = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4820o = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4821p = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4822q = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4823h;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public b(int i3) {
        this.f4823h = i3;
        if (i3 < 0) {
            throw new IllegalArgumentException(AbstractC0013g0.f(i3, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        j jVar = d.f4825a;
        this.bufferEnd = i3 != 0 ? i3 != Integer.MAX_VALUE ? i3 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f4816k.get(this);
        j jVar2 = new j(0L, null, this, 3);
        this.sendSegment = jVar2;
        this.receiveSegment = jVar2;
        if (w()) {
            jVar2 = d.f4825a;
            E4.k.d("null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>", jVar2);
        }
        this.bufferEndSegment = jVar2;
        this._closeCause = d.f4842s;
    }

    public static boolean B(Object obj) {
        if (!(obj instanceof InterfaceC0318e)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        E4.k.d("null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>", obj);
        InterfaceC0318e interfaceC0318e = (InterfaceC0318e) obj;
        j jVar = d.f4825a;
        C0308a c0308aH = interfaceC0318e.h(x.f10867a, null);
        if (c0308aH == null) {
            return false;
        }
        interfaceC0318e.r(c0308aH);
        return true;
    }

    public static final j a(b bVar, long j4, j jVar) {
        Object objA;
        b bVar2;
        bVar.getClass();
        j jVar2 = d.f4825a;
        c cVar = c.f4824p;
        loop0: while (true) {
            objA = U4.a.a(jVar, j4, cVar);
            if (!U4.a.d(objA)) {
                r rVarB = U4.a.b(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4818m;
                    r rVar = (r) atomicReferenceFieldUpdater.get(bVar);
                    if (rVar.f5377j >= rVarB.f5377j) {
                        break loop0;
                    }
                    if (!rVarB.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(bVar, rVar, rVarB)) {
                            if (!rVar.e()) {
                                break loop0;
                            }
                            rVar.d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(bVar) == rVar);
                    if (rVarB.e()) {
                        rVarB.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean zD = U4.a.d(objA);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4815j;
        if (zD) {
            bVar.i();
            if (jVar.f5377j * ((long) d.f4826b) < atomicLongFieldUpdater.get(bVar)) {
                jVar.a();
                return null;
            }
        } else {
            j jVar3 = (j) U4.a.b(objA);
            long j6 = jVar3.f5377j;
            if (j6 <= j4) {
                return jVar3;
            }
            long j7 = ((long) d.f4826b) * j6;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = i;
                long j8 = atomicLongFieldUpdater2.get(bVar);
                long j9 = 1152921504606846975L & j8;
                if (j9 >= j7) {
                    bVar2 = bVar;
                    break;
                }
                bVar2 = bVar;
                if (atomicLongFieldUpdater2.compareAndSet(bVar2, j8, j9 + (((long) ((int) (j8 >> 60))) << 60))) {
                    break;
                }
                bVar = bVar2;
            }
            if (j6 * ((long) d.f4826b) < atomicLongFieldUpdater.get(bVar2)) {
                jVar3.a();
            }
        }
        return null;
    }

    public static final void b(b bVar, Object obj, C0319f c0319f) {
        bVar.getClass();
        c0319f.g(V.v(bVar.r()));
    }

    public static final int d(b bVar, j jVar, int i3, Object obj, long j4, Object obj2, boolean z5) {
        bVar.getClass();
        jVar.m(i3, obj);
        if (z5) {
            return bVar.D(jVar, i3, obj, j4, obj2, z5);
        }
        Object objK = jVar.k(i3);
        if (objK == null) {
            if (bVar.e(j4)) {
                if (jVar.j(null, i3, d.f4828d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (jVar.j(null, i3, obj2)) {
                    return 2;
                }
            }
        } else if (objK instanceof p0) {
            jVar.m(i3, null);
            if (bVar.A(objK, obj)) {
                jVar.n(i3, d.i);
                return 0;
            }
            C0308a c0308a = d.f4834k;
            if (jVar.f4849m.getAndSet((i3 * 2) + 1, c0308a) == c0308a) {
                return 5;
            }
            jVar.l(i3, true);
            return 5;
        }
        return bVar.D(jVar, i3, obj, j4, obj2, z5);
    }

    public static void t(b bVar) {
        bVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4817l;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean A(Object obj, Object obj2) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof InterfaceC0318e)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            E4.k.d("null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>", obj);
            InterfaceC0318e interfaceC0318e = (InterfaceC0318e) obj;
            j jVar = d.f4825a;
            C0308a c0308aH = interfaceC0318e.h(obj2, null);
            if (c0308aH == null) {
                return false;
            }
            interfaceC0318e.r(c0308aH);
            return true;
        }
        E4.k.d("null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>", obj);
        a aVar = (a) obj;
        C0319f c0319f = aVar.i;
        E4.k.c(c0319f);
        aVar.i = null;
        aVar.f4813h = obj2;
        Boolean bool = Boolean.TRUE;
        aVar.f4814j.getClass();
        j jVar2 = d.f4825a;
        C0308a c0308aH2 = c0319f.h(bool, null);
        if (c0308aH2 == null) {
            return false;
        }
        c0319f.r(c0308aH2);
        return true;
    }

    public final Object C(j jVar, int i3, long j4, Object obj) {
        Object objK = jVar.k(i3);
        AtomicReferenceArray atomicReferenceArray = jVar.f4849m;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        if (objK == null) {
            if (j4 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f4837n;
                }
                if (jVar.j(objK, i3, obj)) {
                    n();
                    return d.f4836m;
                }
            }
        } else if (objK == d.f4828d && jVar.j(objK, i3, d.i)) {
            n();
            Object obj2 = atomicReferenceArray.get(i3 * 2);
            jVar.m(i3, null);
            return obj2;
        }
        while (true) {
            Object objK2 = jVar.k(i3);
            if (objK2 == null || objK2 == d.f4829e) {
                if (j4 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (jVar.j(objK2, i3, d.f4832h)) {
                        n();
                        return d.f4838o;
                    }
                } else {
                    if (obj == null) {
                        return d.f4837n;
                    }
                    if (jVar.j(objK2, i3, obj)) {
                        n();
                        return d.f4836m;
                    }
                }
            } else {
                if (objK2 != d.f4828d) {
                    C0308a c0308a = d.f4833j;
                    if (objK2 != c0308a && objK2 != d.f4832h) {
                        if (objK2 == d.f4835l) {
                            n();
                            return d.f4838o;
                        }
                        if (objK2 != d.f4831g && jVar.j(objK2, i3, d.f4830f)) {
                            boolean z5 = objK2 instanceof p;
                            if (z5) {
                                objK2 = ((p) objK2).f4852a;
                            }
                            if (B(objK2)) {
                                jVar.n(i3, d.i);
                                n();
                                Object obj3 = atomicReferenceArray.get(i3 * 2);
                                jVar.m(i3, null);
                                return obj3;
                            }
                            jVar.n(i3, c0308a);
                            jVar.h();
                            if (z5) {
                                n();
                            }
                            return d.f4838o;
                        }
                    }
                    return d.f4838o;
                }
                if (jVar.j(objK2, i3, d.i)) {
                    n();
                    Object obj4 = atomicReferenceArray.get(i3 * 2);
                    jVar.m(i3, null);
                    return obj4;
                }
            }
        }
    }

    public final int D(j jVar, int i3, Object obj, long j4, Object obj2, boolean z5) {
        while (true) {
            Object objK = jVar.k(i3);
            if (objK == null) {
                if (!e(j4) || z5) {
                    if (z5) {
                        if (jVar.j(null, i3, d.f4833j)) {
                            jVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (jVar.j(null, i3, obj2)) {
                            return 2;
                        }
                    }
                } else if (jVar.j(null, i3, d.f4828d)) {
                    break;
                }
            } else {
                if (objK != d.f4829e) {
                    C0308a c0308a = d.f4834k;
                    if (objK == c0308a) {
                        jVar.m(i3, null);
                        return 5;
                    }
                    if (objK == d.f4832h) {
                        jVar.m(i3, null);
                        return 5;
                    }
                    if (objK == d.f4835l) {
                        jVar.m(i3, null);
                        i();
                        return 4;
                    }
                    jVar.m(i3, null);
                    if (objK instanceof p) {
                        objK = ((p) objK).f4852a;
                    }
                    if (A(objK, obj)) {
                        jVar.n(i3, d.i);
                        return 0;
                    }
                    if (jVar.f4849m.getAndSet((i3 * 2) + 1, c0308a) != c0308a) {
                        jVar.l(i3, true);
                    }
                    return 5;
                }
                if (jVar.j(objK, i3, d.f4828d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void E(long j4) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        b bVar = this;
        if (bVar.w()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f4816k;
            if (atomicLongFieldUpdater.get(bVar) > j4) {
                break;
            } else {
                bVar = this;
            }
        }
        int i3 = d.f4827c;
        int i6 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4817l;
            if (i6 < i3) {
                long j6 = atomicLongFieldUpdater.get(bVar);
                if (j6 == (4611686018427387903L & atomicLongFieldUpdater2.get(bVar)) && j6 == atomicLongFieldUpdater.get(bVar)) {
                    return;
                } else {
                    i6++;
                }
            } else {
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(bVar);
                    if (atomicLongFieldUpdater2.compareAndSet(bVar, j7, (j7 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        bVar = this;
                    }
                }
                while (true) {
                    long j8 = atomicLongFieldUpdater.get(bVar);
                    long j9 = atomicLongFieldUpdater2.get(bVar);
                    long j10 = j9 & 4611686018427387903L;
                    boolean z5 = (j9 & 4611686018427387904L) != 0;
                    if (j8 == j10 && j8 == atomicLongFieldUpdater.get(bVar)) {
                        break;
                    }
                    if (!z5) {
                        atomicLongFieldUpdater2.compareAndSet(this, j9, 4611686018427387904L + j10);
                    }
                    bVar = this;
                }
                while (true) {
                    long j11 = atomicLongFieldUpdater2.get(bVar);
                    if (atomicLongFieldUpdater2.compareAndSet(bVar, j11, j11 & 4611686018427387903L)) {
                        return;
                    } else {
                        bVar = this;
                    }
                }
            }
        }
    }

    @Override // R4.n
    public final void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    public final boolean e(long j4) {
        return j4 < f4816k.get(this) || j4 < f4815j.get(this) + ((long) this.f4823h);
    }

    @Override // R4.n
    public final Object f() {
        j jVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4815j;
        long j4 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = i;
        long j6 = atomicLongFieldUpdater2.get(this);
        if (u(j6, true)) {
            return new g(p());
        }
        long j7 = j6 & 1152921504606846975L;
        h hVar = i.f4847a;
        if (j4 >= j7) {
            return hVar;
        }
        Object obj = d.f4834k;
        j jVar2 = (j) f4819n.get(this);
        while (!this.u(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j8 = d.f4826b;
            long j9 = andIncrement / j8;
            int i3 = (int) (andIncrement % j8);
            if (jVar2.f5377j != j9) {
                j jVarO = this.o(j9, jVar2);
                if (jVarO == null) {
                    continue;
                } else {
                    jVar = jVarO;
                }
            } else {
                jVar = jVar2;
            }
            b bVar = this;
            Object objC = bVar.C(jVar, i3, andIncrement, obj);
            jVar2 = jVar;
            if (objC == d.f4836m) {
                p0 p0Var = obj instanceof p0 ? (p0) obj : null;
                if (p0Var != null) {
                    p0Var.b(jVar2, i3);
                }
                bVar.E(andIncrement);
                jVar2.h();
                return hVar;
            }
            if (objC != d.f4838o) {
                if (objC == d.f4837n) {
                    throw new IllegalStateException("unexpected");
                }
                jVar2.a();
                return objC;
            }
            if (andIncrement < bVar.s()) {
                jVar2.a();
            }
            this = bVar;
        }
        return new g(this.p());
    }

    public final boolean g(Throwable th, boolean z5) {
        b bVar;
        boolean z6;
        long j4;
        long j6;
        long j7;
        Object obj;
        long j8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        if (!z5) {
            bVar = this;
            break;
        }
        while (true) {
            long j9 = atomicLongFieldUpdater.get(this);
            if (((int) (j9 >> 60)) != 0) {
                bVar = this;
                break;
            }
            j jVar = d.f4825a;
            bVar = this;
            if (atomicLongFieldUpdater.compareAndSet(bVar, j9, (j9 & 1152921504606846975L) + (((long) 1) << 60))) {
                break;
            }
            this = bVar;
        }
        C0308a c0308a = d.f4842s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4821p;
            if (atomicReferenceFieldUpdater.compareAndSet(bVar, c0308a, th)) {
                z6 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(bVar) != c0308a) {
                z6 = false;
                break;
            }
        }
        if (z5) {
            do {
                j8 = atomicLongFieldUpdater.get(bVar);
            } while (!atomicLongFieldUpdater.compareAndSet(bVar, j8, (((long) 3) << 60) + (j8 & 1152921504606846975L)));
        } else {
            do {
                j4 = atomicLongFieldUpdater.get(bVar);
                int i3 = (int) (j4 >> 60);
                if (i3 == 0) {
                    j6 = j4 & 1152921504606846975L;
                    j7 = 2;
                } else {
                    if (i3 != 1) {
                        break;
                    }
                    j6 = j4 & 1152921504606846975L;
                    j7 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(bVar, j4, (j7 << 60) + j6));
        }
        bVar.i();
        if (z6) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4822q;
                obj = atomicReferenceFieldUpdater2.get(bVar);
                C0308a c0308a2 = obj == null ? d.f4840q : d.f4841r;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(bVar, obj, c0308a2)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(bVar) == obj);
            }
            if (obj != null) {
                z.d(1, obj);
                ((D4.c) obj).invoke(bVar.p());
                return z6;
            }
        }
        return z6;
    }

    public final j h(long j4) {
        Object objE;
        long j6;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj = f4820o.get(this);
        j jVar = (j) f4818m.get(this);
        if (jVar.f5377j > ((j) obj).f5377j) {
            obj = jVar;
        }
        j jVar2 = (j) f4819n.get(this);
        if (jVar2.f5377j > ((j) obj).f5377j) {
            obj = jVar2;
        }
        U4.c cVar = (U4.c) obj;
        loop0: while (true) {
            cVar.getClass();
            Object obj2 = U4.c.f5348h.get(cVar);
            C0308a c0308a = U4.a.f5342b;
            objE = null;
            if (obj2 == c0308a) {
                break;
            }
            U4.c cVar2 = (U4.c) obj2;
            if (cVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = U4.c.f5348h;
                    if (atomicReferenceFieldUpdater.compareAndSet(cVar, null, c0308a)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(cVar) == null);
            } else {
                cVar = cVar2;
            }
        }
        j jVar3 = (j) cVar;
        if (v()) {
            j jVar4 = jVar3;
            loop2: while (true) {
                int i3 = d.f4826b - 1;
                while (true) {
                    if (-1 < i3) {
                        j6 = (jVar4.f5377j * ((long) d.f4826b)) + ((long) i3);
                        if (j6 >= f4815j.get(this)) {
                            while (true) {
                                Object objK = jVar4.k(i3);
                                if (objK != null && objK != d.f4829e) {
                                    if (objK != d.f4828d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (jVar4.j(objK, i3, d.f4835l)) {
                                    jVar4.h();
                                    break;
                                }
                            }
                            i3--;
                        }
                    } else {
                        jVar4 = (j) ((U4.c) U4.c.i.get(jVar4));
                        if (jVar4 == null) {
                        }
                    }
                    j6 = -1;
                    break;
                }
            }
            if (j6 != -1) {
                k(j6);
            }
        }
        loop5: for (j jVar5 = jVar3; jVar5 != null; jVar5 = (j) ((U4.c) U4.c.i.get(jVar5))) {
            for (int i6 = d.f4826b - 1; -1 < i6; i6--) {
                if ((jVar5.f5377j * ((long) d.f4826b)) + ((long) i6) < j4) {
                    break loop5;
                }
                while (true) {
                    Object objK2 = jVar5.k(i6);
                    if (objK2 != null && objK2 != d.f4829e) {
                        if (!(objK2 instanceof p)) {
                            if (!(objK2 instanceof p0)) {
                                break;
                            }
                            if (jVar5.j(objK2, i6, d.f4835l)) {
                                objE = U4.a.e(objE, objK2);
                                jVar5.l(i6, true);
                                break;
                            }
                        } else {
                            if (jVar5.j(objK2, i6, d.f4835l)) {
                                objE = U4.a.e(objE, ((p) objK2).f4852a);
                                jVar5.l(i6, true);
                                break;
                            }
                        }
                    } else {
                        if (jVar5.j(objK2, i6, d.f4835l)) {
                            jVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (objE != null) {
            if (!(objE instanceof ArrayList)) {
                z((p0) objE, true);
                return jVar3;
            }
            ArrayList arrayList = (ArrayList) objE;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                z((p0) arrayList.get(size), true);
            }
        }
        return jVar3;
    }

    public final void i() {
        u(i.get(this), false);
    }

    @Override // R4.n
    public final a iterator() {
        return new a(this);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x007d A[SYNTHETIC] */
    @Override // R4.o
    public Object j(Object obj) {
        int iD;
        x xVar;
        p0 p0Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        long j4 = atomicLongFieldUpdater.get(this);
        boolean z5 = false;
        long j6 = 1152921504606846975L;
        boolean z6 = u(j4, false) ? false : !e(j4 & 1152921504606846975L);
        h hVar = i.f4847a;
        if (z6) {
            return hVar;
        }
        q5.p pVar = d.f4833j;
        j jVar = (j) f4818m.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j7 = andIncrement & j6;
            boolean zU = u(andIncrement, z5);
            int i3 = d.f4826b;
            long j8 = i3;
            long j9 = j7 / j8;
            int i6 = (int) (j7 % j8);
            if (jVar.f5377j == j9) {
                iD = d(this, jVar, i6, obj, j7, pVar, zU);
                xVar = x.f10867a;
                if (iD != 0) {
                    jVar.a();
                    return xVar;
                }
                if (iD != 1) {
                    return xVar;
                }
                if (iD != 2) {
                    if (zU) {
                        jVar.h();
                        return new g(r());
                    }
                    if (pVar instanceof p0) {
                        p0Var = (p0) pVar;
                    } else {
                        p0Var = null;
                    }
                    if (p0Var != null) {
                        p0Var.b(jVar, i6 + i3);
                    }
                    jVar.h();
                    return hVar;
                }
                if (iD != 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iD != 4) {
                    if (j7 < f4815j.get(this)) {
                        jVar.a();
                    }
                    return new g(r());
                }
                if (iD == 5) {
                    jVar.a();
                }
                z5 = false;
            } else {
                j jVarA = a(this, j9, jVar);
                if (jVarA != null) {
                    jVar = jVarA;
                    iD = d(this, jVar, i6, obj, j7, pVar, zU);
                    xVar = x.f10867a;
                    if (iD != 0) {
                        jVar.a();
                        return xVar;
                    }
                    if (iD != 1) {
                        return xVar;
                    }
                    if (iD != 2) {
                        if (zU) {
                            jVar.h();
                            return new g(r());
                        }
                        if (pVar instanceof p0) {
                            p0Var = (p0) pVar;
                        } else {
                            p0Var = null;
                        }
                        if (p0Var != null) {
                            p0Var.b(jVar, i6 + i3);
                        }
                        jVar.h();
                        return hVar;
                    }
                    if (iD != 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iD != 4) {
                        if (j7 < f4815j.get(this)) {
                            jVar.a();
                        }
                        return new g(r());
                    }
                    if (iD == 5) {
                        jVar.a();
                    }
                    z5 = false;
                } else {
                    if (zU) {
                        return new g(r());
                    }
                    z5 = false;
                }
            }
            j6 = 1152921504606846975L;
        }
    }

    public final void k(long j4) {
        j jVar = (j) f4819n.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4815j;
            long j6 = atomicLongFieldUpdater.get(this);
            if (j4 < Math.max(((long) this.f4823h) + j6, f4816k.get(this))) {
                return;
            }
            this = this;
            if (atomicLongFieldUpdater.compareAndSet(this, j6, 1 + j6)) {
                long j7 = d.f4826b;
                long j8 = j6 / j7;
                int i3 = (int) (j6 % j7);
                if (jVar.f5377j != j8) {
                    j jVarO = this.o(j8, jVar);
                    if (jVarO != null) {
                        jVar = jVarO;
                    }
                }
                j jVar2 = jVar;
                if (this.C(jVar2, i3, j6, null) != d.f4838o || j6 < this.s()) {
                    jVar2.a();
                }
                jVar = jVar2;
            }
        }
    }

    @Override // R4.n
    public final Object l(p122w4.i iVar) throws Throwable {
        j jVar;
        Throwable th;
        j jVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4819n;
        j jVar3 = (j) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = i;
            if (this.u(atomicLongFieldUpdater.get(this), true)) {
                Throwable thQ = this.q();
                int i3 = s.f5378a;
                throw thQ;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4815j;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(this);
            long j4 = d.f4826b;
            long j6 = andIncrement / j4;
            int i6 = (int) (andIncrement % j4);
            if (jVar3.f5377j != j6) {
                j jVarO = this.o(j6, jVar3);
                if (jVarO == null) {
                    continue;
                } else {
                    jVar = jVarO;
                }
            } else {
                jVar = jVar3;
            }
            b bVar = this;
            Object objC = bVar.C(jVar, i6, andIncrement, null);
            C0308a c0308a = d.f4836m;
            if (objC == c0308a) {
                throw new IllegalStateException("unexpected");
            }
            C0308a c0308a2 = d.f4838o;
            if (objC == c0308a2) {
                if (andIncrement < bVar.s()) {
                    jVar.a();
                }
                this = bVar;
                jVar3 = jVar;
            } else {
                if (objC != d.f4837n) {
                    jVar.a();
                    return objC;
                }
                C0319f c0319fJ = AbstractC0336x.j(AbstractC0473d.F(iVar));
                try {
                    Object objC2 = bVar.C(jVar, i6, andIncrement, c0319fJ);
                    if (objC2 != c0308a) {
                        if (objC2 == c0308a2) {
                            if (andIncrement < bVar.s()) {
                                jVar.a();
                            }
                            j jVar4 = (j) atomicReferenceFieldUpdater.get(bVar);
                            while (true) {
                                if (bVar.u(atomicLongFieldUpdater.get(bVar), true)) {
                                    c0319fJ.g(V.v(bVar.q()));
                                    break;
                                }
                                C0319f c0319f = c0319fJ;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(bVar);
                                    long j7 = d.f4826b;
                                    long j8 = andIncrement2 / j7;
                                    int i7 = (int) (andIncrement2 % j7);
                                    if (jVar4.f5377j != j8) {
                                        try {
                                            j jVarO2 = bVar.o(j8, jVar4);
                                            if (jVarO2 == null) {
                                                c0319fJ = c0319f;
                                            } else {
                                                jVar2 = jVarO2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c0319fJ = c0319f;
                                            c0319fJ.B();
                                            throw th;
                                        }
                                    } else {
                                        jVar2 = jVar4;
                                    }
                                    b bVar2 = bVar;
                                    objC2 = bVar2.C(jVar2, i7, andIncrement2, c0319f);
                                    bVar = bVar2;
                                    j jVar5 = jVar2;
                                    c0319fJ = c0319f;
                                    if (objC2 == d.f4836m) {
                                        c0319fJ.b(jVar5, i7);
                                        break;
                                    }
                                    if (objC2 == d.f4838o) {
                                        if (andIncrement2 < bVar.s()) {
                                            jVar5.a();
                                        }
                                        jVar4 = jVar5;
                                    } else {
                                        if (objC2 == d.f4837n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        jVar5.a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c0319fJ = c0319f;
                                    th = th;
                                    c0319fJ.B();
                                    throw th;
                                }
                            }
                        } else {
                            jVar.a();
                        }
                        c0319fJ.C(objC2, null);
                        break;
                    }
                    c0319fJ.b(jVar, i6);
                    Object objT = c0319fJ.t();
                    v4.a aVar = v4.a.f13292h;
                    return objT;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x014d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0150 A[RETURN] */
    @Override // R4.o
    public Object m(Object obj, p111u4.d dVar) {
        x xVar;
        Object objT;
        v4.a aVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4818m;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = i;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = andIncrement & 1152921504606846975L;
            boolean zU = u(andIncrement, false);
            int i3 = d.f4826b;
            long j6 = i3;
            long j7 = j4 / j6;
            int i6 = (int) (j4 % j6);
            long j8 = jVar.f5377j;
            xVar = x.f10867a;
            if (j8 != j7) {
                j jVarA = a(this, j7, jVar);
                if (jVarA != null) {
                    jVar = jVarA;
                } else if (zU) {
                    Object objY = y(obj, dVar);
                    if (objY == v4.a.f13292h) {
                        return objY;
                    }
                }
            }
            int iD = d(this, jVar, i6, obj, j4, null, zU);
            if (iD == 0) {
                jVar.a();
                return xVar;
            }
            if (iD != 1) {
                if (iD == 2) {
                    if (!zU) {
                        break;
                    }
                    jVar.h();
                    Object objY2 = y(obj, dVar);
                    if (objY2 == v4.a.f13292h) {
                        return objY2;
                    }
                } else {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4815j;
                    if (iD == 3) {
                        C0319f c0319fJ = AbstractC0336x.j(AbstractC0473d.F(dVar));
                        try {
                            int iD2 = d(this, jVar, i6, obj, j4, c0319fJ, false);
                            if (iD2 != 0) {
                                if (iD2 != 1) {
                                    if (iD2 != 2) {
                                        if (iD2 != 4) {
                                            String str = "unexpected";
                                            if (iD2 != 5) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            jVar.a();
                                            j jVar2 = (j) atomicReferenceFieldUpdater.get(this);
                                            while (true) {
                                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                                long j9 = andIncrement2 & 1152921504606846975L;
                                                boolean zU2 = u(andIncrement2, false);
                                                int i7 = d.f4826b;
                                                str = str;
                                                long j10 = i7;
                                                atomicLongFieldUpdater2 = atomicLongFieldUpdater2;
                                                long j11 = j9 / j10;
                                                int i8 = (int) (j9 % j10);
                                                if (jVar2.f5377j != j11) {
                                                    j jVarA2 = a(this, j11, jVar2);
                                                    if (jVarA2 != null) {
                                                        jVar2 = jVarA2;
                                                    } else if (zU2) {
                                                    }
                                                }
                                                int iD3 = d(this, jVar2, i8, obj, j9, c0319fJ, zU2);
                                                if (iD3 == 0) {
                                                    jVar2.a();
                                                } else if (iD3 != 1) {
                                                    if (iD3 == 2) {
                                                        if (!zU2) {
                                                            c0319fJ.b(jVar2, i8 + i7);
                                                            break;
                                                        }
                                                        jVar2.h();
                                                    } else {
                                                        if (iD3 == 3) {
                                                            throw new IllegalStateException(str);
                                                        }
                                                        if (iD3 != 4) {
                                                            if (iD3 == 5) {
                                                                jVar2.a();
                                                            }
                                                        } else if (j9 < atomicLongFieldUpdater2.get(this)) {
                                                            jVar2.a();
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (j4 < atomicLongFieldUpdater2.get(this)) {
                                            jVar.a();
                                        }
                                        b(this, obj, c0319fJ);
                                        break;
                                    } else {
                                        c0319fJ.b(jVar, i6 + i3);
                                    }
                                }
                                objT = c0319fJ.t();
                                aVar = v4.a.f13292h;
                                if (objT != aVar) {
                                    objT = xVar;
                                }
                                if (objT == aVar) {
                                    return objT;
                                }
                            } else {
                                jVar.a();
                            }
                            c0319fJ.g(xVar);
                            objT = c0319fJ.t();
                            aVar = v4.a.f13292h;
                            if (objT != aVar) {
                                objT = xVar;
                            }
                            if (objT == aVar) {
                                return objT;
                            }
                        } catch (Throwable th) {
                            c0319fJ.B();
                            throw th;
                        }
                    } else if (iD == 4) {
                        if (j4 < atomicLongFieldUpdater2.get(this)) {
                            jVar.a();
                        }
                        Object objY3 = y(obj, dVar);
                        if (objY3 == v4.a.f13292h) {
                            return objY3;
                        }
                    } else if (iD == 5) {
                        jVar.a();
                    }
                }
            } else {
                break;
            }
        }
        return xVar;
    }

    public final void n() {
        Object objA;
        if (w()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4820o;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = f4816k.getAndIncrement(this);
            long j4 = andIncrement / ((long) d.f4826b);
            if (s() <= andIncrement) {
                if (jVar.f5377j < j4 && jVar.b() != null) {
                    x(j4, jVar);
                }
                t(this);
                return;
            }
            if (jVar.f5377j != j4) {
                c cVar = c.f4824p;
                while (true) {
                    objA = U4.a.a(jVar, j4, cVar);
                    if (!U4.a.d(objA)) {
                        r rVarB = U4.a.b(objA);
                        while (true) {
                            r rVar = (r) atomicReferenceFieldUpdater.get(this);
                            if (rVar.f5377j >= rVarB.f5377j) {
                                break;
                            }
                            if (!rVarB.i()) {
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, rVar, rVarB)) {
                                    if (!rVar.e()) {
                                        break;
                                    }
                                    rVar.d();
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == rVar);
                            if (rVarB.e()) {
                                rVarB.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                j jVar2 = null;
                if (U4.a.d(objA)) {
                    i();
                    x(j4, jVar);
                    t(this);
                } else {
                    j jVar3 = (j) U4.a.b(objA);
                    long j6 = jVar3.f5377j;
                    if (j6 > j4) {
                        long j7 = j6 * ((long) d.f4826b);
                        if (f4816k.compareAndSet(this, 1 + andIncrement, j7)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f4817l;
                            if ((atomicLongFieldUpdater.addAndGet(this, j7 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            t(this);
                        }
                    } else {
                        jVar2 = jVar3;
                    }
                }
                if (jVar2 == null) {
                    continue;
                } else {
                    jVar = jVar2;
                }
            }
            int i3 = (int) (andIncrement % ((long) d.f4826b));
            Object objK = jVar.k(i3);
            boolean z5 = objK instanceof p0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4815j;
            if (!z5 || andIncrement < atomicLongFieldUpdater2.get(this) || !jVar.j(objK, i3, d.f4831g)) {
                while (true) {
                    Object objK2 = jVar.k(i3);
                    if (objK2 instanceof p0) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (jVar.j(objK2, i3, new p((p0) objK2))) {
                                t(this);
                                return;
                            }
                        } else if (jVar.j(objK2, i3, d.f4831g)) {
                            if (!B(objK2)) {
                                jVar.n(i3, d.f4833j);
                                jVar.h();
                                break;
                            } else {
                                jVar.n(i3, d.f4828d);
                                t(this);
                                return;
                            }
                        }
                    } else {
                        if (objK2 == d.f4833j) {
                            break;
                        }
                        if (objK2 == null) {
                            if (jVar.j(objK2, i3, d.f4829e)) {
                                t(this);
                                return;
                            }
                        } else if (objK2 == d.f4828d || objK2 == d.f4832h || objK2 == d.i || objK2 == d.f4834k || objK2 == d.f4835l) {
                            t(this);
                            return;
                        } else if (objK2 != d.f4830f) {
                            throw new IllegalStateException(("Unexpected cell state: " + objK2).toString());
                        }
                    }
                }
                t(this);
            } else if (B(objK)) {
                jVar.n(i3, d.f4828d);
                t(this);
                return;
            } else {
                jVar.n(i3, d.f4833j);
                jVar.h();
                t(this);
            }
        }
    }

    public final j o(long j4, j jVar) {
        Object objA;
        b bVar;
        j jVar2 = d.f4825a;
        c cVar = c.f4824p;
        loop0: while (true) {
            objA = U4.a.a(jVar, j4, cVar);
            if (!U4.a.d(objA)) {
                r rVarB = U4.a.b(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4819n;
                    r rVar = (r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f5377j >= rVarB.f5377j) {
                        break loop0;
                    }
                    if (!rVarB.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, rVar, rVarB)) {
                            if (!rVar.e()) {
                                break loop0;
                            }
                            rVar.d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == rVar);
                    if (rVarB.e()) {
                        rVarB.d();
                    }
                }
            } else {
                break;
            }
        }
        if (U4.a.d(objA)) {
            i();
            if (jVar.f5377j * ((long) d.f4826b) < s()) {
                jVar.a();
                return null;
            }
        } else {
            j jVar3 = (j) U4.a.b(objA);
            boolean zW = w();
            long j6 = jVar3.f5377j;
            if (!zW && j4 <= f4816k.get(this) / ((long) d.f4826b)) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4820o;
                    r rVar2 = (r) atomicReferenceFieldUpdater2.get(this);
                    if (rVar2.f5377j >= j6 || !jVar3.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, rVar2, jVar3)) {
                            if (!rVar2.e()) {
                                break loop3;
                            }
                            rVar2.d();
                            break loop3;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == rVar2);
                    if (jVar3.e()) {
                        jVar3.d();
                    }
                }
            }
            if (j6 <= j4) {
                return jVar3;
            }
            long j7 = j6 * ((long) d.f4826b);
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = f4815j;
                long j8 = atomicLongFieldUpdater.get(this);
                if (j8 >= j7) {
                    bVar = this;
                    break;
                }
                bVar = this;
                if (atomicLongFieldUpdater.compareAndSet(bVar, j8, j7)) {
                    break;
                }
                this = bVar;
            }
            if (j6 * ((long) d.f4826b) < bVar.s()) {
                jVar3.a();
            }
        }
        return null;
    }

    public final Throwable p() {
        return (Throwable) f4821p.get(this);
    }

    public final Throwable q() {
        Throwable thP = p();
        return thP == null ? new ClosedReceiveChannelException("Channel was closed") : thP;
    }

    public final Throwable r() {
        Throwable thP = p();
        return thP == null ? new ClosedSendChannelException("Channel was closed") : thP;
    }

    public final long s() {
        return i.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i3 = (int) (i.get(this) >> 60);
        if (i3 == 2) {
            sb.append("closed,");
        } else if (i3 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f4823h + ',');
        sb.append("data=[");
        int i6 = 0;
        List listM = p089q4.m.M(f4819n.get(this), f4818m.get(this), f4820o.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            if (((j) obj) != d.f4825a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j4 = ((j) next).f5377j;
            do {
                Object next2 = it.next();
                long j6 = ((j) next2).f5377j;
                if (j4 > j6) {
                    next = next2;
                    j4 = j6;
                }
            } while (it.hasNext());
        }
        j jVar = (j) next;
        long j7 = f4815j.get(this);
        long jS = s();
        loop2: while (true) {
            int i7 = d.f4826b;
            for (int i8 = i6; i8 < i7; i8++) {
                long j8 = (jVar.f5377j * ((long) d.f4826b)) + ((long) i8);
                if (j8 >= jS && j8 >= j7) {
                    break loop2;
                }
                Object objK = jVar.k(i8);
                Object obj2 = jVar.f4849m.get(i8 * 2);
                if (objK instanceof InterfaceC0318e) {
                    string = (j8 >= j7 || j8 < jS) ? (j8 >= jS || j8 < j7) ? "cont" : "send" : "receive";
                } else if (objK instanceof p) {
                    string = "EB(" + objK + ')';
                } else if (E4.k.a(objK, d.f4830f) ? true : E4.k.a(objK, d.f4831g)) {
                    string = "resuming_sender";
                } else {
                    if (!(objK == null ? true : objK.equals(d.f4829e) ? true : E4.k.a(objK, d.i) ? true : E4.k.a(objK, d.f4832h) ? true : E4.k.a(objK, d.f4834k) ? true : E4.k.a(objK, d.f4833j) ? true : E4.k.a(objK, d.f4835l))) {
                        string = objK.toString();
                    }
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
            }
            jVar = (j) jVar.b();
            if (jVar == null) {
                break;
            }
            i6 = 0;
        }
        if (M4.l.j0(sb) == ',') {
            E4.k.e("this.deleteCharAt(index)", sb.deleteCharAt(sb.length() - 1));
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u(long j4, boolean z5) {
        int i3 = (int) (j4 >> 60);
        if (i3 != 0 && i3 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4815j;
            if (i3 == 2) {
                h(1152921504606846975L & j4);
                if (z5) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4819n;
                        j jVarO = (j) atomicReferenceFieldUpdater.get(this);
                        long j6 = atomicLongFieldUpdater.get(this);
                        if (s() <= j6) {
                            break;
                        }
                        long j7 = d.f4826b;
                        long j8 = j6 / j7;
                        if (jVarO.f5377j != j8 && (jVarO = o(j8, jVarO)) == null) {
                            if (((j) atomicReferenceFieldUpdater.get(this)).f5377j < j8) {
                                break;
                            }
                        } else {
                            jVarO.a();
                            int i6 = (int) (j6 % j7);
                            while (true) {
                                Object objK = jVarO.k(i6);
                                if (objK != null && objK != d.f4829e) {
                                    if (objK != d.f4828d && (objK == d.f4833j || objK == d.f4835l || objK == d.i || objK == d.f4832h || (objK != d.f4831g && (objK == d.f4830f || j6 != atomicLongFieldUpdater.get(this))))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else if (jVarO.j(objK, i6, d.f4832h)) {
                                    n();
                                    break;
                                }
                            }
                            f4815j.compareAndSet(this, j6, j6 + 1);
                        }
                    }
                }
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException(p012c.k.r(i3, "unexpected close status: ").toString());
                }
                j jVarH = h(1152921504606846975L & j4);
                Object objE = null;
                loop0: do {
                    for (int i7 = d.f4826b - 1; -1 < i7; i7--) {
                        long j9 = (jVarH.f5377j * ((long) d.f4826b)) + ((long) i7);
                        while (true) {
                            Object objK2 = jVarH.k(i7);
                            if (objK2 == d.i) {
                                break loop0;
                            }
                            if (objK2 != d.f4828d) {
                                if (objK2 != d.f4829e && objK2 != null) {
                                    if (!(objK2 instanceof p0) && !(objK2 instanceof p)) {
                                        C0308a c0308a = d.f4831g;
                                        if (objK2 == c0308a || objK2 == d.f4830f) {
                                            break loop0;
                                        }
                                        if (objK2 != c0308a) {
                                            break;
                                        }
                                    } else {
                                        if (j9 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        p0 p0Var = objK2 instanceof p ? ((p) objK2).f4852a : (p0) objK2;
                                        if (jVarH.j(objK2, i7, d.f4835l)) {
                                            objE = U4.a.e(objE, p0Var);
                                            jVarH.m(i7, null);
                                            jVarH.h();
                                            break;
                                        }
                                    }
                                } else {
                                    if (jVarH.j(objK2, i7, d.f4835l)) {
                                        jVarH.h();
                                        break;
                                    }
                                }
                            } else {
                                if (j9 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (jVarH.j(objK2, i7, d.f4835l)) {
                                    jVarH.m(i7, null);
                                    jVarH.h();
                                    break;
                                }
                            }
                        }
                    }
                    jVarH = (j) ((U4.c) U4.c.i.get(jVarH));
                } while (jVarH != null);
                if (objE != null) {
                    if (objE instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objE;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            z((p0) arrayList.get(size), false);
                        }
                    } else {
                        z((p0) objE, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean v() {
        return false;
    }

    public final boolean w() {
        long j4 = f4816k.get(this);
        return j4 == 0 || j4 == Long.MAX_VALUE;
    }

    public final void x(long j4, j jVar) {
        j jVar2;
        j jVar3;
        while (jVar.f5377j < j4 && (jVar3 = (j) jVar.b()) != null) {
            jVar = jVar3;
        }
        while (true) {
            if (!jVar.c() || (jVar2 = (j) jVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4820o;
                    r rVar = (r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f5377j >= jVar.f5377j) {
                        return;
                    }
                    if (!jVar.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, rVar, jVar)) {
                            if (rVar.e()) {
                                rVar.d();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == rVar);
                    if (jVar.e()) {
                        jVar.d();
                    }
                }
            } else {
                jVar = jVar2;
            }
        }
    }

    public final Object y(Object obj, p111u4.d dVar) {
        C0319f c0319f = new C0319f(1, AbstractC0473d.F(dVar));
        c0319f.u();
        c0319f.g(V.v(r()));
        Object objT = c0319f.t();
        return objT == v4.a.f13292h ? objT : x.f10867a;
    }

    public final void z(p0 p0Var, boolean z5) {
        if (p0Var instanceof InterfaceC0318e) {
            ((p111u4.d) p0Var).g(V.v(z5 ? q() : r()));
            return;
        }
        if (!(p0Var instanceof a)) {
            throw new IllegalStateException(("Unexpected waiter: " + p0Var).toString());
        }
        a aVar = (a) p0Var;
        C0319f c0319f = aVar.i;
        E4.k.c(c0319f);
        aVar.i = null;
        aVar.f4813h = d.f4835l;
        Throwable thP = aVar.f4814j.p();
        if (thP == null) {
            c0319f.g(Boolean.FALSE);
        } else {
            c0319f.g(V.v(thP));
        }
    }
}
