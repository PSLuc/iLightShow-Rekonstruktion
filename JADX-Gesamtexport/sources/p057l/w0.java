package p057l;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends TouchDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f10145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f10146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f10147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f10148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10150f;

    public w0(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f10149e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f10146b = rect3;
        Rect rect4 = new Rect();
        this.f10148d = rect4;
        Rect rect5 = new Rect();
        this.f10147c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i = -scaledTouchSlop;
        rect4.inset(i, i);
        rect5.set(rect2);
        this.f10145a = view;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        boolean z6;
        int x6 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z7 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z6 = this.f10150f;
                if (z6 && !this.f10148d.contains(x6, y2)) {
                    z7 = z6;
                    z5 = false;
                }
            } else if (action != 3) {
                z5 = true;
                z7 = false;
            } else {
                z6 = this.f10150f;
                this.f10150f = false;
            }
            z7 = z6;
            z5 = true;
        } else if (this.f10146b.contains(x6, y2)) {
            this.f10150f = true;
            z5 = true;
        } else {
            z5 = true;
            z7 = false;
        }
        if (!z7) {
            return false;
        }
        Rect rect = this.f10147c;
        View view = this.f10145a;
        if (!z5 || rect.contains(x6, y2)) {
            motionEvent.setLocation(x6 - rect.left, y2 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
