package p057l;

import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {
    public static boolean a(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }

    public static void b(AbsListView absListView, boolean z5) {
        absListView.setSelectedChildViewEnabled(z5);
    }
}
