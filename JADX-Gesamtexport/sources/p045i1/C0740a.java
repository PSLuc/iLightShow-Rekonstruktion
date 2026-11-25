package p045i1;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.nanjoran.ilightshow.R;
import java.util.Collections;
import java.util.List;
import p035g0.C0715p;
import p049j1.c;
import p049j1.d;
import p049j1.h;

/* JADX INFO: renamed from: i1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0740a extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0741b f9439a;

    public C0740a(C0741b c0741b) {
        this.f9439a = c0741b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f9439a.f9441a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C0715p c0715pA = this.f9439a.a(view);
        if (c0715pA != null) {
            return (AccessibilityNodeProvider) c0715pA.i;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f9439a.b(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        h hVar = new h(accessibilityNodeInfo);
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
        accessibilityNodeInfo.setScreenReaderFocusable(AbstractC0761w.d(view));
        accessibilityNodeInfo.setHeading(AbstractC0761w.c(view));
        accessibilityNodeInfo.setPaneTitle(AbstractC0761w.b(view));
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            tag = AbstractC0763y.b(view);
        } else {
            tag = view.getTag(R.id.tag_state_description);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag;
        if (i >= 30) {
            d.c(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f9439a.c(view, hVar);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            hVar.a((c) list.get(i3));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f9439a.f9441a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f9439a.f9441a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f9439a.d(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.f9439a.f9441a.sendAccessibilityEvent(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f9439a.f9441a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
