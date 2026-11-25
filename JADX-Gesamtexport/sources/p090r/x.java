package p090r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x f11448h;
    public static final x i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x f11449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ x[] f11450k;

    static {
        x xVar = new x("PreEnter", 0);
        f11448h = xVar;
        x xVar2 = new x("Visible", 1);
        i = xVar2;
        x xVar3 = new x("PostExit", 2);
        f11449j = xVar3;
        f11450k = new x[]{xVar, xVar2, xVar3};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f11450k.clone();
    }
}
