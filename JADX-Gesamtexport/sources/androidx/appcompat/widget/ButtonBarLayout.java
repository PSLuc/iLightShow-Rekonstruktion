package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.nanjoran.ilightshow.R;
import p045i1.A;
import p045i1.AbstractC0762x;
import p045i1.ViewTreeObserverOnGlobalLayoutListenerC0756q;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6460h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6461j;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6461j = -1;
        int[] iArr = h.a.i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
        AbstractC0762x.d(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f6460h = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f6460h);
        }
    }

    private void setStacked(boolean z5) {
        if (this.i != z5) {
            if (!z5 || this.f6460h) {
                this.i = z5;
                setOrientation(z5 ? 1 : 0);
                setGravity(z5 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z5 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i3) {
        int iMakeMeasureSpec;
        boolean z5;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int paddingBottom = 0;
        if (this.f6460h) {
            if (size > this.f6461j && this.i) {
                setStacked(false);
            }
            this.f6461j = size;
        }
        if (this.i || View.MeasureSpec.getMode(i) != 1073741824) {
            iMakeMeasureSpec = i;
            z5 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z5 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i3);
        if (this.f6460h && !this.i && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z5 = true;
        }
        if (z5) {
            super.onMeasure(i, i3);
        }
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            i6 = -1;
            if (i7 >= childCount) {
                i7 = -1;
                break;
            } else if (getChildAt(i7).getVisibility() == 0) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 >= 0) {
            View childAt = getChildAt(i7);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.i) {
                int childCount2 = getChildCount();
                for (int i8 = i7 + 1; i8 < childCount2; i8++) {
                    if (getChildAt(i8).getVisibility() == 0) {
                        i6 = i8;
                        break;
                    }
                }
                paddingBottom = i6 >= 0 ? getChildAt(i6).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i3 == 0) {
                super.onMeasure(i, i3);
            }
        }
    }

    public void setAllowStacking(boolean z5) {
        if (this.f6460h != z5) {
            this.f6460h = z5;
            if (!z5 && this.i) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
