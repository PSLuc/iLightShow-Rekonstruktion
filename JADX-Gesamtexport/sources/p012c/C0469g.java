package p012c;

import E4.k;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0453m;
import androidx.lifecycle.InterfaceC0457q;
import androidx.lifecycle.InterfaceC0458s;

/* JADX INFO: renamed from: c.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0469g implements InterfaceC0457q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ D f7140h;
    public final /* synthetic */ n i;

    public /* synthetic */ C0469g(D d6, n nVar) {
        this.f7140h = d6;
        this.i = nVar;
    }

    @Override // androidx.lifecycle.InterfaceC0457q
    public final void c(InterfaceC0458s interfaceC0458s, EnumC0453m enumC0453m) {
        D d6 = this.f7140h;
        n nVar = this.i;
        k.f("this$0", nVar);
        if (enumC0453m == EnumC0453m.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = h.f7141a.a(nVar);
            k.f("invoker", onBackInvokedDispatcherA);
            d6.f7124e = onBackInvokedDispatcherA;
            d6.d(d6.f7126g);
        }
    }
}
