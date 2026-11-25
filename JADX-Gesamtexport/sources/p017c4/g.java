package p017c4;

import S3.b;
import V3.a;
import java.util.concurrent.atomic.AtomicBoolean;
import p005a4.E;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AtomicBoolean implements R3.g, b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f7370h;
    public final h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final E f7371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f7372k;

    public g(R3.g gVar, h hVar, E e6) {
        this.f7370h = gVar;
        this.i = hVar;
        this.f7371j = e6;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [S3.b, java.lang.Object] */
    @Override // S3.b
    public final void a() {
        this.f7372k.a();
        if (compareAndSet(false, true)) {
            h hVar = this.i;
            E e6 = this.f7371j;
            synchronized (hVar) {
                try {
                    if (hVar.f7375m == null) {
                        return;
                    }
                    long j4 = e6.i - 1;
                    e6.i = j4;
                    if (j4 == 0 && e6.f6181j) {
                        hVar.K(e6);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [R3.g, java.lang.Object] */
    @Override // R3.g
    public final void b() {
        if (compareAndSet(false, true)) {
            this.i.J(this.f7371j);
            this.f7370h.b();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [R3.g, java.lang.Object] */
    @Override // R3.g
    public final void c(Object obj) {
        this.f7370h.c(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [S3.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [R3.g, java.lang.Object] */
    @Override // R3.g
    public final void d(b bVar) {
        if (a.e(this.f7372k, bVar)) {
            this.f7372k = bVar;
            this.f7370h.d(this);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [R3.g, java.lang.Object] */
    @Override // R3.g
    public final void onError(Throwable th) {
        if (!compareAndSet(false, true)) {
            G4.a.A(th);
        } else {
            this.i.J(this.f7371j);
            this.f7370h.onError(th);
        }
    }
}
