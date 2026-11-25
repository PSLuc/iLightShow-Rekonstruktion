package p045i1;

import H0.h;
import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public N f9415a;

    public O(int i, Interpolator interpolator, long j4) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f9415a = new M(h.h(i, interpolator, j4));
        } else {
            this.f9415a = new K(interpolator, j4);
        }
    }
}
