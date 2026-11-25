package p045i1;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {
    public static boolean a(ViewParent viewParent, View view, float f6, float f7, boolean z5) {
        return viewParent.onNestedFling(view, f6, f7, z5);
    }

    public static boolean b(ViewParent viewParent, View view, float f6, float f7) {
        return viewParent.onNestedPreFling(view, f6, f7);
    }

    public static void c(ViewParent viewParent, View view, int i, int i3, int[] iArr) {
        viewParent.onNestedPreScroll(view, i, i3, iArr);
    }

    public static void d(ViewParent viewParent, View view, int i, int i3, int i6, int i7) {
        viewParent.onNestedScroll(view, i, i3, i6, i7);
    }

    public static void e(ViewParent viewParent, View view, View view2, int i) {
        viewParent.onNestedScrollAccepted(view, view2, i);
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i) {
        return viewParent.onStartNestedScroll(view, view2, i);
    }

    public static void g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
