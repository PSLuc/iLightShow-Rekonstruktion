package p130y0;

import android.view.MotionEvent;

/* JADX INFO: renamed from: y0.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1153r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1153r0 f14520a = new C1153r0();

    public final boolean a(MotionEvent motionEvent, int i) {
        float rawX = motionEvent.getRawX(i);
        if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
            return false;
        }
        float rawY = motionEvent.getRawY(i);
        return (Float.isInfinite(rawY) || Float.isNaN(rawY)) ? false : true;
    }
}
