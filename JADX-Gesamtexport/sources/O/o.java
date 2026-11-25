package O;

import F.C0071m;
import N.C0206c;
import N.C0208d;
import N.C0237s;
import N.E0;
import N.G0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f4378c = new o(0, 3, 1);

    @Override // O.C
    public final void a(C0071m c0071m, p091r0.d dVar, G0 g6, C0237s c0237s) {
        E0 e6 = (E0) c0071m.e(1);
        C0206c c0206c = (C0206c) c0071m.e(0);
        C0306c c0306c = (C0306c) c0071m.e(2);
        G0 g0J = e6.j();
        try {
            if (!c0306c.f4362k.I0()) {
                C0208d.w("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
                throw null;
            }
            c0306c.f4361j.H0(dVar, g0J, c0237s);
            g0J.e(true);
            g6.d();
            c0206c.getClass();
            g6.t(e6, e6.c(c0206c));
            g6.j();
        } catch (Throwable th) {
            g0J.e(false);
            throw th;
        }
    }

    @Override // O.C
    public final String c(int i) {
        if (i == 0) {
            return "anchor";
        }
        if (i == 1) {
            return "from";
        }
        return i == 2 ? "fixups" : super.c(i);
    }
}
