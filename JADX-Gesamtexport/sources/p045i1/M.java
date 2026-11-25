package p045i1;

import android.view.WindowInsetsAnimation;

/* JADX INFO: loaded from: classes.dex */
public final class M extends N {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WindowInsetsAnimation f9411d;

    public M(WindowInsetsAnimation windowInsetsAnimation) {
        super(null, 0L);
        this.f9411d = windowInsetsAnimation;
    }

    @Override // p045i1.N
    public final long a() {
        return this.f9411d.getDurationMillis();
    }

    @Override // p045i1.N
    public final float b() {
        return this.f9411d.getInterpolatedFraction();
    }

    @Override // p045i1.N
    public final void c(float f6) {
        this.f9411d.setFraction(f6);
    }
}
