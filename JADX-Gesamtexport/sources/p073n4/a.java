package p073n4;

import F.C0068j;
import R3.c;
import p047i4.d;
import p047i4.f;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c, u5.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f10562h;
    public u5.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10563j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0068j f10564k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f10565l;

    public a(c cVar) {
        this.f10562h = cVar;
    }

    @Override // u5.b
    public final void b() {
        if (this.f10565l) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f10565l) {
                    return;
                }
                if (!this.f10563j) {
                    this.f10565l = true;
                    this.f10563j = true;
                    this.f10562h.b();
                } else {
                    C0068j c0068j = this.f10564k;
                    if (c0068j == null) {
                        c0068j = new C0068j();
                        this.f10564k = c0068j;
                    }
                    c0068j.b(f.f9592h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // u5.b
    public final void c(Object obj) {
        C0068j c0068j;
        if (this.f10565l) {
            return;
        }
        if (obj == null) {
            this.i.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f10565l) {
                    return;
                }
                if (this.f10563j) {
                    C0068j c0068j2 = this.f10564k;
                    if (c0068j2 == null) {
                        c0068j2 = new C0068j();
                        this.f10564k = c0068j2;
                    }
                    c0068j2.b(obj);
                    return;
                }
                this.f10563j = true;
                this.f10562h.c(obj);
                do {
                    synchronized (this) {
                        try {
                            c0068j = this.f10564k;
                            if (c0068j == null) {
                                this.f10563j = false;
                                return;
                            }
                            this.f10564k = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (!c0068j.a(this.f10562h));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // u5.c
    public final void cancel() {
        this.i.cancel();
    }

    @Override // u5.c
    public final void e(long j4) {
        this.i.e(j4);
    }

    @Override // u5.b
    public final void h(u5.c cVar) {
        if (p043h4.f.g(this.i, cVar)) {
            this.i = cVar;
            this.f10562h.h(this);
        }
    }

    @Override // u5.b
    public final void onError(Throwable th) {
        if (this.f10565l) {
            G4.a.A(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z5 = true;
                if (!this.f10565l) {
                    if (this.f10563j) {
                        this.f10565l = true;
                        C0068j c0068j = this.f10564k;
                        if (c0068j == null) {
                            c0068j = new C0068j();
                            this.f10564k = c0068j;
                        }
                        ((Object[]) c0068j.f1183c)[0] = new d(th);
                        return;
                    }
                    this.f10565l = true;
                    this.f10563j = true;
                    z5 = false;
                }
                if (z5) {
                    G4.a.A(th);
                } else {
                    this.f10562h.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
