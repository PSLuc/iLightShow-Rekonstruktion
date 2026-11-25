package androidx.compose.ui.layout;

import D4.f;
import E4.k;
import Z.n;
import p113v0.C1035s;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class LayoutElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f6725a;

    public LayoutElement(f fVar) {
        this.f6725a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && k.a(this.f6725a, ((LayoutElement) obj).f6725a);
    }

    public final int hashCode() {
        return this.f6725a.hashCode();
    }

    @Override // p124x0.Q
    public final n l() {
        C1035s c1035s = new C1035s();
        c1035s.f13179u = this.f6725a;
        return c1035s;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        ((C1035s) nVar).f13179u = this.f6725a;
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.f6725a + ')';
    }
}
