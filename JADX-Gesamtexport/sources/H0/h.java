package H0;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class h {
    public static /* synthetic */ WindowInsetsAnimation.Bounds g(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation h(int i, Interpolator interpolator, long j4) {
        return new WindowInsetsAnimation(i, interpolator, j4);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation i(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* synthetic */ void l() {
    }
}
