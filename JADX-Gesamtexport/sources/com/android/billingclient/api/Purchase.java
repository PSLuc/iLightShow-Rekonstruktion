package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Purchase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f7529c;

    public Purchase(String str, String str2) {
        this.f7527a = str;
        this.f7528b = str2;
        this.f7529c = new JSONObject(str);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f7529c;
        if (jSONObject.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f7527a, purchase.f7527a) && TextUtils.equals(this.f7528b, purchase.f7528b);
    }

    public final int hashCode() {
        return this.f7527a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f7527a));
    }
}
