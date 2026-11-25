package p091r0;

import android.view.MotionEvent;
import p081p0.c;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f11485a = new f();

    public final long a(MotionEvent motionEvent, int i) {
        return c.y(motionEvent.getRawX(i), motionEvent.getRawY(i));
    }
}
