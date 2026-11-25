package F0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f1239h;
    public static final a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a[] f1240j;

    static {
        a aVar = new a("On", 0);
        f1239h = aVar;
        a aVar2 = new a("Off", 1);
        i = aVar2;
        f1240j = new a[]{aVar, aVar2, new a("Indeterminate", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f1240j.clone();
    }
}
