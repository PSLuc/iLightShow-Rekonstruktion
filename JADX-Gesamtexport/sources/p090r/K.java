package p090r;

import S0.b;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11384b;

    public K(float f6, b bVar) {
        this.f11383a = f6;
        float fA = bVar.a();
        float f7 = L.f11385a;
        this.f11384b = fA * 386.0878f * 160.0f * 0.84f;
    }

    public final J a(float f6) {
        double dB = b(f6);
        double d6 = L.f11385a;
        double d7 = d6 - 1.0d;
        return new J(f6, (float) (Math.exp((d6 / d7) * dB) * ((double) (this.f11383a * this.f11384b))), (long) (Math.exp(dB / d7) * 1000.0d));
    }

    public final double b(float f6) {
        float[] fArr = AbstractC0863b.f11397a;
        return Math.log(((double) (Math.abs(f6) * 0.35f)) / ((double) (this.f11383a * this.f11384b)));
    }
}
