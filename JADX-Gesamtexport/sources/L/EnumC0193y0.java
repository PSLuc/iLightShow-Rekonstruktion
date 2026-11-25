package L;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: L.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0193y0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC0193y0 f2986h;
    public static final EnumC0193y0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC0193y0 f2987j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ EnumC0193y0[] f2988k;

    static {
        EnumC0193y0 enumC0193y0 = new EnumC0193y0("ENDTHUMB", 0);
        f2986h = enumC0193y0;
        EnumC0193y0 enumC0193y1 = new EnumC0193y0("STARTTHUMB", 1);
        i = enumC0193y1;
        EnumC0193y0 enumC0193y2 = new EnumC0193y0("TRACK", 2);
        f2987j = enumC0193y2;
        f2988k = new EnumC0193y0[]{enumC0193y0, enumC0193y1, enumC0193y2};
    }

    public static EnumC0193y0 valueOf(String str) {
        return (EnumC0193y0) Enum.valueOf(EnumC0193y0.class, str);
    }

    public static EnumC0193y0[] values() {
        return (EnumC0193y0[]) f2988k.clone();
    }
}
