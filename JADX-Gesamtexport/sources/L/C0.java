package L;

import N.C0208d;
import N.C0230o;

/* JADX INFO: loaded from: classes.dex */
public final class C0 extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2193h;
    public final /* synthetic */ B.k1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ V.a f2194j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0(B.k1 k1Var, V.a aVar, int i) {
        super(2);
        this.f2193h = i;
        this.i = k1Var;
        this.f2194j = aVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) throws Throwable {
        switch (this.f2193h) {
            case 0:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    C0208d.a(J0.f2342b.a(this.i), this.f2194j, c0230o, 8);
                }
                break;
            default:
                C0230o c0230o2 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    C0208d.a(J0.f2342b.a(this.i), this.f2194j, c0230o2, 8);
                }
                break;
        }
        return p084p4.x.f10867a;
    }
}
