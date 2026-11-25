package B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: B.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0011f0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC0011f0 f312h;
    public static final EnumC0011f0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC0011f0 f313j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ EnumC0011f0[] f314k;

    static {
        EnumC0011f0 enumC0011f0 = new EnumC0011f0("None", 0);
        f312h = enumC0011f0;
        EnumC0011f0 enumC0011f1 = new EnumC0011f0("Selection", 1);
        i = enumC0011f1;
        EnumC0011f0 enumC0011f2 = new EnumC0011f0("Cursor", 2);
        f313j = enumC0011f2;
        f314k = new EnumC0011f0[]{enumC0011f0, enumC0011f1, enumC0011f2};
    }

    public static EnumC0011f0 valueOf(String str) {
        return (EnumC0011f0) Enum.valueOf(EnumC0011f0.class, str);
    }

    public static EnumC0011f0[] values() {
        return (EnumC0011f0[]) f314k.clone();
    }
}
