package E0;

import p124x0.m0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Z.n implements m0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f904u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f905v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public D4.c f906w;

    public b(boolean z5, boolean z6, D4.c cVar) {
        this.f904u = z5;
        this.f905v = z6;
        this.f906w = cVar;
    }

    @Override // p124x0.m0
    public final boolean Y() {
        return this.f905v;
    }

    @Override // p124x0.m0
    public final boolean Z() {
        return this.f904u;
    }

    @Override // p124x0.m0
    public final void g0(h hVar) {
        this.f906w.invoke(hVar);
    }
}
