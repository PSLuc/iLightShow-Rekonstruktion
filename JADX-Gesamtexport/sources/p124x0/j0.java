package p124x0;

import E4.k;
import p113v0.G;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements g0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final G f14044h;
    public final M i;

    public j0(G g6, M m6) {
        this.f14044h = g6;
        this.i = m6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return k.a(this.f14044h, j0Var.f14044h) && k.a(this.i, j0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + (this.f14044h.hashCode() * 31);
    }

    public final String toString() {
        return "PlaceableResult(result=" + this.f14044h + ", placeable=" + this.i + ')';
    }

    @Override // p124x0.g0
    public final boolean z() {
        return this.i.s0().K();
    }
}
