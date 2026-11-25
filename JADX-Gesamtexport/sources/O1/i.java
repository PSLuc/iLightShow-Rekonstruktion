package O1;

import B.AbstractC0013g0;
import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f4502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f4506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f4507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f4508h;
    public final ArrayList i;

    public i(String str) throws JSONException {
        this.f4501a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f4502b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f4503c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f4504d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f4505e = jSONObject.optString("title");
        jSONObject.optString("name");
        jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f4506f = jSONObject.optString("skuDetailsToken");
        this.f4507g = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                W2.g gVar = new W2.g(10);
                jSONObject2.optString("basePlanId");
                jSONObject2.optString("offerId").getClass();
                jSONObject2.getString("offerIdToken");
                JSONArray jSONArray = jSONObject2.getJSONArray("pricingPhases");
                ArrayList arrayList2 = new ArrayList();
                if (jSONArray != null) {
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i3);
                        if (jSONObjectOptJSONObject != null) {
                            arrayList2.add(new Z2.f(jSONObjectOptJSONObject));
                        }
                    }
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("installmentPlanDetails");
                if (jSONObjectOptJSONObject2 != null) {
                    jSONObjectOptJSONObject2.getInt("commitmentPaymentsCount");
                    jSONObjectOptJSONObject2.optInt("subsequentCommitmentPaymentsCount");
                }
                JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("transitionPlanDetails");
                if (jSONObjectOptJSONObject3 != null) {
                    jSONObjectOptJSONObject3.getString("productId");
                    jSONObjectOptJSONObject3.optString("title");
                    jSONObjectOptJSONObject3.optString("name");
                    jSONObjectOptJSONObject3.optString("description");
                    jSONObjectOptJSONObject3.optString("basePlanId");
                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("pricingPhase");
                    if (jSONObjectOptJSONObject4 != null) {
                        jSONObjectOptJSONObject4.optString("billingPeriod");
                        jSONObjectOptJSONObject4.optString("priceCurrencyCode");
                        jSONObjectOptJSONObject4.optString("formattedPrice");
                        jSONObjectOptJSONObject4.optLong("priceAmountMicros");
                        jSONObjectOptJSONObject4.optInt("recurrenceMode");
                        jSONObjectOptJSONObject4.optInt("billingCycleCount");
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("offerTags");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i6 = 0; i6 < jSONArrayOptJSONArray2.length(); i6++) {
                        arrayList3.add(jSONArrayOptJSONArray2.getString(i6));
                    }
                }
                arrayList.add(gVar);
            }
            this.f4508h = arrayList;
        } else {
            this.f4508h = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject5 = this.f4502b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray3 = this.f4502b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList4 = new ArrayList();
        if (jSONArrayOptJSONArray3 != null) {
            for (int i7 = 0; i7 < jSONArrayOptJSONArray3.length(); i7++) {
                arrayList4.add(new h(jSONArrayOptJSONArray3.getJSONObject(i7)));
            }
            this.i = arrayList4;
            return;
        }
        if (jSONObjectOptJSONObject5 == null) {
            this.i = null;
        } else {
            arrayList4.add(new h(jSONObjectOptJSONObject5));
            this.i = arrayList4;
        }
    }

    public final h a() {
        ArrayList arrayList = this.i;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (h) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return TextUtils.equals(this.f4501a, ((i) obj).f4501a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4501a.hashCode();
    }

    public final String toString() {
        String string = this.f4502b.toString();
        String strValueOf = String.valueOf(this.f4508h);
        StringBuilder sb = new StringBuilder("ProductDetails{jsonString='");
        AbstractC0013g0.t(sb, this.f4501a, "', parsedJson=", string, ", productId='");
        sb.append(this.f4503c);
        sb.append("', productType='");
        sb.append(this.f4504d);
        sb.append("', title='");
        sb.append(this.f4505e);
        sb.append("', productDetailsToken='");
        sb.append(this.f4506f);
        sb.append("', subscriptionOfferDetails=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
