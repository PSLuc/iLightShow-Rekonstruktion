package S1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final T f4913h;
    public static final T i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final T f4914j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final T f4915k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final T f4916l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ T[] f4917m;

    static {
        T t6 = new T("PROPERTY", 0);
        f4913h = t6;
        T t7 = new T("WRAPPER_OBJECT", 1);
        i = t7;
        T t8 = new T("WRAPPER_ARRAY", 2);
        f4914j = t8;
        T t9 = new T("EXTERNAL_PROPERTY", 3);
        f4915k = t9;
        T t10 = new T("EXISTING_PROPERTY", 4);
        f4916l = t10;
        f4917m = new T[]{t6, t7, t8, t9, t10};
    }

    public static T valueOf(String str) {
        return (T) Enum.valueOf(T.class, str);
    }

    public static T[] values() {
        return (T[]) f4917m.clone();
    }
}
