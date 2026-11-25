package W1;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5559b;

    @Override // W1.a
    public final long b() {
        switch (this.f5559b) {
            case 0:
                return Double.doubleToRawLongBits(Double.NaN);
            default:
                return Float.floatToRawIntBits(Float.NaN);
        }
    }

    @Override // W1.a
    public final long c() {
        switch (this.f5559b) {
            case 0:
                return Double.doubleToRawLongBits(Double.NEGATIVE_INFINITY);
            default:
                return Float.floatToRawIntBits(Float.NEGATIVE_INFINITY);
        }
    }

    @Override // W1.a
    public final long e() {
        switch (this.f5559b) {
            case 0:
                return Double.doubleToRawLongBits(Double.POSITIVE_INFINITY);
            default:
                return Float.floatToRawIntBits(Float.POSITIVE_INFINITY);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0087  */
    @Override // W1.a
    public final long g(String str, int i, boolean z5, long j4, int i3, boolean z6, int i6) {
        double dB;
        float fC;
        switch (this.f5559b) {
            case 0:
                if (j4 == 0) {
                    dB = z5 ? -0.0d : 0.0d;
                } else if (z6) {
                    if (-325 > i6 || i6 > 308) {
                        dB = Double.NaN;
                    } else {
                        double dB2 = e.b(i6, j4, z5);
                        double dB3 = e.b(i6, j4 + 1, z5);
                        if (Double.isNaN(dB2) || dB3 != dB2) {
                            dB = Double.NaN;
                        } else {
                            dB = dB2;
                        }
                    }
                } else if (-325 > i3 || i3 > 308) {
                    dB = Double.NaN;
                } else {
                    dB = e.b(i3, j4, z5);
                }
                if (Double.isNaN(dB)) {
                    dB = Double.parseDouble(str.subSequence(0, i).toString());
                }
                return Double.doubleToRawLongBits(dB);
            default:
                if (j4 == 0) {
                    fC = z5 ? -0.0f : 0.0f;
                } else {
                    fC = Float.NaN;
                    if (z6) {
                        if (-45 <= i6 && i6 <= 38) {
                            float fC2 = e.c(i6, j4, z5);
                            float fC3 = e.c(i6, j4 + 1, z5);
                            if (!Float.isNaN(fC2) && fC3 == fC2) {
                                fC = fC2;
                            }
                        }
                    } else if (-45 <= i3 && i3 <= 38) {
                        fC = e.c(i3, j4, z5);
                    }
                }
                if (Float.isNaN(fC)) {
                    fC = Float.parseFloat(str.subSequence(0, i).toString());
                }
                return Float.floatToRawIntBits(fC);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    @Override // W1.a
    public final long h(String str, int i, boolean z5, long j4, int i3, boolean z6, int i6) {
        double d6;
        float fE;
        switch (this.f5559b) {
            case 0:
                long j6 = i3;
                long j7 = i6;
                if (j4 == 0) {
                    d6 = z5 ? -0.0d : 0.0d;
                } else if (z6) {
                    if (-1022 > j7 || j7 > 1023) {
                        d6 = Double.NaN;
                    } else {
                        int i7 = (int) j7;
                        double d7 = e.d(i7, j4, z5);
                        double d8 = e.d(i7, j4 + 1, z5);
                        if (Double.isNaN(d7) || d8 != d7) {
                            d6 = Double.NaN;
                        } else {
                            d6 = d7;
                        }
                    }
                } else if (-1022 > j6 || j6 > 1023) {
                    d6 = Double.NaN;
                } else {
                    d6 = e.d((int) j6, j4, z5);
                }
                if (Double.isNaN(d6)) {
                    d6 = Double.parseDouble(str.subSequence(0, i).toString());
                }
                return Double.doubleToRawLongBits(d6);
            default:
                if (j4 == 0) {
                    fE = z5 ? -0.0f : 0.0f;
                } else {
                    fE = Float.NaN;
                    if (z6) {
                        if (-126 <= i6 && i6 <= 127) {
                            float fE2 = e.e(i6, j4, z5);
                            float fE3 = e.e(i6, j4 + 1, z5);
                            if (!Double.isNaN(fE2) && fE3 == fE2) {
                                fE = fE2;
                            }
                        }
                    } else if (-126 <= i3 && i3 <= 127) {
                        fE = e.e(i3, j4, z5);
                    }
                }
                if (Float.isNaN(fE)) {
                    fE = Float.parseFloat(str.subSequence(0, i).toString());
                }
                return Float.floatToRawIntBits(fE);
        }
    }
}
