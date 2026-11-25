package androidx.compose.ui.draw;

import D4.c;
import E4.k;
import Z.n;
import p019d0.b;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class DrawWithCacheElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f6682a;

    public DrawWithCacheElement(c cVar) {
        this.f6682a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && k.a(this.f6682a, ((DrawWithCacheElement) obj).f6682a);
    }

    public final int hashCode() {
        return this.f6682a.hashCode();
    }

    @Override // p124x0.Q
    public final n l() {
        return new b(new p019d0.c(), this.f6682a);
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        b bVar = (b) nVar;
        bVar.f8570w = this.f6682a;
        bVar.y0();
    }

    public final String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.f6682a + ')';
    }
}
