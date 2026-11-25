package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nanjoran.ilightshow.R;
import p015c2.AbstractC0473d;
import p045i1.A;
import p045i1.ViewTreeObserverOnGlobalLayoutListenerC0756q;
import p057l.P0;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6414h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6415j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f6416k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f6417l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f6418m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f6419n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f6420o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f6421p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f6422q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f6423r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f6424s;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f9195d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC0473d.z(context, resourceId);
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
        setBackground(drawable);
        this.f6422q = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f6423r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f6414h = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int b(View view, int i, int i3, int i6, boolean z5) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i7 = ((i6 - measuredHeight) / 2) + i3;
        if (z5) {
            view.layout(i - measuredWidth, i7, i, measuredHeight + i7);
        } else {
            view.layout(i, i7, i + measuredWidth, measuredHeight + i7);
        }
        return z5 ? -measuredWidth : measuredWidth;
    }

    public final void a() {
        if (this.f6419n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f6419n = linearLayout;
            this.f6420o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f6421p = (TextView) this.f6419n.findViewById(R.id.action_bar_subtitle);
            int i = this.f6422q;
            if (i != 0) {
                this.f6420o.setTextAppearance(getContext(), i);
            }
            int i3 = this.f6423r;
            if (i3 != 0) {
                this.f6421p.setTextAppearance(getContext(), i3);
            }
        }
        this.f6420o.setText(this.f6416k);
        this.f6421p.setText(this.f6417l);
        boolean zIsEmpty = TextUtils.isEmpty(this.f6416k);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f6417l);
        this.f6421p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f6419n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f6419n.getParent() == null) {
            addView(this.f6419n);
        }
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            super.setVisibility(i);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f6414h;
    }

    public CharSequence getSubtitle() {
        return this.f6417l;
    }

    public CharSequence getTitle() {
        return this.f6416k;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, h.a.f9192a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f6415j = false;
        }
        if (!this.f6415j) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f6415j = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f6415j = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i3, int i6, int i7) {
        boolean zA = P0.a(this);
        int paddingRight = zA ? (i6 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i7 - i3) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f6419n;
        if (linearLayout != null && this.f6418m == null && linearLayout.getVisibility() != 8) {
            paddingRight += b(this.f6419n, paddingRight, paddingTop, paddingTop2, zA);
        }
        View view = this.f6418m;
        if (view != null) {
            b(view, paddingRight, paddingTop, paddingTop2, zA);
        }
        if (zA) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f6414h;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i3);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f6419n;
        if (linearLayout != null && this.f6418m == null) {
            if (this.f6424s) {
                this.f6419n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f6419n.getMeasuredWidth();
                boolean z5 = measuredWidth <= paddingLeft;
                if (z5) {
                    paddingLeft -= measuredWidth;
                }
                this.f6419n.setVisibility(z5 ? 0 : 8);
            } else {
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), iMakeMeasureSpec);
                paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
            }
        }
        View view = this.f6418m;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i6 = layoutParams.width;
            int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i6 >= 0) {
                paddingLeft = Math.min(i6, paddingLeft);
            }
            int i8 = layoutParams.height;
            int i9 = i8 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i8 >= 0) {
                iMin = Math.min(i8, iMin);
            }
            this.f6418m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(iMin, i9));
        }
        if (this.f6414h > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i10) {
                i10 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.i = false;
        }
        if (!this.i) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.i = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.i = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f6414h = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f6418m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f6418m = view;
        if (view != null && (linearLayout = this.f6419n) != null) {
            removeView(linearLayout);
            this.f6419n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f6417l = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f6416k = charSequence;
        a();
        A.b(this, charSequence);
    }

    public void setTitleOptional(boolean z5) {
        if (z5 != this.f6424s) {
            requestLayout();
        }
        this.f6424s = z5;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
