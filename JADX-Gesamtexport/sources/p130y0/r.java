package p130y0;

import B.C0024m;
import B.C0025m0;
import B.L0;
import D.C0056f;
import D0.l;
import D4.c;
import E0.m;
import F.L;
import G0.I;
import K.y;
import L2.o;
import M0.x;
import M0.z;
import N.C0208d;
import N.C0217h0;
import N.C0237s;
import N.D;
import N.U;
import P4.AbstractC0336x;
import S0.k;
import S1.V;
import V0.u;
import X.C0386c;
import Z.n;
import Z.q;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.focus.b;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.lifecycle.C0460u;
import androidx.lifecycle.InterfaceC0445e;
import androidx.lifecycle.InterfaceC0458s;
import c5.C0495p;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.internal.http2.Http2;
import p001a0.a;
import p001a0.f;
import p012c.C;
import p024e0.g;
import p035g0.A;
import p035g0.C0701b;
import p035g0.C0715p;
import p035g0.H;
import p035g0.J;
import p035g0.w;
import p045i1.B;
import p090r.v;
import p091r0.e;
import p091r0.h;
import p091r0.s;
import p091r0.t;
import p096s.AbstractC0916i;
import p111u4.i;
import p113v0.M;
import p113v0.Q;
import p118w0.d;
import p124x0.AbstractC1098f;
import p124x0.AbstractC1105m;
import p124x0.C1111t;
import p124x0.E;
import p124x0.F;
import p124x0.O;
import p124x0.P;
import p124x0.Y;
import p124x0.d0;
import p124x0.e0;
import p124x0.f0;
import p124x0.h0;
import p124x0.k0;
import p124x0.l0;
import p124x0.n0;

/* JADX INFO: loaded from: classes.dex */
public final class r extends ViewGroup implements f0, l0, InterfaceC0445e {

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public static Class f14451F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public static Method f14452G0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f14453A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final C1149p f14454A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final e f14455B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final X f14456B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final y f14457C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public boolean f14458C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public c f14459D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final l f14460D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final a f14461E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final C1147o f14462E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f14463F;
    public final C1131g G;
    public final h0 H;
    public boolean I;
    public W J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C1134h0 f14464K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public S0.a f14465L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f14466M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final P f14467N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final U f14468O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public long f14469P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int[] f14470Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final float[] f14471R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final float[] f14472S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final float[] f14473T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public long f14474U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f14475V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public long f14476W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f14477a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final C0217h0 f14478b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final D f14479c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public c f14480d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC1133h f14481e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final ViewTreeObserverOnScrollChangedListenerC1135i f14482f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final ViewTreeObserverOnTouchModeChangeListenerC1137j f14483g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f14484h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final z f14485h0;
    public final boolean i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final x f14486i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final F f14487j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final AtomicReference f14488j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0217h0 f14489k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final C1126d0 f14490k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f14491l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final C1144m0 f14492l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i f14493m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final C0217h0 f14494m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ViewOnDragListenerC1132g0 f14495n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f14496n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final N0 f14497o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final C0217h0 f14498o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0715p f14499p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final p069n0.b f14500p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p124x0.D f14501q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final p075o0.c f14502q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r f14503r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final d f14504r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m f14505s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final O f14506s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final B f14507t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public MotionEvent f14508t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p007b0.c f14509u;
    public long u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C1129f f14510v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final d0 f14511v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0495p f14512w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final P.d f14513w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f f14514x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final o f14515x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f14516y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final I3.a f14517y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ArrayList f14518z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f14519z0;

    /* JADX WARN: Type inference failed for: r4v11, types: [y0.h] */
    /* JADX WARN: Type inference failed for: r4v12, types: [y0.i] */
    /* JADX WARN: Type inference failed for: r4v13, types: [y0.j] */
    public r(Context context, i iVar) {
        k kVar;
        super(context);
        this.f14484h = 9205357640488583168L;
        this.i = true;
        this.f14487j = new F();
        S0.d dVarF = p027e3.a.F(context);
        U u6 = U.f3671k;
        this.f14489k = C0208d.K(dVarF, u6);
        E0.c cVar = new E0.c();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(cVar);
        this.f14491l = new b(new L0(1, this, r.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0, 1), new e5.f(2, this, r.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0, 1), new L0(1, this, r.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0, 2), new C(0, this, r.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0, 5), new C(0, this, r.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0, 6), new C1143m(this, r.class, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;", 0));
        ViewOnDragListenerC1132g0 viewOnDragListenerC1132g0 = new ViewOnDragListenerC1132g0();
        this.f14493m = iVar;
        this.f14495n = viewOnDragListenerC1132g0;
        this.f14497o = new N0();
        Z.o oVarA = androidx.compose.ui.input.key.a.a(new C1145n(this, 0));
        Z.o oVarA2 = androidx.compose.ui.input.rotary.a.a();
        this.f14499p = new C0715p(0);
        p124x0.D d6 = new p124x0.D(3);
        d6.V(Q.f13145b);
        d6.T(getDensity());
        d6.W(emptySemanticsElement.k(oVarA2).k(oVarA).k(((b) getFocusOwner()).i).k(viewOnDragListenerC1132g0.f14392c));
        this.f14501q = d6;
        this.f14503r = this;
        this.f14505s = new m(getRoot(), cVar);
        B b6 = new B(this);
        this.f14507t = b6;
        this.f14509u = new p007b0.c(this, new C(0, this, H.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 4));
        C1129f c1129f = new C1129f();
        Object systemService = context.getSystemService("accessibility");
        E4.k.d("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager", systemService);
        this.f14510v = c1129f;
        this.f14512w = new C0495p(this);
        this.f14514x = new f();
        this.f14516y = new ArrayList();
        this.f14455B = new e();
        p124x0.D root = getRoot();
        y yVar = new y();
        yVar.f2032c = root;
        yVar.f2033d = new p091r0.d((C1111t) root.f13828C.f3793c);
        yVar.f2030a = new C0715p(18);
        yVar.f2034e = new p124x0.r();
        this.f14457C = yVar;
        this.f14459D = C1141l.i;
        this.f14461E = new a(this, getAutofillTree());
        this.G = new C1131g(context);
        this.H = new h0(new C1145n(this, 1));
        this.f14467N = new P(getRoot());
        this.f14468O = new U(ViewConfiguration.get(context));
        this.f14469P = S1.h0.c(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f14470Q = new int[]{0, 0};
        this.f14471R = A.a();
        this.f14472S = A.a();
        this.f14473T = A.a();
        this.f14474U = -1L;
        this.f14476W = 9187343241974906880L;
        this.f14477a0 = true;
        U u7 = U.f3673m;
        this.f14478b0 = C0208d.K(null, u7);
        this.f14479c0 = C0208d.C(new C1149p(this, 1));
        this.f14481e0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: y0.h
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f14393h.F();
            }
        };
        this.f14482f0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: y0.i
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f14395a.F();
            }
        };
        this.f14483g0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: y0.j
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z5) {
                p075o0.c cVar2 = this.f14397h.f14502q0;
                int i = z5 ? 1 : 2;
                cVar2.getClass();
                cVar2.f10616a.setValue(new p075o0.a(i));
            }
        };
        z zVar = new z(getView(), this);
        this.f14485h0 = zVar;
        this.f14486i0 = new x(zVar);
        this.f14488j0 = new AtomicReference(null);
        this.f14490k0 = new C1126d0(getTextInputService());
        this.f14492l0 = new C1144m0();
        this.f14494m0 = C0208d.K(G4.a.p(context), u6);
        Configuration configuration = context.getResources().getConfiguration();
        int i = Build.VERSION.SDK_INT;
        this.f14496n0 = i >= 31 ? configuration.fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        k kVar2 = k.f4897h;
        if (layoutDirection != 0) {
            kVar = layoutDirection != 1 ? null : k.i;
        } else {
            kVar = kVar2;
        }
        this.f14498o0 = C0208d.K(kVar != null ? kVar : kVar2, u7);
        this.f14500p0 = new p069n0.b(this);
        this.f14502q0 = new p075o0.c(isInTouchMode() ? 1 : 2);
        this.f14504r0 = new d(this);
        this.f14506s0 = new O(this);
        this.f14511v0 = new d0(1);
        this.f14513w0 = new P.d(new D4.a[16]);
        this.f14515x0 = new o(11, this);
        this.f14517y0 = new I3.a(14, this);
        this.f14454A0 = new C1149p(this, 0);
        this.f14456B0 = new X();
        addOnAttachStateChangeListener(this.f14509u);
        setWillNotDraw(false);
        setFocusable(true);
        G.f14217a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        p045i1.A.a(this, b6);
        setOnDragListener(viewOnDragListenerC1132g0);
        getRoot().e(this);
        C.f14212a.a(this);
        this.f14460D0 = i >= 31 ? new l() : null;
        this.f14462E0 = new C1147o(this);
    }

    public static final boolean e(r rVar, p024e0.b bVar, p030f0.d dVar) {
        Integer numH;
        if (rVar.isFocused() || rVar.hasFocus()) {
            return true;
        }
        return super.requestFocus((bVar == null || (numH = p024e0.d.H(bVar.f8640a)) == null) ? 130 : numH.intValue(), dVar != null ? H.t(dVar) : null);
    }

    public static void f(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof r) {
                ((r) childAt).s();
            } else if (childAt instanceof ViewGroup) {
                f((ViewGroup) childAt);
            }
        }
    }

    public static long g(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return (((long) 0) << 32) | ((long) size);
        }
        if (mode == 0) {
            return (((long) 0) << 32) | ((long) Integer.MAX_VALUE);
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j4 = size;
        return (j4 << 32) | j4;
    }

    @p084p4.c
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1139k get_viewTreeOwners() {
        return (C1139k) this.f14478b0.getValue();
    }

    public static void i(p124x0.D d6) {
        d6.y();
        P.d dVarU = d6.u();
        int i = dVarU.f4583j;
        if (i > 0) {
            Object[] objArr = dVarU.f4582h;
            int i3 = 0;
            do {
                i((p124x0.D) objArr[i3]);
                i3++;
            } while (i3 < i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    public static boolean l(MotionEvent motionEvent) {
        boolean z5;
        float x6 = motionEvent.getX();
        if (Float.isInfinite(x6) || Float.isNaN(x6)) {
            z5 = true;
        } else {
            float y2 = motionEvent.getY();
            if (Float.isInfinite(y2) || Float.isNaN(y2)) {
                z5 = true;
            } else {
                float rawX = motionEvent.getRawX();
                if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
                    z5 = true;
                } else {
                    float rawY = motionEvent.getRawY();
                    if (Float.isInfinite(rawY) || Float.isNaN(rawY)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                }
            }
        }
        if (!z5) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                float x7 = motionEvent.getX(i);
                if (Float.isInfinite(x7) || Float.isNaN(x7)) {
                    z5 = true;
                } else {
                    float y6 = motionEvent.getY(i);
                    if (Float.isInfinite(y6) || Float.isNaN(y6) || !C1153r0.f14520a.a(motionEvent, i)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                }
                if (z5) {
                    break;
                }
            }
        }
        return z5;
    }

    private void setDensity(S0.b bVar) {
        this.f14489k.setValue(bVar);
    }

    private void setFontFamilyResolver(L0.d dVar) {
        this.f14494m0.setValue(dVar);
    }

    private void setLayoutDirection(k kVar) {
        this.f14498o0.setValue(kVar);
    }

    private final void set_viewTreeOwners(C1139k c1139k) {
        this.f14478b0.setValue(c1139k);
    }

    public final void A(p124x0.D d6) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (d6 != null) {
            while (d6 != null && d6.f13829D.f13923r.f13898r == 1) {
                if (!this.f14466M) {
                    p124x0.D dR = d6.r();
                    if (dR == null) {
                        break;
                    }
                    long j4 = ((C1111t) dR.f13828C.f3793c).f13139k;
                    if (S0.a.f(j4) && S0.a.e(j4)) {
                        break;
                    }
                }
                d6 = d6.r();
            }
            if (d6 == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long B(long j4) {
        y();
        float fD = p030f0.c.d(j4) - p030f0.c.d(this.f14476W);
        float fE = p030f0.c.e(j4) - p030f0.c.e(this.f14476W);
        return A.b(p081p0.c.y(fD, fE), this.f14473T);
    }

    public final int C(MotionEvent motionEvent) {
        Object obj;
        if (this.f14458C0) {
            this.f14458C0 = false;
            int metaState = motionEvent.getMetaState();
            this.f14497o.getClass();
            N0.f14277b.setValue(new t(metaState));
        }
        e eVar = this.f14455B;
        C0495p c0495pA = eVar.a(motionEvent, this);
        y yVar = this.f14457C;
        if (c0495pA == null) {
            yVar.i();
            return 0;
        }
        ArrayList arrayList = (ArrayList) c0495pA.i;
        int size = arrayList.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i = size - 1;
            obj = arrayList.get(size);
            if (((s) obj).f11527e) {
                break;
            }
            if (i < 0) {
                obj = null;
                break;
            }
            size = i;
        }
        s sVar = (s) obj;
        if (sVar != null) {
            this.f14484h = sVar.f11526d;
        }
        int iH = yVar.h(c0495pA, this, m(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (iH & 1) != 0) {
            return iH;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        eVar.f11481c.delete(pointerId);
        eVar.f11480b.delete(pointerId);
        return iH;
    }

    public final void D(MotionEvent motionEvent, int i, long j4, boolean z5) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i6 = 0; i6 < pointerCount; i6++) {
            pointerCoordsArr[i6] = new MotionEvent.PointerCoords();
        }
        int i7 = 0;
        while (i7 < pointerCount) {
            int i8 = ((actionIndex < 0 || i7 < actionIndex) ? 0 : 1) + i7;
            motionEvent.getPointerProperties(i8, pointerPropertiesArr[i7]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i7];
            motionEvent.getPointerCoords(i8, pointerCoords);
            long jP = p(p081p0.c.y(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = p030f0.c.d(jP);
            pointerCoords.y = p030f0.c.e(jP);
            i7++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j4 : motionEvent.getDownTime(), j4, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z5 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        C0495p c0495pA = this.f14455B.a(motionEventObtain, this);
        E4.k.c(c0495pA);
        this.f14457C.h(c0495pA, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void E(C0056f c0056f, p122w4.c cVar) {
        C1151q c1151q;
        if (cVar instanceof C1151q) {
            c1151q = (C1151q) cVar;
            int i = c1151q.f14449m;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1151q.f14449m = i - Integer.MIN_VALUE;
            } else {
                c1151q = new C1151q(this, cVar);
            }
        } else {
            c1151q = new C1151q(this, cVar);
        }
        Object obj = c1151q.f14447k;
        v4.a aVar = v4.a.f13292h;
        int i3 = c1151q.f14449m;
        if (i3 == 0) {
            V.O(obj);
            AtomicReference atomicReference = this.f14488j0;
            C1145n c1145n = new C1145n(this, 2);
            c1151q.f14449m = 1;
            if (AbstractC0336x.d(new Z.r(c1145n, atomicReference, c0056f, null), c1151q) == aVar) {
                return;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
        }
        throw new KotlinNothingValueException();
    }

    public final void F() {
        int[] iArr = this.f14470Q;
        getLocationOnScreen(iArr);
        long j4 = this.f14469P;
        int i = (int) (j4 >> 32);
        int i3 = (int) (j4 & 4294967295L);
        boolean z5 = false;
        int i6 = iArr[0];
        if (i != i6 || i3 != iArr[1]) {
            this.f14469P = S1.h0.c(i6, iArr[1]);
            if (i != Integer.MAX_VALUE && i3 != Integer.MAX_VALUE) {
                getRoot().f13829D.f13923r.s0();
                z5 = true;
            }
        }
        this.f14467N.a(z5);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        a aVar = this.f14461E;
        if (aVar != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                p001a0.d dVar = p001a0.d.f6115a;
                if (dVar.d(autofillValue)) {
                    dVar.i(autofillValue).toString();
                    if (aVar.f6112b.f6117a.get(Integer.valueOf(iKeyAt)) != null) {
                        throw new ClassCastException();
                    }
                } else {
                    if (dVar.b(autofillValue)) {
                        throw new C4.a("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (dVar.c(autofillValue)) {
                        throw new C4.a("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (dVar.e(autofillValue)) {
                        throw new C4.a("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0445e
    public final void b(InterfaceC0458s interfaceC0458s) {
        setShowLayoutBounds(C1144m0.a());
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f14507t.h(i, this.f14484h, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f14507t.h(i, this.f14484h, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z5;
        if (!isAttachedToWindow()) {
            i(getRoot());
        }
        q(true);
        synchronized (X.o.f5709b) {
            p080p.A a6 = ((C0386c) X.o.i.get()).f5674h;
            z5 = a6 != null && a6.h();
        }
        if (z5) {
            X.o.a();
        }
        this.f14453A = true;
        C0715p c0715p = this.f14499p;
        C0701b c0701b = (C0701b) c0715p.i;
        Canvas canvas2 = c0701b.f9056a;
        c0701b.f9056a = canvas;
        getRoot().j(c0701b, null);
        ((C0701b) c0715p.i).f9056a = canvas2;
        if (!this.f14516y.isEmpty()) {
            int size = this.f14516y.size();
            for (int i = 0; i < size; i++) {
                ((e0) this.f14516y.get(i)).i();
            }
        }
        if (I0.f14245A) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        this.f14516y.clear();
        this.f14453A = false;
        ArrayList arrayList = this.f14518z;
        if (arrayList != null) {
            this.f14516y.addAll(arrayList);
            arrayList.clear();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        p102t0.a aVar;
        int size;
        C0237s c0237s;
        n nVarE;
        C0237s c0237s2;
        if (this.f14519z0) {
            I3.a aVar2 = this.f14517y0;
            removeCallbacks(aVar2);
            if (motionEvent.getActionMasked() == 8) {
                this.f14519z0 = false;
            } else {
                aVar2.run();
            }
        }
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (l(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (h(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        getContext();
        B.b(viewConfiguration);
        getContext();
        B.a(viewConfiguration);
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        b bVar = (b) getFocusOwner();
        if (bVar.f6704g.a()) {
            throw new IllegalStateException("Dispatching rotary event while focus system is invalidated.");
        }
        p024e0.r rVarG = p024e0.d.g(bVar.f6703f);
        if (rVarG != null) {
            n nVar = rVarG.f5958h;
            if (!nVar.f5969t) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            p124x0.D dS = AbstractC1098f.s(rVarG);
            loop0: while (true) {
                if (dS == null) {
                    nVarE = null;
                    break;
                }
                if ((((n) dS.f13828C.f3796f).f5960k & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                    while (nVar != null) {
                        if ((nVar.f5959j & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            P.d dVar = null;
                            nVarE = nVar;
                            while (nVarE != null) {
                                if (nVarE instanceof p102t0.a) {
                                    break loop0;
                                }
                                if ((nVarE.f5959j & Http2.INITIAL_MAX_FRAME_SIZE) != 0 && (nVarE instanceof AbstractC1105m)) {
                                    int i = 0;
                                    for (n nVar2 = ((AbstractC1105m) nVarE).f14046v; nVar2 != null; nVar2 = nVar2.f5962m) {
                                        if ((nVar2.f5959j & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                            i++;
                                            if (i == 1) {
                                                nVarE = nVar2;
                                            } else {
                                                if (dVar == null) {
                                                    dVar = new P.d(new n[16]);
                                                }
                                                if (nVarE != null) {
                                                    dVar.c(nVarE);
                                                    nVarE = null;
                                                }
                                                dVar.c(nVar2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                nVarE = AbstractC1098f.e(dVar);
                            }
                        }
                        nVar = nVar.f5961l;
                    }
                }
                dS = dS.r();
                nVar = (dS == null || (c0237s2 = dS.f13828C) == null) ? null : (n0) c0237s2.f3795e;
            }
            aVar = (p102t0.a) nVarE;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            p102t0.a aVar3 = aVar;
            n nVar3 = aVar3.f5958h;
            if (!nVar3.f5969t) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            n nVar4 = nVar3.f5961l;
            p124x0.D dS2 = AbstractC1098f.s(aVar);
            ArrayList arrayList = null;
            while (dS2 != null) {
                if ((((n) dS2.f13828C.f3796f).f5960k & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                    while (nVar4 != null) {
                        if ((nVar4.f5959j & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            n nVarE2 = nVar4;
                            P.d dVar2 = null;
                            while (nVarE2 != null) {
                                if (nVarE2 instanceof p102t0.a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nVarE2);
                                } else if ((nVarE2.f5959j & Http2.INITIAL_MAX_FRAME_SIZE) != 0 && (nVarE2 instanceof AbstractC1105m)) {
                                    int i3 = 0;
                                    for (n nVar5 = ((AbstractC1105m) nVarE2).f14046v; nVar5 != null; nVar5 = nVar5.f5962m) {
                                        if ((nVar5.f5959j & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                nVarE2 = nVar5;
                                            } else {
                                                if (dVar2 == null) {
                                                    dVar2 = new P.d(new n[16]);
                                                }
                                                if (nVarE2 != null) {
                                                    dVar2.c(nVarE2);
                                                    nVarE2 = null;
                                                }
                                                dVar2.c(nVar5);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                nVarE2 = AbstractC1098f.e(dVar2);
                            }
                        }
                        nVar4 = nVar4.f5961l;
                    }
                }
                dS2 = dS2.r();
                nVar4 = (dS2 == null || (c0237s = dS2.f13828C) == null) ? null : (n0) c0237s.f3795e;
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i6 = size - 1;
                    ((p102t0.a) arrayList.get(size)).getClass();
                    if (i6 < 0) {
                        break;
                    }
                    size = i6;
                }
            }
            n nVarE3 = aVar3.f5958h;
            P.d dVar3 = null;
            while (nVarE3 != null) {
                if (nVarE3 instanceof p102t0.a) {
                } else if ((nVarE3.f5959j & Http2.INITIAL_MAX_FRAME_SIZE) != 0 && (nVarE3 instanceof AbstractC1105m)) {
                    int i7 = 0;
                    for (n nVar6 = ((AbstractC1105m) nVarE3).f14046v; nVar6 != null; nVar6 = nVar6.f5962m) {
                        if ((nVar6.f5959j & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            i7++;
                            if (i7 == 1) {
                                nVarE3 = nVar6;
                            } else {
                                if (dVar3 == null) {
                                    dVar3 = new P.d(new n[16]);
                                }
                                if (nVarE3 != null) {
                                    dVar3.c(nVarE3);
                                    nVarE3 = null;
                                }
                                dVar3.c(nVar6);
                            }
                        }
                    }
                    if (i7 == 1) {
                    }
                }
                nVarE3 = AbstractC1098f.e(dVar3);
            }
            n nVarE4 = aVar3.f5958h;
            P.d dVar4 = null;
            while (nVarE4 != null) {
                if (nVarE4 instanceof p102t0.a) {
                } else if ((nVarE4.f5959j & Http2.INITIAL_MAX_FRAME_SIZE) != 0 && (nVarE4 instanceof AbstractC1105m)) {
                    int i8 = 0;
                    for (n nVar7 = ((AbstractC1105m) nVarE4).f14046v; nVar7 != null; nVar7 = nVar7.f5962m) {
                        if ((nVar7.f5959j & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            i8++;
                            if (i8 == 1) {
                                nVarE4 = nVar7;
                            } else {
                                if (dVar4 == null) {
                                    dVar4 = new P.d(new n[16]);
                                }
                                if (nVarE4 != null) {
                                    dVar4.c(nVarE4);
                                    nVarE4 = null;
                                }
                                dVar4.c(nVar7);
                            }
                        }
                    }
                    if (i8 == 1) {
                    }
                }
                nVarE4 = AbstractC1098f.e(dVar4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    C1141l c1141l = ((p102t0.a) arrayList.get(i9)).f12443u;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:79:0x014d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0154 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int iY;
        C0237s c0237s;
        boolean z5;
        boolean z6 = this.f14519z0;
        I3.a aVar = this.f14517y0;
        if (z6) {
            removeCallbacks(aVar);
            aVar.run();
        }
        if (!l(motionEvent) && isAttachedToWindow()) {
            B b6 = this.f14507t;
            AccessibilityManager accessibilityManager = b6.f14191g;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                r rVar = b6.f14188d;
                if (action == 7 || action == 9) {
                    float x6 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    rVar.q(true);
                    p124x0.r rVar2 = new p124x0.r();
                    p124x0.D root = rVar.getRoot();
                    long jY = p081p0.c.y(x6, y2);
                    C0237s c0237s2 = root.f13828C;
                    Y y6 = (Y) c0237s2.f3794d;
                    J j4 = Y.f13977L;
                    ((Y) c0237s2.f3794d).Q0(Y.f13981P, y6.J0(jY), rVar2, true, true);
                    n nVar = (n) p089q4.l.h0(rVar2);
                    p124x0.D dS = nVar != null ? AbstractC1098f.s(nVar) : null;
                    if (dS == null || (c0237s = dS.f13828C) == null || !c0237s.f(8)) {
                        iY = Integer.MIN_VALUE;
                    } else {
                        E0.l lVarG = p020d2.n.g(dS, false);
                        Y yC = lVarG.c();
                        if (yC != null ? yC.T0() : false) {
                            z5 = false;
                        } else if (lVarG.f947d.f939h.containsKey(E0.o.f982m)) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (!z5) {
                            iY = Integer.MIN_VALUE;
                        } else {
                            if (rVar.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(dS) != null) {
                                throw new ClassCastException();
                            }
                            iY = b6.y(dS.i);
                        }
                    }
                    rVar.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    int i = b6.f14189e;
                    if (i != iY) {
                        b6.f14189e = iY;
                        B.C(b6, iY, 128, null, 12);
                        B.C(b6, i, HueLog.LogComponent.STREAMDTLS, null, 12);
                    }
                } else if (action == 10) {
                    int i3 = b6.f14189e;
                    if (i3 == Integer.MIN_VALUE) {
                        rVar.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    } else if (i3 != Integer.MIN_VALUE) {
                        b6.f14189e = Integer.MIN_VALUE;
                        B.C(b6, Integer.MIN_VALUE, 128, null, 12);
                        B.C(b6, i3, HueLog.LogComponent.STREAMDTLS, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && m(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.f14508t0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.f14508t0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.f14519z0 = true;
                        postDelayed(aVar, 8L);
                        return false;
                    }
                } else if ((h(motionEvent) & 1) != 0) {
                    return true;
                }
            } else if (n(motionEvent)) {
                if ((h(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((b) getFocusOwner()).b(keyEvent, new C0024m(this, 18, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f14497o.getClass();
        N0.f14277b.setValue(new t(metaState));
        return ((b) getFocusOwner()).b(keyEvent, p024e0.f.i) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C0237s c0237s;
        if (isFocused()) {
            b bVar = (b) getFocusOwner();
            if (bVar.f6704g.a()) {
                throw new IllegalStateException("Dispatching intercepted soft keyboard event while focus system is invalidated.");
            }
            p024e0.r rVarG = p024e0.d.g(bVar.f6703f);
            if (rVarG != null) {
                n nVar = rVarG.f5958h;
                if (!nVar.f5969t) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                p124x0.D dS = AbstractC1098f.s(rVarG);
                while (dS != null) {
                    if ((((n) dS.f13828C.f3796f).f5960k & 131072) != 0) {
                        while (nVar != null) {
                            if ((nVar.f5959j & 131072) != 0) {
                                n nVarE = nVar;
                                P.d dVar = null;
                                while (nVarE != null) {
                                    if ((nVarE.f5959j & 131072) != 0 && (nVarE instanceof AbstractC1105m)) {
                                        int i = 0;
                                        for (n nVar2 = ((AbstractC1105m) nVarE).f14046v; nVar2 != null; nVar2 = nVar2.f5962m) {
                                            if ((nVar2.f5959j & 131072) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    nVarE = nVar2;
                                                } else {
                                                    if (dVar == null) {
                                                        dVar = new P.d(new n[16]);
                                                    }
                                                    if (nVarE != null) {
                                                        dVar.c(nVarE);
                                                        nVarE = null;
                                                    }
                                                    dVar.c(nVar2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    nVarE = AbstractC1098f.e(dVar);
                                }
                            }
                            nVar = nVar.f5961l;
                        }
                    }
                    dS = dS.r();
                    nVar = (dS == null || (c0237s = dS.f13828C) == null) ? null : (n0) c0237s.f3795e;
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f14519z0) {
            I3.a aVar = this.f14517y0;
            removeCallbacks(aVar);
            MotionEvent motionEvent2 = this.f14508t0;
            E4.k.c(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f14519z0 = false;
            } else {
                aVar.run();
            }
        }
        if (!l(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || n(motionEvent))) {
            int iH = h(motionEvent);
            if ((iH & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((iH & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, InvocationTargetException {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        if (view != null) {
            p030f0.d dVarD = p024e0.d.d(view);
            p024e0.b bVarI = p024e0.d.I(i);
            if (E4.k.a(((b) getFocusOwner()).c(bVarI != null ? bVarI.f8640a : 6, dVarD, C1141l.f14406j), Boolean.TRUE)) {
                return this;
            }
        }
        return super.focusSearch(view, i);
    }

    public final W getAndroidViewsHandler$ui_release() {
        if (this.J == null) {
            W w6 = new W(getContext());
            this.J = w6;
            addView(w6, -1);
            requestLayout();
        }
        W w7 = this.J;
        E4.k.c(w7);
        return w7;
    }

    public p001a0.b getAutofill() {
        return this.f14461E;
    }

    public f getAutofillTree() {
        return this.f14514x;
    }

    public final c getConfigurationChangeObserver() {
        return this.f14459D;
    }

    public final p007b0.c getContentCaptureManager$ui_release() {
        return this.f14509u;
    }

    public i getCoroutineContext() {
        return this.f14493m;
    }

    public S0.b getDensity() {
        return (S0.b) this.f14489k.getValue();
    }

    public p013c0.a getDragAndDropManager() {
        return this.f14495n;
    }

    public g getFocusOwner() {
        return this.f14491l;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        p084p4.x xVar;
        p030f0.d dVarT = t();
        if (dVarT != null) {
            rect.left = Math.round(dVarT.f8839a);
            rect.top = Math.round(dVarT.f8840b);
            rect.right = Math.round(dVarT.f8841c);
            rect.bottom = Math.round(dVarT.f8842d);
            xVar = p084p4.x.f10867a;
        } else {
            xVar = null;
        }
        if (xVar == null) {
            super.getFocusedRect(rect);
        }
    }

    public L0.d getFontFamilyResolver() {
        return (L0.d) this.f14494m0.getValue();
    }

    public L0.c getFontLoader() {
        return this.f14492l0;
    }

    public w getGraphicsContext() {
        return this.f14512w;
    }

    public p069n0.a getHapticFeedBack() {
        return this.f14500p0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f14467N.f13949b.t();
    }

    public p075o0.b getInputModeManager() {
        return this.f14502q0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f14474U;
    }

    @Override // android.view.View, android.view.ViewParent
    public k getLayoutDirection() {
        return (k) this.f14498o0.getValue();
    }

    public long getMeasureIteration() {
        P p6 = this.f14467N;
        if (p6.f13950c) {
            return p6.f13954g;
        }
        p027e3.a.x0("measureIteration should be only used during the measure/layout pass");
        throw null;
    }

    public d getModifierLocalManager() {
        return this.f14504r0;
    }

    public M getPlacementScope() {
        int i = p113v0.P.f13144b;
        return new p113v0.C(1, this);
    }

    public p091r0.n getPointerIconService() {
        return this.f14462E0;
    }

    public p124x0.D getRoot() {
        return this.f14501q;
    }

    public l0 getRootForTest() {
        return this.f14503r;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        l lVar;
        if (Build.VERSION.SDK_INT < 31 || (lVar = this.f14460D0) == null) {
            return false;
        }
        return ((Boolean) lVar.f751a.getValue()).booleanValue();
    }

    public m getSemanticsOwner() {
        return this.f14505s;
    }

    public F getSharedDrawScope() {
        return this.f14487j;
    }

    public boolean getShowLayoutBounds() {
        return this.I;
    }

    public h0 getSnapshotObserver() {
        return this.H;
    }

    public C0 getSoftwareKeyboardController() {
        return this.f14490k0;
    }

    public x getTextInputService() {
        return this.f14486i0;
    }

    public D0 getTextToolbar() {
        return this.f14506s0;
    }

    public View getView() {
        return this;
    }

    public G0 getViewConfiguration() {
        return this.f14468O;
    }

    public final C1139k getViewTreeOwners() {
        return (C1139k) this.f14479c0.getValue();
    }

    public M0 getWindowInfo() {
        return this.f14497o;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    public final int h(MotionEvent motionEvent) {
        int actionMasked;
        r rVar;
        float[] fArr = this.f14472S;
        removeCallbacks(this.f14515x0);
        try {
            this.f14474U = AnimationUtils.currentAnimationTimeMillis();
            this.f14456B0.a(this, fArr);
            H.s(fArr, this.f14473T);
            long jB = A.b(p081p0.c.y(motionEvent.getX(), motionEvent.getY()), fArr);
            this.f14476W = p081p0.c.y(motionEvent.getRawX() - p030f0.c.d(jB), motionEvent.getRawY() - p030f0.c.e(jB));
            boolean z5 = true;
            this.f14475V = true;
            q(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.f14508t0;
                boolean z6 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                y yVar = this.f14457C;
                if (motionEvent2 != null) {
                    try {
                        if ((motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true) {
                            if (motionEvent2.getButtonState() != 0 || (actionMasked = motionEvent2.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                                yVar.i();
                            } else if (motionEvent2.getActionMasked() != 10 && z6) {
                                D(motionEvent2, 10, motionEvent2.getEventTime(), true);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                }
                boolean z7 = motionEvent.getToolType(0) == 3;
                if (z6 || !z7 || actionMasked2 == 3 || actionMasked2 == 9 || !m(motionEvent)) {
                    rVar = this;
                } else {
                    rVar = this;
                    rVar.D(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != 0) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent3 = rVar.f14508t0;
                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                    MotionEvent motionEvent4 = rVar.f14508t0;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    e eVar = rVar.f14455B;
                    if (action == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            eVar.f11481c.delete(pointerId);
                            eVar.f11480b.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = rVar.f14508t0;
                        float x6 = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        MotionEvent motionEvent6 = rVar.f14508t0;
                        boolean z8 = (x6 == motionEvent.getX() && (motionEvent6 != null ? motionEvent6.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent7 = rVar.f14508t0;
                        if ((motionEvent7 != null ? motionEvent7.getEventTime() : -1L) == motionEvent.getEventTime()) {
                            z5 = false;
                        }
                        if (z8 || z5) {
                            if (pointerId >= 0) {
                                eVar.f11481c.delete(pointerId);
                                eVar.f11480b.delete(pointerId);
                            }
                            ((h) ((p091r0.d) yVar.f2033d).f11477c).f11493a.i();
                        }
                    }
                }
                rVar.f14508t0 = MotionEvent.obtainNoHistory(motionEvent);
                int iC = C(motionEvent);
                Trace.endSection();
                rVar.f14475V = false;
                return iC;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.f14475V = false;
            throw th3;
        }
    }

    public final void j(p124x0.D d6) {
        int i = 0;
        this.f14467N.l(d6, false);
        P.d dVarU = d6.u();
        int i3 = dVarU.f4583j;
        if (i3 > 0) {
            Object[] objArr = dVarU.f4582h;
            do {
                j((p124x0.D) objArr[i]);
                i++;
            } while (i < i3);
        }
    }

    public final boolean m(MotionEvent motionEvent) {
        float x6 = motionEvent.getX();
        float y2 = motionEvent.getY();
        return 0.0f <= x6 && x6 <= ((float) getWidth()) && 0.0f <= y2 && y2 <= ((float) getHeight());
    }

    public final boolean n(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f14508t0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C0460u c0460uF;
        InterfaceC0458s interfaceC0458s;
        super.onAttachedToWindow();
        this.f14497o.f14278a.setValue(Boolean.valueOf(hasWindowFocus()));
        j(getRoot());
        i(getRoot());
        getSnapshotObserver().f14029a.d();
        a aVar = this.f14461E;
        if (aVar != null) {
            p001a0.e.f6116a.a(aVar);
        }
        InterfaceC0458s interfaceC0458sF = androidx.lifecycle.J.f(this);
        J1.f fVarR = p020d2.n.r(this);
        C1139k viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (interfaceC0458sF != null && fVarR != null && (interfaceC0458sF != (interfaceC0458s = viewTreeOwners.f14402a) || fVarR != interfaceC0458s))) {
            if (interfaceC0458sF == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (fVarR == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (c0460uF = viewTreeOwners.f14402a.f()) != null) {
                c0460uF.f(this);
            }
            interfaceC0458sF.f().a(this);
            C1139k c1139k = new C1139k(interfaceC0458sF, fVarR);
            set_viewTreeOwners(c1139k);
            c cVar = this.f14480d0;
            if (cVar != null) {
                cVar.invoke(c1139k);
            }
            this.f14480d0 = null;
        }
        int i = isInTouchMode() ? 1 : 2;
        p075o0.c cVar2 = this.f14502q0;
        cVar2.getClass();
        cVar2.f10616a.setValue(new p075o0.a(i));
        C1139k viewTreeOwners2 = getViewTreeOwners();
        C0460u c0460uF2 = viewTreeOwners2 != null ? viewTreeOwners2.f14402a.f() : null;
        if (c0460uF2 == null) {
            p027e3.a.z0("No lifecycle owner exists");
            throw null;
        }
        c0460uF2.a(this);
        c0460uF2.a(this.f14509u);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f14481e0);
        getViewTreeObserver().addOnScrollChangedListener(this.f14482f0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f14483g0);
        if (Build.VERSION.SDK_INT >= 31) {
            E.f14214a.b(this);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        q qVar = (q) this.f14488j0.get();
        N n6 = (N) (qVar != null ? qVar.f5971b : null);
        if (n6 == null) {
            return this.f14485h0.f3465d;
        }
        q qVar2 = (q) n6.f14276k.get();
        C1146n0 c1146n0 = (C1146n0) (qVar2 != null ? qVar2.f5971b : null);
        return c1146n0 != null && (c1146n0.f14435e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(p027e3.a.F(getContext()));
        int i = Build.VERSION.SDK_INT;
        if ((i >= 31 ? configuration.fontWeightAdjustment : 0) != this.f14496n0) {
            this.f14496n0 = i >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(G4.a.p(getContext()));
        }
        this.f14459D.invoke(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        int i3 = 18;
        int i6 = 7;
        q qVar = (q) this.f14488j0.get();
        N n6 = (N) (qVar != null ? qVar.f5971b : null);
        if (n6 == null) {
            z zVar = this.f14485h0;
            if (zVar.f3465d) {
                M0.m mVar = zVar.f3469h;
                M0.w wVar = zVar.f3468g;
                int i7 = mVar.f3434d;
                if (i7 == 1) {
                    i = 0;
                } else if (i7 == 0) {
                    i = 1;
                } else if (i7 == 2) {
                    i = 2;
                } else if (i7 == 6) {
                    i = 5;
                } else if (i7 == 5) {
                    i = 7;
                } else if (i7 == 3) {
                    i = 3;
                } else if (i7 == 4) {
                    i = 4;
                } else {
                    if (i7 != 7) {
                        throw new IllegalStateException("invalid ImeAction");
                    }
                    i = 6;
                }
                editorInfo.imeOptions = i;
                int i8 = mVar.f3433c;
                if (i8 == 1) {
                    editorInfo.inputType = 1;
                } else if (i8 == 2) {
                    editorInfo.inputType = 1;
                    editorInfo.imeOptions = Integer.MIN_VALUE | i;
                } else if (i8 == 3) {
                    editorInfo.inputType = 2;
                } else if (i8 == 4) {
                    editorInfo.inputType = 3;
                } else if (i8 == 5) {
                    editorInfo.inputType = 17;
                } else if (i8 == 6) {
                    editorInfo.inputType = 33;
                } else if (i8 == 7) {
                    editorInfo.inputType = 129;
                } else if (i8 == 8) {
                    editorInfo.inputType = 18;
                } else {
                    if (i8 != 9) {
                        throw new IllegalStateException("Invalid Keyboard Type");
                    }
                    editorInfo.inputType = 8194;
                }
                int i9 = editorInfo.inputType;
                if ((i9 & 1) == 1) {
                    editorInfo.inputType = i9 | 131072;
                    if (i7 == 1) {
                        editorInfo.imeOptions |= 1073741824;
                    }
                }
                int i10 = editorInfo.inputType;
                if ((i10 & 1) == 1) {
                    int i11 = mVar.f3431a;
                    if (i11 == 1) {
                        editorInfo.inputType = i10 | 4096;
                    } else if (i11 == 2) {
                        editorInfo.inputType = i10 | 8192;
                    } else if (i11 == 3) {
                        editorInfo.inputType = i10 | Http2.INITIAL_MAX_FRAME_SIZE;
                    }
                    if (mVar.f3432b) {
                        editorInfo.inputType |= 32768;
                    }
                }
                long j4 = wVar.f3454b;
                int i12 = I.f1469c;
                editorInfo.initialSelStart = (int) (j4 >> 32);
                editorInfo.initialSelEnd = (int) (j4 & 4294967295L);
                S1.h0.x(editorInfo, wVar.f3453a.f1494h);
                editorInfo.imeOptions |= 33554432;
                if (p119w1.h.c()) {
                    p119w1.h.a().h(editorInfo);
                }
                M0.s sVar = new M0.s(zVar.f3468g, new C0025m0(i6, zVar), zVar.f3469h.f3432b);
                zVar.i.add(new WeakReference(sVar));
                return sVar;
            }
        } else {
            q qVar2 = (q) n6.f14276k.get();
            C1146n0 c1146n0 = (C1146n0) (qVar2 != null ? qVar2.f5971b : null);
            if (c1146n0 != null) {
                synchronized (c1146n0.f14433c) {
                    if (c1146n0.f14435e) {
                        return null;
                    }
                    D.F fA = c1146n0.f14431a.a(editorInfo);
                    v vVar = new v(i3, c1146n0);
                    InputConnection oVar = Build.VERSION.SDK_INT >= 34 ? new M0.o(fA, vVar) : new M0.n(fA, vVar);
                    c1146n0.f14434d.c(new WeakReference(oVar));
                    return oVar;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        p007b0.c cVar = this.f14509u;
        cVar.getClass();
        p007b0.a.f7023a.b(cVar, jArr, iArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        X.x xVar = getSnapshotObserver().f14029a;
        J2.b bVar = xVar.f5747g;
        if (bVar != null) {
            bVar.c();
        }
        xVar.b();
        C1139k viewTreeOwners = getViewTreeOwners();
        C0460u c0460uF = viewTreeOwners != null ? viewTreeOwners.f14402a.f() : null;
        if (c0460uF == null) {
            p027e3.a.z0("No lifecycle owner exists");
            throw null;
        }
        c0460uF.f(this.f14509u);
        c0460uF.f(this);
        a aVar = this.f14461E;
        if (aVar != null) {
            p001a0.e.f6116a.b(aVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f14481e0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f14482f0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f14483g0);
        if (Build.VERSION.SDK_INT >= 31) {
            E.f14214a.a(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z5, int i, Rect rect) {
        super.onFocusChanged(z5, i, rect);
        if (z5 || hasFocus()) {
            return;
        }
        b bVar = (b) getFocusOwner();
        L l6 = bVar.f6705h;
        boolean z6 = l6.f1105b;
        p024e0.r rVar = bVar.f6703f;
        if (z6) {
            p024e0.d.e(rVar, true);
            return;
        }
        try {
            l6.f1105b = true;
            p024e0.d.e(rVar, true);
        } finally {
            L.b(l6);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i3, int i6, int i7) {
        this.f14467N.g(this.f14454A0);
        this.f14465L = null;
        F();
        if (this.J != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i6 - i, i7 - i3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        P p6 = this.f14467N;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                j(getRoot());
            }
            long jG = g(i);
            int i6 = (int) (jG >>> 32);
            int i7 = (int) (jG & 4294967295L);
            long jG2 = g(i3);
            int i8 = (int) (4294967295L & jG2);
            int iMin = Math.min((int) (jG2 >>> 32), 262142);
            int iMin2 = Integer.MAX_VALUE;
            int iMin3 = i8 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i8, 262142);
            int iC = p081p0.c.C(iMin3 == Integer.MAX_VALUE ? iMin : iMin3);
            if (i7 != Integer.MAX_VALUE) {
                iMin2 = Math.min(iC, i7);
            }
            long jT = p081p0.c.t(Math.min(iC, i6), iMin2, iMin, iMin3);
            S0.a aVar = this.f14465L;
            if (aVar == null) {
                this.f14465L = new S0.a(jT);
                this.f14466M = false;
            } else if (!S0.a.b(aVar.f4883a, jT)) {
                this.f14466M = true;
            }
            p6.m(jT);
            p6.h();
            setMeasuredDimension(getRoot().f13829D.f13923r.f13137h, getRoot().f13829D.f13923r.i);
            if (this.J != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f13829D.f13923r.f13137h, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f13829D.f13923r.i, 1073741824));
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        a aVar;
        if (viewStructure == null || (aVar = this.f14461E) == null) {
            return;
        }
        p001a0.c cVar = p001a0.c.f6114a;
        f fVar = aVar.f6112b;
        int iA = cVar.a(viewStructure, fVar.f6117a.size());
        for (Map.Entry entry : fVar.f6117a.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            int i3 = iA;
            ViewStructure viewStructureB = cVar.b(viewStructure, i3);
            if (viewStructureB != null) {
                p001a0.d dVar = p001a0.d.f6115a;
                AutofillId autofillIdA = dVar.a(viewStructure);
                E4.k.c(autofillIdA);
                dVar.g(viewStructureB, autofillIdA, iIntValue);
                cVar.d(viewStructureB, iIntValue, aVar.f6111a.getContext().getPackageName(), null, null);
                dVar.h(viewStructureB, 1);
                throw null;
            }
            iA = i3 + 1;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        k kVar;
        if (this.i) {
            k kVar2 = k.f4897h;
            if (i != 0) {
                kVar = i != 1 ? null : k.i;
            } else {
                kVar = kVar2;
            }
            if (kVar != null) {
                kVar2 = kVar;
            }
            setLayoutDirection(kVar2);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        l lVar;
        if (Build.VERSION.SDK_INT < 31 || (lVar = this.f14460D0) == null) {
            return;
        }
        lVar.a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        p007b0.c cVar = this.f14509u;
        cVar.getClass();
        p007b0.a.f7023a.c(cVar, longSparseArray);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z5) {
        boolean zA;
        this.f14497o.f14278a.setValue(Boolean.valueOf(z5));
        this.f14458C0 = true;
        super.onWindowFocusChanged(z5);
        if (!z5 || getShowLayoutBounds() == (zA = C1144m0.a())) {
            return;
        }
        setShowLayoutBounds(zA);
        i(getRoot());
    }

    public final long p(long j4) {
        y();
        long jB = A.b(j4, this.f14472S);
        return p081p0.c.y(p030f0.c.d(this.f14476W) + p030f0.c.d(jB), p030f0.c.e(this.f14476W) + p030f0.c.e(jB));
    }

    public final void q(boolean z5) {
        C1149p c1149p;
        P p6 = this.f14467N;
        if (p6.f13949b.t() || ((P.d) p6.f13952e.f14007b).n()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z5) {
                try {
                    c1149p = this.f14454A0;
                } finally {
                    Trace.endSection();
                }
            } else {
                c1149p = null;
            }
            if (p6.g(c1149p)) {
                requestLayout();
            }
            p6.a(false);
        }
    }

    public final void r(e0 e0Var, boolean z5) {
        ArrayList arrayList = this.f14516y;
        if (!z5) {
            if (this.f14453A) {
                return;
            }
            arrayList.remove(e0Var);
            ArrayList arrayList2 = this.f14518z;
            if (arrayList2 != null) {
                arrayList2.remove(e0Var);
                return;
            }
            return;
        }
        if (!this.f14453A) {
            arrayList.add(e0Var);
            return;
        }
        ArrayList arrayList3 = this.f14518z;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f14518z = arrayList3;
        }
        arrayList3.add(e0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (isFocused()) {
            return true;
        }
        int iOrdinal = ((b) getFocusOwner()).f6703f.z0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return super.requestFocus(i, rect);
        }
        if (iOrdinal != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (isInTouchMode()) {
            return false;
        }
        p024e0.b bVarI = p024e0.d.I(i);
        int i3 = bVarI != null ? bVarI.f8640a : 7;
        Boolean boolC = ((b) getFocusOwner()).c(i3, rect != null ? new p030f0.d(rect.left, rect.top, rect.right, rect.bottom) : null, new C1141l(i3));
        if (boolC != null) {
            return boolC.booleanValue();
        }
        return false;
    }

    public final void s() {
        if (this.f14463F) {
            X.x xVar = getSnapshotObserver().f14029a;
            synchronized (xVar.f5746f) {
                try {
                    P.d dVar = xVar.f5746f;
                    int i = dVar.f4583j;
                    int i3 = 0;
                    for (int i6 = 0; i6 < i; i6++) {
                        X.w wVar = (X.w) dVar.f4582h[i6];
                        wVar.e();
                        if (!(wVar.f5735f.f10800e != 0)) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr = dVar.f4582h;
                            objArr[i6 - i3] = objArr[i6];
                        }
                    }
                    int i7 = i - i3;
                    p089q4.k.j0(i7, i, dVar.f4582h);
                    dVar.f4583j = i7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f14463F = false;
        }
        W w6 = this.J;
        if (w6 != null) {
            f(w6);
        }
        while (this.f14513w0.n()) {
            int i8 = this.f14513w0.f4583j;
            for (int i9 = 0; i9 < i8; i9++) {
                Object[] objArr2 = this.f14513w0.f4582h;
                D4.a aVar = (D4.a) objArr2[i9];
                objArr2[i9] = null;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.f14513w0.q(0, i8);
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long j4) {
        this.f14507t.f14192h = j4;
    }

    public final void setConfigurationChangeObserver(c cVar) {
        this.f14459D = cVar;
    }

    public final void setContentCaptureManager$ui_release(p007b0.c cVar) {
        this.f14509u = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [P.d] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [P.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public void setCoroutineContext(i iVar) {
        int i;
        int i3;
        this.f14493m = iVar;
        n nVar = (n) getRoot().f13828C.f3796f;
        if (nVar instanceof p091r0.A) {
            ((p091r0.A) nVar).A0();
        }
        n nVar2 = nVar.f5958h;
        if (!nVar2.f5969t) {
            p027e3.a.y0("visitSubtree called on an unattached node");
            throw null;
        }
        n nVar3 = nVar2.f5962m;
        p124x0.D dS = AbstractC1098f.s(nVar);
        int[] iArrCopyOf = new int[16];
        P.d[] dVarArr = new P.d[16];
        int i6 = 0;
        while (dS != null) {
            if (nVar3 == null) {
                nVar3 = (n) dS.f13828C.f3796f;
            }
            if ((nVar3.f5960k & 16) != 0) {
                while (nVar3 != null) {
                    if ((nVar3.f5959j & 16) != 0) {
                        ?? E5 = nVar3;
                        ?? dVar = 0;
                        while (E5 != 0) {
                            if (E5 instanceof k0) {
                                k0 k0Var = (k0) E5;
                                if (k0Var instanceof p091r0.A) {
                                    ((p091r0.A) k0Var).A0();
                                }
                            } else if ((E5.f5959j & 16) != 0 && (E5 instanceof AbstractC1105m)) {
                                n nVar4 = ((AbstractC1105m) E5).f14046v;
                                int i7 = 0;
                                E5 = E5;
                                dVar = dVar;
                                while (nVar4 != null) {
                                    if ((nVar4.f5959j & 16) != 0) {
                                        i7++;
                                        dVar = dVar;
                                        if (i7 == 1) {
                                            E5 = nVar4;
                                        } else {
                                            if (dVar == 0) {
                                                dVar = new P.d(new n[16]);
                                            }
                                            if (E5 != 0) {
                                                dVar.c(E5);
                                                E5 = 0;
                                            }
                                            dVar.c(nVar4);
                                        }
                                    }
                                    nVar4 = nVar4.f5962m;
                                    E5 = E5;
                                    dVar = dVar;
                                }
                                if (i7 == 1) {
                                }
                            }
                            E5 = AbstractC1098f.e(dVar);
                        }
                    }
                    nVar3 = nVar3.f5962m;
                }
            }
            P.d dVarU = dS.u();
            if (!dVarU.m()) {
                if (i6 >= iArrCopyOf.length) {
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                    E4.k.e("copyOf(this, newSize)", iArrCopyOf);
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    E4.k.e("copyOf(this, newSize)", objArrCopyOf);
                    dVarArr = (P.d[]) objArrCopyOf;
                }
                iArrCopyOf[i6] = dVarU.f4583j - 1;
                dVarArr[i6] = dVarU;
                i6++;
            }
            if (i6 <= 0 || (i3 = iArrCopyOf[(i = i6 - 1)]) < 0) {
                dS = null;
            } else {
                if (i6 <= 0) {
                    throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()");
                }
                P.d dVar2 = dVarArr[i];
                E4.k.c(dVar2);
                if (i3 > 0) {
                    iArrCopyOf[i] = iArrCopyOf[i] - 1;
                } else if (i3 == 0) {
                    dVarArr[i] = null;
                    i6--;
                }
                dS = (p124x0.D) dVar2.f4582h[i3];
            }
            nVar3 = null;
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j4) {
        this.f14474U = j4;
    }

    public final void setOnViewTreeOwnersAvailable(c cVar) {
        C1139k viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            cVar.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f14480d0 = cVar;
    }

    public void setShowLayoutBounds(boolean z5) {
        this.I = z5;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final p030f0.d t() {
        if (isFocused()) {
            p024e0.r rVarG = p024e0.d.g(((b) getFocusOwner()).f6703f);
            if (rVarG != null) {
                return p024e0.d.j(rVarG);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return p024e0.d.d(viewFindFocus);
        }
        return null;
    }

    public final void u(p124x0.D d6) {
        B b6 = this.f14507t;
        b6.f14208y = true;
        if (b6.s()) {
            b6.u(d6);
        }
        p007b0.c cVar = this.f14509u;
        cVar.f7035o = true;
        if (cVar.e() && cVar.f7036p.add(d6)) {
            cVar.f7037q.j(p084p4.x.f10867a);
        }
    }

    public final void v(p124x0.D d6, boolean z5, boolean z6) {
        p124x0.D dR;
        p124x0.D dR2;
        p124x0.H h6;
        E e6;
        P p6 = this.f14467N;
        if (!z5) {
            if (p6.l(d6, z6)) {
                A(d6);
                return;
            }
            return;
        }
        p6.getClass();
        if (d6.f13836j == null) {
            p027e3.a.y0("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
            throw null;
        }
        p124x0.J j4 = d6.f13829D;
        int iD = AbstractC0916i.d(j4.f13909c);
        if (iD != 0) {
            if (iD == 1) {
                return;
            }
            if (iD != 2 && iD != 3) {
                if (iD != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!j4.f13913g || z6) {
                    j4.f13913g = true;
                    j4.f13910d = true;
                    if (d6.f13832K) {
                        return;
                    }
                    boolean zA = E4.k.a(d6.F(), Boolean.TRUE);
                    C0495p c0495p = p6.f13949b;
                    if ((zA || (j4.f13913g && (d6.p() == 1 || !((h6 = j4.f13924s) == null || (e6 = h6.f13881x) == null || !e6.e())))) && ((dR = d6.r()) == null || !dR.f13829D.f13913g)) {
                        c0495p.p(d6, true);
                    } else if ((d6.E() || (j4.f13910d && P.f(d6))) && ((dR2 = d6.r()) == null || !dR2.f13829D.f13910d)) {
                        c0495p.p(d6, false);
                    }
                    if (p6.f13951d) {
                        return;
                    }
                    A(d6);
                    return;
                }
                return;
            }
        }
        p6.f13955h.c(new O(d6, true, z6));
    }

    public final void w(p124x0.D d6, boolean z5, boolean z6) {
        P p6 = this.f14467N;
        if (!z5) {
            p6.getClass();
            int iD = AbstractC0916i.d(d6.f13829D.f13909c);
            if (iD == 0 || iD == 1 || iD == 2 || iD == 3) {
                return;
            }
            if (iD != 4) {
                throw new NoWhenBranchMatchedException();
            }
            p124x0.J j4 = d6.f13829D;
            if (!z6 && d6.E() == j4.f13923r.f13906z && (j4.f13910d || j4.f13911e)) {
                return;
            }
            j4.f13911e = true;
            j4.f13912f = true;
            if (!d6.f13832K && j4.f13923r.f13906z) {
                p124x0.D dR = d6.r();
                if ((dR == null || !dR.f13829D.f13911e) && (dR == null || !dR.f13829D.f13910d)) {
                    p6.f13949b.p(d6, false);
                }
                if (p6.f13951d) {
                    return;
                }
                A(null);
                return;
            }
            return;
        }
        p6.getClass();
        int iD2 = AbstractC0916i.d(d6.f13829D.f13909c);
        if (iD2 != 0) {
            if (iD2 == 1) {
                return;
            }
            if (iD2 != 2) {
                if (iD2 == 3) {
                    return;
                }
                if (iD2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        p124x0.J j6 = d6.f13829D;
        if ((j6.f13913g || j6.f13914h) && !z6) {
            return;
        }
        j6.f13914h = true;
        j6.i = true;
        j6.f13911e = true;
        j6.f13912f = true;
        if (d6.f13832K) {
            return;
        }
        p124x0.D dR2 = d6.r();
        boolean zA = E4.k.a(d6.F(), Boolean.TRUE);
        C0495p c0495p = p6.f13949b;
        if (zA && ((dR2 == null || !dR2.f13829D.f13913g) && (dR2 == null || !dR2.f13829D.f13914h))) {
            c0495p.p(d6, true);
        } else if (d6.E() && ((dR2 == null || !dR2.f13829D.f13911e) && (dR2 == null || !dR2.f13829D.f13910d))) {
            c0495p.p(d6, false);
        }
        if (p6.f13951d) {
            return;
        }
        A(null);
    }

    public final void x() {
        B b6 = this.f14507t;
        b6.f14208y = true;
        if (b6.s() && !b6.J) {
            b6.J = true;
            b6.f14195l.post(b6.f14185K);
        }
        p007b0.c cVar = this.f14509u;
        cVar.f7035o = true;
        if (!cVar.e() || cVar.f7043w) {
            return;
        }
        cVar.f7043w = true;
        cVar.f7038r.post(cVar.f7044x);
    }

    public final void y() {
        if (this.f14475V) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f14474U) {
            this.f14474U = jCurrentAnimationTimeMillis;
            X x6 = this.f14456B0;
            float[] fArr = this.f14472S;
            x6.a(this, fArr);
            H.s(fArr, this.f14473T);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f14470Q;
            view.getLocationOnScreen(iArr);
            float f6 = iArr[0];
            float f7 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f14476W = p081p0.c.y(f6 - iArr[0], f7 - iArr[1]);
        }
    }

    public final void z(e0 e0Var) {
        d0 d0Var;
        Reference referencePoll;
        P.d dVar;
        if (this.f14464K != null) {
            u uVar = I0.f14246w;
        }
        do {
            d0Var = this.f14511v0;
            referencePoll = ((ReferenceQueue) d0Var.f14008c).poll();
            dVar = (P.d) d0Var.f14007b;
            if (referencePoll != null) {
                dVar.o(referencePoll);
            }
        } while (referencePoll != null);
        dVar.c(new WeakReference(e0Var, (ReferenceQueue) d0Var.f14008c));
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        E4.k.c(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    public C1129f getAccessibilityManager() {
        return this.f14510v;
    }

    public C1131g getClipboardManager() {
        return this.G;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i3) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i3;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }
}
