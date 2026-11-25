package N3;

import L.AbstractC0169q;
import N.C0230o;
import N.InterfaceC0203a0;

/* JADX INFO: renamed from: N3.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0264f0 implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4173h;
    public final /* synthetic */ F1.I i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4174j;

    public /* synthetic */ C0264f0(F1.I i, InterfaceC0203a0 interfaceC0203a0, int i3) {
        this.f4173h = i3;
        this.i = i;
        this.f4174j = interfaceC0203a0;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f4173h) {
            case 0:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    AbstractC0169q.b(C.f3931e, null, V.b.c(-1387316598, new C0257c(this.i, 4), c0230o), V.b.c(1634234497, new C0262e0(0, this.f4174j), c0230o), null, null, c0230o, 3462, 114);
                }
                break;
            default:
                C0230o c0230o2 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    L.L.a(new A0(this.i, 0, this.f4174j), null, false, null, null, null, null, null, K.f4003e, c0230o2, 805306368, 510);
                }
                break;
        }
        return p084p4.x.f10867a;
    }
}
