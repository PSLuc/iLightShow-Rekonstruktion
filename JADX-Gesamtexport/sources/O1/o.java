package O1;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class o implements ThreadFactory {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ThreadFactory f4520h;
    public final AtomicInteger i;

    public o(C0310c c0310c) {
        Objects.requireNonNull(c0310c);
        this.f4520h = Executors.defaultThreadFactory();
        this.i = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.i;
        Thread threadNewThread = this.f4520h.newThread(runnable);
        threadNewThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
        return threadNewThread;
    }
}
