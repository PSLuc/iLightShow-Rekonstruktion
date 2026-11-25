package L;

import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.C0235q0;
import N3.C0255b;
import java.util.LinkedHashMap;
import p096s.AbstractC0909d;
import p096s.C0919l;
import p096s.C0927u;

/* JADX INFO: renamed from: L.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0134e0 {
    static {
        Z.g gVar;
        C0927u c0927u = M.m.f3225b;
        p090r.H hA = p090r.B.a(AbstractC0909d.k(100, 2, c0927u));
        C0927u c0927u2 = M.m.f3224a;
        p096s.v0 v0VarK = AbstractC0909d.k(500, 2, c0927u2);
        Z.e eVar = Z.b.f5943s;
        p090r.u uVar = p090r.u.f11440n;
        boolean zA = E4.k.a(eVar, eVar);
        Z.g gVar2 = Z.b.f5936l;
        Z.g gVar3 = Z.b.f5937m;
        Z.e eVar2 = Z.b.f5945u;
        Z.g gVar4 = Z.b.f5935k;
        if (zA) {
            gVar = gVar4;
        } else {
            gVar = E4.k.a(eVar, eVar2) ? gVar3 : gVar2;
        }
        hA.a(new p090r.H(new p090r.Q((p090r.I) null, (p090r.O) null, new p090r.t(gVar, new A2.b(uVar, 4), v0VarK), (G4.a) null, (LinkedHashMap) null, 59)));
        p090r.G g6 = new p090r.G(new p090r.Q(new p090r.I(new p096s.v0(200, 100, c0927u)), (p090r.O) null, (p090r.t) null, (G4.a) null, (LinkedHashMap) null, 62));
        p096s.v0 v0VarK2 = AbstractC0909d.k(500, 2, c0927u2);
        p090r.u uVar2 = p090r.u.f11439m;
        if (E4.k.a(eVar, eVar)) {
            gVar2 = gVar4;
        } else if (E4.k.a(eVar, eVar2)) {
            gVar2 = gVar3;
        }
        g6.a(new p090r.G(new p090r.Q((p090r.I) null, (p090r.O) null, new p090r.t(gVar2, new A2.b(uVar2, 3), v0VarK2), (G4.a) null, (LinkedHashMap) null, 59)));
    }

    public static final void a(C0255b c0255b, Z.l lVar, p035g0.M m6, long j4, long j6, Y y2, p117w.m mVar, C0230o c0230o, int i) {
        p035g0.M mA;
        long jE;
        long jB;
        p117w.m mVar2;
        Z.l lVar2;
        int i3;
        Y y6;
        p117w.m mVar3;
        long j7;
        Y y7;
        long j8;
        p035g0.M m7;
        Z.l lVar3;
        V.a aVar = N3.Q.f4084a;
        c0230o.X(-731723913);
        int i6 = i | (c0230o.h(c0255b) ? 4 : 2) | 1647792;
        if ((4793491 & i6) == 4793490 && c0230o.B()) {
            c0230o.P();
            lVar3 = lVar;
            m7 = m6;
            j8 = j4;
            j7 = j6;
            y7 = y2;
            mVar3 = mVar;
        } else {
            c0230o.R();
            int i7 = i & 1;
            Object obj = C0222k.f3714a;
            if (i7 == 0 || c0230o.z()) {
                Z.l lVar4 = Z.l.f5957a;
                int i8 = T.f2496a;
                c0230o.W(-53247565);
                mA = N0.a(M.i.f3201c, c0230o);
                c0230o.p(false);
                c0230o.W(1855656391);
                jE = F.e(27, c0230o);
                c0230o.p(false);
                jB = F.b(jE, c0230o);
                c0230o.W(-241106249);
                Y y8 = new Y(M.i.f3199a, M.i.f3205g, M.i.f3203e, M.i.f3204f);
                c0230o.p(false);
                int i9 = i6 & (-524161);
                c0230o.W(2094975814);
                Object objK = c0230o.K();
                if (objK == obj) {
                    objK = new p117w.m();
                    c0230o.f0(objK);
                }
                mVar2 = (p117w.m) objK;
                c0230o.p(false);
                lVar2 = lVar4;
                i3 = i9;
                y6 = y8;
            } else {
                c0230o.P();
                lVar2 = lVar;
                mA = m6;
                jE = j4;
                jB = j6;
                mVar2 = mVar;
                i3 = i6 & (-524161);
                y6 = y2;
            }
            c0230o.q();
            Z.o oVarA = E0.i.a(lVar2, false, C0189x.f2967j);
            long j9 = jE;
            float f6 = y6.f2578a;
            c0230o.W(-424810125);
            c0230o.W(-1845106002);
            c0230o.W(1849274698);
            Object objK2 = c0230o.K();
            if (objK2 == obj) {
                objK2 = new C0125b0(y6.f2578a, y6.f2579b, y6.f2581d, y6.f2580c);
                c0230o.f0(objK2);
            }
            C0125b0 c0125b0 = (C0125b0) objK2;
            c0230o.p(false);
            c0230o.W(1849275046);
            boolean zH = c0230o.h(c0125b0) | c0230o.f(y6);
            Object objK3 = c0230o.K();
            if (zH || objK3 == obj) {
                objK3 = new U(c0125b0, y6, null);
                c0230o.f0(objK3);
            }
            c0230o.p(false);
            C0208d.e((D4.e) objK3, c0230o, y6);
            c0230o.W(1849275366);
            boolean zH2 = c0230o.h(c0125b0);
            Object objK4 = c0230o.K();
            if (zH2 || objK4 == obj) {
                objK4 = new X(mVar2, c0125b0, null);
                c0230o.f0(objK4);
            }
            c0230o.p(false);
            C0208d.e((D4.e) objK4, c0230o, mVar2);
            C0919l c0919l = c0125b0.f2625e.f11953c;
            c0230o.p(false);
            c0230o.p(false);
            p035g0.M m8 = mA;
            long j10 = jB;
            mVar3 = mVar2;
            A1.b(c0255b, oVarA, false, m8, j9, j10, f6, ((S0.e) c0919l.i.getValue()).f4887h, mVar3, V.b.b(c0230o, 1249316354, new C0128c0(jB)), c0230o, (i3 & 14) | 805306368, 260);
            j7 = j10;
            y7 = y6;
            j8 = j9;
            m7 = m8;
            lVar3 = lVar2;
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0131d0(c0255b, lVar3, m7, j8, j7, y7, mVar3, i);
        }
    }
}
