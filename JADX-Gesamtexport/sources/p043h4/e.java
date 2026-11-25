package p043h4;

import R3.c;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AtomicInteger implements X3.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f9306h;
    public final c i;

    public e(c cVar, Object obj) {
        this.i = cVar;
        this.f9306h = obj;
    }

    @Override // u5.c
    public final void cancel() {
        lazySet(2);
    }

    @Override // X3.h
    public final void clear() {
        lazySet(1);
    }

    @Override // u5.c
    public final void e(long j4) {
        if (f.f(j4) && compareAndSet(0, 1)) {
            c cVar = this.i;
            cVar.c(this.f9306h);
            if (get() != 2) {
                cVar.b();
            }
        }
    }

    @Override // X3.d
    public final int i(int i) {
        return 1;
    }

    @Override // X3.h
    public final boolean isEmpty() {
        return get() != 0;
    }

    @Override // X3.h
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // X3.h
    public final Object poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f9306h;
    }
}
