package L;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f2162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f2164e;

    public B(float f6, float f7, float f8, float f9, float f10, float f11) {
        this.f2160a = f6;
        this.f2161b = f7;
        this.f2162c = f8;
        this.f2163d = f9;
        this.f2164e = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof B)) {
            return false;
        }
        B b6 = (B) obj;
        return S0.e.a(this.f2160a, b6.f2160a) && S0.e.a(this.f2161b, b6.f2161b) && S0.e.a(this.f2162c, b6.f2162c) && S0.e.a(this.f2163d, b6.f2163d) && S0.e.a(this.f2164e, b6.f2164e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f2164e) + p012c.k.i(this.f2163d, p012c.k.i(this.f2162c, p012c.k.i(this.f2161b, Float.hashCode(this.f2160a) * 31, 31), 31), 31);
    }
}
