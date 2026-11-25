package p101t;

import P4.AbstractC0336x;
import Z.n;
import p035g0.r;
import p044i0.b;
import p044i0.d;
import p117w.m;
import p124x0.F;
import p124x0.InterfaceC1107o;

/* JADX INFO: loaded from: classes.dex */
public final class C extends n implements InterfaceC1107o {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final m f12223u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12224v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12225w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12226x;

    public C(m mVar) {
        this.f12223u = mVar;
    }

    @Override // p124x0.InterfaceC1107o
    public final void b(F f6) {
        f6.b();
        boolean z5 = this.f12224v;
        b bVar = f6.f13862h;
        if (z5) {
            d.k0(f6, r.b(0.3f, r.f9076b), bVar.f(), 122);
        } else if (this.f12225w || this.f12226x) {
            d.k0(f6, r.b(0.1f, r.f9076b), bVar.f(), 122);
        }
    }

    @Override // Z.n
    public final void r0() {
        AbstractC0336x.o(n0(), null, new B(this, null), 3);
    }
}
