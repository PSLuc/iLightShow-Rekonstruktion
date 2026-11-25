package p030f0;

import p027e3.a;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8851a;

    public static final boolean a(long j4, long j6) {
        return j4 == j6;
    }

    public static final float b(long j4) {
        if (j4 != 9205357640488583168L) {
            return Float.intBitsToFloat((int) (j4 & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final float c(long j4) {
        if (j4 != 9205357640488583168L) {
            return Math.min(Float.intBitsToFloat((int) ((j4 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j4 & 2147483647L)));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final float d(long j4) {
        if (j4 != 9205357640488583168L) {
            return Float.intBitsToFloat((int) (j4 >> 32));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final boolean e(long j4) {
        if (j4 == 9205357640488583168L) {
            throw new IllegalStateException("Size is unspecified");
        }
        long j6 = j4 & (~((((-9223372034707292160L) & j4) >>> 31) * ((long) (-1))));
        return ((j6 & 4294967295L) & (j6 >>> 32)) == 0;
    }

    public static String f(long j4) {
        if (j4 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + a.B0(d(j4)) + ", " + a.B0(b(j4)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f8851a == ((f) obj).f8851a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8851a);
    }

    public final String toString() {
        return f(this.f8851a);
    }
}
