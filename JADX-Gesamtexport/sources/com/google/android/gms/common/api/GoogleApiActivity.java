package com.google.android.gms.common.api;

import B.AbstractC0013g0;
import W2.a;
import Y2.c;
import Z2.n;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepName;
import p038g3.d;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7775h = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i3, int i6, Intent intent) {
        super.onActivityResult(i3, i6, intent);
        if (i3 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f7775h = 0;
            setResult(i6, intent);
            if (booleanExtra) {
                c cVarD = c.d(this);
                if (i6 == -1) {
                    d dVar = cVarD.f5886m;
                    dVar.sendMessage(dVar.obtainMessage(3));
                } else if (i6 == 0) {
                    cVarD.e(new a(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i3 == 2) {
            this.f7775h = 0;
            setResult(i6, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f7775h = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f7775h = bundle.getInt("resolution");
        }
        if (this.f7775h == 1) {
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            finish();
            return;
        }
        if (pendingIntent == null) {
            n.b(num);
            W2.d.f5579c.c(this, num.intValue(), this);
            this.f7775h = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.f7775h = 1;
            } catch (ActivityNotFoundException unused) {
                if (extras.getBoolean("notify_manager", true)) {
                    c.d(googleApiActivity).e(new a(22, null, null), googleApiActivity.getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String strI = AbstractC0013g0.i("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        strI.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                }
                googleApiActivity.f7775h = 1;
                googleApiActivity.finish();
            } catch (IntentSender.SendIntentException unused2) {
                googleApiActivity.finish();
            }
        } catch (ActivityNotFoundException unused3) {
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException unused4) {
            googleApiActivity = this;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f7775h);
        super.onSaveInstanceState(bundle);
    }
}
