package p059l2;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f10368h;
    public static final a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f10369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f10370k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final HashMap f10371l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ a[] f10372m;

    static {
        a aVar = new a("STRING", 0);
        f10368h = aVar;
        a aVar2 = new a("NUMBER", 1);
        i = aVar2;
        a aVar3 = new a("INTEGER", 2);
        f10369j = aVar3;
        a aVar4 = new a("BOOLEAN", 3);
        f10370k = aVar4;
        f10372m = new a[]{aVar, aVar2, aVar3, aVar4, new a("OBJECT", 4), new a("ARRAY", 5), new a("NULL", 6), new a("ANY", 7)};
        f10371l = new HashMap();
        for (a aVar5 : values()) {
            f10371l.put(aVar5.name().toLowerCase(), aVar5);
        }
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f10372m.clone();
    }
}
