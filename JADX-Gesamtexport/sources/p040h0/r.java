package p040h0;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f9278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f9279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f9280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f9281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f9282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f9283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f9284g;

    public /* synthetic */ r(double d6, double d7, double d8, double d9, double d10) {
        this(d6, d7, d8, d9, d10, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Double.compare(this.f9278a, rVar.f9278a) == 0 && Double.compare(this.f9279b, rVar.f9279b) == 0 && Double.compare(this.f9280c, rVar.f9280c) == 0 && Double.compare(this.f9281d, rVar.f9281d) == 0 && Double.compare(this.f9282e, rVar.f9282e) == 0 && Double.compare(this.f9283f, rVar.f9283f) == 0 && Double.compare(this.f9284g, rVar.f9284g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f9284g) + ((Double.hashCode(this.f9283f) + ((Double.hashCode(this.f9282e) + ((Double.hashCode(this.f9281d) + ((Double.hashCode(this.f9280c) + ((Double.hashCode(this.f9279b) + (Double.hashCode(this.f9278a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f9278a + ", a=" + this.f9279b + ", b=" + this.f9280c + ", c=" + this.f9281d + ", d=" + this.f9282e + ", e=" + this.f9283f + ", f=" + this.f9284g + ')';
    }

    public r(double d6, double d7, double d8, double d9, double d10, double d11, double d12) {
        this.f9278a = d6;
        this.f9279b = d7;
        this.f9280c = d8;
        this.f9281d = d9;
        this.f9282e = d10;
        this.f9283f = d11;
        this.f9284g = d12;
        if (Double.isNaN(d7) || Double.isNaN(d8) || Double.isNaN(d9) || Double.isNaN(d10) || Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d6)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d10 < 0.0d || d10 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d10);
        }
        if (d10 == 0.0d && (d7 == 0.0d || d6 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d10 >= 1.0d && d9 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d7 == 0.0d || d6 == 0.0d) && d9 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d9 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d7 < 0.0d || d6 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
