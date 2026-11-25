package androidx.compose.ui.layout;

import E4.k;
import Z.n;
import p113v0.C1034q;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class LayoutIdElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6726a;

    public LayoutIdElement(Object obj) {
        this.f6726a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && k.a(this.f6726a, ((LayoutIdElement) obj).f6726a);
    }

    public final int hashCode() {
        return this.f6726a.hashCode();
    }

    @Override // p124x0.Q
    public final n l() {
        C1034q c1034q = new C1034q();
        c1034q.f13178u = this.f6726a;
        return c1034q;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        ((C1034q) nVar).f13178u = this.f6726a;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.f6726a + ')';
    }
}
