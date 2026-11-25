package androidx.compose.ui.draw;

import D4.c;
import E4.k;
import Z.n;
import p019d0.d;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class DrawBehindElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f6681a;

    public DrawBehindElement(c cVar) {
        this.f6681a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && k.a(this.f6681a, ((DrawBehindElement) obj).f6681a);
    }

    public final int hashCode() {
        return this.f6681a.hashCode();
    }

    @Override // p124x0.Q
    public final n l() {
        d dVar = new d();
        dVar.f8572u = this.f6681a;
        return dVar;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        ((d) nVar).f8572u = this.f6681a;
    }

    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.f6681a + ')';
    }
}
