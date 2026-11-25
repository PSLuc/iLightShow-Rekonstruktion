package p115v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f13223h;
    public static final g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f13224j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ i[] f13225k;

    static {
        f fVar = new f();
        f13223h = fVar;
        g gVar = new g();
        i = gVar;
        h hVar = new h();
        f13224j = hVar;
        f13225k = new i[]{fVar, gVar, hVar};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f13225k.clone();
    }

    public abstract boolean a(boolean z5);
}
