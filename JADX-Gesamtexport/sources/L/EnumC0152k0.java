package L;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: L.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0152k0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC0152k0 f2809h;
    public static final EnumC0152k0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC0152k0 f2810j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ EnumC0152k0[] f2811k;

    static {
        EnumC0152k0 enumC0152k0 = new EnumC0152k0("Focused", 0);
        f2809h = enumC0152k0;
        EnumC0152k0 enumC0152k1 = new EnumC0152k0("UnfocusedEmpty", 1);
        i = enumC0152k1;
        EnumC0152k0 enumC0152k2 = new EnumC0152k0("UnfocusedNotEmpty", 2);
        f2810j = enumC0152k2;
        f2811k = new EnumC0152k0[]{enumC0152k0, enumC0152k1, enumC0152k2};
    }

    public static EnumC0152k0 valueOf(String str) {
        return (EnumC0152k0) Enum.valueOf(EnumC0152k0.class, str);
    }

    public static EnumC0152k0[] values() {
        return (EnumC0152k0[]) f2811k.clone();
    }
}
