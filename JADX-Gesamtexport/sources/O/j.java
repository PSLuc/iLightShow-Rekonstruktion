package O;

import F.C0071m;
import N.C0208d;
import N.C0237s;
import N.G0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f4369c;

    static {
        int i = 0;
        f4369c = new j(i, i, 3);
    }

    @Override // O.C
    public final void a(C0071m c0071m, p091r0.d dVar, G0 g6, C0237s c0237s) {
        while (true) {
            int i = g6.f3609v;
            if ((i < 0 && g6.f3608u > 0) || i == 0) {
                break;
            }
            g6.D();
            if (C0208d.m(g6.f3590b, g6.p(g6.f3609v))) {
                dVar.m();
            }
            g6.i();
        }
        g6.i();
    }
}
