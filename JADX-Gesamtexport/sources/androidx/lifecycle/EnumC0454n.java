package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0454n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC0454n f6991h;
    public static final EnumC0454n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC0454n f6992j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC0454n f6993k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final EnumC0454n f6994l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ EnumC0454n[] f6995m;

    static {
        EnumC0454n enumC0454n = new EnumC0454n("DESTROYED", 0);
        f6991h = enumC0454n;
        EnumC0454n enumC0454n2 = new EnumC0454n("INITIALIZED", 1);
        i = enumC0454n2;
        EnumC0454n enumC0454n3 = new EnumC0454n("CREATED", 2);
        f6992j = enumC0454n3;
        EnumC0454n enumC0454n4 = new EnumC0454n("STARTED", 3);
        f6993k = enumC0454n4;
        EnumC0454n enumC0454n5 = new EnumC0454n("RESUMED", 4);
        f6994l = enumC0454n5;
        f6995m = new EnumC0454n[]{enumC0454n, enumC0454n2, enumC0454n3, enumC0454n4, enumC0454n5};
    }

    public static EnumC0454n valueOf(String str) {
        return (EnumC0454n) Enum.valueOf(EnumC0454n.class, str);
    }

    public static EnumC0454n[] values() {
        return (EnumC0454n[]) f6995m.clone();
    }
}
