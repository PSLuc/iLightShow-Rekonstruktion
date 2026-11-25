package Z2;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6063c;

    public v(String str, boolean z5) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        this.f6061a = str;
        if (TextUtils.isEmpty("com.google.android.gms")) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        this.f6062b = "com.google.android.gms";
        this.f6063c = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return n.d(this.f6061a, vVar.f6061a) && n.d(this.f6062b, vVar.f6062b) && n.d(null, null) && this.f6063c == vVar.f6063c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6061a, this.f6062b, null, 4225, Boolean.valueOf(this.f6063c)});
    }

    public final String toString() {
        String str = this.f6061a;
        if (str != null) {
            return str;
        }
        n.b(null);
        throw null;
    }
}
