package R3;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class k implements S3.b {
    public abstract S3.b b(Runnable runnable, long j4, TimeUnit timeUnit);

    public void c(Runnable runnable) {
        b(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public final S3.b d(Runnable runnable, long j4, long j6) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        S3.c cVar = new S3.c();
        S3.c cVar2 = new S3.c();
        cVar2.lazySet(cVar);
        long nanos = timeUnit.toNanos(j6);
        long jConvert = TimeUnit.NANOSECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        S3.b bVarB = b(new j(this, timeUnit.toNanos(j4) + jConvert, runnable, jConvert, cVar2, nanos), j4, timeUnit);
        if (bVarB == V3.b.f5509h) {
            return bVarB;
        }
        V3.a.c(cVar, bVarB);
        return cVar2;
    }
}
