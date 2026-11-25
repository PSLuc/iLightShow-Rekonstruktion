package B;

import F1.C0096m;
import N.InterfaceC0203a0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: B.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0039u extends E4.l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f443h;
    public final /* synthetic */ InterfaceC0203a0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0039u(int i, InterfaceC0203a0 interfaceC0203a0) {
        super(0);
        this.f443h = i;
        this.i = interfaceC0203a0;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f443h) {
            case 0:
                InterfaceC0203a0 interfaceC0203a0 = this.i;
                if (interfaceC0203a0 != null) {
                    return (List) interfaceC0203a0.getValue();
                }
                return null;
            case 1:
                Boolean bool = (Boolean) this.i.getValue();
                bool.booleanValue();
                return bool;
            case 2:
                List list = (List) this.i.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (E4.k.a(((C0096m) obj).i.f1243h, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 3:
                D4.a aVar = (D4.a) this.i.getValue();
                if (aVar != null) {
                    aVar.invoke();
                }
                return p084p4.x.f10867a;
            default:
                D4.a aVar2 = (D4.a) this.i.getValue();
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                return p084p4.x.f10867a;
        }
    }
}
