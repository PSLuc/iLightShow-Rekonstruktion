package p130y0;

import B.C0003b0;
import E4.k;
import V0.u;
import W2.g;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p030f0.c;
import p035g0.A;
import p035g0.C0701b;
import p035g0.C0715p;
import p035g0.E;
import p035g0.F;
import p035g0.H;
import p035g0.InterfaceC0714o;
import p035g0.J;
import p035g0.P;
import p048j0.b;
import p058l0.I;
import p124x0.e0;

/* JADX INFO: loaded from: classes.dex */
public final class I0 extends View implements e0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static boolean f14245A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final u f14246w = new u(2);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static Method f14247x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static Field f14248y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static boolean f14249z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f14250h;
    public final C1134h0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0003b0 f14251j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public I f14252k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1155s0 f14253l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14254m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Rect f14255n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f14256o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14257p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0715p f14258q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1150p0 f14259r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f14260s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14261t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f14262u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14263v;

    public I0(r rVar, C1134h0 c1134h0, C0003b0 c0003b0, I i) {
        super(rVar.getContext());
        this.f14250h = rVar;
        this.i = c1134h0;
        this.f14251j = c0003b0;
        this.f14252k = i;
        this.f14253l = new C1155s0();
        this.f14258q = new C0715p(0);
        this.f14259r = new C1150p0(Z.f14334k);
        this.f14260s = P.f9051b;
        this.f14261t = true;
        setWillNotDraw(false);
        c1134h0.addView(this);
        this.f14262u = View.generateViewId();
    }

    private final F getManualClipPath() {
        if (!getClipToOutline()) {
            return null;
        }
        C1155s0 c1155s0 = this.f14253l;
        if (!c1155s0.f14527f) {
            return null;
        }
        c1155s0.d();
        return c1155s0.f14525d;
    }

    private final void setInvalidated(boolean z5) {
        if (z5 != this.f14256o) {
            this.f14256o = z5;
            this.f14250h.r(this, z5);
        }
    }

    @Override // p124x0.e0
    public final long a(long j4, boolean z5) {
        C1150p0 c1150p0 = this.f14259r;
        if (!z5) {
            return A.b(j4, c1150p0.b(this));
        }
        float[] fArrA = c1150p0.a(this);
        if (fArrA != null) {
            return A.b(j4, fArrA);
        }
        return 9187343241974906880L;
    }

    @Override // p124x0.e0
    public final void b(long j4) {
        int i = (int) (j4 >> 32);
        int i3 = (int) (j4 & 4294967295L);
        if (i == getWidth() && i3 == getHeight()) {
            return;
        }
        setPivotX(P.b(this.f14260s) * i);
        setPivotY(P.c(this.f14260s) * i3);
        setOutlineProvider(this.f14253l.b() != null ? f14246w : null);
        layout(getLeft(), getTop(), getLeft() + i, getTop() + i3);
        l();
        this.f14259r.c();
    }

    @Override // p124x0.e0
    public final void c(float[] fArr) {
        A.g(fArr, this.f14259r.b(this));
    }

    @Override // p124x0.e0
    public final void d(InterfaceC0714o interfaceC0714o, b bVar) {
        boolean z5 = getElevation() > 0.0f;
        this.f14257p = z5;
        if (z5) {
            interfaceC0714o.r();
        }
        this.i.a(interfaceC0714o, this, getDrawingTime());
        if (this.f14257p) {
            interfaceC0714o.n();
        }
    }

    @Override // p124x0.e0
    public final void destroy() {
        setInvalidated(false);
        r rVar = this.f14250h;
        rVar.f14463F = true;
        this.f14251j = null;
        this.f14252k = null;
        rVar.z(this);
        this.i.removeViewInLayout(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z5;
        C0715p c0715p = this.f14258q;
        C0701b c0701b = (C0701b) c0715p.i;
        Canvas canvas2 = c0701b.f9056a;
        c0701b.f9056a = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z5 = false;
        } else {
            c0701b.l();
            this.f14253l.a(c0701b);
            z5 = true;
        }
        C0003b0 c0003b0 = this.f14251j;
        if (c0003b0 != null) {
            c0003b0.d(c0701b, null);
        }
        if (z5) {
            c0701b.i();
        }
        ((C0701b) c0715p.i).f9056a = canvas2;
        setInvalidated(false);
    }

    @Override // p124x0.e0
    public final void e(C0003b0 c0003b0, I i) {
        this.i.addView(this);
        this.f14254m = false;
        this.f14257p = false;
        this.f14260s = P.f9051b;
        this.f14251j = c0003b0;
        this.f14252k = i;
    }

    @Override // p124x0.e0
    public final void f(float[] fArr) {
        float[] fArrA = this.f14259r.a(this);
        if (fArrA != null) {
            A.g(fArr, fArrA);
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // p124x0.e0
    public final void g(p030f0.b bVar, boolean z5) {
        C1150p0 c1150p0 = this.f14259r;
        if (!z5) {
            A.c(c1150p0.b(this), bVar);
            return;
        }
        float[] fArrA = c1150p0.a(this);
        if (fArrA != null) {
            A.c(fArrA, bVar);
            return;
        }
        bVar.f8833a = 0.0f;
        bVar.f8834b = 0.0f;
        bVar.f8835c = 0.0f;
        bVar.f8836d = 0.0f;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final C1134h0 getContainer() {
        return this.i;
    }

    public long getLayerId() {
        return this.f14262u;
    }

    public final r getOwnerView() {
        return this.f14250h;
    }

    public long getOwnerViewId() {
        return H0.a(this.f14250h);
    }

    @Override // p124x0.e0
    public final void h(long j4) {
        int i = (int) (j4 >> 32);
        int left = getLeft();
        C1150p0 c1150p0 = this.f14259r;
        if (i != left) {
            offsetLeftAndRight(i - getLeft());
            c1150p0.c();
        }
        int i3 = (int) (j4 & 4294967295L);
        if (i3 != getTop()) {
            offsetTopAndBottom(i3 - getTop());
            c1150p0.c();
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f14261t;
    }

    @Override // p124x0.e0
    public final void i() {
        if (!this.f14256o || f14245A) {
            return;
        }
        H.A(this);
        setInvalidated(false);
    }

    @Override // android.view.View, p124x0.e0
    public final void invalidate() {
        if (this.f14256o) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f14250h.invalidate();
    }

    @Override // p124x0.e0
    public final void j(J j4) {
        I i;
        int i3 = j4.f9017h | this.f14263v;
        if ((i3 & 4096) != 0) {
            long j6 = j4.f9025q;
            this.f14260s = j6;
            setPivotX(P.b(j6) * getWidth());
            setPivotY(P.c(this.f14260s) * getHeight());
        }
        if ((i3 & 1) != 0) {
            setScaleX(j4.i);
        }
        if ((i3 & 2) != 0) {
            setScaleY(j4.f9018j);
        }
        if ((i3 & 4) != 0) {
            setAlpha(j4.f9019k);
        }
        if ((i3 & 8) != 0) {
            setTranslationX(0.0f);
        }
        if ((i3 & 16) != 0) {
            setTranslationY(0.0f);
        }
        if ((i3 & 32) != 0) {
            setElevation(j4.f9020l);
        }
        if ((i3 & 1024) != 0) {
            setRotation(j4.f9023o);
        }
        if ((i3 & HueLog.LogComponent.STREAMDTLS) != 0) {
            setRotationX(0.0f);
        }
        if ((i3 & HueLog.LogComponent.APPCORE) != 0) {
            setRotationY(0.0f);
        }
        if ((i3 & 2048) != 0) {
            setCameraDistancePx(j4.f9024p);
        }
        boolean z5 = getManualClipPath() != null;
        boolean z6 = j4.f9027s;
        g gVar = H.f9016a;
        boolean z7 = z6 && j4.f9026r != gVar;
        if ((i3 & 24576) != 0) {
            this.f14254m = z6 && j4.f9026r == gVar;
            l();
            setClipToOutline(z7);
        }
        boolean zC = this.f14253l.c(j4.f9031w, j4.f9019k, z7, j4.f9020l, j4.f9028t);
        C1155s0 c1155s0 = this.f14253l;
        if (c1155s0.f14526e) {
            setOutlineProvider(c1155s0.b() != null ? f14246w : null);
        }
        boolean z8 = getManualClipPath() != null;
        if (z5 != z8 || (z8 && zC)) {
            invalidate();
        }
        if (!this.f14257p && getElevation() > 0.0f && (i = this.f14252k) != null) {
            i.invoke();
        }
        if ((i3 & 7963) != 0) {
            this.f14259r.c();
        }
        int i6 = Build.VERSION.SDK_INT;
        int i7 = i3 & 64;
        K0 k3 = K0.f14266a;
        if (i7 != 0) {
            k3.a(this, H.v(j4.f9021m));
        }
        if ((i3 & 128) != 0) {
            k3.b(this, H.v(j4.f9022n));
        }
        if (i6 >= 31 && (131072 & i3) != 0) {
            L0.f14270a.a(this, null);
        }
        if ((i3 & 32768) != 0) {
            setLayerType(0, null);
            this.f14261t = true;
        }
        this.f14263v = j4.f9017h;
    }

    @Override // p124x0.e0
    public final boolean k(long j4) {
        E e6;
        float fD = c.d(j4);
        float fE = c.e(j4);
        if (this.f14254m) {
            if (0.0f > fD || fD >= getWidth() || 0.0f > fE || fE >= getHeight()) {
                return false;
            }
        } else if (getClipToOutline()) {
            C1155s0 c1155s0 = this.f14253l;
            if (c1155s0.f14532l && (e6 = c1155s0.f14523b) != null) {
                return H.u(e6, c.d(j4), c.e(j4));
            }
            return true;
        }
        return true;
    }

    public final void l() {
        Rect rect;
        if (this.f14254m) {
            Rect rect2 = this.f14255n;
            if (rect2 == null) {
                this.f14255n = new Rect(0, 0, getWidth(), getHeight());
            } else {
                k.c(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f14255n;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // android.view.View
    public final void onLayout(boolean z5, int i, int i3, int i6, int i7) {
    }

    public final void setCameraDistancePx(float f6) {
        setCameraDistance(f6 * getResources().getDisplayMetrics().densityDpi);
    }
}
