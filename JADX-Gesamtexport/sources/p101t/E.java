package p101t;

import B.C0031p0;
import G4.a;
import S0.k;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import p019d0.e;
import p030f0.c;
import p030f0.f;
import p035g0.AbstractC0702c;
import p035g0.C0701b;
import p035g0.C0715p;
import p035g0.InterfaceC0714o;
import p044i0.b;
import p123x.O;
import p124x0.F;
import p130y0.H;

/* JADX INFO: loaded from: classes.dex */
public final class E extends H implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12228c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0946n f12229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F f12230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f12231f;

    public E(C0946n c0946n, F f6) {
        this.f12229d = c0946n;
        this.f12230e = f6;
    }

    public static boolean B(float f6, EdgeEffect edgeEffect, RecordingCanvas recordingCanvas) {
        if (f6 == 0.0f) {
            return edgeEffect.draw(recordingCanvas);
        }
        int iSave = recordingCanvas.save();
        recordingCanvas.rotate(f6);
        boolean zDraw = edgeEffect.draw(recordingCanvas);
        recordingCanvas.restoreToCount(iSave);
        return zDraw;
    }

    public static boolean C(float f6, long j4, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f6);
        canvas.translate(c.d(j4), c.e(j4));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public RenderNode D() {
        RenderNode renderNode = (RenderNode) this.f12231f;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
        this.f12231f = renderNode2;
        return renderNode2;
    }

    @Override // p019d0.e
    public final void b(F f6) {
        boolean zC;
        float f7;
        boolean zB;
        float f8;
        switch (this.f12228c) {
            case 0:
                b bVar = f6.f13862h;
                long jF = bVar.f();
                C0946n c0946n = this.f12229d;
                c0946n.l(jF);
                if (f.e(bVar.f())) {
                    f6.b();
                    return;
                }
                f6.b();
                c0946n.f12379j.getValue();
                Canvas canvasA = AbstractC0702c.a(bVar.i.f());
                F f9 = this.f12230e;
                boolean zF = F.f(f9.f12237f);
                O o6 = ((k0) this.f12231f).f12370b;
                if (zF) {
                    zC = C(270.0f, p081p0.c.y(-f.b(bVar.f()), f6.y(o6.b(f6.getLayoutDirection()))), f9.c(), canvasA);
                } else {
                    zC = false;
                }
                if (F.f(f9.f12235d)) {
                    zC = C(0.0f, p081p0.c.y(0.0f, f6.y(o6.f13709b)), f9.e(), canvasA) || zC;
                }
                if (F.f(f9.f12238g)) {
                    zC = C(90.0f, p081p0.c.y(0.0f, f6.y(o6.c(f6.getLayoutDirection())) + (-((float) a.D(f.d(bVar.f()))))), f9.d(), canvasA) || zC;
                }
                if (F.f(f9.f12236e)) {
                    zC = C(180.0f, p081p0.c.y(-f.d(bVar.f()), (-f.b(bVar.f())) + f6.y(o6.f13711d)), f9.b(), canvasA) || zC;
                }
                if (zC) {
                    c0946n.g();
                    return;
                }
                return;
            default:
                b bVar2 = f6.f13862h;
                long jF2 = bVar2.f();
                C0946n c0946n2 = this.f12229d;
                c0946n2.l(jF2);
                if (f.e(bVar2.f())) {
                    f6.b();
                    return;
                }
                c0946n2.f12379j.getValue();
                float fY = f6.y(AbstractC0956y.f12441a);
                Canvas canvasA2 = AbstractC0702c.a(bVar2.i.f());
                F f10 = this.f12230e;
                boolean z5 = F.f(f10.f12235d) || F.g(f10.f12239h) || F.f(f10.f12236e) || F.g(f10.i);
                boolean z6 = F.f(f10.f12237f) || F.g(f10.f12240j) || F.f(f10.f12238g) || F.g(f10.f12241k);
                if (z5 && z6) {
                    D().setPosition(0, 0, canvasA2.getWidth(), canvasA2.getHeight());
                } else if (z5) {
                    D().setPosition(0, 0, (a.D(fY) * 2) + canvasA2.getWidth(), canvasA2.getHeight());
                } else {
                    if (!z6) {
                        f6.b();
                        return;
                    }
                    D().setPosition(0, 0, canvasA2.getWidth(), (a.D(fY) * 2) + canvasA2.getHeight());
                }
                RecordingCanvas recordingCanvasBeginRecording = D().beginRecording();
                if (F.g(f10.f12240j)) {
                    EdgeEffect edgeEffectA = f10.f12240j;
                    if (edgeEffectA == null) {
                        edgeEffectA = f10.a();
                        f10.f12240j = edgeEffectA;
                    }
                    B(90.0f, edgeEffectA, recordingCanvasBeginRecording);
                    edgeEffectA.finish();
                }
                boolean zF2 = F.f(f10.f12237f);
                C0947o c0947o = C0947o.f12387a;
                if (zF2) {
                    EdgeEffect edgeEffectC = f10.c();
                    zB = B(270.0f, edgeEffectC, recordingCanvasBeginRecording);
                    if (F.g(f10.f12237f)) {
                        float fE = c.e(c0946n2.f());
                        EdgeEffect edgeEffectA2 = f10.f12240j;
                        if (edgeEffectA2 == null) {
                            edgeEffectA2 = f10.a();
                            f10.f12240j = edgeEffectA2;
                        }
                        int i = Build.VERSION.SDK_INT;
                        float fB = i >= 31 ? c0947o.b(edgeEffectC) : 0.0f;
                        f7 = fY;
                        float f11 = 1 - fE;
                        if (i >= 31) {
                            c0947o.c(edgeEffectA2, fB, f11);
                        } else {
                            edgeEffectA2.onPull(fB, f11);
                        }
                    } else {
                        f7 = fY;
                    }
                } else {
                    f7 = fY;
                    zB = false;
                }
                if (F.g(f10.f12239h)) {
                    EdgeEffect edgeEffectA3 = f10.f12239h;
                    if (edgeEffectA3 == null) {
                        edgeEffectA3 = f10.a();
                        f10.f12239h = edgeEffectA3;
                    }
                    B(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
                    edgeEffectA3.finish();
                }
                if (F.f(f10.f12235d)) {
                    EdgeEffect edgeEffectE = f10.e();
                    boolean z7 = B(0.0f, edgeEffectE, recordingCanvasBeginRecording) || zB;
                    if (F.g(f10.f12235d)) {
                        float fD = c.d(c0946n2.f());
                        EdgeEffect edgeEffectA4 = f10.f12239h;
                        if (edgeEffectA4 == null) {
                            edgeEffectA4 = f10.a();
                            f10.f12239h = edgeEffectA4;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float fB2 = i3 >= 31 ? c0947o.b(edgeEffectE) : 0.0f;
                        if (i3 >= 31) {
                            c0947o.c(edgeEffectA4, fB2, fD);
                        } else {
                            edgeEffectA4.onPull(fB2, fD);
                        }
                    }
                    zB = z7;
                }
                if (F.g(f10.f12241k)) {
                    EdgeEffect edgeEffectA5 = f10.f12241k;
                    if (edgeEffectA5 == null) {
                        edgeEffectA5 = f10.a();
                        f10.f12241k = edgeEffectA5;
                    }
                    B(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
                    edgeEffectA5.finish();
                }
                if (F.f(f10.f12238g)) {
                    EdgeEffect edgeEffectD = f10.d();
                    boolean z8 = B(90.0f, edgeEffectD, recordingCanvasBeginRecording) || zB;
                    if (F.g(f10.f12238g)) {
                        float fE2 = c.e(c0946n2.f());
                        EdgeEffect edgeEffectA6 = f10.f12241k;
                        if (edgeEffectA6 == null) {
                            edgeEffectA6 = f10.a();
                            f10.f12241k = edgeEffectA6;
                        }
                        int i6 = Build.VERSION.SDK_INT;
                        float fB3 = i6 >= 31 ? c0947o.b(edgeEffectD) : 0.0f;
                        if (i6 >= 31) {
                            c0947o.c(edgeEffectA6, fB3, fE2);
                        } else {
                            edgeEffectA6.onPull(fB3, fE2);
                        }
                    }
                    zB = z8;
                }
                if (F.g(f10.i)) {
                    EdgeEffect edgeEffectA7 = f10.i;
                    if (edgeEffectA7 == null) {
                        edgeEffectA7 = f10.a();
                        f10.i = edgeEffectA7;
                    }
                    f8 = 0.0f;
                    B(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
                    edgeEffectA7.finish();
                } else {
                    f8 = 0.0f;
                }
                if (F.f(f10.f12236e)) {
                    EdgeEffect edgeEffectB = f10.b();
                    boolean z9 = B(180.0f, edgeEffectB, recordingCanvasBeginRecording) || zB;
                    if (F.g(f10.f12236e)) {
                        float fD2 = c.d(c0946n2.f());
                        EdgeEffect edgeEffectA8 = f10.i;
                        if (edgeEffectA8 == null) {
                            edgeEffectA8 = f10.a();
                            f10.i = edgeEffectA8;
                        }
                        int i7 = Build.VERSION.SDK_INT;
                        float fB4 = i7 >= 31 ? c0947o.b(edgeEffectB) : f8;
                        float f12 = 1 - fD2;
                        if (i7 >= 31) {
                            c0947o.c(edgeEffectA8, fB4, f12);
                        } else {
                            edgeEffectA8.onPull(fB4, f12);
                        }
                    }
                    zB = z9;
                }
                if (zB) {
                    c0946n2.g();
                }
                float f13 = z6 ? f8 : f7;
                if (!z5) {
                    f8 = f7;
                }
                k layoutDirection = f6.getLayoutDirection();
                C0701b c0701b = new C0701b();
                c0701b.f9056a = recordingCanvasBeginRecording;
                long jF3 = bVar2.f();
                C0031p0 c0031p0 = bVar2.i;
                p044i0.a aVar = ((b) c0031p0.f395k).f9385h;
                S0.b bVar3 = aVar.f9381a;
                k kVar = aVar.f9382b;
                InterfaceC0714o interfaceC0714oF = c0031p0.f();
                long jL = bVar2.i.l();
                C0031p0 c0031p1 = bVar2.i;
                p048j0.b bVar4 = (p048j0.b) c0031p1.f394j;
                c0031p1.v(f6);
                c0031p1.w(layoutDirection);
                c0031p1.u(c0701b);
                c0031p1.x(jF3);
                c0031p1.f394j = null;
                c0701b.l();
                try {
                    ((C0715p) bVar2.i.i).B(f13, f8);
                    try {
                        f6.b();
                        float f14 = -f13;
                        float f15 = -f8;
                        ((C0715p) bVar2.i.i).B(f14, f15);
                        c0701b.i();
                        C0031p0 c0031p2 = bVar2.i;
                        c0031p2.v(bVar3);
                        c0031p2.w(kVar);
                        c0031p2.u(interfaceC0714oF);
                        c0031p2.x(jL);
                        c0031p2.f394j = bVar4;
                        D().endRecording();
                        int iSave = canvasA2.save();
                        canvasA2.translate(f14, f15);
                        canvasA2.drawRenderNode(D());
                        canvasA2.restoreToCount(iSave);
                        return;
                    } catch (Throwable th) {
                        ((C0715p) bVar2.i.i).B(-f13, -f8);
                        throw th;
                    }
                } catch (Throwable th2) {
                    c0701b.i();
                    C0031p0 c0031p3 = bVar2.i;
                    c0031p3.v(bVar3);
                    c0031p3.w(kVar);
                    c0031p3.u(interfaceC0714oF);
                    c0031p3.x(jL);
                    c0031p3.f394j = bVar4;
                    throw th2;
                }
        }
    }

    public E(C0946n c0946n, F f6, k0 k0Var) {
        this.f12229d = c0946n;
        this.f12230e = f6;
        this.f12231f = k0Var;
    }
}
