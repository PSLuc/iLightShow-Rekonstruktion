package p109u2;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f12713a;

    static {
        f12713a = System.getProperty("org.graalvm.nativeimage.imagecode") != null;
    }

    public static boolean a(Class cls) {
        return (f12713a && "runtime".equals(System.getProperty("org.graalvm.nativeimage.imagecode"))) && (cls.getDeclaredFields().length == 0 || i.x(cls)) && cls.getDeclaredMethods().length == 0 && cls.getDeclaredConstructors().length == 0;
    }
}
