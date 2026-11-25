package com.google.android.gms.internal.play_billing;

import O1.C0313f;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import org.json.JSONException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0602x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f8015a = Runtime.getRuntime().availableProcessors();

    public static int a(String str, Bundle bundle) {
        if (bundle == null) {
            Log.isLoggable(str, 5);
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            g(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        "Unexpected type for bundle response code: ".concat(obj.getClass().getName());
        Log.isLoggable(str, 5);
        return 6;
    }

    public static void b(Bundle bundle, String str, String str2, long j4) {
        bundle.putString("playBillingLibraryVersion", str);
        if (str2 != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str2);
        }
        bundle.putLong("billingClientSessionId", j4);
    }

    public static Bundle c(O1.g gVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", gVar.f4493a);
        bundle.putString("DEBUG_MESSAGE", gVar.f4495c);
        bundle.putInt("LOG_REASON", p012c.k.h(i));
        return bundle;
    }

    public static Bundle d(String str, String str2, ArrayList arrayList, C0601w0 c0601w0, long j4) {
        Bundle bundle = new Bundle();
        b(bundle, str, str2, j4);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        r rVar = AbstractC0594t.i;
        Object[] objArr = {"subs", "inapp"};
        AbstractC0599v0.P(objArr, 2);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList<>(AbstractC0594t.m(objArr, 2)));
        Object[] objArr2 = {"inapp"};
        AbstractC0599v0.P(objArr2, 1);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_PREORDER_OFFERS", new ArrayList<>(AbstractC0594t.m(objArr2, 1)));
        Object[] objArr3 = {"inapp"};
        AbstractC0599v0.P(objArr3, 1);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList<>(AbstractC0594t.m(objArr3, 1)));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        int size = arrayList.size();
        boolean z5 = false;
        boolean z6 = false;
        for (int i = 0; i < size; i++) {
            O1.l lVar = (O1.l) arrayList.get(i);
            arrayList2.add(null);
            z5 |= !TextUtils.isEmpty(null);
            arrayList4.add(null);
            z6 |= !TextUtils.isEmpty(null);
            if (lVar.f4513b.equals("first_party")) {
                throw new NullPointerException("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
            }
        }
        if (z5) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("accountName", null);
        }
        if (z6) {
            bundle.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayList4);
        }
        return bundle;
    }

    public static O1.g e(Intent intent, String str) {
        if (intent != null) {
            C0313f c0313fA = O1.g.a();
            c0313fA.f4490a = a(str, intent.getExtras());
            c0313fA.f4492c = f(str, intent.getExtras());
            return c0313fA.a();
        }
        Log.isLoggable("BillingHelper", 5);
        C0313f c0313fA2 = O1.g.a();
        c0313fA2.f4490a = 6;
        c0313fA2.f4492c = "An internal error occurred.";
        return c0313fA2.a();
    }

    public static String f(String str, Bundle bundle) {
        if (bundle == null) {
            Log.isLoggable(str, 5);
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            g(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        "Unexpected type for debug message: ".concat(obj.getClass().getName());
        Log.isLoggable(str, 5);
        return "";
    }

    public static void g(String str, String str2) {
        if (!Log.isLoggable(str, 2) || str2.isEmpty()) {
            return;
        }
        int i = 40000;
        while (!str2.isEmpty() && i > 0) {
            int iMin = Math.min(str2.length(), Math.min(4000, i));
            str2.substring(0, iMin);
            str2 = str2.substring(iMin);
            i -= iMin;
        }
    }

    public static void h(String str) {
        try {
            Log.isLoggable(str, 5);
        } catch (Throwable unused) {
        }
    }

    public static Purchase i(String str, String str2) {
        if (str == null || str2 == null) {
            g("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e6) {
            "Got JSONException while parsing purchase data: ".concat(e6.toString());
            Log.isLoggable("BillingHelper", 5);
            return null;
        }
    }
}
