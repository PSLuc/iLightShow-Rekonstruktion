package p005a4;

import R3.c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p043h4.f;
import u5.a;

/* JADX INFO: loaded from: classes.dex */
public final class H extends AtomicInteger implements c, u5.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f6189h;
    public final AtomicReference i = new AtomicReference();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicLong f6190j = new AtomicLong();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public I f6191k;

    public H(a aVar) {
        this.f6189h = aVar;
    }

    @Override // u5.b
    public final void b() {
        this.f6191k.cancel();
        this.f6191k.f6198o.b();
    }

    @Override // u5.b
    public final void c(Object obj) {
        if (getAndIncrement() == 0) {
            while (((u5.c) this.i.get()) != f.f9307h) {
                this.f6189h.a(this.f6191k);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // u5.c
    public final void cancel() {
        f.a(this.i);
    }

    @Override // u5.c
    public final void e(long j4) {
        f.b(this.i, this.f6190j, j4);
    }

    @Override // u5.b
    public final void h(u5.c cVar) {
        f.c(this.i, this.f6190j, cVar);
    }

    @Override // u5.b
    public final void onError(Throwable th) {
        this.f6191k.cancel();
        this.f6191k.f6198o.onError(th);
    }
}
