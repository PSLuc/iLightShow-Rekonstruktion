package F1;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final N f1312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final M f1313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final M f1314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final N f1315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final M f1316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final M f1317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final N f1318h;
    public static final M i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final M f1319j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final N f1320k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final M f1321l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final M f1322m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final N f1323n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final M f1324o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final M f1325p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1326a;

    static {
        boolean z5 = false;
        f1312b = new N(z5, 2);
        boolean z6 = true;
        f1313c = new M(z6, 4);
        f1314d = new M(z6, 5);
        f1315e = new N(z5, 3);
        f1316f = new M(z6, 6);
        f1317g = new M(z6, 7);
        f1318h = new N(z5, 1);
        i = new M(z6, 2);
        f1319j = new M(z6, 3);
        f1320k = new N(z5, 0);
        f1321l = new M(z6, 0);
        f1322m = new M(z6, 1);
        f1323n = new N(z6, 4);
        f1324o = new M(z6, 8);
        f1325p = new M(z6, 9);
    }

    public S(boolean z5) {
        this.f1326a = z5;
    }

    public abstract Object a(String str, Bundle bundle);

    public abstract String b();

    public abstract Object c(String str);

    public Object d(String str, Object obj) {
        return c(str);
    }

    public abstract void e(Bundle bundle, String str, Object obj);

    public String f(Object obj) {
        return String.valueOf(obj);
    }

    public final String toString() {
        return b();
    }
}
