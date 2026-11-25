package c5;

/* JADX INFO: renamed from: c5.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0498t extends f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0498t f7489c = new C0498t(C0499u.f7492a);

    @Override // c5.AbstractC0475a
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        E4.k.f("<this>", dArr);
        return dArr.length;
    }

    @Override // c5.r, c5.AbstractC0475a
    public final void f(b5.a aVar, int i, Object obj) {
        C0497s c0497s = (C0497s) obj;
        E4.k.f("builder", c0497s);
        double dO = aVar.o(this.f7449b, i);
        c0497s.b(c0497s.d() + 1);
        double[] dArr = c0497s.f7486a;
        int i3 = c0497s.f7487b;
        c0497s.f7487b = i3 + 1;
        dArr[i3] = dO;
    }

    @Override // c5.AbstractC0475a
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        E4.k.f("<this>", dArr);
        C0497s c0497s = new C0497s();
        c0497s.f7486a = dArr;
        c0497s.f7487b = dArr.length;
        c0497s.b(10);
        return c0497s;
    }

    @Override // c5.f0
    public final Object j() {
        return new double[0];
    }

    @Override // c5.f0
    public final void k(b5.b bVar, Object obj, int i) {
        double[] dArr = (double[]) obj;
        E4.k.f("encoder", bVar);
        E4.k.f("content", dArr);
        for (int i3 = 0; i3 < i; i3++) {
            ((p081p0.c) bVar).Z(this.f7449b, i3, dArr[i3]);
        }
    }
}
