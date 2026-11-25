package L;

import N.C0208d;
import N.C0217h0;
import p123x.C1068a;

/* JADX INFO: renamed from: L.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0164o0 implements p123x.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0217h0 f2861a;

    public C0164o0(C1068a c1068a) {
        this.f2861a = C0208d.K(c1068a, N.U.f3673m);
    }

    @Override // p123x.a0
    public final int a(S0.b bVar, S0.k kVar) {
        return ((p123x.a0) this.f2861a.getValue()).a(bVar, kVar);
    }

    @Override // p123x.a0
    public final int b(S0.b bVar, S0.k kVar) {
        return ((p123x.a0) this.f2861a.getValue()).b(bVar, kVar);
    }

    @Override // p123x.a0
    public final int c(S0.b bVar) {
        return ((p123x.a0) this.f2861a.getValue()).c(bVar);
    }

    @Override // p123x.a0
    public final int d(S0.b bVar) {
        return ((p123x.a0) this.f2861a.getValue()).d(bVar);
    }
}
