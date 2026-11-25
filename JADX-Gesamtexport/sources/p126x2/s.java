package p126x2;

import E4.k;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14109b;

    public s(String str) {
        k.f("name", str);
        this.f14109b = str;
        String upperCase = str.toUpperCase();
        k.e("(this as java.lang.String).toUpperCase()", upperCase);
        this.f14108a = upperCase;
    }

    public final boolean equals(Object obj) {
        boolean z5 = obj instanceof s;
        String str = this.f14108a;
        if (z5) {
            return k.a(((s) obj).f14108a, str);
        }
        if (obj instanceof String) {
            return k.a(new s((String) obj).f14108a, str);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14108a.hashCode();
    }

    public final String toString() {
        return this.f14109b;
    }
}
