package O;

import F.C0071m;
import N.C0208d;
import N.C0235q0;
import N.C0237s;
import N.C0252z0;
import N.G0;

/* JADX INFO: loaded from: classes.dex */
public final class x extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f4387c = new x(1, 0, 2);

    @Override // O.C
    public final void a(C0071m c0071m, p091r0.d dVar, G0 g6, C0237s c0237s) {
        int iD = c0071m.d(0);
        int iO = g6.o();
        int i = g6.f3609v;
        int iE = g6.E(g6.f3590b, g6.p(i));
        int iF = g6.f(g6.f3590b, g6.p(i + 1));
        for (int iMax = Math.max(iE, iF - iD); iMax < iF; iMax++) {
            Object obj = g6.f3591c[g6.g(iMax)];
            if (obj instanceof C0252z0) {
                c0237s.h(((C0252z0) obj).f3874a, iO - iMax, -1, -1);
            } else if (obj instanceof C0235q0) {
                ((C0235q0) obj).d();
            }
        }
        C0208d.P(iD > 0);
        int i3 = g6.f3609v;
        int iE2 = g6.E(g6.f3590b, g6.p(i3));
        int iF2 = g6.f(g6.f3590b, g6.p(i3 + 1)) - iD;
        C0208d.P(iF2 >= iE2);
        g6.C(iF2, iD, i3);
        int i6 = g6.i;
        if (i6 >= iE2) {
            g6.i = i6 - iD;
        }
    }

    @Override // O.C
    public final String b(int i) {
        return i == 0 ? "count" : super.b(i);
    }
}
