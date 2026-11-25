package L;

import p124x0.AbstractC1098f;
import p124x0.InterfaceC1103k;
import p124x0.InterfaceC1114w;

/* JADX INFO: renamed from: L.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0161n0 extends Z.n implements InterfaceC1103k, InterfaceC1114w {
    @Override // p124x0.InterfaceC1114w
    public final p113v0.G e(p113v0.H h6, p113v0.E e6, long j4) {
        long j6 = AbstractC0155l0.f2823b;
        p113v0.N nC = e6.c(j4);
        boolean z5 = this.f5969t && ((Boolean) AbstractC1098f.h(this, AbstractC0155l0.f2822a)).booleanValue();
        int iMax = z5 ? Math.max(nC.f13137h, h6.H(S0.g.b(j6))) : nC.f13137h;
        int iMax2 = z5 ? Math.max(nC.i, h6.H(S0.g.a(j6))) : nC.i;
        return h6.u(iMax, iMax2, p089q4.v.f11238h, new C.c(iMax, nC, iMax2));
    }
}
