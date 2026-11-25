package P4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: P4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0327n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4663b = AtomicIntegerFieldUpdater.newUpdater(C0327n.class, "_handled");
    private volatile int _handled;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f4664a;

    public C0327n(Throwable th, boolean z5) {
        this.f4664a = th;
        this._handled = z5 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f4664a + ']';
    }
}
