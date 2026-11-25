package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import p057l.F;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TypedValue f6462h;
    public TypedValue i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TypedValue f6463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TypedValue f6464k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TypedValue f6465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TypedValue f6466m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Rect f6467n;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6467n = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f6465l == null) {
            this.f6465l = new TypedValue();
        }
        return this.f6465l;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f6466m == null) {
            this.f6466m = new TypedValue();
        }
        return this.f6466m;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f6463j == null) {
            this.f6463j = new TypedValue();
        }
        return this.f6463j;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f6464k == null) {
            this.f6464k = new TypedValue();
        }
        return this.f6464k;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f6462h == null) {
            this.f6462h = new TypedValue();
        }
        return this.f6462h;
    }

    public TypedValue getMinWidthMinor() {
        if (this.i == null) {
            this.i = new TypedValue();
        }
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i3) {
        int iMakeMeasureSpec;
        boolean z5;
        int iMakeMeasureSpec2;
        int i6;
        int i7;
        float fraction;
        int i8;
        int i9;
        float fraction2;
        int i10;
        int i11;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z6 = true;
        boolean z7 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i3);
        Rect rect = this.f6467n;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i;
            z5 = false;
        } else {
            TypedValue typedValue = z7 ? this.f6464k : this.f6463j;
            if (typedValue == null || (i10 = typedValue.type) == 0) {
                iMakeMeasureSpec = i;
                z5 = false;
            } else {
                if (i10 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i10 == 6) {
                        int i12 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i12, i12);
                    } else {
                        i11 = 0;
                    }
                    if (i11 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i11 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z5 = true;
                    } else {
                        iMakeMeasureSpec = i;
                        z5 = false;
                    }
                }
                i11 = (int) fraction3;
                if (i11 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i11 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                    z5 = true;
                } else {
                    iMakeMeasureSpec = i;
                    z5 = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i3;
        } else {
            TypedValue typedValue2 = z7 ? this.f6465l : this.f6466m;
            if (typedValue2 == null || (i8 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i3;
            } else {
                if (i8 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i8 == 6) {
                        int i13 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i13, i13);
                    } else {
                        i9 = 0;
                    }
                    if (i9 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i9 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i3)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i3;
                    }
                }
                i9 = (int) fraction2;
                if (i9 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i9 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i3)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i3;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z5 || mode != Integer.MIN_VALUE) {
            z6 = false;
        } else {
            TypedValue typedValue3 = z7 ? this.i : this.f6462h;
            if (typedValue3 == null || (i6 = typedValue3.type) == 0) {
                z6 = false;
            } else {
                if (i6 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i6 == 6) {
                        int i14 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i14, i14);
                    } else {
                        i7 = 0;
                    }
                    if (i7 > 0) {
                        i7 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i7) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                    } else {
                        z6 = false;
                    }
                }
                i7 = (int) fraction;
                if (i7 > 0) {
                    i7 -= rect.left + rect.right;
                }
                if (measuredWidth < i7) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                } else {
                    z6 = false;
                }
            }
        }
        if (z6) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(F f6) {
    }
}
