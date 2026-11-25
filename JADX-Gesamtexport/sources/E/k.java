package E;

import B.AbstractC0029o0;
import B.C0043w;
import B.Y0;
import E0.o;
import E0.q;
import G0.C;
import G0.C0105a;
import G0.C0110f;
import G0.J;
import G0.s;
import H0.y;
import Z.n;
import com.fasterxml.jackson.databind.deser.std.d0;
import java.util.LinkedHashMap;
import java.util.Map;
import p015c2.AbstractC0473d;
import p035g0.AbstractC0712m;
import p035g0.InterfaceC0714o;
import p035g0.L;
import p035g0.r;
import p113v0.AbstractC1020c;
import p113v0.C1029l;
import p113v0.E;
import p113v0.G;
import p113v0.H;
import p113v0.N;
import p124x0.AbstractC1098f;
import p124x0.F;
import p124x0.InterfaceC1107o;
import p124x0.InterfaceC1114w;
import p124x0.M;
import p124x0.m0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends n implements InterfaceC1114w, InterfaceC1107o, m0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f891A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Map f892B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public e f893C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public j f894D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public i f895E;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f896u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public J f897v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public L0.d f898w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f899x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f900y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f901z;

    @Override // p124x0.InterfaceC1107o
    public final void b(F f6) {
        if (this.f5969t) {
            e eVarZ0 = z0(f6);
            C0105a c0105a = eVarZ0.f860j;
            if (c0105a == null) {
                throw new IllegalArgumentException(("no paragraph (layoutCache=" + this.f893C + ", textSubstitution=" + this.f895E + ')').toString());
            }
            InterfaceC0714o interfaceC0714oF = f6.f13862h.i.f();
            boolean z5 = eVarZ0.f861k;
            if (z5) {
                long j4 = eVarZ0.f862l;
                interfaceC0714oF.l();
                interfaceC0714oF.f(0.0f, 0.0f, (int) (j4 >> 32), (int) (j4 & 4294967295L), 1);
            }
            try {
                C c6 = this.f897v.f1472a;
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
                    c0105a.g(interfaceC0714oF, abstractC0712mB, this.f897v.f1472a.f1428a.c(), l7, jVar2, eVar2);
                } else {
                    long jB = r.f9085l;
                    if (jB == 16) {
                        jB = this.f897v.b() != 16 ? this.f897v.b() : r.f9076b;
                    }
                    c0105a.f(interfaceC0714oF, jB, l7, jVar2, eVar2);
                }
            } finally {
                if (z5) {
                    interfaceC0714oF.i();
                }
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

    @Override // p124x0.InterfaceC1114w
    public final G e(H h6, E e6, long j4) {
        long jA;
        boolean z5;
        s sVar;
        e eVarZ0 = z0(h6);
        S0.k layoutDirection = h6.getLayoutDirection();
        if (eVarZ0.f858g > 1) {
            b bVar = eVarZ0.f863m;
            J j6 = eVarZ0.f853b;
            S0.b bVar2 = eVarZ0.i;
            E4.k.c(bVar2);
            b bVarW = AbstractC0473d.w(bVar, layoutDirection, j6, bVar2, eVarZ0.f854c);
            eVarZ0.f863m = bVarW;
            jA = bVarW.a(eVarZ0.f858g, j4);
        } else {
            jA = j4;
        }
        C0105a c0105a = eVarZ0.f860j;
        if (c0105a == null || (sVar = eVarZ0.f864n) == null || sVar.b() || layoutDirection != eVarZ0.f865o || (!S0.a.b(jA, eVarZ0.f866p) && (S0.a.h(jA) != S0.a.h(eVarZ0.f866p) || S0.a.g(jA) < c0105a.b() || c0105a.f1480d.f1732c))) {
            C0105a c0105aB = eVarZ0.b(jA, layoutDirection);
            eVarZ0.f866p = jA;
            long jR = p081p0.c.R(jA, AbstractC0473d.b(AbstractC0029o0.n(c0105aB.d()), AbstractC0029o0.n(c0105aB.b())));
            eVarZ0.f862l = jR;
            eVarZ0.f861k = eVarZ0.f855d != 3 && (((float) ((int) (jR >> 32))) < c0105aB.d() || ((float) ((int) (jR & 4294967295L))) < c0105aB.b());
            eVarZ0.f860j = c0105aB;
            z5 = true;
        } else {
            if (!S0.a.b(jA, eVarZ0.f866p)) {
                C0105a c0105a2 = eVarZ0.f860j;
                E4.k.c(c0105a2);
                long jR2 = p081p0.c.R(jA, AbstractC0473d.b(AbstractC0029o0.n(Math.min(c0105a2.f1477a.f4399p.b(), c0105a2.d())), AbstractC0029o0.n(c0105a2.b())));
                eVarZ0.f862l = jR2;
                eVarZ0.f861k = eVarZ0.f855d != 3 && (((float) ((int) (jR2 >> 32))) < c0105a2.d() || ((float) ((int) (jR2 & 4294967295L))) < c0105a2.b());
                eVarZ0.f866p = jA;
            }
            z5 = false;
        }
        s sVar2 = eVarZ0.f864n;
        if (sVar2 != null) {
            sVar2.b();
        }
        C0105a c0105a3 = eVarZ0.f860j;
        E4.k.c(c0105a3);
        long j7 = eVarZ0.f862l;
        if (z5) {
            AbstractC1098f.q(this, 2).S0();
            Map linkedHashMap = this.f892B;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
            }
            C1029l c1029l = AbstractC1020c.f13160a;
            y yVar = c0105a3.f1480d;
            linkedHashMap.put(c1029l, Integer.valueOf(Math.round(yVar.d(0))));
            linkedHashMap.put(AbstractC1020c.f13161b, Integer.valueOf(Math.round(yVar.d(yVar.f1735f - 1))));
            this.f892B = linkedHashMap;
        }
        int i = (int) (j7 >> 32);
        int i3 = (int) (j7 & 4294967295L);
        int iMin = Math.min(i, 262142);
        int iMin2 = i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i, 262142);
        int iC = p081p0.c.C(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
        N nC = e6.c(p081p0.c.t(iMin, iMin2, Math.min(iC, i3), i3 != Integer.MAX_VALUE ? Math.min(iC, i3) : Integer.MAX_VALUE));
        Map map = this.f892B;
        E4.k.c(map);
        return h6.u(i, i3, map, new Y0(nC, 2));
    }

    @Override // p124x0.m0
    public final void g0(E0.h hVar) {
        j jVar = this.f894D;
        if (jVar == null) {
            jVar = new j(this, 0);
            this.f894D = jVar;
        }
        C0110f c0110f = new C0110f(this.f896u, null, 6);
        K4.e[] eVarArr = q.f997a;
        hVar.i(o.f990u, d0.v(c0110f));
        i iVar = this.f895E;
        if (iVar != null) {
            boolean z5 = iVar.f888c;
            E0.r rVar = o.f992w;
            K4.e[] eVarArr2 = q.f997a;
            K4.e eVar = eVarArr2[15];
            rVar.a(hVar, Boolean.valueOf(z5));
            C0110f c0110f2 = new C0110f(iVar.f887b, null, 6);
            E0.r rVar2 = o.f991v;
            K4.e eVar2 = eVarArr2[14];
            rVar2.a(hVar, c0110f2);
        }
        hVar.i(E0.g.i, new E0.a(null, new j(this, 1)));
        hVar.i(E0.g.f922j, new E0.a(null, new j(this, 2)));
        hVar.i(E0.g.f923k, new E0.a(null, new C0043w(11, this)));
        q.d(hVar, jVar);
    }

    @Override // p124x0.InterfaceC1114w
    public final int h(M m6, E e6, int i) {
        return AbstractC0029o0.n(z0(m6).d(m6.getLayoutDirection()).c());
    }

    @Override // p124x0.InterfaceC1114w
    public final int i(M m6, E e6, int i) {
        return z0(m6).a(i, m6.getLayoutDirection());
    }

    public final e y0() {
        if (this.f893C == null) {
            this.f893C = new e(this.f896u, this.f897v, this.f898w, this.f899x, this.f900y, this.f901z, this.f891A);
        }
        e eVar = this.f893C;
        E4.k.c(eVar);
        return eVar;
    }

    public final e z0(S0.b bVar) {
        e eVar;
        i iVar = this.f895E;
        if (iVar != null && iVar.f888c && (eVar = iVar.f889d) != null) {
            eVar.c(bVar);
            return eVar;
        }
        e eVarY0 = y0();
        eVarY0.c(bVar);
        return eVarY0;
    }
}
