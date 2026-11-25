package X;

import N.C0208d;

/* JADX INFO: loaded from: classes.dex */
public final class G extends C0387d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0387d f5657o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f5658p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f5659q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public D4.c f5660r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public D4.c f5661s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f5662t;

    public G(C0387d c0387d, D4.c cVar, D4.c cVar2, boolean z5, boolean z6) {
        D4.c cVarI;
        D4.c cVarX;
        super(0, m.f5702l, o.l(cVar, (c0387d == null || (cVarX = c0387d.f()) == null) ? ((C0386c) o.i.get()).f5671e : cVarX, z5), o.b(cVar2, (c0387d == null || (cVarI = c0387d.i()) == null) ? ((C0386c) o.i.get()).f5672f : cVarI));
        this.f5657o = c0387d;
        this.f5658p = z5;
        this.f5659q = z6;
        this.f5660r = this.f5671e;
        this.f5661s = this.f5672f;
        this.f5662t = C0208d.z();
    }

    @Override // X.C0387d
    public final void A(p080p.A a6) {
        t.h();
        throw null;
    }

    @Override // X.C0387d
    public final C0387d B(D4.c cVar, D4.c cVar2) {
        D4.c cVarL = o.l(cVar, this.f5660r, true);
        D4.c cVarB = o.b(cVar2, this.f5661s);
        return !this.f5658p ? new G(C().B(null, cVarB), cVarL, cVarB, false, true) : C().B(cVarL, cVarB);
    }

    public final C0387d C() {
        C0387d c0387d = this.f5657o;
        return c0387d == null ? (C0387d) o.i.get() : c0387d;
    }

    @Override // X.C0387d, X.AbstractC0391h
    public final void c() {
        C0387d c0387d;
        this.f5687c = true;
        if (!this.f5659q || (c0387d = this.f5657o) == null) {
            return;
        }
        c0387d.c();
    }

    @Override // X.AbstractC0391h
    public final int d() {
        return C().d();
    }

    @Override // X.AbstractC0391h
    public final m e() {
        return C().e();
    }

    @Override // X.C0387d, X.AbstractC0391h
    public final D4.c f() {
        return this.f5660r;
    }

    @Override // X.C0387d, X.AbstractC0391h
    public final boolean g() {
        return C().g();
    }

    @Override // X.C0387d, X.AbstractC0391h
    public final int h() {
        return C().h();
    }

    @Override // X.C0387d, X.AbstractC0391h
    public final D4.c i() {
        return this.f5661s;
    }

    @Override // X.C0387d, X.AbstractC0391h
    public final void k() {
        t.h();
        throw null;
    }

    @Override // X.C0387d, X.AbstractC0391h
    public final void l() {
        t.h();
        throw null;
    }

    @Override // X.C0387d, X.AbstractC0391h
    public final void m() {
        C().m();
    }

    @Override // X.C0387d, X.AbstractC0391h
    public final void n(B b6) {
        C().n(b6);
    }

    @Override // X.AbstractC0391h
    public final void q(int i) {
        t.h();
        throw null;
    }

    @Override // X.AbstractC0391h
    public final void r(m mVar) {
        t.h();
        throw null;
    }

    @Override // X.C0387d, X.AbstractC0391h
    public final void s(int i) {
        C().s(i);
    }

    @Override // X.C0387d, X.AbstractC0391h
    public final AbstractC0391h t(D4.c cVar) {
        D4.c cVarL = o.l(cVar, this.f5660r, true);
        return !this.f5658p ? o.h(C().t(null), cVarL, true) : C().t(cVarL);
    }

    @Override // X.C0387d
    public final t v() {
        return C().v();
    }

    @Override // X.C0387d
    public final p080p.A w() {
        return C().w();
    }

    @Override // X.C0387d
    /* JADX INFO: renamed from: x */
    public final D4.c f() {
        return this.f5660r;
    }
}
