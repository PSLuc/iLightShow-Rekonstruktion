package S0;

/* JADX INFO: loaded from: classes.dex */
public final class l implements T0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4899a;

    public l(float f6) {
        this.f4899a = f6;
    }

    @Override // T0.a
    public final float a(float f6) {
        return f6 / this.f4899a;
    }

    @Override // T0.a
    public final float b(float f6) {
        return f6 * this.f4899a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Float.compare(this.f4899a, ((l) obj).f4899a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4899a);
    }

    public final String toString() {
        return p012c.k.t(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f4899a, ')');
    }
}
