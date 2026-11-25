package p035g0;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f9051b = (((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f9052c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9053a;

    public static final boolean a(long j4, long j6) {
        return j4 == j6;
    }

    public static final float b(long j4) {
        return Float.intBitsToFloat((int) (j4 >> 32));
    }

    public static final float c(long j4) {
        return Float.intBitsToFloat((int) (j4 & 4294967295L));
    }

    public static String d(long j4) {
        return "TransformOrigin(packedValue=" + j4 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof P) {
            return this.f9053a == ((P) obj).f9053a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9053a);
    }

    public final String toString() {
        return d(this.f9053a);
    }
}
