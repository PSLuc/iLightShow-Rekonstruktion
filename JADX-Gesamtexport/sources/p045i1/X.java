package p045i1;

import android.view.WindowInsets;
import p008b1.c;

/* JADX INFO: loaded from: classes.dex */
public class X extends W {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c f9433n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c f9434o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c f9435p;

    public X(c0 c0Var, WindowInsets windowInsets) {
        super(c0Var, windowInsets);
        this.f9433n = null;
        this.f9434o = null;
        this.f9435p = null;
    }

    @Override // p045i1.Z
    public c h() {
        if (this.f9434o == null) {
            this.f9434o = c.c(this.f9427c.getMandatorySystemGestureInsets());
        }
        return this.f9434o;
    }

    @Override // p045i1.Z
    public c j() {
        if (this.f9433n == null) {
            this.f9433n = c.c(this.f9427c.getSystemGestureInsets());
        }
        return this.f9433n;
    }

    @Override // p045i1.Z
    public c l() {
        if (this.f9435p == null) {
            this.f9435p = c.c(this.f9427c.getTappableElementInsets());
        }
        return this.f9435p;
    }

    @Override // p045i1.Z
    public c0 m(int i, int i3, int i6, int i7) {
        return c0.b(null, this.f9427c.inset(i, i3, i6, i7));
    }
}
