package S0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f4887h;

    public static final boolean a(float f6, float f7) {
        return Float.compare(f6, f7) == 0;
    }

    public static String b(float f6) {
        if (Float.isNaN(f6)) {
            return "Dp.Unspecified";
        }
        return f6 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f4887h, ((e) obj).f4887h);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return Float.compare(this.f4887h, ((e) obj).f4887h) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4887h);
    }

    public final String toString() {
        return b(this.f4887h);
    }
}
