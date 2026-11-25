package p057l;

import B.C0031p0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import h.a;
import p045i1.A;
import p045i1.AbstractC0758t;
import p045i1.AbstractC0762x;
import p045i1.ViewTreeObserverOnGlobalLayoutListenerC0756q;

/* JADX INFO: renamed from: l.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0803n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f10121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0805o f10122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10123c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public B0 f10124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public B0 f10125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public B0 f10126f;

    public C0803n(View view) {
        C0805o c0805o;
        this.f10121a = view;
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
        this.f10122b = c0805o;
    }

    public final void a() {
        View view = this.f10121a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f10124d != null) {
                if (this.f10126f == null) {
                    this.f10126f = new B0();
                }
                B0 b6 = this.f10126f;
                b6.f9967c = null;
                b6.f9966b = false;
                b6.f9968d = null;
                b6.f9965a = false;
                ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
                ColorStateList colorStateListG = AbstractC0758t.g(view);
                if (colorStateListG != null) {
                    b6.f9966b = true;
                    b6.f9967c = colorStateListG;
                }
                PorterDuff.Mode modeH = AbstractC0758t.h(view);
                if (modeH != null) {
                    b6.f9965a = true;
                    b6.f9968d = modeH;
                }
                if (b6.f9966b || b6.f9965a) {
                    C0805o.c(background, b6, view.getDrawableState());
                    return;
                }
            }
            B0 b7 = this.f10125e;
            if (b7 != null) {
                C0805o.c(background, b7, view.getDrawableState());
                return;
            }
            B0 b8 = this.f10124d;
            if (b8 != null) {
                C0805o.c(background, b8, view.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListF;
        View view = this.f10121a;
        Context context = view.getContext();
        int[] iArr = a.f9210t;
        C0031p0 c0031p0O = C0031p0.o(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c0031p0O.f394j;
        View view2 = this.f10121a;
        Context context2 = view2.getContext();
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
        AbstractC0762x.d(view2, context2, iArr, attributeSet, (TypedArray) c0031p0O.f394j, i, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.f10123c = typedArray.getResourceId(0, -1);
                C0805o c0805o = this.f10122b;
                Context context3 = view.getContext();
                int i3 = this.f10123c;
                synchronized (c0805o) {
                    colorStateListF = c0805o.f10130a.f(context3, i3);
                }
                if (colorStateListF != null) {
                    d(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                AbstractC0758t.q(view, c0031p0O.g(1));
            }
            if (typedArray.hasValue(2)) {
                AbstractC0758t.r(view, H.b(typedArray.getInt(2, -1), null));
            }
            c0031p0O.p();
        } catch (Throwable th) {
            c0031p0O.p();
            throw th;
        }
    }

    public final void c(int i) {
        ColorStateList colorStateListF;
        this.f10123c = i;
        C0805o c0805o = this.f10122b;
        if (c0805o != null) {
            Context context = this.f10121a.getContext();
            synchronized (c0805o) {
                colorStateListF = c0805o.f10130a.f(context, i);
            }
        } else {
            colorStateListF = null;
        }
        d(colorStateListF);
        a();
    }

    public final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f10124d == null) {
                this.f10124d = new B0();
            }
            B0 b6 = this.f10124d;
            b6.f9967c = colorStateList;
            b6.f9966b = true;
        } else {
            this.f10124d = null;
        }
        a();
    }

    public final void e(ColorStateList colorStateList) {
        if (this.f10125e == null) {
            this.f10125e = new B0();
        }
        B0 b6 = this.f10125e;
        b6.f9967c = colorStateList;
        b6.f9966b = true;
        a();
    }

    public final void f(PorterDuff.Mode mode) {
        if (this.f10125e == null) {
            this.f10125e = new B0();
        }
        B0 b6 = this.f10125e;
        b6.f9968d = mode;
        b6.f9965a = true;
        a();
    }
}
