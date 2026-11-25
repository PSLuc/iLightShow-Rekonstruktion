package X;

import B.C0031p0;

/* JADX INFO: renamed from: X.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0389f extends AbstractC0391h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D4.c f5681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC0391h f5682f;

    public C0389f(int i, m mVar, D4.c cVar, AbstractC0391h abstractC0391h) {
        super(i, mVar);
        this.f5681e = cVar;
        this.f5682f = abstractC0391h;
        abstractC0391h.k();
    }

    @Override // X.AbstractC0391h
    public final void c() {
        if (this.f5687c) {
            return;
        }
        int i = this.f5686b;
        AbstractC0391h abstractC0391h = this.f5682f;
        if (i != abstractC0391h.d()) {
            a();
        }
        abstractC0391h.l();
        this.f5687c = true;
        synchronized (o.f5709b) {
            int i3 = this.f5688d;
            if (i3 >= 0) {
                o.u(i3);
                this.f5688d = -1;
            }
        }
    }

    @Override // X.AbstractC0391h
    public final D4.c f() {
        return this.f5681e;
    }

    @Override // X.AbstractC0391h
    public final boolean g() {
        return true;
    }

    @Override // X.AbstractC0391h
    public final D4.c i() {
        return null;
    }

    @Override // X.AbstractC0391h
    public final void k() {
        t.h();
        throw null;
    }

    @Override // X.AbstractC0391h
    public final void l() {
        t.h();
        throw null;
    }

    @Override // X.AbstractC0391h
    public final void m() {
    }

    @Override // X.AbstractC0391h
    public final void n(B b6) {
        C0031p0 c0031p0 = o.f5708a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // X.AbstractC0391h
    public final AbstractC0391h t(D4.c cVar) {
        return new C0389f(this.f5686b, this.f5685a, o.l(cVar, this.f5681e, true), this.f5682f);
    }
}
