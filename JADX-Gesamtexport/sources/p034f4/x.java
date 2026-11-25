package p034f4;

import G4.a;
import R3.k;
import R3.l;
import S3.b;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class x extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f9005b = new x();

    @Override // R3.l
    public final k a() {
        return new w();
    }

    @Override // R3.l
    public final b b(Runnable runnable, long j4, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j4);
            runnable.run();
        } catch (InterruptedException e6) {
            Thread.currentThread().interrupt();
            a.A(e6);
        }
        return V3.b.f5509h;
    }
}
