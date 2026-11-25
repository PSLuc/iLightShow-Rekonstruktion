package O;

import F.C0071m;
import N.C0237s;
import N.G0;

/* JADX INFO: loaded from: classes.dex */
public final class A extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final A f4337c = new A(1, 0, 2);

    @Override // O.C
    public final void a(C0071m c0071m, p091r0.d dVar, G0 g6, C0237s c0237s) {
        int iD = c0071m.d(0);
        for (int i = 0; i < iD; i++) {
            dVar.m();
        }
    }

    @Override // O.C
    public final String b(int i) {
        return i == 0 ? "count" : super.b(i);
    }
}
