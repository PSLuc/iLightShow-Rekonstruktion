package O;

import F.C0071m;
import N.C0237s;
import N.G0;
import N.InterfaceC0250y0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f4381c;

    static {
        int i = 1;
        f4381c = new r(0, i, i);
    }

    @Override // O.C
    public final void a(C0071m c0071m, p091r0.d dVar, G0 g6, C0237s c0237s) {
        ((ArrayList) c0237s.f3793c).add((InterfaceC0250y0) c0071m.e(0));
    }

    @Override // O.C
    public final String c(int i) {
        return i == 0 ? "value" : super.c(i);
    }
}
