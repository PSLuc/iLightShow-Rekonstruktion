package S1;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 extends d0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class f4935h;

    public f0(Class cls) {
        this.f4935h = cls;
    }

    @Override // S1.d0
    public boolean a(d0 d0Var) {
        if (d0Var.getClass() == getClass()) {
            return ((f0) d0Var).f4935h == this.f4935h;
        }
        return false;
    }
}
