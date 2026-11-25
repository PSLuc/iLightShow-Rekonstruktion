package A3;

import E4.k;
import J3.e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.nanjoran.ilightshow.MainActivity;
import com.nanjoran.ilightshow.Services.M;

/* JADX INFO: loaded from: classes.dex */
public final class c extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        k.f("context", context);
        k.f("intent", intent);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            Object systemService = context.getSystemService("connectivity");
            k.d("null cannot be cast to non-null type android.net.ConnectivityManager", systemService);
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo == null || 1 != activeNetworkInfo.getType()) {
                return;
            }
            int i = MainActivity.f8229C;
            int i3 = MainActivity.f8229C;
            e eVar = M.f8305O.f8317c;
            if (eVar != null) {
                eVar.a();
            }
        }
    }
}
