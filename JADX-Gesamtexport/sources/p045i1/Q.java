package p045i1;

import android.view.WindowInsets;
import p008b1.c;

/* JADX INFO: loaded from: classes.dex */
public class Q extends T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f9420c;

    public Q() {
        this.f9420c = new WindowInsets.Builder();
    }

    @Override // p045i1.T
    public c0 b() {
        a();
        c0 c0VarB = c0.b(null, this.f9420c.build());
        c0VarB.f9452a.q(this.f9422b);
        return c0VarB;
    }

    @Override // p045i1.T
    public void d(c cVar) {
        this.f9420c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // p045i1.T
    public void e(c cVar) {
        this.f9420c.setSystemGestureInsets(cVar.d());
    }

    @Override // p045i1.T
    public void f(c cVar) {
        this.f9420c.setSystemWindowInsets(cVar.d());
    }

    @Override // p045i1.T
    public void g(c cVar) {
        this.f9420c.setTappableElementInsets(cVar.d());
    }

    public void h(c cVar) {
        this.f9420c.setStableInsets(cVar.d());
    }

    public Q(c0 c0Var) {
        WindowInsets.Builder builder;
        super(c0Var);
        WindowInsets windowInsetsA = c0Var.a();
        if (windowInsetsA != null) {
            builder = new WindowInsets.Builder(windowInsetsA);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.f9420c = builder;
    }
}
