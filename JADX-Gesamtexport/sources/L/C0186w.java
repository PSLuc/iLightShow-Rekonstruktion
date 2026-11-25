package L;

/* JADX INFO: renamed from: L.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0186w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f2944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f2946e;

    public C0186w(float f6, float f7, float f8, float f9, float f10) {
        this.f2942a = f6;
        this.f2943b = f7;
        this.f2944c = f8;
        this.f2945d = f9;
        this.f2946e = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0186w)) {
            return false;
        }
        C0186w c0186w = (C0186w) obj;
        return S0.e.a(this.f2942a, c0186w.f2942a) && S0.e.a(this.f2943b, c0186w.f2943b) && S0.e.a(this.f2944c, c0186w.f2944c) && S0.e.a(this.f2945d, c0186w.f2945d) && S0.e.a(this.f2946e, c0186w.f2946e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f2946e) + p012c.k.i(this.f2945d, p012c.k.i(this.f2944c, p012c.k.i(this.f2943b, Float.hashCode(this.f2942a) * 31, 31), 31), 31);
    }
}
