package T0;

import p080p.F;
import p080p.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f5145a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile F f5146b = new F(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f5147c;

    static {
        Object[] objArr = new Object[0];
        f5147c = objArr;
        synchronized (objArr) {
            f5146b.e((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f5146b.e((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f5146b.e((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f5146b.e((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f5146b.e((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f5146b.d(0) / 100.0f) - 0.01f <= 1.03f) {
            throw new IllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
    }

    public static a a(float f6) {
        float fD;
        a cVar;
        if (f6 < 1.03f) {
            return null;
        }
        int i = (int) (f6 * 100.0f);
        a aVar = (a) f5146b.c(i);
        if (aVar != null) {
            return aVar;
        }
        F f7 = f5146b;
        if (f7.f10718h) {
            m.a(f7);
        }
        int iA = p085q.a.a(f7.f10720k, i, f7.i);
        if (iA >= 0) {
            return (a) f5146b.g(iA);
        }
        int i3 = -(iA + 1);
        int i6 = i3 - 1;
        if (i3 >= f5146b.f()) {
            c cVar2 = new c(new float[]{1.0f}, new float[]{f6});
            b(f6, cVar2);
            return cVar2;
        }
        float[] fArr = f5145a;
        if (i6 < 0) {
            cVar = new c(fArr, fArr);
            fD = 1.0f;
        } else {
            fD = f5146b.d(i6) / 100.0f;
            cVar = (a) f5146b.g(i6);
        }
        float fD2 = f5146b.d(i3) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, fD == fD2 ? 0.0f : (f6 - fD) / (fD2 - fD))) * 1.0f) + 0.0f;
        a aVar2 = (a) f5146b.g(i3);
        float[] fArr2 = new float[9];
        for (int i7 = 0; i7 < 9; i7++) {
            float f8 = fArr[i7];
            float fB = cVar.b(f8);
            fArr2[i7] = ((aVar2.b(f8) - fB) * fMax) + fB;
        }
        c cVar3 = new c(fArr, fArr2);
        b(f6, cVar3);
        return cVar3;
    }

    public static void b(float f6, c cVar) {
        synchronized (f5147c) {
            F fClone = f5146b.clone();
            fClone.e((int) (f6 * 100.0f), cVar);
            f5146b = fClone;
        }
    }
}
