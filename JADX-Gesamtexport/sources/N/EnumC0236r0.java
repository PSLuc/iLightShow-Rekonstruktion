package N;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: N.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0236r0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC0236r0 f3785h;
    public static final EnumC0236r0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC0236r0 f3786j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC0236r0 f3787k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final EnumC0236r0 f3788l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final EnumC0236r0 f3789m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ EnumC0236r0[] f3790n;

    static {
        EnumC0236r0 enumC0236r0 = new EnumC0236r0("ShutDown", 0);
        f3785h = enumC0236r0;
        EnumC0236r0 enumC0236r1 = new EnumC0236r0("ShuttingDown", 1);
        i = enumC0236r1;
        EnumC0236r0 enumC0236r2 = new EnumC0236r0("Inactive", 2);
        f3786j = enumC0236r2;
        EnumC0236r0 enumC0236r3 = new EnumC0236r0("InactivePendingWork", 3);
        f3787k = enumC0236r3;
        EnumC0236r0 enumC0236r4 = new EnumC0236r0("Idle", 4);
        f3788l = enumC0236r4;
        EnumC0236r0 enumC0236r5 = new EnumC0236r0("PendingWork", 5);
        f3789m = enumC0236r5;
        f3790n = new EnumC0236r0[]{enumC0236r0, enumC0236r1, enumC0236r2, enumC0236r3, enumC0236r4, enumC0236r5};
    }

    public static EnumC0236r0 valueOf(String str) {
        return (EnumC0236r0) Enum.valueOf(EnumC0236r0.class, str);
    }

    public static EnumC0236r0[] values() {
        return (EnumC0236r0[]) f3790n.clone();
    }
}
