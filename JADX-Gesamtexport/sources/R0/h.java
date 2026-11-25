package R0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f4743h;
    public static final h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ h[] f4744j;

    static {
        h hVar = new h("Ltr", 0);
        f4743h = hVar;
        h hVar2 = new h("Rtl", 1);
        i = hVar2;
        f4744j = new h[]{hVar, hVar2};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f4744j.clone();
    }
}
