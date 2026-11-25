package p040h0;

import E4.k;
import java.util.Arrays;
import p035g0.H;
import p035g0.r;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f9242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q f9243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f9244g;

    public f(q qVar, q qVar2) {
        float[] fArrH;
        super(qVar2, qVar, qVar2, null);
        this.f9242e = qVar;
        this.f9243f = qVar2;
        s sVar = qVar2.f9265d;
        s sVar2 = qVar.f9265d;
        boolean zD = j.d(sVar2, sVar);
        float[] fArrH2 = qVar.i;
        float[] fArrG = qVar2.f9270j;
        if (zD) {
            fArrH = j.h(fArrG, fArrH2);
        } else {
            float[] fArrA = sVar2.a();
            s sVar3 = qVar2.f9265d;
            float[] fArrA2 = sVar3.a();
            s sVar4 = j.f9251b;
            boolean zD2 = j.d(sVar2, sVar4);
            float[] fArr = j.f9254e;
            float[] fArr2 = a.f9212b.f9213a;
            if (!zD2) {
                float[] fArrCopyOf = Arrays.copyOf(fArr, 3);
                k.e("copyOf(this, size)", fArrCopyOf);
                fArrH2 = j.h(j.c(fArr2, fArrA, fArrCopyOf), fArrH2);
            }
            if (!j.d(sVar3, sVar4)) {
                float[] fArrCopyOf2 = Arrays.copyOf(fArr, 3);
                k.e("copyOf(this, size)", fArrCopyOf2);
                fArrG = j.g(j.h(j.c(fArr2, fArrA2, fArrCopyOf2), qVar2.i));
            }
            fArrH = j.h(fArrG, fArrH2);
        }
        this.f9244g = fArrH;
    }

    @Override // p040h0.g
    public final long a(long j4) {
        float fH = r.h(j4);
        float fG = r.g(j4);
        float fE = r.e(j4);
        float fD = r.d(j4);
        m mVar = this.f9242e.f9276p;
        float fB = (float) mVar.b(fH);
        float fB2 = (float) mVar.b(fG);
        float fB3 = (float) mVar.b(fE);
        float[] fArr = this.f9244g;
        float f6 = (fArr[6] * fB3) + (fArr[3] * fB2) + (fArr[0] * fB);
        float f7 = (fArr[7] * fB3) + (fArr[4] * fB2) + (fArr[1] * fB);
        float f8 = (fArr[8] * fB3) + (fArr[5] * fB2) + (fArr[2] * fB);
        q qVar = this.f9243f;
        float fB4 = (float) qVar.f9273m.b(f6);
        m mVar2 = qVar.f9273m;
        return H.b(fB4, (float) mVar2.b(f7), (float) mVar2.b(f8), fD, qVar);
    }
}
