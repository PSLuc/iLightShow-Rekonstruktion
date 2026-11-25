package p034f4;

import R3.k;
import S3.a;
import S3.b;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class s extends k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ScheduledExecutorService f8993h;
    public final a i = new a(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f8994j;

    public s(ScheduledExecutorService scheduledExecutorService) {
        this.f8993h = scheduledExecutorService;
    }

    @Override // S3.b
    public final void a() {
        if (this.f8994j) {
            return;
        }
        this.f8994j = true;
        this.i.a();
    }

    @Override // R3.k
    public final b b(Runnable runnable, long j4, TimeUnit timeUnit) {
        boolean z5 = this.f8994j;
        V3.b bVar = V3.b.f5509h;
        if (z5) {
            return bVar;
        }
        q qVar = new q(runnable, this.i);
        this.i.b(qVar);
        try {
            qVar.b(j4 <= 0 ? this.f8993h.submit((Callable) qVar) : this.f8993h.schedule((Callable) qVar, j4, timeUnit));
            return qVar;
        } catch (RejectedExecutionException e6) {
            a();
            G4.a.A(e6);
            return bVar;
        }
    }
}
