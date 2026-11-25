package Q4;

import E4.k;
import S1.V;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import p084p4.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4705a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object objV;
        try {
            objV = new c(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            objV = V.v(th);
        }
        if (objV instanceof j) {
            objV = null;
        }
    }

    public static final Handler a(Looper looper) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        k.d("null cannot be cast to non-null type android.os.Handler", objInvoke);
        return (Handler) objInvoke;
    }
}
