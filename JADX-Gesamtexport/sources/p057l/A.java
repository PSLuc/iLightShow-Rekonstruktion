package p057l;

import S1.h0;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import c5.C0495p;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p015c2.AbstractC0473d;
import p036g1.a;
import p036g1.b;
import p070n1.k;
import p070n1.l;
import p131y1.f;

/* JADX INFO: loaded from: classes.dex */
public class A extends TextView {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0803n f9959h;
    public final C0816y i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0807p f9960j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9961k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0495p f9962l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Future f9963m;

    public A(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0807p getEmojiTextViewHelper() {
        if (this.f9960j == null) {
            this.f9960j = new C0807p(this);
        }
        return this.f9960j;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0803n c0803n = this.f9959h;
        if (c0803n != null) {
            c0803n.a();
        }
        C0816y c0816y = this.i;
        if (c0816y != null) {
            c0816y.b();
        }
    }

    public final void f() {
        Future future = this.f9963m;
        if (future == null) {
            return;
        }
        try {
            this.f9963m = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        int i = P0.f10019a;
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        int i = P0.f10019a;
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        int i = P0.f10019a;
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        int i = P0.f10019a;
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        int i = P0.f10019a;
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC0817z getSuperCaller() {
        if (this.f9962l == null) {
            this.f9962l = new C0495p(this);
        }
        return this.f9962l;
    }

    public ColorStateList getSupportBackgroundTintList() {
        B0 b6;
        C0803n c0803n = this.f9959h;
        if (c0803n == null || (b6 = c0803n.f10125e) == null) {
            return null;
        }
        return (ColorStateList) b6.f9967c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        B0 b6;
        C0803n c0803n = this.f9959h;
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

    @Override // android.widget.TextView
    public CharSequence getText() {
        f();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public a getTextMetricsParamsCompat() {
        return new a(l.c(this));
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.i.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            h0.x(editorInfo, getText());
        }
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z5, int i, int i3, int i6, int i7) {
        super.onLayout(z5, i, i3, i6, i7);
        C0816y c0816y = this.i;
        if (c0816y != null) {
            c0816y.getClass();
            int i8 = P0.f10019a;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i3) {
        f();
        super.onMeasure(i, i3);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i3, int i6) {
        super.onTextChanged(charSequence, i, i3, i6);
        if (this.i != null) {
            int i7 = P0.f10019a;
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        ((f) getEmojiTextViewHelper().f10133b.f14396h).d(z5);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i3, int i6, int i7) {
        int i8 = P0.f10019a;
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i3, i6, i7);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        int i3 = P0.f10019a;
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        int i3 = P0.f10019a;
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0803n c0803n = this.f9959h;
        if (c0803n != null) {
            c0803n.f10123c = -1;
            c0803n.d(null);
            c0803n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0803n c0803n = this.f9959h;
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0816y c0816y = this.i;
        if (c0816y != null) {
            c0816y.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0816y c0816y = this.i;
        if (c0816y != null) {
            c0816y.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z5) {
        ((f) getEmojiTextViewHelper().f10133b.f14396h).e(z5);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((f) getEmojiTextViewHelper().f10133b.f14396h).a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        getSuperCaller().i(i);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        getSuperCaller().e(i);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public void setPrecomputedText(b bVar) {
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0803n c0803n = this.f9959h;
        if (c0803n != null) {
            c0803n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0803n c0803n = this.f9959h;
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

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<b> future) {
        this.f9963m = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(a aVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = aVar.f9098b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(aVar.f9097a);
        k.e(this, aVar.f9099c);
        k.h(this, aVar.f9100d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f6) {
        int i3 = P0.f10019a;
        super.setTextSize(i, f6);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.f9961k) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            Z2.f fVar = p008b1.f.f7052a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f9961k = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f9961k = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0.a(context);
        this.f9961k = false;
        this.f9962l = null;
        z0.a(this, getContext());
        C0803n c0803n = new C0803n(this);
        this.f9959h = c0803n;
        c0803n.b(attributeSet, i);
        C0816y c0816y = new C0816y(this);
        this.i = c0816y;
        c0816y.d(attributeSet, i);
        c0816y.b();
        C0807p emojiTextViewHelper = getEmojiTextViewHelper();
        TypedArray typedArrayObtainStyledAttributes = emojiTextViewHelper.f10132a.getContext().obtainStyledAttributes(attributeSet, h.a.f9198g, i, 0);
        try {
            boolean z5 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            ((f) emojiTextViewHelper.f10133b.f14396h).e(z5);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i3, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC0473d.z(context, i) : null, i3 != 0 ? AbstractC0473d.z(context, i3) : null, i6 != 0 ? AbstractC0473d.z(context, i6) : null, i7 != 0 ? AbstractC0473d.z(context, i7) : null);
        C0816y c0816y = this.i;
        if (c0816y != null) {
            c0816y.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i3, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC0473d.z(context, i) : null, i3 != 0 ? AbstractC0473d.z(context, i3) : null, i6 != 0 ? AbstractC0473d.z(context, i6) : null, i7 != 0 ? AbstractC0473d.z(context, i7) : null);
        C0816y c0816y = this.i;
        if (c0816y != null) {
            c0816y.b();
        }
    }
}
