package androidx.compose.ui.layout;

import D4.c;
import Z.n;
import p015c2.AbstractC0473d;
import p113v0.J;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class OnSizeChangedModifier extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f6728a;

    public OnSizeChangedModifier(c cVar) {
        this.f6728a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.f6728a == ((OnSizeChangedModifier) obj).f6728a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6728a.hashCode();
    }

    @Override // p124x0.Q
    public final n l() {
        J j4 = new J();
        j4.f13133u = this.f6728a;
        j4.f13134v = AbstractC0473d.b(Integer.MIN_VALUE, Integer.MIN_VALUE);
        return j4;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        J j4 = (J) nVar;
        j4.f13133u = this.f6728a;
        j4.f13134v = AbstractC0473d.b(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
