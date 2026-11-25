package O1;

import android.content.Context;
import com.google.android.gms.internal.play_billing.AbstractC0602x;
import com.nanjoran.ilightshow.Services.D0;

/* JADX INFO: renamed from: O1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0309b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile W2.g f4455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f4456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile D0 f4457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f4458d;

    public final boolean a() {
        try {
            Context context = this.f4456b;
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception unused) {
            AbstractC0602x.h("BillingClient");
            return false;
        }
    }
}
