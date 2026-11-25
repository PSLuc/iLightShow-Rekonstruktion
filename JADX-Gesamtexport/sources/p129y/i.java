package p129y;

import B.c1;
import D4.a;
import P4.AbstractC0336x;
import Z.n;
import p030f0.d;
import p081p0.c;
import p084p4.x;
import p112v.C0987k;
import p113v0.InterfaceC1033p;
import p124x0.AbstractC1098f;
import p124x0.InterfaceC1113v;
import p124x0.Y;
import p124x0.p0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends n implements a, InterfaceC1113v, p0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final q5.n f14171w = new q5.n(11);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0987k f14172u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14173v;

    public static final d y0(i iVar, Y y2, a aVar) {
        d dVar;
        if (iVar.f5969t && iVar.f14173v) {
            Y yR = AbstractC1098f.r(iVar);
            if (!y2.M0().f5969t) {
                y2 = null;
            }
            if (y2 != null && (dVar = (d) aVar.invoke()) != null) {
                d dVarO = yR.o(y2, false);
                return dVar.h(c.y(dVarO.f8839a, dVarO.f8840b));
            }
        }
        return null;
    }

    @Override // p129y.a
    public final Object M(Y y2, a aVar, p122w4.c cVar) throws Throwable {
        Object objD = AbstractC0336x.d(new h(this, y2, aVar, new c1(this, y2, aVar), null), cVar);
        return objD == v4.a.f13292h ? objD : x.f10867a;
    }

    @Override // p124x0.InterfaceC1113v
    public final void Q(InterfaceC1033p interfaceC1033p) {
        this.f14173v = true;
    }

    @Override // p124x0.p0
    public final Object o() {
        return f14171w;
    }

    @Override // Z.n
    public final boolean o0() {
        return false;
    }
}
