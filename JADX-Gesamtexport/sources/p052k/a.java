package p052k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p057l.C0787f;
import p057l.C0789g;
import p057l.C0791h;
import p057l.C0793i;
import p057l.N;
import p057l.P;

/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f9800h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f9801j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f9802k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public P f9803l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public P f9804m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9805n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9806o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int[] f9807p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f9808q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ View f9809r;

    public a(View view) {
        this.f9807p = new int[2];
        this.f9802k = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f9800h = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.i = tapTimeout;
        this.f9801j = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        P p6 = this.f9804m;
        View view = this.f9802k;
        if (p6 != null) {
            view.removeCallbacks(p6);
        }
        P p7 = this.f9803l;
        if (p7 != null) {
            view.removeCallbacks(p7);
        }
    }

    public final l b() {
        C0787f c0787f;
        switch (this.f9808q) {
            case 0:
                b bVar = ((ActionMenuItemView) this.f9809r).f6383s;
                if (bVar == null || (c0787f = ((C0789g) bVar).f10071a.f10101z) == null) {
                    return null;
                }
                return c0787f.a();
            default:
                C0787f c0787f2 = ((C0791h) this.f9809r).f10072k.f10100y;
                if (c0787f2 == null) {
                    return null;
                }
                return c0787f2.a();
        }
    }

    public final boolean c() {
        l lVarB;
        switch (this.f9808q) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f9809r;
                i iVar = actionMenuItemView.f6381q;
                return iVar != null && iVar.a(actionMenuItemView.f6378n) && (lVarB = b()) != null && lVarB.k();
            default:
                ((C0791h) this.f9809r).f10072k.k();
                return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z5;
        C0793i c0793i;
        boolean z6;
        l lVarB;
        N n6;
        boolean z7 = this.f9805n;
        View view2 = this.f9802k;
        if (z7) {
            l lVarB2 = b();
            if (lVarB2 == null || !lVarB2.k() || (n6 = (N) lVarB2.g()) == null || !n6.isShown()) {
                switch (this.f9808q) {
                    case 1:
                        c0793i = ((C0791h) this.f9809r).f10072k;
                        if (c0793i.f10081A != null) {
                            c0793i.g();
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        break;
                    default:
                        lVarB = b();
                        if (lVarB != null && lVarB.k()) {
                            lVarB.dismiss();
                        }
                        z6 = true;
                        break;
                }
                if (z6) {
                    z5 = false;
                } else {
                    z5 = true;
                }
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f9807p;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                n6.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = n6.b(motionEventObtainNoHistory, this.f9806o);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z8 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z8) {
                    z5 = true;
                } else {
                    switch (this.f9808q) {
                        case 1:
                            c0793i = ((C0791h) this.f9809r).f10072k;
                            if (c0793i.f10081A != null) {
                                c0793i.g();
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            break;
                        default:
                            lVarB = b();
                            if (lVarB != null) {
                                lVarB.dismiss();
                            }
                            z6 = true;
                            break;
                    }
                    if (z6) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                }
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f9806o = motionEvent.getPointerId(0);
                    if (this.f9803l == null) {
                        this.f9803l = new P(this, 0);
                    }
                    view2.postDelayed(this.f9803l, this.i);
                    if (this.f9804m == null) {
                        this.f9804m = new P(this, 1);
                    }
                    view2.postDelayed(this.f9804m, this.f9801j);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f9806o);
                    if (iFindPointerIndex >= 0) {
                        float x6 = motionEvent.getX(iFindPointerIndex);
                        float y2 = motionEvent.getY(iFindPointerIndex);
                        float f6 = this.f9800h;
                        float f7 = -f6;
                        if (x6 < f7 || y2 < f7 || x6 >= (view2.getRight() - view2.getLeft()) + f6 || y2 >= (view2.getBottom() - view2.getTop()) + f6) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            z5 = c();
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
            }
            if (z5) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f9805n = z5;
        return z5 || z7;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f9805n = false;
        this.f9806o = -1;
        P p6 = this.f9803l;
        if (p6 != null) {
            this.f9802k.removeCallbacks(p6);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f9808q = 0;
        this.f9809r = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(C0791h c0791h, C0791h c0791h2) {
        this(c0791h2);
        this.f9808q = 1;
        this.f9809r = c0791h;
    }
}
