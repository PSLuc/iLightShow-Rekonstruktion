package p130y0;

import E4.k;
import S1.V;
import S1.h0;
import android.graphics.Outline;
import android.graphics.Path;
import p020d2.n;
import p030f0.a;
import p030f0.c;
import p030f0.d;
import p030f0.e;
import p030f0.f;
import p035g0.B;
import p035g0.C;
import p035g0.C0706g;
import p035g0.D;
import p035g0.E;
import p035g0.F;
import p035g0.H;
import p035g0.InterfaceC0714o;

/* JADX INFO: renamed from: y0.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1155s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Outline f14522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public E f14523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0706g f14524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public F f14525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public F f14528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f14529h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f14530j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f14531k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f14532l;

    public C1155s0() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f14522a = outline;
        this.f14530j = 0L;
        this.f14531k = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b0  */
    public final void a(InterfaceC0714o interfaceC0714o) {
        d();
        F f6 = this.f14525d;
        if (f6 != null) {
            interfaceC0714o.c(f6);
            return;
        }
        float f7 = this.i;
        if (f7 <= 0.0f) {
            interfaceC0714o.f(c.d(this.f14530j), c.e(this.f14530j), f.d(this.f14531k) + c.d(this.f14530j), c.e(this.f14530j) + f.b(this.f14531k), 1);
            return;
        }
        F fH = this.f14528g;
        e eVar = this.f14529h;
        if (fH != null) {
            long j4 = this.f14530j;
            long j6 = this.f14531k;
            if (eVar == null || !V.E(eVar)) {
                float fD = c.d(this.f14530j);
                float fE = c.e(this.f14530j);
                float fD2 = f.d(this.f14531k) + c.d(this.f14530j);
                float fB = f.b(this.f14531k) + c.e(this.f14530j);
                float f8 = this.i;
                long jA = n.a(f8, f8);
                long jA2 = n.a(a.b(jA), a.c(jA));
                e eVar2 = new e(fD, fE, fD2, fB, jA2, jA2, jA2, jA2);
                if (fH == null) {
                    fH = H.h();
                } else {
                    ((C0706g) fH).e();
                }
                F.b(fH, eVar2);
                this.f14529h = eVar2;
                this.f14528g = fH;
            } else {
                if (eVar.f8843a == c.d(j4)) {
                    if (eVar.f8844b == c.e(j4)) {
                        if (eVar.f8845c == f.d(j6) + c.d(j4)) {
                            if (eVar.f8846d != f.b(j6) + c.e(j4) || a.b(eVar.f8847e) != f7) {
                                float fD3 = c.d(this.f14530j);
                                float fE2 = c.e(this.f14530j);
                                float fD4 = f.d(this.f14531k) + c.d(this.f14530j);
                                float fB2 = f.b(this.f14531k) + c.e(this.f14530j);
                                float f9 = this.i;
                                long jA3 = n.a(f9, f9);
                                long jA4 = n.a(a.b(jA3), a.c(jA3));
                                e eVar3 = new e(fD3, fE2, fD4, fB2, jA4, jA4, jA4, jA4);
                                if (fH == null) {
                                    fH = H.h();
                                } else {
                                    ((C0706g) fH).e();
                                }
                                F.b(fH, eVar3);
                                this.f14529h = eVar3;
                                this.f14528g = fH;
                            }
                        } else {
                            float fD5 = c.d(this.f14530j);
                            float fE3 = c.e(this.f14530j);
                            float fD6 = f.d(this.f14531k) + c.d(this.f14530j);
                            float fB3 = f.b(this.f14531k) + c.e(this.f14530j);
                            float f10 = this.i;
                            long jA5 = n.a(f10, f10);
                            long jA6 = n.a(a.b(jA5), a.c(jA5));
                            e eVar4 = new e(fD5, fE3, fD6, fB3, jA6, jA6, jA6, jA6);
                            if (fH == null) {
                                fH = H.h();
                            } else {
                                ((C0706g) fH).e();
                            }
                            F.b(fH, eVar4);
                            this.f14529h = eVar4;
                            this.f14528g = fH;
                        }
                    } else {
                        float fD7 = c.d(this.f14530j);
                        float fE4 = c.e(this.f14530j);
                        float fD8 = f.d(this.f14531k) + c.d(this.f14530j);
                        float fB4 = f.b(this.f14531k) + c.e(this.f14530j);
                        float f11 = this.i;
                        long jA7 = n.a(f11, f11);
                        long jA8 = n.a(a.b(jA7), a.c(jA7));
                        e eVar5 = new e(fD7, fE4, fD8, fB4, jA8, jA8, jA8, jA8);
                        if (fH == null) {
                            fH = H.h();
                        } else {
                            ((C0706g) fH).e();
                        }
                        F.b(fH, eVar5);
                        this.f14529h = eVar5;
                        this.f14528g = fH;
                    }
                } else {
                    float fD9 = c.d(this.f14530j);
                    float fE5 = c.e(this.f14530j);
                    float fD10 = f.d(this.f14531k) + c.d(this.f14530j);
                    float fB5 = f.b(this.f14531k) + c.e(this.f14530j);
                    float f12 = this.i;
                    long jA9 = n.a(f12, f12);
                    long jA10 = n.a(a.b(jA9), a.c(jA9));
                    e eVar6 = new e(fD9, fE5, fD10, fB5, jA10, jA10, jA10, jA10);
                    if (fH == null) {
                        fH = H.h();
                    } else {
                        ((C0706g) fH).e();
                    }
                    F.b(fH, eVar6);
                    this.f14529h = eVar6;
                    this.f14528g = fH;
                }
            }
        } else {
            float fD11 = c.d(this.f14530j);
            float fE6 = c.e(this.f14530j);
            float fD12 = f.d(this.f14531k) + c.d(this.f14530j);
            float fB6 = f.b(this.f14531k) + c.e(this.f14530j);
            float f13 = this.i;
            long jA11 = n.a(f13, f13);
            long jA12 = n.a(a.b(jA11), a.c(jA11));
            e eVar7 = new e(fD11, fE6, fD12, fB6, jA12, jA12, jA12, jA12);
            if (fH == null) {
                fH = H.h();
            } else {
                ((C0706g) fH).e();
            }
            F.b(fH, eVar7);
            this.f14529h = eVar7;
            this.f14528g = fH;
        }
        interfaceC0714o.c(fH);
    }

    public final Outline b() {
        d();
        if (this.f14532l) {
            return this.f14522a;
        }
        return null;
    }

    public final boolean c(E e6, float f6, boolean z5, float f7, long j4) {
        this.f14522a.setAlpha(f6);
        boolean zA = k.a(this.f14523b, e6);
        boolean z6 = !zA;
        if (!zA) {
            this.f14523b = e6;
            this.f14526e = true;
        }
        this.f14531k = j4;
        boolean z7 = e6 != null && (z5 || f7 > 0.0f);
        if (this.f14532l != z7) {
            this.f14532l = z7;
            this.f14526e = true;
        }
        return z6;
    }

    public final void d() {
        if (this.f14526e) {
            this.f14530j = 0L;
            this.i = 0.0f;
            this.f14525d = null;
            this.f14526e = false;
            this.f14527f = false;
            E e6 = this.f14523b;
            Outline outline = this.f14522a;
            if (e6 == null || !this.f14532l || f.d(this.f14531k) <= 0.0f || f.b(this.f14531k) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            if (e6 instanceof C) {
                d dVar = ((C) e6).f9010a;
                float f6 = dVar.f8839a;
                float f7 = dVar.f8840b;
                this.f14530j = p081p0.c.y(f6, f7);
                this.f14531k = h0.f(dVar.c(), dVar.b());
                outline.setRect(Math.round(f6), Math.round(f7), Math.round(dVar.f8841c), Math.round(dVar.f8842d));
                return;
            }
            if (!(e6 instanceof D)) {
                if (e6 instanceof B) {
                    e(((B) e6).f9009a);
                    return;
                }
                return;
            }
            e eVar = ((D) e6).f9011a;
            float fB = a.b(eVar.f8847e);
            float f8 = eVar.f8843a;
            float f9 = eVar.f8844b;
            this.f14530j = p081p0.c.y(f8, f9);
            this.f14531k = h0.f(eVar.b(), eVar.a());
            if (V.E(eVar)) {
                this.f14522a.setRoundRect(Math.round(f8), Math.round(f9), Math.round(eVar.f8845c), Math.round(eVar.f8846d), fB);
                this.i = fB;
                return;
            }
            C0706g c0706gH = this.f14524c;
            if (c0706gH == null) {
                c0706gH = H.h();
                this.f14524c = c0706gH;
            }
            c0706gH.e();
            F.b(c0706gH, eVar);
            e(c0706gH);
        }
    }

    public final void e(F f6) {
        if (!(f6 instanceof C0706g)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((C0706g) f6).f9063a;
        Outline outline = this.f14522a;
        outline.setConvexPath(path);
        this.f14527f = !outline.canClip();
        this.f14525d = f6;
    }
}
