package androidx.compose.foundation.layout;

import E4.k;
import Z.n;
import p123x.O;
import p123x.P;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class PaddingValuesElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O f6622a;

    public PaddingValuesElement(O o6) {
        this.f6622a = o6;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return k.a(this.f6622a, paddingValuesElement.f6622a);
    }

    public final int hashCode() {
        return this.f6622a.hashCode();
    }

    @Override // p124x0.Q
    public final n l() {
        P p6 = new P();
        p6.f13712u = this.f6622a;
        return p6;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        ((P) nVar).f13712u = this.f6622a;
    }
}
