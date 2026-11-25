package androidx.appcompat.widget;

import W2.g;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p035g0.C0715p;
import p052k.i;
import p052k.j;
import p052k.k;
import p057l.C0787f;
import p057l.C0791h;
import p057l.C0793i;
import p057l.C0797k;
import p057l.E0;
import p057l.InterfaceC0795j;
import p057l.InterfaceC0799l;
import p057l.P0;
import p057l.Q;
import p057l.S;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends S implements i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public E0 f6449A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f6450B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f6451C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f6452D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f6453E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public InterfaceC0799l f6454F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public j f6455w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Context f6456x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6457y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0793i f6458z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.f6452D = (int) (56.0f * f6);
        this.f6453E = (int) (f6 * 4.0f);
        this.f6456x = context;
        this.f6457y = 0;
    }

    public static C0797k h() {
        C0797k c0797k = new C0797k(-2, -2);
        c0797k.f10110a = false;
        ((LinearLayout.LayoutParams) c0797k).gravity = 16;
        return c0797k;
    }

    public static C0797k i(ViewGroup.LayoutParams layoutParams) {
        C0797k c0797k;
        if (layoutParams == null) {
            return h();
        }
        if (layoutParams instanceof C0797k) {
            C0797k c0797k2 = (C0797k) layoutParams;
            c0797k = new C0797k(c0797k2);
            c0797k.f10110a = c0797k2.f10110a;
        } else {
            c0797k = new C0797k(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0797k).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0797k).gravity = 16;
        }
        return c0797k;
    }

    @Override // p052k.i
    public final boolean a(k kVar) {
        return this.f6455w.p(kVar, null, 0);
    }

    @Override // p057l.S, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0797k;
    }

    @Override // p057l.S
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ Q generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p057l.S
    /* JADX INFO: renamed from: e */
    public final Q generateLayoutParams(AttributeSet attributeSet) {
        return new C0797k(getContext(), attributeSet);
    }

    @Override // p057l.S
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ Q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Override // p057l.S, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // p057l.S, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public Menu getMenu() {
        if (this.f6455w == null) {
            Context context = getContext();
            j jVar = new j(context);
            this.f6455w = jVar;
            jVar.f9852e = new C0715p(11, this);
            C0793i c0793i = new C0793i(context);
            this.f6458z = c0793i;
            c0793i.f10093r = true;
            c0793i.f10094s = true;
            c0793i.f10087l = new g(27);
            this.f6455w.b(c0793i, this.f6456x);
            C0793i c0793i2 = this.f6458z;
            c0793i2.f10089n = this;
            this.f6455w = c0793i2.f10085j;
        }
        return this.f6455w;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0793i c0793i = this.f6458z;
        C0791h c0791h = c0793i.f10090o;
        if (c0791h != null) {
            return c0791h.getDrawable();
        }
        if (c0793i.f10092q) {
            return c0793i.f10091p;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f6457y;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean j(int i) {
        boolean zB = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0795j)) {
            zB = ((InterfaceC0795j) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0795j)) ? zB : ((InterfaceC0795j) childAt2).c() | zB;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0793i c0793i = this.f6458z;
        if (c0793i != null) {
            c0793i.f();
            C0787f c0787f = this.f6458z.f10100y;
            if (c0787f == null || !c0787f.b()) {
                return;
            }
            this.f6458z.g();
            this.f6458z.k();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0793i c0793i = this.f6458z;
        if (c0793i != null) {
            c0793i.g();
            C0787f c0787f = c0793i.f10101z;
            if (c0787f == null || !c0787f.b()) {
                return;
            }
            c0787f.i.dismiss();
        }
    }

    @Override // p057l.S, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i3, int i6, int i7) {
        int width;
        int paddingLeft;
        if (!this.f6450B) {
            super.onLayout(z5, i, i3, i6, i7);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i7 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i6 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean zA = P0.a(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C0797k c0797k = (C0797k) childAt.getLayoutParams();
                if (c0797k.f10110a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zA) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c0797k).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0797k).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0797k).leftMargin) + ((LinearLayout.LayoutParams) c0797k).rightMargin;
                    j(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        int iMax = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (zA) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                C0797k c0797k2 = (C0797k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0797k2.f10110a) {
                    int i18 = width2 - ((LinearLayout.LayoutParams) c0797k2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0797k2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            C0797k c0797k3 = (C0797k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0797k3.f10110a) {
                int i21 = paddingLeft2 + ((LinearLayout.LayoutParams) c0797k3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c0797k3).rightMargin + iMax + i21;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // p057l.S, android.view.View
    public final void onMeasure(int i, int i3) {
        int i6;
        int i7;
        ?? r11;
        int i8;
        int i9;
        j jVar;
        boolean z5 = this.f6450B;
        boolean z6 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f6450B = z6;
        if (z5 != z6) {
            this.f6451C = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f6450B && (jVar = this.f6455w) != null && size != this.f6451C) {
            this.f6451C = size;
            jVar.o(true);
        }
        int childCount = getChildCount();
        if (!this.f6450B || childCount <= 0) {
            for (int i10 = 0; i10 < childCount; i10++) {
                C0797k c0797k = (C0797k) getChildAt(i10).getLayoutParams();
                ((LinearLayout.LayoutParams) c0797k).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0797k).leftMargin = 0;
            }
            super.onMeasure(i, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i3);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingBottom, -2);
        int i11 = size2 - paddingRight;
        int i12 = this.f6452D;
        int i13 = i11 / i12;
        int i14 = i11 % i12;
        if (i13 == 0) {
            setMeasuredDimension(i11, 0);
            return;
        }
        int i15 = (i14 / i13) + i12;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i16 = 0;
        int iMax2 = 0;
        int i17 = 0;
        boolean z7 = false;
        int i18 = 0;
        long j4 = 0;
        while (true) {
            i6 = this.f6453E;
            if (i17 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i17);
            int i19 = size3;
            int i20 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i8 = i15;
            } else {
                boolean z8 = childAt instanceof ActionMenuItemView;
                i16++;
                if (z8) {
                    childAt.setPadding(i6, 0, i6, 0);
                }
                C0797k c0797k2 = (C0797k) childAt.getLayoutParams();
                c0797k2.f10115f = false;
                c0797k2.f10112c = 0;
                c0797k2.f10111b = 0;
                c0797k2.f10113d = false;
                ((LinearLayout.LayoutParams) c0797k2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0797k2).rightMargin = 0;
                c0797k2.f10114e = z8 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i21 = c0797k2.f10110a ? 1 : i13;
                C0797k c0797k3 = (C0797k) childAt.getLayoutParams();
                int i22 = i13;
                i8 = i15;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i20, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z8 ? (ActionMenuItemView) childAt : null;
                boolean z9 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z10 = z9;
                if (i21 <= 0 || (z9 && i21 < 2)) {
                    i9 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i8 * i21, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i9 = measuredWidth / i8;
                    if (measuredWidth % i8 != 0) {
                        i9++;
                    }
                    if (z10 && i9 < 2) {
                        i9 = 2;
                    }
                }
                c0797k3.f10113d = !c0797k3.f10110a && z10;
                c0797k3.f10111b = i9;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i9 * i8, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i9);
                if (c0797k2.f10113d) {
                    i18++;
                }
                if (c0797k2.f10110a) {
                    z7 = true;
                }
                i13 = i22 - i9;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i9 == 1) {
                    j4 |= (long) (1 << i17);
                }
            }
            i17++;
            size3 = i19;
            paddingBottom = i20;
            i15 = i8;
        }
        int i23 = size3;
        int i24 = i13;
        int i25 = i15;
        boolean z11 = z7 && i16 == 2;
        int i26 = i24;
        boolean z12 = false;
        while (true) {
            if (i18 <= 0 || i26 <= 0) {
                i7 = iMax;
                break;
            }
            int i27 = Integer.MAX_VALUE;
            long j6 = 0;
            int i28 = 0;
            int i29 = 0;
            while (i29 < childCount2) {
                boolean z13 = z11;
                C0797k c0797k4 = (C0797k) getChildAt(i29).getLayoutParams();
                int i30 = iMax;
                if (c0797k4.f10113d) {
                    int i31 = c0797k4.f10111b;
                    if (i31 < i27) {
                        j6 = 1 << i29;
                        i27 = i31;
                        i28 = 1;
                    } else if (i31 == i27) {
                        j6 |= 1 << i29;
                        i28++;
                    }
                }
                i29++;
                iMax = i30;
                z11 = z13;
            }
            boolean z14 = z11;
            i7 = iMax;
            j4 |= j6;
            if (i28 > i26) {
                break;
            }
            int i32 = i27 + 1;
            int i33 = 0;
            while (i33 < childCount2) {
                View childAt2 = getChildAt(i33);
                C0797k c0797k5 = (C0797k) childAt2.getLayoutParams();
                boolean z15 = z7;
                long j7 = 1 << i33;
                if ((j6 & j7) != 0) {
                    if (z14 && c0797k5.f10114e) {
                        r11 = 1;
                        r11 = 1;
                        if (i26 == 1) {
                            childAt2.setPadding(i6 + i25, 0, i6, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c0797k5.f10111b += r11;
                    c0797k5.f10115f = r11;
                    i26--;
                } else if (c0797k5.f10111b == i32) {
                    j4 |= j7;
                }
                i33++;
                z7 = z15;
            }
            iMax = i7;
            z11 = z14;
            z12 = true;
        }
        boolean z16 = !z7 && i16 == 1;
        if (i26 > 0 && j4 != 0 && (i26 < i16 - 1 || z16 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j4);
            if (!z16) {
                if ((j4 & 1) != 0 && !((C0797k) getChildAt(0).getLayoutParams()).f10114e) {
                    fBitCount -= 0.5f;
                }
                int i34 = childCount2 - 1;
                if ((j4 & ((long) (1 << i34))) != 0 && !((C0797k) getChildAt(i34).getLayoutParams()).f10114e) {
                    fBitCount -= 0.5f;
                }
            }
            int i35 = fBitCount > 0.0f ? (int) ((i26 * i25) / fBitCount) : 0;
            boolean z17 = z12;
            for (int i36 = 0; i36 < childCount2; i36++) {
                if ((j4 & ((long) (1 << i36))) != 0) {
                    View childAt3 = getChildAt(i36);
                    C0797k c0797k6 = (C0797k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0797k6.f10112c = i35;
                        c0797k6.f10115f = true;
                        if (i36 == 0 && !c0797k6.f10114e) {
                            ((LinearLayout.LayoutParams) c0797k6).leftMargin = (-i35) / 2;
                        }
                        z17 = true;
                    } else if (c0797k6.f10110a) {
                        c0797k6.f10112c = i35;
                        c0797k6.f10115f = true;
                        ((LinearLayout.LayoutParams) c0797k6).rightMargin = (-i35) / 2;
                        z17 = true;
                    } else {
                        if (i36 != 0) {
                            ((LinearLayout.LayoutParams) c0797k6).leftMargin = i35 / 2;
                        }
                        if (i36 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c0797k6).rightMargin = i35 / 2;
                        }
                    }
                }
            }
            z12 = z17;
        }
        if (z12) {
            for (int i37 = 0; i37 < childCount2; i37++) {
                View childAt4 = getChildAt(i37);
                C0797k c0797k7 = (C0797k) childAt4.getLayoutParams();
                if (c0797k7.f10115f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0797k7.f10111b * i25) + c0797k7.f10112c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i11, mode != 1073741824 ? i7 : i23);
    }

    public void setExpandedActionViewsExclusive(boolean z5) {
        this.f6458z.f10098w = z5;
    }

    public void setOnMenuItemClickListener(InterfaceC0799l interfaceC0799l) {
        this.f6454F = interfaceC0799l;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0793i c0793i = this.f6458z;
        C0791h c0791h = c0793i.f10090o;
        if (c0791h != null) {
            c0791h.setImageDrawable(drawable);
        } else {
            c0793i.f10092q = true;
            c0793i.f10091p = drawable;
        }
    }

    public void setOverflowReserved(boolean z5) {
    }

    public void setPopupTheme(int i) {
        if (this.f6457y != i) {
            this.f6457y = i;
            if (i == 0) {
                this.f6456x = getContext();
            } else {
                this.f6456x = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0793i c0793i) {
        this.f6458z = c0793i;
        c0793i.f10089n = this;
        this.f6455w = c0793i.f10085j;
    }

    @Override // p057l.S, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0797k(getContext(), attributeSet);
    }
}
