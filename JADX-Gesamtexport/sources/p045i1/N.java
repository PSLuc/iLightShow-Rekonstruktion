package p045i1;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f9412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Interpolator f9413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9414c;

    public N(Interpolator interpolator, long j4) {
        this.f9413b = interpolator;
        this.f9414c = j4;
    }

    public long a() {
        return this.f9414c;
    }

    public float b() {
        Interpolator interpolator = this.f9413b;
        return interpolator != null ? interpolator.getInterpolation(this.f9412a) : this.f9412a;
    }

    public void c(float f6) {
        this.f9412a = f6;
    }
}
