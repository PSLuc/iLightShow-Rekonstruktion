package Y3;

import R3.e;
import R3.m;
import c5.C0495p;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p011b4.d;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AtomicReference implements S3.b, U3.a, e, m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5918h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f5919j;

    public /* synthetic */ a(Object obj, int i, Object obj2) {
        this.f5918h = i;
        this.i = obj;
        this.f5919j = obj2;
    }

    @Override // S3.b
    public final void a() {
        switch (this.f5918h) {
            case 0:
                V3.a.b(this);
                break;
            case 1:
                V3.a.b(this);
                V3.a.b((d) this.f5919j);
                break;
            default:
                V3.a.b(this);
                break;
        }
    }

    @Override // R3.e
    public void b() {
        V3.a.b((d) this.f5919j);
        V3.a aVar = V3.a.f5508h;
        if (getAndSet(aVar) != aVar) {
            ((e) this.i).b();
        }
    }

    public void c() {
        if (V3.a.b(this)) {
            ((e) this.i).onError(new TimeoutException());
        }
    }

    @Override // R3.e, R3.m
    public void d(S3.b bVar) {
        switch (this.f5918h) {
            case 1:
                V3.a.d(this, bVar);
                break;
            default:
                if (V3.a.d(this, bVar)) {
                    ((e) this.i).d(this);
                }
                break;
        }
    }

    @Override // U3.a
    public void e(Object obj) {
        G4.a.A(new OnErrorNotImplementedException((Throwable) obj));
    }

    @Override // R3.e, R3.m
    public void f(Object obj) {
        switch (this.f5918h) {
            case 1:
                V3.a.b((d) this.f5919j);
                V3.a aVar = V3.a.f5508h;
                if (getAndSet(aVar) != aVar) {
                    ((e) this.i).f(obj);
                }
                break;
            default:
                try {
                    Object objInvoke = ((v5.a) this.f5919j).f13300h.invoke(obj);
                    W3.b.a("The mapper returned a null MaybeSource", objInvoke);
                    R3.d dVar = (R3.d) objInvoke;
                    if (((S3.b) get()) != V3.a.f5508h) {
                        dVar.b(new C0495p(this, 5, (e) this.i));
                        break;
                    }
                } catch (Throwable th) {
                    p027e3.a.w0(th);
                    onError(th);
                    return;
                }
                break;
        }
    }

    @Override // R3.e, R3.m
    public void onError(Throwable th) {
        switch (this.f5918h) {
            case 1:
                V3.a.b((d) this.f5919j);
                V3.a aVar = V3.a.f5508h;
                if (getAndSet(aVar) == aVar) {
                    G4.a.A(th);
                } else {
                    ((e) this.i).onError(th);
                }
                break;
            default:
                ((e) this.i).onError(th);
                break;
        }
    }

    public a(e eVar) {
        this.f5918h = 1;
        this.i = eVar;
        this.f5919j = new d(this);
    }
}
