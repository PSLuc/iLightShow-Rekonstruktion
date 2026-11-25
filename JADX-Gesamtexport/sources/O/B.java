package O;

import F.C0071m;
import N.C0237s;
import N.G0;
import N.InterfaceC0220j;

/* JADX INFO: loaded from: classes.dex */
public final class B extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B f4338c;

    static {
        int i = 0;
        f4338c = new B(i, i, 3);
    }

    @Override // O.C
    public final void a(C0071m c0071m, p091r0.d dVar, G0 g6, C0237s c0237s) {
        Object objG = dVar.g();
        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback", objG);
        ((InterfaceC0220j) objG).a();
    }
}
