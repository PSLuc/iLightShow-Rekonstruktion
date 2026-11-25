package androidx.compose.ui.input.pointer;

import Z.n;
import p091r0.C0879a;
import p091r0.k;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0879a f6720a;

    public PointerHoverIconModifierElement(C0879a c0879a) {
        this.f6720a = c0879a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PointerHoverIconModifierElement) {
            return this.f6720a.equals(((PointerHoverIconModifierElement) obj).f6720a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f6720a.f11469b * 31);
    }

    @Override // p124x0.Q
    public final n l() {
        C0879a c0879a = this.f6720a;
        k kVar = new k();
        kVar.f11500u = c0879a;
        return kVar;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        k kVar = (k) nVar;
        C0879a c0879a = kVar.f11500u;
        C0879a c0879a2 = this.f6720a;
        if (c0879a.equals(c0879a2)) {
            return;
        }
        kVar.f11500u = c0879a2;
        if (kVar.f11501v) {
            kVar.z0();
        }
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.f6720a + ", overrideDescendants=false)";
    }
}
