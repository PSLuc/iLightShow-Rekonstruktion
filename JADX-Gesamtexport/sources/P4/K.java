package P4;

import O1.C0308a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public abstract class K extends L implements A {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4613n = AtomicReferenceFieldUpdater.newUpdater(K.class, Object.class, "_queue");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4614o = AtomicReferenceFieldUpdater.newUpdater(K.class, Object.class, "_delayed");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4615p = AtomicIntegerFieldUpdater.newUpdater(K.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // P4.AbstractC0331s
    public final void X(p111u4.i iVar, Runnable runnable) {
        g0(runnable);
    }

    @Override // P4.L
    public final long d0() {
        Runnable runnable;
        I i;
        I iB;
        if (!e0()) {
            J j4 = (J) f4614o.get(this);
            if (j4 != null && U4.v.f5383b.get(j4) != 0) {
                long jNanoTime = System.nanoTime();
                do {
                    synchronized (j4) {
                        try {
                            I[] iArr = j4.f5384a;
                            I i3 = iArr != null ? iArr[0] : null;
                            if (i3 == null) {
                                iB = null;
                            } else {
                                iB = ((jNanoTime - i3.f4611h) > 0L ? 1 : ((jNanoTime - i3.f4611h) == 0L ? 0 : -1)) >= 0 ? h0(i3) : false ? j4.b(0) : null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (iB != null);
            }
            loop1: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4613n;
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != null) {
                    if (obj instanceof U4.l) {
                        U4.l lVar = (U4.l) obj;
                        Object objD = lVar.d();
                        if (objD != U4.l.f5368g) {
                            runnable = (Runnable) objD;
                            break;
                        }
                        U4.l lVarC = lVar.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (obj != AbstractC0336x.f4674c) {
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                                runnable = (Runnable) obj;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == obj);
                    }
                }
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            p089q4.j jVar = this.f4619l;
            if (((jVar == null || jVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = f4613n.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof U4.l) {
                        long j6 = U4.l.f5367f.get((U4.l) obj2);
                        if (((int) (1073741823 & j6)) == ((int) ((j6 & 1152921503533105152L) >> 30))) {
                        }
                    } else if (obj2 == AbstractC0336x.f4674c) {
                        return Long.MAX_VALUE;
                    }
                }
                J j7 = (J) f4614o.get(this);
                if (j7 != null) {
                    synchronized (j7) {
                        I[] iArr2 = j7.f5384a;
                        i = iArr2 != null ? iArr2[0] : null;
                    }
                    if (i != null) {
                        long jNanoTime2 = i.f4611h - System.nanoTime();
                        if (jNanoTime2 >= 0) {
                            return jNanoTime2;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void g0(Runnable runnable) {
        if (!h0(runnable)) {
            RunnableC0337y.f4681q.g0(runnable);
            return;
        }
        Thread threadB0 = b0();
        if (Thread.currentThread() != threadB0) {
            LockSupport.unpark(threadB0);
        }
    }

    public final boolean h0(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4613n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f4615p.get(this) != 0) {
                break;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof U4.l)) {
                if (obj == AbstractC0336x.f4674c) {
                    break;
                }
                U4.l lVar = new U4.l(8, true);
                lVar.a((Runnable) obj);
                lVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            U4.l lVar2 = (U4.l) obj;
            int iA = lVar2.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                U4.l lVarC = lVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iA == 2) {
                break;
            }
        }
        return false;
    }

    public final boolean i0() {
        J j4;
        p089q4.j jVar = this.f4619l;
        if (!(jVar != null ? jVar.isEmpty() : true) || ((j4 = (J) f4614o.get(this)) != null && U4.v.f5383b.get(j4) != 0)) {
            return false;
        }
        Object obj = f4613n.get(this);
        if (obj != null) {
            if (obj instanceof U4.l) {
                long j6 = U4.l.f5367f.get((U4.l) obj);
                return ((int) (1073741823 & j6)) == ((int) ((j6 & 1152921503533105152L) >> 30));
            }
            if (obj != AbstractC0336x.f4674c) {
                return false;
            }
        }
        return true;
    }

    public final void j0(long j4, I i) {
        int iB;
        Thread threadB0;
        boolean z5 = f4615p.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4614o;
        I i3 = null;
        if (z5) {
            iB = 1;
        } else {
            J j6 = (J) atomicReferenceFieldUpdater.get(this);
            if (j6 == null) {
                J j7 = new J();
                j7.f4612c = j4;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, j7) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                E4.k.c(obj);
                j6 = (J) obj;
            }
            iB = i.b(j4, j6, this);
        }
        if (iB != 0) {
            if (iB == 1) {
                f0(j4, i);
                return;
            } else {
                if (iB != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        J j8 = (J) atomicReferenceFieldUpdater.get(this);
        if (j8 != null) {
            synchronized (j8) {
                I[] iArr = j8.f5384a;
                i3 = iArr != null ? iArr[0] : null;
            }
        }
        if (i3 != i || Thread.currentThread() == (threadB0 = b0())) {
            return;
        }
        LockSupport.unpark(threadB0);
    }

    @Override // P4.L
    public void shutdown() {
        I iB;
        l0.f4656a.set(null);
        f4615p.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4613n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            C0308a c0308a = AbstractC0336x.f4674c;
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, c0308a)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof U4.l) {
                ((U4.l) obj).b();
                break;
            } else {
                if (obj == c0308a) {
                    break;
                }
                U4.l lVar = new U4.l(8, true);
                lVar.a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (d0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            J j4 = (J) f4614o.get(this);
            if (j4 == null) {
                return;
            }
            synchronized (j4) {
                iB = U4.v.f5383b.get(j4) > 0 ? j4.b(0) : null;
            }
            if (iB == null) {
                return;
            } else {
                f0(jNanoTime, iB);
            }
        }
    }

    @Override // P4.A
    public final void v(long j4, C0319f c0319f) {
        long j6 = 0;
        if (j4 > 0) {
            j6 = j4 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j4;
        }
        if (j6 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            H h6 = new H(this, j6 + jNanoTime, c0319f);
            j0(jNanoTime, h6);
            c0319f.w(new F(0, h6));
        }
    }
}
