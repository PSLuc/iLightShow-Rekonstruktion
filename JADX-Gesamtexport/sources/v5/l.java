package v5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ l[] f13347h;

    /* JADX INFO: Fake field, exist only in values array */
    l EF5;

    static {
        l[] lVarArr = {new l("Client", 0), new l("Device", 1)};
        f13347h = lVarArr;
        p081p0.c.i0(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f13347h.clone();
    }
}
