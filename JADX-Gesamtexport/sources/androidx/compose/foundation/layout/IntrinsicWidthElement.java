package androidx.compose.foundation.layout;

import Z.n;
import p096s.AbstractC0916i;
import p123x.I;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class IntrinsicWidthElement extends Q {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null) != null;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (AbstractC0916i.d(2) * 31);
    }

    @Override // p124x0.Q
    public final n l() {
        I i = new I();
        i.f13692u = 2;
        i.f13693v = true;
        return i;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        I i = (I) nVar;
        i.f13692u = 2;
        i.f13693v = true;
    }
}
