package Z2;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzaf;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f6049a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    public static Intent a(Context context, v vVar) throws zzaf {
        Bundle bundleCall;
        String str = vVar.f6061a;
        Intent intent = null;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (vVar.f6063c) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", str);
            try {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f6049a);
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new RemoteException("Failed to acquire ContentProviderClient");
                }
                try {
                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    if (bundleCall != null) {
                        Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                        if (intent2 != null) {
                            intent = intent2;
                        } else {
                            PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                            if (pendingIntent != null) {
                                new StringBuilder(str.length() + 72);
                                throw new zzaf(new W2.a(25, pendingIntent, null));
                            }
                        }
                    }
                    if (intent == null) {
                        "Dynamic lookup for intent failed for action: ".concat(str);
                    }
                } catch (Throwable th) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th;
                }
            } catch (RemoteException | IllegalArgumentException e6) {
                "Dynamic intent resolution failed: ".concat(e6.toString());
                bundleCall = null;
            }
        }
        return intent == null ? new Intent(str).setPackage(vVar.f6062b) : intent;
    }
}
