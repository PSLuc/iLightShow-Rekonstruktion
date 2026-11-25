package p049j1;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import p035g0.C0715p;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0715p f9711a;

    public i(C0715p c0715p) {
        this.f9711a = c0715p;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f9711a.n(i, new h(accessibilityNodeInfo), str, bundle);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        h hVarO = this.f9711a.o(i);
        if (hVarO == null) {
            return null;
        }
        return hVarO.f9708a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f9711a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        h hVarP = this.f9711a.p();
        if (hVarP == null) {
            return null;
        }
        return hVarP.f9708a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i3, Bundle bundle) {
        return this.f9711a.w(i, i3, bundle);
    }
}
