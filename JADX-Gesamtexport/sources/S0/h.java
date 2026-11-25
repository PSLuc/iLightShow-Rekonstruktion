package S0;

import B.AbstractC0013g0;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4890a;

    public static final boolean a(long j4, long j6) {
        return j4 == j6;
    }

    public static final long b(long j4, long j6) {
        return (((long) (((int) (j4 >> 32)) - ((int) (j6 >> 32)))) << 32) | (((long) (((int) (j4 & 4294967295L)) - ((int) (j6 & 4294967295L)))) & 4294967295L);
    }

    public static final long c(long j4, long j6) {
        return (((long) (((int) (j4 >> 32)) + ((int) (j6 >> 32)))) << 32) | (((long) (((int) (j4 & 4294967295L)) + ((int) (j6 & 4294967295L)))) & 4294967295L);
    }

    public static String d(long j4) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j4 >> 32));
        sb.append(", ");
        return AbstractC0013g0.k(sb, (int) (j4 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f4890a == ((h) obj).f4890a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4890a);
    }

    public final String toString() {
        return d(this.f4890a);
    }
}
