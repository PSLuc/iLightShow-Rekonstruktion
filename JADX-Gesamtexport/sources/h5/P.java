package h5;

import B.AbstractC0013g0;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* JADX INFO: loaded from: classes.dex */
public class P {
    public static final O Companion = new O();
    public static final P NONE = new N();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public final void awaitSignal(Condition condition) throws InterruptedIOException {
        E4.k.f("condition", condition);
        try {
            boolean zHasDeadline = hasDeadline();
            long jTimeoutNanos = timeoutNanos();
            long jNanoTime = 0;
            if (!zHasDeadline && jTimeoutNanos == 0) {
                condition.await();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (zHasDeadline && jTimeoutNanos != 0) {
                jTimeoutNanos = Math.min(jTimeoutNanos, deadlineNanoTime() - jNanoTime2);
            } else if (zHasDeadline) {
                jTimeoutNanos = deadlineNanoTime() - jNanoTime2;
            }
            if (jTimeoutNanos > 0) {
                condition.await(jTimeoutNanos, TimeUnit.NANOSECONDS);
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= jTimeoutNanos) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public P clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public P clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final P deadline(long j4, TimeUnit timeUnit) {
        E4.k.f("unit", timeUnit);
        if (j4 <= 0) {
            throw new IllegalArgumentException(AbstractC0013g0.h("duration <= 0: ", j4).toString());
        }
        return deadlineNanoTime(timeUnit.toNanos(j4) + System.nanoTime());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(P p6, D4.a aVar) {
        E4.k.f("other", p6);
        E4.k.f("block", aVar);
        long jTimeoutNanos = timeoutNanos();
        O o6 = Companion;
        long jTimeoutNanos2 = p6.timeoutNanos();
        long jTimeoutNanos3 = timeoutNanos();
        o6.getClass();
        if (jTimeoutNanos2 == 0 || (jTimeoutNanos3 != 0 && jTimeoutNanos2 >= jTimeoutNanos3)) {
            jTimeoutNanos2 = jTimeoutNanos3;
        }
        timeout(jTimeoutNanos2, TimeUnit.NANOSECONDS);
        if (!hasDeadline()) {
            if (p6.hasDeadline()) {
                deadlineNanoTime(p6.deadlineNanoTime());
            }
            try {
                return (T) aVar.invoke();
            } finally {
                timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                if (p6.hasDeadline()) {
                    clearDeadline();
                }
            }
        }
        long jDeadlineNanoTime = deadlineNanoTime();
        if (p6.hasDeadline()) {
            deadlineNanoTime(Math.min(deadlineNanoTime(), p6.deadlineNanoTime()));
        }
        try {
            return (T) aVar.invoke();
        } finally {
            timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            if (p6.hasDeadline()) {
                deadlineNanoTime(jDeadlineNanoTime);
            }
        }
    }

    public void throwIfReached() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public P timeout(long j4, TimeUnit timeUnit) {
        E4.k.f("unit", timeUnit);
        if (j4 < 0) {
            throw new IllegalArgumentException(AbstractC0013g0.h("timeout < 0: ", j4).toString());
        }
        this.timeoutNanos = timeUnit.toNanos(j4);
        return this;
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
        E4.k.f("monitor", obj);
        try {
            boolean zHasDeadline = hasDeadline();
            long jTimeoutNanos = timeoutNanos();
            long jNanoTime = 0;
            if (!zHasDeadline && jTimeoutNanos == 0) {
                obj.wait();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (zHasDeadline && jTimeoutNanos != 0) {
                jTimeoutNanos = Math.min(jTimeoutNanos, deadlineNanoTime() - jNanoTime2);
            } else if (zHasDeadline) {
                jTimeoutNanos = deadlineNanoTime() - jNanoTime2;
            }
            if (jTimeoutNanos > 0) {
                long j4 = jTimeoutNanos / 1000000;
                obj.wait(j4, (int) (jTimeoutNanos - (1000000 * j4)));
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= jTimeoutNanos) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public P deadlineNanoTime(long j4) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j4;
        return this;
    }
}
