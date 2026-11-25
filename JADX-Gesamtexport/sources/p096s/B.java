package p096s;

/* JADX INFO: loaded from: classes.dex */
public final class B implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0904a0 f11809b;

    public B(float f6, float f7, float f8) {
        this.f11808a = f8;
        C0904a0 c0904a0 = new C0904a0();
        c0904a0.f11939a = 1.0f;
        double dSqrt = Math.sqrt(50.0d);
        c0904a0.f11940b = dSqrt;
        c0904a0.f11945g = 1.0f;
        if (f6 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        c0904a0.f11945g = f6;
        c0904a0.f11941c = false;
        if (((float) (dSqrt * dSqrt)) <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        c0904a0.f11940b = Math.sqrt(f7);
        c0904a0.f11941c = false;
        this.f11809b = c0904a0;
    }

    @Override // p096s.A
    public final float b(long j4, float f6, float f7, float f8) {
        C0904a0 c0904a0 = this.f11809b;
        c0904a0.f11939a = f7;
        return Float.intBitsToFloat((int) (c0904a0.a(f6, f8, j4 / 1000000) >> 32));
    }

    @Override // p096s.A
    public final float c(long j4, float f6, float f7, float f8) {
        C0904a0 c0904a0 = this.f11809b;
        c0904a0.f11939a = f7;
        return Float.intBitsToFloat((int) (c0904a0.a(f6, f8, j4 / 1000000) & 4294967295L));
    }

    @Override // p096s.A
    public final long d(float f6, float f7, float f8) {
        double d6;
        double dLog;
        long j4;
        double d7;
        C0904a0 c0904a0 = this.f11809b;
        double d8 = c0904a0.f11940b;
        float f9 = (float) (d8 * d8);
        float f10 = c0904a0.f11945g;
        float f11 = this.f11808a;
        float f12 = (f6 - f7) / f11;
        float f13 = f8 / f11;
        if (f10 == 0.0f) {
            j4 = 9223372036854L;
        } else {
            double d9 = f9;
            double d10 = f10;
            double d11 = f13;
            double d12 = f12;
            double d13 = 1.0f;
            double dSqrt = d10 * 2.0d * Math.sqrt(d9);
            double d14 = (dSqrt * dSqrt) - (d9 * 4.0d);
            double d15 = -dSqrt;
            C0926t c0926t = d14 < 0.0d ? new C0926t(0.0d, Math.sqrt(Math.abs(d14))) : new C0926t(Math.sqrt(d14), 0.0d);
            c0926t.f12116a = (c0926t.f12116a + d15) * 0.5d;
            c0926t.f12117b *= 0.5d;
            C0926t c0926t2 = d14 < 0.0d ? new C0926t(0.0d, Math.sqrt(Math.abs(d14))) : new C0926t(Math.sqrt(d14), 0.0d);
            double d16 = -1;
            double d17 = c0926t2.f12116a * d16;
            double d18 = c0926t2.f12117b * d16;
            c0926t2.f12116a = (d17 + d15) * 0.5d;
            c0926t2.f12117b = d18 * 0.5d;
            if (d12 == 0.0d && d11 == 0.0d) {
                j4 = 0;
            } else {
                if (d12 < 0.0d) {
                    d11 = -d11;
                }
                double dAbs = Math.abs(d12);
                if (d10 > 1.0d) {
                    double d19 = c0926t.f12116a;
                    double d20 = c0926t2.f12116a;
                    double d21 = d19 - d20;
                    double d22 = ((d19 * dAbs) - d11) / d21;
                    double d23 = dAbs - d22;
                    dLog = Math.log(Math.abs(d13 / d23)) / d19;
                    double dLog2 = Math.log(Math.abs(d13 / d22)) / d20;
                    if (Double.isInfinite(dLog) || Double.isNaN(dLog)) {
                        dLog = dLog2;
                    } else if (!Double.isInfinite(dLog2) && !Double.isNaN(dLog2)) {
                        dLog = Math.max(dLog, dLog2);
                    }
                    double d24 = d23 * d19;
                    double dLog3 = Math.log(d24 / ((-d22) * d20)) / (d20 - d19);
                    if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
                        d7 = -d13;
                    } else {
                        if (dLog3 > 0.0d) {
                            if ((-((Math.exp(dLog3 * d20) * d22) + (Math.exp(d19 * dLog3) * d23))) < d13) {
                                if (d22 > 0.0d && d23 < 0.0d) {
                                    dLog = 0.0d;
                                }
                                d7 = -d13;
                            }
                        }
                        d7 = d13;
                        dLog = Math.log((-((d22 * d20) * d20)) / (d24 * d19)) / d21;
                    }
                    double d25 = d7;
                    double d26 = d22 * d20;
                    if (Math.abs((Math.exp(d20 * dLog) * d26) + (Math.exp(d19 * dLog) * d24)) >= 1.0E-4d) {
                        double d27 = dLog;
                        int i = 0;
                        double d28 = Double.MAX_VALUE;
                        while (d28 > 0.001d && i < 100) {
                            i++;
                            double d29 = d19 * d27;
                            double d30 = d20 * d27;
                            double dExp = d27 - ((((Math.exp(d30) * d22) + (Math.exp(d29) * d23)) + d25) / ((Math.exp(d30) * d26) + (Math.exp(d29) * d24)));
                            double dAbs2 = Math.abs(d27 - dExp);
                            d27 = dExp;
                            d28 = dAbs2;
                        }
                        dLog = d27;
                    }
                } else if (d10 < 1.0d) {
                    double d31 = c0926t.f12116a;
                    double d32 = (d11 - (d31 * dAbs)) / c0926t.f12117b;
                    dLog = Math.log(d13 / Math.sqrt((d32 * d32) + (dAbs * dAbs))) / d31;
                } else {
                    double d33 = c0926t.f12116a;
                    double d34 = d33 * dAbs;
                    double d35 = d11 - d34;
                    double dLog4 = Math.log(Math.abs(d13 / dAbs)) / d33;
                    double dLog5 = Math.log(Math.abs(d13 / d35));
                    double dLog6 = dLog5;
                    for (int i3 = 0; i3 < 6; i3++) {
                        dLog6 = dLog5 - Math.log(Math.abs(dLog6 / d33));
                    }
                    double d36 = dLog6 / d33;
                    if (Double.isInfinite(dLog4) || Double.isNaN(dLog4)) {
                        dLog4 = d36;
                    } else if (!Double.isInfinite(d36) && !Double.isNaN(d36)) {
                        dLog4 = Math.max(dLog4, d36);
                    }
                    double d37 = (-(d34 + d35)) / (d33 * d35);
                    double d38 = d33 * d37;
                    double dExp2 = (Math.exp(d38) * d35 * d37) + (Math.exp(d38) * dAbs);
                    if (Double.isNaN(d37) || d37 <= 0.0d) {
                        d6 = -d13;
                    } else if (d37 <= 0.0d || (-dExp2) >= d13) {
                        dLog4 = (-(2.0d / d33)) - (dAbs / d35);
                        d6 = d13;
                    } else {
                        d6 = -d13;
                        dLog4 = (d35 >= 0.0d || dAbs <= 0.0d) ? dLog4 : 0.0d;
                    }
                    int i6 = 0;
                    double dAbs3 = Double.MAX_VALUE;
                    while (dAbs3 > 0.001d && i6 < 100) {
                        i6++;
                        double d39 = d33 * dLog4;
                        double dExp3 = dLog4 - (((Math.exp(d39) * ((d35 * dLog4) + dAbs)) + d6) / (Math.exp(d39) * (((((double) 1) + d39) * d35) + d34)));
                        dAbs3 = Math.abs(dLog4 - dExp3);
                        dLog4 = dExp3;
                    }
                    dLog = dLog4;
                }
                j4 = (long) (dLog * 1000.0d);
            }
        }
        return j4 * 1000000;
    }

    @Override // p096s.A
    public final float e(float f6, float f7, float f8) {
        return 0.0f;
    }
}
