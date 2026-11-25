package q5;

import O1.C0308a;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public enum g {
    NULL(null, null, 0, 0, 0),
    /* JADX INFO: Fake field, exist only in values array */
    HMAC_MD5("HmacMD5", "MD5", 16, 0, 0),
    HMAC_SHA1("HmacSHA1", "SHA-1", 20, 8, 64),
    HMAC_SHA256("HmacSHA256", "SHA-256", 32, 8, 64),
    HMAC_SHA384("HmacSHA384", "SHA-384", 48, 16, 128),
    /* JADX INFO: Fake field, exist only in values array */
    HMAC_SHA512("HmacSHA512", "SHA-512", 64, 16, 128);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f11275h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f11276j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f11277k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f11278l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f11279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o f11280n;

    g(String str, String str2, int i, int i3, int i6) {
        this.f11275h = str;
        this.i = i;
        this.f11276j = i3;
        this.f11277k = i6;
        if (str == null && str2 == null) {
            this.f11278l = true;
            this.f11279m = null;
            this.f11280n = null;
        } else {
            t tVar = new t(str);
            this.f11279m = tVar;
            o oVar = new o(new C0308a(str2, 8));
            this.f11280n = oVar;
            this.f11278l = (tVar.f11317a == null || oVar.f11317a == null) ? false : true;
        }
    }

    public final Mac a() {
        t tVar = this.f11279m;
        if (tVar != null) {
            return (Mac) tVar.a();
        }
        return null;
    }
}
