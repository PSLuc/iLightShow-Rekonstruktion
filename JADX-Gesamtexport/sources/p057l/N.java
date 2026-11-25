package p057l;

import L2.o;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.nanjoran.ilightshow.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p014c1.a;
import p025e1.b;
import p070n1.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class N extends ListView {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f10006h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10007j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10008k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10009l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10010m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public L f10011n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f10012o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f10013p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10014q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e f10015r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public o f10016s;

    public N(Context context, boolean z5) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f10006h = new Rect();
        this.i = 0;
        this.f10007j = 0;
        this.f10008k = 0;
        this.f10009l = 0;
        this.f10013p = z5;
        setCacheColorHint(0);
    }

    public final int a(int i, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = 0;
        View view = null;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i8 = layoutParams.height;
            view.measure(i, i8 > 0 ? View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i3) {
                return i3;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x014c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0161  */
    /* JADX WARN: Code duplicated, block: B:85:0x0166  */
    /* JADX WARN: Code duplicated, block: B:87:0x016a  */
    /* JADX WARN: Code duplicated, block: B:89:0x017c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0180  */
    /* JADX WARN: Code duplicated, block: B:93:0x0184  */
    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    public final boolean b(MotionEvent motionEvent, int i) {
        boolean z5;
        boolean zA;
        View childAt;
        View childAt2;
        e eVar;
        int actionMasked = motionEvent.getActionMasked();
        boolean z6 = true;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z5 = true;
            } else if (actionMasked != 3) {
                z5 = true;
                z6 = false;
            } else {
                z5 = false;
                z6 = false;
            }
            if (z5 || z6) {
                this.f10014q = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f10010m - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z5) {
                if (this.f10015r == null) {
                    this.f10015r = new e(this);
                }
                e eVar2 = this.f10015r;
                boolean z7 = eVar2.f10533w;
                eVar2.f10533w = true;
                eVar2.onTouch(this, motionEvent);
            } else {
                eVar = this.f10015r;
                if (eVar != null) {
                    if (eVar.f10533w) {
                        eVar.d();
                    }
                    eVar.f10533w = false;
                }
            }
            return z5;
        }
        z5 = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z5 = false;
            z6 = false;
        } else {
            int x6 = (int) motionEvent.getX(iFindPointerIndex);
            int y2 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x6, y2);
            if (iPointToPosition != -1) {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f6 = x6;
                float f7 = y2;
                this.f10014q = true;
                I.a(this, f6, f7);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i3 = this.f10010m;
                if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f10010m = iPointToPosition;
                I.a(childAt3, f6 - childAt3.getLeft(), f7 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z8 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z8) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f10006h;
                rect.set(left, top, right, bottom);
                rect.left -= this.i;
                rect.top -= this.f10007j;
                rect.right += this.f10008k;
                rect.bottom += this.f10009l;
                if (b.a()) {
                    zA = K.a(this);
                } else {
                    Field field = M.f10005a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e6) {
                            e6.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z9 = !zA;
                    if (b.a()) {
                        K.b(this, z9);
                    } else {
                        Field field2 = M.f10005a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z9));
                            } catch (IllegalAccessException e7) {
                                e7.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z8) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    a.e(selector, fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    a.e(selector2, f6, f7);
                }
                L l6 = this.f10011n;
                if (l6 != null) {
                    l6.i = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z6 = false;
                z5 = true;
            }
        }
        if (z5) {
            this.f10014q = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f10010m - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f10014q = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f10010m - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z5) {
            if (this.f10015r == null) {
                this.f10015r = new e(this);
            }
            e eVar3 = this.f10015r;
            boolean z10 = eVar3.f10533w;
            eVar3.f10533w = true;
            eVar3.onTouch(this, motionEvent);
        } else {
            eVar = this.f10015r;
            if (eVar != null) {
                if (eVar.f10533w) {
                    eVar.d();
                }
                eVar.f10533w = false;
            }
        }
        return z5;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f10006h;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f10016s != null) {
            return;
        }
        super.drawableStateChanged();
        L l6 = this.f10011n;
        if (l6 != null) {
            l6.i = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f10014q && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f10013p || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f10013p || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f10013p || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f10013p && this.f10012o) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f10016s = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f10016s == null) {
            o oVar = new o(6, this);
            this.f10016s = oVar;
            post(oVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !J.f9989d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        J.f9986a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        J.f9987b.invoke(this, Integer.valueOf(iPointToPosition));
                        J.f9988c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e6) {
                        e6.printStackTrace();
                    } catch (InvocationTargetException e7) {
                        e7.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f10014q && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f10010m = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        o oVar = this.f10016s;
        if (oVar != null) {
            N n6 = (N) oVar.i;
            n6.f10016s = null;
            n6.removeCallbacks(oVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z5) {
        this.f10012o = z5;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        L l6 = null;
        if (drawable != null) {
            L l7 = new L();
            Drawable drawable2 = l7.f9992h;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            l7.f9992h = drawable;
            drawable.setCallback(l7);
            l7.i = true;
            l6 = l7;
        }
        this.f10011n = l6;
        super.setSelector(l6);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.i = rect.left;
        this.f10007j = rect.top;
        this.f10008k = rect.right;
        this.f10009l = rect.bottom;
    }
}
