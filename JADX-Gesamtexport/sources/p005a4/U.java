package p005a4;

import V3.a;
import V3.b;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicReference;
import p043h4.f;
import u5.c;

/* JADX INFO: loaded from: classes.dex */
public final class U extends AtomicReference implements c, Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final R3.c f6225h;
    public volatile boolean i;

    public U(R3.c cVar) {
        this.f6225h = cVar;
    }

    @Override // u5.c
    public final void cancel() {
        a.b(this);
    }

    @Override // u5.c
    public final void e(long j4) {
        if (f.f(j4)) {
            this.i = true;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() != a.f5508h) {
            boolean z5 = this.i;
            b bVar = b.f5509h;
            if (!z5) {
                lazySet(bVar);
                this.f6225h.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
            } else {
                this.f6225h.c(0L);
                lazySet(bVar);
                this.f6225h.b();
            }
        }
    }
}
