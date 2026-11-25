package S0;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4904a;

    public static long a(long j4, float f6, float f7, int i) {
        if ((i & 1) != 0) {
            f6 = Float.intBitsToFloat((int) (j4 >> 32));
        }
        if ((i & 2) != 0) {
            f7 = Float.intBitsToFloat((int) (j4 & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
    }

    public static final float b(long j4) {
        return Float.intBitsToFloat((int) (j4 >> 32));
    }

    public static final float c(long j4) {
        return Float.intBitsToFloat((int) (j4 & 4294967295L));
    }

    public static final long d(long j4, long j6) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32)) - Float.intBitsToFloat((int) (j6 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L)) - Float.intBitsToFloat((int) (j6 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static final long e(long j4, long j6) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) + Float.intBitsToFloat((int) (j4 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j6 & 4294967295L)) + Float.intBitsToFloat((int) (j4 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final long f(float f6, long j4) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32)) * f6;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j4 & 4294967295L)) * f6)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static String g(long j4) {
        return "(" + b(j4) + ", " + c(j4) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f4904a == ((o) obj).f4904a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4904a);
    }

    public final String toString() {
        return g(this.f4904a);
    }
}
