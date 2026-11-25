package androidx.compose.ui.draw;

import D4.c;
import E4.k;
import Z.n;
import p019d0.f;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class DrawWithContentElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f6683a;

    public DrawWithContentElement(c cVar) {
        this.f6683a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && k.a(this.f6683a, ((DrawWithContentElement) obj).f6683a);
    }

    public final int hashCode() {
        return this.f6683a.hashCode();
    }

    @Override // p124x0.Q
    public final n l() {
        f fVar = new f();
        fVar.f8573u = this.f6683a;
        return fVar;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        ((f) nVar).f8573u = this.f6683a;
    }

    public final String toString() {
        return "DrawWithContentElement(onDraw=" + this.f6683a + ')';
    }
}
