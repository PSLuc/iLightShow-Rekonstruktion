package L;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b2 f2636h;
    public static final /* synthetic */ b2[] i;

    static {
        b2 b2Var = new b2("Filled", 0);
        f2636h = b2Var;
        i = new b2[]{b2Var, new b2("Outlined", 1)};
    }

    public static b2 valueOf(String str) {
        return (b2) Enum.valueOf(b2.class, str);
    }

    public static b2[] values() {
        return (b2[]) i.clone();
    }
}
