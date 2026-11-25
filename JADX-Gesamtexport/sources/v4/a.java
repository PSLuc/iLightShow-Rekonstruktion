package v4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f13292h;
    public static final a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f13293j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ a[] f13294k;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f13292h = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        i = aVar2;
        a aVar3 = new a("RESUMED", 2);
        f13293j = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f13294k = aVarArr;
        p081p0.c.i0(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f13294k.clone();
    }
}
