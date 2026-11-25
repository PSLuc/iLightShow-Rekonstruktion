package E0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p084p4.e f903b;

    public a(String str, p084p4.e eVar) {
        this.f902a = str;
        this.f903b = eVar;
    }

    public final String a() {
        return this.f902a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return E4.k.a(this.f902a, aVar.f902a) && E4.k.a(this.f903b, aVar.f903b);
    }

    public final int hashCode() {
        String str = this.f902a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        p084p4.e eVar = this.f903b;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f902a + ", action=" + this.f903b + ')';
    }
}
