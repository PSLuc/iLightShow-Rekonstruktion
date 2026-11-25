package L;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class P0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final P0 f2452h;
    public static final P0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ P0[] f2453j;

    static {
        P0 p6 = new P0("THUMB", 0);
        f2452h = p6;
        P0 p7 = new P0("TRACK", 1);
        i = p7;
        f2453j = new P0[]{p6, p7};
    }

    public static P0 valueOf(String str) {
        return (P0) Enum.valueOf(P0.class, str);
    }

    public static P0[] values() {
        return (P0[]) f2453j.clone();
    }
}
