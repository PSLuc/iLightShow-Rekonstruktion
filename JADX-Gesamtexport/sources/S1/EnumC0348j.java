package S1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: S1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0348j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC0348j f4950h;
    public static final EnumC0348j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC0348j f4951j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC0348j f4952k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ EnumC0348j[] f4953l;

    static {
        EnumC0348j enumC0348j = new EnumC0348j("DEFAULT", 0);
        f4950h = enumC0348j;
        EnumC0348j enumC0348j2 = new EnumC0348j("DELEGATING", 1);
        i = enumC0348j2;
        EnumC0348j enumC0348j3 = new EnumC0348j("PROPERTIES", 2);
        f4951j = enumC0348j3;
        EnumC0348j enumC0348j4 = new EnumC0348j("DISABLED", 3);
        f4952k = enumC0348j4;
        f4953l = new EnumC0348j[]{enumC0348j, enumC0348j2, enumC0348j3, enumC0348j4};
    }

    public static EnumC0348j valueOf(String str) {
        return (EnumC0348j) Enum.valueOf(EnumC0348j.class, str);
    }

    public static EnumC0348j[] values() {
        return (EnumC0348j[]) f4953l.clone();
    }
}
