package p096s;

import D4.c;
import E4.l;
import N.V0;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements V0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m0 f12011h;
    public l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l f12012j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j0 f12013k;

    /* JADX WARN: Multi-variable type inference failed */
    public i0(j0 j0Var, m0 m0Var, c cVar, c cVar2) {
        this.f12013k = j0Var;
        this.f12011h = m0Var;
        this.i = (l) cVar;
        this.f12012j = (l) cVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r1v4, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r4v1, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r4v4, types: [D4.c, E4.l] */
    public final void c(k0 k0Var) {
        Object objInvoke = this.f12012j.invoke(k0Var.c());
        boolean zG = this.f12013k.f12024c.g();
        m0 m0Var = this.f12011h;
        if (zG) {
            m0Var.h(this.f12012j.invoke(k0Var.b()), objInvoke, (InterfaceC0932z) this.i.invoke(k0Var));
        } else {
            m0Var.i(objInvoke, (InterfaceC0932z) this.i.invoke(k0Var));
        }
    }

    @Override // N.V0
    public final Object getValue() {
        c(this.f12013k.f12024c.f());
        return this.f12011h.f12041q.getValue();
    }
}
