package O;

import F.C0071m;
import N.C0208d;
import N.C0237s;
import N.G0;

/* JADX INFO: loaded from: classes.dex */
public final class u extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f4384c;

    static {
        int i = 0;
        f4384c = new u(i, i, 3);
    }

    @Override // O.C
    public final void a(C0071m c0071m, p091r0.d dVar, G0 g6, C0237s c0237s) {
        if (g6.f3601n != 0) {
            C0208d.w("Cannot reset when inserting");
            throw null;
        }
        g6.z();
        g6.f3607t = 0;
        g6.f3608u = g6.m() - g6.f3596h;
        g6.i = 0;
        g6.f3597j = 0;
        g6.f3602o = 0;
    }
}
