package c5;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s0 f7488c = new s0(t0.f7490a);

    @Override // c5.AbstractC0475a
    public final int d(Object obj) {
        byte[] bArr = ((p084p4.p) obj).f10859h;
        E4.k.f("$this$collectionSize", bArr);
        return bArr.length;
    }

    @Override // c5.r, c5.AbstractC0475a
    public final void f(b5.a aVar, int i, Object obj) {
        r0 r0Var = (r0) obj;
        E4.k.f("builder", r0Var);
        byte bS = aVar.v(this.f7449b, i).s();
        r0Var.b(r0Var.d() + 1);
        byte[] bArr = r0Var.f7484a;
        int i3 = r0Var.f7485b;
        r0Var.f7485b = i3 + 1;
        bArr[i3] = bS;
    }

    @Override // c5.AbstractC0475a
    public final Object g(Object obj) {
        byte[] bArr = ((p084p4.p) obj).f10859h;
        E4.k.f("$this$toBuilder", bArr);
        r0 r0Var = new r0();
        r0Var.f7484a = bArr;
        r0Var.f7485b = bArr.length;
        r0Var.b(10);
        return r0Var;
    }

    @Override // c5.f0
    public final Object j() {
        return new p084p4.p(new byte[0]);
    }

    @Override // c5.f0
    public final void k(b5.b bVar, Object obj, int i) {
        byte[] bArr = ((p084p4.p) obj).f10859h;
        E4.k.f("encoder", bVar);
        for (int i3 = 0; i3 < i; i3++) {
            ((p081p0.c) bVar).c0(this.f7449b, i3).h(bArr[i3]);
        }
    }
}
