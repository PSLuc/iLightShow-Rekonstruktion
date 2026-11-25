package p097s0;

import com.fasterxml.jackson.databind.deser.std.d0;
import kotlin.NoWhenBranchMatchedException;
import p027e3.a;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a[] f12152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f12154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f12155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f12156f;

    public b() {
        int i;
        int iD = AbstractC0916i.d(1);
        if (iD == 0) {
            i = 3;
        } else {
            if (iD != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = 2;
        }
        this.f12151a = i;
        this.f12152b = new a[20];
        this.f12154d = new float[20];
        this.f12155e = new float[20];
        this.f12156f = new float[3];
    }

    public final void a(float f6, long j4) {
        int i = (this.f12153c + 1) % 20;
        this.f12153c = i;
        a[] aVarArr = this.f12152b;
        a aVar = aVarArr[i];
        if (aVar != null) {
            aVar.f12149a = j4;
            aVar.f12150b = f6;
        } else {
            a aVar2 = new a();
            aVar2.f12149a = j4;
            aVar2.f12150b = f6;
            aVarArr[i] = aVar2;
        }
    }

    public final float b(float f6) {
        float[] fArr;
        float[] fArr2;
        float f7;
        float f8;
        float fSignum;
        float f9 = 0.0f;
        if (f6 <= 0.0f) {
            a.y0("maximumVelocity should be a positive value. You specified=" + f6);
            throw null;
        }
        int i = this.f12153c;
        a[] aVarArr = this.f12152b;
        a aVar = aVarArr[i];
        if (aVar == null) {
            f8 = 0.0f;
            f7 = 0.0f;
        } else {
            int i3 = 0;
            a aVar2 = aVar;
            while (true) {
                a aVar3 = aVarArr[i];
                fArr = this.f12154d;
                fArr2 = this.f12155e;
                if (aVar3 == null) {
                    f7 = f9;
                    break;
                }
                long j4 = aVar.f12149a;
                long j6 = aVar3.f12149a;
                float f10 = j4 - j6;
                f7 = f9;
                int i6 = i;
                float fAbs = Math.abs(j6 - aVar2.f12149a);
                if (f10 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i3] = aVar3.f12150b;
                fArr2[i3] = -f10;
                i = (i6 == 0 ? 20 : i6) - 1;
                i3++;
                if (i3 >= 20) {
                    break;
                }
                aVar2 = aVar3;
                f9 = f7;
            }
            if (i3 >= this.f12151a) {
                int iD = AbstractC0916i.d(1);
                if (iD == 0) {
                    try {
                        float[] fArr3 = this.f12156f;
                        d0.A(fArr2, fArr, i3, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f7;
                    }
                } else {
                    if (iD != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i7 = i3 - 1;
                    float f11 = fArr2[i7];
                    int i8 = i7;
                    float fAbs2 = f7;
                    while (i8 > 0) {
                        int i9 = i8 - 1;
                        float f12 = fArr2[i9];
                        if (f11 != f12) {
                            float f13 = (fArr[i8] - fArr[i9]) / (f11 - f12);
                            fAbs2 += Math.abs(f13) * (f13 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i8 == i7) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i8--;
                        f11 = f12;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                }
                f8 = fSignum * 1000;
            } else {
                f8 = f7;
            }
        }
        if (f8 == f7 || Float.isNaN(f8)) {
            return f7;
        }
        if (f8 <= f7) {
            float f14 = -f6;
            if (f8 < f14) {
                return f14;
            }
        } else if (f8 > f6) {
            f8 = f6;
        }
        return f8;
    }
}
