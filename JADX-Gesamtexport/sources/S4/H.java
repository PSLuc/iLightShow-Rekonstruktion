package S4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final H f5038h;
    public static final H i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final H f5039j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ H[] f5040k;

    static {
        H h6 = new H("START", 0);
        f5038h = h6;
        H h7 = new H("STOP", 1);
        i = h7;
        H h8 = new H("STOP_AND_RESET_REPLAY_CACHE", 2);
        f5039j = h8;
        f5040k = new H[]{h6, h7, h8};
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) f5040k.clone();
    }
}
