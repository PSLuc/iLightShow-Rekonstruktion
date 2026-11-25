package B;

import G0.C0110f;

/* JADX INFO: renamed from: B.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0037t extends E4.l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f440h;
    public final /* synthetic */ f1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0037t(f1 f1Var, int i) {
        super(0);
        this.f440h = i;
        this.i = f1Var;
    }

    @Override // D4.a
    public final Object invoke() {
        G0.F f6;
        switch (this.f440h) {
            case 0:
                f1 f1Var = this.i;
                return Boolean.valueOf(f1Var != null ? ((Boolean) new C0037t(f1Var, 2).invoke()).booleanValue() : false);
            case 1:
                f1 f1Var2 = this.i;
                return Boolean.valueOf(f1Var2 != null ? ((Boolean) new C0037t(f1Var2, 2).invoke()).booleanValue() : false);
            default:
                f1 f1Var3 = this.i;
                C0110f c0110f = f1Var3.f317c;
                G0.G g6 = (G0.G) f1Var3.f316b.getValue();
                return Boolean.valueOf(E4.k.a(c0110f, (g6 == null || (f6 = g6.f1458a) == null) ? null : f6.f1449a));
        }
    }
}
