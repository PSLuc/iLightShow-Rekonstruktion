package androidx.compose.foundation.layout;

import Z.n;
import p123x.C1079l;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class AspectRatioElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6608a;

    public AspectRatioElement(float f6) {
        this.f6608a = f6;
        if (f6 > 0.0f) {
            return;
        }
        throw new IllegalArgumentException(("aspectRatio " + f6 + " must be > 0").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        if (aspectRatioElement == null || this.f6608a != aspectRatioElement.f6608a) {
            return false;
        }
        ((AspectRatioElement) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(this.f6608a) * 31);
    }

    @Override // p124x0.Q
    public final n l() {
        C1079l c1079l = new C1079l();
        c1079l.f13783u = this.f6608a;
        return c1079l;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        ((C1079l) nVar).f13783u = this.f6608a;
    }
}
