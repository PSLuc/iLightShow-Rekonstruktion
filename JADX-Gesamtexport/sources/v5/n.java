package v5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n f13350h;
    public static final n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n f13351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n f13352k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final n f13353l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final n f13354m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f13355n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final n f13356o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final n f13357p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final n f13358q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final n f13359r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ n[] f13360s;

    static {
        n nVar = new n("Label", 0);
        f13350h = nVar;
        n nVar2 = new n("Color", 1);
        i = nVar2;
        n nVar3 = new n("Power", 2);
        f13351j = nVar3;
        n nVar4 = new n("Reachable", 3);
        f13352k = nVar4;
        n nVar5 = new n("Group", 4);
        f13353l = nVar5;
        n nVar6 = new n("Location", 5);
        f13354m = nVar6;
        n nVar7 = new n("HostFirmware", 6);
        f13355n = nVar7;
        n nVar8 = new n("WifiFirmware", 7);
        f13356o = nVar8;
        n nVar9 = new n("ProductInfo", 8);
        f13357p = nVar9;
        n nVar10 = new n("InfraredBrightness", 9);
        f13358q = nVar10;
        n nVar11 = new n("Zones", 10);
        f13359r = nVar11;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, nVar9, nVar10, nVar11};
        f13360s = nVarArr;
        p081p0.c.i0(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f13360s.clone();
    }
}
