package X;

import N.W;

/* JADX INFO: renamed from: X.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0386c extends C0387d {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public C0386c(int i, m mVar) {
        D4.c c0384a;
        synchronized (o.f5709b) {
            ?? r6 = o.f5715h;
            E4.k.f("<this>", r6);
            c0384a = (D4.c) (r6.size() == 1 ? r6.get(0) : null);
            c0384a = c0384a == null ? new C0384a(0, r6) : c0384a;
        }
        super(i, mVar, null, c0384a);
    }

    @Override // X.C0387d
    public final C0387d B(D4.c cVar, D4.c cVar2) {
        return (C0387d) ((AbstractC0391h) o.f(new W(new C0385b(cVar, cVar2, 0), 1)));
    }

    @Override // X.C0387d, X.AbstractC0391h
    public final void c() {
        synchronized (o.f5709b) {
            int i = this.f5688d;
            if (i >= 0) {
                o.u(i);
                this.f5688d = -1;
            }
        }
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
        o.a();
    }

    @Override // X.C0387d, X.AbstractC0391h
    public final AbstractC0391h t(D4.c cVar) {
        return (AbstractC0391h) o.f(new W(new A2.b(cVar, 2), 1));
    }

    @Override // X.C0387d
    public final t v() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
