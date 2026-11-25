package R3;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f4812a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public abstract k a();

    public S3.b b(Runnable runnable, long j4, TimeUnit timeUnit) {
        k kVarA = a();
        h hVar = new h(runnable, kVarA);
        kVarA.b(hVar, j4, timeUnit);
        return hVar;
    }

    public S3.b c(p017c4.a aVar, long j4, long j6) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        k kVarA = a();
        i iVar = new i(aVar, kVarA);
        S3.b bVarD = kVarA.d(iVar, j4, j6);
        return bVarD == V3.b.f5509h ? bVarD : iVar;
    }
}
