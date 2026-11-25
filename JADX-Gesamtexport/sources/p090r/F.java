package p090r;

import B.C0026n;
import B.Y0;
import D4.a;
import S0.h;
import S0.j;
import S0.k;
import Z.b;
import Z.c;
import Z.n;
import p015c2.AbstractC0473d;
import p089q4.v;
import p096s.i0;
import p096s.j0;
import p096s.o0;
import p113v0.E;
import p113v0.G;
import p113v0.H;
import p113v0.N;
import p124x0.InterfaceC1114w;
import p124x0.M;

/* JADX INFO: loaded from: classes.dex */
public final class F extends n implements InterfaceC1114w {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public a f11362A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public y f11363B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f11364C = s.f11432a;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public c f11365D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final E f11366E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final E f11367F;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public o0 f11368u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public j0 f11369v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public j0 f11370w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public j0 f11371x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public G f11372y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public H f11373z;

    public F(o0 o0Var, j0 j0Var, j0 j0Var2, j0 j0Var3, G g6, H h6, a aVar, y yVar) {
        this.f11368u = o0Var;
        this.f11369v = j0Var;
        this.f11370w = j0Var2;
        this.f11371x = j0Var3;
        this.f11372y = g6;
        this.f11373z = h6;
        this.f11362A = aVar;
        this.f11363B = yVar;
        p081p0.c.u(0, 0, 15);
        this.f11366E = new E(this, 0);
        this.f11367F = new E(this, 1);
    }

    @Override // p124x0.InterfaceC1114w
    public final int c(M m6, E e6, int i) {
        return e6.Z(i);
    }

    @Override // p124x0.InterfaceC1114w
    public final int d(M m6, E e6, int i) {
        return e6.U(i);
    }

    @Override // p124x0.InterfaceC1114w
    public final G e(H h6, E e6, long j4) {
        i0 i0VarA;
        long j6;
        Object obj = null;
        if (this.f11368u.f12056a.j() == this.f11368u.f12059d.getValue()) {
            this.f11365D = null;
        } else if (this.f11365D == null) {
            c cVarY0 = y0();
            if (cVarY0 == null) {
                cVarY0 = b.f5933h;
            }
            this.f11365D = cVarY0;
        }
        boolean zS = h6.s();
        v vVar = v.f11238h;
        if (zS) {
            N nC = e6.c(j4);
            long jB = AbstractC0473d.b(nC.f13137h, nC.i);
            this.f11364C = jB;
            return h6.u((int) (jB >> 32), (int) (jB & 4294967295L), vVar, new Y0(nC, 5));
        }
        if (!((Boolean) this.f11362A.invoke()).booleanValue()) {
            N nC2 = e6.c(j4);
            return h6.u(nC2.f13137h, nC2.i, vVar, new Y0(nC2, 6));
        }
        y yVar = this.f11363B;
        j0 j0Var = yVar.f11451a;
        G g6 = yVar.f11454d;
        H h7 = yVar.f11455e;
        i0 i0VarA2 = j0Var != null ? j0Var.a(new z(g6, h7, 0), new z(g6, h7, 1)) : null;
        j0 j0Var2 = yVar.f11452b;
        i0 i0VarA3 = j0Var2 != null ? j0Var2.a(new z(g6, h7, 2), new z(g6, h7, 3)) : null;
        if (yVar.f11453c.f12056a.j() == x.f11448h) {
            Q q6 = h7.f11378a;
        } else {
            Q q7 = h7.f11378a;
        }
        j0 j0Var3 = yVar.f11456f;
        C0026n c0026n = new C0026n(i0VarA2, i0VarA3, j0Var3 != null ? j0Var3.a(u.f11438l, new C0026n(obj, g6, h7, 11)) : null, 10);
        N nC3 = e6.c(j4);
        long jB2 = AbstractC0473d.b(nC3.f13137h, nC3.i);
        long j7 = !j.a(this.f11364C, s.f11432a) ? this.f11364C : jB2;
        j0 j0Var4 = this.f11369v;
        if (j0Var4 != null) {
            i0VarA = j0Var4.a(this.f11366E, new D(this, j7, 0));
        } else {
            i0VarA = null;
        }
        if (i0VarA != null) {
            jB2 = ((j) i0VarA.getValue()).f4896a;
        }
        long jR = p081p0.c.R(j4, jB2);
        j0 j0Var5 = this.f11370w;
        long jA = 0;
        long j8 = j0Var5 != null ? ((h) j0Var5.a(u.f11441o, new D(this, j7, 1)).getValue()).f4890a : 0L;
        j0 j0Var6 = this.f11371x;
        if (j0Var6 != null) {
            j6 = ((h) j0Var6.a(this.f11367F, new D(this, j7, 2)).getValue()).f4890a;
        } else {
            j6 = 0;
        }
        c cVar = this.f11365D;
        if (cVar != null) {
            jA = cVar.a(j7, jR, k.f4897h);
        }
        return h6.u((int) (jR >> 32), (int) (jR & 4294967295L), vVar, new C(nC3, h.c(jA, j6), j8, c0026n, 0));
    }

    @Override // p124x0.InterfaceC1114w
    public final int h(M m6, E e6, int i) {
        return e6.Y(i);
    }

    @Override // p124x0.InterfaceC1114w
    public final int i(M m6, E e6, int i) {
        return e6.d(i);
    }

    @Override // Z.n
    public final void r0() {
        this.f11364C = s.f11432a;
    }

    public final c y0() {
        if (this.f11368u.f().a(x.f11448h, x.i)) {
            t tVar = this.f11372y.f11375a.f11392c;
            if (tVar != null) {
                return tVar.f11433a;
            }
            t tVar2 = this.f11373z.f11378a.f11392c;
            if (tVar2 != null) {
                return tVar2.f11433a;
            }
            return null;
        }
        t tVar3 = this.f11373z.f11378a.f11392c;
        if (tVar3 != null) {
            return tVar3.f11433a;
        }
        t tVar4 = this.f11372y.f11375a.f11392c;
        if (tVar4 != null) {
            return tVar4.f11433a;
        }
        return null;
    }
}
