package androidx.compose.foundation;

import E4.k;
import Z.n;
import p101t.p0;
import p101t.s0;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class ScrollSemanticsElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f6583a;

    public ScrollSemanticsElement(s0 s0Var) {
        this.f6583a = s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScrollSemanticsElement) {
            return k.a(this.f6583a, ((ScrollSemanticsElement) obj).f6583a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + p012c.k.m(true, p012c.k.m(false, this.f6583a.hashCode() * 31, 961), 31);
    }

    @Override // p124x0.Q
    public final n l() {
        p0 p0Var = new p0();
        p0Var.f12397u = this.f6583a;
        p0Var.f12398v = true;
        return p0Var;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        p0 p0Var = (p0) nVar;
        p0Var.f12397u = this.f6583a;
        p0Var.f12398v = true;
    }

    public final String toString() {
        return "ScrollSemanticsElement(state=" + this.f6583a + ", reverseScrolling=false, flingBehavior=null, isScrollable=true, isVertical=true)";
    }
}
