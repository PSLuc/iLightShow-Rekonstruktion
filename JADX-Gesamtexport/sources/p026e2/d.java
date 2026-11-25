package p026e2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f8691h;
    public static final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f8692j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f8693k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f8694l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f8695m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ d[] f8696n;

    /* JADX INFO: Fake field, exist only in values array */
    d EF0;

    static {
        d dVar = new d("Array", 0);
        d dVar2 = new d("Object", 1);
        d dVar3 = new d("Integer", 2);
        f8691h = dVar3;
        d dVar4 = new d("Float", 3);
        i = dVar4;
        d dVar5 = new d("Boolean", 4);
        f8692j = dVar5;
        d dVar6 = new d("String", 5);
        f8693k = dVar6;
        d dVar7 = new d("Binary", 6);
        d dVar8 = new d("EmptyArray", 7);
        f8694l = dVar8;
        d dVar9 = new d("EmptyObject", 8);
        d dVar10 = new d("EmptyString", 9);
        f8695m = dVar10;
        f8696n = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f8696n.clone();
    }
}
