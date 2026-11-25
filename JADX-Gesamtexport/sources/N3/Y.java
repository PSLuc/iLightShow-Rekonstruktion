package N3;

import B.C0031p0;
import N.InterfaceC0203a0;
import java.util.ArrayList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Y implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4140h;
    public final /* synthetic */ K3.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4141j;

    public /* synthetic */ Y(K3.a aVar, InterfaceC0203a0 interfaceC0203a0, int i) {
        this.f4140h = i;
        this.i = aVar;
        this.f4141j = interfaceC0203a0;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f4140h) {
            case 0:
                K3.a aVar = this.i;
                E4.k.f("$device", aVar);
                this.f4141j.setValue(Boolean.FALSE);
                J3.e eVar = com.nanjoran.ilightshow.Services.M.f8305O.f8317c;
                if (eVar != null) {
                    aVar.disconnect();
                    ArrayList arrayList = new ArrayList();
                    X.s sVar = eVar.f1932b;
                    E4.k.c(sVar);
                    ListIterator listIterator = sVar.listIterator();
                    while (true) {
                        X.y yVar = (X.y) listIterator;
                        if (yVar.hasNext()) {
                            K3.a aVar2 = (K3.a) yVar.next();
                            E4.k.c(aVar2);
                            String str = aVar2.id;
                            if (str != null && str.equals(aVar.id)) {
                                arrayList.add(aVar2);
                            }
                        } else {
                            E4.z.a(sVar).removeAll(arrayList);
                            C0031p0 c0031p0 = eVar.f1931a;
                            E4.k.c(c0031p0);
                            ((ArrayList) c0031p0.f394j).remove(aVar);
                            c0031p0.q();
                            eVar.b();
                        }
                    }
                }
                break;
            default:
                K3.a aVar3 = this.i;
                E4.k.f("$device", aVar3);
                InterfaceC0203a0 interfaceC0203a0 = this.f4141j;
                E4.k.f("$deviceInPairingProcess$delegate", interfaceC0203a0);
                if (aVar3.getState() == K3.b.f2130k) {
                    interfaceC0203a0.setValue(aVar3);
                }
                break;
        }
        return p084p4.x.f10867a;
    }
}
