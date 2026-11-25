package p062m;

import S1.V;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class a extends V {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile a f10400e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10401d;

    public a(int i) {
        switch (i) {
            case 1:
                this.f10401d = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.f10401d = new a(1);
                break;
        }
    }

    public static a R() {
        if (f10400e != null) {
            return f10400e;
        }
        synchronized (a.class) {
            try {
                if (f10400e == null) {
                    f10400e = new a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f10400e;
    }
}
