package p045i1;

import H0.h;
import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p008b1.c;
import p123x.F;
import p123x.b0;

/* JADX INFO: loaded from: classes.dex */
public final class L extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f9408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f9409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f9410c;

    public L(F f6) {
        super(f6.i);
        this.f9410c = new HashMap();
        this.f9408a = f6;
    }

    public final O a(WindowInsetsAnimation windowInsetsAnimation) {
        O o6 = (O) this.f9410c.get(windowInsetsAnimation);
        if (o6 == null) {
            o6 = new O(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                o6.f9415a = new M(windowInsetsAnimation);
            }
            this.f9410c.put(windowInsetsAnimation, o6);
        }
        return o6;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f9408a.b(a(windowInsetsAnimation));
        this.f9410c.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        F f6 = this.f9408a;
        a(windowInsetsAnimation);
        f6.f13682k = true;
        f6.f13683l = true;
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f9409b;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f9409b = arrayList2;
            Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationI = h.i(list.get(size));
            O oA = a(windowInsetsAnimationI);
            oA.f9415a.c(windowInsetsAnimationI.getFraction());
            this.f9409b.add(oA);
        }
        F f6 = this.f9408a;
        c0 c0VarB = c0.b(null, windowInsets);
        b0 b0Var = f6.f13681j;
        b0.a(b0Var, c0VarB);
        if (b0Var.f13753r) {
            c0VarB = c0.f9451b;
        }
        return c0VarB.a();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        F f6 = this.f9408a;
        a(windowInsetsAnimation);
        c cVarC = c.c(bounds.getLowerBound());
        c cVarC2 = c.c(bounds.getUpperBound());
        f6.f13682k = false;
        h.l();
        return h.g(cVarC.d(), cVarC2.d());
    }
}
