package p057l;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class U {
    public static int a(PopupWindow popupWindow, View view, int i, boolean z5) {
        return popupWindow.getMaxAvailableHeight(view, i, z5);
    }
}
