package p045i1;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {
    public static int a(ViewConfiguration viewConfiguration, int i, int i3, int i6) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i3, i6);
    }

    public static int b(ViewConfiguration viewConfiguration, int i, int i3, int i6) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i3, i6);
    }
}
