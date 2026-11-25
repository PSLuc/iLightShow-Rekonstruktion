package p005a4;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p028e4.b;
import p043h4.a;
import p043h4.d;
import p043h4.f;

/* JADX INFO: loaded from: classes.dex */
public final class r extends a implements u5.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f6307h;
    public final b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0408p f6308j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f6310l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Throwable f6311m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f6315q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6316r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicLong f6309k = new AtomicLong();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f6312n = new AtomicBoolean();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicReference f6313o = new AtomicReference();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f6314p = new AtomicBoolean();

    public r(int i, C0408p c0408p, Object obj) {
        this.i = new b(i);
        this.f6308j = c0408p;
        this.f6307h = obj;
    }

    @Override // u5.a
    public final void a(u5.b bVar) {
        if (!this.f6314p.compareAndSet(false, true)) {
            d.a(new IllegalStateException("Only one Subscriber allowed!"), bVar);
            return;
        }
        bVar.h(this);
        this.f6313o.lazySet(bVar);
        k();
    }

    @Override // u5.c
    public final void cancel() {
        if (this.f6312n.compareAndSet(false, true)) {
            C0408p c0408p = this.f6308j;
            c0408p.getClass();
            Object obj = this.f6307h;
            if (obj == null) {
                obj = C0408p.f6290w;
            }
            c0408p.f6294l.remove(obj);
            if (c0408p.f6300r.decrementAndGet() == 0) {
                c0408p.f6297o.cancel();
                if (c0408p.getAndIncrement() == 0) {
                    c0408p.f6295m.clear();
                }
            }
        }
    }

    @Override // X3.h
    public final void clear() {
        this.i.clear();
    }

    @Override // u5.c
    public final void e(long j4) {
        if (f.f(j4)) {
            p027e3.a.O(this.f6309k, j4);
            k();
        }
    }

    @Override // X3.d
    public final int i(int i) {
        this.f6315q = true;
        return 2;
    }

    @Override // X3.h
    public final boolean isEmpty() {
        return this.i.isEmpty();
    }

    public final boolean j(boolean z5, boolean z6, u5.b bVar) {
        boolean z7 = this.f6312n.get();
        b bVar2 = this.i;
        if (z7) {
            bVar2.clear();
            return true;
        }
        if (!z5) {
            return false;
        }
        Throwable th = this.f6311m;
        if (th != null) {
            bVar2.clear();
            bVar.onError(th);
            return true;
        }
        if (!z6) {
            return false;
        }
        bVar.b();
        return true;
    }

    public final void k() {
        Throwable th;
        if (getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        if (this.f6315q) {
            b bVar = this.i;
            u5.b bVar2 = (u5.b) this.f6313o.get();
            while (true) {
                if (bVar2 != null) {
                    if (this.f6312n.get()) {
                        bVar.clear();
                        return;
                    }
                    boolean z5 = this.f6310l;
                    if (z5 && (th = this.f6311m) != null) {
                        bVar.clear();
                        bVar2.onError(th);
                        return;
                    }
                    bVar2.c(null);
                    if (z5) {
                        Throwable th2 = this.f6311m;
                        if (th2 != null) {
                            bVar2.onError(th2);
                            return;
                        } else {
                            bVar2.b();
                            return;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (bVar2 == null) {
                    bVar2 = (u5.b) this.f6313o.get();
                }
            }
        } else {
            b bVar3 = this.i;
            u5.b bVar4 = (u5.b) this.f6313o.get();
            int iAddAndGet2 = 1;
            while (true) {
                if (bVar4 != null) {
                    long j4 = this.f6309k.get();
                    long j6 = 0;
                    while (j6 != j4) {
                        boolean z6 = this.f6310l;
                        Object objPoll = bVar3.poll();
                        boolean z7 = objPoll == null;
                        if (j(z6, z7, bVar4)) {
                            return;
                        }
                        if (z7) {
                            break;
                        }
                        bVar4.c(objPoll);
                        j6++;
                    }
                    if (j6 == j4 && j(this.f6310l, bVar3.isEmpty(), bVar4)) {
                        return;
                    }
                    if (j6 != 0) {
                        if (j4 != Long.MAX_VALUE) {
                            this.f6309k.addAndGet(-j6);
                        }
                        this.f6308j.f6297o.e(j6);
                    }
                }
                iAddAndGet2 = addAndGet(-iAddAndGet2);
                if (iAddAndGet2 == 0) {
                    return;
                }
                if (bVar4 == null) {
                    bVar4 = (u5.b) this.f6313o.get();
                }
            }
        }
    }

    @Override // X3.h
    public final Object poll() {
        Object objPoll = this.i.poll();
        if (objPoll != null) {
            this.f6316r++;
            return objPoll;
        }
        int i = this.f6316r;
        if (i == 0) {
            return null;
        }
        this.f6316r = 0;
        this.f6308j.f6297o.e(i);
        return null;
    }
}
