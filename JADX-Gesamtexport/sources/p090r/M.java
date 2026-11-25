package p090r;

import N.C0222k;
import N.C0230o;
import N.V0;
import p035g0.r;
import p040h0.c;
import p096s.AbstractC0914g;
import p096s.InterfaceC0932z;
import p096s.w0;
import p096s.x0;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {
    public static final V0 a(long j4, InterfaceC0932z interfaceC0932z, String str, C0230o c0230o, int i, int i3) {
        if ((i3 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        boolean zF = c0230o.f(r.f(j4));
        Object objK = c0230o.K();
        if (zF || objK == C0222k.f3714a) {
            c cVarF = r.f(j4);
            u uVar = u.i;
            v vVar = new v(0, cVarF);
            w0 w0Var = x0.f12138a;
            w0 w0Var2 = new w0(uVar, vVar);
            c0230o.f0(w0Var2);
            objK = w0Var2;
        }
        return AbstractC0914g.c(new r(j4), (w0) objK, interfaceC0932z, null, str2, c0230o, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }
}
