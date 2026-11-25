package G2;

import N.C0208d;
import N.C0217h0;
import N.U;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.fasterxml.jackson.databind.deser.std.d0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f1679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0217h0 f1680c = C0208d.K(a(), U.f3673m);

    public a(Context context, Activity activity) {
        this.f1678a = context;
        this.f1679b = activity;
    }

    public final e a() {
        boolean zB;
        if (d0.j(this.f1678a, "android.permission.RECORD_AUDIO") == 0) {
            return d.f1683a;
        }
        Activity activity = this.f1679b;
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", "android.permission.RECORD_AUDIO")) {
            zB = false;
        } else if (i >= 32) {
            zB = Y0.c.a(activity, "android.permission.RECORD_AUDIO");
        } else {
            zB = i == 31 ? Y0.b.b(activity, "android.permission.RECORD_AUDIO") : Y0.a.c(activity, "android.permission.RECORD_AUDIO");
        }
        return new c(zB);
    }
}
