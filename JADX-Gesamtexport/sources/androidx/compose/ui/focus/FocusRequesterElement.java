package androidx.compose.ui.focus;

import E4.k;
import p024e0.n;
import p024e0.p;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class FocusRequesterElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f6697a;

    public FocusRequesterElement(n nVar) {
        this.f6697a = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && k.a(this.f6697a, ((FocusRequesterElement) obj).f6697a);
    }

    public final int hashCode() {
        return this.f6697a.hashCode();
    }

    @Override // p124x0.Q
    public final Z.n l() {
        p pVar = new p();
        pVar.f8669u = this.f6697a;
        return pVar;
    }

    @Override // p124x0.Q
    public final void m(Z.n nVar) {
        p pVar = (p) nVar;
        pVar.f8669u.f8668a.o(pVar);
        n nVar2 = this.f6697a;
        pVar.f8669u = nVar2;
        nVar2.f8668a.c(pVar);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f6697a + ')';
    }
}
