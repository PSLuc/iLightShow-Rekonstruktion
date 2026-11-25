package Z0;

import B.AbstractC0013g0;
import Y0.e;
import android.app.AppOpsManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Handler;
import android.os.Process;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        int iMyUid;
        int iC;
        if ((i & 4) == 0 || str != null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1);
        }
        String str2 = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        int iMyPid = Process.myPid();
        int iMyUid2 = Process.myUid();
        String packageName = context.getPackageName();
        byte b6 = -1;
        if (context.checkPermission(str2, iMyPid, iMyUid2) != -1) {
            String strD = Y0.d.d(str2);
            if (strD == null) {
                b6 = 0;
            } else if (packageName != null) {
                iMyUid = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid == iMyUid2 || !Objects.equals(packageName2, packageName)) {
                    iC = Y0.d.c((AppOpsManager) Y0.d.a(context, AppOpsManager.class), strD, packageName);
                } else {
                    AppOpsManager appOpsManagerC = e.c(context);
                    iC = e.a(appOpsManagerC, strD, Binder.getCallingUid(), packageName);
                    if (iC == 0) {
                        iC = e.a(appOpsManagerC, strD, iMyUid2, e.b(context));
                    }
                }
                if (iC == 0) {
                    b6 = 0;
                } else {
                    b6 = -2;
                }
            } else {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid2);
                if (packagesForUid != null && packagesForUid.length > 0) {
                    packageName = packagesForUid[0];
                    iMyUid = Process.myUid();
                    String packageName3 = context.getPackageName();
                    if (iMyUid == iMyUid2) {
                        iC = Y0.d.c((AppOpsManager) Y0.d.a(context, AppOpsManager.class), strD, packageName);
                    } else {
                        iC = Y0.d.c((AppOpsManager) Y0.d.a(context, AppOpsManager.class), strD, packageName);
                    }
                    if (iC == 0) {
                        b6 = 0;
                    } else {
                        b6 = -2;
                    }
                }
            }
        }
        if (b6 == 0) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str2, handler);
        }
        throw new RuntimeException(AbstractC0013g0.i("Permission ", str2, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static ComponentName b(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }
}
