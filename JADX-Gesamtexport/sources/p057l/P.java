package p057l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import p052k.a;

/* JADX INFO: loaded from: classes.dex */
public final class P implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10018h;
    public final /* synthetic */ a i;

    public /* synthetic */ P(a aVar, int i) {
        this.f10018h = i;
        this.i = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10018h) {
            case 0:
                ViewParent parent = this.i.f9802k.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                a aVar = this.i;
                aVar.a();
                View view = aVar.f9802k;
                if (view.isEnabled() && !view.isLongClickable() && aVar.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    aVar.f9805n = true;
                    break;
                }
                break;
        }
    }
}
