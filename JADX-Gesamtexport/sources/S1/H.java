package S1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final H f4910h;
    public static final /* synthetic */ H[] i;

    static {
        H h6 = new H("AUTO", 0);
        f4910h = h6;
        i = new H[]{h6, new H("READ_ONLY", 1), new H("WRITE_ONLY", 2), new H("READ_WRITE", 3)};
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) i.clone();
    }
}
