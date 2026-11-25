package P4;

/* JADX INFO: loaded from: classes.dex */
public final class X extends C0319f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0325l f4628p;

    public X(p111u4.d dVar, C0325l c0325l) {
        super(1, dVar);
        this.f4628p = c0325l;
    }

    @Override // P4.C0319f
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // P4.C0319f
    public final Throwable s(b0 b0Var) {
        Throwable thC;
        Object objI = this.f4628p.I();
        if (!(objI instanceof Z) || (thC = ((Z) objI).c()) == null) {
            return objI instanceof C0327n ? ((C0327n) objI).f4664a : b0Var.G();
        }
        return thC;
    }
}
