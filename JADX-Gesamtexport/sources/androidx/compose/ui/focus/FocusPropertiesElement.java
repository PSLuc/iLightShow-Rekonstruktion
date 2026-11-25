package androidx.compose.ui.focus;

import Z.n;
import p024e0.h;
import p024e0.k;
import p024e0.m;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class FocusPropertiesElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f6696a;

    public FocusPropertiesElement(k kVar) {
        this.f6696a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && E4.k.a(this.f6696a, ((FocusPropertiesElement) obj).f6696a);
    }

    public final int hashCode() {
        return h.i.hashCode();
    }

    @Override // p124x0.Q
    public final n l() {
        m mVar = new m();
        mVar.f8665u = this.f6696a;
        return mVar;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        ((m) nVar).f8665u = this.f6696a;
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.f6696a + ')';
    }
}
