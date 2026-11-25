package p044i0;

import B.C0031p0;
import O1.u;
import S0.c;
import S0.k;
import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.NoWhenBranchMatchedException;
import p030f0.f;
import p035g0.AbstractC0712m;
import p035g0.C0704e;
import p035g0.C0709j;
import p035g0.F;
import p035g0.G;
import p035g0.H;
import p035g0.InterfaceC0714o;
import p035g0.r;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f9385h;
    public final C0031p0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u f9386j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u f9387k;

    public b() {
        c cVar = c.f9388a;
        k kVar = k.f4897h;
        f fVar = new f();
        a aVar = new a();
        aVar.f9381a = cVar;
        aVar.f9382b = kVar;
        aVar.f9383c = fVar;
        aVar.f9384d = 0L;
        this.f9385h = aVar;
        this.i = new C0031p0(this);
    }

    public static u b(b bVar, long j4, e eVar, int i) {
        u uVarE = bVar.e(eVar);
        if (!r.c(H.c(((Paint) uVarE.f4534b).getColor()), j4)) {
            uVarE.n(j4);
        }
        if (((Shader) uVarE.f4535c) != null) {
            uVarE.q(null);
        }
        if (!E4.k.a((C0709j) uVarE.f4536d, null)) {
            uVarE.o(null);
        }
        if (uVarE.f4533a != i) {
            uVarE.m(i);
        }
        if (((Paint) uVarE.f4534b).isFilterBitmap()) {
            return uVarE;
        }
        uVarE.p(1);
        return uVarE;
    }

    @Override // p044i0.d
    public final C0031p0 B() {
        return this.i;
    }

    @Override // p044i0.d
    public final void E(C0704e c0704e, long j4, long j6, long j7, long j8, float f6, C0709j c0709j, int i, int i3) {
        this.f9385h.f9383c.o(c0704e, j4, j6, j7, j8, c(null, g.f9389a, f6, c0709j, i, i3));
    }

    @Override // p044i0.d
    public final void G(F f6, AbstractC0712m abstractC0712m, float f7, e eVar, int i) {
        this.f9385h.f9383c.k(f6, c(abstractC0712m, eVar, f7, null, i, 1));
    }

    @Override // p044i0.d
    public final void L(long j4, long j6, long j7, float f6, int i) {
        InterfaceC0714o interfaceC0714o = this.f9385h.f9383c;
        u uVarG = this.f9387k;
        if (uVarG == null) {
            uVarG = H.g();
            uVarG.u(1);
            this.f9387k = uVarG;
        }
        if (!r.c(H.c(((Paint) uVarG.f4534b).getColor()), j4)) {
            uVarG.n(j4);
        }
        if (((Shader) uVarG.f4535c) != null) {
            uVarG.q(null);
        }
        if (!E4.k.a((C0709j) uVarG.f4536d, null)) {
            uVarG.o(null);
        }
        if (uVarG.f4533a != 3) {
            uVarG.m(3);
        }
        Paint paint = (Paint) uVarG.f4534b;
        if (paint.getStrokeWidth() != f6) {
            uVarG.t(f6);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            ((Paint) uVarG.f4534b).setStrokeMiter(4.0f);
        }
        if (uVarG.h() != i) {
            uVarG.r(i);
        }
        if (uVarG.i() != 0) {
            uVarG.s(0);
        }
        if (!paint.isFilterBitmap()) {
            uVarG.p(1);
        }
        interfaceC0714o.m(j6, j7, uVarG);
    }

    @Override // p044i0.d
    public final void R(G g6, float f6, long j4, e eVar) {
        this.f9385h.f9383c.b(f6, j4, c(g6, eVar, 1.0f, null, 3, 1));
    }

    @Override // p044i0.d
    public final void T(long j4, float f6, long j6, e eVar) {
        this.f9385h.f9383c.b(f6, j6, b(this, j4, eVar, 3));
    }

    @Override // S0.b
    public final float a() {
        return this.f9385h.f9381a.a();
    }

    @Override // p044i0.d
    public final void a0(long j4, float f6, float f7, long j6, long j7, e eVar) {
        this.f9385h.f9383c.e(p030f0.c.d(j6), p030f0.c.e(j6), f.d(j7) + p030f0.c.d(j6), f.b(j7) + p030f0.c.e(j6), f6, f7, b(this, j4, eVar, 3));
    }

    public final u c(AbstractC0712m abstractC0712m, e eVar, float f6, C0709j c0709j, int i, int i3) {
        u uVarE = e(eVar);
        if (abstractC0712m != null) {
            abstractC0712m.a(f6, f(), uVarE);
        } else {
            if (((Shader) uVarE.f4535c) != null) {
                uVarE.q(null);
            }
            long jC = H.c(((Paint) uVarE.f4534b).getColor());
            long j4 = r.f9076b;
            if (!r.c(jC, j4)) {
                uVarE.n(j4);
            }
            if (((Paint) uVarE.f4534b).getAlpha() / 255.0f != f6) {
                uVarE.l(f6);
            }
        }
        if (!E4.k.a((C0709j) uVarE.f4536d, c0709j)) {
            uVarE.o(c0709j);
        }
        if (uVarE.f4533a != i) {
            uVarE.m(i);
        }
        if (((Paint) uVarE.f4534b).isFilterBitmap() == i3) {
            return uVarE;
        }
        uVarE.p(i3);
        return uVarE;
    }

    public final void d(C0704e c0704e, C0709j c0709j) {
        this.f9385h.f9383c.p(c0704e, c(null, g.f9389a, 1.0f, c0709j, 3, 1));
    }

    public final u e(e eVar) {
        if (E4.k.a(eVar, g.f9389a)) {
            u uVar = this.f9386j;
            if (uVar != null) {
                return uVar;
            }
            u uVarG = H.g();
            uVarG.u(0);
            this.f9386j = uVarG;
            return uVarG;
        }
        if (!(eVar instanceof h)) {
            throw new NoWhenBranchMatchedException();
        }
        u uVarG2 = this.f9387k;
        if (uVarG2 == null) {
            uVarG2 = H.g();
            uVarG2.u(1);
            this.f9387k = uVarG2;
        }
        Paint paint = (Paint) uVarG2.f4534b;
        float strokeWidth = paint.getStrokeWidth();
        h hVar = (h) eVar;
        float f6 = hVar.f9390a;
        if (strokeWidth != f6) {
            uVarG2.t(f6);
        }
        int iH = uVarG2.h();
        int i = hVar.f9392c;
        if (iH != i) {
            uVarG2.r(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f7 = hVar.f9391b;
        if (strokeMiter != f7) {
            ((Paint) uVarG2.f4534b).setStrokeMiter(f7);
        }
        int i3 = uVarG2.i();
        int i6 = hVar.f9393d;
        if (i3 == i6) {
            return uVarG2;
        }
        uVarG2.s(i6);
        return uVarG2;
    }

    @Override // p044i0.d
    public final k getLayoutDirection() {
        return this.f9385h.f9382b;
    }

    @Override // S0.b
    public final float n() {
        return this.f9385h.f9381a.n();
    }

    @Override // p044i0.d
    public final void p(long j4, long j6, long j7, e eVar, int i) {
        this.f9385h.f9383c.d(p030f0.c.d(j6), p030f0.c.e(j6), f.d(j7) + p030f0.c.d(j6), f.b(j7) + p030f0.c.e(j6), b(this, j4, eVar, i));
    }
}
