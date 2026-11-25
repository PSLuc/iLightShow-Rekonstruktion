package B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: B.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0009e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC0009e0 f307h;
    public static final EnumC0009e0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC0009e0 f308j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ EnumC0009e0[] f309k;

    static {
        EnumC0009e0 enumC0009e0 = new EnumC0009e0("Cursor", 0);
        f307h = enumC0009e0;
        EnumC0009e0 enumC0009e1 = new EnumC0009e0("SelectionStart", 1);
        i = enumC0009e1;
        EnumC0009e0 enumC0009e2 = new EnumC0009e0("SelectionEnd", 2);
        f308j = enumC0009e2;
        f309k = new EnumC0009e0[]{enumC0009e0, enumC0009e1, enumC0009e2};
    }

    public static EnumC0009e0 valueOf(String str) {
        return (EnumC0009e0) Enum.valueOf(EnumC0009e0.class, str);
    }

    public static EnumC0009e0[] values() {
        return (EnumC0009e0[]) f309k.clone();
    }
}
