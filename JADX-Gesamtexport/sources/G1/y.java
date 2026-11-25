package G1;

import F1.C0096m;
import p090r.C0873l;

/* JADX INFO: loaded from: classes.dex */
public final class y extends E4.l implements D4.c {
    public static final y i = new y(1, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1675h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i3, int i6) {
        super(i3);
        this.f1675h = i6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f1675h) {
            case 0:
                return ((C0096m) obj).f1357m;
            default:
                F1.B b6 = ((C0096m) ((C0873l) obj).c()).i;
                E4.k.d("null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination", b6);
                int i3 = F1.B.f1242p;
                for (F1.B b7 : G4.a.w((h) b6)) {
                    if (b7 instanceof h) {
                        ((h) b7).getClass();
                    } else if (b7 instanceof f) {
                        ((f) b7).getClass();
                    }
                }
                return null;
        }
    }
}
