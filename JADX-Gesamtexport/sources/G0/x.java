package G0;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f1550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f1551b;

    public x(w wVar, v vVar) {
        this.f1550a = wVar;
        this.f1551b = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return E4.k.a(this.f1551b, xVar.f1551b) && E4.k.a(this.f1550a, xVar.f1550a);
    }

    public final int hashCode() {
        w wVar = this.f1550a;
        int iHashCode = (wVar != null ? wVar.hashCode() : 0) * 31;
        v vVar = this.f1551b;
        return iHashCode + (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f1550a + ", paragraphSyle=" + this.f1551b + ')';
    }
}
