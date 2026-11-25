package O0;

import N.C0208d;
import N.D;
import O1.u;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import p015c2.AbstractC0473d;
import p035g0.AbstractC0712m;
import p035g0.H;
import p035g0.K;
import p035g0.L;
import p035g0.O;

/* JADX INFO: loaded from: classes.dex */
public final class f extends TextPaint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f4405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public R0.j f4406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public L f4408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AbstractC0712m f4409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public D f4410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p030f0.f f4411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p044i0.e f4412h;

    public final u a() {
        u uVar = this.f4405a;
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this);
        this.f4405a = uVar2;
        return uVar2;
    }

    public final void b(int i) {
        if (i == this.f4407c) {
            return;
        }
        a().m(i);
        this.f4407c = i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    public final void c(AbstractC0712m abstractC0712m, long j4, float f6) {
        if (abstractC0712m == null) {
            this.f4410f = null;
            this.f4409e = null;
            this.f4411g = null;
            setShader(null);
            return;
        }
        if (abstractC0712m instanceof O) {
            d(AbstractC0473d.I(f6, ((O) abstractC0712m).f9050a));
            return;
        }
        if (abstractC0712m instanceof K) {
            if (E4.k.a(this.f4409e, abstractC0712m)) {
                p030f0.f fVar = this.f4411g;
                if (!(fVar == null ? false : p030f0.f.a(fVar.f8851a, j4))) {
                    if (j4 != 9205357640488583168L) {
                        this.f4409e = abstractC0712m;
                        this.f4411g = new p030f0.f(j4);
                        this.f4410f = C0208d.C(new e(0, j4, abstractC0712m));
                    }
                }
            } else {
                if (j4 != 9205357640488583168L) {
                    this.f4409e = abstractC0712m;
                    this.f4411g = new p030f0.f(j4);
                    this.f4410f = C0208d.C(new e(0, j4, abstractC0712m));
                }
            }
            u uVarA = a();
            D d6 = this.f4410f;
            uVarA.q(d6 != null ? (Shader) d6.getValue() : null);
            k.b(this, f6);
        }
    }

    public final void d(long j4) {
        if (j4 != 16) {
            setColor(H.v(j4));
            this.f4410f = null;
            this.f4409e = null;
            this.f4411g = null;
            setShader(null);
        }
    }

    public final void e(p044i0.e eVar) {
        if (eVar == null || E4.k.a(this.f4412h, eVar)) {
            return;
        }
        this.f4412h = eVar;
        if (eVar.equals(p044i0.g.f9389a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (eVar instanceof p044i0.h) {
            a().u(1);
            p044i0.h hVar = (p044i0.h) eVar;
            a().t(hVar.f9390a);
            ((Paint) a().f4534b).setStrokeMiter(hVar.f9391b);
            a().s(hVar.f9393d);
            a().r(hVar.f9392c);
            ((Paint) a().f4534b).setPathEffect(null);
        }
    }

    public final void f(L l6) {
        if (l6 == null || E4.k.a(this.f4408d, l6)) {
            return;
        }
        this.f4408d = l6;
        if (l6.equals(L.f9034d)) {
            clearShadowLayer();
            return;
        }
        L l7 = this.f4408d;
        float f6 = l7.f9037c;
        if (f6 == 0.0f) {
            f6 = Float.MIN_VALUE;
        }
        setShadowLayer(f6, p030f0.c.d(l7.f9036b), p030f0.c.e(this.f4408d.f9036b), H.v(this.f4408d.f9035a));
    }

    public final void g(R0.j jVar) {
        if (jVar == null || E4.k.a(this.f4406b, jVar)) {
            return;
        }
        this.f4406b = jVar;
        int i = jVar.f4749a;
        setUnderlineText((i | 1) == i);
        R0.j jVar2 = this.f4406b;
        jVar2.getClass();
        int i3 = jVar2.f4749a;
        setStrikeThruText((i3 | 2) == i3);
    }
}
