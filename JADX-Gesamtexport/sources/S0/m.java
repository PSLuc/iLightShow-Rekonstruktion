package S0;

import com.fasterxml.jackson.databind.deser.std.d0;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n[] f4900b = {new n(0), new n(4294967296L), new n(8589934592L)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f4901c = d0.y(Float.NaN, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4902a;

    public static final boolean a(long j4, long j6) {
        return j4 == j6;
    }

    public static final long b(long j4) {
        return f4900b[(int) ((j4 & 1095216660480L) >>> 32)].f4903a;
    }

    public static final float c(long j4) {
        return Float.intBitsToFloat((int) (j4 & 4294967295L));
    }

    public static String d(long j4) {
        long jB = b(j4);
        if (n.a(jB, 0L)) {
            return "Unspecified";
        }
        if (n.a(jB, 4294967296L)) {
            return c(j4) + ".sp";
        }
        if (!n.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j4) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f4902a == ((m) obj).f4902a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4902a);
    }

    public final String toString() {
        return d(this.f4902a);
    }
}
