package K;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1979d;

    public g(float f6, float f7, float f8, float f9) {
        this.f1976a = f6;
        this.f1977b = f7;
        this.f1978c = f8;
        this.f1979d = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f1976a == gVar.f1976a && this.f1977b == gVar.f1977b && this.f1978c == gVar.f1978c && this.f1979d == gVar.f1979d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1979d) + p012c.k.i(this.f1978c, p012c.k.i(this.f1977b, Float.hashCode(this.f1976a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.f1976a);
        sb.append(", focusedAlpha=");
        sb.append(this.f1977b);
        sb.append(", hoveredAlpha=");
        sb.append(this.f1978c);
        sb.append(", pressedAlpha=");
        return p012c.k.t(sb, this.f1979d, ')');
    }
}
