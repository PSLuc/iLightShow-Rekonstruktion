package p022d4;

import R3.m;
import S3.b;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p043h4.f;
import v5.a;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AtomicLong implements m, R3.c, u5.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final R3.c f8589h;
    public final a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference f8590j = new AtomicReference();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f8591k;

    public c(R3.c cVar, a aVar) {
        this.f8589h = cVar;
        this.i = aVar;
    }

    @Override // u5.b
    public final void b() {
        this.f8589h.b();
    }

    @Override // u5.b
    public final void c(Object obj) {
        this.f8589h.c(obj);
    }

    @Override // u5.c
    public final void cancel() {
        this.f8591k.a();
        f.a(this.f8590j);
    }

    @Override // R3.m
    public final void d(b bVar) {
        this.f8591k = bVar;
        this.f8589h.h(this);
    }

    @Override // u5.c
    public final void e(long j4) {
        f.b(this.f8590j, this, j4);
    }

    @Override // R3.m
    public final void f(Object obj) {
        try {
            Object objInvoke = this.i.f13300h.invoke(obj);
            W3.b.a("the mapper returned a null Publisher", objInvoke);
            ((u5.a) objInvoke).a(this);
        } catch (Throwable th) {
            p027e3.a.w0(th);
            this.f8589h.onError(th);
        }
    }

    @Override // u5.b
    public final void h(u5.c cVar) {
        f.c(this.f8590j, this, cVar);
    }

    @Override // R3.m
    public final void onError(Throwable th) {
        this.f8589h.onError(th);
    }
}
