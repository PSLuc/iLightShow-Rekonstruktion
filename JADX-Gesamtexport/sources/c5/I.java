package c5;

/* JADX INFO: loaded from: classes.dex */
public final class I extends f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final I f7399c = new I(J.f7400a);

    @Override // c5.AbstractC0475a
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        E4.k.f("<this>", iArr);
        return iArr.length;
    }

    @Override // c5.r, c5.AbstractC0475a
    public final void f(b5.a aVar, int i, Object obj) {
        H h6 = (H) obj;
        E4.k.f("builder", h6);
        int iN = aVar.n(this.f7449b, i);
        h6.b(h6.d() + 1);
        int[] iArr = h6.f7397a;
        int i3 = h6.f7398b;
        h6.f7398b = i3 + 1;
        iArr[i3] = iN;
    }

    @Override // c5.AbstractC0475a
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        E4.k.f("<this>", iArr);
        H h6 = new H();
        h6.f7397a = iArr;
        h6.f7398b = iArr.length;
        h6.b(10);
        return h6;
    }

    @Override // c5.f0
    public final Object j() {
        return new int[0];
    }

    @Override // c5.f0
    public final void k(b5.b bVar, Object obj, int i) {
        int[] iArr = (int[]) obj;
        E4.k.f("encoder", bVar);
        E4.k.f("content", iArr);
        for (int i3 = 0; i3 < i; i3++) {
            ((p081p0.c) bVar).d0(i3, iArr[i3], this.f7449b);
        }
    }
}
