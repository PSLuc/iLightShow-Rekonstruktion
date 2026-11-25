package P4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p015c2.AbstractC0473d;

/* JADX INFO: loaded from: classes.dex */
public final class B extends U4.q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4602l = AtomicIntegerFieldUpdater.newUpdater(B.class, "_decision");
    private volatile int _decision;

    @Override // U4.q, P4.b0
    public final void p(Object obj) {
        q(obj);
    }

    @Override // U4.q, P4.b0
    public final void q(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f4602l;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                U4.a.g(AbstractC0336x.p(obj), AbstractC0473d.F(this.f5375k));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
