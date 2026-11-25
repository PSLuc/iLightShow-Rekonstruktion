package p011b4;

import F.C0074p;
import R3.e;
import S3.b;
import Z2.f;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AtomicReference implements e, b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0074p f7105h;
    public final C0074p i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f7106j;

    public a(C0074p c0074p, C0074p c0074p2) {
        f fVar = W3.b.f5601c;
        this.f7105h = c0074p;
        this.i = c0074p2;
        this.f7106j = fVar;
    }

    @Override // S3.b
    public final void a() {
        V3.a.b(this);
    }

    @Override // R3.e
    public final void b() {
        lazySet(V3.a.f5508h);
        try {
            this.f7106j.getClass();
        } catch (Throwable th) {
            p027e3.a.w0(th);
            G4.a.A(th);
        }
    }

    @Override // R3.e, R3.m
    public final void d(b bVar) {
        V3.a.d(this, bVar);
    }

    @Override // R3.e, R3.m
    public final void f(Object obj) {
        lazySet(V3.a.f5508h);
        try {
            this.f7105h.getClass();
        } catch (Throwable th) {
            p027e3.a.w0(th);
            G4.a.A(th);
        }
    }

    @Override // R3.e, R3.m
    public final void onError(Throwable th) {
        lazySet(V3.a.f5508h);
        try {
            this.i.getClass();
        } catch (Throwable th2) {
            p027e3.a.w0(th2);
            G4.a.A(new CompositeException(th, th2));
        }
    }
}
