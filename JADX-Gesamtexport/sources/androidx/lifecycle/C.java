package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0453m enumC0453m) {
        C0460u c0460uF;
        E4.k.f("event", enumC0453m);
        if (!(activity instanceof InterfaceC0458s) || (c0460uF = ((InterfaceC0458s) activity).f()) == null) {
            return;
        }
        c0460uF.d(enumC0453m);
    }

    public static void b(Activity activity) {
        E.a.Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new E.a());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new E(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
