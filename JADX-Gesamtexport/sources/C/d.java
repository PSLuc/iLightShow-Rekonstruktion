package C;

import p024e0.q;
import p089q4.v;
import p091r0.A;
import p091r0.i;
import p091r0.j;
import p091r0.u;
import p113v0.E;
import p113v0.G;
import p113v0.H;
import p113v0.N;
import p124x0.AbstractC1105m;
import p124x0.InterfaceC1114w;
import p124x0.k0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC1105m implements InterfaceC1114w, k0, p024e0.c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public D4.a f593w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f594x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final A f595y;

    public d(D4.a aVar) {
        this.f593w = aVar;
        b bVar = new b(this, null);
        i iVar = u.f11534a;
        A a6 = new A(null, null, null, bVar);
        y0(a6);
        this.f595y = a6;
    }

    @Override // p024e0.c
    public final void J(q qVar) {
        this.f594x = qVar.a();
    }

    @Override // p124x0.k0
    public final void X() {
        this.f595y.X();
    }

    @Override // p124x0.InterfaceC1114w
    public final G e(H h6, E e6, long j4) {
        int iH = h6.H(androidx.compose.foundation.text.handwriting.a.f6657a);
        int iH2 = h6.H(androidx.compose.foundation.text.handwriting.a.f6658b);
        int i = iH2 * 2;
        int i3 = iH * 2;
        N nC = e6.c(p081p0.c.w0(i, i3, j4));
        int i6 = nC.i - i3;
        return h6.u(nC.f13137h - i, i6, v.f11238h, new c(nC, iH2, iH, 0));
    }

    @Override // p124x0.k0
    public final void f0(i iVar, j jVar, long j4) {
        this.f595y.f0(iVar, jVar, j4);
    }
}
