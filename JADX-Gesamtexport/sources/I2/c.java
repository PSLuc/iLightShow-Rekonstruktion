package I2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f1854h;
    public static final c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f1855j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ c[] f1856k;

    static {
        c cVar = new c("DEFAULT", 0);
        f1854h = cVar;
        c cVar2 = new c("VERY_LOW", 1);
        i = cVar2;
        c cVar3 = new c("HIGHEST", 2);
        f1855j = cVar3;
        f1856k = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f1856k.clone();
    }
}
