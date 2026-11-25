package p130y0;

import B.C0003b0;
import O1.u;
import W2.g;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.lang.reflect.InvocationTargetException;
import p030f0.c;
import p035g0.A;
import p035g0.AbstractC0702c;
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
import p090r.v;
import p124x0.e0;

/* JADX INFO: renamed from: y0.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1167y0 implements e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f14552h;
    public C0003b0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public I f14553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14554k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14557n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u f14558o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1163w0 f14562s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14563t;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1155s0 f14555l = new C1155s0();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C1150p0 f14559p = new C1150p0(Z.f14333j);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0715p f14560q = new C0715p(0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f14561r = P.f9051b;

    public C1167y0(r rVar, C0003b0 c0003b0, I i) {
        this.f14552h = rVar;
        this.i = c0003b0;
        this.f14553j = i;
        C1163w0 c1163w0 = new C1163w0();
        RenderNode renderNode = c1163w0.f14540a;
        renderNode.setHasOverlappingRendering(true);
        renderNode.setClipToBounds(false);
        this.f14562s = c1163w0;
    }

    @Override // p124x0.e0
    public final long a(long j4, boolean z5) {
        C1163w0 c1163w0 = this.f14562s;
        C1150p0 c1150p0 = this.f14559p;
        if (!z5) {
            return A.b(j4, c1150p0.b(c1163w0));
        }
        float[] fArrA = c1150p0.a(c1163w0);
        if (fArrA != null) {
            return A.b(j4, fArrA);
        }
        return 9187343241974906880L;
    }

    @Override // p124x0.e0
    public final void b(long j4) {
        int i = (int) (j4 >> 32);
        int i3 = (int) (j4 & 4294967295L);
        float fB = P.b(this.f14561r) * i;
        C1163w0 c1163w0 = this.f14562s;
        c1163w0.f14540a.setPivotX(fB);
        c1163w0.f14540a.setPivotY(P.c(this.f14561r) * i3);
        if (c1163w0.f14540a.setPosition(c1163w0.f14540a.getLeft(), c1163w0.f14540a.getTop(), c1163w0.f14540a.getLeft() + i, c1163w0.f14540a.getTop() + i3)) {
            c1163w0.f14540a.setOutline(this.f14555l.b());
            if (!this.f14554k && !this.f14556m) {
                this.f14552h.invalidate();
                l(true);
            }
            this.f14559p.c();
        }
    }

    @Override // p124x0.e0
    public final void c(float[] fArr) {
        A.g(fArr, this.f14559p.b(this.f14562s));
    }

    @Override // p124x0.e0
    public final void d(InterfaceC0714o interfaceC0714o, b bVar) throws IllegalAccessException, InvocationTargetException {
        Canvas canvasA = AbstractC0702c.a(interfaceC0714o);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        C1163w0 c1163w0 = this.f14562s;
        if (zIsHardwareAccelerated) {
            i();
            boolean z5 = c1163w0.f14540a.getElevation() > 0.0f;
            this.f14557n = z5;
            if (z5) {
                interfaceC0714o.r();
            }
            canvasA.drawRenderNode(c1163w0.f14540a);
            if (this.f14557n) {
                interfaceC0714o.n();
                return;
            }
            return;
        }
        float left = c1163w0.f14540a.getLeft();
        float top = c1163w0.f14540a.getTop();
        float right = c1163w0.f14540a.getRight();
        float bottom = c1163w0.f14540a.getBottom();
        if (c1163w0.f14540a.getAlpha() < 1.0f) {
            u uVarG = this.f14558o;
            if (uVarG == null) {
                uVarG = H.g();
                this.f14558o = uVarG;
            }
            uVarG.l(c1163w0.f14540a.getAlpha());
            canvasA.saveLayer(left, top, right, bottom, (Paint) uVarG.f4534b);
        } else {
            interfaceC0714o.l();
        }
        interfaceC0714o.g(left, top);
        interfaceC0714o.q(this.f14559p.b(c1163w0));
        if (c1163w0.f14540a.getClipToOutline() || c1163w0.f14540a.getClipToBounds()) {
            this.f14555l.a(interfaceC0714o);
        }
        C0003b0 c0003b0 = this.i;
        if (c0003b0 != null) {
            c0003b0.d(interfaceC0714o, null);
        }
        interfaceC0714o.i();
        l(false);
    }

    @Override // p124x0.e0
    public final void destroy() {
        C1163w0 c1163w0 = this.f14562s;
        if (c1163w0.f14540a.hasDisplayList()) {
            c1163w0.f14540a.discardDisplayList();
        }
        this.i = null;
        this.f14553j = null;
        this.f14556m = true;
        l(false);
        r rVar = this.f14552h;
        rVar.f14463F = true;
        rVar.z(this);
    }

    @Override // p124x0.e0
    public final void e(C0003b0 c0003b0, I i) {
        l(false);
        this.f14556m = false;
        this.f14557n = false;
        this.f14561r = P.f9051b;
        this.i = c0003b0;
        this.f14553j = i;
    }

    @Override // p124x0.e0
    public final void f(float[] fArr) {
        float[] fArrA = this.f14559p.a(this.f14562s);
        if (fArrA != null) {
            A.g(fArr, fArrA);
        }
    }

    @Override // p124x0.e0
    public final void g(p030f0.b bVar, boolean z5) {
        C1163w0 c1163w0 = this.f14562s;
        C1150p0 c1150p0 = this.f14559p;
        if (!z5) {
            A.c(c1150p0.b(c1163w0), bVar);
            return;
        }
        float[] fArrA = c1150p0.a(c1163w0);
        if (fArrA != null) {
            A.c(fArrA, bVar);
            return;
        }
        bVar.f8833a = 0.0f;
        bVar.f8834b = 0.0f;
        bVar.f8835c = 0.0f;
        bVar.f8836d = 0.0f;
    }

    @Override // p124x0.e0
    public final void h(long j4) {
        C1163w0 c1163w0 = this.f14562s;
        int left = c1163w0.f14540a.getLeft();
        int top = c1163w0.f14540a.getTop();
        int i = (int) (j4 >> 32);
        int i3 = (int) (j4 & 4294967295L);
        if (left == i && top == i3) {
            return;
        }
        if (left != i) {
            c1163w0.f14540a.offsetLeftAndRight(i - left);
        }
        if (top != i3) {
            c1163w0.f14540a.offsetTopAndBottom(i3 - top);
        }
        c1.f14381a.a(this.f14552h);
        this.f14559p.c();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    @Override // p124x0.e0
    public final void i() throws IllegalAccessException, InvocationTargetException {
        F f6;
        boolean z5 = this.f14554k;
        C1163w0 c1163w0 = this.f14562s;
        if (z5 || !c1163w0.f14540a.hasDisplayList()) {
            if (c1163w0.f14540a.getClipToOutline()) {
                C1155s0 c1155s0 = this.f14555l;
                if (c1155s0.f14527f) {
                    c1155s0.d();
                    f6 = c1155s0.f14525d;
                } else {
                    f6 = null;
                }
            } else {
                f6 = null;
            }
            C0003b0 c0003b0 = this.i;
            if (c0003b0 != null) {
                v vVar = new v(19, c0003b0);
                RenderNode renderNode = c1163w0.f14540a;
                RecordingCanvas recordingCanvasBeginRecording = renderNode.beginRecording();
                C0715p c0715p = this.f14560q;
                C0701b c0701b = (C0701b) c0715p.i;
                Canvas canvas = c0701b.f9056a;
                c0701b.f9056a = recordingCanvasBeginRecording;
                if (f6 != null) {
                    c0701b.l();
                    c0701b.c(f6);
                }
                vVar.invoke(c0701b);
                if (f6 != null) {
                    c0701b.i();
                }
                ((C0701b) c0715p.i).f9056a = canvas;
                renderNode.endRecording();
            }
            l(false);
        }
    }

    @Override // p124x0.e0
    public final void invalidate() {
        if (this.f14554k || this.f14556m) {
            return;
        }
        this.f14552h.invalidate();
        l(true);
    }

    @Override // p124x0.e0
    public final void j(J j4) {
        I i;
        int i3 = j4.f9017h | this.f14563t;
        int i6 = i3 & 4096;
        if (i6 != 0) {
            this.f14561r = j4.f9025q;
        }
        C1163w0 c1163w0 = this.f14562s;
        boolean clipToOutline = c1163w0.f14540a.getClipToOutline();
        C1155s0 c1155s0 = this.f14555l;
        boolean z5 = clipToOutline && c1155s0.f14527f;
        if ((i3 & 1) != 0) {
            c1163w0.f14540a.setScaleX(j4.i);
        }
        if ((i3 & 2) != 0) {
            c1163w0.f14540a.setScaleY(j4.f9018j);
        }
        if ((i3 & 4) != 0) {
            c1163w0.f14540a.setAlpha(j4.f9019k);
        }
        if ((i3 & 8) != 0) {
            c1163w0.f14540a.setTranslationX(0.0f);
        }
        if ((i3 & 16) != 0) {
            c1163w0.f14540a.setTranslationY(0.0f);
        }
        if ((i3 & 32) != 0) {
            c1163w0.f14540a.setElevation(j4.f9020l);
        }
        if ((i3 & 64) != 0) {
            c1163w0.f14540a.setAmbientShadowColor(H.v(j4.f9021m));
        }
        if ((i3 & 128) != 0) {
            c1163w0.f14540a.setSpotShadowColor(H.v(j4.f9022n));
        }
        if ((i3 & 1024) != 0) {
            c1163w0.f14540a.setRotationZ(j4.f9023o);
        }
        if ((i3 & HueLog.LogComponent.STREAMDTLS) != 0) {
            c1163w0.f14540a.setRotationX(0.0f);
        }
        if ((i3 & HueLog.LogComponent.APPCORE) != 0) {
            c1163w0.f14540a.setRotationY(0.0f);
        }
        if ((i3 & 2048) != 0) {
            c1163w0.f14540a.setCameraDistance(j4.f9024p);
        }
        if (i6 != 0) {
            c1163w0.f14540a.setPivotX(P.b(this.f14561r) * c1163w0.f14540a.getWidth());
            c1163w0.f14540a.setPivotY(P.c(this.f14561r) * c1163w0.f14540a.getHeight());
        }
        boolean z6 = j4.f9027s;
        g gVar = H.f9016a;
        boolean z7 = z6 && j4.f9026r != gVar;
        if ((i3 & 24576) != 0) {
            c1163w0.f14540a.setClipToOutline(z7);
            c1163w0.f14540a.setClipToBounds(j4.f9027s && j4.f9026r == gVar);
        }
        if ((131072 & i3) != 0) {
            if (Build.VERSION.SDK_INT >= 31) {
                C1165x0.f14545a.a(c1163w0.f14540a, null);
            } else {
                c1163w0.getClass();
            }
        }
        if ((32768 & i3) != 0) {
            RenderNode renderNode = c1163w0.f14540a;
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
        boolean zC = this.f14555l.c(j4.f9031w, j4.f9019k, z7, j4.f9020l, j4.f9028t);
        if (c1155s0.f14526e) {
            c1163w0.f14540a.setOutline(c1155s0.b());
        }
        boolean z8 = z7 && c1155s0.f14527f;
        r rVar = this.f14552h;
        if (z5 == z8 && (!z8 || !zC)) {
            c1.f14381a.a(rVar);
        } else if (!this.f14554k && !this.f14556m) {
            rVar.invalidate();
            l(true);
        }
        if (!this.f14557n && c1163w0.f14540a.getElevation() > 0.0f && (i = this.f14553j) != null) {
            i.invoke();
        }
        if ((i3 & 7963) != 0) {
            this.f14559p.c();
        }
        this.f14563t = j4.f9017h;
    }

    @Override // p124x0.e0
    public final boolean k(long j4) {
        E e6;
        float fD = c.d(j4);
        float fE = c.e(j4);
        C1163w0 c1163w0 = this.f14562s;
        if (c1163w0.f14540a.getClipToBounds()) {
            if (0.0f > fD || fD >= c1163w0.f14540a.getWidth() || 0.0f > fE || fE >= c1163w0.f14540a.getHeight()) {
                return false;
            }
        } else if (c1163w0.f14540a.getClipToOutline()) {
            C1155s0 c1155s0 = this.f14555l;
            if (c1155s0.f14532l && (e6 = c1155s0.f14523b) != null) {
                return H.u(e6, c.d(j4), c.e(j4));
            }
            return true;
        }
        return true;
    }

    public final void l(boolean z5) {
        if (z5 != this.f14554k) {
            this.f14554k = z5;
            this.f14552h.r(this, z5);
        }
    }
}
