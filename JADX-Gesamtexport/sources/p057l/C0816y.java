package p057l;

import B.C0031p0;
import I0.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import h.a;
import java.lang.ref.WeakReference;
import p015c2.AbstractC0473d;
import p045i1.A;
import p045i1.AbstractC0762x;
import p045i1.ViewTreeObserverOnGlobalLayoutListenerC0756q;
import p070n1.k;
import p070n1.l;

/* JADX INFO: renamed from: l.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0816y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f10156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public B0 f10157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public B0 f10158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public B0 f10159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public B0 f10160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public B0 f10161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public B0 f10162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public B0 f10163h;
    public final E i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10164j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10165k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f10166l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10167m;

    public C0816y(TextView textView) {
        this.f10156a = textView;
        this.i = new E(textView);
    }

    public static B0 c(Context context, C0805o c0805o, int i) {
        ColorStateList colorStateListF;
        synchronized (c0805o) {
            colorStateListF = c0805o.f10130a.f(context, i);
        }
        if (colorStateListF == null) {
            return null;
        }
        B0 b6 = new B0();
        b6.f9966b = true;
        b6.f9967c = colorStateListF;
        return b6;
    }

    public final void a(Drawable drawable, B0 b6) {
        if (drawable == null || b6 == null) {
            return;
        }
        C0805o.c(drawable, b6, this.f10156a.getDrawableState());
    }

    public final void b() {
        B0 b6 = this.f10157b;
        TextView textView = this.f10156a;
        if (b6 != null || this.f10158c != null || this.f10159d != null || this.f10160e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f10157b);
            a(compoundDrawables[1], this.f10158c);
            a(compoundDrawables[2], this.f10159d);
            a(compoundDrawables[3], this.f10160e);
        }
        if (this.f10161f == null && this.f10162g == null) {
            return;
        }
        Drawable[] drawableArrA = AbstractC0812u.a(textView);
        a(drawableArrA[0], this.f10161f);
        a(drawableArrA[2], this.f10162g);
    }

    public final void d(AttributeSet attributeSet, int i) {
        C0805o c0805o;
        boolean z5;
        boolean z6;
        String string;
        String string2;
        boolean z7;
        int i3;
        ColorStateList colorStateList;
        int resourceId;
        int i6;
        int resourceId2;
        TextView textView = this.f10156a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = C0805o.f10128b;
        synchronized (C0805o.class) {
            try {
                if (C0805o.f10129c == null) {
                    C0805o.b();
                }
                c0805o = C0805o.f10129c;
            } catch (Throwable th) {
                throw th;
            }
        }
        int[] iArr = a.f9197f;
        C0031p0 c0031p0O = C0031p0.o(context, attributeSet, iArr, i);
        TextView textView2 = this.f10156a;
        Context context2 = textView2.getContext();
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
        AbstractC0762x.d(textView2, context2, iArr, attributeSet, (TypedArray) c0031p0O.f394j, i, 0);
        TypedArray typedArray = (TypedArray) c0031p0O.f394j;
        int i7 = -1;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f10157b = c(context, c0805o, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f10158c = c(context, c0805o, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f10159d = c(context, c0805o, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f10160e = c(context, c0805o, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f10161f = c(context, c0805o, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f10162g = c(context, c0805o, typedArray.getResourceId(6, 0));
        }
        c0031p0O.p();
        boolean z8 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = a.f9208r;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C0031p0 c0031p0 = new C0031p0(context, typedArrayObtainStyledAttributes);
            if (z8 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z5 = false;
                z6 = false;
            } else {
                z6 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z5 = true;
            }
            f(context, c0031p0);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = typedArrayObtainStyledAttributes.hasValue(13) ? typedArrayObtainStyledAttributes.getString(13) : null;
            c0031p0.p();
        } else {
            z5 = false;
            z6 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C0031p0 c0031p1 = new C0031p0(context, typedArrayObtainStyledAttributes2);
        if (!z8 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z6 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z5 = true;
        }
        boolean z9 = z6;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, c0031p1);
        c0031p1.p();
        if (!z8 && z5) {
            this.f10156a.setAllCaps(z9);
        }
        Typeface typeface = this.f10166l;
        if (typeface != null) {
            if (this.f10165k == -1) {
                textView.setTypeface(typeface, this.f10164j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            AbstractC0814w.d(textView, string);
        }
        if (string2 != null) {
            AbstractC0813v.b(textView, AbstractC0813v.a(string2));
        }
        int[] iArr3 = a.f9198g;
        E e6 = this.i;
        Context context3 = e6.f9977h;
        TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView3 = e6.f9976g;
        AbstractC0762x.d(textView3, textView3.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i, 0);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            e6.f9970a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (!typedArrayObtainStyledAttributes3.hasValue(3) || (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) <= 0) {
            z7 = false;
        } else {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            z7 = false;
            int[] iArr4 = new int[length];
            if (length > 0) {
                int i8 = 0;
                while (i8 < length) {
                    iArr4[i8] = typedArrayObtainTypedArray.getDimensionPixelSize(i8, i7);
                    i8++;
                    i7 = -1;
                }
                int[] iArrA = E.a(iArr4);
                e6.f9974e = iArrA;
                int length2 = iArrA.length;
                boolean z10 = length2 > 0;
                e6.f9975f = z10;
                if (z10) {
                    e6.f9970a = 1;
                    e6.f9972c = iArrA[0];
                    e6.f9973d = iArrA[length2 - 1];
                    e6.f9971b = -1.0f;
                }
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (e6.f9970a == 1) {
            if (!e6.f9975f) {
                DisplayMetrics displayMetrics = context3.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i6 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i6 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i6, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= 0.0f) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                }
                if (dimension3 <= dimension2) {
                    throw new IllegalArgumentException("Maximum auto-size text size (" + dimension3 + "px) is less or equal to minimum auto-size text size (" + dimension2 + "px)");
                }
                if (dimension <= 0.0f) {
                    throw new IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                }
                e6.f9970a = 1;
                e6.f9972c = dimension2;
                e6.f9973d = dimension3;
                e6.f9971b = dimension;
                e6.f9975f = z7;
            }
            if (e6.f9970a == 1 && (!e6.f9975f || e6.f9974e.length == 0)) {
                int iFloor = ((int) Math.floor((e6.f9973d - e6.f9972c) / e6.f9971b)) + 1;
                int[] iArr5 = new int[iFloor];
                for (int i9 = 0; i9 < iFloor; i9++) {
                    iArr5[i9] = Math.round((i9 * e6.f9971b) + e6.f9972c);
                }
                e6.f9974e = E.a(iArr5);
            }
        }
        int i10 = P0.f10019a;
        if (e6.f9970a != 0) {
            int[] iArr6 = e6.f9974e;
            if (iArr6.length > 0) {
                if (AbstractC0814w.a(textView) != -1.0f) {
                    AbstractC0814w.b(textView, Math.round(e6.f9972c), Math.round(e6.f9973d), Math.round(e6.f9971b), 0);
                } else {
                    AbstractC0814w.c(textView, iArr6, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableA = resourceId4 != -1 ? c0805o.a(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableA2 = resourceId5 != -1 ? c0805o.a(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableA3 = resourceId6 != -1 ? c0805o.a(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableA4 = resourceId7 != -1 ? c0805o.a(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableA5 = resourceId8 != -1 ? c0805o.a(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableA6 = resourceId9 != -1 ? c0805o.a(context, resourceId9) : null;
        if (drawableA5 != null || drawableA6 != null) {
            Drawable[] drawableArrA = AbstractC0812u.a(textView);
            if (drawableA5 == null) {
                drawableA5 = drawableArrA[0];
            }
            if (drawableA2 == null) {
                drawableA2 = drawableArrA[1];
            }
            if (drawableA6 == null) {
                drawableA6 = drawableArrA[2];
            }
            if (drawableA4 == null) {
                drawableA4 = drawableArrA[3];
            }
            AbstractC0812u.b(textView, drawableA5, drawableA2, drawableA6, drawableA4);
        } else if (drawableA != null || drawableA2 != null || drawableA3 != null || drawableA4 != null) {
            Drawable[] drawableArrA2 = AbstractC0812u.a(textView);
            Drawable drawable = drawableArrA2[0];
            if (drawable == null && drawableArrA2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableA == null) {
                    drawableA = compoundDrawables[0];
                }
                if (drawableA2 == null) {
                    drawableA2 = compoundDrawables[1];
                }
                if (drawableA3 == null) {
                    drawableA3 = compoundDrawables[2];
                }
                if (drawableA4 == null) {
                    drawableA4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableA, drawableA2, drawableA3, drawableA4);
            } else {
                if (drawableA2 == null) {
                    drawableA2 = drawableArrA2[1];
                }
                Drawable drawable2 = drawableArrA2[2];
                if (drawableA4 == null) {
                    drawableA4 = drawableArrA2[3];
                }
                AbstractC0812u.b(textView, drawable, drawableA2, drawable2, drawableA4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC0473d.x(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            k.f(textView, colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            i3 = -1;
            k.g(textView, H.b(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i3 = -1;
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, i3);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, i3);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, i3);
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i3) {
            if (dimensionPixelSize < 0) {
                throw new IllegalArgumentException();
            }
            l.d(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i3) {
            if (dimensionPixelSize2 < 0) {
                throw new IllegalArgumentException();
            }
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
            if (dimensionPixelSize2 > Math.abs(i11)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), dimensionPixelSize2 - i11);
            }
            i3 = -1;
        }
        if (dimensionPixelSize3 != i3) {
            if (dimensionPixelSize3 < 0) {
                throw new IllegalArgumentException();
            }
            int fontMetricsInt2 = textView.getPaint().getFontMetricsInt(null);
            if (dimensionPixelSize3 != fontMetricsInt2) {
                textView.setLineSpacing(dimensionPixelSize3 - fontMetricsInt2, 1.0f);
            }
        }
    }

    public final void e(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, a.f9208r);
        C0031p0 c0031p0 = new C0031p0(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f10156a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, c0031p0);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC0814w.d(textView, string);
        }
        c0031p0.p();
        Typeface typeface = this.f10166l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f10164j);
        }
    }

    public final void f(Context context, C0031p0 c0031p0) {
        String string;
        int i = this.f10164j;
        TypedArray typedArray = (TypedArray) c0031p0.f394j;
        this.f10164j = typedArray.getInt(2, i);
        int i3 = typedArray.getInt(11, -1);
        this.f10165k = i3;
        if (i3 != -1) {
            this.f10164j &= 2;
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f10167m = false;
                int i6 = typedArray.getInt(1, 1);
                if (i6 == 1) {
                    this.f10166l = Typeface.SANS_SERIF;
                    return;
                } else if (i6 == 2) {
                    this.f10166l = Typeface.SERIF;
                    return;
                } else {
                    if (i6 != 3) {
                        return;
                    }
                    this.f10166l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f10166l = null;
        int i7 = typedArray.hasValue(12) ? 12 : 10;
        int i8 = this.f10165k;
        int i9 = this.f10164j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceI = c0031p0.i(i7, this.f10164j, new d(this, i8, i9, new WeakReference(this.f10156a)));
                if (typefaceI != null) {
                    if (this.f10165k != -1) {
                        this.f10166l = AbstractC0815x.a(Typeface.create(typefaceI, 0), this.f10165k, (this.f10164j & 2) != 0);
                    } else {
                        this.f10166l = typefaceI;
                    }
                }
                this.f10167m = this.f10166l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f10166l != null || (string = typedArray.getString(i7)) == null) {
            return;
        }
        if (this.f10165k != -1) {
            this.f10166l = AbstractC0815x.a(Typeface.create(string, 0), this.f10165k, (this.f10164j & 2) != 0);
        } else {
            this.f10166l = Typeface.create(string, this.f10164j);
        }
    }
}
