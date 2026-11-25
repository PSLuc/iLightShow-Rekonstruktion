package h5;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class u extends P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public P f9369a;

    public u(P p6) {
        E4.k.f("delegate", p6);
        this.f9369a = p6;
    }

    @Override // h5.P
    public final P clearDeadline() {
        return this.f9369a.clearDeadline();
    }

    @Override // h5.P
    public final P clearTimeout() {
        return this.f9369a.clearTimeout();
    }

    @Override // h5.P
    public final long deadlineNanoTime() {
        return this.f9369a.deadlineNanoTime();
    }

    @Override // h5.P
    public final boolean hasDeadline() {
        return this.f9369a.hasDeadline();
    }

    @Override // h5.P
    public final void throwIfReached() throws InterruptedIOException {
        this.f9369a.throwIfReached();
    }

    @Override // h5.P
    public final P timeout(long j4, TimeUnit timeUnit) {
        E4.k.f("unit", timeUnit);
        return this.f9369a.timeout(j4, timeUnit);
    }

    @Override // h5.P
    public final long timeoutNanos() {
        return this.f9369a.timeoutNanos();
    }

    @Override // h5.P
    public final P deadlineNanoTime(long j4) {
        return this.f9369a.deadlineNanoTime(j4);
    }
}
