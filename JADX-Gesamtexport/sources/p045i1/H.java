package p045i1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import p008b1.c;

/* JADX INFO: loaded from: classes.dex */
public final class H implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f9396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f9397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f9398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f9400e;

    public H(O o6, c0 c0Var, c0 c0Var2, int i, View view) {
        this.f9396a = o6;
        this.f9397b = c0Var;
        this.f9398c = c0Var2;
        this.f9399d = i;
        this.f9400e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        O o6 = this.f9396a;
        o6.f9415a.c(animatedFraction);
        float fB = o6.f9415a.b();
        PathInterpolator pathInterpolator = K.f9405d;
        int i3 = Build.VERSION.SDK_INT;
        c0 c0Var = this.f9397b;
        T s6 = i3 >= 30 ? new S(c0Var) : new Q(c0Var);
        int i6 = 1;
        while (i6 <= 256) {
            int i7 = this.f9399d & i6;
            Z z5 = c0Var.f9452a;
            if (i7 == 0) {
                s6.c(i6, z5.f(i6));
                i = 1;
            } else {
                c cVarF = z5.f(i6);
                c cVarF2 = this.f9398c.f9452a.f(i6);
                float f6 = 1.0f - fB;
                int i8 = (int) (((double) ((cVarF.f7047a - cVarF2.f7047a) * f6)) + 0.5d);
                int i9 = (int) (((double) ((cVarF.f7048b - cVarF2.f7048b) * f6)) + 0.5d);
                i = 1;
                int i10 = (int) (((double) ((cVarF.f7049c - cVarF2.f7049c) * f6)) + 0.5d);
                int i11 = (int) (((double) ((cVarF.f7050d - cVarF2.f7050d) * f6)) + 0.5d);
                int iMax = Math.max(0, cVarF.f7047a - i8);
                int iMax2 = Math.max(0, cVarF.f7048b - i9);
                int iMax3 = Math.max(0, cVarF.f7049c - i10);
                int iMax4 = Math.max(0, cVarF.f7050d - i11);
                if (iMax != i8 || iMax2 != i9 || iMax3 != i10 || iMax4 != i11) {
                    cVarF = c.b(iMax, iMax2, iMax3, iMax4);
                }
                s6.c(i6, cVarF);
            }
            i6 <<= i;
            fB = fB;
        }
        c0 c0VarB = s6.b();
        Collections.singletonList(o6);
        K.f(this.f9400e, c0VarB);
    }
}
