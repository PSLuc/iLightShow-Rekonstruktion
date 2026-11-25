package p045i1;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.nanjoran.ilightshow.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p035g0.C0715p;
import p049j1.c;
import p049j1.h;

/* JADX INFO: renamed from: i1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0741b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f9440c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f9441a = f9440c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0740a f9442b = new C0740a(this);

    public C0715p a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f9441a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0715p(8, accessibilityNodeProvider);
        }
        return null;
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.f9441a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, h hVar) {
        this.f9441a.onInitializeAccessibilityNodeInfo(view, hVar.f9708a);
    }

    public boolean d(View view, int i, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i3 = 0; i3 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((c) list.get(i3)).f9706a).getId() != i; i3++) {
        }
        boolean zPerformAccessibilityAction = this.f9441a.performAccessibilityAction(view, i, bundle);
        if (zPerformAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i6 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i6)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i7 = 0; clickableSpanArr != null && i7 < clickableSpanArr.length; i7++) {
                if (clickableSpan.equals(clickableSpanArr[i7])) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }
}
