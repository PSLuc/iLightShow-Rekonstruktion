package p045i1;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: i1.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0759u {
    public static c0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        c0 c0VarB = c0.b(null, rootWindowInsets);
        Z z5 = c0VarB.f9452a;
        z5.r(c0VarB);
        z5.d(view.getRootView());
        return c0VarB;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void d(View view, int i, int i3) {
        view.setScrollIndicators(i, i3);
    }
}
