package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class E extends Fragment {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f6946h = 0;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final D Companion = new D();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            E4.k.f("activity", activity);
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            E4.k.f("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            E4.k.f("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            E4.k.f("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            E4.k.f("activity", activity);
            int i = E.f6946h;
            C.a(activity, EnumC0453m.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            E4.k.f("activity", activity);
            int i = E.f6946h;
            C.a(activity, EnumC0453m.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            E4.k.f("activity", activity);
            int i = E.f6946h;
            C.a(activity, EnumC0453m.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            E4.k.f("activity", activity);
            int i = E.f6946h;
            C.a(activity, EnumC0453m.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            E4.k.f("activity", activity);
            int i = E.f6946h;
            C.a(activity, EnumC0453m.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            E4.k.f("activity", activity);
            int i = E.f6946h;
            C.a(activity, EnumC0453m.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            E4.k.f("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            E4.k.f("activity", activity);
            E4.k.f("bundle", bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            E4.k.f("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            E4.k.f("activity", activity);
        }
    }
}
