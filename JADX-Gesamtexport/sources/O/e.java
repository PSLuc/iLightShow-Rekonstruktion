package O;

import F.C0071m;
import N.C0206c;
import N.C0208d;
import N.C0237s;
import N.C0252z0;
import N.G0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f4364c = new e(0, 2, 1);

    @Override // O.C
    public final void a(C0071m c0071m, p091r0.d dVar, G0 g6, C0237s c0237s) {
        C0206c c0206c = (C0206c) c0071m.e(0);
        Object objE = c0071m.e(1);
        if (objE instanceof C0252z0) {
            ((ArrayList) c0237s.f3793c).add(((C0252z0) objE).f3874a);
        }
        if (g6.f3601n != 0) {
            C0208d.w("Can only append a slot if not current inserting");
            throw null;
        }
        int i = g6.i;
        int i3 = g6.f3597j;
        int iC = g6.c(c0206c);
        int iF = g6.f(g6.f3590b, g6.p(iC + 1));
        g6.i = iF;
        g6.f3597j = iF;
        g6.s(1, iC);
        if (i >= iF) {
            i++;
            i3++;
        }
        g6.f3591c[iF] = objE;
        g6.i = i;
        g6.f3597j = i3;
    }

    @Override // O.C
    public final String c(int i) {
        if (i == 0) {
            return "anchor";
        }
        return i == 1 ? "value" : super.c(i);
    }
}
