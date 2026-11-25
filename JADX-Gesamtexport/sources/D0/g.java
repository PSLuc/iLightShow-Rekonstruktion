package D0;

import B.AbstractC0013g0;
import D.t;
import N.C0208d;
import P4.AbstractC0336x;
import P4.e0;
import P4.i0;
import S1.V;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;
import p035g0.AbstractC0702c;
import p035g0.C0701b;
import p035g0.H;
import p084p4.x;
import p124x0.Y;

/* JADX INFO: loaded from: classes.dex */
public final class g implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E0.l f737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S0.i f738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final U4.d f740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f741e;

    public g(E0.l lVar, S0.i iVar, U4.d dVar, l lVar2) {
        this.f737a = lVar;
        this.f738b = iVar;
        this.f739c = lVar2;
        this.f740d = new U4.d(dVar.f5349h.o(h.f742h));
        this.f741e = new j(iVar.f4895d - iVar.f4893b, new f(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:54:0x0130  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(g gVar, ScrollCaptureSession scrollCaptureSession, S0.i iVar, p122w4.c cVar) {
        d dVar;
        int i;
        int i3;
        g gVar2;
        ScrollCaptureSession scrollCaptureSessionC;
        int i6;
        int i7;
        int iO;
        int iO2;
        int i8;
        Y yC;
        Canvas canvasLockHardwareCanvas;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i9 = dVar.f730r;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                dVar.f730r = i9 - Integer.MIN_VALUE;
            } else {
                dVar = new d(gVar, cVar);
            }
        } else {
            dVar = new d(gVar, cVar);
        }
        Object obj = dVar.f728p;
        v4.a aVar = v4.a.f13292h;
        int i10 = dVar.f730r;
        if (i10 == 0) {
            V.O(obj);
            i = iVar.f4893b;
            j jVar = gVar.f741e;
            dVar.f723k = gVar;
            dVar.f724l = scrollCaptureSession;
            dVar.f725m = iVar;
            dVar.f726n = i;
            i3 = iVar.f4895d;
            dVar.f727o = i3;
            dVar.f730r = 1;
            if (i > i3) {
                jVar.getClass();
                throw new IllegalArgumentException(("Expected min=" + i + " ≤ max=" + i3).toString());
            }
            int i11 = i3 - i;
            int i12 = jVar.f747a;
            if (i11 > i12) {
                throw new IllegalArgumentException(AbstractC0013g0.g("Expected range (", i11, i12, ") to be ≤ viewportSize=").toString());
            }
            float f6 = i;
            float f7 = jVar.f748b;
            Object obj2 = x.f10867a;
            if (f6 < f7 || i3 > i12 + f7) {
                Object objB = jVar.b((f6 < f7 ? i : i3 - i12) - f7, dVar);
                if (objB != aVar) {
                    objB = obj2;
                }
                if (objB == aVar) {
                    obj2 = objB;
                }
            }
            if (obj2 != aVar) {
            }
            return aVar;
        }
        if (i10 == 1) {
            int i13 = dVar.f727o;
            int i14 = dVar.f726n;
            iVar = dVar.f725m;
            ScrollCaptureSession scrollCaptureSessionC2 = a.c(dVar.f724l);
            g gVar3 = dVar.f723k;
            V.O(obj);
            i3 = i13;
            i = i14;
            scrollCaptureSession = scrollCaptureSessionC2;
            gVar = gVar3;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i7 = dVar.f727o;
            i6 = dVar.f726n;
            iVar = dVar.f725m;
            scrollCaptureSessionC = a.c(dVar.f724l);
            gVar2 = dVar.f723k;
            V.O(obj);
        }
        j jVar2 = gVar2.f741e;
        iO = p081p0.c.O(i6 - G4.a.D(jVar2.f748b), 0, jVar2.f747a);
        j jVar3 = gVar2.f741e;
        iO2 = p081p0.c.O(i7 - G4.a.D(jVar3.f748b), 0, jVar3.f747a);
        i8 = iVar.f4892a;
        if (iO == iO2) {
            return S0.i.f4891e;
        }
        yC = gVar2.f737a.c();
        if (yC != null) {
            throw new IllegalStateException("Could not find coordinator for semantics node.");
        }
        canvasLockHardwareCanvas = scrollCaptureSessionC.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.drawColor(0, BlendMode.CLEAR);
            Canvas canvas = AbstractC0702c.f9059a;
            C0701b c0701b = new C0701b();
            c0701b.f9056a = canvasLockHardwareCanvas;
            c0701b.g(-i8, -iO);
            yC.E0(c0701b, null);
            int iD = G4.a.D(gVar2.f741e.f748b);
            return new S0.i(i8, iO + iD, iVar.f4894c, iO2 + iD);
        } finally {
            scrollCaptureSessionC.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        e eVar = e.i;
        dVar.f723k = gVar;
        dVar.f724l = scrollCaptureSession;
        dVar.f725m = iVar;
        dVar.f726n = i;
        dVar.f727o = i3;
        dVar.f730r = 2;
        p111u4.i iVar2 = dVar.i;
        E4.k.c(iVar2);
        if (C0208d.F(iVar2).C(eVar, dVar) != aVar) {
            gVar2 = gVar;
            scrollCaptureSessionC = scrollCaptureSession;
            i6 = i;
            i7 = i3;
            j jVar4 = gVar2.f741e;
            iO = p081p0.c.O(i6 - G4.a.D(jVar4.f748b), 0, jVar4.f747a);
            j jVar5 = gVar2.f741e;
            iO2 = p081p0.c.O(i7 - G4.a.D(jVar5.f748b), 0, jVar5.f747a);
            i8 = iVar.f4892a;
            if (iO == iO2) {
                return S0.i.f4891e;
            }
            yC = gVar2.f737a.c();
            if (yC != null) {
                throw new IllegalStateException("Could not find coordinator for semantics node.");
            }
            canvasLockHardwareCanvas = scrollCaptureSessionC.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.drawColor(0, BlendMode.CLEAR);
            Canvas canvas2 = AbstractC0702c.f9059a;
            C0701b c0701b2 = new C0701b();
            c0701b2.f9056a = canvasLockHardwareCanvas;
            c0701b2.g(-i8, -iO);
            yC.E0(c0701b2, null);
            int iD2 = G4.a.D(gVar2.f741e.f748b);
            return new S0.i(i8, iO + iD2, iVar.f4894c, iO2 + iD2);
        }
        return aVar;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        AbstractC0336x.o(this.f740d, e0.i, new b(this, runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        i0 i0VarO = AbstractC0336x.o(this.f740d, null, new c(this, scrollCaptureSession, rect, consumer, null), 3);
        i0VarO.Q(new A2.e(6, cancellationSignal));
        cancellationSignal.setOnCancelListener(new t(1, i0VarO));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(H.s(this.f738b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f741e.f748b = 0.0f;
        l lVar = this.f739c;
        lVar.f751a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
