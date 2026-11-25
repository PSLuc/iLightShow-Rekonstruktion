package O;

import F.C0071m;
import N.C0206c;
import N.C0237s;
import N.E0;
import N.G0;

/* JADX INFO: loaded from: classes.dex */
public final class n extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f4377c = new n(0, 2, 1);

    @Override // O.C
    public final void a(C0071m c0071m, p091r0.d dVar, G0 g6, C0237s c0237s) {
        E0 e6 = (E0) c0071m.e(1);
        C0206c c0206c = (C0206c) c0071m.e(0);
        g6.d();
        c0206c.getClass();
        g6.t(e6, e6.c(c0206c));
        g6.j();
    }

    @Override // O.C
    public final String c(int i) {
        if (i == 0) {
            return "anchor";
        }
        return i == 1 ? "from" : super.c(i);
    }
}
