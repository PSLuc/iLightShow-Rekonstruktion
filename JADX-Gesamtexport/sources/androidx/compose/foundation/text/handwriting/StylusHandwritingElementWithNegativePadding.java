package androidx.compose.foundation.text.handwriting;

import C.d;
import E4.k;
import Z.n;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class StylusHandwritingElementWithNegativePadding extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D4.a f6656a;

    public StylusHandwritingElementWithNegativePadding(D4.a aVar) {
        this.f6656a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElementWithNegativePadding) && k.a(this.f6656a, ((StylusHandwritingElementWithNegativePadding) obj).f6656a);
    }

    public final int hashCode() {
        return this.f6656a.hashCode();
    }

    @Override // p124x0.Q
    public final n l() {
        return new d(this.f6656a);
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        ((d) nVar).f593w = this.f6656a;
    }

    public final String toString() {
        return "StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=" + this.f6656a + ')';
    }
}
