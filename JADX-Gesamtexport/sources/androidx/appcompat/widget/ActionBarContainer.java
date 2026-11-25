package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.nanjoran.ilightshow.R;
import p045i1.A;
import p045i1.ViewTreeObserverOnGlobalLayoutListenerC0756q;
import p057l.AbstractC0798k0;
import p057l.C0777a;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6406h;
    public View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f6407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f6408k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f6409l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f6410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f6411n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f6412o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f6413p;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0777a c0777a = new C0777a(this);
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
        setBackground(c0777a);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f9192a);
        boolean z5 = false;
        this.f6408k = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f6409l = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f6413p = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f6411n = true;
            this.f6410m = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f6411n ? !(this.f6408k != null || this.f6409l != null) : this.f6410m == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f6408k;
        if (drawable != null && drawable.isStateful()) {
            this.f6408k.setState(getDrawableState());
        }
        Drawable drawable2 = this.f6409l;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f6409l.setState(getDrawableState());
        }
        Drawable drawable3 = this.f6410m;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f6410m.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f6408k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f6409l;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f6410m;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.i = findViewById(R.id.action_bar);
        this.f6407j = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f6406h || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i3, int i6, int i7) {
        super.onLayout(z5, i, i3, i6, i7);
        boolean z6 = true;
        if (this.f6411n) {
            Drawable drawable = this.f6410m;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z6 = false;
            }
        } else {
            if (this.f6408k == null) {
                z6 = false;
            } else if (this.i.getVisibility() == 0) {
                this.f6408k.setBounds(this.i.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
            } else {
                View view = this.f6407j;
                if (view == null || view.getVisibility() != 0) {
                    this.f6408k.setBounds(0, 0, 0, 0);
                } else {
                    this.f6408k.setBounds(this.f6407j.getLeft(), this.f6407j.getTop(), this.f6407j.getRight(), this.f6407j.getBottom());
                }
            }
            this.f6412o = false;
        }
        if (z6) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i3) {
        int i6;
        if (this.i == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i6 = this.f6413p) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i6, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i3);
        if (this.i == null) {
            return;
        }
        View.MeasureSpec.getMode(i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f6408k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f6408k);
        }
        this.f6408k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.i;
            if (view != null) {
                this.f6408k.setBounds(view.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
            }
        }
        boolean z5 = false;
        if (!this.f6411n ? !(this.f6408k != null || this.f6409l != null) : this.f6410m == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f6410m;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f6410m);
        }
        this.f6410m = drawable;
        boolean z5 = this.f6411n;
        boolean z6 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z5 && (drawable2 = this.f6410m) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z5 ? !(this.f6408k != null || this.f6409l != null) : this.f6410m == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f6409l;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f6409l);
        }
        this.f6409l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f6412o && this.f6409l != null) {
                throw null;
            }
        }
        boolean z5 = false;
        if (!this.f6411n ? !(this.f6408k != null || this.f6409l != null) : this.f6410m == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(AbstractC0798k0 abstractC0798k0) {
    }

    public void setTransitioning(boolean z5) {
        this.f6406h = z5;
        setDescendantFocusability(z5 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z5 = i == 0;
        Drawable drawable = this.f6408k;
        if (drawable != null) {
            drawable.setVisible(z5, false);
        }
        Drawable drawable2 = this.f6409l;
        if (drawable2 != null) {
            drawable2.setVisible(z5, false);
        }
        Drawable drawable3 = this.f6410m;
        if (drawable3 != null) {
            drawable3.setVisible(z5, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f6408k;
        boolean z5 = this.f6411n;
        if (drawable == drawable2 && !z5) {
            return true;
        }
        if (drawable == this.f6409l && this.f6412o) {
            return true;
        }
        return (drawable == this.f6410m && z5) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
