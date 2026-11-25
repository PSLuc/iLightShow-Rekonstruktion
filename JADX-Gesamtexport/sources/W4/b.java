package W4;

import B.AbstractC0013g0;
import O1.C0308a;
import P4.AbstractC0336x;
import U4.p;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Executor, Closeable, AutoCloseable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f5612o = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f5613p = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5614q = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0308a f5615r = new C0308a("NOT_IN_STACK", 1);
    private volatile int _isTerminated;
    private volatile long controlState;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5616h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f5617j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f5618k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f5619l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f5620m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p f5621n;
    private volatile long parkedWorkersStack;

    public b(int i, int i3, long j4, String str) {
        this.f5616h = i;
        this.i = i3;
        this.f5617j = j4;
        this.f5618k = str;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC0013g0.f(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i3 < i) {
            throw new IllegalArgumentException(AbstractC0013g0.g("Max pool size ", i3, i, " should be greater than or equals to core pool size ").toString());
        }
        if (i3 > 2097150) {
            throw new IllegalArgumentException(AbstractC0013g0.f(i3, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j4 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j4 + " must be positive").toString());
        }
        this.f5619l = new e();
        this.f5620m = new e();
        this.f5621n = new p((i + 1) * 2);
        this.controlState = ((long) i) << 42;
        this._isTerminated = 0;
    }

    public static /* synthetic */ void k(b bVar, Runnable runnable, int i) {
        bVar.c(runnable, k.f5636g, (i & 4) == 0);
    }

    public final int b() {
        synchronized (this.f5621n) {
            try {
                if (f5614q.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f5613p;
                long j4 = atomicLongFieldUpdater.get(this);
                int i = (int) (j4 & 2097151);
                int i3 = i - ((int) ((j4 & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.f5616h) {
                    return 0;
                }
                if (i >= this.i) {
                    return 0;
                }
                int i6 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i6 <= 0 || this.f5621n.b(i6) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i6);
                this.f5621n.c(i6, aVar);
                if (i6 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i7 = i3 + 1;
                aVar.start();
                return i7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Runnable runnable, i iVar, boolean z5) {
        h jVar;
        int i;
        k.f5635f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof h) {
            jVar = (h) runnable;
            jVar.f5627h = jNanoTime;
            jVar.i = iVar;
        } else {
            jVar = new j(runnable, jNanoTime, iVar);
        }
        boolean z6 = false;
        boolean z7 = jVar.i.f5628a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5613p;
        long jAddAndGet = z7 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !E4.k.a(aVar.f5611o, this)) {
            aVar = null;
        }
        if (aVar != null && (i = aVar.f5606j) != 5 && (jVar.i.f5628a != 0 || i != 2)) {
            aVar.f5610n = true;
            m mVar = aVar.f5605h;
            if (z5) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                h hVar = (h) m.f5639b.getAndSet(mVar, jVar);
                jVar = hVar == null ? null : mVar.a(hVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.i.f5628a == 1 ? this.f5620m.a(jVar) : this.f5619l.a(jVar))) {
                throw new RejectedExecutionException(p012c.k.u(new StringBuilder(), this.f5618k, " was terminated"));
            }
        }
        if (z5 && aVar != null) {
            z6 = true;
        }
        if (z7) {
            if (z6 || v() || s(jAddAndGet)) {
                return;
            }
            v();
            return;
        }
        if (z6 || v() || s(atomicLongFieldUpdater.get(this))) {
            return;
        }
        v();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0088  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        h hVarA;
        if (f5614q.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
            if (aVar == null || !E4.k.a(aVar.f5611o, this)) {
                aVar = null;
            }
            synchronized (this.f5621n) {
                i = (int) (f5613p.get(this) & 2097151);
            }
            if (1 <= i) {
                int i3 = 1;
                while (true) {
                    Object objB = this.f5621n.b(i3);
                    E4.k.c(objB);
                    a aVar2 = (a) objB;
                    if (aVar2 != aVar) {
                        while (aVar2.isAlive()) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.f5605h;
                        e eVar = this.f5620m;
                        mVar.getClass();
                        h hVar = (h) m.f5639b.getAndSet(mVar, null);
                        if (hVar != null) {
                            eVar.a(hVar);
                        }
                        while (true) {
                            h hVarB = mVar.b();
                            if (hVarB == null) {
                                break;
                            } else {
                                eVar.a(hVarB);
                            }
                        }
                    }
                    if (i3 == i) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f5620m.b();
            this.f5619l.b();
            while (true) {
                if (aVar != null) {
                    hVarA = aVar.a(true);
                    if (hVarA == null) {
                        hVarA = (h) this.f5619l.d();
                        if (hVarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    hVarA = (h) this.f5619l.d();
                    if (hVarA == null && (hVarA = (h) this.f5620m.d()) == null) {
                        break;
                    }
                }
                try {
                    hVarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(5);
            }
            f5612o.set(this, 0L);
            f5613p.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        k(this, runnable, 6);
    }

    public final void o(a aVar, int i, int i3) {
        while (true) {
            long j4 = f5612o.get(this);
            int i6 = (int) (2097151 & j4);
            long j6 = (2097152 + j4) & (-2097152);
            if (i6 == i) {
                if (i3 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == f5615r) {
                            i6 = -1;
                            break;
                        }
                        if (objC == null) {
                            i6 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i6 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i6 = i3;
                }
            }
            if (i6 >= 0) {
                b bVar = this;
                if (f5612o.compareAndSet(bVar, j4, ((long) i6) | j6)) {
                    return;
                } else {
                    this = bVar;
                }
            }
        }
    }

    public final boolean s(long j4) {
        int i = ((int) (2097151 & j4)) - ((int) ((j4 & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i3 = this.f5616h;
        if (i < i3) {
            int iB = b();
            if (iB == 1 && i3 > 1) {
                b();
            }
            if (iB > 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        p pVar = this.f5621n;
        int iA = pVar.a();
        int i = 0;
        int i3 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 1; i9 < iA; i9++) {
            a aVar = (a) pVar.b(i9);
            if (aVar != null) {
                m mVar = aVar.f5605h;
                mVar.getClass();
                int i10 = m.f5639b.get(mVar) != null ? (m.f5640c.get(mVar) - m.f5641d.get(mVar)) + 1 : m.f5640c.get(mVar) - m.f5641d.get(mVar);
                int iD = AbstractC0916i.d(aVar.f5606j);
                if (iD == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i10);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iD == 1) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i10);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iD == 2) {
                    i6++;
                } else if (iD == 3) {
                    i7++;
                    if (i10 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i10);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (iD == 4) {
                    i8++;
                }
            }
        }
        long j4 = f5613p.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f5618k);
        sb4.append('@');
        sb4.append(AbstractC0336x.h(this));
        sb4.append("[Pool Size {core = ");
        int i11 = this.f5616h;
        sb4.append(i11);
        sb4.append(", max = ");
        sb4.append(this.i);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i3);
        sb4.append(", parked = ");
        sb4.append(i6);
        sb4.append(", dormant = ");
        sb4.append(i7);
        sb4.append(", terminated = ");
        sb4.append(i8);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f5619l.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f5620m.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j4));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j4) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i11 - ((int) ((j4 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean v() {
        b bVar;
        C0308a c0308a;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5612o;
            long j4 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f5621n.b((int) (2097151 & j4));
            if (aVar == null) {
                aVar = null;
                bVar = this;
            } else {
                long j6 = (2097152 + j4) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    c0308a = f5615r;
                    if (objC == c0308a) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                    atomicLongFieldUpdater = atomicLongFieldUpdater;
                    this = this;
                }
                if (iB >= 0) {
                    b bVar2 = this;
                    boolean zCompareAndSet = atomicLongFieldUpdater.compareAndSet(bVar2, j4, j6 | ((long) iB));
                    bVar = bVar2;
                    if (zCompareAndSet) {
                        aVar.g(c0308a);
                    }
                    this = bVar;
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f5604p.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
            this = bVar;
        }
    }
}
