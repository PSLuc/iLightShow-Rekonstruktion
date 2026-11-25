package E;

import B.AbstractC0029o0;
import B.C0043w;
import B.Y0;
import E0.o;
import E0.q;
import G0.C;
import G0.C0110f;
import G0.G;
import G0.J;
import S1.h0;
import Z.n;
import com.fasterxml.jackson.databind.deser.std.d0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p015c2.AbstractC0473d;
import p035g0.AbstractC0712m;
import p035g0.InterfaceC0714o;
import p035g0.L;
import p035g0.r;
import p113v0.AbstractC1020c;
import p113v0.E;
import p113v0.H;
import p113v0.N;
import p124x0.AbstractC1098f;
import p124x0.F;
import p124x0.InterfaceC1107o;
import p124x0.InterfaceC1114w;
import p124x0.M;
import p124x0.m0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends n implements InterfaceC1114w, InterfaceC1107o, m0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f874A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f875B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public List f876C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public D4.c f877D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public D4.c f878E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Map f879F;
    public d G;
    public g H;
    public f I;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0110f f880u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public J f881v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public L0.d f882w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public D4.c f883x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f884y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f885z;

    @Override // p124x0.m0
    public final boolean Y() {
        return true;
    }

    @Override // p124x0.InterfaceC1107o
    public final void b(F f6) {
        if (this.f5969t) {
            InterfaceC0714o interfaceC0714oF = f6.f13862h.i.f();
            G g6 = z0(f6).f849n;
            if (g6 == null) {
                throw new IllegalStateException("You must call layoutWithConstraints first");
            }
            long j4 = g6.f1460c;
            float f7 = (int) (j4 >> 32);
            G0.n nVar = g6.f1459b;
            boolean z5 = true;
            boolean z6 = ((f7 > nVar.f1516d ? 1 : (f7 == nVar.f1516d ? 0 : -1)) < 0 || nVar.f1515c || (((float) ((int) (j4 & 4294967295L))) > nVar.f1517e ? 1 : (((float) ((int) (j4 & 4294967295L))) == nVar.f1517e ? 0 : -1)) < 0) && this.f884y != 3;
            if (z6) {
                p030f0.d dVarE = G4.a.e(0L, h0.f((int) (j4 >> 32), (int) (j4 & 4294967295L)));
                interfaceC0714oF.l();
                InterfaceC0714o.t(interfaceC0714oF, dVarE);
            }
            try {
                C c6 = this.f881v.f1472a;
                R0.j jVar = c6.f1439m;
                if (jVar == null) {
                    jVar = R0.j.f4746b;
                }
                R0.j jVar2 = jVar;
                L l6 = c6.f1440n;
                if (l6 == null) {
                    l6 = L.f9034d;
                }
                L l7 = l6;
                p044i0.e eVar = c6.f1442p;
                if (eVar == null) {
                    eVar = p044i0.g.f9389a;
                }
                p044i0.e eVar2 = eVar;
                AbstractC0712m abstractC0712mB = c6.f1428a.b();
                if (abstractC0712mB != null) {
                    G0.n.h(nVar, interfaceC0714oF, abstractC0712mB, this.f881v.f1472a.f1428a.c(), l7, jVar2, eVar2);
                } else {
                    long jB = r.f9085l;
                    if (jB == 16) {
                        jB = this.f881v.b() != 16 ? this.f881v.b() : r.f9076b;
                    }
                    G0.n.g(nVar, interfaceC0714oF, jB, l7, jVar2, eVar2);
                }
                if (z6) {
                    interfaceC0714oF.i();
                }
                f fVar = this.I;
                if (!((fVar == null || !fVar.f871c) ? d0.s(this.f880u) : false)) {
                    List list = this.f876C;
                    if (list != null && !list.isEmpty()) {
                        z5 = false;
                    }
                    if (z5) {
                        return;
                    }
                }
                f6.b();
            } catch (Throwable th) {
                if (!z6) {
                    throw th;
                }
                interfaceC0714oF.i();
                throw th;
            }
        }
    }

    @Override // p124x0.InterfaceC1114w
    public final int c(M m6, E e6, int i) {
        return z0(m6).a(i, m6.getLayoutDirection());
    }

    @Override // p124x0.InterfaceC1114w
    public final int d(M m6, E e6, int i) {
        return AbstractC0029o0.n(z0(m6).d(m6.getLayoutDirection()).a());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    @Override // p124x0.InterfaceC1114w
    public final p113v0.G e(H h6, E e6, long j4) {
        d dVarZ0 = z0(h6);
        S0.k layoutDirection = h6.getLayoutDirection();
        boolean z5 = true;
        if (dVarZ0.f843g > 1) {
            b bVar = dVarZ0.i;
            J j6 = dVarZ0.f838b;
            S0.b bVar2 = dVarZ0.f846k;
            E4.k.c(bVar2);
            b bVarW = AbstractC0473d.w(bVar, layoutDirection, j6, bVar2, dVarZ0.f839c);
            dVarZ0.i = bVarW;
            j4 = bVarW.a(dVarZ0.f843g, j4);
        }
        G g6 = dVarZ0.f849n;
        if (g6 == null) {
            dVarZ0.f849n = dVarZ0.e(layoutDirection, j4, dVarZ0.b(j4, layoutDirection));
        } else {
            G0.n nVar = g6.f1459b;
            if (nVar.f1513a.b()) {
                dVarZ0.f849n = dVarZ0.e(layoutDirection, j4, dVarZ0.b(j4, layoutDirection));
            } else {
                G0.F f6 = g6.f1458a;
                if (layoutDirection != f6.f1456h) {
                    dVarZ0.f849n = dVarZ0.e(layoutDirection, j4, dVarZ0.b(j4, layoutDirection));
                } else {
                    long j7 = f6.f1457j;
                    if (!S0.a.b(j4, j7) && (S0.a.h(j4) != S0.a.h(j7) || S0.a.g(j4) < nVar.f1517e || nVar.f1515c)) {
                        dVarZ0.f849n = dVarZ0.e(layoutDirection, j4, dVarZ0.b(j4, layoutDirection));
                    } else {
                        G g7 = dVarZ0.f849n;
                        E4.k.c(g7);
                        if (S0.a.b(j4, g7.f1458a.f1457j)) {
                            z5 = false;
                        } else {
                            G g8 = dVarZ0.f849n;
                            E4.k.c(g8);
                            dVarZ0.f849n = dVarZ0.e(layoutDirection, j4, g8.f1459b);
                        }
                    }
                }
            }
        }
        G g9 = dVarZ0.f849n;
        if (g9 == null) {
            throw new IllegalStateException("You must call layoutWithConstraints first");
        }
        g9.f1459b.f1513a.b();
        if (z5) {
            AbstractC1098f.q(this, 2).S0();
            D4.c cVar = this.f883x;
            if (cVar != null) {
                cVar.invoke(g9);
            }
            Map linkedHashMap = this.f879F;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
            }
            linkedHashMap.put(AbstractC1020c.f13160a, Integer.valueOf(Math.round(g9.f1461d)));
            linkedHashMap.put(AbstractC1020c.f13161b, Integer.valueOf(Math.round(g9.f1462e)));
            this.f879F = linkedHashMap;
        }
        D4.c cVar2 = this.f877D;
        if (cVar2 != null) {
            cVar2.invoke(g9.f1463f);
        }
        long j8 = g9.f1460c;
        int i = (int) (j8 >> 32);
        int i3 = (int) (j8 & 4294967295L);
        int iMin = Math.min(i, 262142);
        int iMin2 = i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i, 262142);
        int iC = p081p0.c.C(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
        N nC = e6.c(p081p0.c.t(iMin, iMin2, Math.min(iC, i3), i3 != Integer.MAX_VALUE ? Math.min(iC, i3) : Integer.MAX_VALUE));
        Map map = this.f879F;
        E4.k.c(map);
        return h6.u(i, i3, map, new Y0(nC, 1));
    }

    @Override // p124x0.m0
    public final void g0(E0.h hVar) {
        g gVar = this.H;
        if (gVar == null) {
            gVar = new g(this, 0);
            this.H = gVar;
        }
        C0110f c0110f = this.f880u;
        K4.e[] eVarArr = q.f997a;
        hVar.i(o.f990u, d0.v(c0110f));
        f fVar = this.I;
        if (fVar != null) {
            C0110f c0110f2 = fVar.f870b;
            E0.r rVar = o.f991v;
            K4.e[] eVarArr2 = q.f997a;
            K4.e eVar = eVarArr2[14];
            rVar.a(hVar, c0110f2);
            boolean z5 = fVar.f871c;
            E0.r rVar2 = o.f992w;
            K4.e eVar2 = eVarArr2[15];
            rVar2.a(hVar, Boolean.valueOf(z5));
        }
        hVar.i(E0.g.i, new E0.a(null, new g(this, 1)));
        hVar.i(E0.g.f922j, new E0.a(null, new g(this, 2)));
        hVar.i(E0.g.f923k, new E0.a(null, new C0043w(10, this)));
        q.d(hVar, gVar);
    }

    @Override // p124x0.InterfaceC1114w
    public final int h(M m6, E e6, int i) {
        return AbstractC0029o0.n(z0(m6).d(m6.getLayoutDirection()).c());
    }

    @Override // p124x0.InterfaceC1114w
    public final int i(M m6, E e6, int i) {
        return z0(m6).a(i, m6.getLayoutDirection());
    }

    public final d y0() {
        if (this.G == null) {
            this.G = new d(this.f880u, this.f881v, this.f882w, this.f884y, this.f885z, this.f874A, this.f875B, this.f876C);
        }
        d dVar = this.G;
        E4.k.c(dVar);
        return dVar;
    }

    public final d z0(S0.b bVar) {
        d dVar;
        f fVar = this.I;
        if (fVar != null && fVar.f871c && (dVar = fVar.f872d) != null) {
            dVar.c(bVar);
            return dVar;
        }
        d dVarY0 = y0();
        dVarY0.c(bVar);
        return dVarY0;
    }
}
