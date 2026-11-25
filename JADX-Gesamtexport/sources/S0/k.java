package S0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k f4897h;
    public static final k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ k[] f4898j;

    static {
        k kVar = new k("Ltr", 0);
        f4897h = kVar;
        k kVar2 = new k("Rtl", 1);
        i = kVar2;
        f4898j = new k[]{kVar, kVar2};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f4898j.clone();
    }
}
