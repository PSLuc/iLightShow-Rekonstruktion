package androidx.compose.animation;

import E4.k;
import Z.n;
import p090r.F;
import p090r.G;
import p090r.H;
import p090r.y;
import p096s.j0;
import p096s.o0;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class EnterExitTransitionElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f6553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f6554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f6555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0 f6556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final G f6557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final H f6558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final D4.a f6559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y f6560h;

    public EnterExitTransitionElement(o0 o0Var, j0 j0Var, j0 j0Var2, j0 j0Var3, G g6, H h6, D4.a aVar, y yVar) {
        this.f6553a = o0Var;
        this.f6554b = j0Var;
        this.f6555c = j0Var2;
        this.f6556d = j0Var3;
        this.f6557e = g6;
        this.f6558f = h6;
        this.f6559g = aVar;
        this.f6560h = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return k.a(this.f6553a, enterExitTransitionElement.f6553a) && k.a(this.f6554b, enterExitTransitionElement.f6554b) && k.a(this.f6555c, enterExitTransitionElement.f6555c) && k.a(this.f6556d, enterExitTransitionElement.f6556d) && k.a(this.f6557e, enterExitTransitionElement.f6557e) && k.a(this.f6558f, enterExitTransitionElement.f6558f) && k.a(this.f6559g, enterExitTransitionElement.f6559g) && k.a(this.f6560h, enterExitTransitionElement.f6560h);
    }

    public final int hashCode() {
        int iHashCode = this.f6553a.hashCode() * 31;
        j0 j0Var = this.f6554b;
        int iHashCode2 = (iHashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        j0 j0Var2 = this.f6555c;
        int iHashCode3 = (iHashCode2 + (j0Var2 == null ? 0 : j0Var2.hashCode())) * 31;
        j0 j0Var3 = this.f6556d;
        return this.f6560h.hashCode() + ((this.f6559g.hashCode() + ((this.f6558f.f11378a.hashCode() + ((this.f6557e.f11375a.hashCode() + ((iHashCode3 + (j0Var3 != null ? j0Var3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // p124x0.Q
    public final n l() {
        return new F(this.f6553a, this.f6554b, this.f6555c, this.f6556d, this.f6557e, this.f6558f, this.f6559g, this.f6560h);
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        F f6 = (F) nVar;
        f6.f11368u = this.f6553a;
        f6.f11369v = this.f6554b;
        f6.f11370w = this.f6555c;
        f6.f11371x = this.f6556d;
        f6.f11372y = this.f6557e;
        f6.f11373z = this.f6558f;
        f6.f11362A = this.f6559g;
        f6.f11363B = this.f6560h;
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f6553a + ", sizeAnimation=" + this.f6554b + ", offsetAnimation=" + this.f6555c + ", slideAnimation=" + this.f6556d + ", enter=" + this.f6557e + ", exit=" + this.f6558f + ", isEnabled=" + this.f6559g + ", graphicsLayerBlock=" + this.f6560h + ')';
    }
}
