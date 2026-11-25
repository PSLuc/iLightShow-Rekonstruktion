package Z;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5949a;

    public f(float f6) {
        this.f5949a = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Float.compare(this.f5949a, ((f) obj).f5949a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5949a);
    }

    public final String toString() {
        return p012c.k.t(new StringBuilder("Vertical(bias="), this.f5949a, ')');
    }
}
