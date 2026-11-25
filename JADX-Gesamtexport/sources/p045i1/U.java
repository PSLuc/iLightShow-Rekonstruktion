package p045i1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p008b1.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class U extends Z {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f9423h = false;
    public static Method i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Class f9424j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Field f9425k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Field f9426l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets f9427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c[] f9428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f9429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c0 f9430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f9431g;

    public U(c0 c0Var, WindowInsets windowInsets) {
        super(c0Var);
        this.f9429e = null;
        this.f9427c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private c s(int i3, boolean z5) {
        c cVarA = c.f7046e;
        for (int i6 = 1; i6 <= 256; i6 <<= 1) {
            if ((i3 & i6) != 0) {
                cVarA = c.a(cVarA, t(i6, z5));
            }
        }
        return cVarA;
    }

    private c u() {
        c0 c0Var = this.f9430f;
        return c0Var != null ? c0Var.f9452a.i() : c.f7046e;
    }

    private c v(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f9423h) {
            x();
        }
        Method method = i;
        if (method != null && f9424j != null && f9425k != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke != null) {
                    Rect rect = (Rect) f9425k.get(f9426l.get(objInvoke));
                    if (rect != null) {
                        return c.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                }
            } catch (ReflectiveOperationException e6) {
                e6.getMessage();
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void x() {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f9424j = cls;
            f9425k = cls.getDeclaredField("mVisibleInsets");
            f9426l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f9425k.setAccessible(true);
            f9426l.setAccessible(true);
        } catch (ReflectiveOperationException e6) {
            e6.getMessage();
        }
        f9423h = true;
    }

    @Override // p045i1.Z
    public void d(View view) {
        c cVarV = v(view);
        if (cVarV == null) {
            cVarV = c.f7046e;
        }
        y(cVarV);
    }

    @Override // p045i1.Z
    public c f(int i3) {
        return s(i3, false);
    }

    @Override // p045i1.Z
    public c g(int i3) {
        return s(i3, true);
    }

    @Override // p045i1.Z
    public final c k() {
        if (this.f9429e == null) {
            WindowInsets windowInsets = this.f9427c;
            this.f9429e = c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f9429e;
    }

    @Override // p045i1.Z
    public boolean o() {
        return this.f9427c.isRound();
    }

    @Override // p045i1.Z
    @SuppressLint({"WrongConstant"})
    public boolean p(int i3) {
        for (int i6 = 1; i6 <= 256; i6 <<= 1) {
            if ((i3 & i6) != 0 && !w(i6)) {
                return false;
            }
        }
        return true;
    }

    @Override // p045i1.Z
    public void q(c[] cVarArr) {
        this.f9428d = cVarArr;
    }

    @Override // p045i1.Z
    public void r(c0 c0Var) {
        this.f9430f = c0Var;
    }

    public c t(int i3, boolean z5) {
        c cVarI;
        int i6;
        if (i3 == 1) {
            return z5 ? c.b(0, Math.max(u().f7048b, k().f7048b), 0, 0) : c.b(0, k().f7048b, 0, 0);
        }
        if (i3 == 2) {
            if (z5) {
                c cVarU = u();
                c cVarI2 = i();
                return c.b(Math.max(cVarU.f7047a, cVarI2.f7047a), 0, Math.max(cVarU.f7049c, cVarI2.f7049c), Math.max(cVarU.f7050d, cVarI2.f7050d));
            }
            c cVarK = k();
            c0 c0Var = this.f9430f;
            cVarI = c0Var != null ? c0Var.f9452a.i() : null;
            int iMin = cVarK.f7050d;
            if (cVarI != null) {
                iMin = Math.min(iMin, cVarI.f7050d);
            }
            return c.b(cVarK.f7047a, 0, cVarK.f7049c, iMin);
        }
        c cVar = c.f7046e;
        if (i3 == 8) {
            c[] cVarArr = this.f9428d;
            cVarI = cVarArr != null ? cVarArr[AbstractC0599v0.D(8)] : null;
            if (cVarI != null) {
                return cVarI;
            }
            c cVarK2 = k();
            c cVarU2 = u();
            int i7 = cVarK2.f7050d;
            if (i7 > cVarU2.f7050d) {
                return c.b(0, 0, 0, i7);
            }
            c cVar2 = this.f9431g;
            return (cVar2 == null || cVar2.equals(cVar) || (i6 = this.f9431g.f7050d) <= cVarU2.f7050d) ? cVar : c.b(0, 0, 0, i6);
        }
        if (i3 == 16) {
            return j();
        }
        if (i3 == 32) {
            return h();
        }
        if (i3 == 64) {
            return l();
        }
        if (i3 != 128) {
            return cVar;
        }
        c0 c0Var2 = this.f9430f;
        C0745f c0745fE = c0Var2 != null ? c0Var2.f9452a.e() : e();
        if (c0745fE == null) {
            return cVar;
        }
        DisplayCutout displayCutout = c0745fE.f9456a;
        return c.b(AbstractC0743d.d(displayCutout), AbstractC0743d.f(displayCutout), AbstractC0743d.e(displayCutout), AbstractC0743d.c(displayCutout));
    }

    public boolean w(int i3) {
        if (i3 != 1 && i3 != 2) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 8 && i3 != 128) {
                return true;
            }
        }
        return !t(i3, false).equals(c.f7046e);
    }

    public void y(c cVar) {
        this.f9431g = cVar;
    }
}
