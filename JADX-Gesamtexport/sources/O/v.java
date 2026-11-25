package O;

import F.C0071m;
import N.C0237s;
import N.G0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f4385c;

    static {
        int i = 1;
        f4385c = new v(0, i, i);
    }

    @Override // O.C
    public final void a(C0071m c0071m, p091r0.d dVar, G0 g6, C0237s c0237s) {
        ((ArrayList) c0237s.f3795e).add((D4.a) c0071m.e(0));
    }

    @Override // O.C
    public final String c(int i) {
        return i == 0 ? "effect" : super.c(i);
    }
}
