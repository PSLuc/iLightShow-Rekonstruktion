package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0459t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EnumC0454n f6997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC0457q f6998b;

    public final void a(InterfaceC0458s interfaceC0458s, EnumC0453m enumC0453m) {
        EnumC0454n enumC0454nA = enumC0453m.a();
        EnumC0454n enumC0454n = this.f6997a;
        E4.k.f("state1", enumC0454n);
        if (enumC0454nA.compareTo(enumC0454n) < 0) {
            enumC0454n = enumC0454nA;
        }
        this.f6997a = enumC0454n;
        this.f6998b.c(interfaceC0458s, enumC0453m);
        this.f6997a = enumC0454nA;
    }
}
