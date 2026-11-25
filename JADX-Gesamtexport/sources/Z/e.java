package Z;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5948a;

    public e(float f6) {
        this.f5948a = f6;
    }

    public final int a(int i, S0.k kVar) {
        float f6 = i / 2.0f;
        S0.k kVar2 = S0.k.f4897h;
        float f7 = this.f5948a;
        if (kVar != kVar2) {
            f7 *= -1;
        }
        return Math.round((1 + f7) * f6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Float.compare(this.f5948a, ((e) obj).f5948a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5948a);
    }

    public final String toString() {
        return p012c.k.t(new StringBuilder("Horizontal(bias="), this.f5948a, ')');
    }
}
