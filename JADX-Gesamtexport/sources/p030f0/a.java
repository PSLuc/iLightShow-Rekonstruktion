package p030f0;

import p020d2.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f8831a = n.a(0.0f, 0.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8832b = 0;

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
        if (b(j4) == c(j4)) {
            return "CornerRadius.circular(" + p027e3.a.B0(b(j4)) + ')';
        }
        return "CornerRadius.elliptical(" + p027e3.a.B0(b(j4)) + ", " + p027e3.a.B0(c(j4)) + ')';
    }
}
