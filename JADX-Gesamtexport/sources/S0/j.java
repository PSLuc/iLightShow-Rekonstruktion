package S0;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4896a;

    public static final boolean a(long j4, long j6) {
        return j4 == j6;
    }

    public static String b(long j4) {
        return ((int) (j4 >> 32)) + " x " + ((int) (j4 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f4896a == ((j) obj).f4896a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4896a);
    }

    public final String toString() {
        return b(this.f4896a);
    }
}
