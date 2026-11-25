package p080p;

import p089q4.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f10735a;

    static {
        long[] jArr = C.f10714a;
        int iF = C.f(0);
        int iMax = iF > 0 ? Math.max(7, C.e(iF)) : 0;
        if (iMax != 0) {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            k.k0(jArr);
        }
        int i = iMax >> 3;
        long j4 = 255 << ((iMax & 7) << 3);
        jArr[i] = (jArr[i] & (~j4)) | j4;
        float[] fArr = new float[iMax];
        f10735a = new float[0];
    }
}
