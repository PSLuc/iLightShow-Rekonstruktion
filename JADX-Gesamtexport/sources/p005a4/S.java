package p005a4;

import R3.c;
import R3.k;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p043h4.f;
import u5.a;

/* JADX INFO: loaded from: classes.dex */
public final class S extends AtomicReference implements c, u5.c, Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f6218h;
    public final k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference f6219j = new AtomicReference();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicLong f6220k = new AtomicLong();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f6221l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f6222m;

    public S(c cVar, k kVar, a aVar, boolean z5) {
        this.f6218h = cVar;
        this.i = kVar;
        this.f6222m = aVar;
        this.f6221l = !z5;
    }

    public final void a(long j4, u5.c cVar) {
        if (this.f6221l || Thread.currentThread() == get()) {
            cVar.e(j4);
        } else {
            this.i.c(new Q(j4, cVar));
        }
    }

    @Override // u5.b
    public final void b() {
        this.f6218h.b();
        this.i.a();
    }

    @Override // u5.b
    public final void c(Object obj) {
        this.f6218h.c(obj);
    }

    @Override // u5.c
    public final void cancel() {
        f.a(this.f6219j);
        this.i.a();
    }

    @Override // u5.c
    public final void e(long j4) {
        if (f.f(j4)) {
            AtomicReference atomicReference = this.f6219j;
            u5.c cVar = (u5.c) atomicReference.get();
            if (cVar != null) {
                a(j4, cVar);
                return;
            }
            AtomicLong atomicLong = this.f6220k;
            p027e3.a.O(atomicLong, j4);
            u5.c cVar2 = (u5.c) atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    a(andSet, cVar2);
                }
            }
        }
    }

    @Override // u5.b
    public final void h(u5.c cVar) {
        if (f.d(this.f6219j, cVar)) {
            long andSet = this.f6220k.getAndSet(0L);
            if (andSet != 0) {
                a(andSet, cVar);
            }
        }
    }

    @Override // u5.b
    public final void onError(Throwable th) {
        this.f6218h.onError(th);
        this.i.a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        lazySet(Thread.currentThread());
        a aVar = this.f6222m;
        this.f6222m = null;
        aVar.a(this);
    }
}
