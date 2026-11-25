package O;

import F.C0071m;
import N.C0237s;
import N.G0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f4366c = new g(0, 1, 1);

    @Override // O.C
    public final void a(C0071m c0071m, p091r0.d dVar, G0 g6, C0237s c0237s) {
        for (Object obj : (Object[]) c0071m.e(0)) {
            dVar.e(obj);
        }
    }

    @Override // O.C
    public final String c(int i) {
        return i == 0 ? "nodes" : super.c(i);
    }
}
