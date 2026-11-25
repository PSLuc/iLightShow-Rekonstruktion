package S1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g0 f4940h;
    public static final g0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ g0[] f4941j;

    static {
        g0 g0Var = new g0("TRUE", 0);
        f4940h = g0Var;
        g0 g0Var2 = new g0("FALSE", 1);
        g0 g0Var3 = new g0("DEFAULT", 2);
        i = g0Var3;
        f4941j = new g0[]{g0Var, g0Var2, g0Var3};
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f4941j.clone();
    }
}
