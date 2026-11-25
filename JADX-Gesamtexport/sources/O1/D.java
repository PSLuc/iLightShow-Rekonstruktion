package O1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.AbstractC0578k0;
import com.google.android.gms.internal.play_billing.AbstractC0591r0;
import com.google.android.gms.internal.play_billing.AbstractC0594t;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.google.android.gms.internal.play_billing.AbstractC0602x;
import com.google.android.gms.internal.play_billing.C0562e1;
import com.google.android.gms.internal.play_billing.C0565f1;
import com.google.android.gms.internal.play_billing.C0568g1;
import com.google.android.gms.internal.play_billing.C0600w;
import com.google.android.gms.internal.play_billing.k1;
import com.google.android.gms.internal.play_billing.m1;
import com.google.android.gms.internal.play_billing.n1;
import com.google.android.gms.internal.play_billing.q1;
import com.google.android.gms.internal.play_billing.t1;
import com.nanjoran.ilightshow.Services.D0;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class D extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E f4443c;

    public D(E e6, boolean z5) {
        Objects.requireNonNull(e6);
        this.f4443c = e6;
        this.f4442b = z5;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f4441a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f4442b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f4441a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(Bundle bundle, g gVar, int i, k1 k1Var, long j4, boolean z5) {
        AbstractC0591r0 abstractC0591r0Q;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
                ((D.x) this.f4443c.f4447d).s(y.b(23, i, gVar, null, k1Var), j4, z5);
                return;
            }
            D.x xVar = (D.x) this.f4443c.f4447d;
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            int i3 = AbstractC0591r0.f7991a;
            synchronized (AbstractC0591r0.class) {
                int i6 = AbstractC0591r0.f7991a;
                int i7 = AbstractC0578k0.f7955a;
                abstractC0591r0Q = AbstractC0599v0.Q();
                int i8 = AbstractC0591r0.f7991a;
            }
            xVar.s(C0562e1.t(byteArray, abstractC0591r0Q), j4, z5);
        } catch (Throwable unused) {
            int i9 = AbstractC0602x.f8015a;
            Log.isLoggable("BillingBroadcastManager", 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:92:0x0214 A[Catch: all -> 0x0237, TryCatch #0 {all -> 0x0237, blocks: (B:90:0x01e0, B:92:0x0214, B:94:0x0233, B:93:0x0219), top: B:100:0x01e0 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0219 A[Catch: all -> 0x0237, TryCatch #0 {all -> 0x0237, blocks: (B:90:0x01e0, B:92:0x0214, B:94:0x0233, B:93:0x0219), top: B:100:0x01e0 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x023d  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        byte b6;
        k1 k1Var;
        g gVarE;
        ArrayList arrayList;
        D.x xVar;
        n1 n1Var;
        int iIntValue;
        String action = intent.getAction();
        int iHashCode = action.hashCode();
        if (iHashCode != -1484087650) {
            if (iHashCode != -337612916) {
                if (iHashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                    b6 = 2;
                } else {
                    b6 = -1;
                }
            } else if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                b6 = 1;
            } else {
                b6 = -1;
            }
        } else if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            b6 = 0;
        } else {
            b6 = -1;
        }
        k1 k1Var2 = k1.LOCAL_PURCHASES_UPDATED_ACTION;
        k1 k1Var3 = k1.PURCHASES_UPDATED_ACTION;
        k1 k1Var4 = k1.ALTERNATIVE_BILLING_ACTION;
        if (b6 == 0) {
            k1Var = k1Var3;
        } else if (b6 != 1) {
            k1Var = b6 != 2 ? k1.BROADCAST_ACTION_UNSPECIFIED : k1Var4;
        } else {
            k1Var = k1Var2;
        }
        int i = (k1Var.equals(k1Var2) || k1Var.equals(k1Var4)) ? 2 : k1Var.equals(k1Var3) ? 32 : 1;
        Bundle extras = intent.getExtras();
        E e6 = this.f4443c;
        if (extras == null) {
            int i3 = AbstractC0602x.f8015a;
            Log.isLoggable("BillingBroadcastManager", 5);
            D.x xVar2 = (D.x) e6.f4447d;
            g gVar = A.f4428h;
            xVar2.q(y.b(11, i, gVar, null, k1Var));
            D0 d1 = (D0) e6.f4446c;
            if (d1 != null) {
                d1.b(gVar, null);
                return;
            }
            return;
        }
        if (i == 2) {
            int i6 = AbstractC0602x.f8015a;
            C0313f c0313fA = g.a();
            c0313fA.f4490a = AbstractC0602x.a("BillingBroadcastManager", intent.getExtras());
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                Log.isLoggable("BillingBroadcastManager", 5);
            } else {
                Object obj = extras2.get("SUB_RESPONSE_CODE");
                if (obj == null) {
                    AbstractC0602x.g("BillingBroadcastManager", "getOnPurchasesUpdatedSubResponseCodeFromBundle() got null response code, assuming OK");
                } else {
                    if (obj instanceof Integer) {
                        iIntValue = ((Integer) obj).intValue();
                    } else {
                        "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName());
                        Log.isLoggable("BillingBroadcastManager", 5);
                    }
                    c0313fA.f4491b = iIntValue;
                    c0313fA.f4492c = AbstractC0602x.f("BillingBroadcastManager", intent.getExtras());
                    gVarE = c0313fA.a();
                }
            }
            iIntValue = 0;
            c0313fA.f4491b = iIntValue;
            c0313fA.f4492c = AbstractC0602x.f("BillingBroadcastManager", intent.getExtras());
            gVarE = c0313fA.a();
        } else {
            gVarE = AbstractC0602x.e(intent, "BillingBroadcastManager");
        }
        long j4 = extras.getLong("billingClientTransactionId", 0L);
        boolean z5 = extras.getBoolean("wasServiceAutoReconnected", false);
        if (!k1Var.equals(k1Var3) && !k1Var.equals(k1Var2)) {
            if (k1Var.equals(k1Var4)) {
                if (gVarE.f4493a != 0) {
                    g gVar2 = gVarE;
                    b(extras, gVar2, i, k1Var, j4, z5);
                    D0 d6 = (D0) e6.f4446c;
                    com.google.android.gms.internal.play_billing.r rVar = AbstractC0594t.i;
                    d6.b(gVar2, C0600w.f8010l);
                    return;
                }
                e6.getClass();
                Log.isLoggable("BillingBroadcastManager", 5);
                g gVar3 = A.f4428h;
                ((D.x) e6.f4447d).s(y.b(77, i, gVar3, null, k1Var), j4, z5);
                com.google.android.gms.internal.play_billing.r rVar2 = AbstractC0594t.i;
                ((D0) e6.f4446c).b(gVar3, C0600w.f8010l);
                return;
            }
            return;
        }
        g gVar4 = gVarE;
        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList2 = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase purchaseI = AbstractC0602x.i(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
            if (purchaseI == null) {
                AbstractC0602x.g("BillingHelper", "Couldn't find single purchase data as well.");
                arrayList = null;
            } else {
                arrayList2.add(purchaseI);
            }
            if (gVar4.f4493a == 0) {
                xVar = (D.x) e6.f4447d;
                C0568g1 c0568g1C = y.c(i, k1Var);
                xVar.getClass();
                try {
                    C0565f1 c0565f1 = (C0565f1) c0568g1C.j();
                    q1 q1Var = (q1) c0568g1C.s().j();
                    q1Var.c();
                    t1.p((t1) q1Var.i, z5);
                    c0565f1.c();
                    C0568g1.o((C0568g1) c0565f1.i, (t1) q1Var.a());
                    C0568g1 c0568g1 = (C0568g1) c0565f1.a();
                    if (j4 == 0) {
                        n1Var = (n1) xVar.i;
                    } else {
                        m1 m1Var = (m1) ((n1) xVar.i).j();
                        m1Var.c();
                        n1.p((n1) m1Var.i, j4);
                        n1Var = (n1) m1Var.a();
                    }
                    xVar.w(c0568g1, n1Var);
                } catch (Throwable unused) {
                    AbstractC0602x.h("BillingLogger");
                }
            } else {
                b(extras, gVar4, i, k1Var, j4, z5);
            }
            ((D0) e6.f4446c).b(gVar4, arrayList);
        }
        AbstractC0602x.g("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
        for (int i7 = 0; i7 < stringArrayList.size() && i7 < stringArrayList2.size(); i7++) {
            Purchase purchaseI2 = AbstractC0602x.i(stringArrayList.get(i7), stringArrayList2.get(i7));
            if (purchaseI2 != null) {
                arrayList2.add(purchaseI2);
            }
        }
        arrayList = arrayList2;
        if (gVar4.f4493a == 0) {
            xVar = (D.x) e6.f4447d;
            C0568g1 c0568g1C2 = y.c(i, k1Var);
            xVar.getClass();
            C0565f1 c0565f2 = (C0565f1) c0568g1C2.j();
            q1 q1Var2 = (q1) c0568g1C2.s().j();
            q1Var2.c();
            t1.p((t1) q1Var2.i, z5);
            c0565f2.c();
            C0568g1.o((C0568g1) c0565f2.i, (t1) q1Var2.a());
            C0568g1 c0568g2 = (C0568g1) c0565f2.a();
            if (j4 == 0) {
                n1Var = (n1) xVar.i;
            } else {
                m1 m1Var2 = (m1) ((n1) xVar.i).j();
                m1Var2.c();
                n1.p((n1) m1Var2.i, j4);
                n1Var = (n1) m1Var2.a();
            }
            xVar.w(c0568g2, n1Var);
        } else {
            b(extras, gVar4, i, k1Var, j4, z5);
        }
        ((D0) e6.f4446c).b(gVar4, arrayList);
    }
}
