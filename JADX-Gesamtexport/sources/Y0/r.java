package Y0;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationManager f5811a;

    static {
        new HashSet();
    }

    public r(Context context) {
        this.f5811a = (NotificationManager) context.getSystemService("notification");
    }
}
