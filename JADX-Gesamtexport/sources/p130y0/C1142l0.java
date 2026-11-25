package p130y0;

import B.C0003b0;
import B.C0031p0;
import K.y;
import O1.u;
import S0.c;
import S0.h;
import S0.j;
import S0.k;
import S1.h0;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;
import android.os.Build;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import okhttp3.internal.http2.Http2;
import p015c2.AbstractC0473d;
import p030f0.a;
import p030f0.d;
import p030f0.e;
import p035g0.A;
import p035g0.AbstractC0702c;
import p035g0.B;
import p035g0.C;
import p035g0.C0706g;
import p035g0.D;
import p035g0.E;
import p035g0.F;
import p035g0.H;
import p035g0.InterfaceC0714o;
import p035g0.J;
import p035g0.P;
import p035g0.r;
import p035g0.w;
import p048j0.b;
import p058l0.I;
import p090r.v;
import p124x0.e0;

/* JADX INFO: renamed from: y0.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1142l0 implements e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f14411h;
    public final w i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r f14412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0003b0 f14413k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public I f14414l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14416n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float[] f14418p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14419q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14423u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public E f14425w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C0706g f14426x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public u f14427y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f14428z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f14415m = AbstractC0473d.b(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float[] f14417o = A.a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public S0.b f14420r = new c(1.0f, 1.0f);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k f14421s = k.f4897h;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p044i0.b f14422t = new p044i0.b();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f14424v = P.f9051b;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final v f14410A = new v(17, this);

    public C1142l0(b bVar, w wVar, r rVar, C0003b0 c0003b0, I i) {
        this.f14411h = bVar;
        this.i = wVar;
        this.f14412j = rVar;
        this.f14413k = c0003b0;
        this.f14414l = i;
    }

    @Override // p124x0.e0
    public final long a(long j4, boolean z5) {
        if (!z5) {
            return A.b(j4, m());
        }
        float[] fArrL = l();
        if (fArrL != null) {
            return A.b(j4, fArrL);
        }
        return 9187343241974906880L;
    }

    @Override // p124x0.e0
    public final void b(long j4) {
        if (j.a(j4, this.f14415m)) {
            return;
        }
        this.f14415m = j4;
        if (this.f14419q || this.f14416n) {
            return;
        }
        r rVar = this.f14412j;
        rVar.invalidate();
        if (true != this.f14419q) {
            this.f14419q = true;
            rVar.r(this, true);
        }
    }

    @Override // p124x0.e0
    public final void c(float[] fArr) {
        A.g(fArr, m());
    }

    @Override // p124x0.e0
    public final void d(InterfaceC0714o interfaceC0714o, b bVar) {
        float f6;
        boolean z5;
        float f7;
        Canvas canvasA = AbstractC0702c.a(interfaceC0714o);
        if (!canvasA.isHardwareAccelerated()) {
            b bVar2 = this.f14411h;
            long j4 = bVar2.f9674r;
            float f8 = (int) (j4 >> 32);
            float f9 = (int) (j4 & 4294967295L);
            long j6 = this.f14415m;
            float f10 = ((int) (j6 >> 32)) + f8;
            float f11 = ((int) (j6 & 4294967295L)) + f9;
            if (bVar2.f9658a.f9683g < 1.0f) {
                u uVarG = this.f14427y;
                if (uVarG == null) {
                    uVarG = H.g();
                    this.f14427y = uVarG;
                }
                uVarG.l(this.f14411h.f9658a.f9683g);
                Paint paint = (Paint) uVarG.f4534b;
                f6 = f8;
                canvasA.saveLayer(f6, f9, f10, f11, paint);
            } else {
                f6 = f8;
                interfaceC0714o.l();
            }
            interfaceC0714o.g(f6, f9);
            interfaceC0714o.q(m());
            b bVar3 = this.f14411h;
            boolean z6 = bVar3.f9658a.f9691p;
            if (z6 && z6) {
                E eC = bVar3.c();
                if (eC instanceof C) {
                    InterfaceC0714o.t(interfaceC0714o, ((C) eC).f9010a);
                } else if (eC instanceof D) {
                    C0706g c0706gH = this.f14426x;
                    if (c0706gH == null) {
                        c0706gH = H.h();
                        this.f14426x = c0706gH;
                    }
                    c0706gH.e();
                    F.b(c0706gH, ((D) eC).f9011a);
                    interfaceC0714o.c(c0706gH);
                } else if (eC instanceof B) {
                    interfaceC0714o.c(((B) eC).f9009a);
                }
            }
            C0003b0 c0003b0 = this.f14413k;
            if (c0003b0 != null) {
                c0003b0.d(interfaceC0714o, null);
            }
            interfaceC0714o.i();
            return;
        }
        i();
        this.f14428z = this.f14411h.f9658a.f9686k > 0.0f;
        p044i0.b bVar4 = this.f14422t;
        C0031p0 c0031p0 = bVar4.i;
        c0031p0.u(interfaceC0714o);
        c0031p0.f394j = bVar;
        b bVar5 = this.f14411h;
        C0031p0 c0031p1 = bVar4.i;
        InterfaceC0714o interfaceC0714oF = c0031p1.f();
        b bVar6 = (b) c0031p1.f394j;
        if (bVar5.f9673q) {
            return;
        }
        p048j0.c cVar = bVar5.f9658a;
        RenderNode renderNode = cVar.f9679c;
        if (!renderNode.hasDisplayList()) {
            try {
                bVar5.d();
            } catch (Throwable unused) {
            }
        }
        bVar5.a();
        boolean z7 = cVar.f9686k > 0.0f;
        if (z7) {
            interfaceC0714oF.r();
        }
        Canvas canvasA2 = AbstractC0702c.a(interfaceC0714oF);
        boolean zIsHardwareAccelerated = canvasA2.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            canvasA2.save();
            long j7 = bVar5.f9674r;
            float f12 = (int) (j7 >> 32);
            float f13 = (int) (j7 & 4294967295L);
            long j8 = bVar5.f9675s;
            float f14 = ((int) (j8 >> 32)) + f12;
            float f15 = f13 + ((int) (j8 & 4294967295L));
            float f16 = cVar.f9683g;
            int i = cVar.f9684h;
            if (f16 < 1.0f || i != 3 || cVar.f9694s == 1) {
                u uVarG2 = bVar5.f9670n;
                if (uVarG2 == null) {
                    uVarG2 = H.g();
                    bVar5.f9670n = uVarG2;
                }
                uVarG2.l(f16);
                uVarG2.m(i);
                uVarG2.o(null);
                f7 = f12;
                canvasA2.saveLayer(f7, f13, f14, f15, (Paint) uVarG2.f4534b);
            } else {
                canvasA2.save();
                f7 = f12;
            }
            canvasA2.translate(f7, f13);
            Matrix matrix = cVar.f9681e;
            if (matrix == null) {
                matrix = new Matrix();
                cVar.f9681e = matrix;
            }
            renderNode.getMatrix(matrix);
            canvasA2.concat(matrix);
        }
        boolean z8 = bVar5.f9669m || (!zIsHardwareAccelerated && cVar.f9691p);
        if (z8) {
            interfaceC0714oF.l();
            E eC2 = bVar5.c();
            if (eC2 instanceof C) {
                InterfaceC0714o.t(interfaceC0714oF, eC2.a());
            } else if (eC2 instanceof D) {
                C0706g c0706gH2 = bVar5.f9668l;
                if (c0706gH2 != null) {
                    c0706gH2.f9063a.rewind();
                } else {
                    c0706gH2 = H.h();
                    bVar5.f9668l = c0706gH2;
                }
                F.b(c0706gH2, ((D) eC2).f9011a);
                interfaceC0714oF.c(c0706gH2);
            } else if (eC2 instanceof B) {
                interfaceC0714oF.c(((B) eC2).f9009a);
            }
        }
        if (bVar6 != null) {
            y yVar = bVar6.f9672p;
            if (!yVar.f2031b) {
                H.q("Only add dependencies during a tracking");
                throw null;
            }
            p080p.A a6 = (p080p.A) yVar.f2030a;
            if (a6 != null) {
                a6.a(bVar5);
            } else if (((b) yVar.f2032c) != null) {
                int i3 = p080p.D.f10715a;
                p080p.A a7 = new p080p.A();
                b bVar7 = (b) yVar.f2032c;
                E4.k.c(bVar7);
                a7.a(bVar7);
                a7.a(bVar5);
                yVar.f2030a = a7;
                yVar.f2032c = null;
            } else {
                yVar.f2032c = bVar5;
            }
            p080p.A a8 = (p080p.A) yVar.f2034e;
            if (a8 != null) {
                z5 = !a8.j(bVar5);
            } else if (((b) yVar.f2033d) != bVar5) {
                z5 = true;
            } else {
                yVar.f2033d = null;
                z5 = false;
            }
            if (z5) {
                bVar5.f9671o++;
            }
        }
        AbstractC0702c.a(interfaceC0714oF).drawRenderNode(renderNode);
        if (z8) {
            interfaceC0714oF.i();
        }
        if (z7) {
            interfaceC0714oF.n();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasA2.restore();
    }

    @Override // p124x0.e0
    public final void destroy() {
        this.f14413k = null;
        this.f14414l = null;
        this.f14416n = true;
        boolean z5 = this.f14419q;
        r rVar = this.f14412j;
        if (z5) {
            this.f14419q = false;
            rVar.r(this, false);
        }
        w wVar = this.i;
        if (wVar != null) {
            wVar.j(this.f14411h);
            rVar.z(this);
        }
    }

    @Override // p124x0.e0
    public final void e(C0003b0 c0003b0, I i) {
        w wVar = this.i;
        if (wVar == null) {
            throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.f14411h.f9673q) {
            throw new IllegalArgumentException("layer should have been released before reuse");
        }
        this.f14411h = wVar.k();
        this.f14416n = false;
        this.f14413k = c0003b0;
        this.f14414l = i;
        this.f14424v = P.f9051b;
        this.f14428z = false;
        this.f14415m = AbstractC0473d.b(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f14425w = null;
        this.f14423u = 0;
    }

    @Override // p124x0.e0
    public final void f(float[] fArr) {
        float[] fArrL = l();
        if (fArrL != null) {
            A.g(fArr, fArrL);
        }
    }

    @Override // p124x0.e0
    public final void g(p030f0.b bVar, boolean z5) {
        if (!z5) {
            A.c(m(), bVar);
            return;
        }
        float[] fArrL = l();
        if (fArrL != null) {
            A.c(fArrL, bVar);
            return;
        }
        bVar.f8833a = 0.0f;
        bVar.f8834b = 0.0f;
        bVar.f8835c = 0.0f;
        bVar.f8836d = 0.0f;
    }

    @Override // p124x0.e0
    public final void h(long j4) {
        b bVar = this.f14411h;
        if (!h.a(bVar.f9674r, j4)) {
            bVar.f9674r = j4;
            long j6 = bVar.f9675s;
            int i = (int) (j4 >> 32);
            int i3 = (int) (j4 & 4294967295L);
            p048j0.c cVar = bVar.f9658a;
            RenderNode renderNode = cVar.f9679c;
            renderNode.setPosition(i, i3, ((int) (j6 >> 32)) + i, ((int) (4294967295L & j6)) + i3);
            cVar.f9680d = AbstractC0473d.U(j6);
        }
        c1.f14381a.a(this.f14412j);
    }

    @Override // p124x0.e0
    public final void i() {
        if (this.f14419q) {
            if (!P.a(this.f14424v, P.f9051b) && !j.a(this.f14411h.f9675s, this.f14415m)) {
                b bVar = this.f14411h;
                long jY = p081p0.c.y(P.b(this.f14424v) * ((int) (this.f14415m >> 32)), P.c(this.f14424v) * ((int) (this.f14415m & 4294967295L)));
                if (!p030f0.c.b(bVar.f9676t, jY)) {
                    bVar.f9676t = jY;
                    p048j0.c cVar = bVar.f9658a;
                    boolean zT0 = p081p0.c.t0(jY);
                    RenderNode renderNode = cVar.f9679c;
                    if (zT0) {
                        renderNode.resetPivot();
                    } else {
                        renderNode.setPivotX(p030f0.c.d(jY));
                        renderNode.setPivotY(p030f0.c.e(jY));
                    }
                }
            }
            b bVar2 = this.f14411h;
            S0.b bVar3 = this.f14420r;
            k kVar = this.f14421s;
            long j4 = this.f14415m;
            if (!j.a(bVar2.f9675s, j4)) {
                bVar2.f9675s = j4;
                long j6 = bVar2.f9674r;
                int i = (int) (j6 >> 32);
                int i3 = (int) (j6 & 4294967295L);
                p048j0.c cVar2 = bVar2.f9658a;
                cVar2.f9679c.setPosition(i, i3, ((int) (j4 >> 32)) + i, ((int) (4294967295L & j4)) + i3);
                cVar2.f9680d = AbstractC0473d.U(j4);
                if (bVar2.f9665h == 9205357640488583168L) {
                    bVar2.f9663f = true;
                    bVar2.a();
                }
            }
            bVar2.f9659b = bVar3;
            bVar2.f9660c = kVar;
            bVar2.f9661d = this.f14410A;
            bVar2.d();
            if (this.f14419q) {
                this.f14419q = false;
                this.f14412j.r(this, false);
            }
        }
    }

    @Override // p124x0.e0
    public final void invalidate() {
        if (this.f14419q || this.f14416n) {
            return;
        }
        r rVar = this.f14412j;
        rVar.invalidate();
        if (true != this.f14419q) {
            this.f14419q = true;
            rVar.r(this, true);
        }
    }

    @Override // p124x0.e0
    public final void j(J j4) {
        I i;
        I i3;
        int i6 = j4.f9017h | this.f14423u;
        this.f14421s = j4.f9030v;
        this.f14420r = j4.f9029u;
        int i7 = i6 & 4096;
        if (i7 != 0) {
            this.f14424v = j4.f9025q;
        }
        if ((i6 & 1) != 0) {
            b bVar = this.f14411h;
            float f6 = j4.i;
            p048j0.c cVar = bVar.f9658a;
            if (cVar.i != f6) {
                cVar.i = f6;
                cVar.f9679c.setScaleX(f6);
            }
        }
        if ((i6 & 2) != 0) {
            b bVar2 = this.f14411h;
            float f7 = j4.f9018j;
            p048j0.c cVar2 = bVar2.f9658a;
            if (cVar2.f9685j != f7) {
                cVar2.f9685j = f7;
                cVar2.f9679c.setScaleY(f7);
            }
        }
        if ((i6 & 4) != 0) {
            b bVar3 = this.f14411h;
            float f8 = j4.f9019k;
            p048j0.c cVar3 = bVar3.f9658a;
            if (cVar3.f9683g != f8) {
                cVar3.f9683g = f8;
                cVar3.f9679c.setAlpha(f8);
            }
        }
        if ((i6 & 8) != 0) {
            p048j0.c cVar4 = this.f14411h.f9658a;
        }
        if ((i6 & 16) != 0) {
            p048j0.c cVar5 = this.f14411h.f9658a;
        }
        boolean z5 = false;
        if ((i6 & 32) != 0) {
            b bVar4 = this.f14411h;
            float f9 = j4.f9020l;
            p048j0.c cVar6 = bVar4.f9658a;
            if (cVar6.f9686k != f9) {
                cVar6.f9686k = f9;
                cVar6.f9679c.setElevation(f9);
                cVar6.c(cVar6.f9691p || f9 > 0.0f);
                bVar4.f9663f = true;
                bVar4.a();
            }
            if (j4.f9020l > 0.0f && !this.f14428z && (i3 = this.f14414l) != null) {
                i3.invoke();
            }
        }
        if ((i6 & 64) != 0) {
            b bVar5 = this.f14411h;
            long j6 = j4.f9021m;
            p048j0.c cVar7 = bVar5.f9658a;
            if (!r.c(j6, cVar7.f9687l)) {
                cVar7.f9687l = j6;
                cVar7.f9679c.setAmbientShadowColor(H.v(j6));
            }
        }
        if ((i6 & 128) != 0) {
            b bVar6 = this.f14411h;
            long j7 = j4.f9022n;
            p048j0.c cVar8 = bVar6.f9658a;
            if (!r.c(j7, cVar8.f9688m)) {
                cVar8.f9688m = j7;
                cVar8.f9679c.setSpotShadowColor(H.v(j7));
            }
        }
        if ((i6 & 1024) != 0) {
            b bVar7 = this.f14411h;
            float f10 = j4.f9023o;
            p048j0.c cVar9 = bVar7.f9658a;
            if (cVar9.f9689n != f10) {
                cVar9.f9689n = f10;
                cVar9.f9679c.setRotationZ(f10);
            }
        }
        if ((i6 & HueLog.LogComponent.STREAMDTLS) != 0) {
            p048j0.c cVar10 = this.f14411h.f9658a;
        }
        if ((i6 & HueLog.LogComponent.APPCORE) != 0) {
            p048j0.c cVar11 = this.f14411h.f9658a;
        }
        if ((i6 & 2048) != 0) {
            b bVar8 = this.f14411h;
            float f11 = j4.f9024p;
            p048j0.c cVar12 = bVar8.f9658a;
            if (cVar12.f9690o != f11) {
                cVar12.f9690o = f11;
                cVar12.f9679c.setCameraDistance(f11);
            }
        }
        if (i7 != 0) {
            if (P.a(this.f14424v, P.f9051b)) {
                b bVar9 = this.f14411h;
                if (!p030f0.c.b(bVar9.f9676t, 9205357640488583168L)) {
                    bVar9.f9676t = 9205357640488583168L;
                    p048j0.c cVar13 = bVar9.f9658a;
                    boolean zT0 = p081p0.c.t0(9205357640488583168L);
                    RenderNode renderNode = cVar13.f9679c;
                    if (zT0) {
                        renderNode.resetPivot();
                    } else {
                        renderNode.setPivotX(p030f0.c.d(9205357640488583168L));
                        renderNode.setPivotY(p030f0.c.e(9205357640488583168L));
                    }
                }
            } else {
                b bVar10 = this.f14411h;
                long jY = p081p0.c.y(P.b(this.f14424v) * ((int) (this.f14415m >> 32)), P.c(this.f14424v) * ((int) (this.f14415m & 4294967295L)));
                if (!p030f0.c.b(bVar10.f9676t, jY)) {
                    bVar10.f9676t = jY;
                    p048j0.c cVar14 = bVar10.f9658a;
                    boolean zT1 = p081p0.c.t0(jY);
                    RenderNode renderNode2 = cVar14.f9679c;
                    if (zT1) {
                        renderNode2.resetPivot();
                    } else {
                        renderNode2.setPivotX(p030f0.c.d(jY));
                        renderNode2.setPivotY(p030f0.c.e(jY));
                    }
                }
            }
        }
        if ((i6 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            b bVar11 = this.f14411h;
            boolean z6 = j4.f9027s;
            p048j0.c cVar15 = bVar11.f9658a;
            if (cVar15.f9691p != z6) {
                cVar15.c(z6);
                bVar11.f9663f = true;
                bVar11.a();
            }
        }
        if ((131072 & i6) != 0) {
            p048j0.c cVar16 = this.f14411h.f9658a;
        }
        if ((32768 & i6) != 0) {
            p048j0.c cVar17 = this.f14411h.f9658a;
            if (cVar17.f9694s != 0) {
                cVar17.f9694s = 0;
                int i8 = cVar17.f9684h;
                RenderNode renderNode3 = cVar17.f9679c;
                if (i8 == 3) {
                    p048j0.c.b(renderNode3, 0);
                } else {
                    p048j0.c.b(renderNode3, 1);
                }
            }
        }
        if (!E4.k.a(this.f14425w, j4.f9031w)) {
            E e6 = j4.f9031w;
            this.f14425w = e6;
            if (e6 != null) {
                b bVar12 = this.f14411h;
                if (e6 instanceof C) {
                    d dVar = ((C) e6).f9010a;
                    bVar12.e(p081p0.c.y(dVar.f8839a, dVar.f8840b), h0.f(dVar.c(), dVar.b()), 0.0f);
                } else if (e6 instanceof B) {
                    bVar12.f9666j = null;
                    bVar12.f9665h = 9205357640488583168L;
                    bVar12.f9664g = 0L;
                    bVar12.i = 0.0f;
                    bVar12.f9663f = true;
                    bVar12.f9669m = false;
                    bVar12.f9667k = ((B) e6).f9009a;
                    bVar12.a();
                } else if (e6 instanceof D) {
                    D d6 = (D) e6;
                    C0706g c0706g = d6.f9012b;
                    if (c0706g != null) {
                        bVar12.f9666j = null;
                        bVar12.f9665h = 9205357640488583168L;
                        bVar12.f9664g = 0L;
                        bVar12.i = 0.0f;
                        bVar12.f9663f = true;
                        bVar12.f9669m = false;
                        bVar12.f9667k = c0706g;
                        bVar12.a();
                    } else {
                        e eVar = d6.f9011a;
                        bVar12.e(p081p0.c.y(eVar.f8843a, eVar.f8844b), h0.f(eVar.b(), eVar.a()), a.b(eVar.f8850h));
                    }
                }
                if ((e6 instanceof B) && Build.VERSION.SDK_INT < 33 && (i = this.f14414l) != null) {
                    i.invoke();
                }
            }
            z5 = true;
        }
        this.f14423u = j4.f9017h;
        if (i6 != 0 || z5) {
            c1.f14381a.a(this.f14412j);
        }
    }

    @Override // p124x0.e0
    public final boolean k(long j4) {
        float fD = p030f0.c.d(j4);
        float fE = p030f0.c.e(j4);
        b bVar = this.f14411h;
        if (bVar.f9658a.f9691p) {
            return H.u(bVar.c(), fD, fE);
        }
        return true;
    }

    public final float[] l() {
        float[] fArrM = m();
        float[] fArrA = this.f14418p;
        if (fArrA == null) {
            fArrA = A.a();
            this.f14418p = fArrA;
        }
        if (H.s(fArrM, fArrA)) {
            return fArrA;
        }
        return null;
    }

    public final float[] m() {
        b bVar = this.f14411h;
        long jN = p081p0.c.t0(bVar.f9676t) ? h0.n(AbstractC0473d.U(this.f14415m)) : bVar.f9676t;
        float[] fArr = this.f14417o;
        A.d(fArr);
        float[] fArrA = A.a();
        A.h(fArrA, -p030f0.c.d(jN), -p030f0.c.e(jN));
        A.g(fArr, fArrA);
        float[] fArrA2 = A.a();
        p048j0.c cVar = bVar.f9658a;
        A.h(fArrA2, 0.0f, 0.0f);
        double d6 = (((double) 0.0f) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d6);
        float fSin = (float) Math.sin(d6);
        float f6 = fArrA2[1];
        float f7 = fArrA2[2];
        float f8 = fArrA2[5];
        float f9 = fArrA2[6];
        float f10 = fArrA2[9];
        float f11 = fArrA2[10];
        float f12 = fArrA2[13];
        float f13 = fArrA2[14];
        fArrA2[1] = (f6 * fCos) - (f7 * fSin);
        fArrA2[2] = (f7 * fCos) + (f6 * fSin);
        fArrA2[5] = (f8 * fCos) - (f9 * fSin);
        fArrA2[6] = (f9 * fCos) + (f8 * fSin);
        fArrA2[9] = (f10 * fCos) - (f11 * fSin);
        fArrA2[10] = (f11 * fCos) + (f10 * fSin);
        fArrA2[13] = (f12 * fCos) - (f13 * fSin);
        fArrA2[14] = (f13 * fCos) + (f12 * fSin);
        float fCos2 = (float) Math.cos(d6);
        float fSin2 = (float) Math.sin(d6);
        float f14 = fArrA2[0];
        float f15 = fArrA2[2];
        float f16 = fArrA2[4];
        float f17 = fArrA2[6];
        float f18 = fArrA2[8];
        float f19 = fArrA2[10];
        float f20 = fArrA2[12];
        float f21 = fArrA2[14];
        fArrA2[0] = (f15 * fSin2) + (f14 * fCos2);
        fArrA2[2] = (f15 * fCos2) + ((-f14) * fSin2);
        fArrA2[4] = (f17 * fSin2) + (f16 * fCos2);
        fArrA2[6] = (f17 * fCos2) + ((-f16) * fSin2);
        fArrA2[8] = (f19 * fSin2) + (f18 * fCos2);
        fArrA2[10] = (f19 * fCos2) + ((-f18) * fSin2);
        fArrA2[12] = (f21 * fSin2) + (f20 * fCos2);
        fArrA2[14] = (f21 * fCos2) + ((-f20) * fSin2);
        A.e(fArrA2, cVar.f9689n);
        A.f(fArrA2, cVar.i, cVar.f9685j);
        A.g(fArr, fArrA2);
        float[] fArrA3 = A.a();
        A.h(fArrA3, p030f0.c.d(jN), p030f0.c.e(jN));
        A.g(fArr, fArrA3);
        return fArr;
    }
}
