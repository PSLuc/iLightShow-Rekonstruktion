package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.nanjoran.ilightshow.R;
import p045i1.A;
import p045i1.ViewTreeObserverOnGlobalLayoutListenerC0756q;
import p057l.Q;
import p057l.S;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends S {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public static int h(View view) {
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return h(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    @Override // p057l.S, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i3, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int paddingLeft = getPaddingLeft();
        int i11 = i6 - i;
        int paddingRight = i11 - getPaddingRight();
        int paddingRight2 = (i11 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i12 = gravity & 112;
        int i13 = gravity & 8388615;
        int paddingTop = i12 != 16 ? i12 != 80 ? getPaddingTop() : ((getPaddingTop() + i7) - i3) - measuredHeight : (((i7 - i3) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                Q q6 = (Q) childAt.getLayoutParams();
                int i15 = ((LinearLayout.LayoutParams) q6).gravity;
                if (i15 < 0) {
                    i15 = i13;
                }
                ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
                int absoluteGravity = Gravity.getAbsoluteGravity(i15, getLayoutDirection()) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        i10 = ((LinearLayout.LayoutParams) q6).leftMargin + paddingLeft;
                    } else {
                        i8 = paddingRight - measuredWidth;
                        i9 = ((LinearLayout.LayoutParams) q6).rightMargin;
                    }
                    if (g(i14)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i16 = paddingTop + ((LinearLayout.LayoutParams) q6).topMargin;
                    childAt.layout(i10, i16, measuredWidth + i10, i16 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) q6).bottomMargin + i16;
                } else {
                    i8 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) q6).leftMargin;
                    i9 = ((LinearLayout.LayoutParams) q6).rightMargin;
                }
                i10 = i8 - i9;
                if (g(i14)) {
                    paddingTop += intrinsicHeight;
                }
                int i17 = paddingTop + ((LinearLayout.LayoutParams) q6).topMargin;
                childAt.layout(i10, i17, measuredWidth + i10, i17 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) q6).bottomMargin + i17;
            }
        }
    }

    @Override // p057l.S, android.view.View
    public final void onMeasure(int i, int i3) {
        int iCombineMeasuredStates;
        int iH;
        int measuredHeight;
        int measuredHeight2;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = alertDialogLayout.getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != R.id.contentPanel && id != R.id.customPanel) || view3 != null) {
                        super.onMeasure(i, i3);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view != null) {
            view.measure(i, 0);
            paddingBottom += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            iH = h(view2);
            measuredHeight = view2.getMeasuredHeight() - iH;
            paddingBottom += iH;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iH = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingBottom += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i7 = size - paddingBottom;
        if (view2 != null) {
            int i8 = paddingBottom - iH;
            int iMin = Math.min(i7, measuredHeight);
            if (iMin > 0) {
                i7 -= iMin;
                iH += iMin;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(iH, 1073741824));
            paddingBottom = i8 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i7 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i7, mode));
            paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = alertDialogLayout.getChildAt(i9);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        int i10 = i3;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + iMax, i, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i10, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i11 = 0;
            while (i11 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i11);
                if (childAt3.getVisibility() != 8) {
                    Q q6 = (Q) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) q6).width == -1) {
                        int i12 = ((LinearLayout.LayoutParams) q6).height;
                        ((LinearLayout.LayoutParams) q6).height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i10, 0);
                        ((LinearLayout.LayoutParams) q6).height = i12;
                    }
                }
                i11++;
                alertDialogLayout = this;
                i10 = i3;
            }
        }
    }
}
