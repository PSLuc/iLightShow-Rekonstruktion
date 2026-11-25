package c5;

/* JADX INFO: loaded from: classes.dex */
public final class A extends f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final A f7376c = new A(B.f7379a);

    @Override // c5.AbstractC0475a
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        E4.k.f("<this>", fArr);
        return fArr.length;
    }

    @Override // c5.r, c5.AbstractC0475a
    public final void f(b5.a aVar, int i, Object obj) {
        C0504z c0504z = (C0504z) obj;
        E4.k.f("builder", c0504z);
        float fH = aVar.h(this.f7449b, i);
        c0504z.b(c0504z.d() + 1);
        float[] fArr = c0504z.f7513a;
        int i3 = c0504z.f7514b;
        c0504z.f7514b = i3 + 1;
        fArr[i3] = fH;
    }

    @Override // c5.AbstractC0475a
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        E4.k.f("<this>", fArr);
        C0504z c0504z = new C0504z();
        c0504z.f7513a = fArr;
        c0504z.f7514b = fArr.length;
        c0504z.b(10);
        return c0504z;
    }

    @Override // c5.f0
    public final Object j() {
        return new float[0];
    }

    @Override // c5.f0
    public final void k(b5.b bVar, Object obj, int i) {
        float[] fArr = (float[]) obj;
        E4.k.f("encoder", bVar);
        E4.k.f("content", fArr);
        for (int i3 = 0; i3 < i; i3++) {
            ((p081p0.c) bVar).b0(this.f7449b, i3, fArr[i3]);
        }
    }
}
