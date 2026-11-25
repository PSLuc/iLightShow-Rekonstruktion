package L2;

import B.C0025m0;
import D.x;
import O1.A;
import O1.C0310c;
import O1.r;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.internal.play_billing.AbstractC0602x;
import p045i1.ViewTreeObserverOnGlobalLayoutListenerC0756q;
import p057l.C0793i;
import p057l.N;
import p124x0.d0;
import p5.C0854t;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3078h;
    public final Object i;

    public /* synthetic */ o(int i, Object obj) {
        this.f3078h = i;
        this.i = obj;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [D4.a, E4.l] */
    @Override // java.lang.Runnable
    public final void run() {
        C0793i c0793i;
        switch (this.f3078h) {
            case 0:
                try {
                    ((Runnable) this.i).run();
                    return;
                } catch (Exception unused) {
                    Log.isLoggable("TRuntime.".concat("Executor"), 6);
                    return;
                }
            case 1:
                try {
                    ((C0310c) ((x) this.i).f707j).f4459A.e();
                    return;
                } catch (Throwable unused2) {
                    AbstractC0602x.h("BillingClient");
                    return;
                }
            case 2:
                r rVar = (r) this.i;
                C0310c c0310c = rVar.f4527e;
                c0310c.k(0);
                O1.g gVar = A.f4430k;
                c0310c.j(24, rVar.f4526d, gVar);
                rVar.c(gVar);
                return;
            case 3:
                ((Y2.h) this.i).h();
                return;
            case 4:
                X2.a aVar = ((Y2.h) ((C0025m0) this.i).i).f5893b;
                aVar.c(aVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 5:
                throw null;
            case 6:
                N n6 = (N) this.i;
                n6.f10016s = null;
                n6.drawableStateChanged();
                return;
            case 7:
                ActionMenuView actionMenuView = ((Toolbar) this.i).f6528h;
                if (actionMenuView == null || (c0793i = actionMenuView.f6458z) == null) {
                    return;
                }
                c0793i.k();
                return;
            case 8:
                p070n1.e eVar = (p070n1.e) this.i;
                if (eVar.f10532v) {
                    boolean z5 = eVar.f10530t;
                    p070n1.a aVar2 = eVar.f10519h;
                    if (z5) {
                        eVar.f10530t = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar2.f10514e = jCurrentAnimationTimeMillis;
                        aVar2.f10516g = -1L;
                        aVar2.f10515f = jCurrentAnimationTimeMillis;
                        aVar2.f10517h = 0.5f;
                    }
                    if ((aVar2.f10516g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.f10516g + ((long) aVar2.i)) || !eVar.e()) {
                        eVar.f10532v = false;
                        return;
                    }
                    boolean z6 = eVar.f10531u;
                    ListView listView = eVar.f10520j;
                    if (z6) {
                        eVar.f10531u = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar2.f10515f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar2.a(jCurrentAnimationTimeMillis2);
                    long j4 = jCurrentAnimationTimeMillis2 - aVar2.f10515f;
                    aVar2.f10515f = jCurrentAnimationTimeMillis2;
                    eVar.f10534x.scrollListBy((int) (j4 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar2.f10513d));
                    ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = p045i1.A.f9394a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 9:
                ((C0854t) this.i).f11144c = null;
                return;
            case 10:
                E4.k.e("invoke(...)", ((E4.l) this.i).invoke());
                return;
            case 11:
                p130y0.r rVar2 = (p130y0.r) this.i;
                rVar2.removeCallbacks(this);
                MotionEvent motionEvent = rVar2.f14508t0;
                if (motionEvent != null) {
                    boolean z7 = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z7) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i = 2;
                    }
                    p130y0.r rVar3 = (p130y0.r) this.i;
                    rVar3.D(motionEvent, i, rVar3.u0, false);
                    return;
                }
                return;
            case 12:
                ((p136z1.d) this.i).f14620l.onDismiss(null);
                return;
            default:
                ((d0) this.i).b();
                throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(D4.a aVar) {
        this.f3078h = 10;
        this.i = (E4.l) aVar;
    }

    public o(Y2.e eVar, Y2.r rVar) {
        this.f3078h = 5;
        this.i = rVar;
    }
}
