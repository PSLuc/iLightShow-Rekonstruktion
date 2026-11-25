package G1;

import F1.C0096m;
import N.InterfaceC0203a0;
import S1.V;
import p090r.C0873l;
import p090r.G;
import p090r.H;

/* JADX INFO: loaded from: classes.dex */
public final class C extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1609h;
    public final /* synthetic */ i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ D4.c f1610j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ D4.c f1611k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f1612l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(i iVar, D4.c cVar, D4.c cVar2, InterfaceC0203a0 interfaceC0203a0, int i) {
        super(1);
        this.f1609h = i;
        this.i = iVar;
        this.f1610j = cVar;
        this.f1611k = cVar2;
        this.f1612l = interfaceC0203a0;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        D4.c cVar = this.f1610j;
        D4.c cVar2 = this.f1611k;
        InterfaceC0203a0 interfaceC0203a0 = this.f1612l;
        i iVar = this.i;
        switch (this.f1609h) {
            case 0:
                C0873l c0873l = (C0873l) obj;
                F1.B b6 = ((C0096m) c0873l.c()).i;
                E4.k.d("null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination", b6);
                h hVar = (h) b6;
                if (((Boolean) iVar.f1621c.getValue()).booleanValue() || V.i(interfaceC0203a0)) {
                    int i = F1.B.f1242p;
                    for (F1.B b7 : G4.a.w(hVar)) {
                        if (b7 instanceof h) {
                            ((h) b7).getClass();
                        } else if (b7 instanceof f) {
                            ((f) b7).getClass();
                        }
                    }
                    return (G) cVar.invoke(c0873l);
                }
                int i3 = F1.B.f1242p;
                for (F1.B b8 : G4.a.w(hVar)) {
                    if (b8 instanceof h) {
                        ((h) b8).getClass();
                    } else if (b8 instanceof f) {
                        ((f) b8).getClass();
                    }
                }
                return (G) cVar2.invoke(c0873l);
            default:
                C0873l c0873l2 = (C0873l) obj;
                F1.B b9 = ((C0096m) c0873l2.b()).i;
                E4.k.d("null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination", b9);
                h hVar2 = (h) b9;
                if (((Boolean) iVar.f1621c.getValue()).booleanValue() || V.i(interfaceC0203a0)) {
                    int i6 = F1.B.f1242p;
                    for (F1.B b10 : G4.a.w(hVar2)) {
                        if (b10 instanceof h) {
                            ((h) b10).getClass();
                        } else if (b10 instanceof f) {
                            ((f) b10).getClass();
                        }
                    }
                    return (H) cVar.invoke(c0873l2);
                }
                int i7 = F1.B.f1242p;
                for (F1.B b11 : G4.a.w(hVar2)) {
                    if (b11 instanceof h) {
                        ((h) b11).getClass();
                    } else if (b11 instanceof f) {
                        ((f) b11).getClass();
                    }
                }
                return (H) cVar2.invoke(c0873l2);
        }
    }
}
