package c5;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v0 f7498c = new v0(w0.f7504a);

    @Override // c5.AbstractC0475a
    public final int d(Object obj) {
        int[] iArr = ((p084p4.r) obj).f10861h;
        E4.k.f("$this$collectionSize", iArr);
        return iArr.length;
    }

    @Override // c5.r, c5.AbstractC0475a
    public final void f(b5.a aVar, int i, Object obj) {
        u0 u0Var = (u0) obj;
        E4.k.f("builder", u0Var);
        int iQ = aVar.v(this.f7449b, i).q();
        u0Var.b(u0Var.d() + 1);
        int[] iArr = u0Var.f7494a;
        int i3 = u0Var.f7495b;
        u0Var.f7495b = i3 + 1;
        iArr[i3] = iQ;
    }

    @Override // c5.AbstractC0475a
    public final Object g(Object obj) {
        int[] iArr = ((p084p4.r) obj).f10861h;
        E4.k.f("$this$toBuilder", iArr);
        u0 u0Var = new u0();
        u0Var.f7494a = iArr;
        u0Var.f7495b = iArr.length;
        u0Var.b(10);
        return u0Var;
    }

    @Override // c5.f0
    public final Object j() {
        return new p084p4.r(new int[0]);
    }

    @Override // c5.f0
    public final void k(b5.b bVar, Object obj, int i) {
        int[] iArr = ((p084p4.r) obj).f10861h;
        E4.k.f("encoder", bVar);
        for (int i3 = 0; i3 < i; i3++) {
            ((p081p0.c) bVar).c0(this.f7449b, i3).j(iArr[i3]);
        }
    }
}
