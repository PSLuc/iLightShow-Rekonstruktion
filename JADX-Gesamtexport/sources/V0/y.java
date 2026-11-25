package V0;

import B.C0003b0;
import B.C0043w;
import N.AbstractC0234q;
import N.C0208d;
import N.C0217h0;
import N.C0230o;
import N.C0235q0;
import N.D;
import N.U;
import S1.h0;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.J;
import com.nanjoran.ilightshow.R;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import p015c2.AbstractC0473d;
import p113v0.InterfaceC1033p;
import p130y0.AbstractC1119a;

/* JADX INFO: loaded from: classes.dex */
public final class y extends AbstractC1119a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public S0.i f5465A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final D f5466B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Rect f5467C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final X.x f5468D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Object f5469E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C0217h0 f5470F;
    public boolean G;
    public final int[] H;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public D4.a f5471p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public B f5472q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f5473r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f5474s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z f5475t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final WindowManager f5476u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final WindowManager.LayoutParams f5477v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public A f5478w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public S0.k f5479x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0217h0 f5480y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0217h0 f5481z;

    public y(D4.a aVar, B b6, String str, View view, S0.b bVar, A a6, UUID uuid) {
        z zVar = new z();
        super(view.getContext());
        this.f5471p = aVar;
        this.f5472q = b6;
        this.f5473r = str;
        this.f5474s = view;
        this.f5475t = zVar;
        Object systemService = view.getContext().getSystemService("window");
        E4.k.d("null cannot be cast to non-null type android.view.WindowManager", systemService);
        this.f5476u = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        B b7 = this.f5472q;
        boolean zB = l.b(view);
        boolean z5 = b7.f5400b;
        int i = b7.f5399a;
        if (z5 && zB) {
            i |= 8192;
        } else if (z5 && !zB) {
            i &= -8193;
        }
        layoutParams.flags = i;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f5477v = layoutParams;
        this.f5478w = a6;
        this.f5479x = S0.k.f4897h;
        U u6 = U.f3673m;
        this.f5480y = C0208d.K(null, u6);
        this.f5481z = C0208d.K(null, u6);
        this.f5466B = C0208d.C(new C0043w(24, this));
        this.f5467C = new Rect();
        this.f5468D = new X.x(new j(this, 2));
        setId(android.R.id.content);
        J.i(this, J.f(view));
        setTag(R.id.view_tree_view_model_store_owner, J.g(view));
        setTag(R.id.view_tree_saved_state_registry_owner, p020d2.n.r(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(bVar.y((float) 8));
        setOutlineProvider(new u(1));
        this.f5470F = C0208d.K(q.f5442a, u6);
        this.H = new int[2];
    }

    private final D4.e getContent() {
        return (D4.e) this.f5470F.getValue();
    }

    private final int getDisplayHeight() {
        return Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC1033p getParentLayoutCoordinates() {
        return (InterfaceC1033p) this.f5481z.getValue();
    }

    private final void setContent(D4.e eVar) {
        this.f5470F.setValue(eVar);
    }

    private final void setParentLayoutCoordinates(InterfaceC1033p interfaceC1033p) {
        this.f5481z.setValue(interfaceC1033p);
    }

    @Override // p130y0.AbstractC1119a
    public final void a(int i, C0230o c0230o) {
        c0230o.X(-857613600);
        if ((((c0230o.h(this) ? 4 : 2) | i) & 3) == 2 && c0230o.B()) {
            c0230o.P();
        } else {
            getContent().d(c0230o, 0);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0003b0(i, 14, this);
        }
    }

    @Override // p130y0.AbstractC1119a
    public final void d(int i, int i3, int i6, int i7, boolean z5) {
        super.d(i, i3, i6, i7, z5);
        this.f5472q.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f5477v;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        this.f5475t.getClass();
        this.f5476u.updateViewLayout(this, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.f5472q.f5401c) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                D4.a aVar = this.f5471p;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p130y0.AbstractC1119a
    public final void e(int i, int i3) {
        this.f5472q.getClass();
        super.e(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f5466B.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f5477v;
    }

    public final S0.k getParentLayoutDirection() {
        return this.f5479x;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final S0.j m0getPopupContentSizebOM6tXw() {
        return (S0.j) this.f5480y.getValue();
    }

    public final A getPositionProvider() {
        return this.f5478w;
    }

    @Override // p130y0.AbstractC1119a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.G;
    }

    public AbstractC1119a getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.f5473r;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void h(AbstractC0234q abstractC0234q, D4.e eVar) {
        setParentCompositionContext(abstractC0234q);
        setContent(eVar);
        this.G = true;
    }

    public final void i(D4.a aVar, B b6, String str, S0.k kVar) {
        int i;
        this.f5471p = aVar;
        this.f5473r = str;
        if (!E4.k.a(this.f5472q, b6)) {
            WindowManager.LayoutParams layoutParams = this.f5477v;
            this.f5472q = b6;
            boolean zB = l.b(this.f5474s);
            boolean z5 = b6.f5400b;
            int i3 = b6.f5399a;
            if (z5 && zB) {
                i3 |= 8192;
            } else if (z5 && !zB) {
                i3 &= -8193;
            }
            layoutParams.flags = i3;
            this.f5475t.getClass();
            this.f5476u.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = kVar.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    public final void j() {
        InterfaceC1033p parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.K()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jP = parentLayoutCoordinates.P();
            long jH = parentLayoutCoordinates.h(0L);
            long jC = h0.c(Math.round(p030f0.c.d(jH)), Math.round(p030f0.c.e(jH)));
            int i = (int) (jC >> 32);
            int i3 = (int) (jC & 4294967295L);
            S0.i iVar = new S0.i(i, i3, ((int) (jP >> 32)) + i, ((int) (jP & 4294967295L)) + i3);
            if (iVar.equals(this.f5465A)) {
                return;
            }
            this.f5465A = iVar;
            l();
        }
    }

    public final void k(InterfaceC1033p interfaceC1033p) {
        setParentLayoutCoordinates(interfaceC1033p);
        j();
    }

    public final void l() {
        S0.j jVarM0getPopupContentSizebOM6tXw;
        S0.i iVar = this.f5465A;
        if (iVar == null || (jVarM0getPopupContentSizebOM6tXw = m0getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        this.f5475t.getClass();
        View view = this.f5474s;
        Rect rect = this.f5467C;
        view.getWindowVisibleDisplayFrame(rect);
        long jB = AbstractC0473d.b(rect.right - rect.left, rect.bottom - rect.top);
        E4.v vVar = new E4.v();
        vVar.f1073h = 0L;
        this.f5468D.c(this, c.f5414n, new x(vVar, this, iVar, jB, jVarM0getPopupContentSizebOM6tXw.f4896a));
        WindowManager.LayoutParams layoutParams = this.f5477v;
        long j4 = vVar.f1073h;
        layoutParams.x = (int) (j4 >> 32);
        layoutParams.y = (int) (j4 & 4294967295L);
        if (this.f5472q.f5403e) {
            setSystemGestureExclusionRects(p089q4.m.N(new Rect(0, 0, (int) (jB >> 32), (int) (jB & 4294967295L))));
        }
        this.f5476u.updateViewLayout(this, layoutParams);
    }

    @Override // p130y0.AbstractC1119a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5468D.d();
        if (!this.f5472q.f5401c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f5469E == null) {
            this.f5469E = n.a(this.f5471p);
        }
        n.b(this, this.f5469E);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        X.x xVar = this.f5468D;
        J2.b bVar = xVar.f5747g;
        if (bVar != null) {
            bVar.c();
        }
        xVar.b();
        if (Build.VERSION.SDK_INT >= 33) {
            n.c(this, this.f5469E);
        }
        this.f5469E = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f5472q.f5402d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            D4.a aVar = this.f5471p;
            if (aVar != null) {
                aVar.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            D4.a aVar2 = this.f5471p;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    public final void setParentLayoutDirection(S0.k kVar) {
        this.f5479x = kVar;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m1setPopupContentSizefhxjrPA(S0.j jVar) {
        this.f5480y.setValue(jVar);
    }

    public final void setPositionProvider(A a6) {
        this.f5478w = a6;
    }

    public final void setTestTag(String str) {
        this.f5473r = str;
    }
}
