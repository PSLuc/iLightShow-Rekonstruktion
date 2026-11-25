package L;

/* JADX INFO: renamed from: L.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0179t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f2918b = AbstractC0176s1.i(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2919c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2920a;

    public /* synthetic */ C0179t1(long j4) {
        this.f2920a = j4;
    }

    public static final float a(long j4) {
        if (j4 != f2918b) {
            return Float.intBitsToFloat((int) (j4 & 4294967295L));
        }
        throw new IllegalStateException("SliderRange is unspecified");
    }

    public static final float b(long j4) {
        if (j4 != f2918b) {
            return Float.intBitsToFloat((int) (j4 >> 32));
        }
        throw new IllegalStateException("SliderRange is unspecified");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0179t1) {
            return this.f2920a == ((C0179t1) obj).f2920a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2920a);
    }

    public final String toString() {
        float f6 = AbstractC0176s1.f2910b;
        long j4 = f2918b;
        long j6 = this.f2920a;
        if (j6 == j4) {
            return "FloatRange.Unspecified";
        }
        return b(j6) + ".." + a(j6);
    }
}
