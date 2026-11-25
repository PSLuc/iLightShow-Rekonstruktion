package c5;

/* JADX INFO: loaded from: classes.dex */
public final class N extends f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final N f7406c = new N(O.f7407a);

    @Override // c5.AbstractC0475a
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        E4.k.f("<this>", jArr);
        return jArr.length;
    }

    @Override // c5.r, c5.AbstractC0475a
    public final void f(b5.a aVar, int i, Object obj) {
        M m6 = (M) obj;
        E4.k.f("builder", m6);
        long jE = aVar.e(this.f7449b, i);
        m6.b(m6.d() + 1);
        long[] jArr = m6.f7404a;
        int i3 = m6.f7405b;
        m6.f7405b = i3 + 1;
        jArr[i3] = jE;
    }

    @Override // c5.AbstractC0475a
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        E4.k.f("<this>", jArr);
        M m6 = new M();
        m6.f7404a = jArr;
        m6.f7405b = jArr.length;
        m6.b(10);
        return m6;
    }

    @Override // c5.f0
    public final Object j() {
        return new long[0];
    }

    @Override // c5.f0
    public final void k(b5.b bVar, Object obj, int i) {
        long[] jArr = (long[]) obj;
        E4.k.f("encoder", bVar);
        E4.k.f("content", jArr);
        for (int i3 = 0; i3 < i; i3++) {
            ((p081p0.c) bVar).e0(this.f7449b, i3, jArr[i3]);
        }
    }
}
