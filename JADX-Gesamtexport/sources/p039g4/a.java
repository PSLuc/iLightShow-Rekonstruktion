package p039g4;

import R3.c;
import S3.b;
import W2.g;
import Z2.f;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import p005a4.EnumC0411t;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AtomicReference implements c, u5.c, b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final U3.a f9183h;
    public final g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f9184j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final EnumC0411t f9185k;

    public a(U3.a aVar) {
        g gVar = W3.b.f5603e;
        f fVar = W3.b.f5601c;
        EnumC0411t enumC0411t = EnumC0411t.f6320h;
        this.f9183h = aVar;
        this.i = gVar;
        this.f9184j = fVar;
        this.f9185k = enumC0411t;
    }

    @Override // S3.b
    public final void a() {
        p043h4.f.a(this);
    }

    @Override // u5.b
    public final void b() {
        Object obj = get();
        p043h4.f fVar = p043h4.f.f9307h;
        if (obj != fVar) {
            lazySet(fVar);
            try {
                this.f9184j.getClass();
            } catch (Throwable th) {
                p027e3.a.w0(th);
                G4.a.A(th);
            }
        }
    }

    @Override // u5.b
    public final void c(Object obj) {
        if (get() == p043h4.f.f9307h) {
            return;
        }
        try {
            this.f9183h.e(obj);
        } catch (Throwable th) {
            p027e3.a.w0(th);
            ((u5.c) get()).cancel();
            onError(th);
        }
    }

    @Override // u5.c
    public final void cancel() {
        p043h4.f.a(this);
    }

    @Override // u5.c
    public final void e(long j4) {
        ((u5.c) get()).e(j4);
    }

    @Override // u5.b
    public final void h(u5.c cVar) {
        if (p043h4.f.d(this, cVar)) {
            try {
                this.f9185k.e(this);
            } catch (Throwable th) {
                p027e3.a.w0(th);
                cVar.cancel();
                onError(th);
            }
        }
    }

    @Override // u5.b
    public final void onError(Throwable th) {
        Object obj = get();
        p043h4.f fVar = p043h4.f.f9307h;
        if (obj == fVar) {
            G4.a.A(th);
            return;
        }
        lazySet(fVar);
        try {
            this.i.e(th);
        } catch (Throwable th2) {
            p027e3.a.w0(th2);
            G4.a.A(new CompositeException(th, th2));
        }
    }
}
