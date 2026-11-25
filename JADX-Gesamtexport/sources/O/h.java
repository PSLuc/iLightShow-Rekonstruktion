package O;

import F.C0071m;
import N.C0237s;
import N.G0;
import N.InterfaceC0232p;

/* JADX INFO: loaded from: classes.dex */
public final class h extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f4367c = new h(0, 2, 1);

    @Override // O.C
    public final void a(C0071m c0071m, p091r0.d dVar, G0 g6, C0237s c0237s) {
        ((D4.c) c0071m.e(0)).invoke((InterfaceC0232p) c0071m.e(1));
    }

    @Override // O.C
    public final String c(int i) {
        if (i == 0) {
            return "anchor";
        }
        return i == 1 ? "composition" : super.c(i);
    }
}
