package O1;

import B.AbstractC0013g0;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4517d;

    public m(String str) {
        this.f4514a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f4515b = jSONObject.optString("productId");
        String strOptString = jSONObject.optString("type");
        this.f4516c = strOptString;
        this.f4517d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        jSONObject.optString("serializedDocid");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            return TextUtils.equals(this.f4514a, ((m) obj).f4514a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4514a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnfetchedProduct{productId='");
        sb.append(this.f4515b);
        sb.append("', productType='");
        sb.append(this.f4516c);
        sb.append("', statusCode=");
        return AbstractC0013g0.l(sb, this.f4517d, "}");
    }
}
