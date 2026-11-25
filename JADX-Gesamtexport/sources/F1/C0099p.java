package F1;

import androidx.lifecycle.EnumC0453m;
import androidx.lifecycle.InterfaceC0457q;
import androidx.lifecycle.InterfaceC0458s;

/* JADX INFO: renamed from: F1.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0099p implements InterfaceC0457q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1368h;
    public final /* synthetic */ Object i;

    public /* synthetic */ C0099p(int i, Object obj) {
        this.f1368h = i;
        this.i = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0457q
    public final void c(InterfaceC0458s interfaceC0458s, EnumC0453m enumC0453m) {
        switch (this.f1368h) {
            case 0:
                I i = (I) this.i;
                E4.k.f("this$0", i);
                i.f1286r = enumC0453m.a();
                if (i.f1272c != null) {
                    for (C0096m c0096m : i.f1276g) {
                        c0096m.getClass();
                        c0096m.f1355k = enumC0453m.a();
                        c0096m.i();
                    }
                }
                break;
            default:
                J1.e eVar = (J1.e) this.i;
                E4.k.f("this$0", eVar);
                if (enumC0453m == EnumC0453m.ON_START) {
                    eVar.f1900d = true;
                } else if (enumC0453m == EnumC0453m.ON_STOP) {
                    eVar.f1900d = false;
                }
                break;
        }
    }
}
