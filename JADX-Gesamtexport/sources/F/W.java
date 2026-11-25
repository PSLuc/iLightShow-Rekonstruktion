package F;

import N.InterfaceC0203a0;
import androidx.compose.foundation.MagnifierElement;
import p015c2.AbstractC0473d;
import p101t.f0;
import p101t.j0;

/* JADX INFO: loaded from: classes.dex */
public final class W extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1149h;
    public final /* synthetic */ S0.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f1150j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(S0.b bVar, InterfaceC0203a0 interfaceC0203a0, int i) {
        super(1);
        this.f1149h = i;
        this.i = bVar;
        this.f1150j = interfaceC0203a0;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        InterfaceC0203a0 interfaceC0203a0 = this.f1150j;
        S0.b bVar = this.i;
        int i = 0;
        switch (this.f1149h) {
            case 0:
                long j4 = ((S0.g) obj).f4889a;
                interfaceC0203a0.setValue(new S0.j(AbstractC0473d.b(bVar.H(S0.g.b(j4)), bVar.H(S0.g.a(j4)))));
                return p084p4.x.f10867a;
            default:
                V v6 = new V((D4.a) obj, 0);
                W w6 = new W(bVar, interfaceC0203a0, i);
                E0.r rVar = f0.f12327a;
                return new MagnifierElement(v6, w6, j0.f12362k);
        }
    }
}
