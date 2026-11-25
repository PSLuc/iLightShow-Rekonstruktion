package c5;

/* JADX INFO: renamed from: c5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0483e extends f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0483e f7445c = new C0483e(C0485f.f7447a);

    @Override // c5.AbstractC0475a
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        E4.k.f("<this>", zArr);
        return zArr.length;
    }

    @Override // c5.r, c5.AbstractC0475a
    public final void f(b5.a aVar, int i, Object obj) {
        C0481d c0481d = (C0481d) obj;
        E4.k.f("builder", c0481d);
        boolean zU = aVar.u(this.f7449b, i);
        c0481d.b(c0481d.d() + 1);
        boolean[] zArr = c0481d.f7443a;
        int i3 = c0481d.f7444b;
        c0481d.f7444b = i3 + 1;
        zArr[i3] = zU;
    }

    @Override // c5.AbstractC0475a
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        E4.k.f("<this>", zArr);
        C0481d c0481d = new C0481d();
        c0481d.f7443a = zArr;
        c0481d.f7444b = zArr.length;
        c0481d.b(10);
        return c0481d;
    }

    @Override // c5.f0
    public final Object j() {
        return new boolean[0];
    }

    @Override // c5.f0
    public final void k(b5.b bVar, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        E4.k.f("encoder", bVar);
        E4.k.f("content", zArr);
        for (int i3 = 0; i3 < i; i3++) {
            ((p081p0.c) bVar).Y(this.f7449b, i3, zArr[i3]);
        }
    }
}
