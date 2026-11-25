package P4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: P4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0320g extends C0327n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4653c = AtomicIntegerFieldUpdater.newUpdater(C0320g.class, "_resumed");
    private volatile int _resumed;

    public C0320g(C0319f c0319f, Throwable th, boolean z5) {
        if (th == null) {
            th = new CancellationException("Continuation " + c0319f + " was cancelled normally");
        }
        super(th, z5);
        this._resumed = 0;
    }
}
