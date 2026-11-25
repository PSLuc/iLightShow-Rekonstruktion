package S0;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4903a;

    public static final boolean a(long j4, long j6) {
        return j4 == j6;
    }

    public static String b(long j4) {
        if (a(j4, 0L)) {
            return "Unspecified";
        }
        if (a(j4, 4294967296L)) {
            return "Sp";
        }
        return a(j4, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f4903a == ((n) obj).f4903a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4903a);
    }

    public final String toString() {
        return b(this.f4903a);
    }
}
