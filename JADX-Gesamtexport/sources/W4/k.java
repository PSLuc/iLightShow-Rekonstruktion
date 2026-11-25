package W4;

import U4.t;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f5631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f5632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f5633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f5634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f5635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f5636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f5637h;

    static {
        String property;
        int i = t.f5379a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f5630a = property;
        f5631b = U4.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i3 = t.f5379a;
        if (i3 < 2) {
            i3 = 2;
        }
        f5632c = U4.a.j(i3, "kotlinx.coroutines.scheduler.core.pool.size", 8);
        f5633d = U4.a.j(2097150, "kotlinx.coroutines.scheduler.max.pool.size", 4);
        f5634e = TimeUnit.SECONDS.toNanos(U4.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f5635f = f.f5625a;
        f5636g = new i(0, false);
        f5637h = new i(1, false);
    }
}
