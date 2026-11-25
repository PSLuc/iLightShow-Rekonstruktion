package Y0;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z5) {
        return builder.setAuthenticationRequired(z5);
    }

    public static Notification.Builder b(Notification.Builder builder, int i) {
        return builder.setForegroundServiceBehavior(i);
    }
}
