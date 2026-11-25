package N3;

import N.C0217h0;
import P4.InterfaceC0335w;
import com.nanjoran.ilightshow.Services.C0688o0;
import com.nanjoran.ilightshow.Views.PaywallViewRoute;

/* JADX INFO: loaded from: classes.dex */
public final class H0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ F1.I f3962l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ defpackage.t f3963m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(F1.I i, defpackage.t tVar, p111u4.d dVar) {
        super(2, dVar);
        this.f3962l = i;
        this.f3963m = tVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new H0(this.f3962l, this.f3963m, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        H0 h1 = (H0) b((InterfaceC0335w) obj, (p111u4.d) obj2);
        p084p4.x xVar = p084p4.x.f10867a;
        h1.o(xVar);
        return xVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        S1.V.O(obj);
        C0688o0 c0688o0L = com.nanjoran.ilightshow.Services.M.f8305O.l();
        K4.e[] eVarArr = P0.f4082a;
        K4.e eVar = eVarArr[2];
        defpackage.t tVar = this.f3963m;
        boolean zBooleanValue = ((Boolean) tVar.a(eVar)).booleanValue();
        F1.I i = this.f3962l;
        if (zBooleanValue || c0688o0L.b() <= 0 || com.nanjoran.ilightshow.Services.E0.f8249o.a() == com.nanjoran.ilightshow.Services.F0.MEMBERSHIP_V3) {
            com.nanjoran.ilightshow.Services.E0 e6 = com.nanjoran.ilightshow.Services.E0.f8249o;
            if (e6.a() == com.nanjoran.ilightshow.Services.F0.NONE && c0688o0L.b() <= 0 && !c0688o0L.a()) {
                C0217h0 c0217h0 = e6.f8253l;
                if (!((Boolean) c0217h0.getValue()).booleanValue()) {
                    c0217h0.setValue(Boolean.TRUE);
                    if (i != null) {
                        F1.I.k(i, new PaywallViewRoute(false, false, 3, (E4.g) null));
                    }
                }
            }
        } else {
            if (i != null) {
                F1.I.k(i, new PaywallViewRoute(true, false, 2, (E4.g) null));
            }
            tVar.b(eVarArr[2], Boolean.TRUE);
        }
        return p084p4.x.f10867a;
    }
}
