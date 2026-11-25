package P4;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends U4.q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ThreadLocal f4665l;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public n0(p111u4.d dVar, p111u4.i iVar) {
        o0 o0Var = o0.f4666h;
        super(dVar, iVar.J(o0Var) == null ? iVar.o(o0Var) : iVar);
        this.f4665l = new ThreadLocal();
        if (dVar.e().J(p111u4.e.f12750h) instanceof AbstractC0331s) {
            return;
        }
        Object objL = U4.a.l(iVar, null);
        U4.a.f(iVar, objL);
        h0(iVar, objL);
    }

    public final boolean g0() {
        boolean z5 = this.threadLocalIsSet && this.f4665l.get() == null;
        this.f4665l.remove();
        return !z5;
    }

    public final void h0(p111u4.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f4665l.set(new p084p4.h(iVar, obj));
    }

    @Override // U4.q, P4.b0
    public final void q(Object obj) {
        if (this.threadLocalIsSet) {
            p084p4.h hVar = (p084p4.h) this.f4665l.get();
            if (hVar != null) {
                U4.a.f((p111u4.i) hVar.f10849h, hVar.i);
            }
            this.f4665l.remove();
        }
        Object objP = AbstractC0336x.p(obj);
        p111u4.d dVar = this.f5375k;
        p111u4.i iVarE = dVar.e();
        Object objL = U4.a.l(iVarE, null);
        n0 n0VarU = objL != U4.a.f5346f ? AbstractC0336x.u(dVar, iVarE, objL) : null;
        try {
            this.f5375k.g(objP);
        } finally {
            if (n0VarU == null || n0VarU.g0()) {
                U4.a.f(iVarE, objL);
            }
        }
    }
}
