package V0;

import android.os.Handler;
import android.os.Looper;
import p113v0.InterfaceC1033p;

/* JADX INFO: loaded from: classes.dex */
public final class j extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5430h;
    public final /* synthetic */ y i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(y yVar, int i) {
        super(1);
        this.f5430h = i;
        this.i = yVar;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f5430h) {
            case 0:
                InterfaceC1033p interfaceC1033pJ = ((InterfaceC1033p) obj).j();
                E4.k.c(interfaceC1033pJ);
                this.i.k(interfaceC1033pJ);
                break;
            case 1:
                S0.j jVar = new S0.j(((S0.j) obj).f4896a);
                y yVar = this.i;
                yVar.m1setPopupContentSizefhxjrPA(jVar);
                yVar.l();
                break;
            default:
                D4.a aVar = (D4.a) obj;
                y yVar2 = this.i;
                Handler handler = yVar2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.invoke();
                } else {
                    Handler handler2 = yVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new w(aVar, 0));
                    }
                }
                break;
        }
        return p084p4.x.f10867a;
    }
}
