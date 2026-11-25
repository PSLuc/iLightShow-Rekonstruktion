package p045i1;

import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.nanjoran.ilightshow.R;
import p123x.F;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewTreeObserverOnGlobalLayoutListenerC0756q f9394a = new ViewTreeObserverOnGlobalLayoutListenerC0756q();

    public static void a(View view, C0741b c0741b) {
        if (c0741b == null && (AbstractC0762x.a(view) instanceof C0740a)) {
            c0741b = new C0741b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0741b == null ? null : c0741b.f9442b);
    }

    public static void b(View view, CharSequence charSequence) {
        AbstractC0761w.h(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = f9394a;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC0756q.f9467h.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0756q);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0756q);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC0756q.f9467h.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0756q);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0756q);
            }
        }
    }

    public static void c(View view, F f6) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(f6 != null ? new L(f6) : null);
            return;
        }
        PathInterpolator pathInterpolator = K.f9405d;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (f6 == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener j4 = new J(view, f6);
        view.setTag(R.id.tag_window_insets_animation_callback, j4);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(j4);
        }
    }
}
