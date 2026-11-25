package androidx.appcompat.widget;

import B.k1;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import com.nanjoran.ilightshow.R;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import p015c2.AbstractC0473d;
import p045i1.A;
import p045i1.AbstractC0758t;
import p045i1.InterfaceC0747h;
import p045i1.InterfaceC0748i;
import p045i1.Q;
import p045i1.S;
import p045i1.T;
import p045i1.ViewTreeObserverOnGlobalLayoutListenerC0756q;
import p045i1.Z;
import p045i1.c0;
import p045i1.r;
import p057l.C0779b;
import p057l.C0785e;
import p057l.G;
import p057l.InterfaceC0783d;
import p057l.L0;
import p057l.RunnableC0781c;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0747h, InterfaceC0748i {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int[] f6425F = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ViewPropertyAnimator f6426A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0779b f6427B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final RunnableC0781c f6428C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final RunnableC0781c f6429D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final k1 f6430E;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6431h;
    public ContentFrameLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ActionBarContainer f6432j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public G f6433k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f6434l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6435m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6436n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f6437o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f6438p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f6439q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6440r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f6441s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f6442t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Rect f6443u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c0 f6444v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c0 f6445w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c0 f6446x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public c0 f6447y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public OverScroller f6448z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6441s = new Rect();
        this.f6442t = new Rect();
        this.f6443u = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        c0 c0Var = c0.f9451b;
        this.f6444v = c0Var;
        this.f6445w = c0Var;
        this.f6446x = c0Var;
        this.f6447y = c0Var;
        this.f6427B = new C0779b(this);
        this.f6428C = new RunnableC0781c(this, 0);
        this.f6429D = new RunnableC0781c(this, 1);
        i(context);
        this.f6430E = new k1();
    }

    public static boolean g(View view, Rect rect, boolean z5) {
        boolean z6;
        C0785e c0785e = (C0785e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0785e).leftMargin;
        int i3 = rect.left;
        if (i != i3) {
            ((ViewGroup.MarginLayoutParams) c0785e).leftMargin = i3;
            z6 = true;
        } else {
            z6 = false;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) c0785e).topMargin;
        int i7 = rect.top;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) c0785e).topMargin = i7;
            z6 = true;
        }
        int i8 = ((ViewGroup.MarginLayoutParams) c0785e).rightMargin;
        int i9 = rect.right;
        if (i8 != i9) {
            ((ViewGroup.MarginLayoutParams) c0785e).rightMargin = i9;
            z6 = true;
        }
        if (z5) {
            int i10 = ((ViewGroup.MarginLayoutParams) c0785e).bottomMargin;
            int i11 = rect.bottom;
            if (i10 != i11) {
                ((ViewGroup.MarginLayoutParams) c0785e).bottomMargin = i11;
                return true;
            }
        }
        return z6;
    }

    @Override // p045i1.InterfaceC0747h
    public final void a(View view, View view2, int i, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p045i1.InterfaceC0747h
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p045i1.InterfaceC0748i
    public final void c(NestedScrollView nestedScrollView, int i, int i3, int i6, int i7, int i8, int[] iArr) {
        e(nestedScrollView, i, i3, i6, i7, i8);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0785e;
    }

    @Override // p045i1.InterfaceC0747h
    public final void d(int i, int i3, int[] iArr, int i6) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f6434l == null || this.f6435m) {
            return;
        }
        if (this.f6432j.getVisibility() == 0) {
            translationY = (int) (this.f6432j.getTranslationY() + this.f6432j.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.f6434l.setBounds(0, translationY, getWidth(), this.f6434l.getIntrinsicHeight() + translationY);
        this.f6434l.draw(canvas);
    }

    @Override // p045i1.InterfaceC0747h
    public final void e(NestedScrollView nestedScrollView, int i, int i3, int i6, int i7, int i8) {
        if (i8 == 0) {
            onNestedScroll(nestedScrollView, i, i3, i6, i7);
        }
    }

    @Override // p045i1.InterfaceC0747h
    public final boolean f(View view, View view2, int i, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0785e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0785e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f6432j;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        k1 k1Var = this.f6430E;
        return k1Var.f352b | k1Var.f351a;
    }

    public CharSequence getTitle() {
        j();
        return ((L0) this.f6433k).f9993a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f6428C);
        removeCallbacks(this.f6429D);
        ViewPropertyAnimator viewPropertyAnimator = this.f6426A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f6425F);
        this.f6431h = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f6434l = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f6435m = context.getApplicationInfo().targetSdkVersion < 19;
        this.f6448z = new OverScroller(context);
    }

    public final void j() {
        G wrapper;
        if (this.i == null) {
            this.i = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f6432j = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof G) {
                wrapper = (G) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f6433k = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j();
        c0 c0VarB = c0.b(this, windowInsets);
        Z z5 = c0VarB.f9452a;
        boolean zG = g(this.f6432j, new Rect(z5.k().f7047a, z5.k().f7048b, z5.k().f7049c, z5.k().f7050d), false);
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
        Rect rect = this.f6441s;
        AbstractC0758t.b(this, c0VarB, rect);
        c0 c0VarM = z5.m(rect.left, rect.top, rect.right, rect.bottom);
        this.f6444v = c0VarM;
        boolean z6 = true;
        if (!this.f6445w.equals(c0VarM)) {
            this.f6445w = this.f6444v;
            zG = true;
        }
        Rect rect2 = this.f6442t;
        if (rect2.equals(rect)) {
            z6 = zG;
        } else {
            rect2.set(rect);
        }
        if (z6) {
            requestLayout();
        }
        return z5.a().f9452a.c().f9452a.b().a();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
        r.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i3, int i6, int i7) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0785e c0785e = (C0785e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = ((ViewGroup.MarginLayoutParams) c0785e).leftMargin + paddingLeft;
                int i10 = ((ViewGroup.MarginLayoutParams) c0785e).topMargin + paddingTop;
                childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        int measuredHeight;
        j();
        measureChildWithMargins(this.f6432j, i, 0, i3, 0);
        C0785e c0785e = (C0785e) this.f6432j.getLayoutParams();
        int iMax = Math.max(0, this.f6432j.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0785e).leftMargin + ((ViewGroup.MarginLayoutParams) c0785e).rightMargin);
        int iMax2 = Math.max(0, this.f6432j.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0785e).topMargin + ((ViewGroup.MarginLayoutParams) c0785e).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f6432j.getMeasuredState());
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
        boolean z5 = (getWindowSystemUiVisibility() & HueLog.LogComponent.STREAMDTLS) != 0;
        if (z5) {
            measuredHeight = this.f6431h;
            if (this.f6437o && this.f6432j.getTabContainer() != null) {
                measuredHeight += this.f6431h;
            }
        } else {
            measuredHeight = this.f6432j.getVisibility() != 8 ? this.f6432j.getMeasuredHeight() : 0;
        }
        Rect rect = this.f6441s;
        Rect rect2 = this.f6443u;
        rect2.set(rect);
        c0 c0Var = this.f6444v;
        this.f6446x = c0Var;
        if (this.f6436n || z5) {
            p008b1.c cVarB = p008b1.c.b(c0Var.f9452a.k().f7047a, this.f6446x.f9452a.k().f7048b + measuredHeight, this.f6446x.f9452a.k().f7049c, this.f6446x.f9452a.k().f7050d);
            c0 c0Var2 = this.f6446x;
            T s6 = Build.VERSION.SDK_INT >= 30 ? new S(c0Var2) : new Q(c0Var2);
            s6.f(cVarB);
            this.f6446x = s6.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f6446x = c0Var.f9452a.m(0, measuredHeight, 0, 0);
        }
        g(this.i, rect2, true);
        if (!this.f6447y.equals(this.f6446x)) {
            c0 c0Var3 = this.f6446x;
            this.f6447y = c0Var3;
            ContentFrameLayout contentFrameLayout = this.i;
            WindowInsets windowInsetsA = c0Var3.a();
            if (windowInsetsA != null) {
                WindowInsets windowInsetsA2 = r.a(contentFrameLayout, windowInsetsA);
                if (!windowInsetsA2.equals(windowInsetsA)) {
                    c0.b(contentFrameLayout, windowInsetsA2);
                }
            }
        }
        measureChildWithMargins(this.i, i, 0, i3, 0);
        C0785e c0785e2 = (C0785e) this.i.getLayoutParams();
        int iMax3 = Math.max(iMax, this.i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0785e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0785e2).rightMargin);
        int iMax4 = Math.max(iMax2, this.i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0785e2).topMargin + ((ViewGroup.MarginLayoutParams) c0785e2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.i.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f7, boolean z5) {
        if (!this.f6438p || !z5) {
            return false;
        }
        this.f6448z.fling(0, 0, 0, (int) f7, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f6448z.getFinalY() > this.f6432j.getHeight()) {
            h();
            this.f6429D.run();
        } else {
            h();
            this.f6428C.run();
        }
        this.f6439q = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f7) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i3, int i6, int i7) {
        int i8 = this.f6440r + i3;
        this.f6440r = i8;
        setActionBarHideOffset(i8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f6430E.f351a = i;
        this.f6440r = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f6432j.getVisibility() != 0) {
            return false;
        }
        return this.f6438p;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f6438p || this.f6439q) {
            return;
        }
        if (this.f6440r <= this.f6432j.getHeight()) {
            h();
            postDelayed(this.f6428C, 600L);
        } else {
            h();
            postDelayed(this.f6429D, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.f6432j.setTranslationY(-Math.max(0, Math.min(i, this.f6432j.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0783d interfaceC0783d) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z5) {
        this.f6437o = z5;
    }

    public void setHideOnContentScrollEnabled(boolean z5) {
        if (z5 != this.f6438p) {
            this.f6438p = z5;
            if (z5) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        j();
        L0 l6 = (L0) this.f6433k;
        l6.f9996d = i != 0 ? AbstractC0473d.z(l6.f9993a.getContext(), i) : null;
        l6.c();
    }

    public void setLogo(int i) {
        j();
        L0 l6 = (L0) this.f6433k;
        l6.f9997e = i != 0 ? AbstractC0473d.z(l6.f9993a.getContext(), i) : null;
        l6.c();
    }

    public void setOverlayMode(boolean z5) {
        this.f6436n = z5;
        this.f6435m = z5 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z5) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((L0) this.f6433k).f10002k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        L0 l6 = (L0) this.f6433k;
        if (l6.f9999g) {
            return;
        }
        l6.f10000h = charSequence;
        if ((l6.f9994b & 8) != 0) {
            Toolbar toolbar = l6.f9993a;
            toolbar.setTitle(charSequence);
            if (l6.f9999g) {
                A.b(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0785e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        L0 l6 = (L0) this.f6433k;
        l6.f9996d = drawable;
        l6.c();
    }
}
