package R3;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f4806h;
    public final S3.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f4807j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f4808k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f4809l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f4810m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f4811n;

    public j(k kVar, long j4, Runnable runnable, long j6, S3.c cVar, long j7) {
        this.f4811n = kVar;
        this.f4806h = runnable;
        this.i = cVar;
        this.f4807j = j7;
        this.f4809l = j6;
        this.f4810m = j4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        long j4;
        this.f4806h.run();
        S3.c cVar = this.i;
        if (cVar.b()) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        k kVar = this.f4811n;
        kVar.getClass();
        long jConvert = timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        long j6 = l.f4812a;
        long j7 = jConvert + j6;
        long j8 = this.f4809l;
        long j9 = this.f4807j;
        if (j7 < j8 || jConvert >= j8 + j9 + j6) {
            j4 = jConvert + j9;
            long j10 = this.f4808k + 1;
            this.f4808k = j10;
            this.f4810m = j4 - (j9 * j10);
        } else {
            long j11 = this.f4810m;
            long j12 = this.f4808k + 1;
            this.f4808k = j12;
            j4 = (j12 * j9) + j11;
        }
        this.f4809l = jConvert;
        V3.a.c(cVar, kVar.b(this, j4 - jConvert, timeUnit));
    }
}
