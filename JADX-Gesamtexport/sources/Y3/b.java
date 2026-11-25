package Y3;

import R3.g;
import Z2.f;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AtomicReference implements g, S3.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final U3.a f5920h;
    public final W2.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f5921j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final W2.g f5922k;

    public b(U3.a aVar) {
        W2.g gVar = W3.b.f5603e;
        f fVar = W3.b.f5601c;
        W2.g gVar2 = W3.b.f5602d;
        this.f5920h = aVar;
        this.i = gVar;
        this.f5921j = fVar;
        this.f5922k = gVar2;
    }

    @Override // S3.b
    public final void a() {
        V3.a.b(this);
    }

    @Override // R3.g
    public final void b() {
        Object obj = get();
        V3.a aVar = V3.a.f5508h;
        if (obj == aVar) {
            return;
        }
        lazySet(aVar);
        try {
            this.f5921j.getClass();
        } catch (Throwable th) {
            p027e3.a.w0(th);
            G4.a.A(th);
        }
    }

    @Override // R3.g
    public final void c(Object obj) {
        if (get() == V3.a.f5508h) {
            return;
        }
        try {
            this.f5920h.e(obj);
        } catch (Throwable th) {
            p027e3.a.w0(th);
            ((S3.b) get()).a();
            onError(th);
        }
    }

    @Override // R3.g
    public final void d(S3.b bVar) {
        if (V3.a.d(this, bVar)) {
            try {
                this.f5922k.getClass();
            } catch (Throwable th) {
                p027e3.a.w0(th);
                bVar.a();
                onError(th);
            }
        }
    }

    @Override // R3.g
    public final void onError(Throwable th) {
        Object obj = get();
        V3.a aVar = V3.a.f5508h;
        if (obj == aVar) {
            G4.a.A(th);
            return;
        }
        lazySet(aVar);
        try {
            this.i.e(th);
        } catch (Throwable th2) {
            p027e3.a.w0(th2);
            G4.a.A(new CompositeException(th, th2));
        }
    }
}
