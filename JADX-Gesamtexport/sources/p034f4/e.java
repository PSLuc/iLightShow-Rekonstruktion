package p034f4;

import G4.a;
import R3.k;
import R3.l;
import S3.b;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class e extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f8954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f8955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f8956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f8957f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f8958b;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        f8956e = iAvailableProcessors;
        d dVar = new d(new n("RxComputationShutdown"));
        f8957f = dVar;
        dVar.a();
        n nVar = new n("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f8955d = nVar;
        c cVar = new c(0, nVar);
        f8954c = cVar;
        for (d dVar2 : cVar.f8952b) {
            dVar2.a();
        }
    }

    public e() {
        AtomicReference atomicReference;
        n nVar = f8955d;
        c cVar = f8954c;
        this.f8958b = new AtomicReference(cVar);
        c cVar2 = new c(f8956e, nVar);
        do {
            atomicReference = this.f8958b;
            if (atomicReference.compareAndSet(cVar, cVar2)) {
                return;
            }
        } while (atomicReference.get() == cVar);
        d[] dVarArr = cVar2.f8952b;
        for (d dVar : dVarArr) {
            dVar.a();
        }
    }

    @Override // R3.l
    public final k a() {
        return new b(((c) this.f8958b.get()).a());
    }

    @Override // R3.l
    public final b b(Runnable runnable, long j4, TimeUnit timeUnit) {
        d dVarA = ((c) this.f8958b.get()).a();
        dVarA.getClass();
        p pVar = new p(runnable);
        ScheduledExecutorService scheduledExecutorService = dVarA.f8981h;
        try {
            pVar.b(j4 <= 0 ? scheduledExecutorService.submit(pVar) : scheduledExecutorService.schedule(pVar, j4, timeUnit));
            return pVar;
        } catch (RejectedExecutionException e6) {
            a.A(e6);
            return V3.b.f5509h;
        }
    }

    @Override // R3.l
    public final b c(p017c4.a aVar, long j4, long j6) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        d dVarA = ((c) this.f8958b.get()).a();
        dVarA.getClass();
        V3.b bVar = V3.b.f5509h;
        if (j6 <= 0) {
            ScheduledExecutorService scheduledExecutorService = dVarA.f8981h;
            f fVar = new f(aVar, scheduledExecutorService);
            try {
                fVar.b(j4 <= 0 ? scheduledExecutorService.submit(fVar) : scheduledExecutorService.schedule(fVar, j4, timeUnit));
                return fVar;
            } catch (RejectedExecutionException e6) {
                a.A(e6);
            }
        } else {
            o oVar = new o(aVar);
            try {
                oVar.b(dVarA.f8981h.scheduleAtFixedRate(oVar, j4, j6, timeUnit));
                return oVar;
            } catch (RejectedExecutionException e7) {
                a.A(e7);
            }
        }
        return bVar;
    }
}
