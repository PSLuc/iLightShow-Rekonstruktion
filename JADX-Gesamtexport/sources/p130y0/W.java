package p130y0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;
import p027e3.a;
import p124x0.D;
import p138z3.b;

/* JADX INFO: loaded from: classes.dex */
public final class W extends ViewGroup {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f14319h;
    public final HashMap i;

    public W(Context context) {
        super(context);
        setClipChildren(false);
        this.f14319h = new HashMap();
        this.i = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<Object, D> getHolderToLayoutNode() {
        return this.f14319h;
    }

    public final HashMap<D, Object> getLayoutNodeToHolder() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i3, int i6, int i7) {
        Iterator it = this.f14319h.keySet().iterator();
        if (it.hasNext()) {
            throw b.a(it);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            a.x0("widthMeasureSpec should be EXACTLY");
            throw null;
        }
        if (View.MeasureSpec.getMode(i3) != 1073741824) {
            a.x0("heightMeasureSpec should be EXACTLY");
            throw null;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i3));
        Iterator it = this.f14319h.keySet().iterator();
        if (it.hasNext()) {
            throw b.a(it);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            D d6 = (D) this.f14319h.get(childAt);
            if (childAt.isLayoutRequested() && d6 != null) {
                D.Q(d6, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
