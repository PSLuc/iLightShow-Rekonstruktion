package p045i1;

import A1.a;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.nanjoran.ilightshow.R;
import p123x.F;
import p123x.b0;

/* JADX INFO: loaded from: classes.dex */
public final class K extends N {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final PathInterpolator f9405d = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f9406e = new a(a.f14c);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final DecelerateInterpolator f9407f = new DecelerateInterpolator();

    public static void d(View view, O o6) {
        F fI = i(view);
        if (fI != null) {
            fI.b(o6);
            if (fI.i == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                d(viewGroup.getChildAt(i), o6);
            }
        }
    }

    public static void e(View view, WindowInsets windowInsets, boolean z5) {
        F fI = i(view);
        if (fI != null) {
            fI.f13680h = windowInsets;
            if (!z5) {
                z5 = true;
                fI.f13682k = true;
                fI.f13683l = true;
                if (fI.i != 0) {
                    z5 = false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), windowInsets, z5);
            }
        }
    }

    public static void f(View view, c0 c0Var) {
        F fI = i(view);
        if (fI != null) {
            b0 b0Var = fI.f13681j;
            b0.a(b0Var, c0Var);
            if (b0Var.f13753r) {
                c0Var = c0.f9451b;
            }
            if (fI.i == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), c0Var);
            }
        }
    }

    public static void g(View view) {
        F fI = i(view);
        if (fI != null) {
            fI.f13682k = false;
            if (fI.i == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i));
            }
        }
    }

    public static WindowInsets h(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static F i(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof J) {
            return ((J) tag).f9403a;
        }
        return null;
    }
}
