package p034f4;

import R3.k;
import S3.a;
import S3.b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class h extends k {
    public final g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f8970j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f8971k = new AtomicBoolean();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f8969h = new a(0);

    public h(g gVar) {
        i iVar;
        i iVar2;
        this.i = gVar;
        if (gVar.f8965j.i) {
            iVar2 = j.f8976f;
        } else {
            do {
                if (gVar.i.isEmpty()) {
                    iVar = new i(gVar.f8968m);
                    gVar.f8965j.b(iVar);
                    break;
                }
                iVar = (i) gVar.i.poll();
            } while (iVar == null);
            iVar2 = iVar;
        }
        this.f8970j = iVar2;
    }

    @Override // S3.b
    public final void a() {
        if (this.f8971k.compareAndSet(false, true)) {
            this.f8969h.a();
            g gVar = this.i;
            gVar.getClass();
            long jNanoTime = System.nanoTime() + gVar.f8964h;
            i iVar = this.f8970j;
            iVar.f8972j = jNanoTime;
            gVar.i.offer(iVar);
        }
    }

    @Override // R3.k
    public final b b(Runnable runnable, long j4, TimeUnit timeUnit) {
        return this.f8969h.i ? V3.b.f5509h : this.f8970j.e(runnable, j4, timeUnit, this.f8969h);
    }
}
