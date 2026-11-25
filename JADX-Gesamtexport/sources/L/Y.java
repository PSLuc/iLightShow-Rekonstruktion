package L;

/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f2580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2581d;

    public Y(float f6, float f7, float f8, float f9) {
        this.f2578a = f6;
        this.f2579b = f7;
        this.f2580c = f8;
        this.f2581d = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Y)) {
            return false;
        }
        Y y2 = (Y) obj;
        if (S0.e.a(this.f2578a, y2.f2578a) && S0.e.a(this.f2579b, y2.f2579b) && S0.e.a(this.f2580c, y2.f2580c)) {
            return S0.e.a(this.f2581d, y2.f2581d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2581d) + p012c.k.i(this.f2580c, p012c.k.i(this.f2579b, Float.hashCode(this.f2578a) * 31, 31), 31);
    }
}
