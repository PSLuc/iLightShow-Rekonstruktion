package c5;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n0 f7470c = new n0(o0.f7473a);

    @Override // c5.AbstractC0475a
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        E4.k.f("<this>", sArr);
        return sArr.length;
    }

    @Override // c5.r, c5.AbstractC0475a
    public final void f(b5.a aVar, int i, Object obj) {
        m0 m0Var = (m0) obj;
        E4.k.f("builder", m0Var);
        short sL = aVar.l(this.f7449b, i);
        m0Var.b(m0Var.d() + 1);
        short[] sArr = m0Var.f7467a;
        int i3 = m0Var.f7468b;
        m0Var.f7468b = i3 + 1;
        sArr[i3] = sL;
    }

    @Override // c5.AbstractC0475a
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        E4.k.f("<this>", sArr);
        m0 m0Var = new m0();
        m0Var.f7467a = sArr;
        m0Var.f7468b = sArr.length;
        m0Var.b(10);
        return m0Var;
    }

    @Override // c5.f0
    public final Object j() {
        return new short[0];
    }

    @Override // c5.f0
    public final void k(b5.b bVar, Object obj, int i) {
        short[] sArr = (short[]) obj;
        E4.k.f("encoder", bVar);
        E4.k.f("content", sArr);
        for (int i3 = 0; i3 < i; i3++) {
            short s6 = sArr[i3];
            p081p0.c cVar = (p081p0.c) bVar;
            C0484e0 c0484e0 = this.f7449b;
            E4.k.f("descriptor", c0484e0);
            cVar.a0(c0484e0, i3);
            cVar.g(s6);
        }
    }
}
