package W4;

import E4.w;
import O1.C0308a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5604p = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f5605h;
    public final w i;
    private volatile int indexInArray;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5606j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f5607k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f5608l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5609m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5610n;
    private volatile Object nextParkedWorker;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b f5611o;
    private volatile int workerCtl;

    public a(b bVar, int i) {
        this.f5611o = bVar;
        setDaemon(true);
        this.f5605h = new m();
        this.i = new w();
        this.f5606j = 4;
        this.nextParkedWorker = b.f5615r;
        this.f5609m = H4.e.f1802h.b();
        f(i);
    }

    public final h a(boolean z5) {
        h hVarE;
        h hVarE2;
        b bVar;
        long j4;
        int i = this.f5606j;
        h hVar = null;
        m mVar = this.f5605h;
        b bVar2 = this.f5611o;
        if (i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f5613p;
            do {
                bVar = this.f5611o;
                j4 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j4) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f5639b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar2 == null || hVar2.i.f5628a != 1) {
                            int i3 = m.f5641d.get(mVar);
                            int i6 = m.f5640c.get(mVar);
                            while (i3 != i6 && m.f5642e.get(mVar) != 0) {
                                i6--;
                                h hVarC = mVar.c(i6, true);
                                if (hVarC != null) {
                                    hVar = hVarC;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar, hVar2, null)) {
                                hVar = hVar2;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar) == hVar2);
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) bVar2.f5620m.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!b.f5613p.compareAndSet(bVar, j4, j4 - 4398046511104L));
            this.f5606j = 1;
        }
        if (z5) {
            boolean z6 = d(bVar2.f5616h * 2) == 0;
            if (z6 && (hVarE2 = e()) != null) {
                return hVarE2;
            }
            mVar.getClass();
            h hVarB = (h) m.f5639b.getAndSet(mVar, null);
            if (hVarB == null) {
                hVarB = mVar.b();
            }
            if (hVarB != null) {
                return hVarB;
            }
            if (!z6 && (hVarE = e()) != null) {
                return hVarE;
            }
        } else {
            h hVarE3 = e();
            if (hVarE3 != null) {
                return hVarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i3 = this.f5609m;
        int i6 = i3 ^ (i3 << 13);
        int i7 = i6 ^ (i6 >> 17);
        int i8 = i7 ^ (i7 << 5);
        this.f5609m = i8;
        int i9 = i - 1;
        return (i9 & i) == 0 ? i9 & i8 : (Integer.MAX_VALUE & i8) % i;
    }

    public final h e() {
        int iD = d(2);
        b bVar = this.f5611o;
        if (iD == 0) {
            h hVar = (h) bVar.f5619l.d();
            return hVar != null ? hVar : (h) bVar.f5620m.d();
        }
        h hVar2 = (h) bVar.f5620m.d();
        return hVar2 != null ? hVar2 : (h) bVar.f5619l.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5611o.f5618k);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i) {
        int i3 = this.f5606j;
        boolean z5 = i3 == 1;
        if (z5) {
            b.f5613p.addAndGet(this.f5611o, 4398046511104L);
        }
        if (i3 != i) {
            this.f5606j = i;
        }
        return z5;
    }

    public final h i(int i) {
        int i3;
        long j4;
        h hVarC;
        long j6;
        long j7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f5613p;
        b bVar = this.f5611o;
        int i6 = (int) (atomicLongFieldUpdater.get(bVar) & 2097151);
        h hVar = null;
        if (i6 < 2) {
            return null;
        }
        int iD = d(i6);
        int i7 = 0;
        long jMin = Long.MAX_VALUE;
        while (i7 < i6) {
            int i8 = iD + 1;
            if (i8 > i6) {
                i8 = 1;
            }
            a aVar = (a) bVar.f5621n.b(i8);
            if (aVar == null || aVar == this) {
                i3 = i8;
            } else {
                m mVar = aVar.f5605h;
                if (i != 3) {
                    mVar.getClass();
                    int i9 = m.f5641d.get(mVar);
                    int i10 = m.f5640c.get(mVar);
                    boolean z5 = i == 1;
                    while (true) {
                        if (i9 != i10) {
                            j4 = 0;
                            if (!z5 || m.f5642e.get(mVar) != 0) {
                                int i11 = i9 + 1;
                                hVarC = mVar.c(i9, z5);
                                if (hVarC != null) {
                                    break;
                                }
                                i9 = i11;
                            }
                        } else {
                            j4 = 0;
                        }
                        hVarC = hVar;
                        break;
                    }
                } else {
                    hVarC = mVar.b();
                    j4 = 0;
                }
                w wVar = this.i;
                if (hVarC == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f5639b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar2 == null) {
                            j6 = -1;
                        } else {
                            j6 = -1;
                            if (((hVar2.i.f5628a == 1 ? 1 : 2) & i) != 0) {
                                k.f5635f.getClass();
                                i3 = i8;
                                long jNanoTime = System.nanoTime() - hVar2.f5627h;
                                long j8 = k.f5631b;
                                if (jNanoTime < j8) {
                                    j7 = j8 - jNanoTime;
                                    hVar = null;
                                    break;
                                }
                                do {
                                    hVar = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(mVar, hVar2, null)) {
                                        wVar.f1074h = hVar2;
                                        j7 = -1;
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(mVar) == hVar2);
                                i8 = i3;
                                hVar = null;
                            }
                        }
                        j7 = -2;
                        i3 = i8;
                        break;
                    }
                } else {
                    wVar.f1074h = hVarC;
                    i3 = i8;
                    j7 = -1;
                    j6 = -1;
                }
                if (j7 == j6) {
                    h hVar3 = (h) wVar.f1074h;
                    wVar.f1074h = hVar;
                    return hVar3;
                }
                if (j7 > j4) {
                    jMin = Math.min(jMin, j7);
                }
            }
            i7++;
            iD = i3;
            hVar = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f5608l = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        int i;
        loop0: while (true) {
            boolean z5 = false;
            while (true) {
                b bVar = this.f5611o;
                bVar.getClass();
                if (b.f5614q.get(bVar) != 0 || this.f5606j == 5) {
                    break loop0;
                }
                h hVarA = a(this.f5610n);
                if (hVarA == null) {
                    this.f5610n = false;
                    if (this.f5608l == 0) {
                        Object obj = this.nextParkedWorker;
                        C0308a c0308a = b.f5615r;
                        long j6 = 2097151;
                        if (obj != c0308a) {
                            f5604p.set(this, -1);
                            while (this.nextParkedWorker != b.f5615r) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5604p;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                b bVar2 = this.f5611o;
                                bVar2.getClass();
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = b.f5614q;
                                if (atomicIntegerFieldUpdater2.get(bVar2) != 0 || this.f5606j == 5) {
                                    break;
                                }
                                h(3);
                                Thread.interrupted();
                                if (this.f5607k == 0) {
                                    this.f5607k = System.nanoTime() + this.f5611o.f5617j;
                                }
                                LockSupport.parkNanos(this.f5611o.f5617j);
                                if (System.nanoTime() - this.f5607k >= 0) {
                                    this.f5607k = 0L;
                                    b bVar3 = this.f5611o;
                                    synchronized (bVar3.f5621n) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(bVar3) != 0)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = b.f5613p;
                                                if (((int) (atomicLongFieldUpdater2.get(bVar3) & j6)) > bVar3.f5616h) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i3 = this.indexInArray;
                                                        f(0);
                                                        bVar3.o(this, i3, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(bVar3) & j6);
                                                        if (andDecrement != i3) {
                                                            Object objB = bVar3.f5621n.b(andDecrement);
                                                            E4.k.c(objB);
                                                            a aVar = (a) objB;
                                                            bVar3.f5621n.c(i3, aVar);
                                                            aVar.f(i3);
                                                            bVar3.o(aVar, andDecrement, i3);
                                                        }
                                                        bVar3.f5621n.c(andDecrement, null);
                                                        this.f5606j = 5;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                                j6 = j6;
                            }
                        } else {
                            b bVar4 = this.f5611o;
                            bVar4.getClass();
                            if (this.nextParkedWorker == c0308a) {
                                do {
                                    atomicLongFieldUpdater = b.f5612o;
                                    j4 = atomicLongFieldUpdater.get(bVar4);
                                    i = this.indexInArray;
                                    this.nextParkedWorker = bVar4.f5621n.b((int) (j4 & 2097151));
                                } while (!atomicLongFieldUpdater.compareAndSet(bVar4, j4, ((j4 + 2097152) & (-2097152)) | ((long) i)));
                            }
                        }
                    } else {
                        if (z5) {
                            h(3);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f5608l);
                            this.f5608l = 0L;
                            break;
                        }
                        z5 = true;
                    }
                } else {
                    this.f5608l = 0L;
                    int i6 = hVarA.i.f5628a;
                    this.f5607k = 0L;
                    if (this.f5606j == 3) {
                        this.f5606j = 2;
                    }
                    b bVar5 = this.f5611o;
                    if (i6 != 0 && h(2) && !bVar5.v() && !bVar5.s(b.f5613p.get(bVar5))) {
                        bVar5.v();
                    }
                    bVar5.getClass();
                    try {
                        hVarA.run();
                    } catch (Throwable th2) {
                        Thread threadCurrentThread = Thread.currentThread();
                        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                    }
                    if (i6 != 0) {
                        b.f5613p.addAndGet(bVar5, -2097152L);
                        if (this.f5606j == 5) {
                            break;
                        }
                        this.f5606j = 4;
                        break;
                    }
                    break;
                }
            }
        }
        h(5);
    }
}
