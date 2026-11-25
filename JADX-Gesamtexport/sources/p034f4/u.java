package p034f4;

import G4.a;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Runnable f8997h;
    public final w i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f8998j;

    public u(Runnable runnable, w wVar, long j4) {
        this.f8997h = runnable;
        this.i = wVar;
        this.f8998j = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.i.f9004k) {
            return;
        }
        w wVar = this.i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        wVar.getClass();
        long jConvert = timeUnit.convert(System.currentTimeMillis(), timeUnit);
        long j4 = this.f8998j;
        if (j4 > jConvert) {
            try {
                Thread.sleep(j4 - jConvert);
            } catch (InterruptedException e6) {
                Thread.currentThread().interrupt();
                a.A(e6);
                return;
            }
        }
        if (this.i.f9004k) {
            return;
        }
        this.f8997h.run();
    }
}
