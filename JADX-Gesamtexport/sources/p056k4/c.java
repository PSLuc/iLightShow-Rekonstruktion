package p056k4;

import p043h4.a;
import p043h4.f;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f9938h;

    public c(d dVar) {
        this.f9938h = dVar;
    }

    @Override // u5.c
    public final void cancel() {
        if (this.f9938h.f9944o) {
            return;
        }
        this.f9938h.f9944o = true;
        Runnable runnable = (Runnable) this.f9938h.f9939j.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        d dVar = this.f9938h;
        if (dVar.f9948s || dVar.f9946q.getAndIncrement() != 0) {
            return;
        }
        this.f9938h.i.clear();
        this.f9938h.f9943n.lazySet(null);
    }

    @Override // X3.h
    public final void clear() {
        this.f9938h.i.clear();
    }

    @Override // u5.c
    public final void e(long j4) {
        if (f.f(j4)) {
            d dVar = this.f9938h;
            p027e3.a.O(dVar.f9947r, j4);
            dVar.j();
        }
    }

    @Override // X3.d
    public final int i(int i) {
        this.f9938h.f9948s = true;
        return 2;
    }

    @Override // X3.h
    public final boolean isEmpty() {
        return this.f9938h.i.isEmpty();
    }

    @Override // X3.h
    public final Object poll() {
        return this.f9938h.i.poll();
    }
}
