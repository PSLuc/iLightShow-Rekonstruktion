package T1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f5208h;
    public static final h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f5209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h f5210k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h f5211l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h f5212m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ h[] f5213n;

    static {
        h hVar = new h("INT", 0);
        f5208h = hVar;
        h hVar2 = new h("LONG", 1);
        i = hVar2;
        h hVar3 = new h("BIG_INTEGER", 2);
        f5209j = hVar3;
        h hVar4 = new h("FLOAT", 3);
        f5210k = hVar4;
        h hVar5 = new h("DOUBLE", 4);
        f5211l = hVar5;
        h hVar6 = new h("BIG_DECIMAL", 5);
        f5212m = hVar6;
        f5213n = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f5213n.clone();
    }
}
