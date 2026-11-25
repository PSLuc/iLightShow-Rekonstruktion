package p096s;

import B.C0024m;
import D4.a;
import E4.k;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.InterfaceC0203a0;
import N.U;
import N.V0;
import R4.f;
import R4.i;
import S0.e;
import S1.h0;
import p081p0.c;

/* JADX INFO: renamed from: s.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0914g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0906b0 f11997a = AbstractC0909d.j(7, null);

    static {
        Object obj = E0.f11841a;
        new e(0.1f);
        h0.f(0.5f, 0.5f);
        c.y(0.5f, 0.5f);
    }

    public static final V0 a(float f6, v0 v0Var, C0230o c0230o) {
        return c(new e(f6), x0.f12140c, v0Var, null, "DpAnimation", c0230o, 384, 8);
    }

    public static final V0 b(float f6, v0 v0Var, C0230o c0230o, int i, int i3) {
        InterfaceC0932z interfaceC0932z;
        String str = (i3 & 8) != 0 ? "FloatAnimation" : "previewBeamWhiteAlpha";
        if (v0Var == f11997a) {
            c0230o.V(1125598679);
            boolean zC = c0230o.c(0.01f);
            Object objK = c0230o.K();
            if (zC || objK == C0222k.f3714a) {
                objK = AbstractC0909d.j(3, Float.valueOf(0.01f));
                c0230o.f0(objK);
            }
            c0230o.p(false);
            interfaceC0932z = (C0906b0) objK;
        } else {
            c0230o.V(1125708605);
            c0230o.p(false);
            interfaceC0932z = v0Var;
        }
        return c(Float.valueOf(f6), x0.f12138a, interfaceC0932z, Float.valueOf(0.01f), str, c0230o, (i << 3) & 57344, 0);
    }

    public static final V0 c(Object obj, w0 w0Var, InterfaceC0932z interfaceC0932z, Float f6, String str, C0230o c0230o, int i, int i3) {
        Object obj2 = C0222k.f3714a;
        if ((i3 & 8) != 0) {
            f6 = null;
        }
        Object objK = c0230o.K();
        if (objK == obj2) {
            objK = C0208d.K(null, U.f3673m);
            c0230o.f0(objK);
        }
        InterfaceC0203a0 interfaceC0203a0 = (InterfaceC0203a0) objK;
        Object objK2 = c0230o.K();
        if (objK2 == obj2) {
            objK2 = new C0907c(obj, w0Var, f6);
            c0230o.f0(objK2);
        }
        C0907c c0907c = (C0907c) objK2;
        InterfaceC0203a0 interfaceC0203a0N = C0208d.N(null, c0230o);
        if (f6 != null && (interfaceC0932z instanceof C0906b0)) {
            C0906b0 c0906b0 = (C0906b0) interfaceC0932z;
            if (!k.a(c0906b0.f11950c, f6)) {
                interfaceC0932z = new C0906b0(c0906b0.f11948a, c0906b0.f11949b, f6);
            }
        }
        InterfaceC0203a0 interfaceC0203a0N2 = C0208d.N(interfaceC0932z, c0230o);
        Object objK3 = c0230o.K();
        if (objK3 == obj2) {
            objK3 = i.a(-1, 0, 6);
            c0230o.f0(objK3);
        }
        f fVar = (f) objK3;
        boolean zH = c0230o.h(fVar) | c0230o.h(obj);
        Object objK4 = c0230o.K();
        if (zH || objK4 == obj2) {
            objK4 = new C0024m(fVar, 10, obj);
            c0230o.f0(objK4);
        }
        C0208d.g((a) objK4, c0230o);
        boolean zH2 = c0230o.h(fVar) | c0230o.h(c0907c) | c0230o.f(interfaceC0203a0N2) | c0230o.f(interfaceC0203a0N);
        Object objK5 = c0230o.K();
        if (zH2 || objK5 == obj2) {
            Object c0913f = new C0913f(fVar, c0907c, interfaceC0203a0N2, interfaceC0203a0N, null);
            c0230o.f0(c0913f);
            objK5 = c0913f;
        }
        C0208d.e((D4.e) objK5, c0230o, fVar);
        V0 v6 = (V0) interfaceC0203a0.getValue();
        return v6 == null ? c0907c.f11953c : v6;
    }
}
