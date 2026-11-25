package p034f4;

import O1.n;
import R3.k;
import S3.b;
import S3.c;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class w extends k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PriorityBlockingQueue f9002h = new PriorityBlockingQueue();
    public final AtomicInteger i = new AtomicInteger();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicInteger f9003j = new AtomicInteger();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f9004k;

    @Override // S3.b
    public final void a() {
        this.f9004k = true;
    }

    @Override // R3.k
    public final b b(Runnable runnable, long j4, TimeUnit timeUnit) {
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        long millis = timeUnit.toMillis(j4) + timeUnit2.convert(System.currentTimeMillis(), timeUnit2);
        return e(new u(runnable, this, millis), millis);
    }

    @Override // R3.k
    public final void c(Runnable runnable) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        e(runnable, timeUnit.convert(System.currentTimeMillis(), timeUnit));
    }

    public final b e(Runnable runnable, long j4) {
        boolean z5 = this.f9004k;
        V3.b bVar = V3.b.f5509h;
        if (!z5) {
            v vVar = new v(runnable, Long.valueOf(j4), this.f9003j.incrementAndGet());
            this.f9002h.add(vVar);
            if (this.i.getAndIncrement() != 0) {
                return new c(0, new n(11, (Object) this, (Object) vVar, false));
            }
            int iAddAndGet = 1;
            while (!this.f9004k) {
                v vVar2 = (v) this.f9002h.poll();
                if (vVar2 == null) {
                    iAddAndGet = this.i.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                    }
                } else if (!vVar2.f9001k) {
                    vVar2.f8999h.run();
                }
            }
            this.f9002h.clear();
            return bVar;
        }
        return bVar;
    }
}
