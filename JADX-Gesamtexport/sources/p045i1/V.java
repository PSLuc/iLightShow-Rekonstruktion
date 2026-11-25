package p045i1;

import android.view.WindowInsets;
import p008b1.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class V extends U {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f9432m;

    public V(c0 c0Var, WindowInsets windowInsets) {
        super(c0Var, windowInsets);
        this.f9432m = null;
    }

    @Override // p045i1.Z
    public c0 b() {
        return c0.b(null, this.f9427c.consumeStableInsets());
    }

    @Override // p045i1.Z
    public c0 c() {
        return c0.b(null, this.f9427c.consumeSystemWindowInsets());
    }

    @Override // p045i1.Z
    public final c i() {
        if (this.f9432m == null) {
            WindowInsets windowInsets = this.f9427c;
            this.f9432m = c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f9432m;
    }

    @Override // p045i1.Z
    public boolean n() {
        return this.f9427c.isConsumed();
    }
}
