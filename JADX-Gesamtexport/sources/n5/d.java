package n5;

import java.io.InterruptedIOException;
import p5.C0854t;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f10577h;
    public final /* synthetic */ k5.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0854t f10578j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g f10579k;

    public d(g gVar, long j4, k5.a aVar, C0854t c0854t) {
        this.f10579k = gVar;
        this.f10577h = j4;
        this.i = aVar;
        this.f10578j = c0854t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k5.a aVar = this.i;
        g gVar = this.f10579k;
        try {
            if (gVar.f10607u.get()) {
                g.a(gVar, this.f10577h, aVar, this.f10578j);
            } else {
                aVar.b(new InterruptedIOException("Connector is not running."));
            }
        } catch (Exception e6) {
            if (gVar.f10607u.get()) {
                g.f10586y.warn("Exception thrown by executor thread [{}]", Thread.currentThread().getName(), e6);
            }
            aVar.b(e6);
        } finally {
            gVar.f10596j.incrementAndGet();
        }
    }
}
