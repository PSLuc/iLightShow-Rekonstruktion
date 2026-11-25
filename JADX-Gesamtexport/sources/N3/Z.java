package N3;

import N.C0222k;
import N.C0230o;
import N.InterfaceC0203a0;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4144h;
    public final /* synthetic */ K3.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4145j;

    public /* synthetic */ Z(K3.a aVar, InterfaceC0203a0 interfaceC0203a0, int i) {
        this.f4144h = i;
        this.i = aVar;
        this.f4145j = interfaceC0203a0;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f4144h) {
            case 0:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    L.L.a(new Y(this.i, this.f4145j, 0), null, false, null, null, null, null, null, C.i, c0230o, 805306368, 510);
                }
                break;
            default:
                C0230o c0230o2 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    c0230o2.V(1737085020);
                    Object objK = c0230o2.K();
                    if (objK == C0222k.f3714a) {
                        objK = new C0275l(7, this.f4145j);
                        c0230o2.f0(objK);
                    }
                    c0230o2.p(false);
                    S1.V.j(this.i, (D4.a) objK, c0230o2, 56);
                }
                break;
        }
        return p084p4.x.f10867a;
    }
}
