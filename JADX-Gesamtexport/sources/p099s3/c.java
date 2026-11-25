package p099s3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f12198h;
    public static final /* synthetic */ c[] i;

    static {
        c cVar = new c("DEFAULT", 0);
        f12198h = cVar;
        i = new c[]{cVar, new c("SIGNED", 1), new c("FIXED", 2)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) i.clone();
    }
}
