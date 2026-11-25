package androidx.core.widget;

import B.k1;
import K.y;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.fasterxml.jackson.databind.deser.std.d0;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import p035g0.C0715p;
import p045i1.A;
import p045i1.AbstractC0753n;
import p045i1.AbstractC0754o;
import p045i1.AbstractC0758t;
import p045i1.C0742c;
import p045i1.C0755p;
import p045i1.D;
import p045i1.F;
import p045i1.InterfaceC0747h;
import p045i1.InterfaceC0748i;
import p045i1.ViewTreeObserverOnGlobalLayoutListenerC0756q;
import p070n1.c;
import p070n1.f;
import p070n1.g;
import p070n1.h;
import p070n1.i;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0748i {
    public static final float I = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final f J = new f();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final int[] f6760K = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int[] f6761A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f6762B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f6763C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public i f6764D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final k1 f6765E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final y f6766F;
    public float G;
    public final C0742c H;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f6767h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f6768j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final OverScroller f6769k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final EdgeEffect f6770l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final EdgeEffect f6771m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6772n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f6773o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f6774p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f6775q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f6776r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public VelocityTracker f6777s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6778t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6779u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f6780v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f6781w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f6782x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6783y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int[] f6784z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.nanjoran.ilightshow.R.attr.nestedScrollViewStyle);
        this.f6768j = new Rect();
        this.f6773o = true;
        this.f6774p = false;
        this.f6775q = null;
        this.f6776r = false;
        this.f6779u = true;
        this.f6783y = -1;
        this.f6784z = new int[2];
        this.f6761A = new int[2];
        this.H = new C0742c(getContext(), new C0715p(14, this));
        int i = Build.VERSION.SDK_INT;
        this.f6770l = i >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f6771m = i >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f6767h = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f6769k = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f6780v = viewConfiguration.getScaledTouchSlop();
        this.f6781w = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f6782x = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6760K, com.nanjoran.ilightshow.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f6765E = new k1();
        y yVar = new y();
        yVar.f2030a = this;
        this.f6766F = yVar;
        setNestedScrollingEnabled(true);
        A.a(this, J);
    }

    public static boolean k(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && k((View) parent, nestedScrollView);
    }

    @Override // p045i1.InterfaceC0747h
    public final void a(View view, View view2, int i, int i3) {
        k1 k1Var = this.f6765E;
        if (i3 == 1) {
            k1Var.f352b = i;
        } else {
            k1Var.f351a = i;
        }
        u(2, i3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // p045i1.InterfaceC0747h
    public final void b(View view, int i) {
        k1 k1Var = this.f6765E;
        if (i == 1) {
            k1Var.f352b = 0;
        } else {
            k1Var.f351a = 0;
        }
        w(i);
    }

    @Override // p045i1.InterfaceC0748i
    public final void c(NestedScrollView nestedScrollView, int i, int i3, int i6, int i7, int i8, int[] iArr) {
        m(i7, i8, iArr);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0083  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e9  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i;
        int scrollRange;
        int overScrollMode;
        if (this.f6769k.isFinished()) {
            return;
        }
        this.f6769k.computeScrollOffset();
        int currY = this.f6769k.getCurrY();
        int i3 = currY - this.f6763C;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f6771m;
        EdgeEffect edgeEffect2 = this.f6770l;
        if (i3 <= 0 || d0.o(edgeEffect2) == 0.0f) {
            if (i3 < 0 && d0.o(edgeEffect) != 0.0f) {
                float f6 = height;
                iRound = Math.round(d0.x(edgeEffect, (i3 * 4.0f) / f6, 0.5f) * (f6 / 4.0f));
                if (iRound != i3) {
                    edgeEffect.finish();
                }
            }
            int i6 = i3;
            this.f6763C = currY;
            iArr = this.f6761A;
            iArr[1] = 0;
            this.f6766F.c(0, i6, 1, iArr, null);
            i = i6 - iArr[1];
            scrollRange = getScrollRange();
            if (i != 0) {
                int scrollY = getScrollY();
                o(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i7 = i - scrollY2;
                iArr[1] = 0;
                this.f6766F.d(0, scrollY2, 0, i7, this.f6784z, 1, iArr);
                i = i7 - iArr[1];
            }
            if (i != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f6769k.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f6769k.getCurrVelocity());
                    }
                }
                this.f6769k.abortAnimation();
                w(1);
            }
            if (this.f6769k.isFinished()) {
                w(1);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(d0.x(edgeEffect2, ((-i3) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i3) {
            edgeEffect2.finish();
        }
        i3 -= iRound;
        int i8 = i3;
        this.f6763C = currY;
        iArr = this.f6761A;
        iArr[1] = 0;
        this.f6766F.c(0, i8, 1, iArr, null);
        i = i8 - iArr[1];
        scrollRange = getScrollRange();
        if (i != 0) {
            int scrollY3 = getScrollY();
            o(i, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i9 = i - scrollY4;
            iArr[1] = 0;
            this.f6766F.d(0, scrollY4, 0, i9, this.f6784z, 1, iArr);
            i = i9 - iArr[1];
        }
        if (i != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i < 0) {
                    if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f6769k.getCurrVelocity());
                    }
                } else if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.f6769k.getCurrVelocity());
                }
            } else if (i < 0) {
                if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.f6769k.getCurrVelocity());
                }
            } else if (edgeEffect.isFinished()) {
                edgeEffect.onAbsorb((int) this.f6769k.getCurrVelocity());
            }
            this.f6769k.abortAnimation();
            w(1);
        }
        if (this.f6769k.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            w(1);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override // p045i1.InterfaceC0747h
    public final void d(int i, int i3, int[] iArr, int i6) {
        this.f6766F.c(i, i3, i6, iArr, null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zJ;
        if (!super.dispatchKeyEvent(keyEvent)) {
            this.f6768j.setEmpty();
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                    if (keyEvent.getAction() != 0) {
                        zJ = false;
                    } else {
                        int keyCode = keyEvent.getKeyCode();
                        if (keyCode == 19) {
                            zJ = keyEvent.isAltPressed() ? j(33) : g(33);
                        } else if (keyCode != 20) {
                            if (keyCode == 62) {
                                p(keyEvent.isShiftPressed() ? 33 : 130);
                            } else if (keyCode == 92) {
                                zJ = j(33);
                            } else if (keyCode == 93) {
                                zJ = j(130);
                            } else if (keyCode == 122) {
                                p(33);
                            } else if (keyCode == 123) {
                                p(130);
                            }
                            zJ = false;
                        } else {
                            zJ = keyEvent.isAltPressed() ? j(130) : g(130);
                        }
                    }
                } else if (isFocused() || keyEvent.getKeyCode() == 4) {
                    zJ = false;
                } else {
                    View viewFindFocus = findFocus();
                    if (viewFindFocus == this) {
                        viewFindFocus = null;
                    }
                    View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                    if (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) {
                        zJ = false;
                    } else {
                        zJ = true;
                    }
                }
            } else if (isFocused()) {
                zJ = false;
            } else {
                zJ = false;
            }
            if (!zJ) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f6, float f7, boolean z5) {
        ViewParent viewParentE;
        y yVar = this.f6766F;
        if (yVar.f2031b && (viewParentE = yVar.e(0)) != null) {
            try {
                return F.a(viewParentE, (NestedScrollView) yVar.f2030a, f6, f7, z5);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentE);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f6, float f7) {
        return this.f6766F.b(f6, f7);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i3, int[] iArr, int[] iArr2) {
        return this.f6766F.c(i, i3, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i3, int i6, int i7, int[] iArr) {
        return this.f6766F.d(i, i3, i6, i7, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f6770l;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (g.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (g.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f6771m;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (g.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (g.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // p045i1.InterfaceC0747h
    public final void e(NestedScrollView nestedScrollView, int i, int i3, int i6, int i7, int i8) {
        m(i7, i8, null);
    }

    @Override // p045i1.InterfaceC0747h
    public final boolean f(View view, View view2, int i, int i3) {
        return (i & 2) != 0;
    }

    public final boolean g(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !l(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            r(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f6768j;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            r(h(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !l(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        k1 k1Var = this.f6765E;
        return k1Var.f352b | k1Var.f351a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.G == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.G = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.G;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i6 = rect.bottom;
        if (i6 > i3 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i3, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i6 >= i3) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f6766F.e(0) != null;
    }

    public final void i(int i) {
        if (getChildCount() > 0) {
            this.f6769k.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            u(2, 1);
            this.f6763C = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f6766F.f2031b;
    }

    public final boolean j(int i) {
        int childCount;
        boolean z5 = i == 130;
        int height = getHeight();
        Rect rect = this.f6768j;
        rect.top = 0;
        rect.bottom = height;
        if (z5 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return q(i, rect.top, rect.bottom);
    }

    public final boolean l(View view, int i, int i3) {
        Rect rect = this.f6768j;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i3;
    }

    public final void m(int i, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f6766F.d(0, scrollY2, 0, i - scrollY2, null, i3, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i3, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f6783y) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f6772n = (int) motionEvent.getY(i);
            this.f6783y = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f6777s;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int i, int i3, int i6, int i7) {
        int i8;
        boolean z5;
        int i9;
        boolean z6;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i10 = i6 + i;
        if (i3 <= 0 && i3 >= 0) {
            i8 = i3;
            z5 = false;
        } else {
            i8 = 0;
            z5 = true;
        }
        if (i10 <= i7) {
            if (i10 < 0) {
                i9 = 0;
            } else {
                i9 = i10;
                z6 = false;
            }
            if (z6 && this.f6766F.e(1) == null) {
                this.f6769k.springBack(i8, i9, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i8, i9);
            return !z5 || z6;
        }
        i9 = i7;
        z6 = true;
        if (z6) {
            this.f6769k.springBack(i8, i9, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i8, i9);
        if (z5) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6774p = false;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:53:0x00db  */
    /* JADX WARN: Code duplicated, block: B:65:0x0104  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39, types: [int] */
    /* JADX WARN: Type inference failed for: r2v41 */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i;
        int width;
        boolean z5;
        int i3;
        int i6;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z6;
        VelocityTracker velocityTracker;
        float yVelocity;
        float f6;
        long j4;
        float f7;
        float fSqrt;
        int i7;
        ?? r6;
        if (motionEvent.getAction() != 8 || this.f6776r) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i = 9;
            axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            axisValue = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            i = 26;
        } else {
            axisValue = 0.0f;
            i = 0;
            width = 0;
        }
        if (axisValue == 0.0f) {
            return false;
        }
        r(-((int) (getVerticalScrollFactorCompat() * axisValue)), width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i == 0) {
            return true;
        }
        C0742c c0742c = this.H;
        c0742c.getClass();
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i8 = c0742c.f9448f;
        int[] iArr = c0742c.f9450h;
        if (i8 == source && c0742c.f9449g == deviceId && c0742c.f9447e == i) {
            z5 = true;
            z6 = false;
            i3 = 20;
            i6 = 0;
        } else {
            Context context = c0742c.f9443a;
            z5 = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            i3 = 20;
            int source2 = motionEvent.getSource();
            int i9 = Build.VERSION.SDK_INT;
            i6 = 0;
            if (i9 >= 34) {
                scaledMinimumFlingVelocity = D.b(viewConfiguration, deviceId2, i, source2);
            } else {
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i, source2) == null) {
                    scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                } else {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    }
                }
            }
            iArr[0] = scaledMinimumFlingVelocity;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i9 >= 34) {
                scaledMaximumFlingVelocity = D.a(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if ((device2 == null || device2.getMotionRange(i, source3) == null) ? false : true) {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                } else {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            c0742c.f9448f = source;
            c0742c.f9449g = deviceId;
            c0742c.f9447e = i;
            z6 = true;
        }
        if (iArr[i6] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker2 = c0742c.f9445c;
            if (velocityTracker2 == null) {
                return z5;
            }
            velocityTracker2.recycle();
            c0742c.f9445c = null;
            return z5;
        }
        if (c0742c.f9445c == null) {
            c0742c.f9445c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker3 = c0742c.f9445c;
        Map map = AbstractC0754o.f9461a;
        velocityTracker3.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = AbstractC0754o.f9461a;
            if (!map2.containsKey(velocityTracker3)) {
                map2.put(velocityTracker3, new C0755p());
            }
            C0755p c0755p = (C0755p) map2.get(velocityTracker3);
            c0755p.getClass();
            long eventTime = motionEvent.getEventTime();
            int i10 = c0755p.f9465d;
            long[] jArr = c0755p.f9463b;
            if (i10 != 0 && eventTime - jArr[c0755p.f9466e] > 40) {
                c0755p.f9465d = i6;
                c0755p.f9464c = 0.0f;
            }
            int i11 = (c0755p.f9466e + 1) % 20;
            c0755p.f9466e = i11;
            int i12 = c0755p.f9465d;
            if (i12 != i3) {
                c0755p.f9465d = i12 + 1;
            }
            c0755p.f9462a[i11] = motionEvent.getAxisValue(26);
            jArr[c0755p.f9466e] = eventTime;
        }
        float f8 = Float.MAX_VALUE;
        velocityTracker3.computeCurrentVelocity(1000, Float.MAX_VALUE);
        C0755p c0755p2 = (C0755p) AbstractC0754o.f9461a.get(velocityTracker3);
        if (c0755p2 != null) {
            int i13 = c0755p2.f9465d;
            if (i13 < 2) {
                velocityTracker = velocityTracker3;
                f7 = Float.MAX_VALUE;
                i7 = 1000;
                fSqrt = 0.0f;
            } else {
                int i14 = c0755p2.f9466e;
                int i15 = ((i14 + 20) - (i13 - 1)) % 20;
                long[] jArr2 = c0755p2.f9463b;
                long j6 = jArr2[i14];
                while (true) {
                    j4 = jArr2[i15];
                    if (j6 - j4 <= 100) {
                        break;
                    }
                    c0755p2.f9465d--;
                    i15 = (i15 + 1) % 20;
                }
                int i16 = c0755p2.f9465d;
                if (i16 < 2) {
                    velocityTracker = velocityTracker3;
                    f7 = Float.MAX_VALUE;
                    i7 = 1000;
                    fSqrt = 0.0f;
                } else {
                    float[] fArr = c0755p2.f9462a;
                    if (i16 == 2) {
                        int i17 = (i15 + 1) % 20;
                        long j7 = jArr2[i17];
                        if (j4 == j7) {
                            velocityTracker = velocityTracker3;
                            f7 = Float.MAX_VALUE;
                            i7 = 1000;
                            fSqrt = 0.0f;
                        } else {
                            velocityTracker = velocityTracker3;
                            f7 = Float.MAX_VALUE;
                            i7 = 1000;
                            fSqrt = fArr[i17] / (j7 - j4);
                        }
                    } else {
                        float f9 = 0.0f;
                        int i18 = 0;
                        int i19 = 0;
                        ?? r16 = z5;
                        while (true) {
                            if (i18 >= c0755p2.f9465d - 1) {
                                break;
                            }
                            int i20 = i18 + i15;
                            long j8 = jArr2[i20 % 20];
                            int i21 = (i20 + 1) % 20;
                            if (jArr2[i21] == j8) {
                                r6 = r16;
                            } else {
                                i19++;
                                float fSqrt2 = (f9 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f9) * 2.0f));
                                float f10 = fArr[i21] / (jArr2[i21] - j8);
                                float fAbs = (Math.abs(f10) * (f10 - fSqrt2)) + f9;
                                r6 = r16;
                                if (i19 == r6) {
                                    fAbs *= 0.5f;
                                }
                                f9 = fAbs;
                            }
                            i18 += r6;
                            f8 = f8;
                            r16 = r6;
                            velocityTracker3 = velocityTracker3;
                        }
                        velocityTracker = velocityTracker3;
                        f7 = f8;
                        fSqrt = ((float) Math.sqrt(Math.abs(f9) * 2.0f)) * (f9 < 0.0f ? -1.0f : 1.0f);
                        i7 = 1000;
                    }
                }
            }
            float f11 = fSqrt * i7;
            c0755p2.f9464c = f11;
            if (f11 < (-Math.abs(f7))) {
                c0755p2.f9464c = -Math.abs(f7);
            } else if (c0755p2.f9464c > Math.abs(f7)) {
                c0755p2.f9464c = Math.abs(f7);
            }
        } else {
            velocityTracker = velocityTracker3;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            yVelocity = AbstractC0753n.a(velocityTracker, i);
        } else {
            VelocityTracker velocityTracker4 = velocityTracker;
            if (i == 0) {
                yVelocity = velocityTracker4.getXVelocity();
            } else if (i == 1) {
                yVelocity = velocityTracker4.getYVelocity();
            } else {
                C0755p c0755p3 = (C0755p) AbstractC0754o.f9461a.get(velocityTracker4);
                yVelocity = (c0755p3 == null || i != 26) ? 0.0f : c0755p3.f9464c;
            }
        }
        NestedScrollView nestedScrollView = (NestedScrollView) c0742c.f9444b.i;
        float f12 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
        float fSignum = Math.signum(f12);
        if (z6 || (fSignum != Math.signum(c0742c.f9446d) && fSignum != 0.0f)) {
            nestedScrollView.f6769k.abortAnimation();
        }
        if (Math.abs(f12) < iArr[0]) {
            return true;
        }
        int i22 = iArr[1];
        float fMax = Math.max(-i22, Math.min(f12, i22));
        if (fMax == 0.0f) {
            f6 = 0.0f;
        } else {
            nestedScrollView.f6769k.abortAnimation();
            nestedScrollView.i((int) fMax);
            f6 = fMax;
        }
        c0742c.f9446d = f6;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:70:0x0115  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int iFindPointerIndex;
        int action = motionEvent.getAction();
        boolean z5 = true;
        if (action == 2 && this.f6776r) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y2 = (int) motionEvent.getY();
            int x6 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 < childAt.getTop() - scrollY || y2 >= childAt.getBottom() - scrollY || x6 < childAt.getLeft() || x6 >= childAt.getRight()) {
                    if (!v(motionEvent) && this.f6769k.isFinished()) {
                        z5 = false;
                    }
                    this.f6776r = z5;
                    velocityTracker = this.f6777s;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f6777s = null;
                    }
                } else {
                    this.f6772n = y2;
                    this.f6783y = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f6777s;
                    if (velocityTracker3 == null) {
                        this.f6777s = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f6777s.addMovement(motionEvent);
                    this.f6769k.computeScrollOffset();
                    if (!v(motionEvent) && this.f6769k.isFinished()) {
                        z5 = false;
                    }
                    this.f6776r = z5;
                    u(2, 0);
                }
            } else {
                if (!v(motionEvent)) {
                    z5 = false;
                }
                this.f6776r = z5;
                velocityTracker = this.f6777s;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f6777s = null;
                }
            }
        } else if (i == 1) {
            this.f6776r = false;
            this.f6783y = -1;
            velocityTracker2 = this.f6777s;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f6777s = null;
            }
            if (this.f6769k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else if (i == 2) {
            int i3 = this.f6783y;
            if (i3 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i3)) != -1) {
                int y6 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y6 - this.f6772n) > this.f6780v && (2 & getNestedScrollAxes()) == 0) {
                    this.f6776r = true;
                    this.f6772n = y6;
                    if (this.f6777s == null) {
                        this.f6777s = VelocityTracker.obtain();
                    }
                    this.f6777s.addMovement(motionEvent);
                    this.f6762B = 0;
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
        } else if (i == 3) {
            this.f6776r = false;
            this.f6783y = -1;
            velocityTracker2 = this.f6777s;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f6777s = null;
            }
            if (this.f6769k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else if (i == 6) {
            n(motionEvent);
        }
        return this.f6776r;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i3, int i6, int i7) {
        int measuredHeight;
        super.onLayout(z5, i, i3, i6, i7);
        int i8 = 0;
        this.f6773o = false;
        View view = this.f6775q;
        if (view != null && k(view, this)) {
            View view2 = this.f6775q;
            Rect rect = this.f6768j;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        this.f6775q = null;
        if (!this.f6774p) {
            if (this.f6764D != null) {
                scrollTo(getScrollX(), this.f6764D.f10535h);
                this.f6764D = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i7 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i8 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i8 != scrollY) {
                scrollTo(getScrollX(), i8);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f6774p = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        if (this.f6778t && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f7, boolean z5) {
        if (z5) {
            return false;
        }
        dispatchNestedFling(0.0f, f7, true);
        i((int) f7);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f7) {
        return this.f6766F.b(f6, f7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i3, int[] iArr) {
        this.f6766F.c(i, i3, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i3, int i6, int i7) {
        m(i7, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i3, boolean z5, boolean z6) {
        super.scrollTo(i, i3);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus != null && l(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        this.f6764D = iVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        iVar.f10535h = getScrollY();
        return iVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i3, int i6, int i7) {
        super.onScrollChanged(i, i3, i6, i7);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i3, int i6, int i7) {
        super.onSizeChanged(i, i3, i6, i7);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !l(viewFindFocus, 0, i7)) {
            return;
        }
        Rect rect = this.f6768j;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iH = h(rect);
        if (iH != 0) {
            if (this.f6779u) {
                t(false, 0, iH);
            } else {
                scrollBy(0, iH);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f6777s == null) {
            this.f6777s = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f6762B = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f6 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f6762B);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f6771m;
            EdgeEffect edgeEffect2 = this.f6770l;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f6777s;
                velocityTracker.computeCurrentVelocity(1000, this.f6782x);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f6783y);
                if (Math.abs(yVelocity) >= this.f6781w) {
                    if (d0.o(edgeEffect2) != 0.0f) {
                        if (s(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            i(-yVelocity);
                        }
                    } else if (d0.o(edgeEffect) != 0.0f) {
                        int i = -yVelocity;
                        if (s(edgeEffect, i)) {
                            edgeEffect.onAbsorb(i);
                        } else {
                            i(i);
                        }
                    } else {
                        int i3 = -yVelocity;
                        float f7 = i3;
                        if (!this.f6766F.b(0.0f, f7)) {
                            dispatchNestedFling(0.0f, f7, true);
                            i(i3);
                        }
                    }
                } else if (this.f6769k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f6783y = -1;
                this.f6776r = false;
                VelocityTracker velocityTracker2 = this.f6777s;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f6777s = null;
                }
                w(0);
                this.f6770l.onRelease();
                this.f6771m.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f6783y);
                if (iFindPointerIndex != -1) {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    int i6 = this.f6772n - y2;
                    float x6 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i6 / getHeight();
                    if (d0.o(edgeEffect2) != 0.0f) {
                        float f8 = -d0.x(edgeEffect2, -height, x6);
                        if (d0.o(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f6 = f8;
                    } else if (d0.o(edgeEffect) != 0.0f) {
                        float fX = d0.x(edgeEffect, height, 1.0f - x6);
                        if (d0.o(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f6 = fX;
                    }
                    int iRound = Math.round(f6 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i7 = i6 - iRound;
                    if (!this.f6776r && Math.abs(i7) > this.f6780v) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f6776r = true;
                        i7 = i7 > 0 ? i7 - this.f6780v : i7 + this.f6780v;
                    }
                    if (this.f6776r) {
                        int iR = r(i7, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f6772n = y2 - iR;
                        this.f6762B += iR;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f6776r && getChildCount() > 0 && this.f6769k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f6783y = -1;
                this.f6776r = false;
                VelocityTracker velocityTracker3 = this.f6777s;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f6777s = null;
                }
                w(0);
                this.f6770l.onRelease();
                this.f6771m.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f6772n = (int) motionEvent.getY(actionIndex);
                this.f6783y = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                n(motionEvent);
                this.f6772n = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f6783y));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f6776r && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f6769k.isFinished()) {
                this.f6769k.abortAnimation();
                w(1);
            }
            int y6 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f6772n = y6;
            this.f6783y = pointerId;
            u(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f6777s;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final void p(int i) {
        boolean z5 = i == 130;
        int height = getHeight();
        Rect rect = this.f6768j;
        if (z5) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i3 = rect.top;
        int i6 = height + i3;
        rect.bottom = i6;
        q(i, i3, i6);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean q(int i, int i3, int i6) {
        boolean z5;
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = height + scrollY;
        boolean z6 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z7 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = focusables.get(i8);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i3 < bottom && top < i6) {
                boolean z8 = i3 < top && bottom < i6;
                if (view == null) {
                    view = view2;
                    z7 = z8;
                } else {
                    boolean z9 = (z6 && top < view.getTop()) || (!z6 && bottom > view.getBottom());
                    if (z7) {
                        if (z8 && z9) {
                            view = view2;
                        }
                    } else if (z8) {
                        view = view2;
                        z7 = true;
                    } else if (z9) {
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i3 < scrollY || i6 > i7) {
            r(z6 ? i3 - scrollY : i6 - i7, 0, 1, true);
            z5 = true;
        } else {
            z5 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z5;
    }

    public final int r(int i, int i3, int i6, boolean z5) {
        int i7;
        int i8;
        boolean z6;
        VelocityTracker velocityTracker;
        if (i6 == 1) {
            u(2, i6);
        }
        boolean zC = this.f6766F.c(0, i, i6, this.f6761A, this.f6784z);
        int[] iArr = this.f6761A;
        int[] iArr2 = this.f6784z;
        if (zC) {
            i7 = i - iArr[1];
            i8 = iArr2[1];
        } else {
            i7 = i;
            i8 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z7 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z5;
        boolean z8 = o(i7, 0, scrollY, scrollRange) && this.f6766F.e(i6) == null;
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f6766F.d(0, scrollY2, 0, i7 - scrollY2, this.f6784z, i6, iArr);
        int i9 = i8 + iArr2[1];
        int i10 = i7 - iArr[1];
        int i11 = scrollY + i10;
        EdgeEffect edgeEffect = this.f6771m;
        EdgeEffect edgeEffect2 = this.f6770l;
        if (i11 < 0) {
            if (z7) {
                d0.x(edgeEffect2, (-i10) / getHeight(), i3 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i11 > scrollRange && z7) {
            d0.x(edgeEffect, i10 / getHeight(), 1.0f - (i3 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z6 = z8;
        } else {
            postInvalidateOnAnimation();
            z6 = false;
        }
        if (z6 && i6 == 0 && (velocityTracker = this.f6777s) != null) {
            velocityTracker.clear();
        }
        if (i6 == 1) {
            w(i6);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i9;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f6773o) {
            this.f6775q = view2;
        } else {
            Rect rect = this.f6768j;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iH = h(rect);
        boolean z6 = iH != 0;
        if (z6) {
            if (z5) {
                scrollBy(0, iH);
                return z6;
            }
            t(false, 0, iH);
        }
        return z6;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z5) {
        VelocityTracker velocityTracker;
        if (z5 && (velocityTracker = this.f6777s) != null) {
            velocityTracker.recycle();
            this.f6777s = null;
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f6773o = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fO = d0.o(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f6 = this.f6767h * 0.015f;
        double dLog = Math.log(fAbs / f6);
        double d6 = I;
        return ((float) (Math.exp((d6 / (d6 - 1.0d)) * dLog) * ((double) f6))) < fO;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i3 < 0) {
                i3 = 0;
            } else if (height + i3 > height2) {
                i3 = height2 - height;
            }
            if (i == getScrollX() && i3 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i3);
        }
    }

    public void setFillViewport(boolean z5) {
        if (z5 != this.f6778t) {
            this.f6778t = z5;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z5) {
        y yVar = this.f6766F;
        if (yVar.f2031b) {
            ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
            AbstractC0758t.z((NestedScrollView) yVar.f2030a);
        }
        yVar.f2031b = z5;
    }

    public void setOnScrollChangeListener(h hVar) {
    }

    public void setSmoothScrollingEnabled(boolean z5) {
        this.f6779u = z5;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return u(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final void t(boolean z5, int i, int i3) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.i > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f6769k.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z5) {
                u(2, 1);
            } else {
                w(1);
            }
            this.f6763C = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f6769k.isFinished()) {
                this.f6769k.abortAnimation();
                w(1);
            }
            scrollBy(i, i3);
        }
        this.i = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean u(int i, int i3) {
        boolean zF;
        y yVar = this.f6766F;
        if (yVar.e(i3) != null) {
            return true;
        }
        if (!yVar.f2031b) {
            return false;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) yVar.f2030a;
        View view = nestedScrollView;
        for (ViewParent parent = nestedScrollView.getParent(); parent != null; parent = parent.getParent()) {
            boolean z5 = parent instanceof InterfaceC0747h;
            if (z5) {
                zF = ((InterfaceC0747h) parent).f(view, nestedScrollView, i, i3);
            } else if (i3 == 0) {
                try {
                    zF = F.f(parent, view, nestedScrollView, i);
                } catch (AbstractMethodError unused) {
                    Objects.toString(parent);
                    zF = false;
                }
            } else {
                zF = false;
            }
            if (zF) {
                if (i3 == 0) {
                    yVar.f2032c = parent;
                } else if (i3 == 1) {
                    yVar.f2033d = parent;
                }
                if (z5) {
                    ((InterfaceC0747h) parent).a(view, nestedScrollView, i, i3);
                } else if (i3 == 0) {
                    try {
                        F.e(parent, view, nestedScrollView, i);
                    } catch (AbstractMethodError unused2) {
                        Objects.toString(parent);
                    }
                }
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z5;
        EdgeEffect edgeEffect = this.f6770l;
        if (d0.o(edgeEffect) != 0.0f) {
            d0.x(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z5 = true;
        } else {
            z5 = false;
        }
        EdgeEffect edgeEffect2 = this.f6771m;
        if (d0.o(edgeEffect2) == 0.0f) {
            return z5;
        }
        d0.x(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i) {
        y yVar = this.f6766F;
        ViewParent viewParentE = yVar.e(i);
        if (viewParentE != null) {
            boolean z5 = viewParentE instanceof InterfaceC0747h;
            NestedScrollView nestedScrollView = (NestedScrollView) yVar.f2030a;
            if (z5) {
                ((InterfaceC0747h) viewParentE).b(nestedScrollView, i);
            } else if (i == 0) {
                try {
                    F.g(viewParentE, nestedScrollView);
                } catch (AbstractMethodError unused) {
                    Objects.toString(viewParentE);
                }
            }
            if (i == 0) {
                yVar.f2032c = null;
            } else {
                if (i != 1) {
                    return;
                }
                yVar.f2033d = null;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
