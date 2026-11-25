package Y0;

import android.app.Notification;
import android.app.Service;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static void a(Service service, int i, Notification notification, int i3) {
        if (i3 == 0 || i3 == -1) {
            service.startForeground(i, notification, i3);
        } else {
            service.startForeground(i, notification, i3 & 255);
        }
    }
}
