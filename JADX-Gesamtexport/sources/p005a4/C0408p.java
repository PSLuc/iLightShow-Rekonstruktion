package p005a4;

import J2.b;
import R3.c;
import Z2.f;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p043h4.a;

/* JADX INFO: renamed from: a4.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0408p extends a implements c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Object f6290w = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f6291h;
    public final b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f6292j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f6293k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f6294l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p028e4.b f6295m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ConcurrentLinkedQueue f6296n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u5.c f6297o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f6298p = new AtomicBoolean();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicLong f6299q = new AtomicLong();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicInteger f6300r = new AtomicInteger(1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Throwable f6301s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f6302t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6303u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6304v;

    public C0408p(c cVar, b bVar, f fVar, int i, Map map, ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f6291h = cVar;
        this.i = bVar;
        this.f6292j = fVar;
        this.f6293k = i;
        this.f6294l = map;
        this.f6296n = concurrentLinkedQueue;
        this.f6295m = new p028e4.b(i);
    }

    @Override // u5.b
    public final void b() {
        if (this.f6303u) {
            return;
        }
        Iterator it = this.f6294l.values().iterator();
        while (it.hasNext()) {
            ((C0409q) it.next()).b();
        }
        this.f6294l.clear();
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f6296n;
        if (concurrentLinkedQueue != null) {
            concurrentLinkedQueue.clear();
        }
        this.f6303u = true;
        this.f6302t = true;
        l();
    }

    @Override // u5.b
    public final void c(Object obj) {
        boolean z5;
        if (this.f6303u) {
            return;
        }
        try {
            Object objApply = this.i.apply(obj);
            Map map = this.f6294l;
            C0409q c0409q = (C0409q) map.get(objApply);
            if (c0409q != null) {
                z5 = false;
            } else {
                if (this.f6298p.get()) {
                    return;
                }
                int i = C0409q.f6305k;
                C0409q c0409q2 = new C0409q(objApply, new r(this.f6293k, this, objApply));
                map.put(objApply, c0409q2);
                this.f6300r.getAndIncrement();
                z5 = true;
                c0409q = c0409q2;
            }
            try {
                this.f6292j.getClass();
                r rVar = c0409q.f6306j;
                rVar.i.offer(obj);
                rVar.k();
                k();
                if (z5) {
                    this.f6295m.offer(c0409q);
                    l();
                }
            } catch (Throwable th) {
                p027e3.a.w0(th);
                this.f6297o.cancel();
                onError(th);
            }
        } catch (Throwable th2) {
            p027e3.a.w0(th2);
            this.f6297o.cancel();
            onError(th2);
        }
    }

    @Override // u5.c
    public final void cancel() {
        if (this.f6298p.compareAndSet(false, true)) {
            k();
            if (this.f6300r.decrementAndGet() == 0) {
                this.f6297o.cancel();
            }
        }
    }

    @Override // X3.h
    public final void clear() {
        this.f6295m.clear();
    }

    @Override // u5.c
    public final void e(long j4) {
        if (p043h4.f.f(j4)) {
            p027e3.a.O(this.f6299q, j4);
            l();
        }
    }

    @Override // u5.b
    public final void h(u5.c cVar) {
        if (p043h4.f.g(this.f6297o, cVar)) {
            this.f6297o = cVar;
            this.f6291h.h(this);
            cVar.e(this.f6293k);
        }
    }

    @Override // X3.d
    public final int i(int i) {
        this.f6304v = true;
        return 2;
    }

    @Override // X3.h
    public final boolean isEmpty() {
        return this.f6295m.isEmpty();
    }

    public final boolean j(boolean z5, boolean z6, c cVar, p028e4.b bVar) {
        if (this.f6298p.get()) {
            bVar.clear();
            return true;
        }
        if (!z5) {
            return false;
        }
        Throwable th = this.f6301s;
        if (th != null) {
            bVar.clear();
            cVar.onError(th);
            return true;
        }
        if (!z6) {
            return false;
        }
        cVar.b();
        return true;
    }

    public final void k() {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f6296n;
        if (concurrentLinkedQueue != null) {
            int i = 0;
            while (true) {
                C0409q c0409q = (C0409q) concurrentLinkedQueue.poll();
                if (c0409q == null) {
                    break;
                }
                c0409q.b();
                i++;
            }
            if (i != 0) {
                this.f6300r.addAndGet(-i);
            }
        }
    }

    public final void l() {
        Throwable th;
        if (getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        if (this.f6304v) {
            p028e4.b bVar = this.f6295m;
            c cVar = this.f6291h;
            while (!this.f6298p.get()) {
                boolean z5 = this.f6302t;
                if (z5 && (th = this.f6301s) != null) {
                    bVar.clear();
                    cVar.onError(th);
                    return;
                }
                cVar.c(null);
                if (z5) {
                    Throwable th2 = this.f6301s;
                    if (th2 != null) {
                        cVar.onError(th2);
                        return;
                    } else {
                        cVar.b();
                        return;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            bVar.clear();
            return;
        }
        p028e4.b bVar2 = this.f6295m;
        c cVar2 = this.f6291h;
        int iAddAndGet2 = 1;
        do {
            long j4 = this.f6299q.get();
            long j6 = 0;
            while (j6 != j4) {
                boolean z6 = this.f6302t;
                C0409q c0409q = (C0409q) bVar2.poll();
                boolean z7 = c0409q == null;
                if (j(z6, z7, cVar2, bVar2)) {
                    return;
                }
                if (z7) {
                    break;
                }
                cVar2.c(c0409q);
                j6++;
            }
            if (j6 == j4 && j(this.f6302t, bVar2.isEmpty(), cVar2, bVar2)) {
                return;
            }
            if (j6 != 0) {
                if (j4 != Long.MAX_VALUE) {
                    this.f6299q.addAndGet(-j6);
                }
                this.f6297o.e(j6);
            }
            iAddAndGet2 = addAndGet(-iAddAndGet2);
        } while (iAddAndGet2 != 0);
    }

    @Override // u5.b
    public final void onError(Throwable th) {
        if (this.f6303u) {
            G4.a.A(th);
            return;
        }
        this.f6303u = true;
        Iterator it = this.f6294l.values().iterator();
        while (it.hasNext()) {
            r rVar = ((C0409q) it.next()).f6306j;
            rVar.f6311m = th;
            rVar.f6310l = true;
            rVar.k();
        }
        this.f6294l.clear();
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f6296n;
        if (concurrentLinkedQueue != null) {
            concurrentLinkedQueue.clear();
        }
        this.f6301s = th;
        this.f6302t = true;
        l();
    }

    @Override // X3.h
    public final Object poll() {
        return (C0409q) this.f6295m.poll();
    }
}
