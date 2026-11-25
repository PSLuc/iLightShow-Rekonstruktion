package androidx.compose.ui.graphics;

import D4.c;
import E4.k;
import Z.n;
import p035g0.C0711l;
import p124x0.AbstractC1098f;
import p124x0.Q;
import p124x0.Y;

/* JADX INFO: loaded from: classes.dex */
final class BlockGraphicsLayerElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f6707a;

    public BlockGraphicsLayerElement(c cVar) {
        this.f6707a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && k.a(this.f6707a, ((BlockGraphicsLayerElement) obj).f6707a);
    }

    public final int hashCode() {
        return this.f6707a.hashCode();
    }

    @Override // p124x0.Q
    public final n l() {
        return new C0711l(this.f6707a);
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        C0711l c0711l = (C0711l) nVar;
        c0711l.f9072u = this.f6707a;
        Y y2 = AbstractC1098f.q(c0711l, 2).f13990t;
        if (y2 != null) {
            y2.h1(c0711l.f9072u, true);
        }
    }

    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.f6707a + ')';
    }
}
