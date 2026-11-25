package W3;

import W2.g;
import Z2.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f5599a = new f(15, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5600b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f5601c = new f(14, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f5602d = new g(15);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f5603e = new g(16);

    public static void a(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void b(int i, String str) {
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }
}
