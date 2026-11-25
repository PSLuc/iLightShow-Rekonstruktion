package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class A extends AbstractC0447g {
    final /* synthetic */ B this$0;

    public static final class a extends AbstractC0447g {
        final /* synthetic */ B this$0;

        public a(B b6) {
            this.this$0 = b6;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            E4.k.f("activity", activity);
            B b6 = this.this$0;
            int i = b6.i + 1;
            b6.i = i;
            if (i == 1) {
                if (b6.f6941j) {
                    b6.f6944m.d(EnumC0453m.ON_RESUME);
                    b6.f6941j = false;
                } else {
                    Handler handler = b6.f6943l;
                    E4.k.c(handler);
                    handler.removeCallbacks(b6.f6945n);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            E4.k.f("activity", activity);
            B b6 = this.this$0;
            int i = b6.f6940h + 1;
            b6.f6940h = i;
            if (i == 1 && b6.f6942k) {
                b6.f6944m.d(EnumC0453m.ON_START);
                b6.f6942k = false;
            }
        }
    }

    public A(B b6) {
        this.this$0 = b6;
    }

    @Override // androidx.lifecycle.AbstractC0447g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        E4.k.f("activity", activity);
    }

    @Override // androidx.lifecycle.AbstractC0447g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        E4.k.f("activity", activity);
        B b6 = this.this$0;
        int i = b6.i - 1;
        b6.i = i;
        if (i == 0) {
            Handler handler = b6.f6943l;
            E4.k.c(handler);
            handler.postDelayed(b6.f6945n, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        E4.k.f("activity", activity);
        z.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0447g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        E4.k.f("activity", activity);
        B b6 = this.this$0;
        int i = b6.f6940h - 1;
        b6.f6940h = i;
        if (i == 0 && b6.f6941j) {
            b6.f6944m.d(EnumC0453m.ON_STOP);
            b6.f6942k = true;
        }
    }
}
