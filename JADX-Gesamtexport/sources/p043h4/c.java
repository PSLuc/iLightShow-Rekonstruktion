package p043h4;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final R3.c f9304h;
    public Object i;

    public c(R3.c cVar) {
        this.f9304h = cVar;
    }

    @Override // X3.h
    public final void clear() {
        lazySet(32);
        this.i = null;
    }

    @Override // u5.c
    public final void e(long j4) {
        Object obj;
        if (f.f(j4)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (obj = this.i) == null) {
                        return;
                    }
                    this.i = null;
                    R3.c cVar = this.f9304h;
                    cVar.c(obj);
                    if (get() != 4) {
                        cVar.b();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    public void f(Object obj) {
        j(obj);
    }

    @Override // X3.d
    public final int i(int i) {
        lazySet(8);
        return 2;
    }

    @Override // X3.h
    public final boolean isEmpty() {
        return get() != 16;
    }

    public final void j(Object obj) {
        int i = get();
        do {
            R3.c cVar = this.f9304h;
            if (i == 8) {
                this.i = obj;
                lazySet(16);
                cVar.c(obj);
                if (get() != 4) {
                    cVar.b();
                    return;
                }
                return;
            }
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                cVar.c(obj);
                if (get() != 4) {
                    cVar.b();
                    return;
                }
                return;
            }
            this.i = obj;
            if (compareAndSet(0, 1)) {
                return;
            } else {
                i = get();
            }
        } while (i != 4);
        this.i = null;
    }

    @Override // X3.h
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.i;
        this.i = null;
        return obj;
    }
}
