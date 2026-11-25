package androidx.compose.foundation.layout;

import Z.n;
import p096s.AbstractC0916i;
import p123x.C;
import p124x0.Q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public final class FillElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6611a;

    public FillElement(int i) {
        this.f6611a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FillElement) {
            return this.f6611a == ((FillElement) obj).f6611a;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + (AbstractC0916i.d(this.f6611a) * 31);
    }

    @Override // p124x0.Q
    public final n l() {
        C c6 = new C();
        c6.f13677u = this.f6611a;
        c6.f13678v = 1.0f;
        return c6;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        C c6 = (C) nVar;
        c6.f13677u = this.f6611a;
        c6.f13678v = 1.0f;
    }
}
