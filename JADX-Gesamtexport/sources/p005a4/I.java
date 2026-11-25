package p005a4;

import B.AbstractC0013g0;
import R3.c;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p043h4.f;
import p056k4.b;
import p073n4.a;

/* JADX INFO: loaded from: classes.dex */
public final class I extends AtomicInteger implements c, u5.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u5.c f6192h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference f6193j = new AtomicReference();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicLong f6194k = new AtomicLong();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicLong f6195l = new AtomicLong();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile boolean f6196m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6197n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a f6198o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f6199p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final H f6200q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f6201r;

    public I(a aVar, b bVar, H h6) {
        this.f6198o = aVar;
        this.f6199p = bVar;
        this.f6200q = h6;
    }

    public final void a() {
        int iAddAndGet = 1;
        long jP = 0;
        u5.c cVar = null;
        do {
            u5.c cVar2 = (u5.c) this.f6193j.get();
            if (cVar2 != null) {
                cVar2 = (u5.c) this.f6193j.getAndSet(null);
            }
            long andSet = this.f6194k.get();
            if (andSet != 0) {
                andSet = this.f6194k.getAndSet(0L);
            }
            long andSet2 = this.f6195l.get();
            if (andSet2 != 0) {
                andSet2 = this.f6195l.getAndSet(0L);
            }
            u5.c cVar3 = this.f6192h;
            if (this.f6196m) {
                if (cVar3 != null) {
                    cVar3.cancel();
                    this.f6192h = null;
                }
                if (cVar2 != null) {
                    cVar2.cancel();
                }
            } else {
                long jP2 = this.i;
                if (jP2 != Long.MAX_VALUE) {
                    jP2 = p027e3.a.P(jP2, andSet);
                    if (jP2 != Long.MAX_VALUE) {
                        jP2 -= andSet2;
                        if (jP2 < 0) {
                            G4.a.A(new ProtocolViolationException(AbstractC0013g0.h("More produced than requested: ", jP2)));
                            jP2 = 0;
                        }
                    }
                    this.i = jP2;
                }
                if (cVar2 != null) {
                    if (cVar3 != null) {
                        cVar3.cancel();
                    }
                    this.f6192h = cVar2;
                    if (jP2 != 0) {
                        jP = p027e3.a.P(jP, jP2);
                        cVar = cVar2;
                    }
                } else if (cVar3 != null && andSet != 0) {
                    jP = p027e3.a.P(jP, andSet);
                    cVar = cVar3;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jP != 0) {
            cVar.e(jP);
        }
    }

    @Override // u5.b
    public final void b() {
        this.f6200q.cancel();
        this.f6198o.b();
    }

    @Override // u5.b
    public final void c(Object obj) {
        this.f6201r++;
        this.f6198o.c(obj);
    }

    @Override // u5.c
    public final void cancel() {
        if (!this.f6196m) {
            this.f6196m = true;
            if (getAndIncrement() == 0) {
                a();
            }
        }
        this.f6200q.cancel();
    }

    @Override // u5.c
    public final void e(long j4) {
        if (!f.f(j4) || this.f6197n) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            p027e3.a.O(this.f6194k, j4);
            if (getAndIncrement() != 0) {
                return;
            }
            a();
            return;
        }
        long j6 = this.i;
        if (j6 != Long.MAX_VALUE) {
            long jP = p027e3.a.P(j6, j4);
            this.i = jP;
            if (jP == Long.MAX_VALUE) {
                this.f6197n = true;
            }
        }
        u5.c cVar = this.f6192h;
        if (decrementAndGet() != 0) {
            a();
        }
        if (cVar != null) {
            cVar.e(j4);
        }
    }

    @Override // u5.b
    public final void h(u5.c cVar) {
        if (this.f6196m) {
            cVar.cancel();
            return;
        }
        W3.b.a("s is null", cVar);
        if (get() != 0 || !compareAndSet(0, 1)) {
            u5.c cVar2 = (u5.c) this.f6193j.getAndSet(cVar);
            if (cVar2 != null) {
                cVar2.cancel();
            }
            if (getAndIncrement() != 0) {
                return;
            }
            a();
            return;
        }
        u5.c cVar3 = this.f6192h;
        if (cVar3 != null) {
            cVar3.cancel();
        }
        this.f6192h = cVar;
        long j4 = this.i;
        if (decrementAndGet() != 0) {
            a();
        }
        if (j4 != 0) {
            cVar.e(j4);
        }
    }

    @Override // u5.b
    public final void onError(Throwable th) {
        long j4 = this.f6201r;
        long j6 = 0;
        if (j4 != 0) {
            this.f6201r = 0L;
            if (!this.f6197n) {
                if (get() == 0 && compareAndSet(0, 1)) {
                    long j7 = this.i;
                    if (j7 != Long.MAX_VALUE) {
                        long j8 = j7 - j4;
                        if (j8 < 0) {
                            G4.a.A(new ProtocolViolationException(AbstractC0013g0.h("More produced than requested: ", j8)));
                        } else {
                            j6 = j8;
                        }
                        this.i = j6;
                    }
                    if (decrementAndGet() != 0) {
                        a();
                    }
                } else {
                    p027e3.a.O(this.f6195l, j4);
                    if (getAndIncrement() == 0) {
                        a();
                    }
                }
            }
        }
        this.f6200q.e(1L);
        this.f6199p.c(th);
    }
}
