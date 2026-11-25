package Y2;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f5867l = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f5868h = new AtomicBoolean();
    public final AtomicBoolean i = new AtomicBoolean();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f5869j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5870k = false;

    public final void a(boolean z5) {
        synchronized (f5867l) {
            try {
                ArrayList arrayList = this.f5869j;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    p038g3.d dVar = ((f) obj).f5889a.f5886m;
                    dVar.sendMessage(dVar.obtainMessage(1, Boolean.valueOf(z5)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.i;
        boolean zCompareAndSet = this.f5868h.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            a(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.i;
        boolean zCompareAndSet = this.f5868h.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            a(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f5868h.compareAndSet(false, true)) {
            this.i.set(true);
            a(true);
        }
    }
}
