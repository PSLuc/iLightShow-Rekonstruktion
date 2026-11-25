package h5;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: h5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0728f extends P {
    public static final C0725c Companion = new C0725c();
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static C0728f head;
    private static final ReentrantLock lock;
    private boolean inQueue;
    private C0728f next;
    private long timeoutAt;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        E4.k.e("lock.newCondition()", conditionNewCondition);
        condition = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static final long access$remainingNanos(C0728f c0728f, long j4) {
        return c0728f.timeoutAt - j4;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        long jTimeoutNanos = timeoutNanos();
        boolean zHasDeadline = hasDeadline();
        if (jTimeoutNanos != 0 || zHasDeadline) {
            C0725c c0725c = Companion;
            c0725c.getClass();
            c0725c.getClass();
            ReentrantLock reentrantLock = lock;
            reentrantLock.lock();
            try {
                if (this.inQueue) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.inQueue = true;
                if (head == null) {
                    head = new C0728f();
                    p034f4.m mVar = new p034f4.m("Okio Watchdog");
                    mVar.setDaemon(true);
                    mVar.start();
                }
                long jNanoTime = System.nanoTime();
                if (jTimeoutNanos != 0 && zHasDeadline) {
                    this.timeoutAt = Math.min(jTimeoutNanos, deadlineNanoTime() - jNanoTime) + jNanoTime;
                } else if (jTimeoutNanos != 0) {
                    this.timeoutAt = jTimeoutNanos + jNanoTime;
                } else {
                    if (!zHasDeadline) {
                        throw new AssertionError();
                    }
                    this.timeoutAt = deadlineNanoTime();
                }
                long jAccess$remainingNanos = access$remainingNanos(this, jNanoTime);
                C0728f c0728f = head;
                E4.k.c(c0728f);
                while (c0728f.next != null) {
                    C0728f c0728f2 = c0728f.next;
                    E4.k.c(c0728f2);
                    if (jAccess$remainingNanos < access$remainingNanos(c0728f2, jNanoTime)) {
                        break;
                    }
                    c0728f = c0728f.next;
                    E4.k.c(c0728f);
                }
                this.next = c0728f.next;
                c0728f.next = this;
                if (c0728f == head) {
                    Companion.getClass();
                    condition.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean exit() {
        C0725c c0725c = Companion;
        c0725c.getClass();
        c0725c.getClass();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (!this.inQueue) {
                return false;
            }
            this.inQueue = false;
            for (C0728f c0728f = head; c0728f != null; c0728f = c0728f.next) {
                if (c0728f.next == this) {
                    c0728f.next = this.next;
                    this.next = null;
                    return false;
                }
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final K sink(K k3) {
        E4.k.f("sink", k3);
        return new C0726d(this, 0, k3);
    }

    public final M source(M m6) {
        E4.k.f("source", m6);
        return new C0727e(this, m6);
    }

    public void timedOut() {
    }

    public final <T> T withTimeout(D4.a aVar) throws IOException {
        E4.k.f("block", aVar);
        enter();
        try {
            try {
                T t6 = (T) aVar.invoke();
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                return t6;
            } catch (IOException e6) {
                if (exit()) {
                    throw access$newTimeoutException(e6);
                }
                throw e6;
            }
        } catch (Throwable th) {
            exit();
            throw th;
        }
    }
}
