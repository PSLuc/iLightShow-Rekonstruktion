package Y2;

import D.x;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class k extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f5904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f5905b;

    public k(x xVar) {
        this.f5905b = xVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            Object obj = this.f5905b.f707j;
            throw null;
        }
    }
}
