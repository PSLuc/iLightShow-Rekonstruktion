package p012c;

import E4.k;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.fasterxml.jackson.databind.deser.std.d0;
import p020d2.n;
import p045i1.e0;

/* JADX INFO: loaded from: classes.dex */
public class r extends q {
    @Override // p012c.p
    public void a(G g6, G g7, Window window, View view, boolean z5, boolean z6) {
        k.f("statusBarStyle", g6);
        k.f("navigationBarStyle", g7);
        k.f("window", window);
        k.f("view", view);
        d0.B(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        n e0Var = Build.VERSION.SDK_INT >= 30 ? new e0(window) : new p045i1.d0(window);
        e0Var.K(!z5);
        e0Var.J(true ^ z6);
    }
}
