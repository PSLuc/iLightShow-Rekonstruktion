package p005a4;

import R3.c;
import p043h4.f;
import v5.a;

/* JADX INFO: loaded from: classes.dex */
public final class P implements c, u5.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f6214h;
    public final a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u5.c f6215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6216k;

    public P(c cVar, a aVar) {
        this.f6214h = cVar;
        this.i = aVar;
    }

    @Override // u5.b
    public final void b() {
        this.f6214h.b();
    }

    @Override // u5.b
    public final void c(Object obj) {
        boolean z5 = this.f6216k;
        c cVar = this.f6214h;
        if (z5) {
            cVar.c(obj);
            return;
        }
        try {
            if (this.i.test(obj)) {
                this.f6215j.e(1L);
            } else {
                this.f6216k = true;
                cVar.c(obj);
            }
        } catch (Throwable th) {
            p027e3.a.w0(th);
            this.f6215j.cancel();
            cVar.onError(th);
        }
    }

    @Override // u5.c
    public final void cancel() {
        this.f6215j.cancel();
    }

    @Override // u5.c
    public final void e(long j4) {
        this.f6215j.e(j4);
    }

    @Override // u5.b
    public final void h(u5.c cVar) {
        if (f.g(this.f6215j, cVar)) {
            this.f6215j = cVar;
            this.f6214h.h(this);
        }
    }

    @Override // u5.b
    public final void onError(Throwable th) {
        this.f6214h.onError(th);
    }
}
