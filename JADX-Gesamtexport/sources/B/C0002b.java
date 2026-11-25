package B;

import F.InterfaceC0070l;
import L.g2;
import L.h2;
import N.C0208d;
import N.C0230o;

/* JADX INFO: renamed from: B.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0002b extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f284h = 1;
    public final /* synthetic */ long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f285j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f286k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0002b(long j4, p123x.O o6, D4.f fVar) {
        super(2);
        this.i = j4;
        this.f285j = o6;
        this.f286k = fVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f284h) {
            case 0:
                ((Number) obj2).intValue();
                int iV = C0208d.V(1);
                long j4 = this.i;
                AbstractC0012g.a((InterfaceC0070l) this.f285j, (Z.o) this.f286k, j4, (C0230o) obj, iV);
                break;
            default:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    L.L.f(this.i, ((g2) c0230o.k(h2.f2777a)).f2757m, V.b.b(c0230o, 1327513942, new A2.d((p123x.O) this.f285j, 8, (D4.f) this.f286k)), c0230o, 384);
                }
                break;
        }
        return p084p4.x.f10867a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0002b(InterfaceC0070l interfaceC0070l, Z.o oVar, long j4, int i) {
        super(2);
        this.f285j = interfaceC0070l;
        this.f286k = oVar;
        this.i = j4;
    }
}
