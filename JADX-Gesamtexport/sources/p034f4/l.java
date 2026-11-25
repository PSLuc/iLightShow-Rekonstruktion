package p034f4;

import R3.k;
import S3.a;
import S3.b;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class l extends k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ScheduledExecutorService f8981h;
    public volatile boolean i;

    public l(n nVar) {
        boolean z5 = r.f8989a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, nVar);
        if (r.f8989a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            r.f8992d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.f8981h = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // S3.b
    public final void a() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f8981h.shutdownNow();
    }

    @Override // R3.k
    public final b b(Runnable runnable, long j4, TimeUnit timeUnit) {
        return this.i ? V3.b.f5509h : e(runnable, j4, timeUnit, null);
    }

    @Override // R3.k
    public final void c(Runnable runnable) {
        b(runnable, 0L, null);
    }

    public final q e(Runnable runnable, long j4, TimeUnit timeUnit, a aVar) {
        q qVar = new q(runnable, aVar);
        if (aVar == null || aVar.b(qVar)) {
            ScheduledExecutorService scheduledExecutorService = this.f8981h;
            try {
                qVar.b(j4 <= 0 ? scheduledExecutorService.submit((Callable) qVar) : scheduledExecutorService.schedule((Callable) qVar, j4, timeUnit));
                return qVar;
            } catch (RejectedExecutionException e6) {
                if (aVar != null) {
                    aVar.e(qVar);
                }
                G4.a.A(e6);
            }
        }
        return qVar;
    }
}
