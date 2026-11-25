package p096s;

import java.util.Arrays;
import p085q.b;

/* JADX INFO: renamed from: s.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0925s {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static float[] f12096s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f12097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f12099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f12100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f12101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f12102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f12103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f12104h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f12105j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f12106k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f12107l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f12108m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f12109n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f12110o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f12111p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f12112q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f12113r;

    public C0925s(int i, float f6, float f7, float f8, float f9, float f10, float f11) {
        boolean z5;
        float f12 = f8;
        this.f12097a = f6;
        this.f12098b = f7;
        this.f12099c = f12;
        this.f12100d = f9;
        this.f12101e = f10;
        this.f12102f = f11;
        float f13 = f10 - f12;
        float f14 = f11 - f9;
        int i3 = 1;
        float f15 = 0.0f;
        boolean z6 = i == 1 || (i == 4 ? f14 > 0.0f : !(i != 5 || f14 >= 0.0f));
        this.f12112q = z6;
        float f16 = f7 - f6;
        float f17 = 1 / f16;
        this.f12106k = f17;
        boolean z7 = 3 == i;
        if (z7 || Math.abs(f13) < 0.001f || Math.abs(f14) < 0.001f) {
            float fHypot = (float) Math.hypot(f14, f13);
            this.f12103g = fHypot;
            this.f12111p = fHypot * f17;
            this.f12109n = f13 / f16;
            this.f12110o = f14 / f16;
            this.f12105j = new float[101];
            this.f12107l = Float.NaN;
            this.f12108m = Float.NaN;
            z5 = true;
        } else {
            this.f12105j = new float[101];
            this.f12107l = (z6 ? -1 : 1) * f13;
            this.f12108m = f14 * (z6 ? 1 : -1);
            this.f12109n = z6 ? f10 : f12;
            this.f12110o = z6 ? f9 : f11;
            float f18 = f9 - f11;
            int length = b.a().length;
            float fHypot2 = 0.0f;
            float f19 = 0.0f;
            float f20 = 0.0f;
            int i6 = 0;
            while (i6 < length) {
                int i7 = i3;
                float f21 = f15;
                double radians = (float) Math.toRadians((((double) i6) * 90.0d) / ((double) (b.a().length - i7)));
                float fSin = ((float) Math.sin(radians)) * f13;
                float fCos = ((float) Math.cos(radians)) * f18;
                if (i6 > 0) {
                    fHypot2 += (float) Math.hypot(fSin - f19, fCos - f20);
                    b.a()[i6] = fHypot2;
                }
                i6++;
                f18 = f18;
                f19 = fSin;
                f20 = fCos;
                i3 = i7;
                f15 = f21;
            }
            int i8 = i3;
            float f22 = f15;
            this.f12103g = fHypot2;
            int length2 = b.a().length;
            for (int i9 = 0; i9 < length2; i9++) {
                float[] fArrA = b.a();
                fArrA[i9] = fArrA[i9] / fHypot2;
            }
            float[] fArr = this.f12105j;
            int length3 = fArr.length;
            for (int i10 = 0; i10 < length3; i10++) {
                float length4 = i10 / (fArr.length - i8);
                float[] fArrA2 = b.a();
                int iBinarySearch = Arrays.binarySearch(fArrA2, 0, fArrA2.length, length4);
                if (iBinarySearch >= 0) {
                    fArr[i10] = iBinarySearch / (b.a().length - i8);
                } else if (iBinarySearch == -1) {
                    fArr[i10] = f22;
                } else {
                    int i11 = -iBinarySearch;
                    int i12 = i11 - 2;
                    fArr[i10] = (((length4 - b.a()[i12]) / (b.a()[i11 - i8] - b.a()[i12])) + i12) / (b.a().length - i8);
                }
            }
            this.f12111p = this.f12103g * this.f12106k;
            z5 = z7;
        }
        this.f12113r = z5;
    }

    public final float a() {
        float f6 = this.f12107l * this.i;
        float fHypot = this.f12111p / ((float) Math.hypot(f6, (-this.f12108m) * this.f12104h));
        return this.f12112q ? (-f6) * fHypot : f6 * fHypot;
    }

    public final float b() {
        float f6 = this.f12107l * this.i;
        float f7 = (-this.f12108m) * this.f12104h;
        float fHypot = this.f12111p / ((float) Math.hypot(f6, f7));
        return this.f12112q ? (-f7) * fHypot : f7 * fHypot;
    }

    public final void c(float f6) {
        float f7 = (this.f12112q ? this.f12098b - f6 : f6 - this.f12097a) * this.f12106k;
        float f8 = 0.0f;
        if (f7 > 0.0f) {
            f8 = 1.0f;
            if (f7 < 1.0f) {
                float[] fArr = this.f12105j;
                float length = f7 * (fArr.length - 1);
                int i = (int) length;
                float f9 = fArr[i];
                f8 = ((fArr[i + 1] - f9) * (length - i)) + f9;
            }
        }
        double d6 = f8 * 1.5707964f;
        this.f12104h = (float) Math.sin(d6);
        this.i = (float) Math.cos(d6);
    }
}
