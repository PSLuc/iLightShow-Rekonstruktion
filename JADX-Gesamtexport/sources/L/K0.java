package L;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class K0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final K0 f2351h;
    public static final K0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final K0 f2352j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final K0 f2353k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final K0 f2354l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ K0[] f2355m;

    static {
        K0 k3 = new K0("TopBar", 0);
        f2351h = k3;
        K0 k6 = new K0("MainContent", 1);
        i = k6;
        K0 k7 = new K0("Snackbar", 2);
        f2352j = k7;
        K0 k8 = new K0("Fab", 3);
        f2353k = k8;
        K0 k9 = new K0("BottomBar", 4);
        f2354l = k9;
        f2355m = new K0[]{k3, k6, k7, k8, k9};
    }

    public static K0 valueOf(String str) {
        return (K0) Enum.valueOf(K0.class, str);
    }

    public static K0[] values() {
        return (K0[]) f2355m.clone();
    }
}
