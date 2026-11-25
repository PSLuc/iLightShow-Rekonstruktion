package p109u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: u2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0962a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC0962a f12677h;
    public static final EnumC0962a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC0962a f12678j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ EnumC0962a[] f12679k;

    static {
        EnumC0962a enumC0962a = new EnumC0962a("ALWAYS_NULL", 0);
        f12677h = enumC0962a;
        EnumC0962a enumC0962a2 = new EnumC0962a("CONSTANT", 1);
        i = enumC0962a2;
        EnumC0962a enumC0962a3 = new EnumC0962a("DYNAMIC", 2);
        f12678j = enumC0962a3;
        f12679k = new EnumC0962a[]{enumC0962a, enumC0962a2, enumC0962a3};
    }

    public static EnumC0962a valueOf(String str) {
        return (EnumC0962a) Enum.valueOf(EnumC0962a.class, str);
    }

    public static EnumC0962a[] values() {
        return (EnumC0962a[]) f12679k.clone();
    }
}
