package p048j0;

import B.C0031p0;
import E4.l;
import K.y;
import O1.u;
import S0.k;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import p015c2.AbstractC0473d;
import p020d2.n;
import p030f0.a;
import p030f0.d;
import p030f0.e;
import p030f0.f;
import p035g0.B;
import p035g0.C;
import p035g0.C0701b;
import p035g0.C0706g;
import p035g0.C0715p;
import p035g0.D;
import p035g0.E;
import p044i0.c;
import p080p.A;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f9658a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Outline f9662e;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public E f9666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0706g f9667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0706g f9668l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9669m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u f9670n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9671o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9673q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f9674r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f9675s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f9676t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public S0.b f9659b = c.f9388a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f9660c = k.f4897h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f9661d = a.f9657h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9663f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f9664g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f9665h = 9205357640488583168L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f9672p = new y();

    public b(c cVar) {
        this.f9658a = cVar;
        cVar.c(false);
        this.f9674r = 0L;
        this.f9675s = 0L;
        this.f9676t = 9205357640488583168L;
    }

    public final void a() {
        if (this.f9663f) {
            c cVar = this.f9658a;
            boolean z5 = cVar.f9691p;
            RenderNode renderNode = cVar.f9679c;
            if (z5 || cVar.f9686k > 0.0f) {
                C0706g c0706g = this.f9667k;
                if (c0706g != null) {
                    Outline outline = this.f9662e;
                    if (outline == null) {
                        outline = new Outline();
                        this.f9662e = outline;
                    }
                    if (Build.VERSION.SDK_INT > 30) {
                        d.f9695a.a(outline, c0706g);
                    } else {
                        outline.setConvexPath(c0706g.f9063a);
                    }
                    this.f9669m = !outline.canClip();
                    this.f9667k = c0706g;
                    outline.setAlpha(cVar.f9683g);
                    renderNode.setOutline(outline);
                    cVar.f9682f = true;
                    cVar.a();
                } else {
                    Outline outline2 = this.f9662e;
                    if (outline2 == null) {
                        outline2 = new Outline();
                        this.f9662e = outline2;
                    }
                    Outline outline3 = outline2;
                    long jU = AbstractC0473d.U(this.f9675s);
                    long j4 = this.f9664g;
                    long j6 = this.f9665h;
                    if (j6 != 9205357640488583168L) {
                        jU = j6;
                    }
                    outline3.setRoundRect(Math.round(p030f0.c.d(j4)), Math.round(p030f0.c.e(j4)), Math.round(f.d(jU) + p030f0.c.d(j4)), Math.round(f.b(jU) + p030f0.c.e(j4)), this.i);
                    outline3.setAlpha(cVar.f9683g);
                    renderNode.setOutline(outline3);
                    cVar.f9682f = true;
                    cVar.a();
                }
            } else {
                renderNode.setOutline(null);
                cVar.f9682f = false;
                cVar.a();
            }
        }
        this.f9663f = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:0: B:14:0x002d->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:0: B:14:0x002d->B:24:0x006a], SYNTHETIC] */
    public final void b() {
        if (this.f9673q && this.f9671o == 0) {
            y yVar = this.f9672p;
            b bVar = (b) yVar.f2032c;
            if (bVar != null) {
                bVar.f9671o--;
                bVar.b();
                yVar.f2032c = null;
            }
            A a6 = (A) yVar.f2030a;
            if (a6 != null) {
                Object[] objArr = a6.f10709b;
                long[] jArr = a6.f10708a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j4 = jArr[i];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i3 = 8 - ((~(i - length)) >>> 31);
                            for (int i6 = 0; i6 < i3; i6++) {
                                if ((255 & j4) < 128) {
                                    b bVar2 = (b) objArr[(i << 3) + i6];
                                    bVar2.f9671o--;
                                    bVar2.b();
                                }
                                j4 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                a6.b();
            }
            this.f9658a.f9679c.discardDisplayList();
        }
    }

    public final E c() {
        E c6;
        E e6 = this.f9666j;
        C0706g c0706g = this.f9667k;
        if (e6 != null) {
            return e6;
        }
        if (c0706g != null) {
            B b6 = new B(c0706g);
            this.f9666j = b6;
            return b6;
        }
        long jU = AbstractC0473d.U(this.f9675s);
        long j4 = this.f9664g;
        long j6 = this.f9665h;
        if (j6 != 9205357640488583168L) {
            jU = j6;
        }
        float fD = p030f0.c.d(j4);
        float fE = p030f0.c.e(j4);
        float fD2 = f.d(jU) + fD;
        float fB = f.b(jU) + fE;
        float f6 = this.i;
        if (f6 > 0.0f) {
            long jA = n.a(f6, f6);
            long jA2 = n.a(a.b(jA), a.c(jA));
            c6 = new D(new e(fD, fE, fD2, fB, jA2, jA2, jA2, jA2));
        } else {
            c6 = new C(new d(fD, fE, fD2, fB));
        }
        this.f9666j = c6;
        return c6;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c8 A[LOOP:0: B:22:0x008c->B:32:0x00c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca A[EDGE_INSN: B:41:0x00ca->B:33:0x00ca BREAK  A[LOOP:0: B:22:0x008c->B:32:0x00c8], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [D4.c, E4.l] */
    public final void d() {
        y yVar = this.f9672p;
        yVar.f2033d = (b) yVar.f2032c;
        A a6 = (A) yVar.f2030a;
        if (a6 != null && a6.h()) {
            A a7 = (A) yVar.f2034e;
            if (a7 == null) {
                int i = p080p.D.f10715a;
                a7 = new A();
                yVar.f2034e = a7;
            }
            a7.i(a6);
            a6.b();
        }
        yVar.f2031b = true;
        S0.b bVar = this.f9659b;
        k kVar = this.f9660c;
        ?? r6 = this.f9661d;
        c cVar = this.f9658a;
        p044i0.b bVar2 = cVar.f9678b;
        RenderNode renderNode = cVar.f9679c;
        RecordingCanvas recordingCanvasBeginRecording = renderNode.beginRecording();
        try {
            C0715p c0715p = cVar.f9677a;
            C0701b c0701b = (C0701b) c0715p.i;
            Canvas canvas = c0701b.f9056a;
            c0701b.f9056a = recordingCanvasBeginRecording;
            C0031p0 c0031p0 = bVar2.i;
            c0031p0.v(bVar);
            c0031p0.w(kVar);
            c0031p0.f394j = this;
            c0031p0.x(cVar.f9680d);
            c0031p0.u(c0701b);
            r6.invoke(bVar2);
            ((C0701b) c0715p.i).f9056a = canvas;
            renderNode.endRecording();
            yVar.f2031b = false;
            b bVar3 = (b) yVar.f2033d;
            if (bVar3 != null) {
                bVar3.f9671o--;
                bVar3.b();
            }
            A a8 = (A) yVar.f2034e;
            if (a8 == null || !a8.h()) {
                return;
            }
            Object[] objArr = a8.f10709b;
            long[] jArr = a8.f10708a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j4 = jArr[i3];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        int i6 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((255 & j4) < 128) {
                                b bVar4 = (b) objArr[(i3 << 3) + i7];
                                bVar4.f9671o--;
                                bVar4.b();
                            }
                            j4 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        } else if (i3 != length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
            a8.b();
        } catch (Throwable th) {
            renderNode.endRecording();
            throw th;
        }
    }

    public final void e(long j4, long j6, float f6) {
        if (p030f0.c.b(this.f9664g, j4) && f.a(this.f9665h, j6) && this.i == f6 && this.f9667k == null) {
            return;
        }
        this.f9666j = null;
        this.f9667k = null;
        this.f9663f = true;
        this.f9669m = false;
        this.f9664g = j4;
        this.f9665h = j6;
        this.i = f6;
        a();
    }
}
