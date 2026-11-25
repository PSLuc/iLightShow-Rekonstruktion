package N;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import c5.C0495p;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3649d;

    public P(int i) {
        switch (i) {
            case 2:
                this.f3648c = new Intent("android.intent.action.VIEW");
                this.f3647b = new W2.g(28);
                this.f3646a = true;
                break;
            default:
                this.f3648c = new Object();
                this.f3647b = new ArrayList();
                this.f3649d = new ArrayList();
                this.f3646a = true;
                break;
        }
    }

    public C0495p a() {
        Intent intent = (Intent) this.f3648c;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f3646a);
        ((W2.g) this.f3647b).getClass();
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i = Build.VERSION.SDK_INT;
        String strA = p074o.b.a();
        if (!TextUtils.isEmpty(strA)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", strA);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i >= 34) {
            if (((ActivityOptions) this.f3649d) == null) {
                this.f3649d = p074o.a.a();
            }
            p074o.c.a((ActivityOptions) this.f3649d, false);
        }
        ActivityOptions activityOptions = (ActivityOptions) this.f3649d;
        return new C0495p(intent, 15, activityOptions != null ? activityOptions.toBundle() : null);
    }
}
