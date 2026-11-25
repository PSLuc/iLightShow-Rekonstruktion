package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        E4.k.f("activity", activity);
        E4.k.f("callback", activityLifecycleCallbacks);
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
