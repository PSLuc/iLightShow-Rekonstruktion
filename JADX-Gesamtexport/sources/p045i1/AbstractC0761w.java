package p045i1;

import android.view.View;
import com.nanjoran.ilightshow.R;
import java.util.Objects;
import p054k1.a;
import p080p.E;

/* JADX INFO: renamed from: i1.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0761w {
    public static void a(View view, InterfaceC0764z interfaceC0764z) {
        E e6 = (E) view.getTag(R.id.tag_unhandled_key_listeners);
        if (e6 == null) {
            e6 = new E(0);
            view.setTag(R.id.tag_unhandled_key_listeners, e6);
        }
        Objects.requireNonNull(interfaceC0764z);
        View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC0760v = new ViewOnUnhandledKeyEventListenerC0760v();
        e6.put(interfaceC0764z, viewOnUnhandledKeyEventListenerC0760v);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC0760v);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, InterfaceC0764z interfaceC0764z) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        E e6 = (E) view.getTag(R.id.tag_unhandled_key_listeners);
        if (e6 == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) e6.get(interfaceC0764z)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i) {
        return (T) view.requireViewById(i);
    }

    public static void g(View view, boolean z5) {
        view.setAccessibilityHeading(z5);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, a aVar) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z5) {
        view.setScreenReaderFocusable(z5);
    }
}
