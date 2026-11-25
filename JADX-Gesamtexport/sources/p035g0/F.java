package p035g0;

import E4.k;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.NoWhenBranchMatchedException;
import p030f0.a;
import p030f0.d;
import p030f0.e;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public interface F {
    static void a(F f6, d dVar) {
        Path.Direction direction;
        C0706g c0706g = (C0706g) f6;
        float f7 = dVar.f8839a;
        if (!Float.isNaN(f7)) {
            float f8 = dVar.f8840b;
            if (!Float.isNaN(f8)) {
                float f9 = dVar.f8841c;
                if (!Float.isNaN(f9)) {
                    float f10 = dVar.f8842d;
                    if (!Float.isNaN(f10)) {
                        if (c0706g.f9064b == null) {
                            c0706g.f9064b = new RectF();
                        }
                        RectF rectF = c0706g.f9064b;
                        k.c(rectF);
                        rectF.set(f7, f8, f9, f10);
                        RectF rectF2 = c0706g.f9064b;
                        k.c(rectF2);
                        int iD = AbstractC0916i.d(1);
                        if (iD == 0) {
                            direction = Path.Direction.CCW;
                        } else {
                            if (iD != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            direction = Path.Direction.CW;
                        }
                        c0706g.f9063a.addRect(rectF2, direction);
                        return;
                    }
                }
            }
        }
        throw new IllegalStateException("Invalid rectangle, make sure no value is NaN");
    }

    static void b(F f6, e eVar) {
        Path.Direction direction;
        C0706g c0706g = (C0706g) f6;
        if (c0706g.f9064b == null) {
            c0706g.f9064b = new RectF();
        }
        RectF rectF = c0706g.f9064b;
        k.c(rectF);
        float f7 = eVar.f8846d;
        rectF.set(eVar.f8843a, eVar.f8844b, eVar.f8845c, f7);
        if (c0706g.f9065c == null) {
            c0706g.f9065c = new float[8];
        }
        float[] fArr = c0706g.f9065c;
        k.c(fArr);
        long j4 = eVar.f8847e;
        fArr[0] = a.b(j4);
        fArr[1] = a.c(j4);
        long j6 = eVar.f8848f;
        fArr[2] = a.b(j6);
        fArr[3] = a.c(j6);
        long j7 = eVar.f8849g;
        fArr[4] = a.b(j7);
        fArr[5] = a.c(j7);
        long j8 = eVar.f8850h;
        fArr[6] = a.b(j8);
        fArr[7] = a.c(j8);
        RectF rectF2 = c0706g.f9064b;
        k.c(rectF2);
        float[] fArr2 = c0706g.f9065c;
        k.c(fArr2);
        int iD = AbstractC0916i.d(1);
        if (iD == 0) {
            direction = Path.Direction.CCW;
        } else {
            if (iD != 1) {
                throw new NoWhenBranchMatchedException();
            }
            direction = Path.Direction.CW;
        }
        c0706g.f9063a.addRoundRect(rectF2, fArr2, direction);
    }
}
