package p039g4;

import B.AbstractC0013g0;
import R3.c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p043h4.f;
import p047i4.a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AtomicInteger implements c, u5.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u5.b f9186h;
    public final a i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicLong f9187j = new AtomicLong();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReference f9188k = new AtomicReference();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f9189l = new AtomicBoolean();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile boolean f9190m;

    public b(u5.b bVar) {
        this.f9186h = bVar;
    }

    @Override // u5.b
    public final void b() {
        this.f9190m = true;
        u5.b bVar = this.f9186h;
        a aVar = this.i;
        if (getAndIncrement() == 0) {
            Throwable thB = aVar.b();
            if (thB != null) {
                bVar.onError(thB);
            } else {
                bVar.b();
            }
        }
    }

    @Override // u5.b
    public final void c(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            u5.b bVar = this.f9186h;
            bVar.c(obj);
            if (decrementAndGet() != 0) {
                Throwable thB = this.i.b();
                if (thB != null) {
                    bVar.onError(thB);
                } else {
                    bVar.b();
                }
            }
        }
    }

    @Override // u5.c
    public final void cancel() {
        if (this.f9190m) {
            return;
        }
        f.a(this.f9188k);
    }

    @Override // u5.c
    public final void e(long j4) {
        if (j4 > 0) {
            f.b(this.f9188k, this.f9187j, j4);
        } else {
            cancel();
            onError(new IllegalArgumentException(AbstractC0013g0.h("§3.9 violated: positive request amount required but it was ", j4)));
        }
    }

    @Override // u5.b
    public final void h(u5.c cVar) {
        if (this.f9189l.compareAndSet(false, true)) {
            this.f9186h.h(this);
            f.c(this.f9188k, this.f9187j, cVar);
        } else {
            cVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // u5.b
    public final void onError(Throwable th) {
        this.f9190m = true;
        u5.b bVar = this.f9186h;
        a aVar = this.i;
        if (!aVar.a(th)) {
            G4.a.A(th);
        } else if (getAndIncrement() == 0) {
            bVar.onError(aVar.b());
        }
    }
}
