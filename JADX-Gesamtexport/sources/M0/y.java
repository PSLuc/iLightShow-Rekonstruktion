package M0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final y f3458h;
    public static final y i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final y f3459j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final y f3460k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ y[] f3461l;

    static {
        y yVar = new y("StartInput", 0);
        f3458h = yVar;
        y yVar2 = new y("StopInput", 1);
        i = yVar2;
        y yVar3 = new y("ShowKeyboard", 2);
        f3459j = yVar3;
        y yVar4 = new y("HideKeyboard", 3);
        f3460k = yVar4;
        f3461l = new y[]{yVar, yVar2, yVar3, yVar4};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f3461l.clone();
    }
}
