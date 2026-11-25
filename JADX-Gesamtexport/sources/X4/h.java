package X4;

import O1.C0308a;
import P4.C0319f;
import P4.InterfaceC0318e;
import U4.r;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5774b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f5775c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5776d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f5777e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5778f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits");
    private volatile int _availablePermits;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A2.e f5779a;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public h() {
        j jVar = new j(0L, null, 2);
        this.head = jVar;
        this.tail = jVar;
        this._availablePermits = 1;
        this.f5779a = new A2.e(23, this);
    }

    public final void a(c cVar) throws IllegalAccessException, InvocationTargetException {
        Object objA;
        C0319f c0319f;
        while (true) {
            int andDecrement = f5778f.getAndDecrement(this);
            if (andDecrement <= 1) {
                x xVar = x.f10867a;
                C0319f c0319f2 = cVar.f5769h;
                d dVar = cVar.i;
                if (andDecrement > 0) {
                    d.f5770g.set(dVar, null);
                    c0319f2.C(xVar, new b(dVar, cVar, 0));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5776d;
                j jVar = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f5777e.getAndIncrement(this);
                f fVar = f.f5772p;
                long j4 = andIncrement / ((long) i.f5785f);
                while (true) {
                    objA = U4.a.a(jVar, j4, fVar);
                    if (U4.a.d(objA)) {
                        c0319f = c0319f2;
                        break;
                    }
                    r rVarB = U4.a.b(objA);
                    while (true) {
                        r rVar = (r) atomicReferenceFieldUpdater.get(this);
                        c0319f = c0319f2;
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
                        c0319f2 = c0319f;
                    }
                    c0319f2 = c0319f;
                }
                j jVar2 = (j) U4.a.b(objA);
                int i = (int) (andIncrement % ((long) i.f5785f));
                AtomicReferenceArray atomicReferenceArray = jVar2.f5786l;
                do {
                    if (atomicReferenceArray.compareAndSet(i, null, cVar)) {
                        cVar.b(jVar2, i);
                        return;
                    }
                } while (atomicReferenceArray.get(i) == null);
                C0308a c0308a = i.f5781b;
                C0308a c0308a2 = i.f5782c;
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i, c0308a, c0308a2)) {
                        d.f5770g.set(dVar, null);
                        c0319f.C(xVar, new b(dVar, cVar, 0));
                        return;
                    } else {
                        C0319f c0319f3 = c0319f;
                        if (atomicReferenceArray.get(i) != c0308a) {
                            break;
                        } else {
                            c0319f = c0319f3;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    public final void b() {
        boolean z5;
        int i;
        Object objA;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5778f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z5 = true;
            if (andIncrement >= 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5774b;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f5775c.getAndIncrement(this);
            long j4 = andIncrement2 / ((long) i.f5785f);
            g gVar = g.f5773p;
            while (true) {
                objA = U4.a.a(jVar, j4, gVar);
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
            j jVar2 = (j) U4.a.b(objA);
            jVar2.a();
            boolean z6 = false;
            if (jVar2.f5377j > j4) {
                z5 = false;
            } else {
                int i3 = (int) (andIncrement2 % ((long) i.f5785f));
                C0308a c0308a = i.f5781b;
                AtomicReferenceArray atomicReferenceArray = jVar2.f5786l;
                Object andSet = atomicReferenceArray.getAndSet(i3, c0308a);
                if (andSet == null) {
                    int i6 = i.f5780a;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= i6) {
                            C0308a c0308a2 = i.f5781b;
                            C0308a c0308a3 = i.f5783d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i3, c0308a2, c0308a3)) {
                                    z6 = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i3) == c0308a2);
                            z5 = true ^ z6;
                            break;
                        }
                        if (atomicReferenceArray.get(i3) == i.f5782c) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                } else if (andSet == i.f5784e) {
                    z5 = false;
                } else {
                    if (!(andSet instanceof InterfaceC0318e)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0318e interfaceC0318e = (InterfaceC0318e) andSet;
                    C0308a c0308aH = interfaceC0318e.h(x.f10867a, this.f5779a);
                    if (c0308aH != null) {
                        interfaceC0318e.r(c0308aH);
                    } else {
                        z5 = false;
                    }
                }
            }
        } while (!z5);
    }
}
