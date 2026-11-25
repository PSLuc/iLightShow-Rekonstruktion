package p030f0;

import p027e3.a;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8837a;

    public static long a(long j4, float f6, int i) {
        float fIntBitsToFloat = (i & 1) != 0 ? Float.intBitsToFloat((int) (j4 >> 32)) : 0.0f;
        if ((i & 2) != 0) {
            f6 = Float.intBitsToFloat((int) (j4 & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
    }

    public static final boolean b(long j4, long j6) {
        return j4 == j6;
    }

    public static final float c(long j4) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L));
        return (float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat));
    }

    public static final float d(long j4) {
        return Float.intBitsToFloat((int) (j4 >> 32));
    }

    public static final float e(long j4) {
        return Float.intBitsToFloat((int) (j4 & 4294967295L));
    }

    public static final boolean f(long j4) {
        long j6 = j4 & 9223372034707292159L;
        return (((~j6) & (j6 - 9187343246269874177L)) & (-9223372034707292160L)) == -9223372034707292160L;
    }

    public static final long g(long j4, long j6) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32)) - Float.intBitsToFloat((int) (j6 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L)) - Float.intBitsToFloat((int) (j6 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static final long h(long j4, long j6) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) + Float.intBitsToFloat((int) (j4 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j6 & 4294967295L)) + Float.intBitsToFloat((int) (j4 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final long i(float f6, long j4) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32)) * f6;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j4 & 4294967295L)) * f6)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static String j(long j4) {
        if (!p081p0.c.s0(j4)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + a.B0(d(j4)) + ", " + a.B0(e(j4)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f8837a == ((c) obj).f8837a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8837a);
    }

    public final String toString() {
        return j(this.f8837a);
    }
}
