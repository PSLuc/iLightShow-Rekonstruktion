package p052k;

import E4.k;
import L4.l;
import P4.i0;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.nanjoran.ilightshow.R;
import java.util.Iterator;
import p045i1.E;
import p130y0.AbstractC1119a;
import p130y0.B;
import p130y0.b1;

/* JADX INFO: loaded from: classes.dex */
public final class d implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9811h;
    public final /* synthetic */ Object i;

    public /* synthetic */ d(int i, Object obj) {
        this.f9811h = i;
        this.i = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f9811h) {
            case 2:
                B b6 = (B) this.i;
                AccessibilityManager accessibilityManager = b6.f14191g;
                accessibilityManager.addAccessibilityStateChangeListener(b6.i);
                accessibilityManager.addTouchExplorationStateChangeListener(b6.f14193j);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z5;
        switch (this.f9811h) {
            case 0:
                g gVar = (g) this.i;
                ViewTreeObserver viewTreeObserver = gVar.f9823E;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        gVar.f9823E = view.getViewTreeObserver();
                    }
                    gVar.f9823E.removeGlobalOnLayoutListener(gVar.f9831p);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                t tVar = (t) this.i;
                ViewTreeObserver viewTreeObserver2 = tVar.f9919v;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        tVar.f9919v = view.getViewTreeObserver();
                    }
                    tVar.f9919v.removeGlobalOnLayoutListener(tVar.f9913p);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                B b6 = (B) this.i;
                b6.f14195l.removeCallbacks(b6.f14185K);
                AccessibilityManager accessibilityManager = b6.f14191g;
                accessibilityManager.removeAccessibilityStateChangeListener(b6.i);
                accessibilityManager.removeTouchExplorationStateChangeListener(b6.f14193j);
                break;
            case 3:
                AbstractC1119a abstractC1119a = (AbstractC1119a) this.i;
                k.f("<this>", abstractC1119a);
                Iterator it = l.P(abstractC1119a.getParent(), E.f9395p).iterator();
                while (true) {
                    z5 = false;
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            k.f("<this>", view2);
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z5 = true;
                            }
                        }
                    }
                }
                if (!z5) {
                    b1 b1Var = abstractC1119a.f14339j;
                    if (b1Var != null) {
                        b1Var.a();
                    }
                    abstractC1119a.f14339j = null;
                    abstractC1119a.requestLayout();
                }
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((i0) this.i).c(null);
                break;
        }
    }
}
