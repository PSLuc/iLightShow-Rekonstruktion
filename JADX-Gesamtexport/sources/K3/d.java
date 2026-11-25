package K3;

import Z2.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f2132h;
    public static final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f2133j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f2134k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f2135l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ d[] f2136m;

    static {
        d dVar = new d("huebridge", 0);
        i = dVar;
        d dVar2 = new d("lifxlight", 1);
        f2133j = dVar2;
        d dVar3 = new d("nanoleaf", 2);
        f2134k = dVar3;
        d dVar4 = new d("nanoleafessentials", 3);
        f2135l = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        f2136m = dVarArr;
        p081p0.c.i0(dVarArr);
        f2132h = new f(4, false);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f2136m.clone();
    }

    public final boolean a() {
        return this == f2134k || this == f2135l;
    }
}
