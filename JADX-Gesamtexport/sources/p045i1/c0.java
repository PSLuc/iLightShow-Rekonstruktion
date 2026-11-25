package p045i1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c0 f9451b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z f9452a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f9451b = Y.f9436q;
        } else {
            f9451b = Z.f9437b;
        }
    }

    public c0(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f9452a = new Y(this, windowInsets);
        } else {
            this.f9452a = new X(this, windowInsets);
        }
    }

    public static c0 b(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        c0 c0Var = new c0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
            c0 c0VarA = AbstractC0759u.a(view);
            Z z5 = c0Var.f9452a;
            z5.r(c0VarA);
            z5.d(view.getRootView());
        }
        return c0Var;
    }

    public final WindowInsets a() {
        Z z5 = this.f9452a;
        if (z5 instanceof U) {
            return ((U) z5).f9427c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        return Objects.equals(this.f9452a, ((c0) obj).f9452a);
    }

    public final int hashCode() {
        Z z5 = this.f9452a;
        if (z5 == null) {
            return 0;
        }
        return z5.hashCode();
    }

    public c0() {
        this.f9452a = new Z(this);
    }
}
