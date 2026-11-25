package V0;

import N.C0230o;
import N.C0247x;
import N.InterfaceC0203a0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5416h;
    public final /* synthetic */ InterfaceC0203a0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, InterfaceC0203a0 interfaceC0203a0) {
        super(2);
        this.f5416h = i;
        this.i = interfaceC0203a0;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        p084p4.x xVar = p084p4.x.f10867a;
        InterfaceC0203a0 interfaceC0203a0 = this.i;
        int i = 0;
        switch (this.f5416h) {
            case 0:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    ((D4.e) interfaceC0203a0.getValue()).d(c0230o, 0);
                }
                break;
            case 1:
                C0230o c0230o2 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    p006b.a.h(E0.i.a(Z.l.f5957a, false, c.i), V.b.c(-533674951, new d(i, interfaceC0203a0), c0230o2), c0230o2, 48);
                }
                break;
            default:
                C0230o c0230o3 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o3.B()) {
                    c0230o3.P();
                } else {
                    C0247x c0247x = l.f5436a;
                    ((D4.e) interfaceC0203a0.getValue()).d(c0230o3, 0);
                }
                break;
        }
        return xVar;
    }
}
