package p020d2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f8581h;
    public static final /* synthetic */ h[] i;

    /* JADX INFO: Fake field, exist only in values array */
    h EF0;

    static {
        h hVar = new h("ALWAYS", 0);
        h hVar2 = new h("NON_NULL", 1);
        h hVar3 = new h("NON_DEFAULT", 2);
        h hVar4 = new h("NON_EMPTY", 3);
        h hVar5 = new h("DEFAULT_INCLUSION", 4);
        f8581h = hVar5;
        i = new h[]{hVar, hVar2, hVar3, hVar4, hVar5};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) i.clone();
    }
}
