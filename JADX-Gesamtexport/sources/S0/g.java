package S0;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4889a;

    public static final float a(long j4) {
        return Float.intBitsToFloat((int) (j4 & 4294967295L));
    }

    public static final float b(long j4) {
        return Float.intBitsToFloat((int) (j4 >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f4889a == ((g) obj).f4889a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4889a);
    }

    public final String toString() {
        long j4 = this.f4889a;
        if (j4 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) e.b(b(j4))) + " x " + ((Object) e.b(a(j4)));
    }
}
