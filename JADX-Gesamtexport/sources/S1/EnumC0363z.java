package S1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: S1.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0363z {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC0363z f4983h;
    public static final EnumC0363z i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC0363z f4984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC0363z f4985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final EnumC0363z f4986l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ EnumC0363z[] f4987m;

    static {
        EnumC0363z enumC0363z = new EnumC0363z("ALWAYS", 0);
        f4983h = enumC0363z;
        EnumC0363z enumC0363z2 = new EnumC0363z("NON_NULL", 1);
        i = enumC0363z2;
        EnumC0363z enumC0363z3 = new EnumC0363z("NON_ABSENT", 2);
        EnumC0363z enumC0363z4 = new EnumC0363z("NON_EMPTY", 3);
        f4984j = enumC0363z4;
        EnumC0363z enumC0363z5 = new EnumC0363z("NON_DEFAULT", 4);
        f4985k = enumC0363z5;
        EnumC0363z enumC0363z6 = new EnumC0363z("CUSTOM", 5);
        EnumC0363z enumC0363z7 = new EnumC0363z("USE_DEFAULTS", 6);
        f4986l = enumC0363z7;
        f4987m = new EnumC0363z[]{enumC0363z, enumC0363z2, enumC0363z3, enumC0363z4, enumC0363z5, enumC0363z6, enumC0363z7};
    }

    public static EnumC0363z valueOf(String str) {
        return (EnumC0363z) Enum.valueOf(EnumC0363z.class, str);
    }

    public static EnumC0363z[] values() {
        return (EnumC0363z[]) f4987m.clone();
    }
}
