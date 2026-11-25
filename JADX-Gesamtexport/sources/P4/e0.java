package P4;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends p111u4.a implements T {
    public static final e0 i = new e0(C0332t.i);

    @Override // P4.T
    public final CancellationException G() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // P4.T
    public final Object M(p122w4.c cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // P4.T
    public final E Q(D4.c cVar) {
        return f0.f4652h;
    }

    @Override // P4.T
    public final InterfaceC0322i V(b0 b0Var) {
        return f0.f4652h;
    }

    @Override // P4.T
    public final boolean b() {
        return true;
    }

    @Override // P4.T
    public final void c(CancellationException cancellationException) {
    }

    @Override // P4.T
    public final T getParent() {
        return null;
    }

    @Override // P4.T
    public final boolean k() {
        return false;
    }

    @Override // P4.T
    public final E s(boolean z5, boolean z6, D4.c cVar) {
        return f0.f4652h;
    }

    public final String toString() {
        return "NonCancellable";
    }
}
