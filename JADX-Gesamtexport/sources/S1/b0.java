package S1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b0 f4928h;
    public static final b0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b0 f4929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b0 f4930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ b0[] f4931l;

    /* JADX INFO: Fake field, exist only in values array */
    b0 EF0;

    static {
        b0 b0Var = new b0("SET", 0);
        b0 b0Var2 = new b0("SKIP", 1);
        f4928h = b0Var2;
        b0 b0Var3 = new b0("FAIL", 2);
        i = b0Var3;
        b0 b0Var4 = new b0("AS_EMPTY", 3);
        f4929j = b0Var4;
        b0 b0Var5 = new b0("DEFAULT", 4);
        f4930k = b0Var5;
        f4931l = new b0[]{b0Var, b0Var2, b0Var3, b0Var4, b0Var5};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f4931l.clone();
    }
}
