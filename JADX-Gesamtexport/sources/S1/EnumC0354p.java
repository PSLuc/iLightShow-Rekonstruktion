package S1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: S1.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0354p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC0354p f4961h;
    public static final EnumC0354p i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC0354p f4962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC0354p f4963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final EnumC0354p f4964l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final EnumC0354p f4965m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EnumC0354p f4966n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC0354p f4967o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC0354p f4968p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC0354p f4969q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ EnumC0354p[] f4970r;

    static {
        EnumC0354p enumC0354p = new EnumC0354p("ANY", 0);
        f4961h = enumC0354p;
        EnumC0354p enumC0354p2 = new EnumC0354p("NATURAL", 1);
        i = enumC0354p2;
        EnumC0354p enumC0354p3 = new EnumC0354p("SCALAR", 2);
        f4962j = enumC0354p3;
        EnumC0354p enumC0354p4 = new EnumC0354p("ARRAY", 3);
        f4963k = enumC0354p4;
        EnumC0354p enumC0354p5 = new EnumC0354p("OBJECT", 4);
        f4964l = enumC0354p5;
        EnumC0354p enumC0354p6 = new EnumC0354p("NUMBER", 5);
        f4965m = enumC0354p6;
        EnumC0354p enumC0354p7 = new EnumC0354p("NUMBER_FLOAT", 6);
        f4966n = enumC0354p7;
        EnumC0354p enumC0354p8 = new EnumC0354p("NUMBER_INT", 7);
        f4967o = enumC0354p8;
        EnumC0354p enumC0354p9 = new EnumC0354p("STRING", 8);
        f4968p = enumC0354p9;
        EnumC0354p enumC0354p10 = new EnumC0354p("BOOLEAN", 9);
        EnumC0354p enumC0354p11 = new EnumC0354p("BINARY", 10);
        f4969q = enumC0354p11;
        f4970r = new EnumC0354p[]{enumC0354p, enumC0354p2, enumC0354p3, enumC0354p4, enumC0354p5, enumC0354p6, enumC0354p7, enumC0354p8, enumC0354p9, enumC0354p10, enumC0354p11};
    }

    public static EnumC0354p valueOf(String str) {
        return (EnumC0354p) Enum.valueOf(EnumC0354p.class, str);
    }

    public static EnumC0354p[] values() {
        return (EnumC0354p[]) f4970r.clone();
    }

    public final boolean a() {
        return this == f4965m || this == f4967o || this == f4966n;
    }
}
