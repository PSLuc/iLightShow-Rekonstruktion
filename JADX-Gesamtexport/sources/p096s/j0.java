package p096s;

import D4.c;
import E4.l;
import N.C0208d;
import N.C0217h0;
import N.U;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f12022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0217h0 f12023b = C0208d.K(null, U.f3673m);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f12024c;

    public j0(o0 o0Var, w0 w0Var, String str) {
        this.f12024c = o0Var;
        this.f12022a = w0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i0 a(c cVar, c cVar2) {
        C0217h0 c0217h0 = this.f12023b;
        i0 i0Var = (i0) c0217h0.getValue();
        o0 o0Var = this.f12024c;
        if (i0Var == null) {
            Object objInvoke = cVar2.invoke(o0Var.f12056a.j());
            Object objInvoke2 = cVar2.invoke(o0Var.f12056a.j());
            w0 w0Var = this.f12022a;
            AbstractC0924q abstractC0924q = (AbstractC0924q) w0Var.f12136a.invoke(objInvoke2);
            abstractC0924q.d();
            m0 m0Var = new m0(o0Var, objInvoke, abstractC0924q, w0Var);
            i0Var = new i0(this, m0Var, cVar, cVar2);
            c0217h0.setValue(i0Var);
            o0Var.i.add(m0Var);
        }
        i0Var.f12012j = (l) cVar2;
        i0Var.i = (l) cVar;
        i0Var.c(o0Var.f());
        return i0Var;
    }
}
