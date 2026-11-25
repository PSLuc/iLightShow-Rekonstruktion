package G1;

import F1.C0096m;
import N.C0230o;
import N.InterfaceC0203a0;
import N.V0;
import java.util.List;
import java.util.ListIterator;
import p090r.C0867f;

/* JADX INFO: loaded from: classes.dex */
public final class z extends E4.l implements D4.g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ W.g f1676h;
    public final /* synthetic */ InterfaceC0203a0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ V0 f1677j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(W.g gVar, InterfaceC0203a0 interfaceC0203a0, V0 v6) {
        super(4);
        this.f1676h = gVar;
        this.i = interfaceC0203a0;
        this.f1677j = v6;
    }

    @Override // D4.g
    public final Object k(Object obj, Object obj2, Object obj3, Object obj4) {
        Object objPrevious;
        C0867f c0867f = (C0867f) obj;
        C0096m c0096m = (C0096m) obj2;
        C0230o c0230o = (C0230o) obj3;
        ((Number) obj4).intValue();
        if (!((Boolean) this.i.getValue()).booleanValue()) {
            List list = (List) this.f1677j.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!E4.k.a(c0096m, (C0096m) objPrevious));
            c0096m = (C0096m) objPrevious;
        }
        if (c0096m != null) {
            p081p0.c.w(c0096m, this.f1676h, V.b.c(-1263531443, new A2.d(c0096m, 5, c0867f), c0230o), c0230o, 384);
        }
        return p084p4.x.f10867a;
    }
}
