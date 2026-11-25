package p022d4;

import R3.m;
import S3.b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AtomicReference implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f8587h;

    public a(m mVar) {
        this.f8587h = mVar;
    }

    @Override // S3.b
    public final void a() {
        V3.a.b(this);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [R3.m, java.lang.Object] */
    public final void b(Throwable th) {
        b bVar;
        Object obj = get();
        V3.a aVar = V3.a.f5508h;
        if (obj == aVar || (bVar = (b) getAndSet(aVar)) == aVar) {
            G4.a.A(th);
            return;
        }
        try {
            this.f8587h.onError(th);
        } finally {
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [R3.m, java.lang.Object] */
    public final void c(Object obj) {
        b bVar;
        Object obj2 = get();
        V3.a aVar = V3.a.f5508h;
        if (obj2 == aVar || (bVar = (b) getAndSet(aVar)) == aVar) {
            return;
        }
        try {
            this.f8587h.f(obj);
        } finally {
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return a.class.getSimpleName() + "{" + super.toString() + "}";
    }
}
