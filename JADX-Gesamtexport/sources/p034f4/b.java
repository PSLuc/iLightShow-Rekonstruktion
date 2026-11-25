package p034f4;

import R3.k;
import S3.a;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class b extends k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f8947h;
    public final a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f8948j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f8949k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f8950l;

    public b(d dVar) {
        this.f8949k = dVar;
        a aVar = new a(1);
        this.f8947h = aVar;
        a aVar2 = new a(0);
        this.i = aVar2;
        a aVar3 = new a(1);
        this.f8948j = aVar3;
        aVar3.b(aVar);
        aVar3.b(aVar2);
    }

    @Override // S3.b
    public final void a() {
        if (this.f8950l) {
            return;
        }
        this.f8950l = true;
        this.f8948j.a();
    }

    @Override // R3.k
    public final S3.b b(Runnable runnable, long j4, TimeUnit timeUnit) {
        return this.f8950l ? V3.b.f5509h : this.f8949k.e(runnable, j4, timeUnit, this.i);
    }

    @Override // R3.k
    public final void c(Runnable runnable) {
        if (this.f8950l) {
            return;
        }
        this.f8949k.e(runnable, 0L, TimeUnit.MILLISECONDS, this.f8947h);
    }
}
