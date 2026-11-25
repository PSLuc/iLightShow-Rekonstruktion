package N3;

import P4.InterfaceC0335w;
import com.nanjoran.ilightshow.Services.C0688o0;
import com.nanjoran.ilightshow.Views.PaywallViewRoute;

/* JADX INFO: loaded from: classes.dex */
public final class F0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ F1.I f3952l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(F1.I i, p111u4.d dVar) {
        super(2, dVar);
        this.f3952l = i;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new F0(this.f3952l, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        F0 f6 = (F0) b((InterfaceC0335w) obj, (p111u4.d) obj2);
        p084p4.x xVar = p084p4.x.f10867a;
        f6.o(xVar);
        return xVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        S1.V.O(obj);
        com.nanjoran.ilightshow.Services.M m6 = com.nanjoran.ilightshow.Services.M.f8305O;
        if (((Boolean) m6.l().f8453d.getValue()).booleanValue()) {
            F1.I i = this.f3952l;
            if (i != null) {
                F1.I.k(i, new PaywallViewRoute(false, true, 1, (E4.g) null));
            }
            C0688o0 c0688o0L = m6.l();
            c0688o0L.f8453d.setValue(Boolean.FALSE);
        }
        return p084p4.x.f10867a;
    }
}
