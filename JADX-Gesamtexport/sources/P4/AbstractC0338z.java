package P4;

/* JADX INFO: renamed from: P4.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0338z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f4683a;

    static {
        String property;
        A a6;
        int i = U4.t.f5379a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            W4.d dVar = D.f4604a;
            Q4.c cVar = U4.m.f5373a;
            Q4.c cVar2 = cVar.f4704m;
            a6 = cVar;
            if (cVar == null) {
                a6 = RunnableC0337y.f4681q;
            }
        } else {
            a6 = RunnableC0337y.f4681q;
        }
        f4683a = a6;
    }
}
