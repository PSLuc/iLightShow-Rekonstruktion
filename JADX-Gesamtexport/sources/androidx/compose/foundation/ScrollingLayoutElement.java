package androidx.compose.foundation;

import E4.k;
import Z.n;
import p101t.s0;
import p101t.t0;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollingLayoutElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f6584a;

    public ScrollingLayoutElement(s0 s0Var) {
        this.f6584a = s0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ScrollingLayoutElement) {
            return k.a(this.f6584a, ((ScrollingLayoutElement) obj).f6584a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + p012c.k.m(false, this.f6584a.hashCode() * 31, 31);
    }

    @Override // p124x0.Q
    public final n l() {
        t0 t0Var = new t0();
        t0Var.f12430u = this.f6584a;
        t0Var.f12431v = true;
        return t0Var;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        t0 t0Var = (t0) nVar;
        t0Var.f12430u = this.f6584a;
        t0Var.f12431v = true;
    }
}
