package p040h0;

import p035g0.r;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f9245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f9246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f9247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f9248d;

    public g(c cVar, c cVar2, c cVar3, float[] fArr) {
        this.f9245a = cVar;
        this.f9246b = cVar2;
        this.f9247c = cVar3;
        this.f9248d = fArr;
    }

    public long a(long j4) {
        float fH = r.h(j4);
        float fG = r.g(j4);
        float fE = r.e(j4);
        float fD = r.d(j4);
        c cVar = this.f9246b;
        long jD = cVar.d(fH, fG, fE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE2 = cVar.e(fH, fG, fE);
        float[] fArr = this.f9248d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE2 *= fArr[2];
        }
        float f6 = fIntBitsToFloat;
        float f7 = fIntBitsToFloat2;
        return this.f9247c.f(f6, f7, fE2, fD, this.f9245a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Illegal instructions before constructor call */
    public g(c cVar, c cVar2, int i) {
        float[] fArr;
        long j4 = cVar.f9220b;
        long j6 = b.f9214a;
        c cVarA = b.a(j4, j6) ? j.a(cVar) : cVar;
        c cVarA2 = b.a(cVar2.f9220b, j6) ? j.a(cVar2) : cVar2;
        if (i == 3) {
            boolean zA = b.a(cVar.f9220b, j6);
            boolean zA2 = b.a(cVar2.f9220b, j6);
            if (!(zA && zA2) && (zA || zA2)) {
                cVar = zA ? cVar : cVar2;
                float[] fArrA = j.f9254e;
                s sVar = ((q) cVar).f9265d;
                float[] fArrA2 = zA ? sVar.a() : fArrA;
                fArrA = zA2 ? sVar.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            } else {
                fArr = null;
            }
        } else {
            fArr = null;
        }
        this(cVar2, cVarA, cVarA2, fArr);
    }
}
