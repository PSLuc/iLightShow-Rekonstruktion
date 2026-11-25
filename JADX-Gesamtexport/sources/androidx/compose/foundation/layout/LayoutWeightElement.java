package androidx.compose.foundation.layout;

import Z.n;
import p123x.J;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutWeightElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6614b;

    public LayoutWeightElement(float f6, boolean z5) {
        this.f6613a = f6;
        this.f6614b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.f6613a == layoutWeightElement.f6613a && this.f6614b == layoutWeightElement.f6614b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6614b) + (Float.hashCode(this.f6613a) * 31);
    }

    @Override // p124x0.Q
    public final n l() {
        J j4 = new J();
        j4.f13694u = this.f6613a;
        j4.f13695v = this.f6614b;
        return j4;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        J j4 = (J) nVar;
        j4.f13694u = this.f6613a;
        j4.f13695v = this.f6614b;
    }
}
