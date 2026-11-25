package p057l;

import B.C0031p0;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import h.a;
import p015c2.AbstractC0473d;
import p035g0.C0715p;
import p124x0.d0;
import p130y0.C1136i0;
import p131y1.b;

/* JADX INFO: renamed from: l.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0801m extends AutoCompleteTextView {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f10117k = {R.attr.popupBackground};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0803n f10118h;
    public final C0816y i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0715p f10119j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0801m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.nanjoran.ilightshow.R.attr.autoCompleteTextViewStyle);
        A0.a(context);
        z0.a(this, getContext());
        C0031p0 c0031p0O = C0031p0.o(getContext(), attributeSet, f10117k, com.nanjoran.ilightshow.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) c0031p0O.f394j).hasValue(0)) {
            setDropDownBackgroundDrawable(c0031p0O.h(0));
        }
        c0031p0O.p();
        C0803n c0803n = new C0803n(this);
        this.f10118h = c0803n;
        c0803n.b(attributeSet, com.nanjoran.ilightshow.R.attr.autoCompleteTextViewStyle);
        C0816y c0816y = new C0816y(this);
        this.i = c0816y;
        c0816y.d(attributeSet, com.nanjoran.ilightshow.R.attr.autoCompleteTextViewStyle);
        c0816y.b();
        C0715p c0715p = new C0715p(this);
        this.f10119j = c0715p;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.f9198g, com.nanjoran.ilightshow.R.attr.autoCompleteTextViewStyle, 0);
        try {
            boolean z5 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            c0715p.z(z5);
            KeyListener keyListener = getKeyListener();
            if (keyListener instanceof NumberKeyListener) {
                return;
            }
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerR = c0715p.r(keyListener);
            if (keyListenerR == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerR);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0803n c0803n = this.f10118h;
        if (c0803n != null) {
            c0803n.a();
        }
        C0816y c0816y = this.i;
        if (c0816y != null) {
            c0816y.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        B0 b6;
        C0803n c0803n = this.f10118h;
        if (c0803n == null || (b6 = c0803n.f10125e) == null) {
            return null;
        }
        return (ColorStateList) b6.f9967c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        B0 b6;
        C0803n c0803n = this.f10118h;
        if (c0803n == null || (b6 = c0803n.f10125e) == null) {
            return null;
        }
        return (PorterDuff.Mode) b6.f9968d;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        B0 b6 = this.i.f10163h;
        if (b6 != null) {
            return (ColorStateList) b6.f9967c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        B0 b6 = this.i.f10163h;
        if (b6 != null) {
            return (PorterDuff.Mode) b6.f9968d;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        C1136i0 c1136i0 = (C1136i0) this.f10119j.i;
        if (inputConnectionOnCreateInputConnection == null) {
            c1136i0.getClass();
            return null;
        }
        d0 d0Var = (d0) c1136i0.f14396h;
        d0Var.getClass();
        return inputConnectionOnCreateInputConnection instanceof b ? inputConnectionOnCreateInputConnection : new b((AbstractC0801m) d0Var.f14007b, inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0803n c0803n = this.f10118h;
        if (c0803n != null) {
            c0803n.f10123c = -1;
            c0803n.d(null);
            c0803n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0803n c0803n = this.f10118h;
        if (c0803n != null) {
            c0803n.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0816y c0816y = this.i;
        if (c0816y != null) {
            c0816y.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0816y c0816y = this.i;
        if (c0816y != null) {
            c0816y.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AbstractC0473d.z(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        this.f10119j.z(z5);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f10119j.r(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0803n c0803n = this.f10118h;
        if (c0803n != null) {
            c0803n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0803n c0803n = this.f10118h;
        if (c0803n != null) {
            c0803n.f(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0816y c0816y = this.i;
        if (c0816y.f10163h == null) {
            c0816y.f10163h = new B0();
        }
        B0 b6 = c0816y.f10163h;
        b6.f9967c = colorStateList;
        b6.f9966b = colorStateList != null;
        c0816y.f10157b = b6;
        c0816y.f10158c = b6;
        c0816y.f10159d = b6;
        c0816y.f10160e = b6;
        c0816y.f10161f = b6;
        c0816y.f10162g = b6;
        c0816y.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0816y c0816y = this.i;
        if (c0816y.f10163h == null) {
            c0816y.f10163h = new B0();
        }
        B0 b6 = c0816y.f10163h;
        b6.f9968d = mode;
        b6.f9965a = mode != null;
        c0816y.f10157b = b6;
        c0816y.f10158c = b6;
        c0816y.f10159d = b6;
        c0816y.f10160e = b6;
        c0816y.f10161f = b6;
        c0816y.f10162g = b6;
        c0816y.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0816y c0816y = this.i;
        if (c0816y != null) {
            c0816y.e(context, i);
        }
    }
}
