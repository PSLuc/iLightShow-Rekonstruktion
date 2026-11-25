package p015c2;

import O1.B;
import S1.b0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final z f7337o = new z(Boolean.TRUE, null, null, null, null, null, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final z f7338p = new z(Boolean.FALSE, null, null, null, null, null, null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final z f7339q = new z(null, null, null, null, null, null, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f7340h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f7341j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f7342k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient B f7343l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b0 f7344m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b0 f7345n;

    public z(Boolean bool, String str, Integer num, String str2, B b6, b0 b0Var, b0 b0Var2) {
        this.f7340h = bool;
        this.i = str;
        this.f7341j = num;
        this.f7342k = (str2 == null || str2.isEmpty()) ? null : str2;
        this.f7343l = b6;
        this.f7344m = b0Var;
        this.f7345n = b0Var2;
    }

    public static z a(Boolean bool, String str, Integer num, String str2) {
        if (str != null || num != null || str2 != null) {
            return new z(bool, str, num, str2, null, null, null);
        }
        if (bool == null) {
            return f7339q;
        }
        return bool.booleanValue() ? f7337o : f7338p;
    }

    public final z b(B b6) {
        return new z(this.f7340h, this.i, this.f7341j, this.f7342k, b6, this.f7344m, this.f7345n);
    }
}
