package S1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: S1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0352n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC0352n f4954h;
    public static final EnumC0352n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC0352n f4955j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC0352n f4956k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ EnumC0352n[] f4957l;

    static {
        EnumC0352n enumC0352n = new EnumC0352n("ACCEPT_SINGLE_VALUE_AS_ARRAY", 0);
        f4954h = enumC0352n;
        EnumC0352n enumC0352n2 = new EnumC0352n("ACCEPT_CASE_INSENSITIVE_PROPERTIES", 1);
        i = enumC0352n2;
        EnumC0352n enumC0352n3 = new EnumC0352n("ACCEPT_CASE_INSENSITIVE_VALUES", 2);
        EnumC0352n enumC0352n4 = new EnumC0352n("WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS", 3);
        EnumC0352n enumC0352n5 = new EnumC0352n("WRITE_DATES_WITH_ZONE_ID", 4);
        EnumC0352n enumC0352n6 = new EnumC0352n("WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED", 5);
        f4955j = enumC0352n6;
        EnumC0352n enumC0352n7 = new EnumC0352n("WRITE_SORTED_MAP_ENTRIES", 6);
        f4956k = enumC0352n7;
        f4957l = new EnumC0352n[]{enumC0352n, enumC0352n2, enumC0352n3, enumC0352n4, enumC0352n5, enumC0352n6, enumC0352n7, new EnumC0352n("ADJUST_DATES_TO_CONTEXT_TIME_ZONE", 7)};
    }

    public static EnumC0352n valueOf(String str) {
        return (EnumC0352n) Enum.valueOf(EnumC0352n.class, str);
    }

    public static EnumC0352n[] values() {
        return (EnumC0352n[]) f4957l.clone();
    }
}
