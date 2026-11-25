package O;

import F.C0071m;
import N.C0237s;
import N.G0;

/* JADX INFO: loaded from: classes.dex */
public final class q extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f4380c = new q(3, 0, 2);

    @Override // O.C
    public final void a(C0071m c0071m, p091r0.d dVar, G0 g6, C0237s c0237s) {
        ((p124x0.D) dVar.f11478d).G(c0071m.d(0), c0071m.d(1), c0071m.d(2));
    }

    @Override // O.C
    public final String b(int i) {
        if (i == 0) {
            return "from";
        }
        if (i == 1) {
            return "to";
        }
        return i == 2 ? "count" : super.b(i);
    }
}
