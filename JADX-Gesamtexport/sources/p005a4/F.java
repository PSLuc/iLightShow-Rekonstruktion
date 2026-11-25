package p005a4;

import G4.a;
import R3.c;
import java.util.concurrent.atomic.AtomicBoolean;
import p043h4.f;

/* JADX INFO: loaded from: classes.dex */
public final class F extends AtomicBoolean implements c, u5.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f6183h;
    public final G i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final E f6184j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u5.c f6185k;

    public F(c cVar, G g6, E e6) {
        this.f6183h = cVar;
        this.i = g6;
        this.f6184j = e6;
    }

    @Override // u5.b
    public final void b() {
        if (compareAndSet(false, true)) {
            this.i.i(this.f6184j);
            this.f6183h.b();
        }
    }

    @Override // u5.b
    public final void c(Object obj) {
        this.f6183h.c(obj);
    }

    @Override // u5.c
    public final void cancel() {
        this.f6185k.cancel();
        if (compareAndSet(false, true)) {
            G g6 = this.i;
            E e6 = this.f6184j;
            synchronized (g6) {
                try {
                    if (((E) g6.f6188l) == null) {
                        return;
                    }
                    long j4 = e6.i - 1;
                    e6.i = j4;
                    if (j4 == 0 && e6.f6181j) {
                        g6.j(e6);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // u5.c
    public final void e(long j4) {
        this.f6185k.e(j4);
    }

    @Override // u5.b
    public final void h(u5.c cVar) {
        if (f.g(this.f6185k, cVar)) {
            this.f6185k = cVar;
            this.f6183h.h(this);
        }
    }

    @Override // u5.b
    public final void onError(Throwable th) {
        if (!compareAndSet(false, true)) {
            a.A(th);
        } else {
            this.i.i(this.f6184j);
            this.f6183h.onError(th);
        }
    }
}
