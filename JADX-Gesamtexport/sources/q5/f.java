package q5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f11266h;
    public static final f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f f11267j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f f11268k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ f[] f11269l;

    static {
        f fVar = new f("NULL", 0);
        f11266h = fVar;
        f fVar2 = new f("DHE_DSS", 1);
        f fVar3 = new f("DHE_RSA", 2);
        f fVar4 = new f("DH_ANON", 3);
        f fVar5 = new f("RSA", 4);
        f fVar6 = new f("DH_DSS", 5);
        f fVar7 = new f("DH_RSA", 6);
        f fVar8 = new f("PSK", 7);
        i = fVar8;
        f fVar9 = new f("ECDHE_PSK", 8);
        f11267j = fVar9;
        f fVar10 = new f("EC_DIFFIE_HELLMAN", 9);
        f11268k = fVar10;
        f11269l = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f11269l.clone();
    }
}
