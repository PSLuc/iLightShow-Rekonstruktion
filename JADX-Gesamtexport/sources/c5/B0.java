package c5;

/* JADX INFO: loaded from: classes.dex */
public final class B0 extends f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B0 f7381c = new B0(C0.f7382a);

    @Override // c5.AbstractC0475a
    public final int d(Object obj) {
        short[] sArr = ((p084p4.w) obj).f10866h;
        E4.k.f("$this$collectionSize", sArr);
        return sArr.length;
    }

    @Override // c5.r, c5.AbstractC0475a
    public final void f(b5.a aVar, int i, Object obj) {
        A0 a6 = (A0) obj;
        E4.k.f("builder", a6);
        short sX = aVar.v(this.f7449b, i).x();
        a6.b(a6.d() + 1);
        short[] sArr = a6.f7377a;
        int i3 = a6.f7378b;
        a6.f7378b = i3 + 1;
        sArr[i3] = sX;
    }

    @Override // c5.AbstractC0475a
    public final Object g(Object obj) {
        short[] sArr = ((p084p4.w) obj).f10866h;
        E4.k.f("$this$toBuilder", sArr);
        A0 a6 = new A0();
        a6.f7377a = sArr;
        a6.f7378b = sArr.length;
        a6.b(10);
        return a6;
    }

    @Override // c5.f0
    public final Object j() {
        return new p084p4.w(new short[0]);
    }

    @Override // c5.f0
    public final void k(b5.b bVar, Object obj, int i) {
        short[] sArr = ((p084p4.w) obj).f10866h;
        E4.k.f("encoder", bVar);
        for (int i3 = 0; i3 < i; i3++) {
            ((p081p0.c) bVar).c0(this.f7449b, i3).g(sArr[i3]);
        }
    }
}
