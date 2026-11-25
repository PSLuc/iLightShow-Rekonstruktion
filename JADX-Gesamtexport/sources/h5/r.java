package h5;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f9368a;

    static {
        y yVar;
        try {
            Class.forName("java.nio.file.Files");
            yVar = new z();
        } catch (ClassNotFoundException unused) {
            yVar = new y();
        }
        f9368a = yVar;
        String str = C.i;
        String property = System.getProperty("java.io.tmpdir");
        E4.k.e("getProperty(\"java.io.tmpdir\")", property);
        W2.g.k(property, false);
        ClassLoader classLoader = i5.d.class.getClassLoader();
        E4.k.e("ResourceFileSystem::class.java.classLoader", classLoader);
        new i5.d(classLoader);
    }

    public final boolean a(C c6) {
        E4.k.f("path", c6);
        return b(c6) != null;
    }

    public abstract C0739q b(C c6);
}
