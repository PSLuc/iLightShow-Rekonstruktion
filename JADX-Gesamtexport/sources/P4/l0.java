package P4;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f4656a = new ThreadLocal();

    public static L a() {
        ThreadLocal threadLocal = f4656a;
        L l6 = (L) threadLocal.get();
        if (l6 != null) {
            return l6;
        }
        C0317d c0317d = new C0317d(Thread.currentThread());
        threadLocal.set(c0317d);
        return c0317d;
    }
}
