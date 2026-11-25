package P4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends U {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4622m = AtomicIntegerFieldUpdater.newUpdater(Q.class, "_invoked");
    private volatile int _invoked;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final D4.c f4623l;

    public Q(D4.c cVar) {
        this.f4623l = cVar;
    }

    @Override // D4.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        q((Throwable) obj);
        return p084p4.x.f10867a;
    }

    @Override // P4.W
    public final void q(Throwable th) {
        if (f4622m.compareAndSet(this, 0, 1)) {
            this.f4623l.invoke(th);
        }
    }
}
