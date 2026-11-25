package androidx.lifecycle;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class H implements InterfaceC0457q, Closeable, AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6955h;
    public final G i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6956j;

    public H(String str, G g6) {
        this.f6955h = str;
        this.i = g6;
    }

    @Override // androidx.lifecycle.InterfaceC0457q
    public final void c(InterfaceC0458s interfaceC0458s, EnumC0453m enumC0453m) {
        if (enumC0453m == EnumC0453m.ON_DESTROY) {
            this.f6956j = false;
            interfaceC0458s.f().f(this);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void s(J1.e eVar, C0460u c0460u) {
        E4.k.f("registry", eVar);
        E4.k.f("lifecycle", c0460u);
        if (this.f6956j) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f6956j = true;
        c0460u.a(this);
        eVar.d(this.f6955h, this.i.f6954e);
    }
}
