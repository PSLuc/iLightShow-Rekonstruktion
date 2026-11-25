package p034f4;

import G4.a;
import R3.k;
import R3.l;
import S3.b;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class t extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f8995c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f8996b;

    static {
        Executors.newScheduledThreadPool(0).shutdown();
        f8995c = new n("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public t() {
        AtomicReference atomicReference = new AtomicReference();
        this.f8996b = atomicReference;
        boolean z5 = r.f8989a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, f8995c);
        if (r.f8989a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            r.f8992d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        atomicReference.lazySet(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // R3.l
    public final k a() {
        return new s((ScheduledExecutorService) this.f8996b.get());
    }

    @Override // R3.l
    public final b b(Runnable runnable, long j4, TimeUnit timeUnit) {
        p pVar = new p(runnable);
        AtomicReference atomicReference = this.f8996b;
        try {
            pVar.b(j4 <= 0 ? ((ScheduledExecutorService) atomicReference.get()).submit(pVar) : ((ScheduledExecutorService) atomicReference.get()).schedule(pVar, j4, timeUnit));
            return pVar;
        } catch (RejectedExecutionException e6) {
            a.A(e6);
            return V3.b.f5509h;
        }
    }

    @Override // R3.l
    public final b c(p017c4.a aVar, long j4, long j6) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        V3.b bVar = V3.b.f5509h;
        AtomicReference atomicReference = this.f8996b;
        if (j6 > 0) {
            o oVar = new o(aVar);
            try {
                oVar.b(((ScheduledExecutorService) atomicReference.get()).scheduleAtFixedRate(oVar, j4, j6, timeUnit));
                return oVar;
            } catch (RejectedExecutionException e6) {
                a.A(e6);
                return bVar;
            }
        }
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
        f fVar = new f(aVar, scheduledExecutorService);
        try {
            fVar.b(j4 <= 0 ? scheduledExecutorService.submit(fVar) : scheduledExecutorService.schedule(fVar, j4, timeUnit));
            return fVar;
        } catch (RejectedExecutionException e7) {
            a.A(e7);
            return bVar;
        }
    }
}
