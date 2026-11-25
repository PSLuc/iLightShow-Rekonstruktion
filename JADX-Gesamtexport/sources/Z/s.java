package Z;

import B.C0005c0;
import p089q4.v;
import p113v0.E;
import p113v0.G;
import p113v0.H;
import p113v0.N;
import p124x0.InterfaceC1114w;

/* JADX INFO: loaded from: classes.dex */
public final class s extends n implements InterfaceC1114w {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f5977u;

    @Override // p124x0.InterfaceC1114w
    public final G e(H h6, E e6, long j4) {
        N nC = e6.c(j4);
        return h6.u(nC.f13137h, nC.i, v.f11238h, new C0005c0(nC, 26, this));
    }

    public final String toString() {
        return p012c.k.t(new StringBuilder("ZIndexModifier(zIndex="), this.f5977u, ')');
    }
}
