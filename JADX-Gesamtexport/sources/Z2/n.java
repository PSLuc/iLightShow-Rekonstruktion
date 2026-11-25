package Z2;

import B.AbstractC0013g0;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f6046a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f6047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f6048c;

    public static void a(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            AbstractC0013g0.t(sb, "Must be called on ", name2, " thread, but got ", name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void b(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void c(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
