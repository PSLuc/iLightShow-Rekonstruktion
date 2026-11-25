package O;

import F.C0071m;
import N.C0206c;
import N.C0237s;
import N.G0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f4370c;

    static {
        int i = 1;
        f4370c = new k(0, i, i);
    }

    @Override // O.C
    public final void a(C0071m c0071m, p091r0.d dVar, G0 g6, C0237s c0237s) {
        C0206c c0206c = (C0206c) c0071m.e(0);
        c0206c.getClass();
        g6.k(g6.c(c0206c));
    }

    @Override // O.C
    public final String c(int i) {
        return i == 0 ? "anchor" : super.c(i);
    }
}
