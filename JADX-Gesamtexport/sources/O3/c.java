package O3;

import D4.e;
import E4.k;
import L.D;
import L.F;
import L.L;
import N.AbstractC0231o0;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.C0235q0;
import N3.M;
import V0.r;
import V0.t;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p020d2.n;
import p035g0.C0715p;
import p035g0.H;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f4574a = F.c(a.f4567a, 0, 0, 0, 0, a.f4568b, 0, 0, 0, a.f4569c, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 15);

    static {
        F.f(a.f4570d, 0L, 0L, 0L, 0L, a.f4571e, 0L, 0L, 0L, a.f4572f, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -546, 15);
    }

    public static final void a(final int i, C0230o c0230o, final boolean z5) {
        V.a aVar = M.f4035a;
        c0230o.X(-742043664);
        if (((i | 54) & 731) == 146 && c0230o.B()) {
            c0230o.P();
        } else {
            c0230o.V(348251771);
            c0230o.p(false);
            Window window = null;
            L.e(f4574a, null, d.f4575a, c0230o, 3462);
            H2.b bVar = H2.c.f1774b;
            c0230o.W(-715745933);
            c0230o.W(1009281237);
            AbstractC0231o0 abstractC0231o0 = AndroidCompositionLocals_androidKt.f6734f;
            ViewParent parent = ((View) c0230o.k(abstractC0231o0)).getParent();
            t tVar = parent instanceof t ? (t) parent : null;
            Window window2 = tVar != null ? ((r) tVar).f5443p : null;
            if (window2 == null) {
                Context context = ((View) c0230o.k(abstractC0231o0)).getContext();
                k.e("LocalView.current.context", context);
                while (true) {
                    if (!(context instanceof Activity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                        k.e("baseContext", context);
                    } else {
                        window = ((Activity) context).getWindow();
                        break;
                    }
                }
                window2 = window;
            }
            c0230o.p(false);
            View view = (View) c0230o.k(AndroidCompositionLocals_androidKt.f6734f);
            c0230o.W(511388516);
            boolean zF = c0230o.f(view) | c0230o.f(window2);
            Object objK = c0230o.K();
            if (zF || objK == C0222k.f3714a) {
                objK = new H2.a(view, window2);
                c0230o.f0(objK);
            }
            c0230o.p(false);
            H2.a aVar2 = (H2.a) objK;
            c0230o.p(false);
            long j4 = p035g0.r.f9084k;
            boolean z6 = H.n(j4) > 0.5f;
            H2.b bVar2 = H2.c.f1774b;
            aVar2.getClass();
            k.f("transformColorForLightContent", bVar2);
            C0715p c0715p = aVar2.f1771b;
            if (c0715p != null) {
                ((n) c0715p.i).K(z6);
            }
            Window window3 = aVar2.f1770a;
            if (window3 != null) {
                window3.setStatusBarColor(H.v((!z6 || (c0715p != null && ((n) c0715p.i).C())) ? j4 : ((p035g0.r) bVar2.invoke(new p035g0.r(j4))).f9087a));
            }
            if (c0715p != null) {
                ((n) c0715p.i).J(z6);
            }
            if (window3 != null) {
                window3.setNavigationBarContrastEnforced(true);
            }
            if (window3 != null) {
                if (z6 && (c0715p == null || !((n) c0715p.i).B())) {
                    j4 = ((p035g0.r) bVar2.invoke(new p035g0.r(j4))).f9087a;
                }
                window3.setNavigationBarColor(H.v(j4));
            }
            z5 = true;
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new e(z5, i) { // from class: O3.b

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f4573h;

                {
                    V.a aVar3 = M.f4035a;
                }

                @Override // D4.e
                public final Object d(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    V.a aVar3 = M.f4035a;
                    c.a(C0208d.V(385), (C0230o) obj, this.f4573h);
                    return x.f10867a;
                }
            };
        }
    }
}
