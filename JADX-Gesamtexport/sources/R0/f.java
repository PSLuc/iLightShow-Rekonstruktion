package R0;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f4737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f4738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f4739c;

    static {
        a(0.0f);
        a(0.5f);
        f4737a = 0.5f;
        a(-1.0f);
        f4738b = -1.0f;
        a(1.0f);
        f4739c = 1.0f;
    }

    public static void a(float f6) {
        if ((0.0f > f6 || f6 > 1.0f) && f6 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }
}
