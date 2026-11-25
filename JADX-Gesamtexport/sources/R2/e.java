package R2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f4772h;
    public static final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f4773j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ e[] f4774k;

    static {
        e eVar = new e("NETWORK_UNMETERED", 0);
        f4772h = eVar;
        e eVar2 = new e("DEVICE_IDLE", 1);
        i = eVar2;
        e eVar3 = new e("DEVICE_CHARGING", 2);
        f4773j = eVar3;
        f4774k = new e[]{eVar, eVar2, eVar3};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f4774k.clone();
    }
}
