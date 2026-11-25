package W2;

import D.x;
import Y2.s;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f5578b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f5579c = new d();

    public static AlertDialog d(Activity activity, int i, Z2.k kVar, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(Z2.j.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i == 1) {
            string = resources.getString(com.nanjoran.ilightshow.R.string.common_google_play_services_install_button);
        } else if (i != 2) {
            string = i != 3 ? resources.getString(R.string.ok) : resources.getString(com.nanjoran.ilightshow.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(com.nanjoran.ilightshow.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, kVar);
        }
        String strC = Z2.j.c(activity, i);
        if (strC != null) {
            builder.setTitle(strC);
        }
        new IllegalArgumentException();
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        b bVar = new b();
        Z2.n.c("Cannot display null dialog", alertDialog);
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        bVar.f5573h = alertDialog;
        if (onCancelListener != null) {
            bVar.i = onCancelListener;
        }
        bVar.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogD = d(googleApiActivity, i, new Z2.k(super.a(i, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogD == null) {
            return;
        }
        e(googleApiActivity, alertDialogD, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Context context, int i, PendingIntent pendingIntent) {
        int i3;
        new IllegalArgumentException();
        if (i == 18) {
            new i(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String strE = i == 6 ? Z2.j.e(context, "common_google_play_services_resolution_required_title") : Z2.j.c(context, i);
        if (strE == null) {
            strE = context.getResources().getString(com.nanjoran.ilightshow.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i == 6 || i == 19) ? Z2.j.d(context, "common_google_play_services_resolution_required_text", Z2.j.a(context)) : Z2.j.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        Z2.n.b(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        Y0.h hVar = new Y0.h(context, null);
        hVar.f5805k = true;
        hVar.c(16);
        hVar.f5800e = Y0.h.b(strE);
        x xVar = new x(21, false);
        xVar.f707j = Y0.h.b(strD);
        hVar.d(xVar);
        PackageManager packageManager = context.getPackageManager();
        if (p027e3.a.f8736f == null) {
            p027e3.a.f8736f = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (p027e3.a.f8736f.booleanValue()) {
            hVar.f5809o.icon = context.getApplicationInfo().icon;
            hVar.f5803h = 2;
            if (p027e3.a.m0(context)) {
                hVar.f5797b.add(new Y0.f(resources.getString(com.nanjoran.ilightshow.R.string.common_open_on_phone), pendingIntent));
            } else {
                hVar.f5802g = pendingIntent;
            }
        } else {
            hVar.f5809o.icon = R.drawable.stat_sys_warning;
            hVar.f5809o.tickerText = Y0.h.b(resources.getString(com.nanjoran.ilightshow.R.string.common_google_play_services_notification_ticker));
            hVar.f5809o.when = System.currentTimeMillis();
            hVar.f5802g = pendingIntent;
            hVar.f5801f = Y0.h.b(strD);
        }
        synchronized (f5578b) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.nanjoran.ilightshow.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        hVar.f5807m = "com.google.android.gms.availability";
        Notification notificationA = hVar.a();
        if (i == 1 || i == 2 || i == 3) {
            f.f5581a.set(false);
            i3 = 10436;
        } else {
            i3 = 39789;
        }
        notificationManager.notify(i3, notificationA);
    }

    public final void g(Activity activity, s sVar, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogD = d(activity, i, new Z2.k(super.a(i, activity, "d"), sVar, 1), onCancelListener);
        if (alertDialogD == null) {
            return;
        }
        e(activity, alertDialogD, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
