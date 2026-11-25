package p130y0;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E0 f14215a = new E0();

    public final void a(ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    public final ActionMode b(View view, ActionMode.Callback callback, int i) {
        return view.startActionMode(callback, i);
    }
}
