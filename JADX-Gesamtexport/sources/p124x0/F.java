package p124x0;

import B.C0031p0;
import E4.k;
import Z.n;
import p015c2.AbstractC0473d;
import p030f0.c;
import p030f0.f;
import p035g0.AbstractC0712m;
import p035g0.C0704e;
import p035g0.C0706g;
import p035g0.C0709j;
import p035g0.G;
import p035g0.InterfaceC0714o;
import p044i0.a;
import p044i0.b;
import p044i0.d;
import p044i0.e;
import p130y0.r;

/* JADX INFO: loaded from: classes.dex */
public final class F implements d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f13862h = new b();
    public InterfaceC1107o i;

    @Override // p044i0.d
    public final C0031p0 B() {
        return this.f13862h.i;
    }

    @Override // S0.b
    public final float C(long j4) {
        return this.f13862h.C(j4);
    }

    @Override // p044i0.d
    public final void E(C0704e c0704e, long j4, long j6, long j7, long j8, float f6, C0709j c0709j, int i, int i3) {
        this.f13862h.E(c0704e, j4, j6, j7, j8, f6, c0709j, i, i3);
    }

    @Override // p044i0.d
    public final void G(p035g0.F f6, AbstractC0712m abstractC0712m, float f7, e eVar, int i) {
        this.f13862h.G(f6, abstractC0712m, f7, eVar, i);
    }

    @Override // S0.b
    public final int H(float f6) {
        return this.f13862h.H(f6);
    }

    @Override // p044i0.d
    public final void L(long j4, long j6, long j7, float f6, int i) {
        this.f13862h.L(j4, j6, j7, f6, i);
    }

    @Override // p044i0.d
    public final long N() {
        return this.f13862h.N();
    }

    @Override // p044i0.d
    public final void R(G g6, float f6, long j4, e eVar) {
        this.f13862h.R(g6, f6, j4, eVar);
    }

    @Override // S0.b
    public final long S(long j4) {
        return this.f13862h.S(j4);
    }

    @Override // p044i0.d
    public final void T(long j4, float f6, long j6, e eVar) {
        this.f13862h.T(j4, f6, j6, eVar);
    }

    @Override // S0.b
    public final float V(long j4) {
        return this.f13862h.V(j4);
    }

    @Override // S0.b
    public final float a() {
        return this.f13862h.a();
    }

    @Override // p044i0.d
    public final void a0(long j4, float f6, float f7, long j6, long j7, e eVar) {
        this.f13862h.a0(j4, f6, f7, j6, j7, eVar);
    }

    public final void b() {
        b bVar = this.f13862h;
        InterfaceC0714o interfaceC0714oF = bVar.i.f();
        InterfaceC1104l interfaceC1104l = this.i;
        k.c(interfaceC1104l);
        n nVar = (n) interfaceC1104l;
        n nVarE = nVar.f5958h.f5962m;
        if (nVarE != null && (nVarE.f5960k & 4) != 0) {
            while (true) {
                if (nVarE != null) {
                    int i = nVarE.f5959j;
                    if ((i & 2) == 0) {
                        if ((i & 4) != 0) {
                            break;
                        } else {
                            nVarE = nVarE.f5962m;
                        }
                    }
                }
                nVarE = null;
                break;
            }
        } else {
            nVarE = null;
            break;
        }
        if (nVarE == null) {
            Y yQ = AbstractC1098f.q(interfaceC1104l, 4);
            if (yQ.M0() == nVar.f5958h) {
                yQ = yQ.f13990t;
                k.c(yQ);
            }
            yQ.Y0(interfaceC0714oF, (p048j0.b) bVar.i.f394j);
            return;
        }
        P.d dVar = null;
        while (nVarE != null) {
            if (nVarE instanceof InterfaceC1107o) {
                InterfaceC1107o interfaceC1107o = (InterfaceC1107o) nVarE;
                p048j0.b bVar2 = (p048j0.b) bVar.i.f394j;
                Y yQ2 = AbstractC1098f.q(interfaceC1107o, 4);
                long jU = AbstractC0473d.U(yQ2.f13138j);
                D d6 = yQ2.f13989s;
                d6.getClass();
                ((r) AbstractC1098f.u(d6)).getSharedDrawScope().c(interfaceC0714oF, jU, yQ2, interfaceC1107o, bVar2);
            } else if ((nVarE.f5959j & 4) != 0 && (nVarE instanceof AbstractC1105m)) {
                int i3 = 0;
                for (n nVar2 = ((AbstractC1105m) nVarE).f14046v; nVar2 != null; nVar2 = nVar2.f5962m) {
                    if ((nVar2.f5959j & 4) != 0) {
                        i3++;
                        if (i3 == 1) {
                            nVarE = nVar2;
                        } else {
                            if (dVar == null) {
                                dVar = new P.d(new n[16]);
                            }
                            if (nVarE != null) {
                                dVar.c(nVarE);
                                nVarE = null;
                            }
                            dVar.c(nVar2);
                        }
                    }
                }
                if (i3 == 1) {
                }
            }
            nVarE = AbstractC1098f.e(dVar);
        }
    }

    @Override // S0.b
    public final long b0(float f6) {
        return this.f13862h.b0(f6);
    }

    public final void c(InterfaceC0714o interfaceC0714o, long j4, Y y2, InterfaceC1107o interfaceC1107o, p048j0.b bVar) {
        InterfaceC1107o interfaceC1107o2 = this.i;
        this.i = interfaceC1107o;
        S0.k kVar = y2.f13989s.f13851y;
        b bVar2 = this.f13862h;
        C0031p0 c0031p0 = bVar2.i;
        a aVar = ((b) c0031p0.f395k).f9385h;
        S0.b bVar3 = aVar.f9381a;
        S0.k kVar2 = aVar.f9382b;
        InterfaceC0714o interfaceC0714oF = c0031p0.f();
        C0031p0 c0031p1 = bVar2.i;
        long jL = c0031p1.l();
        p048j0.b bVar4 = (p048j0.b) c0031p1.f394j;
        c0031p1.v(y2);
        c0031p1.w(kVar);
        c0031p1.u(interfaceC0714o);
        c0031p1.x(j4);
        c0031p1.f394j = bVar;
        interfaceC0714o.l();
        try {
            interfaceC1107o.b(this);
            interfaceC0714o.i();
            c0031p1.v(bVar3);
            c0031p1.w(kVar2);
            c0031p1.u(interfaceC0714oF);
            c0031p1.x(jL);
            c0031p1.f394j = bVar4;
            this.i = interfaceC1107o2;
        } catch (Throwable th) {
            interfaceC0714o.i();
            c0031p1.v(bVar3);
            c0031p1.w(kVar2);
            c0031p1.u(interfaceC0714oF);
            c0031p1.x(jL);
            c0031p1.f394j = bVar4;
            throw th;
        }
    }

    public final void d(C0706g c0706g, long j4, e eVar) {
        b bVar = this.f13862h;
        bVar.f9385h.f9383c.k(c0706g, b.b(bVar, j4, eVar, 3));
    }

    public final void e(AbstractC0712m abstractC0712m, long j4, long j6, float f6, e eVar) {
        b bVar = this.f13862h;
        bVar.f9385h.f9383c.d(c.d(j4), c.e(j4), f.d(j6) + c.d(j4), f.b(j6) + c.e(j4), bVar.c(abstractC0712m, eVar, f6, null, 3, 1));
    }

    @Override // p044i0.d
    public final long f() {
        return this.f13862h.f();
    }

    public final void g(AbstractC0712m abstractC0712m, long j4, long j6, long j7, float f6, e eVar) {
        b bVar = this.f13862h;
        bVar.f9385h.f9383c.j(c.d(j4), c.e(j4), f.d(j6) + c.d(j4), f.b(j6) + c.e(j4), p030f0.a.b(j7), p030f0.a.c(j7), bVar.c(abstractC0712m, eVar, f6, null, 3, 1));
    }

    @Override // p044i0.d
    public final S0.k getLayoutDirection() {
        return this.f13862h.f9385h.f9382b;
    }

    @Override // S0.b
    public final float i0(int i) {
        return this.f13862h.i0(i);
    }

    @Override // S0.b
    public final float j0(float f6) {
        return f6 / this.f13862h.a();
    }

    @Override // S0.b
    public final float n() {
        return this.f13862h.n();
    }

    @Override // p044i0.d
    public final void p(long j4, long j6, long j7, e eVar, int i) {
        this.f13862h.p(j4, j6, j7, eVar, i);
    }

    @Override // S0.b
    public final long v(float f6) {
        return this.f13862h.v(f6);
    }

    @Override // S0.b
    public final long w(long j4) {
        return this.f13862h.w(j4);
    }

    @Override // S0.b
    public final float y(float f6) {
        return this.f13862h.a() * f6;
    }
}
