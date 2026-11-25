package p034f4;

import S3.a;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f8964h;
    public final ConcurrentLinkedQueue i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f8965j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f8966k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ScheduledFuture f8967l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f8968m;

    public g(long j4, TimeUnit timeUnit, n nVar) {
        g gVar;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        long nanos = timeUnit != null ? timeUnit.toNanos(j4) : 0L;
        this.f8964h = nanos;
        this.i = new ConcurrentLinkedQueue();
        this.f8965j = new a(0);
        this.f8968m = nVar;
        if (timeUnit != null) {
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, j.f8974d);
            gVar = this;
            scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(gVar, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            gVar = this;
            scheduledExecutorServiceNewScheduledThreadPool = null;
            scheduledFutureScheduleWithFixedDelay = null;
        }
        gVar.f8966k = scheduledExecutorServiceNewScheduledThreadPool;
        gVar.f8967l = scheduledFutureScheduleWithFixedDelay;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue<i> concurrentLinkedQueue = this.i;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        for (i iVar : concurrentLinkedQueue) {
            if (iVar.f8972j > jNanoTime) {
                return;
            }
            if (concurrentLinkedQueue.remove(iVar)) {
                this.f8965j.e(iVar);
            }
        }
    }
}
