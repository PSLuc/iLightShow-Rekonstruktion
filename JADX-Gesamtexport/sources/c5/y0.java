package c5;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y0 f7512c = new y0(z0.f7515a);

    @Override // c5.AbstractC0475a
    public final int d(Object obj) {
        long[] jArr = ((p084p4.t) obj).f10863h;
        E4.k.f("$this$collectionSize", jArr);
        return jArr.length;
    }

    @Override // c5.r, c5.AbstractC0475a
    public final void f(b5.a aVar, int i, Object obj) {
        x0 x0Var = (x0) obj;
        E4.k.f("builder", x0Var);
        long jD = aVar.v(this.f7449b, i).d();
        x0Var.b(x0Var.d() + 1);
        long[] jArr = x0Var.f7508a;
        int i3 = x0Var.f7509b;
        x0Var.f7509b = i3 + 1;
        jArr[i3] = jD;
    }

    @Override // c5.AbstractC0475a
    public final Object g(Object obj) {
        long[] jArr = ((p084p4.t) obj).f10863h;
        E4.k.f("$this$toBuilder", jArr);
        x0 x0Var = new x0();
        x0Var.f7508a = jArr;
        x0Var.f7509b = jArr.length;
        x0Var.b(10);
        return x0Var;
    }

    @Override // c5.f0
    public final Object j() {
        return new p084p4.t(new long[0]);
    }

    @Override // c5.f0
    public final void k(b5.b bVar, Object obj, int i) {
        long[] jArr = ((p084p4.t) obj).f10863h;
        E4.k.f("encoder", bVar);
        for (int i3 = 0; i3 < i; i3++) {
            ((p081p0.c) bVar).c0(this.f7449b, i3).m(jArr[i3]);
        }
    }
}
