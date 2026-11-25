package p005a4;

import G4.a;
import R3.c;
import R3.e;
import R3.m;
import S3.b;
import java.util.NoSuchElementException;
import p043h4.f;

/* JADX INFO: loaded from: classes.dex */
public final class M implements c, b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6208h = 0;
    public Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u5.c f6209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6210k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f6211l;

    public M(e eVar) {
        this.f6211l = eVar;
    }

    @Override // S3.b
    public final void a() {
        switch (this.f6208h) {
            case 0:
                this.f6209j.cancel();
                this.f6209j = f.f9307h;
                break;
            default:
                this.f6209j.cancel();
                this.f6209j = f.f9307h;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [R3.m, java.lang.Object] */
    @Override // u5.b
    public final void b() {
        switch (this.f6208h) {
            case 0:
                if (!this.f6210k) {
                    this.f6210k = true;
                    this.f6209j = f.f9307h;
                    Object obj = this.i;
                    this.i = null;
                    e eVar = (e) this.f6211l;
                    if (obj != null) {
                        eVar.f(obj);
                    } else {
                        eVar.b();
                    }
                    break;
                }
                break;
            default:
                if (!this.f6210k) {
                    this.f6210k = true;
                    this.f6209j = f.f9307h;
                    Object obj2 = this.f6211l;
                    this.f6211l = null;
                    if (obj2 == null) {
                        obj2 = null;
                    }
                    ?? r6 = this.i;
                    if (obj2 == null) {
                        r6.onError(new NoSuchElementException());
                    } else {
                        r6.f(obj2);
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [R3.m, java.lang.Object] */
    @Override // u5.b
    public final void c(Object obj) {
        switch (this.f6208h) {
            case 0:
                if (!this.f6210k) {
                    if (this.i == null) {
                        this.i = obj;
                    } else {
                        this.f6210k = true;
                        this.f6209j.cancel();
                        this.f6209j = f.f9307h;
                        ((e) this.f6211l).onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    }
                    break;
                }
                break;
            default:
                if (!this.f6210k) {
                    if (this.f6211l == null) {
                        this.f6211l = obj;
                    } else {
                        this.f6210k = true;
                        this.f6209j.cancel();
                        this.f6209j = f.f9307h;
                        this.i.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [R3.m, java.lang.Object] */
    @Override // u5.b
    public final void h(u5.c cVar) {
        switch (this.f6208h) {
            case 0:
                if (f.g(this.f6209j, cVar)) {
                    this.f6209j = cVar;
                    ((e) this.f6211l).d(this);
                    cVar.e(Long.MAX_VALUE);
                }
                break;
            default:
                if (f.g(this.f6209j, cVar)) {
                    this.f6209j = cVar;
                    this.i.d(this);
                    cVar.e(Long.MAX_VALUE);
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [R3.m, java.lang.Object] */
    @Override // u5.b
    public final void onError(Throwable th) {
        switch (this.f6208h) {
            case 0:
                if (!this.f6210k) {
                    this.f6210k = true;
                    this.f6209j = f.f9307h;
                    ((e) this.f6211l).onError(th);
                } else {
                    a.A(th);
                }
                break;
            default:
                if (!this.f6210k) {
                    this.f6210k = true;
                    this.f6209j = f.f9307h;
                    this.i.onError(th);
                } else {
                    a.A(th);
                }
                break;
        }
    }

    public M(m mVar) {
        this.i = mVar;
    }
}
