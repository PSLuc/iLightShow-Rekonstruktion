package c5;

/* JADX INFO: renamed from: c5.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0493n extends f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0493n f7469c = new C0493n(C0494o.f7471a);

    @Override // c5.AbstractC0475a
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        E4.k.f("<this>", cArr);
        return cArr.length;
    }

    @Override // c5.r, c5.AbstractC0475a
    public final void f(b5.a aVar, int i, Object obj) {
        C0492m c0492m = (C0492m) obj;
        E4.k.f("builder", c0492m);
        char cW = aVar.w(this.f7449b, i);
        c0492m.b(c0492m.d() + 1);
        char[] cArr = c0492m.f7465a;
        int i3 = c0492m.f7466b;
        c0492m.f7466b = i3 + 1;
        cArr[i3] = cW;
    }

    @Override // c5.AbstractC0475a
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        E4.k.f("<this>", cArr);
        C0492m c0492m = new C0492m();
        c0492m.f7465a = cArr;
        c0492m.f7466b = cArr.length;
        c0492m.b(10);
        return c0492m;
    }

    @Override // c5.f0
    public final Object j() {
        return new char[0];
    }

    @Override // c5.f0
    public final void k(b5.b bVar, Object obj, int i) {
        char[] cArr = (char[]) obj;
        E4.k.f("encoder", bVar);
        E4.k.f("content", cArr);
        for (int i3 = 0; i3 < i; i3++) {
            char c6 = cArr[i3];
            p081p0.c cVar = (p081p0.c) bVar;
            C0484e0 c0484e0 = this.f7449b;
            E4.k.f("descriptor", c0484e0);
            cVar.a0(c0484e0, i3);
            cVar.o(c6);
        }
    }
}
