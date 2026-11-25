package K;

import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.InterfaceC0203a0;
import p096s.AbstractC0931y;
import p096s.v0;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f2018a = new v0(15, AbstractC0931y.f12148c, 2);

    public static final e a(float f6, C0230o c0230o, int i, int i3) {
        c0230o.W(1635163520);
        boolean z5 = (i3 & 1) != 0;
        if ((i3 & 2) != 0) {
            f6 = Float.NaN;
        }
        InterfaceC0203a0 interfaceC0203a0N = C0208d.N(new p035g0.r(p035g0.r.f9085l), c0230o);
        Boolean boolValueOf = Boolean.valueOf(z5);
        S0.e eVar = new S0.e(f6);
        c0230o.W(511388516);
        boolean zF = c0230o.f(boolValueOf) | c0230o.f(eVar);
        Object objK = c0230o.K();
        if (zF || objK == C0222k.f3714a) {
            objK = new e(z5, f6, interfaceC0203a0N);
            c0230o.f0(objK);
        }
        c0230o.p(false);
        e eVar2 = (e) objK;
        c0230o.p(false);
        return eVar2;
    }
}
