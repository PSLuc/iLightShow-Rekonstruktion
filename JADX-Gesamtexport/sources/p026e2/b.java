package p026e2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f8686h;
    public static final b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f8687j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f8688k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ b[] f8689l;

    static {
        b bVar = new b("Fail", 0);
        f8686h = bVar;
        b bVar2 = new b("TryConvert", 1);
        i = bVar2;
        b bVar3 = new b("AsNull", 2);
        f8687j = bVar3;
        b bVar4 = new b("AsEmpty", 3);
        f8688k = bVar4;
        f8689l = new b[]{bVar, bVar2, bVar3, bVar4};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f8689l.clone();
    }
}
