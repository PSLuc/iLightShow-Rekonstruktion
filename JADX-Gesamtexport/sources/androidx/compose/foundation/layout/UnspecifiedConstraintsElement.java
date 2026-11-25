package androidx.compose.foundation.layout;

import S0.e;
import Z.n;
import p123x.Y;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f6629b;

    public UnspecifiedConstraintsElement(float f6, float f7) {
        this.f6628a = f6;
        this.f6629b = f7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return e.a(this.f6628a, unspecifiedConstraintsElement.f6628a) && e.a(this.f6629b, unspecifiedConstraintsElement.f6629b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f6629b) + (Float.hashCode(this.f6628a) * 31);
    }

    @Override // p124x0.Q
    public final n l() {
        Y y2 = new Y();
        y2.f13727u = this.f6628a;
        y2.f13728v = this.f6629b;
        return y2;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        Y y2 = (Y) nVar;
        y2.f13727u = this.f6628a;
        y2.f13728v = this.f6629b;
    }
}
