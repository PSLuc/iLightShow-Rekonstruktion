package p057l;

import B.C0031p0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import h.a;
import p045i1.A;
import p045i1.AbstractC0762x;
import p045i1.ViewTreeObserverOnGlobalLayoutListenerC0756q;

/* JADX INFO: loaded from: classes.dex */
public abstract class S extends ViewGroup {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10020h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f10025n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f10026o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int[] f10027p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int[] f10028q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f10029r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10030s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10031t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10032u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10033v;

    public S(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10020h = true;
        this.i = -1;
        this.f10021j = 0;
        this.f10023l = 8388659;
        int[] iArr = a.f9200j;
        C0031p0 c0031p0O = C0031p0.o(context, attributeSet, iArr, i);
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
        AbstractC0762x.d(this, context, iArr, attributeSet, (TypedArray) c0031p0O.f394j, i, 0);
        TypedArray typedArray = (TypedArray) c0031p0O.f394j;
        int i3 = typedArray.getInt(1, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i6 = typedArray.getInt(0, -1);
        if (i6 >= 0) {
            setGravity(i6);
        }
        boolean z5 = typedArray.getBoolean(2, true);
        if (!z5) {
            setBaselineAligned(z5);
        }
        this.f10025n = typedArray.getFloat(4, -1.0f);
        this.i = typedArray.getInt(3, -1);
        this.f10026o = typedArray.getBoolean(7, false);
        setDividerDrawable(c0031p0O.h(5));
        this.f10032u = typedArray.getInt(8, 0);
        this.f10033v = typedArray.getDimensionPixelSize(6, 0);
        c0031p0O.p();
    }

    public final void b(Canvas canvas, int i) {
        this.f10029r.setBounds(getPaddingLeft() + this.f10033v, i, (getWidth() - getPaddingRight()) - this.f10033v, this.f10031t + i);
        this.f10029r.draw(canvas);
    }

    public final void c(Canvas canvas, int i) {
        this.f10029r.setBounds(i, getPaddingTop() + this.f10033v, this.f10030s + i, (getHeight() - getPaddingBottom()) - this.f10033v);
        this.f10029r.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof Q;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Q generateDefaultLayoutParams() {
        int i = this.f10022k;
        if (i == 0) {
            return new Q(-2, -2);
        }
        if (i == 1) {
            return new Q(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Q generateLayoutParams(AttributeSet attributeSet) {
        return new Q(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new Q(layoutParams);
    }

    public final boolean g(int i) {
        if (i == 0) {
            return (this.f10032u & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f10032u & 4) != 0;
        }
        if ((this.f10032u & 2) != 0) {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.i < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.i;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.i == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f10021j;
        if (this.f10022k == 1 && (i = this.f10023l & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f10024m) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f10024m;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((Q) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.i;
    }

    public Drawable getDividerDrawable() {
        return this.f10029r;
    }

    public int getDividerPadding() {
        return this.f10033v;
    }

    public int getDividerWidth() {
        return this.f10030s;
    }

    public int getGravity() {
        return this.f10023l;
    }

    public int getOrientation() {
        return this.f10022k;
    }

    public int getShowDividers() {
        return this.f10032u;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f10025n;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        int bottom;
        if (this.f10029r == null) {
            return;
        }
        int i3 = 0;
        if (this.f10022k == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i3 < virtualChildCount) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8 && g(i3)) {
                    b(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((Q) childAt.getLayoutParams())).topMargin) - this.f10031t);
                }
                i3++;
            }
            if (g(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f10031t;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((Q) childAt2.getLayoutParams())).bottomMargin;
                }
                b(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zA = P0.a(this);
        while (i3 < virtualChildCount2) {
            View childAt3 = getChildAt(i3);
            if (childAt3 != null && childAt3.getVisibility() != 8 && g(i3)) {
                Q q6 = (Q) childAt3.getLayoutParams();
                c(canvas, zA ? childAt3.getRight() + ((LinearLayout.LayoutParams) q6).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) q6).leftMargin) - this.f10030s);
            }
            i3++;
        }
        if (g(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                Q q7 = (Q) childAt4.getLayoutParams();
                if (zA) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) q7).leftMargin;
                    i = this.f10030s;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) q7).rightMargin;
                }
            } else if (zA) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f10030s;
                right = left - i;
            }
            c(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0156  */
    /* JADX WARN: Code duplicated, block: B:61:0x015f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0163  */
    /* JADX WARN: Code duplicated, block: B:65:0x0167  */
    /* JADX WARN: Code duplicated, block: B:66:0x016b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0173  */
    /* JADX WARN: Code duplicated, block: B:70:0x017f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0186  */
    /* JADX WARN: Code duplicated, block: B:73:0x018d  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a5  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i, int i3, int i6, int i7) {
        int paddingLeft;
        int i8;
        int i9;
        int i10;
        int i11;
        int baseline;
        int i12;
        int i13;
        int i14;
        int measuredHeight;
        int i15;
        int paddingTop;
        int i16;
        int i17;
        int i18;
        int i19 = 8;
        char c6 = 2;
        if (this.f10022k == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i20 = i6 - i;
            int paddingRight = i20 - getPaddingRight();
            int paddingRight2 = (i20 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i21 = this.f10023l;
            int i22 = i21 & 112;
            int i23 = 8388615 & i21;
            if (i22 != 16) {
                paddingTop = i22 != 80 ? getPaddingTop() : ((getPaddingTop() + i7) - i3) - this.f10024m;
            } else {
                paddingTop = getPaddingTop() + (((i7 - i3) - this.f10024m) / 2);
            }
            int i24 = 0;
            while (i24 < virtualChildCount) {
                View childAt = getChildAt(i24);
                if (childAt != null && childAt.getVisibility() != i19) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    Q q6 = (Q) childAt.getLayoutParams();
                    int i25 = ((LinearLayout.LayoutParams) q6).gravity;
                    if (i25 < 0) {
                        i25 = i23;
                    }
                    ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i25, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i18 = ((LinearLayout.LayoutParams) q6).leftMargin + paddingLeft2;
                        } else {
                            i16 = paddingRight - measuredWidth;
                            i17 = ((LinearLayout.LayoutParams) q6).rightMargin;
                        }
                        if (g(i24)) {
                            paddingTop += this.f10031t;
                        }
                        int i26 = paddingTop + ((LinearLayout.LayoutParams) q6).topMargin;
                        childAt.layout(i18, i26, measuredWidth + i18, i26 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) q6).bottomMargin + i26;
                    } else {
                        i16 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) q6).leftMargin;
                        i17 = ((LinearLayout.LayoutParams) q6).rightMargin;
                    }
                    i18 = i16 - i17;
                    if (g(i24)) {
                        paddingTop += this.f10031t;
                    }
                    int i27 = paddingTop + ((LinearLayout.LayoutParams) q6).topMargin;
                    childAt.layout(i18, i27, measuredWidth + i18, i27 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) q6).bottomMargin + i27;
                }
                i24++;
                c6 = c6;
                i19 = 8;
            }
            return;
        }
        boolean zA = P0.a(this);
        int paddingTop2 = getPaddingTop();
        int i28 = i7 - i3;
        int paddingBottom = i28 - getPaddingBottom();
        int paddingBottom2 = (i28 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i29 = this.f10023l;
        int i30 = 8388615 & i29;
        int i31 = i29 & 112;
        boolean z6 = this.f10020h;
        int[] iArr = this.f10027p;
        int[] iArr2 = this.f10028q;
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q2 = A.f9394a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i30, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i6) - i) - this.f10024m;
        } else {
            paddingLeft = getPaddingLeft() + (((i6 - i) - this.f10024m) / 2);
        }
        if (zA) {
            i9 = virtualChildCount2 - 1;
            i8 = -1;
        } else {
            i8 = 1;
            i9 = 0;
        }
        int i32 = 0;
        while (i32 < virtualChildCount2) {
            int i33 = (i8 * i32) + i9;
            View childAt2 = getChildAt(i33);
            if (childAt2 == null) {
                i10 = i9;
            } else {
                i10 = i9;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    Q q7 = (Q) childAt2.getLayoutParams();
                    int i34 = paddingLeft;
                    if (z6) {
                        i11 = paddingTop2;
                        baseline = ((LinearLayout.LayoutParams) q7).height != -1 ? childAt2.getBaseline() : -1;
                        i12 = ((LinearLayout.LayoutParams) q7).gravity;
                        if (i12 < 0) {
                            i12 = i31;
                        }
                        i13 = i12 & 112;
                        if (i13 != 16) {
                            if (i13 != 48) {
                                i14 = i11 + ((LinearLayout.LayoutParams) q7).topMargin;
                                if (baseline != -1) {
                                    i14 = (iArr[1] - baseline) + i14;
                                }
                            } else if (i13 != 80) {
                                i14 = i11;
                            } else {
                                i14 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) q7).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            if (g(i33)) {
                                i15 = i34 + this.f10030s;
                            } else {
                                i15 = i34;
                            }
                            int i35 = i15 + ((LinearLayout.LayoutParams) q7).leftMargin;
                            childAt2.layout(i35, i14, i35 + measuredWidth2, i14 + measuredHeight3);
                            paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) q7).rightMargin + i35;
                        } else {
                            i14 = ((paddingBottom2 - measuredHeight3) / 2) + i11 + ((LinearLayout.LayoutParams) q7).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) q7).bottomMargin;
                        }
                        i14 -= measuredHeight;
                        if (g(i33)) {
                            i15 = i34 + this.f10030s;
                        } else {
                            i15 = i34;
                        }
                        int i36 = i15 + ((LinearLayout.LayoutParams) q7).leftMargin;
                        childAt2.layout(i36, i14, i36 + measuredWidth2, i14 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) q7).rightMargin + i36;
                    } else {
                        i11 = paddingTop2;
                    }
                    i12 = ((LinearLayout.LayoutParams) q7).gravity;
                    if (i12 < 0) {
                        i12 = i31;
                    }
                    i13 = i12 & 112;
                    if (i13 != 16) {
                        if (i13 != 48) {
                            i14 = i11 + ((LinearLayout.LayoutParams) q7).topMargin;
                            if (baseline != -1) {
                                i14 = (iArr[1] - baseline) + i14;
                            }
                        } else if (i13 != 80) {
                            i14 = i11;
                        } else {
                            i14 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) q7).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (g(i33)) {
                            i15 = i34 + this.f10030s;
                        } else {
                            i15 = i34;
                        }
                        int i37 = i15 + ((LinearLayout.LayoutParams) q7).leftMargin;
                        childAt2.layout(i37, i14, i37 + measuredWidth2, i14 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) q7).rightMargin + i37;
                    } else {
                        i14 = ((paddingBottom2 - measuredHeight3) / 2) + i11 + ((LinearLayout.LayoutParams) q7).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) q7).bottomMargin;
                    }
                    i14 -= measuredHeight;
                    if (g(i33)) {
                        i15 = i34 + this.f10030s;
                    } else {
                        i15 = i34;
                    }
                    int i38 = i15 + ((LinearLayout.LayoutParams) q7).leftMargin;
                    childAt2.layout(i38, i14, i38 + measuredWidth2, i14 + measuredHeight3);
                    paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) q7).rightMargin + i38;
                }
                i32++;
                i9 = i10;
                paddingTop2 = i11;
            }
            i11 = paddingTop2;
            i32++;
            i9 = i10;
            paddingTop2 = i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:228:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:231:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:233:0x0502  */
    /* JADX WARN: Code duplicated, block: B:235:0x0506  */
    /* JADX WARN: Code duplicated, block: B:237:0x0527  */
    /* JADX WARN: Code duplicated, block: B:243:0x0537  */
    /* JADX WARN: Code duplicated, block: B:246:0x053e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:248:0x0541  */
    /* JADX WARN: Code duplicated, block: B:250:0x0548 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:252:0x054b  */
    /* JADX WARN: Code duplicated, block: B:366:0x079d  */
    /* JADX WARN: Code duplicated, block: B:64:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0142  */
    /* JADX WARN: Code duplicated, block: B:68:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x014b  */
    @Override // android.view.View
    public void onMeasure(int i, int i3) {
        int i6;
        int i7;
        int i8;
        int iMax;
        int i9;
        int baseline;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        boolean z5;
        boolean z6;
        Q q6;
        View view;
        int i14;
        int[] iArr2;
        int i15;
        int i16;
        boolean z7;
        int i17;
        int measuredHeight;
        boolean z8;
        boolean z9;
        int iMax2;
        int i18;
        int baseline2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z10;
        int i24;
        int i25;
        int i26;
        View view2;
        boolean z11;
        S s6 = this;
        int i27 = -2;
        int i28 = 1073741824;
        int i29 = 8;
        int iMax3 = 0;
        if (s6.f10022k == 1) {
            s6.f10024m = 0;
            int virtualChildCount = s6.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i3);
            int i30 = s6.i;
            boolean z12 = s6.f10026o;
            int i31 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            boolean z13 = false;
            int i32 = 0;
            boolean z14 = false;
            boolean z15 = true;
            float f6 = 0.0f;
            int iMax6 = 0;
            while (i31 < virtualChildCount) {
                int i33 = mode;
                View childAt = s6.getChildAt(i31);
                if (childAt == null) {
                    s6.f10024m = s6.f10024m;
                } else {
                    if (childAt.getVisibility() != i29) {
                        if (s6.g(i31)) {
                            s6.f10024m += s6.f10031t;
                        }
                        Q q7 = (Q) childAt.getLayoutParams();
                        float f7 = ((LinearLayout.LayoutParams) q7).weight;
                        f6 += f7;
                        if (mode2 == i28 && ((LinearLayout.LayoutParams) q7).height == 0 && f7 > 0.0f) {
                            int i34 = s6.f10024m;
                            s6.f10024m = Math.max(i34, ((LinearLayout.LayoutParams) q7).topMargin + i34 + ((LinearLayout.LayoutParams) q7).bottomMargin);
                            view2 = childAt;
                            i23 = mode2;
                            i24 = i30;
                            z10 = z12;
                            i25 = i31;
                            z13 = true;
                            i26 = i33;
                        } else {
                            if (((LinearLayout.LayoutParams) q7).height != 0 || f7 <= 0.0f) {
                                i22 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) q7).height = i27;
                                i22 = 0;
                            }
                            i23 = mode2;
                            z10 = z12;
                            i24 = i30;
                            i25 = i31;
                            i26 = i33;
                            s6.measureChildWithMargins(childAt, i, 0, i3, f6 == 0.0f ? s6.f10024m : 0);
                            if (i22 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) q7).height = i22;
                            }
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            int i35 = s6.f10024m;
                            view2 = childAt;
                            s6.f10024m = Math.max(i35, i35 + measuredHeight2 + ((LinearLayout.LayoutParams) q7).topMargin + ((LinearLayout.LayoutParams) q7).bottomMargin);
                            if (z10) {
                                iMax6 = Math.max(measuredHeight2, iMax6);
                            }
                        }
                        if (i24 >= 0 && i24 == i25 + 1) {
                            s6.f10021j = s6.f10024m;
                        }
                        if (i25 < i24 && ((LinearLayout.LayoutParams) q7).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i26 == 1073741824 || ((LinearLayout.LayoutParams) q7).width != -1) {
                            z11 = false;
                        } else {
                            z11 = true;
                            z14 = true;
                        }
                        int i36 = ((LinearLayout.LayoutParams) q7).leftMargin + ((LinearLayout.LayoutParams) q7).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i36;
                        int iMax7 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z16 = z11;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i32, measuredState);
                        if (z15) {
                            i32 = iCombineMeasuredStates;
                            boolean z17 = ((LinearLayout.LayoutParams) q7).width == -1;
                            if (((LinearLayout.LayoutParams) q7).weight > 0.0f) {
                                if (!z16) {
                                    i36 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i36);
                            } else {
                                if (!z16) {
                                    i36 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i36);
                            }
                            z15 = z17;
                            iMax3 = iMax7;
                        } else {
                            i32 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) q7).weight > 0.0f) {
                            if (!z16) {
                                i36 = measuredWidth;
                            }
                            iMax5 = Math.max(iMax5, i36);
                        } else {
                            if (!z16) {
                                i36 = measuredWidth;
                            }
                            iMax4 = Math.max(iMax4, i36);
                        }
                        z15 = z17;
                        iMax3 = iMax7;
                    }
                    i31 = i25 + 1;
                    i30 = i24;
                    mode = i26;
                    z12 = z10;
                    mode2 = i23;
                    i27 = -2;
                    i28 = 1073741824;
                    i29 = 8;
                }
                i23 = mode2;
                i24 = i30;
                z10 = z12;
                i25 = i31;
                i26 = i33;
                i31 = i25 + 1;
                i30 = i24;
                mode = i26;
                z12 = z10;
                mode2 = i23;
                i27 = -2;
                i28 = 1073741824;
                i29 = 8;
            }
            int i37 = mode;
            int i38 = mode2;
            boolean z18 = z12;
            int i39 = i32;
            int i40 = i3;
            if (s6.f10024m > 0 && s6.g(virtualChildCount)) {
                s6.f10024m += s6.f10031t;
            }
            if (z18 && (i38 == Integer.MIN_VALUE || i38 == 0)) {
                s6.f10024m = 0;
                for (int i41 = 0; i41 < virtualChildCount; i41++) {
                    View childAt2 = s6.getChildAt(i41);
                    if (childAt2 == null) {
                        s6.f10024m = s6.f10024m;
                    } else if (childAt2.getVisibility() != 8) {
                        Q q8 = (Q) childAt2.getLayoutParams();
                        int i42 = s6.f10024m;
                        s6.f10024m = Math.max(i42, i42 + iMax6 + ((LinearLayout.LayoutParams) q8).topMargin + ((LinearLayout.LayoutParams) q8).bottomMargin);
                    }
                }
            }
            int paddingBottom = s6.getPaddingBottom() + s6.getPaddingTop() + s6.f10024m;
            s6.f10024m = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, s6.getSuggestedMinimumHeight()), i40, 0);
            int i43 = (iResolveSizeAndState & 16777215) - s6.f10024m;
            if (z13 || (i43 != 0 && f6 > 0.0f)) {
                float f8 = s6.f10025n;
                if (f8 > 0.0f) {
                    f6 = f8;
                }
                s6.f10024m = 0;
                int iCombineMeasuredStates2 = i39;
                int i44 = 0;
                while (i44 < virtualChildCount) {
                    View childAt3 = s6.getChildAt(i44);
                    if (childAt3.getVisibility() == 8) {
                        i44 = i44;
                    } else {
                        Q q9 = (Q) childAt3.getLayoutParams();
                        float f9 = ((LinearLayout.LayoutParams) q9).weight;
                        if (f9 > 0.0f) {
                            int i45 = (int) ((i43 * f9) / f6);
                            f6 -= f9;
                            i43 -= i45;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, s6.getPaddingRight() + s6.getPaddingLeft() + ((LinearLayout.LayoutParams) q9).leftMargin + ((LinearLayout.LayoutParams) q9).rightMargin, ((LinearLayout.LayoutParams) q9).width);
                            if (((LinearLayout.LayoutParams) q9).height == 0) {
                                i21 = 1073741824;
                                if (i38 == 1073741824) {
                                    if (i45 <= 0) {
                                        i45 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i45, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i21 = 1073741824;
                            }
                            int measuredHeight3 = childAt3.getMeasuredHeight() + i45;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i21));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        }
                        int i46 = ((LinearLayout.LayoutParams) q9).leftMargin + ((LinearLayout.LayoutParams) q9).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i46;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i37 != 1073741824) {
                            i20 = -1;
                            if (((LinearLayout.LayoutParams) q9).width == -1) {
                                measuredWidth2 = i46;
                            }
                        } else {
                            i20 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z19 = z15 && ((LinearLayout.LayoutParams) q9).width == i20;
                        int i47 = s6.f10024m;
                        s6.f10024m = Math.max(i47, childAt3.getMeasuredHeight() + i47 + ((LinearLayout.LayoutParams) q9).topMargin + ((LinearLayout.LayoutParams) q9).bottomMargin);
                        z15 = z19;
                    }
                    i44++;
                }
                s6.f10024m = s6.getPaddingBottom() + s6.getPaddingTop() + s6.f10024m;
                i39 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z18 && i38 != 1073741824) {
                    for (int i48 = 0; i48 < virtualChildCount; i48++) {
                        View childAt4 = s6.getChildAt(i48);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((Q) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z15 || i37 == 1073741824) {
                iMax4 = iMax3;
            }
            s6.setMeasuredDimension(View.resolveSizeAndState(Math.max(s6.getPaddingRight() + s6.getPaddingLeft() + iMax4, s6.getSuggestedMinimumWidth()), i, i39), iResolveSizeAndState);
            if (z14) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(s6.getMeasuredWidth(), 1073741824);
                int i49 = 0;
                while (i49 < virtualChildCount) {
                    View childAt5 = s6.getChildAt(i49);
                    if (childAt5.getVisibility() != 8) {
                        Q q10 = (Q) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) q10).width == -1) {
                            int i50 = ((LinearLayout.LayoutParams) q10).height;
                            ((LinearLayout.LayoutParams) q10).height = childAt5.getMeasuredHeight();
                            s6.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i40, 0);
                            ((LinearLayout.LayoutParams) q10).height = i50;
                        }
                    }
                    i49++;
                    i40 = i3;
                }
                return;
            }
            return;
        }
        int i51 = i;
        s6.f10024m = 0;
        int virtualChildCount2 = s6.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i51);
        int mode4 = View.MeasureSpec.getMode(i3);
        if (s6.f10027p == null || s6.f10028q == null) {
            s6.f10027p = new int[4];
            s6.f10028q = new int[4];
        }
        int[] iArr3 = s6.f10027p;
        int[] iArr4 = s6.f10028q;
        iArr3[3] = -1;
        char c6 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z20 = s6.f10020h;
        boolean z21 = s6.f10026o;
        boolean z22 = mode3 == 1073741824;
        float f10 = 0.0f;
        boolean z23 = true;
        int i52 = 0;
        int i53 = 0;
        int i54 = 0;
        int iMax8 = 0;
        int iMax9 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z24 = false;
        boolean z25 = false;
        while (i52 < virtualChildCount2) {
            char c7 = c6;
            View childAt6 = s6.getChildAt(i52);
            if (childAt6 == null) {
                s6.f10024m = s6.f10024m;
                i13 = i52;
                i18 = i54;
                iArr2 = iArr3;
                iArr = iArr4;
                z5 = z20;
                z6 = z21;
            } else {
                int i55 = i53;
                if (childAt6.getVisibility() == 8) {
                    i51 = i;
                    i13 = i52;
                    i18 = i54;
                    iArr = iArr4;
                    z5 = z20;
                    z6 = z21;
                    i53 = i55;
                    iArr2 = iArr3;
                } else {
                    if (s6.g(i52)) {
                        s6.f10024m += s6.f10030s;
                    }
                    Q q11 = (Q) childAt6.getLayoutParams();
                    float f11 = ((LinearLayout.LayoutParams) q11).weight;
                    f10 += f11;
                    int i56 = i52;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) q11).width == 0 && f11 > 0.0f) {
                        if (z22) {
                            s6.f10024m = ((LinearLayout.LayoutParams) q11).leftMargin + ((LinearLayout.LayoutParams) q11).rightMargin + s6.f10024m;
                        } else {
                            int i57 = s6.f10024m;
                            s6.f10024m = Math.max(i57, ((LinearLayout.LayoutParams) q11).leftMargin + i57 + ((LinearLayout.LayoutParams) q11).rightMargin);
                        }
                        if (z20) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z5 = z20;
                            z6 = z21;
                            i14 = i55;
                            i13 = i56;
                            q6 = q11;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i51 = i;
                            i15 = i54;
                            i12 = iMax8;
                        } else {
                            view = childAt6;
                            z5 = z20;
                            z6 = z21;
                            z25 = true;
                            i14 = i55;
                            i13 = i56;
                            i16 = 1073741824;
                            q6 = q11;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i51 = i;
                            i15 = i54;
                            i12 = iMax8;
                        }
                        if (mode4 == i16 && ((LinearLayout.LayoutParams) q6).height == -1) {
                            z7 = true;
                            z24 = true;
                        } else {
                            z7 = false;
                        }
                        i17 = ((LinearLayout.LayoutParams) q6).topMargin + ((LinearLayout.LayoutParams) q6).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i17;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z5) {
                            baseline2 = view.getBaseline();
                            z8 = z7;
                            if (baseline2 != -1) {
                                i19 = ((LinearLayout.LayoutParams) q6).gravity;
                                if (i19 < 0) {
                                    i19 = s6.f10023l;
                                }
                                int i58 = (((i19 & 112) >> 4) & (-2)) >> 1;
                                iArr2[i58] = Math.max(iArr2[i58], baseline2);
                                iArr[i58] = Math.max(iArr[i58], measuredHeight - baseline2);
                            }
                        } else {
                            z8 = z7;
                        }
                        int iMax10 = Math.max(i14, measuredHeight);
                        if (z23 || ((LinearLayout.LayoutParams) q6).height != -1) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (((LinearLayout.LayoutParams) q6).weight > 0.0f) {
                            if (!z8) {
                                i17 = measuredHeight;
                            }
                            iMax8 = Math.max(i12, i17);
                            iMax2 = i15;
                        } else {
                            if (!z8) {
                                i17 = measuredHeight;
                            }
                            iMax2 = Math.max(i15, i17);
                            iMax8 = i12;
                        }
                        int i59 = iMax2;
                        i53 = iMax10;
                        i18 = i59;
                        z23 = z9;
                    } else {
                        if (((LinearLayout.LayoutParams) q11).width != 0 || f11 <= 0.0f) {
                            i11 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) q11).width = -2;
                            i11 = 0;
                        }
                        iArr = iArr4;
                        i12 = iMax8;
                        i13 = i56;
                        z5 = z20;
                        z6 = z21;
                        int i60 = i11;
                        q6 = q11;
                        view = childAt6;
                        i14 = i55;
                        i51 = i;
                        iArr2 = iArr3;
                        i15 = i54;
                        s6.measureChildWithMargins(view, i51, f10 == 0.0f ? s6.f10024m : 0, i3, 0);
                        if (i60 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) q6).width = i60;
                        }
                        int measuredWidth3 = view.getMeasuredWidth();
                        if (z22) {
                            s6.f10024m = ((LinearLayout.LayoutParams) q6).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) q6).rightMargin + s6.f10024m;
                        } else {
                            int i61 = s6.f10024m;
                            s6.f10024m = Math.max(i61, i61 + measuredWidth3 + ((LinearLayout.LayoutParams) q6).leftMargin + ((LinearLayout.LayoutParams) q6).rightMargin);
                        }
                        if (z6) {
                            iMax9 = Math.max(measuredWidth3, iMax9);
                        }
                    }
                    i16 = 1073741824;
                    if (mode4 == i16) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    i17 = ((LinearLayout.LayoutParams) q6).topMargin + ((LinearLayout.LayoutParams) q6).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i17;
                    iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                    if (z5) {
                        baseline2 = view.getBaseline();
                        z8 = z7;
                        if (baseline2 != -1) {
                            i19 = ((LinearLayout.LayoutParams) q6).gravity;
                            if (i19 < 0) {
                                i19 = s6.f10023l;
                            }
                            int i510 = (((i19 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i510] = Math.max(iArr2[i510], baseline2);
                            iArr[i510] = Math.max(iArr[i510], measuredHeight - baseline2);
                        }
                    } else {
                        z8 = z7;
                    }
                    int iMax11 = Math.max(i14, measuredHeight);
                    if (z23) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (((LinearLayout.LayoutParams) q6).weight > 0.0f) {
                        if (!z8) {
                            i17 = measuredHeight;
                        }
                        iMax8 = Math.max(i12, i17);
                        iMax2 = i15;
                    } else {
                        if (!z8) {
                            i17 = measuredHeight;
                        }
                        iMax2 = Math.max(i15, i17);
                        iMax8 = i12;
                    }
                    int i511 = iMax2;
                    i53 = iMax11;
                    i18 = i511;
                    z23 = z9;
                }
            }
            i54 = i18;
            i52 = i13 + 1;
            c6 = c7;
            iArr3 = iArr2;
            iArr4 = iArr;
            z20 = z5;
            z21 = z6;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c8 = c6;
        boolean z26 = z20;
        boolean z27 = z21;
        int i62 = i53;
        int i63 = i54;
        int i64 = iMax8;
        if (s6.f10024m > 0 && s6.g(virtualChildCount2)) {
            s6.f10024m += s6.f10030s;
        }
        int i65 = iArr5[1];
        int iMax12 = (i65 == -1 && iArr5[0] == -1 && iArr5[c8] == -1 && iArr5[3] == -1) ? i62 : Math.max(i62, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c8]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i65, iArr5[c8]))));
        if (z27 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            s6.f10024m = 0;
            for (int i66 = 0; i66 < virtualChildCount2; i66++) {
                View childAt7 = s6.getChildAt(i66);
                if (childAt7 == null) {
                    s6.f10024m = s6.f10024m;
                } else if (childAt7.getVisibility() != 8) {
                    Q q12 = (Q) childAt7.getLayoutParams();
                    if (z22) {
                        s6.f10024m = ((LinearLayout.LayoutParams) q12).leftMargin + iMax9 + ((LinearLayout.LayoutParams) q12).rightMargin + s6.f10024m;
                    } else {
                        int i67 = s6.f10024m;
                        s6.f10024m = Math.max(i67, i67 + iMax9 + ((LinearLayout.LayoutParams) q12).leftMargin + ((LinearLayout.LayoutParams) q12).rightMargin);
                    }
                }
            }
        }
        int paddingRight = s6.getPaddingRight() + s6.getPaddingLeft() + s6.f10024m;
        s6.f10024m = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, s6.getSuggestedMinimumWidth()), i51, 0);
        int i68 = (iResolveSizeAndState2 & 16777215) - s6.f10024m;
        if (z25 || (i68 != 0 && f10 > 0.0f)) {
            float f12 = s6.f10025n;
            if (f12 > 0.0f) {
                f10 = f12;
            }
            iArr5[3] = -1;
            iArr5[c8] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c8] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            s6.f10024m = 0;
            iMax12 = -1;
            int i69 = 0;
            while (i69 < virtualChildCount2) {
                View childAt8 = s6.getChildAt(i69);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    iResolveSizeAndState2 = iResolveSizeAndState2;
                } else {
                    Q q13 = (Q) childAt8.getLayoutParams();
                    float f13 = ((LinearLayout.LayoutParams) q13).weight;
                    if (f13 > 0.0f) {
                        int i70 = (int) ((i68 * f13) / f10);
                        f10 -= f13;
                        i68 -= i70;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, s6.getPaddingBottom() + s6.getPaddingTop() + ((LinearLayout.LayoutParams) q13).topMargin + ((LinearLayout.LayoutParams) q13).bottomMargin, ((LinearLayout.LayoutParams) q13).height);
                        if (((LinearLayout.LayoutParams) q13).width == 0) {
                            i10 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i70 <= 0) {
                                    i70 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i70, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i10 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i70;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i10), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    }
                    if (z22) {
                        s6.f10024m = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) q13).leftMargin + ((LinearLayout.LayoutParams) q13).rightMargin + s6.f10024m;
                    } else {
                        int i71 = s6.f10024m;
                        s6.f10024m = Math.max(i71, childAt8.getMeasuredWidth() + i71 + ((LinearLayout.LayoutParams) q13).leftMargin + ((LinearLayout.LayoutParams) q13).rightMargin);
                    }
                    boolean z28 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) q13).height == -1;
                    int i72 = ((LinearLayout.LayoutParams) q13).topMargin + ((LinearLayout.LayoutParams) q13).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i72;
                    iMax12 = Math.max(iMax12, measuredHeight4);
                    if (!z28) {
                        i72 = measuredHeight4;
                    }
                    int iMax13 = Math.max(i63, i72);
                    if (z23) {
                        i9 = -1;
                        boolean z29 = ((LinearLayout.LayoutParams) q13).height == -1;
                        if (!z26 && (baseline = childAt8.getBaseline()) != i9) {
                            int i73 = ((LinearLayout.LayoutParams) q13).gravity;
                            if (i73 < 0) {
                                i73 = s6.f10023l;
                            }
                            int i74 = (((i73 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i74] = Math.max(iArr5[i74], baseline);
                            iArr6[i74] = Math.max(iArr6[i74], measuredHeight4 - baseline);
                        }
                        z23 = z29;
                        i63 = iMax13;
                    } else {
                        i9 = -1;
                    }
                    if (!z26) {
                    }
                    z23 = z29;
                    i63 = iMax13;
                }
                i69++;
                iResolveSizeAndState2 = iResolveSizeAndState2;
            }
            i6 = iResolveSizeAndState2;
            i7 = -16777216;
            s6.f10024m = s6.getPaddingRight() + s6.getPaddingLeft() + s6.f10024m;
            int i75 = iArr5[1];
            if (i75 == -1 && iArr5[0] == -1 && iArr5[c8] == -1 && iArr5[3] == -1) {
                i8 = 0;
            } else {
                i8 = 0;
                iMax12 = Math.max(iMax12, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c8]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i75, iArr5[c8]))));
            }
            iMax = i63;
        } else {
            iMax = Math.max(i63, i64);
            if (z27 && mode3 != 1073741824) {
                for (int i76 = 0; i76 < virtualChildCount2; i76++) {
                    View childAt9 = s6.getChildAt(i76);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((Q) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax9, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i6 = iResolveSizeAndState2;
            i7 = -16777216;
            i8 = 0;
        }
        if (!z23 && mode4 != 1073741824) {
            iMax12 = iMax;
        }
        s6.setMeasuredDimension(i6 | (iCombineMeasuredStates3 & i7), View.resolveSizeAndState(Math.max(s6.getPaddingBottom() + s6.getPaddingTop() + iMax12, s6.getSuggestedMinimumHeight()), i3, iCombineMeasuredStates3 << 16));
        if (z24) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(s6.getMeasuredHeight(), 1073741824);
            int i77 = i8;
            while (i77 < virtualChildCount2) {
                View childAt10 = s6.getChildAt(i77);
                if (childAt10.getVisibility() != 8) {
                    Q q14 = (Q) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) q14).height == -1) {
                        int i78 = ((LinearLayout.LayoutParams) q14).width;
                        ((LinearLayout.LayoutParams) q14).width = childAt10.getMeasuredWidth();
                        s6.measureChildWithMargins(childAt10, i51, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) q14).width = i78;
                    }
                }
                i77++;
                s6 = this;
                i51 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z5) {
        this.f10020h = z5;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.i = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f10029r) {
            return;
        }
        this.f10029r = drawable;
        if (drawable != null) {
            this.f10030s = drawable.getIntrinsicWidth();
            this.f10031t = drawable.getIntrinsicHeight();
        } else {
            this.f10030s = 0;
            this.f10031t = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f10033v = i;
    }

    public void setGravity(int i) {
        if (this.f10023l != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f10023l = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i3 = i & 8388615;
        int i6 = this.f10023l;
        if ((8388615 & i6) != i3) {
            this.f10023l = i3 | ((-8388616) & i6);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z5) {
        this.f10026o = z5;
    }

    public void setOrientation(int i) {
        if (this.f10022k != i) {
            this.f10022k = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f10032u) {
            requestLayout();
        }
        this.f10032u = i;
    }

    public void setVerticalGravity(int i) {
        int i3 = i & 112;
        int i6 = this.f10023l;
        if ((i6 & 112) != i3) {
            this.f10023l = i3 | (i6 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f6) {
        this.f10025n = Math.max(0.0f, f6);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
