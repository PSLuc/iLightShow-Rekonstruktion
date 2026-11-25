package androidx.compose.ui.focus;

import D4.c;
import E4.k;
import Z.n;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class FocusChangedElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f6694a;

    public FocusChangedElement(c cVar) {
        this.f6694a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && k.a(this.f6694a, ((FocusChangedElement) obj).f6694a);
    }

    public final int hashCode() {
        return this.f6694a.hashCode();
    }

    @Override // p124x0.Q
    public final n l() {
        p024e0.a aVar = new p024e0.a();
        aVar.f8638u = this.f6694a;
        return aVar;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        ((p024e0.a) nVar).f8638u = this.f6694a;
    }

    public final String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.f6694a + ')';
    }
}
