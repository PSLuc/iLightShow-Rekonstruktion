package p035g0;

import B.C0005c0;
import D4.c;
import Z.n;
import p089q4.v;
import p113v0.E;
import p113v0.G;
import p113v0.H;
import p113v0.N;
import p124x0.InterfaceC1114w;

/* JADX INFO: renamed from: g0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0711l extends n implements InterfaceC1114w {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f9072u;

    public C0711l(c cVar) {
        this.f9072u = cVar;
    }

    @Override // p124x0.InterfaceC1114w
    public final G e(H h6, E e6, long j4) {
        N nC = e6.c(j4);
        return h6.u(nC.f13137h, nC.i, v.f11238h, new C0005c0(nC, 27, this));
    }

    @Override // Z.n
    public final boolean o0() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f9072u + ')';
    }
}
