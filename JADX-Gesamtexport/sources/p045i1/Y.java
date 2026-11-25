package p045i1;

import android.view.View;
import android.view.WindowInsets;
import p008b1.c;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends X {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final c0 f9436q = c0.b(null, WindowInsets.CONSUMED);

    public Y(c0 c0Var, WindowInsets windowInsets) {
        super(c0Var, windowInsets);
    }

    @Override // p045i1.U, p045i1.Z
    public final void d(View view) {
    }

    @Override // p045i1.U, p045i1.Z
    public c f(int i) {
        return c.c(this.f9427c.getInsets(b0.a(i)));
    }

    @Override // p045i1.U, p045i1.Z
    public c g(int i) {
        return c.c(this.f9427c.getInsetsIgnoringVisibility(b0.a(i)));
    }

    @Override // p045i1.U, p045i1.Z
    public boolean p(int i) {
        return this.f9427c.isVisible(b0.a(i));
    }
}
