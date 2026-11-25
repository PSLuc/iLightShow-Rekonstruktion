package X;

import B.C0031p0;

/* JADX INFO: renamed from: X.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0390g extends AbstractC0391h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D4.c f5683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5684f;

    public C0390g(int i, m mVar, D4.c cVar) {
        super(i, mVar);
        this.f5683e = cVar;
        this.f5684f = 1;
    }

    @Override // X.AbstractC0391h
    public final void c() {
        if (this.f5687c) {
            return;
        }
        l();
        this.f5687c = true;
        synchronized (o.f5709b) {
            int i = this.f5688d;
            if (i >= 0) {
                o.u(i);
                this.f5688d = -1;
            }
        }
    }

    @Override // X.AbstractC0391h
    public final D4.c f() {
        return this.f5683e;
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
        this.f5684f++;
    }

    @Override // X.AbstractC0391h
    public final void l() {
        int i = this.f5684f - 1;
        this.f5684f = i;
        if (i == 0) {
            a();
        }
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
        o.d(this);
        return new C0389f(this.f5686b, this.f5685a, o.l(cVar, this.f5683e, true), this);
    }
}
