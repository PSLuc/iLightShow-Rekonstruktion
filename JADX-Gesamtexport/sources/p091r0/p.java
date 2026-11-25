package p091r0;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11507a;

    public static final boolean a(long j4, long j6) {
        return j4 == j6;
    }

    public static String b(long j4) {
        return "PointerId(value=" + j4 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f11507a == ((p) obj).f11507a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11507a);
    }

    public final String toString() {
        return b(this.f11507a);
    }
}
