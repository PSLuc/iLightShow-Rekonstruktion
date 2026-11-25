package p045i1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.nanjoran.ilightshow.R;
import p008b1.c;

/* JADX INFO: renamed from: i1.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0758t {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static c0 b(View view, c0 c0Var, Rect rect) {
        WindowInsets windowInsetsA = c0Var.a();
        if (windowInsetsA != null) {
            return c0.b(view, view.computeSystemWindowInsets(windowInsetsA, rect));
        }
        rect.setEmpty();
        return c0Var;
    }

    public static boolean c(View view, float f6, float f7, boolean z5) {
        return view.dispatchNestedFling(f6, f7, z5);
    }

    public static boolean d(View view, float f6, float f7) {
        return view.dispatchNestedPreFling(f6, f7);
    }

    public static boolean e(View view, int i, int i3, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i3, iArr, iArr2);
    }

    public static boolean f(View view, int i, int i3, int i6, int i7, int[] iArr) {
        return view.dispatchNestedScroll(i, i3, i6, i7, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static c0 j(View view) {
        if (!P.f9419d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = P.f9416a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) P.f9417b.get(obj);
            Rect rect2 = (Rect) P.f9418c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            Q s6 = Build.VERSION.SDK_INT >= 30 ? new S() : new Q();
            s6.h(c.b(rect.left, rect.top, rect.right, rect.bottom));
            s6.f(c.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            c0 c0VarB = s6.b();
            c0VarB.f9452a.r(c0VarB);
            c0VarB.f9452a.d(view.getRootView());
            return c0VarB;
        } catch (IllegalAccessException e6) {
            e6.getMessage();
            return null;
        }
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f6) {
        view.setElevation(f6);
    }

    public static void t(View view, boolean z5) {
        view.setNestedScrollingEnabled(z5);
    }

    public static void u(View view, InterfaceC0749j interfaceC0749j) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC0749j);
        }
        if (interfaceC0749j == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0757s(view, interfaceC0749j));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f6) {
        view.setTranslationZ(f6);
    }

    public static void x(View view, float f6) {
        view.setZ(f6);
    }

    public static boolean y(View view, int i) {
        return view.startNestedScroll(i);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
