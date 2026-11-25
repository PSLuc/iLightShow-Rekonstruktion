package p130y0;

import B.C0003b0;
import B.c1;
import E4.w;
import F.C0074p;
import N.AbstractC0234q;
import N.C0221j0;
import N.C0230o;
import N.C0248x0;
import N.EnumC0236r0;
import N.P;
import N.U;
import N.V;
import P4.AbstractC0314a;
import P4.AbstractC0336x;
import P4.D;
import P4.c0;
import P4.i0;
import Q4.c;
import Z.b;
import Z.p;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.C0460u;
import androidx.lifecycle.InterfaceC0458s;
import androidx.lifecycle.J;
import com.nanjoran.ilightshow.R;
import java.lang.ref.WeakReference;
import p027e3.a;
import p052k.d;
import p084p4.m;
import p111u4.e;
import p111u4.i;
import p111u4.j;
import p124x0.f0;

/* JADX INFO: renamed from: y0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1119a extends ViewGroup {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public WeakReference f14338h;
    public IBinder i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b1 f14339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AbstractC0234q f14340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c1 f14341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14342m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14343n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f14344o;

    public AbstractC1119a(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        d dVar = new d(3, this);
        addOnAttachStateChangeListener(dVar);
        C0074p c0074p = new C0074p(18);
        a.g0(this).f10835a.add(c0074p);
        this.f14341l = new c1(this, dVar, c0074p, 8);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(AbstractC0234q abstractC0234q) {
        if (this.f14340k != abstractC0234q) {
            this.f14340k = abstractC0234q;
            if (abstractC0234q != null) {
                this.f14338h = null;
            }
            b1 b1Var = this.f14339j;
            if (b1Var != null) {
                b1Var.a();
                this.f14339j = null;
                if (isAttachedToWindow()) {
                    c();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.i != iBinder) {
            this.i = iBinder;
            this.f14338h = null;
        }
    }

    public abstract void a(int i, C0230o c0230o);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (this.f14343n) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (this.f14339j == null) {
            try {
                this.f14343n = true;
                this.f14339j = d1.a(this, f(), new V.a(-656146368, new C0003b0(24, this), true));
            } finally {
                this.f14343n = false;
            }
        }
    }

    public void d(int i, int i3, int i6, int i7, boolean z5) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i6 - i) - getPaddingRight(), (i7 - i3) - getPaddingBottom());
        }
    }

    public void e(int i, int i3) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i3);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i3) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i3)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public final AbstractC0234q f() {
        C0248x0 c0248x0;
        i iVar;
        C0221j0 c0221j0;
        int i = 4;
        AbstractC0234q abstractC0234qB = this.f14340k;
        if (abstractC0234qB == null) {
            abstractC0234qB = X0.b(this);
            if (abstractC0234qB == null) {
                for (ViewParent parent = getParent(); abstractC0234qB == null && (parent instanceof View); parent = parent.getParent()) {
                    abstractC0234qB = X0.b((View) parent);
                }
            }
            if (abstractC0234qB != null) {
                AbstractC0234q abstractC0234q = (!(abstractC0234qB instanceof C0248x0) || ((EnumC0236r0) ((C0248x0) abstractC0234qB).f3870r.getValue()).compareTo(EnumC0236r0.i) > 0) ? abstractC0234qB : null;
                if (abstractC0234q != null) {
                    this.f14338h = new WeakReference(abstractC0234q);
                }
            } else {
                abstractC0234qB = null;
            }
            if (abstractC0234qB == null) {
                WeakReference weakReference = this.f14338h;
                if (weakReference == null || (abstractC0234qB = (AbstractC0234q) weakReference.get()) == null || ((abstractC0234qB instanceof C0248x0) && ((EnumC0236r0) ((C0248x0) abstractC0234qB).f3870r.getValue()).compareTo(EnumC0236r0.i) <= 0)) {
                    abstractC0234qB = null;
                }
                if (abstractC0234qB == null) {
                    if (!isAttachedToWindow()) {
                        a.y0("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                        throw null;
                    }
                    Object parent2 = getParent();
                    View view = this;
                    while (parent2 instanceof View) {
                        View view2 = (View) parent2;
                        if (view2.getId() == 16908290) {
                            break;
                        }
                        view = view2;
                        parent2 = view2.getParent();
                    }
                    AbstractC0234q abstractC0234qB2 = X0.b(view);
                    if (abstractC0234qB2 == null) {
                        ((O0) Q0.f14287a.get()).getClass();
                        i iVar2 = j.f12751h;
                        m mVar = S.f14289t;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            iVar = (i) S.f14289t.getValue();
                        } else {
                            iVar = (i) S.f14290u.get();
                            if (iVar == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        i iVarO = iVar.o(iVar2);
                        V v6 = (V) iVarO.J(U.i);
                        if (v6 != null) {
                            c0221j0 = new C0221j0(v6);
                            P p6 = (P) c0221j0.f3713j;
                            synchronized (p6.f3648c) {
                                p6.f3646a = false;
                            }
                        } else {
                            c0221j0 = null;
                        }
                        w wVar = new w();
                        i c1152q0 = (p) iVarO.J(b.f5946v);
                        if (c1152q0 == null) {
                            c1152q0 = new C1152q0();
                            wVar.f1074h = c1152q0;
                        }
                        if (c0221j0 != null) {
                            iVar2 = c0221j0;
                        }
                        i iVarO2 = iVarO.o(iVar2).o(c1152q0);
                        c0248x0 = new C0248x0(iVarO2);
                        synchronized (c0248x0.f3855b) {
                            c0248x0.f3869q = true;
                        }
                        U4.d dVarA = AbstractC0336x.a(iVarO2);
                        InterfaceC0458s interfaceC0458sF = J.f(view);
                        C0460u c0460uF = interfaceC0458sF != null ? interfaceC0458sF.f() : null;
                        if (c0460uF == null) {
                            a.z0("ViewTreeLifecycleOwner not found from " + view);
                            throw null;
                        }
                        view.addOnAttachStateChangeListener(new R0(view, c0248x0));
                        c0460uF.a(new V0(dVarA, c0221j0, c0248x0, wVar, view));
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, c0248x0);
                        Handler handler = view.getHandler();
                        int i3 = Q4.d.f4705a;
                        i iVar3 = new c(handler, "windowRecomposer cleanup", false).f4704m;
                        P0 p7 = new P0(c0248x0, view, null);
                        if ((2 & 1) != 0) {
                            iVar3 = j.f12751h;
                        }
                        int i6 = (2 & 2) != 0 ? 1 : 4;
                        i iVarG = AbstractC0336x.g(j.f12751h, iVar3, true);
                        W4.d dVar = D.f4604a;
                        if (iVarG != dVar && iVarG.J(e.f12750h) == null) {
                            iVarG = iVarG.o(dVar);
                        }
                        if (i6 == 0) {
                            throw null;
                        }
                        AbstractC0314a c0Var = i6 == 2 ? new c0(iVarG, p7) : new i0(iVarG, true);
                        c0Var.f0(i6, c0Var, p7);
                        view.addOnAttachStateChangeListener(new d(i, c0Var));
                    } else {
                        if (!(abstractC0234qB2 instanceof C0248x0)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        c0248x0 = (C0248x0) abstractC0234qB2;
                    }
                    C0248x0 c0248x1 = ((EnumC0236r0) c0248x0.f3870r.getValue()).compareTo(EnumC0236r0.i) > 0 ? c0248x0 : null;
                    if (c0248x1 != null) {
                        this.f14338h = new WeakReference(c0248x1);
                    }
                    return c0248x0;
                }
            }
        }
        return abstractC0234qB;
    }

    public final boolean getHasComposition() {
        return this.f14339j != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f14342m;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f14344o || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i3, int i6, int i7) {
        d(i, i3, i6, i7, z5);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        c();
        e(i, i3);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i);
    }

    public final void setParentCompositionContext(AbstractC0234q abstractC0234q) {
        setParentContext(abstractC0234q);
    }

    public final void setShowLayoutBounds(boolean z5) {
        this.f14342m = z5;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((r) ((f0) childAt)).setShowLayoutBounds(z5);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z5) {
        super.setTransitionGroup(z5);
        this.f14344o = true;
    }

    public final void setViewCompositionStrategy(F0 f6) {
        c1 c1Var = this.f14341l;
        if (c1Var != null) {
            c1Var.invoke();
        }
        ((H) f6).getClass();
        d dVar = new d(3, this);
        addOnAttachStateChangeListener(dVar);
        C0074p c0074p = new C0074p(18);
        a.g0(this).f10835a.add(c0074p);
        this.f14341l = new c1(this, dVar, c0074p, 8);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        b();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z5) {
        b();
        return super.addViewInLayout(view, i, layoutParams, z5);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i3) {
        b();
        super.addView(view, i, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i, layoutParams);
    }
}
