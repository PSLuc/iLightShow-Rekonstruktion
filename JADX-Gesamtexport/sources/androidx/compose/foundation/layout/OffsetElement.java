package androidx.compose.foundation.layout;

import S0.e;
import Z.n;
import p012c.k;
import p123x.L;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class OffsetElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f6616b;

    public OffsetElement(float f6, float f7) {
        this.f6615a = f6;
        this.f6616b = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        return offsetElement != null && e.a(this.f6615a, offsetElement.f6615a) && e.a(this.f6616b, offsetElement.f6616b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + k.i(this.f6616b, Float.hashCode(this.f6615a) * 31, 31);
    }

    @Override // p124x0.Q
    public final n l() {
        L l6 = new L();
        l6.f13698u = this.f6615a;
        l6.f13699v = this.f6616b;
        l6.f13700w = true;
        return l6;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        L l6 = (L) nVar;
        l6.f13698u = this.f6615a;
        l6.f13699v = this.f6616b;
        l6.f13700w = true;
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) e.b(this.f6615a)) + ", y=" + ((Object) e.b(this.f6616b)) + ", rtlAware=true)";
    }
}
