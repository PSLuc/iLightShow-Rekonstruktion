package androidx.compose.ui.layout;

import D4.c;
import Z.n;
import p113v0.I;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class OnGloballyPositionedElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f6727a;

    public OnGloballyPositionedElement(c cVar) {
        this.f6727a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.f6727a == ((OnGloballyPositionedElement) obj).f6727a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6727a.hashCode();
    }

    @Override // p124x0.Q
    public final n l() {
        I i = new I();
        i.f13132u = this.f6727a;
        return i;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        ((I) nVar).f13132u = this.f6727a;
    }
}
