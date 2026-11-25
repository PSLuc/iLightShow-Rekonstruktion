package p040h0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f9214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f9215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f9216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f9217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f9218e = 0;

    static {
        long j4 = 3;
        long j6 = j4 << 32;
        f9214a = (((long) 0) & 4294967295L) | j6;
        f9215b = (((long) 1) & 4294967295L) | j6;
        f9216c = j6 | (((long) 2) & 4294967295L);
        f9217d = (j4 & 4294967295L) | (((long) 4) << 32);
    }

    public static final boolean a(long j4, long j6) {
        return j4 == j6;
    }

    public static String b(long j4) {
        if (a(j4, f9214a)) {
            return "Rgb";
        }
        if (a(j4, f9215b)) {
            return "Xyz";
        }
        if (a(j4, f9216c)) {
            return "Lab";
        }
        return a(j4, f9217d) ? "Cmyk" : "Unknown";
    }
}
