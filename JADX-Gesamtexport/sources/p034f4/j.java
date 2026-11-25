package p034f4;

import R3.k;
import R3.l;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class j extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f8973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f8974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TimeUnit f8975e = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f8976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f8977g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f8978b;

    static {
        i iVar = new i(new n("RxCachedThreadSchedulerShutdown"));
        f8976f = iVar;
        iVar.a();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        n nVar = new n("RxCachedThreadScheduler", iMax, false);
        f8973c = nVar;
        f8974d = new n("RxCachedWorkerPoolEvictor", iMax, false);
        g gVar = new g(0L, null, nVar);
        f8977g = gVar;
        gVar.f8965j.a();
        ScheduledFuture scheduledFuture = gVar.f8967l;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = gVar.f8966k;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public j() {
        AtomicReference atomicReference;
        n nVar = f8973c;
        g gVar = f8977g;
        this.f8978b = new AtomicReference(gVar);
        g gVar2 = new g(60L, f8975e, nVar);
        do {
            atomicReference = this.f8978b;
            if (atomicReference.compareAndSet(gVar, gVar2)) {
                return;
            }
        } while (atomicReference.get() == gVar);
        gVar2.f8965j.a();
        ScheduledFuture scheduledFuture = gVar2.f8967l;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = gVar2.f8966k;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // R3.l
    public final k a() {
        return new h((g) this.f8978b.get());
    }
}
