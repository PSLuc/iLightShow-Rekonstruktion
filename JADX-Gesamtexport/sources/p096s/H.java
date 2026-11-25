package p096s;

import B.C0003b0;
import D4.e;
import N.C0208d;
import N.C0217h0;
import N.C0222k;
import N.C0230o;
import N.C0235q0;
import N.InterfaceC0203a0;
import N.U;
import P.d;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f11848a = new d(new E[16]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0217h0 f11849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0217h0 f11851d;

    public H() {
        Boolean bool = Boolean.FALSE;
        U u6 = U.f3673m;
        this.f11849b = C0208d.K(bool, u6);
        this.f11850c = Long.MIN_VALUE;
        this.f11851d = C0208d.K(Boolean.TRUE, u6);
    }

    public final void a(int i, C0230o c0230o) {
        c0230o.X(-318043801);
        if ((((c0230o.h(this) ? 4 : 2) | i) & 3) == 2 && c0230o.B()) {
            c0230o.P();
        } else {
            Object objK = c0230o.K();
            U u6 = C0222k.f3714a;
            if (objK == u6) {
                objK = C0208d.K(null, U.f3673m);
                c0230o.f0(objK);
            }
            InterfaceC0203a0 interfaceC0203a0 = (InterfaceC0203a0) objK;
            if (((Boolean) this.f11851d.getValue()).booleanValue() || ((Boolean) this.f11849b.getValue()).booleanValue()) {
                c0230o.V(1719915818);
                boolean zH = c0230o.h(this);
                Object objK2 = c0230o.K();
                if (zH || objK2 == u6) {
                    objK2 = new G(interfaceC0203a0, this, null);
                    c0230o.f0(objK2);
                }
                C0208d.e((e) objK2, c0230o, this);
                c0230o.p(false);
            } else {
                c0230o.V(1721436120);
                c0230o.p(false);
            }
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0003b0(i, 19, this);
        }
    }
}
