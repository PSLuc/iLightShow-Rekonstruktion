package p019d0;

import B.C0024m;
import B.C0025m0;
import D4.c;
import E4.k;
import E4.l;
import Z.n;
import p015c2.AbstractC0473d;
import p027e3.a;
import p124x0.AbstractC1098f;
import p124x0.F;
import p124x0.InterfaceC1107o;
import p124x0.a0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends n implements a0, a, InterfaceC1107o {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final c f8568u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f8569v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c f8570w;

    public b(c cVar, c cVar2) {
        this.f8568u = cVar;
        this.f8570w = cVar2;
        cVar.f8571h = this;
    }

    @Override // p124x0.a0
    public final void D() {
        y0();
    }

    @Override // p019d0.a
    public final S0.b a() {
        return AbstractC1098f.s(this).f13850x;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [D4.c, E4.l] */
    @Override // p124x0.InterfaceC1107o
    public final void b(F f6) {
        boolean z5 = this.f8569v;
        c cVar = this.f8568u;
        if (!z5) {
            cVar.i = null;
            AbstractC1098f.p(this, new C0024m(this, 8, cVar));
            if (cVar.i == null) {
                a.z0("DrawResult not defined, did you forget to call onDraw?");
                throw null;
            }
            this.f8569v = true;
        }
        C0025m0 c0025m0 = cVar.i;
        k.c(c0025m0);
        ((l) c0025m0.i).invoke(f6);
    }

    @Override // p124x0.InterfaceC1107o
    public final void e0() {
        y0();
    }

    @Override // p019d0.a
    public final long f() {
        return AbstractC0473d.U(AbstractC1098f.q(this, 128).f13138j);
    }

    @Override // p019d0.a
    public final S0.k getLayoutDirection() {
        return AbstractC1098f.s(this).f13851y;
    }

    @Override // Z.n
    public final void s0() {
    }

    public final void y0() {
        this.f8569v = false;
        this.f8568u.i = null;
        AbstractC1098f.l(this);
    }
}
