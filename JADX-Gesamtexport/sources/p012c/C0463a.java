package p012c;

import E4.k;
import android.window.BackEvent;

/* JADX INFO: renamed from: c.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0463a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0463a f7132a = new C0463a();

    public final BackEvent a(float f6, float f7, float f8, int i) {
        return new BackEvent(f6, f7, f8, i);
    }

    public final float b(BackEvent backEvent) {
        k.f("backEvent", backEvent);
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        k.f("backEvent", backEvent);
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        k.f("backEvent", backEvent);
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        k.f("backEvent", backEvent);
        return backEvent.getTouchY();
    }
}
