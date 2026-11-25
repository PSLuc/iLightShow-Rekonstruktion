package P4;

import p015c2.AbstractC0473d;

/* JADX INFO: renamed from: P4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0325l extends b0 implements InterfaceC0324k {
    public final Object d0(p122w4.c cVar) throws Throwable {
        Object objI;
        Object objT;
        int i = 1;
        do {
            objI = I();
            if (!(objI instanceof O)) {
                if (objI instanceof C0327n) {
                    throw ((C0327n) objI).f4664a;
                }
                objT = AbstractC0336x.t(objI);
            }
            v4.a aVar = v4.a.f13292h;
            return objT;
        } while (a0(objI) < 0);
        X x6 = new X(AbstractC0473d.F(cVar), this);
        x6.u();
        x6.w(new F(0, s(false, true, new S(i, x6))));
        objT = x6.t();
        v4.a aVar2 = v4.a.f13292h;
        v4.a aVar3 = v4.a.f13292h;
        return objT;
    }
}
