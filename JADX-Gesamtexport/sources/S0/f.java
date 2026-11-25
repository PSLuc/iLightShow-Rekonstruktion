package S0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4888a;

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f4888a == ((f) obj).f4888a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4888a);
    }

    public final String toString() {
        long j4 = this.f4888a;
        if (j4 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) e.b(Float.intBitsToFloat((int) (j4 >> 32)))) + ", " + ((Object) e.b(Float.intBitsToFloat((int) (j4 & 4294967295L)))) + ')';
    }
}
