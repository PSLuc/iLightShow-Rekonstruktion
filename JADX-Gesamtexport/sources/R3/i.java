package R3;

/* JADX INFO: loaded from: classes.dex */
public final class i implements S3.b, Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p017c4.a f4804h;
    public final k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f4805j;

    public i(p017c4.a aVar, k kVar) {
        this.f4804h = aVar;
        this.i = kVar;
    }

    @Override // S3.b
    public final void a() {
        this.f4805j = true;
        this.i.a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4805j) {
            return;
        }
        try {
            this.f4804h.run();
        } catch (Throwable th) {
            p027e3.a.w0(th);
            this.i.a();
            throw p047i4.c.a(th);
        }
    }
}
