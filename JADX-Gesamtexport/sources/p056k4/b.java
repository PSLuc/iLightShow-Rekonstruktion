package p056k4;

import F.C0068j;
import G4.a;
import R3.c;
import p047i4.d;
import p047i4.e;
import p047i4.f;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9935j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0068j f9936k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f9937l;

    public b(d dVar) {
        this.i = dVar;
    }

    @Override // u5.b
    public final void b() {
        if (this.f9937l) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f9937l) {
                    return;
                }
                this.f9937l = true;
                if (!this.f9935j) {
                    this.f9935j = true;
                    this.i.b();
                    return;
                }
                C0068j c0068j = this.f9936k;
                if (c0068j == null) {
                    c0068j = new C0068j();
                    this.f9936k = c0068j;
                }
                c0068j.b(f.f9592h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // u5.b
    public final void c(Object obj) {
        if (this.f9937l) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f9937l) {
                    return;
                }
                if (!this.f9935j) {
                    this.f9935j = true;
                    this.i.c(obj);
                    i();
                } else {
                    C0068j c0068j = this.f9936k;
                    if (c0068j == null) {
                        c0068j = new C0068j();
                        this.f9936k = c0068j;
                    }
                    c0068j.b(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // R3.a
    public final void f(c cVar) {
        this.i.a(cVar);
    }

    @Override // u5.b
    public final void h(u5.c cVar) {
        boolean z5 = true;
        if (!this.f9937l) {
            synchronized (this) {
                try {
                    if (!this.f9937l) {
                        if (this.f9935j) {
                            C0068j c0068j = this.f9936k;
                            if (c0068j == null) {
                                c0068j = new C0068j();
                                this.f9936k = c0068j;
                            }
                            c0068j.b(new e(cVar));
                            return;
                        }
                        this.f9935j = true;
                        z5 = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z5) {
            cVar.cancel();
        } else {
            this.i.h(cVar);
            i();
        }
    }

    public final void i() {
        C0068j c0068j;
        while (true) {
            synchronized (this) {
                try {
                    c0068j = this.f9936k;
                    if (c0068j == null) {
                        this.f9935j = false;
                        return;
                    }
                    this.f9936k = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c0068j.a(this.i);
        }
    }

    @Override // u5.b
    public final void onError(Throwable th) {
        if (this.f9937l) {
            a.A(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z5 = true;
                if (!this.f9937l) {
                    this.f9937l = true;
                    if (this.f9935j) {
                        C0068j c0068j = this.f9936k;
                        if (c0068j == null) {
                            c0068j = new C0068j();
                            this.f9936k = c0068j;
                        }
                        ((Object[]) c0068j.f1183c)[0] = new d(th);
                        return;
                    }
                    this.f9935j = true;
                    z5 = false;
                }
                if (z5) {
                    a.A(th);
                } else {
                    this.i.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
