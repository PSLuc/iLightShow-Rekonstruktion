package L;

import B.C0005c0;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.C0235q0;
import androidx.compose.material3.MinimumInteractiveModifier;
import p096s.AbstractC0909d;
import p096s.AbstractC0914g;

/* JADX INFO: renamed from: L.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0190x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f2972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f2973b = 12;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f2974c;

    static {
        float f6 = 2;
        f2972a = f6;
        f2974c = f6;
    }

    public static final void a(boolean z5, D4.a aVar, Z.o oVar, boolean z6, C0184v0 c0184v0, p117w.m mVar, C0230o c0230o, int i) {
        int i3;
        boolean z7;
        p117w.m mVar2;
        C0184v0 c0184v1;
        Z.o oVar2;
        long j4;
        N.V0 v6;
        Object objN;
        boolean z8;
        p117w.m mVar3;
        Z.o oVarA;
        p117w.m mVar4;
        boolean z9;
        Z.o oVar3;
        C0184v0 c0184v2;
        c0230o.X(408580840);
        if ((i & 6) == 0) {
            i3 = (c0230o.g(z5) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c0230o.h(aVar) ? 32 : 16;
        }
        int i6 = i3 | 3456;
        if ((i & 24576) == 0) {
            i6 = i3 | 11648;
        }
        if (((196608 | i6) & 74899) == 74898 && c0230o.B()) {
            c0230o.P();
            oVar3 = oVar;
            z9 = z6;
            c0184v2 = c0184v0;
            mVar4 = mVar;
        } else {
            c0230o.R();
            int i7 = i & 1;
            N.U u6 = C0222k.f3714a;
            Z.o oVar4 = Z.l.f5957a;
            if (i7 == 0 || c0230o.z()) {
                c0230o.W(-1191566130);
                D d6 = (D) c0230o.k(F.f2265a);
                C0184v0 c0184v3 = d6.f2207P;
                if (c0184v3 == null) {
                    float f6 = M.o.f3272a;
                    c0184v3 = new C0184v0(F.d(d6, 26), F.d(d6, 19), p035g0.r.b(0.38f, F.d(d6, 18)), p035g0.r.b(0.38f, F.d(d6, 18)));
                    d6.f2207P = c0184v3;
                }
                c0230o.p(false);
                c0230o.W(735546075);
                Object objK = c0230o.K();
                if (objK == u6) {
                    objK = new p117w.m();
                    c0230o.f0(objK);
                }
                c0230o.p(false);
                z7 = true;
                mVar2 = (p117w.m) objK;
                c0184v1 = c0184v3;
                oVar2 = oVar4;
            } else {
                c0230o.P();
                oVar2 = oVar;
                z7 = z6;
                c0184v1 = c0184v0;
                mVar2 = mVar;
            }
            c0230o.q();
            N.V0 v0A = AbstractC0914g.a(z5 ? f2973b / 2 : 0, AbstractC0909d.k(100, 6, null), c0230o);
            c0184v1.getClass();
            c0230o.W(-1840145292);
            if (z7 && z5) {
                j4 = c0184v1.f2937a;
            } else if (!z7 || z5) {
                j4 = (z7 || !z5) ? c0184v1.f2940d : c0184v1.f2939c;
            } else {
                j4 = c0184v1.f2938b;
            }
            if (z7) {
                c0230o.W(-1943768162);
                v6 = v0A;
                objN = p090r.M.a(j4, AbstractC0909d.k(100, 6, null), null, c0230o, 48, 12);
                c0230o.p(false);
            } else {
                v6 = v0A;
                c0230o.W(-1943768057);
                objN = C0208d.N(new p035g0.r(j4), c0230o);
                c0230o.p(false);
            }
            Object obj = objN;
            c0230o.p(false);
            c0230o.W(735546399);
            if (aVar != null) {
                z8 = z7;
                mVar3 = mVar2;
                oVarA = androidx.compose.foundation.selection.b.a(z5, mVar3, K.s.a(M.o.f3273b / 2, c0230o, 54, 4), z8, new E0.e(3), aVar);
            } else {
                z8 = z7;
                mVar3 = mVar2;
                oVarA = oVar4;
            }
            c0230o.p(false);
            if (aVar != null) {
                N.W0 w6 = AbstractC0155l0.f2822a;
                oVar4 = MinimumInteractiveModifier.f6679a;
            }
            Z.o oVarE = androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.c.m(oVar2.k(oVar4).k(oVarA)), f2972a), M.o.f3272a);
            c0230o.W(735547384);
            boolean zF = c0230o.f(obj) | c0230o.f(v6);
            Object objK2 = c0230o.K();
            if (zF || objK2 == u6) {
                objK2 = new C0005c0(obj, 14, v6);
                c0230o.f0(objK2);
            }
            c0230o.p(false);
            G4.a.a(oVarE, (D4.c) objK2, c0230o, 0);
            mVar4 = mVar3;
            z9 = z8;
            oVar3 = oVar2;
            c0184v2 = c0184v1;
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0187w0(z5, aVar, oVar3, z9, c0184v2, mVar4, i);
        }
    }
}
