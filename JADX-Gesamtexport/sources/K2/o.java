package K2;

/* JADX INFO: loaded from: classes.dex */
public final class o extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f2122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f2123b;

    public o(v vVar, u uVar) {
        this.f2122a = vVar;
        this.f2123b = uVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            v vVar = this.f2122a;
            if (vVar != null ? vVar.equals(((o) wVar).f2122a) : ((o) wVar).f2122a == null) {
                u uVar = this.f2123b;
                if (uVar != null ? uVar.equals(((o) wVar).f2123b) : ((o) wVar).f2123b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        v vVar = this.f2122a;
        int iHashCode = ((vVar == null ? 0 : vVar.hashCode()) ^ 1000003) * 1000003;
        u uVar = this.f2123b;
        return iHashCode ^ (uVar != null ? uVar.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f2122a + ", mobileSubtype=" + this.f2123b + "}";
    }
}
