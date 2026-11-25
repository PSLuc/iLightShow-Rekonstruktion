package X;

import N.C0208d;

/* JADX INFO: loaded from: classes.dex */
public final class H extends AbstractC0391h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC0391h f5663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public D4.c f5665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f5666h;

    public H(AbstractC0391h abstractC0391h, D4.c cVar, boolean z5) {
        D4.c cVarF;
        super(0, m.f5702l);
        this.f5663e = abstractC0391h;
        this.f5664f = z5;
        this.f5665g = o.l(cVar, (abstractC0391h == null || (cVarF = abstractC0391h.f()) == null) ? ((C0386c) o.i.get()).f5671e : cVarF, false);
        this.f5666h = C0208d.z();
    }

    @Override // X.AbstractC0391h
    public final void c() {
        AbstractC0391h abstractC0391h;
        this.f5687c = true;
        if (!this.f5664f || (abstractC0391h = this.f5663e) == null) {
            return;
        }
        abstractC0391h.c();
    }

    @Override // X.AbstractC0391h
    public final int d() {
        return u().d();
    }

    @Override // X.AbstractC0391h
    public final m e() {
        return u().e();
    }

    @Override // X.AbstractC0391h
    public final D4.c f() {
        return this.f5665g;
    }

    @Override // X.AbstractC0391h
    public final boolean g() {
        return u().g();
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
        u().m();
    }

    @Override // X.AbstractC0391h
    public final void n(B b6) {
        u().n(b6);
    }

    @Override // X.AbstractC0391h
    public final AbstractC0391h t(D4.c cVar) {
        return o.h(u().t(null), o.l(cVar, this.f5665g, true), true);
    }

    public final AbstractC0391h u() {
        AbstractC0391h abstractC0391h = this.f5663e;
        return abstractC0391h == null ? (AbstractC0391h) o.i.get() : abstractC0391h;
    }
}
