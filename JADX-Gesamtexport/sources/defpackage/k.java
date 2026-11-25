package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f9797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f9798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f9799c;

    public k(double d6, double d7, double d8) {
        this.f9797a = d6;
        this.f9798b = d7;
        this.f9799c = d8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Double.compare(this.f9797a, kVar.f9797a) == 0 && Double.compare(this.f9798b, kVar.f9798b) == 0 && Double.compare(this.f9799c, kVar.f9799c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f9799c) + ((Double.hashCode(this.f9798b) + (Double.hashCode(this.f9797a) * 31)) * 31);
    }

    public final String toString() {
        return "RGB(r=" + this.f9797a + ", g=" + this.f9798b + ", b=" + this.f9799c + ")";
    }
}
