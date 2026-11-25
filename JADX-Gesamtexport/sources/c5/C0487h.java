package c5;

/* JADX INFO: renamed from: c5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0487h extends f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0487h f7454c = new C0487h(C0488i.f7456a);

    @Override // c5.AbstractC0475a
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        E4.k.f("<this>", bArr);
        return bArr.length;
    }

    @Override // c5.r, c5.AbstractC0475a
    public final void f(b5.a aVar, int i, Object obj) {
        C0486g c0486g = (C0486g) obj;
        E4.k.f("builder", c0486g);
        byte bP = aVar.p(this.f7449b, i);
        c0486g.b(c0486g.d() + 1);
        byte[] bArr = c0486g.f7450a;
        int i3 = c0486g.f7451b;
        c0486g.f7451b = i3 + 1;
        bArr[i3] = bP;
    }

    @Override // c5.AbstractC0475a
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        E4.k.f("<this>", bArr);
        C0486g c0486g = new C0486g();
        c0486g.f7450a = bArr;
        c0486g.f7451b = bArr.length;
        c0486g.b(10);
        return c0486g;
    }

    @Override // c5.f0
    public final Object j() {
        return new byte[0];
    }

    @Override // c5.f0
    public final void k(b5.b bVar, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        E4.k.f("encoder", bVar);
        E4.k.f("content", bArr);
        for (int i3 = 0; i3 < i; i3++) {
            byte b6 = bArr[i3];
            p081p0.c cVar = (p081p0.c) bVar;
            C0484e0 c0484e0 = this.f7449b;
            E4.k.f("descriptor", c0484e0);
            cVar.a0(c0484e0, i3);
            cVar.h(b6);
        }
    }
}
