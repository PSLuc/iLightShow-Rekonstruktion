package c5;

/* JADX INFO: renamed from: c5.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0491l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f7464a;

    static {
        boolean z5;
        try {
            Class.forName("java.lang.ClassValue");
            z5 = true;
        } catch (Throwable unused) {
            z5 = false;
        }
        f7464a = z5;
    }
}
