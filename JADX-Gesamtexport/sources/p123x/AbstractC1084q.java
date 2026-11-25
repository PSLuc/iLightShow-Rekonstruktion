package p123x;

import E4.k;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.C0235q0;
import N.InterfaceC0225l0;
import Z.a;
import Z.b;
import Z.c;
import Z.g;
import Z.o;
import java.util.HashMap;
import p015c2.AbstractC0473d;
import p113v0.E;
import p113v0.F;
import p113v0.M;
import p113v0.N;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: renamed from: x.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1084q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f13793a = c(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f13794b = c(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1086t f13795c = new C1086t(b.f5933h, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1083p f13796d = C1083p.f13790b;

    public static final void a(o oVar, C0230o c0230o, int i) {
        int i3;
        c0230o.X(-211209833);
        if ((i & 6) == 0) {
            i3 = (c0230o.f(oVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && c0230o.B()) {
            c0230o.P();
        } else {
            int i6 = c0230o.f3744P;
            o oVarC = a.c(c0230o, oVar);
            InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
            InterfaceC1102j.f14043g.getClass();
            C1106n c1106n = C1101i.f14038b;
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C0208d.R(C1101i.f14041e, c0230o, f13796d);
            C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M);
            C0208d.R(C1101i.f14039c, c0230o, oVarC);
            C1100h c1100h = C1101i.f14042f;
            if (c0230o.f3743O || !k.a(c0230o.K(), Integer.valueOf(i6))) {
                p012c.k.y(i6, c0230o, i6, c1100h);
            }
            c0230o.p(true);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C1081n(oVar, i);
        }
    }

    public static final void b(M m6, N n6, E e6, S0.k kVar, int i, int i3, c cVar) {
        g gVar;
        Object objI = e6.i();
        C1080m c1080m = objI instanceof C1080m ? (C1080m) objI : null;
        M.e(m6, n6, ((c1080m == null || (gVar = c1080m.f13784u) == null) ? cVar : gVar).a(AbstractC0473d.b(n6.f13137h, n6.i), AbstractC0473d.b(i, i3), kVar));
    }

    public static final HashMap c(boolean z5) {
        HashMap map = new HashMap(9);
        d(map, z5, b.f5933h);
        d(map, z5, b.i);
        d(map, z5, b.f5934j);
        d(map, z5, b.f5935k);
        d(map, z5, b.f5936l);
        d(map, z5, b.f5937m);
        d(map, z5, b.f5938n);
        d(map, z5, b.f5939o);
        d(map, z5, b.f5940p);
        return map;
    }

    public static final void d(HashMap map, boolean z5, g gVar) {
        map.put(gVar, new C1086t(gVar, z5));
    }

    public static final F e(c cVar, boolean z5) {
        F f6 = (F) (z5 ? f13793a : f13794b).get(cVar);
        return f6 == null ? new C1086t(cVar, z5) : f6;
    }

    public static final C1086t f(g gVar, boolean z5, C0230o c0230o, int i) {
        if (gVar.equals(b.f5933h) && !z5) {
            c0230o.V(-1710139705);
            c0230o.p(false);
            return f13795c;
        }
        c0230o.V(-1710100211);
        boolean z6 = true;
        boolean z7 = (((i & 14) ^ 6) > 4 && c0230o.f(gVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !c0230o.g(z5)) && (i & 48) != 32) {
            z6 = false;
        }
        boolean z8 = z7 | z6;
        Object objK = c0230o.K();
        if (z8 || objK == C0222k.f3714a) {
            objK = new C1086t(gVar, z5);
            c0230o.f0(objK);
        }
        C1086t c1086t = (C1086t) objK;
        c0230o.p(false);
        return c1086t;
    }
}
