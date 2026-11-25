package p096s;

/* JADX INFO: renamed from: s.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0926t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f12116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f12117b;

    public C0926t(double d6, double d7) {
        this.f12116a = d6;
        this.f12117b = d7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0926t)) {
            return false;
        }
        C0926t c0926t = (C0926t) obj;
        return Double.compare(this.f12116a, c0926t.f12116a) == 0 && Double.compare(this.f12117b, c0926t.f12117b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f12117b) + (Double.hashCode(this.f12116a) * 31);
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.f12116a + ", _imaginary=" + this.f12117b + ')';
    }
}
