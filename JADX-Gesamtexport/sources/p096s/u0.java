package p096s;

import D4.c;
import G4.a;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import p084p4.g;
import p090r.C0870i;

/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f12124a = a.y(g.i, q0.f12091h);

    /* JADX WARN: Type inference failed for: r2v4, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r4v3, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r5v5, types: [D4.c, E4.l] */
    public static final j0 a(o0 o0Var, w0 w0Var, String str, C0230o c0230o, int i, int i3) {
        i0 i0Var;
        if ((i3 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zF = c0230o.f(o0Var);
        Object objK = c0230o.K();
        Object obj = C0222k.f3714a;
        if (zF || objK == obj) {
            objK = new j0(o0Var, w0Var, str);
            c0230o.f0(objK);
        }
        j0 j0Var = (j0) objK;
        boolean zF2 = c0230o.f(o0Var) | c0230o.h(j0Var);
        Object objK2 = c0230o.K();
        if (zF2 || objK2 == obj) {
            objK2 = new C0870i(o0Var, 5, j0Var);
            c0230o.f0(objK2);
        }
        C0208d.c(j0Var, (c) objK2, c0230o);
        if (o0Var.g() && (i0Var = (i0) j0Var.f12023b.getValue()) != null) {
            ?? r6 = i0Var.f12012j;
            o0 o0Var2 = j0Var.f12024c;
            i0Var.f12011h.h(r6.invoke(o0Var2.f().b()), i0Var.f12012j.invoke(o0Var2.f().c()), (InterfaceC0932z) i0Var.i.invoke(o0Var2.f()));
        }
        return j0Var;
    }

    public static final m0 b(o0 o0Var, Object obj, Object obj2, InterfaceC0932z interfaceC0932z, w0 w0Var, C0230o c0230o, int i) {
        boolean zF = c0230o.f(o0Var);
        Object objK = c0230o.K();
        Object obj3 = C0222k.f3714a;
        if (zF || objK == obj3) {
            AbstractC0924q abstractC0924q = (AbstractC0924q) w0Var.f12136a.invoke(obj2);
            abstractC0924q.d();
            objK = new m0(o0Var, obj, abstractC0924q, w0Var);
            c0230o.f0(objK);
        }
        m0 m0Var = (m0) objK;
        if (o0Var.g()) {
            m0Var.h(obj, obj2, interfaceC0932z);
        } else {
            m0Var.i(obj2, interfaceC0932z);
        }
        boolean zF2 = c0230o.f(o0Var) | c0230o.f(m0Var);
        Object objK2 = c0230o.K();
        if (zF2 || objK2 == obj3) {
            objK2 = new C0870i(o0Var, 6, m0Var);
            c0230o.f0(objK2);
        }
        C0208d.c(m0Var, (c) objK2, c0230o);
        return m0Var;
    }
}
