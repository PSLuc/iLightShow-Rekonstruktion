package p112v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final W f12920h;
    public static final W i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ W[] f12921j;

    static {
        W w6 = new W("Vertical", 0);
        f12920h = w6;
        W w7 = new W("Horizontal", 1);
        i = w7;
        f12921j = new W[]{w6, w7};
    }

    public static W valueOf(String str) {
        return (W) Enum.valueOf(W.class, str);
    }

    public static W[] values() {
        return (W[]) f12921j.clone();
    }
}
