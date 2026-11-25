package I1;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new i(runnable, 0));
    }
}
