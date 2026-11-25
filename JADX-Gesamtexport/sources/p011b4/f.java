package p011b4;

import R3.e;
import S3.b;
import V3.a;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AtomicReference implements b, Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f7112h;

    public f(e eVar) {
        this.f7112h = eVar;
    }

    @Override // S3.b
    public final void a() {
        a.b(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7112h.f(0L);
    }
}
