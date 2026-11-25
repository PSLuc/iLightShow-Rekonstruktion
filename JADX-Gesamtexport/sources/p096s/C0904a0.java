package p096s;

/* JADX INFO: renamed from: s.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0904a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f11939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f11940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f11942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f11943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f11944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f11945g;

    public final long a(float f6, float f7, long j4) {
        double dCos;
        double dExp;
        if (!this.f11941c) {
            if (this.f11939a == Float.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            float f8 = this.f11945g;
            double d6 = f8;
            double d7 = d6 * d6;
            if (f8 > 1.0f) {
                double d8 = this.f11940b;
                double d9 = d7 - ((double) 1);
                this.f11942d = (Math.sqrt(d9) * d8) + (((double) (-f8)) * d8);
                double d10 = -this.f11945g;
                double d11 = this.f11940b;
                this.f11943e = (d10 * d11) - (Math.sqrt(d9) * d11);
            } else if (f8 >= 0.0f && f8 < 1.0f) {
                this.f11944f = Math.sqrt(((double) 1) - d7) * this.f11940b;
            }
            this.f11941c = true;
        }
        float f9 = f6 - this.f11939a;
        double d12 = j4 / 1000.0d;
        float f10 = this.f11945g;
        if (f10 > 1.0f) {
            double d13 = f9;
            double d14 = this.f11943e;
            double d15 = ((d14 * d13) - ((double) f7)) / (d14 - this.f11942d);
            double d16 = d13 - d15;
            dExp = (Math.exp(this.f11942d * d12) * d15) + (Math.exp(d14 * d12) * d16);
            double d17 = this.f11943e;
            double dExp2 = Math.exp(d17 * d12) * d16 * d17;
            double d18 = this.f11942d;
            dCos = (Math.exp(d18 * d12) * d15 * d18) + dExp2;
        } else if (f10 == 1.0f) {
            double d19 = this.f11940b;
            double d20 = f9;
            double d21 = (d19 * d20) + ((double) f7);
            double d22 = (d21 * d12) + d20;
            dExp = Math.exp((-d19) * d12) * d22;
            double dExp3 = Math.exp((-this.f11940b) * d12) * d22;
            double d23 = -this.f11940b;
            dCos = (dExp3 * d23) + (Math.exp(d23 * d12) * d21);
        } else {
            double d24 = ((double) 1) / this.f11944f;
            double d25 = this.f11940b;
            double d26 = f9;
            double d27 = ((((double) f10) * d25 * d26) + ((double) f7)) * d24;
            double dExp4 = Math.exp(((double) (-f10)) * d25 * d12) * ((Math.sin(this.f11944f * d12) * d27) + (Math.cos(this.f11944f * d12) * d26));
            double d28 = this.f11940b;
            float f11 = this.f11945g;
            double d29 = (-d28) * dExp4 * ((double) f11);
            double dExp5 = Math.exp(((double) (-f11)) * d28 * d12);
            double d30 = this.f11944f;
            double dSin = Math.sin(d30 * d12) * (-d30) * d26;
            double d31 = this.f11944f;
            dCos = (((Math.cos(d31 * d12) * d27 * d31) + dSin) * dExp5) + d29;
            dExp = dExp4;
        }
        return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dExp + ((double) this.f11939a))) << 32);
    }
}
