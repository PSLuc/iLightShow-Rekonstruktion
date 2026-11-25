package p057l;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements View.OnTouchListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0788f0 f10039h;

    public Z(C0788f0 c0788f0) {
        this.f10039h = c0788f0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0810s c0810s;
        int action = motionEvent.getAction();
        int x6 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        C0788f0 c0788f0 = this.f10039h;
        if (action == 0 && (c0810s = c0788f0.f10051C) != null && c0810s.isShowing() && x6 >= 0 && x6 < c0788f0.f10051C.getWidth() && y2 >= 0 && y2 < c0788f0.f10051C.getHeight()) {
            c0788f0.f10069y.postDelayed(c0788f0.f10065u, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        c0788f0.f10069y.removeCallbacks(c0788f0.f10065u);
        return false;
    }
}
