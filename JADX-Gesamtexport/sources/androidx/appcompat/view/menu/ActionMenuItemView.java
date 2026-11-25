package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import p052k.a;
import p052k.b;
import p052k.i;
import p052k.j;
import p052k.k;
import p052k.r;
import p057l.A;
import p057l.InterfaceC0795j;
import p057l.M0;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends A implements r, View.OnClickListener, InterfaceC0795j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k f6378n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f6379o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f6380p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i f6381q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a f6382r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b f6383s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6384t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6385u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f6386v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6387w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f6388x;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f6384t = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f9194c, 0, 0);
        this.f6386v = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f6388x = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f6387w = -1;
        setSaveEnabled(false);
    }

    @Override // p052k.r
    public final void a(k kVar) {
        this.f6378n = kVar;
        setIcon(kVar.getIcon());
        setTitle(kVar.getTitleCondensed());
        setId(kVar.f9869a);
        setVisibility(kVar.isVisible() ? 0 : 8);
        setEnabled(kVar.isEnabled());
        if (kVar.hasSubMenu() && this.f6382r == null) {
            this.f6382r = new a(this);
        }
    }

    @Override // p057l.InterfaceC0795j
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p057l.InterfaceC0795j
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f6378n.getIcon() == null;
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i3 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p052k.r
    public k getItemData() {
        return this.f6378n;
    }

    public final void h() {
        boolean z5 = true;
        boolean z6 = !TextUtils.isEmpty(this.f6379o);
        if (this.f6380p != null && ((this.f6378n.f9892y & 4) != 4 || (!this.f6384t && !this.f6385u))) {
            z5 = false;
        }
        boolean z7 = z6 & z5;
        setText(z7 ? this.f6379o : null);
        CharSequence charSequence = this.f6378n.f9884q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z7 ? null : this.f6378n.f9873e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f6378n.f9885r;
        if (TextUtils.isEmpty(charSequence2)) {
            M0.a(this, z7 ? null : this.f6378n.f9873e);
        } else {
            M0.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar = this.f6381q;
        if (iVar != null) {
            iVar.a(this.f6378n);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f6384t = g();
        h();
    }

    @Override // p057l.A, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i3) {
        int i6;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i6 = this.f6387w) >= 0) {
            super.setPadding(i6, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i3);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i7 = this.f6386v;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i7) : i7;
        if (mode != 1073741824 && i7 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i3);
        }
        if (!zIsEmpty || this.f6380p == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f6380p.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f6378n.hasSubMenu() && (aVar = this.f6382r) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z5) {
    }

    public void setChecked(boolean z5) {
    }

    public void setExpandedFormat(boolean z5) {
        if (this.f6385u != z5) {
            this.f6385u = z5;
            k kVar = this.f6378n;
            if (kVar != null) {
                j jVar = kVar.f9881n;
                jVar.f9857k = true;
                jVar.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f6380p = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f6388x;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(i iVar) {
        this.f6381q = iVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i3, int i6, int i7) {
        this.f6387w = i;
        super.setPadding(i, i3, i6, i7);
    }

    public void setPopupCallback(b bVar) {
        this.f6383s = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f6379o = charSequence;
        h();
    }
}
