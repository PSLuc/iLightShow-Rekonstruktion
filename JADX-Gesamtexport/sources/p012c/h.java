package p012c;

import E4.k;
import android.app.Activity;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f7141a = new h();

    public final OnBackInvokedDispatcher a(Activity activity) {
        k.f("activity", activity);
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        k.e("activity.getOnBackInvokedDispatcher()", onBackInvokedDispatcher);
        return onBackInvokedDispatcher;
    }
}
