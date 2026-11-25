package androidx.compose.foundation.layout;

import Z.n;
import p123x.M;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class OffsetPxElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D4.c f6617a;

    public OffsetPxElement(D4.c cVar) {
        this.f6617a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        return offsetPxElement != null && this.f6617a == offsetPxElement.f6617a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f6617a.hashCode() * 31);
    }

    @Override // p124x0.Q
    public final n l() {
        M m6 = new M();
        m6.f13701u = this.f6617a;
        m6.f13702v = true;
        return m6;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        M m6 = (M) nVar;
        m6.f13701u = this.f6617a;
        m6.f13702v = true;
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.f6617a + ", rtlAware=true)";
    }
}
