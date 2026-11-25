package com.android.billingclient.api;

import E4.k;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.AbstractC0602x;
import g.a;
import p012c.n;
import p029f.b;
import p029f.g;
import p029f.i;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivityV2 extends n {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public g f7522B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public g f7523C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public g f7524D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public g f7525E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ResultReceiver f7526F;
    public ResultReceiver G;
    public ResultReceiver H;
    public ResultReceiver I;

    @Override // p012c.n, android.app.Activity
    public final void onCreate(Bundle bundle) throws Exception {
        super.onCreate(bundle);
        final int i = 0;
        this.f7522B = k(new a(1), new b(this) { // from class: O1.C
            public final /* synthetic */ ProxyBillingActivityV2 i;

            {
                this.i = this;
            }

            @Override // p029f.b
            public final void a(Object obj) {
                Bundle extras;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.i;
                int i3 = i;
                p029f.a aVar = (p029f.a) obj;
                proxyBillingActivityV2.getClass();
                switch (i3) {
                    case 0:
                        Intent intent = aVar.i;
                        int i6 = AbstractC0602x.e(intent, "ProxyBillingActivityV2").f4493a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.f7526F;
                        if (resultReceiver != null) {
                            resultReceiver.send(i6, intent != null ? intent.getExtras() : null);
                        }
                        if (aVar.f8815h != -1 || i6 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 1:
                        Intent intent2 = aVar.i;
                        int i7 = AbstractC0602x.e(intent2, "ProxyBillingActivityV2").f4493a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.G;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i7, intent2 != null ? intent2.getExtras() : null);
                        }
                        if (aVar.f8815h != -1 || i7 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 2:
                        Intent intent3 = aVar.i;
                        extras = intent3 != null ? intent3.getExtras() : null;
                        int i8 = aVar.f8815h;
                        if (i8 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            int i9 = AbstractC0602x.f8015a;
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i8);
                        }
                        int i10 = AbstractC0602x.e(intent3, "ProxyBillingActivityV2").f4493a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV2.H;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i10, extras);
                        } else {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        if (i10 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent4 = aVar.i;
                        extras = intent4 != null ? intent4.getExtras() : null;
                        int i11 = aVar.f8815h;
                        if (i11 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            int i12 = AbstractC0602x.f8015a;
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i11);
                        }
                        int i13 = AbstractC0602x.e(intent4, "ProxyBillingActivityV2").f4493a;
                        ResultReceiver resultReceiver4 = proxyBillingActivityV2.I;
                        if (resultReceiver4 != null) {
                            resultReceiver4.send(i13, extras);
                        } else {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        if (i13 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        });
        final int i3 = 1;
        this.f7523C = k(new a(1), new b(this) { // from class: O1.C
            public final /* synthetic */ ProxyBillingActivityV2 i;

            {
                this.i = this;
            }

            @Override // p029f.b
            public final void a(Object obj) {
                Bundle extras;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.i;
                int i6 = i3;
                p029f.a aVar = (p029f.a) obj;
                proxyBillingActivityV2.getClass();
                switch (i6) {
                    case 0:
                        Intent intent = aVar.i;
                        int i7 = AbstractC0602x.e(intent, "ProxyBillingActivityV2").f4493a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.f7526F;
                        if (resultReceiver != null) {
                            resultReceiver.send(i7, intent != null ? intent.getExtras() : null);
                        }
                        if (aVar.f8815h != -1 || i7 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 1:
                        Intent intent2 = aVar.i;
                        int i8 = AbstractC0602x.e(intent2, "ProxyBillingActivityV2").f4493a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.G;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i8, intent2 != null ? intent2.getExtras() : null);
                        }
                        if (aVar.f8815h != -1 || i8 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 2:
                        Intent intent3 = aVar.i;
                        extras = intent3 != null ? intent3.getExtras() : null;
                        int i9 = aVar.f8815h;
                        if (i9 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            int i10 = AbstractC0602x.f8015a;
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i9);
                        }
                        int i11 = AbstractC0602x.e(intent3, "ProxyBillingActivityV2").f4493a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV2.H;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i11, extras);
                        } else {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        if (i11 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent4 = aVar.i;
                        extras = intent4 != null ? intent4.getExtras() : null;
                        int i12 = aVar.f8815h;
                        if (i12 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            int i13 = AbstractC0602x.f8015a;
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i12);
                        }
                        int i14 = AbstractC0602x.e(intent4, "ProxyBillingActivityV2").f4493a;
                        ResultReceiver resultReceiver4 = proxyBillingActivityV2.I;
                        if (resultReceiver4 != null) {
                            resultReceiver4.send(i14, extras);
                        } else {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        if (i14 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        });
        final int i6 = 2;
        this.f7524D = k(new a(1), new b(this) { // from class: O1.C
            public final /* synthetic */ ProxyBillingActivityV2 i;

            {
                this.i = this;
            }

            @Override // p029f.b
            public final void a(Object obj) {
                Bundle extras;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.i;
                int i7 = i6;
                p029f.a aVar = (p029f.a) obj;
                proxyBillingActivityV2.getClass();
                switch (i7) {
                    case 0:
                        Intent intent = aVar.i;
                        int i8 = AbstractC0602x.e(intent, "ProxyBillingActivityV2").f4493a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.f7526F;
                        if (resultReceiver != null) {
                            resultReceiver.send(i8, intent != null ? intent.getExtras() : null);
                        }
                        if (aVar.f8815h != -1 || i8 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 1:
                        Intent intent2 = aVar.i;
                        int i9 = AbstractC0602x.e(intent2, "ProxyBillingActivityV2").f4493a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.G;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i9, intent2 != null ? intent2.getExtras() : null);
                        }
                        if (aVar.f8815h != -1 || i9 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 2:
                        Intent intent3 = aVar.i;
                        extras = intent3 != null ? intent3.getExtras() : null;
                        int i10 = aVar.f8815h;
                        if (i10 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            int i11 = AbstractC0602x.f8015a;
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i10);
                        }
                        int i12 = AbstractC0602x.e(intent3, "ProxyBillingActivityV2").f4493a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV2.H;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i12, extras);
                        } else {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        if (i12 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent4 = aVar.i;
                        extras = intent4 != null ? intent4.getExtras() : null;
                        int i13 = aVar.f8815h;
                        if (i13 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            int i14 = AbstractC0602x.f8015a;
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i13);
                        }
                        int i15 = AbstractC0602x.e(intent4, "ProxyBillingActivityV2").f4493a;
                        ResultReceiver resultReceiver4 = proxyBillingActivityV2.I;
                        if (resultReceiver4 != null) {
                            resultReceiver4.send(i15, extras);
                        } else {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        if (i15 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        });
        final int i7 = 3;
        this.f7525E = k(new a(1), new b(this) { // from class: O1.C
            public final /* synthetic */ ProxyBillingActivityV2 i;

            {
                this.i = this;
            }

            @Override // p029f.b
            public final void a(Object obj) {
                Bundle extras;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.i;
                int i8 = i7;
                p029f.a aVar = (p029f.a) obj;
                proxyBillingActivityV2.getClass();
                switch (i8) {
                    case 0:
                        Intent intent = aVar.i;
                        int i9 = AbstractC0602x.e(intent, "ProxyBillingActivityV2").f4493a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.f7526F;
                        if (resultReceiver != null) {
                            resultReceiver.send(i9, intent != null ? intent.getExtras() : null);
                        }
                        if (aVar.f8815h != -1 || i9 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 1:
                        Intent intent2 = aVar.i;
                        int i10 = AbstractC0602x.e(intent2, "ProxyBillingActivityV2").f4493a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.G;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i10, intent2 != null ? intent2.getExtras() : null);
                        }
                        if (aVar.f8815h != -1 || i10 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 2:
                        Intent intent3 = aVar.i;
                        extras = intent3 != null ? intent3.getExtras() : null;
                        int i11 = aVar.f8815h;
                        if (i11 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            int i12 = AbstractC0602x.f8015a;
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i11);
                        }
                        int i13 = AbstractC0602x.e(intent3, "ProxyBillingActivityV2").f4493a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV2.H;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i13, extras);
                        } else {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        if (i13 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent4 = aVar.i;
                        extras = intent4 != null ? intent4.getExtras() : null;
                        int i14 = aVar.f8815h;
                        if (i14 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            int i15 = AbstractC0602x.f8015a;
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i14);
                        }
                        int i16 = AbstractC0602x.e(intent4, "ProxyBillingActivityV2").f4493a;
                        ResultReceiver resultReceiver4 = proxyBillingActivityV2.I;
                        if (resultReceiver4 != null) {
                            resultReceiver4.send(i16, extras);
                        } else {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        if (i16 != 0) {
                            Log.isLoggable("ProxyBillingActivityV2", 5);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f7526F = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.G = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.H = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
            }
            if (bundle.containsKey("launch_external_link_result_receiver")) {
                this.I = (ResultReceiver) bundle.getParcelable("launch_external_link_result_receiver");
                return;
            }
            return;
        }
        AbstractC0602x.g("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f7526F = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            g gVar = this.f7522B;
            k.f("pendingIntent", pendingIntent);
            IntentSender intentSender = pendingIntent.getIntentSender();
            k.e("pendingIntent.intentSender", intentSender);
            gVar.R(new i(intentSender, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.G = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            g gVar2 = this.f7523C;
            k.f("pendingIntent", pendingIntent2);
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            k.e("pendingIntent.intentSender", intentSender2);
            gVar2.R(new i(intentSender2, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.H = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            g gVar3 = this.f7524D;
            k.f("pendingIntent", pendingIntent3);
            IntentSender intentSender3 = pendingIntent3.getIntentSender();
            k.e("pendingIntent.intentSender", intentSender3);
            gVar3.R(new i(intentSender3, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("launch_external_link_flow_pending_intent")) {
            PendingIntent pendingIntent4 = (PendingIntent) getIntent().getParcelableExtra("launch_external_link_flow_pending_intent");
            this.I = (ResultReceiver) getIntent().getParcelableExtra("launch_external_link_result_receiver");
            g gVar4 = this.f7525E;
            k.f("pendingIntent", pendingIntent4);
            IntentSender intentSender4 = pendingIntent4.getIntentSender();
            k.e("pendingIntent.intentSender", intentSender4);
            gVar4.R(new i(intentSender4, null, 0, 0));
        }
    }

    @Override // p012c.n, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f7526F;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.G;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.H;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.I;
        if (resultReceiver4 != null) {
            bundle.putParcelable("launch_external_link_result_receiver", resultReceiver4);
        }
    }
}
