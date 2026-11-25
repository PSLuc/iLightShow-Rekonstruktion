package p012c;

import E4.k;
import androidx.lifecycle.C0460u;
import androidx.lifecycle.EnumC0453m;
import androidx.lifecycle.InterfaceC0457q;
import androidx.lifecycle.InterfaceC0458s;

/* JADX INFO: loaded from: classes.dex */
public final class A implements InterfaceC0457q, InterfaceC0465c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0460u f7115h;
    public final u i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public B f7116j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ D f7117k;

    public A(D d6, C0460u c0460u, u uVar) {
        k.f("onBackPressedCallback", uVar);
        this.f7117k = d6;
        this.f7115h = c0460u;
        this.i = uVar;
        c0460u.a(this);
    }

    @Override // androidx.lifecycle.InterfaceC0457q
    public final void c(InterfaceC0458s interfaceC0458s, EnumC0453m enumC0453m) {
        if (enumC0453m != EnumC0453m.ON_START) {
            if (enumC0453m != EnumC0453m.ON_STOP) {
                if (enumC0453m == EnumC0453m.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                B b6 = this.f7116j;
                if (b6 != null) {
                    b6.cancel();
                    return;
                }
                return;
            }
        }
        D d6 = this.f7117k;
        d6.getClass();
        u uVar = this.i;
        k.f("onBackPressedCallback", uVar);
        d6.f7121b.addLast(uVar);
        B b7 = new B(d6, uVar);
        uVar.f7180b.add(b7);
        d6.e();
        uVar.f7181c = new C(0, d6, D.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
        this.f7116j = b7;
    }

    @Override // p012c.InterfaceC0465c
    public final void cancel() {
        this.f7115h.f(this);
        this.i.f7180b.remove(this);
        B b6 = this.f7116j;
        if (b6 != null) {
            b6.cancel();
        }
        this.f7116j = null;
    }
}
