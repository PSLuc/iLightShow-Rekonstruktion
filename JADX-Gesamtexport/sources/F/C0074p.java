package F;

import p096s.InterfaceC0930x;

/* JADX INFO: renamed from: F.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0074p implements p040h0.i, InterfaceC0930x, U3.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1199h;

    public /* synthetic */ C0074p(int i) {
        this.f1199h = i;
    }

    private final void c(Object obj) {
    }

    @Override // p096s.InterfaceC0930x
    public float a(float f6) {
        return f6;
    }

    @Override // p040h0.i
    public double b(double d6) {
        double d7;
        switch (this.f1199h) {
            case 8:
                double dPow = d6 < 0.0d ? -d6 : d6;
                if (dPow >= 0.0031308049535603718d) {
                    dPow = Math.pow(dPow, 0.4166666666666667d) - 0.05213270142180095d;
                    d7 = 0.9478672985781991d;
                } else {
                    d7 = 0.07739938080495357d;
                }
                return Math.copySign(dPow / d7, d6);
            case 9:
                double d8 = d6 < 0.0d ? -d6 : d6;
                return Math.copySign(d8 >= 0.04045d ? Math.pow((0.9478672985781991d * d8) + 0.05213270142180095d, 2.4d) : d8 * 0.07739938080495357d, d6);
            default:
                return d6;
        }
    }

    @Override // U3.a
    public void e(Object obj) {
        switch (this.f1199h) {
            case 14:
                break;
            case 15:
                break;
            default:
                break;
        }
    }
}
