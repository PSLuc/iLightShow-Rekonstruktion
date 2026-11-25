package L0;

import B.C0005c0;
import D.x;
import P4.AbstractC0336x;
import P4.j0;
import S1.h0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W2.g f3016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f3017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f3018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f3019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final W2.g f3020e;

    public e(W2.g gVar, a aVar) {
        x xVar = f.f3021a;
        x xVar2 = f.f3021a;
        p111u4.j jVar = p111u4.j.f12751h;
        h hVar = new h();
        Q4.c cVar = O0.i.f4417a;
        g gVar2 = h.f3022a;
        gVar2.getClass();
        AbstractC0336x.a(h0.u(gVar2, cVar).o(jVar).o(new j0(null)));
        W2.g gVar3 = new W2.g(6);
        this.f3016a = gVar;
        this.f3017b = aVar;
        this.f3018c = xVar;
        this.f3019d = hVar;
        this.f3020e = gVar3;
        new A2.e(13, this);
    }

    public final r a(q qVar) {
        x xVar = this.f3018c;
        C0005c0 c0005c0 = new C0005c0(this, 17, qVar);
        synchronized (((W2.g) xVar.i)) {
            r rVar = (r) ((K0.b) xVar.f707j).a(qVar);
            if (rVar != null) {
                if (rVar.i) {
                    return rVar;
                }
            }
            try {
                r rVar2 = (r) c0005c0.invoke(new C0005c0(xVar, 18, qVar));
                synchronized (((W2.g) xVar.i)) {
                    if (((K0.b) xVar.f707j).a(qVar) == null && rVar2.i) {
                        ((K0.b) xVar.f707j).b(qVar, rVar2);
                    }
                }
                return rVar2;
            } catch (Exception e6) {
                throw new IllegalStateException("Could not load font", e6);
            }
        }
    }

    public final r b(p pVar, k kVar, int i, int i3) {
        a aVar = this.f3017b;
        aVar.getClass();
        int i6 = aVar.f3015h;
        k kVar2 = (i6 == 0 || i6 == Integer.MAX_VALUE) ? kVar : new k(p081p0.c.O(kVar.f3028h + i6, 1, 1000));
        this.f3016a.getClass();
        return a(new q(pVar, kVar2, i, i3, null));
    }
}
