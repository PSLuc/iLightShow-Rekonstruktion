package O;

import F.C0071m;
import N.C0237s;
import N.G0;

/* JADX INFO: loaded from: classes.dex */
public final class z extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f4389c = new z(0, 2, 1);

    @Override // O.C
    public final void a(C0071m c0071m, p091r0.d dVar, G0 g6, C0237s c0237s) {
        ((D4.e) c0071m.e(1)).d(dVar.g(), c0071m.e(0));
    }

    @Override // O.C
    public final String c(int i) {
        if (i == 0) {
            return "value";
        }
        return i == 1 ? "block" : super.c(i);
    }
}
