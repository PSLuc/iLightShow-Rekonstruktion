package p056k4;

import G4.a;
import R3.c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p028e4.b;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {
    public final b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference f9939j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f9940k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f9941l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Throwable f9942m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicReference f9943n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f9944o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f9945p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f9946q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicLong f9947r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f9948s;

    public d() {
        W3.b.b(8, "capacityHint");
        this.i = new b(8);
        this.f9939j = new AtomicReference(null);
        this.f9940k = true;
        this.f9943n = new AtomicReference();
        this.f9945p = new AtomicBoolean();
        this.f9946q = new c(this);
        this.f9947r = new AtomicLong();
    }

    @Override // u5.b
    public final void b() {
        if (this.f9941l || this.f9944o) {
            return;
        }
        this.f9941l = true;
        Runnable runnable = (Runnable) this.f9939j.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        j();
    }

    @Override // u5.b
    public final void c(Object obj) {
        W3.b.a("onNext called with null. Null values are generally not allowed in 2.x operators and sources.", obj);
        if (this.f9941l || this.f9944o) {
            return;
        }
        this.i.offer(obj);
        j();
    }

    @Override // R3.a
    public final void f(c cVar) {
        if (this.f9945p.get() || !this.f9945p.compareAndSet(false, true)) {
            p043h4.d.a(new IllegalStateException("This processor allows only a single Subscriber"), cVar);
            return;
        }
        cVar.h(this.f9946q);
        this.f9943n.set(cVar);
        if (this.f9944o) {
            this.f9943n.lazySet(null);
        } else {
            j();
        }
    }

    @Override // u5.b
    public final void h(u5.c cVar) {
        if (this.f9941l || this.f9944o) {
            cVar.cancel();
        } else {
            cVar.e(Long.MAX_VALUE);
        }
    }

    public final boolean i(boolean z5, boolean z6, boolean z7, u5.b bVar, b bVar2) {
        if (this.f9944o) {
            bVar2.clear();
            this.f9943n.lazySet(null);
            return true;
        }
        if (!z6) {
            return false;
        }
        if (z5 && this.f9942m != null) {
            bVar2.clear();
            this.f9943n.lazySet(null);
            bVar.onError(this.f9942m);
            return true;
        }
        if (!z7) {
            return false;
        }
        Throwable th = this.f9942m;
        this.f9943n.lazySet(null);
        if (th != null) {
            bVar.onError(th);
            return true;
        }
        bVar.b();
        return true;
    }

    public final void j() {
        if (this.f9946q.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        u5.b bVar = (u5.b) this.f9943n.get();
        int iAddAndGet2 = 1;
        while (bVar == null) {
            iAddAndGet2 = this.f9946q.addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            } else {
                bVar = (u5.b) this.f9943n.get();
            }
        }
        if (this.f9948s) {
            b bVar2 = this.i;
            boolean z5 = this.f9940k;
            while (!this.f9944o) {
                boolean z6 = this.f9941l;
                if (!z5 && z6 && this.f9942m != null) {
                    bVar2.clear();
                    this.f9943n.lazySet(null);
                    bVar.onError(this.f9942m);
                    return;
                }
                bVar.c(null);
                if (z6) {
                    this.f9943n.lazySet(null);
                    Throwable th = this.f9942m;
                    if (th != null) {
                        bVar.onError(th);
                        return;
                    } else {
                        bVar.b();
                        return;
                    }
                }
                iAddAndGet = this.f9946q.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            bVar2.clear();
            this.f9943n.lazySet(null);
            return;
        }
        b bVar3 = this.i;
        boolean z7 = !this.f9940k;
        int iAddAndGet3 = 1;
        while (true) {
            long j4 = this.f9947r.get();
            long j6 = 0;
            while (j4 != j6) {
                boolean z8 = this.f9941l;
                Object objPoll = bVar3.poll();
                boolean z9 = objPoll == null;
                if (i(z7, z8, z9, bVar, bVar3)) {
                    return;
                }
                if (z9) {
                    break;
                }
                bVar.c(objPoll);
                j6++;
            }
            if (j4 == j6 && i(z7, this.f9941l, bVar3.isEmpty(), bVar, bVar3)) {
                return;
            }
            if (j6 != 0 && j4 != Long.MAX_VALUE) {
                this.f9947r.addAndGet(-j6);
            }
            iAddAndGet3 = this.f9946q.addAndGet(-iAddAndGet3);
            if (iAddAndGet3 == 0) {
                return;
            } else {
                z7 = z7;
            }
        }
    }

    @Override // u5.b
    public final void onError(Throwable th) {
        W3.b.a("onError called with null. Null values are generally not allowed in 2.x operators and sources.", th);
        if (this.f9941l || this.f9944o) {
            a.A(th);
            return;
        }
        this.f9942m = th;
        this.f9941l = true;
        Runnable runnable = (Runnable) this.f9939j.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        j();
    }
}
