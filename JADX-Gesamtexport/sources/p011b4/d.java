package p011b4;

import R3.e;
import S3.b;
import Y3.a;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AtomicReference implements e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f7109h;

    public d(a aVar) {
        this.f7109h = aVar;
    }

    @Override // R3.e
    public final void b() {
        this.f7109h.c();
    }

    @Override // R3.e, R3.m
    public final void d(b bVar) {
        V3.a.d(this, bVar);
    }

    @Override // R3.e, R3.m
    public final void f(Object obj) {
        this.f7109h.c();
    }

    @Override // R3.e, R3.m
    public final void onError(Throwable th) {
        a aVar = this.f7109h;
        aVar.getClass();
        if (V3.a.b(aVar)) {
            ((e) aVar.i).onError(th);
        } else {
            G4.a.A(th);
        }
    }
}
