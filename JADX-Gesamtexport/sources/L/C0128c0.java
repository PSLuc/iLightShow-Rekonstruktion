package L;

import N.C0230o;

/* JADX INFO: renamed from: L.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0128c0 extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f2642h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0128c0(long j4) {
        super(2);
        V.a aVar = N3.Q.f4084a;
        this.f2642h = j4;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        C0230o c0230o = (C0230o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
            c0230o.P();
        } else {
            G0.J jA = h2.a((g2) c0230o.k(h2.f2777a), M.g.f3197a);
            V.a aVar = N3.Q.f4084a;
            L.f(this.f2642h, jA, V.b.b(c0230o, -1771489750, new G(2, 9)), c0230o, 384);
        }
        return p084p4.x.f10867a;
    }
}
