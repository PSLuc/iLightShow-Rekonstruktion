package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p057l.O0;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6546h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public WeakReference f6547j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LayoutInflater f6548k;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6546h = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f9211u, 0, 0);
        this.i = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f6546h = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.i;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f6548k;
    }

    public int getLayoutResource() {
        return this.f6546h;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.i = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f6548k = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f6546h = i;
    }

    public void setOnInflateListener(O0 o6) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.f6547j;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            ViewParent parent = getParent();
            if (!(parent instanceof ViewGroup)) {
                throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
            }
            if (this.f6546h == 0) {
                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflaterFrom = this.f6548k;
            if (layoutInflaterFrom == null) {
                layoutInflaterFrom = LayoutInflater.from(getContext());
            }
            View viewInflate = layoutInflaterFrom.inflate(this.f6546h, viewGroup, false);
            int i3 = this.i;
            if (i3 != -1) {
                viewInflate.setId(i3);
            }
            int iIndexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
            } else {
                viewGroup.addView(viewInflate, iIndexOfChild);
            }
            this.f6547j = new WeakReference(viewInflate);
        }
    }
}
