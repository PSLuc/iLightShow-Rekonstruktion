package E4;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f1075a;

    static {
        y yVar = null;
        try {
            yVar = (y) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (yVar == null) {
            yVar = new y();
        }
        f1075a = yVar;
    }

    public static f a(Class cls) {
        f1075a.getClass();
        return new f(cls);
    }
}
