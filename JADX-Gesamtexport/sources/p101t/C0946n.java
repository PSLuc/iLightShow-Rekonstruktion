package p101t;

import G4.a;
import N.C0208d;
import N.C0217h0;
import N.U;
import S1.h0;
import Z.l;
import Z.o;
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import p015c2.AbstractC0473d;
import p030f0.c;
import p030f0.f;
import p035g0.H;
import p084p4.x;
import p090r.v;
import p091r0.p;
import p091r0.u;
import p112v.C1017z0;

/* JADX INFO: renamed from: t.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0946n implements m0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f12378h;
    public final F i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0217h0 f12379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f12380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f12381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f12382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p f12383n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o f12384o;

    public C0946n(Context context, k0 k0Var) {
        F f6 = new F(context, H.v(k0Var.f12369a));
        this.i = f6;
        x xVar = x.f10867a;
        this.f12379j = C0208d.K(xVar, U.f3670j);
        this.f12380k = true;
        this.f12382m = 0L;
        this.f12384o = u.a(l.f5957a, xVar, new C0945m(this, null)).k(Build.VERSION.SDK_INT >= 31 ? new E(this, f6) : new E(this, f6, k0Var));
    }

    public final void a() {
        boolean zIsFinished;
        F f6 = this.i;
        EdgeEffect edgeEffect = f6.f12235d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = edgeEffect.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = f6.f12236e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished = edgeEffect2.isFinished() || zIsFinished;
        }
        EdgeEffect edgeEffect3 = f6.f12237f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished = edgeEffect3.isFinished() || zIsFinished;
        }
        EdgeEffect edgeEffect4 = f6.f12238g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished = edgeEffect4.isFinished() || zIsFinished;
        }
        if (zIsFinished) {
            g();
        }
    }

    @Override // p101t.m0
    public final boolean b() {
        F f6 = this.i;
        EdgeEffect edgeEffect = f6.f12235d;
        C0947o c0947o = C0947o.f12387a;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c0947o.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = f6.f12236e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c0947o.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = f6.f12237f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c0947o.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = f6.f12238g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? c0947o.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    @Override // p101t.m0
    public final o c() {
        return this.f12384o;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x0135  */
    /* JADX WARN: Code duplicated, block: B:64:0x013a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0142  */
    /* JADX WARN: Code duplicated, block: B:67:0x0146  */
    /* JADX WARN: Code duplicated, block: B:69:0x0149 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x014d  */
    @Override // p101t.m0
    public final long d(long j4, int i, v vVar) {
        float fH;
        float fJ;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        if (f.e(this.f12382m)) {
            vVar.getClass();
            C1017z0 c1017z0 = (C1017z0) vVar.i;
            return new c(C1017z0.a(c1017z0, c1017z0.f13111h, j4, c1017z0.f13110g)).f8837a;
        }
        boolean z9 = this.f12381l;
        boolean z10 = true;
        F f6 = this.i;
        if (!z9) {
            if (F.g(f6.f12237f)) {
                i(0L);
            }
            if (F.g(f6.f12238g)) {
                j(0L);
            }
            if (F.g(f6.f12235d)) {
                k(0L);
            }
            if (F.g(f6.f12236e)) {
                h(0L);
            }
            this.f12381l = true;
        }
        if (c.e(j4) == 0.0f) {
            fH = 0.0f;
        } else if (F.g(f6.f12235d)) {
            fH = k(j4);
            if (!F.g(f6.f12235d)) {
                f6.e().onRelease();
            }
        } else if (F.g(f6.f12236e)) {
            fH = h(j4);
            if (!F.g(f6.f12236e)) {
                f6.b().onRelease();
            }
        } else {
            fH = 0.0f;
        }
        if (c.d(j4) == 0.0f) {
            fJ = 0.0f;
        } else if (F.g(f6.f12237f)) {
            fJ = i(j4);
            if (!F.g(f6.f12237f)) {
                f6.c().onRelease();
            }
        } else if (F.g(f6.f12238g)) {
            fJ = j(j4);
            if (!F.g(f6.f12238g)) {
                f6.d().onRelease();
            }
        } else {
            fJ = 0.0f;
        }
        long jY = p081p0.c.y(fJ, fH);
        if (!c.b(jY, 0L)) {
            g();
        }
        long jG = c.g(j4, jY);
        vVar.getClass();
        C1017z0 c1017z1 = (C1017z0) vVar.i;
        long j6 = new c(C1017z0.a(c1017z1, c1017z1.f13111h, jG, c1017z1.f13110g)).f8837a;
        long jG2 = c.g(jG, j6);
        if (i != 1) {
            z5 = false;
        } else {
            if (c.d(jG2) > 0.5f) {
                i(jG2);
            } else {
                if (c.d(jG2) < -0.5f) {
                    j(jG2);
                } else {
                    z7 = false;
                }
                if (c.e(jG2) > 0.5f) {
                    k(jG2);
                } else {
                    if (c.e(jG2) < -0.5f) {
                        h(jG2);
                    } else {
                        z8 = false;
                    }
                    if (!z7 || z8) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                }
                z8 = true;
                if (z7) {
                }
                z5 = true;
            }
            z7 = true;
            if (c.e(jG2) > 0.5f) {
                k(jG2);
            } else {
                if (c.e(jG2) < -0.5f) {
                    h(jG2);
                } else {
                    z8 = false;
                }
                if (z7) {
                }
                z5 = true;
            }
            z8 = true;
            if (z7) {
            }
            z5 = true;
        }
        if (!F.f(f6.f12237f) || c.d(j4) >= 0.0f) {
            z6 = false;
        } else {
            EdgeEffect edgeEffectC = f6.c();
            float fD = c.d(j4);
            if (edgeEffectC instanceof O) {
                O o6 = (O) edgeEffectC;
                float f7 = o6.f12260b + fD;
                o6.f12260b = f7;
                if (Math.abs(f7) > o6.f12259a) {
                    o6.onRelease();
                }
            } else {
                edgeEffectC.onRelease();
            }
            z6 = !F.f(f6.f12237f);
        }
        if (F.f(f6.f12238g) && c.d(j4) > 0.0f) {
            EdgeEffect edgeEffectD = f6.d();
            float fD2 = c.d(j4);
            if (edgeEffectD instanceof O) {
                O o7 = (O) edgeEffectD;
                float f8 = o7.f12260b + fD2;
                o7.f12260b = f8;
                if (Math.abs(f8) > o7.f12259a) {
                    o7.onRelease();
                }
            } else {
                edgeEffectD.onRelease();
            }
            z6 = z6 || !F.f(f6.f12238g);
        }
        if (F.f(f6.f12235d) && c.e(j4) < 0.0f) {
            EdgeEffect edgeEffectE = f6.e();
            float fE = c.e(j4);
            if (edgeEffectE instanceof O) {
                O o8 = (O) edgeEffectE;
                float f9 = o8.f12260b + fE;
                o8.f12260b = f9;
                if (Math.abs(f9) > o8.f12259a) {
                    o8.onRelease();
                }
            } else {
                edgeEffectE.onRelease();
            }
            z6 = z6 || !F.f(f6.f12235d);
        }
        if (F.f(f6.f12236e) && c.e(j4) > 0.0f) {
            EdgeEffect edgeEffectB = f6.b();
            float fE2 = c.e(j4);
            if (edgeEffectB instanceof O) {
                O o9 = (O) edgeEffectB;
                float f10 = o9.f12260b + fE2;
                o9.f12260b = f10;
                if (Math.abs(f10) > o9.f12259a) {
                    o9.onRelease();
                }
            } else {
                edgeEffectB.onRelease();
            }
            z6 = z6 || !F.f(f6.f12236e);
        }
        if (!z6 && !z5) {
            z10 = false;
        }
        if (z10) {
            g();
        }
        return c.h(jY, j6);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0167, code lost:
    
        if (r4 == r6) goto L75;
     */
    @Override // p101t.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(long r18, p112v.C1013x0 r20, p111u4.d r21) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p101t.C0946n.e(long, v.x0, u4.d):java.lang.Object");
    }

    public final long f() {
        c cVar = this.f12378h;
        long jN = cVar != null ? cVar.f8837a : h0.n(this.f12382m);
        return p081p0.c.y(c.d(jN) / f.d(this.f12382m), c.e(jN) / f.b(this.f12382m));
    }

    public final void g() {
        if (this.f12380k) {
            this.f12379j.setValue(x.f10867a);
        }
    }

    public final float h(long j4) {
        float fD = c.d(f());
        float fE = c.e(j4) / f.b(this.f12382m);
        EdgeEffect edgeEffectB = this.i.b();
        float fC = -fE;
        float f6 = 1 - fD;
        int i = Build.VERSION.SDK_INT;
        C0947o c0947o = C0947o.f12387a;
        if (i >= 31) {
            fC = c0947o.c(edgeEffectB, fC, f6);
        } else {
            edgeEffectB.onPull(fC, f6);
        }
        return (i >= 31 ? c0947o.b(edgeEffectB) : 0.0f) == 0.0f ? f.b(this.f12382m) * (-fC) : c.e(j4);
    }

    public final float i(long j4) {
        float fE = c.e(f());
        float fD = c.d(j4) / f.d(this.f12382m);
        EdgeEffect edgeEffectC = this.i.c();
        float f6 = 1 - fE;
        int i = Build.VERSION.SDK_INT;
        C0947o c0947o = C0947o.f12387a;
        if (i >= 31) {
            fD = c0947o.c(edgeEffectC, fD, f6);
        } else {
            edgeEffectC.onPull(fD, f6);
        }
        return (i >= 31 ? c0947o.b(edgeEffectC) : 0.0f) == 0.0f ? f.d(this.f12382m) * fD : c.d(j4);
    }

    public final float j(long j4) {
        float fE = c.e(f());
        float fD = c.d(j4) / f.d(this.f12382m);
        EdgeEffect edgeEffectD = this.i.d();
        float fC = -fD;
        int i = Build.VERSION.SDK_INT;
        C0947o c0947o = C0947o.f12387a;
        if (i >= 31) {
            fC = c0947o.c(edgeEffectD, fC, fE);
        } else {
            edgeEffectD.onPull(fC, fE);
        }
        return (i >= 31 ? c0947o.b(edgeEffectD) : 0.0f) == 0.0f ? f.d(this.f12382m) * (-fC) : c.d(j4);
    }

    public final float k(long j4) {
        float fD = c.d(f());
        float fE = c.e(j4) / f.b(this.f12382m);
        EdgeEffect edgeEffectE = this.i.e();
        int i = Build.VERSION.SDK_INT;
        C0947o c0947o = C0947o.f12387a;
        if (i >= 31) {
            fE = c0947o.c(edgeEffectE, fE, fD);
        } else {
            edgeEffectE.onPull(fE, fD);
        }
        return (i >= 31 ? c0947o.b(edgeEffectE) : 0.0f) == 0.0f ? f.b(this.f12382m) * fE : c.e(j4);
    }

    public final void l(long j4) {
        boolean zA = f.a(this.f12382m, 0L);
        boolean zA2 = f.a(j4, this.f12382m);
        this.f12382m = j4;
        if (!zA2) {
            long jB = AbstractC0473d.b(a.D(f.d(j4)), a.D(f.b(j4)));
            F f6 = this.i;
            f6.f12234c = jB;
            EdgeEffect edgeEffect = f6.f12235d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect2 = f6.f12236e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect3 = f6.f12237f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect4 = f6.f12238g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect5 = f6.f12239h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect6 = f6.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect7 = f6.f12240j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect8 = f6.f12241k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        g();
        a();
    }
}
