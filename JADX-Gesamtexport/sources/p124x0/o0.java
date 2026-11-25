package p124x0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o0 f14050h;
    public static final o0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final o0 f14051j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ o0[] f14052k;

    static {
        o0 o0Var = new o0("ContinueTraversal", 0);
        f14050h = o0Var;
        o0 o0Var2 = new o0("SkipSubtreeAndContinueTraversal", 1);
        i = o0Var2;
        o0 o0Var3 = new o0("CancelTraversal", 2);
        f14051j = o0Var3;
        f14052k = new o0[]{o0Var, o0Var2, o0Var3};
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) f14052k.clone();
    }
}
