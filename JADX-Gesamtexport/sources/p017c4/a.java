package p017c4;

import R3.g;
import S3.b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AtomicReference implements b, Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f7348h;
    public long i;

    public a(g gVar) {
        this.f7348h = gVar;
    }

    @Override // S3.b
    public final void a() {
        V3.a.b(this);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [R3.g, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (get() != V3.a.f5508h) {
            long j4 = this.i;
            this.i = 1 + j4;
            this.f7348h.c(Long.valueOf(j4));
        }
    }
}
