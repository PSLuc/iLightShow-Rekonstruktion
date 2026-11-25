package G0;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f1464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f1465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f1466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C f1467d;

    public H(C c6, C c7, C c8, C c9) {
        this.f1464a = c6;
        this.f1465b = c7;
        this.f1466c = c8;
        this.f1467d = c9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof H)) {
            return false;
        }
        H h6 = (H) obj;
        return E4.k.a(this.f1464a, h6.f1464a) && E4.k.a(this.f1465b, h6.f1465b) && E4.k.a(this.f1466c, h6.f1466c) && E4.k.a(this.f1467d, h6.f1467d);
    }

    public final int hashCode() {
        C c6 = this.f1464a;
        int iHashCode = (c6 != null ? c6.hashCode() : 0) * 31;
        C c7 = this.f1465b;
        int iHashCode2 = (iHashCode + (c7 != null ? c7.hashCode() : 0)) * 31;
        C c8 = this.f1466c;
        int iHashCode3 = (iHashCode2 + (c8 != null ? c8.hashCode() : 0)) * 31;
        C c9 = this.f1467d;
        return iHashCode3 + (c9 != null ? c9.hashCode() : 0);
    }
}
