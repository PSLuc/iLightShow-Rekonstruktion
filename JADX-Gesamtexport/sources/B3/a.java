package B3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f540h;
    public static final a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f541j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ a[] f542k;

    static {
        a aVar = new a("trackTooLong", 0);
        f540h = aVar;
        a aVar2 = new a("serverError", 1);
        i = aVar2;
        a aVar3 = new a("missingTrackDetails", 2);
        f541j = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3, new a("tooManyRequests", 3)};
        f542k = aVarArr;
        p081p0.c.i0(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f542k.clone();
    }
}
