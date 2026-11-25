package p045i1;

import android.view.VelocityTracker;

/* JADX INFO: renamed from: i1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0753n {
    public static float a(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static float b(VelocityTracker velocityTracker, int i, int i3) {
        return velocityTracker.getAxisVelocity(i, i3);
    }

    public static boolean c(VelocityTracker velocityTracker, int i) {
        return velocityTracker.isAxisSupported(i);
    }
}
