package p020d2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f8582h;
    public static final i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i f8583j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ i[] f8584k;

    static {
        i iVar = new i("DYNAMIC", 0);
        f8582h = iVar;
        i iVar2 = new i("STATIC", 1);
        i = iVar2;
        i iVar3 = new i("DEFAULT_TYPING", 2);
        f8583j = iVar3;
        f8584k = new i[]{iVar, iVar2, iVar3};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f8584k.clone();
    }
}
