package com.android.billingclient.api;

import O1.C0313f;
import O1.g;
import O1.y;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.AbstractC0602x;
import com.google.android.gms.internal.play_billing.k1;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ResultReceiver f7517h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7518j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7519k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f7520l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7521m;

    public static int a(int i, Intent intent) {
        if (intent != null) {
            if (intent.getExtras() == null) {
                return 22;
            }
            return i == 5 ? 139 : 1;
        }
        if (i == -1) {
            return 113;
        }
        if (i == 0) {
            return 114;
        }
        if (i != 3) {
            return i != 4 ? 117 : 116;
        }
        return 115;
    }

    public final Intent b(int i, long j4) {
        Intent intentC = c();
        intentC.putExtra("RESPONSE_CODE", 6);
        intentC.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        C0313f c0313fA = g.a();
        c0313fA.f4490a = 6;
        c0313fA.f4492c = "An internal error occurred.";
        g gVarA = c0313fA.a();
        int i3 = y.f4542a;
        intentC.putExtra("FAILURE_LOGGING_PAYLOAD", y.b(i, 2, gVarA, null, k1.BROADCAST_ACTION_UNSPECIFIED).b());
        intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentC.putExtra("billingClientTransactionId", j4);
        intentC.putExtra("wasServiceAutoReconnected", this.f7521m);
        return intentC;
    }

    public final Intent c() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a A[PHI: r10
  0x005a: PHI (r10v1 int) = (r10v0 int), (r10v13 int) binds: [B:28:0x0055, B:30:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:40:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:6:0x0012  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // android.app.Activity
    public final void onActivityResult(int i, int i3, Intent intent) {
        boolean z5;
        int i6;
        int i7;
        String string;
        Intent intentC;
        Bundle extras;
        int i8;
        super.onActivityResult(i, i3, intent);
        if (i == 100) {
            if (intent == null) {
                z5 = false;
            } else {
                z5 = true;
            }
            i6 = AbstractC0602x.e(intent, "ProxyBillingActivity").f4493a;
            i7 = -1;
            if (i3 != -1) {
                Log.isLoggable("ProxyBillingActivity", 5);
                i7 = i3;
            } else if (i6 != 0) {
                i3 = -1;
                Log.isLoggable("ProxyBillingActivity", 5);
                i7 = i3;
            }
            if (true == z5) {
                Log.isLoggable("ProxyBillingActivity", 5);
            } else {
                Log.isLoggable("ProxyBillingActivity", 5);
            }
            if (AbstractC0916i.b(a(i7, intent), 1)) {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    Intent intent2 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intent2.setPackage(getApplicationContext().getPackageName());
                    intent2.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intent2.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentC = intent2;
                } else {
                    intentC = c();
                    intentC.putExtras(intent.getExtras());
                    intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentC.putExtra("billingClientTransactionId", this.f7520l);
                intentC.putExtra("wasServiceAutoReconnected", this.f7521m);
            } else {
                intentC = b(a(i7, intent), this.f7520l);
            }
            if (i == 110) {
                intentC.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentC);
        } else if (i == 110) {
            if (intent == null) {
                z5 = false;
            } else {
                z5 = true;
            }
            i6 = AbstractC0602x.e(intent, "ProxyBillingActivity").f4493a;
            i7 = -1;
            if (i3 != -1) {
                Log.isLoggable("ProxyBillingActivity", 5);
                i7 = i3;
            } else if (i6 != 0) {
                i3 = -1;
                Log.isLoggable("ProxyBillingActivity", 5);
                i7 = i3;
            }
            if (true == z5 || intent.getExtras() == null) {
                Log.isLoggable("ProxyBillingActivity", 5);
            }
            if (AbstractC0916i.b(a(i7, intent), 1)) {
                intentC = b(a(i7, intent), this.f7520l);
            } else {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    Intent intent3 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intent3.setPackage(getApplicationContext().getPackageName());
                    intent3.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intent3.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentC = intent3;
                } else {
                    intentC = c();
                    intentC.putExtras(intent.getExtras());
                    intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentC.putExtra("billingClientTransactionId", this.f7520l);
                intentC.putExtra("wasServiceAutoReconnected", this.f7521m);
            }
            if (i == 110) {
                intentC.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentC);
        } else if (i == 101) {
            int i9 = AbstractC0602x.f8015a;
            if (intent == null || (extras = intent.getExtras()) == null) {
                Log.isLoggable("ProxyBillingActivity", 5);
                i8 = 0;
            } else {
                i8 = extras.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
            }
            ResultReceiver resultReceiver = this.f7517h;
            if (resultReceiver != null) {
                resultReceiver.send(i8, intent == null ? null : intent.getExtras());
            }
        } else {
            int i10 = AbstractC0602x.f8015a;
            Log.isLoggable("ProxyBillingActivity", 5);
        }
        this.i = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            AbstractC0602x.g("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.i = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f7517h = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f7518j = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f7519k = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.f7520l = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f7521m = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        AbstractC0602x.g("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f7519k = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f7518j = true;
                this.f7519k = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f7517h = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f7519k = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.f7520l = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f7521m = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.i = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f7519k, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException unused) {
            AbstractC0602x.h("ProxyBillingActivity");
            ResultReceiver resultReceiver = this.f7517h;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent intentB = b(137, this.f7520l);
                if (this.f7518j) {
                    intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentB);
            }
            this.i = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.i) {
            Intent intentC = c();
            intentC.putExtra("RESPONSE_CODE", 1);
            intentC.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.f7518j) {
                intentC.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i = this.f7519k;
            if (i == 110 || i == 100) {
                intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentC.putExtra("billingClientTransactionId", this.f7520l);
            }
            sendBroadcast(intentC);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f7517h;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.i);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f7518j);
        bundle.putInt("activity_code", this.f7519k);
        bundle.putLong("billingClientTransactionId", this.f7520l);
        bundle.putBoolean("wasServiceAutoReconnected", this.f7521m);
    }
}
