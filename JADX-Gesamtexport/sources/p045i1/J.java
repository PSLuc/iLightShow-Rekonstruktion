package p045i1;

import O1.n;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import c5.C0495p;
import java.util.Objects;
import p008b1.c;
import p123x.F;

/* JADX INFO: loaded from: classes.dex */
public final class J implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f9403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c0 f9404b;

    public J(View view, F f6) {
        c0 c0VarB;
        this.f9403a = f6;
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
        c0 c0VarA = AbstractC0759u.a(view);
        if (c0VarA != null) {
            c0VarB = (Build.VERSION.SDK_INT >= 30 ? new S(c0VarA) : new Q(c0VarA)).b();
        } else {
            c0VarB = null;
        }
        this.f9404b = c0VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Z z5;
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.f9404b = c0.b(view, windowInsets);
            return K.h(view, windowInsets);
        }
        c0 c0VarB = c0.b(view, windowInsets);
        if (this.f9404b == null) {
            ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
            this.f9404b = AbstractC0759u.a(view);
        }
        if (this.f9404b == null) {
            this.f9404b = c0VarB;
            return K.h(view, windowInsets);
        }
        F fI = K.i(view);
        if (fI != null && Objects.equals(fI.f13680h, windowInsets)) {
            return K.h(view, windowInsets);
        }
        c0 c0Var = this.f9404b;
        int i = 1;
        int i3 = 0;
        while (true) {
            z5 = c0VarB.f9452a;
            if (i > 256) {
                break;
            }
            if (!z5.f(i).equals(c0Var.f9452a.f(i))) {
                i3 |= i;
            }
            i <<= 1;
        }
        if (i3 == 0) {
            return K.h(view, windowInsets);
        }
        c0 c0Var2 = this.f9404b;
        if ((i3 & 8) != 0) {
            interpolator = z5.f(8).f7050d > c0Var2.f9452a.f(8).f7050d ? K.f9405d : K.f9406e;
        } else {
            interpolator = K.f9407f;
        }
        O o6 = new O(i3, interpolator, 160L);
        o6.f9415a.c(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(o6.f9415a.a());
        c cVarF = z5.f(i3);
        c cVarF2 = c0Var2.f9452a.f(i3);
        int iMin = Math.min(cVarF.f7047a, cVarF2.f7047a);
        int i6 = cVarF.f7048b;
        int i7 = cVarF2.f7048b;
        int iMin2 = Math.min(i6, i7);
        int i8 = cVarF.f7049c;
        int i9 = cVarF2.f7049c;
        int iMin3 = Math.min(i8, i9);
        int i10 = cVarF.f7050d;
        int i11 = cVarF2.f7050d;
        C0495p c0495p = new C0495p(c.b(iMin, iMin2, iMin3, Math.min(i10, i11)), 8, c.b(Math.max(cVarF.f7047a, cVarF2.f7047a), Math.max(i6, i7), Math.max(i8, i9), Math.max(i10, i11)));
        K.e(view, windowInsets, false);
        duration.addUpdateListener(new H(o6, c0VarB, c0Var2, i3, view));
        duration.addListener(new I(view, o6));
        n nVar = new n(view, o6, c0495p, duration);
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0750k viewTreeObserverOnPreDrawListenerC0750k = new ViewTreeObserverOnPreDrawListenerC0750k(view, nVar);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0750k);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0750k);
        this.f9404b = c0VarB;
        return K.h(view, windowInsets);
    }
}
