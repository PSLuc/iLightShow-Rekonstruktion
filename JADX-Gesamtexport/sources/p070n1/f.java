package p070n1;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import p045i1.C0741b;
import p049j1.c;
import p049j1.h;

/* JADX INFO: loaded from: classes.dex */
public final class f extends C0741b {
    @Override // p045i1.C0741b
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    @Override // p045i1.C0741b
    public final void c(View view, h hVar) {
        int scrollRange;
        View.AccessibilityDelegate accessibilityDelegate = this.f9441a;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f9708a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        hVar.f("android.widget.ScrollView");
        if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
            return;
        }
        accessibilityNodeInfo.setScrollable(true);
        if (nestedScrollView.getScrollY() > 0) {
            hVar.a(c.f9702f);
            hVar.a(c.f9703g);
        }
        if (nestedScrollView.getScrollY() < scrollRange) {
            hVar.a(c.f9701e);
            hVar.a(c.i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    @Override // p045i1.C0741b
    public final boolean d(View view, int i, Bundle bundle) {
        int iMin;
        if (super.d(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (nestedScrollView.isEnabled()) {
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i == 4096) {
                iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (iMin != nestedScrollView.getScrollY()) {
                    nestedScrollView.t(true, 0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY());
                    return true;
                }
            } else if (i == 8192 || i == 16908344) {
                int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (iMax != nestedScrollView.getScrollY()) {
                    nestedScrollView.t(true, 0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY());
                    return true;
                }
            } else if (i == 16908346) {
                iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (iMin != nestedScrollView.getScrollY()) {
                    nestedScrollView.t(true, 0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY());
                    return true;
                }
            }
        }
        return false;
    }
}
